package com.konylabs.android;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.vm.Function;
import com.rsa.mobilesdk.sdk.BuildConfig;
import com.rsa.mobilesdk.sdk.MobileAPI;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import net.sourceforge.zbar.Config;
import ny0k.C0284S;
import ny0k.az;

/* renamed from: com.konylabs.android.h */
public class C0135h {
    public static int f33a;
    public static int f34b;
    private static int f35c;
    private static int f36d;
    private static int f37e;
    private static int f38f;
    private static byte[] f39g;
    private Context f40h;
    private SQLiteDatabase f41i;
    private az f42j;
    private boolean f43k;
    private String f44l;

    static {
        f35c = 0;
        f36d = 2;
        f33a = 3;
        f37e = 4;
        f34b = 7;
        f38f = 6;
        f39g = new byte[16];
    }

    public C0135h(Context context) {
        this.f43k = false;
        this.f44l = "temp";
        this.f40h = context;
    }

    private static String m48a(DataInputStream dataInputStream, int i) throws IOException {
        return dataInputStream.read(f39g, 0, i) != i ? null : new String(f39g, 0, i);
    }

    private void m49a(int i) {
        try {
            if (m65b() == -1) {
                this.f41i.execSQL("INSERT INTO appinfo (Key, Value) VALUES (?,?)", new Object[]{"updatestate", new Integer(i)});
                return;
            }
            this.f41i.execSQL("UPDATE appinfo SET Value=? WHERE Key=?", new Object[]{new Integer(i), "updatestate"});
        } catch (SQLException e) {
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
            }
        }
    }

    private static void m50a(Function function, int i, String str) {
        try {
            function.execute(new Object[]{Integer.valueOf(i), str});
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
            }
        }
    }

    private void m51a(DataInputStream dataInputStream) throws IOException {
        if (KonyMain.f3657e) {
            Log.d("KonyAppUpdater", "Extracting the downloaded KBF file");
        }
        m52a(new File(this.f40h.getCacheDir(), this.f44l));
        File file = new File(this.f40h.getCacheDir(), this.f44l);
        file.mkdir();
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        byte readByte3 = dataInputStream.readByte();
        byte readByte4 = dataInputStream.readByte();
        byte readByte5 = dataInputStream.readByte();
        if (KonyMain.f3657e) {
            Log.d("KonyAppUpdater", "byte1 : " + readByte4);
        }
        if (KonyMain.f3657e) {
            Log.d("KonyAppUpdater", "byte2 : " + readByte5);
        }
        short s = (short) ((readByte4 & MotionEventCompat.ACTION_MASK) | (readByte5 << 8));
        if (KonyMain.f3657e) {
            Log.d("KonyAppUpdater", "pMajor : " + readByte + " pMinor: " + readByte2 + " pPatch : " + readByte3 + " build: " + s);
        }
        String str = readByte + BuildConfig.FLAVOR + readByte2 + BuildConfig.FLAVOR + readByte3 + BuildConfig.FLAVOR + s;
        if (KonyMain.f3657e) {
            Log.d("KonyAppUpdater", "Platfrom Version \t : " + str);
        }
        try {
            if (m61l() == null) {
                this.f41i.execSQL("INSERT INTO appinfo (Key, Value) VALUES (?,?)", new Object[]{"pfversion", str});
            } else {
                this.f41i.execSQL("UPDATE appinfo SET Value=? WHERE Key=?", new Object[]{str, "pfversion"});
            }
        } catch (SQLException e) {
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
            }
        }
        str = dataInputStream.read() + BuildConfig.FLAVOR + dataInputStream.read() + BuildConfig.FLAVOR + dataInputStream.read();
        if (KonyMain.f3657e) {
            Log.d("KonyAppUpdater", "Application Version \t : " + str);
        }
        try {
            if (m60k() == null) {
                this.f41i.execSQL("INSERT INTO appinfo (Key, Value) VALUES (?,?)", new Object[]{"appversion", str});
            } else {
                this.f41i.execSQL("UPDATE appinfo SET Value=? WHERE Key=?", new Object[]{str, "appversion"});
            }
        } catch (SQLException e2) {
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e2.getMessage());
            }
        }
        str = C0135h.m48a(dataInputStream, 16).replace('\u0000', ' ').trim();
        if (KonyMain.f3657e) {
            Log.d("KonyAppUpdater", "\t AppName  \t : " + str);
        }
        try {
            if (m58i() == null) {
                this.f41i.execSQL("INSERT INTO appinfo (Key, Value) VALUES (?,?)", new Object[]{"appname", str});
            } else {
                this.f41i.execSQL("UPDATE appinfo SET Value=? WHERE Key=?", new Object[]{str, "appname"});
            }
        } catch (SQLException e22) {
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e22.getMessage());
            }
        }
        str = C0135h.m48a(dataInputStream, 16).replace('\u0000', ' ').trim();
        if (KonyMain.f3657e) {
            Log.d("KonyAppUpdater", "\t vendorName  \t : " + str);
        }
        try {
            if (m59j() == null) {
                this.f41i.execSQL("INSERT INTO appinfo (Key, Value) VALUES (?,?)", new Object[]{"vendorname", str});
            } else {
                this.f41i.execSQL("UPDATE appinfo SET Value=? WHERE Key=?", new Object[]{str, "vendorname"});
            }
        } catch (SQLException e222) {
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e222.getMessage());
            }
        }
        str = C0135h.m48a(dataInputStream, 12).replace('\u0000', ' ').trim();
        if (KonyMain.f3657e) {
            Log.d("KonyAppUpdater", "\t entryPoint  \t : " + str);
        }
        str = C0135h.m48a(dataInputStream, 12).replace('\u0000', ' ').trim();
        if (KonyMain.f3657e) {
            Log.d("KonyAppUpdater", "\t appId  \t : " + str);
        }
        try {
            if (m57h() == null) {
                this.f41i.execSQL("INSERT INTO appinfo (Key, Value) VALUES (?,?)", new Object[]{"appid", str});
            } else {
                this.f41i.execSQL("UPDATE appinfo SET Value=? WHERE Key=?", new Object[]{str, "appid"});
            }
        } catch (SQLException e2222) {
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e2222.getMessage());
            }
        }
        str = C0135h.m48a(dataInputStream, 12).replace('\u0000', ' ').trim();
        if (KonyMain.f3657e) {
            Log.d("KonyAppUpdater", "\t logoName  \t : " + str);
        }
        try {
            if (m66c() == null) {
                this.f41i.execSQL("INSERT INTO appinfo (Key, Value) VALUES (?,?)", new Object[]{"logoname", str});
            } else {
                this.f41i.execSQL("UPDATE appinfo SET Value=? WHERE Key=?", new Object[]{str, "logoname"});
            }
        } catch (SQLException e22222) {
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e22222.getMessage());
            }
        }
        if (KonyMain.f3657e) {
            Log.d("KonyAppUpdater", "\n \t resources \t : \n ");
        }
        byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT];
        File file2 = null;
        char c = '\u0000';
        while (true) {
            int read = dataInputStream.read();
            if (read != -1) {
                char c2;
                File file3;
                if (KonyMain.f3657e) {
                    Log.d("KonyAppUpdater", "\t resourceType  \t : " + read);
                }
                switch (read) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        c2 = '\u0000';
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                    case MotionEventCompat.AXIS_GAS /*22*/:
                    case Config.MAX_LEN /*33*/:
                    case MotionEventCompat.AXIS_GENERIC_13 /*44*/:
                        c2 = '\u0001';
                        break;
                    default:
                        c2 = c;
                        break;
                }
                if (c2 != '\u0000') {
                    str = C0135h.m48a(dataInputStream, 5);
                    file3 = new File(new File(this.f40h.getCacheDir(), this.f44l), str);
                    if (file3.mkdir()) {
                        if (KonyMain.f3657e) {
                            Log.d("KonyAppUpdater", "locale directory \"" + str + "\" created");
                        } else if (KonyMain.f3657e) {
                            Log.d("KonyAppUpdater", "locale directory \"" + str + "\" already exist");
                        }
                    }
                } else {
                    file3 = file2;
                }
                int b = C0135h.m55b(dataInputStream, 4);
                if (KonyMain.f3657e) {
                    Log.d("KonyAppUpdater", "\t size  \t : " + b);
                }
                str = this.f44l + C0135h.m48a(dataInputStream, 12).replace('\u0000', ' ').trim();
                if (KonyMain.f3657e) {
                    Log.d("KonyAppUpdater", "\t resourceName  \t : " + str + " length : " + str.length());
                }
                if (KonyMain.f3657e) {
                    Log.d("KonyAppUpdater", "Deleting resource file " + str);
                }
                String str2 = read == 1 ? "konyappluabytecode.o" : str;
                OutputStream fileOutputStream = new FileOutputStream(c2 != '\u0000' ? new File(file3, str2 + ".tmp") : new File(file, str2 + ".tmp"));
                int i = b < AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT ? b : AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT;
                read = 0;
                while (read != b) {
                    int read2 = dataInputStream.read(bArr, 0, i);
                    read += read2;
                    fileOutputStream.write(bArr, 0, read2);
                    if (read < b) {
                        i = b - read;
                        if (i >= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT) {
                            i = AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT;
                        }
                    }
                }
                fileOutputStream.close();
                file2 = file3;
                c = c2;
            } else {
                return;
            }
        }
    }

    private void m52a(File file) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    m52a(listFiles[i]);
                } else {
                    listFiles[i].delete();
                }
            }
            file.delete();
        }
    }

    private static void m53a(File file, File file2) throws IOException {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream;
        OutputStream outputStream;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        BufferedOutputStream bufferedOutputStream = null;
        String name = file.getName();
        File file3 = new File(file2, name.substring(0, name.length() - 4));
        file3.createNewFile();
        try {
            InputStream fileInputStream2;
            OutputStream fileOutputStream2 = new FileOutputStream(file3);
            try {
                fileInputStream2 = new FileInputStream(file);
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
                fileInputStream = null;
                outputStream = fileOutputStream2;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream2);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream2);
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = null;
                    bufferedOutputStream = bufferedOutputStream2;
                    inputStream = fileInputStream2;
                    outputStream = fileOutputStream2;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
                try {
                    byte[] bArr = new byte[MobileAPI.MAX_CUSTOM_STRING_LENGTH];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read != -1) {
                            bufferedOutputStream2.write(bArr, 0, read);
                        } else {
                            fileOutputStream2.flush();
                            bufferedOutputStream2.flush();
                            bufferedOutputStream2.close();
                            bufferedInputStream.close();
                            fileInputStream2.close();
                            fileOutputStream2.close();
                            return;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedOutputStream = bufferedOutputStream2;
                    fileInputStream = fileInputStream2;
                    fileOutputStream = fileOutputStream2;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                bufferedInputStream = null;
                inputStream = fileInputStream2;
                outputStream = fileOutputStream2;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            bufferedInputStream = null;
            fileInputStream = null;
            fileOutputStream = null;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }

    private void m54a(File file, String str) {
        File[] listFiles = file.listFiles(new C0136i(this));
        if (listFiles.length > 0) {
            C0284S a = C0284S.m1823a(this.f40h);
            for (File a2 : listFiles) {
                a.m1837a(a2, str);
            }
        }
    }

    private static int m55b(DataInputStream dataInputStream, int i) throws IOException {
        int i2 = 0;
        byte[] bArr = new byte[4];
        if (dataInputStream.read(bArr) != 4) {
            return -1;
        }
        int i3 = 0;
        while (i3 < 4) {
            int i4 = ((bArr[i3] & MotionEventCompat.ACTION_MASK) << (i3 * 8)) | i2;
            i3++;
            i2 = i4;
        }
        return i2;
    }

    private void m56g() {
        try {
            synchronized (C0135h.class) {
                this.f41i = this.f40h.openOrCreateDatabase("appupdatedb", 0, null);
                this.f41i.execSQL("CREATE TABLE IF NOT EXISTS appinfo (Key VARCHAR, Value VARCHAR);");
                this.f43k = true;
            }
        } catch (SQLException e) {
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
            }
        }
    }

    private String m57h() {
        SQLException e;
        String str = null;
        Cursor rawQuery;
        try {
            if (!this.f43k) {
                m56g();
            }
            if (this.f41i != null) {
                rawQuery = this.f41i.rawQuery("SELECT Value FROM appinfo WHERE Key=?", new String[]{"appid"});
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() == 0) {
                            if (rawQuery != null) {
                                rawQuery.close();
                            }
                        } else if (rawQuery.move(1)) {
                            str = rawQuery.getString(0);
                            if (rawQuery != null) {
                                rawQuery.close();
                            }
                        } else if (rawQuery != null) {
                            rawQuery.close();
                        }
                    } catch (SQLException e2) {
                        e = e2;
                        try {
                            if (KonyMain.f3657e) {
                                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
                            }
                            if (rawQuery != null) {
                                rawQuery.close();
                            }
                            return str;
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            if (rawQuery != null) {
                                rawQuery.close();
                            }
                            throw th2;
                        }
                    }
                } else if (rawQuery != null) {
                    rawQuery.close();
                }
            }
        } catch (SQLException e3) {
            e = e3;
            rawQuery = null;
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return str;
        } catch (Throwable th3) {
            rawQuery = null;
            th2 = th3;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th2;
        }
        return str;
    }

    private String m58i() {
        SQLException e;
        Throwable th;
        String str = null;
        Cursor rawQuery;
        try {
            if (!this.f43k) {
                m56g();
            }
            rawQuery = this.f41i.rawQuery("SELECT Value FROM appinfo WHERE Key=?", new String[]{"appname"});
            try {
                if (rawQuery.getCount() == 0) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else if (rawQuery.move(1)) {
                    str = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (SQLException e2) {
                e = e2;
                try {
                    if (KonyMain.f3657e) {
                        Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            }
        } catch (SQLException e3) {
            e = e3;
            rawQuery = null;
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return str;
        } catch (Throwable th3) {
            rawQuery = null;
            th = th3;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
        return str;
    }

    private String m59j() {
        Cursor rawQuery;
        SQLException e;
        Throwable th;
        String str = null;
        try {
            if (!this.f43k) {
                m56g();
            }
            rawQuery = this.f41i.rawQuery("SELECT Value FROM appinfo WHERE Key=?", new String[]{"vendorname"});
            try {
                if (rawQuery.getCount() == 0) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else if (rawQuery.move(1)) {
                    str = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (SQLException e2) {
                e = e2;
                try {
                    if (KonyMain.f3657e) {
                        Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            }
        } catch (SQLException e3) {
            e = e3;
            rawQuery = null;
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return str;
        } catch (Throwable th3) {
            rawQuery = null;
            th = th3;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
        return str;
    }

    private String m60k() {
        SQLException e;
        Throwable th;
        String str = null;
        Cursor rawQuery;
        try {
            if (!this.f43k) {
                m56g();
            }
            rawQuery = this.f41i.rawQuery("SELECT Value FROM appinfo WHERE Key=?", new String[]{"appversion"});
            try {
                if (rawQuery.getCount() == 0) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else if (rawQuery.move(1)) {
                    str = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (SQLException e2) {
                e = e2;
                try {
                    if (KonyMain.f3657e) {
                        Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            }
        } catch (SQLException e3) {
            e = e3;
            rawQuery = null;
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return str;
        } catch (Throwable th3) {
            rawQuery = null;
            th = th3;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
        return str;
    }

    private String m61l() {
        SQLException e;
        Throwable th;
        String str = null;
        Cursor rawQuery;
        try {
            if (!this.f43k) {
                m56g();
            }
            rawQuery = this.f41i.rawQuery("SELECT Value FROM appinfo WHERE Key=?", new String[]{"pfversion"});
            try {
                if (rawQuery.getCount() == 0) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else if (rawQuery.move(1)) {
                    str = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (SQLException e2) {
                e = e2;
                try {
                    if (KonyMain.f3657e) {
                        Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            }
        } catch (SQLException e3) {
            e = e3;
            rawQuery = null;
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return str;
        } catch (Throwable th3) {
            rawQuery = null;
            th = th3;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
        return str;
    }

    private String m62m() {
        try {
            InputStream open = this.f40h.getAssets().open("application.properties");
            Properties properties = new Properties();
            properties.load(open);
            String property = properties.getProperty("App-URL");
            open.close();
            return property;
        } catch (IOException e) {
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
            }
            return null;
        }
    }

    public final void m63a() {
        if (this.f41i != null) {
            this.f41i.close();
        }
        if (this.f42j != null) {
            this.f42j.m3572i();
        }
        this.f43k = false;
    }

    public final void m64a(java.lang.String r7, com.konylabs.vm.Function r8) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0090 in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:58)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r6 = this;
        r5 = 0;
        if (r7 == 0) goto L_0x009b;
    L_0x0003:
        if (r8 == 0) goto L_0x000a;
    L_0x0005:
        r0 = 1;
        r1 = 0;
        com.konylabs.android.C0135h.m50a(r8, r0, r1);	 Catch:{ IOException -> 0x009c, all -> 0x00be }
    L_0x000a:
        r0 = new ny0k.az;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r1 = 0;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r0.<init>(r7, r1);	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r6.f42j = r0;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r0 = r6.f42j;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r1 = 1;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r0.m3561a(r1);	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r0 = r6.f42j;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r0.m3574k();	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r0 = r6.f42j;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r0 = r0.m3569f();	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        if (r0 != r1) goto L_0x014c;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
    L_0x0027:
        if (r8 == 0) goto L_0x002e;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
    L_0x0029:
        r0 = 2;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r1 = 0;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        com.konylabs.android.C0135h.m50a(r8, r0, r1);	 Catch:{ IOException -> 0x009c, all -> 0x00be }
    L_0x002e:
        if (r8 == 0) goto L_0x0035;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
    L_0x0030:
        r0 = 3;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r1 = 0;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        com.konylabs.android.C0135h.m50a(r8, r0, r1);	 Catch:{ IOException -> 0x009c, all -> 0x00be }
    L_0x0035:
        r0 = r6.f42j;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r1 = r0.m3571h();	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        if (r1 == 0) goto L_0x0090;
    L_0x003d:
        r0 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r2 = r6.f40h;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r3 = "konyappandroid.kbf";	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r2 = r2.deleteFile(r3);	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        if (r2 == 0) goto L_0x0057;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x004c:
        r2 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        if (r2 == 0) goto L_0x0057;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x0050:
        r2 = "KonyAppUpdater";	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r3 = "Old KBF deleted";	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        android.util.Log.d(r2, r3);	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x0057:
        r2 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        if (r2 == 0) goto L_0x0062;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x005b:
        r2 = "KonyAppUpdater";	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r3 = "New KBF downloading";	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        android.util.Log.d(r2, r3);	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x0062:
        r6.m51a(r0);	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r1.close();	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r0 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        if (r0 == 0) goto L_0x0073;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x006c:
        r0 = "KonyAppUpdater";	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r2 = "New KBF download success";	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        android.util.Log.d(r0, r2);	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x0073:
        if (r8 == 0) goto L_0x007a;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x0075:
        r0 = 4;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r2 = 0;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        com.konylabs.android.C0135h.m50a(r8, r0, r2);	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x007a:
        if (r8 == 0) goto L_0x0081;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x007c:
        r0 = 5;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r2 = 0;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        com.konylabs.android.C0135h.m50a(r8, r0, r2);	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x0081:
        if (r8 == 0) goto L_0x0088;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x0083:
        r0 = 6;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r2 = 0;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        com.konylabs.android.C0135h.m50a(r8, r0, r2);	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x0088:
        r0 = f33a;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r6.m49a(r0);	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r1.close();	 Catch:{ IOException -> 0x009c, all -> 0x00be }
    L_0x0090:
        r0 = r6.f42j;
        if (r0 == 0) goto L_0x009b;
    L_0x0094:
        r0 = r6.f42j;
        r0.m3572i();
        r6.f42j = r5;
    L_0x009b:
        return;
    L_0x009c:
        r0 = move-exception;
        r1 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        if (r1 == 0) goto L_0x0090;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
    L_0x00a1:
        r1 = "KonyAppUpdater";	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r2.<init>();	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r3 = "";	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r0 = r0.getMessage();	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r0 = r2.append(r0);	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r0 = r0.toString();	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        android.util.Log.d(r1, r0);	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        goto L_0x0090;
    L_0x00be:
        r0 = move-exception;
        r1 = r6.f42j;
        if (r1 == 0) goto L_0x00ca;
    L_0x00c3:
        r1 = r6.f42j;
        r1.m3572i();
        r6.f42j = r5;
    L_0x00ca:
        throw r0;
    L_0x00cb:
        r0 = move-exception;
        r2 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        if (r2 == 0) goto L_0x00ec;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x00d0:
        r2 = "KonyAppUpdater";	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r3.<init>();	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r4 = "";	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r0 = r0.getMessage();	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r0 = r3.append(r0);	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        android.util.Log.d(r2, r0);	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x00ec:
        r0 = f37e;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r6.m49a(r0);	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        if (r8 == 0) goto L_0x00fe;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x00f3:
        r0 = 8;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r2 = r6.f42j;	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        r2 = r2.m3568e();	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
        com.konylabs.android.C0135h.m50a(r8, r0, r2);	 Catch:{ IOException -> 0x00cb, all -> 0x0125 }
    L_0x00fe:
        r1.close();
        goto L_0x0090;
    L_0x0102:
        r0 = move-exception;
        r1 = com.konylabs.android.KonyMain.f3657e;
        if (r1 == 0) goto L_0x0090;
    L_0x0107:
        r1 = "KonyAppUpdater";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "";
        r2 = r2.append(r3);
        r0 = r0.getMessage();
        r0 = r2.append(r0);
        r0 = r0.toString();
        android.util.Log.d(r1, r0);
        goto L_0x0090;
    L_0x0125:
        r0 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x012a }
    L_0x0129:
        throw r0;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
    L_0x012a:
        r1 = move-exception;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r2 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        if (r2 == 0) goto L_0x0129;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
    L_0x012f:
        r2 = "KonyAppUpdater";	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r3.<init>();	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r4 = "";	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r1 = r1.getMessage();	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r1 = r3.append(r1);	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r1 = r1.toString();	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        android.util.Log.d(r2, r1);	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        goto L_0x0129;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
    L_0x014c:
        if (r8 == 0) goto L_0x0158;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
    L_0x014e:
        r0 = 7;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r1 = r6.f42j;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r1 = r1.m3568e();	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        com.konylabs.android.C0135h.m50a(r8, r0, r1);	 Catch:{ IOException -> 0x009c, all -> 0x00be }
    L_0x0158:
        r0 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        if (r0 == 0) goto L_0x0163;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
    L_0x015c:
        r0 = "KonyAppUpdater";	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r1 = "Download failed";	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        android.util.Log.d(r0, r1);	 Catch:{ IOException -> 0x009c, all -> 0x00be }
    L_0x0163:
        r0 = f37e;	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        r6.m49a(r0);	 Catch:{ IOException -> 0x009c, all -> 0x00be }
        goto L_0x0090;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.android.h.a(java.lang.String, com.konylabs.vm.Function):void");
    }

    public final int m65b() {
        int i = -1;
        Cursor cursor = null;
        try {
            if (!this.f43k) {
                m56g();
            }
            cursor = this.f41i.rawQuery("SELECT Value FROM appinfo WHERE Key=?", new String[]{"updatestate"});
            if (cursor.getCount() == 0) {
                if (cursor != null) {
                    cursor.close();
                }
            } else if (cursor.move(1)) {
                i = cursor.getInt(0);
                if (cursor != null) {
                    cursor.close();
                }
            } else if (cursor != null) {
                cursor.close();
            }
        } catch (SQLException e) {
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
        return i;
    }

    public final String m66c() {
        Cursor rawQuery;
        SQLException e;
        Throwable th;
        String str = null;
        try {
            if (!this.f43k) {
                m56g();
            }
            rawQuery = this.f41i.rawQuery("SELECT Value FROM appinfo WHERE Key=?", new String[]{"logoname"});
            try {
                if (rawQuery.getCount() == 0) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else if (rawQuery.move(1)) {
                    str = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (SQLException e2) {
                e = e2;
                try {
                    if (KonyMain.f3657e) {
                        Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            }
        } catch (SQLException e3) {
            e = e3;
            rawQuery = null;
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return str;
        } catch (Throwable th3) {
            rawQuery = null;
            th = th3;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
        return str;
    }

    public final boolean m67d() {
        az azVar = true;
        try {
            String m = m62m();
            if (m == null || m.trim().length() == 0) {
                if (KonyMain.f3658f) {
                    Log.w("KonyAppUpdater", "The update server url is null");
                }
                if (this.f42j == null) {
                    return false;
                }
                this.f42j.m3572i();
                this.f42j = null;
                return false;
            }
            Object h = m57h();
            if (h == null) {
                if (KonyMain.f3658f) {
                    Log.w("KonyAppUpdater", "The app id is null");
                }
                if (this.f42j == null) {
                    return false;
                }
                this.f42j.m3572i();
                this.f42j = null;
                return false;
            }
            Object k = m60k();
            Object l = m61l();
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", "URL = " + m + "\nAppid = " + h + " appversion = " + k + " pfversion = " + l);
            }
            this.f42j = new az(m);
            this.f42j.m3562a((Object) "a", h);
            this.f42j.m3562a((Object) "cav", k);
            this.f42j.m3562a((Object) "cpv", l);
            this.f42j.m3562a((Object) "type", (Object) "android");
            this.f42j.m3561a(1);
            this.f42j.m3574k();
            int f = this.f42j.m3569f();
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", "Response code : " + f);
            }
            if (f == 506) {
                if (KonyMain.f3657e) {
                    Log.d("KonyAppUpdater", "Application available for download");
                }
                m49a(f36d);
                return azVar;
            }
            switch (f) {
                case 200:
                    if (KonyMain.f3657e) {
                        Log.d("KonyAppUpdater", "Application up to date");
                    }
                    m49a(0);
                    break;
                case 501:
                case 502:
                case 504:
                case 505:
                    if (KonyMain.f3657e) {
                        Log.d("KonyAppUpdater", "Response code = " + f);
                    }
                    m49a(f37e);
                    break;
                default:
                    if (KonyMain.f3657e) {
                        Log.d("KonyAppUpdater", "Invalid responsecode = " + f);
                        break;
                    }
                    break;
            }
            if (this.f42j == null) {
                return false;
            }
            this.f42j.m3572i();
            this.f42j = null;
            return false;
        } finally {
            azVar = this.f42j;
            if (azVar != null) {
                azVar = this.f42j;
                azVar.m3572i();
                this.f42j = null;
            }
        }
    }

    public final void m68e() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x007c in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:58)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r6 = this;
        r5 = 0;
        r0 = r6.m62m();	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r1 = new ny0k.az;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r2 = 0;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r1.<init>(r0, r2);	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r6.f42j = r1;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r0 = r6.m57h();	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r1 = r6.f42j;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r2 = "a";	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r1.m3562a(r2, r0);	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r0 = r6.f42j;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r1 = "type";	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r2 = "android";	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r0.m3562a(r1, r2);	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r0 = r6.f42j;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r1 = 1;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r0.m3561a(r1);	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r0 = r6.f42j;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r0.m3574k();	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r0 = r6.f42j;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r0 = r0.m3569f();	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        if (r0 != r1) goto L_0x012b;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
    L_0x0036:
        r0 = r6.f42j;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r1 = r0.m3571h();	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        if (r1 == 0) goto L_0x007c;
    L_0x003e:
        r0 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r2 = r6.f40h;	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r3 = "konyappandroid.kbf";	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r2 = r2.deleteFile(r3);	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        if (r2 == 0) goto L_0x0058;	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
    L_0x004d:
        r2 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        if (r2 == 0) goto L_0x0058;	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
    L_0x0051:
        r2 = "KonyAppUpdater";	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r3 = "Old KBF deleted";	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        android.util.Log.d(r2, r3);	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
    L_0x0058:
        r2 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        if (r2 == 0) goto L_0x0063;	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
    L_0x005c:
        r2 = "KonyAppUpdater";	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r3 = "New KBF downloading";	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        android.util.Log.d(r2, r3);	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
    L_0x0063:
        r6.m51a(r0);	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r1.close();	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r0 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        if (r0 == 0) goto L_0x0074;	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
    L_0x006d:
        r0 = "KonyAppUpdater";	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r2 = "New KBF download success";	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        android.util.Log.d(r0, r2);	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
    L_0x0074:
        r0 = f33a;	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r6.m49a(r0);	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r1.close();	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
    L_0x007c:
        r0 = r6.f42j;
        if (r0 == 0) goto L_0x0087;
    L_0x0080:
        r0 = r6.f42j;
        r0.m3572i();
        r6.f42j = r5;
    L_0x0087:
        return;
    L_0x0088:
        r0 = move-exception;
        r1 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        if (r1 == 0) goto L_0x007c;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
    L_0x008d:
        r1 = "KonyAppUpdater";	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r2.<init>();	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r3 = "";	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r0 = r0.getMessage();	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r0 = r2.append(r0);	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        android.util.Log.d(r1, r0);	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        goto L_0x007c;
    L_0x00aa:
        r0 = move-exception;
        r1 = r6.f42j;
        if (r1 == 0) goto L_0x00b6;
    L_0x00af:
        r1 = r6.f42j;
        r1.m3572i();
        r6.f42j = r5;
    L_0x00b6:
        throw r0;
    L_0x00b7:
        r0 = move-exception;
        r2 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        if (r2 == 0) goto L_0x00d8;	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
    L_0x00bc:
        r2 = "KonyAppUpdater";	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r3.<init>();	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r4 = "";	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r0 = r0.getMessage();	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r0 = r3.append(r0);	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        android.util.Log.d(r2, r0);	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
    L_0x00d8:
        r0 = f37e;	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r6.m49a(r0);	 Catch:{ IOException -> 0x00b7, all -> 0x0104 }
        r1.close();
        goto L_0x007c;
    L_0x00e1:
        r0 = move-exception;
        r1 = com.konylabs.android.KonyMain.f3657e;
        if (r1 == 0) goto L_0x007c;
    L_0x00e6:
        r1 = "KonyAppUpdater";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "";
        r2 = r2.append(r3);
        r0 = r0.getMessage();
        r0 = r2.append(r0);
        r0 = r0.toString();
        android.util.Log.d(r1, r0);
        goto L_0x007c;
    L_0x0104:
        r0 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x0109 }
    L_0x0108:
        throw r0;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
    L_0x0109:
        r1 = move-exception;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r2 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        if (r2 == 0) goto L_0x0108;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
    L_0x010e:
        r2 = "KonyAppUpdater";	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r3.<init>();	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r4 = "";	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r1 = r1.getMessage();	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r1 = r3.append(r1);	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        android.util.Log.d(r2, r1);	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        goto L_0x0108;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
    L_0x012b:
        r0 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        if (r0 == 0) goto L_0x0136;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
    L_0x012f:
        r0 = "KonyAppUpdater";	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r1 = "Download failed";	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        android.util.Log.d(r0, r1);	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
    L_0x0136:
        r0 = f37e;	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        r6.m49a(r0);	 Catch:{ IOException -> 0x0088, all -> 0x00aa }
        goto L_0x007c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.android.h.e():void");
    }

    public final void m69f() {
        try {
            File[] listFiles = new File(this.f40h.getCacheDir(), this.f44l).listFiles(new C0137j(this));
            for (int i = 0; i < listFiles.length; i++) {
                String name = listFiles[i].getName();
                if (listFiles[i].isDirectory()) {
                    File file = new File(this.f40h.getFilesDir(), name);
                    file.mkdir();
                    m54a(file, name);
                    File[] listFiles2 = listFiles[i].listFiles(new C0138k(this));
                    for (File a : listFiles2) {
                        C0135h.m53a(a, file);
                    }
                } else {
                    C0135h.m53a(listFiles[i], this.f40h.getFilesDir());
                }
            }
            m49a(f34b);
        } catch (IOException e) {
            if (KonyMain.f3657e) {
                Log.d("KonyAppUpdater", BuildConfig.FLAVOR + e.getMessage());
            }
            m49a(f38f);
        }
    }
}
