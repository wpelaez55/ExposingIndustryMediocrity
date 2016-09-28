package com.konylabs.api.ui;

import com.konylabs.vm.LuaTable;
import ny0k.C0300p;

final class fb implements C0300p {
    final /* synthetic */ fa f3000a;
    private /* synthetic */ LuaTable f3001b;

    fb(fa faVar, LuaTable luaTable) {
        this.f3000a = faVar;
        this.f3001b = luaTable;
    }

    public final void m3326a() {
        this.f3000a.f1425e.m4199c(this.f3000a.f1422b);
        int a = this.f3000a.f1425e.m4187a(this.f3000a.f1423c, this.f3000a.f1424d);
        if (this.f3000a.f1425e.E == LuaWidget.KONY_WIDGET_RESTORE) {
            this.f3000a.f1425e.m4201e(this.f3000a.f1422b, null);
            this.f3000a.f1425e.m4200c(this.f3000a.f1423c, a, null);
            if (this.f3001b != null) {
                ((LuaTable) this.f3000a.f1421a).setTable(LuaWidget.ATTR_WIDGET_ANIM_CALLBACKS, this.f3001b);
                ((LuaTable) this.f3000a.f1421a).setTable(LuaWidget.ATTR_WIDGET_ANIM_DELAY, Double.valueOf(0.0d));
            }
            this.f3000a.f1425e.f3718g.getViewTreeObserver().addOnPreDrawListener(new fc(this));
        }
    }
}
