package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;

final class aC implements OnClickListener, OnFocusChangeListener {
    private /* synthetic */ av f424a;

    private aC(av avVar, byte b) {
        this.f424a = avVar;
    }

    public final void onClick(View view) {
        av.m590a(this.f424a, view);
        if (this.f424a.f597c != null) {
            this.f424a.f597c.onClick(view);
        }
    }

    public final void onFocusChange(View view, boolean z) {
        aB aBVar = (aB) view.getTag();
        if (z) {
            if (!aBVar.f422j) {
                aBVar.m424c();
            }
        } else if (!aBVar.f422j) {
            aBVar.m426e();
        }
    }
}
