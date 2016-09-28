package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.konylabs.api.ui.r */
public class C0216r {
    final /* synthetic */ hg f1606a;

    C0216r(hg hgVar) {
        this.f1606a = hgVar;
    }

    public static LuaTable m1554a(String str, int i) {
        if (str != null) {
            try {
                return C0216r.m1555a(new JSONArray(str), i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static LuaTable m1555a(JSONArray jSONArray, int i) throws JSONException {
        int i2 = 0;
        LuaTable luaTable = new LuaTable(10, 0);
        if (i == 1 && KonyMain.m4056B() && jSONArray.length() > 0 && JSONObject.NULL.equals(jSONArray.get(0))) {
            i2 = 1;
        }
        while (i2 < jSONArray.length()) {
            Object obj = jSONArray.get(i2);
            int size = luaTable.list.size() + 1;
            if (obj instanceof JSONArray) {
                luaTable.setTable(new Double((double) size), C0216r.m1555a((JSONArray) obj, i));
            } else if (obj instanceof JSONObject) {
                luaTable.setTable(new Double((double) size), C0216r.m1556a((JSONObject) obj, i));
            } else if (obj instanceof Number) {
                luaTable.setTable(new Double((double) size), new Double(((Number) obj).doubleValue()));
            } else if (JSONObject.NULL.equals(obj)) {
                luaTable.setTable(new Double((double) size), LuaNil.nil);
            } else {
                luaTable.setTable(new Double((double) size), obj);
            }
            i2++;
        }
        return luaTable;
    }

    private static LuaTable m1556a(JSONObject jSONObject, int i) throws JSONException {
        LuaTable luaTable = new LuaTable(0, 10);
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object next = keys.next();
            Object obj = jSONObject.get(next.toString());
            if (obj instanceof JSONArray) {
                luaTable.setTable(next, C0216r.m1555a((JSONArray) obj, i));
            } else if (obj instanceof JSONObject) {
                luaTable.setTable(next, C0216r.m1556a((JSONObject) obj, i));
            } else if (obj instanceof Number) {
                luaTable.setTable(next, new Double(((Number) obj).doubleValue()));
            } else if (JSONObject.NULL.equals(obj)) {
                luaTable.setTable(next, LuaNil.nil);
            } else {
                luaTable.setTable(next, obj);
            }
        }
        return luaTable;
    }

    public static String m1557a(LuaTable luaTable, int i) {
        Hashtable hashtable = luaTable.map;
        if (hashtable == null || hashtable.isEmpty()) {
            Vector vector = luaTable.list;
            if (vector == null || vector.size() == 0) {
                return null;
            }
            JSONArray a = C0216r.m1558a(vector, i);
            if (KonyMain.f3657e) {
                Log.d("HybridJSONUtils", "JSON array is " + a.toString());
            }
            return a.toString();
        }
        JSONObject a2 = C0216r.m1559a(hashtable, i);
        if (KonyMain.f3657e) {
            Log.d("HybridJSONUtils", "JSON Object is " + a2.toString());
        }
        return a2.toString();
    }

    private static JSONArray m1558a(Vector vector, int i) {
        JSONArray jSONArray = new JSONArray();
        if (i == 2 && KonyMain.m4056B()) {
            jSONArray.put(JSONObject.NULL);
        }
        for (int i2 = 0; i2 < vector.size(); i2++) {
            Object elementAt = vector.elementAt(i2);
            if (elementAt instanceof LuaTable) {
                Hashtable hashtable = ((LuaTable) elementAt).map;
                Vector vector2 = ((LuaTable) elementAt).list;
                if ((hashtable == null || hashtable.isEmpty()) && (vector2 == null || vector2.size() == 0)) {
                    try {
                        jSONArray.put(new JSONObject("{}"));
                    } catch (JSONException e) {
                        if (KonyMain.f3659g) {
                            Log.e("HybridJSONUtils", BuildConfig.FLAVOR + e);
                        }
                    }
                }
                if (!(hashtable == null || hashtable.isEmpty())) {
                    jSONArray.put(C0216r.m1559a(hashtable, i));
                }
                if (!(vector2 == null || vector2.size() == 0)) {
                    jSONArray.put(C0216r.m1558a(vector2, i));
                }
            } else if (elementAt instanceof LuaNil) {
                jSONArray.put(JSONObject.NULL);
            } else {
                jSONArray.put(elementAt);
            }
        }
        return jSONArray;
    }

    private static JSONObject m1559a(Hashtable hashtable, int i) {
        JSONObject jSONObject = new JSONObject();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            Object obj = hashtable.get(nextElement);
            if (obj instanceof LuaTable) {
                Hashtable hashtable2 = ((LuaTable) obj).map;
                Vector vector = ((LuaTable) obj).list;
                if ((hashtable == null || hashtable.isEmpty()) && (vector == null || vector.size() == 0)) {
                    try {
                        String str = (String) nextElement;
                        jSONObject.put(r0, new JSONObject("{}"));
                    } catch (JSONException e) {
                        if (KonyMain.f3659g) {
                            Log.e("HybridJSONUtils", BuildConfig.FLAVOR + e);
                        }
                    }
                }
                if (!(hashtable2 == null || hashtable2.isEmpty())) {
                    try {
                        jSONObject.put((String) nextElement, C0216r.m1559a(hashtable2, i));
                    } catch (JSONException e2) {
                        if (KonyMain.f3659g) {
                            Log.e("HybridJSONUtils", BuildConfig.FLAVOR + e2);
                        }
                    }
                }
                if (!(vector == null || vector.size() == 0)) {
                    try {
                        jSONObject.put((String) nextElement, C0216r.m1558a(vector, i));
                    } catch (JSONException e22) {
                        if (KonyMain.f3659g) {
                            Log.e("HybridJSONUtils", BuildConfig.FLAVOR + e22);
                        }
                    }
                }
            } else {
                try {
                    jSONObject.put((String) nextElement, obj);
                } catch (JSONException e222) {
                    if (KonyMain.f3659g) {
                        Log.e("HybridJSONUtils", BuildConfig.FLAVOR + e222);
                    }
                }
            }
        }
        return jSONObject;
    }

    public void m1560a(boolean z) {
        if (this.f1606a.f4425e != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = this.f1606a.f4425e;
            Bundle bundle = new Bundle(2);
            bundle.putSerializable("key0", this.f1606a);
            bundle.putString("key1", z ? "prev" : "next");
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }
}
