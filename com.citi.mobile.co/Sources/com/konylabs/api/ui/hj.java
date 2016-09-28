package com.konylabs.api.ui;

import com.konylabs.vm.LuaTable;
import ny0k.cr;

final class hj implements iq {
    private /* synthetic */ hg f3011a;

    hj(hg hgVar) {
        this.f3011a = hgVar;
    }

    public final LuaTable m3345a(eO eOVar) {
        this.f3011a.f4423c.m1523a(eOVar.getWidget());
        if (!eOVar.isJsObjectCloneCreated()) {
            cr.m2204a((LuaWidget) eOVar, this.f3011a);
        }
        return null;
    }
}
