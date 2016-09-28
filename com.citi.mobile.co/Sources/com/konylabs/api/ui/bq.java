package com.konylabs.api.ui;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;

final class bq implements OnClickListener {
    private /* synthetic */ bp f841a;

    bq(bp bpVar) {
        this.f841a = bpVar;
    }

    public final void onClick(View view) {
        int indexOf = this.f841a.f2694c.indexOf(((ViewGroup) view).getChildAt(0));
        if (KonyMain.f3657e) {
            Log.d(BuildConfig.FLAVOR, "Index of Image clicked :" + indexOf);
        }
        if (indexOf != this.f841a.f2709r) {
            this.f841a.m2783a(this.f841a.f2709r, false);
            this.f841a.f2709r = indexOf;
            this.f841a.m2783a(this.f841a.f2709r, true);
        }
        this.f841a.m2784a(view);
        if (this.f841a.f2695d != null) {
            this.f841a.f2695d.onClick(view);
        }
        if (this.f841a.f2714w != null) {
            if (this.f841a.f2716y && this.f841a.f2709r == this.f841a.f2694c.size()) {
                this.f841a.f2714w.m1459a(false);
            } else if (this.f841a.f2715x && this.f841a.f2709r == 0) {
                this.f841a.f2714w.m1459a(true);
            }
        }
        this.f841a.f2705n = this.f841a.f2709r;
        if (this.f841a.f2698g && KonyMain.f3656d > 3) {
            this.f841a.m2798i();
        }
    }
}
