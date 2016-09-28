package com.konylabs.api.ui;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.konylabs.android.KonyMain;
import ny0k.C0284S;
import ny0k.aG;
import ny0k.aI;

public final class cW extends C0174B {
    public static int f2718i;
    public static int f2719j;
    public static int f2720k;
    public static int f2721l;
    public static int f2722m;
    public static int f2723n;
    private static int f2724o;
    private static int f2725p;
    private C0219u f2726A;
    private aI f2727B;
    private boolean f2728C;
    private aG f2729D;
    private int f2730E;
    private int f2731F;
    private View f2732G;
    private boolean f2733H;
    private int f2734I;
    private boolean f2735J;
    private boolean f2736K;
    private RelativeLayout f2737L;
    private LinearLayout f2738M;
    private LinearLayout f2739N;
    private boolean f2740O;
    private boolean f2741P;
    private boolean f2742Q;
    private LayoutParams f2743R;
    private int f2744S;
    private boolean f2745T;
    private Runnable f2746U;
    private String f2747V;
    private String f2748W;
    private String f2749Z;
    private String aa;
    private dB ab;
    private dB ac;
    private int f2750q;
    private Context f2751r;
    private LinearLayout.LayoutParams f2752s;
    private LinearLayout.LayoutParams f2753t;
    private RelativeLayout.LayoutParams f2754u;
    private LayoutParams f2755v;
    private FrameLayout.LayoutParams f2756w;
    private float f2757x;
    private boolean f2758y;
    private boolean f2759z;

    static {
        f2724o = 1;
        f2718i = 2;
        f2719j = 3;
        f2725p = 4;
        f2720k = 1;
        f2721l = 2;
        f2722m = 0;
        f2723n = 3;
    }

    public cW(Context context) {
        super(context);
        this.f2750q = f2724o;
        this.f2757x = 1.0f;
        this.f2758y = true;
        this.f2759z = false;
        this.f2726A = null;
        this.f2727B = null;
        this.f2728C = false;
        this.f2733H = true;
        this.f2734I = dB.m1116r(12);
        this.f2735J = false;
        this.f2736K = false;
        this.f2740O = false;
        this.f2741P = false;
        this.f2742Q = false;
        this.f2744S = 0;
        this.f2745T = true;
        this.f2746U = new cY(this);
        this.f2747V = null;
        this.f2748W = null;
        this.f2749Z = null;
        this.aa = null;
        this.ab = null;
        this.ac = null;
        this.f2751r = context;
        this.f2753t = new LinearLayout.LayoutParams(-1, -2);
        this.f2756w = new FrameLayout.LayoutParams(-1, -2);
        this.f2754u = new RelativeLayout.LayoutParams(-1, -1);
        this.f2752s = new LinearLayout.LayoutParams(-1, -2);
        this.f2738M = new LinearLayout(this.f2751r);
        this.f2738M.setId(111);
        this.f2755v = new RelativeLayout.LayoutParams(-1, -2);
        this.f2738M.setOrientation(1);
        this.f2738M.setLayoutParams(this.f2755v);
        this.f2738M.setVisibility(8);
        this.f2739N = new LinearLayout(this.f2751r);
        this.f2739N.setOrientation(1);
        this.f2739N.setId(222);
        this.f2743R = new RelativeLayout.LayoutParams(-1, -2);
        this.f2739N.setLayoutParams(this.f2743R);
        this.f2739N.setVisibility(8);
    }

    private void m2839a(C0219u c0219u, int i) {
        if (c0219u != null && this.f2726A != null) {
            int scrollY;
            int i2;
            if (this.f2750q == f2719j) {
                if (i == f2724o) {
                    scrollY = c0219u.getScrollY();
                    i2 = 0;
                } else if (i == f2718i) {
                    i2 = c0219u.getScrollX();
                    scrollY = 0;
                }
                if (this.f2736K) {
                    c0219u.scrollTo(i2, scrollY);
                    return;
                }
                c0219u.m1578a(i2, scrollY);
                this.f2730E = 0;
            }
            scrollY = 0;
            i2 = 0;
            if (this.f2736K) {
                c0219u.scrollTo(i2, scrollY);
                return;
            }
            c0219u.m1578a(i2, scrollY);
            this.f2730E = 0;
        }
    }

