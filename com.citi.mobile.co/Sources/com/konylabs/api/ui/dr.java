package com.konylabs.api.ui;

import android.util.Log;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.konylabs.android.KonyMain;

final class dr implements OnFocusChangeListener {
    private /* synthetic */ dm f1225a;

    dr(dm dmVar) {
        this.f1225a = dmVar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (view != null && this.f1225a.f2913i != null) {
            if (KonyMain.f3657e) {
                Log.d("KonySegUIPageView", "Entering OnFocusChangeListener callback for layout");
            }
            int selectedItemId = (int) this.f1225a.f2908d.getSelectedItemId();
            if (this.f1225a.f2913i.size() > selectedItemId) {
                dv dvVar = (dv) this.f1225a.f2913i.elementAt(selectedItemId);
                if (KonyMain.f3657e) {
                    Log.d("KonySegUIPageView", "OnFocusChangeListener callback for layout position = " + selectedItemId + " focusskin metainfo holder = " + dvVar.f1230b);
                }
                this.f1225a.m3155a(dvVar, z, selectedItemId);
            }
        }
    }
}
