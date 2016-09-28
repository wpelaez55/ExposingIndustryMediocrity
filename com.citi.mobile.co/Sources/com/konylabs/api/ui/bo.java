package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;

final class bo implements OnClickListener {
    private /* synthetic */ bl f840a;

    bo(bl blVar) {
        this.f840a = blVar;
    }

    public final void onClick(View view) {
        if (this.f840a.f2673n < this.f840a.f2662c.size() - 1) {
            this.f840a.f2673n = this.f840a.f2673n + 1;
            this.f840a.smoothScrollTo(this.f840a.f2661b.getChildAt(this.f840a.f2673n).getLeft(), 0);
            if (this.f840a.f2666g && KonyMain.f3656d > 3) {
                this.f840a.m2744i();
            }
        }
    }
}
