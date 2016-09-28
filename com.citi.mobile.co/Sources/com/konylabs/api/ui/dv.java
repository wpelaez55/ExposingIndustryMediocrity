package com.konylabs.api.ui;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.Gallery.LayoutParams;
import android.widget.LinearLayout;
import com.konylabs.android.KonyMain;

final class dv {
    LinearLayout f1229a;
    ih f1230b;
    private View f1231c;
    private Drawable f1232d;
    private int f1233e;
    private int f1234f;
    private /* synthetic */ dm f1235g;

    dv(dm dmVar, View view) {
        this.f1235g = dmVar;
        this.f1231c = null;
        this.f1229a = null;
        this.f1233e = 0;
        this.f1234f = 0;
        this.f1231c = view;
    }

    public final Drawable m1273a() {
        if (this.f1232d != null || this.f1235g.f2914j == null) {
            return this.f1232d;
        }
        this.f1232d = dm.m3152a(this.f1235g, this.f1235g.f2914j);
        return this.f1232d;
    }

    public final View m1274a(int i) {
        if (this.f1229a == null) {
            this.f1229a = new LinearLayout(this.f1235g.getContext());
            this.f1229a.setOrientation(1);
            this.f1229a.setLayoutParams(new LayoutParams(this.f1235g.f2910f, -2));
            this.f1231c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            if (KonyMain.f3657e) {
                Log.d("KonySegUIPageView", "Setting the item focus skin listener");
            }
            this.f1229a.setOnFocusChangeListener(this.f1235g.f2911g);
            this.f1229a.setFocusable(true);
            int j = dm.m3167j(this.f1235g);
            this.f1229a.setPadding(this.f1235g.f2926v[0] + j, this.f1235g.f2926v[1] + j, this.f1235g.f2926v[2] + j, j + this.f1235g.f2926v[3]);
            this.f1229a.setGravity(17);
            if (this.f1230b != null && this.f1230b.f1548b != null) {
                this.f1229a.setBackgroundDrawable(dm.m3152a(this.f1235g, this.f1230b.f1548b));
            } else if (this.f1235g.f2920p != null) {
                this.f1229a.setBackgroundDrawable(m1273a());
            }
            this.f1229a.addView(this.f1231c);
        }
        return this.f1229a;
    }

    public final void m1275b() {
        if (this.f1232d != null) {
            this.f1232d.setCallback(null);
        }
        dB.m1104a(this.f1232d);
        if (this.f1229a != null) {
            this.f1229a.removeAllViews();
        }
    }
}
