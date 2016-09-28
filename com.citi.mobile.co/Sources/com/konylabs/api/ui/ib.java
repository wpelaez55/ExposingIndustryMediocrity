package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;

public class ib {
    final /* synthetic */ fg f1544a;

    ib(fg fgVar) {
        this.f1544a = fgVar;
    }

    public void m1401a(boolean z) {
        if (this.f1544a.ac != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f1544a.ac;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f1544a);
            bundle.putSerializable("key1", Boolean.valueOf(z));
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
