package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

public class aA {
    final /* synthetic */ fs f412a;

    aA(fs fsVar) {
        this.f412a = fsVar;
    }

    public void m411a(String str) {
        LuaNil a = fs.m4360a(this.f412a, str);
        if (a != LuaNil.nil && a != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = a;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f412a);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
