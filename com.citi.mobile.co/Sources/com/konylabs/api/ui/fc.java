package com.konylabs.api.ui;

import android.view.ViewTreeObserver.OnPreDrawListener;
import com.konylabs.vm.LuaTable;

final class fc implements OnPreDrawListener {
    private /* synthetic */ fb f1426a;

    fc(fb fbVar) {
        this.f1426a = fbVar;
    }

    public final boolean onPreDraw() {
        if (this.f1426a.f3000a.f1425e.E != LuaWidget.KONY_WIDGET_BACKUP) {
            ((LuaWidget) this.f1426a.f3000a.f1423c).setAnimationNow((LuaTable) this.f1426a.f3000a.f1421a, null, true);
            this.f1426a.f3000a.f1425e.f3718g.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        return false;
    }
}
