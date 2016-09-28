package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class hO implements OnFocusChangeListener {
    private /* synthetic */ hJ f1494a;

    hO(hJ hJVar) {
        this.f1494a = hJVar;
    }

    public final void onFocusChange(View view, boolean z) {
        Message obtain;
        Bundle bundle;
        if (z) {
            if (this.f1494a.f4335z != LuaNil.nil && this.f1494a.f4335z != null) {
                obtain = Message.obtain();
                obtain.what = 7;
                obtain.obj = this.f1494a.f4335z;
                bundle = new Bundle(3);
                bundle.putSerializable("key0", this.f1494a);
                bundle.putSerializable("hideProgress", Boolean.valueOf(true));
                bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        } else if (this.f1494a.f4320A != LuaNil.nil && this.f1494a.f4320A != null) {
            obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = this.f1494a.f4320A;
            bundle = new Bundle(3);
            bundle.putSerializable("key0", this.f1494a);
            bundle.putSerializable("hideProgress", Boolean.valueOf(true));
            bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
