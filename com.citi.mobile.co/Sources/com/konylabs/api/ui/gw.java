package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class gw implements OnClickListener {
    private /* synthetic */ gu f1477a;

    gw(gu guVar) {
        this.f1477a = guVar;
    }

    public final void onClick(View view) {
        LuaNil table = this.f1477a.getTable(gu.f4232e);
        if (table != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f1477a);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
