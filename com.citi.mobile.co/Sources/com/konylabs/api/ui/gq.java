package com.konylabs.api.ui;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;

final class gq extends Function {
    gq(gb gbVar) {
    }

    public final synchronized Object[] execute(Object[] objArr) throws Exception {
        Object[] objArr2;
        objArr2 = new Object[]{Boolean.valueOf(true)};
        String g = gb.f4576D.m4664g();
        KonyMain.getActContext();
        String m = KonyMain.m4136m();
        if (KonyMain.f3657e) {
            Log.d("LuaHybridForm::SPABackKeyHandler  Form Entry URL = ", "file:///android_asset/web/index.html#_" + m);
            Log.d("LuaHybridForm::SPABackKeyHandler  Current URL = ", g);
        }
        if (!gb.f4578Q || g == null || "file:///android_asset/web/index.html".equals(g) || g.equals("file:///android_asset/web/index.html#_" + m)) {
            objArr2[0] = Boolean.valueOf(false);
        }
        gb.f4576D.m4660c();
        return objArr2;
    }
}
