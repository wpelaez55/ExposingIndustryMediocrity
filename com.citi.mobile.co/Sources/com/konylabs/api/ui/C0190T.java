package com.konylabs.api.ui;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* renamed from: com.konylabs.api.ui.T */
final class C0190T extends SimpleOnGestureListener {
    private /* synthetic */ C0184N f327a;

    private C0190T(C0184N c0184n, byte b) {
        this.f327a = c0184n;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (!this.f327a.f311o) {
            this.f327a.m299e();
        }
        return true;
    }
}
