package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;

public class bz {
    final /* synthetic */ gt f905a;

    bz(gt gtVar) {
        this.f905a = gtVar;
    }

    public void m964a(String str, boolean z) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = this.f905a.f4227n;
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("key0", this.f905a);
        bundle.putString("key1", str);
        bundle.putBoolean("key2", z);
        obtain.setData(bundle);
        KonyMain.getActContext();
        KonyMain.m4121f().sendMessage(obtain);
    }
}
