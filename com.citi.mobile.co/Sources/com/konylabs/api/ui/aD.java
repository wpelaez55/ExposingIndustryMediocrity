package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.PaintDrawable;
import android.support.v4.media.TransportMediator;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.konylabs.android.C0132e;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Vector;
import ny0k.aG;
import ny0k.aI;

public final class aD extends LinearLayout implements OnMenuItemClickListener, OnCreateContextMenuListener {
    private int f425A;
    private aK f426B;
    private aG f427C;
    private boolean f428D;
    private aH f429E;
    private aJ f430F;
    private aI f431G;
    private LayoutParams f432H;
    private String f433I;
    private int f434J;
    private boolean f435K;
    private String f436L;
    private int f437M;
    private boolean f438N;
    public el f439a;
    LinearLayout f440b;
    LinearLayout f441c;
    public int f442d;
    public boolean f443e;
    public int f444f;
    private Rect f445g;
    private Rect f446h;
    private Vector f447i;
    private Context f448j;
    private cv f449k;
    private dB f450l;
    private Drawable f451m;
    private LinearLayout.LayoutParams f452n;
    private String f453o;
    private aF f454p;
    private LinearLayout f455q;
    private TextView f456r;
    private View f457s;
    private ProgressBar f458t;
    private int f459u;
    private int f460v;
    private dB f461w;
    private boolean f462x;
    private Drawable f463y;
    private PaintDrawable f464z;

    static {
    }

    public aD(Context context) {
        super(context);
        this.f439a = null;
        this.f445g = new Rect(0, 0, 0, 0);
        this.f446h = new Rect(0, 0, 0, 0);
        this.f447i = new Vector();
        this.f448j = null;
        this.f449k = null;
        this.f459u = 0;
        this.f460v = 0;
        this.f464z = null;
        this.f442d = 0;
        this.f428D = true;
        this.f432H = null;
        this.f444f = 0;
        this.f433I = null;
        this.f434J = 16;
        this.f436L = null;
        this.f437M = 0;
        this.f438N = false;
        this.f448j = context;
        this.f452n = new LinearLayout.LayoutParams(-1, -2);
        setOrientation(1);
        setLayoutParams(this.f452n);
        this.f464z = new PaintDrawable(Color.argb(TransportMediator.FLAG_KEY_MEDIA_NEXT, 192, 192, 192));
        this.f464z.setCornerRadius(6.0f);
        this.f454p = new aF(this, this.f448j);
        this.f454p.setLayoutParams(new LayoutParams(-1, -1));
        this.f455q = new LinearLayout(this.f448j);
        this.f455q.setBackgroundColor(-7829368);
        this.f455q.setGravity(17);
        this.f455q.setLayoutParams(new LayoutParams(-1, -2));
        this.f455q.setId(1);
        this.f456r = new TextView(this.f448j);
        this.f456r.setVisibility(8);
        this.f456r.setGravity(17);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dB.m1116r(5);
        layoutParams.bottomMargin = dB.m1116r(5);
        layoutParams.weight = 1.0f;
        this.f456r.setLayoutParams(layoutParams);
        this.f456r.setTextSize(2, 18.0f);
        this.f456r.setTypeface(Typeface.DEFAULT_BOLD);
        this.f455q.addView(this.f456r);
        this.f458t = new ProgressBar(this.f448j);
        layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(13, 2);
        this.f458t.setBackgroundDrawable(this.f464z);
        this.f458t.setIndeterminate(true);
        this.f458t.setMinimumWidth(dB.m1116r(8));
        this.f458t.setMinimumHeight(dB.m1116r(8));
        this.f458t.setVisibility(8);
        this.f458t.setLayoutParams(layoutParams);
        this.f441c = new LinearLayout(this.f448j);
        this.f441c.setOrientation(1);
        this.f441c.setId(4);
        layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(12);
        this.f441c.setLayoutParams(layoutParams);
        this.f441c.setVisibility(8);
        this.f440b = new LinearLayout(this.f448j);
        this.f440b.setId(3);
        this.f440b.setOrientation(1);
        layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(3, 1);
        this.f440b.setLayoutParams(layoutParams);
        this.f439a = new el(this.f448j);
        this.f439a.setId(2);
        this.f432H = new LayoutParams(-1, -1);
        this.f439a.setLayoutParams(this.f432H);
        this.f439a.setFillViewport(true);
        this.f439a.setScrollContainer(true);
        this.f439a.setHorizontalScrollBarEnabled(false);
        this.f439a.setVerticalScrollBarEnabled(true);
        this.f439a.setSmoothScrollingEnabled(true);
        this.f457s = new View(this.f448j);
        new LayoutParams(-1, -1).addRule(10);
        this.f454p.addView(this.f457s);
        this.f454p.addView(this.f455q);
        this.f454p.addView(this.f439a);
        this.f454p.addView(this.f458t);
        this.f439a.addView(this);
        this.f446h.left = this.f439a.getPaddingLeft();
        this.f446h.right = this.f439a.getPaddingRight();
        this.f446h.top = this.f439a.getPaddingTop();
        this.f446h.bottom = this.f439a.getPaddingBottom();
        if (C0132e.m36b()) {
            m458b(false);
            C0132e.m38d(false);
            C0132e.m31a(null);
        }
    }

