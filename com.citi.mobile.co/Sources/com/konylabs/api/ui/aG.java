package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;

public class aG {
    final /* synthetic */ fv f470a;

    aG(fv fvVar) {
        this.f470a = fvVar;
    }

    public boolean m500a() {
        LuaNil b = super.getTable(fv.f4019o);
        this.f470a.aS = b != LuaNil.nil ? (Function) b : null;
        if (this.f470a.aS != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f470a.aS;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f470a);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
        return false;
    }
}
