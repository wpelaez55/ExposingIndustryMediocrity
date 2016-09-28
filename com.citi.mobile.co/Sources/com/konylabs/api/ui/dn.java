package com.konylabs.api.ui;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Gallery;
import com.konylabs.android.KonyMain;

final class dn extends Gallery {
    private boolean f1218a;
    private boolean f1219b;
    private float f1220c;
    private /* synthetic */ dm f1221d;

    dn(dm dmVar, Context context) {
        this.f1221d = dmVar;
        super(context);
        this.f1218a = false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!(motionEvent == null || motionEvent2 == null)) {
            if (this.f1218a) {
                if (KonyMain.f3657e) {
                    Log.d("KonySegUIPageView", "onFling resetting diableFrameShift " + this.f1218a);
                }
                this.f1218a = false;
            } else {
                int x = (int) (motionEvent.getX() - motionEvent2.getX());
                int a;
                if (x < 0) {
                    x *= -1;
                    a = this.f1221d.f2924t - 1;
                    if (a >= 0) {
                        this.f1221d.f2909e = 2;
                        if (KonyMain.f3657e) {
                            Log.d("KonySegUIPageView", "onFling Called dist = " + x);
                        }
                        this.f1221d.f2908d.setSelection(a, true);
                    }
                } else {
                    a = this.f1221d.f2924t + 1;
                    if (a < this.f1221d.f2923s.getCount()) {
                        this.f1221d.f2909e = 1;
                        if (KonyMain.f3657e) {
                            Log.d("KonySegUIPageView", "onFling Called dist = " + x);
                        }
                        this.f1221d.f2908d.setSelection(a, true);
                    }
                }
            }
        }
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f1219b) {
            return true;
        }
        float x = motionEvent.getX();
        switch (action) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                this.f1220c = x;
                super.onTouchEvent(motionEvent);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                this.f1219b = false;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (((int) Math.abs(x - this.f1220c)) > this.f1221d.f2901C) {
                    this.f1219b = true;
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        break;
                    }
                }
                break;
        }
        return this.f1219b;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!(motionEvent == null || motionEvent2 == null)) {
            if (motionEvent.getX() - motionEvent2.getX() < 0.0f) {
                this.f1221d.f2909e = 2;
            } else {
                this.f1221d.f2909e = 1;
            }
            int j = this.f1221d.m3208j();
            super.onScroll(motionEvent, motionEvent2, f, f2);
            if (KonyMain.f3657e) {
                Log.d("KonySegUIPageView", "onScroll lastFocusIndex " + j + " newFocusedIndex " + this.f1221d.m3208j());
            }
            if (j != this.f1221d.m3208j()) {
                if (KonyMain.f3657e) {
                    Log.d("KonySegUIPageView", "onScroll trying to set diableFrameShift " + this.f1218a);
                }
                this.f1218a = true;
            }
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f1219b = false;
        }
        return super.onTouchEvent(motionEvent);
    }
}
