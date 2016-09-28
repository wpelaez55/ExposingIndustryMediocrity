package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.io.Serializable;

public class cU {
    final /* synthetic */ gX f964a;

    cU(gX gXVar) {
        this.f964a = gXVar;
    }

    public void m1022a(View view, String str, String str2) {
        Serializable serializable = null;
        Serializable a = this.f964a.f4200i != null ? this.f964a.f4200i.m1451a(this.f964a.f4201j) : null;
        LuaNil table = this.f964a.getTable(gX.f4192a);
        if (table != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle();
            bundle.putSerializable("key0", this.f964a);
            bundle.putString("key1", str);
            if (str2 != null) {
                serializable = new LuaTable(2, 0);
                serializable.setTable("href", str2);
            }
            String str3 = "key2";
            if (str2 == null) {
                serializable = LuaNil.nil;
            }
            bundle.putSerializable(str3, serializable);
            if (a != null) {
                bundle.putSerializable("key3", a);
            }
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
            return;
        }
        KonyMain.m4120e(str2);
    }
}
