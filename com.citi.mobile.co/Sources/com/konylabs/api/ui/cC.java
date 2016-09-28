package com.konylabs.api.ui;

import android.os.MessageQueue.IdleHandler;

final class cC implements IdleHandler {
    private /* synthetic */ cB f909a;

    cC(cB cBVar) {
        this.f909a = cBVar;
    }

    public final boolean queueIdle() {
        if (this.f909a.f908a.f1068q != null) {
            this.f909a.f908a.f1068q.getViewTreeObserver().removeOnPreDrawListener(this.f909a.f908a.f1058g);
        }
        this.f909a.f908a.f1057f = false;
        return false;
    }
}
