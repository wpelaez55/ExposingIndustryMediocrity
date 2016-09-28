package com.konylabs.api.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class bI implements OnItemSelectedListener {
    private /* synthetic */ bG f698a;

    bI(bG bGVar) {
        this.f698a = bGVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f698a.f682e = i;
        this.f698a.requestFocusFromTouch();
        this.f698a.m713c(0);
        bG bGVar = this.f698a;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
