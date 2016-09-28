package com.konylabs.api.ui;

import android.view.inputmethod.InputMethodManager;
import com.konylabs.android.KonyMain;

final class eb implements Runnable {
    private /* synthetic */ dZ f1280a;

    eb(dZ dZVar) {
        this.f1280a = dZVar;
    }

    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) KonyMain.getAppContext().getSystemService("input_method");
        if (!inputMethodManager.showSoftInput(this.f1280a.f1163l, 2)) {
            inputMethodManager.toggleSoftInput(2, 0);
        }
    }
}
