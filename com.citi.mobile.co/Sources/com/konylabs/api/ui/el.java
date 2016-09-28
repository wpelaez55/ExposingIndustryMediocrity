package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.konylabs.android.KonyMain;

public final class el extends ScrollView {
    private boolean f1313a;
    private em f1314b;

    public el(Context context) {
        super(context);
    }

    public final void m1338a(em emVar) {
        this.f1314b = emVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (KonyMain.f3656d < 14 && motionEvent.getAction() == 0) {
            requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1313a) {
            if (this.f1314b != null) {
                em emVar = this.f1314b;
            }
            this.f1313a = true;
        }
    }
}
