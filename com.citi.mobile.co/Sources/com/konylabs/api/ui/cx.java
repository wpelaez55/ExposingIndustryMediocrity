package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import java.io.Serializable;
import ny0k.cr;

public class cx {
    final /* synthetic */ gJ f1034a;

    cx(gJ gJVar) {
        this.f1034a = gJVar;
    }

    public void m1049a(int i, cy cyVar) {
        Serializable serializable = cyVar.f2788a;
        LuaNil table = this.f1034a.getTable(gJ.f4128d);
        if (table != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            int a = cr.m2199a(i, 1);
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f1034a);
            bundle.putSerializable("key1", new Double((double) a));
            String str = "key2";
            if (serializable == null) {
                serializable = LuaNil.nil;
            }
            bundle.putSerializable(str, serializable);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
