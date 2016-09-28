package com.konylabs.api.ui;

import android.os.MessageQueue.IdleHandler;
import com.konylabs.android.KonyMain;

final class fk implements IdleHandler {
    fk(ic icVar) {
    }

    public final boolean queueIdle() {
        String n = KonyMain.getActContext().m4165n();
        if (n != null) {
            fv.m4406c(n);
        }
        return false;
    }
}
