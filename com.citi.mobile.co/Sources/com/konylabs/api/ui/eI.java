package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import ny0k.cr;

public final class eI implements cv {
    private static final eI f2970a;
    private static String f2971d;
    private static eJ f2972e;
    private Vector f2973b;
    private Hashtable f2974c;

    static {
        f2970a = new eI();
        f2971d = null;
        f2972e = null;
    }

    private eI() {
        this.f2973b = new Vector();
        this.f2974c = new Hashtable();
    }

    public static eI m3275a() {
        return f2970a;
    }

    public static void m3276a(dB dBVar) {
    }

    public static String m3277b() {
        return f2971d;
    }

    public static void m3278b(dB dBVar) {
    }

    public static void m3279c() {
    }

    public final void m3280a(int i) {
        if (i >= 0 && i < this.f2973b.size()) {
        }
    }

    public final void m3281a(cu cuVar) {
        if (cuVar.f1030i != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = (Function) cuVar.f1030i;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", cuVar.f1028g);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    public final void m3282a(LuaTable luaTable) {
        Vector vector = luaTable.list;
        this.f2973b.clear();
        if (!vector.isEmpty()) {
            int i = 0;
            while (i < vector.size()) {
                LuaTable luaTable2 = (LuaTable) vector.elementAt(i);
                Object[] objArr = new Object[luaTable2.size()];
                luaTable2.list.copyInto(objArr);
                try {
                    cu cuVar = (objArr[1] == null || objArr[1] == LuaNil.nil) ? new cu((String) objArr[0], BuildConfig.FLAVOR, 0, objArr[3]) : new cu((String) objArr[0], (String) objArr[1], 0, objArr[3]);
                    if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
                        cuVar.m1042a(objArr[2].toString());
                    }
                    if (objArr.length > 4 && (objArr[4] instanceof LuaTable)) {
                        Object table = ((LuaTable) objArr[4]).getTable(cu.f1020a);
                        if (table instanceof Double) {
                            cuVar.m1041a(((Double) table).intValue());
                        }
                    }
                    this.f2973b.add(cuVar);
                    i++;
                } catch (Exception e) {
                    if (KonyMain.f3657e) {
                        Log.d("LuaAppMenu", BuildConfig.FLAVOR + e.getMessage());
                    }
                    throw new LuaError("Invalid menu item arguments set. kony.application.setCurrentAppMenu() failed", 605);
                }
            }
            KonyMain.m4111b(this.f2973b);
            KonyMain.m4091a(f2970a);
        }
    }

    public final void m3283a(String str) {
        f2971d = str;
        eJ eJVar = (eJ) this.f2974c.get(str);
        f2972e = eJVar;
        dB dBVar = eJVar.f1250a;
        dBVar = f2972e.f1251b;
        m3282a(f2972e.f1252c);
    }

    public final void m3284a(String str, int i) {
        eJ eJVar = (eJ) this.f2974c.get(str);
        if (eJVar != null) {
            int a = cr.m2199a(i, 0);
            int size = eJVar.f1252c.list.size();
            if (a >= 0 && a < size) {
                eJVar.f1252c.list.remove(a);
                if (f2971d != null && f2971d.equals(str) && a >= 0 && a <= this.f2973b.size()) {
                    try {
                        this.f2973b.remove(a);
                        KonyMain.m4111b(this.f2973b);
                    } catch (Exception e) {
                        if (KonyMain.f3657e) {
                            Log.d("LuaAppMenu", BuildConfig.FLAVOR + e.getMessage());
                        }
                        throw new LuaError("Invalid menu item arguments for kony.application.removeAppMenuItem()", 605);
                    }
                }
            }
        }
    }

