package ny0k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TableLayout;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.C0174B;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.bN;
import com.konylabs.api.ui.bt;
import com.konylabs.api.ui.bw;
import com.konylabs.api.ui.cu;
import com.konylabs.api.ui.dB;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Vector;

public class bA extends LinearLayout implements OnMenuItemClickListener, OnCreateContextMenuListener, bf, bg, bh {
    private static final float f3280y;
    private boolean f3281A;
    private float f3282B;
    private boolean f3283C;
    private boolean f3284D;
    private boolean f3285E;
    private boolean f3286F;
    private C0174B f3287G;
    private dB f3288H;
    private float f3289I;
    private float f3290J;
    private float f3291K;
    private AccessibilityDelegateCompat f3292L;
    cg f3293c;
    private Context f3294d;
    private dB f3295e;
    private dB f3296f;
    private dB f3297g;
    private dB f3298h;
    private dB f3299i;
    private int[] f3300j;
    private LayoutParams f3301k;
    private bC f3302l;
    private boolean f3303m;
    private int f3304n;
    private int f3305o;
    private Vector f3306p;
    private bi f3307q;
    private int f3308r;
    private String f3309s;
    private String f3310t;
    private bt f3311u;
    private bw f3312v;
    private ArrayList f3313w;
    private ArrayList f3314x;
    private float f3315z;

    static {
        f3280y = (float) dB.m1116r(10);
    }

    public bA(Context context) {
        super(context);
        this.f3300j = new int[]{0, 0, 0, 0};
        this.f3306p = new Vector();
        this.f3307q = null;
        this.f3308r = 0;
        this.f3315z = f3280y;
        this.f3281A = false;
        this.f3282B = f3280y;
        this.f3284D = false;
        this.f3289I = f3280y;
        this.f3290J = f3280y;
        this.f3291K = f3280y;
        this.f3292L = new bB(this);
        this.f3294d = context;
        this.f3302l = new bC();
        this.f3301k = new TableLayout.LayoutParams(-1, -2);
        super.setOrientation(1);
        this.f3314x = new ArrayList();
    }

    private int m3576a(int i, bF bFVar) {
        int i2 = 0;
        int i3 = bFVar.f2128b != null ? 1 : 0;
        Iterator it = bFVar.f2127a.iterator();
        while (it.hasNext()) {
            it.next();
            if (i2 == i) {
                break;
            }
            i2++;
            i3 += this.f3303m ? 2 : 1;
        }
        return i3;
    }

    private Drawable m3577a(int i, dB dBVar) {
        Drawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(FOCUSED_STATE_SET, m3592d(i));
        stateListDrawable.addState(SELECTED_STATE_SET, m3592d(i));
        stateListDrawable.addState(PRESSED_ENABLED_STATE_SET, this.f3288H != null ? m3596h(i) : m3592d(i));
        stateListDrawable.addState(ENABLED_STATE_SET, m3588c(i, dBVar));
        return stateListDrawable;
    }

    private void m3579a(View view, ci ciVar) {
        view.setLayoutParams(new LayoutParams(-1, -2));
        view.setFocusable(true);
        if (ciVar == null || ciVar.f2277a) {
            view.setOnClickListener(this.f3302l);
        }
        if (this.f3308r == 2 || this.f3308r == 1) {
            ViewCompat.setAccessibilityDelegate(view, this.f3292L);
        }
        view.setOnCreateContextMenuListener(this);
        if (ciVar != null) {
            view.setTag(ciVar);
        }
    }

