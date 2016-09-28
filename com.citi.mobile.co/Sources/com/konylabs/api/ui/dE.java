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

public final class dE extends ViewFlipper implements C0213o {
    private GestureDetector f2789a;
    private OnTouchListener f2790b;
    private LinearLayout f2791c;
    private boolean f2792d;
    private int f2793e;
    private float f2794f;
    private int f2795g;
    private int[] f2796h;
    private String f2797i;
    private String f2798j;
    private int f2799k;
    private int f2800l;
    private LayoutParams f2801m;
    private LayoutParams f2802n;
    private boolean f2803o;
    private int f2804p;
    private String f2805q;
    private Vector f2806r;
    private dB f2807s;
    private dB f2808t;
    private boolean f2809u;

    public dE(Context context) {
        super(context);
        this.f2792d = true;
        this.f2793e = 30;
        this.f2795g = 200;
        this.f2796h = new int[4];
        this.f2803o = false;
        this.f2804p = 17;
        this.f2805q = "KonySlotView";
        this.f2806r = new Vector();
        this.f2807s = null;
        this.f2808t = null;
        this.f2809u = false;
        this.f2794f = TypedValue.applyDimension(5, 1.5f, context.getResources().getDisplayMetrics());
        this.f2789a = new GestureDetector(new dG(this));
        this.f2790b = new dF(this);
        this.f2791c = new LinearLayout(getContext());
        this.f2801m = new LayoutParams(-2, -2);
        this.f2802n = new LayoutParams(-2, -2);
        setOnTouchListener(this.f2790b);
        setFocusable(true);
    }

    private void m2949a(dB dBVar, boolean z) {
        this.f2809u = z;
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

    private void m2955o(int i) {
        boolean z = true;
        stopFlipping();
        if (KonyMain.f3657e) {
            Log.d(this.f2805q, "1 setSelection position as " + i);
        }
        boolean z2 = i < getDisplayedChild();
        if (KonyMain.f3657e) {
            Log.d(this.f2805q, "2 setSelection position as " + i);
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
                Log.d(this.f2805q, "setSelection continueFlipping for " + getDisplayedChild() + "  " + z);
            }
        }
        stopFlipping();
    }

    public final void m2956a(float f) {
        this.f2801m.width = 0;
        this.f2801m.weight = f;
    }

    public final void m2957a(int i) {
    }

    public final void m2958a(OnClickListener onClickListener) {
    }

    public final void m2959a(dB dBVar) {
        this.f2807s = dBVar;
    }

    public final void m2960a(String str) {
        this.f2798j = str;
    }

    public final void m2961a(String str, int i) {
        if (str != null) {
            ((bt) ((LinearLayout) getChildAt(i)).getChildAt(0)).m908c(str);
        }
    }

    public final void m2962a(String str, int i, String str2) {
    }

    public final void m2963a(String str, String str2) {
        bt btVar = new bt(getContext());
        btVar.m908c(str);
        if (this.f2797i != null) {
            btVar.m895a(this.f2797i);
        }
        if (this.f2798j != null) {
            btVar.m903b(this.f2798j);
        }
        btVar.setPadding(this.f2796h[0], this.f2796h[1], this.f2796h[2], this.f2796h[3]);
        btVar.m907c(this.f2804p);
        btVar.m906c();
        btVar.m898a(true, true);
        this.f2806r.add(btVar);
        addView(btVar.m910d());
    }

    public final void m2964a(int[] iArr) {
        ez.m1344a(iArr, this.f2791c, this.f2801m);
    }

    public final void a_() {
        if (!this.f2803o) {
            this.f2791c.setLayoutParams(this.f2801m);
            if (this.f2799k > 0 && this.f2800l > 0) {
                this.f2802n.width = this.f2799k;
                this.f2802n.height = this.f2800l;
                setMinimumWidth(this.f2799k);
                setMinimumHeight(this.f2800l);
            } else if (this.f2799k == 0 && this.f2800l > 0) {
                this.f2802n.width = -2;
                this.f2802n.height = this.f2800l;
                setMinimumHeight(this.f2800l);
            }
            this.f2791c.addView(this, this.f2802n);
            setFlipInterval(this.f2793e);
            this.f2803o = true;
        }
    }

    public final void a_(int i) {
        this.f2791c.setVisibility(i);
    }

    public final void a_(boolean z) {
        this.f2802n.width = -1;
        this.f2801m.width = -1;
    }

    public final void m2965b(int i) {
    }

    public final void m2966b(dB dBVar) {
        this.f2808t = dBVar;
    }

    public final void m2967b(String str) {
        this.f2797i = str;
    }

    public final void m2968b(boolean z) {
        this.f2802n.height = -1;
    }

    public final void m2969b(int[] iArr) {
        this.f2796h[0] = iArr[0];
        this.f2796h[1] = iArr[1];
        this.f2796h[2] = iArr[2];
        this.f2796h[3] = iArr[3];
    }

    public final View b_() {
        return this.f2791c;
    }

    public final void m2970c(String str) {
    }

    public final void m2971c(boolean z) {
        if (this.f2809u && z) {
            m2949a(this.f2808t, true);
        } else if (!this.f2809u && !z) {
            m2949a(this.f2807s, false);
        }
    }

    public final void c_() {
        stopFlipping();
        removeAllViews();
        Iterator it = this.f2806r.iterator();
        while (it.hasNext()) {
            ((bt) it.next()).m915f();
        }
        this.f2806r.clear();
    }

    public final void c_(int i) {
        this.f2799k = (int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public final void m2972d() {
        c_();
    }

    public final void m2973d(boolean z) {
        this.f2792d = z;
    }

    public final void d_(int i) {
        this.f2800l = (int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public final int m2974e() {
        return getDisplayedChild();
    }

    public final void m2975f() {
        setFocusableInTouchMode(true);
        requestFocus();
        setFocusableInTouchMode(false);
    }

    public final void m2976f(int i) {
        removeViewAt(i);
    }

    public final void m2977g() {
    }

    public final void m2978g(int i) {
        this.f2804p = i;
        this.f2801m.gravity = i;
        this.f2802n.gravity = i;
        this.f2791c.setGravity(i);
    }

    public final void m2979h() {
    }

    public final void m2980h(int i) {
        if (i != getDisplayedChild() && i <= getChildCount() - 1 && i >= 0) {
            if (KonyMain.f3657e) {
                Log.d(this.f2805q, "setFocusedIndex focusedIndex is " + i);
            }
            m2955o(i);
        }
    }

    public final void m2981i(int i) {
    }

    public final void m2982j(int i) {
    }

    public final void m2983k(int i) {
    }

    public final void m2984l(int i) {
        this.f2793e = i;
    }

    public final void m2985m(int i) {
        this.f2794f = (float) i;
    }

    public final void m2986n(int i) {
        this.f2795g = i;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void setSpacing(int i) {
    }

    public final void showNext() {
        if (KonyMain.f3657e) {
            Log.d(this.f2805q, "showNext() called for " + getDisplayedChild() + "  " + this.f2792d);
        }
        if (this.f2792d) {
            super.showNext();
        } else {
            super.showPrevious();
        }
    }
}
