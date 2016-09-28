package com.konylabs.vm;

import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;

public class LuaError extends RuntimeException {
    private int f1790a;
    private String f1791b;
    private String f1792c;

    public LuaError(int i, String str, String str2) {
        this.f1790a = i;
        this.f1792c = str;
        if (KonyMain.m4056B()) {
            str2 = str2 + m1640a();
        }
        this.f1791b = str2;
    }

    public LuaError(String str, int i) {
        this.f1790a = i;
        if (KonyMain.m4056B()) {
            str = str + m1640a();
        }
        this.f1791b = str;
    }

    private static String m1640a() {
        String str = BuildConfig.FLAVOR;
        if (C0241e.f1819n == null) {
            return str;
        }
        str = str + " Line : " + C0241e.f1820o;
        return str + " File: " + C0241e.f1819n.f1833m;
    }

    public int getErrorCode() {
        return this.f1790a;
    }

    public String getErrorMessage() {
        return this.f1791b;
    }

    public String getErrorName() {
        return this.f1792c;
    }

    public String getMessage() {
        return "Error Code: " + this.f1790a + " Error Name: " + this.f1792c + " Message: " + this.f1791b;
    }

    public String toString() {
        return getMessage();
    }
}
