package com.konylabs.android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.konylabs.api.ui.fv;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

/* renamed from: com.konylabs.android.f */
public final class C0133f {
    private static int f30a;
    private static HashMap f31b;
    private static Hashtable f32c;

    static {
        f30a = 1;
        f31b = null;
        f32c = null;
    }

    public static int m40a(Intent intent) {
        f30a = 1;
        String action = intent.getAction();
        String packageName = KonyMain.getAppContext().getPackageName();
        if (action != null) {
            if (action.equals("android.intent.action.MAIN")) {
                f30a = 1;
            } else if (action.equals(packageName + ".GCM_MSG_VIEW") || action.equals(packageName + ".GCM_REGID_VIEW")) {
                f30a = 2;
            } else if (!(intent.getData() == null || intent.getData().getScheme() == null)) {
                f30a = 3;
            }
        }
        return f30a;
    }

    public static void m42a(Intent intent, boolean z) {
        f31b = C0133f.m46b(intent);
        if (f32c != null) {
            KonyMain.m4121f().post(new C0134g());
        } else if (z && KonyMain.f3653a != null) {
            fv.m4406c(KonyMain.f3653a);
        }
    }

    public static void m43a(Hashtable hashtable) {
        f32c = hashtable;
        if (hashtable != null) {
            LuaTable luaTable = new LuaTable();
            luaTable.setTable("launchmode", new Double((double) f30a));
            luaTable.setTable("launchparams", C0133f.m44b(f31b));
            try {
                Object[] execute;
                fv fvVar;
                LuaNil luaNil = f32c.get("preappinit");
                if (!(luaNil == null || luaNil == LuaNil.nil)) {
                    if (KonyMain.f3657e) {
                        Log.d("KonyAppInitializer", "Calling preappinit.....");
                    }
                    ((Function) luaNil).execute(new Object[]{luaTable});
                }
                luaNil = f32c.get("init");
                if (!(luaNil == null || luaNil == LuaNil.nil)) {
                    if (KonyMain.f3657e) {
                        Log.d("KonyAppInitializer", "Calling appinit.....launchMode=" + f30a);
                    }
                    ((Function) luaNil).execute(new Object[]{luaTable});
                }
                fv fvVar2 = null;
                luaNil = f32c.get("postappinit");
                if (!(luaNil == null || luaNil == LuaNil.nil)) {
                    if (KonyMain.f3657e) {
                        Log.d("KonyAppInitializer", "Calling postappinit.....launchMode=" + f30a);
                    }
                    execute = ((Function) luaNil).execute(new Object[]{luaTable});
                    if (!(execute == null || execute.length <= 0 || execute[0] == null || execute[0] == LuaNil.nil)) {
                        fvVar2 = (fv) execute[0];
                    }
                }
                luaNil = f32c.get("appservice");
                if (!(luaNil == null || luaNil == LuaNil.nil)) {
                    if (KonyMain.f3657e) {
                        Log.d("KonyAppInitializer", "Calling appservice.....launchMode=" + f30a);
                    }
                    execute = ((Function) luaNil).execute(new Object[]{luaTable});
                    if (!(execute == null || execute.length <= 0 || execute[0] == null || execute[0] == LuaNil.nil)) {
                        fvVar = (fv) execute[0];
                        if (fvVar == null) {
                            fvVar.m4455g();
                        }
                        luaNil = f32c.get("showstartupform");
                        if (luaNil != null && luaNil != LuaNil.nil) {
                            if (KonyMain.f3657e) {
                                Log.d("KonyAppInitializer", "Calling showstartupform.....launchMode=" + f30a);
                            }
                            ((Function) luaNil).execute(new Object[]{luaTable});
                            return;
                        }
                        return;
                    }
                }
                fvVar = fvVar2;
                if (fvVar == null) {
                    luaNil = f32c.get("showstartupform");
                    if (luaNil != null) {
                        return;
                    }
                    return;
                }
                fvVar.m4455g();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static LuaTable m44b(HashMap hashMap) {
        if (hashMap == null) {
            return null;
        }
        LuaTable luaTable = new LuaTable(hashMap.size(), 0);
        for (String str : hashMap.keySet()) {
            luaTable.setTable(str, hashMap.get(str));
        }
        return luaTable;
    }

    private static HashMap m46b(Intent intent) {
        HashMap hashMap = new HashMap();
        if (f30a == 2) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                extras = extras.getBundle("push-notification-msg");
                if (extras != null) {
                    String[] stringArray = extras.getStringArray("push-msg-keys");
                    String[] stringArray2 = extras.getStringArray("push-msg-values");
                    if (stringArray != null) {
                        for (int i = 0; i < stringArray.length; i++) {
                            if (stringArray[i] != null) {
                                hashMap.put(stringArray[i], stringArray2[i]);
                            }
                        }
                    }
                }
            }
        } else if (f30a == 3) {
            Uri data = intent.getData();
            if (data != null) {
                try {
                    List<NameValuePair> parse = URLEncodedUtils.parse(new URI(data.toString()), "utf-8");
                    if (parse != null) {
                        for (NameValuePair nameValuePair : parse) {
                            String name = nameValuePair.getName();
                            String value = nameValuePair.getValue();
                            if (name != null) {
                                hashMap.put(name, value);
                            }
                        }
                    }
                } catch (URISyntaxException e) {
                    if (KonyMain.f3657e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return hashMap;
    }
}
