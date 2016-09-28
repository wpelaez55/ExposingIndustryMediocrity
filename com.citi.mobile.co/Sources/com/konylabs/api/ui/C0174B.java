package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0339C;
import com.konylabs.hybrid.C0227b;
import com.konylabs.vm.LuaNil;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Iterator;
import java.util.Vector;
import ny0k.aG;
import ny0k.cA;
import ny0k.cF;

/* renamed from: com.konylabs.api.ui.B */
public class C0174B extends LinearLayout implements OnMenuItemClickListener, OnCreateContextMenuListener {
    public static int f181a;
    public static int f182b;
    public static int f183c;
    public static int f184d;
    public static int f185e;
    boolean f186f;
    protected boolean f187g;
    protected float f188h;
    private dB f189i;
    private dB f190j;
    private Drawable f191k;
    private Drawable f192l;
    private LayoutParams f193m;
    private Rect f194n;
    private cF f195o;
    private SparseArray f196p;
    private float f197q;
    private float f198r;
    private int f199s;
    private IdleHandler f200t;
    private Runnable f201u;
    private boolean f202v;
    private boolean f203w;
    private Vector f204x;
    private cv f205y;
    private C0227b f206z;

    static {
        f181a = 0;
        f182b = 1;
        f183c = 3;
        f184d = 5;
        f185e = 17;
    }

    public C0174B(Context context) {
        super(context);
        this.f189i = null;
        this.f190j = null;
        this.f193m = null;
        this.f194n = null;
        this.f196p = new SparseArray();
        this.f200t = new C0175D(this);
        this.f201u = new C0176E(this);
        this.f186f = false;
        this.f202v = false;
        this.f203w = false;
        this.f204x = null;
        this.f205y = null;
        super.setBaselineAligned(false);
        this.f193m = new LayoutParams(-1, -2);
        super.setGravity(f183c);
        setDrawingCacheEnabled(false);
        this.f199s = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public static void m111c() {
    }

    private static void m112d(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            if (KonyMain.f3657e) {
                Log.d("KonyBoxLayout", "The child being added already has a parent so removing it");
            }
            viewGroup.removeView(view);
        }
    }

    public static void m113j() {
    }

    public final void m114a() {
        if (this.f194n != null && (this.f192l instanceof cA)) {
            ((cA) this.f192l).m2097a(this.f194n);
        }
        if (this.f194n != null && (this.f191k instanceof cA)) {
            ((cA) this.f191k).m2097a(this.f194n);
        }
        if (this.f192l != null) {
            Drawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(FOCUSED_STATE_SET, this.f192l);
            stateListDrawable.addState(PRESSED_ENABLED_STATE_SET, this.f192l);
            stateListDrawable.addState(ENABLED_STATE_SET, this.f191k);
            setBackgroundDrawable(stateListDrawable);
            return;
        }
        setBackgroundDrawable(this.f191k);
        if (this.f194n != null && !(this.f191k instanceof cA)) {
            setPadding(this.f194n.left, this.f194n.top, this.f194n.right, this.f194n.bottom);
        }
    }

    public void m115a(float f) {
        this.f193m.width = 0;
        this.f193m.weight = f;
    }

    public final void m116a(int i) {
        super.setGravity(i);
    }

    public void m117a(int i, int i2) {
    }

    public final void m118a(GestureDetector gestureDetector, int i) {
        this.f196p.append(i, gestureDetector);
    }

    public final void m119a(View view) {
        super.removeView(view);
        m128b();
    }

    public void m120a(View view, int i) {
        C0174B.m112d(view);
        if (i > getChildCount()) {
            i = getChildCount();
        }
        super.addView(view, i);
        m128b();
    }

    public final void m121a(cv cvVar) {
        this.f205y = cvVar;
    }

