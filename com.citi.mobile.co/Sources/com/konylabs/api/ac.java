package com.konylabs.api;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.hP;
import com.konylabs.api.ui.ii;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import ny0k.C0444X;
import ny0k.cq;

final class ac implements Library {
    private Object[] f2403a;

    ac() {
        this.f2403a = null;
    }

    private static Object[] m2321a(int i, Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowsLib", "Executing the method index : " + i);
        }
        if (objArr == null || objArr.length == 0 || objArr[0] == LuaNil.nil) {
            return null;
        }
        if (i == 0) {
            ((hP) objArr[0]).m4660c();
            return null;
        } else if (i == 1) {
            ((hP) objArr[0]).m4661d();
            return null;
        } else if (i == 2) {
            ((hP) objArr[0]).m4665h();
            return null;
        } else if (i == 3) {
            return new Object[]{Boolean.valueOf(((hP) objArr[0]).m4666i())};
        } else if (i == 4) {
            return new Object[]{Boolean.valueOf(((hP) objArr[0]).m4667j())};
        } else if (i == 5) {
            ((hP) objArr[0]).m4668k();
            return null;
        } else if (i != 6) {
            return null;
        } else {
            if (objArr == null || objArr.length <= 1) {
                throw new LuaError(101, "Error", "Invalid number of arguments");
            } else if ((objArr[1] instanceof String) || (objArr[1] instanceof C0444X) || (objArr[1] instanceof cq) || (objArr[1] instanceof byte[])) {
                LuaTable luaTable;
                if (objArr.length <= 2) {
                    luaTable = null;
                } else if (objArr[2] instanceof LuaTable) {
                    luaTable = (LuaTable) objArr[2];
                } else {
                    throw new LuaError(100, "Error", "Invalid type of parameters");
                }
                ((hP) objArr[0]).m4654a(objArr[1], luaTable);
                return null;
            } else {
                throw new LuaError(100, "Error", "Invalid type of parameters");
            }
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        if (i == 6) {
            m2321a(i, objArr);
        } else if (i == 3 || i == 4) {
            Object iiVar = new ii(new ad(this, i, objArr));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
        } else {
            KonyMain.m4094a(new ae(this, i, objArr));
        }
        return this.f2403a;
    }

    public final String[] getMethods() {
        return new String[]{"goback", "goforward", "reload", "cangoback", "cangoforward", "clearhistory", "loaddata"};
    }

    public final String getNameSpace() {
        return "webwidget";
    }
}
