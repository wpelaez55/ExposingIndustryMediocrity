package com.konylabs.api.db;

import android.database.SQLException;

/* renamed from: com.konylabs.api.db.d */
public final class C0358d extends IKonySQLException {
    private SQLException f2419a;

    public C0358d(SQLException sQLException) {
        this.f2419a = null;
        this.f2419a = sQLException;
    }

    public C0358d(String str) {
        super(str);
        this.f2419a = null;
    }

    public final String getMessage() {
        return this.f2419a != null ? this.f2419a.getMessage() : super.getMessage();
    }

    public final void printStackTrace() {
        if (this.f2419a != null) {
            this.f2419a.printStackTrace();
        } else {
            super.printStackTrace();
        }
    }

    public final String toString() {
        return this.f2419a != null ? this.f2419a.toString() : super.toString();
    }
}
