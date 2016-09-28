package com.konylabs.api.db;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.JSNull;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.LinkedHashMap;

/* renamed from: com.konylabs.api.db.f */
public final class C0163f implements Serializable {
    public static Hashtable f129a;
    static int f130c;
    static int f131d;
    private static String f132e;
    private static C0166j f133h;
    private static LinkedHashMap f134i;
    public boolean f135b;
    private String f136f;
    private IKonySQLDatabase f137g;
    private String f138j;

    static {
        f132e = "KonyWebSQLDatabase";
        f129a = new Hashtable();
        f133h = null;
        f134i = null;
        f134i = new LinkedHashMap();
        f133h = new C0166j();
        f130c = 0;
        f131d = 0;
    }

    public C0163f(Object[] objArr) {
        this.f136f = null;
        this.f137g = null;
        this.f135b = false;
        this.f138j = null;
        this.f136f = (String) objArr[0];
        if (!(objArr.length <= 4 || objArr[4] == LuaNil.nil || objArr[4] == null)) {
            this.f138j = objArr[4].toString();
        }
        try {
            this.f137g = m76c();
            this.f137g.openOrCreateDatabase(this.f136f, this.f138j);
            this.f137g.close();
        } catch (IKonySQLException e) {
            if (e.getMessage().contains("lock")) {
                Log.d("openOrCreateDatabase", "Ignoring DB locked Exception = " + e.getMessage());
                return;
            }
            throw e;
        } catch (Exception e2) {
            if (KonyMain.f3657e) {
                e2.printStackTrace();
            }
            throw new C0358d(e2.toString());
        }
    }

    static /* synthetic */ IKonySQLDatabase m70a(C0163f c0163f, boolean z) {
        if (c0163f.f137g == null) {
            c0163f.f137g = c0163f.m76c();
        }
        KonyMain.getAppContext().getDatabasePath(c0163f.f136f).getPath();
        c0163f.f137g.openDatabase(c0163f.f136f, c0163f.f138j, z);
        return c0163f.f137g;
    }

    private static String m71a(String str) {
        int i = 0;
        String toUpperCase = str.toUpperCase();
        String[] strArr = new String[]{"CHARACTER", "VARCHAR", "VARYING CHARACTER", "NCHAR", "NATIVE CHARACTER", "NVARCHAR", "TEXT", "CLOB", "DATE", "DATETIME"};
        String[] strArr2 = new String[]{"REAL", "DOUBLE", "DOUBLE PRECISION", "FLOAT", "DECIMAL"};
        for (CharSequence contains : new String[]{"INT", "INTEGER", "TINYINT", "SMALLINT", "MEDIUMINT", "BIGINT", "UNSIGNED BIG INT", "INT2", "INT8", "NUMERIC", "BOOLEAN"}) {
            if (toUpperCase.contains(contains)) {
                return "INTEGER";
            }
        }
        for (CharSequence contains2 : strArr) {
            if (toUpperCase.contains(contains2)) {
                return "TEXT";
            }
        }
        int length = strArr2.length;
        while (i < length) {
            if (toUpperCase.contains(strArr2[i])) {
                return "REAL";
            }
            i++;
        }
        return toUpperCase;
    }

    public static void m72a() {
    }

