package com.konylabs.api.ui;

import android.view.ViewTreeObserver.OnPreDrawListener;
import com.konylabs.vm.LuaTable;

final class eT implements OnPreDrawListener {
    private /* synthetic */ eS f1266a;

    eT(eS eSVar) {
        this.f1266a = eSVar;
    }

    public final boolean onPreDraw() {
        if (this.f1266a.f1264c.E != LuaWidget.KONY_WIDGET_BACKUP) {
            this.f1266a.f1262a.setAnimationNow((LuaTable) this.f1266a.f1263b, null);
            if (this.f1266a.f1264c.E == LuaWidget.KONY_WIDGET_RESTORE) {
                this.f1266a.f1264c.f3718g.getViewTreeObserver().removeOnPreDrawListener(this);
            }
        }
        return false;
    }
}
