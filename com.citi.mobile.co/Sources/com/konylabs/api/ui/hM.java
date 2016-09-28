package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import com.konylabs.android.KonyMain;
import ny0k.ch;

final class hM implements TextWatcher {
    private /* synthetic */ hJ f1492a;

    hM(hJ hJVar) {
        this.f1492a = hJVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (KonyMain.f3657e) {
            Log.d("LuaTextField", "onTextChanged new string" + charSequence.toString());
        }
        if (!(this.f1492a.f4323P == null || this.f1492a.f4324Q == null)) {
            this.f1492a.f4324Q.f2288c = charSequence.toString();
            ch a = this.f1492a.f4323P;
            this.f1492a.f4325R;
            a.m2165a(this.f1492a.f4324Q);
        }
        if (this.f1492a.f4325R.f1284a && i3 == i2) {
            this.f1492a.f4325R.f1284a = false;
        } else if (this.f1492a.f4326S != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f1492a.f4326S;
            Bundle bundle = new Bundle(4);
            bundle.putSerializable("key0", this.f1492a);
            bundle.putSerializable("key1", charSequence.toString());
            bundle.putSerializable("hideProgress", Boolean.valueOf(true));
            bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
