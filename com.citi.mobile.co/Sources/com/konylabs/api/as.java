package com.konylabs.api;

import android.os.Handler;
import android.os.Looper;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.hg;
import com.konylabs.api.ui.ii;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaTable;
import ny0k.bO;
import ny0k.cr;

final class as implements Library {
    private Object[] f2410a;

    as() {
        this.f2410a = null;
    }

    private static Object[] m2336a(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (objArr != null && objArr.length >= 2) {
                    if ((objArr[0] instanceof bO) && (objArr[1] instanceof LuaTable)) {
                        ((bO) objArr[0]).m4813b((LuaTable) objArr[1]);
                        break;
                    } else if (objArr[0] instanceof hg) {
                        ((hg) objArr[0]).m4710a(objArr);
                        break;
                    } else {
                        throw new LuaError("Invalid type of arguments to Segment addAll() method", 11001);
                    }
                }
                throw new LuaError("Invalid number of arguments to Segment addAll() method", 11001);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (objArr == null || objArr.length <= 0) {
                    throw new LuaError("Invalid number of arguments to Segment removeAll() method", 11001);
                } else if (objArr[0] instanceof bO) {
                    ((bO) objArr[0]).m4824f();
                    break;
                } else if (objArr[0] instanceof hg) {
                    ((hg) objArr[0]).m4716c();
                    break;
                } else {
                    throw new LuaError("Invalid type of arguments to Segment removeAll() method", 11001);
                }
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (objArr != null && objArr.length >= 2) {
                    if (!(objArr[0] instanceof bO)) {
                        if ((objArr[0] instanceof hg) && (objArr[1] instanceof Double)) {
                            ((hg) objArr[0]).m4705a(cr.m2199a(((Double) objArr[1]).intValue(), 0));
                            break;
                        }
                        throw new LuaError("Invalid type of arguments to Segment removeAt() method", 11001);
                    } else if (objArr.length != 2) {
                        if ((objArr[1] instanceof Double) && (objArr[2] instanceof Double)) {
                            ((bO) objArr[0]).m4798a(((Double) objArr[1]).intValue(), ((Double) objArr[2]).intValue(), false);
                            break;
                        }
                        throw new LuaError("Invalid type of arguments to Segment removeAt() method", 11001);
                    } else if (objArr[1] instanceof Double) {
                        ((bO) objArr[0]).m4828g(((Double) objArr[1]).intValue());
                        break;
                    } else {
                        throw new LuaError("Invalid type of arguments to Segment removeAt() method", 11001);
                    }
                }
                throw new LuaError("Invalid number of arguments to Segment removeAt() method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (objArr != null && objArr.length >= 2) {
                    if ((objArr[0] instanceof bO) && (objArr[1] instanceof LuaTable)) {
                        ((bO) objArr[0]).m4835j((LuaTable) objArr[1]);
                        break;
                    } else if (objArr[0] instanceof hg) {
                        ((hg) objArr[0]).m4714b(objArr);
                        break;
                    } else {
                        throw new LuaError("Invalid type of arguments to Segment setData() method", 11001);
                    }
                }
                throw new LuaError("Invalid number of arguments to Segment setData() method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                if (objArr != null && objArr.length >= 3) {
                    if (!(objArr[0] instanceof bO)) {
                        if ((objArr[0] instanceof hg) && (objArr[1] instanceof LuaTable) && (objArr[2] instanceof Double)) {
                            ((hg) objArr[0]).m4706a(cr.m2199a(((Double) objArr[2]).intValue(), 0), (LuaTable) objArr[1]);
                            break;
                        }
                        throw new LuaError("Invalid type of arguments to Segment setDataAt  method", 11001);
                    } else if (objArr.length != 3) {
                        if ((objArr[1] instanceof LuaTable) && (objArr[2] instanceof Double) && (objArr[3] instanceof Double)) {
                            ((bO) objArr[0]).m4801a((LuaTable) objArr[1], ((Double) objArr[2]).intValue(), ((Double) objArr[3]).intValue());
                            break;
                        }
                        throw new LuaError("Invalid type of arguments to Segment setDataAt  method", 11001);
                    } else if ((objArr[1] instanceof LuaTable) && (objArr[2] instanceof Double)) {
                        ((bO) objArr[0]).m4814b((LuaTable) objArr[1], ((Double) objArr[2]).intValue());
                        break;
                    } else {
                        throw new LuaError("Invalid type of arguments to Segment setDataAt method", 11001);
                    }
                }
                throw new LuaError("Invalid number of arguments to Segment setDataAt() method", 11001);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                if (objArr != null && objArr.length >= 3) {
                    if ((objArr[0] instanceof hg) && (objArr[1] instanceof LuaTable) && (objArr[2] instanceof Double)) {
                        ((hg) objArr[0]).m4711b(cr.m2199a(((Double) objArr[2]).intValue(), 0), (LuaTable) objArr[1]);
                        break;
                    }
                    throw new LuaError("Invalid type of arguments to Segment addAt method", 11001);
                }
                throw new LuaError("Invalid number of arguments to Segment addAt  method", 11001);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                if (objArr != null && objArr.length >= 2) {
                    if ((objArr[0] instanceof hg) && (objArr[1] instanceof LuaTable)) {
                        hg hgVar = (hg) objArr[0];
                        hgVar.m4716c();
                        hgVar.m4712b((LuaTable) objArr[1]);
                        break;
                    }
                    throw new LuaError("Invalid type of arguments to Segment setDataWithSections method", 11001);
                }
                throw new LuaError("Invalid number of arguments to Segment setDataWithSections method", 11001);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                if (objArr == null || objArr.length < 3) {
                    throw new LuaError("Invalid number of arguments to Segment addDataAt method", 11001);
                } else if (objArr[0] instanceof bO) {
                    if (objArr.length != 3) {
                        if ((objArr[1] instanceof LuaTable) && (objArr[2] instanceof Double) && (objArr[3] instanceof Double)) {
                            ((bO) objArr[0]).m4802a((LuaTable) objArr[1], ((Double) objArr[2]).intValue(), ((Double) objArr[3]).intValue(), false);
                            break;
                        }
                        throw new LuaError("Invalid type of arguments to Segment addDataAt method", 11001);
                    } else if ((objArr[1] instanceof LuaTable) && (objArr[2] instanceof Double)) {
                        ((bO) objArr[0]).m4819c((LuaTable) objArr[1], ((Double) objArr[2]).intValue());
                        break;
                    } else {
                        throw new LuaError("Invalid type of arguments to Segment addDataAt method", 11001);
                    }
                } else {
                    throw new LuaError("Invalid type of arguments to Segment addDataAt method", 11001);
                }
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                if (objArr != null && objArr.length >= 3) {
                    if ((objArr[0] instanceof bO) && (objArr[1] instanceof LuaTable) && (objArr[2] instanceof Double)) {
                        ((bO) objArr[0]).m4800a((LuaTable) objArr[1], ((Double) objArr[2]).intValue());
                        break;
                    }
                    throw new LuaError("Invalid type of arguments to Segment addSectionAt method", 11001);
                }
                throw new LuaError("Invalid number of arguments to Segment addSectionAt method", 11001);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                if (objArr != null && objArr.length >= 3) {
                    if ((objArr[0] instanceof bO) && (objArr[1] instanceof LuaTable) && (objArr[2] instanceof Double)) {
                        ((bO) objArr[0]).m4822d((LuaTable) objArr[1], ((Double) objArr[2]).intValue());
                        break;
                    }
                    throw new LuaError("Invalid type of arguments to Segment.setSectionAt method", 11001);
                }
                throw new LuaError("Invalid number of arguments to Segment setSectionAt method", 11001);
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                if (objArr != null && objArr.length >= 2) {
                    if ((objArr[0] instanceof bO) && (objArr[1] instanceof Double)) {
                        ((bO) objArr[0]).m4812b(((Double) objArr[1]).intValue());
                        break;
                    }
                    throw new LuaError("Invalid type of arguments to Segment removeSectionAt method", 11001);
                }
                throw new LuaError("Invalid number of arguments to Segment removeSectionAt method", 11001);
                break;
        }
        return null;
    }

    public final Object[] execute(int i, Object[] objArr) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m2336a(i, objArr);
        }
        Object iiVar = new ii(new at(this, i, objArr));
        new Handler(Looper.getMainLooper()).post(iiVar);
        iiVar.m1406a();
        return this.f2410a != null ? this.f2410a : null;
    }

    public final String[] getMethods() {
        return new String[]{"addall", "removeall", "removeat", "setdata", "setdataat", "addat", "setdatawithsections", "adddataat", "addsectionat", "setsectionat", "removesectionat"};
    }

    public final String getNameSpace() {
        return "segui";
    }
}
