package com.konylabs.api.ui;

import android.os.Looper;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class cB implements OnPreDrawListener {
    final /* synthetic */ cz f908a;

    cB(cz czVar) {
        this.f908a = czVar;
    }

    public final boolean onPreDraw() {
        this.f908a.m1090g();
        this.f908a.m1096j();
        if (!this.f908a.f1057f) {
            Looper.myQueue().addIdleHandler(new cC(this));
            this.f908a.f1057f = true;
        }
        return true;
    }
}
