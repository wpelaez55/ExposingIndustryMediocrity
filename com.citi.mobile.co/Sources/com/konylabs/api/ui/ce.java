package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;

public class ce {
    final /* synthetic */ gH f975a;

    ce(gH gHVar) {
        this.f975a = gHVar;
    }

    public void m1026a(LuaTable luaTable) {
        LuaNil table = this.f975a.getTable(gH.f4089d);
        if (table != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle(2);
            bundle.putSerializable("key0", this.f975a);
            bundle.putSerializable("key1", luaTable);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
