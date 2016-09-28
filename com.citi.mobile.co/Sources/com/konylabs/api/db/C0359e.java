package com.konylabs.api.db;

import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import com.konylabs.android.KonyMain;

/* renamed from: com.konylabs.api.db.e */
public final class C0359e implements IKonySQLStatement {
    private SQLiteStatement f2420a;

    public C0359e(SQLiteStatement sQLiteStatement) {
        this.f2420a = null;
        this.f2420a = sQLiteStatement;
    }

    public final void bindObjectToProgram(int i, Object obj) {
        DatabaseUtils.bindObjectToProgram(this.f2420a, i, obj);
    }

    public final long executeInsert() {
        try {
            return this.f2420a.executeInsert();
        } catch (SQLException e) {
            throw new C0358d(e);
        }
    }

    public final int executeUpdateDelete(IKonySQLDatabase iKonySQLDatabase, String str, Object[] objArr) {
        try {
            if (KonyMain.f3656d >= 11) {
                if (objArr != null) {
                    int length = objArr.length;
                    for (int i = 0; i < length; i++) {
                        bindObjectToProgram(i + 1, objArr[i]);
                    }
                }
                return this.f2420a.executeUpdateDelete();
            }
            if (objArr != null) {
                iKonySQLDatabase.execSQL(str, objArr);
            } else {
                iKonySQLDatabase.execSQL(str);
            }
            return iKonySQLDatabase.getLastChangeCount();
        } catch (SQLException e) {
            throw new C0358d(e);
        }
    }
}
