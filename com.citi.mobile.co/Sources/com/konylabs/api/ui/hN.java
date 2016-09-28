package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class hN implements OnEditorActionListener {
    private /* synthetic */ hJ f1493a;

    hN(hJ hJVar) {
        this.f1493a = hJVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (!(i == 0 || this.f1493a.f4327T == LuaNil.nil)) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f1493a.f4327T;
            Bundle bundle = new Bundle(3);
            bundle.putSerializable("key0", this.f1493a);
            if (i == 5 || (KonyMain.f3656d >= 11 && i == 7)) {
                bundle.putSerializable("hideProgress", Boolean.valueOf(true));
                bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
            }
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
        return false;
    }
}
