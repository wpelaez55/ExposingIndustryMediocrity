package com.konylabs.api.ui;

final class ha implements Runnable {
    private /* synthetic */ LuaWidget f1514a;
    private /* synthetic */ gZ f1515b;

    ha(gZ gZVar, LuaWidget luaWidget) {
        this.f1515b = gZVar;
        this.f1514a = luaWidget;
    }

    public final void run() {
        this.f1515b.g.m138c(this.f1514a.getWidget());
    }
}
