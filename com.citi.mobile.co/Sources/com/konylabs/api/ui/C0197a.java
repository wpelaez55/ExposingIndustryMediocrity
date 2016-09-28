package com.konylabs.api.ui;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.Adapter;
import android.widget.Scroller;
import com.konylabs.android.KonyMain;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: com.konylabs.api.ui.a */
public class C0197a extends ViewGroup {
    private static final boolean f366B;
    private static String f367L;
    private int f368A;
    private int f369C;
    private int f370D;
    private View f371E;
    private boolean f372F;
    private int f373G;
    private int f374H;
    private int f375I;
    private int f376J;
    private DataSetObserver f377K;
    private Rect f378M;
    private boolean f379N;
    private int f380O;
    private int f381P;
    private boolean f382Q;
    private SimpleOnGestureListener f383R;
    private Handler f384S;
    private C0202e f385T;
    private Adapter f386a;
    private int f387b;
    private LinkedList f388c;
    private int f389d;
    private int f390e;
    private Camera f391f;
    private int f392g;
    private int f393h;
    private int f394i;
    private int f395j;
    private int f396k;
    private int f397l;
    private HashMap f398m;
    private int f399n;
    private int f400o;
    private int f401p;
    private float f402q;
    private int f403r;
    private int f404s;
    private float f405t;
    private int f406u;
    private int f407v;
    private Scroller f408w;
    private GestureDetector f409x;
    private boolean f410y;
    private float f411z;

    static {
        f366B = KonyMain.f3657e;
        f367L = "CoverFlow";
    }

