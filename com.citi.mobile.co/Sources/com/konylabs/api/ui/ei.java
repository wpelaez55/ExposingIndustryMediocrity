package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.widget.AutoCompleteTextView;

final class ei extends AutoCompleteTextView {
    private /* synthetic */ ee f1310a;

    public ei(ee eeVar, Context context) {
        this.f1310a = eeVar;
        super(context);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1310a.m1293l();
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
