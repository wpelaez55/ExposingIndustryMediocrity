package com.konylabs.api.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.ViewCompat;
import android.text.Spannable;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Iterator;
import java.util.Vector;
import ny0k.cA;

public final class bM extends TextView implements OnMenuItemClickListener, OnCreateContextMenuListener {
    private Drawable f707a;
    private Drawable f708b;
    private dB f709c;
    private dB f710d;
    private Rect f711e;
    private LinearLayout f712f;
    private LayoutParams f713g;
    private LayoutParams f714h;
    private boolean f715i;
    private Rect f716j;
    private Drawable f717k;
    private Drawable f718l;
    private boolean f719m;
    private boolean f720n;
    private boolean f721o;
    private cv f722p;
    private Vector f723q;

    public bM(Context context) {
        super(context);
        this.f709c = null;
        this.f710d = null;
        this.f711e = null;
        this.f716j = null;
        this.f719m = false;
        this.f720n = false;
        this.f722p = null;
        this.f723q = null;
        this.f712f = new LinearLayout(context);
        this.f713g = new LayoutParams(-2, -2);
        this.f714h = new LayoutParams(-2, -2);
        if (KonyMain.f3656d > 14) {
            setDrawingCacheEnabled(true);
        }
        if (((AccessibilityManager) KonyMain.getAppContext().getSystemService("accessibility")).isEnabled() && KonyMain.f3656d < 16) {
            setFocusable(true);
        }
    }

