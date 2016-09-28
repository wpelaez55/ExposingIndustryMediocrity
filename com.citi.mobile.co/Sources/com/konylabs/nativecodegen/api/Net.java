package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0369u;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaTable;
import java.util.HashMap;
import ny0k.cr;

public class Net {
    private static String f1729a;
    private static Library f1730b;
    private static HashMap f1731c;

    static {
        f1729a = "NetworkLibNative";
    }

    private Net() {
    }

    public static void cancel(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1729a, "Executing Net.cancel()");
        }
        f1730b.execute(((Integer) f1731c.get("cancel")).intValue(), objArr);
    }

    public static void initialize() {
        if (f1730b == null) {
            Library c0369u = new C0369u(KonyMain.getAppContext());
            f1730b = c0369u;
            f1731c = cr.m2202a(c0369u);
        }
    }

    public static LuaTable invokeService(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1729a, "Executing Net.invokeService()");
        }
        return (LuaTable) f1730b.execute(((Integer) f1731c.get("invokeservice")).intValue(), objArr)[0];
    }

    public static Object invokeServiceAsync(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1729a, "Executing Net.invokeServiceAsync()");
        }
        return f1730b.execute(((Integer) f1731c.get("invokeserviceasync")).intValue(), objArr)[0];
    }
}
