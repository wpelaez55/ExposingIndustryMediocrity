package com.konylabs.api.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import ny0k.cA;

final class dz extends LinearLayout {
    TextView f1238a;
    cA f1239b;
    boolean f1240c;
    final /* synthetic */ dw f1241d;

    public dz(dw dwVar, Context context) {
        this.f1241d = dwVar;
        super(context);
        this.f1240c = false;
        this.f1238a = new TextView(context);
        addView(this.f1238a);
        setGravity(16);
    }

    public final void m1276a() {
        if (this.f1239b != null) {
            int d = this.f1241d.f2951i != null ? this.f1241d.f2951i.m1134d() : 0;
            if (this.f1240c && d == 0) {
                this.f1239b.m2094a(this.f1241d.f2942L);
            }
        }
    }
}
