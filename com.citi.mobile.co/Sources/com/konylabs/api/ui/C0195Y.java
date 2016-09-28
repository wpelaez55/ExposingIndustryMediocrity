package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Log;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;

/* renamed from: com.konylabs.api.ui.Y */
public final class C0195Y extends LinearLayout {
    private static int f347l;
    private Context f348a;
    private LayoutParams f349b;
    private LayoutParams f350c;
    private dB f351d;
    private dB f352e;
    private Drawable f353f;
    private int[] f354g;
    private int[] f355h;
    private LinearLayout f356i;
    private ArrayList f357j;
    private ab f358k;
    private boolean f359m;
    private OnFocusChangeListener f360n;
    private OnCheckedChangeListener f361o;
    private Drawable f362p;
    private Drawable f363q;
    private boolean f364r;

    static {
        f347l = -1;
    }

    public C0195Y(Context context) {
        super(context);
        this.f349b = null;
        this.f350c = null;
        this.f351d = null;
        this.f352e = null;
        this.f353f = null;
        this.f354g = new int[]{0, 0, 0, 0};
        this.f355h = new int[]{0, 0, 0, 0};
        this.f356i = null;
        this.f358k = null;
        this.f359m = false;
        this.f360n = new C0196Z(this);
        this.f361o = new aa(this);
        this.f348a = context;
        this.f356i = new LinearLayout(context);
        this.f349b = new LayoutParams(-2, -2);
        this.f350c = new LayoutParams(-2, -2);
        this.f356i.addView(this, this.f350c);
        this.f357j = new ArrayList();
    }

    public final void m337a() {
        removeAllViews();
        this.f357j.clear();
    }

    public final void m338a(float f) {
        this.f349b.width = 0;
        this.f349b.weight = f;
    }

    public final void m339a(int i) {
        super.setOrientation(i);
    }

    public final void m340a(TextView textView) {
        if (this.f352e != null) {
            this.f352e.m1129b(textView);
            textView.setBackgroundDrawable(this.f353f);
        }
    }

    public final void m341a(ab abVar) {
        this.f358k = abVar;
    }

    public final void m342a(ac acVar) {
        int n;
        int n2;
        if (f347l == -1) {
            if (this.f351d != null) {
                n = this.f351d.m1158n();
                if (n < 0) {
                    n = 0;
                }
            } else {
                n = 0;
            }
            if (this.f352e != null) {
                n2 = this.f352e.m1158n();
                if (n2 >= n) {
                    n = n2;
                }
            }
            f347l = n;
        }
        this.f357j.add(acVar);
        acVar.f518e = new CheckBox(this.f348a);
        acVar.f518e.setText(acVar.f515b);
        if (acVar.f516c != null) {
            acVar.f518e.setContentDescription(acVar.f516c);
        } else if (KonyMain.f3656d >= 16) {
            acVar.f518e.setImportantForAccessibility(2);
        }
        if (this.f351d != null) {
            acVar.f517d = this.f351d.m1162p();
        }
        acVar.f518e.setTag(acVar);
        acVar.f518e.setOnCheckedChangeListener(this.f361o);
        if (!(this.f362p == null && this.f363q == null)) {
            int[] iArr;
            CheckBox checkBox = acVar.f518e;
            Drawable stateListDrawable = new StateListDrawable();
            if (this.f362p != null) {
                stateListDrawable.addState(new int[]{16842912}, this.f362p.getConstantState().newDrawable());
            } else {
                iArr = new int[]{16842912};
                KonyMain.getActContext();
                stateListDrawable.addState(iArr, KonyMain.m4083a("btn_check_on.png"));
            }
            if (this.f363q != null) {
                stateListDrawable.addState(new int[]{-16842912}, this.f363q.getConstantState().newDrawable());
            } else {
                iArr = new int[]{-16842912};
                KonyMain.getActContext();
                stateListDrawable.addState(iArr, KonyMain.m4083a("btn_check_off.png"));
            }
            checkBox.setButtonDrawable(stateListDrawable);
        }
        acVar.f518e.setOnFocusChangeListener(this.f360n);
        m349b(acVar.f518e);
        n = f347l;
        if (acVar != null) {
            n2 = acVar.f518e.getPaddingLeft();
            int paddingRight = acVar.f518e.getPaddingRight();
            int paddingTop = acVar.f518e.getPaddingTop();
            acVar.f518e.setPadding((this.f355h[0] + n) + n2, (this.f355h[1] + n) + paddingTop, paddingRight + (this.f355h[2] + n), (n + this.f355h[3]) + acVar.f518e.getPaddingBottom());
        }
        addView(acVar.f518e);
    }

    public final void m343a(dB dBVar) {
        if (dBVar != null) {
            this.f352e = dBVar;
            this.f353f = this.f352e.m1162p();
        }
    }

