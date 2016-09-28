package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import java.io.Serializable;

final class ff implements OnClickListener {
    private /* synthetic */ fe f1427a;

    ff(fe feVar) {
        this.f1427a = feVar;
    }

    public final void onClick(View view) {
        Serializable serializable = null;
        if (this.f1427a.f3826r != null) {
            serializable = this.f1427a.f3826r.m1451a(this.f1427a.f3827s);
        }
        LuaNil table = this.f1427a.getTable(fe.f3809a);
        if (table != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle(3);
            bundle.putSerializable("key0", this.f1427a);
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
