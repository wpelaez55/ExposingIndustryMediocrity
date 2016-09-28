package com.konylabs.api.ui;

final class hS implements Runnable {
    final /* synthetic */ boolean f1497a;
    final /* synthetic */ Object f1498b;
    final /* synthetic */ LuaWidget f1499c;

    hS(LuaWidget luaWidget, boolean z, Object obj) {
        this.f1499c = luaWidget;
        this.f1497a = z;
        this.f1498b = obj;
    }

    public final void run() {
        if (this.f1499c.f3530E != LuaWidget.KONY_WIDGET_BACKUP) {
            if (this.f1497a) {
                this.f1499c.setVisibility(this.f1497a);
            }
            this.f1499c.getWidget().getViewTreeObserver().addOnPreDrawListener(new hT(this));
            if (this.f1499c.f3530E == LuaWidget.KONY_WIDGET_RESTORE) {
                this.f1499c.getWidget().requestLayout();
            }
        }
    }
}