    public final void m122a(dB dBVar) {
        this.f189i = dBVar;
        if (dBVar != null) {
            this.f191k = dBVar.m1162p();
            if (this.f191k == null && dBVar.m1133c()) {
                this.f195o = new cF(dBVar.m1140f());
                this.f195o.m2109a(new C0370C(this));
                this.f195o.execute(new String[0]);
                return;
            } else if (this.f191k instanceof cA) {
                ((cA) this.f191k).m2098a(true);
                return;
            } else {
                return;
            }
        }
        this.f191k = null;
    }

    public final void m123a(String str) {
    }

    public final void m124a(Vector vector) {
        this.f204x = vector;
        if (this.f204x != null) {
            setOnCreateContextMenuListener(this);
        }
    }

    public void m125a(aG aGVar) {
    }

    public final void m126a(boolean z) {
        setDuplicateParentStateEnabled(z);
    }

    public void m127a(int[] iArr) {
        this.f193m.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void m128b() {
        if (this.f206z != null) {
            this.f206z.m1612a();
        }
    }

    public void m129b(float f) {
    }

    public void m130b(int i) {
        super.setVisibility(i);
    }

    public void m131b(View view) {
        C0174B.m112d(view);
        super.addView(view);
        m128b();
    }

    public final void m132b(dB dBVar) {
        this.f190j = dBVar;
        if (dBVar != null) {
            this.f192l = dBVar.m1162p();
            if (this.f192l instanceof cA) {
                ((cA) this.f192l).m2098a(true);
            }
            setFocusable(true);
            return;
        }
        this.f192l = null;
    }

    public final void m133b(String str) {
        if (KonyMain.f3656d <= 3) {
            return;
        }
        if (str != null) {
            setContentDescription(str);
            if (KonyMain.f3656d >= 16) {
                setImportantForAccessibility(1);
            }
            if (KonyMain.f3656d < 16) {
                setFocusable(true);
            }
        } else if (KonyMain.f3656d >= 16) {
            setImportantForAccessibility(2);
            if (KonyMain.f3656d < 16) {
                setFocusable(false);
            }
        } else {
            setContentDescription(BuildConfig.FLAVOR);
            if (KonyMain.f3656d < 16) {
                setFocusable(false);
            }
        }
    }

    public void m134b(boolean z) {
        this.f193m.height = z ? -1 : -2;
    }

    public final void m135b(int[] iArr) {
        this.f194n = new Rect();
        this.f194n.left = iArr[0];
        this.f194n.top = iArr[1];
        this.f194n.right = iArr[2];
        this.f194n.bottom = iArr[3];
    }

    public final void m136c(float f) {
        this.f188h = f;
    }

    public final void m137c(int i) {
        this.f193m.gravity = i;
    }

    public void m138c(View view) {
    }

    public final void m139c(boolean z) {
        this.f202v = true;
    }

    public final void m140d() {
        this.f186f = false;
        m143e();
    }

    public void m141d(int i) {
        this.f193m.width = i;
        post(this.f201u);
    }

    public final void m142d(boolean z) {
        this.f203w = true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return isEnabled() ? super.dispatchKeyEvent(keyEvent) : true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return isEnabled() ? super.dispatchTouchEvent(motionEvent) : true;
    }

    public void m143e() {
        if (!this.f186f) {
            m114a();
            super.setLayoutParams(this.f193m);
            this.f186f = true;
        }
    }

    public void m144e(int i) {
        this.f193m.height = i;
        m140d();
        post(this.f201u);
    }

    public final void m145e(boolean z) {
    }

    public void m146f() {
        if (this.f195o != null) {
            this.f195o.cancel(true);
        }
        if (this.f191k != null) {
            this.f191k.setCallback(null);
            dB.m1104a(this.f191k);
        }
        if (this.f192l != null) {
            this.f192l.setCallback(null);
        }
        setBackgroundDrawable(null);
        this.f191k = null;
        this.f192l = null;
        if (this.f187g) {
            this.f206z = null;
        }
        removeAllViews();
    }

    public void m147f(int i) {
    }

    public void m148f(boolean z) {
    }

    public void m149g(int i) {
    }

    public void m150g(boolean z) {
    }

    public final boolean m151g() {
        return this.f202v;
    }

    public void m152h(int i) {
    }

    public void m153h(boolean z) {
    }

    public final boolean m154h() {
        return this.f203w;
    }

    public View m155i() {
        return this;
    }

    public void m156i(int i) {
    }

    public final void m157i(boolean z) {
        this.f187g = z;
        LuaNil a = C0339C.m2240a((Object) "adherePercentageStrictly");
        boolean booleanValue = (a == null || a == LuaNil.nil) ? false : ((Boolean) a).booleanValue();
        if (this.f187g && booleanValue) {
            this.f206z = new C0227b(this);
        }
    }

    public final void m158j(int i) {
        this.f196p.delete(i);
    }

    public void m159j(boolean z) {
    }

    public void m160k() {
    }

    public void m161k(boolean z) {
    }

    public final void m162l() {
        m122a(this.f189i);
        m132b(this.f190j);
        m114a();
    }

    public void m163l(boolean z) {
    }

    public View m164m() {
        return null;
    }

    public int m165n() {
        return 0;
    }

    public int m166o() {
        return 0;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        if (this.f204x != null && contextMenu.size() == 0) {
            Iterator it = this.f204x.iterator();
            while (it.hasNext()) {
                cu cuVar = (cu) it.next();
                if (cuVar.m1045c()) {
                    contextMenu.add(0, cuVar.m1040a().hashCode(), 0, cuVar.m1044b()).setOnMenuItemClickListener(this);
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        int size = this.f196p.size();
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (size > 0) {
            if (KonyMain.f3657e) {
                Log.d("Konyboxlayout", "onInterceptTouchEvent Action is--------" + motionEvent.getAction() + "x " + motionEvent.getX() + "y " + motionEvent.getY());
            }
            float y = motionEvent.getY();
            float x = motionEvent.getX();
            switch (motionEvent.getActionMasked()) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                    this.f197q = y;
                    this.f198r = x;
                    while (i < size) {
                        ((GestureDetector) this.f196p.valueAt(i)).onTouchEvent(motionEvent);
                        i++;
                    }
                    return onInterceptTouchEvent;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    while (i < size) {
                        ((GestureDetector) this.f196p.valueAt(i)).onTouchEvent(obtain);
                        i++;
                    }
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    i = (int) Math.abs(y - this.f197q);
                    size = (int) Math.abs(x - this.f198r);
                    this.f197q = y;
                    this.f198r = x;
                    if (i > this.f199s || size > this.f199s) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
            }
        }
        return onInterceptTouchEvent;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (this.f205y == null || this.f204x == null) {
            return false;
        }
        Iterator it = this.f204x.iterator();
        while (it.hasNext()) {
            cu cuVar = (cu) it.next();
            if (menuItem.getItemId() == cuVar.m1040a().hashCode()) {
                this.f205y.m1048a(cuVar);
                return true;
            }
        }
        return false;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (getOrientation() == 0) {
            MessageQueue messageQueue = null;
            if (Looper.myLooper() != null) {
                messageQueue = Looper.myQueue();
            }
            if (messageQueue != null) {
                messageQueue.removeIdleHandler(this.f200t);
                messageQueue.addIdleHandler(this.f200t);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int size = this.f196p.size();
        if (size <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        int i = 0;
        boolean z = false;
        while (i < size) {
            boolean z2 = ((GestureDetector) this.f196p.valueAt(i)).onTouchEvent(motionEvent) ? true : z;
            i++;
            z = z2;
        }
        if (z && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6)) {
            motionEvent.setAction(3);
            z = false;
        }
        if (z) {
            return true;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setOrientation(int i) {
        if (i == 0) {
            super.setOrientation(i);
            return;
        }
        super.setOrientation(f182b);
        super.setGravity(48);
    }
}
