package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.konylabs.android.KonyMain;
import java.util.Iterator;
import java.util.Vector;

public final class bl extends HorizontalScrollView implements C0213o, C0218t {
    private int[] f2658A;
    private OnClickListener f2659B;
    private LayoutParams f2660a;
    private LinearLayout f2661b;
    private Vector f2662c;
    private OnClickListener f2663d;
    private int[] f2664e;
    private boolean f2665f;
    private boolean f2666g;
    private ImageView f2667h;
    private ImageView f2668i;
    private String f2669j;
    private String f2670k;
    private RelativeLayout f2671l;
    private RelativeLayout.LayoutParams f2672m;
    private int f2673n;
    private int f2674o;
    private dB f2675p;
    private dB f2676q;
    private int f2677r;
    private int f2678s;
    private int f2679t;
    private String f2680u;
    private String f2681v;
    private C0210l f2682w;
    private boolean f2683x;
    private boolean f2684y;
    private boolean f2685z;

    public bl(Context context) {
        super(context);
        this.f2662c = new Vector();
        this.f2664e = new int[4];
        this.f2665f = false;
        this.f2666g = false;
        this.f2673n = 0;
        this.f2674o = 17;
        this.f2677r = -1;
        this.f2678s = 0;
        this.f2679t = 0;
        this.f2685z = false;
        this.f2658A = null;
        this.f2659B = new bm(this);
        this.f2671l = new RelativeLayout(context);
        this.f2671l.setLayoutParams(new LayoutParams(-1, -1));
        this.f2661b = new LinearLayout(context);
        this.f2661b.setOrientation(0);
        this.f2660a = new LayoutParams(-1, -1);
        this.f2672m = new RelativeLayout.LayoutParams(-2, -2);
        setHorizontalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(true);
        setMeasureAllChildren(false);
    }

    private void m2730a(int i, boolean z) {
        if (i >= 0 && i < this.f2662c.size()) {
            View childAt = this.f2661b.getChildAt(i);
            if (childAt != null) {
                Drawable drawable = null;
                if (z) {
                    if (this.f2676q != null) {
                        drawable = this.f2676q.m1162p();
                    }
                } else if (this.f2675p != null) {
                    drawable = this.f2675p.m1162p();
                }
                childAt.setBackgroundDrawable(drawable);
            }
        }
    }

    private void m2731a(View view) {
        int[] iArr = new int[2];
        m2732a(view, iArr);
        if (iArr[0] == 0 && iArr[1] > 0) {
            return;
        }
        if (iArr[0] < 0) {
            smoothScrollBy(iArr[0], 0);
        } else if (iArr[1] > 0) {
            smoothScrollBy(iArr[1], 0);
        }
    }

    private void m2732a(View view, int[] iArr) {
        int i;
        int i2;
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        if (!this.f2666g || KonyMain.f3656d <= 3) {
            i = 0;
            i2 = 0;
        } else {
            i2 = this.f2667h.getWidth();
            i = this.f2668i.getWidth();
        }
        iArr[0] = iArr2[0] - i2;
        iArr[1] = (i + (iArr2[0] + view.getWidth())) - rect.right;
    }

    private void m2744i() {
        if (this.f2667h != null && this.f2668i != null) {
            if (this.f2662c.size() > 1) {
                this.f2667h.setVisibility(0);
                this.f2668i.setVisibility(0);
                if (this.f2673n == this.f2662c.size() - 1) {
                    this.f2668i.setVisibility(4);
                    return;
                } else if (this.f2673n == 0) {
                    this.f2667h.setVisibility(4);
                    return;
                } else {
                    return;
                }
            }
            this.f2667h.setVisibility(4);
            this.f2668i.setVisibility(4);
        }
    }

    public final void m2746a(float f) {
        this.f2660a.width = 0;
        this.f2660a.weight = f;
    }

    public final void m2747a(int i) {
    }

    public final void m2748a(OnClickListener onClickListener) {
        this.f2663d = onClickListener;
    }

    public final void m2749a(dB dBVar) {
        this.f2675p = dBVar;
    }

    public final void m2750a(C0210l c0210l) {
        this.f2682w = c0210l;
    }

    public final void m2751a(String str) {
        this.f2680u = str;
    }

    public final void m2752a(String str, int i) {
        if (str != null && this.f2662c != null) {
            ((bt) ((LinearLayout) this.f2661b.getChildAt(i)).getChildAt(0)).m908c(str);
        }
    }

    public final void m2753a(String str, int i, String str2) {
    }

    public final void m2754a(String str, String str2) {
        bt btVar = new bt(getContext());
        btVar.m908c(str);
        if (this.f2681v != null) {
            btVar.m895a(this.f2681v);
        }
        if (this.f2680u != null) {
            btVar.m903b(this.f2680u);
        }
        btVar.setPadding(this.f2664e[0], this.f2664e[1], this.f2664e[2], this.f2664e[3]);
        if (!(this.f2661b == null || this.f2661b.getChildCount() == 0 || this.f2658A == null)) {
            btVar.m900a(this.f2658A);
        }
        btVar.m907c(this.f2674o);
        btVar.m906c();
        if (this.f2679t == 0) {
            this.f2679t = -2;
        }
        if (this.f2678s == 0) {
            this.f2678s = -2;
        }
        btVar.setLayoutParams(new LayoutParams(this.f2678s, this.f2679t));
        btVar.setFocusable(true);
        btVar.m898a(true, true);
        btVar.setAdjustViewBounds(true);
        this.f2662c.add(btVar);
        View d = btVar.m910d();
        d.setClickable(true);
        d.setOnClickListener(this.f2659B);
        this.f2661b.addView(d);
    }