    private void m2840a(C0219u c0219u, View view) {
        if (view != null) {
            int left = view.getLeft();
            int top = view.getTop();
            if (c0219u != null && this.f2726A != null) {
                if (this.f2736K) {
                    c0219u.m1578a(left, top);
                } else {
                    c0219u.scrollTo(left, top);
                }
                this.f2730E = 0;
            }
        }
    }

    private void m2844b(C0219u c0219u, int i) {
        if (c0219u != null && c0219u.getChildCount() != 0 && this.f2726A != null) {
            int measuredWidth = c0219u.getChildAt(0).getMeasuredWidth();
            int measuredHeight = c0219u.getChildAt(0).getMeasuredHeight();
            int scrollX = c0219u.getScrollX() + c0219u.getMeasuredWidth();
            int scrollY = c0219u.getScrollY() + c0219u.getMeasuredHeight();
            if (this.f2750q == f2724o || this.f2750q == f2725p) {
                if (scrollX != measuredWidth) {
                    measuredHeight = 0;
                } else {
                    return;
                }
            } else if (this.f2750q != f2718i) {
                if (this.f2750q == f2719j) {
                    if (i == f2724o) {
                        if (scrollX != measuredWidth) {
                            measuredHeight = c0219u.getScrollY();
                        } else {
                            return;
                        }
                    } else if (i == f2718i) {
                        if (scrollY != measuredHeight) {
                            measuredWidth = c0219u.getScrollX();
                        } else {
                            return;
                        }
                    } else if (i == f2719j) {
                        if (scrollX == measuredWidth) {
                            if (scrollY == measuredHeight) {
                                return;
                            }
                        }
                    }
                }
                measuredHeight = 0;
                measuredWidth = 0;
            } else if (scrollY != measuredHeight) {
                measuredWidth = 0;
            } else {
                return;
            }
            if (this.f2736K) {
                c0219u.m1578a(measuredWidth, measuredHeight);
                this.f2730E = 0;
                return;
            }
            c0219u.scrollTo(measuredWidth, measuredHeight);
        }
    }

    public final void m2847a(float f) {
        if (this.f2740O) {
            this.f2752s.width = 0;
            this.f2752s.weight = f;
            return;
        }
        this.f2753t.width = 0;
        this.f2753t.weight = f;
    }

    public final void m2848a(int i, int i2) {
        if (this.f2726A != null) {
            this.f2726A.scrollTo(i, i2);
        }
    }

    public final void m2849a(View view, int i) {
        if (view instanceof C0174B) {
            C0174B c0174b = (C0174B) view;
            int childCount;
            if (c0174b.m151g()) {
                this.f2738M.setVisibility(0);
                this.f2740O = true;
                childCount = this.f2738M.getChildCount();
                if (i > childCount) {
                    i = childCount;
                }
                this.f2738M.addView(view, i);
                return;
            } else if (c0174b.m154h()) {
                this.f2739N.setVisibility(0);
                this.f2740O = true;
                childCount = this.f2739N.getChildCount();
                if (i > childCount) {
                    i = childCount;
                }
                this.f2739N.addView(view, i);
                return;
            } else {
                super.m120a(view, i);
                return;
            }
        }
        super.m120a(view, i);
    }

    public final void m2850a(aG aGVar) {
        this.f2728C = true;
        this.f2729D = aGVar;
    }

    public final void m2851a(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        if (this.f2740O) {
            this.f2752s.setMargins(i, i2, i3, i4);
        } else {
            this.f2753t.setMargins(i, i2, i3, i4);
        }
    }

    public final void m2852b(float f) {
        this.f2757x = f;
    }

    public final void m2853b(int i) {
        if (this.f2726A == null) {
            this.f2744S = i;
        } else if (this.f2728C) {
            this.f2727B.setVisibility(i);
        } else if (this.f2740O) {
            this.f2737L.setVisibility(i);
        } else {
            this.f2726A.setVisibility(i);
        }
    }

