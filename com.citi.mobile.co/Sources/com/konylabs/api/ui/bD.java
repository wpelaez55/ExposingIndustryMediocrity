package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

public class bD {
    final /* synthetic */ gu f662a;

    bD(gu guVar) {
        this.f662a = guVar;
    }

    public void m682a(boolean z) {
        if (this.f662a.f4240a != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f662a.f4240a;
            Bundle bundle = new Bundle(2);
            bundle.putSerializable("key0", this.f662a);
            bundle.putString("key1", z ? "prev" : "next");
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
