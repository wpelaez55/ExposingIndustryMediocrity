package com.konylabs.api.ui;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;

final class go implements Runnable {
    private /* synthetic */ LuaTable f1473a;
    private /* synthetic */ String f1474b;

    go(LuaTable luaTable, String str) {
        this.f1473a = luaTable;
        this.f1474b = str;
    }

    public final void run() {
        String str = BuildConfig.FLAVOR;
        if (this.f1473a != null) {
            str = C0216r.m1557a(this.f1473a, 0);
        }
        if (KonyMain.f3657e) {
            Log.d("LuaHybridForm", "executeFunctionInTCContext()= name=" + this.f1474b + " params=" + str);
        }
        gb.f4577P.m4658b("javascript: try { konyhybrid.executefunctionintccontext('" + this.f1474b + "','" + str + "') } catch(e){}");
    }
}
