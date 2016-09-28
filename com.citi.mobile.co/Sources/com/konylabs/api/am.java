package com.konylabs.api;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.fv;
import com.konylabs.api.ui.ii;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaNil;
import java.util.HashMap;
import ny0k.cr;

final class am implements Library {
    private Object[] f2406a;
    private HashMap f2407b;

    am() {
        this.f2406a = null;
        this.f2407b = cr.m2202a((Library) this);
    }

    private Object[] m2330a(int i, Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("WindowsLib", "Executing the method index : " + i);
        }
        if (i == ((Integer) this.f2407b.get("add")).intValue()) {
            ((fv) objArr[0]).m4440a(objArr);
            return null;
        }
        fv b;
        if (i == ((Integer) this.f2407b.get("show")).intValue()) {
            if (!(objArr[0] == null || objArr[0] == LuaNil.nil)) {
                b = objArr[0] instanceof String ? fv.m4395b((String) objArr[0]) : (fv) objArr[0];
                if (KonyMain.f3657e) {
                    Log.d("WindowsLib", "Displaying the form " + b.m4462t());
                }
                b.m4455g();
                return null;
            }
        } else if (i == ((Integer) this.f2407b.get("getcurrentform")).intValue()) {
            b = fv.m4426o();
            if (KonyMain.f3657e && b != null) {
                Log.d("WindowsLib", "Returning the currentform " + b.m4462t());
            }
            r1 = new Object[1];
            if (b == null) {
                b = LuaNil.nil;
            }
            r1[0] = b;
            return r1;
        } else if (i == ((Integer) this.f2407b.get("getpreviousform")).intValue()) {
            b = fv.m4427q();
            if (KonyMain.f3657e && b != null) {
                Log.d("WindowsLib", "Returning the previousform " + b.m4462t());
            }
            r1 = new Object[1];
            if (b == null) {
                b = LuaNil.nil;
            }
            r1[0] = b;
            return r1;
        } else if (i == ((Integer) this.f2407b.get("destroy")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Destroying form " + ((fv) objArr[0]).m4462t());
            }
            ((fv) objArr[0]).m4461r();
            return null;
        } else if (i == ((Integer) this.f2407b.get("addat")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Add widget = " + objArr[1] + " at index = " + objArr[2] + " to form = " + ((fv) objArr[0]).m4462t());
            }
            if (objArr.length > 3) {
                ((fv) objArr[0]).m4438a(objArr[1], (int) Double.parseDouble(objArr[2].toString()), objArr[3]);
                return null;
            }
            ((fv) objArr[0]).m4438a(objArr[1], (int) Double.parseDouble(objArr[2].toString()), null);
            return null;
        } else if (i == ((Integer) this.f2407b.get("remove")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Remove widget = " + objArr[1] + " From form = " + ((fv) objArr[0]).m4462t());
            }
            ((fv) objArr[0]).m4446b(objArr[1], null);
            return null;
        } else if (i == ((Integer) this.f2407b.get("removeat")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Remove widget at index = " + objArr[1] + "From form = " + ((fv) objArr[0]).m4462t());
            }
            return objArr.length > 2 ? ((fv) objArr[0]).m4441a((int) Double.parseDouble(objArr[1].toString()), objArr[2]) : ((fv) objArr[0]).m4441a((int) Double.parseDouble(objArr[1].toString()), null);
        } else if (i == ((Integer) this.f2407b.get("widgets")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Get widgets() called on form = " + ((fv) objArr[0]).m4462t());
            }
            return ((fv) objArr[0]).m4452d();
        } else if (i == ((Integer) this.f2407b.get("scrolltowidget")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "scrollToWidget widget = " + objArr[1] + " in form = " + ((fv) objArr[0]).m4462t());
            }
            ((fv) objArr[0]).m4437a(objArr[1]);
            return null;
        } else if (i == ((Integer) this.f2407b.get("scrolltobeginning")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "scrollToBeginning called on form = " + ((fv) objArr[0]).m4462t());
            }
            ((fv) objArr[0]).m4453e();
            return null;
        } else if (i == ((Integer) this.f2407b.get("scrolltoend")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "scrollToEnd called on form = " + ((fv) objArr[0]).m4462t());
            }
            ((fv) objArr[0]).m4454f();
            return null;
        } else if (i == ((Integer) this.f2407b.get("replaceat")).intValue()) {
            return objArr.length > 3 ? ((fv) objArr[0]).m4448b(objArr[1], (int) Double.parseDouble(objArr[2].toString()), objArr[3]) : ((fv) objArr[0]).m4448b(objArr[1], (int) Double.parseDouble(objArr[2].toString()), null);
        }
        return null;
    }

    public final Object[] execute(int i, Object[] objArr) {
        if (i == ((Integer) this.f2407b.get("add")).intValue() || i == ((Integer) this.f2407b.get("addat")).intValue() || i == ((Integer) this.f2407b.get("getcurrentform")).intValue() || i == ((Integer) this.f2407b.get("getpreviousform")).intValue() || i == ((Integer) this.f2407b.get("remove")).intValue() || i == ((Integer) this.f2407b.get("removeat")).intValue() || i == ((Integer) this.f2407b.get("widgets")).intValue() || i == ((Integer) this.f2407b.get("show")).intValue() || i == ((Integer) this.f2407b.get("replaceat")).intValue()) {
            return m2330a(i, objArr);
        }
        if (i == ((Integer) this.f2407b.get("destroy")).intValue()) {
            synchronized (this) {
                Object[] a;
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    a = m2330a(i, objArr);
                    return a;
                }
                Object iiVar = new ii(new an(this, i, objArr));
                new Handler(Looper.getMainLooper()).post(iiVar);
                iiVar.m1406a();
                a = this.f2406a != null ? this.f2406a : null;
                return a;
            }
        }
        KonyMain.m4094a(new ao(this, i, objArr));
        return null;
    }

    public final String[] getMethods() {
        return new String[]{"add", "show", "getcurrentform", "getpreviousform", "destroy", "addat", "remove", "removeat", "widgets", "scrolltowidget", "scrolltobeginning", "scrolltoend", "replaceat"};
    }

    public final String getNameSpace() {
        return "form";
    }
}
