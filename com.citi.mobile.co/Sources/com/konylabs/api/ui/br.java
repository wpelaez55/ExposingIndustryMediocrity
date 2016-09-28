package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;

final class br implements OnClickListener {
    private /* synthetic */ bp f842a;

    br(bp bpVar) {
        this.f842a = bpVar;
    }

    public final void onClick(View view) {
        if (this.f842a.f2705n > 0) {
            this.f842a.f2705n = this.f842a.f2705n - 1;
            this.f842a.smoothScrollTo(this.f842a.f2693b.getChildAt(this.f842a.f2705n).getLeft(), 0);
            if (this.f842a.f2698g && KonyMain.f3656d > 3) {
                this.f842a.m2798i();
            }
        }
    }
}
