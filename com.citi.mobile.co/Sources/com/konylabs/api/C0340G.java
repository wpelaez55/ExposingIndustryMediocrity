package com.konylabs.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.libintf.Library;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import ny0k.aT;
import ny0k.aU;
import ny0k.aX;

/* renamed from: com.konylabs.api.G */
public final class C0340G implements Library {
    private static String[] f2380a;

    static {
        f2380a = new String[]{"registerfordatastream", "unregisterdatastream", "registerdatastream", "deregisterdatastream", "setcallback"};
    }

    static /* synthetic */ void m2249a(C0340G c0340g, Function function, int i, Object obj) {
        if (function != null) {
            try {
                function.execute(new Object[]{new Double((double) i), obj});
            } catch (Throwable e) {
                if (KonyMain.f3657e) {
                    Log.d("StreamingLib", BuildConfig.FLAVOR, e);
                }
            }
        }
    }

    static /* synthetic */ void m2250a(C0340G c0340g, Function function, int i, Object obj, int i2) {
        if (function != null) {
            try {
                function.execute(new Object[]{new Double((double) i), obj, new Double((double) i2)});
            } catch (Throwable e) {
                if (KonyMain.f3657e) {
                    Log.d("StreamingLib", BuildConfig.FLAVOR, e);
                }
            }
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        double d = 100.0d;
        boolean c;
        if (i == 0 || i == 2) {
            if (KonyMain.f3657e) {
                Log.d("StreamingLib", "registerfordatastream");
            }
            if (objArr == null || objArr.length != 4) {
                if (KonyMain.f3659g) {
                    Log.e("StreamingLib", "Invalid number of params for register");
                }
                return new Object[]{new Double(100.0d), "Invalid number of params for register"};
            } else if (objArr[3] == LuaNil.nil || !(objArr[3] instanceof Function)) {
                if (KonyMain.f3657e) {
                    Log.e("StreamingLib", "No Callback registered for Streaming");
                }
                return new Object[]{new Double(100.0d), "Invalid params for Callback registered for Streaming <" + objArr[3] + ">"};
            } else {
                Function function = (Function) objArr[3];
                if (objArr[0] == LuaNil.nil || !(objArr[0] instanceof String)) {
                    if (KonyMain.f3659g) {
                        Log.e("StreamingLib", "Invalid params for register protocol <" + objArr[0] + ">");
                    }
                    return new Object[]{new Double(100.0d), "Invalid params for register protocol <" + objArr[0] + ">"};
                }
                String str = (String) objArr[0];
                if (objArr[2] == LuaNil.nil || !(objArr[2] instanceof String)) {
                    if (KonyMain.f3659g) {
                        Log.e("StreamingLib", "Invalid config params for register outputformat <" + objArr[2] + ">");
                    }
                    return new Object[]{new Double(100.0d), "Invalid params for register outputFormat <" + objArr[2] + ">"};
                }
                int i2 = ((String) objArr[2]).equalsIgnoreCase("json") ? 1 : 2;
                if (objArr[1] == LuaNil.nil || !(objArr[1] instanceof LuaTable)) {
                    if (KonyMain.f3659g) {
                        Log.e("StreamingLib", "Invalid config params for register configparams <" + objArr[1] + ">");
                    }
                    return new Object[]{new Double(100.0d), "Invalid config params for register configparams <" + objArr[1] + ">"};
                }
                LuaTable luaTable = (LuaTable) objArr[1];
                if (str.equalsIgnoreCase("http1.1")) {
                    aT aXVar = new aX();
                    KonyMain actContext = KonyMain.getActContext();
                    if (actContext != null) {
                        actContext.m4154a(aXVar);
                    }
                    if (aXVar == null) {
                        return new Object[]{new Double(101.0d), "HTTP Streamer couldn't be created for <" + str + ">"};
                    }
                    aXVar.m3541a(luaTable.map, i2, function != null ? new C0343J(this, function) : null, function != null ? new C0344K(this, function) : null);
                    c = aXVar.m3543c();
                    LuaTable luaTable2 = new LuaTable(0, 2);
                    luaTable2.setTable("streamhandle", aXVar);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = luaTable2;
                    objArr2[1] = new Double(c ? 0.0d : 100.0d);
                    return objArr2;
                }
                return new Object[]{new Double(100.0d), "Unsupported format <" + str + ">"};
            }
        } else if (i == 1 || i == 3) {
            if (objArr == null || objArr.length <= 0 || objArr[0] == LuaNil.nil) {
                if (KonyMain.f3659g) {
                    Log.e("StreamingLib", "Invalid number of params for deregister");
                }
                c = false;
            } else {
                if (KonyMain.f3657e) {
                    Log.e("StreamingLib", "deregisterdatastream for id <" + objArr[0] + ">");
                }
                if (objArr[0] instanceof LuaTable) {
                    r0 = (aU) ((LuaTable) objArr[0]).getTable("streamhandle");
                    if (r0 != null) {
                        c = r0.m3544d();
                    }
                    c = false;
                } else {
                    c = false;
                }
            }
            Object[] objArr3 = new Object[1];
            if (c) {
                d = 0.0d;
            }
            objArr3[0] = new Double(d);
            return objArr3;
        } else if (i != 4) {
            return null;
        } else {
            if (objArr == null || objArr.length < 2 || objArr[0] == LuaNil.nil || objArr[1] == LuaNil.nil || !(objArr[0] instanceof LuaTable) || !(objArr[1] instanceof Function)) {
                if (KonyMain.f3659g) {
                    Log.e("StreamingLib", "Invalid arguments for setcallback");
                }
                return new Object[]{new Double(100.0d), "Invalid arguments for setcallback"};
            }
            if (KonyMain.f3657e) {
                Log.d("StreamingLib", "setcallback for id <" + objArr[0] + "> callback  <" + objArr[1] + ">");
            }
            r0 = (aU) ((LuaTable) objArr[0]).getTable("streamhandle");
            if (r0 != null) {
                Function function2 = (Function) objArr[1];
                r0.m3542a(new C0341H(this, function2), new C0342I(this, function2));
                return new Object[]{new Double(0.0d)};
            }
            return new Object[]{new Double(101.0d), "Streaming Id does not exists"};
        }
    }

    public final String[] getMethods() {
        return f2380a;
    }

    public final String getNameSpace() {
        return "streaming";
    }
}
