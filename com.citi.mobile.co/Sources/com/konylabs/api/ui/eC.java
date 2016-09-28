package com.konylabs.api.ui;

import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaTable;

final class eC implements Runnable {
    private /* synthetic */ LuaTable f1245a;
    private /* synthetic */ LuaTable f1246b;
    private /* synthetic */ eA f1247c;

    eC(eA eAVar, LuaTable luaTable, LuaTable luaTable2) {
        this.f1247c = eAVar;
        this.f1245a = luaTable;
        this.f1246b = luaTable2;
    }

    public final void run() {
        if (KonyMain.getActContext() != null) {
            this.f1247c.m4182a(this.f1245a, this.f1246b);
        }
    }
}
