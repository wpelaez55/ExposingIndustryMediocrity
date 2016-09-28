package com.konylabs.api.ui;

import android.view.inputmethod.InputMethodManager;
import com.konylabs.android.KonyMain;

final class ek implements Runnable {
    private /* synthetic */ ej f1312a;

    ek(ej ejVar) {
        this.f1312a = ejVar;
    }

    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) KonyMain.getAppContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f1312a.f1311a.f1294k, 1);
        }
    }
}