    public final void m2755a(int[] iArr) {
        this.f2672m.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void a_() {
        if (!this.f2665f) {
            if (this.f2666g && KonyMain.f3656d > 3) {
                this.f2672m.addRule(15);
                this.f2672m.addRule(1, 220);
                this.f2672m.addRule(0, 222);
                ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(9);
                layoutParams.addRule(15);
                this.f2667h = new ImageView(getContext());
                this.f2667h.setId(220);
                this.f2667h.setClickable(true);
                this.f2667h.setBackgroundDrawable(this.f2670k != null ? dB.m1112c(this.f2670k) : dB.m1112c("ic_himagestrip_left.png"));
                this.f2667h.setLayoutParams(layoutParams);
                this.f2667h.setOnClickListener(new bn(this));
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(15);
                layoutParams.addRule(11);
                this.f2668i = new ImageView(getContext());
                this.f2668i.setId(222);
                this.f2668i.setClickable(true);
                this.f2668i.setBackgroundDrawable(this.f2669j != null ? dB.m1112c(this.f2669j) : dB.m1112c("ic_himagestrip_right.png"));
                this.f2668i.setLayoutParams(layoutParams);
                this.f2668i.setOnClickListener(new bo(this));
            }
            this.f2661b.setLayoutParams(this.f2660a);
            addView(this.f2661b);
            m2762c(false);
            this.f2671l.addView(this, this.f2672m);
            if (this.f2666g && KonyMain.f3656d > 3) {
                this.f2671l.addView(this.f2667h);
                this.f2671l.addView(this.f2668i);
            }
            m2744i();
            this.f2665f = true;
        }
    }

    public final void a_(int i) {
        this.f2661b.setVisibility(i);
    }

    public final void a_(boolean z) {
    }

    public final void m2756b(int i) {
    }

    public final void m2757b(dB dBVar) {
        this.f2676q = dBVar;
    }

    public final void m2758b(String str) {
        this.f2681v = str;
    }

    public final void m2759b(boolean z) {
    }

    public final void m2760b(int[] iArr) {
        this.f2664e[0] = iArr[0];
        this.f2664e[1] = iArr[1];
        this.f2664e[2] = iArr[2];
        this.f2664e[3] = iArr[3];
        setPadding(this.f2664e[0], this.f2664e[1], this.f2664e[2], this.f2664e[3]);
    }

    public final View b_() {
        return this.f2671l;
    }

    public final void m2761c(String str) {
    }

    public final void m2762c(boolean z) {
        int i = this.f2677r;
        int size = this.f2662c.size();
        if (!z) {
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 != i) {
                    m2730a(i2, false);
                }
            }
        }
        if (z && i != -1) {
            m2730a(this.f2677r, true);
        }
    }

    public final void c_() {
        Iterator it = this.f2662c.iterator();
        while (it.hasNext()) {
            ((bt) it.next()).m915f();
        }
        this.f2662c.clear();
    }

    public final void c_(int i) {
        this.f2678s = (int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public final void m2763d() {
        if (this.f2667h != null) {
            this.f2667h.setBackgroundDrawable(null);
        }
        if (this.f2668i != null) {
            this.f2668i.setBackgroundDrawable(null);
        }
        c_();
    }

    public final void m2764d(String str) {
        this.f2670k = str;
    }

    public final void m2765d(boolean z) {
        this.f2683x = z;
    }

    public final void d_(int i) {
        this.f2679t = (int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public final int m2766e() {
        return this.f2677r;
    }

    public final void m2767e(String str) {
        this.f2669j = str;
    }

    public final void m2768e(boolean z) {
        this.f2684y = z;
    }

    public final void m2769f() {
        setFocusableInTouchMode(true);
        requestFocus();
        setFocusableInTouchMode(false);
    }

    public final void m2770f(int i) {
        if (this.f2662c.elementAt(i) != null) {
            ((bt) this.f2662c.elementAt(i)).m915f();
        }
        this.f2662c.removeElementAt(i);
    }

    public final void m2771f(String str) {
    }

    public final void m2772f(boolean z) {
        this.f2666g = z;
    }

    public final void m2773g() {
    }

    public final void m2774g(int i) {
        this.f2660a.gravity = i;
        this.f2674o = i;
        this.f2661b.setGravity(i);
    }

    public final void m2775g(String str) {
    }

    public final void m2776h() {
    }

    public final void m2777h(int i) {
        if (i >= 0 && i < this.f2662c.size()) {
            m2730a(this.f2677r, false);
            m2730a(i, true);
            this.f2677r = i;
            m2731a(this.f2661b.getChildAt(this.f2677r));
        }
    }

    public final void m2778i(int i) {
    }

    public final void m2779j(int i) {
    }

    public final void m2780k(int i) {
    }

    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5 = 4;
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f2666g && KonyMain.f3656d > 3 && this.f2661b.getChildCount() > 1) {
            View childAt = this.f2661b.getChildAt(0);
            View childAt2 = this.f2661b.getChildAt(this.f2661b.getChildCount() - 1);
            int[] iArr = new int[2];
            m2732a(childAt, iArr);
            this.f2667h.setVisibility(iArr[0] == 0 ? 4 : 0);
            m2732a(childAt2, iArr);
            ImageView imageView = this.f2668i;
            if (iArr[1] != 0) {
                i5 = 0;
            }
            imageView.setVisibility(i5);
        }
    }

    public final void setSpacing(int i) {
        if (this.f2658A != null) {
            this.f2658A[0] = i;
            return;
        }
        this.f2658A = new int[]{i, 0, 0, 0};
    }
}
