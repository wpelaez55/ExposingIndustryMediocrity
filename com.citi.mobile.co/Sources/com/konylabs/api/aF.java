package com.konylabs.api;

import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.JSLibrary;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaTable;
import ny0k.cP;
import ny0k.cQ;
import ny0k.cW;

public final class aF extends JSLibrary {
    private static String[] f3522a;

    static {
        f3522a = new String[]{"postMessage", "addEventListener", "removeEventListener", "terminate", "close", "importScripts", "hasWorkerThreadSupport"};
    }

    private static cP m3920a(Object[] objArr) {
        return (objArr.length <= 0 || !(objArr[0] instanceof cQ)) ? Thread.currentThread() instanceof cW ? (cW) Thread.currentThread() : null : (cQ) objArr[0];
    }

    public final Object createInstance(Object[] objArr, long j) {
        if (objArr.length == 0) {
            throw new LuaError(3001, "WorkerThreadError", "WorkerThread: MissingMandatoryParameter. Failed to construct WorkerThread");
        } else if (objArr[0] instanceof String) {
            return new cQ(objArr, j);
        } else {
            throw new LuaError(3002, "WorkerThreadError", "WorkerThread: InvalidParameter. Invalid script name");
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        Object obj;
        cP a;
        String obj2;
        cP a2;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                cP a3 = m3920a(objArr);
                if (a3 != null) {
                    obj = (!(a3 instanceof cQ) || objArr.length <= 1) ? (!(a3 instanceof cW) || objArr.length <= 0) ? null : objArr[0] : objArr[1];
                    if (obj == null) {
                        throw new LuaError(3001, "WorkerThreadError", "postMessage: MissingMandatoryParameter. Message undefined");
                    } else if ((obj instanceof String) || (obj instanceof LuaTable)) {
                        a3.m2159a(obj);
                        break;
                    } else {
                        throw new LuaError(3002, "WorkerThreadError", "postMessage: InvalidParameter. Invalid Message");
                    }
                }
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                a = m3920a(objArr);
                if (a != null) {
                    if ((a instanceof cQ) && objArr.length > 2) {
                        obj2 = objArr[1].toString();
                        obj = objArr[2];
                    } else if (!(a instanceof cW) || objArr.length <= 1) {
                        obj = null;
                        obj2 = null;
                    } else {
                        obj2 = objArr[0].toString();
                        obj = objArr[1];
                    }
                    if (obj2 != null && obj != null) {
                        if ((obj instanceof Function) && (obj2 instanceof String) && (obj2.endsWith("message") || obj2.equals("error"))) {
                            a.m2160a(obj2, (Function) obj);
                            break;
                        }
                        throw new LuaError(3002, "WorkerThreadError", "addEventListener: InvalidParameter. Invalid arguments");
                    }
                    throw new LuaError(3001, "WorkerThreadError", "addEventListener: MissingMandatoryParameter. Mandatory arguments missing");
                }
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                a = m3920a(objArr);
                if (a != null) {
                    if ((a instanceof cQ) && objArr.length > 2) {
                        obj2 = objArr[1].toString();
                        obj = objArr[2];
                    } else if (!(a instanceof cW) || objArr.length <= 1) {
                        obj = null;
                        obj2 = null;
                    } else {
                        obj2 = objArr[0].toString();
                        obj = objArr[1];
                    }
                    if (obj2 != null && obj != null) {
                        if ((obj instanceof Function) && (obj2 instanceof String) && (obj2.endsWith("message") || obj2.equals("error"))) {
                            a.m2162b(obj2, (Function) obj);
                            break;
                        }
                        throw new LuaError(3002, "WorkerThreadError", "removeEventListener: InvalidParameter. Invalid arguments");
                    }
                    throw new LuaError(3001, "WorkerThreadError", "removeEventListener: MissingMandatoryParameter. Mandatory arguments missing");
                }
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                a2 = m3920a(objArr);
                if (a2 != null) {
                    a2.m2158a();
                    break;
                }
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                a2 = m3920a(objArr);
                if (a2 != null) {
                    a2.m2161a(objArr);
                    break;
                }
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return new Object[]{Boolean.valueOf(true)};
        }
        return null;
    }

    public final String[] getMethods() {
        return f3522a;
    }

    public final String getNameSpace() {
        return null;
    }
}
