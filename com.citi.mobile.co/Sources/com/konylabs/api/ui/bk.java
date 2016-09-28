package com.konylabs.api.ui;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;

final class bk {
    String f832a;
    bw f833b;
    private String f834c;
    private LinearLayout f835d;
    private boolean f836e;
    private /* synthetic */ bd f837f;

    bk(bd bdVar, String str, String str2) {
        String str3 = null;
        this.f837f = bdVar;
        this.f833b = null;
        this.f835d = null;
        this.f836e = false;
        this.f832a = str;
        if (str2 != null && str2.length() > 0) {
            str3 = str2.trim();
        }
        this.f834c = str3;
    }

    public final View m872a() {
        if (this.f833b != null && this.f836e) {
            this.f833b.m955f();
            this.f833b = null;
        }
        if (this.f833b == null) {
            this.f833b = new bw(this.f837f.getContext());
            this.f833b.m948c(this.f832a);
            if (this.f837f.f2651t != null) {
                this.f833b.m936a(this.f837f.f2651t);
            }
            if (this.f837f.f2650s != null) {
                this.f833b.m944b(this.f837f.f2650s);
            }
            this.f833b.m946c();
            this.f833b.setScaleType(ScaleType.FIT_CENTER);
            this.f835d = new LinearLayout(this.f837f.getContext());
            if (false) {
                this.f833b.m941a(new int[]{10, 10, 10, 10});
            }
            if (this.f837f.f2648p == 0) {
                this.f837f.f2648p = -2;
            }
            if (this.f837f.f2647o == 0) {
                this.f837f.f2647o = -2;
            }
            this.f835d.setLayoutParams(new LayoutParams(-2, -2));
            this.f833b.setLayoutParams(new LinearLayout.LayoutParams(this.f837f.f2647o, this.f837f.f2648p));
            this.f837f.f2652u = 0;
            this.f833b.setPadding(this.f837f.f2652u, this.f837f.f2652u, this.f837f.f2652u, this.f837f.f2652u);
            this.f833b.m941a(new int[]{0 / 2, 0, 0 / 2, 0});
            ((BitmapDrawable) this.f833b.getDrawable()).setAntiAlias(true);
            this.f835d.setGravity(17);
            if (this.f837f.f2628Q != null) {
                this.f835d.setBackgroundDrawable(this.f837f.f2628Q.m1162p());
            }
            if (this.f837f.f2649r == bd.f2609a) {
                this.f833b.m963l();
            } else if (this.f837f.f2649r == bd.f2610b) {
                this.f833b.m962k();
            }
            this.f836e = false;
            this.f835d.addView(this.f833b.m949d());
        }
        this.f833b.m951d(this.f834c);
        return this.f835d;
    }

    public final void m873b() {
        this.f835d.setBackgroundDrawable(null);
    }
}
