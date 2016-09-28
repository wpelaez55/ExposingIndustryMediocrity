package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class hQ implements ex {
    private /* synthetic */ hP f3007a;

    hQ(hP hPVar) {
        this.f3007a = hPVar;
    }

    public final void m3333a(boolean z) {
        LuaNil luaNil = LuaNil.nil;
        luaNil = z ? this.f3007a.getTable(hP.f4342d) : this.f3007a.getTable(hP.f4343e);
        if (luaNil != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = luaNil;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this.f3007a);
            bundle.putSerializable("hideProgress", Boolean.valueOf(!this.f3007a.f4363B));
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
