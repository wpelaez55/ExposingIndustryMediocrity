package com.konylabs.api;

import android.os.Handler;
import android.os.Looper;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.dB;
import com.konylabs.api.ui.eI;
import com.konylabs.api.ui.ii;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import ny0k.cN;

final class aA implements Library {
    private Object[] f2401a;

    aA() {
        this.f2401a = null;
    }

    private static Object[] m2315a(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (objArr != null && objArr.length >= 3) {
                    eI.m3275a().m3282a((LuaTable) objArr[0]);
                    if (objArr[1] != LuaNil.nil) {
                        eI.m3275a();
                        eI.m3276a(cN.m2139a(objArr[1]));
                    }
                    if (objArr[2] != LuaNil.nil) {
                        eI.m3275a();
                        eI.m3278b(cN.m2139a(objArr[2]));
                        break;
                    }
                }
                throw new LuaError("Invalid number of arguments to kony.application.setAppMenu", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (objArr != null && objArr.length > 0) {
                    eI.m3275a().m3280a(((Double) objArr[0]).intValue() - 1);
                    break;
                }
                throw new LuaError("Invalid number of arguments to kony.application.setAppMenuFocusIndex", 11001);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (objArr != null && objArr.length > 0) {
                    eI.m3275a().m3288b((LuaTable) objArr[0]);
                    break;
                }
                throw new LuaError("Invalid number of arguments to kony.application.hideAppMenuItems", 11001);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (objArr != null && objArr.length > 0) {
                    eI.m3275a().m3290c((LuaTable) objArr[0]);
                    break;
                }
                throw new LuaError("Invalid number of arguments to kony.application.showAppMenuItems", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                if (objArr != null && objArr.length >= 2) {
                    eI.m3275a().m3287a(objArr);
                    break;
                }
                throw new LuaError("Invalid number of arguments to kony.application.addAppMenuItem", 11001);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                if (objArr != null && objArr.length > 0) {
                    eI.m3275a().m3289b((String) objArr[0]);
                    break;
                }
                throw new LuaError("Invalid number of arguments to kony.application.removeAppMenuItem", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                if (objArr != null && objArr.length >= 2) {
                    if (objArr[0] != LuaNil.nil) {
                        LuaTable luaTable = objArr[1] != LuaNil.nil ? (LuaTable) objArr[1] : new LuaTable();
                        dB a = (objArr.length <= 2 || objArr[2] == LuaNil.nil) ? null : cN.m2139a(objArr[2]);
                        dB a2 = (objArr.length <= 3 || objArr[3] == LuaNil.nil) ? null : cN.m2139a(objArr[3]);
                        eI.m3275a().m3286a((String) objArr[0], luaTable, a, a2);
                        break;
                    }
                    throw new LuaError("Invalid arguments to kony.application.createAppMenu", 11001);
                }
                throw new LuaError("Invalid number of arguments to kony.application.createAppMenu", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                if (objArr != null && objArr.length > 0) {
                    eI.m3275a().m3283a((String) objArr[0]);
                    break;
                }
                throw new LuaError("Invalid number of arguments to kony.application.setCurrentAppMenu", 11001);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                eI.m3275a();
                return new Object[]{eI.m3277b()};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                if (objArr != null && objArr.length > 0) {
                    eI.m3275a();
                    eI.m3279c();
                    break;
                }
                throw new LuaError("Invalid number of arguments to kony.application.setAppMenuFocusByID", 11001);
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                if (objArr != null && objArr.length >= 2) {
                    eI.m3275a().m3285a((String) objArr[0], ((Double) objArr[1]).intValue(), (LuaTable) objArr[2]);
                    break;
                }
                throw new LuaError("Invalid number of arguments to kony.application.addAppMenuItemAt", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                if (objArr != null && objArr.length > 0) {
                    eI.m3275a().m3284a((String) objArr[0], ((Double) objArr[1]).intValue());
                    break;
                }
                throw new LuaError("Invalid number of arguments to kony.application.removeAppMenuItemAt", 11001);
        }
        return null;
    }

    public final Object[] execute(int i, Object[] objArr) {
        Object[] objArr2 = null;
        if (i == 8) {
            synchronized (this) {
                this.f2401a = null;
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    objArr2 = m2315a(i, objArr);
                } else {
                    Object iiVar = new ii(new aB(this, i, objArr));
                    new Handler(Looper.getMainLooper()).post(iiVar);
                    iiVar.m1406a();
                    if (this.f2401a != null) {
                        objArr2 = this.f2401a;
                    }
                }
            }
        } else {
            KonyMain.m4094a(new aC(this, i, objArr));
        }
        return objArr2;
    }

    public final String[] getMethods() {
        return new String[]{"setappmenu", "setappmenufocusindex", "hideappmenuitems", "showappmenuitems", "addappmenuitem", "removeappmenuitem", "createappmenu", "setcurrentappmenu", "getcurrentappmenu", "setappmenufocusbyid", "addappmenuitemat", "removeappmenuitemat"};
    }

    public final String getNameSpace() {
        return null;
    }
}
