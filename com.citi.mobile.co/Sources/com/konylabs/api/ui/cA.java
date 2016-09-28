package com.konylabs.api.ui;

import android.widget.PopupWindow.OnDismissListener;
import com.konylabs.android.KonyMain;

final class cA implements OnDismissListener {
    private /* synthetic */ cz f907a;

    cA(cz czVar) {
        this.f907a = czVar;
    }

    public final void onDismiss() {
        if (KonyMain.f3656d < 16) {
            this.f907a.getContentView().clearFocus();
        }
        if (this.f907a.f1038B != null) {
            this.f907a.f1038B.m966a();
        }
    }
}
