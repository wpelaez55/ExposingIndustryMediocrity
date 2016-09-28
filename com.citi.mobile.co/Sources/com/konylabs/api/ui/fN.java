package com.konylabs.api.ui;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.rsa.mobilesdk.sdk.BuildConfig;

final class fN implements Runnable {
    private /* synthetic */ aI f1404a;

    fN(aI aIVar) {
        this.f1404a = aIVar;
    }

    public final void run() {
        try {
            ((Function) this.f1404a.f472a.aR).execute(new Object[]{this.f1404a.f472a});
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                Log.d("LuaForm", BuildConfig.FLAVOR + e.getMessage());
            }
            if (e instanceof LuaError) {
                throw ((LuaError) e);
            }
            throw new LuaError("Error in form OnDeviceMenuClick. " + e.getMessage(), 605);
        }
    }
}
