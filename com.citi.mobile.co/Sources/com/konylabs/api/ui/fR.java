package com.konylabs.api.ui;

import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaTable;

final class fR implements Runnable {
    final /* synthetic */ LuaWidget f1411a;
    final /* synthetic */ Object f1412b;
    final /* synthetic */ fv f1413c;
    private /* synthetic */ int f1414d;

    fR(fv fvVar, LuaWidget luaWidget, int i, Object obj) {
        this.f1413c = fvVar;
        this.f1411a = luaWidget;
        this.f1414d = i;
        this.f1412b = obj;
    }

    public final void run() {
        if (this.f1413c.f4029v != LuaWidget.KONY_WIDGET_BACKUP) {
            this.f1413c.m4399b(this.f1411a, this.f1414d);
            if (KonyMain.f3656d < 11) {
                this.f1411a.setAnimationNow((LuaTable) this.f1412b, null);
            } else {
                this.f1413c.f4030w.getViewTreeObserver().addOnPreDrawListener(new fS(this));
            }
        }
    }
}
