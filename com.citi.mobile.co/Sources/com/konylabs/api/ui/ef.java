package com.konylabs.api.ui;

import android.view.inputmethod.InputMethodManager;
import com.konylabs.android.KonyMain;

final class ef implements Runnable {
    private /* synthetic */ ee f1309a;

    ef(ee eeVar) {
        this.f1309a = eeVar;
    }

    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) KonyMain.getAppContext().getSystemService("input_method");
        if (!inputMethodManager.showSoftInput(this.f1309a.f1294k, 2)) {
            inputMethodManager.toggleSoftInput(2, 0);
        }
    }
}
