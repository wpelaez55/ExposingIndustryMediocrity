package com.konylabs.api.ui;

import android.view.GestureDetector;
import ny0k.cD;

final class aL {
    public GestureDetector f475a;
    public cD f476b;
    public int f477c;

    aL(int i, cD cDVar) {
        GestureDetector gestureDetector;
        this.f477c = i;
        this.f476b = cDVar;
        if (this.f477c == 1) {
            gestureDetector = new GestureDetector(cDVar);
        } else {
            gestureDetector = new aM(cDVar);
            ((aM) gestureDetector).m511a(this.f477c);
        }
        this.f475a = gestureDetector;
    }
}
