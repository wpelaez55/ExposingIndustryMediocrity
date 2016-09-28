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

public final class bG extends GridView {
    public static int f667a;
    public static int f668b;
    public static int f669c;
    private static int f670f;
    private static int f671g;
    private static int f672h;
    private static int f673i;
    private static int f674j;
    private static int f675k;
    private static int f676l;
    private int f677A;
    private int f678B;
    private int f679C;
    private int f680D;
    OnClickListener f681d;
    int f682e;
    private Vector f683m;
    private LayoutParams f684n;
    private dB f685o;
    private dB f686p;
    private int f687q;
    private int f688r;
    private bJ f689s;
    private String f690t;
    private String f691u;
    private OnItemClickListener f692v;
    private OnItemSelectedListener f693w;
    private boolean f694x;
    private Drawable f695y;
    private Drawable f696z;

    static {
        f670f = dB.m1116r(85);
        f671g = dB.m1116r(85);
        f672h = dB.m1116r(10);
        f673i = dB.m1116r(10);
        f674j = dB.m1116r(90);
        f667a = 1;
        f675k = 2;
        f668b = 3;
        f676l = 1;
        f669c = 0;
    }

    public bG(Context context) {
        super(context);
        this.f683m = new Vector();
        this.f685o = null;
        this.f686p = null;
        this.f687q = f670f;
        this.f688r = f671g;
        this.f682e = -1;
        this.f690t = null;
        this.f691u = null;
        this.f692v = new bH(this);
        this.f693w = new bI(this);
        this.f694x = false;
        this.f695y = null;
        this.f696z = null;
        this.f677A = 0;
        this.f678B = 0;
        this.f679C = 0;
        this.f680D = f675k;
        this.f684n = new LayoutParams(-1, -2);
        setNumColumns(-1);
        setGravity(17);
        setVerticalSpacing(f672h);
        setHorizontalSpacing(f673i);
        setColumnWidth(f674j);
        this.f689s = new bJ(this, context);
        setAdapter(this.f689s);
        setOnItemClickListener(this.f692v);
        setOnItemSelectedListener(this.f693w);
        setScrollContainer(false);
    }

    private void m685a(bK bKVar, int i) {
        if (bKVar != null && bKVar.f702b != null) {
            if (i == 0) {
                bKVar.f702b.setBackgroundDrawable(this.f695y);
            } else if (i == f676l) {
                bKVar.f702b.setBackgroundDrawable(this.f696z);
            }
        }
    }

    private int m692g() {
        return (this.f685o == null || this.f686p == null) ? this.f685o != null ? this.f685o.m1158n() : this.f686p != null ? this.f686p.m1158n() : -1 : this.f685o.m1158n() > this.f686p.m1158n() ? this.f685o.m1158n() : this.f686p.m1158n();
    }

    public final void m698a() {
        for (int i = 0; i < this.f683m.size(); i++) {
            if (((bK) this.f683m.elementAt(i)).f702b != null) {
                ((bK) this.f683m.elementAt(i)).f702b.m955f();
                ((bK) this.f683m.elementAt(i)).f702b = null;
            }
        }
        this.f683m.clear();
    }

    public final void m699a(float f) {
        this.f684n.width = 0;
        this.f684n.weight = f;
        requestLayout();
    }

    public final void m700a(int i) {
        super.setVisibility(i);
    }

    public final void m701a(OnClickListener onClickListener) {
        this.f681d = onClickListener;
    }

    public final void m702a(dB dBVar) {
        this.f686p = dBVar;
        if (dBVar != null) {
            this.f695y = dBVar.m1162p();
        } else {
            this.f695y = null;
        }
    }

    public final void m703a(String str) {
        this.f690t = str;
    }

    public final void m704a(String str, int i) {
        if (str != null && this.f683m != null) {
            bK bKVar = (bK) this.f683m.elementAt(i);
            if (bKVar.f702b != null) {
                bKVar.f702b.m955f();
                bKVar.f702b = null;
            }
            bKVar.f701a = str;
            this.f689s.notifyDataSetChanged();
        }
    }

    public final void m705a(int[] iArr) {
        this.f684n.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void m706b() {
        this.f689s.notifyDataSetChanged();
    }

    public final void m707b(int i) {
        this.f683m.removeElementAt(i);
    }

    public final void m708b(dB dBVar) {
        this.f685o = dBVar;
        if (dBVar != null) {
            this.f696z = dBVar.m1162p();
        } else {
            this.f696z = null;
        }
    }

    public final void m709b(String str) {
        this.f691u = str;
    }

    public final void m710b(String str, int i) {
        if (str != null && this.f683m != null) {
            bK bKVar = new bK(this, str);
            if (i < 0 || i > this.f683m.size() - 1) {
                this.f683m.add(bKVar);
            } else {
                this.f683m.add(i, bKVar);
            }
            this.f689s.notifyDataSetChanged();
        }
    }

    public final void m711b(int[] iArr) {
        setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void m712c() {
        int i = 0;
        int g = m692g();
        if (g != -1) {
            int size = this.f683m != null ? this.f683m.size() : 0;
            while (i < size) {
                ((bK) this.f683m.elementAt(i)).f702b.setPadding(g, g, g, g);
                i++;
            }
        }
    }

    public final void m713c(int i) {
        int size = this.f683m.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != this.f682e) {
                m685a((bK) this.f683m.elementAt(i2), f676l);
            }
        }
        if (i == 0 && this.f682e != -1) {
            m685a((bK) this.f683m.elementAt(this.f682e), 0);
        }
    }

    public final void m714c(String str) {
        this.f683m.add(new bK(this, str));
    }

    public final void m715d() {
        this.f694x = false;
        m717e();
    }

    public final void m716d(int i) {
        f673i = i;
        setHorizontalSpacing(i);
    }

    public final void m717e() {
        if (!this.f694x) {
            int g = m692g();
            if (g != -1) {
                this.f677A = g;
                setPadding(g, g, g, g);
            }
            setLayoutParams(this.f684n);
            this.f694x = true;
        }
    }

    public final void m718e(int i) {
        setFocusableInTouchMode(true);
        setSelection(i);
        this.f682e = i;
    }

    public final int m719f() {
        return getChildCount() == 0 ? -1 : this.f682e;
    }

    public final void m720f(int i) {
        this.f678B = dB.m1116r(i);
    }

    public final void m721g(int i) {
        this.f679C = dB.m1116r(i);
    }

    public final void m722h(int i) {
        this.f680D = i;
    }

    public final void m723i(int i) {
        this.f684n.height = i;
    }

    public final void m724j(int i) {
        this.f684n.width = i;
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (MeasureSpec.getMode(i2) == 0) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int measuredWidth = (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) + f673i) / (f674j + f673i);
            if (measuredWidth <= 0) {
                measuredWidth = 1;
            }
            int size = this.f683m.size();
            int r = dB.m1116r(10);
            int i3 = paddingTop;
            for (paddingTop = 0; paddingTop < size; paddingTop += measuredWidth) {
                i3 += this.f688r;
                if (paddingTop + measuredWidth < size) {
                    i3 += r;
                }
            }
            setMeasuredDimension(getMeasuredWidth(), i3);
        }
    }
}
