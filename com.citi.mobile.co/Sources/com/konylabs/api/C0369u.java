package com.konylabs.api;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.js.api.KonyJSONString;
import com.konylabs.libintf.Library;
import com.konylabs.vm.C0245j;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import ny0k.aC;
import ny0k.aE;
import ny0k.aH;
import ny0k.aT;
import ny0k.aj;
import ny0k.aw;
import ny0k.cr;

/* renamed from: com.konylabs.api.u */
public final class C0369u implements Library, aT {
    private static String[] f2438a;
    private C0245j f2439b;
    private Function f2440c;

    static {
        f2438a = new String[]{"invokeservice", "invokeserviceasync", "cancel", "removeallcookies", "isNetworkAvailable", "setNetworkCallbacks", "getActiveNetworkType", "getCookies", "removesessioncookies"};
    }

    public C0369u(Context context) {
        this.f2439b = null;
        this.f2439b = KonyMain.m4061G();
    }

    private Object m2361a(String str, HashMap hashMap, aE aEVar) {
        if (KonyMain.f3657e) {
            long currentTimeMillis = System.currentTimeMillis();
            Log.d("NetworkLib", Thread.currentThread() + ":" + new Date(currentTimeMillis).toGMTString() + "(" + currentTimeMillis + "):" + "Processing JSON Response");
        }
        if (str == null || str.length() <= 0) {
            LuaTable luaTable = new LuaTable();
            C0369u.m2363a(luaTable, hashMap);
            if (aEVar == null) {
                luaTable.map.put("opstatus", new Double(1011.0d));
                luaTable.map.put("errmsg", "Empty content received.");
                return luaTable;
            }
            luaTable.map.put("opstatus", new Double((double) aEVar.m1865a()));
            luaTable.map.put("errmsg", aEVar.m1867b());
            return luaTable;
        } else if (KonyMain.m4056B()) {
            return aH.m1892a(str);
        } else {
            LuaTable luaTable2 = new LuaTable();
            C0369u.m2363a(luaTable2, hashMap);
            KonyJSONString konyJSONString = new KonyJSONString(str, luaTable2);
            if (konyJSONString.parse()) {
                return konyJSONString;
            }
            luaTable2.map.put("opstatus", new Double(1013.0d));
            luaTable2.map.put("errmsg", "Middleware returned invalid JSON string.");
            konyJSONString.cleanup();
            return luaTable2;
        }
    }

    private static void m2363a(LuaTable luaTable, HashMap hashMap) {
        if (hashMap != null) {
            LuaTable luaTable2 = new LuaTable();
            luaTable2.setTable("cookies", hashMap.get("cookies"));
            luaTable2.setTable("responsecode", hashMap.get("responsecode"));
            luaTable2.setTable("url", hashMap.get("url"));
            HashMap hashMap2 = (HashMap) hashMap.get("headers");
            if (hashMap2 != null && hashMap2.size() > 0) {
                LuaTable luaTable3 = new LuaTable();
                for (Entry entry : hashMap2.entrySet()) {
                    luaTable3.setTable(entry.getKey(), entry.getValue());
                }
                luaTable2.setTable("headers", luaTable3);
            }
            luaTable.setTable("httpresponse", luaTable2);
        }
    }

