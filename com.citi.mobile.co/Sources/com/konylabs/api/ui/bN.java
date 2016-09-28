package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import ny0k.cM;

public final class bN extends View {
    private LayoutParams f724a;
    private LayoutParams f725b;
    private LinearLayout f726c;
    private int f727d;
    private Paint f728e;
    private int f729f;
    private int f730g;
    private int f731h;
    private cM f732i;
    private boolean f733j;
    private Rect f734k;

    public bN(Context context) {
        super(context);
        this.f724a = null;
        this.f725b = null;
        this.f726c = null;
        this.f727d = 2;
        this.f733j = false;
        this.f726c = new LinearLayout(context);
        this.f724a = new LayoutParams(-2, -2);
        this.f725b = new LayoutParams(-2, -2);
        this.f726c.addView(this, this.f725b);
        this.f728e = new Paint();
        this.f728e.setStyle(Style.FILL_AND_STROKE);
        this.f728e.setDither(true);
        this.f728e.setAntiAlias(true);
    }

    public static void m756d() {
    }

    public final void m757a() {
        this.f733j = false;
        m762b();
    }

    public final void m758a(int i) {
        this.f728e.setColor(i);
        invalidate();
    }

    public final void m759a(cM cMVar) {
        this.f732i = cMVar;
        if (this.f733j && cMVar != null) {
            this.f728e.setShader(cMVar.m2138a((float) getWidth(), (float) getHeight()));
            invalidate();
        }
    }

    public final void m760a(boolean z) {
        int i = -1;
        this.f724a.width = z ? -1 : -2;
        LayoutParams layoutParams = this.f725b;
        if (!z) {
            i = -2;
        }
        layoutParams.width = i;
    }

    public final void m761a(int[] iArr) {
        ez.m1344a(iArr, this.f726c, this.f724a);
    }

    public final void m762b() {
        if (!this.f733j) {
            this.f726c.setLayoutParams(this.f724a);
            this.f733j = true;
        }
    }

    public final void m763b(int i) {
        this.f727d = i;
        m767d(this.f731h);
    }

    public final void m764b(boolean z) {
        this.f725b.height = -2;
    }

    public final View m765c() {
        return this.f726c;
    }

    public final void m766c(int i) {
        if (i == 1) {
            this.f730g = 1;
            m767d(1);
            this.f728e.setPathEffect(new DashPathEffect(new float[]{2.0f, 2.0f, 2.0f, 2.0f}, 1.0f));
        } else if (i == 0) {
            this.f728e.setPathEffect(null);
            m767d(this.f729f);
        }
        invalidate();
    }

    public final void m767d(int i) {
        this.f731h = i;
        int r = dB.m1116r(i);
        if (this.f730g == 0) {
            this.f729f = r;
        }
        this.f728e.setStrokeWidth((float) r);
        if (this.f727d == 1) {
            this.f725b.height = r;
            this.f725b.width = -1;
            this.f724a.width = -1;
            return;
        }
        this.f725b.width = r;
        this.f725b.height = -1;
        this.f724a.height = -1;
        this.f724a.width = r;
    }

    public final void m768e(int i) {
        this.f726c.setVisibility(i);
    }

    public final void m769f(int i) {
        this.f724a.gravity = i;
        this.f726c.setGravity(i);
    }

    protected final void onDraw(Canvas canvas) {
        float f = (float) this.f734k.left;
        float f2 = (float) this.f734k.right;
        float f3 = (float) this.f734k.top;
        float f4 = (float) this.f734k.bottom;
        if (this.f727d == 1) {
            f4 = (f4 - f3) / 2.0f;
            f3 = f4;
        } else if (this.f727d == 2) {
            f2 = (f2 - f) / 2.0f;
            f = f2;
        } else {
            f4 = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
            f = 0.0f;
        }
        canvas.drawLine(f, f3, f2, f4, this.f728e);
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f734k != null) {
            this.f734k.set(i, i2, i3, i4);
        } else {
            this.f734k = new Rect(i, i2, i3, i4);
        }
    }

    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f732i != null) {
            this.f728e.setShader(this.f732i.m2138a((float) i, (float) i2));
        }
    }
}
