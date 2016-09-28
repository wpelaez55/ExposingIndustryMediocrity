package com.konylabs.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.C0237a;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaTable;

/* renamed from: com.konylabs.api.l */
public final class C0363l implements Library {
    private static String[] f2428a;

    static {
        f2428a = new String[]{"connect"};
        LuaTable luaTable = new LuaTable(0, 1);
    }

    private static Object[] m2352a(Object[] objArr) {
        String str = (String) objArr[0];
        int intValue = ((Double) objArr[1]).intValue();
        int intValue2 = ((Double) objArr[2]).intValue();
        C0237a a = C0237a.m1647a();
        Log.d("DebugLib", "Connecting to server: " + str + " port: " + intValue + " with timeout: " + intValue2);
        a.m1668a(str, intValue, intValue2);
        if (a.m1672b()) {
            while (a.f1795a) {
                synchronized (a) {
                    try {
                        a.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
        return null;
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (KonyMain.f3657e) {
                    C0363l.m2352a(objArr);
                }
                return null;
            default:
                throw new LuaError("No such smethod error", 108);
        }
    }

    public final String[] getMethods() {
        return f2428a;
    }

    public final String getNameSpace() {
        return "debug";
    }
}
