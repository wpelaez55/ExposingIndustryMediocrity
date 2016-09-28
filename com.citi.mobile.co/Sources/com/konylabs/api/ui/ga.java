package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class ga implements OnClickListener {
    private /* synthetic */ fX f1468a;

    ga(fX fXVar) {
        this.f1468a = fXVar;
    }

    public final void onClick(View view) {
        LuaNil table = this.f1468a.getTable(fX.f3777a);
        if (table != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f1468a);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
