package com.konylabs.api.ui;

final class dP implements Runnable {
    private /* synthetic */ dO f1133a;

    dP(dO dOVar) {
        this.f1133a = dOVar;
    }

    public final void run() {
        if (this.f1133a.f2836b.getCurrentItem() == 0) {
            this.f1133a.onPageSelected(0);
        }
    }
}
