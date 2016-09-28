package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class aq extends C0203f implements C0213o {
    public static int f2591e;
    public static int f2592f;
    private static int f2593o;
    public String f2594b;
    public String f2595c;
    public int f2596d;
    private LinearLayout f2597g;
    private ArrayList f2598h;
    private Rect f2599i;
    private boolean f2600j;
    private int f2601k;
    private int f2602l;
    private ar f2603m;
    private OnClickListener f2604n;
    private int f2605p;
    private boolean f2606q;

    static {
        f2591e = 1;
        f2593o = 2;
        f2592f = 3;
    }

    public aq(Context context) {
        super(context);
        this.f2601k = dB.m1116r(100);
        this.f2602l = dB.m1116r(100);
        this.f2605p = f2593o;
        this.f2606q = false;
        this.f2598h = new ArrayList();
        this.f2597g = new LinearLayout(context);
        this.f2603m = new ar(this, context);
        m1391a(this.f2603m);
        m1392a(new as());
    }

    public final void m2632a(float f) {
    }

    public final void m2633a(int i) {
    }

    public final void m2634a(OnClickListener onClickListener) {
        this.f2604n = onClickListener;
    }

    public final void m2635a(dB dBVar) {
    }

    public final void m2636a(String str) {
        this.f2595c = str;
    }

    public final void m2637a(String str, int i) {
        this.f2598h.set(i, str);
    }

    public final void m2638a(String str, int i, String str2) {
        if (str != null && this.f2598h != null) {
            this.f2598h.add(i, str);
        }
    }

    public final void m2639a(String str, String str2) {
        this.f2598h.add(str);
    }

    public final void m2640a(int[] iArr) {
        this.f2599i = new Rect(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void a_() {
        if (!this.f2600j) {
            LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (this.f2599i != null) {
                ez.m1344a(new int[]{this.f2599i.left, this.f2599i.top, this.f2599i.right, this.f2599i.bottom}, this.f2597g, layoutParams);
            }
            this.f2597g.setLayoutParams(layoutParams);
            this.f2597g.addView(this, new LinearLayout.LayoutParams(-1, -2));
            this.f2600j = true;
        }
    }

    public final void a_(int i) {
        this.f2597g.setVisibility(i);
    }

    public final void a_(boolean z) {
    }

    public final void m2641b(dB dBVar) {
    }

    public final void m2642b(String str) {
        this.f2594b = str;
        if (str == null) {
            return;
        }
        if (this.f2602l == 0 || this.f2601k == 0) {
            Drawable c = dB.m1112c(str);
            if (this.f2602l == 0) {
                this.f2602l = c.getIntrinsicWidth();
            }
            if (this.f2601k == 0) {
                this.f2601k = c.getIntrinsicHeight();
            }
        }
    }

    public final void m2643b(boolean z) {
    }

    public final void m2644b(int[] iArr) {
    }

    public final View b_() {
        return this.f2597g;
    }

    public final void m2645c(String str) {
    }

    public final void m2646c(boolean z) {
    }

    public final void c_() {
        this.f2598h.clear();
    }

    public final void c_(int i) {
        this.f2602l = dB.m1116r(i);
    }

    public final void m2647d() {
        m1391a(null);
        this.f2598h = null;
    }

    public final void d_(int i) {
        this.f2601k = dB.m1116r(i);
    }

    public final int m2648e() {
        return this.f2596d;
    }

    public final void m2649f() {
    }

    public final void m2650f(int i) {
        this.f2598h.remove(i);
    }

    public final void m2651g() {
        this.f2603m.notifyDataSetChanged();
    }

    public final void m2652g(int i) {
    }

    public final void m2653h() {
        this.f2606q = true;
        this.f2603m.notifyDataSetChanged();
        this.f2606q = false;
        this.f2597g.requestLayout();
    }

    public final void m2654h(int i) {
        if (i >= 0 && i < this.f2603m.getCount()) {
            this.f2596d = i;
        }
        m1397c(i, true);
    }

    public final void m2655i(int i) {
        this.f2605p = i;
    }

    public final void m2656j(int i) {
    }

    public final void m2657k(int i) {
    }

    public final void setSpacing(int i) {
        m1395b(i, true);
    }
}
