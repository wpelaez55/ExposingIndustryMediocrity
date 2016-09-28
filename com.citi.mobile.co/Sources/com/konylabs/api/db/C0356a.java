package com.konylabs.api.db;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;

/* renamed from: com.konylabs.api.db.a */
public final class C0356a implements IKonySQLCursor {
    private Cursor f2415a;
    private boolean f2416b;

    public C0356a(Cursor cursor) {
        this.f2416b = true;
        this.f2415a = cursor;
        if (!(cursor instanceof AbstractWindowedCursor)) {
            this.f2416b = false;
        }
    }

    public final void close() {
        this.f2415a.close();
    }

    public final Object getBlob(int i) {
        return this.f2415a.getBlob(i);
    }

    public final int getColumnCount() {
        return this.f2415a.getColumnCount();
    }

    public final int getColumnIndex(String str) {
        return this.f2415a.getColumnIndex(str);
    }

    public final String getColumnName(int i) {
        return this.f2415a.getColumnName(i);
    }

    public final int getCount() {
        return this.f2415a.getCount();
    }

    public final Object getFloat(int i) {
        Object string = this.f2415a.getString(i);
        try {
            string = Double.valueOf(Double.parseDouble(string));
        } catch (Exception e) {
        }
        return string;
    }

    public final Object getLong(int i) {
        Object string = this.f2415a.getString(i);
        try {
            string = Double.valueOf(Double.parseDouble(string));
        } catch (Exception e) {
        }
        return string;
    }

    public final String getString(int i) {
        return this.f2415a.getString(i);
    }

    public final boolean isBlob(int i) {
        return ((AbstractWindowedCursor) this.f2415a).isBlob(i);
    }

    public final boolean isFloat(int i) {
        return ((AbstractWindowedCursor) this.f2415a).isFloat(i);
    }

    public final boolean isInstanceOfAbstractWindowedCursor() {
        return this.f2416b;
    }

    public final boolean isLong(int i) {
        return ((AbstractWindowedCursor) this.f2415a).isLong(i);
    }

    public final boolean isNull(int i) {
        return ((AbstractWindowedCursor) this.f2415a).isNull(i);
    }

    public final boolean isString(int i) {
        return ((AbstractWindowedCursor) this.f2415a).isString(i);
    }

    public final boolean moveToFirst() {
        return this.f2415a.moveToNext();
    }

    public final boolean moveToNext() {
        return this.f2415a.moveToNext();
    }
}
