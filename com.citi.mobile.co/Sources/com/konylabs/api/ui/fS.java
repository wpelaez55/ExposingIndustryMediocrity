package com.konylabs.api.ui;

import android.view.ViewTreeObserver.OnPreDrawListener;
import com.konylabs.vm.LuaTable;

final class fS implements OnPreDrawListener {
    private /* synthetic */ fR f1415a;

    fS(fR fRVar) {
        this.f1415a = fRVar;
    }

    public final boolean onPreDraw() {
        if (this.f1415a.f1413c.f4029v != LuaWidget.KONY_WIDGET_BACKUP) {
            this.f1415a.f1411a.setAnimationNow((LuaTable) this.f1415a.f1412b, null);
            this.f1415a.f1413c.f4030w.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        return false;
    }
}
