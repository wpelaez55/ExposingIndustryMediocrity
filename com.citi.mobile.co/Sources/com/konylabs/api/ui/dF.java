package com.konylabs.api.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class dF implements OnTouchListener {
    private /* synthetic */ dE f1124a;

    dF(dE dEVar) {
        this.f1124a = dEVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f1124a.f2789a.onTouchEvent(motionEvent);
    }
}
