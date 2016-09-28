package com.konylabs.api.ui;

import com.konylabs.vm.LuaTable;

final class fx implements Runnable {
    final /* synthetic */ LuaWidget f1442a;
    final /* synthetic */ fv f1443b;
    private /* synthetic */ Object f1444c;

    fx(fv fvVar, LuaWidget luaWidget, Object obj) {
        this.f1443b = fvVar;
        this.f1442a = luaWidget;
        this.f1444c = obj;
    }

    public final void run() {
        int b = this.f1443b.m3947b(this.f1442a);
        if (b != -1) {
            this.f1443b.L.add(Integer.valueOf(b));
        }
        this.f1442a.setAnimationNow((LuaTable) this.f1444c, new fy(this));
    }
}