    private void m3580a(bF bFVar) {
        bD bDVar;
        if (this.f3286F) {
            int[] iArr = new int[]{0, dB.m1116r(10), 0, dB.m1116r(10)};
            LayoutParams layoutParams = (LayoutParams) bFVar.getLayoutParams();
            layoutParams.leftMargin = iArr[0];
            layoutParams.topMargin = iArr[1];
            layoutParams.rightMargin = iArr[2];
            layoutParams.bottomMargin = iArr[3];
            if (bFVar.f2128b != null) {
                bDVar = bFVar.f2128b;
                bDVar.f2120a = true;
                bDVar.m2018a();
            }
            dB dBVar = this.f3296f;
            Drawable drawable = null;
            if (dBVar != null) {
                drawable = dBVar.m1126b();
                if (drawable instanceof cA) {
                    int d = dBVar.m1134d();
                    if (bFVar.f2130d.f3286F && d == 0) {
                        ((cA) drawable).m2094a(bFVar.f2130d.f3315z);
                    }
                    ((cA) drawable).m2098a(true);
                }
            } else if (bFVar.f2130d.f3286F) {
                drawable = new cA(0);
                drawable.m2095a(dB.m1116r(1), ViewCompat.MEASURED_STATE_MASK);
                drawable.m2094a(bFVar.f2130d.f3315z);
                drawable.m2098a(true);
            }
            bFVar.setBackgroundDrawable(drawable);
        }
        bDVar = bFVar.f2128b;
        if (bDVar != null) {
            bDVar.m2019a(this.f3297g);
            int indexOf = this.f3314x.indexOf(bFVar);
            if (this.f3286F || (this.f3283C && indexOf == 0)) {
                bDVar.m2018a();
            }
        }
        m3584b(bFVar);
    }

