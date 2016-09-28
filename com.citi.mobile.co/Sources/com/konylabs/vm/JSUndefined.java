package com.konylabs.vm;

public class JSUndefined {
    public static JSUndefined jsUndefined;

    static {
        jsUndefined = new JSUndefined();
    }

    public boolean equals(Object obj) {
        return obj == jsUndefined;
    }

    public String toString() {
        return "undefined";
    }
}
