package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

class ie {
    final /* synthetic */ hg f1546a;

    ie(hg hgVar) {
        this.f1546a = hgVar;
    }

    public void m1404a(int i, boolean z) {
        LuaNil b = (this.f1546a.af == 1 || this.f1546a.af == 2) ? super.getTable(hg.f4403b) : super.getTable(hg.f4402a);
        if (b != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = b;
            Bundle bundle = new Bundle(4);
            bundle.putSerializable("key0", this.f1546a);
            bundle.putSerializable("key1", new Double((double) (i + 1)));
            if (this.f1546a.af == 1 || this.f1546a.af == 2) {
                bundle.putSerializable("key2", Boolean.valueOf(z));
            }
            bundle.putSerializable("DropMultipleTaps", Boolean.valueOf(true));
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
