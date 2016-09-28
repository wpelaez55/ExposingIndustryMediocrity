package com.konylabs.api.ui;

import android.util.Log;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.konylabs.android.KonyMain;

final class cK implements OnFocusChangeListener {
    private /* synthetic */ cH f915a;

    cK(cH cHVar) {
        this.f915a = cHVar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (KonyMain.f3657e) {
            Log.d("KonyPopupGridCalendar", "OnFOcusChange called for calendar");
        }
        this.f915a.m3971b(z);
    }
}
