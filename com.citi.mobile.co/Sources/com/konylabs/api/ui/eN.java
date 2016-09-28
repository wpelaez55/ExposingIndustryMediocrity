package com.konylabs.api.ui;

final class eN implements Runnable {
    private /* synthetic */ eK f1254a;

    eN(eK eKVar) {
        this.f1254a = eKVar;
    }

    public final void run() {
        if (this.f1254a.f2979c != null) {
            this.f1254a.f2979c.dismiss();
            this.f1254a.f2979c = null;
            eK.f2976l = false;
        }
    }
}
