package com.konylabs.api.ui;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.konylabs.android.KonyMain;

final class bh implements OnItemSelectedListener {
    private /* synthetic */ bd f829a;

    bh(bd bdVar) {
        this.f829a = bdVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (KonyMain.f3657e) {
            Log.d("KonyHImageStrip2", "onItemSelected for the HImageStrip posiiton : " + i + " skipCallback = " + this.f829a.f2657z);
        }
        if (this.f829a.f2657z) {
            this.f829a.f2657z = false;
            return;
        }
        this.f829a.f2626O = view;
        this.f829a.f2645m = i;
        if (this.f829a.f2641i != null) {
            if (this.f829a.f2638f && i == this.f829a.f2636d.size()) {
                this.f829a.f2641i.m1459a(false);
            } else if (this.f829a.f2637e && i == 0) {
                this.f829a.f2641i.m1459a(true);
            }
        }
        if (this.f829a.f2613B && KonyMain.f3656d > 3) {
            this.f829a.m2680i();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        this.f829a.f2626O = null;
    }
}
