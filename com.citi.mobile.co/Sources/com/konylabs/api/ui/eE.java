package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class eE implements C0224z {
    private /* synthetic */ eA f2969a;

    eE(eA eAVar) {
        this.f2969a = eAVar;
    }

    public final void m3274a(boolean z) {
        eA.f3706k.remove(this.f2969a.f3707g);
        LuaNil table = this.f2969a.getTable(eA.f3697a);
        if (table != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = table;
            Bundle bundle = new Bundle(1);
            bundle.putBoolean("key0", (z ? Boolean.TRUE : Boolean.FALSE).booleanValue());
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
        this.f2969a.f3707g = null;
    }
}
