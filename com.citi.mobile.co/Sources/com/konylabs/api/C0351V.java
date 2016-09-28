package com.konylabs.api;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.gL;
import com.konylabs.api.ui.ii;
import com.konylabs.libintf.Library;

/* renamed from: com.konylabs.api.V */
final class C0351V implements Library {
    private Object[] f2399a;

    C0351V() {
        this.f2399a = null;
    }

    private static Object[] m2309a(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "Add ");
                }
                ((gL) objArr[0]).m4559a(objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "call popup addAt");
                }
                ((gL) objArr[0]).m4557a(objArr[1], (int) Double.parseDouble(objArr[2].toString()));
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "Displaying the popup");
                }
                ((gL) objArr[0]).m4566f();
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "Dismissing the popup");
                }
                ((gL) objArr[0]).m4568i();
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "SetContext for the the popup");
                }
                ((gL) objArr[0]).m4556a(objArr[1]);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "Destroying the popup");
                }
                ((gL) objArr[0]).m4569k();
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "remove");
                }
                if (objArr != null && objArr.length > 1) {
                    ((gL) objArr[0]).m4561b(objArr[1]);
                    return null;
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "RemoveAt");
                }
                ((gL) objArr[0]).m4554a((int) Double.parseDouble(objArr[1].toString()));
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "widgets");
                }
                return ((gL) objArr[0]).m4563c();
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "scrollToWidget");
                }
                ((gL) objArr[0]).m4562c(objArr[1]);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "scrollToBeginning");
                }
                ((gL) objArr[0]).m4564d();
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "scrolltoend");
                }
                ((gL) objArr[0]).m4565e();
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJECT /*12*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "getcurrentpopup");
                }
                return gL.m4545m();
            case KonyCustomWidget.NATIVE_DATA_TYPE_HASHTABLE /*13*/:
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "navigateTo");
                }
                ((gL) objArr[0]).m4555a((gL) objArr[1]);
                break;
        }
        return null;
    }

    public final Object[] execute(int i, Object[] objArr) {
        if (i == 0 && ((gL) objArr[0]).m4560b() == gL.f4139b) {
            C0351V.m2309a(i, objArr);
        } else if (i == 2 || i == 8 || i == 12) {
            return C0351V.m2309a(i, objArr);
        } else {
            if (i == 5) {
                synchronized (this) {
                    Object[] a;
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        a = C0351V.m2309a(i, objArr);
                        return a;
                    }
                    Object iiVar = new ii(new C0159W(this, i, objArr));
                    new Handler(Looper.getMainLooper()).post(iiVar);
                    iiVar.m1406a();
                    a = this.f2399a != null ? this.f2399a : null;
                    return a;
                }
            }
            KonyMain.m4094a(new C0160X(this, i, objArr));
        }
        return null;
    }

    public final String[] getMethods() {
        return new String[]{"add", "addat", "show", "dismiss", "setcontext", "destroy", "remove", "removeat", "widgets", "scrolltowidget", "scrolltobeginning", "scrolltoend", "getcurrentpopup", "navigateto"};
    }

    public final String getNameSpace() {
        return "popup";
    }
}
