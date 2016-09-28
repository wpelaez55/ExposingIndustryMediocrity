package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0367p;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaTable;
import java.util.HashMap;
import ny0k.cr;

public class JSON {
    private static Library f1720a;
    private static HashMap f1721b;

    private JSON() {
    }

    public static void initialize() {
        if (f1720a == null) {
            Library c0367p = new C0367p();
            f1720a = c0367p;
            f1721b = cr.m2202a(c0367p);
        }
    }

    public static LuaTable parse(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("JSONLibNative", "Executing JSON.parse()");
        }
        return (LuaTable) f1720a.execute(((Integer) f1721b.get("parse")).intValue(), objArr)[0];
    }
}
