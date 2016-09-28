package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ViewFlipper;
import com.konylabs.android.KonyMain;
import java.util.Iterator;
import java.util.Vector;

public final class dH extends ViewFlipper implements C0213o {
    private static int f2810v;
    private static int f2811w;
    private static int f2812x;
    private GestureDetector f2813a;
    private OnTouchListener f2814b;
    private LinearLayout f2815c;
    private boolean f2816d;
    private int f2817e;
    private float f2818f;
    private int f2819g;
    private int[] f2820h;
    private String f2821i;
    private String f2822j;
    private int f2823k;
    private int f2824l;
    private LayoutParams f2825m;
    private LayoutParams f2826n;
    private boolean f2827o;
    private int f2828p;
    private String f2829q;
    private Vector f2830r;
    private dB f2831s;
    private dB f2832t;
    private boolean f2833u;
    private int f2834y;

    static {
        f2810v = 1;
        f2811w = 2;
        f2812x = 3;
    }

    public dH(Context context) {
        super(context);
        this.f2816d = true;
        this.f2817e = 30;
        this.f2819g = 200;
        this.f2820h = new int[4];
        this.f2827o = false;
        this.f2828p = 17;
        this.f2829q = "KonySlotView";
        this.f2830r = new Vector();
        this.f2831s = null;
        this.f2832t = null;
        this.f2833u = false;
        this.f2834y = f2811w;
        this.f2818f = TypedValue.applyDimension(5, 1.5f, context.getResources().getDisplayMetrics());
        this.f2813a = new GestureDetector(new dJ(this));
        this.f2814b = new dI(this);
        this.f2815c = new LinearLayout(getContext());
        this.f2825m = new LayoutParams(-2, -2);
        this.f2826n = new LayoutParams(-2, -2);
        setOnTouchListener(this.f2814b);
        setFocusable(true);
    }

    private void m2988a(dB dBVar, boolean z) {
        this.f2833u = z;
        if (dBVar != null) {
            Drawable drawable;
            Drawable a = dBVar.m1117a();
            if (dBVar.m1126b() == null || a == null) {
                drawable = a;
            } else {
                drawable = new LayerDrawable(new Drawable[]{r3, a});
                drawable.setLayerInset(1, dBVar.m1158n(), dBVar.m1158n(), dBVar.m1158n(), dBVar.m1158n());
            }
            setBackgroundDrawable(drawable);
        }
    }

    private View m2992d(String str) {
        bw bwVar = new bw(getContext());
        bwVar.m948c(str);
        if (this.f2821i != null) {
            bwVar.m936a(this.f2821i);
        }
        if (this.f2822j != null) {
            bwVar.m944b(this.f2822j);
        }
        bwVar.setPadding(this.f2820h[0], this.f2820h[1], this.f2820h[2], this.f2820h[3]);
        bwVar.m950d(this.f2828p);
        bwVar.m946c();
        bwVar.m939a(true, true);
        if (this.f2834y == f2810v) {
            bwVar.m963l();
        } else if (this.f2834y == f2812x) {
            bwVar.m962k();
        }
        this.f2830r.add(bwVar);
        return bwVar.m949d();
    }

    private void m2995o(int i) {
        boolean z = true;
        stopFlipping();
        if (KonyMain.f3657e) {
            Log.d(this.f2829q, "1 setSelection position as " + i);
        }
        boolean z2 = i < getDisplayedChild();
        if (KonyMain.f3657e) {
            Log.d(this.f2829q, "2 setSelection position as " + i);
        }
        while (z) {
            if (i == getDisplayedChild()) {
                z = false;
            } else if (z2) {
                super.showPrevious();
            } else {
                super.showNext();
            }
            if (KonyMain.f3657e) {
                Log.d(this.f2829q, "setSelection continueFlipping for " + getDisplayedChild() + "  " + z);
            }
        }
        stopFlipping();
    }

    public final void m2996a(float f) {
        this.f2825m.width = 0;
        this.f2825m.weight = f;
    }

    public final void m2997a(int i) {
    }

    public final void m2998a(OnClickListener onClickListener) {
    }

    public final void m2999a(dB dBVar) {
        this.f2831s = dBVar;
    }

    public final void m3000a(String str) {
        this.f2822j = str;
    }

    public final void m3001a(String str, int i) {
        if (str != null) {
            ((bt) ((LinearLayout) getChildAt(i)).getChildAt(0)).m908c(str);
        }
    }