    public final void m3285a(String str, int i, LuaTable luaTable) {
        eJ eJVar = (eJ) this.f2974c.get(str);
        if (eJVar != null) {
            int a = cr.m2199a(i, 0);
            int size = eJVar.f1252c.list.size();
            if (a < 0) {
                eJVar.f1252c.list.insertElementAt(luaTable, 0);
            } else if (a >= 0 && a < size) {
                eJVar.f1252c.list.insertElementAt(luaTable, a);
            } else if (a >= size) {
                eJVar.f1252c.list.add(luaTable);
            }
            if (f2971d != null && f2971d.equals(str)) {
                m3287a(new Object[]{luaTable, new Double((double) a)});
            }
        }
    }

    public final void m3286a(String str, LuaTable luaTable, dB dBVar, dB dBVar2) {
        this.f2974c.put(str, new eJ(this, str, luaTable, dBVar, dBVar2));
    }

    public final void m3287a(Object[] objArr) {
        try {
            LuaTable luaTable = (LuaTable) objArr[0];
            Object[] objArr2 = new Object[luaTable.size()];
            luaTable.list.copyInto(objArr2);
            int intValue = ((Double) objArr[1]).intValue();
            cu cuVar = (objArr2[1] == null || objArr2[1] == LuaNil.nil) ? new cu((String) objArr2[0], BuildConfig.FLAVOR, 0, objArr2[3]) : new cu((String) objArr2[0], (String) objArr2[1], 0, objArr2[3]);
            if (!(objArr2[2] == null || objArr2[2] == LuaNil.nil)) {
                cuVar.m1042a(objArr2[2].toString());
            }
            if (objArr2.length > 4 && (objArr2[4] instanceof LuaTable)) {
                Object table = ((LuaTable) objArr2[4]).getTable(cu.f1020a);
                if (table instanceof Double) {
                    cuVar.m1041a(((Double) table).intValue());
                }
            }
            int size = this.f2973b.size();
            if (intValue < 0) {
                this.f2973b.insertElementAt(cuVar, 0);
            } else if (intValue >= 0 && intValue < size) {
                this.f2973b.insertElementAt(cuVar, intValue);
            } else if (intValue >= size) {
                this.f2973b.add(cuVar);
            }
            KonyMain.m4111b(this.f2973b);
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                Log.d("LuaAppMenu", BuildConfig.FLAVOR + e.getMessage());
            }
            throw new LuaError("Invalid menu item arguments for kony.application.addAppMenuItem()", 605);
        }
    }

    public final void m3288b(LuaTable luaTable) {
        if (luaTable != null && luaTable.list.size() > 0) {
            Iterator it = this.f2973b.iterator();
            while (it.hasNext()) {
                cu cuVar = (cu) it.next();
                if (luaTable.list.contains(cuVar.m1040a())) {
                    cuVar.m1043a(false);
                } else {
                    cuVar.m1043a(true);
                }
            }
            KonyMain.m4111b(this.f2973b);
        }
    }

    public final void m3289b(String str) {
        if (str != null) {
            try {
                Iterator it = this.f2973b.iterator();
                while (it.hasNext()) {
                    cu cuVar = (cu) it.next();
                    if (str.equals(cuVar.m1040a())) {
                        this.f2973b.removeElement(cuVar);
                        break;
                    }
                }
                KonyMain.m4111b(this.f2973b);
            } catch (Exception e) {
                if (KonyMain.f3657e) {
                    Log.d("LuaAppMenu", BuildConfig.FLAVOR + e.getMessage());
                }
                throw new LuaError("Invalid menu item arguments for addAppMenuItem.removeAppMenuItem()", 605);
            }
        }
    }

    public final void m3290c(LuaTable luaTable) {
        if (luaTable != null && luaTable.list.size() > 0) {
            Iterator it = this.f2973b.iterator();
            while (it.hasNext()) {
                cu cuVar = (cu) it.next();
                if (luaTable.list.contains(cuVar.m1040a())) {
                    cuVar.m1043a(true);
                } else {
                    cuVar.m1043a(false);
                }
            }
            KonyMain.m4111b(this.f2973b);
        }
    }

    public final void m3291d() {
        this.f2973b.clear();
    }
}
