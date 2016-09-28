package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

public class bV {
    final /* synthetic */ gF f789a;

    bV(gF gFVar) {
        this.f789a = gFVar;
    }

    public void m829a() {
        LuaNil table = this.f789a.getTable(gF.f4057a);
        if (table != LuaNil.nil && !this.f789a.f4082A.m803c().isEmpty()) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f789a);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
