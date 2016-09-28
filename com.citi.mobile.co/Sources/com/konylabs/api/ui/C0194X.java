package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.datavisualization.chartInterfacejson.KGLChartInterfaceJson;

/* renamed from: com.konylabs.api.ui.X */
public final class C0194X extends LinearLayout {
    private Context f340a;
    private View f341b;
    private KGLChartInterfaceJson f342c;
    private LayoutParams f343d;
    private boolean f344e;
    private Rect f345f;
    private Rect f346g;

    public C0194X(Context context, KGLChartInterfaceJson kGLChartInterfaceJson, String str) {
        super(context);
        this.f343d = null;
        this.f344e = false;
        this.f345f = null;
        this.f346g = null;
        this.f340a = context;
        this.f343d = new LayoutParams(-2, -2);
        this.f342c = kGLChartInterfaceJson;
        this.f342c.SetWidgetID(str);
    }

    public final void m326a() {
        if (!this.f344e) {
            if (this.f341b == null) {
                this.f341b = this.f342c.getChartView(this.f340a);
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayMetrics = getContext().getResources().getDisplayMetrics();
            float f = (float) displayMetrics.heightPixels;
            float f2 = (float) displayMetrics.widthPixels;
            f2 = f > f2 ? f - 100.0f : f2 - 100.0f;
            f = (((float) this.f342c.GetChartHeight()) / 100.0f) * f2;
            if (f > 0.0f && f < f2) {
                f2 = f;
            }
            this.f343d.height = (int) f2;
            setLayoutParams(this.f343d);
            if (this.f341b != null) {
                addView(this.f341b, this.f343d);
            }
            this.f344e = true;
        }
    }

    public final void m327a(float f) {
        this.f343d.weight = f;
    }

    public final void m328a(int i) {
        setVisibility(i);
    }

    public final void m329a(boolean z) {
        this.f343d.width = z ? -1 : -2;
    }

    public final void m330a(int[] iArr) {
        this.f346g = new Rect();
        this.f346g.left = iArr[0];
        this.f346g.top = iArr[1];
        this.f346g.right = iArr[2];
        this.f346g.bottom = iArr[3];
        this.f343d.setMargins(this.f346g.left, this.f346g.top, this.f346g.right, this.f346g.bottom);
    }

    public final View m331b() {
        return this;
    }

    public final void m332b(int i) {
        if (this.f341b != null) {
            this.f341b.setVisibility(i);
        }
    }

    public final void m333b(boolean z) {
        this.f343d.height = z ? -1 : -2;
    }

    public final void m334b(int[] iArr) {
        this.f345f = new Rect();
        this.f345f.left = iArr[0];
        this.f345f.top = iArr[1];
        this.f345f.right = iArr[2];
        this.f345f.bottom = iArr[3];
    }
}
