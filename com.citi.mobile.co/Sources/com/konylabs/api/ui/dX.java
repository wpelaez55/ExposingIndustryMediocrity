package com.konylabs.api.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class dX implements OnTouchListener {
    private int f1146a;
    private /* synthetic */ dU f1147b;

    public dX(dU dUVar, int i) {
        this.f1147b = dUVar;
        this.f1146a = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f1147b.f2860h.m1190a(this.f1146a);
        }
        return false;
    }
}
