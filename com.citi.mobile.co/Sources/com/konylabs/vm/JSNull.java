package com.konylabs.vm;

public class JSNull {
    public static JSNull jsNull;

    static {
        jsNull = new JSNull();
    }

    public boolean equals(Object obj) {
        return obj == jsNull;
    }

    public String toString() {
        return "null";
    }
}
