package com.konylabs.api;

import com.konylabs.api.db.C0163f;
import com.konylabs.api.db.C0164h;
import com.konylabs.api.db.IKonySQLException;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Hashtable;

/* renamed from: com.konylabs.api.Q */
public final class C0348Q implements Library {
    private static String[] f2394a;
    private Hashtable f2395b;

    static {
        f2394a = new String[]{"opendatabase", "transaction", "readtransaction", "changeversion", "executesql", "sqlresultsetrowitem", "opendatabasesync"};
    }

    public C0348Q() {
        this.f2395b = new Hashtable();
    }

    private double m2279a(Object[] objArr, boolean z) {
        String str = (String) objArr[0];
        String str2 = BuildConfig.FLAVOR;
        if (!(objArr.length <= 4 || objArr[4] == LuaNil.nil || objArr[4] == null)) {
            str2 = objArr[4].toString();
        }
        double hashCode = (double) (z ? str + str2 + "Sync" : str + str2 + "ASync").hashCode();
        if (this.f2395b.get(Double.valueOf(hashCode)) == null) {
            C0163f c0163f = new C0163f(objArr);
            if (z) {
                c0163f.f135b = true;
            }
            this.f2395b.put(Double.valueOf(hashCode), c0163f);
        }
        return hashCode;
    }

    private Object[] m2280a(Object[] objArr) {
        if (objArr == null || objArr.length < 3 || objArr[0] == null || objArr[0] == LuaNil.nil || objArr[1] == null || objArr[1] == LuaNil.nil || objArr[2] == null || objArr[2] == LuaNil.nil) {
            throw new LuaError("Invalid arguments for for kony.db.openDatabase()", 201);
        }
        try {
            return new Object[]{Double.valueOf(m2279a(objArr, false))};
        } catch (IKonySQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private Object[] m2281b(Object[] objArr) {
        if (objArr == null || objArr.length < 3 || objArr[0] == null || objArr[0] == LuaNil.nil || objArr[1] == null || objArr[1] == LuaNil.nil || objArr[2] == null || objArr[2] == LuaNil.nil) {
            throw new LuaError("Invalid arguments for for kony.db.openDatabaseSync()", 201);
        }
        try {
            return new Object[]{Double.valueOf(m2279a(objArr, true))};
        } catch (IKonySQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return m2280a(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (objArr == null || objArr.length < 2 || objArr[0] == null || objArr[0] == LuaNil.nil || objArr[1] == null || objArr[1] == LuaNil.nil) {
                    throw new LuaError("Invalid arguments for kony.db.transaction()", 201);
                }
                ((C0163f) this.f2395b.get((Double) objArr[0])).m78a(objArr, false);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (objArr == null || objArr.length < 2 || objArr[0] == null || objArr[0] == LuaNil.nil || objArr[1] == null || objArr[1] == LuaNil.nil) {
                    throw new LuaError("Invalid arguments for kony.db.readTransaction()", 201);
                }
                ((C0163f) this.f2395b.get((Double) objArr[0])).m78a(objArr, true);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (objArr == null || objArr.length < 3 || objArr[0] == null || objArr[0] == LuaNil.nil || objArr[1] == null || objArr[1] == LuaNil.nil || objArr[2] == null || objArr[2] == LuaNil.nil) {
                    throw new LuaError("Invalid arguments for kony.db.changeVersion()", 201);
                }
                this.f2395b.get((Double) objArr[0]);
                C0163f.m72a();
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                if (objArr == null || objArr.length < 2 || objArr[0] == null || objArr[0] == LuaNil.nil || objArr[1] == null || objArr[1] == LuaNil.nil) {
                    throw new LuaError("Invalid arguments for kony.db.executeSql()", 201);
                }
                Object[] objArr2;
                Object obj = C0163f.f129a.get(objArr[0]);
                if (obj instanceof C0164h) {
                    C0164h c0164h = (C0164h) obj;
                    if (c0164h.m82a()) {
                        objArr2 = new Object[]{c0164h.m83b(objArr)};
                        return objArr2;
                    }
                    c0164h.m81a(objArr);
                }
                objArr2 = null;
                return objArr2;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return (objArr == null || objArr.length < 3 || objArr[0] == null || objArr[0] == LuaNil.nil || objArr[1] == null || objArr[1] == LuaNil.nil || objArr[2] == null || objArr[2] == LuaNil.nil) ? null : C0163f.m74a(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return m2281b(objArr);
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return f2394a;
    }

    public final String getNameSpace() {
        return "database";
    }
}
