package com.konylabs.api.ui;

import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import ny0k.cr;

final class fK implements Runnable {
    final /* synthetic */ Object f1398a;
    final /* synthetic */ LuaWidget f1399b;
    final /* synthetic */ Object f1400c;
    final /* synthetic */ int f1401d;
    final /* synthetic */ fv f1402e;

    fK(fv fvVar, Object obj, LuaWidget luaWidget, Object obj2, int i) {
        this.f1402e = fvVar;
        this.f1398a = obj;
        this.f1399b = luaWidget;
        this.f1400c = obj2;
        this.f1401d = i;
    }

    public final void run() {
        LuaNil a = cr.m2201a(((LuaTable) this.f1398a).getTable(LuaWidget.ATTR_WIDGET_ANIM_DURATION), 1);
        if (!(a == null || a == LuaNil.nil)) {
            ((LuaTable) this.f1398a).setTable(LuaWidget.ATTR_WIDGET_ANIM_DURATION, Double.valueOf(((Double) a).doubleValue() / 2.0d));
        }
        LuaTable luaTable = new LuaTable();
        LuaNil table = ((LuaTable) this.f1398a).getTable(LuaWidget.ATTR_WIDGET_ANIM_CALLBACKS);
        if (!(table == null || table == LuaNil.nil)) {
            luaTable.setTable(LuaWidget.ATTR_WIDGET_ANIM_ENDED, ((LuaTable) table).getTable(LuaWidget.ATTR_WIDGET_ANIM_ENDED));
            ((LuaTable) table).setTable(LuaWidget.ATTR_WIDGET_ANIM_ENDED, LuaNil.nil);
        }
        this.f1399b.setAnimationNow((LuaTable) this.f1398a, new fL(this, luaTable));
    }
}
