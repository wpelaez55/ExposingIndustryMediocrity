package com.konylabs.api.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import com.konylabs.android.KonyMain;

final class cV extends ClickableSpan {
    private String f965a;
    private /* synthetic */ cP f966b;

    public cV(cP cPVar, String str) {
        this.f966b = cPVar;
        this.f965a = str;
    }

    public final void onClick(View view) {
        if (KonyMain.f3657e) {
            Log.d("KonyRichText", "Link clicked " + this.f965a);
        }
        if (view.isEnabled() && this.f966b.f948i != null) {
            this.f966b.f948i.m1022a(view, this.f966b.f940a.subSequence(this.f966b.f940a.getSpanStart(this), this.f966b.f940a.getSpanEnd(this)).toString(), this.f965a);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.f966b.f943d != null) {
            textPaint.setTypeface(this.f966b.f943d.m1150j());
            textPaint.setColor(this.f966b.f943d.m1156m());
            textPaint.setTextSize(TypedValue.applyDimension(2, this.f966b.f943d.m1154l(), this.f966b.getContext().getResources().getDisplayMetrics()));
            if (this.f966b.f943d.m1152k() == 2) {
                textPaint.setTextSkewX(-0.25f);
            }
            textPaint.bgColor = this.f966b.f943d.m1142g();
            textPaint.setUnderlineText(this.f966b.f943d.m1161o());
        }
    }
}
