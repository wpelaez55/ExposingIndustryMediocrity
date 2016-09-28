package ny0k;

import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.konylabs.vm.TableEnumeration;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Properties;

/* renamed from: ny0k.S */
public final class C0284S {
    private static String f1913a;
    private static C0284S f1914d;
    private String f1915b;
    private String f1916c;
    private Context f1917e;
    private SQLiteDatabase f1918f;
    private Hashtable f1919g;

    static {
        f1913a = null;
        f1914d = null;
    }

    private C0284S(Context context) {
        this.f1915b = null;
        this.f1916c = null;
        this.f1919g = null;
        this.f1917e = context;
    }

    private static Properties m1822a(File file) {
        Properties properties;
        Throwable e;
        InputStream inputStream;
        Throwable th;
        FileInputStream fileInputStream = null;
        try {
            properties = new Properties();
            try {
                InputStream fileInputStream2 = new FileInputStream(file);
                try {
                    properties.load(fileInputStream2);
                    try {
                        fileInputStream2.close();
                    } catch (IOException e2) {
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    inputStream = fileInputStream2;
                    try {
                        if (KonyMain.f3658f) {
                            Log.w("i18nLib", "KonyI18n::readFromFile ", e);
                            Log.w("i18nLib", "KonyI18n::readFromFile No Properties found for the fileName " + file);
                        }
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e4) {
                            }
                        }
                        return properties;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e5) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e6) {
                    e = e6;
                    inputStream = fileInputStream2;
                    if (KonyMain.f3658f) {
                        Log.w("i18nLib", "KonyI18n::readFromFile ", e);
                        Log.w("i18nLib", "KonyI18n::readFromFile No Properties found for the fileName " + file);
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e7) {
                        }
                    }
                    return properties;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } catch (FileNotFoundException e8) {
                e = e8;
                if (KonyMain.f3658f) {
                    Log.w("i18nLib", "KonyI18n::readFromFile ", e);
                    Log.w("i18nLib", "KonyI18n::readFromFile No Properties found for the fileName " + file);
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return properties;
            } catch (IOException e9) {
                e = e9;
                if (KonyMain.f3658f) {
                    Log.w("i18nLib", "KonyI18n::readFromFile ", e);
                    Log.w("i18nLib", "KonyI18n::readFromFile No Properties found for the fileName " + file);
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return properties;
            }
        } catch (Throwable th4) {
            e = th4;
            properties = null;
            if (KonyMain.f3658f) {
                Log.w("i18nLib", "KonyI18n::readFromFile ", e);
                Log.w("i18nLib", "KonyI18n::readFromFile No Properties found for the fileName " + file);
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return properties;
        } catch (Throwable th42) {
            e = th42;
            properties = null;
            if (KonyMain.f3658f) {
                Log.w("i18nLib", "KonyI18n::readFromFile ", e);
                Log.w("i18nLib", "KonyI18n::readFromFile No Properties found for the fileName " + file);
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return properties;
        }
        return properties;
    }

    public static C0284S m1823a(Context context) {
        if (f1914d == null) {
            f1914d = new C0284S(context);
        }
        return f1914d;
    }

    private static void m1824a(Object obj, String str, String str2) {
        if (obj != null && obj != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = obj;
            Bundle bundle = new Bundle();
            bundle.putSerializable("key0", str);
            bundle.putSerializable("key1", str2);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    private void m1825a(String str, String str2) {
        this.f1919g.put(str, str2.replace("\\n", "\n"));
    }

    private void m1826a(Properties properties, String str) {
        if (KonyMain.f3657e) {
            Log.d("i18nLib", "KonyI18n::loadResourceBundle Locale = " + str);
        }
        if (this.f1918f == null || !this.f1918f.isOpen()) {
            m1833g();
        }
        boolean b = m1829b(str);
        SQLiteStatement sQLiteStatement = null;
        try {
            this.f1918f.execSQL("DROP TABLE IF EXISTS i18ninfo_" + str + ";");
            this.f1918f.execSQL("CREATE TABLE IF NOT EXISTS i18ninfo_" + str + " (Key VARCHAR UNIQUE ON CONFLICT REPLACE, Value VARCHAR);");
            Enumeration keys = properties.keys();
            sQLiteStatement = this.f1918f.compileStatement("INSERT INTO i18ninfo_" + str + " (Key, Value) VALUES (?,?)");
            this.f1918f.beginTransaction();
            while (keys.hasMoreElements()) {
                Object nextElement = keys.nextElement();
                Object obj = properties.get(nextElement);
                sQLiteStatement.bindString(1, nextElement.toString());
                sQLiteStatement.bindString(2, obj.toString());
                sQLiteStatement.execute();
                if (b) {
                    m1825a(nextElement.toString(), obj.toString());
                }
            }
            this.f1918f.setTransactionSuccessful();
            if (this.f1918f.inTransaction()) {
                this.f1918f.endTransaction();
            }
            if (sQLiteStatement != null) {
                sQLiteStatement.clearBindings();
                sQLiteStatement.close();
            }
            m1834h();
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("i18nLib", "KonyI18n::loadResourceBundle ", e);
            }
            throw new LuaError("Error in storing i18n resources", 1811);
        } catch (Throwable th) {
            if (this.f1918f.inTransaction()) {
                this.f1918f.endTransaction();
            }
            if (sQLiteStatement != null) {
                sQLiteStatement.clearBindings();
                sQLiteStatement.close();
            }
            m1834h();
        }
    }

    private boolean m1827a(String str) {
        boolean z;
        Throwable e;
        Cursor cursor = null;
        try {
            cursor = this.f1918f.rawQuery("SELECT name FROM sqlite_master WHERE type=? ", new String[]{"table"});
            if (cursor != null) {
                z = false;
                while (cursor.moveToNext()) {
                    try {
                        if (cursor.getString(0).equals(str)) {
                            z = true;
                        }
                    } catch (SQLException e2) {
                        e = e2;
                    }
                }
            } else {
                z = false;
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable e3) {
            e = e3;
            z = false;
            try {
                if (KonyMain.f3660h) {
                    Log.i("i18nLib", "i18n.isTablePresent: Caught exception for the locale " + str);
                }
                if (KonyMain.f3658f) {
                    Log.w("i18nLib", "KonyI18n::isTablePresent ", e);
                }
                if (cursor != null) {
                    cursor.close();
                }
                if (KonyMain.f3660h) {
                    Log.i("i18nLib", "i18n.isTablePresent: table " + str + " is Present <" + z + ">");
                }
                return z;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        if (KonyMain.f3660h) {
            Log.i("i18nLib", "i18n.isTablePresent: table " + str + " is Present <" + z + ">");
        }
        return z;
    }

    private static void m1828b(Object obj, String str, String str2) {
        if (obj != null && obj != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = obj;
            Bundle bundle = new Bundle();
            bundle.putSerializable("key0", str);
            bundle.putSerializable("key1", str2);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    private boolean m1829b(String str) {
        boolean z = false;
        if (this.f1915b != null && this.f1915b.equalsIgnoreCase(str)) {
            z = true;
            this.f1919g = new Hashtable();
        }
        if (KonyMain.f3657e) {
            Log.d("i18nLib", "KonyI18n::isCacheUpdateRequired isCacheUpdateRequired " + z);
        }
        return z;
    }

    public static Locale m1830c() {
        return Locale.getDefault();
    }

    private void m1831c(String str) {
        this.f1915b = str;
        m1845e();
    }

    public static ArrayList m1832d() {
        Collection arrayList = new ArrayList(Arrays.asList(Locale.getAvailableLocales()));
        Collection arrayList2 = new ArrayList(Arrays.asList(Collator.getAvailableLocales()));
        Collection hashSet = new HashSet();
        hashSet.addAll(arrayList);
        hashSet.addAll(arrayList2);
        return new ArrayList(hashSet);
    }

    private void m1833g() {
        try {
            this.f1918f = this.f1917e.openOrCreateDatabase("i18nupdatedb", 0, null);
        } catch (SQLException e) {
            throw new LuaError("Error in initializing kony i18n", 1800);
        }
    }

    private void m1834h() {
        if (this.f1918f != null) {
            this.f1918f.close();
        }
    }

    public static boolean m1835j(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            if (KonyMain.f3658f) {
                Log.w("i18nLib", "KonyI18n::islocalesupportedbydevice Invalid Number of params <" + objArr + ">");
            }
            return false;
        }
        String str = (String) objArr[0];
        for (Locale locale : Locale.getAvailableLocales()) {
            if (str.equalsIgnoreCase(locale.toString())) {
                return true;
            }
        }
        for (Locale locale2 : Collator.getAvailableLocales()) {
            if (str.equalsIgnoreCase(locale2.toString())) {
                return true;
            }
        }
        return false;
    }

    public final void m1836a() {
        if (this.f1918f != null) {
            KonyMain.getAppContext().deleteDatabase("i18nupdatedb");
        }
        this.f1918f = null;
        f1913a = null;
        this.f1915b = null;
        this.f1916c = null;
        this.f1919g = null;
    }

    public final void m1837a(File file, String str) {
        if (!str.contains("-")) {
            Properties a = C0284S.m1822a(file);
            if (a != null) {
                m1826a(a, str);
            } else if (KonyMain.f3658f) {
                Log.w("i18nLib", "KonyI18n::setResourceBundleFromFile No Properties found for the fileName " + file);
            }
        } else if (KonyMain.f3657e) {
            Log.d("i18nLib", "KonyI18n::setResourceBundleFromFile(), resource bundle is not set, since the Locale contains - character");
        }
    }

    public final void m1838a(InputStream inputStream, String str) {
        if (!str.contains("-")) {
            Properties properties = new Properties();
            try {
                properties.load(inputStream);
                m1826a(properties, str);
            } catch (IOException e) {
                if (KonyMain.f3657e) {
                    Log.d("i18nLib", BuildConfig.FLAVOR + e.getMessage());
                }
                if (KonyMain.f3658f) {
                    Log.w("i18nLib", "KonyI18n:setResourceBundleFromStream No properties found");
                }
            }
        } else if (KonyMain.f3657e) {
            Log.d("i18nLib", "KonyI18n::setResourceBundleFromFile(), resource bundle is not set, since the Locale contains - character");
        }
    }

    public final synchronized void m1839a(Object obj, Object obj2) {
        Cursor cursor = null;
        synchronized (this) {
            String b = m1841b();
            String str = this.f1915b;
            if (this.f1915b == null) {
                this.f1919g = new Hashtable();
            } else if (b != null) {
                if (b.equals(this.f1915b)) {
                }
            }
            if (b != null) {
                if (!this.f1918f.isOpen()) {
                    m1833g();
                }
                try {
                    int indexOf = b.indexOf(95);
                    if (indexOf > 0) {
                        String substring = b.substring(0, indexOf);
                        if (m1827a("i18ninfo_" + substring)) {
                            cursor = this.f1918f.rawQuery("SELECT Key, Value FROM i18ninfo_" + substring, new String[0]);
                            if (KonyMain.f3657e) {
                                Log.d("i18nLib", "KonyI18n::updateCache total records found = " + cursor.getCount() + " for the locale <" + substring + ">");
                            }
                            if (cursor != null) {
                                while (cursor.moveToNext()) {
                                    m1825a(cursor.getString(0), cursor.getString(1));
                                }
                                this.f1915b = substring;
                            } else if (KonyMain.f3658f) {
                                Log.w("i18nLib", "KonyI18n::updateCache No Resource Bundle found for the default locale <" + substring + "> from the DB, so retaining the current locale cache");
                            }
                        }
                    }
                    if (m1827a("i18ninfo_" + b)) {
                        cursor = this.f1918f.rawQuery("SELECT Key, Value FROM i18ninfo_" + b, new String[0]);
                        if (KonyMain.f3657e) {
                            Log.d("i18nLib", "KonyI18n::updateCache total records found = " + cursor.getCount() + " for the locale <" + b + ">");
                        }
                        if (cursor != null) {
                            while (cursor.moveToNext()) {
                                m1825a(cursor.getString(0), cursor.getString(1));
                            }
                            this.f1915b = b;
                        } else if (KonyMain.f3658f) {
                            Log.w("i18nLib", "KonyI18n::updateCache No Resource Bundle found for the default locale <" + b + "> from the DB, so retaining the current locale cache");
                        }
                        if (obj != null) {
                            C0284S.m1824a(obj, str, b);
                        }
                        m1831c(b);
                    } else {
                        if (KonyMain.f3658f) {
                            Log.w("i18nLib", "KonyI18n::updateCache No Resource Bundle found for the default locale <" + b + "> from the DB, so retaining the current locale cache");
                        }
                        if (obj2 != null) {
                            C0284S.m1828b(obj2, "1300", "Unable to update locale");
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    m1834h();
                } catch (Throwable e) {
                    if (e.getMessage().startsWith("no such table")) {
                        this.f1919g = null;
                        this.f1915b = null;
                        if (KonyMain.f3660h) {
                            Log.i("i18nLib", "KonyI18n::updateCache No Resource Bundle found for the default locale <" + b + "> from the DB, so retaining the current locale cache");
                        }
                    } else if (KonyMain.f3658f) {
                        Log.w("i18nLib", "KonyI18n::updateCache ", e);
                    }
                    if (obj2 != null) {
                        C0284S.m1828b(obj2, "1300", "Unable to update locale");
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    m1834h();
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    m1834h();
                }
            } else if (KonyMain.f3658f) {
                Log.w("i18nLib", "KonyI18n::updateCache Application locale not found so cache not updated");
            }
        }
    }

    public final boolean m1840a(Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            if (!KonyMain.f3658f) {
                return false;
            }
            Log.w("i18nLib", "i18n.isResourceBundlePresent: failed Invalid Number of params for the locale " + objArr);
            return false;
        } else if (this.f1915b == null || !this.f1915b.equals(objArr[0].toString())) {
            if (this.f1918f == null || !this.f1918f.isOpen()) {
                m1833g();
            }
            try {
                boolean a = m1827a("i18ninfo_" + objArr[0]);
                return a;
            } finally {
                m1834h();
            }
        } else {
            if (KonyMain.f3657e) {
                Log.d("i18nLib", "KonyI18n::isResourceBundlePresent() Locale already in the cache, skippig the DB query");
            }
            return true;
        }
    }

    public final String m1841b() {
        if (this.f1916c != null) {
            return this.f1916c;
        }
        if (m1840a(new Object[]{Locale.getDefault().toString()})) {
            return Locale.getDefault().toString();
        }
        return m1840a(new Object[]{Locale.getDefault().getLanguage()}) ? Locale.getDefault().getLanguage() : f1913a != null ? f1913a : Locale.getDefault().toString();
    }

    public final void m1842b(Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            if (this.f1918f == null || !this.f1918f.isOpen()) {
                m1833g();
            }
            try {
                if (KonyMain.f3657e) {
                    Log.d("i18nLib", "KonyI18n::deleteResourceBundle() DROPing the table " + objArr[0]);
                }
                this.f1918f.execSQL("DROP TABLE IF EXISTS i18ninfo_" + objArr[0] + ";");
                if (this.f1915b != null && this.f1915b.equals(objArr[0].toString())) {
                    this.f1919g = null;
                    this.f1915b = null;
                    if (this.f1916c != null && this.f1916c.equals(objArr[0].toString())) {
                        this.f1916c = null;
                    }
                    m1845e();
                }
                m1834h();
            } catch (Throwable e) {
                if (KonyMain.f3660h) {
                    Log.i("i18nLib", "i18n.deleteResourceBundle: Caught exception for the locale " + objArr[0]);
                }
                if (KonyMain.f3658f) {
                    Log.w("i18nLib", "KonyI18n::deleteResourceBundle ", e);
                }
                m1834h();
            } catch (Throwable th) {
                m1834h();
            }
        } else if (KonyMain.f3658f) {
            Log.w("i18nLib", "i18n.deleteResourceBundle: failed Invalid Number of params for the locale " + objArr);
        }
    }

    public final void m1843c(Object[] objArr) {
        if (objArr != null && objArr.length >= 2 && (objArr[0] instanceof LuaTable)) {
            if (m1840a(new Object[]{objArr[1]})) {
                LuaTable luaTable = (LuaTable) objArr[0];
                if (KonyMain.f3657e) {
                    Log.d("i18nLib", "KonyI18n::updateResourceBundle() params[1] = " + objArr[1]);
                }
                int i = (!m1841b().equalsIgnoreCase((String) objArr[1]) || this.f1919g == null) ? 0 : 1;
                if (this.f1918f == null || !this.f1918f.isOpen()) {
                    m1833g();
                }
                SQLiteStatement sQLiteStatement = null;
                try {
                    SQLiteStatement sQLiteStatement2;
                    TableEnumeration tableEnumeration = luaTable.enumeration;
                    tableEnumeration.reset();
                    if (tableEnumeration != null) {
                        this.f1918f.execSQL("CREATE TABLE IF NOT EXISTS i18ninfo_" + objArr[1] + " (Key VARCHAR UNIQUE ON CONFLICT REPLACE, Value VARCHAR);");
                        sQLiteStatement = this.f1918f.compileStatement("INSERT INTO i18ninfo_" + objArr[1] + " (Key, Value) VALUES (?,?)");
                        this.f1918f.beginTransaction();
                        while (tableEnumeration.hasMoreElements()) {
                            Object nextElement = tableEnumeration.nextElement();
                            Object table = luaTable.getTable(nextElement);
                            if (table == LuaNil.nil) {
                                table = new String(BuildConfig.FLAVOR);
                            }
                            sQLiteStatement.bindString(1, nextElement.toString());
                            sQLiteStatement.bindString(2, table.toString());
                            sQLiteStatement.execute();
                            if (i != 0) {
                                m1825a(nextElement.toString(), table.toString());
                            }
                        }
                        this.f1918f.setTransactionSuccessful();
                        sQLiteStatement2 = sQLiteStatement;
                    } else {
                        sQLiteStatement2 = null;
                    }
                    if (this.f1918f.inTransaction()) {
                        this.f1918f.endTransaction();
                    }
                    if (sQLiteStatement2 != null) {
                        sQLiteStatement2.clearBindings();
                        sQLiteStatement2.close();
                    }
                    m1834h();
                } catch (Throwable e) {
                    if (KonyMain.f3658f) {
                        Log.w("i18nLib", "KonyI18n::updateResourceBundle ", e);
                    }
                    if (this.f1918f.inTransaction()) {
                        this.f1918f.endTransaction();
                    }
                    if (sQLiteStatement != null) {
                        sQLiteStatement.clearBindings();
                        sQLiteStatement.close();
                    }
                    m1834h();
                } catch (Throwable th) {
                    if (this.f1918f.inTransaction()) {
                        this.f1918f.endTransaction();
                    }
                    if (sQLiteStatement != null) {
                        sQLiteStatement.clearBindings();
                        sQLiteStatement.close();
                    }
                    m1834h();
                }
            }
        } else if (KonyMain.f3658f) {
            Log.w("i18nLib", "KonyI18n::updateResourceBundle Falied Invalid Number of params");
        }
    }

    public final void m1844d(Object[] objArr) {
        if (objArr == null || objArr.length < 2 || !(objArr[0] instanceof LuaTable)) {
            if (KonyMain.f3657e) {
                Log.d("i18nLib", "KonyI18n::setResourceBundle Invalid params for the input <" + objArr + ">");
            }
            throw new LuaError("Invalid arguments for for kony.i18n.setResourceBundle()", 1801);
        }
        LuaTable luaTable = (LuaTable) objArr[0];
        if (!objArr[1].toString().contains("-")) {
            if (KonyMain.f3657e) {
                Log.d("i18nLib", "KonyI18n::setResourceBundle() Locale = " + objArr[1]);
            }
            SQLiteStatement sQLiteStatement = null;
            boolean b = m1829b(objArr[1].toString());
            if (this.f1915b == null) {
                if (objArr[1].toString().equalsIgnoreCase(Locale.getDefault().toString())) {
                    m1831c(Locale.getDefault().getLanguage() + Locale.getDefault().getCountry());
                } else if (f1913a != null && objArr[1].toString().equalsIgnoreCase(f1913a)) {
                    m1831c(f1913a);
                }
                this.f1919g = new Hashtable();
                b = true;
            }
            try {
                if (this.f1918f == null || !this.f1918f.isOpen()) {
                    m1833g();
                }
                this.f1918f.execSQL("DROP TABLE IF EXISTS i18ninfo_" + objArr[1] + ";");
                this.f1918f.execSQL("CREATE TABLE IF NOT EXISTS i18ninfo_" + objArr[1] + " (Key VARCHAR UNIQUE ON CONFLICT REPLACE, Value VARCHAR);");
                TableEnumeration tableEnumeration = luaTable.enumeration;
                tableEnumeration.reset();
                sQLiteStatement = this.f1918f.compileStatement("INSERT INTO i18ninfo_" + objArr[1] + " (Key, Value) VALUES (?,?)");
                this.f1918f.beginTransaction();
                while (tableEnumeration.hasMoreElements()) {
                    Object nextElement = tableEnumeration.nextElement();
                    Object table = luaTable.getTable(nextElement);
                    if (table == LuaNil.nil) {
                        table = new String(BuildConfig.FLAVOR);
                    }
                    sQLiteStatement.bindString(1, nextElement.toString());
                    sQLiteStatement.bindString(2, table.toString());
                    sQLiteStatement.execute();
                    if (b) {
                        m1825a(nextElement.toString(), table.toString());
                    }
                }
                this.f1918f.setTransactionSuccessful();
                if (this.f1918f.inTransaction()) {
                    this.f1918f.endTransaction();
                }
                if (sQLiteStatement != null) {
                    sQLiteStatement.clearBindings();
                    sQLiteStatement.close();
                }
                m1834h();
            } catch (Throwable e) {
                if (KonyMain.f3658f) {
                    Log.w("i18nLib", "KonyI18n::setResourceBundle ", e);
                }
                throw new LuaError("Error in kony.i18n.setResourceBundle(). " + e.getMessage(), 1811);
            } catch (Throwable th) {
                if (this.f1918f.inTransaction()) {
                    this.f1918f.endTransaction();
                }
                if (sQLiteStatement != null) {
                    sQLiteStatement.clearBindings();
                    sQLiteStatement.close();
                }
                m1834h();
            }
        } else if (KonyMain.f3657e) {
            Log.d("i18nLib", "KonyI18n::setResourceBundle(), resource bundle is not set, since the Locale contains - character");
        }
    }

    public final void m1845e() {
        String[] split = m1841b().split("_");
        Locale locale = split.length > 1 ? new Locale(split[0], split[1]) : new Locale(split[0]);
        Configuration configuration = new Configuration();
        configuration.locale = locale;
        KonyMain.getAppContext().getResources().updateConfiguration(configuration, null);
    }

    public final void m1846e(Object[] objArr) {
        if (objArr != null && objArr.length > 0 && objArr[0] != null && ((String) objArr[0]).trim() != BuildConfig.FLAVOR) {
            int i = this.f1915b == f1913a ? 1 : 0;
            String trim = objArr[0].toString().trim();
            f1913a = trim;
            if (i != 0 && this.f1915b != trim) {
                m1839a(null, null);
            }
        } else if (KonyMain.f3658f) {
            Log.w("i18nLib", "i18n.setApplicationLocale: Falied to set the application locale, inputParams = " + objArr);
        }
    }

    public final String m1847f() {
        return this.f1916c;
    }

    public final void m1848f(Object[] objArr) {
        if (objArr == null || objArr.length < 3 || objArr[0] == LuaNil.nil || ((String) objArr[0]).trim() == BuildConfig.FLAVOR || objArr[1] == LuaNil.nil || objArr[2] == LuaNil.nil) {
            if (KonyMain.f3658f) {
                Log.w("i18nLib", "i18n.setApplicationLocale: Falied to set the application locale, inputParams = " + objArr);
            }
            if (objArr != null && objArr.length > 2) {
                C0284S.m1828b(objArr[2], "1300", "Invalid number of arguments");
                return;
            }
            return;
        }
        int i = this.f1915b == f1913a ? 1 : 0;
        String trim = objArr[0].toString().trim();
        f1913a = trim;
        if (i != 0 && this.f1915b != trim) {
            m1839a(objArr[1], objArr[2]);
        } else if (objArr[1] != null) {
            C0284S.m1824a(objArr[1], this.f1915b, this.f1915b);
        }
    }

    public final Object m1849g(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            if (this.f1919g == null) {
                m1839a(null, null);
            }
            if (this.f1919g == null) {
                return null;
            }
            if (this.f1919g.containsKey(objArr[0])) {
                return (String) this.f1919g.get(objArr[0]);
            }
            if (!KonyMain.f3658f) {
                return null;
            }
            Log.w("i18nLib", "KonyI18n::getlocalizedstring Value not found for the key <" + objArr[0] + ">");
            return null;
        } else if (!KonyMain.f3658f) {
            return null;
        } else {
            Log.w("i18nLib", "KonyI18n::getlocalizedstring Invalid Number of params <" + objArr + ">");
            return null;
        }
    }

    public final int m1850h(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            if (KonyMain.f3658f) {
                Log.w("i18nLib", "KonyI18n::islocalesupportedbydevice Invalid Number of params <" + objArr + ">");
            }
            return 0;
        }
        String str = (String) objArr[0];
        if (this.f1915b != null && this.f1915b.equalsIgnoreCase(str)) {
            this.f1916c = str;
            return 0;
        } else if (!C0284S.m1835j(objArr)) {
            return 100;
        } else {
            if (!m1840a(objArr)) {
                return 101;
            }
            this.f1916c = str;
            m1839a(null, null);
            return 0;
        }
    }

    public final int m1851i(Object[] objArr) {
        if (objArr == null || objArr.length < 3 || objArr[0] == LuaNil.nil || ((String) objArr[0]).trim() == BuildConfig.FLAVOR || objArr[1] == LuaNil.nil || objArr[2] == LuaNil.nil) {
            if (KonyMain.f3658f) {
                Log.w("i18nLib", "KonyI18n::islocalesupportedbydevice Invalid Number of params <" + objArr + ">");
            }
            if (objArr != null && objArr.length > 2) {
                C0284S.m1828b(objArr[2], "1300", "Invalid number of arguments");
            }
            return 0;
        }
        String str = (String) objArr[0];
        if (this.f1915b != null && this.f1915b.equalsIgnoreCase(str)) {
            this.f1916c = str;
            return 0;
        } else if (!C0284S.m1835j(objArr)) {
            C0284S.m1828b(objArr[2], "1300", "Locale not supported by Device");
            return 100;
        } else if (m1840a(objArr)) {
            this.f1916c = str;
            new C0285T(this, objArr).start();
            return 0;
        } else {
            C0284S.m1828b(objArr[2], "1300", "Locale not supported by Application");
            return 101;
        }
    }
}
