package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import java.io.Serializable;

final class eY implements OnClickListener {
    private /* synthetic */ eO f1274a;

    eY(eO eOVar) {
        this.f1274a = eOVar;
    }

    public final void onClick(View view) {
        Serializable serializable = null;
        if (this.f1274a.f3731t != null) {
            serializable = this.f1274a.f3731t.m1451a(this.f1274a.f3732u);
        }
        if (this.f1274a.f3727p != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f1274a.f3727p;
            Bundle bundle = new Bundle(2);
            bundle.putSerializable("key0", this.f1274a);
            if (serializable != null) {
                bundle.putSerializable("key1", serializable);
            }
            bundle.putSerializable("DropMultipleTaps", Boolean.valueOf(true));
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
