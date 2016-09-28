package com.konylabs.api.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public final class cq extends Dialog {
    public TextView f1007a;
    public ImageView f1008b;
    final /* synthetic */ cn f1009c;
    private TextView f1010d;
    private RelativeLayout f1011e;
    private ImageView f1012f;
    private OnClickListener f1013g;

    public cq(cn cnVar, Context context) {
        this.f1009c = cnVar;
        super(context);
        this.f1010d = new TextView(this.f1009c.a);
        this.f1007a = new TextView(this.f1009c.a);
        this.f1011e = new RelativeLayout(this.f1009c.a);
        this.f1008b = new ImageView(this.f1009c.a);
        this.f1012f = new ImageView(this.f1009c.a);
        this.f1013g = new cr(this);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        this.f1010d.setTextSize(10.0f);
        this.f1010d.setTypeface(Typeface.SANS_SERIF, 1);
        this.f1010d.setTextColor(-16777217);
        this.f1007a.setTextSize(14.0f);
        this.f1007a.setTypeface(Typeface.SANS_SERIF, 0);
        this.f1007a.setTextColor(-16777217);
        this.f1007a.setGravity(16);
        this.f1008b.setImageDrawable(dB.m1112c("ic_map_righticon.png"));
        this.f1012f.setImageDrawable(dB.m1112c("ic_map_cancelicon.png"));
        int r = dB.m1116r(4);
        this.f1012f.setPadding(r, r, r, r);
        r = dB.m1116r(4);
        this.f1008b.setPadding(r, r, r, r);
        this.f1008b.setClickable(true);
        this.f1012f.setClickable(true);
        this.f1008b.setOnClickListener(this.f1013g);
        this.f1012f.setOnClickListener(this.f1013g);
        r = dB.m1116r(4);
        this.f1011e.setPadding(r, r, r, r);
        Drawable paintDrawable = new PaintDrawable(-3355444);
        paintDrawable.setCornerRadius(4.0f);
        this.f1011e.setBackgroundDrawable(paintDrawable);
        View linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f1012f);
        linearLayout.addView(this.f1008b);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        linearLayout.setId(1);
        LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(9);
        layoutParams2.addRule(0, 1);
        this.f1007a.setLayoutParams(layoutParams2);
        linearLayout.setLayoutParams(layoutParams);
        this.f1011e.addView(this.f1007a);
        this.f1011e.addView(linearLayout);
        setContentView(this.f1011e);
    }
}