    public final void m2854b(View view) {
        if (this.f2759z) {
            view.setFocusable(true);
        }
        if (view instanceof C0174B) {
            C0174B c0174b = (C0174B) view;
            if (c0174b.m151g()) {
                this.f2738M.setVisibility(0);
                this.f2740O = true;
                c0174b.m141d(-1);
                this.f2738M.addView(view);
                return;
            } else if (c0174b.m154h()) {
                this.f2739N.setVisibility(0);
                this.f2740O = true;
                c0174b.m141d(-1);
                this.f2739N.addView(view);
                return;
            } else {
                super.m131b(view);
                return;
            }
        }
        super.m131b(view);
    }

    public final void m2855b(boolean z) {
        this.f2756w.height = z ? -1 : -2;
    }

    public final void m2856c(View view) {
        this.f2730E = f2723n;
        this.f2732G = view;
        if (this.f2726A != null) {
            C0219u c0219u = this.f2726A;
            if (this.f2736K) {
                c0219u.post(new db(this, c0219u, view));
            } else {
                m2840a(c0219u, view);
            }
        }
    }

    public final void m2857c(dB dBVar) {
        this.ab = dBVar;
        if (this.f2728C && this.f2727B != null) {
            this.f2727B.m1917a(this.ab);
        }
    }

    public final void m2858c(String str) {
        this.f2747V = null;
        if (str != null) {
            String str2 = (String) C0284S.m1823a(KonyMain.getAppContext()).m1849g(new Object[]{str});
            if (str2 != null && str2.length() >= 0) {
                this.f2747V = str2;
            }
        }
        if (this.f2728C && this.f2727B != null) {
            this.f2727B.m1918a(this.f2747V);
        }
    }

    public final void m2859d(int i) {
        this.f2753t.width = i;
        if (!this.f2728C && this.f2726A != null) {
            this.f2726A.setLayoutParams(this.f2753t);
            this.f2726A.post(this.f2746U);
        } else if (this.f2728C && this.f2727B != null) {
            this.f2727B.m1916a(this.f2753t);
        }
    }

    public final void m2860d(dB dBVar) {
        this.ac = dBVar;
        if (this.f2728C && this.f2727B != null) {
            this.f2727B.m1921b(this.ac);
        }
    }

    public final void m2861d(String str) {
        this.f2748W = null;
        if (str != null) {
            String str2 = (String) C0284S.m1823a(KonyMain.getAppContext()).m1849g(new Object[]{str});
            if (str2 != null && str2.length() >= 0) {
                this.f2748W = str2;
            }
        }
        if (this.f2728C && this.f2727B != null) {
            this.f2727B.m1922b(this.f2748W);
        }
    }

    public final void m2862e() {
        if (!this.f) {
            m114a();
            if (!(this.f2728C || this.f2726A == null)) {
                this.f2726A.setLayoutParams(this.f2753t);
            }
            if (this.f2728C && this.f2727B != null) {
                this.f2727B.m1916a(this.f2753t);
            }
            this.f = true;
        }
    }

    public final void m2863e(int i) {
        if (this.f2740O) {
            this.f2752s.height = i;
            if (this.f2726A != null && this.f2737L != null) {
                this.f2737L.setLayoutParams(this.f2752s);
                this.f2726A.post(new cZ(this));
                return;
            }
            return;
        }
        this.f2753t.height = i;
        if (!this.f2728C && this.f2726A != null) {
            this.f2726A.setLayoutParams(this.f2753t);
            this.f2726A.post(new da(this));
        } else if (this.f2728C && this.f2727B != null) {
            this.f2727B.m1916a(this.f2753t);
        }
    }

    public final void m2864e(String str) {
        this.f2749Z = null;
        if (str != null) {
            String str2 = (String) C0284S.m1823a(KonyMain.getAppContext()).m1849g(new Object[]{str});
            if (str2 != null && str2.length() >= 0) {
                this.f2749Z = str2;
            }
        }
        if (this.f2728C && this.f2727B != null) {
            this.f2727B.m1923c(this.f2749Z);
        }
    }

    public final void m2865f() {
        if (this.f2726A != null) {
            this.f2726A.removeAllViews();
        }
        if (this.f2738M != null) {
            this.f2738M.removeAllViews();
        }
        if (this.f2739N != null) {
            this.f2739N.removeAllViews();
        }
        this.f2732G = null;
        this.f2726A = null;
        super.m146f();
    }

