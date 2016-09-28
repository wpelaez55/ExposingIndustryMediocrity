package com.konylabs.api;

import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.fT;
import com.konylabs.api.ui.fX;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;

final class aw implements Library {
    aw() {
    }

    static /* synthetic */ Object[] m2341a(aw awVar, int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (objArr != null && objArr.length >= 3 && ((objArr[0] instanceof fT) || (objArr[0] instanceof fX))) {
                    if (!(objArr[0] instanceof fT)) {
                        if (objArr[0] instanceof fX) {
                            ((fX) objArr[0]).m4266a(objArr);
                            break;
                        }
                    }
                    ((fT) objArr[0]).m4248a(objArr);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to HorizontalImageStrip.addAll method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (objArr != null && objArr.length > 0 && ((objArr[0] instanceof fT) || (objArr[0] instanceof fX))) {
                    if (!(objArr[0] instanceof fT)) {
                        if (objArr[0] instanceof fX) {
                            ((fX) objArr[0]).m4267b();
                            break;
                        }
                    }
                    ((fT) objArr[0]).m4249b();
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to HorizontalImageStrip.removeAll method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (objArr != null && objArr.length >= 2 && ((objArr[0] instanceof fT) || (objArr[0] instanceof fX))) {
                    if (!(objArr[0] instanceof fT)) {
                        if (objArr[0] instanceof fX) {
                            ((fX) objArr[0]).m4264a(((Double) objArr[1]).intValue());
                            break;
                        }
                    }
                    ((fT) objArr[0]).m4246a(((Double) objArr[1]).intValue());
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to HorizontalImageStrip.removeAt method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (objArr != null && objArr.length >= 3 && ((objArr[0] instanceof fT) || (objArr[0] instanceof fX))) {
                    if (!(objArr[0] instanceof fT)) {
                        if (objArr[0] instanceof fX) {
                            ((fX) objArr[0]).m4267b();
                            ((fX) objArr[0]).m4266a(objArr);
                            break;
                        }
                    }
                    ((fT) objArr[0]).m4249b();
                    ((fT) objArr[0]).m4248a(objArr);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to HorizontalImageStrip.setData method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                if (objArr != null && objArr.length >= 3 && ((objArr[0] instanceof fT) || (objArr[0] instanceof fX))) {
                    if (!(objArr[0] instanceof fT)) {
                        if (objArr[0] instanceof fX) {
                            ((fX) objArr[0]).m4268b(objArr);
                            break;
                        }
                    }
                    ((fT) objArr[0]).m4250b(objArr);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to HorizontalImageStrip.setSata method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                if (objArr != null && objArr.length >= 3 && (objArr[0] instanceof fX)) {
                    ((fX) objArr[0]).m4269c(objArr);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to HorizontalImageStrip.setData method", 11001);
                break;
        }
        return null;
    }

    static /* synthetic */ Object[] m2342a(aw awVar, Object[] objArr) {
        return objArr;
    }

    public final Object[] execute(int i, Object[] objArr) {
        KonyMain.m4094a(new ax(this, i, objArr));
        return null;
    }

    public final String[] getMethods() {
        return new String[]{"addall", "removeall", "removeat", "setdata", "setdataat", "adddataat"};
    }

    public final String getNameSpace() {
        return "imagestrip";
    }
}
