package com.konylabs.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.libintf.Library;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import java.util.Hashtable;

/* renamed from: com.konylabs.api.P */
public final class C0347P implements Library {
    public static Hashtable f2393a;

    static {
        f2393a = new Hashtable();
    }

    private static synchronized Object[] m2276a(Object[] objArr) {
        Object[] objArr2;
        synchronized (C0347P.class) {
            if (objArr != null) {
                if (objArr.length >= 2) {
                    if (objArr[0] instanceof String) {
                        if (objArr[1] instanceof Function) {
                            String str = (String) objArr[0];
                            C0172r c0172r = (C0172r) f2393a.get(str);
                            if (c0172r != null) {
                                c0172r.m105a((Function) objArr[1]);
                                if (KonyMain.f3657e) {
                                    Log.d("TimerLib", "setcallback done for the timer id: " + str);
                                }
                                objArr2 = new Object[]{new Double(0.0d)};
                            } else {
                                objArr2 = new Object[]{new Double(101.0d), "timerid does not exists"};
                            }
                        } else if (KonyMain.m4057C()) {
                            throw new LuaError(101, "Error", "Type of second argument is invalid for kony.timer.setCallback(). Expected type is Function");
                        } else {
                            objArr2 = new Object[]{new Double(100.0d), "Type of second argument is invalid for kony.timer.setCallback(). Expected type is Function"};
                        }
                    } else if (KonyMain.m4057C()) {
                        throw new LuaError(101, "Error", "Type of first argument is invalid for kony.timer.setCallback(). Expected type is String");
                    } else {
                        objArr2 = new Object[]{new Double(100.0d), "Type of first argument is invalid for kony.timer.setCallback(). Expected type is String"};
                    }
                }
            }
            if (KonyMain.f3659g) {
                Log.e("TimerLib", "Invalid number of arguments for kony.timer.setCallback()");
            }
            if (KonyMain.m4057C()) {
                throw new LuaError(101, "Error", "Invalid number of arguments for kony.timer.setCallback()");
            }
            objArr2 = new Object[]{new Double(100.0d), "Invalid number of arguments for kony.timer.setCallback()"};
        }
        return objArr2;
    }

    private static synchronized void m2277b(Object[] objArr) {
        synchronized (C0347P.class) {
            if (objArr != null) {
                if (objArr.length > 0) {
                    if (objArr[0] instanceof String) {
                        String str = (String) objArr[0];
                        if (f2393a.containsKey(str)) {
                            ((C0172r) f2393a.get(str)).m106b();
                            f2393a.remove(str);
                            if (KonyMain.f3657e) {
                                Log.d("TimerLib", "Cancelled the timer id: " + str);
                            }
                        }
                    } else {
                        throw new LuaError(100, "Error", "Type of first argument is invalid for for kony.timer.cancel(). Expected type is String");
                    }
                }
            }
            throw new LuaError(101, "Error", "Invalid number of arguments for kony.timer.cancel()");
        }
    }

    private static synchronized void m2278c(Object[] objArr) {
        synchronized (C0347P.class) {
            if (objArr != null) {
                if (objArr.length >= 3) {
                    if (objArr[0] instanceof String) {
                        String str = (String) objArr[0];
                        if (objArr[1] instanceof Function) {
                            Function function = (Function) objArr[1];
                            if (objArr[2] instanceof Double) {
                                boolean z;
                                int doubleValue = (int) ((Double) objArr[2]).doubleValue();
                                if (objArr.length <= 3) {
                                    z = false;
                                } else if (objArr[3] instanceof Boolean) {
                                    z = ((Boolean) objArr[3]).booleanValue();
                                } else {
                                    throw new LuaError(100, "Error", "Type of fourth argument invalid for kony.timer.schedule(). Expected type is boolean");
                                }
                                if (f2393a.containsKey(str)) {
                                    throw new LuaError("kony.timer.schedule() error : Timer already exists with id " + str, 1201);
                                }
                                C0172r c0172r = new C0172r();
                                c0172r.f162a = str;
                                c0172r.m105a(function);
                                c0172r.f164c = (long) (doubleValue * 1000);
                                c0172r.f165d = z;
                                if (KonyMain.f3657e) {
                                    Log.d("TimerLib", "Scheduling the task id:" + str + " milliseconds: " + c0172r.f164c + " function: " + c0172r.f163b + " repeat: " + c0172r.f165d);
                                }
                                c0172r.m104a();
                                f2393a.put(str, c0172r);
                            } else {
                                throw new LuaError(100, "Error", "Type of third argument invalid for kony.timer.schedule(). Expected type is Number");
                            }
                        }
                        throw new LuaError(100, "Error", "Type of second argument invalid for kony.timer.schedule(). Expected type is function");
                    }
                    throw new LuaError(100, "Error", "Type of fist argument invalid for kony.timer.schedule(). Expected type is String");
                }
            }
            throw new LuaError(101, "Error", "Invalid number of arguments for kony.timer.schedule()");
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        if (i == 0) {
            C0347P.m2278c(objArr);
            return null;
        } else if (i != 1) {
            return C0347P.m2276a(objArr);
        } else {
            C0347P.m2277b(objArr);
            return null;
        }
    }

    public final String[] getMethods() {
        return new String[]{"schedule", "cancel", "setcallback"};
    }

    public final String getNameSpace() {
        return "timer";
    }
}
