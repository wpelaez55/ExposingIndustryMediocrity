package com.konylabs.api.ui;

import android.util.Log;
import com.konylabs.android.KonyMain;

final class ge implements Runnable {
    private /* synthetic */ String f1470a;

    ge(String str) {
        this.f1470a = str;
    }

    public final void run() {
        if (KonyMain.f3657e) {
            Log.d("LuaHybridForm", "************showTCForm() Loading URL for form=" + this.f1470a);
        }
        gb.f4577P.m4663f();
    }
}
