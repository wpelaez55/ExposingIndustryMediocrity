package com.konylabs.api.ui;

import com.konylabs.android.KonyMain;

final class fB implements Runnable {
    private /* synthetic */ fv f1384a;

    fB(fv fvVar) {
        this.f1384a = fvVar;
    }

    public final void run() {
        if (KonyMain.getActContext() != null && this.f1384a.f4030w != null) {
            this.f1384a.f4030w.f439a.scrollTo(0, this.f1384a.f4030w.getMeasuredHeight());
        }
    }
}
