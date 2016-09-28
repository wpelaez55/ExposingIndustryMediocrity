package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import java.io.Serializable;

final class gE implements OnClickListener {
    private /* synthetic */ gD f1449a;

    gE(gD gDVar) {
        this.f1449a = gDVar;
    }

    public final void onClick(View view) {
        Serializable serializable = null;
        if (this.f1449a.f4055j != null) {
            iq a = this.f1449a.f4055j;
            this.f1449a.f4052g;
            serializable = a.m1451a(this.f1449a.f4056k);
        }
        LuaNil table = this.f1449a.getTable(gD.f4046a);
        if (table != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle(2);
            bundle.putSerializable("key0", this.f1449a);
            if (serializable != null) {
                bundle.putSerializable("key1", serializable);
            }
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
