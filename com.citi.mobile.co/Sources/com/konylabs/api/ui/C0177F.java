package com.konylabs.api.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.support.v4.view.ViewCompat;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Iterator;
import java.util.Vector;
import ny0k.cA;
import ny0k.cy;

/* renamed from: com.konylabs.api.ui.F */
public final class C0177F extends Button implements OnMenuItemClickListener, OnCreateContextMenuListener {
    private static final int[] f209w;
    private Vector f210A;
    private cv f211B;
    private boolean f212C;
    private C0173A f213D;
    private Context f214a;
    private Drawable f215b;
    private Drawable f216c;
    private dB f217d;
    private dB f218e;
    private dB f219f;
    private dB f220g;
    private int[] f221h;
    private Rect f222i;
    private LayoutParams f223j;
    private LayoutParams f224k;
    private LinearLayout f225l;
    private Drawable f226m;
    private Drawable f227n;
    private Drawable f228o;
    private Drawable f229p;
    private boolean f230q;
    private int f231r;
    private int f232s;
    private Drawable f233t;
    private StateListDrawable f234u;
    private ColorStateList f235v;
    private boolean f236x;
    private int f237y;
    private boolean f238z;

    static {
        f209w = new int[]{-16842910};
    }

    public C0177F(Context context) {
        super(context);
        this.f215b = null;
        this.f216c = null;
        this.f217d = null;
        this.f218e = null;
        this.f219f = null;
        this.f220g = null;
        this.f221h = new int[]{0, 0, 0, 0};
        this.f222i = null;
        this.f223j = null;
        this.f224k = null;
        this.f225l = null;
        this.f226m = null;
        this.f227n = null;
        this.f228o = null;
        this.f229p = null;
        this.f236x = false;
        this.f237y = -1;
        this.f210A = null;
        this.f211B = null;
        this.f212C = false;
        this.f213D = null;
        this.f214a = context;
        m168g();
    }

    public C0177F(Context context, int i) {
        super(context, null, 0);
        this.f215b = null;
        this.f216c = null;
        this.f217d = null;
        this.f218e = null;
        this.f219f = null;
        this.f220g = null;
        this.f221h = new int[]{0, 0, 0, 0};
        this.f222i = null;
        this.f223j = null;
        this.f224k = null;
        this.f225l = null;
        this.f226m = null;
        this.f227n = null;
        this.f228o = null;
        this.f229p = null;
        this.f236x = false;
        this.f237y = -1;
        this.f210A = null;
        this.f211B = null;
        this.f212C = false;
        this.f213D = null;
        this.f214a = context;
        m168g();
    }

    private void m167b(String str, dB dBVar) {
        if (dBVar == null || !dBVar.m1161o()) {
            super.setText(str);
            return;
        }
        CharSequence spannableString = new SpannableString(str);
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        super.setText(spannableString);
    }

    private void m168g() {
        Drawable background = getBackground();
        this.f233t = background;
        this.f227n = background;
        this.f225l = new LinearLayout(this.f214a);
        this.f223j = new LayoutParams(-2, -2);
        this.f224k = new LayoutParams(-2, -2);
        this.f225l.addView(this, this.f224k);
        if (KonyMain.f3656d > 14) {
            setDrawingCacheEnabled(true);
        }
    }

    private void m169h() {
        if (isPressed()) {
            if (this.f219f != null) {
                this.f219f.m1132c((TextView) this);
            } else if (this.f217d != null) {
                this.f217d.m1132c((TextView) this);
            }
        } else if (isFocused()) {
            if (this.f217d != null) {
                this.f217d.m1132c((TextView) this);
            }
        } else if (this.f218e != null) {
            this.f218e.m1132c((TextView) this);
        } else {
            dB.m1111b((TextView) this, false);
        }
        if (this.f237y != -1) {
            setTextColor(this.f237y);
        }
    }

