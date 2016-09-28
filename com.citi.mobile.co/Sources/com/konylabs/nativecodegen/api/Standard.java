package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0339C;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.HashMap;
import ny0k.cr;

public class Standard {
    private static Library f1746a;
    private static HashMap f1747b;

    public static void appReset() {
        if (KonyMain.f3657e) {
            Log.d("StandardNative", "Executing Standard.appReset()");
        }
        f1746a.execute(((Integer) f1747b.get("appreset")).intValue(), null);
    }

    public static void assertOp(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StandardNative", "Executing Standard.assertOp()");
        }
        f1746a.execute(((Integer) f1747b.get("assert")).intValue(), objArr);
    }

    public static final Object convertToBase64(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StandardNative", "Executing Standard.convertToBase64()");
        }
        return f1746a.execute(((Integer) f1747b.get("converttobase64")).intValue(), objArr)[0];
    }

    public static void executeJS(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StandardNative", "Executing Standard.executeJS()");
        }
        f1746a.execute(((Integer) f1747b.get("executeJS")).intValue(), objArr);
    }

    public static void exit() {
        if (KonyMain.f3657e) {
            Log.d("StandardNative", "Executing Standard.exit()");
        }
        f1746a.execute(((Integer) f1747b.get("exit")).intValue(), null);
    }

    public static LuaTable getMetaTable(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StandardNative", "Executing Standard.getMetaTable()");
        }
        return (LuaTable) f1746a.execute(((Integer) f1747b.get("getmetatable")).intValue(), objArr)[0];
    }

    public static void initialize() {
        if (f1746a == null) {
            Library c0339c = new C0339C(KonyMain.getAppContext());
            f1746a = c0339c;
            f1747b = cr.m2202a(c0339c);
        }
    }

    public static void performUpgrade(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StandardNative", "Executing Standard.performUpgrade()");
        }
        f1746a.execute(((Integer) f1747b.get("performupgrade")).intValue(), objArr);
    }

    public static void print(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StandardNative", "Executing Standard.print()");
        }
        f1746a.execute(((Integer) f1747b.get("print")).intValue(), objArr);
    }

    public static Object readFromBase64(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StandardNative", "Executing Standard.readFromBase64()");
        }
        Object[] execute = f1746a.execute(((Integer) f1747b.get("readfrombase64")).intValue(), objArr);
        return execute != null ? execute[0] : LuaNil.nil;
    }

    public static void registerIdleTimeout(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StandardNative", "Executing Standard.registerIdleTimeout()");
        }
        f1746a.execute(((Integer) f1747b.get("registerforidletimeout")).intValue(), objArr);
    }

    public static void setMetaTable(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StandardNative", "Executing Standard.setMetaTable()");
        }
        f1746a.execute(((Integer) f1747b.get("setmetatable")).intValue(), objArr);
    }

    public static String type(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StandardNative", "Executing Standard.type()");
        }
        return (String) f1746a.execute(((Integer) f1747b.get("type")).intValue(), objArr)[0];
    }

    public static Object[] unpack(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StandardNative", "Executing Standard.unpack()");
        }
        return f1746a.execute(((Integer) f1747b.get("unpack")).intValue(), objArr);
    }

    public static void unregisterIdleTimeout() {
        if (KonyMain.f3657e) {
            Log.d("StandardNative", "Executing Standard.unregisterIdleTimeout()");
        }
        f1746a.execute(((Integer) f1747b.get("unregisterforidletimeout")).intValue(), null);
    }
}
