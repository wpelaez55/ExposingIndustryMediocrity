package com.konylabs.api.ui;

import com.konylabs.vm.LuaTable;

final class eV implements Runnable {
    final /* synthetic */ LuaWidget f1270a;
    final /* synthetic */ eO f1271b;
    private /* synthetic */ Object f1272c;

    eV(eO eOVar, LuaWidget luaWidget, Object obj) {
        this.f1271b = eOVar;
        this.f1270a = luaWidget;
        this.f1272c = obj;
    }

    public final void run() {
        int b = this.f1271b.m3947b(this.f1270a);
        if (b != -1) {
            this.f1271b.L.add(Integer.valueOf(b));
        }
        this.f1270a.setAnimationNow((LuaTable) this.f1272c, new eW(this));
    }
}
