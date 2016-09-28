package com.konylabs.api.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils.TruncateAt;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import ny0k.cA;

public final class ak extends Spinner {
    private static final int[] f553B;
    private int f554A;
    public boolean f555a;
    public boolean f556b;
    public TruncateAt f557c;
    public TruncateAt f558d;
    public TruncateAt f559e;
    public TruncateAt f560f;
    public ArrayList f561g;
    private LayoutParams f562h;
    private LayoutParams f563i;
    private dB f564j;
    private dB f565k;
    private int[] f566l;
    private Rect f567m;
    private LinearLayout f568n;
    private ArrayAdapter f569o;
    private dB f570p;
    private dB f571q;
    private Context f572r;
    private boolean f573s;
    private boolean f574t;
    private Drawable f575u;
    private Drawable f576v;
    private Drawable f577w;
    private Drawable f578x;
    private StateListDrawable f579y;
    private ColorStateList f580z;

    static {
        f553B = new int[]{-16842910};
    }

    public ak(Context context) {
        super(context);
        this.f562h = null;
        this.f563i = null;
        this.f564j = null;
        this.f565k = null;
        this.f566l = new int[]{0, 0, 0, 0};
        this.f567m = null;
        this.f555a = false;
        this.f556b = false;
        this.f557c = TruncateAt.END;
        this.f558d = TruncateAt.END;
        this.f559e = null;
        this.f560f = null;
        this.f568n = null;
        this.f569o = null;
        this.f574t = false;
        this.f554A = 19;
        this.f572r = context;
        m554h();
    }

    public ak(Context context, int i) {
        super(context, 0);
        this.f562h = null;
        this.f563i = null;
        this.f564j = null;
        this.f565k = null;
        this.f566l = new int[]{0, 0, 0, 0};
        this.f567m = null;
        this.f555a = false;
        this.f556b = false;
        this.f557c = TruncateAt.END;
        this.f558d = TruncateAt.END;
        this.f559e = null;
        this.f560f = null;
        this.f568n = null;
        this.f569o = null;
        this.f574t = false;
        this.f554A = 19;
        this.f572r = context;
        m554h();
    }

    private void m550a(TextView textView, boolean z) {
        if (this.f580z == null) {
            int m = this.f564j != null ? this.f564j.m1156m() : this.f565k != null ? this.f565k.m1156m() : ViewCompat.MEASURED_STATE_MASK;
            this.f580z = new ColorStateList(new int[][]{ENABLED_SELECTED_STATE_SET, PRESSED_ENABLED_STATE_SET, f553B, ENABLED_STATE_SET}, new int[]{m, m, -7829368, this.f565k != null ? this.f565k.m1156m() : ViewCompat.MEASURED_STATE_MASK});
        }
        textView.setTextColor(this.f580z);
        if (z && this.f564j != null) {
            this.f564j.m1132c(textView);
        } else if (this.f565k != null) {
            this.f565k.m1132c(textView);
        } else {
            dB.m1111b(textView, false);
        }
    }

    private void m554h() {
        this.f568n = new LinearLayout(this.f572r);
        this.f562h = new LayoutParams(-2, -2);
        this.f563i = new LayoutParams(-2, -2);
        this.f568n.addView(this, this.f563i);
        this.f569o = new al(this, this.f572r);
        this.f569o.setDropDownViewResource(17367049);
        setAdapter(this.f569o);
    }

