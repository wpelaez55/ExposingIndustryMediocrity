package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;

public class aJ {
    final /* synthetic */ fv f473a;

    aJ(fv fvVar) {
        this.f473a = fvVar;
    }

    public void m504a() {
        LuaNil g = super.getTable(fv.f4010f);
        this.f473a.aQ = g != LuaNil.nil ? (Function) g : null;
        if (this.f473a.aQ != null) {
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = this.f473a.aQ;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f473a);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
