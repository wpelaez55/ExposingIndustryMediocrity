package com.konylabs.api.ui;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;

final class gr extends Function {
    gr(gb gbVar) {
    }

    public final synchronized Object[] execute(Object[] objArr) throws Exception {
        Object[] objArr2;
        objArr2 = new Object[]{Boolean.valueOf(true)};
        String g = gb.f4577P.m4664g();
        KonyMain.getActContext();
        String m = KonyMain.m4136m();
        if (KonyMain.f3657e) {
            Log.d("LuaHybridForm::TCBackKeyHandler  Form Entry URL = ", gb.f4580T + "#_" + m);
            Log.d("LuaHybridForm::TCBackKeyHandler  Current URL = ", g);
        }
        if (!gb.f4579R || g == null || gb.f4580T.equals(g) || (gb.f4580T + "#_" + m).equals(g)) {
            objArr2[0] = Boolean.valueOf(false);
        }
        gb.f4577P.m4660c();
        return objArr2;
    }
}
