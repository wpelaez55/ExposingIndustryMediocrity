package com.konylabs.api.ui;

import android.util.Log;
import com.konylabs.android.KonyMain;

final class gf implements Runnable {
    private /* synthetic */ String f1471a;

    gf(String str) {
        this.f1471a = str;
    }

    public final void run() {
        if (KonyMain.f3657e) {
            Log.d("LuaHybridForm", "************showTCForm(" + this.f1471a + ")");
        }
        gb.f4577P.m4658b("javascript: try { konyhybrid.showdynamicform('" + this.f1471a + "') } catch(e){}");
    }
}
