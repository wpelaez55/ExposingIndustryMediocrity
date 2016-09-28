package com.konylabs.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.fg;
import com.konylabs.api.ui.hp;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;

final class aa implements Library {
    aa() {
    }

    static /* synthetic */ Object[] m2319a(aa aaVar, int i, Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowsLib", "Executing the method index : " + i + "  params[0]:" + objArr[0]);
        }
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (objArr != null && objArr.length <= 1 && (objArr[0] instanceof fg)) {
                    ((fg) objArr[0]).m4310b();
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to calendar.clear method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (objArr != null && (objArr[0] instanceof fg)) {
                    if (objArr.length == 2) {
                        ((fg) objArr[0]).setEnabled(((Boolean) objArr[1]).booleanValue());
                        break;
                    } else if (objArr.length == 4) {
                        if (objArr[2] == LuaNil.nil) {
                            ((fg) objArr[0]).m4306a((LuaTable) objArr[1], null, (Boolean) objArr[3]);
                            break;
                        }
                        ((fg) objArr[0]).m4306a((LuaTable) objArr[1], objArr[2], (Boolean) objArr[3]);
                        break;
                    } else if (objArr.length == 5) {
                        if (objArr[3] == LuaNil.nil) {
                            ((fg) objArr[0]).m4304a((LuaTable) objArr[1], (LuaTable) objArr[2], null, (Boolean) objArr[4]);
                            break;
                        }
                        ((fg) objArr[0]).m4304a((LuaTable) objArr[1], (LuaTable) objArr[2], objArr[3], (Boolean) objArr[4]);
                        break;
                    } else {
                        throw new LuaError("Invalid number of arguments or invalid type of arguments to calendar.setenabled method", 11001);
                    }
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof fg)) {
                    ((fg) objArr[0]).m4311c();
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to calendar.setenableall method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (objArr != null && objArr.length >= 3 && (objArr[0] instanceof fg)) {
                    if (objArr[2] == LuaNil.nil) {
                        ((fg) objArr[0]).m4305a((LuaTable) objArr[1], null);
                        break;
                    }
                    ((fg) objArr[0]).m4305a((LuaTable) objArr[1], objArr[2]);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to calendar.setdateskin method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                if (objArr != null && (objArr[0] instanceof fg)) {
                    if (objArr.length == 5) {
                        if ((objArr[1] instanceof LuaTable) && (objArr[2] instanceof LuaTable) && ((objArr[3] == null || (objArr[3] instanceof hp) || (objArr[3] instanceof String)) && (objArr[4] instanceof Boolean))) {
                            if (objArr[3] == LuaNil.nil) {
                                ((fg) objArr[0]).m4304a((LuaTable) objArr[1], (LuaTable) objArr[2], null, (Boolean) objArr[4]);
                                break;
                            }
                            ((fg) objArr[0]).m4304a((LuaTable) objArr[1], (LuaTable) objArr[2], objArr[3], (Boolean) objArr[4]);
                            break;
                        }
                        throw new LuaError(100, "Error", "Invalid type of arguments to calendar.enablerangeofdates method");
                    }
                    throw new LuaError(101, "Error", "Invalid number of arguments  to calendar.enablerangeofdates method");
                }
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                if (objArr != null && objArr.length >= 2 && (objArr[0] instanceof fg) && (objArr[1] instanceof LuaTable)) {
                    ((fg) objArr[0]).b_((LuaTable) objArr[1]);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to calendar.setData method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                if (objArr != null && objArr.length >= 3 && (objArr[0] instanceof fg) && (objArr[1] instanceof String) && (objArr[2] instanceof LuaTable)) {
                    ((fg) objArr[0]).m4309a((String) objArr[1], (LuaTable) objArr[2]);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to calendar.setDataAt method", 11001);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                if (objArr != null && objArr.length >= 2 && (objArr[0] instanceof fg) && (objArr[1] instanceof String)) {
                    ((fg) objArr[0]).m4308a((String) objArr[1]);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to calendar.removeDataAt method", 11001);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof fg)) {
                    ((fg) objArr[0]).m4312d();
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to calendar.clearData method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof fg)) {
                    ((fg) objArr[0]).m4313e();
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to calendar.navigateToPreviousMonth method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof fg)) {
                    ((fg) objArr[0]).m4314f();
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to calendar.navigateToNextMonth method", 11001);
                break;
            default:
                return null;
        }
        return null;
    }

    static /* synthetic */ Object[] m2320a(aa aaVar, Object[] objArr) {
        return objArr;
    }

    public final Object[] execute(int i, Object[] objArr) {
        KonyMain.m4094a(new ab(this, i, objArr));
        return null;
    }

    public final String[] getMethods() {
        return new String[]{"clear", "setenabled", "setenableall", "setdateskin", "enablerangeofdates", "setData", "setDataAt", "removeDataAt", "clearData", "navigateToPreviousMonth", "navigateToNextMonth"};
    }

    public final String getNameSpace() {
        return "calendar";
    }
}
