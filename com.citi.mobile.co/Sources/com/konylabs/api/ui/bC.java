package com.konylabs.api.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class bC implements OnItemSelectedListener {
    private /* synthetic */ bA f661a;

    bC(bA bAVar) {
        this.f661a = bAVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f661a.f645h = i;
        this.f661a.requestFocusFromTouch();
        this.f661a.m676c(0);
        if (this.f661a.f643f == null) {
            return;
        }
        if (this.f661a.f648n && i == this.f661a.f644g.size()) {
            this.f661a.f643f.m682a(false);
        } else if (this.f661a.f647m && i == 0) {
            this.f661a.f643f.m682a(true);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
