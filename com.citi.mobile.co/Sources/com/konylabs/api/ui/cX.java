package com.konylabs.api.ui;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class cX implements OnGlobalLayoutListener {
    private /* synthetic */ View f967a;
    private /* synthetic */ cW f968b;

    cX(cW cWVar, View view) {
        this.f968b = cWVar;
        this.f967a = view;
    }

    public final void onGlobalLayout() {
        if (this.f968b.f2730E == cW.f2720k) {
            this.f968b.m2871h(this.f968b.f2731F);
        } else if (this.f968b.f2730E == cW.f2721l) {
            this.f968b.m2874i(this.f968b.f2731F);
        } else if (this.f968b.f2730E == cW.f2723n) {
            this.f968b.m2856c(this.f968b.f2732G);
        }
        this.f968b.f2736K = true;
        this.f968b.f2730E = 0;
        this.f967a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
}
