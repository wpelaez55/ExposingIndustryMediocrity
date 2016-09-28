package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class hI implements OnFocusChangeListener {
    private /* synthetic */ hD f1489a;

    hI(hD hDVar) {
        this.f1489a = hDVar;
    }

    public final void onFocusChange(View view, boolean z) {
        Message obtain;
        Bundle bundle;
        if (z) {
            if (this.f1489a.f4292x != LuaNil.nil && this.f1489a.f4292x != null) {
                obtain = Message.obtain();
                obtain.what = 7;
                obtain.obj = this.f1489a.f4292x;
                bundle = new Bundle(3);
                bundle.putSerializable("key0", this.f1489a);
                bundle.putSerializable("hideProgress", Boolean.valueOf(true));
                bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        } else if (this.f1489a.f4293y != LuaNil.nil && this.f1489a.f4293y != null) {
            obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = this.f1489a.f4293y;
            bundle = new Bundle(3);
            bundle.putSerializable("key0", this.f1489a);
            bundle.putSerializable("hideProgress", Boolean.valueOf(true));
            bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
