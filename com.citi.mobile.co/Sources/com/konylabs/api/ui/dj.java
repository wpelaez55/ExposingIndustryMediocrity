package com.konylabs.api.ui;

import android.util.Log;

class dj {
    final /* synthetic */ df f1212a;

    dj(df dfVar) {
        this.f1212a = dfVar;
    }

    public void m1269a(int i) {
        this.f1212a.f2886n = i;
        if (this.f1212a.f2878f != null) {
            Log.d("KonySegUIDockListView", "Click position = " + this.f1212a.f2886n);
            this.f1212a.f2878f.m1404a(this.f1212a.f2886n, true);
        }
    }
}
