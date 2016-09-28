package com.konylabs.api;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.eO;
import com.konylabs.api.ui.fd;
import com.konylabs.api.ui.ii;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import java.util.HashMap;
import ny0k.cr;

final class ap implements Library {
    private Object[] f2408a;
    private HashMap f2409b;

    ap() {
        this.f2408a = null;
        this.f2409b = cr.m2202a((Library) this);
    }

    private Object[] m2333a(int i, Object[] objArr) {
        int i2 = 3;
        if (KonyMain.f3657e) {
            Log.d("WindowsLib", "Executing the method index : " + i + "  params[0]:" + objArr[0]);
        }
        if (i == ((Integer) this.f2409b.get("add")).intValue()) {
            ((eO) objArr[0]).m4211a(objArr);
            return null;
        } else if (i == ((Integer) this.f2409b.get("setvisibility")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Setting box visibility");
            }
            if (objArr.length > 2) {
                ((eO) objArr[0]).setVisibility(objArr[1].toString().equals("true"), objArr[2]);
                return null;
            }
            ((eO) objArr[0]).setVisibility(objArr[1].toString().equals("true"));
            return null;
        } else if (i == ((Integer) this.f2409b.get("addat")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Add widget = " + objArr[1] + " at index = " + objArr[2] + " to box = " + ((eO) objArr[0]).getID());
            }
            if (objArr.length > i2) {
                ((eO) objArr[0]).m4209a(objArr[1], (int) Double.parseDouble(objArr[2].toString()), objArr[i2]);
                return null;
            }
            ((eO) objArr[0]).m4209a(objArr[1], (int) Double.parseDouble(objArr[2].toString()), null);
            return null;
        } else if (i == ((Integer) this.f2409b.get("remove")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Remove widget = " + objArr[1] + " From box = " + ((eO) objArr[0]).getID());
            }
            ((eO) objArr[0]).m4217b(objArr[1], null);
            return null;
        } else if (i == ((Integer) this.f2409b.get("removeat")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Remove widget at index = " + objArr[1] + "From Box = " + ((eO) objArr[0]).getID());
            }
            return objArr.length > 2 ? ((eO) objArr[0]).m4213a((int) Double.parseDouble(objArr[1].toString()), objArr[2]) : ((eO) objArr[0]).m4213a((int) Double.parseDouble(objArr[1].toString()), null);
        } else if (i == ((Integer) this.f2409b.get("widgets")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Get widgets() called on Box = " + ((eO) objArr[0]).getID());
            }
            return ((eO) objArr[0]).m4221c();
        } else if (i == ((Integer) this.f2409b.get("scrolltobeginning")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "scrollToBeginning called on Box = " + ((eO) objArr[0]).getID());
            }
            if (objArr.length == 2) {
                try {
                    i2 = ((Double) objArr[1]).intValue();
                } catch (Exception e) {
                }
            }
            ((eO) objArr[0]).m4203a(i2);
            return null;
        } else if (i == ((Integer) this.f2409b.get("scrolltoend")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "scrollToEnd called on Box = " + ((eO) objArr[0]).getID());
            }
            if (objArr.length == 2) {
                try {
                    i2 = ((Double) objArr[1]).intValue();
                } catch (Exception e2) {
                }
            }
            ((eO) objArr[0]).m4215b(i2);
            return null;
        } else {
            if (i == ((Integer) this.f2409b.get("scrolltowidget")).intValue()) {
                if (objArr != null && objArr.length > 1) {
                    if (KonyMain.f3657e) {
                        Log.d("WindowsLib", "scrollToWidget widget = " + objArr[1] + " in box = " + ((eO) objArr[0]).getID());
                    }
                    ((eO) objArr[0]).m4216b(objArr[1]);
                    return null;
                }
            } else if (i == ((Integer) this.f2409b.get("replaceat")).intValue()) {
                return objArr.length > i2 ? ((eO) objArr[0]).m4219b(objArr[1], (int) Double.parseDouble(objArr[2].toString()), objArr[i2]) : ((eO) objArr[0]).m4219b(objArr[1], (int) Double.parseDouble(objArr[2].toString()), null);
            } else {
                if (i == ((Integer) this.f2409b.get("destroy")).intValue()) {
                    if (KonyMain.f3657e) {
                        Log.d("WindowsLib", "destroy called on Box Template= " + ((eO) objArr[0]).getID());
                    }
                    if (objArr[0] instanceof fd) {
                        ((fd) objArr[0]).m4840r();
                        return null;
                    }
                    throw new LuaError("destroy() method is not available for Box widget", 11001);
                }
            }
            return null;
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        if (i == ((Integer) this.f2409b.get("add")).intValue() || i == ((Integer) this.f2409b.get("addat")).intValue() || i == ((Integer) this.f2409b.get("remove")).intValue() || i == ((Integer) this.f2409b.get("removeat")).intValue() || i == ((Integer) this.f2409b.get("widgets")).intValue() || i == ((Integer) this.f2409b.get("replaceat")).intValue() || i == ((Integer) this.f2409b.get("scrolltowidget")).intValue()) {
            return m2333a(i, objArr);
        }
        if (i == ((Integer) this.f2409b.get("destroy")).intValue()) {
            synchronized (this) {
                Object[] a;
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    a = m2333a(i, objArr);
                    return a;
                }
                Object iiVar = new ii(new aq(this, i, objArr));
                new Handler(Looper.getMainLooper()).post(iiVar);
                iiVar.m1406a();
                a = this.f2408a != null ? this.f2408a : null;
                return a;
            }
        }
        KonyMain.m4094a(new ar(this, i, objArr));
        return null;
    }

    public final String[] getMethods() {
        return new String[]{"add", "setvisibility", "addat", "remove", "removeat", "widgets", "scrolltobeginning", "scrolltoend", "replaceat", "destroy", "scrolltowidget"};
    }

    public final String getNameSpace() {
        return "box";
    }
}
