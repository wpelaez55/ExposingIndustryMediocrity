package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;

public final class cM extends RadioGroup {
    private Context f917a;
    private LayoutParams f918b;
    private LayoutParams f919c;
    private dB f920d;
    private dB f921e;
    private Drawable f922f;
    private int[] f923g;
    private int[] f924h;
    private LinearLayout f925i;
    private ArrayList f926j;
    private int f927k;
    private int f928l;
    private OnCheckedChangeListener f929m;
    private boolean f930n;
    private boolean f931o;
    private Drawable f932p;
    private Drawable f933q;

    public cM(Context context) {
        super(context);
        this.f918b = null;
        this.f919c = null;
        this.f920d = null;
        this.f921e = null;
        this.f922f = null;
        this.f923g = new int[]{0, 0, 0, 0};
        this.f924h = new int[]{0, 0, 0, 0};
        this.f925i = null;
        this.f927k = -1;
        this.f929m = new cN(this);
        this.f931o = false;
        this.f917a = context;
        this.f925i = new LinearLayout(context);
        this.f918b = new LayoutParams(-2, -2);
        this.f919c = new LayoutParams(-2, -2);
        this.f925i.addView(this, this.f919c);
        this.f926j = new ArrayList();
    }

    public final cO m967a() {
        View findViewById = findViewById(getCheckedRadioButtonId());
        return findViewById == null ? null : (cO) findViewById.getTag();
    }

    public final void m968a(float f) {
        this.f918b.width = 0;
        this.f918b.weight = f;
    }

    public final void m969a(int i) {
        this.f925i.setVisibility(i);
    }

    public final void m970a(TextView textView) {
        if (this.f921e != null) {
            this.f921e.m1129b(textView);
            textView.setBackgroundDrawable(this.f922f);
        }
    }

