package com.konylabs.api.ui;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.konylabs.android.KonyMain;

final class bT implements OnClickListener {
    final /* synthetic */ bO f787a;

    private bT(bO bOVar, byte b) {
        this.f787a = bOVar;
    }

    public final void onClick(View view) {
        if (!this.f787a.f778x.isEmpty()) {
            if (this.f787a.f759e == null) {
                this.f787a.f759e = new Dialog(this.f787a.f762h);
                this.f787a.f759e.getWindow().requestFeature(3);
                this.f787a.f759e.setOnDismissListener(new bU(this));
            }
            if (!this.f787a.f759e.isShowing()) {
                if (this.f787a.getParent() != null) {
                    ((ViewGroup) this.f787a.getParent()).removeView(this.f787a);
                }
                this.f787a.f759e.setContentView(this.f787a, this.f787a.f764j);
                Drawable c = dB.m1112c(this.f787a.f739E);
                if (c != null) {
                    this.f787a.f759e.getWindow().setFeatureDrawable(3, c);
                } else {
                    this.f787a.f759e.getWindow().setFeatureDrawable(3, dB.m1112c(this.f787a.f738D));
                }
                this.f787a.f759e.setCancelable(true);
                this.f787a.f759e.setTitle(this.f787a.f753S);
                this.f787a.f759e.setOnKeyListener(this.f787a.f746L);
                this.f787a.f759e.setOwnerActivity(KonyMain.getActContext());
                this.f787a.f759e.show();
            }
        }
    }
}
