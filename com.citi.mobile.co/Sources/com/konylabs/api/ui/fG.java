package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;

final class fG implements cv {
    private /* synthetic */ fv f2994a;

    fG(fv fvVar) {
        this.f2994a = fvVar;
    }

    public final void m3313a(cu cuVar) {
        if (cuVar.f1030i != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = (Function) cuVar.f1030i;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f2994a);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
