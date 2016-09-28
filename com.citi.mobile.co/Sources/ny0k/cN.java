package ny0k;

import android.content.Context;
import android.util.Log;
import com.konylabs.android.C0128a;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.dB;
import com.konylabs.api.ui.hp;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class cN {
    private static HashMap f2260a;
    private static HashMap f2261b;
    private static String f2262c;
    private static Vector f2263d;
    private static Vector f2264e;

    static {
        f2260a = new HashMap(2, 1.0f);
        f2263d = m2155f();
    }

    public static dB m2139a(Object obj) {
        return obj instanceof String ? m2145b((String) obj) : obj instanceof hp ? ((hp) obj).m3352a() : null;
    }

    private static dB m2140a(JSONObject jSONObject) throws JSONException {
        dB dBVar = new dB();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj = (String) keys.next();
            Object obj2 = jSONObject.get(obj);
            if (obj2 instanceof Number) {
                hp.m3348a(obj, new Double(((Number) obj2).doubleValue()), dBVar);
            } else {
                hp.m3348a(obj, obj2, dBVar);
            }
        }
        return dBVar;
    }

    private static LuaTable m2141a(JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        LuaTable luaTable = new LuaTable(length, 0);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                luaTable.add(m2146b((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                luaTable.add(m2141a((JSONArray) obj));
            } else {
                luaTable.add(obj);
            }
        }
        return luaTable;
    }

    public static String m2142a() {
        return f2262c;
    }

    public static boolean m2143a(String str) {
        if (m2156f(str)) {
            f2262c = str;
            return true;
        } else if (!m2148b(str, m2153e(str + ".theme"))) {
            return false;
        } else {
            f2262c = str;
            return true;
        }
    }

    public static boolean m2144a(String str, String str2) throws MalformedURLException, IOException {
        IOException e;
        if (m2156f(str2)) {
            return true;
        }
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new URL(str.toString()).openConnection().getInputStream()));
            try {
                StringBuilder stringBuilder = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuilder.append(readLine);
                }
                bufferedReader.close();
                if (!m2148b(str2, stringBuilder.toString())) {
                    return false;
                }
                if (f2264e == null) {
                    f2264e = new Vector();
                }
                f2264e.add(str2);
                return true;
            } catch (IOException e2) {
                e = e2;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw e;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedReader = null;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw e;
        }
    }

    public static dB m2145b(String str) {
        dB dBVar = null;
        if (f2260a.get(f2262c) != null) {
            dBVar = (dB) ((HashMap) f2260a.get(f2262c)).get(str);
        }
        return dBVar == null ? (dB) ((HashMap) f2260a.get("default")).get(str) : dBVar;
    }

    private static LuaTable m2146b(JSONObject jSONObject) throws JSONException {
        Iterator keys = jSONObject.keys();
        LuaTable luaTable = new LuaTable(0, jSONObject.length());
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                luaTable.setTable(str, m2146b((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                luaTable.setTable(str, m2141a((JSONArray) obj));
            } else {
                luaTable.setTable(str, obj);
            }
        }
        return luaTable;
    }

    public static Vector m2147b() {
        Vector vector = new Vector((f2264e != null ? f2264e.size() : 0) + f2263d.size());
        vector.addAll(f2263d);
        if (f2264e != null) {
            vector.addAll(f2264e);
        }
        return vector;
    }

    private static boolean m2148b(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            Object obj = null;
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                Object obj2 = jSONObject.get(str3);
                if (str3.equals("metadata")) {
                    if (f2261b == null) {
                        f2261b = new HashMap(2, 1.0f);
                    }
                    if (obj2 instanceof JSONObject) {
                        f2261b.put(str, m2146b((JSONObject) obj2));
                    } else if (obj2 instanceof JSONArray) {
                        f2261b.put(str, m2141a((JSONArray) obj2));
                    } else {
                        f2261b.put(str, obj2);
                    }
                } else {
                    HashMap hashMap;
                    if (obj2 instanceof JSONObject) {
                        if (obj == null) {
                            hashMap = new HashMap(jSONObject.length(), 1.0f);
                        }
                        hashMap.put(str3, m2140a((JSONObject) obj2));
                    }
                    obj = hashMap;
                }
            }
            if (obj != null) {
                f2260a.put(str, obj);
            }
            return true;
        } catch (JSONException e) {
            if (KonyMain.f3657e) {
                Log.e("Themes", "Unable to load theme from JSON String");
                Log.d("Themes", BuildConfig.FLAVOR + e);
            }
            return false;
        }
    }

    public static LuaTable m2149c() {
        if (f2261b == null) {
            return null;
        }
        Object obj = f2261b.get(f2262c);
        if (obj instanceof LuaTable) {
            return (LuaTable) obj;
        }
        LuaTable luaTable = new LuaTable(1, 0);
        luaTable.add(obj);
        return luaTable;
    }

    public static boolean m2150c(String str) {
        if (str == null || f2264e == null || !f2264e.contains(str)) {
            return false;
        }
        f2264e.remove(str);
        if (f2261b != null) {
            f2261b.remove(str);
        }
        f2260a.remove(str);
        return true;
    }

    public static void m2151d() {
        f2260a.clear();
        f2264e = null;
        f2262c = null;
        f2263d = m2155f();
    }

    public static boolean m2152d(String str) {
        return (f2263d == null || !f2263d.contains(str)) ? f2264e != null && f2264e.contains(str) : true;
    }

    private static String m2153e(String str) {
        StringBuilder stringBuilder;
        Object e;
        Throwable th;
        BufferedReader bufferedReader = null;
        BufferedReader bufferedReader2;
        try {
            Context appContext = KonyMain.getAppContext();
            if (appContext != null) {
                InputStream previewResource;
                if (KonyMain.f3655c.m2134b() == 2 || KonyMain.m4059E() == 3) {
                    KonyMain actContext = KonyMain.getActContext();
                    previewResource = actContext != null ? actContext.getPreviewResource(str) : null;
                    if (previewResource == null) {
                        throw new IOException();
                    }
                }
                previewResource = appContext.getResources().getAssets().open(str);
                bufferedReader2 = new BufferedReader(new InputStreamReader(previewResource));
                try {
                    stringBuilder = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        stringBuilder.append(readLine);
                    }
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    try {
                        Log.e("Themes", "Exception while reading JSON String from file " + e);
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        stringBuilder = null;
                        return stringBuilder != null ? stringBuilder.toString() : null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e42) {
                                e42.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                if (stringBuilder != null) {
                }
            } else if (null == null) {
                return null;
            } else {
                try {
                    bufferedReader.close();
                    return null;
                } catch (IOException e422) {
                    e422.printStackTrace();
                    return null;
                }
            }
        } catch (IOException e5) {
            e = e5;
            bufferedReader2 = null;
            Log.e("Themes", "Exception while reading JSON String from file " + e);
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            stringBuilder = null;
            if (stringBuilder != null) {
            }
        } catch (Throwable th3) {
            bufferedReader2 = null;
            th = th3;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
    }

    public static void m2154e() {
        if (!m2143a("default") && KonyMain.f3659g) {
            Log.e("Themes", "Unable to initialize default theme");
        }
    }

    private static Vector m2155f() {
        try {
            Vector vector = new Vector(5);
            Context appContext = KonyMain.getAppContext();
            if (appContext != null) {
                String[] list = KonyMain.m4059E() == 3 ? new File(C0128a.m16a().m28d()).list() : appContext.getAssets().list(BuildConfig.FLAVOR);
                if (list != null && list.length > 0) {
                    for (String str : list) {
                        if (str.endsWith(".theme")) {
                            vector.add(str.substring(0, str.indexOf(".theme")));
                        }
                    }
                }
            }
            return vector.size() == 0 ? null : vector;
        } catch (IOException e) {
            return null;
        }
    }

    private static boolean m2156f(String str) {
        return f2260a.get(str) != null;
    }
}
