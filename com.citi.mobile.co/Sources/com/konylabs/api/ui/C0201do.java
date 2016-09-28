package com.konylabs.api.ui;

import android.util.Log;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.Gallery;
import com.konylabs.android.KonyMain;

/* renamed from: com.konylabs.api.ui.do */
final class C0201do implements OnFocusChangeListener {
    private /* synthetic */ dm f1222a;

    C0201do(dm dmVar) {
        this.f1222a = dmVar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (view != null) {
            if (KonyMain.f3657e) {
                Log.d("KonySegUIPageView", "Entering OnFocusChangeListener callback");
            }
            int selectedItemId = (int) ((Gallery) view).getSelectedItemId();
            if (this.f1222a.f2913i.size() > selectedItemId) {
                dv dvVar = (dv) this.f1222a.f2913i.elementAt(selectedItemId);
                if (KonyMain.f3657e) {
                    Log.d("KonySegUIPageView", "OnFocusChangeListener callback position = " + selectedItemId + " focusskin holder = " + dvVar.f1230b);
                }
                this.f1222a.m3155a(dvVar, z, selectedItemId);
            }
        }
    }
}
