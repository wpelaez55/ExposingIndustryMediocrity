package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import com.konylabs.android.KonyMain;
import java.util.ArrayList;
import ny0k.cA;

public final class dU extends LinearLayout implements OnTabChangeListener, dK {
    private static final int f2852i;
    boolean f2853a;
    dB f2854b;
    dB f2855c;
    dB f2856d;
    int f2857e;
    int f2858f;
    dM f2859g;
    dN f2860h;
    private TabHost f2861j;
    private ArrayList f2862k;
    private Drawable f2863l;
    private Drawable f2864m;
    private Drawable f2865n;
    private Drawable f2866o;
    private Drawable f2867p;
    private StateListDrawable f2868q;
    private boolean f2869r;
    private int f2870s;
    private int f2871t;
    private LayoutParams f2872u;
    private int f2873v;
    private boolean f2874w;

    static {
        f2852i = dB.m1116r(64);
    }

    public dU(Context context, dM dMVar, dN dNVar) {
        super(context);
        this.f2861j = null;
        this.f2862k = new ArrayList();
        this.f2853a = false;
        this.f2854b = null;
        this.f2855c = null;
        this.f2856d = null;
        this.f2863l = null;
        this.f2864m = null;
        this.f2865n = null;
        this.f2866o = null;
        this.f2867p = null;
        this.f2868q = null;
        this.f2869r = false;
        this.f2870s = 0;
        this.f2857e = 0;
        this.f2858f = 0;
        this.f2871t = 0;
        this.f2859g = null;
        this.f2860h = null;
        this.f2873v = f2852i;
        this.f2853a = false;
        this.f2859g = dMVar;
        this.f2860h = dNVar;
        this.f2872u = new LayoutParams(-2, -2);
        setLayoutParams(this.f2872u);
        this.f2871t = context.getResources().getIdentifier("tabview", "layout", context.getPackageName());
        this.f2861j = (TabHost) View.inflate(KonyMain.getActContext(), this.f2871t, null);
        this.f2861j.setup();
        addView(this.f2861j);
        this.f2861j.setOnTabChangedListener(this);
        this.f2858f = context.getResources().getIdentifier("tabline", "id", context.getPackageName());
        if (KonyMain.f3656d <= 3) {
            m3064c(false);
        }
    }

