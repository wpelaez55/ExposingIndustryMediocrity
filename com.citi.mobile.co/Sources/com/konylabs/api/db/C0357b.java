package com.konylabs.api.db;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.konylabs.android.KonyMain;
import java.lang.reflect.Method;

/* renamed from: com.konylabs.api.db.b */
public final class C0357b implements IKonySQLDatabase {
    private static C0162c f2417b;
    private SQLiteDatabase f2418a;

    static {
        f2417b = null;
        if (KonyMain.f3656d >= 11) {
            f2417b = new C0162c();
        }
    }

    public C0357b() {
        this.f2418a = null;
    }

    public final void beginTransaction() {
        this.f2418a.beginTransaction();
    }

    public final void close() {
        if (this.f2418a != null) {
            this.f2418a.close();
            this.f2418a = null;
        }
    }

    public final IKonySQLStatement compileStatement(String str) {
        try {
            return new C0359e(this.f2418a.compileStatement(str));
        } catch (SQLException e) {
            throw new C0358d(e);
        }
    }

    public final void endTransaction() {
        this.f2418a.endTransaction();
    }

    public final void execSQL(String str) {
        try {
            this.f2418a.execSQL(str);
        } catch (SQLException e) {
            throw new C0358d(e);
        }
    }

    public final void execSQL(String str, Object[] objArr) {
        try {
            this.f2418a.execSQL(str, objArr);
        } catch (SQLException e) {
            throw new C0358d(e);
        }
    }

    public final int getLastChangeCount() {
        if (KonyMain.f3656d < 11) {
            try {
                Method declaredMethod = this.f2418a.getClass().getDeclaredMethod("lastChangeCount", null);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(this.f2418a, null)).intValue();
            } catch (Exception e) {
                Log.d("KonyWebSQLDatabase.ExecuteSql", "api level= " + KonyMain.f3656d + " lastChangeCount api invocation failed ");
                e.printStackTrace();
            }
        }
        return 0;
    }

    public final int getVersion() {
        return this.f2418a.getVersion();
    }

    public final IKonySQLDatabase openDatabase(String str, String str2, boolean z) {
        String path = KonyMain.getAppContext().getDatabasePath(str).getPath();
        if (z) {
            try {
                this.f2418a = SQLiteDatabase.openDatabase(path, null, 1);
            } catch (SQLException e) {
                throw new C0358d(e);
            }
        }
        this.f2418a = SQLiteDatabase.openDatabase(path, null, 0);
        return this;
    }

    public final IKonySQLDatabase openOrCreateDatabase(String str, String str2) {
        try {
            if (KonyMain.f3656d >= 11) {
                this.f2418a = KonyMain.getAppContext().openOrCreateDatabase(str, 0, null, f2417b);
            } else {
                this.f2418a = KonyMain.getAppContext().openOrCreateDatabase(str, 0, null);
            }
            return this;
        } catch (SQLException e) {
            throw new C0358d(e);
        }
    }

    public final IKonySQLCursor rawQuery(String str, String[] strArr) {
        return new C0356a(this.f2418a.rawQuery(str, strArr));
    }

    public final void setTransactionSuccessful() {
        this.f2418a.setTransactionSuccessful();
    }
}
