package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class hx implements OnFocusChangeListener {
    private /* synthetic */ ht f1539a;

    hx(ht htVar) {
        this.f1539a = htVar;
    }

    public final void onFocusChange(View view, boolean z) {
        Message obtain;
        Bundle bundle;
        if (z) {
            if (this.f1539a.f4483q != LuaNil.nil && this.f1539a.f4483q != null) {
                obtain = Message.obtain();
                obtain.what = 7;
                obtain.obj = this.f1539a.f4483q;
                bundle = new Bundle(3);
                bundle.putSerializable("key0", this.f1539a);
                bundle.putSerializable("hideProgress", Boolean.valueOf(true));
                bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        } else if (this.f1539a.f4484r != LuaNil.nil && this.f1539a.f4484r != null) {
            obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = this.f1539a.f4484r;
            bundle = new Bundle(3);
            bundle.putSerializable("key0", this.f1539a);
            bundle.putSerializable("hideProgress", Boolean.valueOf(true));
            bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