    public final void m971a(cO cOVar) {
        int n;
        if (this.f927k == -1) {
            if (this.f920d != null) {
                n = this.f920d.m1158n();
                if (n < 0) {
                    n = 0;
                }
            } else {
                n = 0;
            }
            if (this.f921e != null) {
                int n2 = this.f921e.m1158n();
                if (n2 >= n) {
                    n = n2;
                }
            }
            this.f927k = n;
        }
        this.f926j.add(cOVar);
        cOVar.f939e = new RadioButton(this.f917a);
        cOVar.f939e.setText(cOVar.f936b);
        if (cOVar.f937c != null) {
            cOVar.f939e.setContentDescription(cOVar.f937c);
        } else if (KonyMain.f3656d >= 16) {
            cOVar.f939e.setImportantForAccessibility(2);
        }
        if (this.f920d != null) {
            cOVar.f938d = this.f920d.m1162p();
        }
        cOVar.f939e.setTag(cOVar);
        cOVar.f939e.setOnCheckedChangeListener(this.f929m);
        if (!(this.f932p == null && this.f933q == null)) {
            RadioButton radioButton = cOVar.f939e;
            Drawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842912}, this.f932p != null ? this.f932p.getConstantState().newDrawable() : this.f932p);
            stateListDrawable.addState(new int[]{-16842912}, this.f933q != null ? this.f933q.getConstantState().newDrawable() : this.f933q);
            radioButton.setButtonDrawable(stateListDrawable);
        }
        m978b(cOVar.f939e);
        n = this.f927k;
        if (cOVar != null) {
            cOVar.f939e.setPadding((cOVar.f939e.getPaddingLeft() + this.f924h[0]) + n, (cOVar.f939e.getPaddingTop() + this.f924h[1]) + n, (cOVar.f939e.getPaddingRight() + this.f924h[2]) + n, n + (cOVar.f939e.getPaddingBottom() + this.f924h[3]));
        }
        if (!this.f930n) {
            addView(cOVar.f939e, new RadioGroup.LayoutParams(-2, -2));
        } else if (this.f928l == 0) {
            addView(cOVar.f939e, new RadioGroup.LayoutParams(0, -2, 1.0f));
        } else {
            addView(cOVar.f939e, new RadioGroup.LayoutParams(-1, -2));
        }
    }

    public final void m972a(dB dBVar) {
        this.f921e = dBVar;
        this.f922f = this.f921e.m1162p();
    }

    public final void m973a(String str) {
        if (str != null) {
            for (int i = 0; i < this.f926j.size(); i++) {
                cO cOVar = (cO) this.f926j.get(i);
                if (cOVar.f935a.equals(str)) {
                    cOVar.f939e.setChecked(true);
                    return;
                }
            }
        } else if (getCheckedRadioButtonId() != -1) {
            clearCheck();
        }
    }

    public final void m974a(boolean z) {
        cO a;
        if (z) {
            a = m967a();
            if (a != null) {
                m970a(a.f939e);
                return;
            }
            return;
        }
        int size = this.f926j.size();
        for (int i = 0; i < size; i++) {
            a = (cO) this.f926j.get(i);
            if (a != null) {
                if (this.f920d != null) {
                    a.f938d = this.f920d.m1162p();
                } else {
                    a.f938d = null;
                }
                cO a2 = m967a();
                if (a2 == null || a2.f939e != a.f939e) {
                    m978b(a.f939e);
                }
            }
        }
    }

    public final void m975a(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            this.f923g[i] = iArr[i];
        }
        ez.m1344a(this.f923g, this.f925i, this.f918b);
    }

    public final void m976b() {
        removeAllViews();
        this.f926j.clear();
    }

    public final void m977b(int i) {
        this.f918b.gravity = i;
        this.f925i.setGravity(i);
    }

    public final void m978b(TextView textView) {
        if (this.f920d != null) {
            this.f920d.m1129b(textView);
            cO cOVar = (cO) textView.getTag();
            if (cOVar != null) {
                textView.setBackgroundDrawable(cOVar.f938d);
            }
        }
    }

    public final void m979b(dB dBVar) {
        this.f920d = dBVar;
    }

    public final void m980b(String str) {
        this.f932p = dB.m1112c(str);
    }

    public final void m981b(boolean z) {
        for (int i = 0; i < this.f926j.size(); i++) {
            ((cO) this.f926j.get(i)).f939e.setEnabled(z);
        }
    }

    public final void m982b(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            this.f924h[i] = iArr[i];
        }
    }

    public final void m983c() {
        this.f931o = false;
        m987d();
    }

    public final void m984c(int i) {
        this.f918b.width = i;
        int size = this.f926j.size();
        int i2;
        if (getOrientation() == 0) {
            for (i2 = 0; i2 < size; i2++) {
                ((cO) this.f926j.get(i2)).f939e.setWidth(i / size);
            }
            return;
        }
        for (i2 = 0; i2 < size; i2++) {
            ((cO) this.f926j.get(i2)).f939e.setWidth(i);
        }
    }

    public final void m985c(String str) {
        this.f933q = dB.m1112c(str);
    }

    public final void m986c(boolean z) {
        int i = -1;
        this.f919c.width = z ? -1 : -2;
        LayoutParams layoutParams = this.f918b;
        if (!z) {
            i = -2;
        }
        layoutParams.width = i;
        this.f930n = z;
    }

    public final void m987d() {
        if (!this.f931o) {
            this.f925i.setLayoutParams(this.f918b);
            this.f931o = true;
        }
    }

    public final void m988d(int i) {
        this.f918b.height = i;
        int size = this.f926j.size();
        int i2;
        if (getOrientation() == 1) {
            for (i2 = 0; i2 < size; i2++) {
                ((cO) this.f926j.get(i2)).f939e.setHeight(i / size);
            }
            return;
        }
        for (i2 = 0; i2 < size; i2++) {
            ((cO) this.f926j.get(i2)).f939e.setHeight(i);
        }
    }

    public final void m989d(String str) {
        if (str != null) {
            setContentDescription(str);
            setFocusable(true);
            if (KonyMain.f3656d >= 16) {
                setImportantForAccessibility(1);
            }
        } else if (KonyMain.f3656d >= 16) {
            setImportantForAccessibility(2);
            setFocusable(false);
        } else {
            setContentDescription(BuildConfig.FLAVOR);
            setFocusable(false);
        }
    }

    public final void m990d(boolean z) {
        this.f919c.height = z ? -1 : -2;
    }

    public final View m991e() {
        return this.f925i;
    }

    public final void m992f() {
        if (this.f926j != null) {
            int size = this.f926j.size();
            for (int i = 0; i < size; i++) {
                cO cOVar = (cO) this.f926j.get(i);
                if (cOVar != null) {
                    cOVar.f938d = null;
                }
            }
        }
        m976b();
        if (this.f933q != null) {
            this.f933q.setCallback(null);
            dB.m1104a(this.f933q);
        }
        if (this.f932p != null) {
            this.f932p.setCallback(null);
            dB.m1104a(this.f932p);
        }
        if (this.f922f != null) {
            this.f922f.setCallback(null);
            dB.m1104a(this.f922f);
        }
    }

    public final void m993g() {
        if (this.f920d != null) {
            this.f920d = this.f920d;
        }
        if (this.f921e != null) {
            m972a(this.f921e);
        }
        if (isFocused()) {
            m974a(true);
        } else {
            m974a(false);
        }
    }

    public final void setOrientation(int i) {
        this.f928l = i;
        super.setOrientation(i);
    }
}
