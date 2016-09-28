package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;

final class dY extends RelativeLayout {
    private StateListDrawable f1148a;
    private Drawable f1149b;
    private /* synthetic */ dU f1150c;

    public dY(dU dUVar, Context context, dW dWVar) {
        this.f1150c = dUVar;
        super(context);
        this.f1148a = null;
        this.f1149b = null;
        setLayoutParams(new LayoutParams(dB.m1116r(0), dUVar.f2873v, 1.0f));
        if (dWVar.f1142c != null) {
            KonyMain.getActContext();
            this.f1149b = KonyMain.m4083a(dWVar.f1142c);
            View imageView = new ImageView(KonyMain.getActContext());
            imageView.setImageDrawable(this.f1149b);
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(14);
            addView(imageView, layoutParams);
        }
        if (!(dWVar.f1141b == null || dWVar.f1141b.equals(BuildConfig.FLAVOR))) {
            ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(14);
            layoutParams2.addRule(12);
            TextView textView = new TextView(KonyMain.getActContext());
            textView.setId(2);
            textView.setText(dWVar.f1141b);
            if (dUVar.f2855c != null) {
                dUVar.f2855c.m1129b(textView);
            }
            textView.setSingleLine();
            textView.setEllipsize(TruncateAt.MARQUEE);
            textView.setHorizontallyScrolling(true);
            addView(textView, layoutParams2);
        }
        this.f1148a = dUVar.m3058a();
        setBackgroundDrawable(this.f1148a);
        getLayoutParams();
        dU dUVar2 = this.f1150c;
    }

    public final void m1198a() {
        if (this.f1148a != null) {
            this.f1148a.setCallback(null);
            this.f1148a = null;
        }
        if (this.f1149b != null) {
            this.f1149b.setCallback(null);
            this.f1149b = null;
        }
        setBackgroundDrawable(null);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        View findViewById = findViewById(2);
        if (findViewById != null) {
            if (this.f1150c.f2856d != null && isPressed()) {
                this.f1150c.f2856d.m1129b((TextView) findViewById);
            } else if (this.f1150c.f2854b != null && isSelected()) {
                this.f1150c.f2854b.m1129b((TextView) findViewById);
            } else if (this.f1150c.f2855c != null) {
                this.f1150c.f2855c.m1129b((TextView) findViewById);
            }
        }
        if (this.f1150c.f2861j.getCurrentTabView() == this) {
            this.f1150c.f2861j.findViewById(this.f1150c.f2858f).getBackground().setState(getDrawableState());
        }
    }
}
