package com.konylabs.api;

import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaTable;
import ny0k.aK;

/* renamed from: com.konylabs.api.a */
public final class C0353a implements Library {
    private static final String[] f2400a;

    static {
        f2400a = new String[]{"retrievecurrentacceleration", "startmonitoringacceleration", "stopmonitoringacceleration", "registeraccelerationevents", "unregisteraccelerationevents"};
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (objArr != null && objArr.length >= 2) {
                    if (objArr[0] instanceof Function) {
                        if (objArr[1] instanceof Function) {
                            aK.m3512a().m3525a(objArr[0], objArr[1]);
                            break;
                        }
                        throw new LuaError(100, "Error", "Type of second argument is invalid or null for kony.accelerometer.retrieveCurrentAcceleration(). Expected type is Function");
                    }
                    throw new LuaError(100, "Error", "Type of first argument is invalid or null for kony.accelerometer.retrieveCurrentAcceleration(). Expected type is Function");
                }
                throw new LuaError(101, "Error", "Invalid number of arguments for kony.accelerometer.retrieveCurrentAcceleration()");
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (objArr != null && objArr.length >= 3) {
                    if (objArr[0] instanceof Function) {
                        if (objArr[1] instanceof Function) {
                            if (objArr[2] instanceof LuaTable) {
                                aK.m3512a().m3526a(objArr[0], objArr[1], objArr[2]);
                                break;
                            }
                            throw new LuaError(100, "Error", "Type of third argument is invalid or null for kony.accelerometer.startMonitoringAcceleration(). Expected type is Object having key/value pairs");
                        }
                        throw new LuaError(100, "Error", "Type of second argument is invalid or null for kony.accelerometer.startMonitoringAcceleration(). Expected type is Function");
                    }
                    throw new LuaError(100, "Error", "Type of first argument is invalid or null for kony.accelerometer.startMonitoringAcceleration(). Expected type is Function");
                }
                throw new LuaError(101, "Error", "Invalid number of arguments for kony.accelerometer.startMonitoringAcceleration()");
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                aK.m3512a().m3528b();
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (objArr != null && objArr.length > 0) {
                    if (objArr[0] instanceof LuaTable) {
                        aK.m3512a().m3524a(objArr[0]);
                        break;
                    }
                    throw new LuaError(100, "Error", "Invalid type of arguments for kony.accelerometer.registerAccelerationEvents(). Expected type is a Object having key/value pairs");
                }
                throw new LuaError(101, "Error", "Invalid number of arguments for kony.accelerometer.registerAccelerationEvents()");
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                if (objArr != null && objArr.length > 0) {
                    if (objArr[0] instanceof LuaTable) {
                        aK.m3512a().m3529b(objArr[0]);
                        break;
                    }
                    throw new LuaError(100, "Error", "Invalid type of arguments for kony.accelerometer.unRegisterAccelerationEvents(). Expected type is a list having list of events");
                }
                throw new LuaError(101, "Error", "Invalid number of arguments for kony.accelerometer.unRegisterAccelerationEvents()");
        }
        return null;
    }

    public final String[] getMethods() {
        return f2400a;
    }

    public final String getNameSpace() {
        return "accelerometer";
    }
}