    private static TruncateAt m555i(int i) {
        TruncateAt truncateAt = TruncateAt.END;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return TruncateAt.START;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return TruncateAt.MIDDLE;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return TruncateAt.END;
            default:
                return truncateAt;
        }
    }

    public final void m556a() {
        this.f569o.clear();
        this.f561g.clear();
    }

    public final void m557a(float f) {
        this.f562h.width = 0;
        this.f562h.weight = f;
    }

    public final void m558a(int i) {
        this.f568n.setVisibility(i);
    }

    public final void m559a(TextView textView) {
        boolean z = true;
        boolean z2 = this.f575u == null;
        if (this.f576v != null) {
            z = false;
        }
        if (z && z2) {
            textView.setBackgroundDrawable(null);
        } else if (z2 || !z) {
            if (z2) {
                this.f575u = new cA(0);
            }
            if (this.f575u instanceof cA) {
                ((cA) this.f575u).m2098a(false);
            }
            if (this.f576v instanceof cA) {
                ((cA) this.f576v).m2098a(false);
            }
            Drawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(SELECTED_STATE_SET, this.f576v);
            stateListDrawable.addState(PRESSED_ENABLED_STATE_SET, this.f576v);
            stateListDrawable.addState(f553B, this.f575u);
            stateListDrawable.addState(ENABLED_STATE_SET, this.f575u);
            textView.setBackgroundDrawable(stateListDrawable);
        } else {
            if (this.f575u instanceof cA) {
                ((cA) this.f575u).m2098a(false);
            }
            textView.setBackgroundDrawable(this.f575u);
        }
    }

    public final void m560a(dB dBVar) {
        this.f564j = dBVar;
        if (dBVar != null) {
            this.f576v = dBVar.m1127b(true);
        } else {
            this.f576v = null;
        }
        this.f580z = null;
    }

    public final void m561a(boolean z) {
        int i = -1;
        this.f562h.width = z ? -1 : -2;
        LayoutParams layoutParams = this.f563i;
        if (!z) {
            i = -2;
        }
        layoutParams.width = i;
    }

    public final void m562a(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            this.f566l[i] = iArr[i];
        }
        ez.m1344a(this.f566l, this.f568n, this.f562h);
    }

    public final void m563a(am[] amVarArr) {
        setAdapter(this.f569o);
        if (amVarArr != null) {
            for (int i = 0; i < amVarArr.length; i++) {
                if (amVarArr[i] != null) {
                    this.f569o.add(amVarArr[i]);
                }
            }
        }
    }

    public final boolean m564a(String str) {
        boolean z = false;
        int i = 0;
        while (i < this.f569o.getCount()) {
            if (((am) this.f569o.getItem(i)).f582a.equals(str)) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            super.setSelection(i);
        } else if (KonyMain.f3658f) {
            Log.w("KonyComboBox", "ComboBox: key not found - " + str);
        }
        return z;
    }

    public final void m565b() {
        this.f574t = false;
        m571c();
    }

    public final void m566b(int i) {
        this.f562h.gravity = i;
        this.f568n.setGravity(i);
    }

    public final void m567b(dB dBVar) {
        this.f565k = dBVar;
        if (dBVar != null) {
            this.f575u = dBVar.m1127b(true);
        } else {
            this.f575u = null;
        }
        this.f580z = null;
    }

    public final void m568b(String str) {
        setPrompt(str);
    }

    public final void m569b(boolean z) {
        this.f563i.height = z ? -1 : -2;
        this.f573s = z;
    }

    public final void m570b(int[] iArr) {
        this.f567m = new Rect();
        this.f567m.left = iArr[0];
        this.f567m.top = iArr[1];
        this.f567m.right = iArr[2];
        this.f567m.bottom = iArr[3];
        setPadding(this.f567m.left, this.f567m.top, this.f567m.right, this.f567m.bottom);
    }

    public final void m571c() {
        if (!this.f574t) {
            if (this.f578x == null) {
                KonyMain.getActContext();
                this.f578x = KonyMain.m4083a("combo_box_focus_skin.9.png");
            }
            if (this.f577w == null) {
                KonyMain.getActContext();
                this.f577w = KonyMain.m4083a("combo_box_normal_skin.9.png");
            }
            this.f579y = new StateListDrawable();
            this.f579y.addState(ENABLED_FOCUSED_STATE_SET, this.f578x);
            this.f579y.addState(PRESSED_ENABLED_STATE_SET, this.f578x);
            this.f579y.addState(f553B, this.f577w);
            this.f579y.addState(ENABLED_STATE_SET, this.f577w);
            setBackgroundDrawable(this.f579y);
            this.f568n.setLayoutParams(this.f562h);
            this.f574t = true;
        }
    }

    public final void m572c(int i) {
        if (this.f573s) {
            if (this.f566l != null) {
                i = ez.m1343a(i, this.f566l);
            }
            if (getMeasuredHeight() != i) {
                this.f568n.setMinimumHeight(i);
                this.f568n.requestLayout();
            }
        }
    }

    public final void m573c(dB dBVar) {
        this.f571q = dBVar;
        if (this.f571q != null) {
            this.f578x = this.f571q.m1127b(true);
        } else {
            this.f578x = null;
        }
    }

    public final void m574c(String str) {
        if (str != null) {
            setContentDescription(str);
            if (KonyMain.f3656d >= 16) {
                setImportantForAccessibility(1);
            }
        } else if (KonyMain.f3656d >= 16) {
            setImportantForAccessibility(2);
        } else {
            setContentDescription(BuildConfig.FLAVOR);
        }
    }

    public final void m575c(boolean z) {
        super.setEnabled(z);
        super.setClickable(z);
        TextView textView = (TextView) getSelectedView();
        if (textView != null) {
            textView.setEnabled(z);
        }
    }

    public final View m576d() {
        return this.f568n;
    }

    public final void m577d(int i) {
        this.f554A = i;
        TextView textView = (TextView) getSelectedView();
        if (textView != null) {
            textView.setGravity(this.f554A);
        }
    }

    public final void m578d(dB dBVar) {
        this.f570p = dBVar;
        if (this.f570p != null) {
            this.f577w = this.f570p.m1127b(true);
        }
    }

    public final void m579d(boolean z) {
        this.f555a = z;
        TextView textView = (TextView) getSelectedView();
        if (textView != null) {
            textView.setSingleLine(this.f555a);
            if (this.f555a) {
                textView.setEllipsize(this.f557c);
            } else {
                textView.setEllipsize(this.f559e);
            }
        }
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        TextView textView = (TextView) getSelectedView();
        if (textView != null) {
            m550a(textView, isSelected());
        }
    }

    public final void m580e() {
        if (this.f561g != null) {
            this.f561g.clear();
            this.f561g = null;
        }
        if (this.f579y != null) {
            this.f579y.setCallback(null);
        }
        this.f579y = null;
        if (this.f576v != null) {
            this.f576v.setCallback(null);
        }
        dB.m1104a(this.f576v);
        if (this.f578x != null) {
            this.f578x.setCallback(null);
        }
        dB.m1104a(this.f578x);
        if (this.f577w != null) {
            this.f577w.setCallback(null);
        }
        dB.m1104a(this.f577w);
        if (this.f575u != null) {
            this.f575u.setCallback(null);
        }
        dB.m1104a(this.f575u);
        setBackgroundDrawable(null);
        this.f569o.clear();
    }

    public final void m581e(int i) {
        this.f562h.width = i;
        setMinimumWidth(i);
    }

    public final void m582e(boolean z) {
        this.f556b = z;
    }

    public final void m583f() {
        this.f569o.notifyDataSetChanged();
    }

    public final void m584f(int i) {
        this.f562h.height = i;
        setMinimumHeight(i);
    }

    public final void m585g() {
        m567b(this.f565k);
        m560a(this.f564j);
        Iterator it = this.f561g.iterator();
        while (it.hasNext()) {
            m559a((TextView) ((View) it.next()));
        }
    }

    public final void m586g(int i) {
        if (i >= 0 && i <= 2) {
            this.f557c = m555i(i);
            if (this.f555a) {
                TextView textView = (TextView) getSelectedView();
                if (textView != null) {
                    textView.setEllipsize(this.f557c);
                }
            }
        }
    }

    public final void m587h(int i) {
        if (i >= 0 && i <= 2) {
            this.f558d = m555i(i);
        }
    }
}
