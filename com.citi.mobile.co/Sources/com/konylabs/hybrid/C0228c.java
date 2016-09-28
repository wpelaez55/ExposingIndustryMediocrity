package com.konylabs.hybrid;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.hP;
import com.konylabs.vm.LuaTable;

/* renamed from: com.konylabs.hybrid.c */
final class C0228c implements Runnable {
    private /* synthetic */ LuaTable f1670a;
    private /* synthetic */ String f1671b;
    private /* synthetic */ hP f1672c;

    C0228c(LuaTable luaTable, String str, hP hPVar) {
        this.f1670a = luaTable;
        this.f1671b = str;
        this.f1672c = hPVar;
    }

    public final void run() {
        String a = C0227b.m1609a(this.f1670a);
        if (KonyMain.f3657e) {
            Log.d("KonyHybridLuaInterface", "executeJSFunction(str,luatable) function=" + this.f1671b + " jsonString=" + a);
        }
        this.f1672c.m4658b("javascript:" + this.f1671b + "(" + a + ")");
    }
}
