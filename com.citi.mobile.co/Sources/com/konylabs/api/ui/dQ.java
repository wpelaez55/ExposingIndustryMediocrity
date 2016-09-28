package com.konylabs.api.ui;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;

final class dQ implements OnClickListener {
    private /* synthetic */ dO f1134a;

    dQ(dO dOVar) {
        this.f1134a = dOVar;
    }

    public final void onClick(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (KonyMain.f3657e) {
            Log.d("KonyTabPager", "onClick : Printing the OnclickListener focus image position = " + intValue + " Current Selection = " + this.f1134a.f2841g);
        }
        if (intValue != this.f1134a.f2841g) {
            this.f1134a.f2836b.setCurrentItem(intValue);
            this.f1134a.m3032b(intValue);
        }
    }
}