    public static void m428c(String str) {
        C0132e.m32a(str);
    }

    private Animation m429f(String str) {
        int identifier = this.f448j.getResources().getIdentifier(str, "anim", this.f448j.getPackageName());
        return identifier > 0 ? AnimationUtils.loadAnimation(this.f448j, identifier) : null;
    }

    private static void m430f(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            Log.d("KonyForm", "The child being added already has a parent so removing it");
            viewGroup.removeView(view);
        }
    }

    public static void m431i(boolean z) {
        C0132e.m37c(z);
    }

    public static void m432j(boolean z) {
        C0132e.m35b(z);
    }

    public final String m433a() {
        return this.f433I;
    }

    public final void m434a(int i) {
        this.f437M = i;
        this.f438N = true;
    }

    public final void m435a(Drawable drawable) {
        this.f462x = true;
        if (C0132e.m36b()) {
            C0132e.m31a(drawable);
        } else {
            this.f455q.setBackgroundDrawable(drawable);
        }
    }

    public final void m436a(GestureDetector gestureDetector) {
        this.f454p.m497a(gestureDetector);
    }

    public final void m437a(View view) {
        m430f(view);
        if ((view instanceof C0174B) || (view instanceof C0219u)) {
            C0174B c0174b = view instanceof C0174B ? (C0174B) view : (C0174B) ((C0219u) view).getChildAt(0);
            if (c0174b.m151g()) {
                this.f440b.addView(view);
                this.f440b.setVisibility(0);
                return;
            } else if (c0174b.m154h()) {
                this.f441c.addView(view);
                this.f441c.setVisibility(0);
                return;
            } else {
                addView(view);
                return;
            }
        }
        addView(view);
    }

    public final void m438a(View view, int i) {
        m430f(view);
        int childCount;
        if ((view instanceof C0174B) || (view instanceof C0219u)) {
            C0174B c0174b = view instanceof C0174B ? (C0174B) view : (C0174B) ((C0219u) view).getChildAt(0);
            if (c0174b.m151g()) {
                int i2 = i + this.f459u;
                childCount = this.f440b.getChildCount();
                if (i2 <= childCount) {
                    childCount = i2;
                }
                this.f440b.addView(view, childCount);
                this.f440b.setVisibility(0);
                return;
            } else if (c0174b.m154h()) {
                childCount = this.f441c.getChildCount() - this.f460v;
                if (i > childCount) {
                    i = childCount;
                }
                this.f441c.addView(view, i);
                this.f441c.setVisibility(0);
                return;
            } else {
                childCount = ((LinearLayout) this.f439a.getChildAt(0)).getChildCount();
                if (i > childCount) {
                    i = childCount;
                }
                addView(view, i);
                return;
            }
        }
        childCount = ((LinearLayout) this.f439a.getChildAt(0)).getChildCount();
        if (i > childCount) {
            i = childCount;
        }
        addView(view, i);
    }

    public final void m439a(aG aGVar) {
        this.f427C = aGVar;
        if (aGVar != null) {
            C0132e.m38d(true);
        }
    }

    public final void m440a(aH aHVar) {
        this.f429E = aHVar;
    }

    public final void m441a(aI aIVar) {
        this.f431G = aIVar;
    }

    public final void m442a(aJ aJVar) {
        this.f430F = aJVar;
    }

    public final void m443a(aK aKVar) {
        this.f426B = aKVar;
    }

    public final void m444a(cu cuVar) {
        this.f447i.add(cuVar);
    }

    public final void m445a(cv cvVar) {
        this.f449k = cvVar;
    }

    public final void m446a(dB dBVar) {
    }

    public final void m447a(en enVar) {
        this.f454p.m498a(enVar);
    }

    public final void m448a(String str) {
        this.f433I = str;
    }

    public final void m449a(aG aGVar) {
        int indexOfChild = this.f454p.indexOfChild(this.f439a);
        this.f454p.removeView(this.f439a);
        View aIVar = new aI(this.f448j, aGVar.m1889g(), aGVar.m1890h(), null);
        this.f454p.addView(aIVar, indexOfChild, this.f432H);
        aIVar.m1915a(this.f439a);
        aIVar.m1919a(aGVar);
    }

    public final void m450a(boolean z) {
        this.f458t.setKeepScreenOn(z);
        this.f458t.setVisibility(z ? 0 : 8);
        if (!z) {
            return;
        }
        if (this.f438N) {
            this.f458t.getIndeterminateDrawable().setColorFilter(this.f437M, Mode.MULTIPLY);
        } else {
            this.f458t.getIndeterminateDrawable().clearColorFilter();
        }
    }

    public final void m451a(int[] iArr) {
        this.f445g.left = iArr[0];
        this.f445g.top = iArr[1];
        this.f445g.right = iArr[2];
        this.f445g.bottom = iArr[3];
    }

    public final String m452b() {
        return this.f453o;
    }

    public final void m453b(int i) {
        Animation makeInChildBottomAnimation;
        int i2 = 800;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                makeInChildBottomAnimation = AnimationUtils.makeInChildBottomAnimation(this.f448j);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                makeInChildBottomAnimation = AnimationUtils.makeInAnimation(this.f448j, true);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                makeInChildBottomAnimation = AnimationUtils.makeInAnimation(this.f448j, false);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                makeInChildBottomAnimation = AnimationUtils.makeOutAnimation(this.f448j, true);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                makeInChildBottomAnimation = AnimationUtils.makeOutAnimation(this.f448j, false);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                makeInChildBottomAnimation = m429f("grow_fade_from_center");
                i2 = 400;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                makeInChildBottomAnimation = m429f("grow_fade_from_topright");
                i2 = 400;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                makeInChildBottomAnimation = m429f("grow_fade_from_bottomleft");
                i2 = 400;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                makeInChildBottomAnimation = m429f("fancy_anim");
                i2 = 400;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                makeInChildBottomAnimation = m429f("slide_in_down");
                i2 = 400;
                break;
            default:
                return;
        }
        if (makeInChildBottomAnimation != null) {
            makeInChildBottomAnimation.setDuration((long) i2);
            setAnimation(makeInChildBottomAnimation);
        }
    }

    public final void m454b(GestureDetector gestureDetector) {
        this.f454p.m499b(gestureDetector);
    }

    public final void m455b(View view) {
        if (view instanceof C0174B) {
            C0174B c0174b = (C0174B) view;
            ViewGroup viewGroup = (ViewGroup) c0174b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            c0174b.m139c(true);
            this.f440b.addView(view);
            this.f440b.setVisibility(0);
            this.f459u++;
        }
    }

    public final void m456b(dB dBVar) {
    }

    public final void m457b(String str) {
        this.f453o = str;
        if (C0132e.m36b()) {
            if (this.f463y != null) {
                C0132e.m31a(this.f463y);
            }
        } else if (str != null) {
            this.f456r.setText(str);
            this.f456r.setVisibility(0);
            if (!(this.f461w == null || this.f462x || this.f463y == null)) {
                this.f455q.setBackgroundDrawable(this.f463y);
            }
            if (this.f436L == null) {
                LuaWidget.announceAccessibilityHint(str, null);
            }
        } else {
            this.f456r.setVisibility(8);
        }
    }

    public final void m458b(boolean z) {
        if (!z) {
            this.f455q.setVisibility(8);
        }
    }

    public final void m459c() {
        m490n();
        KonyMain.m4097a(this.f447i);
        if (this.f451m != null) {
            if (this.f455q.getVisibility() == 0) {
                this.f455q.measure(0, 0);
                this.f457s.setBackgroundDrawable(new InsetDrawable(this.f451m, 0, this.f455q.getMeasuredHeight(), 0, 0));
            } else {
                this.f457s.setBackgroundDrawable(this.f451m);
            }
        }
        C0132e.m33a(this.f453o != null ? this.f453o : BuildConfig.FLAVOR, this.f461w);
        KonyMain.getActContext().m4150a(this);
    }

    public final void m460c(int i) {
        this.f434J = i;
    }

    public final void m461c(View view) {
        if (view instanceof C0174B) {
            C0174B c0174b = (C0174B) view;
            ViewGroup viewGroup = (ViewGroup) c0174b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            c0174b.m142d(true);
            this.f441c.addView(view);
            this.f441c.setVisibility(0);
            this.f460v++;
        }
    }

    public final void m462c(dB dBVar) {
        this.f450l = dBVar;
        if (dBVar != null) {
            this.f451m = dBVar.m1162p();
        } else {
            this.f451m = null;
        }
    }

    public final void m463c(boolean z) {
        this.f443e = z;
    }

    public final View m464d() {
        return this.f454p;
    }

    public final void m465d(int i) {
        if (this.f442d != i) {
            this.f442d = i;
            int indexOfChild;
            if (i == 5 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10) {
                indexOfChild = this.f454p.indexOfChild(this.f439a);
                this.f454p.removeView(this.f439a);
                setLayoutParams(this.f432H);
                this.f439a.removeView(this);
                this.f454p.addView(this, indexOfChild, this.f432H);
            } else if (i == 0) {
                indexOfChild = this.f454p.indexOfChild(this);
                this.f454p.removeView(this);
                this.f439a.addView(this);
                this.f454p.addView(this.f439a, indexOfChild);
            }
        }
    }

    public final void m466d(View view) {
        if (this.f440b != null) {
            this.f440b.removeView(view);
        }
    }

    public final void m467d(dB dBVar) {
        this.f461w = dBVar;
        if (this.f461w != null) {
            this.f463y = this.f461w.m1117a();
            if (!C0132e.m36b()) {
                this.f456r.setTextColor(this.f461w.m1156m());
                this.f456r.setTextSize(this.f461w.m1154l());
                this.f456r.setBackgroundColor(0);
                this.f456r.setTypeface(this.f461w.m1150j(), this.f461w.m1152k());
                if (this.f461w.m1148i() == 0) {
                    this.f461w.m1135d(this.f461w.m1142g());
                    this.f461w.m1138e(this.f461w.m1142g() + ViewCompat.MEASURED_SIZE_MASK);
                }
                if (!this.f462x && this.f463y != null) {
                    this.f455q.setBackgroundDrawable(this.f463y);
                }
            } else if (this.f463y != null) {
                C0132e.m31a(this.f463y);
            }
        }
    }

    public final void m468d(String str) {
        if (KonyMain.f3656d <= 3) {
            return;
        }
        if (str != null) {
            this.f454p.setContentDescription(str);
            if (KonyMain.f3656d >= 16) {
                this.f454p.setImportantForAccessibility(1);
            }
        } else if (KonyMain.f3656d >= 16) {
            this.f454p.setImportantForAccessibility(2);
        } else {
            this.f454p.setContentDescription(BuildConfig.FLAVOR);
        }
    }

    public final boolean m469d(boolean z) {
        if (this.f429E == null) {
            return false;
        }
        if (z) {
            return this.f429E.m502b();
        }
        this.f429E.m501a();
        return true;
    }

    public final int m470e() {
        return this.f434J;
    }

    public final void m471e(int i) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (KonyMain.f3656d < 9) {
                    this.f425A = 1;
                } else {
                    this.f425A = 7;
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (KonyMain.f3656d < 9) {
                    this.f425A = 0;
                } else {
                    this.f425A = 6;
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                this.f425A = 2;
            default:
        }
    }

    public final void m472e(View view) {
        if (this.f441c != null) {
            this.f441c.removeView(view);
        }
    }

    public final void m473e(dB dBVar) {
        m462c(dBVar);
        if (this.f451m != null) {
            this.f457s.setBackgroundDrawable(this.f451m);
        }
    }

    public final void m474e(String str) {
        this.f436L = str;
        if (str != null) {
            LuaWidget.announceAccessibilityHint(str, null);
        }
    }

    public final void m475e(boolean z) {
        this.f428D = z;
    }

    public final int m476f() {
        return this.f425A;
    }

    public final void m477f(int i) {
        if (this.f426B != null) {
            this.f426B.m505a(i == 2);
        }
    }

    public final void m478f(boolean z) {
        if (!z) {
            this.f432H.addRule(3, 3);
        }
    }

    public final void m479g(int i) {
        this.f444f = i;
    }

    public final void m480g(boolean z) {
        if (!z) {
            this.f432H.addRule(2, 4);
        }
    }

    public final boolean m481g() {
        return this.f426B != null;
    }

    public final aH m482h() {
        return this.f429E;
    }

    public final void m483h(boolean z) {
        this.f435K = z;
        if (!z) {
            this.f454p.addView(this.f441c);
            this.f454p.addView(this.f440b);
        }
    }

    public final void m484i() {
        if (this.f430F != null) {
            this.f430F.m504a();
        }
    }

    public final void m485j() {
        if (this.f431G != null) {
            this.f431G.m503a();
        }
    }

    public final void m486k(boolean z) {
        if (z) {
            if (this.f442d != 0) {
                m465d(0);
            }
        } else if (this.f442d == 0) {
            m465d(10);
        }
    }

    public final boolean m487k() {
        return this.f428D;
    }

    public final void m488l() {
        removeAllViews();
        if (this.f451m != null) {
            this.f451m.setCallback(null);
        }
        dB.m1104a(this.f451m);
        if (this.f463y != null) {
            this.f463y.setCallback(null);
        }
        dB.m1104a(this.f463y);
        this.f455q.setBackgroundDrawable(null);
        this.f439a.setBackgroundDrawable(null);
        this.f454p.removeAllViews();
        this.f440b.removeAllViews();
        this.f441c.removeAllViews();
        this.f436L = null;
    }

    public final void m489m() {
        this.f439a.post(new aE(this));
    }

    public final void m490n() {
        int i = 0;
        if (this.f450l != null) {
            i = this.f450l.m1158n();
        }
        int i2 = (this.f446h.bottom + this.f445g.bottom) + i;
        int i3 = (this.f446h.right + this.f445g.right) + i;
        this.f439a.setPadding((this.f446h.left + this.f445g.left) + i, i + (this.f446h.top + this.f445g.top), i3, i2);
    }

    public final void m491o() {
        m473e(this.f450l);
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        contextMenu.add("Context Menu");
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (this.f449k == null) {
            return false;
        }
        for (int i = 0; i < this.f447i.size(); i++) {
            cu cuVar = (cu) this.f447i.elementAt(i);
            if (menuItem.getTitle().toString().compareTo(cuVar.f1029h) == 0) {
                this.f449k.m1048a(cuVar);
                return true;
            }
        }
        return false;
    }

    public final boolean m492p() {
        return this.f435K;
    }

    public final View m493q() {
        return this.f440b;
    }

    public final View m494r() {
        return this.f441c;
    }

    public final void m495s() {
        if (this.f427C != null) {
            this.f427C.m500a();
        }
    }

    public final void m496t() {
        this.f436L = null;
        this.f454p.setContentDescription(null);
    }
}
