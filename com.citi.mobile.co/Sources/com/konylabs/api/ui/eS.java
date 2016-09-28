package com.konylabs.api.ui;

final class eS implements Runnable {
    final /* synthetic */ LuaWidget f1262a;
    final /* synthetic */ Object f1263b;
    final /* synthetic */ eO f1264c;
    private /* synthetic */ int f1265d;

    eS(eO eOVar, LuaWidget luaWidget, int i, Object obj) {
        this.f1264c = eOVar;
        this.f1262a = luaWidget;
        this.f1265d = i;
        this.f1263b = obj;
    }

    public final void run() {
        if (this.f1264c.E != LuaWidget.KONY_WIDGET_BACKUP) {
            this.f1264c.m3945a(this.f1262a, this.f1265d);
            this.f1264c.f3718g.m120a(this.f1262a.getWidget(), this.f1264c.getChildConvertedIndex(this.f1265d));
            this.f1264c.f3718g.getViewTreeObserver().addOnPreDrawListener(new eT(this));
        }
    }
}
