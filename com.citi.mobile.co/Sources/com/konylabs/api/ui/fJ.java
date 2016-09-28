package com.konylabs.api.ui;

final class fJ implements Runnable {
    private /* synthetic */ LuaWidget f1393a;
    private /* synthetic */ Object f1394b;
    private /* synthetic */ int f1395c;
    private /* synthetic */ Object f1396d;
    private /* synthetic */ fv f1397e;

    fJ(fv fvVar, LuaWidget luaWidget, Object obj, int i, Object obj2) {
        this.f1397e = fvVar;
        this.f1393a = luaWidget;
        this.f1394b = obj;
        this.f1395c = i;
        this.f1396d = obj2;
    }

    public final void run() {
        this.f1397e.m4434a(this.f1393a, this.f1394b, this.f1395c, this.f1396d);
    }
}
