package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class hv implements OnFocusChangeListener {
    private /* synthetic */ ht f1537a;

    hv(ht htVar) {
        this.f1537a = htVar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z && this.f1537a.f4482p != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f1537a.f4482p;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f1537a);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
