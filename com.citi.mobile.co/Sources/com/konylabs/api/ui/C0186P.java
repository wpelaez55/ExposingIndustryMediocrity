package com.konylabs.api.ui;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.util.Log;
import com.konylabs.android.KonyMain;

/* renamed from: com.konylabs.api.ui.P */
final class C0186P implements AutoFocusCallback {
    private /* synthetic */ C0184N f324a;

    C0186P(C0184N c0184n) {
        this.f324a = c0184n;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        if (KonyMain.f3657e) {
            Log.d("KonyCamera", "onAutoFocus: Success = " + z);
        }
        this.f324a.m312m();
    }
}