    public final void m170a() {
        if (this.f216c != null) {
            this.f226m = this.f216c;
        }
        if (this.f215b != null) {
            this.f227n = this.f215b;
        }
        if (this.f222i == null) {
            this.f222i = new Rect();
            if (this.f233t != null) {
                this.f233t.getPadding(this.f222i);
            } else {
                this.f222i.left = dB.m1116r(12);
                this.f222i.top = dB.m1116r(8);
                this.f222i.right = dB.m1116r(12);
                this.f222i.bottom = dB.m1116r(12);
            }
        }
        if (this.f222i != null && (this.f227n instanceof cA)) {
            ((cA) this.f227n).m2097a(this.f222i);
        }
        if (this.f227n == this.f233t && this.f226m == this.f233t && this.f229p == this.f233t) {
            this.f226m = null;
            this.f229p = null;
        }
        if (this.f226m == this.f233t && this.f229p == this.f233t) {
            this.f229p = null;
        }
        if (this.f226m == null && this.f229p == null && this.f228o == null) {
            setBackgroundDrawable(this.f227n);
            if (!(this.f222i == null || (this.f227n instanceof cA))) {
                setPadding(this.f222i.left, this.f222i.top, this.f222i.right, this.f222i.bottom);
            }
        } else {
            if (this.f222i != null) {
                if (this.f226m instanceof cA) {
                    ((cA) this.f226m).m2097a(this.f222i);
                }
                if (this.f229p instanceof cA) {
                    ((cA) this.f229p).m2097a(this.f222i);
                }
                if (this.f228o instanceof cA) {
                    ((cA) this.f228o).m2097a(this.f222i);
                }
            }
            this.f234u = new StateListDrawable();
            this.f234u.addState(PRESSED_ENABLED_FOCUSED_STATE_SET, this.f229p != null ? this.f229p : this.f226m);
            this.f234u.addState(FOCUSED_STATE_SET, this.f226m);
            this.f234u.addState(PRESSED_ENABLED_STATE_SET, this.f229p != null ? this.f229p : this.f226m);
            this.f234u.addState(ENABLED_STATE_SET, this.f227n);
            this.f234u.addState(f209w, this.f228o != null ? this.f228o : this.f227n);
            setBackgroundDrawable(this.f234u);
            ((DrawableContainerState) this.f234u.getConstantState()).setConstantSize(true);
            if (!(this.f222i == null || (this.f227n instanceof cA) || (this.f226m instanceof cA) || (this.f229p instanceof cA) || (this.f228o instanceof cA))) {
                setPadding(this.f222i.left, this.f222i.top, this.f222i.right, this.f222i.bottom);
            }
        }
        int[][] iArr = new int[][]{PRESSED_ENABLED_FOCUSED_STATE_SET, FOCUSED_STATE_SET, PRESSED_ENABLED_STATE_SET, f209w, ENABLED_STATE_SET};
        int m = this.f219f != null ? this.f219f.m1156m() : this.f217d != null ? this.f217d.m1156m() : this.f218e != null ? this.f218e.m1156m() : ViewCompat.MEASURED_STATE_MASK;
        int m2 = this.f220g != null ? this.f220g.m1156m() : -7829368;
        this.f235v = new ColorStateList(iArr, new int[]{m, r1, m, m2, r0});
        setTextColor(this.f235v);
        m169h();
    }

    public final void m171a(float f) {
        this.f223j.width = 0;
        this.f223j.weight = f;
    }

    public final void m172a(int i) {
        this.f223j.gravity = i;
        this.f225l.setGravity(i);
        this.f225l.setTag(this);
    }

    public final void m173a(int i, int i2) {
        if (i == -1) {
            setVisibility(i2 == 0 ? 0 : 8);
        } else {
            setVisibility(i2);
        }
        this.f225l.setVisibility(i2);
    }

    public final void m174a(Drawable drawable) {
        this.f227n = drawable;
    }

    public final void m175a(Uri uri) {
        Options options = new Options();
        Bitmap a = C0202e.m1279a(uri, options);
        if (a != null) {
            Drawable cyVar = new cy(a);
            this.f215b = cyVar;
            this.f216c = cyVar;
            if (options.outWidth > options.outHeight) {
                this.f231r = options.outWidth;
                this.f232s = options.outHeight;
            } else {
                this.f231r = options.outHeight;
                this.f232s = options.outWidth;
            }
            if (this.f231r > 0) {
                this.f230q = true;
            }
        }
    }

    public final void m176a(cv cvVar) {
        this.f211B = cvVar;
    }

    public final void m177a(dB dBVar) {
        this.f217d = dBVar;
        if (dBVar != null) {
            this.f226m = dBVar.m1127b(true);
            if (this.f226m == null && dBVar.m1165q()) {
                this.f226m = this.f233t;
                return;
            }
            return;
        }
        this.f226m = null;
    }

    public final void m178a(String str) {
        if (hasFocus()) {
            m167b(str, this.f218e);
        } else {
            m167b(str, this.f217d);
        }
    }

    public final void m179a(String str, dB dBVar) {
        if (str == null || str.trim().length() <= 0) {
            if (this.f213D != null) {
                this.f213D.m109a(BuildConfig.FLAVOR);
            }
            this.f212C = false;
        } else {
            if (this.f213D == null) {
                this.f213D = new C0173A(this);
            }
            this.f213D.m109a(str);
            if (dBVar != null) {
                this.f213D.m108a(dBVar);
            }
            this.f212C = true;
        }
        postInvalidate();
    }

    public final void m180a(Vector vector) {
        this.f210A = vector;
        setOnCreateContextMenuListener(this);
    }

    public final void m181a(boolean z) {
        int i = -1;
        this.f224k.width = z ? -1 : -2;
        LayoutParams layoutParams = this.f223j;
        if (!z) {
            i = -2;
        }
        layoutParams.width = i;
    }

