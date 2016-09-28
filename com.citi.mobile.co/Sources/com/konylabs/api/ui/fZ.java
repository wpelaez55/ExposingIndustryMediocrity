package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class fZ implements C0210l {
    private /* synthetic */ fX f2999a;

    fZ(fX fXVar) {
        this.f2999a = fXVar;
    }

    public final void m3325a(boolean z) {
        fX fXVar = this.f2999a;
        if (LuaNil.nil != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            fXVar = this.f2999a;
            obtain.obj = null;
            Bundle bundle = new Bundle(2);
            bundle.putSerializable("key0", this.f2999a);
            bundle.putString("key1", z ? "prev" : "next");
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
