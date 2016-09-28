package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.animation.Transformation;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Vector;

public final class bd extends Gallery implements C0213o, C0218t {
    private static int f2608Z;
    public static int f2609a;
    public static int f2610b;
    private static int f2611q;
    private RelativeLayout f2612A;
    private boolean f2613B;
    private ImageView f2614C;
    private ImageView f2615D;
    private String f2616E;
    private String f2617F;
    private String f2618G;
    private String f2619H;
    private LayoutParams f2620I;
    private int f2621J;
    private int f2622K;
    private int f2623L;
    private int f2624M;
    private OnItemClickListener f2625N;
    private View f2626O;
    private OnItemSelectedListener f2627P;
    private dB f2628Q;
    private OnFocusChangeListener f2629R;
    private final Camera f2630S;
    private int f2631T;
    private int f2632U;
    private int f2633V;
    private int f2634W;
    private OnClickListener f2635c;
    private Vector f2636d;
    private boolean f2637e;
    private boolean f2638f;
    private int f2639g;
    private int f2640h;
    private C0210l f2641i;
    private Drawable f2642j;
    private Drawable f2643k;
    private bj f2644l;
    private int f2645m;
    private int f2646n;
    private int f2647o;
    private int f2648p;
    private int f2649r;
    private String f2650s;
    private String f2651t;
    private int f2652u;
    private LinearLayout f2653v;
    private LinearLayout.LayoutParams f2654w;
    private LayoutParams f2655x;
    private boolean f2656y;
    private boolean f2657z;

    static {
        f2609a = 1;
        f2611q = 2;
        f2610b = 3;
        f2608Z = (int) ((KonyMain.getActContext().getResources().getDisplayMetrics().density * -100.0f) + 0.5f);
    }

    public bd(Context context) {
        super(context);
        this.f2636d = new Vector();
        this.f2639g = 0;
        this.f2640h = 0;
        this.f2642j = null;
        this.f2643k = null;
        this.f2645m = 0;
        this.f2646n = -1;
        this.f2649r = f2611q;
        this.f2656y = false;
        this.f2657z = false;
        this.f2621J = 123;
        this.f2622K = 122;
        this.f2623L = 124;
        this.f2624M = 0;
        this.f2625N = new bg(this);
        this.f2627P = new bh(this);
        this.f2629R = new bi(this);
        this.f2630S = new Camera();
        this.f2631T = 60;
        this.f2632U = -120;
        setStaticTransformationsEnabled(true);
        setSpacing(f2608Z);
        setAnimationDuration(1000);
        this.f2644l = new bj(this);
        setAdapter(this.f2644l);
        setOnItemClickListener(this.f2625N);
        setOnItemSelectedListener(this.f2627P);
        setOnFocusChangeListener(this.f2629R);
        setFocusable(true);
        this.f2653v = new LinearLayout(getContext());
        this.f2654w = new LinearLayout.LayoutParams(-2, -2);
        this.f2612A = new RelativeLayout(getContext());
        this.f2620I = new LayoutParams(-2, -2);
        this.f2655x = new LayoutParams(-2, -2);
        setId(this.f2621J);
    }

    private void m2664a(View view, Transformation transformation, int i) {
        this.f2630S.save();
        Matrix matrix = transformation.getMatrix();
        transformation.setAlpha(view == this.f2626O ? 1.0f : 0.6f);
        int abs = Math.abs(i);
        this.f2630S.translate(0.0f, 0.0f, 100.0f);
        if (abs < this.f2631T) {
            this.f2630S.translate(0.0f, 0.0f, (float) (((double) this.f2632U) + (((double) abs) * 1.5d)));
        }
        this.f2630S.rotateY((float) i);
        this.f2630S.getMatrix(matrix);
        matrix.preTranslate(-(((float) this.f2647o) / 2.0f), -(((float) this.f2648p) / 2.0f));
        matrix.postTranslate(((float) this.f2647o) / 2.0f, ((float) this.f2648p) / 2.0f);
        this.f2630S.restore();
    }

    private void m2666a(bk bkVar, boolean z) {
        if (bkVar != null) {
            View a = bkVar.m872a();
            if (a != null) {
                a.setBackgroundDrawable(z ? this.f2642j : this.f2643k);
            }
        }
    }

    private void m2680i() {
        if (this.f2614C != null && this.f2615D != null) {
            if (this.f2636d.size() > 1) {
                this.f2614C.setVisibility(0);
                this.f2615D.setVisibility(0);
                if (this.f2645m == this.f2636d.size() - 1) {
                    this.f2615D.setVisibility(4);
                    return;
                } else if (this.f2645m == 0) {
                    this.f2614C.setVisibility(4);
                    return;
                } else {
                    return;
                }
            }
            this.f2614C.setVisibility(4);
            this.f2615D.setVisibility(4);
        }
    }

