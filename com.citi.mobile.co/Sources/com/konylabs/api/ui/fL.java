package com.konylabs.api.ui;

import com.konylabs.vm.LuaTable;
import ny0k.C0300p;

final class fL implements C0300p {
    final /* synthetic */ fK f2996a;
    private /* synthetic */ LuaTable f2997b;

    fL(fK fKVar, LuaTable luaTable) {
        this.f2996a = fKVar;
        this.f2997b = luaTable;
    }

    public final void m3323a() {
        this.f2996a.f1402e.m4386a(this.f2996a.f1399b, this.f2996a.f1400c, this.f2996a.f1401d);
        if (this.f2997b != null) {
            ((LuaTable) this.f2996a.f1398a).setTable(LuaWidget.ATTR_WIDGET_ANIM_CALLBACKS, this.f2997b);
            ((LuaTable) this.f2996a.f1398a).setTable(LuaWidget.ATTR_WIDGET_ANIM_DELAY, Double.valueOf(0.0d));
        }
        if (this.f2996a.f1402e.f4029v == LuaWidget.KONY_WIDGET_RESTORE) {
            this.f2996a.f1402e.f4030w.getViewTreeObserver().addOnPreDrawListener(new fM(this));
        }
    }
}
