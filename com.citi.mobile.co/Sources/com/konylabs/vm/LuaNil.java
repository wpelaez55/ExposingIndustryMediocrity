package com.konylabs.vm;

import com.konylabs.android.KonyMain;
import java.io.Serializable;

public class LuaNil implements Serializable {
    private static String f1793a;
    public static LuaNil nil;

    static {
        f1793a = "nil";
        nil = new LuaNil();
        if (KonyMain.m4057C()) {
            f1793a = "null";
        }
    }

    public boolean equals(Object obj) {
        return obj == nil;
    }

    public int hashCode() {
        return "nil".hashCode();
    }

    public String toString() {
        return f1793a;
    }
}
