package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class fV implements C0210l {
    private /* synthetic */ fT f2998a;

    fV(fT fTVar) {
        this.f2998a = fTVar;
    }

    public final void m3324a(boolean z) {
        if (this.f2998a.f3761b != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f2998a.f3761b;
            Bundle bundle = new Bundle(2);
            bundle.putSerializable("key0", this.f2998a);
            bundle.putString("key1", z ? "prev" : "next");
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
