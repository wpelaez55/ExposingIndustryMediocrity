package com.konylabs.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.js.api.KonyJSONString;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.HashMap;
import ny0k.aD;

/* renamed from: com.konylabs.api.v */
final class C0372v extends aD {
    private Function f3029a;
    private LuaTable f3030b;
    private /* synthetic */ C0369u f3031c;

    public C0372v(C0369u c0369u, Function function, LuaTable luaTable) {
        this.f3031c = c0369u;
        this.f3029a = function;
        this.f3030b = luaTable;
    }

    protected final aD m3355a() {
        return new C0372v(this.f3031c, this.f3029a, this.f3030b);
    }

    protected final void m3356a(int i) {
        if (KonyMain.f3657e) {
            Log.d("NetworkLib", "Async call in Progress...");
        }
        if (this.f3029a != null) {
            try {
                this.f3029a.execute(new Object[]{new Double((double) i)});
            } catch (Exception e) {
                if (KonyMain.f3657e) {
                    Log.d("NetworkLib", BuildConfig.FLAVOR + e.getMessage());
                }
            }
        }
    }

    protected final void m3357a(int i, String str, HashMap hashMap) {
        if (KonyMain.f3657e) {
            Log.d("NetworkLib", "Async call failed " + str);
        }
        if (this.f3029a != null) {
            LuaTable luaTable = new LuaTable();
            luaTable.map.put("opstatus", new Double((double) i));
            if (str != null) {
                luaTable.map.put("errmsg", str);
            } else {
                luaTable.map.put("errmsg", BuildConfig.FLAVOR);
            }
            C0369u.m2363a(luaTable, hashMap);
            try {
                this.f3029a.execute(new Object[]{new Double(400.0d), luaTable, this.f3030b});
            } catch (Exception e) {
                if (KonyMain.f3657e) {
                    Log.d("NetworkLib", BuildConfig.FLAVOR + e.getMessage());
                }
            }
        }
    }

    protected final void m3358a(String str, HashMap hashMap) {
        KonyJSONString konyJSONString;
        Exception e;
        Throwable th;
        if (KonyMain.f3657e) {
            Log.d("NetworkLib", "Async call success " + str);
        }
        if (this.f3029a != null) {
            Object a;
            try {
                a = this.f3031c.m2361a(str, hashMap, null);
                try {
                    this.f3029a.execute(new Object[]{new Double(400.0d), a, this.f3030b});
                    if (a instanceof KonyJSONString) {
                        konyJSONString = (KonyJSONString) a;
                        konyJSONString.cleanup();
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        if (KonyMain.f3657e) {
                            Log.d("NetworkLib", BuildConfig.FLAVOR + e.getMessage());
                        }
                        if (a instanceof KonyJSONString) {
                            konyJSONString = (KonyJSONString) a;
                            konyJSONString.cleanup();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (a instanceof KonyJSONString) {
                            ((KonyJSONString) a).cleanup();
                        }
                        throw th;
                    }
                }
            } catch (Exception e3) {
                Exception exception = e3;
                a = null;
                e = exception;
                if (KonyMain.f3657e) {
                    Log.d("NetworkLib", BuildConfig.FLAVOR + e.getMessage());
                }
                if (a instanceof KonyJSONString) {
                    konyJSONString = (KonyJSONString) a;
                    konyJSONString.cleanup();
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                a = null;
                th = th4;
                if (a instanceof KonyJSONString) {
                    ((KonyJSONString) a).cleanup();
                }
                throw th;
            }
        }
    }

    protected final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m3355a();
    }
}
