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

public final class bp extends HorizontalScrollView implements C0213o, C0218t {
    private static int f2686B;
    private static int f2687C;
    private static int f2688D;
    private int[] f2689A;
    private int f2690E;
    private OnClickListener f2691F;
    private LayoutParams f2692a;
    private LinearLayout f2693b;
    private Vector f2694c;
    private OnClickListener f2695d;
    private int[] f2696e;
    private boolean f2697f;
    private boolean f2698g;
    private ImageView f2699h;
    private ImageView f2700i;
    private String f2701j;
    private String f2702k;
    private RelativeLayout f2703l;
    private RelativeLayout.LayoutParams f2704m;
    private int f2705n;
    private int f2706o;
    private dB f2707p;
    private dB f2708q;
    private int f2709r;
    private int f2710s;
    private int f2711t;
    private String f2712u;
    private String f2713v;
    private C0210l f2714w;
    private boolean f2715x;
    private boolean f2716y;
    private boolean f2717z;

    static {
        f2686B = 1;
        f2687C = 2;
        f2688D = 3;
    }

    public bp(Context context) {
        super(context);
        this.f2694c = new Vector();
        this.f2696e = new int[4];
        this.f2697f = false;
        this.f2698g = false;
        this.f2705n = 0;
        this.f2706o = 17;
        this.f2709r = -1;
        this.f2710s = 0;
        this.f2711t = 0;
        this.f2717z = false;
        this.f2689A = null;
        this.f2690E = f2687C;
        this.f2691F = new bq(this);
        this.f2703l = new RelativeLayout(context);
        this.f2703l.setLayoutParams(new LayoutParams(-1, -1));
        this.f2693b = new LinearLayout(context);
        this.f2693b.setOrientation(0);
        this.f2692a = new LayoutParams(-1, -1);
        this.f2704m = new RelativeLayout.LayoutParams(-2, -2);
        setHorizontalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(true);
        setMeasureAllChildren(false);
    }

    private void m2783a(int i, boolean z) {
        if (i >= 0 && i < this.f2694c.size()) {
            View childAt = this.f2693b.getChildAt(i);
            if (childAt != null) {
                Drawable drawable = null;
                if (z) {
                    if (this.f2708q != null) {
                        drawable = this.f2708q.m1162p();
                    }
                } else if (this.f2707p != null) {
                    drawable = this.f2707p.m1162p();
                }
                childAt.setBackgroundDrawable(drawable);
            }
        }
    }

    private void m2784a(View view) {
        int[] iArr = new int[2];
        m2785a(view, iArr);
        if (iArr[0] == 0 && iArr[1] > 0) {
            return;
        }
        if (iArr[0] < 0) {
            smoothScrollBy(iArr[0], 0);
        } else if (iArr[1] > 0) {
            smoothScrollBy(iArr[1], 0);
        }
    }

    private void m2785a(View view, int[] iArr) {
        int i;
        int i2;
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        if (!this.f2698g || KonyMain.f3656d <= 3) {
            i = 0;
            i2 = 0;
        } else {
            i2 = this.f2699h.getWidth();
            i = this.f2700i.getWidth();
        }
        iArr[0] = iArr2[0] - i2;
        iArr[1] = (i + (iArr2[0] + view.getWidth())) - rect.right;
    }

    private View m2795h(String str) {
        bw bwVar = new bw(getContext());
        bwVar.m948c(str);
        if (this.f2713v != null) {
            bwVar.m936a(this.f2713v);
        }
        if (this.f2712u != null) {
            bwVar.m944b(this.f2712u);
        }
        bwVar.setPadding(this.f2696e[0], this.f2696e[1], this.f2696e[2], this.f2696e[3]);
        if (!(this.f2693b == null || this.f2693b.getChildCount() == 0 || this.f2689A == null)) {
            bwVar.m941a(this.f2689A);
        }
        bwVar.m950d(this.f2706o);
        bwVar.m946c();
        if (this.f2711t == 0) {
            this.f2711t = -2;
        }
        if (this.f2710s == 0) {
            this.f2710s = -2;
        }
        bwVar.setLayoutParams(new LayoutParams(this.f2710s, this.f2711t));
        bwVar.setFocusable(true);
        bwVar.m939a(true, true);
        bwVar.setAdjustViewBounds(true);
        if (this.f2690E == f2686B) {
            bwVar.m963l();
        } else if (this.f2690E == f2688D) {
            bwVar.m962k();
        }
        this.f2694c.add(bwVar);
        View d = bwVar.m949d();
        d.setClickable(true);
        d.setOnClickListener(this.f2691F);
        return d;
    }

