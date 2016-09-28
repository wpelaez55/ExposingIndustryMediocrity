package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TableLayout;
import com.konylabs.android.KonyMain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import ny0k.cA;

public final class dw extends LinearLayout implements OnMenuItemClickListener, OnCreateContextMenuListener, C0214p, C0215q {
    private static final float f2931B;
    private ArrayList f2932A;
    private float f2933C;
    private boolean f2934D;
    private float f2935E;
    private boolean f2936F;
    private boolean f2937G;
    private OnClickListener f2938H;
    private boolean f2939I;
    private C0174B f2940J;
    private dB f2941K;
    private float f2942L;
    private float f2943M;
    private float f2944N;
    Button f2945c;
    C0216r f2946d;
    ie f2947e;
    private Context f2948f;
    private dB f2949g;
    private dB f2950h;
    private dB f2951i;
    private dB f2952j;
    private int[] f2953k;
    private LayoutParams f2954l;
    private String f2955m;
    private dy f2956n;
    private boolean f2957o;
    private int f2958p;
    private int f2959q;
    private LinearLayout f2960r;
    private Button f2961s;
    private Vector f2962t;
    private cv f2963u;
    private int f2964v;
    private String f2965w;
    private String f2966x;
    private bt f2967y;
    private ArrayList f2968z;

    static {
        Boolean.valueOf(false);
        Boolean.valueOf(true);
        f2931B = (float) dB.m1116r(10);
    }

    public dw(Context context) {
        super(context);
        this.f2953k = new int[]{0, 0, 0, 0};
        this.f2955m = "KonySegmentUI";
        this.f2962t = new Vector();
        this.f2963u = null;
        this.f2933C = f2931B;
        this.f2934D = false;
        this.f2935E = f2931B;
        this.f2936F = false;
        this.f2938H = new dx(this);
        this.f2942L = f2931B;
        this.f2943M = f2931B;
        this.f2944N = f2931B;
        this.f2948f = context;
        this.f2956n = new dy();
        this.f2954l = new TableLayout.LayoutParams(-1, -2);
        super.setOrientation(1);
        this.f2932A = new ArrayList();
    }

    private int m3211a(int i, dA dAVar) {
        int i2 = 0;
        int i3 = dAVar.f1080b != null ? 1 : 0;
        Iterator it = dAVar.f1079a.iterator();
        while (it.hasNext()) {
            it.next();
            if (i2 == i) {
                break;
            }
            i2++;
            i3 += this.f2957o ? 2 : 1;
        }
        return i3;
    }

