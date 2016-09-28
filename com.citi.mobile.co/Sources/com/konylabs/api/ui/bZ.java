package com.konylabs.api.ui;

import com.konylabs.vm.LuaTable;

final class bZ implements Runnable {
    private /* synthetic */ LuaTable f818a;
    private /* synthetic */ bY f819b;

    bZ(bY bYVar, LuaTable luaTable) {
        this.f819b = bYVar;
        this.f818a = luaTable;
    }

    public final void run() {
        if (this.f819b.f816a.f796b != null) {
            this.f819b.f816a.f796b.m1023a(this.f818a);
        }
    }
}