    private void m2798i() {
        if (this.f2699h != null && this.f2700i != null) {
            if (this.f2694c.size() > 1) {
                this.f2699h.setVisibility(0);
                this.f2700i.setVisibility(0);
                if (this.f2705n == this.f2694c.size() - 1) {
                    this.f2700i.setVisibility(4);
                    return;
                } else if (this.f2705n == 0) {
                    this.f2699h.setVisibility(4);
                    return;
                } else {
                    return;
                }
            }
            this.f2699h.setVisibility(4);
            this.f2700i.setVisibility(4);
        }
    }

    public final void m2800a(float f) {
        this.f2692a.width = 0;
        this.f2692a.weight = f;
    }

    public final void m2801a(int i) {
    }

    public final void m2802a(OnClickListener onClickListener) {
        this.f2695d = onClickListener;
    }

    public final void m2803a(dB dBVar) {
        this.f2707p = dBVar;
    }

    public final void m2804a(C0210l c0210l) {
        this.f2714w = c0210l;
    }

    public final void m2805a(String str) {
        this.f2712u = str;
    }

    public final void m2806a(String str, int i) {
        if (str != null && this.f2694c != null) {
            ((bt) ((LinearLayout) this.f2693b.getChildAt(i)).getChildAt(0)).m908c(str);
        }
    }

    public final void m2807a(String str, int i, String str2) {
        if (str != null) {
            this.f2693b.addView(m2795h(str), i);
        }
    }

    public final void m2808a(String str, String str2) {
        this.f2693b.addView(m2795h(str));
    }