    private Drawable m3212a(int i, dB dBVar) {
        if (this.f2950h == null && dBVar == null) {
            return null;
        }
        Drawable f;
        int d;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return m3227f(dBVar);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                f = m3227f(dBVar);
                d = dBVar != null ? dBVar.m1134d() : this.f2950h != null ? this.f2950h.m1134d() : 0;
                if (d != 0 || !(f instanceof cA)) {
                    return f;
                }
                ((cA) f).m2099a(new float[]{this.f2933C, this.f2933C, this.f2933C, this.f2933C, 0.0f, 0.0f, 0.0f, 0.0f});
                return f;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                f = m3227f(dBVar);
                d = dBVar != null ? dBVar.m1134d() : this.f2950h != null ? this.f2950h.m1134d() : 0;
                if (d != 0 || !(f instanceof cA)) {
                    return f;
                }
                ((cA) f).m2099a(new float[]{0.0f, 0.0f, 0.0f, 0.0f, this.f2933C, this.f2933C, this.f2933C, this.f2933C});
                return f;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                f = m3227f(dBVar);
                d = dBVar != null ? dBVar.m1134d() : this.f2950h != null ? this.f2950h.m1134d() : 0;
                if (d != 0 || !(f instanceof cA)) {
                    return f;
                }
                ((cA) f).m2094a(this.f2933C);
                return f;
            default:
                return null;
        }
    }

    private Drawable m3213a(int i, dB dBVar, boolean z) {
        Drawable stateListDrawable = new StateListDrawable();
        if (z) {
            stateListDrawable.addState(FOCUSED_STATE_SET, m3225e(i));
            stateListDrawable.addState(SELECTED_STATE_SET, m3225e(i));
            stateListDrawable.addState(PRESSED_ENABLED_STATE_SET, this.f2941K != null ? m3226f(i) : m3225e(i));
        }
        stateListDrawable.addState(ENABLED_STATE_SET, m3212a(i, dBVar));
        return stateListDrawable;
    }

    private void m3215a(View view, ih ihVar) {
        view.setPadding(this.f2953k[0], this.f2953k[1], this.f2953k[2], this.f2953k[3]);
        view.setLayoutParams(new LayoutParams(-1, -2));
        view.setFocusable(true);
        if (ihVar == null || ihVar.f1547a) {
            view.setOnClickListener(this.f2956n);
        }
        view.setOnCreateContextMenuListener(this);
        if (ihVar != null) {
            view.setTag(ihVar);
        }
    }

    private void m3216a(dA dAVar) {
        int size = dAVar.f1079a.size();
        if (size == 0) {
            View view = dAVar.f1080b;
            if (view != null) {
                Drawable background = view.getBackground();
                if ((background instanceof cA) && this.f2939I) {
                    ((cA) background).m2094a(this.f2942L);
                    return;
                }
                return;
            }
            return;
        }
        int i = 0;
        while (i < size) {
            Drawable a;
            C0174B c0174b = (C0174B) dAVar.f1079a.get(i);
            boolean z = true;
            dB dBVar = null;
            if (c0174b.getTag() instanceof ih) {
                ih ihVar = (ih) c0174b.getTag();
                dB dBVar2 = ihVar.f1548b;
                z = ihVar.f1547a;
                dBVar = dBVar2;
            }
            if (!this.f2939I) {
                a = i % 2 == 0 ? m3213a(0, dBVar, z) : m3222b(0, dBVar, z);
            } else if (i != 0) {
                a = i == size + -1 ? i % 2 == 0 ? m3213a(2, dBVar, z) : m3222b(2, dBVar, z) : i % 2 == 0 ? m3213a(0, dBVar, z) : m3222b(0, dBVar, z);
            } else if (dAVar.f1080b != null) {
                dz dzVar = dAVar.f1080b;
                if (dzVar.f1239b != null) {
                    int d = dzVar.f1241d.f2951i != null ? dzVar.f1241d.f2951i.m1134d() : 0;
                    if (dzVar.f1240c && d == 0) {
                        dzVar.f1239b.m2099a(new float[]{dzVar.f1241d.f2942L, dzVar.f1241d.f2942L, dzVar.f1241d.f2942L, dzVar.f1241d.f2942L, 0.0f, 0.0f, 0.0f, 0.0f});
                    }
                }
                a = size > 1 ? m3213a(0, dBVar, z) : m3213a(2, dBVar, z);
            } else {
                a = size > 1 ? m3213a(1, dBVar, z) : m3213a(3, dBVar, z);
            }
            c0174b.setBackgroundDrawable(a);
            i++;
        }
    }

    private boolean m3217a(C0174B c0174b) {
        int childCount = c0174b.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = c0174b.getChildAt(i);
            boolean z2 = childAt.getVisibility() == 0;
            z = ((childAt instanceof C0174B) && z2) ? m3217a((C0174B) childAt) : z2;
            if (z) {
                break;
            }
        }
        return z;
    }

    static /* synthetic */ boolean m3218a(dw dwVar, View view) {
        boolean z = true;
        if (dwVar.f2934D && dwVar.f2940J != null) {
            dwVar.f2940J.setSelected(false);
        }
        dwVar.f2940J = (C0174B) view;
        if (dwVar.f2964v == 2 || dwVar.f2964v == 1) {
            z = dwVar.m3223c(dwVar.f2940J);
        }
        if (dwVar.f2934D) {
            dwVar.f2940J.setSelected(dwVar.f2934D);
            dwVar.m3231p();
        }
        return z;
    }

    private int m3220b(View view) {
        Iterator it = this.f2932A.iterator();
        int i = 0;
        while (it.hasNext()) {
            dA dAVar = (dA) it.next();
            int indexOf = dAVar.f1079a.indexOf(view);
            if (indexOf != -1) {
                return i + indexOf;
            }
            i = dAVar.f1079a.size() + i;
        }
        return -1;
    }

    private Drawable m3222b(int i, dB dBVar, boolean z) {
        Drawable stateListDrawable = new StateListDrawable();
        if (z) {
            stateListDrawable.addState(FOCUSED_STATE_SET, m3225e(i));
            stateListDrawable.addState(SELECTED_STATE_SET, m3225e(i));
            stateListDrawable.addState(PRESSED_ENABLED_STATE_SET, this.f2941K != null ? m3226f(i) : m3225e(i));
        }
        if (this.f2952j != null) {
            Drawable g;
            int[] iArr = ENABLED_STATE_SET;
            if (!(this.f2952j == null && dBVar == null)) {
                int d;
                switch (i) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                        g = m3228g(dBVar);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        g = m3228g(dBVar);
                        d = dBVar != null ? dBVar.m1134d() : this.f2952j != null ? this.f2952j.m1134d() : 0;
                        if (d == 0 && (g instanceof cA)) {
                            ((cA) g).m2099a(new float[]{this.f2943M, this.f2943M, this.f2943M, this.f2943M, 0.0f, 0.0f, 0.0f, 0.0f});
                            break;
                        }
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        g = m3228g(dBVar);
                        d = dBVar != null ? dBVar.m1134d() : this.f2952j != null ? this.f2952j.m1134d() : 0;
                        if (d == 0 && (g instanceof cA)) {
                            ((cA) g).m2099a(new float[]{0.0f, 0.0f, 0.0f, 0.0f, this.f2943M, this.f2943M, this.f2943M, this.f2943M});
                            break;
                        }
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        g = m3228g(dBVar);
                        d = dBVar != null ? dBVar.m1134d() : this.f2952j != null ? this.f2952j.m1134d() : 0;
                        if (d == 0 && (g instanceof cA)) {
                            ((cA) g).m2094a(this.f2943M);
                            break;
                        }
                }
            }
            g = null;
            stateListDrawable.addState(iArr, g);
        } else {
            stateListDrawable.addState(ENABLED_STATE_SET, m3212a(i, dBVar));
        }
        return stateListDrawable;
    }

    private boolean m3223c(View view) {
        bt btVar = ((ih) ((C0174B) view).getTag()).f1549c;
        if (!((Boolean) btVar.getTag()).booleanValue()) {
            btVar.m908c(this.f2965w);
            btVar.setTag(a);
            if (this.f2964v == 1) {
                if (this.f2967y != null) {
                    this.f2967y.m908c(this.f2966x);
                    this.f2967y.setTag(b);
                }
                this.f2967y = btVar;
                return true;
            }
            this.f2968z.add((C0174B) view);
        } else if (this.f2964v == 2) {
            this.f2967y = null;
            btVar.m908c(this.f2966x);
            btVar.setTag(b);
            this.f2968z.remove(view);
            return false;
        }
        return true;
    }

    private dA m3224d(int i) {
        View dAVar = new dA(this, this.f2948f);
        dAVar.setOrientation(1);
        this.f2932A.add(i, dAVar);
        super.addView(dAVar, i);
        return dAVar;
    }

    private Drawable m3225e(int i) {
        Drawable n;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return m3229n();
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                n = m3229n();
                if ((this.f2949g != null ? this.f2949g.m1134d() : 0) != 0 || !(n instanceof cA)) {
                    return n;
                }
                ((cA) n).m2099a(new float[]{this.f2935E, this.f2935E, this.f2935E, this.f2935E, 0.0f, 0.0f, 0.0f, 0.0f});
                return n;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                n = m3229n();
                if ((this.f2949g != null ? this.f2949g.m1134d() : 0) != 0 || !(n instanceof cA)) {
                    return n;
                }
                ((cA) n).m2099a(new float[]{0.0f, 0.0f, 0.0f, 0.0f, this.f2935E, this.f2935E, this.f2935E, this.f2935E});
                return n;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                n = m3229n();
                if ((this.f2949g != null ? this.f2949g.m1134d() : 0) != 0 || !(n instanceof cA)) {
                    return n;
                }
                ((cA) n).m2094a(this.f2935E);
                return n;
            default:
                return null;
        }
    }

    private Drawable m3226f(int i) {
        if (this.f2941K == null) {
            return null;
        }
        Drawable b;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return this.f2941K.m1127b(true);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (this.f2941K == null) {
                    return null;
                }
                b = this.f2941K.m1127b(true);
                if (this.f2941K.m1134d() != 0 || !(b instanceof cA)) {
                    return b;
                }
                ((cA) b).m2099a(new float[]{this.f2944N, this.f2944N, this.f2944N, this.f2944N, 0.0f, 0.0f, 0.0f, 0.0f});
                return b;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (this.f2941K == null) {
                    return null;
                }
                b = this.f2941K.m1127b(true);
                if (this.f2941K.m1134d() != 0 || !(b instanceof cA)) {
                    return b;
                }
                ((cA) b).m2099a(new float[]{0.0f, 0.0f, 0.0f, 0.0f, this.f2944N, this.f2944N, this.f2944N, this.f2944N});
                return b;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (this.f2941K == null) {
                    return null;
                }
                b = this.f2941K.m1127b(true);
                if (this.f2941K.m1134d() != 0 || !(b instanceof cA)) {
                    return b;
                }
                ((cA) b).m2094a(this.f2944N);
                return b;
            default:
                return null;
        }
    }

    private Drawable m3227f(dB dBVar) {
        return dBVar != null ? dBVar.m1127b(true) : this.f2950h != null ? this.f2950h.m1117a() : null;
    }

    private Drawable m3228g(dB dBVar) {
        return dBVar != null ? dBVar.m1127b(true) : this.f2952j != null ? this.f2952j.m1127b(true) : null;
    }

    private Drawable m3229n() {
        return this.f2949g != null ? this.f2949g.m1127b(true) : new cA(-7829368);
    }

    private void m3230o() {
        Iterator it = this.f2932A.iterator();
        while (it.hasNext()) {
            Drawable b;
            dA dAVar = (dA) it.next();
            if (this.f2939I) {
                int[] iArr = new int[]{0, 10, 0, 10};
                LayoutParams layoutParams = (LayoutParams) dAVar.getLayoutParams();
                layoutParams.leftMargin = iArr[0];
                layoutParams.topMargin = iArr[1];
                layoutParams.rightMargin = iArr[2];
                layoutParams.bottomMargin = iArr[3];
                if (dAVar.f1080b != null) {
                    dz dzVar = dAVar.f1080b;
                    dzVar.f1240c = true;
                    dzVar.m1276a();
                }
            }
            dB dBVar = this.f2950h;
            if (dBVar != null) {
                b = dBVar.m1126b();
                if (b instanceof cA) {
                    int d = dBVar.m1134d();
                    if (dAVar.f1081c.f2939I && d == 0) {
                        ((cA) b).m2094a(f2931B);
                    }
                    ((cA) b).m2098a(true);
                }
            } else if (dAVar.f1081c.f2939I) {
                b = new cA(0);
                b.m2095a(dB.m1116r(1), ViewCompat.MEASURED_STATE_MASK);
                b.m2094a(f2931B);
                b.m2098a(true);
            } else {
                b = null;
            }
            dAVar.setBackgroundDrawable(b);
            dz dzVar2 = dAVar.f1080b;
            if (dzVar2 != null) {
                dBVar = this.f2951i;
                if (dBVar != null) {
                    if (dzVar2.f1238a != null) {
                        dzVar2.f1238a.setBackgroundColor(0);
                        dBVar.m1129b(dzVar2.f1238a);
                    }
                    Drawable b2 = dBVar.m1127b(true);
                    dzVar2.f1239b = b2 instanceof cA ? (cA) b2 : null;
                } else if (dzVar2.f1238a != null) {
                    dzVar2.f1238a.setTextSize(14.0f);
                    dzVar2.f1238a.setTypeface(Typeface.SANS_SERIF, 1);
                    dzVar2.f1238a.setTextColor(-1);
                    dzVar2.f1239b = new cA(180, new int[]{-16776961, -1}, new float[]{0.0f, 1.0f});
                }
                dzVar2.m1276a();
                dzVar2.setBackgroundDrawable(dzVar2.f1239b);
            }
            m3216a(dAVar);
        }
    }

    private void m3231p() {
        this.f2940J.setFocusableInTouchMode(true);
        this.f2940J.requestFocus();
        this.f2940J.setFocusableInTouchMode(false);
    }

    public final View m3232a() {
        return this.f2940J != null ? this.f2940J : null;
    }

    public final void m3233a(int i) {
        super.setVisibility(i);
    }

    public final void m3234a(int i, int i2) {
        this.f2957o = true;
        this.f2958p = i;
        this.f2959q = i2;
    }

    public final void m3235a(View view) {
        if (this.f2934D && this.f2940J != null) {
            this.f2940J.setSelected(false);
        }
        this.f2940J = (C0174B) view;
    }

    public final void m3236a(View view, int i, int i2, ih ihVar) {
        if (m3217a((C0174B) view)) {
            m3215a(view, ihVar);
            dA dAVar = (dA) this.f2932A.get(i2);
            int a = m3211a(i, dAVar);
            dAVar.addView(view, a);
            a++;
            if (this.f2957o && dAVar.f1079a.size() > 0) {
                bN bNVar = new bN(this.f2948f);
                bNVar.m763b(1);
                bNVar.m758a(this.f2959q);
                bNVar.m767d(this.f2958p);
                bNVar.m760a(true);
                bNVar.m762b();
                dAVar.addView(bNVar.m765c(), a);
            }
            dAVar.f1079a.add(i, (C0174B) view);
            if (this.f2939I || this.f2952j != null) {
                m3216a(dAVar);
            }
        }
    }

    public final void m3237a(View view, int i, ih ihVar) {
        dA dAVar = i < this.f2932A.size() ? (dA) this.f2932A.get(i) : null;
        dA d = dAVar == null ? m3224d(i) : dAVar;
        if (m3217a((C0174B) view)) {
            if (this.f2957o && d.f1079a.size() > 0) {
                bN bNVar = new bN(this.f2948f);
                bNVar.m763b(1);
                bNVar.m758a(this.f2959q);
                bNVar.m767d(this.f2958p);
                bNVar.m760a(true);
                bNVar.m762b();
                d.addView(bNVar.m765c());
            }
            m3215a(view, ihVar);
            d.f1079a.add((C0174B) view);
            d.addView(view);
        }
    }

    public final void m3238a(cu cuVar) {
        this.f2962t.add(cuVar);
    }

    public final void m3239a(cv cvVar) {
        this.f2963u = cvVar;
    }

    public final void m3240a(dB dBVar) {
        this.f2951i = dBVar;
        int i = 0;
        if (dBVar != null) {
            i = dBVar.m1158n();
        }
        this.f2942L -= ((float) i) / 2.0f;
    }

    public final void m3241a(ie ieVar) {
        this.f2947e = ieVar;
    }

    public final void m3242a(C0216r c0216r) {
        this.f2946d = c0216r;
    }

    public final void m3243a(String str) {
        this.f2965w = str;
    }

    public final void m3244a(String str, int i) {
        View dzVar = new dz(this, this.f2948f);
        dzVar.f1238a.setText(str);
        dA dAVar = i < this.f2932A.size() ? (dA) this.f2932A.get(i) : null;
        if (dAVar == null) {
            dAVar = m3224d(i);
        }
        dAVar.f1080b = dzVar;
        dAVar.addView(dzVar);
        dzVar.setPadding(this.f2953k[0] + 2, 3, this.f2953k[2] + 2, 3);
    }

    public final void m3245a(boolean z) {
        this.f2939I = z;
    }

    public final void m3246a(boolean z, boolean z2) {
        int i = 0;
        if (this.f2960r == null) {
            this.f2960r = new LinearLayout(this.f2948f);
            this.f2960r.setGravity(5);
            if (this.f2945c == null) {
                this.f2945c = new Button(this.f2948f);
                this.f2945c.setText("Prev");
                this.f2945c.setOnClickListener(this.f2938H);
                this.f2960r.addView(this.f2945c);
                this.f2945c.setVisibility(z ? 0 : 8);
            }
            if (this.f2961s == null) {
                this.f2961s = new Button(this.f2948f);
                this.f2961s.setText("Next");
                this.f2961s.setOnClickListener(this.f2938H);
                this.f2960r.addView(this.f2961s);
                Button button = this.f2961s;
                if (!z2) {
                    i = 8;
                }
                button.setVisibility(i);
            }
            super.addView(this.f2960r);
            return;
        }
        this.f2945c.setVisibility(z ? 0 : 8);
        button = this.f2961s;
        if (!z2) {
            i = 8;
        }
        button.setVisibility(i);
    }

    public final void m3247a(int[] iArr) {
        this.f2937G = true;
        this.f2954l.leftMargin = iArr[0];
        this.f2954l.topMargin = iArr[1];
        this.f2954l.rightMargin = iArr[2];
        this.f2954l.bottomMargin = iArr[3];
    }

    public final void m3248b() {
        super.detachAllViewsFromParent();
        super.removeAllViews();
        this.f2932A.clear();
        if (this.f2968z != null) {
            this.f2968z.clear();
        }
        this.f2967y = null;
        this.f2940J = null;
    }

    public final void m3249b(int i) {
        if (i == -1 && this.f2934D && this.f2940J != null) {
            this.f2940J.setSelected(false);
            this.f2940J.clearFocus();
            this.f2940J = null;
        } else if (i >= 0) {
            Iterator it = this.f2932A.iterator();
            int i2 = i;
            while (it.hasNext()) {
                dA dAVar = (dA) it.next();
                int size = dAVar.f1079a.size();
                if (i2 >= size) {
                    i2 -= size;
                } else {
                    if (this.f2940J != null) {
                        this.f2940J.setSelected(false);
                    }
                    this.f2940J = (C0174B) dAVar.f1079a.get(i2);
                    if (this.f2934D) {
                        this.f2940J.setSelected(this.f2934D);
                    }
                    m3231p();
                    return;
                }
            }
            if (KonyMain.f3659g) {
                Log.e(this.f2955m, "Invalid focused index to set at: " + i + " in segment ");
            }
        }
    }

    public final void m3250b(int i, int i2) {
        dA dAVar = (dA) this.f2932A.get(i2);
        int a = m3211a(i, dAVar);
        if (this.f2968z != null) {
            this.f2968z.remove(dAVar.getChildAt(a));
        }
        if (a == dAVar.getChildCount() - 1) {
            dAVar.removeViewAt(a);
            if (this.f2957o && dAVar.f1079a.size() > 1) {
                dAVar.removeViewAt(a - 1);
            }
        } else {
            dAVar.removeViewAt(a);
            if (this.f2957o) {
                dAVar.removeViewAt(a);
            }
        }
        dAVar.f1079a.remove(i);
        if (this.f2939I || this.f2952j != null) {
            m3216a(dAVar);
        }
        this.f2940J = null;
    }

    public final void m3251b(dB dBVar) {
        this.f2952j = dBVar;
        int i = 0;
        if (dBVar != null) {
            i = dBVar.m1158n();
        }
        this.f2943M -= ((float) i) / 2.0f;
    }

    public final void m3252b(String str) {
        this.f2966x = str;
    }

    public final void m3253b(boolean z) {
        this.f2934D = z;
    }

    public final void m3254b(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            int[] iArr2 = this.f2953k;
            iArr2[i] = iArr2[i] + iArr[i];
        }
    }

    public final View m3255c() {
        return this;
    }

    public final void m3256c(int i) {
        this.f2964v = i;
        if (i == 2) {
            this.f2968z = new ArrayList(1);
        }
    }

    public final void m3257c(dB dBVar) {
        this.f2949g = dBVar;
        int i = 0;
        if (dBVar != null) {
            i = dBVar.m1158n();
        }
        this.f2935E -= ((float) i) / 2.0f;
    }

    public final void m3258c(boolean z) {
        if (this.f2945c != null) {
            this.f2945c.setVisibility(z ? 0 : 8);
        }
    }

    public final void m3259c(int[] iArr) {
        if (this.f2964v != 0) {
            if (this.f2964v == 2) {
                m3271k();
            }
            for (int i : iArr) {
                View view;
                Iterator it = this.f2932A.iterator();
                int i2 = i;
                while (it.hasNext()) {
                    ArrayList arrayList = ((dA) it.next()).f1079a;
                    int size = arrayList.size();
                    if (i2 < size) {
                        view = (View) arrayList.get(i2);
                        break;
                    }
                    i2 -= size;
                }
                view = null;
                if (view != null) {
                    m3223c(view);
                    if (this.f2964v == 1) {
                        this.f2940J = (C0174B) view;
                    }
                }
            }
        }
    }

    public final void m3260d() {
        if (!this.f2936F) {
            if (!this.f2937G && this.f2939I) {
                this.f2954l.leftMargin = 10;
                this.f2954l.rightMargin = 10;
            }
            setLayoutParams(this.f2954l);
            m3230o();
            this.f2936F = true;
        }
    }

    public final void m3261d(dB dBVar) {
        this.f2950h = dBVar;
        int i = 0;
        if (dBVar != null) {
            i = dBVar.m1158n();
            int d = dBVar.m1134d();
            if (d != 0) {
                this.f2935E = (float) d;
                this.f2942L = (float) d;
                this.f2943M = (float) d;
                this.f2944N = (float) d;
            }
        }
        this.f2933C = f2931B - (((float) i) / 2.0f);
    }

    public final void m3262d(boolean z) {
        if (this.f2961s != null) {
            this.f2961s.setVisibility(z ? 0 : 8);
        }
    }

    public final void m3263e() {
        this.f2967y = null;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LinearLayout linearLayout = (LinearLayout) getChildAt(i);
            if (linearLayout.getTag() != null) {
                Object tag = linearLayout.getChildAt(0).getTag();
                if (tag instanceof ih) {
                    ((ih) tag).m1405a();
                }
            }
        }
        Iterator it = this.f2932A.iterator();
        while (it.hasNext()) {
            dA dAVar = (dA) it.next();
            dAVar.setBackgroundDrawable(null);
            if (dAVar.f1080b != null) {
                dAVar.f1080b.setBackgroundDrawable(null);
            }
        }
        if (this.f2968z != null) {
            this.f2968z.clear();
        }
        this.f2968z = null;
        this.f2967y = null;
        this.f2940J = null;
        m3248b();
    }

    public final void m3264e(dB dBVar) {
        this.f2941K = dBVar;
        int i = 0;
        if (dBVar != null) {
            i = dBVar.m1158n();
        }
        this.f2944N -= ((float) i) / 2.0f;
    }

    public final void m3265e(boolean z) {
        m3230o();
    }

    public final void m3266f() {
    }

    public final void m3267g() {
        setFocusableInTouchMode(true);
        requestFocus();
        setFocusableInTouchMode(false);
    }

    public final int[] m3268h() {
        int i = 0;
        if (this.f2964v == 1) {
            if (m3270j() == -1) {
                return null;
            }
            return new int[]{m3270j()};
        } else if (this.f2964v != 2 || this.f2968z == null) {
            return null;
        } else {
            int size = this.f2968z.size();
            int[] iArr = new int[size];
            while (i < size) {
                iArr[i] = m3220b((View) this.f2968z.get(i));
                i++;
            }
            return iArr;
        }
    }

    public final View[] m3269i() {
        if (this.f2968z == null) {
            return null;
        }
        int size = this.f2968z.size();
        View[] viewArr = new View[size];
        for (int i = 0; i < size; i++) {
            viewArr[i] = (View) this.f2968z.get(i);
        }
        return viewArr;
    }

    public final int m3270j() {
        return this.f2940J == null ? -1 : m3220b(this.f2940J);
    }

    public final void m3271k() {
        if (this.f2964v == 2) {
            Iterator it = this.f2968z.iterator();
            while (it.hasNext()) {
                bt btVar = ((ih) ((C0174B) it.next()).getTag()).f1549c;
                btVar.m908c(this.f2966x);
                btVar.setTag(b);
            }
            this.f2967y = null;
            this.f2968z.clear();
        } else if (this.f2964v == 1 && this.f2967y != null) {
            this.f2967y.m908c(this.f2966x);
            this.f2967y.setTag(b);
            this.f2967y = null;
            this.f2940J = null;
        }
    }

    public final void m3272l() {
        m3230o();
    }

    public final void m3273m() {
        this.f2962t.clear();
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2940J != null && this.f2934D) {
            Log.v(this.f2955m, "Enter onAttachedToWindow");
            m3231p();
        }
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        contextMenu.clear();
        if (!this.f2962t.isEmpty()) {
            Iterator it = this.f2962t.iterator();
            while (it.hasNext()) {
                cu cuVar = (cu) it.next();
                MenuItem add = contextMenu.add(0, cuVar.m1040a().hashCode(), 0, cuVar.m1044b());
                Drawable d = cuVar.m1046d();
                if (d != null) {
                    add.setIcon(d);
                }
                add.setOnMenuItemClickListener(this);
            }
            this.f2940J = (C0174B) view;
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (this.f2963u != null) {
            Iterator it = this.f2962t.iterator();
            while (it.hasNext()) {
                cu cuVar = (cu) it.next();
                if (menuItem.getItemId() == cuVar.m1040a().hashCode()) {
                    this.f2963u.m1048a(cuVar);
                    return true;
                }
            }
        }
        return false;
    }
}
