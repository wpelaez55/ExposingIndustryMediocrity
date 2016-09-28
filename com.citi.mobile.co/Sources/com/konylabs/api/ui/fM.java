package com.konylabs.api.ui;

import android.view.ViewTreeObserver.OnPreDrawListener;
import com.konylabs.vm.LuaTable;

final class fM implements OnPreDrawListener {
    private /* synthetic */ fL f1403a;

    fM(fL fLVar) {
        this.f1403a = fLVar;
    }

    public final boolean onPreDraw() {
        if (this.f1403a.f2996a.f1402e.f4029v != LuaWidget.KONY_WIDGET_BACKUP) {
            ((LuaWidget) this.f1403a.f2996a.f1400c).setAnimationNow((LuaTable) this.f1403a.f2996a.f1398a, null, true);
            this.f1403a.f2996a.f1402e.f4030w.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        return false;
    }
}
