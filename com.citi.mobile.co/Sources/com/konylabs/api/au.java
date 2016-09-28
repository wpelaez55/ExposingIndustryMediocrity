package com.konylabs.api;

import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.fs;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaTable;

final class au implements Library {
    au() {
    }

    static /* synthetic */ Object[] m2339a(au auVar, int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (objArr != null && objArr.length >= 2 && (objArr[0] instanceof fs)) {
                    ((fs) objArr[0]).m4368a(objArr);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to datagrid.addall method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof fs)) {
                    ((fs) objArr[0]).m4369b();
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to datagrid.removeall method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (objArr != null && objArr.length >= 2 && (objArr[0] instanceof fs)) {
                    ((fs) objArr[0]).m4365a(((Double) objArr[1]).intValue());
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to datagrid.removeat method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (objArr != null && objArr.length >= 2 && (objArr[0] instanceof fs)) {
                    ((fs) objArr[0]).m4371b(objArr);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to datagrid.setdata method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                if (objArr != null && objArr.length >= 3 && (objArr[0] instanceof fs)) {
                    if (!(objArr[1] instanceof Double) || !(objArr[2] instanceof LuaTable) || !KonyMain.m4056B()) {
                        if ((objArr[1] instanceof LuaTable) && (objArr[2] instanceof Double)) {
                            ((fs) objArr[0]).m4366a(((Double) objArr[2]).intValue(), (LuaTable) objArr[1]);
                            break;
                        }
                        throw new LuaError("Invalid number of arguments or invalid type of arguments to datagrid.setdataat method", 11001);
                    }
                    ((fs) objArr[0]).m4366a(((Double) objArr[1]).intValue(), (LuaTable) objArr[2]);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to datagrid.setdataat method", 11001);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                if (objArr != null && objArr.length >= 3 && (objArr[0] instanceof fs)) {
                    if (!(objArr[1] instanceof Double) || !(objArr[2] instanceof LuaTable) || !KonyMain.m4056B()) {
                        if ((objArr[1] instanceof LuaTable) && (objArr[2] instanceof Double)) {
                            ((fs) objArr[0]).m4370b(((Double) objArr[2]).intValue(), (LuaTable) objArr[1]);
                            break;
                        }
                        throw new LuaError("Invalid number of arguments or invalid type of arguments to datagrid.addat method", 11001);
                    }
                    ((fs) objArr[0]).m4370b(((Double) objArr[1]).intValue(), (LuaTable) objArr[2]);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to datagrid.addat method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                if (objArr != null && objArr.length >= 4 && (objArr[0] instanceof fs)) {
                    ((fs) objArr[0]).m4373d(objArr);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to datagrid.applycellskin method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                if (objArr != null && objArr.length >= 2 && (objArr[0] instanceof fs)) {
                    ((fs) objArr[0]).m4374e(objArr);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to datagrid.selectall method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                if (objArr != null && objArr.length >= 4 && (objArr[0] instanceof fs)) {
                    ((fs) objArr[0]).m4372c(objArr);
                    break;
                }
                throw new LuaError("Invalid number of arguments or ivalid type of arguments to datagrid.setcelldata method", 11001);
        }
        return null;
    }

    static /* synthetic */ Object[] m2340a(au auVar, Object[] objArr) {
        return objArr;
    }

    public final Object[] execute(int i, Object[] objArr) {
        KonyMain.m4094a(new av(this, i, objArr));
        return null;
    }

    public final String[] getMethods() {
        return new String[]{"addall", "removeall", "removeat", "setdata", "setdataat", "addat", "applycellskin", "selectall", "setcelldata", "adddataat", "setcelldataat", "selectallrows"};
    }

    public final String getNameSpace() {
        return "datagrid";
    }
}
