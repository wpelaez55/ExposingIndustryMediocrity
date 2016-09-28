package com.konylabs.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.hq;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;

/* renamed from: com.konylabs.api.Y */
final class C0352Y implements Library {
    C0352Y() {
    }

    private static Object[] m2312a(int i, Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowsLib", "Executing the method index : " + i + "  params[0]:" + objArr[0]);
        }
        if (i == 0) {
            if (objArr == null || objArr.length < 2) {
                throw new LuaError("Invalid number of arguments to TabPane.add()", 11001);
            }
            ((hq) objArr[0]).m4728a(objArr);
        } else if (i == 1) {
            ((hq) objArr[0]).m4729b(objArr);
        } else if (i == 2) {
            ((hq) objArr[0]).m4732c(objArr);
        } else if (i == 3) {
            ((hq) objArr[0]).m4734d(objArr);
        }
        return null;
    }

    static /* synthetic */ Object[] m2314a(C0352Y c0352y, Object[] objArr) {
        return objArr;
    }

    public final Object[] execute(int i, Object[] objArr) {
        if (i == 0 && ((hq) objArr[0]).m4731c() == hq.KONY_WIDGET_BACKUP) {
            return C0352Y.m2312a(i, objArr);
        }
        KonyMain.m4094a(new C0161Z(this, i, objArr));
        return null;
    }

    public final String[] getMethods() {
        return new String[]{"addtab", "addtabat", "removetabat", "removetabbyid"};
    }

    public final String getNameSpace() {
        return "tabwidget";
    }
}
