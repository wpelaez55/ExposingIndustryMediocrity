package com.konylabs.api.ui;

final class cZ implements Runnable {
    private /* synthetic */ cW f970a;

    cZ(cW cWVar) {
        this.f970a = cWVar;
    }

    public final void run() {
        if (this.f970a.f2726A != null) {
            this.f970a.f2726A.requestLayout();
        }
    }
}
