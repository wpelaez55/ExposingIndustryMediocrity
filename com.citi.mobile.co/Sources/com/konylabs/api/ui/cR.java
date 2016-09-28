package com.konylabs.api.ui;

import android.graphics.drawable.Drawable;
import android.text.Html.ImageGetter;
import java.util.ArrayList;

final class cR implements ImageGetter {
    private /* synthetic */ cP f960a;

    cR(cP cPVar) {
        this.f960a = cPVar;
    }

    public final Drawable getDrawable(String str) {
        Drawable drawable = null;
        if (str.startsWith("http") || str.startsWith("https")) {
            if (this.f960a.f952m == null) {
                this.f960a.f952m = new ArrayList();
            }
            this.f960a.f952m.add(new cT(this.f960a, str).execute(new String[0]));
        } else {
            drawable = dB.m1112c(str);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
        }
        return drawable;
    }
}
