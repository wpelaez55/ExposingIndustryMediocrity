package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import com.konylabs.android.KonyMain;

final class hG implements TextWatcher {
    private /* synthetic */ hD f1487a;

    hG(hD hDVar) {
        this.f1487a = hDVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (KonyMain.f3657e) {
            Log.d("LuaTextField", "onTextChanged new string" + charSequence.toString());
        }
        if (this.f1487a.f4289u.f1153b && i3 == i2) {
            this.f1487a.f4289u.f1153b = false;
        } else if (this.f1487a.f4290v != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f1487a.f4290v;
            Bundle bundle = new Bundle(4);
            bundle.putSerializable("key0", this.f1487a);
            bundle.putSerializable("key1", charSequence.toString());
            bundle.putSerializable("hideProgress", Boolean.valueOf(true));
            bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
