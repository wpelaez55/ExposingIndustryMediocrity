package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class hH implements OnEditorActionListener {
    private /* synthetic */ hD f1488a;

    hH(hD hDVar) {
        this.f1488a = hDVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (this.f1488a.f4291w != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f1488a.f4291w;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f1488a);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
        return i == 6;
    }
}
