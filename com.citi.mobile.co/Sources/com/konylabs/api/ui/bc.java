package com.konylabs.api.ui;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;

final class bc {
    String f822a;
    bt f823b;
    private LinearLayout f824c;
    private /* synthetic */ aV f825d;

    bc(aV aVVar, String str) {
        this.f825d = aVVar;
        this.f823b = null;
        this.f824c = null;
        this.f822a = str;
    }

    public final View m869a() {
        if (this.f823b == null) {
            this.f823b = new bt(this.f825d.getContext());
            this.f823b.m908c(this.f822a);
            if (this.f825d.f2555p != null) {
                this.f823b.m895a(this.f825d.f2555p);
            }
            if (this.f825d.f2554o != null) {
                this.f823b.m903b(this.f825d.f2554o);
            }
            this.f823b.m906c();
            this.f823b.setScaleType(ScaleType.FIT_CENTER);
            this.f824c = new LinearLayout(this.f825d.getContext());
            if (false) {
                this.f823b.m900a(new int[]{10, 10, 10, 10});
            }
            if (this.f825d.f2553n == 0) {
                this.f825d.f2553n = -2;
            }
            if (this.f825d.f2552m == 0) {
                this.f825d.f2552m = -2;
            }
            this.f824c.setLayoutParams(new LayoutParams(-2, -2));
            this.f823b.setLayoutParams(new LinearLayout.LayoutParams(this.f825d.f2552m, this.f825d.f2553n));
            this.f825d.f2556q = 0;
            this.f823b.setPadding(this.f825d.f2556q, this.f825d.f2556q, this.f825d.f2556q, this.f825d.f2556q);
            this.f823b.m900a(new int[]{0 / 2, 0, 0 / 2, 0});
            ((BitmapDrawable) this.f823b.getDrawable()).setAntiAlias(true);
            this.f824c.setGravity(17);
            if (this.f825d.f2533K != null) {
                this.f824c.setBackgroundDrawable(this.f825d.f2533K.m1162p());
            }
            this.f824c.addView(this.f823b.m910d());
        }
        return this.f824c;
    }

    public final void m870b() {
        this.f824c.setBackgroundDrawable(null);
    }
}
