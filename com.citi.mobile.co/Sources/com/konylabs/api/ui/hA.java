package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class hA implements OnFocusChangeListener {
    private /* synthetic */ hy f1482a;

    hA(hy hyVar) {
        this.f1482a = hyVar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z && this.f1482a.f4506s != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f1482a.f4506s;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f1482a);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
