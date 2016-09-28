package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;

final class bn implements OnClickListener {
    private /* synthetic */ bl f839a;

    bn(bl blVar) {
        this.f839a = blVar;
    }

    public final void onClick(View view) {
        if (this.f839a.f2673n > 0) {
            this.f839a.f2673n = this.f839a.f2673n - 1;
            this.f839a.smoothScrollTo(this.f839a.f2661b.getChildAt(this.f839a.f2673n).getLeft(), 0);
            if (this.f839a.f2666g && KonyMain.f3656d > 3) {
                this.f839a.m2744i();
            }
        }
    }
}