    public final void m2866f(int i) {
        this.f2750q = i;
    }

    public final void m2867f(String str) {
        this.aa = null;
        if (str != null) {
            String str2 = (String) C0284S.m1823a(KonyMain.getAppContext()).m1849g(new Object[]{str});
            if (str2 != null && str2.length() >= 0) {
                this.aa = str2;
            }
        }
        if (this.f2728C && this.f2727B != null) {
            this.f2727B.m1924d(this.aa);
        }
    }

    public final void m2868f(boolean z) {
        this.f2758y = z;
        if (this.f2726A != null) {
            this.f2726A.setHorizontalScrollBarEnabled(this.f2758y);
            this.f2726A.setVerticalScrollBarEnabled(this.f2758y);
        }
    }

    public final void m2869g(int i) {
        this.f2734I = dB.m1116r(i);
        this.f2735J = true;
        if (this.f2726A != null) {
            this.f2726A.setFadingEdgeLength(this.f2734I);
        }
    }

    public final void m2870g(boolean z) {
        this.f2759z = z;
    }

    public final void m2871h(int i) {
        this.f2730E = f2720k;
        this.f2731F = i;
        if (this.f2726A != null) {
            C0219u c0219u = this.f2726A;
            if (this.f2736K) {
                c0219u.post(new dc(this, c0219u, i));
            } else {
                m2839a(c0219u, i);
            }
        }
    }

    public final void m2872h(boolean z) {
        this.f2733H = z;
        if (this.f2726A != null) {
            this.f2726A.setHorizontalFadingEdgeEnabled(z);
            this.f2726A.setVerticalFadingEdgeEnabled(z);
        }
    }

