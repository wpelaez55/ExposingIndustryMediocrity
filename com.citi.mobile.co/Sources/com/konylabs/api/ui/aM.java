package com.konylabs.api.ui;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.konylabs.android.KonyMain;

public final class aM extends GestureDetector {
    private static final int f478f;
    private static final int f479g;
    private static final int f480h;
    private int f481a;
    private int f482b;
    private int f483c;
    private int f484d;
    private int f485e;
    private final Handler f486i;
    private final OnGestureListener f487j;
    private OnDoubleTapListener f488k;
    private boolean f489l;
    private boolean f490m;
    private boolean f491n;
    private boolean f492o;
    private MotionEvent f493p;
    private MotionEvent f494q;
    private boolean f495r;
    private float f496s;
    private float f497t;
    private float f498u;
    private float f499v;
    private boolean f500w;
    private VelocityTracker f501x;
    private int f502y;

    static {
        f478f = ViewConfiguration.getLongPressTimeout();
        f479g = ViewConfiguration.getTapTimeout();
        f480h = ViewConfiguration.getDoubleTapTimeout();
    }

    private aM(Context context, OnGestureListener onGestureListener, Handler handler, byte b) {
        super(context, onGestureListener, handler);
        this.f502y = 2;
        if (handler != null) {
            this.f486i = new aN(this, handler);
        } else {
            this.f486i = new aN(this);
        }
        this.f487j = onGestureListener;
        if (onGestureListener instanceof OnDoubleTapListener) {
            setOnDoubleTapListener((OnDoubleTapListener) onGestureListener);
        }
        if (this.f487j == null) {
            throw new NullPointerException("OnGestureListener must not be null");
        }
        Context appContext = KonyMain.getAppContext();
        this.f500w = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(appContext);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
        this.f484d = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f485e = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f481a = scaledTouchSlop * scaledTouchSlop;
        this.f482b = scaledTouchSlop * scaledTouchSlop;
        this.f483c = scaledDoubleTapSlop * scaledDoubleTapSlop;
    }

    public aM(OnGestureListener onGestureListener) {
        this(null, onGestureListener, null, (byte) 0);
    }

    static /* synthetic */ void m508c(aM aMVar) {
        aMVar.f486i.removeMessages(3);
        aMVar.f490m = true;
        aMVar.f487j.onLongPress(aMVar.f493p);
    }

    public final void m511a(int i) {
        this.f502y = i;
    }