    private void m726i() {
        if (isFocused() || isPressed()) {
            if (this.f710d != null) {
                this.f710d.m1132c((TextView) this);
            } else if (this.f715i) {
                CharSequence text = getText();
                if (text instanceof Spannable) {
                    Spannable spannable = (Spannable) text;
                    UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) spannable.getSpans(0, text.length(), UnderlineSpan.class);
                    if (underlineSpanArr == null || underlineSpanArr.length == 0) {
                        spannable.setSpan(new UnderlineSpan(), 0, text.length(), 18);
                        return;
                    }
                    return;
                }
                setTextKeepState(dB.m1115f(text.toString()));
            }
        } else if (this.f709c != null) {
            this.f709c.m1132c((TextView) this);
        } else if (this.f715i) {
            dB.m1111b((TextView) this, true);
        } else {
            dB.m1111b((TextView) this, false);
        }
    }

    public final dB m727a() {
        return this.f709c;
    }

    public final void m728a(float f) {
        this.f713g.width = 0;
        this.f713g.weight = f;
    }

    public final void m729a(int i) {
        this.f713g.gravity = i;
        this.f712f.setGravity(i);
    }

    public final void m730a(int i, int i2) {
        if (i == -1) {
            setVisibility(i2 == 0 ? 0 : 8);
        } else {
            setVisibility(i2);
        }
        this.f712f.setVisibility(i2);
    }

    public final void m731a(cv cvVar) {
        this.f722p = cvVar;
    }

    public final void m732a(dB dBVar) {
        this.f709c = dBVar;
        if (dBVar != null) {
            this.f707a = dBVar.m1127b(true);
        } else {
            this.f707a = null;
        }
    }

    public final void m733a(String str) {
        if (this.f709c != null) {
            setText(this.f709c.m1118a(str));
        } else {
            setText(str);
        }
    }

    public final void m734a(String str, int i) {
        if (KonyMain.f3656d > 3) {
            if (i == 0) {
                setFocusable(false);
            } else if (i == 1) {
                setFocusable(true);
            }
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
    }

    public final void m735a(Vector vector) {
        this.f723q = vector;
        if (this.f723q != null) {
            setOnCreateContextMenuListener(this);
        }
    }

    public final void m736a(boolean z) {
        int i = -1;
        this.f713g.width = z ? -1 : -2;
        LayoutParams layoutParams = this.f714h;
        if (!z) {
            i = -2;
        }
        layoutParams.width = i;
    }

    public final void m737a(int[] iArr) {
        this.f716j = new Rect();
        this.f716j.left = iArr[0];
        this.f716j.top = iArr[1];
        this.f716j.right = iArr[2];
        this.f716j.bottom = iArr[3];
        ez.m1344a(iArr, this.f712f, this.f713g);
    }

    public final void m738b() {
        int i = ViewCompat.MEASURED_STATE_MASK;
        Drawable stateListDrawable;
        int[][] iArr;
        int[] iArr2;
        if (this.f715i) {
            Drawable drawable = this.f707a;
            Drawable drawable2 = this.f708b;
            if (this.f717k != null) {
                drawable = this.f717k;
            }
            if (this.f718l != null) {
                drawable2 = this.f718l;
            }
            if (this.f711e != null) {
                if (drawable instanceof cA) {
                    ((cA) drawable).m2097a(this.f711e);
                }
                if (drawable2 instanceof cA) {
                    ((cA) drawable2).m2097a(this.f711e);
                }
            }
            if (drawable2 != null) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(FOCUSED_STATE_SET, drawable2);
                stateListDrawable.addState(PRESSED_ENABLED_STATE_SET, drawable2);
                stateListDrawable.addState(ENABLED_STATE_SET, drawable);
                setBackgroundDrawable(stateListDrawable);
                ((DrawableContainerState) stateListDrawable.getConstantState()).setConstantSize(true);
            } else {
                setBackgroundDrawable(drawable);
                if (!(this.f711e == null || (drawable instanceof cA))) {
                    setPadding(this.f711e.left, this.f711e.top, this.f711e.right, this.f711e.bottom);
                }
            }
            iArr = new int[][]{FOCUSED_STATE_SET, PRESSED_ENABLED_STATE_SET, ENABLED_STATE_SET};
            iArr2 = new int[3];
            iArr2[0] = this.f710d != null ? this.f710d.m1156m() : ViewCompat.MEASURED_STATE_MASK;
            if (this.f710d != null) {
                i = this.f710d.m1156m();
            }
            iArr2[1] = i;
            iArr2[2] = this.f709c != null ? this.f709c.m1156m() : -16776961;
            setTextColor(new ColorStateList(iArr, iArr2));
        } else {
            if (!(this.f711e == null || this.f707a == null || !(this.f707a instanceof cA))) {
                ((cA) this.f707a).m2097a(this.f711e);
            }
            if (!this.f719m || this.f708b == null) {
                setBackgroundDrawable(this.f707a);
                if (this.f711e != null && this.f707a == null) {
                    setPadding(this.f711e.left, this.f711e.top, this.f711e.right, this.f711e.bottom);
                }
                if (this.f709c != null) {
                    setTextColor(this.f709c.m1156m());
                } else {
                    setTextColor(ViewCompat.MEASURED_STATE_MASK);
                }
            } else {
                if (this.f711e != null) {
                    if (this.f707a instanceof cA) {
                        ((cA) this.f707a).m2097a(this.f711e);
                    }
                    if (this.f708b instanceof cA) {
                        ((cA) this.f708b).m2097a(this.f711e);
                    }
                }
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(FOCUSED_STATE_SET, this.f708b);
                stateListDrawable.addState(PRESSED_ENABLED_STATE_SET, this.f708b);
                stateListDrawable.addState(ENABLED_STATE_SET, this.f707a);
                setBackgroundDrawable(stateListDrawable);
                ((DrawableContainerState) stateListDrawable.getConstantState()).setConstantSize(true);
                iArr = new int[][]{FOCUSED_STATE_SET, PRESSED_ENABLED_STATE_SET, ENABLED_STATE_SET};
                iArr2 = new int[3];
                iArr2[0] = this.f710d != null ? this.f710d.m1156m() : ViewCompat.MEASURED_STATE_MASK;
                iArr2[1] = this.f710d != null ? this.f710d.m1156m() : ViewCompat.MEASURED_STATE_MASK;
                if (this.f709c != null) {
                    i = this.f709c.m1156m();
                }
                iArr2[2] = i;
                setTextColor(new ColorStateList(iArr, iArr2));
            }
        }
        m726i();
    }

    public final void m739b(int i) {
        if (this.f721o) {
            if (this.f716j != null) {
                i = ez.m1343a(i, new int[]{this.f716j.left, this.f716j.top, this.f716j.right, this.f716j.bottom});
            }
            if (getMeasuredHeight() != i) {
                this.f712f.setMinimumHeight(i);
                this.f712f.requestLayout();
            }
        }
    }

    public final void m740b(dB dBVar) {
        this.f710d = dBVar;
        if (dBVar != null) {
            this.f708b = dBVar.m1162p();
            if (this.f708b instanceof cA) {
                ((cA) this.f708b).m2098a(true);
                return;
            }
            return;
        }
        this.f708b = null;
    }

    public final void m741b(String str) {
        dB dBVar = this.f709c;
        if (hasFocus()) {
            dBVar = this.f710d;
        }
        if (dBVar != null) {
            setText(dBVar.m1118a(str));
        } else {
            setText(dB.m1115f(str));
        }
    }

    public final void m742b(boolean z) {
        this.f714h.height = z ? -1 : -2;
        this.f721o = z;
    }

    public final void m743b(int[] iArr) {
        this.f711e = new Rect();
        this.f711e.left = iArr[0];
        this.f711e.top = iArr[1];
        this.f711e.right = iArr[2];
        this.f711e.bottom = iArr[3];
    }

    public final void m744c() {
        super.setClickable(true);
        super.setTextColor(-16776961);
        this.f715i = true;
    }

    public final void m745c(int i) {
        setGravity(i);
    }

    public final void m746c(String str) {
        this.f717k = dB.m1112c(str);
        if (this.f717k == null && KonyMain.f3658f) {
            Log.d("KonyLabel", "Could not create Drawable from Normal Image for filename - " + str);
        }
    }

    public final void m747c(boolean z) {
        if (KonyMain.f3656d >= 11 && isEnabled()) {
            setTextIsSelectable(z);
        }
    }

    public final void m748d() {
        m738b();
        this.f712f.setLayoutParams(this.f713g);
        this.f712f.setTag(this);
    }

    public final void m749d(String str) {
        this.f718l = dB.m1112c(str);
        if (this.f718l == null && KonyMain.f3658f) {
            Log.d("KonyLabel", "Could not create Drawable from Focus Image for filename - " + str);
        }
    }

    public final void m750d(boolean z) {
        setEnabled(z);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f715i) {
            m726i();
        }
    }

    public final void m751e() {
        if (!this.f720n) {
            m738b();
            this.f712f.setLayoutParams(this.f713g);
            this.f712f.setTag(this);
            this.f712f.addView(this, this.f714h);
            this.f720n = true;
        }
    }

    public final void m752e(boolean z) {
        this.f719m = z;
        this.f712f.setDuplicateParentStateEnabled(z);
        setDuplicateParentStateEnabled(z);
    }

    public final View m753f() {
        return this.f712f;
    }

    public final void m754g() {
        this.f712f.setBackgroundDrawable(null);
        this.f707a = null;
        this.f708b = null;
    }

    public final void m755h() {
        m732a(this.f709c);
        m740b(this.f710d);
        m738b();
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        contextMenu.clear();
        if (this.f723q != null) {
            Iterator it = this.f723q.iterator();
            while (it.hasNext()) {
                cu cuVar = (cu) it.next();
                if (cuVar.m1045c()) {
                    contextMenu.add(0, cuVar.m1040a().hashCode(), 0, cuVar.m1044b()).setOnMenuItemClickListener(this);
                }
            }
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (this.f722p == null || this.f723q == null) {
            return false;
        }
        Iterator it = this.f723q.iterator();
        while (it.hasNext()) {
            cu cuVar = (cu) it.next();
            if (menuItem.getItemId() == cuVar.m1040a().hashCode()) {
                this.f722p.m1048a(cuVar);
                return true;
            }
        }
        return false;
    }

    public final void setHeight(int i) {
        this.f713g.height = i;
    }

    public final void setWidth(int i) {
        this.f713g.width = i;
        super.setWidth(i);
    }
}
