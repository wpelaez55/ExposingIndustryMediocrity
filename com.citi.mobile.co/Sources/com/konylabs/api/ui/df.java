package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.SectionIndexer;
import com.konylabs.android.KonyMain;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class df extends ListView implements SectionIndexer, C0214p, C0215q {
    public static final int[] f2875c;
    public static final int[] f2876d;
    public static final int[] f2877e;
    private ie f2878f;
    private dB f2879g;
    private dB f2880h;
    private dB f2881i;
    private dB f2882j;
    private dB f2883k;
    private Drawable f2884l;
    private dh f2885m;
    private int f2886n;
    private int[] f2887o;
    private boolean f2888p;
    private LayoutParams f2889q;
    private dj f2890r;
    private View f2891s;
    private boolean f2892t;
    private int f2893u;
    private int f2894v;
    private int f2895w;
    private LinkedHashMap f2896x;
    private OnScrollListener f2897y;
    private boolean f2898z;

    static {
        f2875c = new int[]{16842913};
        f2876d = new int[]{16842910};
        f2877e = new int[]{16842919};
        new int[1][0] = 16842908;
        dB.m1116r(10);
    }

    public df(Context context) {
        super(context);
        this.f2886n = -1;
        this.f2887o = new int[4];
        this.f2888p = false;
        this.f2890r = new dj(this);
        this.f2895w = 0;
        this.f2896x = new LinkedHashMap();
        this.f2897y = new dg(this);
        this.f2898z = true;
        setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        setVerticalFadingEdgeEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setClipChildren(false);
        setMinimumHeight(dB.m1116r(320));
        setHeaderDividersEnabled(false);
        setFooterDividersEnabled(false);
        setCacheColorHint(0);
        this.f2889q = new LayoutParams(-1, -1);
        LayoutParams layoutParams = this.f2889q;
        LayoutParams layoutParams2 = this.f2889q;
        LayoutParams layoutParams3 = this.f2889q;
        this.f2889q.bottomMargin = 2;
        layoutParams3.rightMargin = 2;
        layoutParams2.topMargin = 2;
        layoutParams.leftMargin = 2;
    }

    public static void m3087a(View view, String str) {
        ((dl) view).m1272a(str);
    }

    private static void m3089b(View view, String str) {
        ((dl) view).m1272a(str);
    }

    private void m3091h(int i) {
        requestFocusFromTouch();
        if (this.f2896x.size() <= 0) {
            setSelection(i);
        } else {
            setSelectionFromTop(i, this.f2894v);
        }
    }

    public final View m3092a() {
        return null;
    }

    public final View m3093a(View view, View view2) {
        View dkVar = new dk(this, KonyMain.getAppContext());
        dkVar.m1270a(view, view2);
        return dkVar;
    }

    public final void m3094a(int i) {
        super.setVisibility(i);
    }

    public final void m3095a(int i, int i2) {
        setDivider(new ColorDrawable(i2));
        setDividerHeight(dB.m1116r(i));
    }

    public final void m3096a(int i, int i2, int i3) {
        int i4 = 0;
        if (this.f2896x.size() > 0) {
            if (i3 == 1) {
                i2 = i2 > 0 ? -i2 : 0;
            }
            Set entrySet = this.f2896x.entrySet();
            int size = entrySet.size();
            if (size > 0) {
                Entry[] entryArr = new Entry[size];
                entrySet.toArray(entryArr);
                this.f2896x.clear();
                while (i4 < size) {
                    if (i4 >= i + 1) {
                        this.f2896x.put(Integer.valueOf(((Integer) entryArr[i4].getKey()).intValue() + i2), entryArr[i4].getValue());
                    } else {
                        this.f2896x.put(entryArr[i4].getKey(), entryArr[i4].getValue());
                    }
                    i4++;
                }
            }
        }
    }

    public final void m3097a(View view) {
        this.f2886n = ((di) view.getTag()).f1211a;
    }

    public final void m3098a(View view, int i, int i2, ih ihVar) {
    }

    public final void m3099a(View view, int i, ih ihVar) {
    }

    public final void m3100a(dB dBVar) {
        this.f2881i = dBVar;
    }

    public final void m3101a(ie ieVar) {
        this.f2878f = ieVar;
    }

    public final void m3102a(C0216r c0216r) {
    }

    public final void m3103a(Object obj) {
        this.f2885m = (dh) obj;
        this.f2885m.m1268a(this.f2890r);
        if (this.f2895w > 0 && this.f2891s != null) {
            this.f2891s.setVisibility(8);
        }
        super.setAdapter(this.f2885m);
    }

    public final void m3104a(String str) {
    }

    public final void m3105a(String str, int i) {
        this.f2896x.put(Integer.valueOf(i), str);
    }

    public final void m3106a(boolean z) {
    }

    public final void m3107a(boolean z, boolean z2) {
    }

    public final void m3108a(int[] iArr) {
        for (int i : iArr) {
            if (KonyMain.f3657e) {
                Log.d("PageView", "margin = " + i);
            }
        }
        if (iArr[0] != 0) {
            this.f2889q.leftMargin = iArr[0];
        }
        if (iArr[1] != 0) {
            this.f2889q.topMargin = iArr[1];
        }
        if (iArr[2] != 0) {
            this.f2889q.rightMargin = iArr[2];
        }
        if (iArr[3] != 0) {
            this.f2889q.bottomMargin = iArr[3];
        }
    }

    public final void m3109b() {
    }

    public final void m3110b(int i) {
        if (i >= 0) {
            if (this.f2885m == null || i <= this.f2885m.getCount()) {
                m3091h(i);
                this.f2886n = i;
            }
        }
    }

    public final void m3111b(int i, int i2) {
    }

    public final void m3112b(View view) {
        addHeaderView(view, null, false);
    }

    public final void m3113b(dB dBVar) {
        this.f2882j = dBVar;
    }

    public final void m3114b(String str) {
    }

    public final void m3115b(boolean z) {
        this.f2898z = z;
    }

    public final void m3116b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            this.f2887o[i] = iArr[i];
        }
    }

    public final View m3117c() {
        return this;
    }

    public final void m3118c(int i) {
    }

    public final void m3119c(View view) {
        addFooterView(view, null, false);
    }

    public final void m3120c(dB dBVar) {
        this.f2880h = dBVar;
    }

    public final void m3121c(boolean z) {
    }

    public final void m3122c(int[] iArr) {
    }

    public final void m3123d() {
        if (!this.f2888p) {
            setLayoutParams(this.f2889q);
            setBackgroundDrawable(new PaintDrawable(0));
            this.f2884l = getSelector();
            if (this.f2880h != null) {
                setSelector(this.f2880h.m1162p());
            }
            setOnScrollListener(this.f2897y);
            this.f2888p = true;
        }
    }

    public final void m3124d(int i) {
        this.f2895w = i;
    }

    public final void m3125d(dB dBVar) {
        this.f2879g = dBVar;
    }

    public final void m3126d(boolean z) {
    }

    protected final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f2892t && this.f2891s != null) {
            drawChild(canvas, this.f2891s, getDrawingTime());
        }
    }

    public final String m3127e(int i) {
        return (String) this.f2896x.get(Integer.valueOf(getPositionForSection(i)));
    }

    public final void m3128e() {
        m3146s();
        setOnItemClickListener(null);
        setOnItemSelectedListener(null);
        setOnFocusChangeListener(null);
        clearDisappearingChildren();
    }

    public final void m3129e(dB dBVar) {
        this.f2883k = dBVar;
    }

    public final void m3130e(boolean z) {
    }

    public final void m3131f() {
    }

    public final boolean m3132f(int i) {
        return this.f2896x.keySet().contains(Integer.valueOf(i));
    }

    public final void m3133g() {
        setFocusableInTouchMode(true);
        requestFocus();
        setFocusableInTouchMode(false);
    }

    public final void m3134g(int i) {
        if (this.f2891s != null) {
            if (i < 0 || this.f2896x.size() <= 0) {
                this.f2892t = false;
                return;
            }
            boolean z;
            int i2;
            int intValue;
            int i3 = i + 1;
            if (i3 < 0 || getCount() == 0) {
                z = false;
            } else {
                int sectionForPosition = getSectionForPosition(i3);
                if (sectionForPosition == -1) {
                    z = false;
                } else {
                    i2 = 0;
                    for (Integer intValue2 : this.f2896x.keySet()) {
                        intValue = intValue2.intValue();
                        if (i2 == sectionForPosition) {
                            i2 = intValue;
                            break;
                        }
                        i2++;
                    }
                    z = (i2 == -1 || i3 != i2) ? true : true;
                }
            }
            switch (z) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                    this.f2892t = false;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    m3089b(this.f2891s, (String) this.f2896x.get(Integer.valueOf(getPositionForSection(i))));
                    if (this.f2891s.getTop() != 0) {
                        this.f2891s.layout(0, 0, this.f2893u, this.f2894v);
                    }
                    this.f2892t = true;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    View childAt = getChildAt(0);
                    if (childAt != null) {
                        intValue = childAt.getBottom();
                        i2 = this.f2891s.getHeight();
                        i2 = intValue < i2 ? intValue - i2 : 0;
                        m3089b(this.f2891s, (String) this.f2896x.get(Integer.valueOf(getPositionForSection(i))));
                        if (this.f2891s.getTop() != i2) {
                            this.f2891s.layout(0, i2, this.f2893u, this.f2894v + i2);
                        }
                        this.f2892t = true;
                    }
                default:
            }
        }
    }

    public final int getPositionForSection(int i) {
        int i2 = 0;
        for (Integer intValue : this.f2896x.keySet()) {
            int intValue2 = intValue.intValue();
            if (i == intValue2) {
                return intValue2;
            }
            if (i < intValue2) {
                return i2;
            }
            i2 = intValue2;
        }
        return i2;
    }

    public final int getSectionForPosition(int i) {
        int i2 = 0;
        Set keySet = this.f2896x.keySet();
        int size = keySet.size();
        if (size <= 0) {
            return 0;
        }
        Integer[] numArr = (Integer[]) keySet.toArray(new Integer[size]);
        while (i2 < size - 1) {
            if (i >= numArr[i2].intValue() && i < numArr[i2 + 1].intValue()) {
                return i2;
            }
            i2++;
        }
        return i >= numArr[i2].intValue() ? i2 : -1;
    }

    public final Object[] getSections() {
        return null;
    }

    public final int[] m3135h() {
        return null;
    }

    public final View[] m3136i() {
        return null;
    }

    public final int m3137j() {
        return this.f2886n;
    }

    public final void m3138k() {
    }

    public final void m3139l() {
    }

    public final void m3140m() {
        if (this.f2885m != null) {
            this.f2885m.notifyDataSetChanged();
        }
    }

    public final dB m3141n() {
        return this.f2879g;
    }

    public final dB m3142o() {
        return this.f2880h;
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2898z && this.f2886n >= 0) {
            m3091h(this.f2886n);
        }
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2891s != null) {
            this.f2891s.layout(0, 0, this.f2893u, this.f2894v);
            if (this.f2895w <= 0) {
                m3134g(getFirstVisiblePosition());
            }
        }
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2891s != null) {
            measureChild(this.f2891s, i, i2);
            this.f2893u = this.f2891s.getMeasuredWidth();
            this.f2894v = this.f2891s.getMeasuredHeight();
        }
    }

    public final dB m3143p() {
        return this.f2882j;
    }

    public final Drawable m3144q() {
        return this.f2884l;
    }

    public final dB m3145r() {
        return this.f2883k;
    }

    public final void m3146s() {
        if (this.f2896x != null) {
            this.f2896x.clear();
        }
        m3148u();
    }

    public final void m3147t() {
        this.f2891s = new dl(this, KonyMain.getAppContext());
        ((dl) this.f2891s).m1271a(this.f2881i);
        if (this.f2891s != null) {
            setFadingEdgeLength(0);
        }
        setOnScrollListener(this.f2897y);
    }

    public final void m3148u() {
        this.f2891s = null;
        setOnScrollListener(null);
    }

    public final int m3149v() {
        return this.f2896x != null ? this.f2896x.size() : 0;
    }

    public final View m3150w() {
        View dlVar = new dl(this, KonyMain.getAppContext());
        dlVar.m1271a(this.f2881i);
        return dlVar;
    }
}
