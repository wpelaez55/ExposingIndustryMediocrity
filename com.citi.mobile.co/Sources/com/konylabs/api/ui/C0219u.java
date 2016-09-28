package com.konylabs.api.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.konylabs.android.KonyMain;
import ny0k.aI;

/* renamed from: com.konylabs.api.ui.u */
public final class C0219u extends FrameLayout {
    private long f1608a;
    private Scroller f1609b;
    private int f1610c;
    private float f1611d;
    private float f1612e;
    private boolean f1613f;
    private VelocityTracker f1614g;
    private int f1615h;
    private int f1616i;
    private boolean f1617j;
    private MotionEvent f1618k;
    private int f1619l;
    private boolean f1620m;
    private boolean f1621n;
    private float f1622o;
    private boolean f1623p;
    private View f1624q;
    private float f1625r;
    private boolean f1626s;
    private View f1627t;
    private View f1628u;
    private boolean f1629v;

    public C0219u(Context context) {
        this(context, null);
    }

    private C0219u(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private C0219u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f1610c = 1;
        this.f1613f = false;
        this.f1617j = false;
        this.f1619l = 0;
        this.f1623p = true;
        this.f1624q = null;
        this.f1626s = true;
        this.f1627t = null;
        this.f1628u = null;
        this.f1629v = true;
        this.f1609b = new Scroller(getContext());
        setFocusable(true);
        setDescendantFocusability(AccessibilityNodeInfoCompat.ACTION_EXPAND);
        setWillNotDraw(false);
        Context context2 = getContext();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        int i2 = context2.getResources().getDisplayMetrics().densityDpi;
        context2.getResources().getDisplayMetrics();
        if (i2 > 320) {
            this.f1615h = (int) (((double) viewConfiguration.getScaledTouchSlop()) * 0.5d);
        } else {
            context2.getResources().getDisplayMetrics();
            if (i2 <= 320) {
                context2.getResources().getDisplayMetrics();
                if (i2 > 240) {
                    this.f1615h = (int) (((double) viewConfiguration.getScaledTouchSlop()) * 0.4d);
                }
            }
            this.f1615h = (int) (((double) viewConfiguration.getScaledTouchSlop()) * 0.3d);
        }
        this.f1616i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1625r = (float) getScrollX();
        if (KonyMain.f3656d <= 19 || KonyMain.f3656d >= 21) {
            try {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16842851, 16842852, 16842853, 16842879, 16842856, 16842857, 16843433, 16843432, 16842974, 16842879, 16842854, 16842855, 16843099, 16843006, 16842880, 16843434});
                initializeScrollbars(obtainStyledAttributes);
                obtainStyledAttributes.recycle();
            } catch (ArrayIndexOutOfBoundsException e) {
                if (KonyMain.f3657e) {
                    Log.d("Kony2dScrollView", "Something unecpected happend with intializing scrollbars received arrayindex exception");
                }
            } catch (Exception e2) {
                if (KonyMain.f3657e) {
                    Log.d("Kony2dScrollView", "Something unecpected happend with intializing scrollbars received exception");
                }
            }
        }
    }

    private int m1570a() {
        return getChildCount() > 0 ? Math.max(0, getChildAt(0).getWidth() - ((getWidth() - getPaddingLeft()) - getPaddingRight())) : 0;
    }

    private static int m1571a(int i, int i2, int i3) {
        return (i2 >= i3 || i < 0) ? 0 : i2 + i > i3 ? i3 - i2 : i;
    }

    private View m1572a(View view) {
        View view2 = null;
        int i = 0;
        while (i < ((ViewGroup) view).getChildCount() && view2 == null) {
            View childAt = ((ViewGroup) view).getChildAt(i);
            if (childAt instanceof C0219u) {
                return childAt;
            }
            i++;
            view2 = childAt instanceof ViewGroup ? m1572a(childAt) : view2;
        }
        return view2;
    }

    private View m1573a(View view, Rect rect, int i, int i2) {
        int i3 = 0;
        View childAt = ((ViewGroup) view).getChildAt(0);
        View view2 = null;
        while (i3 < ((ViewGroup) childAt).getChildCount()) {
            View childAt2 = ((ViewGroup) childAt).getChildAt(i3);
            Rect rect2 = new Rect();
            childAt2.getHitRect(rect2);
            if (rect2.contains(i, i2)) {
                if (childAt2 instanceof C0219u) {
                    childAt2 = m1573a(childAt2, rect, i, i2);
                } else {
                    childAt2 = m1572a(childAt2);
                    if (childAt2 != null) {
                        childAt2 = m1573a(childAt2, rect, i, i2);
                    }
                }
                i3++;
                view2 = childAt2;
            }
            childAt2 = view2;
            i3++;
            view2 = childAt2;
        }
        return view2 != null ? view2 : view;
    }

    private static boolean m1574a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && C0219u.m1574a((View) parent, view2);
    }

    private int m1575b() {
        return getChildCount() > 0 ? Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop())) : 0;
    }

    private void m1576b(View view) {
        int i;
        int width;
        int i2;
        int horizontalFadingEdgeLength;
        int i3 = 0;
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (getChildCount() == 0) {
            i = 0;
        } else {
            width = getWidth();
            i = getScrollX();
            i2 = i + width;
            horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
            if (rect.left > 0) {
                i += horizontalFadingEdgeLength;
            }
            if (rect.right < getChildAt(0).getWidth()) {
                i2 -= horizontalFadingEdgeLength;
            }
            if (rect.right > i2 && rect.left > i) {
                i = Math.min(rect.width() > width ? (rect.left - i) + 0 : (rect.right - i2) + 0, getChildAt(0).getRight() - i2);
            } else if (rect.left >= i || rect.right >= i2) {
                i = 0;
            } else {
                i = Math.max(rect.width() > width ? 0 - (i2 - rect.right) : 0 - (i - rect.left), -getScrollX());
            }
        }
        if (getChildCount() != 0) {
            horizontalFadingEdgeLength = getHeight();
            i2 = getScrollY();
            width = i2 + horizontalFadingEdgeLength;
            int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
            if (rect.top > 0) {
                i2 += verticalFadingEdgeLength;
            }
            if (rect.bottom < getChildAt(0).getHeight()) {
                width -= verticalFadingEdgeLength;
            }
            if (rect.bottom > width && rect.top > i2) {
                i3 = Math.min(rect.height() > horizontalFadingEdgeLength ? (rect.top - i2) + 0 : (rect.bottom - width) + 0, getChildAt(0).getBottom() - width);
            } else if (rect.top < i2 && rect.bottom < width) {
                i3 = Math.max(rect.height() > horizontalFadingEdgeLength ? 0 - (width - rect.bottom) : 0 - (i2 - rect.top), -getScrollY());
            }
        }
        if (i != 0 || i3 != 0) {
            scrollBy(i, i3);
        }
    }

    public final void m1577a(int i) {
        this.f1610c = i;
        switch (this.f1610c) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                setVerticalScrollBarEnabled(false);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                setHorizontalScrollBarEnabled(false);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                setVerticalScrollBarEnabled(false);
                setHorizontalScrollBarEnabled(false);
                setFadingEdgeLength(0);
            default:
        }
    }

    public final void m1578a(int i, int i2) {
        int scrollX = i - getScrollX();
        int scrollY = i2 - getScrollY();
        if (scrollX != 0 || scrollY != 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f1608a;
            if (currentAnimationTimeMillis > 250) {
                this.f1609b.startScroll(getScrollX(), getScrollY(), scrollX, scrollY, (int) Math.min(currentAnimationTimeMillis, 600));
                postInvalidateDelayed(10);
            } else {
                if (!this.f1609b.isFinished()) {
                    this.f1609b.abortAnimation();
                }
                scrollBy(scrollX, scrollY);
            }
            this.f1608a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void m1579a(boolean z) {
        this.f1617j = z;
    }

    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("Kony2DScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("Kony2DScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("Kony2DScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public final void addView(View view, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("Kony2DScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public final void m1580b(boolean z) {
        this.f1629v = z;
    }

    public final void m1581c(boolean z) {
        this.f1623p = false;
    }

    protected final int computeHorizontalScrollRange() {
        return getChildCount() == 0 ? getWidth() : getChildAt(0).getRight();
    }

    public final void computeScroll() {
        if (this.f1609b.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f1609b.getCurrX();
            int currY = this.f1609b.getCurrY();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                scrollTo(C0219u.m1571a(currX, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth()), C0219u.m1571a(currY, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight()));
            } else {
                scrollTo(currX, currY);
            }
            if (!(scrollX == getScrollX() && scrollY == getScrollY())) {
                onScrollChanged(getScrollX(), getScrollY(), scrollX, scrollY);
            }
            postInvalidate();
        } else if (!this.f1623p && this.f1617j) {
            if (((float) getScrollX()) != this.f1625r) {
                if (getScrollX() == 0) {
                    if (getParent() != null && (getParent() instanceof aI)) {
                        ((aI) getParent()).m1913a();
                    }
                } else if (getScrollX() + getMeasuredWidth() == getChildAt(0).getMeasuredWidth() && getParent() != null && (getParent() instanceof aI)) {
                    ((aI) getParent()).m1920b();
                }
                this.f1619l = getScrollX() / getWidth();
            }
            this.f1625r = (float) getScrollX();
        }
    }

    protected final int computeVerticalScrollRange() {
        return getChildCount() == 0 ? getHeight() : getChildAt(0).getBottom();
    }

    public final void m1582d(boolean z) {
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1618k = motionEvent;
            int x = ((int) motionEvent.getX()) + getScrollX();
            int y = ((int) motionEvent.getY()) + getScrollY();
            Rect rect = new Rect();
            getHitRect(rect);
            this.f1624q = m1573a(this, rect, x, y);
        }
        if (action == 1 || action == 3) {
            this.f1618k = null;
            this.f1628u = null;
        }
        if (action != 2) {
            return super.dispatchTouchEvent(motionEvent);
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (dispatchTouchEvent || this.f1618k == null) {
            return dispatchTouchEvent;
        }
        boolean dispatchTouchEvent2;
        this.f1618k = null;
        action = (int) Math.abs(motionEvent.getX() - this.f1612e);
        x = (int) Math.abs(motionEvent.getY() - this.f1611d);
        if ((action > x && this.f1610c == 2) || ((x > action && this.f1610c == 1) || this.f1610c == 4 || !this.f1629v)) {
            int x2 = ((int) motionEvent.getX()) + getScrollX();
            int y2 = ((int) motionEvent.getY()) + getScrollY();
            View childAt = getChildAt(0);
            if (this.f1628u == null) {
                for (y = 0; y < ((ViewGroup) childAt).getChildCount(); y++) {
                    View childAt2 = ((ViewGroup) childAt).getChildAt(y);
                    Rect rect2 = new Rect();
                    childAt2.getHitRect(rect2);
                    if (rect2.contains(x2, y2)) {
                        if (KonyMain.f3657e) {
                            Log.d("Kony2dScrollView", "Sending to child to see if this can handle the event --" + childAt2);
                        }
                        this.f1628u = childAt2;
                        motionEvent.setAction(2);
                    }
                }
            }
            if (this.f1628u != null) {
                dispatchTouchEvent2 = ((ViewGroup) this.f1628u).dispatchTouchEvent(motionEvent);
                if (!this.f1623p || r0) {
                    if (this.f1624q != null || this.f1624q == this) {
                        dispatchTouchEvent2 = dispatchTouchEvent;
                    } else {
                        if (KonyMain.f3657e) {
                            Log.d("Kony2dScrollView", "Sending to parent 2d as this is not able to handle");
                        }
                        this.f1624q = null;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        dispatchTouchEvent2 = dispatchTouchEvent(motionEvent);
                    }
                    return dispatchTouchEvent2;
                }
                motionEvent.setAction(2);
                getParent().requestDisallowInterceptTouchEvent(false);
                return ((View) getParent()).dispatchTouchEvent(motionEvent);
            }
        }
        dispatchTouchEvent2 = false;
        if (this.f1623p) {
        }
        if (this.f1624q != null) {
        }
        dispatchTouchEvent2 = dispatchTouchEvent;
        return dispatchTouchEvent2;
    }

    protected final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        return bottom < verticalFadingEdgeLength ? ((float) bottom) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    protected final float getLeftFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        return getScrollX() < horizontalFadingEdgeLength ? ((float) getScrollX()) / ((float) horizontalFadingEdgeLength) : 1.0f;
    }

    protected final float getRightFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int right = (getChildAt(0).getRight() - getScrollX()) - (getWidth() - getPaddingRight());
        return right < horizontalFadingEdgeLength ? ((float) right) / ((float) horizontalFadingEdgeLength) : 1.0f;
    }

    protected final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        return getScrollY() < verticalFadingEdgeLength ? ((float) getScrollY()) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    protected final void measureChild(View view, int i, int i2) {
        int makeMeasureSpec;
        int i3 = 0;
        LayoutParams layoutParams = view.getLayoutParams();
        if (this.f1610c == 4 || this.f1610c == 1) {
            int childMeasureSpec = C0219u.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), layoutParams.height);
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            i3 = childMeasureSpec;
        } else if (this.f1610c == 2) {
            i3 = MeasureSpec.makeMeasureSpec(0, 0);
            makeMeasureSpec = C0219u.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutParams.width);
        } else if (this.f1610c == 3) {
            i3 = C0219u.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), layoutParams.height);
            makeMeasureSpec = C0219u.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutParams.width);
        } else {
            makeMeasureSpec = 0;
        }
        view.measure(makeMeasureSpec, i3);
    }

    protected final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = 0;
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec;
        if (this.f1610c == 4 || this.f1610c == 1) {
            childMeasureSpec = C0219u.getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height);
            i6 = MeasureSpec.makeMeasureSpec(marginLayoutParams.rightMargin + marginLayoutParams.leftMargin, 0);
            i5 = childMeasureSpec;
        } else if (this.f1610c == 2) {
            childMeasureSpec = C0219u.getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width);
            i5 = MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0);
            i6 = childMeasureSpec;
        } else if (this.f1610c == 3) {
            int childMeasureSpec2 = C0219u.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), marginLayoutParams.height);
            i6 = C0219u.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), marginLayoutParams.width);
            i5 = childMeasureSpec2;
        } else {
            i5 = 0;
        }
        view.measure(i6, i5);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean z = true;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (this.f1610c == 2) {
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (m1575b() <= 0) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(getScrollX());
            accessibilityEvent.setScrollY(getScrollY());
            accessibilityEvent.setMaxScrollX(getScrollX());
            accessibilityEvent.setMaxScrollY(m1575b());
        } else if (this.f1610c == 1) {
            accessibilityEvent.setClassName(HorizontalScrollView.class.getName());
            if (m1570a() <= 0) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(getScrollX());
            accessibilityEvent.setScrollY(getScrollY());
            accessibilityEvent.setMaxScrollX(m1570a());
            accessibilityEvent.setMaxScrollY(getScrollY());
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!isEnabled()) {
            return;
        }
        int b;
        if (this.f1610c == 2) {
            accessibilityNodeInfo.setClassName(ScrollView.class.getName());
            b = m1575b();
            if (b > 0) {
                accessibilityNodeInfo.setScrollable(true);
                if (getScrollY() > 0) {
                    accessibilityNodeInfo.addAction(AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD);
                }
                if (getScrollY() < b) {
                    accessibilityNodeInfo.addAction(AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD);
                }
            }
        } else if (this.f1610c == 1) {
            b = m1570a();
            accessibilityNodeInfo.setClassName(HorizontalScrollView.class.getName());
            if (b > 0) {
                accessibilityNodeInfo.setScrollable(true);
                if (isEnabled() && getScrollX() > 0) {
                    accessibilityNodeInfo.addAction(AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD);
                }
                if (isEnabled() && getScrollX() < b) {
                    accessibilityNodeInfo.addAction(AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD);
                }
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f1613f) {
            return true;
        }
        ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        switch (action) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                this.f1611d = y;
                this.f1612e = x;
                this.f1622o = x;
                this.f1613f = !this.f1609b.isFinished();
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                int abs = (int) Math.abs(y - this.f1611d);
                action = (int) Math.abs(x - this.f1612e);
                if (abs > this.f1615h || action > this.f1615h) {
                    this.f1613f = true;
                }
                if ((action > abs && this.f1610c == 2 && action > this.f1615h) || ((abs > action && this.f1610c == 1 && abs > this.f1615h) || this.f1610c == 4 || !this.f1629v)) {
                    ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(false);
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                this.f1613f = false;
                break;
        }
        return this.f1613f;
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1626s = false;
        if (this.f1627t != null && C0219u.m1574a(this.f1627t, (View) this)) {
            m1576b(this.f1627t);
        }
        this.f1627t = null;
        scrollTo(getScrollX(), getScrollY());
    }

    protected final void onMeasure(int i, int i2) {
        int i3 = 0;
        super.onMeasure(i, i2);
        View childAt = getChildAt(0);
        if (childAt != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (this.f1610c == 1 || this.f1610c == 4) {
                if (MeasureSpec.getMode(i) != 0 && getChildCount() > 0 && childAt.getMeasuredWidth() < measuredWidth) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((measuredWidth - getPaddingLeft()) - getPaddingRight(), 1073741824), C0219u.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).height));
                }
            } else if (this.f1610c == 2) {
                if (MeasureSpec.getMode(i2) != 0 && getChildCount() > 0 && childAt.getMeasuredHeight() < measuredHeight) {
                    childAt.measure(C0219u.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
                }
            } else if (this.f1610c == 3 && MeasureSpec.getMode(i) != 0 && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
                int makeMeasureSpec = childAt.getMeasuredWidth() < measuredWidth ? MeasureSpec.makeMeasureSpec((measuredWidth - getPaddingLeft()) - getPaddingRight(), 1073741824) : 0;
                if (childAt.getMeasuredHeight() < measuredHeight) {
                    i3 = MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824);
                }
                childAt.measure(makeMeasureSpec, i3);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        int abs;
        int abs2;
        if (motionEvent.getAction() == 2 && getParent() != null) {
            abs = (int) Math.abs(motionEvent.getY() - this.f1611d);
            abs2 = (int) Math.abs(motionEvent.getX() - this.f1612e);
            if ((abs2 > abs && this.f1610c == 2 && abs2 > this.f1615h) || ((abs > abs2 && this.f1610c == 1 && abs > this.f1615h) || this.f1610c == 4 || !this.f1629v)) {
                ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(false);
                if (!this.f1617j) {
                    return false;
                }
                if (KonyMain.f3657e) {
                    Log.d("Kony2dScrollView", "Scrolling in wrong direction sending to parent");
                }
                m1578a(getWidth() * this.f1619l, 0);
                if (!KonyMain.f3657e) {
                    return false;
                }
                Log.d("Kony2dScrollView", this + "******mActiveFeature in touch move when sending to parent is ******" + this.f1619l);
                return false;
            } else if (abs > this.f1615h && abs > abs2) {
                motionEvent.getY();
                r0 = getChildAt(0);
                if (r0 != null) {
                    r0 = getHeight() <= (r0.getHeight() + getPaddingTop()) + getPaddingBottom();
                } else {
                    r0 = false;
                }
                if (r0 || !(getScrollY() + getMeasuredHeight() == getChildAt(0).getMeasuredHeight() || getScrollY() == 0)) {
                    this.f1620m = true;
                    this.f1621n = false;
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return false;
                }
            } else if (abs2 > this.f1615h && abs2 > abs) {
                motionEvent.getX();
                r0 = getChildAt(0);
                if (r0 != null) {
                    r0 = getWidth() <= (r0.getWidth() + getPaddingLeft()) + getPaddingRight();
                } else {
                    r0 = false;
                }
                if (r0 || !(getScrollX() + getMeasuredWidth() == getChildAt(0).getMeasuredWidth() || getScrollX() == 0)) {
                    this.f1621n = true;
                    this.f1620m = false;
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return false;
                }
            } else if (!this.f1617j) {
                this.f1621n = false;
                this.f1620m = false;
            }
        }
        if (this.f1614g == null) {
            this.f1614g = VelocityTracker.obtain();
        }
        this.f1614g.addMovement(motionEvent);
        abs = motionEvent.getAction();
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        switch (abs) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (!(this.f1609b.isFinished() || this.f1610c == 4)) {
                    this.f1609b.abortAnimation();
                }
                this.f1611d = y;
                this.f1612e = x;
                this.f1622o = x;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (this.f1617j) {
                    if (!this.f1620m && this.f1621n) {
                        abs = getScrollX();
                        abs2 = getWidth();
                        this.f1619l = abs / abs2;
                        abs = (int) (x - this.f1622o);
                        if (((double) Math.abs(abs)) > 0.3d * ((double) abs2)) {
                            if (abs < 0) {
                                this.f1619l++;
                            }
                        } else if (abs > 0) {
                            this.f1619l++;
                        }
                        m1578a(this.f1619l * abs2, 0);
                        if (KonyMain.f3657e) {
                            Log.d("Kony2dScrollView", this + "******mActiveFeature in touch up is ******" + this.f1619l);
                            break;
                        }
                    }
                }
                VelocityTracker velocityTracker = this.f1614g;
                velocityTracker.computeCurrentVelocity(1000);
                abs2 = (int) velocityTracker.getXVelocity();
                abs = (int) velocityTracker.getYVelocity();
                if (Math.abs(abs2) + Math.abs(abs) > this.f1616i && getChildCount() > 0) {
                    int i = -abs2;
                    int i2 = -abs;
                    switch (this.f1610c) {
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                            i2 = 0;
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                            i = 0;
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                            i2 = 0;
                            i = 0;
                            break;
                    }
                    if (getChildCount() > 0) {
                        this.f1609b.fling(getScrollX(), getScrollY(), i, i2, 0, getChildAt(0).getWidth() - ((getWidth() - getPaddingRight()) - getPaddingLeft()), 0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                        invalidate();
                    }
                }
                if (this.f1614g != null) {
                    this.f1614g.recycle();
                    this.f1614g = null;
                    break;
                }
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                int right;
                abs2 = (int) (this.f1612e - x);
                abs = (int) (this.f1611d - y);
                this.f1612e = x;
                this.f1611d = y;
                if (abs2 >= 0 || getScrollX() >= 0) {
                    if (abs2 > 0) {
                        right = (getChildAt(0).getRight() - getScrollX()) - (getWidth() - getPaddingRight());
                        if (right > 0) {
                            abs2 = Math.min(right, abs2);
                        }
                    }
                    if (abs >= 0 || getScrollY() >= 0) {
                        if (abs > 0) {
                            right = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
                            if (right > 0) {
                                abs = Math.min(right, abs);
                            }
                        }
                        if (!(abs == 0 && r1 == 0)) {
                            switch (this.f1610c) {
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                    abs = 0;
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                                    abs2 = 0;
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                                    abs = 0;
                                    abs2 = 0;
                                    break;
                            }
                            scrollBy(abs2, abs);
                            break;
                        }
                    }
                    abs = 0;
                    switch (this.f1610c) {
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                            abs = 0;
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                            abs2 = 0;
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                            abs = 0;
                            abs2 = 0;
                            break;
                    }
                    scrollBy(abs2, abs);
                }
                abs2 = 0;
                if (abs > 0) {
                    right = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
                    if (right > 0) {
                        abs = Math.min(right, abs);
                    }
                    abs = 0;
                }
                switch (this.f1610c) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        abs = 0;
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        abs2 = 0;
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        abs = 0;
                        abs2 = 0;
                        break;
                }
                scrollBy(abs2, abs);
        }
        if ((motionEvent.getAction() == 2 || motionEvent.getAction() == 1) && getParent() != null) {
            if (this.f1620m && (getScrollY() + getMeasuredHeight() == getChildAt(0).getMeasuredHeight() || getScrollY() == 0)) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                super.onStartTemporaryDetach();
                return false;
            } else if (this.f1621n && (getScrollX() + getMeasuredWidth() == getChildAt(0).getMeasuredWidth() || getScrollX() == 0)) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                super.onStartTemporaryDetach();
                return false;
            }
        }
        return true;
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (!isEnabled()) {
            return false;
        }
        int min;
        switch (i) {
            case AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD /*4096*/:
                if (this.f1610c == 2) {
                    min = Math.min(((getHeight() - getPaddingBottom()) - getPaddingTop()) + getScrollY(), m1575b());
                    if (min != getScrollY()) {
                        m1578a(0, min);
                        return true;
                    }
                } else if (this.f1610c == 1) {
                    min = Math.min(((getWidth() - getPaddingLeft()) - getPaddingRight()) + getScrollX(), m1570a());
                    if (min != getScrollX()) {
                        m1578a(min, 0);
                        return true;
                    }
                }
                return false;
            case AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD /*8192*/:
                if (this.f1610c == 2) {
                    min = Math.max(getScrollY() - ((getHeight() - getPaddingBottom()) - getPaddingTop()), 0);
                    if (min != getScrollY()) {
                        m1578a(0, min);
                        return true;
                    }
                } else if (this.f1610c == 1) {
                    min = Math.max(0, getScrollX() - ((getWidth() - getPaddingLeft()) - getPaddingRight()));
                    if (min != getScrollX()) {
                        m1578a(min, 0);
                        return true;
                    }
                }
                return false;
            default:
                return false;
        }
    }

    public final void requestChildFocus(View view, View view2) {
        if (this.f1626s) {
            this.f1627t = view2;
        } else {
            m1576b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final void requestLayout() {
        this.f1626s = true;
        super.requestLayout();
    }

    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int a = C0219u.m1571a(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int a2 = C0219u.m1571a(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (a != getScrollX() || a2 != getScrollY()) {
                super.scrollTo(a, a2);
            }
        }
    }
}