    public final View m2873i() {
        if (this.f2726A != null) {
            return this.f2728C ? this.f2727B : this.f2740O ? this.f2737L : this.f2726A;
        } else {
            View view;
            switch (this.f2750q) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                    this.f2726A = new C0219u(this.f2751r);
                    this.f2726A.setId(333);
                    this.f2726A.setScrollContainer(true);
                    if (KonyMain.f3656d >= 16 && getImportantForAccessibility() == 2) {
                        this.f2726A.setImportantForAccessibility(2);
                    }
                    if (this.f2758y) {
                        this.f2726A.setHorizontalScrollBarEnabled(true);
                        this.f2726A.setVerticalScrollBarEnabled(true);
                    } else {
                        this.f2726A.setHorizontalScrollBarEnabled(false);
                        this.f2726A.setVerticalScrollBarEnabled(false);
                    }
                    if (this.f2733H) {
                        this.f2726A.setVerticalFadingEdgeEnabled(true);
                        this.f2726A.setHorizontalFadingEdgeEnabled(true);
                    } else {
                        this.f2726A.setVerticalFadingEdgeEnabled(false);
                        this.f2726A.setHorizontalFadingEdgeEnabled(false);
                    }
                    if (this.f2735J) {
                        this.f2726A.setFadingEdgeLength(this.f2734I);
                    }
                    this.f2726A.m1579a(this.f2759z);
                    this.f2726A.m1577a(this.f2750q);
                    this.f2726A.m1580b(this.f2745T);
                    this.f2726A.addView((View) this, this.f2756w);
                    break;
            }
            View view2 = this.f2726A;
            this.f2726A.setLayoutParams(this.f2753t);
            if (this.f2728C) {
                if (this.f2740O) {
                    this.f2727B = new aI(this.f2751r, true, true, this.f2754u);
                } else {
                    this.f2727B = new aI(this.f2751r, true, true, this.f2753t);
                }
                if (KonyMain.f3656d >= 16 && getImportantForAccessibility() == 2) {
                    this.f2727B.setImportantForAccessibility(2);
                }
                view2 = this.f2727B;
                this.f2726A.m1581c(false);
                if (this.f2750q == 1) {
                    this.f2727B.m1914a(1);
                }
                this.f2727B.m1915a(this.f2726A);
                this.f2727B.m1919a(this.f2729D);
                if (this.f2728C && this.f2727B != null) {
                    this.f2727B.m1918a(this.f2747V);
                    this.f2727B.m1922b(this.f2748W);
                    this.f2727B.m1923c(this.f2749Z);
                    this.f2727B.m1924d(this.aa);
                    this.f2727B.m1917a(this.ab);
                    this.f2727B.m1921b(this.ac);
                }
                view = view2;
            } else {
                if (this.f2740O) {
                    this.f2726A.m1582d(true);
                }
                view = view2;
            }
            if (view.getViewTreeObserver().isAlive()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new cX(this, view));
            }
            if (this.f2740O) {
                int i;
                RelativeLayout.LayoutParams layoutParams;
                int i2;
                if (this.f2737L == null) {
                    this.f2737L = new RelativeLayout(this.f2751r);
                    this.f2737L.setLayoutParams(this.f2752s);
                }
                ((RelativeLayout.LayoutParams) this.f2755v).addRule(10);
                if (this.f2741P) {
                    this.f2754u.addRule(10);
                } else {
                    this.f2754u.addRule(3, 111);
                }
                if (this.f2752s.height != -2) {
                    ((RelativeLayout.LayoutParams) this.f2743R).addRule(12);
                    if (!this.f2742Q) {
                        i = 222;
                        layoutParams = this.f2754u;
                        i2 = 2;
                    }
                    this.f2737L.addView(view, this.f2754u);
                    this.f2737L.addView(this.f2738M);
                    this.f2737L.addView(this.f2739N);
                    if (KonyMain.f3656d >= 16 && getImportantForAccessibility() == 2) {
                        this.f2737L.setImportantForAccessibility(2);
                    }
                    view = this.f2737L;
                } else {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f2743R;
                    if (this.f2742Q) {
                        i2 = 3;
                        layoutParams = layoutParams2;
                        i = 111;
                    } else {
                        i2 = 3;
                        layoutParams = layoutParams2;
                        i = 333;
                    }
                }
                layoutParams.addRule(i2, i);
                this.f2737L.addView(view, this.f2754u);
                this.f2737L.addView(this.f2738M);
                this.f2737L.addView(this.f2739N);
                this.f2737L.setImportantForAccessibility(2);
                view = this.f2737L;
            }
            view.setVisibility(this.f2744S);
            return view;
        }
    }

    public final void m2874i(int i) {
        this.f2730E = f2721l;
        this.f2731F = i;
        if (this.f2726A != null) {
            C0219u c0219u = this.f2726A;
            if (this.f2736K) {
                c0219u.post(new dd(this, c0219u, i));
            } else {
                m2844b(c0219u, i);
            }
        }
    }

    public final void m2875j(boolean z) {
        this.f2741P = z;
    }

    public final void m2876k() {
    }

    public final void m2877k(boolean z) {
        this.f2742Q = z;
    }

    public final void m2878l(boolean z) {
        if (z != this.f2745T) {
            this.f2745T = z;
            if (this.f2726A != null) {
                this.f2726A.m1580b(this.f2745T);
            }
        }
    }

    public final View m2879m() {
        return this.f2726A;
    }

    public final int m2880n() {
        return this.f2726A == null ? 0 : this.f2726A.getScrollX();
    }

    public final int m2881o() {
        return this.f2726A == null ? 0 : this.f2726A.getScrollY();
    }

    protected final void onMeasure(int i, int i2) {
        int i3 = 0;
        if (getOrientation() == 0) {
            if (this.g) {
                i3 = Math.max((int) (((float) KonyMain.getActContext().m4166o()) * this.f2757x), (int) (((float) KonyMain.getActContext().m4166o()) * this.h));
            }
            super.onMeasure(i, i2);
        }
        if (this.f2750q == f2724o || this.f2750q == f2719j) {
            measureChildren(0, 0);
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                int measuredWidth = getChildAt(i4).getMeasuredWidth();
                if (measuredWidth > i3) {
                    i3 = measuredWidth;
                }
            }
            i3 = this.g ? Math.max(i3, (int) (((float) KonyMain.getActContext().m4166o()) * this.f2757x)) : Math.max(i3, (int) (((float) KonyMain.getActContext().m4166o()) * this.h));
        }
        super.onMeasure(i, i2);
        i = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        super.onMeasure(i, i2);
    }

    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
