package com.konylabs.api.ui;

final class eZ implements Runnable {
    private /* synthetic */ LuaWidget f1275a;
    private /* synthetic */ Object f1276b;
    private /* synthetic */ int f1277c;
    private /* synthetic */ Object f1278d;
    private /* synthetic */ eO f1279e;

    eZ(eO eOVar, LuaWidget luaWidget, Object obj, int i, Object obj2) {
        this.f1279e = eOVar;
        this.f1275a = luaWidget;
        this.f1276b = obj;
        this.f1277c = i;
        this.f1278d = obj2;
    }

    public final void run() {
        this.f1279e.m4205a(this.f1275a, this.f1276b, this.f1277c, this.f1278d);
    }
}
