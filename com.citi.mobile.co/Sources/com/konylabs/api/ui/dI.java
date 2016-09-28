package com.konylabs.api.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class dI implements OnTouchListener {
    private /* synthetic */ dH f1127a;

    dI(dH dHVar) {
        this.f1127a = dHVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f1127a.f2813a.onTouchEvent(motionEvent);
    }
}
