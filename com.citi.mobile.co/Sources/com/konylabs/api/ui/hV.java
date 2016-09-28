package com.konylabs.api.ui;

final class hV implements Runnable {
    private /* synthetic */ String f1501a;
    private /* synthetic */ Object f1502b;
    private /* synthetic */ LuaWidget f1503c;

    hV(LuaWidget luaWidget, String str, Object obj) {
        this.f1503c = luaWidget;
        this.f1501a = str;
        this.f1502b = obj;
    }

    public final void run() {
        LuaWidget.m3934a(this.f1503c, this.f1501a, this.f1502b);
    }
}
