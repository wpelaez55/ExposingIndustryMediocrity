package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewConfiguration;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.android.KonyMain;
import java.util.Vector;

public final class dm extends LinearLayout implements C0215q {
    private LinearLayout f2899A;
    private C0217s f2900B;
    private int f2901C;
    private OnFocusChangeListener f2902D;
    private OnClickListener f2903E;
    private OnItemClickListener f2904F;
    private OnItemSelectedListener f2905G;
    private OnClickListener f2906H;
    Button f2907c;
    Gallery f2908d;
    int f2909e;
    int f2910f;
    OnFocusChangeListener f2911g;
    private ie f2912h;
    private Vector f2913i;
    private dB f2914j;
    private dB f2915k;
    private int f2916l;
    private int f2917m;
    private C0216r f2918n;
    private Drawable f2919o;
    private Drawable f2920p;
    private String f2921q;
    private String f2922r;
    private du f2923s;
    private int f2924t;
    private int f2925u;
    private int[] f2926v;
    private LinearLayout f2927w;
    private Button f2928x;
    private boolean f2929y;
    private LayoutParams f2930z;

    public dm(Context context) {
        super(context);
        this.f2913i = new Vector();
        this.f2916l = 0;
        this.f2917m = 0;
        this.f2919o = null;
        this.f2920p = null;
        this.f2921q = null;
        this.f2922r = null;
        this.f2924t = 0;
        this.f2925u = 0;
        this.f2926v = new int[4];
        this.f2929y = false;
        this.f2899A = null;
        this.f2908d = null;
        this.f2910f = -1;
        this.f2902D = new C0201do(this);
        this.f2903E = new dp(this);
        this.f2904F = new dq(this);
        this.f2911g = new dr(this);
        this.f2905G = new ds(this);
        this.f2906H = new dt(this);
        this.f2923s = new du(this);
        this.f2901C = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f2908d = new dn(this, getContext());
        this.f2908d.setLayoutParams(new Gallery.LayoutParams(-1, -2));
        this.f2908d.setAdapter(this.f2923s);
        this.f2908d.setFocusable(true);
        this.f2908d.setOnItemClickListener(this.f2904F);
        this.f2908d.setOnItemSelectedListener(this.f2905G);
        this.f2908d.setOnFocusChangeListener(this.f2902D);
        this.f2908d.setSpacing(0);
        this.f2908d.setVerticalFadingEdgeEnabled(false);
        this.f2908d.setHorizontalFadingEdgeEnabled(false);
        this.f2908d.setClipChildren(false);
        this.f2930z = new LayoutParams(-1, -2);
        this.f2899A = new LinearLayout(getContext());
        this.f2899A.setOrientation(0);
        this.f2899A.setGravity(17);
        this.f2899A.setLayoutParams(new Gallery.LayoutParams(-1, -2));
    }

    static /* synthetic */ Drawable m3152a(dm dmVar, dB dBVar) {
        Drawable a = dBVar.m1117a();
        int n = dBVar.m1158n();
        if (dBVar.m1126b() == null || a == null) {
            return a;
        }
        Drawable layerDrawable = new LayerDrawable(new Drawable[]{r4, a});
        layerDrawable.setLayerInset(1, n, n, n, n);
        return layerDrawable;
    }

    private void m3155a(dv dvVar, boolean z, int i) {
        Drawable drawable = null;
        if (dvVar != null) {
            View a = dvVar.m1274a(i);
            if (a == null) {
                return;
            }
            if (z) {
                if (dvVar.f1230b != null) {
                    ih ihVar = dvVar.f1230b;
                    if (ihVar.f1548b != null) {
                        Drawable a2;
                        if (ihVar.f1548b.m1142g() == 0) {
                            ihVar.f1548b.m1128b(-3355444);
                            a2 = ihVar.f1548b.m1117a();
                            ihVar.f1548b.m1128b(0);
                            drawable = a2;
                        } else {
                            drawable = ihVar.f1548b.m1117a();
                        }
                        if (!(ihVar.f1548b.m1126b() == null || drawable == null)) {
                            a2 = new LayerDrawable(new Drawable[]{r4, drawable});
                            int n = ihVar.f1548b.m1158n();
                            a2.setLayerInset(1, n, n, n, n);
                            drawable = a2;
                        }
                    }
                }
                if (drawable != null) {
                    a.setBackgroundDrawable(drawable);
                } else if (this.f2919o != null) {
                    a.setBackgroundDrawable(this.f2919o);
                }
            } else if (this.f2920p != null) {
                a.setBackgroundDrawable(dvVar.m1273a());
            }
        }
    }

