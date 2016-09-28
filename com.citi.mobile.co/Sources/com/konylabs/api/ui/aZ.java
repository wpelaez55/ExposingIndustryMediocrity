package com.konylabs.api.ui;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.konylabs.android.KonyMain;

final class aZ implements OnItemSelectedListener {
    private /* synthetic */ aV f511a;

    aZ(aV aVVar) {
        this.f511a = aVVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (KonyMain.f3657e) {
            Log.d("KonyHImageStrip", "onItemSelected for the HImageStrip posiiton : " + i + " skipCallback = " + this.f511a.f2561v);
        }
        if (this.f511a.f2561v) {
            this.f511a.f2561v = false;
            return;
        }
        this.f511a.f2531I = view;
        this.f511a.f2550k = i;
        if (this.f511a.f2546g != null) {
            if (this.f511a.f2543d && i == this.f511a.f2541b.size()) {
                this.f511a.f2546g.m1459a(false);
            } else if (this.f511a.f2542c && i == 0) {
                this.f511a.f2546g.m1459a(true);
            }
        }
        if (this.f511a.f2563x && KonyMain.f3656d > 3) {
            this.f511a.m2517i();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        this.f511a.f2531I = null;
    }
}
