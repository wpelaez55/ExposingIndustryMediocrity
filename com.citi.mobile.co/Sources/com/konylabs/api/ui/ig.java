package com.konylabs.api.ui;

import ny0k.cI;
import ny0k.cJ;

public final class ig extends cJ {
    private static final cI f3025d;
    private LuaWidget f3026a;
    private Object f3027b;
    private Object f3028c;

    static {
        f3025d = new cI();
    }

    private ig() {
    }

    public static ig m3353a(LuaWidget luaWidget, Object obj, Object obj2) {
        ig igVar = (ig) f3025d.m2124a();
        if (igVar == null) {
            igVar = new ig();
        }
        igVar.f3026a = luaWidget;
        igVar.f3027b = obj;
        igVar.f3028c = obj2;
        return igVar;
    }

    public final void m3354a() {
        this.f3027b = null;
        this.f3028c = null;
        this.f3026a = null;
    }

    public final void run() {
        this.f3026a.m3946a(this.f3027b, this.f3028c);
        f3025d.m2125a(this);
    }
}