    private void m73a(IKonySQLDatabase iKonySQLDatabase, String str) {
        IKonySQLCursor iKonySQLCursor = null;
        String toLowerCase = str.toLowerCase();
        toLowerCase = toLowerCase.substring(toLowerCase.indexOf(" from ") + " from ".length()).trim();
        int indexOf = toLowerCase.indexOf(" ");
        if (indexOf > 0) {
            toLowerCase = toLowerCase.substring(0, indexOf).trim();
        }
        f134i.clear();
        try {
            iKonySQLCursor = iKonySQLDatabase.rawQuery("PRAGMA table_info(" + toLowerCase + ")", null);
            indexOf = iKonySQLCursor.getColumnIndex("name");
            int columnIndex = iKonySQLCursor.getColumnIndex("type");
            while (iKonySQLCursor.moveToNext()) {
                f134i.put(iKonySQLCursor.getString(indexOf), C0163f.m71a(iKonySQLCursor.getString(columnIndex)));
            }
            iKonySQLCursor.close();
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                Log.d(f132e, "Exception in PRAGMA table info fetch, TableName = " + toLowerCase);
                e.printStackTrace();
            }
            if (iKonySQLCursor != null) {
                iKonySQLCursor.close();
            }
        }
    }

    public static Object[] m74a(Object[] objArr) {
        LuaTable a = ((C0433g) objArr[1]).m3921a(((Double) objArr[2]).intValue());
        return new Object[]{a};
    }

    private IKonySQLDatabase m76c() {
        IKonySQLDatabase iKonySQLDatabase;
        if (this.f138j != null) {
            try {
                Class cls = Class.forName("com.konylabs.api.db.sqlcipher.KonySQLDatabase");
                if (cls != null) {
                    iKonySQLDatabase = (IKonySQLDatabase) cls.newInstance();
                } else {
                    if (KonyMain.f3657e) {
                        Log.d(f132e, "***************** Database Encryption API's Not Available ******************");
                    }
                    iKonySQLDatabase = null;
                }
            } catch (Exception e) {
                if (KonyMain.f3657e) {
                    Log.d(f132e, "******************* Database Encryption API's Not Available **********************");
                    e.printStackTrace();
                }
            }
            return iKonySQLDatabase != null ? new C0357b() : iKonySQLDatabase;
        }
        iKonySQLDatabase = null;
        if (iKonySQLDatabase != null) {
        }
    }

    public final C0433g m77a(IKonySQLDatabase iKonySQLDatabase, Object[] objArr, IKonySQLStatement iKonySQLStatement) {
        Object[] objArr2;
        if (KonyMain.f3657e) {
            Log.d(f132e, "executeSQL() query=" + objArr[1].toString());
        }
        String toLowerCase = ((String) objArr[1]).toLowerCase();
        if (objArr.length <= 2 || objArr[2] == null || objArr[2] == LuaNil.nil) {
            if (KonyMain.f3657e) {
                Log.d(f132e, "argsTable empty");
            }
            objArr2 = null;
        } else {
            LuaTable luaTable = (LuaTable) objArr[2];
            int size = luaTable.list.size();
            Object[] objArr3 = new Object[size];
            for (int i = 0; i < size; i++) {
                Object elementAt = luaTable.list.elementAt(i);
                if (elementAt == LuaNil.nil) {
                    elementAt = null;
                }
                objArr3[i] = elementAt;
            }
            if (KonyMain.f3657e) {
                Log.d(f132e, "argsTable =" + ((LuaTable) objArr[2]));
            }
            objArr2 = objArr3;
        }
        LuaTable luaTable2 = new LuaTable();
        luaTable2.setTable("length", new Double(0.0d));
        C0433g c0433g = new C0433g();
        c0433g.setTable("insertId", LuaNil.nil);
        c0433g.setTable("rowsAffected", new Double(0.0d));
        c0433g.setTable("rows", luaTable2);
        int length;
        int i2;
        if (toLowerCase.startsWith("insert")) {
            if (objArr2 != null) {
                length = objArr2.length;
                for (i2 = 0; i2 < length; i2++) {
                    iKonySQLStatement.bindObjectToProgram(i2 + 1, objArr2[i2]);
                }
            }
            c0433g.setTable("insertId", new Double((double) iKonySQLStatement.executeInsert()));
            c0433g.setTable("rowsAffected", new Double(1.0d));
        } else if (toLowerCase.startsWith("select")) {
            String[] strArr;
            if (objArr2 != null) {
                String[] strArr2 = new String[objArr2.length];
                for (i2 = 0; i2 < objArr2.length; i2++) {
                    strArr2[i2] = objArr2[i2].toString();
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            IKonySQLCursor rawQuery = iKonySQLDatabase.rawQuery((String) objArr[1], strArr);
            if ((objArr.length > 3 && objArr[3] != LuaNil.nil) || this.f135b) {
                luaTable2.setTable("length", new Double((double) rawQuery.getCount()));
                c0433g.setTable("rows", luaTable2);
                luaTable2 = new LuaTable();
                if (rawQuery.moveToFirst()) {
                    Boolean bool;
                    int columnCount = rawQuery.getColumnCount();
                    Boolean valueOf = Boolean.valueOf(false);
                    if (rawQuery.isInstanceOfAbstractWindowedCursor()) {
                        bool = valueOf;
                    } else {
                        m73a(iKonySQLDatabase, (String) objArr[1]);
                        bool = Boolean.valueOf(true);
                    }
                    do {
                        LuaTable luaTable3 = new LuaTable();
                        for (length = 0; length < columnCount; length++) {
                            if (bool.booleanValue()) {
                                try {
                                    String str = (String) f134i.get(rawQuery.getColumnName(length));
                                    if (str.equalsIgnoreCase("TEXT")) {
                                        luaTable3.setTable(rawQuery.getColumnName(length), rawQuery.getString(length));
                                    } else if (str.equalsIgnoreCase("INTEGER") || str.equalsIgnoreCase("REAL")) {
                                        luaTable3.setTable(rawQuery.getColumnName(length), Double.valueOf(Double.parseDouble(rawQuery.getString(length))));
                                    } else if (str.equalsIgnoreCase("BLOB")) {
                                        luaTable3.setTable(rawQuery.getColumnName(length), rawQuery.getBlob(length));
                                    } else if (str.equalsIgnoreCase("NULL")) {
                                        luaTable3.setTable(rawQuery.getColumnName(length), JSNull.jsNull);
                                    } else {
                                        luaTable3.setTable(rawQuery.getColumnName(length), rawQuery.getString(length));
                                    }
                                } catch (Exception e) {
                                    luaTable3.setTable(rawQuery.getColumnName(length), rawQuery.getString(length));
                                }
                            } else {
                                try {
                                    if (rawQuery.isLong(length)) {
                                        luaTable3.setTable(rawQuery.getColumnName(length), rawQuery.getLong(length));
                                    } else if (rawQuery.isFloat(length)) {
                                        luaTable3.setTable(rawQuery.getColumnName(length), rawQuery.getFloat(length));
                                    } else if (rawQuery.isBlob(length)) {
                                        luaTable3.setTable(rawQuery.getColumnName(length), rawQuery.getBlob(length));
                                    } else if (rawQuery.isNull(length)) {
                                        luaTable3.setTable(rawQuery.getColumnName(length), JSNull.jsNull);
                                    } else {
                                        luaTable3.setTable(rawQuery.getColumnName(length), rawQuery.getString(length));
                                    }
                                } catch (Exception e2) {
                                    luaTable3.setTable(rawQuery.getColumnName(length), rawQuery.getString(length));
                                }
                            }
                        }
                        luaTable2.add(luaTable3);
                    } while (rawQuery.moveToNext());
                }
                c0433g.m3922a(luaTable2);
            }
            rawQuery.close();
        } else if (toLowerCase.startsWith("update") || toLowerCase.startsWith("delete")) {
            try {
                i2 = iKonySQLStatement.executeUpdateDelete(iKonySQLDatabase, (String) objArr[1], objArr2);
                c0433g.setTable("rowsAffected", Double.valueOf((double) i2));
                if (KonyMain.f3657e) {
                    Log.d("KonyWebSQLDatabase.ExecuteSql", "api level= " + KonyMain.f3656d + " updatedCount = " + i2);
                }
                return c0433g;
            } catch (Exception e3) {
                Log.d("KonyWebSQLDatabase.ExecuteSql", "api level= " + KonyMain.f3656d + " executeUpdateDelete api invocation failed ");
                e3.printStackTrace();
            }
        } else {
            if (objArr2 != null) {
                iKonySQLDatabase.execSQL((String) objArr[1], objArr2);
            } else {
                iKonySQLDatabase.execSQL((String) objArr[1]);
            }
            if (KonyMain.f3656d < 11) {
                c0433g.setTable("rowsAffected", Double.valueOf((double) iKonySQLDatabase.getLastChangeCount()));
            }
        }
        return c0433g;
    }

    public final void m78a(Object[] objArr, boolean z) {
        Object obj = (objArr.length <= 2 || objArr[2] == null || objArr[2] == LuaNil.nil) ? null : objArr[2];
        Object obj2 = (objArr.length <= 3 || objArr[3] == null || objArr[3] == LuaNil.nil) ? null : objArr[3];
        C0164h c0164h = new C0164h(this, this, objArr[1], obj, obj2, z);
        f129a.put(Double.valueOf((double) c0164h.hashCode()), c0164h);
        synchronized (f129a) {
            if (f133h.isAlive()) {
                f133h.m86a(c0164h);
            } else {
                C0166j c0166j = new C0166j();
                f133h = c0166j;
                c0166j.m86a(c0164h);
                f133h.start();
            }
        }
    }

    protected final void finalize() throws Throwable {
        if (this.f137g != null) {
            this.f137g.close();
            this.f137g = null;
        }
    }
}