    public final void m344a(String str) {
        ac acVar;
        boolean z;
        ac acVar2 = null;
        for (int i = 0; i < this.f357j.size(); i++) {
            acVar2 = (ac) this.f357j.get(i);
            if (acVar2.f514a.equals(str)) {
                acVar = acVar2;
                z = true;
                break;
            }
        }
        acVar = acVar2;
        z = false;
        if (z) {
            this.f364r = true;
            acVar.f518e.setChecked(true);
            this.f364r = false;
        } else if (KonyMain.f3658f) {
            Log.w("KonyCheckGroup", "CheckGroup: key not found - " + str);
        }
    }

    public final void m345a(boolean z) {
        if (!z) {
            int size = this.f357j.size();
            for (int i = 0; i < size; i++) {
                ac acVar = (ac) this.f357j.get(i);
                if (acVar != null) {
                    if (this.f351d != null) {
                        acVar.f517d = this.f351d.m1162p();
                    } else {
                        acVar.f517d = null;
                    }
                    m349b(acVar.f518e);
                }
            }
        }
    }

    public final void m346a(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            this.f354g[i] = iArr[i];
        }
        ez.m1344a(iArr, this.f356i, this.f349b);
    }

    public final void m347b() {
        this.f359m = false;
        m354c();
    }

    public final void m348b(int i) {
        this.f356i.setVisibility(i);
    }

    public final void m349b(TextView textView) {
        if (this.f351d != null) {
            this.f351d.m1129b(textView);
            ac acVar = (ac) textView.getTag();
            if (acVar != null) {
                textView.setBackgroundDrawable(acVar.f517d);
            }
        }
    }

    public final void m350b(dB dBVar) {
        this.f351d = dBVar;
    }

    public final void m351b(String str) {
        if (KonyMain.f3657e) {
            Log.d("KonyCheckGroup", "Setting the ticked Image ");
        }
        this.f362p = dB.m1112c(str);
    }

    public final void m352b(boolean z) {
        for (int i = 0; i < this.f357j.size(); i++) {
            ((ac) this.f357j.get(i)).f518e.setEnabled(z);
        }
    }

    public final void m353b(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            this.f355h[i] = iArr[i];
        }
    }

    public final void m354c() {
        if (!this.f359m) {
            this.f356i.setLayoutParams(this.f349b);
            this.f359m = true;
        }
    }

    public final void m355c(int i) {
        this.f349b.gravity = i;
        this.f356i.setGravity(i);
    }

    public final void m356c(String str) {
        this.f363q = dB.m1112c(str);
    }

    public final View m357d() {
        return this.f356i;
    }

    public final void m358d(int i) {
        this.f349b.width = i;
        int size = this.f357j.size();
        int i2;
        if (getOrientation() == 0) {
            for (i2 = 0; i2 < size; i2++) {
                ((ac) this.f357j.get(i2)).f518e.setWidth(i / size);
            }
            return;
        }
        for (i2 = 0; i2 < size; i2++) {
            ((ac) this.f357j.get(i2)).f518e.setWidth(i);
        }
    }

    public final void m359d(String str) {
        if (str != null) {
            setContentDescription(str);
            if (KonyMain.f3656d >= 16) {
                setImportantForAccessibility(1);
            }
            setFocusable(true);
        } else if (KonyMain.f3656d >= 16) {
            setImportantForAccessibility(2);
            setFocusable(false);
        } else {
            setContentDescription(BuildConfig.FLAVOR);
            setFocusable(false);
        }
    }

    public final void m360e() {
        if (this.f353f != null) {
            this.f353f.setCallback(null);
            dB.m1104a(this.f353f);
        }
        if (this.f357j != null) {
            int size = this.f357j.size();
            for (int i = 0; i < size; i++) {
                ac acVar = (ac) this.f357j.get(i);
                if (acVar != null) {
                    acVar.f517d = null;
                }
            }
        }
    }

    public final void m361e(int i) {
        this.f349b.height = i;
        int size = this.f357j.size();
        int i2;
        if (getOrientation() == 1) {
            for (i2 = 0; i2 < size; i2++) {
                ((ac) this.f357j.get(i2)).f518e.setHeight(i / size);
            }
            return;
        }
        for (i2 = 0; i2 < size; i2++) {
            ((ac) this.f357j.get(i2)).f518e.setHeight(i);
        }
    }

    public final void m362f() {
        this.f364r = true;
        for (int i = 0; i < this.f357j.size(); i++) {
            ac acVar = (ac) this.f357j.get(i);
            if (acVar.f518e.isChecked()) {
                acVar.f518e.setChecked(false);
            }
        }
        this.f364r = false;
    }

    public final Object[] m363g() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f357j.size(); i++) {
            ac acVar = (ac) this.f357j.get(i);
            if (acVar.f518e.isChecked()) {
                arrayList.add(acVar);
            }
        }
        return arrayList.toArray();
    }

    public final void m364h() {
        this.f351d = this.f351d;
        m343a(this.f352e);
        if (isFocused()) {
            m345a(true);
        } else {
            m345a(false);
        }
    }
}
