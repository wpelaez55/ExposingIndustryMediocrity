package com.konylabs.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.gJ;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaTable;

final class af implements Library {
    af() {
    }

    static /* synthetic */ Object[] m2324a(af afVar, int i, Object[] objArr) {
        if (i == 0) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Executing pickerview.setcomponentdata() method");
            }
            if (objArr == null || objArr.length < 3) {
                throw new LuaError("Invalid number of arguments or invalid type of arguments to pickerview.setcomponentdata() method", 11001);
            }
            ((gJ) objArr[0]).m4530a(((Double) objArr[1]).intValue(), (LuaTable) objArr[2]);
        } else if (i == 1) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Executing pickerview.setselectedkeyincomponent() method");
            }
            if (objArr == null || objArr.length < 3) {
                throw new LuaError("Invalid number of arguments or invalid type of arguments to pickerview.setcomponentdata() method", 11001);
            }
            ((gJ) objArr[0]).m4532a((String) objArr[1], ((Double) objArr[2]).intValue());
        }
        return null;
    }

    public final Object[] execute(int i, Object[] objArr) {
        KonyMain.m4094a(new ag(this, i, objArr));
        return null;
    }

    public final String[] getMethods() {
        return new String[]{"setcomponentdata", "setselectedkeyincomponent"};
    }

    public final String getNameSpace() {
        return "pickerview";
    }
}
