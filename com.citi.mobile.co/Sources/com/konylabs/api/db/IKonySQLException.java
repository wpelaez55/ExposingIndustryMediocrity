package com.konylabs.api.db;

public abstract class IKonySQLException extends RuntimeException {
    public IKonySQLException(String str) {
        super(str);
    }

    public String getMessage() {
        return super.getMessage();
    }

    public void printStackTrace() {
        super.printStackTrace();
    }

    public String toString() {
        return super.toString();
    }
}
