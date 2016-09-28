package ny0k;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.konylabs.android.KonyMain;

final class bw extends ViewPager {
    private int f3429a;
    private int f3430b;
    private boolean f3431c;
    private int f3432d;
    private int f3433e;
    private /* synthetic */ Context f3434f;
    private /* synthetic */ bv f3435g;

    bw(bv bvVar, Context context, Context context2) {
        this.f3435g = bvVar;
        this.f3434f = context2;
        super(context);
        this.f3431c = false;
        this.f3432d = ViewConfiguration.get(this.f3434f).getScaledTouchSlop();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object e;
        boolean z = true;
        boolean onInterceptTouchEvent;
        try {
            int action = motionEvent.getAction();
            if (action == 0 || action == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if (action == 0) {
                try {
                    this.f3431c = false;
                    this.f3429a = (int) motionEvent.getX();
                    this.f3430b = (int) motionEvent.getY();
                    return onInterceptTouchEvent;
                } catch (Exception e2) {
                    e = e2;
                    if (KonyMain.f3657e) {
                        return onInterceptTouchEvent;
                    }
                    Log.d("KonySegUIPageView", " Exception -- " + e);
                    return onInterceptTouchEvent;
                }
            }
            if (action == 2) {
                action = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (!this.f3431c) {
                    y = Math.abs(y - this.f3430b);
                    action = Math.abs(action - this.f3429a);
                    if (action > y && action > this.f3432d) {
                        this.f3431c = true;
                        return z;
                    }
                }
            }
            z = onInterceptTouchEvent;
            return z;
        } catch (Exception e3) {
            Exception exception = e3;
            onInterceptTouchEvent = true;
            e = exception;
            if (KonyMain.f3657e) {
                return onInterceptTouchEvent;
            }
            Log.d("KonySegUIPageView", " Exception -- " + e);
            return onInterceptTouchEvent;
        }
    }

    protected final void onMeasure(int i, int i2) {
        if (this.f3433e != 0) {
            i2 = MeasureSpec.makeMeasureSpec(this.f3433e, 1073741824);
        }
        super.onMeasure(i, i2);
        if (!this.f3435g.f3408I && this.f3435g.f3410h.height == -2 && this.f3433e == 0) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                childAt = ((ViewGroup) childAt).getChildAt(0);
            }
            if (childAt != null) {
                childAt.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
                this.f3433e = childAt.getMeasuredHeight();
            }
            setMeasuredDimension(getMeasuredWidth(), getDefaultSize(this.f3433e, MeasureSpec.makeMeasureSpec(this.f3433e, 0)));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        try {
            z = super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                Log.d("KonySegUIPageView", " Exception -- " + e);
            }
        }
        return z;
    }
}
