package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;

public class cd {
    final /* synthetic */ gH f974a;

    cd(gH gHVar) {
        this.f974a = gHVar;
    }

    public void m1025a(LuaTable luaTable) {
        LuaNil table = this.f974a.getTable(gH.f4088c);
        if (table != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle(2);
            bundle.putSerializable("key0", this.f974a);
            bundle.putSerializable("key1", luaTable);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
