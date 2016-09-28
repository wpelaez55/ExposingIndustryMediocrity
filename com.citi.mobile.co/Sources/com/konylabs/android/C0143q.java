package com.konylabs.android;

/* renamed from: com.konylabs.android.q */
final class C0143q implements Runnable {
    C0143q(KonyMain konyMain) {
    }

    public final void run() {
        KonyMain actContext = KonyMain.getActContext();
        if (actContext != null) {
            actContext.closeOptionsMenu();
        }
    }
}