    public final void m3002a(String str, int i, String str2) {
        addView(m2992d(str), i);
    }

    public final void m3003a(String str, String str2) {
        addView(m2992d(str));
    }

    public final void m3004a(int[] iArr) {
        ez.m1344a(iArr, this.f2815c, this.f2825m);
    }

    public final void a_() {
        if (!this.f2827o) {
            this.f2815c.setLayoutParams(this.f2825m);
            if (this.f2823k > 0 && this.f2824l > 0) {
                this.f2826n.width = this.f2823k;
                this.f2826n.height = this.f2824l;
                setMinimumWidth(this.f2823k);
                setMinimumHeight(this.f2824l);
            } else if (this.f2823k == 0 && this.f2824l > 0) {
                this.f2826n.width = -2;
                this.f2826n.height = this.f2824l;
                setMinimumHeight(this.f2824l);
            }
            if (this.f2815c.indexOfChild(this) == -1) {
                this.f2815c.addView(this, this.f2826n);
            } else {
                this.f2815c.updateViewLayout(this, this.f2826n);
            }
            setFlipInterval(this.f2817e);
            this.f2827o = true;
        }
    }

    public final void a_(int i) {
        this.f2815c.setVisibility(i);
    }

    public final void a_(boolean z) {
        this.f2826n.width = -1;
        this.f2825m.width = -1;
    }

    public final void m3005b(int i) {
    }

    public final void m3006b(dB dBVar) {
        this.f2832t = dBVar;
    }

    public final void m3007b(String str) {
        this.f2821i = str;
    }

    public final void m3008b(boolean z) {
        this.f2826n.height = -1;
    }

    public final void m3009b(int[] iArr) {
        this.f2820h[0] = iArr[0];
        this.f2820h[1] = iArr[1];
        this.f2820h[2] = iArr[2];
        this.f2820h[3] = iArr[3];
    }

    public final View b_() {
        return this.f2815c;
    }

    public final void m3010c(String str) {
    }

    public final void m3011c(boolean z) {
        if (this.f2833u && z) {
            m2988a(this.f2832t, true);
        } else if (!this.f2833u && !z) {
            m2988a(this.f2831s, false);
        }
    }

    public final void c_() {
        stopFlipping();
        removeAllViews();
        Iterator it = this.f2830r.iterator();
        while (it.hasNext()) {
            ((bw) it.next()).m955f();
        }
        this.f2830r.clear();
    }

    public final void c_(int i) {
        this.f2823k = (int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public final void m3012d() {
        c_();
    }

    public final void m3013d(boolean z) {
        this.f2816d = z;
    }

    public final void d_(int i) {
        this.f2824l = (int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public final int m3014e() {
        return getDisplayedChild();
    }

    public final void m3015f() {
        setFocusableInTouchMode(true);
        requestFocus();
        setFocusableInTouchMode(false);
    }

    public final void m3016f(int i) {
        removeViewAt(i);
    }

    public final void m3017g() {
    }

    public final void m3018g(int i) {
        this.f2828p = i;
        this.f2825m.gravity = i;
        this.f2826n.gravity = i;
        this.f2815c.setGravity(i);
    }

    public final void m3019h() {
        this.f2827o = false;
        a_();
    }

    public final void m3020h(int i) {
        if (i != getDisplayedChild() && i <= getChildCount() - 1 && i >= 0) {
            if (KonyMain.f3657e) {
                Log.d(this.f2829q, "setFocusedIndex focusedIndex is " + i);
            }
            m2995o(i);
        }
    }

    public final void m3021i(int i) {
        this.f2834y = i;
    }

    public final void m3022j(int i) {
        this.f2825m.height = i;
    }

    public final void m3023k(int i) {
        this.f2825m.width = i;
    }

    public final void m3024l(int i) {
        this.f2817e = i;
    }

    public final void m3025m(int i) {
        this.f2818f = (float) i;
    }

    public final void m3026n(int i) {
        this.f2819g = i;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void setSpacing(int i) {
    }

    public final void showNext() {
        if (KonyMain.f3657e) {
            Log.d(this.f2829q, "showNext() called for " + getDisplayedChild() + "  " + this.f2816d);
        }
        if (this.f2816d) {
            super.showNext();
        } else {
            super.showPrevious();
        }
    }
}
