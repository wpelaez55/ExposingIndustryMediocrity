package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class ao extends C0197a implements C0213o {
    public String f2580a;
    public String f2581b;
    public int f2582c;
    public int f2583d;
    public int f2584e;
    private LinearLayout f2585f;
    private ArrayList f2586g;
    private Rect f2587h;
    private boolean f2588i;
    private ap f2589j;
    private OnClickListener f2590k;

    public ao(Context context) {
        super(context);
        this.f2586g = new ArrayList();
        this.f2585f = new LinearLayout(context);
        this.f2589j = new ap(this, context);
        m407a(this.f2589j);
        m408a(new C0202e());
    }

    public final void m2599a(float f) {
    }

    public final void m2600a(OnClickListener onClickListener) {
        this.f2590k = onClickListener;
    }

    public final void m2601a(dB dBVar) {
    }

    public final void m2602a(String str) {
        this.f2581b = str;
    }

    public final void m2603a(String str, int i) {
        this.f2586g.set(i, str);
    }

    public final void m2604a(String str, int i, String str2) {
    }

    public final void m2605a(String str, String str2) {
        this.f2586g.add(str);
    }

    public final void m2606a(int[] iArr) {
        this.f2587h = new Rect(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void a_() {
        if (!this.f2588i) {
            LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (this.f2587h != null) {
                ez.m1344a(new int[]{this.f2587h.left, this.f2587h.top, this.f2587h.right, this.f2587h.bottom}, this.f2585f, layoutParams);
            }
            this.f2585f.setLayoutParams(layoutParams);
            this.f2585f.addView(this, new LinearLayout.LayoutParams(-1, -2));
            this.f2588i = true;
        }
    }

    public final void a_(int i) {
        this.f2585f.setVisibility(i);
    }

    public final void a_(boolean z) {
    }

    public final void m2607b(dB dBVar) {
    }

    public final void m2608b(String str) {
        this.f2580a = str;
        if (str == null) {
            return;
        }
        if (this.f2583d == 0 || this.f2582c == 0) {
            Drawable c = dB.m1112c(str);
            if (this.f2583d == 0) {
                this.f2583d = c.getIntrinsicWidth();
            }
            if (this.f2582c == 0) {
                this.f2582c = c.getIntrinsicHeight();
            }
        }
    }

    public final void m2609b(boolean z) {
    }

    public final void m2610b(int[] iArr) {
    }

    public final View b_() {
        return this.f2585f;
    }

    public final void m2611c(String str) {
    }

    public final void m2612c(boolean z) {
    }

    public final void c_() {
        this.f2586g.clear();
    }

    public final void c_(int i) {
        this.f2583d = (int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public final void m2613d() {
        this.f2586g = null;
    }

    public final void d_(int i) {
        this.f2582c = (int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f);
    }

    public final int m2614e() {
        return this.f2584e;
    }

    public final void m2615f() {
    }

    public final void m2616f(int i) {
        this.f2586g.remove(i);
    }

    public final void m2617g() {
        this.f2589j.notifyDataSetChanged();
    }

    public final void m2618g(int i) {
    }

    public final void m2619h() {
    }

    public final void m2620h(int i) {
        b_(i);
    }

    public final void m2621i(int i) {
    }

    public final void m2622j(int i) {
    }

    public final void m2623k(int i) {
    }

    public final void setSpacing(int i) {
        m410c((int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f));
    }
}
