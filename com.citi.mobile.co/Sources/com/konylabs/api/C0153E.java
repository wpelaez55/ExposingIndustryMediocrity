package com.konylabs.api;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.fv;
import com.konylabs.vm.Function;

/* renamed from: com.konylabs.api.E */
final class C0153E implements Runnable {
    private /* synthetic */ Function f55a;

    C0153E(C0339C c0339c, Function function) {
        this.f55a = function;
    }

    public final void run() {
        Message obtain = Message.obtain();
        obtain.what = 7;
        obtain.obj = this.f55a;
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("key0", fv.m4395b(KonyMain.f3653a));
        obtain.setData(bundle);
        KonyMain.m4121f().sendMessage(obtain);
    }
}
