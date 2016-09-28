package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.GridView;
import android.widget.LinearLayout.LayoutParams;
import java.util.Vector;

public final class bA extends GridView {
    public static int f635a;
    public static int f636b;
    public static int f637c;
    public static int f638d;
    private static int f639i;
    private static int f640j;
    private static int f641k;
    OnClickListener f642e;
    bD f643f;
    Vector f644g;
    int f645h;
    private LayoutParams f646l;
    private boolean f647m;
    private boolean f648n;
    private dB f649o;
    private dB f650p;
    private bE f651q;
    private String f652r;
    private String f653s;
    private OnItemClickListener f654t;
    private OnItemSelectedListener f655u;
    private boolean f656v;
    private Drawable f657w;
    private Drawable f658x;
    private int f659y;

    static {
        f635a = dB.m1116r(85);
        f636b = dB.m1116r(85);
        f639i = dB.m1116r(10);
        f640j = dB.m1116r(10);
        f641k = dB.m1116r(90);
        f637c = 1;
        f638d = 0;
    }

    public bA(Context context) {
        super(context);
        this.f644g = new Vector();
        this.f649o = null;
        this.f650p = null;
        this.f645h = -1;
        this.f652r = null;
        this.f653s = null;
        this.f654t = new bB(this);
        this.f655u = new bC(this);
        this.f656v = false;
        this.f657w = null;
        this.f658x = null;
        this.f659y = 0;
        this.f646l = new LayoutParams(-1, -2);
        setNumColumns(-1);
        setGravity(17);
        setVerticalSpacing(f639i);
        setHorizontalSpacing(f640j);
        setColumnWidth(f641k);
        this.f651q = new bE(this, context);
        setAdapter(this.f651q);
        setOnItemClickListener(this.f654t);
        setOnItemSelectedListener(this.f655u);
        setScrollContainer(false);
    }

    private void m652a(bF bFVar, int i) {
        if (bFVar != null && bFVar.f666b != null) {
            if (i == 0) {
                bFVar.f666b.setBackgroundDrawable(this.f657w);
            } else if (i == f637c) {
                bFVar.f666b.setBackgroundDrawable(this.f658x);
            }
        }
    }

    private int m658g() {
        return (this.f649o == null || this.f650p == null) ? this.f649o != null ? this.f649o.m1158n() : this.f650p != null ? this.f650p.m1158n() : -1 : this.f649o.m1158n() > this.f650p.m1158n() ? this.f649o.m1158n() : this.f650p.m1158n();
    }

    public final void m660a() {
        for (int i = 0; i < this.f644g.size(); i++) {
            if (((bF) this.f644g.elementAt(i)).f666b != null) {
                ((bF) this.f644g.elementAt(i)).f666b.m915f();
                ((bF) this.f644g.elementAt(i)).f666b = null;
            }
        }
        this.f644g.clear();
    }

    public final void m661a(int i) {
        super.setVisibility(i);
    }

    public final void m662a(OnClickListener onClickListener) {
        this.f642e = onClickListener;
    }

    public final void m663a(bD bDVar) {
        this.f643f = bDVar;
    }

    public final void m664a(dB dBVar) {
        this.f650p = dBVar;
        if (dBVar != null) {
            this.f657w = dBVar.m1162p();
        } else {
            this.f657w = null;
        }
    }

    public final void m665a(String str) {
        this.f652r = str;
    }

    public final void m666a(String str, int i) {
        if (str != null && this.f644g != null) {
            bF bFVar = (bF) this.f644g.elementAt(i);
            if (bFVar.f666b != null) {
                bFVar.f666b.m915f();
                bFVar.f666b = null;
            }
            bFVar.f665a = str;
            this.f651q.notifyDataSetChanged();
        }
    }

    public final void m667a(boolean z) {
        this.f647m = z;
    }

    public final void m668a(int[] iArr) {
        this.f646l.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void m669b() {
        this.f651q.notifyDataSetChanged();
    }

    public final void m670b(int i) {
        this.f644g.removeElementAt(i);
    }

    public final void m671b(dB dBVar) {
        this.f649o = dBVar;
        if (dBVar != null) {
            this.f658x = dBVar.m1162p();
        } else {
            this.f658x = null;
        }
    }

    public final void m672b(String str) {
        this.f653s = str;
    }

    public final void m673b(boolean z) {
        this.f648n = z;
    }

    public final void m674b(int[] iArr) {
        setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void m675c() {
        int i = 0;
        int g = m658g();
        if (g != -1) {
            int size = this.f644g != null ? this.f644g.size() : 0;
            while (i < size) {
                ((bF) this.f644g.elementAt(i)).f666b.setPadding(g, g, g, g);
                i++;
            }
        }
    }

    public final void m676c(int i) {
        int size = this.f644g.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != this.f645h) {
                m652a((bF) this.f644g.elementAt(i2), f637c);
            }
        }
        if (i == 0 && this.f645h != -1) {
            m652a((bF) this.f644g.elementAt(this.f645h), 0);
        }
    }

    public final void m677c(String str) {
        this.f644g.add(new bF(this, str));
    }

    public final void m678d() {
        this.f656v = false;
        m680e();
    }

    public final void m679d(int i) {
        f640j = i;
        setHorizontalSpacing(i);
    }

    public final void m680e() {
        if (!this.f656v) {
            int g = m658g();
            if (g != -1) {
                this.f659y = g;
                setPadding(g, g, g, g);
            }
            setLayoutParams(this.f646l);
            this.f656v = true;
        }
    }

    public final int m681f() {
        return getChildCount() == 0 ? -1 : this.f645h;
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (MeasureSpec.getMode(i2) == 0) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int measuredWidth = (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) + f640j) / (f641k + f640j);
            if (measuredWidth <= 0) {
                measuredWidth = 1;
            }
            int size = this.f644g.size();
            int i3 = paddingTop;
            for (paddingTop = 0; paddingTop < size; paddingTop += measuredWidth) {
                i3 += f636b;
                if (paddingTop + measuredWidth < size) {
                    i3 += 10;
                }
            }
            setMeasuredDimension(getMeasuredWidth(), i3);
        }
    }
}
