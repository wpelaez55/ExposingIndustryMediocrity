package com.konylabs.api.db;

public interface IKonySQLCursor {
    void close();

    Object getBlob(int i);

    int getColumnCount();

    int getColumnIndex(String str);

    String getColumnName(int i);

    int getCount();

    Object getFloat(int i);

    Object getLong(int i);

    String getString(int i);

    boolean isBlob(int i);

    boolean isFloat(int i);

    boolean isInstanceOfAbstractWindowedCursor();

    boolean isLong(int i);

    boolean isNull(int i);

    boolean isString(int i);

    boolean moveToFirst();

    boolean moveToNext();
}
