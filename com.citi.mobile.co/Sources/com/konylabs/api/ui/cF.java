package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

public class cF {
    final /* synthetic */ gL f912a;

    cF(gL gLVar) {
        this.f912a = gLVar;
    }

    public void m965a() {
        if (this.f912a.f4167Q != LuaNil.nil && this.f912a.f4167Q != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f912a.f4167Q;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f912a);
            obtain.setData(bundle);
            if (KonyMain.f3657e) {
                Log.d("LuaPopUp", "OnDismiss Called " + this.f912a.f4167Q);
            }
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
