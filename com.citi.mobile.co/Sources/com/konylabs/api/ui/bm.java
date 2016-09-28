package com.konylabs.api.ui;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;

final class bm implements OnClickListener {
    private /* synthetic */ bl f838a;

    bm(bl blVar) {
        this.f838a = blVar;
    }

    public final void onClick(View view) {
        int indexOf = this.f838a.f2662c.indexOf(((ViewGroup) view).getChildAt(0));
        if (KonyMain.f3657e) {
            Log.d(BuildConfig.FLAVOR, "Index of Image clicked :" + indexOf);
        }
        if (indexOf != this.f838a.f2677r) {
            this.f838a.m2730a(this.f838a.f2677r, false);
            this.f838a.f2677r = indexOf;
            this.f838a.m2730a(this.f838a.f2677r, true);
        }
        this.f838a.m2731a(view);
        if (this.f838a.f2663d != null) {
            this.f838a.f2663d.onClick(view);
        }
        if (this.f838a.f2682w != null) {
            if (this.f838a.f2684y && this.f838a.f2677r == this.f838a.f2662c.size()) {
                this.f838a.f2682w.m1459a(false);
            } else if (this.f838a.f2683x && this.f838a.f2677r == 0) {
                this.f838a.f2682w.m1459a(true);
            }
        }
        this.f838a.f2673n = this.f838a.f2677r;
        if (this.f838a.f2666g && KonyMain.f3656d > 3) {
            this.f838a.m2744i();
        }
    }
}
