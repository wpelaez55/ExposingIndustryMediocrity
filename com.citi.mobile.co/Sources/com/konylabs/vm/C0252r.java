package com.konylabs.vm;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.IOException;

/* renamed from: com.konylabs.vm.r */
public final class C0252r {
    private static int f1880a;

    static {
        f1880a = -1;
    }

    public static int m1765a(int i, int i2, int i3) {
        return (i >>> i2) & ((f1880a << (i3 - i2)) ^ -1);
    }

    public static LuaError m1766a(Throwable th) {
        int i = 100;
        if (KonyMain.f3657e) {
            Log.d("VM Util", BuildConfig.FLAVOR + th.getMessage(), th);
        }
        String str = "Unknown Error";
        if (th instanceof OutOfMemoryError) {
            i = 102;
            str = "possibly bytecode corrupted";
        } else if (th instanceof NullPointerException) {
            i = 103;
            str = "performing operation on a reference which doesnt exist  - null error";
        } else if (th instanceof ClassCastException) {
            if (KonyMain.f3657e) {
                Log.d("VM Util", BuildConfig.FLAVOR + th.getMessage());
            }
            i = 104;
            str = "bad type of argumnets, expected a different type of argument - casting error";
        } else if (th instanceof IOException) {
            i = 105;
            str = "i/o error";
        } else if (th instanceof IndexOutOfBoundsException) {
            i = 106;
            str = "index out of range";
        } else if (th instanceof NegativeArraySizeException) {
            i = 107;
            str = "negative index error";
        } else if (th instanceof LuaError) {
            return (LuaError) th;
        } else {
            if (th instanceof RuntimeException) {
                str = "unknown system error";
            }
        }
        return new LuaError(str, i);
    }

    public static boolean m1767a(Object obj) {
        boolean z = true;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() != 0.0d;
        } else {
            if (!(obj instanceof String)) {
                return !(obj instanceof LuaNil) ? obj instanceof Boolean ? ((Boolean) obj).booleanValue() : obj instanceof Function : false;
            } else {
                String str = (String) obj;
                if (str == null || str.length() == 0) {
                    z = false;
                }
                return z;
            }
        }
    }
}