    public final boolean isLongpressEnabled() {
        return this.f500w;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float f = 0.0f;
        int action = motionEvent.getAction();
        if (this.f501x == null) {
            this.f501x = VelocityTracker.obtain();
        }
        this.f501x.addMovement(motionEvent);
        boolean z = (action & MotionEventCompat.ACTION_MASK) == 6;
        int actionIndex = z ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f2 = 0.0f;
        for (i = 0; i < pointerCount; i++) {
            if (actionIndex != i) {
                f2 += motionEvent.getX(i);
                f += motionEvent.getY(i);
            }
        }
        actionIndex = z ? pointerCount - 1 : pointerCount;
        f2 /= (float) actionIndex;
        f /= (float) actionIndex;
        float f3;
        boolean onScroll;
        switch (action & MotionEventCompat.ACTION_MASK) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                this.f496s = f2;
                this.f498u = f2;
                this.f497t = f;
                this.f499v = f;
                return false;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (this.f490m) {
                    return false;
                }
                f3 = this.f496s - f2;
                float f4 = this.f497t - f;
                if (this.f495r) {
                    return this.f488k.onDoubleTapEvent(motionEvent) | 0;
                }
                if (this.f491n) {
                    i = (int) (f2 - this.f498u);
                    int i2 = (int) (f - this.f499v);
                    i = (i * i) + (i2 * i2);
                    if (i > this.f481a) {
                        onScroll = this.f487j.onScroll(this.f493p, motionEvent, f3, f4);
                        this.f496s = f2;
                        this.f497t = f;
                        this.f491n = false;
                        this.f486i.removeMessages(3);
                        this.f486i.removeMessages(1);
                        this.f486i.removeMessages(2);
                    } else {
                        onScroll = false;
                    }
                    if (i > this.f482b) {
                        this.f492o = false;
                    }
                    return onScroll;
                } else if (Math.abs(f3) < 1.0f && Math.abs(f4) < 1.0f) {
                    return false;
                } else {
                    boolean onScroll2 = this.f487j.onScroll(this.f493p, motionEvent, f3, f4);
                    this.f496s = f2;
                    this.f497t = f;
                    return onScroll2;
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                this.f486i.removeMessages(1);
                this.f486i.removeMessages(2);
                this.f486i.removeMessages(3);
                this.f501x.recycle();
                this.f501x = null;
                this.f495r = false;
                this.f489l = false;
                this.f491n = false;
                this.f492o = false;
                if (!this.f490m) {
                    return false;
                }
                this.f490m = false;
                return false;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                if (this.f488k != null) {
                    onScroll = this.f486i.hasMessages(3);
                    if (onScroll) {
                        this.f486i.removeMessages(3);
                    }
                    if (!(this.f493p == null || this.f494q == null || !onScroll)) {
                        MotionEvent motionEvent2 = this.f493p;
                        MotionEvent motionEvent3 = this.f494q;
                        if (this.f492o && motionEvent.getEventTime() - motionEvent3.getEventTime() <= ((long) f480h)) {
                            i = ((int) motionEvent2.getX()) - ((int) motionEvent.getX());
                            actionIndex = ((int) motionEvent2.getY()) - ((int) motionEvent.getY());
                            if ((actionIndex * actionIndex) + (i * i) < this.f483c) {
                                onScroll = true;
                                if (onScroll && pointerCount == this.f502y) {
                                    this.f495r = true;
                                    actionIndex = (this.f488k.onDoubleTap(this.f493p) | 0) | this.f488k.onDoubleTapEvent(motionEvent);
                                    this.f496s = f2;
                                    this.f498u = f2;
                                    this.f497t = f;
                                    this.f499v = f;
                                    if (this.f493p != null) {
                                        this.f493p.recycle();
                                    }
                                    this.f493p = MotionEvent.obtain(motionEvent);
                                    this.f491n = true;
                                    this.f492o = true;
                                    this.f489l = true;
                                    this.f490m = false;
                                    if (this.f500w && pointerCount == this.f502y) {
                                        this.f486i.removeMessages(2);
                                        this.f486i.sendEmptyMessageAtTime(2, (this.f493p.getDownTime() + ((long) f479g)) + ((long) f478f));
                                    }
                                    this.f486i.sendEmptyMessageAtTime(1, this.f493p.getDownTime() + ((long) f479g));
                                    return actionIndex | this.f487j.onDown(motionEvent);
                                }
                            }
                        }
                        onScroll = false;
                        this.f495r = true;
                        actionIndex = (this.f488k.onDoubleTap(this.f493p) | 0) | this.f488k.onDoubleTapEvent(motionEvent);
                        this.f496s = f2;
                        this.f498u = f2;
                        this.f497t = f;
                        this.f499v = f;
                        if (this.f493p != null) {
                            this.f493p.recycle();
                        }
                        this.f493p = MotionEvent.obtain(motionEvent);
                        this.f491n = true;
                        this.f492o = true;
                        this.f489l = true;
                        this.f490m = false;
                        this.f486i.removeMessages(2);
                        this.f486i.sendEmptyMessageAtTime(2, (this.f493p.getDownTime() + ((long) f479g)) + ((long) f478f));
                        this.f486i.sendEmptyMessageAtTime(1, this.f493p.getDownTime() + ((long) f479g));
                        return actionIndex | this.f487j.onDown(motionEvent);
                    }
                    if (pointerCount == this.f502y) {
                        this.f486i.sendEmptyMessageDelayed(3, (long) f480h);
                    }
                }
                actionIndex = 0;
                this.f496s = f2;
                this.f498u = f2;
                this.f497t = f;
                this.f499v = f;
                if (this.f493p != null) {
                    this.f493p.recycle();
                }
                this.f493p = MotionEvent.obtain(motionEvent);
                this.f491n = true;
                this.f492o = true;
                this.f489l = true;
                this.f490m = false;
                this.f486i.removeMessages(2);
                this.f486i.sendEmptyMessageAtTime(2, (this.f493p.getDownTime() + ((long) f479g)) + ((long) f478f));
                this.f486i.sendEmptyMessageAtTime(1, this.f493p.getDownTime() + ((long) f479g));
                return actionIndex | this.f487j.onDown(motionEvent);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                this.f489l = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                if (this.f495r) {
                    if (pointerCount == this.f502y) {
                        onScroll = this.f488k.onDoubleTapEvent(motionEvent) | 0;
                    }
                    onScroll = false;
                } else if (this.f490m) {
                    this.f486i.removeMessages(3);
                    this.f490m = false;
                    onScroll = false;
                } else if (this.f491n) {
                    if (pointerCount == this.f502y) {
                        onScroll = this.f487j.onSingleTapUp(motionEvent);
                    }
                    onScroll = false;
                } else {
                    VelocityTracker velocityTracker = this.f501x;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f485e);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    f3 = velocityTracker.getXVelocity(pointerId);
                    if ((Math.abs(yVelocity) > ((float) this.f484d) || Math.abs(f3) > ((float) this.f484d)) && pointerCount == this.f502y) {
                        onScroll = this.f487j.onFling(this.f493p, motionEvent, f3, yVelocity);
                        if (KonyMain.f3657e) {
                            Log.d("KonyGestureDetector", "The number of fingers are " + motionEvent.getPointerCount());
                        }
                    }
                    onScroll = false;
                }
                if (this.f494q != null) {
                    this.f494q.recycle();
                }
                this.f494q = obtain;
                if (this.f501x != null) {
                    this.f501x.recycle();
                    this.f501x = null;
                }
                this.f495r = false;
                this.f486i.removeMessages(1);
                this.f486i.removeMessages(2);
                return onScroll;
            default:
                return false;
        }
    }

    public final void setIsLongpressEnabled(boolean z) {
        this.f500w = z;
    }

    public final void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
        this.f488k = onDoubleTapListener;
    }
}
