package com.konylabs.api;

import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.gu;
import com.konylabs.api.ui.gx;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;

final class ay implements Library {
    ay() {
    }

    static /* synthetic */ Object[] m2343a(ay ayVar, int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (objArr != null && objArr.length >= 3 && ((objArr[0] instanceof gu) || (objArr[0] instanceof gx))) {
                    if (!(objArr[0] instanceof gu)) {
                        if (objArr[0] instanceof gx) {
                            ((gx) objArr[0]).m4618a(objArr);
                            break;
                        }
                    }
                    ((gu) objArr[0]).m4606a(objArr);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to ImageGallery.addAll method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (objArr != null && objArr.length > 0 && ((objArr[0] instanceof gu) || (objArr[0] instanceof gx))) {
                    if (!(objArr[0] instanceof gu)) {
                        if (objArr[0] instanceof gx) {
                            ((gx) objArr[0]).m4619b();
                            break;
                        }
                    }
                    ((gu) objArr[0]).m4607b();
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to ImageGallery.removeAll method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (objArr != null && objArr.length >= 2 && ((objArr[0] instanceof gu) || (objArr[0] instanceof gx))) {
                    if (!(objArr[0] instanceof gu)) {
                        if (objArr[0] instanceof gx) {
                            ((gx) objArr[0]).m4616a(((Double) objArr[1]).intValue());
                            break;
                        }
                    }
                    ((gu) objArr[0]).m4604a(((Double) objArr[1]).intValue());
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to ImageGallery.removeAt method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (objArr != null && objArr.length >= 3 && ((objArr[0] instanceof gu) || (objArr[0] instanceof gx))) {
                    if (!(objArr[0] instanceof gu)) {
                        if (objArr[0] instanceof gx) {
                            ((gx) objArr[0]).m4619b();
                            ((gx) objArr[0]).m4618a(objArr);
                            break;
                        }
                    }
                    ((gu) objArr[0]).m4607b();
                    ((gu) objArr[0]).m4606a(objArr);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to ImageGallery.setData method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                if (objArr != null && objArr.length >= 3 && ((objArr[0] instanceof gu) || (objArr[0] instanceof gx))) {
                    if (!(objArr[0] instanceof gu)) {
                        if (objArr[0] instanceof gx) {
                            ((gx) objArr[0]).m4620b(objArr);
                            break;
                        }
                    }
                    ((gu) objArr[0]).m4608b(objArr);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to ImageGallery.setDataAt method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                if (objArr != null && objArr.length >= 3 && (objArr[0] instanceof gx)) {
                    ((gx) objArr[0]).m4621c(objArr);
                    break;
                }
                throw new LuaError("Invalid number of arguments or invalid type of arguments to ImageGallery.addDataAt method", 11001);
                break;
        }
        return null;
    }

    static /* synthetic */ Object[] m2344a(ay ayVar, Object[] objArr) {
        return objArr;
    }

    public final Object[] execute(int i, Object[] objArr) {
        KonyMain.m4094a(new az(this, i, objArr));
        return null;
    }

    public final String[] getMethods() {
        return new String[]{"addall", "removeall", "removeat", "setdata", "setdataat", "adddataat"};
    }

    public final String getNameSpace() {
        return "gallery";
    }
}