    public final void m182a(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            this.f221h[i] = iArr[i];
        }
        ez.m1344a(this.f221h, this.f225l, this.f223j);
    }

    public final void m183b() {
        this.f236x = false;
        m189c();
    }

    public final void m184b(int i) {
        setGravity(i);
    }

    public final void m185b(dB dBVar) {
        this.f218e = dBVar;
        if (dBVar != null) {
            this.f227n = dBVar.m1127b(true);
            if (!(this.f227n == null && dBVar.m1165q())) {
                return;
            }
        }
        this.f227n = this.f233t;
    }

    public final void m186b(String str) {
        if (str != null) {
            this.f215b = dB.m1112c(str);
        } else {
            this.f215b = null;
        }
        this.f230q = false;
    }

    public final void m187b(boolean z) {
        this.f224k.height = z ? -1 : -2;
        this.f238z = z;
    }

    public final void m188b(int[] iArr) {
        this.f222i = new Rect();
        this.f222i.left = iArr[0];
        this.f222i.top = iArr[1];
        this.f222i.right = iArr[2];
        this.f222i.bottom = iArr[3];
    }

    public final void m189c() {
        if (!this.f236x) {
            this.f225l.setLayoutParams(this.f223j);
            m170a();
            this.f236x = true;
        }
    }

    public final void m190c(int i) {
        if (this.f238z) {
            int a = ez.m1343a(i, this.f221h);
            if (getMeasuredHeight() != a) {
                this.f225l.setMinimumHeight(a);
                this.f225l.requestLayout();
            }
        }
    }

    public final void m191c(dB dBVar) {
        this.f219f = dBVar;
        if (dBVar != null) {
            this.f229p = dBVar.m1127b(true);
            if (this.f229p == null && dBVar.m1165q()) {
                this.f229p = this.f233t;
                return;
            }
            return;
        }
        this.f229p = null;
    }

    public final void m192c(String str) {
        if (str != null) {
            this.f216c = dB.m1112c(str);
        } else {
            this.f216c = null;
        }
    }

    public final void m193c(boolean z) {
        setClickable(z);
        setFocusable(z);
        setEnabled(z);
    }

    public final View m194d() {
        return this.f225l;
    }

    public final void m195d(dB dBVar) {
        this.f220g = dBVar;
        if (dBVar != null) {
            this.f228o = dBVar.m1127b(true);
        } else {
            this.f228o = null;
        }
    }

    public final void m196d(String str) {
        if (KonyMain.f3656d <= 3) {
            return;
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

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        m169h();
    }

    public final void m197e() {
        if (this.f234u != null) {
            this.f234u.setCallback(null);
        }
        this.f234u = null;
        if (this.f227n != null) {
            this.f227n.setCallback(null);
        }
        dB.m1104a(this.f227n);
        if (this.f215b != null) {
            this.f215b.setCallback(null);
        }
        dB.m1104a(this.f215b);
        if (this.f226m != null) {
            this.f226m.setCallback(null);
        }
        dB.m1104a(this.f226m);
        if (this.f216c != null) {
            this.f216c.setCallback(null);
        }
        dB.m1104a(this.f216c);
        if (this.f228o != null) {
            this.f228o.setCallback(null);
        }
        dB.m1104a(this.f228o);
        if (this.f233t != null) {
            this.f233t.setCallback(null);
        }
        dB.m1104a(this.f233t);
        setBackgroundDrawable(null);
        setOnCreateContextMenuListener(null);
        setOnClickListener(null);
    }

    public final void m198e(dB dBVar) {
        this.f237y = dBVar.m1156m();
        setTextColor(dBVar.m1156m());
    }

    public final void m199f() {
        m185b(this.f218e);
        m177a(this.f217d);
        m191c(this.f219f);
        m170a();
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        contextMenu.clear();
        if (this.f210A != null) {
            Iterator it = this.f210A.iterator();
            while (it.hasNext()) {
                cu cuVar = (cu) it.next();
                if (cuVar.m1045c()) {
                    contextMenu.add(0, cuVar.m1040a().hashCode(), 0, cuVar.m1044b()).setOnMenuItemClickListener(this);
                }
            }
        }
    }

    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f212C) {
            this.f213D.m107a(canvas);
        }
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f230q) {
            setMeasuredDimension(getMeasuredWidth(), (getMeasuredWidth() * this.f232s) / this.f231r);
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (this.f211B == null || this.f210A == null) {
            return false;
        }
        Iterator it = this.f210A.iterator();
        while (it.hasNext()) {
            cu cuVar = (cu) it.next();
            if (menuItem.getItemId() == cuVar.m1040a().hashCode()) {
                this.f211B.m1048a(cuVar);
                return true;
            }
        }
        return false;
    }

    public final void setHeight(int i) {
        this.f223j.height = i;
    }

    public final void setWidth(int i) {
        this.f223j.width = i;
        super.setWidth(i);
    }
}
