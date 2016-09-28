package com.konylabs.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.io.Serializable;

/* renamed from: com.konylabs.gcm.a */
public final class C0225a {
    public static int f1652a;
    private static Object f1653b;
    private static Object f1654c;
    private static Object f1655d;
    private static Object f1656e;
    private static Object f1657f;
    private static Object f1658g;
    private static String f1659h;
    private static String[] f1660i;
    private static String[] f1661j;
    private static boolean f1662k;
    private static int f1663l;

    static {
        f1653b = null;
        f1654c = null;
        f1655d = null;
        f1656e = null;
        f1657f = null;
        f1658g = null;
        f1659h = null;
        f1660i = null;
        f1661j = null;
        f1662k = false;
        f1663l = 0;
        f1652a = 0;
    }

    public static int m1595a(Object[] objArr) {
        LuaNil luaNil = null;
        if (objArr == null || objArr.length != 1) {
            return 1400;
        }
        if (objArr[0] != null && (objArr[0] instanceof LuaTable)) {
            luaNil = ((LuaTable) objArr[0]).getTable("senderid");
        }
        if (luaNil == null || luaNil == LuaNil.nil) {
            return 1401;
        }
        Context activityContext = KonyMain.getActivityContext();
        String str = (String) luaNil;
        if (activityContext != null) {
            f1652a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.putExtra("app", PendingIntent.getBroadcast(activityContext, 0, new Intent(), 0));
            intent.putExtra("sender", str);
            activityContext.startService(intent);
        }
        return 0;
    }

    public static void m1596a() {
        if (KonyMain.f3657e) {
            Log.d("KonyGCMManager", "KonyGCMManager.onUnregistrationSuccess() called");
        }
        if (f1657f != null) {
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = f1657f;
            KonyMain.m4121f().sendMessage(obtain);
        } else if (KonyMain.f3657e) {
            Log.d("KonyGCMManager", "onUnregistrationSuccess callback not set");
        }
    }

    public static void m1597a(int i) {
        f1663l = i;
    }

    public static void m1598a(Intent intent, int i) {
        if (KonyMain.f3657e) {
            Log.d("KonyGCMManager", "KonyGCMManager.deliverPushNotificationMessage() called. msgType=" + i);
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Bundle bundle = extras.getBundle("push-notification-msg");
            if (bundle != null) {
                if (KonyMain.f3657e) {
                    Log.d("KonyGCMManager", "KonyGCMManager.deliverPushNotificationMessage() called for new push message");
                }
                String[] stringArray = bundle.getStringArray("push-msg-keys");
                String[] stringArray2 = bundle.getStringArray("push-msg-values");
                if (i == 2) {
                    C0225a.m1605b(stringArray, stringArray2);
                    return;
                } else {
                    C0225a.m1600a(stringArray, stringArray2);
                    return;
                }
            }
            extras = extras.getBundle("push-notification-regid");
            if (extras != null) {
                if (KonyMain.f3657e) {
                    Log.d("KonyGCMManager", "KonyGCMManager.deliverPushNotificationMessage() called for new registration id");
                }
                C0225a.m1599a(extras.getString("push-msg-regid"));
            }
        }
    }

    public static void m1599a(String str) {
        if (str != null && f1653b != null) {
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = f1653b;
            Bundle bundle = new Bundle(1);
            bundle.putString("key0", str);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        } else if (KonyMain.f3657e) {
            Log.d("KonyGCMManager", "onRegistrationSuccess callback not set");
            f1659h = str;
        }
    }

    public static void m1600a(String[] strArr, String[] strArr2) {
        if (KonyMain.f3657e) {
            Log.d("KonyGCMManager", "KonyGCMManager.onOnlinePushNotification() called");
        }
        C0225a.m1601a(strArr, strArr2, f1655d);
    }

    private static void m1601a(String[] strArr, String[] strArr2, Object obj) {
        if (obj != null) {
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = obj;
            Bundle bundle = new Bundle(1);
            Serializable luaTable = new LuaTable();
            if (strArr != null) {
                int i = 0;
                while (i < strArr.length) {
                    if (strArr[i] != null) {
                        if (strArr2 == null || strArr2[i] == null) {
                            luaTable.setTable(strArr[i], LuaNil.nil);
                        } else {
                            luaTable.setTable(strArr[i], strArr2[i]);
                        }
                    }
                    i++;
                }
            }
            bundle.putSerializable("key0", luaTable);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        } else if (KonyMain.f3657e) {
            Log.d("KonyGCMManager", "pushNotification callback not set");
        }
    }

    public static int m1602b() {
        return f1663l;
    }

