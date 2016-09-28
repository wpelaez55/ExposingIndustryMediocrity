package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;

final class hF implements OnClickListener {
    hF(hD hDVar) {
    }

    public final void onClick(View view) {
        KonyMain actContext = KonyMain.getActContext();
        if (actContext != null) {
            actContext.m4160d();
        }
    }
}
