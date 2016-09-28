package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Adapter;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;
import com.konylabs.android.KonyMain;

public final class ij extends ViewGroup {
    private static final int f1554A;
    private static final int f1555B;
    private static final int f1556C;
    private SimpleOnGestureListener f1557D;
    private Handler f1558E;
    private int f1559F;
    protected int f1560a;
    private GestureDetector f1561b;
    private Scroller f1562c;
    private in f1563d;
    private int f1564e;
    private int f1565f;
    private boolean f1566g;
    private int f1567h;
    private int f1568i;
    private boolean f1569j;
    private int f1570k;
    private View f1571l;
    private boolean f1572m;
    private int f1573n;
    private boolean f1574o;
    private boolean f1575p;
    private int f1576q;
    private int f1577r;
    private ip f1578s;
    private View f1579t;
    private im f1580u;
    private int f1581v;
    private int f1582w;
    private float f1583x;
    private int f1584y;
    private int f1585z;

    static {
        f1554A = KonyMain.getActContext().getResources().getIdentifier("wheel_bg", "drawable", KonyMain.getActContext().getPackageName());
        f1555B = KonyMain.getActContext().getResources().getIdentifier("wheelBkgnd", "id", KonyMain.getActContext().getPackageName());
        f1556C = KonyMain.getActContext().getResources().getIdentifier("wheelFocusDrawable", "id", KonyMain.getActContext().getPackageName());
    }

    public ij(Context context, int i) {
        super(context);
        this.f1566g = true;
        this.f1568i = -1;
        this.f1570k = -1;
        this.f1576q = 1985;
        this.f1581v = -1;
        this.f1557D = new ik(this);
        this.f1558E = new il(this);
        this.f1559F = -1;
        setLayoutParams(new LayoutParams(-2, -2));
        this.f1561b = new GestureDetector(context, this.f1557D);
        this.f1561b.setIsLongpressEnabled(false);
        this.f1562c = new Scroller(context);
        this.f1576q = 1985;
        setBackgroundResource(f1554A);
        if (KonyMain.f3656d >= 16) {
            setImportantForAccessibility(1);
        }
    }

    private void m1408a(LayerDrawable layerDrawable) {
        if (this.f1567h > 0) {
            int i = this.f1567h;
            int i2 = i * 5;
            layerDrawable.setLayerInset(2, 0, (i2 / 2) - (i / 2), 0, i2 - ((i / 2) + (i2 / 2)));
        }
    }

    private static void m1409a(TextView textView, im imVar) {
        if (textView != null && imVar != null && imVar != null) {
            textView.setTextSize(imVar.f1591b);
            textView.setTextColor(imVar.f1590a);
            textView.setTypeface(imVar.f1593d, imVar.f1592c);
        }
    }

    private boolean m1412a(float f) {
        int i = 0;
        if (!this.f1574o) {
            if (this.f1572m || this.f1569j) {
                int i2;
                if (this.f1572m && f >= 0.0f) {
                    i2 = this.f1560a - ((int) f);
                    if (i2 < 0) {
                        f = (float) this.f1560a;
                    } else {
                        i = i2;
                    }
                    this.f1560a = i;
                    m1426d((int) (-f));
                } else if (!this.f1569j || f > 0.0f) {
                    r1 = Math.abs(f);
                    i = this.f1560a + ((int) r1);
                    if (i > this.f1573n) {
                        i = this.f1573n;
                        r1 = (float) (this.f1573n - this.f1560a);
                    }
                    this.f1560a = i;
                    if (r1 != 0.0f) {
                        if (this.f1572m) {
                            m1426d((int) r1);
                        } else {
                            m1426d((int) (-r1));
                        }
                    }
                } else {
                    float abs = Math.abs(f);
                    i2 = this.f1560a - ((int) abs);
                    if (i2 < 0) {
                        r1 = (float) this.f1560a;
                    } else {
                        i = i2;
                        r1 = abs;
                    }
                    this.f1560a = i;
                    m1426d((int) r1);
                }
            } else if (this.f1568i == 0 && f < 0.0f) {
                r0 = Math.abs(f);
                this.f1560a = (this.f1567h - this.f1560a) + ((int) r0);
                m1420c((int) r0);
            } else if (this.f1568i != 1 || f <= 0.0f) {
                this.f1560a = (int) (((float) this.f1560a) + Math.abs(f));
                m1420c((int) (-f));
            } else {
                r0 = Math.abs(f);
                this.f1560a = (this.f1567h - this.f1560a) + ((int) r0);
                m1420c((int) (-r0));
            }
        }
        return true;
    }

