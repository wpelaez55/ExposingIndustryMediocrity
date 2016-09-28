package com.konylabs.api.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class aY implements OnItemClickListener {
    private /* synthetic */ aV f510a;

    aY(aV aVVar) {
        this.f510a = aVVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f510a.m2521m(i);
        if (this.f510a.f2540a != null) {
            this.f510a.f2540a.onClick(view);
        }
    }
}
