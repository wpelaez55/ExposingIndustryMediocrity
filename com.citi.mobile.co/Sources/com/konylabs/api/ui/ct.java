package com.konylabs.api.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.maps.MapView;

public final class ct extends MapView {
    private bW f1015a;
    private Boolean f1016b;
    private float f1017c;
    private float f1018d;
    private float f1019e;

    public ct(Context context, String str) {
        super(context, str);
        this.f1015a = null;
        this.f1016b = Boolean.valueOf(false);
        this.f1019e = (float) ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void m1039a(bW bWVar) {
        this.f1015a = bWVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f1015a == null || !this.f1015a.f812w.booleanValue()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                getParent().requestDisallowInterceptTouchEvent(true);
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1017c = motionEvent.getX();
            this.f1018d = motionEvent.getY();
            this.f1016b = Boolean.valueOf(false);
        } else if (motionEvent.getAction() == 2) {
            if (Math.abs(this.f1017c - motionEvent.getX()) > this.f1019e) {
                this.f1016b = Boolean.valueOf(true);
            } else if (Math.abs(this.f1018d - motionEvent.getY()) > this.f1019e) {
                this.f1016b = Boolean.valueOf(true);
            }
        } else if (!(motionEvent.getAction() != 1 || this.f1016b.booleanValue() || this.f1015a == null || this.f1015a.m850a(motionEvent))) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
