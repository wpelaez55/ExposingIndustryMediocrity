package com.konylabs.api.ui;

import android.util.Log;
import com.konylabs.android.KonyMain;

final class gd implements Runnable {
    private /* synthetic */ String f1469a;

    gd(String str) {
        this.f1469a = str;
    }

    public final void run() {
        if (KonyMain.f3657e) {
            Log.d("LuaHybridForm", "************showSPAForm(" + this.f1469a + ")******************");
        }
        gb.f4576D.m4658b("javascript: try { konyhybrid.showspaform('" + this.f1469a + "') } catch(e){}");
    }
}
