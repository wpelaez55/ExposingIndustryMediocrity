package com.konylabs.api;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.gH;
import com.konylabs.api.ui.ii;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaTable;
import java.util.HashMap;
import ny0k.cr;

final class ah implements Library {
    private Object[] f2404a;
    private HashMap f2405b;

    ah() {
        this.f2404a = null;
        this.f2405b = cr.m2202a((Library) this);
    }

    private Object[] m2325a(int i, Object[] objArr) {
        if (i == ((Integer) this.f2405b.get("navigateto")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Executing mapview.navigateto() method");
            }
            if (objArr == null || objArr.length != 3) {
                throw new LuaError("Invalid number of arguments or invalid type of arguments to mapview.navigateto() method", 11001);
            }
            ((gH) objArr[0]).m4509a(((Double) cr.m2201a(objArr[1], 1)).intValue(), ((Boolean) cr.m2201a(objArr[2], 0)).booleanValue());
            return null;
        } else if (i == ((Integer) this.f2405b.get("navigatetolocation")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Executing mapview.navigatetolocation() method");
            }
            if (objArr == null || objArr.length != 4) {
                throw new LuaError("Invalid number of arguments or invalid type of arguments to mapview.navigatetolocation() method", 11001);
            }
            ((gH) objArr[0]).m4510a((LuaTable) objArr[1], ((Boolean) cr.m2201a(objArr[2], 0)).booleanValue(), ((Boolean) cr.m2201a(objArr[3], 0)).booleanValue());
            return null;
        } else if (i == ((Integer) this.f2405b.get("addpolyline")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Executing addPolyline() method");
            }
            if (objArr == null || objArr.length != 2) {
                throw new LuaError("Invalid number of arguments or invalid type of arguments to Map widget addPolyline() method", 11001);
            }
            ((gH) objArr[0]).m4513b((LuaTable) objArr[1]);
            return null;
        } else if (i == ((Integer) this.f2405b.get("removepolyline")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Executing removePolyline() method");
            }
            if (objArr == null || objArr.length != 2) {
                throw new LuaError("Invalid number of arguments or invalid type of arguments to Map widget removePolyline() method", 11001);
            }
            ((gH) objArr[0]).m4512a((String) objArr[1]);
            return null;
        } else if (i == ((Integer) this.f2405b.get("dismisscallout")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Executing dismissCallout() method");
            }
            if (objArr == null || objArr.length <= 0) {
                throw new LuaError("Invalid number of arguments or invalid type of arguments to Map widget dismissViewForLocation() method", 11001);
            }
            ((gH) objArr[0]).m4516c(objArr.length == 2 ? (LuaTable) objArr[1] : null);
            return null;
        } else if (i == ((Integer) this.f2405b.get("getbounds")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Executing getbounds() method");
            }
            if (objArr == null || objArr.length <= 0) {
                throw new LuaError("Invalid number of arguments or invalid type of arguments to Map widget dismissViewForLocation() method", 11001);
            }
            return new Object[]{((gH) objArr[0]).m4515c()};
        } else if (i != ((Integer) this.f2405b.get("clear")).intValue()) {
            return null;
        } else {
            if (KonyMain.f3657e) {
                Log.d("WindowsLib", "Executing clear() method");
            }
            if (objArr == null || objArr.length != 1) {
                throw new LuaError("Invalid number of arguments or invalid type of arguments to Map widget clear() method", 11001);
            }
            ((gH) objArr[0]).m4517d();
            return null;
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        if (i == ((Integer) this.f2405b.get("getbounds")).intValue()) {
            synchronized (this) {
                this.f2404a = null;
                Object[] a;
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    a = m2325a(i, objArr);
                    return a;
                }
                Object iiVar = new ii(new ai(this, i, objArr));
                new Handler(Looper.getMainLooper()).post(iiVar);
                iiVar.m1406a();
                a = this.f2404a != null ? this.f2404a : null;
                return a;
            }
        }
        KonyMain.m4094a(new aj(this, i, objArr));
        return this.f2404a != null ? this.f2404a : null;
    }

    public final String[] getMethods() {
        return new String[]{"navigateto", "navigatetolocation", "addpolyline", "removepolyline", "dismisscallout", "getbounds", "clear"};
    }

    public final String getNameSpace() {
        return "map";
    }
}
