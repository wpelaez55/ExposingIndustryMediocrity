package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class gV implements OnCheckedChangeListener {
    private /* synthetic */ gU f1464a;

    gV(gU gUVar) {
        this.f1464a = gUVar;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (i != -1 && !this.f1464a.f4190l) {
            LuaNil table = this.f1464a.getTable(gU.f4179a);
            if (table != LuaNil.nil) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = table;
                Bundle bundle = new Bundle(1);
                bundle.putSerializable("key0", this.f1464a);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }
}
