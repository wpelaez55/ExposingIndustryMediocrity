package com.konylabs.vm;

import com.rsa.mobilesdk.sdk.BuildConfig;

public class KonyJSException extends Exception {
    public int columnPos;
    public String fileName;
    public int lineNumber;
    public String message;
    public String sourceLine;

    public KonyJSException(String str) {
        super(str);
        this.fileName = null;
        this.message = null;
        this.sourceLine = null;
        this.lineNumber = -1;
        this.columnPos = -1;
        this.message = str;
    }

    public KonyJSException(String str, String str2, String str3, String str4, int i, int i2) {
        super(str);
        this.fileName = null;
        this.message = null;
        this.sourceLine = null;
        this.lineNumber = -1;
        this.columnPos = -1;
        this.fileName = str2;
        this.sourceLine = str3;
        this.message = str4;
        this.lineNumber = i;
        this.columnPos = i2;
    }

    public String toString() {
        String str = BuildConfig.FLAVOR;
        if (this.fileName != null) {
            str = str + this.fileName + " : ";
        }
        if (this.lineNumber != -1) {
            str = str + this.lineNumber + "\n";
        }
        if (this.sourceLine != null) {
            str = str + this.sourceLine + "\n";
        }
        return this.message != null ? str + this.message : str;
    }
}
