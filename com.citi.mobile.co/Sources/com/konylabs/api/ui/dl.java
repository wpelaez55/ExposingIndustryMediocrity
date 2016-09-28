package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import ny0k.cA;

final class dl extends LinearLayout {
    private TextView f1216a;
    private cA f1217b;

    public dl(df dfVar, Context context) {
        super(context);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f1216a = new TextView(context);
        this.f1216a.setLayoutParams(layoutParams);
        setLayoutParams(layoutParams);
        addView(this.f1216a);
        setGravity(16);
    }

    final void m1271a(dB dBVar) {
        if (dBVar != null) {
            if (this.f1216a != null) {
                this.f1216a.setBackgroundColor(0);
                dBVar.m1129b(this.f1216a);
            }
            Drawable b = dBVar.m1127b(true);
            this.f1217b = b instanceof cA ? (cA) b : null;
        } else if (this.f1216a != null) {
            this.f1216a.setTextSize((float) dB.m1116r(10));
            this.f1216a.setTypeface(Typeface.SANS_SERIF, 1);
            this.f1216a.setTextColor(-1);
            this.f1217b = new cA(-16776961);
        }
        setBackgroundDrawable(this.f1217b);
    }

    final void m1272a(String str) {
        this.f1216a.setText(str);
    }
}
