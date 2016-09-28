package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;

public final class cw extends LinearLayout implements ip {
    private static final int f2778j;
    private Context f2779a;
    private boolean f2780b;
    private LayoutParams f2781c;
    private LayoutParams f2782d;
    private LinearLayout f2783e;
    private cx f2784f;
    private dB f2785g;
    private dB f2786h;
    private boolean f2787i;

    static {
        f2778j = KonyMain.getActContext().getResources().getIdentifier("wheel_item", "layout", KonyMain.getActContext().getPackageName());
    }

    public cw(Context context) {
        super(context);
        this.f2779a = context;
        this.f2783e = new LinearLayout(context);
        this.f2781c = new LayoutParams(-2, -2);
        this.f2782d = new LayoutParams(-2, -2);
    }

    public final void m2927a() {
        this.f2783e.setLayoutParams(this.f2782d);
        if (this.f2783e.indexOfChild(this) == -1) {
            this.f2783e.addView(this, this.f2781c);
        }
        m2939b();
    }

    public final void m2928a(float f) {
        this.f2782d.width = 0;
        this.f2782d.weight = f;
    }

    public final void m2929a(int i) {
        setVisibility(i);
    }

    public final void m2930a(int i, int i2) {
        ((ij) getChildAt(i)).m1448b(i2);
    }

    public final void m2931a(int i, Collection collection) {
        ij ijVar = (ij) getChildAt(i);
        if (ijVar != null) {
            ijVar.getClass();
            ijVar.m1445a(new in(ijVar, this.f2779a, f2778j, new ArrayList(collection)));
        }
    }

    public final void m2932a(int i, Collection collection, int i2) {
        ij ijVar = (ij) getChildAt(i);
        if (ijVar == null) {
            ijVar = new ij(this.f2779a, 1985);
            super.addView(ijVar, i);
        }
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-2, -2);
        if (i2 > 0 && i2 != 100 && this.f2787i) {
            layoutParams.width = 0;
            layoutParams.weight = ((float) i2) / 100.0f;
        } else if (i2 == 100) {
            layoutParams.width = -1;
        }
        ijVar.setLayoutParams(layoutParams);
        ijVar.getClass();
        ijVar.m1445a(new in(ijVar, this.f2779a, f2778j, new ArrayList(collection)));
    }

    public final void m2933a(cx cxVar) {
        this.f2784f = cxVar;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ij ijVar = (ij) getChildAt(i);
            if (!(cxVar == null || ijVar == null)) {
                ijVar.m1446a((ip) this);
            }
        }
    }

    public final void m2934a(dB dBVar) {
        if (this.f2785g != dBVar) {
            this.f2785g = dBVar;
        }
    }

    public final void m2935a(ij ijVar, io ioVar) {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount && ijVar != getChildAt(i)) {
            i++;
        }
        if (this.f2784f != null) {
            this.f2784f.m1049a(i, (cy) ioVar);
        }
    }

    public final void m2936a(String str) {
        if (KonyMain.f3656d <= 3) {
            return;
        }
        if (str != null) {
            setContentDescription(str);
            if (KonyMain.f3656d >= 16) {
                setImportantForAccessibility(1);
            }
        } else if (KonyMain.f3656d >= 16) {
            setImportantForAccessibility(2);
        } else {
            setContentDescription(BuildConfig.FLAVOR);
        }
    }

    public final void m2937a(boolean z) {
        int i = -1;
        this.f2782d.width = z ? -1 : -2;
        LayoutParams layoutParams = this.f2781c;
        if (!z) {
            i = -2;
        }
        layoutParams.width = i;
        this.f2787i = z;
    }

    public final void m2938a(int[] iArr) {
        ez.m1344a(iArr, this.f2783e, this.f2782d);
    }

    public final void m2939b() {
        int childCount = getChildCount();
        dB dBVar = this.f2786h;
        dB dBVar2 = this.f2785g;
        im imVar = dBVar != null ? new im(dBVar.m1156m(), dBVar.m1154l(), dBVar.m1152k(), dBVar.m1150j()) : null;
        for (int i = 0; i < childCount; i++) {
            Drawable a;
            ij ijVar = (ij) getChildAt(i);
            Drawable a2 = dBVar != null ? dBVar.m1117a() : null;
            if (dBVar2 != null) {
                a = dBVar2.m1117a();
                ijVar.m1442a(dBVar2.m1156m());
            } else {
                a = null;
            }
            ijVar.m1443a(a2, a);
            ijVar.m1444a(imVar);
        }
        Drawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{-7829368, ViewCompat.MEASURED_STATE_MASK, -7829368});
        gradientDrawable.setCornerRadius(5.0f);
        gradientDrawable.setStroke(1, ViewCompat.MEASURED_STATE_MASK);
        int r = dB.m1116r(5);
        setPadding(r, r, r, r);
        setBackgroundDrawable(gradientDrawable);
    }

    public final void m2940b(int i) {
        int childCount = getChildCount();
        if (childCount > i) {
            removeViews(i, childCount - i);
        }
    }

    public final void m2941b(dB dBVar) {
        if (this.f2786h != dBVar) {
            this.f2786h = dBVar;
        }
    }

    public final void m2942b(int[] iArr) {
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = iArr[2];
        rect.bottom = iArr[3];
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final View m2943c() {
        return this.f2783e;
    }

    public final cy m2944c(int i) {
        ij ijVar = (ij) getChildAt(i);
        if (ijVar == null) {
            return null;
        }
        return (cy) ((in) ijVar.m1441a()).m1449a(ijVar.m1447b());
    }

    public final void m2945d() {
        this.f2783e.removeAllViews();
        removeAllViews();
    }

    public final void m2946e() {
        super.removeAllViews();
    }

    public final void m2947f() {
        this.f2780b = false;
        m2927a();
    }
}
