package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportMenu;
import android.view.View;
import com.konylabs.android.KonyMain;

/* renamed from: com.konylabs.api.ui.A */
public final class C0173A {
    private static final Context f168j;
    private dB f169a;
    private Drawable f170b;
    private Paint f171c;
    private Paint f172d;
    private Paint f173e;
    private View f174f;
    private String f175g;
    private int f176h;
    private int f177i;
    private int f178k;
    private int f179l;
    private int f180m;

    static {
        f168j = KonyMain.getActContext();
    }

    public C0173A(View view) {
        this.f169a = null;
        this.f178k = dB.m1116r(5);
        this.f179l = dB.m1116r(2);
        this.f180m = dB.m1116r(6);
        this.f174f = view;
        this.f171c = new Paint();
        this.f171c.setAntiAlias(true);
        this.f171c.setTextAlign(Align.CENTER);
        this.f171c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f171c.setTextSize(12.0f * f168j.getResources().getDisplayMetrics().density);
        this.f171c.setColor(-1);
        this.f172d = new Paint();
        this.f172d.setAntiAlias(true);
        this.f172d.setStyle(Style.FILL_AND_STROKE);
        this.f172d.setColor(SupportMenu.CATEGORY_MASK);
        this.f173e = new Paint();
        this.f173e.setAntiAlias(true);
        this.f173e.setStyle(Style.STROKE);
        this.f173e.setColor(-1);
        this.f173e.setStrokeWidth(2.0f);
    }

    public final void m107a(Canvas canvas) {
        this.f176h = (int) this.f171c.ascent();
        this.f177i = (int) this.f171c.descent();
        int i = this.f176h;
        i = this.f177i;
        this.f171c.measureText(this.f175g);
        this.f175g.length();
        this.f171c.setTextAlign(Align.CENTER);
        i = this.f174f.getRight();
        int top = this.f174f.getTop();
        int i2 = i - this.f179l;
        String str = this.f175g;
        Paint paint = this.f171c;
        if (str.length() <= 1) {
            str = "ab";
        }
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        int width = i2 - (rect.width() + this.f178k);
        top += this.f179l;
        str = this.f175g;
        Paint paint2 = this.f171c;
        Rect rect2 = new Rect();
        paint2.getTextBounds(str, 0, str.length(), rect2);
        int height = this.f178k + (rect2.height() + top);
        i = (i2 + width) / 2;
        int descent = (int) (((float) ((top + height) / 2)) - ((this.f171c.descent() + this.f171c.ascent()) / 2.0f));
        if (width < 0) {
            width = this.f179l;
            i = this.f178k + this.f179l;
            this.f171c.setTextAlign(Align.LEFT);
        }
        if (this.f170b != null) {
            this.f170b.setBounds(new Rect(width, top, i2, height));
            this.f170b.draw(canvas);
        } else {
            RectF rectF = new RectF();
            rectF.set((float) width, (float) top, (float) i2, (float) height);
            canvas.drawRoundRect(rectF, (float) this.f180m, (float) this.f180m, this.f172d);
            canvas.drawRoundRect(rectF, (float) this.f180m, (float) this.f180m, this.f173e);
        }
        canvas.drawText(this.f175g, (float) i, (float) descent, this.f171c);
    }

    public final void m108a(dB dBVar) {
        this.f169a = dBVar;
        if (this.f169a != null) {
            String f = this.f169a.m1140f();
            if (f != null) {
                dB dBVar2 = this.f169a;
                this.f170b = dB.m1112c(f);
            }
            this.f171c.setTextSize(this.f169a.m1154l() * f168j.getResources().getDisplayMetrics().density);
            this.f171c.setColor(this.f169a.m1156m());
            this.f172d.setColor(this.f169a.m1142g());
            this.f173e.setColor(this.f169a.m1145h());
            this.f173e.setStrokeWidth((float) this.f169a.m1158n());
        }
    }

    public final void m109a(String str) {
        this.f175g = str;
    }
}
