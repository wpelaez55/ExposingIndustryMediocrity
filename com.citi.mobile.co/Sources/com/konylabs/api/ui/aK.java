package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;

public class aK {
    final /* synthetic */ fv f474a;

    aK(fv fvVar) {
        this.f474a = fvVar;
    }

    public void m505a(boolean z) {
        LuaNil a = super.getTable(fv.f4011g);
        this.f474a.aO = a != LuaNil.nil ? (Function) a : null;
        if (this.f474a.aO != null) {
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = this.f474a.aO;
            Bundle bundle = new Bundle(3);
            bundle.putSerializable("key0", this.f474a);
            bundle.putDouble("key1", z ? 2.0d : 1.0d);
            bundle.putSerializable("hideProgress", Boolean.valueOf(false));
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
