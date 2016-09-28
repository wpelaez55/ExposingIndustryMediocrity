package ny0k;

import android.util.Log;
import android.view.MotionEvent;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
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

public class aH {
    private aF f1976a;
    private int f1977b;
    private int f1978c;
    private int f1979d;
    private float f1980e;
    private int f1981f;
    private int f1982g;
    private boolean f1983h;
    private boolean f1984i;
    private int f1985j;
    private Boolean f1986k;

    public aH(aF aFVar) {
        this.f1977b = 0;
        this.f1978c = 4;
        this.f1979d = 4;
        this.f1980e = 0.0f;
        this.f1981f = 0;
        this.f1982g = 0;
        this.f1983h = false;
        this.f1984i = false;
        this.f1985j = 0;
        this.f1986k = Boolean.valueOf(false);
        this.f1976a = aFVar;
    }

    public static LuaTable m1892a(String str) {
        LuaTable luaTable;
        JSONException jSONException;
        try {
            LuaTable luaTable2 = new LuaTable(2, 10);
            try {
                return str.trim().startsWith("{") ? m1894a(new JSONObject(str)) : m1893a(new JSONArray(str));
            } catch (JSONException e) {
                JSONException jSONException2 = e;
                luaTable = luaTable2;
                jSONException = jSONException2;
                luaTable.setTable("opstatus", new Double(1013.0d));
                luaTable.setTable("errmsg", "Middleware returned invalid JSON string.");
                if (KonyMain.f3657e) {
                    return luaTable;
                }
                Log.d("JSONUtil", BuildConfig.FLAVOR + jSONException.getMessage());
                return luaTable;
            }
        } catch (JSONException e2) {
            jSONException = e2;
            luaTable = null;
            luaTable.setTable("opstatus", new Double(1013.0d));
            luaTable.setTable("errmsg", "Middleware returned invalid JSON string.");
            if (KonyMain.f3657e) {
                return luaTable;
            }
            Log.d("JSONUtil", BuildConfig.FLAVOR + jSONException.getMessage());
            return luaTable;
        }
    }

