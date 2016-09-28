package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;

final class hh implements cv {
    private /* synthetic */ hg f3010a;

    hh(hg hgVar) {
        this.f3010a = hgVar;
    }

    public final void m3344a(cu cuVar) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = (Function) cuVar.f1030i;
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("key0", this.f3010a);
        obtain.setData(bundle);
        KonyMain.getActContext();
        KonyMain.m4121f().sendMessage(obtain);
    }
}
