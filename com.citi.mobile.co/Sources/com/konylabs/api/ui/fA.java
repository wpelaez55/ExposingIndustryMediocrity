package com.konylabs.api.ui;

import com.konylabs.android.KonyMain;

final class fA implements Runnable {
    private /* synthetic */ LuaWidget f1383a;

    fA(fv fvVar, LuaWidget luaWidget) {
        this.f1383a = luaWidget;
    }

    public final void run() {
        if (KonyMain.getActContext() != null) {
            this.f1383a.setFocus();
        }
    }
}
