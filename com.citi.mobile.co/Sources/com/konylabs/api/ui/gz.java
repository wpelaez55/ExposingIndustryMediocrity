package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class gz implements OnClickListener {
    private /* synthetic */ gx f1480a;

    gz(gx gxVar) {
        this.f1480a = gxVar;
    }

    public final void onClick(View view) {
        LuaNil table = this.f1480a.getTable(gx.f4251c);
        if (table != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f1480a);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
