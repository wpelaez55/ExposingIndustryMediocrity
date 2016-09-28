package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.widget.EditText;

final class ej extends EditText {
    final /* synthetic */ ee f1311a;

    public ej(ee eeVar, Context context) {
        this.f1311a = eeVar;
        super(context);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1311a.m1293l();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() != 1 || !isFocused()) {
            return onTouchEvent;
        }
        post(new ek(this));
        return onTouchEvent;
    }

    public final void setTypeface(Typeface typeface, int i) {
        boolean z = false;
        if (i > 0) {
            setTypeface(typeface);
            int style = ((typeface != null ? typeface.getStyle() : 0) ^ -1) & i;
            TextPaint paint = getPaint();
            if ((style & 1) != 0) {
                z = true;
            }
            paint.setFakeBoldText(z);
            getPaint().setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        getPaint().setFakeBoldText(false);
        getPaint().setTextSkewX(0.0f);
        setTypeface(typeface);
    }
}
