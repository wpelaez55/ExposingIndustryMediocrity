package com.konylabs.api.ui;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

final class dJ extends SimpleOnGestureListener {
    private float f1128a;
    private /* synthetic */ dH f1129b;

    dJ(dH dHVar) {
        this.f1129b = dHVar;
        this.f1128a = -1000.0f;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.f1128a = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f1129b.m2988a(this.f1129b.f2832t, true);
        }
        return super.onDown(motionEvent);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent2.getAction() == 1) {
            this.f1129b.m2988a(this.f1129b.f2831s, false);
        }
        if (Math.abs(f) > ((float) this.f1129b.f2819g)) {
            this.f1129b.startFlipping();
        }
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent2.getAction() == 2) {
            this.f1129b.m2988a(this.f1129b.f2832t, true);
        }
        if (this.f1128a == -1000.0f) {
            this.f1128a = motionEvent2.getX();
        }
        int x = (int) (this.f1128a - motionEvent2.getX());
        this.f1128a += (float) x;
        if (x < 0 && ((float) (-x)) > this.f1129b.f2818f) {
            this.f1129b.m3013d(false);
            this.f1129b.showPrevious();
            this.f1128a = motionEvent2.getX();
        } else if (((float) x) > this.f1129b.f2818f) {
            this.f1129b.m3013d(true);
            this.f1129b.showNext();
            this.f1128a = motionEvent2.getX();
        }
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f1129b.m2988a(this.f1129b.f2831s, false);
        }
        this.f1129b.stopFlipping();
        return false;
    }
}
