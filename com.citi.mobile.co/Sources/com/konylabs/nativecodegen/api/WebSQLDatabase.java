package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0348Q;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class WebSQLDatabase {
    private static Library f1762a;
    private static HashMap f1763b;

    private WebSQLDatabase() {
    }

    public static void changeversion(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WebSQLDatabaseLibNative", "Executing WebSQLDatabase.changeversion()");
        }
        f1762a.execute(((Integer) f1763b.get("changeversion")).intValue(), objArr);
    }

    public static Object executesql(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WebSQLDatabaseLibNative", "Executing WebSQLDatabase.executesql()");
        }
        Object[] execute = f1762a.execute(((Integer) f1763b.get("executesql")).intValue(), objArr);
        return (execute == null || execute.length <= 0) ? null : execute[0];
    }

    public static void initialize() {
        if (f1762a == null) {
            Library c0348q = new C0348Q();
            f1762a = c0348q;
            f1763b = cr.m2202a(c0348q);
        }
    }

    public static Object opendatabase(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WebSQLDatabaseLibNative", "Executing WebSQLDatabase.opendatabase()");
        }
        Object[] execute = f1762a.execute(((Integer) f1763b.get("opendatabase")).intValue(), objArr);
        return (execute == null || execute.length <= 0) ? null : execute[0];
    }

    public static Object opendatabasesync(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WebSQLDatabaseLibNative", "Executing WebSQLDatabase.opendatabase()");
        }
        Object[] execute = f1762a.execute(((Integer) f1763b.get("opendatabasesync")).intValue(), objArr);
        return (execute == null || execute.length <= 0) ? null : execute[0];
    }

    public static void readtransaction(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WebSQLDatabaseLibNative", "Executing WebSQLDatabase.readtransaction()");
        }
        f1762a.execute(((Integer) f1763b.get("readtransaction")).intValue(), objArr);
    }

    public static Object sqlresultsetrowitem(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WebSQLDatabaseLibNative", "Executing WebSQLDatabase.sqlresultsetrowitem()");
        }
        Object[] execute = f1762a.execute(((Integer) f1763b.get("sqlresultsetrowitem")).intValue(), objArr);
        return (execute == null || execute.length <= 0) ? null : execute[0];
    }

    public static void transaction(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WebSQLDatabaseLibNative", "Executing WebSQLDatabase.transaction()");
        }
        f1762a.execute(((Integer) f1763b.get("transaction")).intValue(), objArr);
    }
}
