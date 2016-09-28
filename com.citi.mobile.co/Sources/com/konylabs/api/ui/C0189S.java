package com.konylabs.api.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.konylabs.api.ui.S */
final class C0189S implements OnTouchListener {
    private /* synthetic */ C0184N f326a;

    C0189S(C0184N c0184n) {
        this.f326a = c0184n;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean onTouchEvent = this.f326a.f308l != null ? this.f326a.f308l.onTouchEvent(motionEvent) : false;
        boolean onTouchEvent2 = (!this.f326a.f281I || this.f326a.f274B == null) ? false : this.f326a.f274B.onTouchEvent(motionEvent);
        return onTouchEvent || onTouchEvent2;
    }
}
