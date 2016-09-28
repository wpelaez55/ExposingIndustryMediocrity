package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;

final class bs implements OnClickListener {
    private /* synthetic */ bp f843a;

    bs(bp bpVar) {
        this.f843a = bpVar;
    }

    public final void onClick(View view) {
        if (this.f843a.f2705n < this.f843a.f2694c.size() - 1) {
            this.f843a.f2705n = this.f843a.f2705n + 1;
            this.f843a.smoothScrollTo(this.f842a.f2693b.getChildAt(this.f843a.f2705n).getLeft(), 0);
            if (this.f843a.f2698g && KonyMain.f3656d > 3) {
                this.f843a.m2798i();
            }
        }
    }
}
