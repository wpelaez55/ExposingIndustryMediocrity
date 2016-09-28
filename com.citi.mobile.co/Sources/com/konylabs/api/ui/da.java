package com.konylabs.api.ui;

final class da implements Runnable {
    private /* synthetic */ cW f1174a;

    da(cW cWVar) {
        this.f1174a = cWVar;
    }

    public final void run() {
        if (this.f1174a.f2726A != null) {
            this.f1174a.f2726A.requestLayout();
        }
    }
}
