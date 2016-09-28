package com.konylabs.api.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class bH implements OnItemClickListener {
    private /* synthetic */ bG f697a;

    bH(bG bGVar) {
        this.f697a = bGVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f697a.f682e = i;
        this.f697a.requestFocusFromTouch();
        this.f697a.m713c(0);
        if (this.f697a.f681d != null) {
            this.f697a.f681d.onClick(view);
        }
    }
}
