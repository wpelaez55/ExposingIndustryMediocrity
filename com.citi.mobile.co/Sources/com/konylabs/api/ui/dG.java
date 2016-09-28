package com.konylabs.api.ui;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

final class dG extends SimpleOnGestureListener {
    private float f1125a;
    private /* synthetic */ dE f1126b;

    dG(dE dEVar) {
        this.f1126b = dEVar;
        this.f1125a = -1000.0f;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.f1125a = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f1126b.m2949a(this.f1126b.f2808t, true);
        }
        return super.onDown(motionEvent);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent2.getAction() == 1) {
            this.f1126b.m2949a(this.f1126b.f2807s, false);
        }
        if (Math.abs(f) > ((float) this.f1126b.f2795g)) {
            this.f1126b.startFlipping();
        }
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent2.getAction() == 2) {
            this.f1126b.m2949a(this.f1126b.f2808t, true);
        }
        if (this.f1125a == -1000.0f) {
            this.f1125a = motionEvent2.getX();
        }
        int x = (int) (this.f1125a - motionEvent2.getX());
        this.f1125a += (float) x;
        if (x < 0 && ((float) (-x)) > this.f1126b.f2794f) {
            this.f1126b.m2973d(false);
            this.f1126b.showPrevious();
            this.f1125a = motionEvent2.getX();
        } else if (((float) x) > this.f1126b.f2794f) {
            this.f1126b.m2973d(true);
            this.f1126b.showNext();
            this.f1125a = motionEvent2.getX();
        }
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f1126b.m2949a(this.f1126b.f2807s, false);
        }
        this.f1126b.stopFlipping();
        return false;
    }
}
