package com.konylabs.api.ui;

import android.view.View;

final class db implements Runnable {
    private /* synthetic */ C0219u f1175a;
    private /* synthetic */ View f1176b;
    private /* synthetic */ cW f1177c;

    db(cW cWVar, C0219u c0219u, View view) {
        this.f1177c = cWVar;
        this.f1175a = c0219u;
        this.f1176b = view;
    }

    public final void run() {
        if (this.f1175a != null) {
            this.f1177c.invalidate();
            this.f1177c.m2840a(this.f1175a, this.f1176b);
        }
    }
}