    private static Drawable m3057a(dB dBVar) {
        Drawable b = dBVar.m1127b(true);
        if (dBVar.m1134d() != 0 && (b instanceof cA)) {
            ((cA) b).m2099a(new float[]{(float) r2, (float) r2, (float) r2, (float) r2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        return b;
    }

    private StateListDrawable m3058a() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(PRESSED_FOCUSED_STATE_SET, this.f2865n);
        stateListDrawable.addState(PRESSED_ENABLED_STATE_SET, this.f2865n);
        stateListDrawable.addState(SELECTED_STATE_SET, this.f2863l);
        stateListDrawable.addState(FOCUSED_STATE_SET, this.f2863l);
        stateListDrawable.addState(ENABLED_STATE_SET, this.f2864m);
        stateListDrawable.addState(ENABLED_SELECTED_STATE_SET, this.f2863l);
        return stateListDrawable;
    }

    private void m3059a(dW dWVar, TabSpec tabSpec) {
        TabHost tabHost = this.f2861j;
        CharSequence a = dWVar.f1141b;
        KonyMain.getActContext();
        tabHost.addTab(tabSpec.setIndicator(a, KonyMain.m4083a(dWVar.f1142c)));
        View childAt = this.f2861j.getTabWidget().getChildAt(this.f2861j.getTabWidget().getChildCount() - 1);
        childAt.getLayoutParams().height = this.f2873v;
        if (this.f2869r) {
            childAt.setBackgroundDrawable(m3058a());
        }
    }

    private static Drawable m3062b(dB dBVar) {
        Drawable b = dBVar.m1127b(true);
        if (dBVar.m1134d() != 0 && (b instanceof cA)) {
            ((cA) b).m2099a(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        return b;
    }

    private void m3064c(boolean z) {
        View findViewById = this.f2861j.findViewById(this.f2858f);
        if (z) {
            findViewById.getLayoutParams().height = dB.m1116r(6);
            findViewById.setVisibility(0);
        } else {
            findViewById.getLayoutParams().height = 0;
            findViewById.setVisibility(4);
        }
        requestLayout();
    }

    public final void m3066a(float f) {
        this.f2872u.width = 0;
        this.f2872u.weight = f;
    }

    public final void m3067a(int i) {
        setVisibility(i);
    }

    public final void m3068a(dB dBVar, dB dBVar2, dB dBVar3) {
        m3073b(dBVar, dBVar2, dBVar3);
        int size = this.f2862k.size();
        for (int i = 0; i < size; i++) {
            this.f2861j.getTabWidget().getChildAt(i).setBackgroundDrawable(m3058a());
        }
    }

    public final void m3069a(dW dWVar) {
        this.f2862k.add(dWVar);
        TabSpec content = this.f2861j.newTabSpec(dWVar.f1140a).setContent(dWVar);
        if (!this.f2869r) {
            m3059a(dWVar, content);
        } else if (KonyMain.f3656d > 3) {
            dY dYVar = new dY(this, KonyMain.getActContext(), dWVar);
            try {
                content.getClass().getMethod("setIndicator", new Class[]{View.class}).invoke(content, new Object[]{dYVar});
                this.f2861j.addTab(content);
            } catch (Exception e) {
                m3059a(dWVar, content);
            }
        } else {
            m3059a(dWVar, content);
        }
        int childCount = this.f2861j.getTabWidget().getChildCount();
        this.f2861j.getTabWidget().getChildAt(childCount - 1).setOnTouchListener(new dX(this, childCount - 1));
    }

    public final void m3070a(boolean z) {
        if (z) {
            this.f2872u.height = -1;
        }
        this.f2853a = z;
    }

    public final void m3071a(int[] iArr) {
        ez.m1344a(iArr, this, this.f2872u);
        setLayoutParams(this.f2872u);
    }

    public final void m3072b(int i) {
        this.f2873v = dB.m1116r(i);
    }

    public final void m3073b(dB dBVar, dB dBVar2, dB dBVar3) {
        boolean z;
        View findViewById;
        this.f2854b = dBVar;
        this.f2855c = dBVar2;
        this.f2856d = dBVar3;
        if (dBVar == null || dBVar2 == null || dBVar3 == null) {
            if (dBVar == null && dBVar2 == null && dBVar3 == null) {
                z = false;
                if (z) {
                    this.f2869r = false;
                    m3064c(false);
                    return;
                }
                this.f2869r = true;
                if (this.f2854b != null) {
                    this.f2863l = m3057a(this.f2854b);
                    this.f2866o = m3062b(this.f2854b);
                }
                if (this.f2855c != null) {
                    this.f2864m = m3057a(this.f2855c);
                }
                if (this.f2856d != null) {
                    this.f2865n = m3057a(this.f2856d);
                    this.f2867p = m3062b(this.f2856d);
                }
                findViewById = this.f2861j.findViewById(this.f2858f);
                this.f2868q = new StateListDrawable();
                this.f2868q.addState(PRESSED_ENABLED_STATE_SET, this.f2867p);
                this.f2868q.addState(ENABLED_STATE_SET, this.f2866o);
                findViewById.setBackgroundDrawable(this.f2868q);
            } else if ((dBVar == null && dBVar2 == null) || ((dBVar == null && dBVar3 == null) || (dBVar2 == null && dBVar3 == null))) {
                z = false;
                if (z) {
                    this.f2869r = false;
                    m3064c(false);
                    return;
                }
                this.f2869r = true;
                if (this.f2854b != null) {
                    this.f2863l = m3057a(this.f2854b);
                    this.f2866o = m3062b(this.f2854b);
                }
                if (this.f2855c != null) {
                    this.f2864m = m3057a(this.f2855c);
                }
                if (this.f2856d != null) {
                    this.f2865n = m3057a(this.f2856d);
                    this.f2867p = m3062b(this.f2856d);
                }
                findViewById = this.f2861j.findViewById(this.f2858f);
                this.f2868q = new StateListDrawable();
                this.f2868q.addState(PRESSED_ENABLED_STATE_SET, this.f2867p);
                this.f2868q.addState(ENABLED_STATE_SET, this.f2866o);
                findViewById.setBackgroundDrawable(this.f2868q);
            } else if (dBVar != null && dBVar2 != null) {
                this.f2856d = dBVar;
            } else if (dBVar3 != null && dBVar2 != null) {
                this.f2854b = dBVar3;
            } else if (!(dBVar3 == null || dBVar == null)) {
                this.f2855c = dBVar3;
            }
        }
        z = true;
        if (z) {
            this.f2869r = false;
            m3064c(false);
            return;
        }
        this.f2869r = true;
        if (this.f2854b != null) {
            this.f2863l = m3057a(this.f2854b);
            this.f2866o = m3062b(this.f2854b);
        }
        if (this.f2855c != null) {
            this.f2864m = m3057a(this.f2855c);
        }
        if (this.f2856d != null) {
            this.f2865n = m3057a(this.f2856d);
            this.f2867p = m3062b(this.f2856d);
        }
        findViewById = this.f2861j.findViewById(this.f2858f);
        this.f2868q = new StateListDrawable();
        this.f2868q.addState(PRESSED_ENABLED_STATE_SET, this.f2867p);
        this.f2868q.addState(ENABLED_STATE_SET, this.f2866o);
        findViewById.setBackgroundDrawable(this.f2868q);
    }

    public final void m3074b(boolean z) {
        m3064c(z);
    }

    public final void m3075b(int[] iArr) {
        super.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final int[] m3076b() {
        return new int[]{this.f2861j.getCurrentTab()};
    }

    public final void m3077c() {
        if (this.f2861j != null && this.f2869r && KonyMain.f3656d > 3) {
            for (int i = 0; i < this.f2862k.size(); i++) {
                View childAt = this.f2861j.getTabWidget().getChildAt(i);
                if (!(childAt instanceof dY)) {
                    break;
                }
                ((dY) childAt).m1198a();
            }
        }
        if (this.f2868q != null) {
            this.f2868q.setCallback(null);
            this.f2868q = null;
        }
        if (this.f2866o != null) {
            this.f2866o.setCallback(null);
            dB.m1104a(this.f2866o);
            this.f2866o = null;
        }
        if (this.f2867p != null) {
            this.f2867p.setCallback(null);
            dB.m1104a(this.f2867p);
            this.f2867p = null;
        }
        if (this.f2863l != null) {
            this.f2863l.setCallback(null);
            dB.m1104a(this.f2863l);
            this.f2863l = null;
        }
        if (this.f2864m != null) {
            this.f2864m.setCallback(null);
            dB.m1104a(this.f2864m);
            this.f2864m = null;
        }
        if (this.f2865n != null) {
            this.f2865n.setCallback(null);
            dB.m1104a(this.f2865n);
            this.f2865n = null;
        }
        if (this.f2862k != null) {
            this.f2862k.clear();
            this.f2862k = null;
        }
        if (this.f2861j != null) {
            this.f2861j.setBackgroundDrawable(null);
            removeAllViews();
            this.f2861j = null;
        }
    }

    public final void m3078c(String str) {
    }

    public final void m3079c(int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            this.f2870s = iArr[0];
            this.f2861j.setCurrentTab(iArr[0]);
        }
    }

    public final View m3080d() {
        this.f2861j.setCurrentTab(this.f2870s);
        return this;
    }

    public final void m3081d(int i) {
    }

    public final void m3082e() {
        setFocusableInTouchMode(true);
        requestFocus();
        setFocusableInTouchMode(false);
    }

    public final void m3083e(int i) {
        this.f2874w = true;
        this.f2872u.height = i;
        setLayoutParams(this.f2872u);
        post(new dV(this));
    }

    public final void m3084f() {
        m3073b(this.f2854b, this.f2855c, this.f2856d);
        if (this.f2861j != null && this.f2869r && KonyMain.f3656d > 3) {
            for (int i = 0; i < this.f2862k.size(); i++) {
                ((dY) this.f2861j.getTabWidget().getChildAt(i)).setBackgroundDrawable(m3058a());
            }
        }
    }

    public final void onTabChanged(String str) {
    }
}
