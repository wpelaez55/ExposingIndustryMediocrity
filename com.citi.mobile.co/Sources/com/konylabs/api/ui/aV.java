package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
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
import java.util.Vector;

public final class aV extends Gallery implements C0213o, C0218t {
    private static int f2522R;
    private String f2523A;
    private String f2524B;
    private LayoutParams f2525C;
    private int f2526D;
    private int f2527E;
    private int f2528F;
    private int f2529G;
    private OnItemClickListener f2530H;
    private View f2531I;
    private OnItemSelectedListener f2532J;
    private dB f2533K;
    private OnFocusChangeListener f2534L;
    private final Camera f2535M;
    private int f2536N;
    private int f2537O;
    private int f2538P;
    private int f2539Q;
    private OnClickListener f2540a;
    private Vector f2541b;
    private boolean f2542c;
    private boolean f2543d;
    private int f2544e;
    private int f2545f;
    private C0210l f2546g;
    private Drawable f2547h;
    private Drawable f2548i;
    private bb f2549j;
    private int f2550k;
    private int f2551l;
    private int f2552m;
    private int f2553n;
    private String f2554o;
    private String f2555p;
    private int f2556q;
    private LinearLayout f2557r;
    private LinearLayout.LayoutParams f2558s;
    private LayoutParams f2559t;
    private boolean f2560u;
    private boolean f2561v;
    private RelativeLayout f2562w;
    private boolean f2563x;
    private ImageView f2564y;
    private ImageView f2565z;

    static {
        f2522R = (int) ((KonyMain.getActContext().getResources().getDisplayMetrics().density * -100.0f) + 0.5f);
    }

    public aV(Context context) {
        super(context);
        this.f2541b = new Vector();
        this.f2544e = 0;
        this.f2545f = 0;
        this.f2547h = null;
        this.f2548i = null;
        this.f2550k = 0;
        this.f2551l = -1;
        this.f2560u = false;
        this.f2561v = false;
        this.f2526D = 123;
        this.f2527E = 122;
        this.f2528F = 124;
        this.f2529G = 0;
        this.f2530H = new aY(this);
        this.f2532J = new aZ(this);
        this.f2534L = new ba(this);
        this.f2535M = new Camera();
        this.f2536N = 60;
        this.f2537O = -120;
        setStaticTransformationsEnabled(true);
        setSpacing(f2522R);
        setAnimationDuration(1000);
        this.f2549j = new bb(this);
        setAdapter(this.f2549j);
        setOnItemClickListener(this.f2530H);
        setOnItemSelectedListener(this.f2532J);
        setOnFocusChangeListener(this.f2534L);
        setFocusable(true);
        this.f2557r = new LinearLayout(getContext());
        this.f2558s = new LinearLayout.LayoutParams(-2, -2);
        this.f2562w = new RelativeLayout(getContext());
        this.f2525C = new LayoutParams(-2, -2);
        this.f2559t = new LayoutParams(-2, -2);
        setId(this.f2526D);
    }

    private void m2501a(View view, Transformation transformation, int i) {
        this.f2535M.save();
        Matrix matrix = transformation.getMatrix();
        transformation.setAlpha(view == this.f2531I ? 1.0f : 0.6f);
        int abs = Math.abs(i);
        this.f2535M.translate(0.0f, 0.0f, 100.0f);
        if (abs < this.f2536N) {
            this.f2535M.translate(0.0f, 0.0f, (float) (((double) this.f2537O) + (((double) abs) * 1.5d)));
        }
        this.f2535M.rotateY((float) i);
        this.f2535M.getMatrix(matrix);
        matrix.preTranslate(-(((float) this.f2552m) / 2.0f), -(((float) this.f2553n) / 2.0f));
        matrix.postTranslate(((float) this.f2552m) / 2.0f, ((float) this.f2553n) / 2.0f);
        this.f2535M.restore();
    }

    private void m2503a(bc bcVar, boolean z) {
        if (bcVar != null) {
            View a = bcVar.m869a();
            if (a != null) {
                a.setBackgroundDrawable(z ? this.f2547h : this.f2548i);
            }
        }
    }