    private void m1419c() {
        if (KonyMain.f3656d >= 11 && KonyMain.f3656d <= 13) {
            TextView textView = new TextView(KonyMain.getActContext());
            textView.setLayoutParams(getChildAt(0).getLayoutParams());
            textView.setText("Default");
            m1409a(textView, this.f1580u);
            LayoutParams layoutParams = textView.getLayoutParams();
            textView.measure(getChildMeasureSpec(this.f1584y, 0, layoutParams.width), getChildMeasureSpec(this.f1585z, 0, layoutParams.height));
            this.f1567h = textView.getMeasuredHeight();
        }
    }

    private void m1420c(int i) {
        if (i != 0) {
            int childCount;
            View view;
            if (i < 0) {
                if (this.f1576q == 1985 && this.f1565f == this.f1577r - 1 && getChildCount() == 5) {
                    this.f1560a = 0;
                    this.f1569j = true;
                    return;
                }
                this.f1569j = false;
                this.f1568i = 0;
                if (this.f1566g) {
                    this.f1566g = false;
                    this.f1565f = (this.f1565f + 1) % this.f1577r;
                    if (this.f1571l == null) {
                        addView(this.f1563d.getView(this.f1565f, null, this));
                    } else {
                        view = this.f1563d.getView(this.f1565f, this.f1571l, this);
                        attachViewToParent(view, getChildCount(), view.getLayoutParams());
                    }
                }
                if (this.f1560a >= this.f1567h) {
                    this.f1566g = true;
                    this.f1560a -= this.f1567h;
                    if (this.f1560a < this.f1567h) {
                        this.f1560a = 0;
                    }
                    this.f1564e = (this.f1564e + 1) % this.f1577r;
                    this.f1571l = getChildAt(0);
                    detachViewFromParent(0);
                }
            } else if (this.f1576q == 1985 && this.f1564e == 0 && getChildCount() == 5) {
                this.f1560a = 0;
                this.f1572m = true;
                return;
            } else {
                this.f1572m = false;
                this.f1568i = 1;
                if (this.f1566g) {
                    this.f1566g = false;
                    this.f1564e = this.f1564e > 0 ? this.f1564e - 1 : this.f1577r - 1;
                    if (this.f1571l == null) {
                        addView(this.f1563d.getView(this.f1564e, null, this), 0);
                    } else {
                        view = this.f1563d.getView(this.f1564e, this.f1571l, this);
                        attachViewToParent(view, 0, view.getLayoutParams());
                    }
                }
                if (this.f1560a >= this.f1567h) {
                    this.f1566g = true;
                    this.f1560a -= this.f1567h;
                    if (this.f1560a < this.f1567h) {
                        this.f1560a = 0;
                    }
                    this.f1565f = this.f1565f > 0 ? this.f1565f - 1 : this.f1577r - 1;
                    childCount = getChildCount() - 1;
                    this.f1571l = getChildAt(childCount);
                    detachViewFromParent(childCount);
                }
            }
            int childCount2 = getChildCount();
            for (childCount = 0; childCount < childCount2; childCount++) {
                getChildAt(childCount).offsetTopAndBottom(i);
            }
            if (this.f1560a >= this.f1567h) {
                this.f1560a -= this.f1567h;
                if (this.f1568i == 0) {
                    m1420c(-this.f1560a);
                } else if (this.f1568i == 1) {
                    m1420c(this.f1560a);
                }
            }
            m1425d();
            invalidate();
        }
    }

