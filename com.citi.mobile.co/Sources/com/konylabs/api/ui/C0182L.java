package com.konylabs.api.ui;

import android.util.Log;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.konylabs.android.KonyMain;

/* renamed from: com.konylabs.api.ui.L */
final class C0182L implements OnFocusChangeListener {
    private /* synthetic */ C0371G f271a;

    C0182L(C0371G c0371g) {
        this.f271a = c0371g;
    }

    public final void onFocusChange(View view, boolean z) {
        if (KonyMain.f3657e) {
            Log.d("KonyCalendar", "OnFOcusChange called for calendar");
        }
        this.f271a.m2394b(z);
    }
}
