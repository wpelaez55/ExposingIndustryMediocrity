package com.konylabs.api.db;

public interface IKonySQLDatabase {
    void beginTransaction();

    void close();

    IKonySQLStatement compileStatement(String str);

    void endTransaction();

    void execSQL(String str);

    void execSQL(String str, Object[] objArr);

    int getLastChangeCount();

    int getVersion();

    IKonySQLDatabase openDatabase(String str, String str2, boolean z);

    IKonySQLDatabase openOrCreateDatabase(String str, String str2);

    IKonySQLCursor rawQuery(String str, String[] strArr);

    void setTransactionSuccessful();
}