    private void m2685m(int i) {
        if (this.f2646n >= 0) {
            m2666a((bk) this.f2636d.elementAt(this.f2646n), false);
        }
        this.f2646n = i;
        this.f2645m = i;
        m2666a((bk) this.f2636d.elementAt(this.f2646n), true);
    }

    public final void m2692a(float f) {
        this.f2654w.width = 0;
        this.f2654w.weight = f;
    }

    public final void m2693a(int i) {
        this.f2631T = i;
    }

    public final void m2694a(OnClickListener onClickListener) {
        this.f2635c = onClickListener;
    }

    public final void m2695a(dB dBVar) {
        this.f2628Q = dBVar;
        if (dBVar != null) {
            this.f2643k = dBVar.m1162p();
        } else {
            this.f2643k = null;
        }
    }

    public final void m2696a(C0210l c0210l) {
        this.f2641i = c0210l;
    }

    public final void m2697a(String str) {
        this.f2650s = str;
    }

    public final void m2698a(String str, int i) {
        if (str != null && this.f2636d != null) {
            bk bkVar = (bk) this.f2636d.elementAt(i);
            bkVar.f832a = str;
            if (bkVar.f833b != null) {
                bkVar.f833b.m948c(bkVar.f832a);
            }
        }
    }

    public final void m2699a(String str, int i, String str2) {
        if (str != null && this.f2636d != null) {
            this.f2636d.add(i, new bk(this, str, str2));
        }
    }

    public final void m2700a(String str, String str2) {
        this.f2636d.add(new bk(this, str, str2));
    }

    public final void m2701a(int[] iArr) {
        ez.m1344a(iArr, this.f2653v, this.f2654w);
    }