    private void m2517i() {
        if (this.f2564y != null && this.f2565z != null) {
            if (this.f2541b.size() > 1) {
                this.f2564y.setVisibility(0);
                this.f2565z.setVisibility(0);
                if (this.f2550k == this.f2541b.size() - 1) {
                    this.f2565z.setVisibility(4);
                    return;
                } else if (this.f2550k == 0) {
                    this.f2564y.setVisibility(4);
                    return;
                } else {
                    return;
                }
            }
            this.f2564y.setVisibility(4);
            this.f2565z.setVisibility(4);
        }
    }

    private void m2521m(int i) {
        if (this.f2551l >= 0) {
            m2503a((bc) this.f2541b.elementAt(this.f2551l), false);
        }
        this.f2551l = i;
        this.f2550k = i;
        m2503a((bc) this.f2541b.elementAt(this.f2551l), true);
    }

    public final void m2528a(float f) {
        this.f2558s.width = 0;
        this.f2558s.weight = f;
    }

    public final void m2529a(int i) {
        this.f2536N = i;
    }

    public final void m2530a(OnClickListener onClickListener) {
        this.f2540a = onClickListener;
    }

    public final void m2531a(dB dBVar) {
        this.f2533K = dBVar;
        if (dBVar != null) {
            this.f2548i = dBVar.m1162p();
        } else {
            this.f2548i = null;
        }
    }

    public final void m2532a(C0210l c0210l) {
        this.f2546g = c0210l;
    }

    public final void m2533a(String str) {
        this.f2554o = str;
    }

    public final void m2534a(String str, int i) {
        if (str != null && this.f2541b != null) {
            bc bcVar = (bc) this.f2541b.elementAt(i);
            bcVar.f822a = str;
            if (bcVar.f823b != null) {
                bcVar.f823b.m908c(bcVar.f822a);
            }
        }
    }

    public final void m2535a(String str, int i, String str2) {
    }

    public final void m2536a(String str, String str2) {
        this.f2541b.add(new bc(this, str));
    }

    public final void m2537a(int[] iArr) {
        ez.m1344a(iArr, this.f2557r, this.f2558s);
    }

    public final void a_() {
        if (!this.f2560u) {
            if (this.f2563x && this.f2563x && KonyMain.f3656d > 3) {
                this.f2525C.addRule(15);
                this.f2559t.addRule(15);
                this.f2559t.addRule(1, this.f2527E);
                this.f2559t.addRule(0, this.f2528F);
                ViewGroup.LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.addRule(9);
                layoutParams.addRule(15);
                this.f2564y = new ImageView(getContext());
                this.f2564y.setId(this.f2527E);
                this.f2564y.setClickable(true);
                this.f2564y.setBackgroundDrawable(this.f2524B != null ? dB.m1112c(this.f2524B) : dB.m1112c("ic_himagestrip_left.png"));
                this.f2564y.setLayoutParams(layoutParams);
                this.f2564y.setOnClickListener(new aW(this));
                layoutParams = new LayoutParams(-2, -2);
                layoutParams.addRule(15);
                layoutParams.addRule(11);
                this.f2565z = new ImageView(getContext());
                this.f2565z.setId(this.f2528F);
                this.f2565z.setClickable(true);
                this.f2565z.setBackgroundDrawable(this.f2523A != null ? dB.m1112c(this.f2523A) : dB.m1112c("ic_himagestrip_right.png"));
                this.f2565z.setLayoutParams(layoutParams);
                this.f2565z.setOnClickListener(new aX(this));
            }
            this.f2557r.setLayoutParams(this.f2558s);
            this.f2562w.addView(this, this.f2559t);
            if (this.f2563x && KonyMain.f3656d > 3) {
                this.f2562w.addView(this.f2564y);
                this.f2562w.addView(this.f2565z);
            }
            this.f2557r.addView(this.f2562w, this.f2525C);
            this.f2560u = true;
        }
    }

    public final void a_(int i) {
        this.f2557r.setVisibility(i);
    }

    public final void a_(boolean z) {
        this.f2559t.width = -1;
        this.f2558s.width = -1;
    }

    public final void m2538b(int i) {
    }

    public final void m2539b(dB dBVar) {
        if (dBVar != null) {
            this.f2547h = dBVar.m1162p();
        } else {
            this.f2547h = null;
        }
    }

    public final void m2540b(String str) {
        this.f2555p = str;
    }

    public final void m2541b(boolean z) {
        this.f2559t.height = -1;
    }