    private void m1425d() {
        int measuredHeight;
        int childCount = getChildCount();
        float f = (float) this.f1560a;
        if (this.f1568i == 1) {
            if (f != 0.0f) {
                measuredHeight = 0 - getChildAt(0).getMeasuredHeight();
            }
            measuredHeight = 0;
        } else {
            if (this.f1568i == 0) {
                f = (float) (-this.f1560a);
                measuredHeight = 0;
            }
            measuredHeight = 0;
        }
        measuredHeight = (int) (f + ((float) measuredHeight));
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = childAt.getLayoutParams();
            childAt.measure(getChildMeasureSpec(this.f1584y, 0, layoutParams.width), getChildMeasureSpec(this.f1585z, 0, layoutParams.height));
            int measuredHeight2 = childAt.getMeasuredHeight() + measuredHeight;
            childAt.layout(0, measuredHeight, childAt.getMeasuredWidth(), measuredHeight2);
            i++;
            measuredHeight = measuredHeight2;
        }
    }

    private void m1426d(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).offsetTopAndBottom(i);
        }
        invalidate();
    }

    private void m1428e() {
        int i;
        if (this.f1568i == 1) {
            if (((double) this.f1560a) <= ((double) this.f1567h) / 2.0d) {
                this.f1560a = this.f1567h - this.f1560a;
                this.f1570k = 1037;
            } else {
                this.f1570k = 1038;
                i = this.f1567h;
                i = this.f1560a;
            }
        } else if (this.f1568i == 0) {
            if (((double) this.f1560a) <= ((double) this.f1567h) / 2.0d) {
                this.f1560a = this.f1567h - this.f1560a;
                this.f1570k = 1038;
            } else {
                this.f1570k = 1037;
                i = this.f1567h;
                i = this.f1560a;
            }
        }
        if (this.f1568i == 1 || this.f1568i == 0) {
            this.f1562c.startScroll(0, this.f1560a, 0, this.f1567h);
            Message obtain = Message.obtain();
            obtain.what = 1730;
            obtain.arg1 = this.f1560a;
            obtain.arg2 = this.f1567h;
            this.f1574o = true;
            this.f1558E.sendMessage(obtain);
        }
    }

    private void m1431f() {
        this.f1582w = this.f1564e + 2;
        if (this.f1576q == 1985) {
            this.f1582w -= 2;
        } else if (this.f1582w >= this.f1577r) {
            this.f1582w %= this.f1577r;
        }
        if (this.f1581v != -1) {
            ((TextView) getChildAt(2)).setTextColor(this.f1581v);
        }
    }

    public final Adapter m1441a() {
        return this.f1563d;
    }

    public final void m1442a(int i) {
        this.f1581v = i;
        TextView textView = (TextView) getChildAt(2);
        if (textView != null) {
            textView.setTextColor(this.f1581v);
        }
    }

    public final void m1443a(Drawable drawable, Drawable drawable2) {
        LayerDrawable layerDrawable = (LayerDrawable) getBackground();
        getContext().getResources();
        if (drawable != null) {
            drawable.setBounds(layerDrawable.findDrawableByLayerId(f1555B).getBounds());
            layerDrawable.setDrawableByLayerId(f1555B, drawable);
        }
        if (drawable2 != null) {
            drawable2.setBounds(layerDrawable.findDrawableByLayerId(f1556C).getBounds());
            layerDrawable.setDrawableByLayerId(f1556C, drawable2);
        }
        m1408a(layerDrawable);
    }

    public final void m1444a(im imVar) {
        if (imVar != null && this.f1580u != imVar) {
            this.f1580u = imVar;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                m1409a((TextView) getChildAt(i), imVar);
            }
            if (this.f1581v != -1) {
                ((TextView) getChildAt(2)).setTextColor(this.f1581v);
            }
            m1419c();
        }
    }

    public final void m1445a(in inVar) {
        int i = 0;
        this.f1563d = inVar;
        this.f1577r = inVar.getCount();
        this.f1564e = 0;
        this.f1565f = 4;
        removeAllViews();
        for (int i2 = this.f1564e; i2 <= this.f1565f; i2++) {
            addView(this.f1563d.getView(i2, null, this));
        }
        m1431f();
        m1419c();
        int i3 = this.f1577r;
        Adapter adapter = this.f1563d;
        int i4 = 0;
        int i5 = 0;
        View view = null;
        while (i < i3) {
            TextView textView = (TextView) adapter.getView(i, view, null);
            int length = textView.getText().length();
            if (i4 < length) {
                i4 = i;
            } else {
                length = i4;
                i4 = i5;
            }
            i++;
            i5 = i4;
            i4 = length;
        }
        this.f1579t = adapter.getView(i5, view, null);
    }

    public final void m1446a(ip ipVar) {
        this.f1578s = ipVar;
    }

    public final int m1447b() {
        return this.f1582w;
    }

    public final void m1448b(int i) {
        if (this.f1576q == 1985) {
            i += 2;
        }
        this.f1564e = i - 2;
        if (this.f1564e < 0) {
            this.f1564e = this.f1577r + this.f1564e;
        }
        this.f1565f = (this.f1564e + 5) - 1;
        if (this.f1565f >= this.f1577r) {
            this.f1565f -= this.f1577r;
        }
        removeAllViews();
        for (int i2 = 0; i2 < 5; i2++) {
            addView(this.f1563d.getView((this.f1564e + i2) % this.f1577r, null, null));
        }
        m1431f();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(true);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ScrollView.class.getName());
        accessibilityNodeInfo.setScrollable(true);
        if (!isEnabled()) {
            return;
        }
        if (this.f1559F == AccessibilityNodeInfoCompat.ACTION_PASTE) {
            if (this.f1564e > 0) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD);
            }
            if (this.f1565f < this.f1563d.getCount() - 1) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD);
            }
        } else if (this.f1565f == this.f1563d.getCount() - 1) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD);
        }
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Log.d("WheelView", "onLayout");
        if (this.f1563d != null) {
            m1425d();
        }
    }

    protected final void onMeasure(int i, int i2) {
        Log.d("WheelView", "onMeasure");
        super.onMeasure(i, i2);
        if (this.f1563d != null) {
            this.f1584y = i;
            this.f1585z = i2;
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                LayoutParams layoutParams = childAt.getLayoutParams();
                childAt.measure(getChildMeasureSpec(i, 0, layoutParams.width), getChildMeasureSpec(i2, 0, layoutParams.height));
                if (KonyMain.f3656d >= 11 && KonyMain.f3656d <= 13 && childAt.getMeasuredHeight() == 0) {
                    childAt.setMinimumHeight(this.f1567h);
                }
            }
            if (KonyMain.f3656d < 11 || KonyMain.f3656d > 13) {
                this.f1567h = getChildAt(0).getMeasuredHeight();
            }
            m1408a((LayerDrawable) getBackground());
            this.f1573n = this.f1567h * 2;
            this.f1579t.measure(getChildMeasureSpec(i, 0, -1), getChildMeasureSpec(i2, 0, -2));
            setMeasuredDimension(this.f1579t.getMeasuredWidth(), this.f1567h * 5);
        }
    }

    public final boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1559F = accessibilityEvent.getEventType();
        return super.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1563d == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (getChildCount() > 0) {
                ((TextView) getChildAt(2)).setTextColor(this.f1580u != null ? this.f1580u.f1590a : ViewCompat.MEASURED_STATE_MASK);
            }
        }
        if (this.f1574o && action == 0) {
            this.f1575p = true;
            return true;
        }
        boolean onTouchEvent = this.f1561b.onTouchEvent(motionEvent);
        if (onTouchEvent || action != 2) {
            if (!onTouchEvent && action == 1) {
                if (!this.f1572m && !this.f1569j) {
                    if (this.f1560a != 0) {
                        m1428e();
                    }
                    this.f1568i = -1;
                } else if (this.f1574o) {
                    return true;
                } else {
                    this.f1574o = true;
                    this.f1562c.startScroll(0, 0, 0, this.f1560a);
                    this.f1558E.sendEmptyMessage(1732);
                    this.f1560a = 0;
                }
                this.f1583x = 0.0f;
                if (this.f1581v != -1) {
                    ((TextView) getChildAt(2)).setTextColor(this.f1581v);
                }
            }
            return true;
        }
        float y = motionEvent.getY();
        if (this.f1583x != 0.0f) {
            m1412a((float) Math.round(this.f1583x - y));
        }
        this.f1583x = y;
        return true;
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (!isEnabled()) {
            return false;
        }
        this.f1569j = false;
        this.f1572m = false;
        switch (i) {
            case AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD /*4096*/:
                if (this.f1559F != AccessibilityNodeInfoCompat.ACTION_PASTE) {
                    return false;
                }
                m1412a((float) (this.f1567h * 5));
                return true;
            case AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD /*8192*/:
                if (this.f1559F != AccessibilityNodeInfoCompat.ACTION_PASTE) {
                    return false;
                }
                m1412a((float) ((-this.f1567h) * 5));
                return true;
            default:
                return false;
        }
    }
}
