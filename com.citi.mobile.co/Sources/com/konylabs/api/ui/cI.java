package com.konylabs.api.ui;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import com.konylabs.android.KonyMain;

final class cI implements OnClickListener {
    private /* synthetic */ cH f913a;

    cI(cH cHVar) {
        this.f913a = cHVar;
    }

    public final void onClick(View view) {
        KonyMain.getActContext().m4168q();
        this.f913a.f3553l.onFocusChange(this.f913a, true);
        if (this.f913a.f3552k == null) {
            this.f913a.f3552k = new Dialog(this.f913a.f3554m);
            this.f913a.f3552k.getWindow().requestFeature(1);
        }
        if (!this.f913a.f3552k.isShowing()) {
            View b = super.m2445b();
            if (this.f913a.getParent() != null) {
                ((ViewGroup) b.getParent()).removeView(b);
            }
            View scrollView = new ScrollView(this.f913a.f3554m);
            scrollView.addView(b, new LayoutParams(-1, -1));
            this.f913a.f3552k.setContentView(scrollView);
            this.f913a.f3552k.getWindow().setLayout(-1, -2);
            this.f913a.f3552k.setCancelable(true);
            this.f913a.f3552k.setOnKeyListener(this.f913a.f3548G);
            this.f913a.f3552k.setOwnerActivity(KonyMain.getActContext());
            this.f913a.f3552k.show();
        }
    }
}
