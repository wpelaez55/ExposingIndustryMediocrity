package com.konylabs.api.ui;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.konylabs.android.KonyMain;

final class ds implements OnItemSelectedListener {
    private /* synthetic */ dm f1226a;

    ds(dm dmVar) {
        this.f1226a = dmVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f1226a.m3163f(i);
        this.f1226a.f2925u = i;
        this.f1226a.f2924t = i;
        if (this.f1226a.f2918n != null) {
            if (false && i == this.f1226a.f2913i.size()) {
                this.f1226a.f2918n.m1560a(false);
            } else if (false && i == 0) {
                this.f1226a.f2918n.m1560a(true);
            }
        }
        if (this.f1226a.f2900B != null && this.f1226a.f2909e > 0) {
            if (KonyMain.f3657e) {
                Log.d("KonySegUIPageView", "OnItemSelectedListener callback for lastPageSelectionCode = " + this.f1226a.f2909e);
            }
            this.f1226a.f2900B.m1561a(this.f1226a.f2909e);
            if (KonyMain.f3657e) {
                Log.d("KonySegUIPageView", "OnItemSelectedListener callback restting the lastPageSelectionCode ");
            }
            this.f1226a.f2909e = -1;
        }
        this.f1226a.f2908d.requestLayout();
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
