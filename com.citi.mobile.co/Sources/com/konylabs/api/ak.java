package com.konylabs.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.fm;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;

final class ak implements Library {
    ak() {
    }

    static /* synthetic */ Object[] m2328a(ak akVar, int i, Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowsLib", "Executing the method index : " + i);
        }
        if (objArr == null || objArr.length == 0 || objArr[0] == LuaNil.nil) {
            throw new LuaError(11001, "chart2d3dlib", "Invalid number of arguments or invalid type of arguments to chart2d3dlib methods");
        }
        if (i == 0) {
            if (objArr.length >= 2) {
                fm.m4332a(objArr[1]);
            }
        } else if (i == 1) {
            if (objArr.length >= 2) {
                ((fm) objArr[0]).m4334b(objArr[1]);
            }
        } else if (i == 2) {
            if (objArr.length >= 2) {
                ((fm) objArr[0]).m4335c(objArr[1]);
            }
        } else if (i == 3) {
            if (objArr.length >= 2) {
                ((fm) objArr[0]).m4336d(objArr[1]);
            }
        } else if (i == 4 && objArr.length >= 2) {
            ((fm) objArr[0]).m4337e(objArr[1]);
        }
        return null;
    }

    static /* synthetic */ Object[] m2329a(ak akVar, Object[] objArr) {
        return objArr;
    }

    public final Object[] execute(int i, Object[] objArr) {
        KonyMain.m4094a(new al(this, i, objArr));
        return null;
    }

    public final String[] getMethods() {
        return new String[]{"updatedata", "setdata", "adddata", "setProperties", "setEvents"};
    }

    public final String getNameSpace() {
        return "chart2d3d";
    }
}
