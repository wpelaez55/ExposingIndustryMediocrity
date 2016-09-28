package com.konylabs.api.db;

public interface IKonySQLStatement {
    void bindObjectToProgram(int i, Object obj);

    long executeInsert();

    int executeUpdateDelete(IKonySQLDatabase iKonySQLDatabase, String str, Object[] objArr);
}