    public final void a_() {
        if (!this.f2656y) {
            if (this.f2613B && this.f2613B && KonyMain.f3656d > 3) {
                this.f2620I.addRule(15);
                this.f2655x.addRule(15);
                this.f2655x.addRule(1, this.f2622K);
                this.f2655x.addRule(0, this.f2623L);
                ViewGroup.LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.addRule(9);
                layoutParams.addRule(15);
                this.f2614C = new ImageView(getContext());
                this.f2614C.setId(this.f2622K);
                this.f2614C.setClickable(true);
                Drawable c = this.f2617F != null ? dB.m1112c(this.f2617F) : dB.m1112c("ic_himagestrip_left.png");
                Drawable c2 = this.f2618G != null ? dB.m1112c(this.f2618G) : dB.m1112c("ic_himagestrip_left.png");
                this.f2614C.setLayoutParams(layoutParams);
                this.f2614C.setOnClickListener(new be(this));
                Drawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, c2);
                stateListDrawable.addState(new int[]{16842914}, c);
                stateListDrawable.addState(new int[0], c);
                this.f2614C.setImageDrawable(stateListDrawable);
                layoutParams = new LayoutParams(-2, -2);
                layoutParams.addRule(15);
                layoutParams.addRule(11);
                this.f2615D = new ImageView(getContext());
                this.f2615D.setId(this.f2623L);
                this.f2615D.setClickable(true);
                c = this.f2616E != null ? dB.m1112c(this.f2616E) : dB.m1112c("ic_himagestrip_right.png");
                c2 = this.f2619H != null ? dB.m1112c(this.f2619H) : dB.m1112c("ic_himagestrip_right.png");
                this.f2615D.setLayoutParams(layoutParams);
                this.f2615D.setOnClickListener(new bf(this));
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, c2);
                stateListDrawable.addState(new int[]{16842914}, c);
                stateListDrawable.addState(new int[0], c);
                this.f2615D.setImageDrawable(stateListDrawable);
            }
            this.f2653v.setLayoutParams(this.f2654w);
            if (this.f2612A.indexOfChild(this) == -1) {
                this.f2612A.addView(this, this.f2655x);
            }
            if (this.f2613B && KonyMain.f3656d > 3) {
                if (this.f2612A.indexOfChild(this.f2614C) == -1) {
                    this.f2612A.addView(this.f2614C);
                }
                if (this.f2612A.indexOfChild(this.f2615D) == -1) {
                    this.f2612A.addView(this.f2615D);
                }
            }
            if (this.f2653v.indexOfChild(this.f2612A) == -1) {
                this.f2653v.addView(this.f2612A, this.f2620I);
            }
            this.f2656y = true;
        }
    }

    public final void a_(int i) {
        this.f2653v.setVisibility(i);
    }

    public final void a_(boolean z) {
        this.f2655x.width = -1;
        this.f2654w.width = -1;
    }

    public final void m2702b(int i) {
    }

    public final void m2703b(dB dBVar) {
        if (dBVar != null) {
            this.f2642j = dBVar.m1162p();
        } else {
            this.f2642j = null;
        }
    }

    public final void m2704b(String str) {
        this.f2651t = str;
    }

    public final void m2705b(boolean z) {
        this.f2655x.height = -1;
    }

    public final void m2706b(int[] iArr) {
        setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final View b_() {
        return this.f2653v;
    }

    public final void m2707c(String str) {
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

    public final void m2708c(boolean z) {
        int i = this.f2646n;
        int count = this.f2644l.getCount();
        if (!z) {
            for (int i2 = 0; i2 < count; i2++) {
                if (i2 != i) {
                    m2666a((bk) this.f2644l.getItem(i2), false);
                }
            }
        }
        if (z && i != -1) {
            m2666a((bk) this.f2644l.getItem(this.f2646n), true);
        }
    }

    public final void c_() {
        detachAllViewsFromParent();
        for (int i = 0; i < this.f2636d.size(); i++) {
            if (((bk) this.f2636d.elementAt(i)).f833b != null) {
                ((bk) this.f2636d.elementAt(i)).f833b.m955f();
                ((bk) this.f2636d.elementAt(i)).m873b();
                ((bk) this.f2636d.elementAt(i)).f833b = null;
            }
        }
        this.f2636d.clear();
    }

    public final void c_(int i) {
        this.f2647o = (int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public final void m2709d() {
        if (this.f2643k != null) {
            this.f2643k.setCallback(null);
        }
        dB.m1104a(this.f2643k);
        if (this.f2642j != null) {
            this.f2642j.setCallback(null);
        }
        dB.m1104a(this.f2642j);
        if (this.f2614C != null) {
            this.f2614C.setBackgroundDrawable(null);
        }
        if (this.f2615D != null) {
            this.f2615D.setBackgroundDrawable(null);
        }
        c_();
    }

    public final void m2710d(String str) {
        this.f2617F = str;
    }

    public final void m2711d(boolean z) {
        this.f2637e = z;
    }

    public final void d_(int i) {
        this.f2648p = (int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public final int m2712e() {
        return this.f2646n == -1 ? 0 : this.f2646n;
    }

    public final void m2713e(String str) {
        this.f2616E = str;
    }

    public final void m2714e(boolean z) {
        this.f2638f = z;
    }

    public final void m2715f() {
        setFocusableInTouchMode(true);
        requestFocus();
        setFocusableInTouchMode(false);
    }

    public final void m2716f(int i) {
        detachViewFromParent(i);
        if (((bk) this.f2636d.elementAt(i)).f833b != null) {
            ((bk) this.f2636d.elementAt(i)).f833b.m955f();
            ((bk) this.f2636d.elementAt(i)).m873b();
            ((bk) this.f2636d.elementAt(i)).f833b = null;
        }
        this.f2636d.removeElementAt(i);
    }

    public final void m2717f(String str) {
        this.f2618G = str;
    }

    public final void m2718f(boolean z) {
        this.f2613B = z;
    }

    public final void m2719g() {
        this.f2644l.notifyDataSetChanged();
        if (this.f2613B && KonyMain.f3656d > 3) {
            m2680i();
        }
    }

    public final void m2720g(int i) {
        this.f2654w.gravity = i;
        this.f2653v.setGravity(i);
    }

    public final void m2721g(String str) {
        this.f2619H = str;
    }

    protected final boolean getChildStaticTransformation(View view, Transformation transformation) {
        if (this.f2634W != bL.f706d) {
            return super.getChildStaticTransformation(view, transformation);
        }
        int width = view.getWidth();
        int left = view.getLeft() + (width / 2);
        transformation.clear();
        transformation.setTransformationType(2);
        if (left == this.f2633V) {
            m2664a(view, transformation, 0);
        } else {
            width = (int) ((((float) (this.f2633V - left)) / ((float) width)) * ((float) this.f2631T));
            if (Math.abs(width) > this.f2631T) {
                width = width < 0 ? -this.f2631T : this.f2631T;
            }
            m2664a(view, transformation, width);
        }
        return true;
    }

    public final void m2722h() {
        this.f2656y = false;
        a_();
        for (int i = 0; i < this.f2636d.size(); i++) {
            if (((bk) this.f2636d.elementAt(i)).f833b != null) {
                ((bk) this.f2636d.elementAt(i)).f836e = true;
            }
        }
        m2719g();
    }

    public final void m2723h(int i) {
        this.f2657z = true;
        if (KonyMain.f3657e) {
            Log.d("KonyHImageStrip2", "Setting the HImageStrip Focus at - " + i);
        }
        setSelection(i);
        m2685m(i);
    }

    public final void m2724i(int i) {
        this.f2649r = i;
    }

    public final void m2725j(int i) {
        this.f2654w.height = i;
    }

    public final void m2726k(int i) {
        this.f2654w.width = i;
    }

    public final void m2727l(int i) {
        this.f2634W = i;
    }

    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.f2634W == bL.f706d) {
            this.f2633V = (((getWidth() - getPaddingLeft()) - getPaddingRight()) / 2) + getPaddingLeft();
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setSpacing(int i) {
        super.setSpacing((int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f));
    }
}