    private void m3163f(int i) {
        if (this.f2899A != null && this.f2921q != null && this.f2922r != null && this.f2899A.getVisibility() != 8) {
            if (KonyMain.f3657e) {
                Log.d("KonySegUIPageView", "Got focusPosition = " + i + " paginationFocusbkgrnd = " + this.f2921q + " paginationffFocusbkgrnd = " + this.f2922r);
            }
            LinearLayout linearLayout = (LinearLayout) this.f2899A.getChildAt(i);
            if (linearLayout != null && linearLayout.getChildCount() > 0) {
                bt btVar = (bt) linearLayout.getChildAt(0);
                if (KonyMain.f3657e) {
                    Log.d("KonySegUIPageView", "Setting focus for pageData = " + btVar + " for position = " + i);
                }
                btVar.m908c(this.f2921q);
                btVar.m916h();
                if (this.f2925u != i && this.f2925u < this.f2899A.getChildCount()) {
                    btVar = (bt) ((LinearLayout) this.f2899A.getChildAt(this.f2925u)).getChildAt(0);
                    if (KonyMain.f3657e) {
                        Log.d("KonySegUIPageView", "Removing focus for pageData = " + btVar + " for position = " + this.f2925u);
                    }
                    btVar.m908c(this.f2922r);
                    btVar.m916h();
                }
            }
        }
    }

    static /* synthetic */ int m3167j(dm dmVar) {
        return dmVar.f2916l > dmVar.f2917m ? dmVar.f2916l : dmVar.f2917m;
    }

    private void m3171m() {
        int childCount = this.f2899A.getChildCount();
        bt btVar = new bt(getContext());
        btVar.m908c(this.f2922r);
        btVar.m900a(new int[]{5, 5, 5, 5});
        btVar.setLayoutParams(new LayoutParams(-1, -2));
        btVar.setOnClickListener(this.f2903E);
        btVar.setTag(new Integer(childCount));
        btVar.m906c();
        this.f2899A.addView(btVar.m910d());
    }

    public final View m3172a() {
        return (this.f2923s == null || this.f2923s.isEmpty()) ? null : ((LinearLayout) this.f2923s.getItem(this.f2924t)).getChildAt(0);
    }

    public final void m3173a(int i) {
        super.setVisibility(i);
    }

    public final void m3174a(View view) {
    }

    public final void m3175a(View view, int i, int i2, ih ihVar) {
        dv dvVar = new dv(this, view);
        dvVar.f1230b = ihVar;
        this.f2913i.add(i, dvVar);
        this.f2923s.notifyDataSetChanged();
        m3171m();
        m3163f(0);
    }

    public final void m3176a(View view, int i, ih ihVar) {
        dv dvVar = new dv(this, view);
        dvVar.f1230b = ihVar;
        this.f2913i.add(dvVar);
        this.f2923s.notifyDataSetChanged();
        m3171m();
        m3163f(0);
    }

    public final void m3177a(ie ieVar) {
        this.f2912h = ieVar;
    }

    public final void m3178a(C0216r c0216r) {
        this.f2918n = c0216r;
    }

    public final void m3179a(C0217s c0217s) {
        this.f2900B = c0217s;
    }

    public final void m3180a(String str) {
    }

    public final void m3181a(boolean z) {
        if (this.f2899A != null) {
            this.f2899A.setVisibility(z ? 0 : 8);
        }
    }

    public final void m3182a(boolean z, boolean z2) {
        int i = 0;
        if (this.f2927w == null) {
            this.f2927w = new LinearLayout(getContext());
            this.f2927w.setGravity(5);
            if (this.f2907c == null) {
                this.f2907c = new Button(getContext());
                this.f2907c.setText("Prev");
                this.f2907c.setOnClickListener(this.f2906H);
                this.f2927w.addView(this.f2907c);
                this.f2907c.setVisibility(z ? 0 : 8);
            }
            if (this.f2928x == null) {
                this.f2928x = new Button(getContext());
                this.f2928x.setText("Next");
                this.f2928x.setOnClickListener(this.f2906H);
                this.f2927w.addView(this.f2928x);
                Button button = this.f2928x;
                if (!z2) {
                    i = 8;
                }
                button.setVisibility(i);
            }
            super.addView(this.f2927w);
            return;
        }
        this.f2907c.setVisibility(z ? 0 : 8);
        button = this.f2928x;
        if (!z2) {
            i = 8;
        }
        button.setVisibility(i);
    }

    public final void m3183a(int[] iArr) {
        for (int i : iArr) {
            if (KonyMain.f3657e) {
                Log.d("PageView", "margin = " + i);
            }
        }
        if (iArr[0] != 0) {
            this.f2930z.leftMargin = iArr[0];
        }
        if (iArr[1] != 0) {
            this.f2930z.topMargin = iArr[1];
        }
        if (iArr[2] != 0) {
            this.f2930z.rightMargin = iArr[2];
        }
        if (iArr[3] != 0) {
            this.f2930z.bottomMargin = iArr[3];
        }
    }

    public final void m3184b() {
        int i;
        for (i = 0; i < this.f2913i.size(); i++) {
            ((dv) this.f2913i.elementAt(i)).m1275b();
        }
        this.f2913i.clear();
        this.f2923s.notifyDataSetChanged();
        this.f2925u = 0;
        if (this.f2899A != null) {
            int childCount = this.f2899A.getChildCount();
            for (i = 0; i < childCount; i++) {
                ((bt) ((LinearLayout) this.f2899A.getChildAt(i)).getChildAt(0)).m915f();
            }
            this.f2899A.removeAllViews();
        }
    }

