package com.konylabs.api.ui;

import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import ny0k.cr;

final class fa implements Runnable {
    final /* synthetic */ Object f1421a;
    final /* synthetic */ LuaWidget f1422b;
    final /* synthetic */ Object f1423c;
    final /* synthetic */ int f1424d;
    final /* synthetic */ eO f1425e;

    fa(eO eOVar, Object obj, LuaWidget luaWidget, Object obj2, int i) {
        this.f1425e = eOVar;
        this.f1421a = obj;
        this.f1422b = luaWidget;
        this.f1423c = obj2;
        this.f1424d = i;
    }

    public final void run() {
        LuaNil a = cr.m2201a(((LuaTable) this.f1421a).getTable(LuaWidget.ATTR_WIDGET_ANIM_DURATION), 1);
        if (!(a == null || a == LuaNil.nil)) {
            ((LuaTable) this.f1421a).setTable(LuaWidget.ATTR_WIDGET_ANIM_DURATION, Double.valueOf(((Double) a).doubleValue() / 2.0d));
        }
        LuaTable luaTable = new LuaTable();
        LuaNil table = ((LuaTable) this.f1421a).getTable(LuaWidget.ATTR_WIDGET_ANIM_CALLBACKS);
        if (!(table == null || table == LuaNil.nil)) {
            luaTable.setTable(LuaWidget.ATTR_WIDGET_ANIM_ENDED, ((LuaTable) table).getTable(LuaWidget.ATTR_WIDGET_ANIM_ENDED));
            ((LuaTable) table).setTable(LuaWidget.ATTR_WIDGET_ANIM_ENDED, LuaNil.nil);
        }
        this.f1422b.setAnimationNow((LuaTable) this.f1421a, new fb(this, luaTable));
    }
}