    public C0197a(Context context) {
        super(context);
        this.f399n = 769;
        this.f368A = 60;
        this.f369C = 300;
        this.f378M = new Rect();
        this.f379N = false;
        this.f380O = 0;
        this.f381P = 0;
        this.f382Q = false;
        this.f383R = new C0198b(this);
        this.f384S = new C0199c(this);
        this.f388c = new LinkedList();
        this.f391f = new Camera();
        this.f408w = new Scroller(context, new DecelerateInterpolator());
        this.f409x = new GestureDetector(context, this.f383R);
        try {
            ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE}).invoke(this, new Object[]{Boolean.valueOf(true)});
        } catch (Exception e) {
            Log.d(f367L, "Could not find or invoke the method \"setChildrenDrawingOrderEnabled()\"");
            e.printStackTrace();
        }
        setStaticTransformationsEnabled(true);
        this.f370D = ViewConfiguration.get(context).getScaledTouchSlop();
        if (f366B) {
            Log.d(f367L, "Touch slop: " + this.f370D);
        }
    }

    private int m365a(View view, int i, float f) {
        int right = (int) (((float) view.getRight()) - f);
        int i2 = (int) (((float) (right - this.f397l)) / this.f405t);
        int width = ((int) (((float) right) - (((float) i2) * this.f405t))) - view.getWidth();
        right = i2 + 1;
        if (right > i) {
            i2 = right - i;
            right -= i2;
            width = (int) (((float) width) + (((float) i2) * this.f405t));
        }
        i2 = i - right;
        int i3 = width;
        for (width = 0; width < right; width++) {
            View a = m368a(i2, i3, true, width);
            if (this.f382Q) {
                a.invalidate();
            }
            i3 = (int) (((float) i3) + this.f405t);
            i2++;
        }
        return right;
    }

    private View m368a(int i, int i2, boolean z, int i3) {
        View view = (View) this.f388c.poll();
        if (this.f386a != null) {
            view = view == null ? this.f386a.getView(i, null, this) : this.f386a.getView(i, view, this);
        }
        if (view != null) {
            measureChild(view, this.f389d, this.f390e);
            view.layout(i2, 0, view.getMeasuredWidth() + i2, view.getMeasuredHeight());
        }
        if (z) {
            addViewInLayout(view, i3, view.getLayoutParams());
        }
        return view;
    }

    private void m369a(int i, int i2, int i3) {
        while (i <= i2) {
            View childAt = getChildAt(i);
            childAt.offsetLeftAndRight(i3);
            if (this.f382Q) {
                childAt.invalidate();
            }
            i++;
        }
    }

    private void m370a(int i, boolean z, int i2) {
        Message obtain = Message.obtain();
        obtain.arg1 = i;
        if (z) {
            obtain.arg2 = 1040;
        }
        obtain.what = i2;
        this.f384S.sendMessage(obtain);
        this.f399n = 771;
    }

    private void m371a(View view, Matrix matrix) {
        this.f391f.save();
        float f = ((float) this.f400o) / 2.0f;
        float f2 = ((float) this.f401p) / 2.0f;
        float left = ((float) this.f392g) - (((float) view.getLeft()) + f);
        float f3 = (left / ((float) this.f407v)) * ((float) this.f368A);
        if (f3 > ((float) this.f368A)) {
            f3 = (float) this.f368A;
        } else if (f3 < ((float) (-this.f368A))) {
            f3 = (float) (-this.f368A);
        }
        float abs = (Math.abs(left) / ((float) this.f392g)) * ((float) this.f369C);
        if (f366B) {
            Log.d(f367L, "Depth: " + abs);
        }
        this.f391f.translate(0.0f, 0.0f, abs);
        if (f366B) {
            Log.d(f367L, "Angle: " + f3);
        }
        this.f391f.rotateY(f3);
        this.f391f.getMatrix(matrix);
        matrix.preTranslate(-f, -f2);
        matrix.postTranslate(f, f2);
        this.f391f.restore();
    }

    private int m375b(View view, int i, float f) {
        int left = (int) (((float) view.getLeft()) + f);
        int i2 = 0;
        int i3 = this.f380O;
        int i4 = i + 1;
        while (left <= this.f396k && i4 < i3) {
            View a = m368a(i4, left, true, -1);
            if (this.f382Q) {
                a.invalidate();
            }
            left = (int) (((float) left) + this.f405t);
            i4++;
            i2++;
        }
        return i2;
    }

    private void m381c() {
        m384d();
        removeAllViewsInLayout();
    }

    private void m384d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.f388c.offer(getChildAt(i));
        }
    }

    private void m386e() {
        if (this.f386a == null || this.f380O != 0) {
            int i = this.f387b;
            View a = m368a(i, 0, false, -1);
            int measuredWidth = a.getMeasuredWidth();
            this.f400o = measuredWidth;
            this.f401p = a.getMeasuredHeight();
            if (f366B) {
                Log.d(f367L, "layoutChildren: childWidth = " + this.f400o + " childHeight = " + this.f401p);
            }
            a.offsetLeftAndRight((this.f397l + this.f392g) - (measuredWidth / 2));
            this.f407v = this.f376J + (this.f400o / 2);
            this.f405t = (float) ((int) (((float) this.f407v) * 0.6666667f));
            this.f411z = this.f405t / ((float) this.f407v);
            this.f395j = i - m365a(a, i, (float) this.f407v);
            this.f381P = this.f387b - this.f395j;
            addViewInLayout(a, -1, a.getLayoutParams());
            this.f394i = i + m375b(a, i, (float) this.f407v);
            m391g();
            if (f366B) {
                Log.d(f367L, "Max Primary Offset: " + this.f407v);
                Log.d(f367L, "Max Secondary Offset: " + this.f405t);
                Log.d(f367L, "First Item Pos: " + this.f395j + " Selected Item Pos: " + this.f387b + " Last Item Pos: " + this.f394i);
                m388f();
            }
        }
    }

    private void m387e(int i) {
        if (i != 0 && this.f399n != 769) {
            float f;
            if (f366B) {
                Log.d(f367L, "--------------------------Scroll Start--------------------------");
                Log.d(f367L, "Scroll displacement: " + i);
            }
            int abs = Math.abs(i);
            if (this.f406u != 0) {
                if (this.f403r == 1 && i < 0) {
                    this.f406u = this.f407v - this.f406u;
                    this.f387b--;
                    this.f381P--;
                } else if (this.f403r == -1 && i > 0) {
                    this.f406u = this.f407v - this.f406u;
                    this.f387b++;
                    this.f381P++;
                }
            }
            if (this.f406u + abs >= this.f407v) {
                abs = this.f407v - this.f406u;
                this.f406u = 0;
            } else {
                this.f406u += abs;
            }
            if (i < 0) {
                abs = -abs;
            }
            if (f366B) {
                Log.d(f367L, "Actual displacement: " + abs);
                Log.d(f367L, "Total Displacement: " + this.f406u);
            }
            float abs2 = Math.abs(this.f411z * ((float) abs));
            int i2 = ((this.f403r != 1 || abs >= 0) && (this.f403r != -1 || abs <= 0)) ? 0 : 1;
            if (i2 != 0) {
                this.f402q = 0.0f;
            }
            if (this.f404s != 0) {
                if (this.f406u == 0) {
                    abs2 = i2 != 0 ? (float) this.f404s : this.f405t - ((float) this.f404s);
                } else if (i2 != 0) {
                    this.f404s = (int) (this.f405t - ((float) this.f404s));
                }
            }
            abs2 += this.f402q;
            i2 = this.f381P;
            View childAt = getChildAt(i2);
            if (childAt != null) {
                childAt.offsetLeftAndRight(abs);
                if (this.f382Q) {
                    childAt.invalidate();
                }
            }
            int i3;
            if (abs > 0) {
                this.f403r = 1;
                childAt = getChildAt(i2 - 1);
                if (childAt != null) {
                    childAt.offsetLeftAndRight(abs);
                    if (this.f382Q) {
                        childAt.invalidate();
                    }
                }
                if (abs2 >= 1.0f) {
                    m369a(0, i2 - 2, (int) abs2);
                    m369a(i2 + 1, getChildCount() - 1, (int) abs2);
                    this.f404s += (int) abs2;
                    if (f366B) {
                        Log.d(f367L, "offset: -> " + abs2);
                    }
                    f = abs2 - ((float) ((int) abs2));
                    m399k();
                    if (this.f395j > 0) {
                        View childAt2 = getChildAt(0);
                        if (childAt2 != null && childAt2.getRight() > this.f397l) {
                            int i4 = this.f381P;
                            i3 = (int) this.f405t;
                            if (i4 - 1 == 0) {
                                i3 += this.f406u - this.f404s;
                            } else if (i4 == 0) {
                                i3 = this.f407v;
                            }
                            i3 = i3 != 0 ? m365a(childAt2, this.f395j, (float) i3) : 0;
                            if (i3 != 0 && f366B) {
                                Log.d(f367L, "No. of Views added on Left from " + this.f395j + " : " + i3);
                            }
                            this.f395j -= i3;
                            this.f381P = i3 + this.f381P;
                        }
                    }
                }
                f = abs2;
            } else {
                this.f403r = -1;
                childAt = getChildAt(i2 + 1);
                if (childAt != null) {
                    childAt.offsetLeftAndRight(abs);
                    if (this.f382Q) {
                        childAt.invalidate();
                    }
                }
                if (abs2 >= 1.0f) {
                    m369a(i2 + 2, getChildCount() - 1, -((int) abs2));
                    m369a(0, i2 - 1, -((int) abs2));
                    this.f404s += (int) abs2;
                    if (f366B) {
                        Log.d(f367L, "offset: <- " + abs2);
                    }
                    f = abs2 - ((float) ((int) abs2));
                    m396j();
                    if (this.f394i < this.f380O) {
                        i2 = getChildCount() - 1;
                        childAt = getChildAt(i2);
                        if (childAt != null && childAt.getLeft() < this.f396k) {
                            i3 = (int) this.f405t;
                            int i5 = this.f381P;
                            if (i2 == i5 + 1) {
                                i3 += this.f406u - this.f404s;
                            } else if (i2 == i5) {
                                i3 = this.f407v;
                            }
                            i3 = i3 != 0 ? m375b(childAt, this.f394i, (float) i3) : 0;
                            if (i3 != 0 && f366B) {
                                Log.d(f367L, "No. of Views added on Right from " + this.f394i + " : " + i3);
                            }
                            this.f394i = i3 + this.f394i;
                        }
                    }
                }
                f = abs2;
            }
            if (f366B) {
                Log.d(f367L, "Total Offset: " + this.f404s);
            }
            this.f402q = f;
            if (this.f406u == 0) {
                if (this.f406u == 0) {
                    if (this.f403r == 1) {
                        this.f387b--;
                        this.f381P--;
                        if (this.f387b == -1) {
                            this.f399n = 769;
                        }
                    } else if (this.f403r == -1) {
                        this.f387b++;
                        this.f381P++;
                        if (this.f387b == this.f380O) {
                            this.f399n = 769;
                        }
                    }
                }
                this.f404s = 0;
                this.f402q = 0.0f;
                if (f366B) {
                    m388f();
                }
            }
            if (f366B) {
                Log.d(f367L, "First Item Pos: " + this.f395j + " Selected Item Pos: " + this.f387b + " Last Item Pos: " + this.f394i);
            }
            m391g();
            invalidate();
            if (((float) this.f404s) >= this.f405t) {
                this.f404s = 0;
                this.f402q = 0.0f;
            }
            if (f366B) {
                Log.d(f367L, "--------------------------Scroll End--------------------------");
            }
        }
    }

    private void m388f() {
        if (f366B) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                Log.d(f367L, "Child Index: " + i + ": " + ((childAt.getWidth() / 2) + childAt.getLeft()));
            }
        }
    }

    private void m391g() {
        int i = 0;
        int childCount = getChildCount();
        if (childCount != 0) {
            if (this.f398m == null) {
                this.f398m = new HashMap(childCount, 1.0f);
            }
            HashMap hashMap = this.f398m;
            int i2 = this.f381P;
            if (this.f406u >= this.f407v / 3) {
                if (this.f403r == -1) {
                    i2++;
                } else if (this.f403r == 1) {
                    i2--;
                }
            }
            int i3 = 0;
            while (i < i2) {
                hashMap.put(Integer.valueOf(i3), Integer.valueOf(i));
                i3++;
                i++;
            }
            for (i = childCount - 1; i > i2; i--) {
                hashMap.put(Integer.valueOf(i3), Integer.valueOf(i));
                i3++;
            }
            hashMap.put(Integer.valueOf(i3), Integer.valueOf(i2));
        }
    }

    private void m393h() {
        if (this.f403r != 0) {
            int i;
            int i2;
            if (f366B) {
                Log.d(f367L, "Justifying...");
            }
            if (this.f406u > this.f407v / 2) {
                if (this.f403r != 1) {
                    if (this.f403r == -1) {
                        if (this.f387b != this.f380O - 1) {
                            i = -(this.f407v - this.f406u);
                            i2 = 1038;
                        }
                        i2 = this.f406u;
                        i = i2;
                        i2 = 1037;
                    }
                    i2 = 0;
                    i = 0;
                } else if (this.f387b == 0) {
                    i = -this.f406u;
                    i2 = 1038;
                } else {
                    i2 = this.f407v - this.f406u;
                    i = i2;
                    i2 = 1037;
                }
            } else if (this.f403r == 1) {
                i = this.f387b == -1 ? -this.f407v : -this.f406u;
                i2 = 1038;
            } else {
                if (this.f403r == -1) {
                    if (this.f387b == this.f380O) {
                        i2 = this.f407v;
                        i = i2;
                        i2 = 1037;
                    }
                    i2 = this.f406u;
                    i = i2;
                    i2 = 1037;
                }
                i2 = 0;
                i = 0;
            }
            if (f366B) {
                Log.d(f367L, "Distance to Justify: " + i + " Justify direction: " + i2);
            }
            Message obtain = Message.obtain();
            obtain.arg1 = 0;
            obtain.arg2 = i;
            obtain.what = i2;
            this.f399n = 770;
            this.f408w.startScroll(0, 0, i, 0);
            this.f384S.sendMessage(obtain);
        }
    }

    private void m394i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).invalidate();
        }
    }

    private void m396j() {
        int childCount = getChildCount();
        if (childCount != 1) {
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getRight() <= this.f397l) {
                    this.f388c.offer(childAt);
                    i++;
                }
            }
            if (i != 0) {
                if (f366B) {
                    Log.d(f367L, "No. of Views detaching on Left from 0: " + i);
                }
                removeViewsInLayout(0, i);
                this.f395j += i;
                this.f381P -= i;
            }
        }
    }

    private void m399k() {
        int i = 0;
        int childCount = getChildCount();
        if (childCount != 1) {
            childCount--;
            while (childCount >= 0) {
                View childAt = getChildAt(childCount);
                if (childAt.getLeft() < this.f396k) {
                    break;
                }
                this.f388c.offer(childAt);
                i++;
                childCount--;
            }
            if (i != 0) {
                childCount++;
                if (f366B) {
                    Log.d(f367L, "No. of Views detaching on Right from " + childCount + " : " + i);
                }
                removeViewsInLayout(childCount, i);
                this.f394i -= i;
            }
        }
    }

    private void m401l() {
        this.f399n = 769;
        this.f408w.forceFinished(true);
        if (this.f387b < 0) {
            this.f387b = 0;
        } else if (this.f387b > this.f380O - 1) {
            this.f387b = this.f380O - 1;
        }
        this.f381P = 0;
        this.f403r = 0;
        this.f406u = 0;
        this.f404s = 0;
        this.f402q = 0.0f;
    }

    public final void m406a(int i) {
        if (i < 0) {
            i += 180;
        }
        this.f368A = i;
        if (this.f382Q) {
            m394i();
        }
        invalidate();
    }

    public final void m407a(Adapter adapter) {
        if (this.f386a != null) {
            this.f386a.unregisterDataSetObserver(this.f377K);
        }
        this.f386a = adapter;
        if (this.f386a != null) {
            this.f377K = new C0200d();
            adapter.registerDataSetObserver(this.f377K);
            this.f387b = 0;
            this.f381P = 0;
            this.f380O = adapter.getCount();
        }
    }

    public final void m408a(C0202e c0202e) {
        this.f385T = c0202e;
    }

    public final void m409b(int i) {
        this.f369C = i;
        if (this.f382Q) {
            m394i();
        }
        invalidate();
    }

    public final void b_(int i) {
        if (this.f399n != 769 || i < 0 || i >= this.f380O) {
            return;
        }
        if (!this.f410y) {
            this.f387b = i;
        } else if (i < this.f395j || i > this.f394i) {
            m381c();
            this.f387b = i;
            m386e();
            if (this.f382Q) {
                m394i();
            }
            invalidate();
            if (f366B) {
                m388f();
            }
        } else {
            int i2 = i > this.f387b ? -1 : i < this.f387b ? 1 : 0;
            if (i2 != 0) {
                m370a(i, false, i2);
            }
        }
    }

    public final void m410c(int i) {
        this.f376J = i;
        if (this.f410y) {
            m381c();
            m386e();
            if (this.f382Q) {
                m394i();
            }
            invalidate();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        onInterceptTouchEvent(motionEvent);
        if (action == 0) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (f366B) {
                Log.d(f367L, "DispatchTouchEvent: ACTION_DOWN ");
            }
            if (this.f399n == 771) {
                return false;
            }
            if (this.f399n != 770) {
                action = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                View childAt = getChildAt(this.f381P);
                Rect rect = this.f378M;
                if (childAt != null) {
                    childAt.getHitRect(rect);
                    if (!rect.contains(action, y)) {
                        return onTouchEvent(motionEvent);
                    }
                    motionEvent.setLocation((float) (action - childAt.getLeft()), (float) (y - childAt.getTop()));
                    if (!childAt.dispatchTouchEvent(motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                    this.f371E = childAt;
                    return true;
                }
            }
            return onTouchEvent(motionEvent);
        } else if (action == 2) {
            if (f366B) {
                Log.d(f367L, "DispatchTouchEvent: ACTION_MOVE ");
            }
            View view = this.f371E;
            if (view == null) {
                return onTouchEvent(motionEvent);
            }
            motionEvent.setAction(3);
            view.dispatchTouchEvent(motionEvent);
            this.f371E = null;
            return true;
        } else if (action != 1 && action != 3) {
            return true;
        } else {
            if (f366B) {
                if (action == 1) {
                    Log.d(f367L, "DispatchTouchEvent: ACTION_UP " + this.f372F);
                } else if (action == 3) {
                    Log.d(f367L, "DispatchTouchEvent: ACTION_CANCEL " + this.f372F);
                }
            }
            View view2 = this.f371E;
            if (view2 == null) {
                return onTouchEvent(motionEvent);
            }
            boolean dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
            this.f371E = null;
            return dispatchTouchEvent;
        }
    }

    protected int getChildDrawingOrder(int i, int i2) {
        int intValue = ((Integer) this.f398m.get(Integer.valueOf(i2))).intValue();
        if (f366B) {
            Log.d(f367L, "iteration = " + i2 + " childIndex: " + intValue);
        }
        return intValue;
    }

    protected boolean getChildStaticTransformation(View view, Transformation transformation) {
        transformation.clear();
        transformation.setTransformationType(2);
        m371a(view, transformation.getMatrix());
        return true;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.f382Q = ((Boolean) View.class.getMethod("isHardwareAccelerated", new Class[0]).invoke(this, new Object[0])).booleanValue();
            if (f366B) {
                Log.d(f367L, "Is Hardware Acceleration Enabled: " + this.f382Q);
            }
        } catch (Exception e) {
            Log.d(f367L, "Could not find or invoke the method \"isHardwareAccelerated()\"");
            e.printStackTrace();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (f366B) {
                Log.d(f367L, "onInterceptTouchEvent: ACTION_DOWN ");
            }
            this.f373G = (int) motionEvent.getX();
            this.f375I = this.f373G;
            this.f374H = (int) motionEvent.getY();
        } else if (action == 2) {
            if (f366B) {
                Log.d(f367L, "onInterceptTouchEvent: ACTION_MOVE ");
            }
            this.f393h = this.f373G;
            action = (int) motionEvent.getX();
            this.f373G = action;
            int y = (int) motionEvent.getY();
            if (!this.f372F) {
                y = Math.abs(y - this.f374H);
                if (y > Math.abs(action - this.f375I) && y > this.f370D) {
                    this.f372F = true;
                }
            }
        } else if (action == 1 || action == 3) {
            if (f366B) {
                if (action == 1) {
                    Log.d(f367L, "onInterceptTouchEvent: ACTION_UP ");
                } else {
                    Log.d(f367L, "onInterceptTouchEvent: ACTION_CANCEL ");
                }
            }
            this.f393h = 0;
            this.f372F = false;
        }
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (f366B) {
            Log.d(f367L, "onLayout() " + z + " " + i + " " + i2 + " " + i3 + " " + i4);
        }
        if (this.f386a != null && z && this.f380O != 0) {
            if (this.f399n == 770) {
                m401l();
            }
            this.f410y = false;
            m381c();
            this.f396k = i3;
            this.f397l = i;
            this.f392g = (i3 - i) / 2;
            m386e();
            this.f410y = true;
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int measuredWidth;
        View view = (View) this.f388c.poll();
        if (view == null && this.f386a != null) {
            i3 = this.f380O;
            if (this.f387b >= 0 && this.f387b < i3) {
                view = this.f386a.getView(this.f387b, null, this);
                this.f388c.offer(view);
            }
        }
        View view2 = view;
        if (view2 != null) {
            measureChild(view2, i, i2);
            measuredWidth = view2.getMeasuredWidth();
            i3 = view2.getMeasuredHeight();
        } else {
            measuredWidth = this.f400o;
            i3 = this.f401p;
        }
        i3 = Math.max(i3, getSuggestedMinimumHeight());
        measuredWidth = Math.max(measuredWidth, getSuggestedMinimumWidth());
        int resolveSize = C0197a.resolveSize(i3, i2);
        int resolveSize2 = C0197a.resolveSize(measuredWidth, i);
        if (f366B) {
            Log.d(f367L, "CoverFlow Width = " + resolveSize2 + " Height = " + resolveSize + " Preferred Width = " + measuredWidth + " Preferred Height = " + i3);
        }
        setMeasuredDimension(resolveSize2, resolveSize);
        this.f389d = i;
        this.f390e = i2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f409x.onTouchEvent(motionEvent)) {
            int action = motionEvent.getAction();
            int i = this.f373G;
            if (action == 0) {
                if (f366B) {
                    Log.d(f367L, "onTouchEvent: ACTION_DOWN");
                }
                if (this.f399n == 770 && this.f387b >= this.f395j && this.f387b <= this.f394i) {
                    this.f399n = 769;
                    this.f408w.forceFinished(true);
                }
            } else {
                if (action != 2 || this.f399n == 770) {
                    if ((action == 1 || action == 3) && this.f399n != 770) {
                        if (f366B) {
                            if (action == 1) {
                                Log.d(f367L, "onTouchEvent: ACTION_UP");
                            } else {
                                Log.d(f367L, "onTouchEvent: ACTION_CANCEL");
                            }
                        }
                    }
                } else if (this.f372F) {
                    if (f366B) {
                        Log.d(f367L, "onTouchEvent: Allowing parent to intercept touch events ");
                    }
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    if (f366B) {
                        Log.d(f367L, "onTouchEvent: ACTION_MOVE ");
                    }
                    if (this.f399n == 769 && this.f387b >= this.f395j && this.f387b <= this.f394i) {
                        this.f399n = 771;
                    }
                    m387e(i - this.f393h);
                }
                m393h();
            }
        }
        return true;
    }
}