    public final void m3185b(int i) {
        if (i >= 0) {
            this.f2908d.setSelection(i);
            m3163f(i);
            this.f2925u = i;
            this.f2924t = i;
        }
    }

    public final void m3186b(int i, int i2) {
        ((dv) this.f2913i.remove(i)).m1275b();
        this.f2923s.notifyDataSetChanged();
        if (this.f2925u == i) {
            this.f2925u = 0;
        }
        if (this.f2899A != null) {
            ((bt) ((LinearLayout) this.f2899A.getChildAt(this.f2899A.getChildCount() - 1)).getChildAt(0)).m915f();
            this.f2899A.removeViewAt(this.f2899A.getChildCount() - 1);
        }
    }

    public final void m3187b(String str) {
    }

    public final void m3188b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            this.f2926v[i] = iArr[i];
        }
    }

    public final View m3189c() {
        return this;
    }

    public final void m3190c(int i) {
    }

    public final void m3191c(dB dBVar) {
        if (dBVar != null) {
            this.f2915k = dBVar;
            this.f2919o = dBVar.m1117a();
            this.f2916l = dBVar.m1158n();
            if (dBVar.m1126b() != null && this.f2919o != null) {
                Drawable layerDrawable = new LayerDrawable(new Drawable[]{r2, this.f2919o});
                layerDrawable.setLayerInset(1, this.f2916l, this.f2916l, this.f2916l, this.f2916l);
                this.f2919o = layerDrawable;
            }
        }
    }

    public final void m3192c(String str) {
        if (KonyMain.f3657e) {
            Log.d("KonySegUIPageView", "Setting the image URL config for Paginated Focus - " + str);
        }
        this.f2921q = str;
    }

    public final void m3193c(boolean z) {
        if (this.f2907c != null) {
            this.f2907c.setVisibility(z ? 0 : 8);
        }
    }

    public final void m3194c(int[] iArr) {
    }

    public final void m3195d() {
        if (!this.f2929y) {
            setLayoutParams(this.f2930z);
            setBackgroundDrawable(new PaintDrawable(0));
            setOrientation(1);
            addView(this.f2908d);
            addView(this.f2899A);
            this.f2929y = true;
        }
    }

    public final void m3196d(int i) {
        setGravity(17);
        setMinimumHeight((int) ((getContext().getResources().getDisplayMetrics().density * ((float) i)) + 0.5f));
    }

    public final void m3197d(dB dBVar) {
        if (dBVar != null) {
            this.f2914j = dBVar;
            this.f2920p = dBVar.m1117a();
            this.f2917m = dBVar.m1158n();
            if (dBVar.m1126b() != null && this.f2920p != null) {
                Drawable layerDrawable = new LayerDrawable(new Drawable[]{r2, this.f2920p});
                layerDrawable.setLayerInset(1, this.f2917m, this.f2917m, this.f2917m, this.f2917m);
                this.f2920p = layerDrawable;
            }
        }
    }

    public final void m3198d(String str) {
        if (KonyMain.f3657e) {
            Log.d("KonySegUIPageView", "Setting the image URL config for Paginated OffFocus - " + str);
        }
        this.f2922r = str;
    }

    public final void m3199d(boolean z) {
        if (this.f2928x != null) {
            this.f2928x.setVisibility(z ? 0 : 8);
        }
    }

    public final void m3200e() {
        this.f2908d.setOnItemClickListener(null);
        this.f2908d.setOnItemSelectedListener(null);
        this.f2908d.setOnFocusChangeListener(null);
        if (this.f2920p != null) {
            this.f2920p.setCallback(null);
        }
        dB.m1104a(this.f2920p);
        if (this.f2919o != null) {
            this.f2919o.setCallback(null);
        }
        dB.m1104a(this.f2919o);
        m3184b();
        this.f2908d.clearDisappearingChildren();
    }

    public final void m3201e(int i) {
        this.f2910f = i;
    }

    public final void m3202e(dB dBVar) {
    }

    public final void m3203e(boolean z) {
        if (this.f2908d != null && !z) {
            for (int i = 0; i < this.f2913i.size(); i++) {
                dv dvVar = (dv) this.f2913i.elementAt(i);
                if (KonyMain.f3657e) {
                    Log.d("KonySegUIPageView", "Dynamic Skinning position = " + i + " focusskin holder = " + dvVar.f1230b);
                }
                m3155a(dvVar, false, i);
            }
        }
    }

    public final void m3204f() {
    }

    public final void m3205g() {
        setFocusableInTouchMode(true);
        requestFocus();
        setFocusableInTouchMode(false);
    }

    public final int[] m3206h() {
        return null;
    }

    public final View[] m3207i() {
        return null;
    }

    public final int m3208j() {
        return this.f2924t;
    }

    public final void m3209k() {
    }

    public final void m3210l() {
        m3197d(this.f2914j);
        m3191c(this.f2915k);
        m3203e(false);
        int size = this.f2913i.size();
        for (int i = 0; i < size; i++) {
            ((Gallery.LayoutParams) ((dv) this.f2913i.get(i)).f1229a.getLayoutParams()).width = this.f2910f;
        }
    }
}
