package com.konylabs.api.ui;

import android.view.ViewTreeObserver.OnPreDrawListener;
import com.konylabs.vm.LuaTable;

final class hT implements OnPreDrawListener {
    final /* synthetic */ hS f1500a;

    hT(hS hSVar) {
        this.f1500a = hSVar;
    }

    public final boolean onPreDraw() {
        if (this.f1500a.f1499c.f3530E != LuaWidget.KONY_WIDGET_BACKUP) {
            this.f1500a.f1499c.setAnimationNow((LuaTable) this.f1500a.f1498b, new hU(this));
            if (this.f1500a.f1499c.f3530E == LuaWidget.KONY_WIDGET_RESTORE) {
                this.f1500a.f1499c.getWidget().getViewTreeObserver().removeOnPreDrawListener(this);
            }
        }
        return false;
    }
}