    public static boolean m2364a(int i) {
        State state = null;
        if (i < 0 || i > 3) {
            throw new LuaError("Invalid Network Type for kony.net.isNetworkAvailable()", 0);
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) KonyMain.getAppContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
        State state2 = networkInfo != null ? networkInfo.getState() : null;
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
        if (networkInfo2 != null) {
            state = networkInfo2.getState();
        }
        if (state == State.CONNECTED) {
            if (i == 1 || i == 3) {
                return true;
            }
        } else if (state2 != State.CONNECTED) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo == null ? false : activeNetworkInfo.isConnectedOrConnecting();
        } else if (i == 0 || i == 3) {
            return true;
        }
        return false;
    }

    public final void m2365a() {
        if (this.f2440c != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f2440c;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", Boolean.valueOf(true));
            obtain.setData(bundle);
            this.f2439b.m1729b(obtain);
        }
    }

    public final void m2366b() {
        if (this.f2440c != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f2440c;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", Boolean.valueOf(false));
            obtain.setData(bundle);
            this.f2439b.m1729b(obtain);
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        Hashtable hashtable = null;
        Object a;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (objArr.length == 3) {
                    ((Boolean) objArr[2]).booleanValue();
                }
                try {
                    if (KonyMain.f3657e) {
                        Log.d("NetworkLib", "Calling Network.invokeservice : " + objArr[0]);
                    }
                    LuaTable luaTable = (LuaTable) objArr[1];
                    Object obj = luaTable.map.get("httpheaders");
                    Iterator it = obj != null ? ((LuaTable) obj).map.entrySet().iterator() : null;
                    obj = luaTable.map.get("httpconfig");
                    if (obj != null) {
                        hashtable = ((LuaTable) obj).map;
                    }
                    try {
                        Object[] a2 = aw.m2002a().m2006a(objArr[0].toString(), luaTable.map.entrySet().iterator(), it, hashtable);
                        a = m2361a((String) a2[0], (HashMap) a2[1], null);
                    } catch (aE e) {
                        if (KonyMain.f3657e) {
                            Log.d("NetworkLib", BuildConfig.FLAVOR + e.getMessage());
                        }
                        a = m2361a(null, e.m1868c(), e);
                    }
                    return new Object[]{a};
                } catch (LuaError e2) {
                    throw e2;
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (KonyMain.f3657e) {
                    Log.d("NetworkLib", "Calling asynchronous invoke service");
                }
                LuaTable luaTable2 = (LuaTable) objArr[1];
                a = luaTable2.map.get("httpheaders");
                Iterator it2 = a != null ? ((LuaTable) a).map.entrySet().iterator() : null;
                a = luaTable2.map.get("httpconfig");
                Hashtable hashtable2 = a != null ? ((LuaTable) a).map : null;
                Function function = (objArr.length <= 2 || objArr[2] == LuaNil.nil) ? null : (Function) objArr[2];
                LuaTable luaTable3 = (objArr.length <= 3 || objArr[3] == LuaNil.nil) ? null : (LuaTable) objArr[3];
                aC a3 = aw.m2002a().m2004a(objArr[0].toString(), luaTable2.map.entrySet().iterator(), it2, hashtable2, KonyMain.m4061G(), new C0372v(this, function, luaTable3));
                if (KonyMain.f3657e) {
                    Log.d("NetworkLib", "Successfully called asynchronous invoke service");
                }
                return new Object[]{a3};
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (objArr[0] == LuaNil.nil || !(objArr[0] instanceof aC)) {
                    return null;
                }
                ((aC) objArr[0]).m3511c();
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                aj.m1990b();
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                if (objArr == null || objArr.length <= 0 || objArr[0] == LuaNil.nil) {
                    return null;
                }
                return new Object[]{Boolean.valueOf(C0369u.m2364a(((Double) objArr[0]).intValue()))};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                if (objArr == null || objArr.length <= 0 || objArr[0] == LuaNil.nil) {
                    return null;
                }
                if (objArr[0] instanceof LuaTable) {
                    a = ((LuaTable) objArr[0]).getTable("statusChange");
                    if (a instanceof Function) {
                        this.f2440c = (Function) a;
                        KonyMain actContext = KonyMain.getActContext();
                        if (actContext == null) {
                            return null;
                        }
                        if (this.f2440c == null) {
                            actContext.m4156b((aT) this);
                            return null;
                        } else if (actContext.m4159c((aT) this)) {
                            return null;
                        } else {
                            actContext.m4154a((aT) this);
                            return null;
                        }
                    }
                    throw new LuaError("Invalid argument type for kony.net.setNetworkCallbacks()", 0);
                }
                throw new LuaError("Invalid number of arguments for kony.net.setNetworkCallbacks()", 0);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                int i2 = C0369u.m2364a(1) ? 1 : C0369u.m2364a(0) ? 0 : -1;
                if (i2 == -1) {
                    return null;
                }
                return new Object[]{Integer.valueOf(i2)};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                if (objArr == null || objArr.length <= 0 || objArr[0] == LuaNil.nil || cr.m2201a(objArr[0], 2) == null) {
                    return null;
                }
                return new Object[]{aj.m1989b((String) cr.m2201a(objArr[0], 2))};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                aj.m1992c();
                return null;
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f2438a;
    }

    public final String getNameSpace() {
        return "net";
    }
}
