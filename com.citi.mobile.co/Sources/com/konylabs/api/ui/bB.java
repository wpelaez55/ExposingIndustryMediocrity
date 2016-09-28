package com.konylabs.api.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class bB implements OnItemClickListener {
    private /* synthetic */ bA f660a;

    bB(bA bAVar) {
        this.f660a = bAVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f660a.f645h = i;
        r0.requestFocusFromTouch();
        this.f660a.m676c(0);
        if (this.f660a.f642e != null) {
            this.f660a.f642e.onClick(view);
        }
    }
}