    public static int m1603b(Object[] objArr) {
        if (objArr == null || objArr.length != 1) {
            return 1400;
        }
        if (objArr[0] == null || !(objArr[0] instanceof LuaTable)) {
            return 1401;
        }
        LuaTable luaTable = (LuaTable) objArr[0];
        f1653b = luaTable.getTable("onsuccessfulregistration");
        f1654c = luaTable.getTable("onfailureregistration");
        f1657f = luaTable.getTable("onsuccessfulderegistration");
        f1658g = luaTable.getTable("onfailurederegistration");
        f1655d = luaTable.getTable("onlinenotification");
        f1656e = luaTable.getTable("offlinenotification");
        boolean z = f1653b != null && (f1653b instanceof Function) && f1654c != null && (f1654c instanceof Function) && f1657f != null && (f1657f instanceof Function) && f1658g != null && (f1658g instanceof Function) && f1655d != null && (f1655d instanceof Function) && f1656e != null && (f1656e instanceof Function);
        if (!z) {
            return 1401;
        }
        if (f1662k && f1656e != null) {
            C0225a.m1601a(f1660i, f1661j, f1656e);
            f1660i = null;
            f1661j = null;
            f1662k = false;
        }
        if (!(f1659h == null || f1653b == null)) {
            C0225a.m1599a(f1659h);
            f1659h = null;
        }
        return 0;
    }

    public static void m1604b(String str) {
        if (f1654c != null) {
            int i;
            Object obj;
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = f1654c;
            Bundle bundle = new Bundle(1);
            Serializable luaTable = new LuaTable();
            String str2 = "Unknown error";
            if (str == null) {
                str = str2;
                i = 1403;
            } else if (str.equals("SERVICE_NOT_AVAILABLE")) {
                i = 1402;
                obj = "Google C2DM Service not available";
            } else if (str.equals("ACCOUNT_MISSING")) {
                obj = "There is no Google account on the phone";
                i = 1403;
            } else if (str.equals("AUTHENTICATION_FAILED")) {
                obj = "Authentication failed";
                i = 1403;
            } else if (str.equals("TOO_MANY_REGISTRATIONS")) {
                obj = "Too many applications registered for C2DM";
                i = 1403;
            } else if (str.equals("INVALID_SENDER")) {
                obj = "The sender account is not recognized";
                i = 1403;
            } else if (str.equals("PHONE_REGISTRATION_ERROR")) {
                obj = "Incorrect phone registration with Google. This phone doesn't currently support C2DM";
                i = 1403;
            } else {
                i = 1403;
            }
            luaTable.setTable("errorcode", Integer.valueOf(i));
            luaTable.setTable("errormessage", obj);
            bundle.putSerializable("key0", luaTable);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        } else if (KonyMain.f3657e) {
            Log.d("KonyGCMManager", "onRegistrationFailure callback not set");
        }
    }

    private static void m1605b(String[] strArr, String[] strArr2) {
        if (KonyMain.f3657e) {
            Log.d("KonyGCMManager", "KonyGCMManager.onOfflinePushNotification() called");
        }
        if (f1656e != null) {
            C0225a.m1601a(strArr, strArr2, f1656e);
            f1662k = false;
            return;
        }
        f1660i = strArr;
        f1661j = strArr2;
        f1662k = true;
    }

    public static int m1606c(Object[] objArr) {
        if (objArr == null || objArr.length != 1) {
            return 1400;
        }
        if (objArr[0] == null || !(objArr[0] instanceof LuaTable)) {
            return 1401;
        }
        Context actContext = KonyMain.getActContext();
        if (actContext == null) {
            return 0;
        }
        f1652a = 2;
        Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        intent.putExtra("app", PendingIntent.getBroadcast(actContext, 0, new Intent(), 0));
        actContext.startService(intent);
        return 0;
    }

    public static void m1607c(String str) {
        if (KonyMain.f3657e) {
            Log.d("KonyGCMManager", "KonyGCMManager.onUnregistrationFailure() called. error=" + str);
        }
        if (f1658g != null) {
            Object obj;
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = f1658g;
            Bundle bundle = new Bundle(1);
            Serializable luaTable = new LuaTable();
            String str2 = "Unknown error";
            if (str == null) {
                str = str2;
            } else if (str.equals("SERVICE_NOT_AVAILABLE")) {
                obj = "Google C2DM Service not available";
            } else if (str.equals("ACCOUNT_MISSING")) {
                obj = "There is no Google account on the phone";
            } else if (str.equals("AUTHENTICATION_FAILED")) {
                obj = "Authentication failed";
            } else if (str.equals("TOO_MANY_REGISTRATIONS")) {
                obj = "Too many applications registered for C2DM";
            } else if (str.equals("INVALID_SENDER")) {
                obj = "The sender account is not recognized";
            } else if (str.equals("PHONE_REGISTRATION_ERROR")) {
                obj = "Incorrect phone registration with Google. This phone doesn't currently support C2DM";
            }
            luaTable.setTable("errorcode", Integer.valueOf(1404));
            luaTable.setTable("errormessage", obj);
            bundle.putSerializable("key0", luaTable);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        } else if (KonyMain.f3657e) {
            Log.d("KonyGCMManager", "onRegistrationFailure callback not set");
        }
    }
}
