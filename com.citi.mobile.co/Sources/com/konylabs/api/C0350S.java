package com.konylabs.api;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.api.ui.eK;
import com.konylabs.api.ui.eO;
import com.konylabs.api.ui.fv;
import com.konylabs.api.ui.ii;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;

/* renamed from: com.konylabs.api.S */
final class C0350S implements Library {
    private Object[] f2397a;

    C0350S() {
        this.f2397a = null;
    }

    private static Object[] m2298a(int i, Object[] objArr) {
        String str;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "Calling Widget .setvisibility");
                }
                if (objArr[0] != null && objArr.length != 0) {
                    if (objArr.length <= 2) {
                        ((LuaWidget) objArr[0]).setVisibility(((Boolean) objArr[1]).booleanValue());
                        break;
                    }
                    ((LuaWidget) objArr[0]).setVisibility(((Boolean) objArr[1]).booleanValue(), objArr[2]);
                    break;
                }
                throw new LuaError("Invalid parameters specified for widget setVisbility", 900);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "Calling Widget .setfontcolor");
                }
                if (objArr[0] != null && objArr.length != 0) {
                    ((LuaWidget) objArr[0]).setFontColor(objArr);
                    break;
                }
                throw new LuaError("Invalid parameters specified for widget setFontColor", 900);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "Calling Widget .setfocus");
                }
                if (objArr[0] != null && objArr.length != 0) {
                    ((LuaWidget) objArr[0]).setFocus();
                    break;
                }
                throw new LuaError("Invalid parameters specified for widget setFocus", 900);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "Calling Widget .setEnable");
                }
                if (objArr[0] != null && objArr.length != 0) {
                    if (objArr.length != 2) {
                        if (!((Boolean) objArr[1]).booleanValue()) {
                            eK a = eK.m3294a();
                            LuaNil table = ((LuaTable) objArr[2]).getTable("contenttobedisplayed");
                            if (table != LuaNil.nil) {
                                a.m3305a(table.toString());
                            }
                            a.m3308c();
                            break;
                        }
                        eK.m3294a().m3309d();
                        break;
                    }
                    ((LuaWidget) objArr[0]).setEnabled(((Boolean) objArr[1]).booleanValue());
                    break;
                }
                throw new LuaError("Invalid parameters specified for widget setEnabled", 900);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                if (objArr[0] == null || objArr.length < 4) {
                    throw new LuaError("Invalid parameters specified for widget setGestureRecognizer() API", 900);
                }
                int parseDouble = (int) Double.parseDouble(objArr[1].toString());
                if (objArr[0] instanceof eO) {
                    return new Object[]{((eO) objArr[0]).m4202a(parseDouble, objArr[2], objArr[3])};
                } else if (objArr[0] instanceof fv) {
                    return new Object[]{((fv) objArr[0]).m4430a(parseDouble, objArr[2], objArr[3])};
                }
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                if (objArr[0] != null && objArr.length >= 2) {
                    if (!(objArr[0] instanceof eO)) {
                        if (objArr[0] instanceof fv) {
                            ((fv) objArr[0]).m4445b(objArr[1]);
                            break;
                        }
                    }
                    ((eO) objArr[0]).m4208a(objArr[1]);
                    break;
                }
                throw new LuaError("Invalid parameters specified for widget removeGestureRecognizer API", 900);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                if (objArr == null || objArr.length < 3) {
                    throw new LuaError("Invalid parameters specified for widget setGesturerecognizerForAllForms() API", 900);
                }
                int parseDouble2 = (int) Double.parseDouble(objArr[0].toString());
                return new Object[]{fv.m4398b(parseDouble2, objArr[1], objArr[2])};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                if (objArr != null && objArr.length > 0) {
                    fv.m4404c(objArr[0]);
                    break;
                }
                throw new LuaError("Invalid parameters specified for widget removeGestureRecognizerForAllForms() API", 900);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                if (objArr[0] != null) {
                    if ((objArr.length == 2 && (objArr[1] instanceof String)) || (objArr.length == 3 && (objArr[1] instanceof String))) {
                        str = (objArr.length == 3 && (objArr[2] instanceof String)) ? (String) objArr[2] : null;
                        if (objArr[0] instanceof LuaWidget) {
                            ((LuaWidget) objArr[0]).setBadge((String) objArr[1], str);
                            break;
                        }
                    }
                    throw new LuaError("Invalid type of arguments for widget setBadge() API", 11001);
                }
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                if (objArr[0] instanceof LuaWidget) {
                    str = ((LuaWidget) objArr[0]).getBadge();
                    Object[] objArr2 = new Object[1];
                    objArr2[0] = str == null ? LuaNil.nil : new String(str);
                    return objArr2;
                }
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "Calling Widget .applyAnimation");
                }
                if (objArr[0] != null && objArr.length == 4 && (objArr[1] instanceof LuaTable)) {
                    ((LuaWidget) objArr[0]).applyAnimation((LuaTable) objArr[1], objArr[2], objArr[3]);
                    break;
                }
                throw new LuaError("Invalid parameters specified for widget applyAnimation()", 900);
                break;
        }
        return null;
    }

    public final Object[] execute(int i, Object[] objArr) {
        if (i == 9 || i == 4 || i == 6) {
            synchronized (this) {
                this.f2397a = null;
                Object[] a;
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    a = C0350S.m2298a(i, objArr);
                    return a;
                }
                Object iiVar = new ii(new C0157T(this, i, objArr));
                new Handler(Looper.getMainLooper()).post(iiVar);
                iiVar.m1406a();
                a = this.f2397a != null ? this.f2397a : null;
                return a;
            }
        }
        if (i == 0 && objArr.length > 1 && objArr[0] != null) {
            ((LuaWidget) objArr[0]).setProperty(LuaWidget.ATTR_WIDGET_ISVISIBLE, Boolean.valueOf(((Boolean) objArr[1]).booleanValue()));
        }
        KonyMain.m4094a(new C0158U(this, i, objArr));
        return null;
    }

    public final String[] getMethods() {
        return new String[]{"setvisibility", "setfontcolor", "setfocus", "setenabled", "setgesturerecognizer", "removegesturerecognizer", "setgesturerecognizerforallforms", "removegesturerecognizerforallforms", "setbadge", "getbadge", "applyAnimation"};
    }

    public final String getNameSpace() {
        return "widget";
    }
}