    public final void m2542b(int[] iArr) {
        setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final View b_() {
        return this.f2557r;
    }

    public final void m2543c(String str) {
    }

    public final void m2544c(boolean z) {
        int i = this.f2551l;
        int count = this.f2549j.getCount();
        if (!z) {
            for (int i2 = 0; i2 < count; i2++) {
                if (i2 != i) {
                    m2503a((bc) this.f2549j.getItem(i2), false);
                }
            }
        }
        if (z && i != -1) {
            m2503a((bc) this.f2549j.getItem(this.f2551l), true);
        }
    }

    public final void c_() {
        detachAllViewsFromParent();
        for (int i = 0; i < this.f2541b.size(); i++) {
            if (((bc) this.f2541b.elementAt(i)).f823b != null) {
                ((bc) this.f2541b.elementAt(i)).f823b.m915f();
                ((bc) this.f2541b.elementAt(i)).m870b();
                ((bc) this.f2541b.elementAt(i)).f823b = null;
            }
        }
        this.f2541b.clear();
    }

    public final void c_(int i) {
        this.f2552m = (int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public final void m2545d() {
        if (this.f2548i != null) {
            this.f2548i.setCallback(null);
        }
        dB.m1104a(this.f2548i);
        if (this.f2547h != null) {
            this.f2547h.setCallback(null);
        }
        dB.m1104a(this.f2547h);
        if (this.f2564y != null) {
            this.f2564y.setBackgroundDrawable(null);
        }
        if (this.f2565z != null) {
            this.f2565z.setBackgroundDrawable(null);
        }
        c_();
    }

    public final void m2546d(String str) {
        this.f2524B = str;
    }

    public final void m2547d(boolean z) {
        this.f2542c = z;
    }

    public final void d_(int i) {
        this.f2553n = (int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public final int m2548e() {
        return this.f2551l == -1 ? 0 : this.f2551l;
    }

    public final void m2549e(String str) {
        this.f2523A = str;
    }

    public final void m2550e(boolean z) {
        this.f2543d = z;
    }

    public final void m2551f() {
        setFocusableInTouchMode(true);
        requestFocus();
        setFocusableInTouchMode(false);
    }

    public final void m2552f(int i) {
        detachViewFromParent(i);
        if (((bc) this.f2541b.elementAt(i)).f823b != null) {
            ((bc) this.f2541b.elementAt(i)).f823b.m915f();
            ((bc) this.f2541b.elementAt(i)).m870b();
            ((bc) this.f2541b.elementAt(i)).f823b = null;
        }
        this.f2541b.removeElementAt(i);
    }

    public final void m2553f(String str) {
    }

    public final void m2554f(boolean z) {
        this.f2563x = z;
    }

    public final void m2555g() {
        this.f2549j.notifyDataSetChanged();
        if (this.f2563x && KonyMain.f3656d > 3) {
            m2517i();
        }
    }

    public final void m2556g(int i) {
        this.f2558s.gravity = i;
        this.f2557r.setGravity(i);
    }

    public final void m2557g(String str) {
    }

    protected final boolean getChildStaticTransformation(View view, Transformation transformation) {
        if (this.f2539Q != bL.f706d) {
            return super.getChildStaticTransformation(view, transformation);
        }
        int width = view.getWidth();
        int left = view.getLeft() + (width / 2);
        transformation.clear();
        transformation.setTransformationType(2);
        if (left == this.f2538P) {
            m2501a(view, transformation, 0);
        } else {
            width = (int) ((((float) (this.f2538P - left)) / ((float) width)) * ((float) this.f2536N));
            if (Math.abs(width) > this.f2536N) {
                width = width < 0 ? -this.f2536N : this.f2536N;
            }
            m2501a(view, transformation, width);
        }
        return true;
    }

    public final void m2558h() {
    }

    public final void m2559h(int i) {
        this.f2561v = true;
        if (KonyMain.f3657e) {
            Log.d("KonyHImageStrip", "Setting the HImageStrip Focus at - " + i);
        }
        setSelection(i);
        m2521m(i);
    }

    public final void m2560i(int i) {
    }

    public final void m2561j(int i) {
    }

    public final void m2562k(int i) {
    }

    public final void m2563l(int i) {
        this.f2539Q = i;
    }

    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.f2539Q == bL.f706d) {
            this.f2538P = (((getWidth() - getPaddingLeft()) - getPaddingRight()) / 2) + getPaddingLeft();
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