    public final void m2809a(int[] iArr) {
        this.f2704m.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void a_() {
        if (!this.f2697f) {
            if (this.f2698g && KonyMain.f3656d > 3) {
                this.f2704m.addRule(15);
                this.f2704m.addRule(1, 220);
                this.f2704m.addRule(0, 222);
                ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(9);
                layoutParams.addRule(15);
                this.f2699h = new ImageView(getContext());
                this.f2699h.setId(220);
                this.f2699h.setClickable(true);
                this.f2699h.setBackgroundDrawable(this.f2702k != null ? dB.m1112c(this.f2702k) : dB.m1112c("ic_himagestrip_left.png"));
                this.f2699h.setLayoutParams(layoutParams);
                this.f2699h.setOnClickListener(new br(this));
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(15);
                layoutParams.addRule(11);
                this.f2700i = new ImageView(getContext());
                this.f2700i.setId(222);
                this.f2700i.setClickable(true);
                this.f2700i.setBackgroundDrawable(this.f2701j != null ? dB.m1112c(this.f2701j) : dB.m1112c("ic_himagestrip_right.png"));
                this.f2700i.setLayoutParams(layoutParams);
                this.f2700i.setOnClickListener(new bs(this));
            }
            this.f2693b.setLayoutParams(this.f2692a);
            addView(this.f2693b);
            m2816c(false);
            this.f2703l.addView(this, this.f2704m);
            if (this.f2698g && KonyMain.f3656d > 3) {
                this.f2703l.addView(this.f2699h);
                this.f2703l.addView(this.f2700i);
            }
            m2798i();
            this.f2697f = true;
        }
    }

    public final void a_(int i) {
        this.f2693b.setVisibility(i);
    }

    public final void a_(boolean z) {
    }

    public final void m2810b(int i) {
    }

    public final void m2811b(dB dBVar) {
        this.f2708q = dBVar;
    }

    public final void m2812b(String str) {
        this.f2713v = str;
    }

    public final void m2813b(boolean z) {
    }

    public final void m2814b(int[] iArr) {
        this.f2696e[0] = iArr[0];
        this.f2696e[1] = iArr[1];
        this.f2696e[2] = iArr[2];
        this.f2696e[3] = iArr[3];
        setPadding(this.f2696e[0], this.f2696e[1], this.f2696e[2], this.f2696e[3]);
    }

    public final View b_() {
        return this.f2703l;
    }

    public final void m2815c(String str) {
    }

    public final void m2816c(boolean z) {
        int i = this.f2709r;
        int size = this.f2694c.size();
        if (!z) {
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 != i) {
                    m2783a(i2, false);
                }
            }
        }
        if (z && i != -1) {
            m2783a(this.f2709r, true);
        }
    }

    public final void c_() {
        Iterator it = this.f2694c.iterator();
        while (it.hasNext()) {
            ((bw) it.next()).m955f();
        }
        this.f2694c.clear();
    }

    public final void c_(int i) {
        this.f2710s = (int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public final void m2817d() {
        if (this.f2699h != null) {
            this.f2699h.setBackgroundDrawable(null);
        }
        if (this.f2700i != null) {
            this.f2700i.setBackgroundDrawable(null);
        }
        c_();
    }

    public final void m2818d(String str) {
        this.f2702k = str;
    }

    public final void m2819d(boolean z) {
        this.f2715x = z;
    }

    public final void d_(int i) {
        this.f2711t = (int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public final int m2820e() {
        return this.f2709r;
    }

    public final void m2821e(String str) {
        this.f2701j = str;
    }

    public final void m2822e(boolean z) {
        this.f2716y = z;
    }

    public final void m2823f() {
        setFocusableInTouchMode(true);
        requestFocus();
        setFocusableInTouchMode(false);
    }

    public final void m2824f(int i) {
        if (this.f2694c.elementAt(i) != null) {
            ((bw) this.f2694c.elementAt(i)).m955f();
        }
        this.f2694c.removeElementAt(i);
    }

    public final void m2825f(String str) {
    }

    public final void m2826f(boolean z) {
        this.f2698g = z;
    }

    public final void m2827g() {
    }

    public final void m2828g(int i) {
        this.f2692a.gravity = i;
        this.f2706o = i;
        this.f2693b.setGravity(i);
    }

    public final void m2829g(String str) {
    }

    public final void m2830h() {
    }

    public final void m2831h(int i) {
        if (i >= 0 && i < this.f2694c.size()) {
            m2783a(this.f2709r, false);
            m2783a(i, true);
            this.f2709r = i;
            m2784a(this.f2693b.getChildAt(this.f2709r));
        }
    }

    public final void m2832i(int i) {
        this.f2690E = i;
    }

    public final void m2833j(int i) {
        this.f2692a.height = i;
    }

    public final void m2834k(int i) {
        this.f2692a.width = i;
    }

    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5 = 4;
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f2698g && KonyMain.f3656d > 3 && this.f2693b.getChildCount() > 1) {
            View childAt = this.f2693b.getChildAt(0);
            View childAt2 = this.f2693b.getChildAt(this.f2693b.getChildCount() - 1);
            int[] iArr = new int[2];
            m2785a(childAt, iArr);
            this.f2699h.setVisibility(iArr[0] == 0 ? 4 : 0);
            m2785a(childAt2, iArr);
            ImageView imageView = this.f2700i;
            if (iArr[1] != 0) {
                i5 = 0;
            }
            imageView.setVisibility(i5);
        }
    }

    public final void setSpacing(int i) {
        if (this.f2689A != null) {
            this.f2689A[0] = i;
            return;
        }
        this.f2689A = new int[]{i, 0, 0, 0};
    }
}
