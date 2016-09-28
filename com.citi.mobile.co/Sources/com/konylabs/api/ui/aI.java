package com.konylabs.api.ui;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.rsa.mobilesdk.sdk.BuildConfig;

public class aI {
    final /* synthetic */ fv f472a;

    aI(fv fvVar) {
        this.f472a = fvVar;
    }

    public void m503a() {
        LuaNil i = super.getTable(fv.f4013i);
        this.f472a.aR = i != LuaNil.nil ? (Function) i : null;
        if (this.f472a.aR == null) {
            return;
        }
        if (this.f472a.bo) {
            KonyMain.m4121f().post(new fN(this));
            return;
        }
        try {
            ((Function) this.f472a.aR).execute(new Object[]{this.f472a});
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                Log.d("LuaForm", BuildConfig.FLAVOR + e.getMessage());
            }
            if (e instanceof LuaError) {
                throw ((LuaError) e);
            }
            throw new LuaError("Error in form OnDeviceMenuClick callback. " + e.getMessage(), 605);
        }
    }
}