    private static LuaTable m1893a(JSONArray jSONArray) throws JSONException {
        LuaTable luaTable = new LuaTable(10, 0);
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            int size = luaTable.list.size() + 1;
            if (obj instanceof JSONArray) {
                luaTable.setTable(new Double((double) size), m1893a((JSONArray) obj));
            } else if (obj instanceof JSONObject) {
                luaTable.setTable(new Double((double) size), m1894a((JSONObject) obj));
            } else if (obj instanceof Number) {
                luaTable.setTable(new Double((double) size), new Double(((Number) obj).doubleValue()));
            } else if (!JSONObject.NULL.equals(obj)) {
                luaTable.setTable(new Double((double) size), obj);
            } else if (KonyMain.f3657e) {
                Log.d("JSONUtil", "JSON ARRAY HAS NULL ENTRY");
            }
        }
        return luaTable;
    }

    private static LuaTable m1894a(JSONObject jSONObject) throws JSONException {
        LuaTable luaTable = new LuaTable(0, 10);
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object next = keys.next();
            Object obj = jSONObject.get(next.toString());
            if (obj instanceof JSONArray) {
                luaTable.setTable(next, m1893a((JSONArray) obj));
            } else if (obj instanceof JSONObject) {
                luaTable.setTable(next, m1894a((JSONObject) obj));
            } else if (obj instanceof Number) {
                luaTable.setTable(next, new Double(((Number) obj).doubleValue()));
            } else if (JSONObject.NULL.equals(obj)) {
                if (KonyMain.f3657e) {
                    Log.d("JSONUtil", "JSON OBJECT HAS NULL ENTRY");
                }
                luaTable.setTable(next, BuildConfig.FLAVOR);
            } else {
                luaTable.setTable(next, obj);
            }
        }
        return luaTable;
    }

    public static String m1895a(LuaTable luaTable) {
        Hashtable hashtable = luaTable.map;
        if (hashtable == null || hashtable.isEmpty()) {
            Vector vector = luaTable.list;
            if (vector == null || vector.size() == 0) {
                return null;
            }
            JSONArray a = m1896a(vector);
            if (KonyMain.f3657e) {
                Log.d("JSONUtil", "JSON array is " + a.toString());
            }
            return a.toString();
        }
        JSONObject a2 = m1897a(hashtable);
        if (KonyMain.f3657e) {
            Log.d("JSONUtil", "JSON Object is " + a2.toString());
        }
        return a2.toString();
    }

    public static JSONArray m1896a(Vector vector) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < vector.size(); i++) {
            Object elementAt = vector.elementAt(i);
            if (elementAt instanceof LuaTable) {
                Hashtable hashtable = ((LuaTable) elementAt).map;
                Vector vector2 = ((LuaTable) elementAt).list;
                if ((hashtable == null || hashtable.isEmpty()) && (vector2 == null || vector2.size() == 0)) {
                    try {
                        jSONArray.put(new JSONObject("{}"));
                    } catch (JSONException e) {
                        if (KonyMain.f3659g) {
                            Log.e("JSONUtil", BuildConfig.FLAVOR + e);
                        }
                    }
                }
                if (!(hashtable == null || hashtable.isEmpty())) {
                    jSONArray.put(m1897a(hashtable));
                }
                if (!(vector2 == null || vector2.size() == 0)) {
                    jSONArray.put(m1896a(vector2));
                }
            } else if (elementAt instanceof LuaNil) {
                jSONArray.put(JSONObject.NULL);
            } else {
                jSONArray.put(elementAt);
            }
        }
        return jSONArray;
    }

    public static JSONObject m1897a(Hashtable hashtable) {
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
                            Log.e("JSONUtil", BuildConfig.FLAVOR + e);
                        }
                    }
                }
                if (!(hashtable2 == null || hashtable2.isEmpty())) {
                    try {
                        jSONObject.put((String) nextElement, m1897a(hashtable2));
                    } catch (JSONException e2) {
                        if (KonyMain.f3659g) {
                            Log.e("JSONUtil", BuildConfig.FLAVOR + e2);
                        }
                    }
                }
                if (!(vector == null || vector.size() == 0)) {
                    try {
                        jSONObject.put((String) nextElement, m1896a(vector));
                    } catch (JSONException e22) {
                        if (KonyMain.f3659g) {
                            Log.e("JSONUtil", BuildConfig.FLAVOR + e22);
                        }
                    }
                }
            } else {
                try {
                    jSONObject.put((String) nextElement, obj);
                } catch (JSONException e222) {
                    if (KonyMain.f3659g) {
                        Log.e("JSONUtil", BuildConfig.FLAVOR + e222);
                    }
                }
            }
        }
        return jSONObject;
    }

    public final void m1898a(int i) {
        this.f1977b = i;
        if (this.f1977b == 0) {
            this.f1976a.m1881i();
        }
    }

    public final void m1899a(MotionEvent motionEvent) {
        this.f1979d = motionEvent.getAction();
        if (this.f1979d == 0) {
            this.f1980e = motionEvent.getY();
            this.f1986k = Boolean.valueOf(false);
            this.f1985j = 0;
            this.f1977b = 0;
            this.f1978c = 4;
            this.f1976a.m1881i();
            this.f1976a.m1882j();
        }
    }

    public final void m1900b(int i) {
        this.f1978c = i;
        if (this.f1978c == 4) {
            this.f1976a.m1882j();
        }
    }

    public final void m1901b(MotionEvent motionEvent) {
        int i = 0;
        this.f1979d = motionEvent.getAction();
        switch (this.f1979d) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (this.f1976a.m1877e() == 0) {
                    if (this.f1977b == 2) {
                        m1898a(3);
                        this.f1976a.m1870a(3);
                        this.f1976a.m1869a();
                        this.f1976a.m1881i();
                    } else if (this.f1977b == 1) {
                        this.f1976a.m1881i();
                    }
                    if (this.f1976a.m1878f()) {
                        this.f1976a.m1873c();
                    }
                } else {
                    aF aFVar = this.f1976a;
                    int i2 = this.f1985j;
                    if (aFVar.m1879g()) {
                        if (this.f1978c == 6) {
                            m1900b(7);
                            this.f1976a.m1872b(7);
                            this.f1976a.m1871b();
                            this.f1976a.m1882j();
                        } else if (this.f1978c == 5) {
                            this.f1976a.m1882j();
                        }
                        this.f1976a.m1875d();
                    } else {
                        this.f1977b = 0;
                        this.f1978c = 4;
                        this.f1976a.m1881i();
                        this.f1976a.m1882j();
                    }
                }
                this.f1986k = Boolean.valueOf(false);
                this.f1985j = 0;
                this.f1980e = 0.0f;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                float y = motionEvent.getY();
                int i3 = (int) (this.f1980e - y);
                int e = this.f1976a.m1877e();
                if (e == 0) {
                    if (this.f1986k.booleanValue()) {
                        i = i3;
                    } else {
                        this.f1980e = y;
                        this.f1986k = Boolean.valueOf(true);
                    }
                    this.f1976a.m1874c(i);
                    i3 = this.f1976a.m1880h();
                    if (KonyMain.f3657e) {
                        Log.i(" Reach Begin ", " diff == " + i + " PullView height = " + i3 + " PullView measuredHeight = " + this.f1981f);
                    }
                    if (this.f1977b == 0) {
                        m1898a(1);
                        if (KonyMain.f3657e) {
                            Log.i("PULL PUSH STATE", " CURRENT STATE == HEADER_PULL_TO_REFRESH");
                        }
                        this.f1976a.m1870a(1);
                        return;
                    } else if (this.f1977b == 1 && i3 > this.f1981f) {
                        m1898a(2);
                        if (KonyMain.f3657e) {
                            Log.i("PULL PUSH STATE", " CURRENT STATE == HEADER_RELEASE_TO_REFRESH");
                        }
                        this.f1976a.m1870a(2);
                        return;
                    } else if (this.f1977b == 2 && i3 < this.f1981f) {
                        m1898a(1);
                        if (KonyMain.f3657e) {
                            Log.i("PULL PUSH STATE", " CURRENT STATE == HEADER_PULL_TO_REFRESH");
                        }
                        this.f1976a.m1870a(1);
                        return;
                    } else {
                        return;
                    }
                }
                if (e == 1) {
                    this.f1986k = Boolean.valueOf(false);
                }
                aF aFVar2 = this.f1976a;
                e = this.f1985j;
                if (aFVar2.m1879g()) {
                    if (KonyMain.f3657e) {
                        Log.i(" Reach Bottom ", " newFooterPadding ==== " + this.f1985j + " diff==" + i3);
                    }
                    this.f1985j = i3;
                    this.f1976a.m1876d(this.f1985j);
                    if (this.f1978c == 4) {
                        m1900b(5);
                        if (KonyMain.f3657e) {
                            Log.i("PULL PUSH STATE", " CURRENT STATE == FOOTER_PUSH_TO_REFRESH");
                        }
                        this.f1976a.m1872b(5);
                    } else if (this.f1978c == 5 && this.f1985j - this.f1982g > this.f1982g) {
                        m1900b(6);
                        if (KonyMain.f3657e) {
                            Log.i("PULL PUSH STATE", " CURRENT STATE == FOOTER_RELEASE_TO_REFRESH");
                        }
                        this.f1976a.m1872b(6);
                    } else if (this.f1978c == 6 && this.f1985j - this.f1982g < this.f1982g) {
                        m1900b(5);
                        if (KonyMain.f3657e) {
                            Log.i("PULL PUSH STATE", " CURRENT STATE == FOOTER_PUSH_TO_REFRESH");
                        }
                        this.f1976a.m1872b(5);
                        this.f1985j = 0;
                    }
                }
            default:
        }
    }

    public final void m1902c(int i) {
        this.f1981f = i;
    }

    public final void m1903d(int i) {
        this.f1982g = i;
    }
}
