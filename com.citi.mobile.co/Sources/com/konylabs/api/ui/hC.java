package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class hC implements OnFocusChangeListener {
    private /* synthetic */ hy f1484a;

    hC(hy hyVar) {
        this.f1484a = hyVar;
    }

    public final void onFocusChange(View view, boolean z) {
        Message obtain;
        Bundle bundle;
        if (z) {
            if (this.f1484a.f4507t != LuaNil.nil && this.f1484a.f4507t != null) {
                obtain = Message.obtain();
                obtain.what = 7;
                obtain.obj = this.f1484a.f4507t;
                bundle = new Bundle(3);
                bundle.putSerializable("key0", this.f1484a);
                bundle.putSerializable("hideProgress", Boolean.valueOf(true));
                bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        } else if (this.f1484a.f4508u != LuaNil.nil && this.f1484a.f4508u != null) {
            obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = this.f1484a.f4508u;
            bundle = new Bundle(3);
            bundle.putSerializable("key0", this.f1484a);
            bundle.putSerializable("hideProgress", Boolean.valueOf(true));
            bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