    private boolean m3581a(C0174B c0174b) {
        int childCount = c0174b.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = c0174b.getChildAt(i);
            boolean z2 = childAt.getVisibility() == 0;
            z = ((childAt instanceof C0174B) && z2) ? m3581a((C0174B) childAt) : z2;
            if (z) {
                break;
            }
        }
        return z;
    }

    static /* synthetic */ boolean m3582a(bA bAVar, View view) {
        boolean z = true;
        if (bAVar.f3281A && bAVar.f3287G != null) {
            bAVar.f3287G.setSelected(false);
        }
        bAVar.f3287G = (C0174B) view;
        if (bAVar.f3308r == 2 || bAVar.f3308r == 1) {
            z = bAVar.m3590c(bAVar.f3287G);
        }
        if (bAVar.f3281A) {
            bAVar.f3287G.setSelected(bAVar.f3281A);
        }
        return z;
    }

    private Drawable m3583b(int i, dB dBVar) {
        Drawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(FOCUSED_STATE_SET, m3592d(i));
        stateListDrawable.addState(SELECTED_STATE_SET, m3592d(i));
        stateListDrawable.addState(PRESSED_ENABLED_STATE_SET, this.f3288H != null ? m3596h(i) : m3592d(i));
        if (this.f3298h != null) {
            Drawable h;
            int[] iArr = ENABLED_STATE_SET;
            if (!(this.f3298h == null && dBVar == null)) {
                int d;
                switch (i) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                        h = m3597h(dBVar);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        h = m3597h(dBVar);
                        d = dBVar != null ? dBVar.m1134d() : this.f3298h != null ? this.f3298h.m1134d() : 0;
                        if (d == 0 && (h instanceof cA)) {
                            ((cA) h).m2099a(new float[]{this.f3290J, this.f3290J, this.f3290J, this.f3290J, 0.0f, 0.0f, 0.0f, 0.0f});
                            break;
                        }
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        h = m3597h(dBVar);
                        d = dBVar != null ? dBVar.m1134d() : this.f3298h != null ? this.f3298h.m1134d() : 0;
                        if (d == 0 && (h instanceof cA)) {
                            ((cA) h).m2099a(new float[]{0.0f, 0.0f, 0.0f, 0.0f, this.f3290J, this.f3290J, this.f3290J, this.f3290J});
                            break;
                        }
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        h = m3597h(dBVar);
                        d = dBVar != null ? dBVar.m1134d() : this.f3298h != null ? this.f3298h.m1134d() : 0;
                        if (d == 0 && (h instanceof cA)) {
                            ((cA) h).m2094a(this.f3290J);
                            break;
                        }
                }
            }
            h = null;
            stateListDrawable.addState(iArr, h);
        } else {
            stateListDrawable.addState(ENABLED_STATE_SET, m3588c(i, dBVar));
        }
        return stateListDrawable;
    }

    private void m3584b(bF bFVar) {
        int size = bFVar.f2127a.size();
        if (size == 0) {
            bD bDVar = bFVar.f2128b;
            if (bDVar != null) {
                Drawable c = bDVar.m2021c();
                if (!(c instanceof cA)) {
                    return;
                }
                if (this.f3286F || this.f3283C) {
                    ((cA) c).m2094a(this.f3289I);
                    return;
                }
                return;
            }
            return;
        }
        int indexOf = this.f3314x.indexOf(bFVar);
        int i = 0;
        while (i < size) {
            Drawable a;
            C0174B c0174b = (C0174B) bFVar.f2127a.get(i);
            Object tag = c0174b.getTag();
            dB dBVar = tag instanceof ci ? ((ci) tag).f2278b : null;
            if (!this.f3286F && !this.f3283C) {
                a = i % 2 == 0 ? m3577a(0, dBVar) : m3583b(0, dBVar);
            } else if (i == 0) {
                bD bDVar2 = bFVar.f2128b;
                if (bDVar2 != null) {
                    if (this.f3286F || (this.f3283C && indexOf == 0)) {
                        bDVar2.m2020b();
                    }
                    a = size > 1 ? m3577a(0, dBVar) : m3577a(2, dBVar);
                } else {
                    a = size > 1 ? m3577a(1, dBVar) : m3577a(3, dBVar);
                }
            } else {
                a = i == size + -1 ? (this.f3286F || (this.f3283C && indexOf == this.f3314x.size() - 1)) ? i % 2 == 0 ? m3577a(2, dBVar) : m3583b(2, dBVar) : i % 2 == 0 ? m3577a(0, dBVar) : m3583b(0, dBVar) : i % 2 == 0 ? m3577a(0, dBVar) : m3583b(0, dBVar);
            }
            c0174b.setBackgroundDrawable(a);
            i++;
        }
    }

    static /* synthetic */ int[] m3586b(bA bAVar, View view) {
        int size = bAVar.f3314x.size();
        for (int i = 0; i < size; i++) {
            if (((bF) bAVar.f3314x.get(i)).f2127a.indexOf(view) != -1) {
                return new int[]{((bF) bAVar.f3314x.get(i)).f2127a.indexOf(view), i};
            }
        }
        return null;
    }

    private Drawable m3588c(int i, dB dBVar) {
        if (this.f3296f == null && dBVar == null) {
            return null;
        }
        Drawable g;
        int d;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return m3595g(dBVar);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                g = m3595g(dBVar);
                d = dBVar != null ? dBVar.m1134d() : this.f3296f != null ? this.f3296f.m1134d() : 0;
                if (d != 0 || !(g instanceof cA)) {
                    return g;
                }
                ((cA) g).m2099a(new float[]{this.f3315z, this.f3315z, this.f3315z, this.f3315z, 0.0f, 0.0f, 0.0f, 0.0f});
                return g;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                g = m3595g(dBVar);
                d = dBVar != null ? dBVar.m1134d() : this.f3296f != null ? this.f3296f.m1134d() : 0;
                if (d != 0 || !(g instanceof cA)) {
                    return g;
                }
                ((cA) g).m2099a(new float[]{0.0f, 0.0f, 0.0f, 0.0f, this.f3315z, this.f3315z, this.f3315z, this.f3315z});
                return g;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                g = m3595g(dBVar);
                d = dBVar != null ? dBVar.m1134d() : this.f3296f != null ? this.f3296f.m1134d() : 0;
                if (d != 0 || !(g instanceof cA)) {
                    return g;
                }
                ((cA) g).m2094a(this.f3315z);
                return g;
            default:
                return null;
        }
    }

    private bF m3589c(int i) {
        View bFVar = new bF(this, this.f3294d);
        bFVar.setOrientation(1);
        this.f3314x.add(i, bFVar);
        super.addView(bFVar, i);
        return bFVar;
    }

    private boolean m3590c(View view) {
        boolean z = true;
        this.f3287G = (C0174B) view;
        View view2 = ((ci) ((C0174B) view).getTag()).f2279c;
        if (view2 instanceof bw) {
            bw bwVar = (bw) view2;
            if (!((Boolean) bwVar.getTag()).booleanValue()) {
                bwVar.m948c(this.f3309s);
                bwVar.setTag(a);
                if (this.f3308r == 1) {
                    if (this.f3312v != null) {
                        this.f3312v.m948c(this.f3310t);
                        this.f3312v.setTag(b);
                    }
                    this.f3312v = bwVar;
                    return true;
                }
                this.f3313w.add(this.f3287G);
            } else if (this.f3308r == 2) {
                this.f3312v = null;
                bwVar.m948c(this.f3310t);
                bwVar.setTag(b);
                this.f3313w.remove(this.f3287G);
                return false;
            }
            return true;
        }
        bt btVar = (bt) view2;
        if (!((Boolean) btVar.getTag()).booleanValue()) {
            btVar.m908c(this.f3309s);
            btVar.setTag(a);
            if (this.f3308r == 1) {
                if (this.f3311u != null) {
                    this.f3311u.m908c(this.f3310t);
                    this.f3311u.setTag(b);
                }
                this.f3311u = btVar;
            } else {
                this.f3313w.add(this.f3287G);
            }
        } else if (this.f3308r == 2) {
            this.f3311u = null;
            btVar.m908c(this.f3310t);
            btVar.setTag(b);
            this.f3313w.remove(this.f3287G);
            z = false;
        }
        return z;
    }

    static /* synthetic */ boolean m3591c(bA bAVar, View view) {
        View view2 = ((ci) ((C0174B) view).getTag()).f2279c;
        return view2 instanceof bw ? ((Boolean) ((bw) view2).getTag()).booleanValue() : ((Boolean) ((bt) view2).getTag()).booleanValue();
    }

    private Drawable m3592d(int i) {
        Drawable e;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return m3593e();
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                e = m3593e();
                if ((this.f3295e != null ? this.f3295e.m1134d() : 0) != 0 || !(e instanceof cA)) {
                    return e;
                }
                ((cA) e).m2099a(new float[]{this.f3282B, this.f3282B, this.f3282B, this.f3282B, 0.0f, 0.0f, 0.0f, 0.0f});
                return e;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                e = m3593e();
                if ((this.f3295e != null ? this.f3295e.m1134d() : 0) != 0 || !(e instanceof cA)) {
                    return e;
                }
                ((cA) e).m2099a(new float[]{0.0f, 0.0f, 0.0f, 0.0f, this.f3282B, this.f3282B, this.f3282B, this.f3282B});
                return e;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                e = m3593e();
                if ((this.f3295e != null ? this.f3295e.m1134d() : 0) != 0 || !(e instanceof cA)) {
                    return e;
                }
                ((cA) e).m2094a(this.f3282B);
                return e;
            default:
                return null;
        }
    }

    private Drawable m3593e() {
        return this.f3295e != null ? this.f3295e.m1127b(true) : new cA(-7829368);
    }

    private C0174B m3594f(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return null;
        }
        if (i < this.f3314x.size()) {
            bF bFVar = (bF) this.f3314x.get(i);
            if (i2 < bFVar.f2127a.size()) {
                return (C0174B) bFVar.f2127a.get(i2);
            }
        }
        return null;
    }

    private Drawable m3595g(dB dBVar) {
        return dBVar != null ? dBVar.m1127b(true) : this.f3296f != null ? this.f3286F ? this.f3296f.m1117a() : this.f3296f.m1127b(true) : null;
    }

    private Drawable m3596h(int i) {
        if (this.f3288H == null) {
            return null;
        }
        Drawable b;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return this.f3288H.m1127b(true);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (this.f3288H == null) {
                    return null;
                }
                b = this.f3288H.m1127b(true);
                if (this.f3288H.m1134d() != 0 || !(b instanceof cA)) {
                    return b;
                }
                ((cA) b).m2099a(new float[]{this.f3291K, this.f3291K, this.f3291K, this.f3291K, 0.0f, 0.0f, 0.0f, 0.0f});
                return b;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (this.f3288H == null) {
                    return null;
                }
                b = this.f3288H.m1127b(true);
                if (this.f3288H.m1134d() != 0 || !(b instanceof cA)) {
                    return b;
                }
                ((cA) b).m2099a(new float[]{0.0f, 0.0f, 0.0f, 0.0f, this.f3291K, this.f3291K, this.f3291K, this.f3291K});
                return b;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (this.f3288H == null) {
                    return null;
                }
                b = this.f3288H.m1127b(true);
                if (this.f3288H.m1134d() != 0 || !(b instanceof cA)) {
                    return b;
                }
                ((cA) b).m2094a(this.f3291K);
                return b;
            default:
                return null;
        }
    }

    private Drawable m3597h(dB dBVar) {
        return dBVar != null ? dBVar.m1127b(true) : this.f3298h != null ? this.f3298h.m1127b(true) : null;
    }

    public final void m3598a() {
        super.removeAllViews();
        this.f3314x.clear();
        if (this.f3313w != null) {
            this.f3313w.clear();
        }
        this.f3311u = null;
        this.f3312v = null;
        this.f3287G = null;
    }

    public final void m3599a(int i) {
        if (this.f3314x != null && i < this.f3314x.size()) {
            m3584b((bF) this.f3314x.get(i));
        }
    }

    public final void m3600a(int i, int i2) {
        bF bFVar = (bF) this.f3314x.get(i2);
        int a = m3576a(i, bFVar);
        if (this.f3313w != null) {
            this.f3313w.remove(bFVar.getChildAt(a));
        }
        View childAt;
        if (a == bFVar.getChildCount() - 1) {
            bFVar.removeViewAt(a);
            if (this.f3303m && bFVar.f2127a.size() > 1) {
                a--;
                childAt = bFVar.getChildAt(a);
                bFVar.removeViewAt(a);
                bFVar.f2129c.remove(childAt);
                childAt.getTag();
            }
        } else {
            bFVar.removeViewAt(a);
            if (this.f3303m) {
                childAt = bFVar.getChildAt(a);
                bFVar.removeViewAt(a);
                bFVar.f2129c.remove(childAt);
                childAt.getTag();
            }
        }
        bFVar.f2127a.remove(i);
        if (bFVar.f2128b == null && bFVar.f2127a.size() == 0) {
            this.f3314x.remove(i2);
            super.removeViewAt(i2);
        }
        this.f3287G = null;
    }

    public final void m3601a(View view) {
        if (this.f3281A && this.f3287G != null) {
            this.f3287G.setSelected(false);
        }
        this.f3287G = (C0174B) view;
    }

    public final void m3602a(View view, int i, int i2, ci ciVar) {
        if (m3581a((C0174B) view)) {
            m3579a(view, ciVar);
            bF bFVar = (bF) this.f3314x.get(i2);
            int a = m3576a(i, bFVar);
            bFVar.addView(view, a);
            a++;
            if (this.f3303m && bFVar.f2127a.size() > 0) {
                bN bNVar = new bN(this.f3294d);
                bNVar.m763b(1);
                bNVar.m758a(this.f3305o);
                bNVar.m767d(this.f3304n);
                bNVar.m760a(true);
                bNVar.m762b();
                View c = bNVar.m765c();
                c.setTag(bNVar);
                bFVar.addView(c, a);
                ArrayList arrayList = bFVar.f2129c;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    bFVar.f2129c = arrayList;
                }
                arrayList.add(c);
            }
            bFVar.f2127a.add(i, (C0174B) view);
        }
    }

    public final void m3603a(View view, int i, ci ciVar) {
        bF bFVar = i < this.f3314x.size() ? (bF) this.f3314x.get(i) : null;
        bF c = bFVar == null ? m3589c(i) : bFVar;
        if (m3581a((C0174B) view)) {
            if (this.f3303m && c.f2127a.size() > 0) {
                bN bNVar = new bN(this.f3294d);
                bNVar.m763b(1);
                bNVar.m758a(this.f3305o);
                bNVar.m767d(this.f3304n);
                bNVar.m760a(true);
                bNVar.m762b();
                View c2 = bNVar.m765c();
                c2.setTag(bNVar);
                c.addView(c2);
                ArrayList arrayList = c.f2129c;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    c.f2129c = arrayList;
                }
                arrayList.add(c2);
            }
            m3579a(view, ciVar);
            c.f2127a.add((C0174B) view);
            c.addView(view);
        }
    }

    public final void m3604a(C0174B c0174b, int i, dB dBVar) {
        bF c = m3589c(i);
        bD bDVar = new bD();
        bDVar.f2124e = dBVar;
        bDVar.f2122c = c0174b;
        c.f2128b = bDVar;
        c.addView(c0174b);
    }

    public final void m3605a(cu cuVar) {
        this.f3306p.add(cuVar);
    }

    public final void m3606a(dB dBVar) {
        if (dBVar != null) {
            this.f3299i = dBVar;
            Drawable b = dBVar.m1127b(true);
            int d = dBVar.m1134d();
            if (d != 0) {
                this.f3283C = true;
                if (this.f3295e == null || this.f3295e.m1134d() == 0) {
                    this.f3282B = (float) d;
                }
                if (this.f3296f == null || this.f3296f.m1134d() == 0) {
                    this.f3315z = (float) d;
                }
                if (this.f3297g == null || this.f3297g.m1134d() == 0) {
                    this.f3289I = (float) d;
                }
                if (this.f3298h == null || this.f3298h.m1134d() == 0) {
                    this.f3290J = (float) d;
                }
                if (this.f3288H == null || this.f3288H.m1134d() == 0) {
                    this.f3291K = (float) d;
                }
            } else {
                this.f3283C = false;
            }
            setBackgroundDrawable(b);
            return;
        }
        this.f3283C = false;
        setBackgroundDrawable(null);
    }

    public final void m3607a(String str) {
        this.f3309s = str;
    }

    public final void m3608a(String str, int i, String str2) {
        bE bEVar = new bE(this, this.f3294d);
        bEVar.f2126a.setText(str);
        if (KonyMain.f3656d > 3) {
            if (str2 != null) {
                bEVar.f2126a.setContentDescription(str2);
                if (KonyMain.f3656d >= 16) {
                    bEVar.f2126a.setImportantForAccessibility(1);
                }
            } else if (KonyMain.f3656d >= 16) {
                bEVar.f2126a.setImportantForAccessibility(2);
            } else {
                bEVar.setContentDescription(BuildConfig.FLAVOR);
            }
        }
        bF c = m3589c(i);
        bD bDVar = new bD();
        bDVar.f2121b = bEVar;
        c.f2128b = bDVar;
        c.addView(bEVar);
        bEVar.setPadding(this.f3300j[0] + dB.m1116r(2), dB.m1116r(3), this.f3300j[2] + dB.m1116r(2), dB.m1116r(3));
    }

    public final void m3609a(LinkedHashMap linkedHashMap) {
        if (this.f3308r != 0 && this.f3314x.size() > 0) {
            m3638q();
            for (Integer intValue : linkedHashMap.keySet()) {
                int intValue2 = intValue.intValue();
                ArrayList arrayList = ((bF) this.f3314x.get(intValue2)).f2127a;
                int i;
                if (this.f3308r == 2) {
                    ArrayList arrayList2 = (ArrayList) linkedHashMap.get(Integer.valueOf(intValue2));
                    int size = arrayList2.size();
                    for (i = 0; i < size; i++) {
                        m3590c((View) arrayList.get(((Integer) arrayList2.get(i)).intValue()));
                    }
                } else if (this.f3308r == 1) {
                    i = ((Integer) linkedHashMap.get(Integer.valueOf(intValue2))).intValue();
                    this.f3287G = (C0174B) arrayList.get(i);
                    m3590c(this.f3287G);
                    m3615b(intValue2, i);
                }
            }
        }
    }

    public final void m3610a(bi biVar) {
        this.f3307q = biVar;
    }

    public final void m3611a(cg cgVar) {
        this.f3293c = cgVar;
    }

    public final void m3612a(int[] iArr) {
        this.f3285E = true;
        this.f3301k.leftMargin = iArr[0];
        this.f3301k.topMargin = iArr[1];
        this.f3301k.rightMargin = iArr[2];
        this.f3301k.bottomMargin = iArr[3];
    }

    public final void m3613b() {
        this.f3284D = false;
        m3633l();
    }

    public final void m3614b(int i) {
        if (this.f3314x != null && i >= 0 && i < this.f3314x.size()) {
            bF bFVar = (bF) this.f3314x.get(i);
            if (bFVar != null) {
                bD bDVar = bFVar.f2128b;
                if (bDVar != null) {
                    bE a = bDVar.f2121b;
                    if (a != null) {
                        a.setBackgroundDrawable(null);
                        bDVar.f2121b = null;
                    }
                    C0174B b = bDVar.f2122c;
                    if (b != null) {
                        b.m146f();
                        bDVar.f2122c = null;
                    }
                }
                ArrayList arrayList = bFVar.f2127a;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((C0174B) arrayList.get(i2)).m146f();
                    }
                    bFVar.f2127a = null;
                }
                bFVar.setBackgroundDrawable(null);
                bFVar.removeAllViews();
                removeViewAt(i);
                this.f3314x.remove(i);
            }
        }
    }

    public final void m3615b(int i, int i2) {
        if (!this.f3281A) {
            this.f3287G = m3594f(i, i2);
        } else if (i != -1 && i2 != -1) {
            if (this.f3287G != null) {
                this.f3287G.setSelected(false);
            }
            this.f3287G = m3594f(i, i2);
            if (this.f3287G != null) {
                this.f3287G.setSelected(true);
            }
        } else if (this.f3287G != null) {
            this.f3287G.setSelected(false);
            this.f3287G.clearFocus();
            this.f3287G = null;
        }
        if (this.f3287G != null) {
            requestChildFocus(this.f3287G, this.f3287G);
        }
    }

    public final void m3616b(View view) {
    }

    public final void m3617b(dB dBVar) {
        this.f3296f = dBVar;
        int i = 0;
        if (dBVar != null) {
            i = dBVar.m1134d();
            if (i == 0 && this.f3299i != null) {
                i = this.f3299i.m1134d();
            }
        } else if (this.f3299i != null) {
            i = this.f3299i.m1134d();
        }
        if (i != 0) {
            this.f3282B = (float) i;
            this.f3289I = (float) i;
            this.f3290J = (float) i;
            this.f3291K = (float) i;
            this.f3315z = (float) i;
        }
    }

    public final void m3618b(String str) {
        this.f3310t = str;
    }

    public final void m3619b(boolean z) {
        this.f3286F = z;
    }

    public final void m3620b(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            int[] iArr2 = this.f3300j;
            iArr2[i] = iArr2[i] + iArr[i];
        }
    }

    public final void b_(boolean z) {
        this.f3281A = z;
        if (this.f3287G == null) {
            return;
        }
        if (z) {
            this.f3287G.setSelected(true);
        } else {
            this.f3287G.setSelected(false);
        }
    }

    public final void m3621c() {
        Iterator it = this.f3314x.iterator();
        while (it.hasNext()) {
            m3580a((bF) it.next());
        }
    }

    public final void m3622c(int i, int i2) {
        this.f3303m = true;
        this.f3304n = i;
        this.f3305o = i2;
        Iterator it = this.f3314x.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = ((bF) it.next()).f2129c;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    bN bNVar = (bN) ((View) arrayList.get(i3)).getTag();
                    bNVar.m758a(i2);
                    bNVar.m767d(i);
                    bNVar.requestLayout();
                }
            }
        }
    }

    public final void m3623c(dB dBVar) {
        this.f3295e = dBVar;
        int i = 0;
        if (dBVar != null) {
            i = dBVar.m1134d();
            if (i == 0 && this.f3299i != null) {
                i = this.f3299i.m1134d();
            }
        } else if (this.f3299i != null) {
            i = this.f3299i.m1134d();
        }
        if (i != 0) {
            this.f3282B = (float) i;
        }
    }

    public final void m3624d() {
        this.f3306p.clear();
    }

    public final void m3625d(int i, int i2) {
        m3615b(i, i2);
        if (this.f3308r == 1) {
            m3590c(this.f3287G);
        }
    }

    public final void m3626d(dB dBVar) {
        this.f3298h = dBVar;
        int i = 0;
        if (dBVar != null) {
            i = dBVar.m1134d();
            if (i == 0 && this.f3299i != null) {
                i = this.f3299i.m1134d();
            }
        } else if (this.f3299i != null) {
            i = this.f3299i.m1134d();
        }
        if (i != 0) {
            this.f3290J = (float) i;
        }
    }

    public final void m3627e(int i, int i2) {
        if (this.f3314x != null && i >= 0) {
            int size = this.f3314x.size();
            if (i >= size) {
                i = size - i2;
            }
            int i3 = (i + i2) - 1;
            while (i <= i3 && i < size) {
                m3580a((bF) this.f3314x.get(i));
                i++;
            }
        }
    }

    public final void m3628e(dB dBVar) {
        this.f3297g = dBVar;
        int i = 0;
        if (dBVar != null) {
            i = dBVar.m1134d();
            if (i == 0 && this.f3299i != null) {
                i = this.f3299i.m1134d();
            }
        } else if (this.f3299i != null) {
            i = this.f3299i.m1134d();
        }
        if (i != 0) {
            this.f3289I = (float) i;
        }
    }

    public final void e_(int i) {
        super.setVisibility(i);
    }

    public final void m3629f(int i) {
        this.f3301k.height = i;
        setLayoutParams(this.f3301k);
    }

    public final void m3630f(dB dBVar) {
        this.f3288H = dBVar;
        int i = 0;
        if (this.f3288H != null) {
            i = this.f3288H.m1134d();
            if (i == 0 && this.f3299i != null) {
                i = this.f3299i.m1134d();
            }
        } else if (this.f3299i != null) {
            i = this.f3299i.m1134d();
        }
        if (i != 0) {
            this.f3291K = (float) i;
        }
    }

    public final void m3631g(int i) {
        this.f3308r = i;
        if (i == 2) {
            this.f3313w = new ArrayList(1);
        }
    }

    public final View m3632k() {
        return this;
    }

    public final void m3633l() {
        if (!this.f3284D) {
            if (!this.f3285E && this.f3286F) {
                this.f3301k.leftMargin = dB.m1116r(10);
                this.f3301k.rightMargin = dB.m1116r(10);
            }
            setLayoutParams(this.f3301k);
            m3621c();
            this.f3284D = true;
        }
    }

    public final void m3634m() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LinearLayout linearLayout = (LinearLayout) getChildAt(i);
            if (linearLayout.getTag() != null) {
                Object tag = linearLayout.getChildAt(0).getTag();
                if (tag instanceof ci) {
                    ((ci) tag).m2166a();
                }
            }
        }
        Iterator it = this.f3314x.iterator();
        while (it.hasNext()) {
            bF bFVar = (bF) it.next();
            bFVar.setBackgroundDrawable(null);
            bD bDVar = bFVar.f2128b;
            if (bDVar != null) {
                bDVar.m2022d();
            }
        }
        if (this.f3313w != null) {
            this.f3313w.clear();
        }
        this.f3311u = null;
        this.f3312v = null;
        this.f3287G = null;
        m3598a();
    }

    public final void m3635n() {
        m3621c();
    }

    public final void m3636o() {
        setFocusableInTouchMode(true);
        requestFocus();
        setFocusableInTouchMode(false);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        contextMenu.clear();
        if (!this.f3306p.isEmpty()) {
            Iterator it = this.f3306p.iterator();
            while (it.hasNext()) {
                cu cuVar = (cu) it.next();
                MenuItem add = contextMenu.add(0, cuVar.m1040a().hashCode(), 0, cuVar.m1044b());
                Drawable d = cuVar.m1046d();
                if (d != null) {
                    add.setIcon(d);
                }
                add.setOnMenuItemClickListener(this);
            }
            this.f3287G = (C0174B) view;
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (this.f3307q != null) {
            Iterator it = this.f3306p.iterator();
            while (it.hasNext()) {
                cu cuVar = (cu) it.next();
                if (menuItem.getItemId() == cuVar.m1040a().hashCode()) {
                    this.f3307q.m2076a(cuVar);
                    return true;
                }
            }
        }
        return false;
    }

    public final int m3637p() {
        if (this.f3287G == null) {
            return -1;
        }
        C0174B c0174b = this.f3287G;
        Iterator it = this.f3314x.iterator();
        int i = 0;
        while (it.hasNext()) {
            bF bFVar = (bF) it.next();
            int indexOf = bFVar.f2127a.indexOf(c0174b);
            if (indexOf != -1) {
                return i + indexOf;
            }
            i = bFVar.f2127a.size() + i;
        }
        return -1;
    }

    public final void m3638q() {
        if (this.f3308r == 2) {
            Iterator it = this.f3313w.iterator();
            while (it.hasNext()) {
                View view = ((ci) ((C0174B) it.next()).getTag()).f2279c;
                view.setTag(b);
                if (view instanceof bw) {
                    ((bw) view).m948c(this.f3310t);
                } else {
                    ((bt) view).m908c(this.f3310t);
                }
            }
            this.f3311u = null;
            this.f3312v = null;
            this.f3313w.clear();
        } else if (this.f3308r != 1) {
        } else {
            if (this.f3311u != null) {
                this.f3311u.m908c(this.f3310t);
                this.f3311u.setTag(b);
                this.f3311u = null;
                this.f3287G = null;
            } else if (this.f3312v != null) {
                this.f3312v.m948c(this.f3310t);
                this.f3312v.setTag(b);
                this.f3312v = null;
                this.f3287G = null;
            }
        }
    }

    public final void m3639r() {
        m3621c();
    }

    public final int m3640s() {
        return this.f3308r;
    }
}
