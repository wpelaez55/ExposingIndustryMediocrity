package com.konylabs.api;

import android.content.Context;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import ny0k.C0277J;

/* renamed from: com.konylabs.api.i */
public final class C0360i implements Library {
    public C0360i(Context context) {
    }

    private static void m2345a(LuaTable luaTable) {
        C0277J a = C0277J.m1795a();
        LuaNil table = luaTable.getTable("id");
        if (table != LuaNil.nil) {
            int size;
            LuaTable luaTable2;
            int i;
            HashMap hashMap;
            LuaTable luaTable3;
            HashMap b = a.m1801b((String) table);
            luaTable.setTable("firstname", b.get("firstname"));
            luaTable.setTable("lastname", b.get("lastname"));
            ArrayList arrayList = (ArrayList) b.get("phone");
            if (arrayList != null) {
                size = arrayList.size();
                luaTable2 = new LuaTable(size, 0, true);
                for (i = 0; i < size; i++) {
                    hashMap = (HashMap) arrayList.get(i);
                    luaTable3 = new LuaTable(0, hashMap.size(), 1.0f, true);
                    luaTable3.setTable("name", (String) hashMap.get("name"));
                    luaTable3.setTable("number", (String) hashMap.get("number"));
                    luaTable2.add(luaTable3);
                }
                luaTable.setTable("phone", luaTable2);
            }
            arrayList = (ArrayList) b.get(NotificationCompatApi21.CATEGORY_EMAIL);
            if (arrayList != null) {
                size = arrayList.size();
                luaTable2 = new LuaTable(size, 0, true);
                for (i = 0; i < size; i++) {
                    hashMap = (HashMap) arrayList.get(i);
                    luaTable3 = new LuaTable(0, hashMap.size(), 1.0f, true);
                    luaTable3.setTable("name", (String) hashMap.get("name"));
                    luaTable3.setTable("id", (String) hashMap.get("id"));
                    luaTable2.add(luaTable3);
                }
                luaTable.setTable(NotificationCompatApi21.CATEGORY_EMAIL, luaTable2);
            }
            arrayList = (ArrayList) b.get("postal");
            if (arrayList != null) {
                i = arrayList.size();
                LuaTable luaTable4 = new LuaTable(i, 0, true);
                for (int i2 = 0; i2 < i; i2++) {
                    hashMap = (HashMap) arrayList.get(i2);
                    luaTable2 = new LuaTable(0, hashMap.size(), 1.0f, true);
                    luaTable2.setTable("name", (String) hashMap.get("name"));
                    luaTable2.setTable("pobox", (String) ((HashMap) arrayList.get(i2)).get("pobox"));
                    luaTable2.setTable("street", (String) ((HashMap) arrayList.get(i2)).get("street"));
                    luaTable2.setTable("city", (String) ((HashMap) arrayList.get(i2)).get("city"));
                    luaTable2.setTable("state", (String) ((HashMap) arrayList.get(i2)).get("state"));
                    luaTable2.setTable("zipcode", (String) ((HashMap) arrayList.get(i2)).get("zipcode"));
                    luaTable2.setTable("country", (String) ((HashMap) arrayList.get(i2)).get("country"));
                    luaTable4.add(luaTable2);
                }
                luaTable.setTable("postal", luaTable4);
            }
            arrayList = (ArrayList) b.get("company");
            if (arrayList != null) {
                size = arrayList.size();
                luaTable2 = new LuaTable(size, 0, true);
                for (i = 0; i < size; i++) {
                    HashMap hashMap2 = (HashMap) arrayList.get(i);
                    luaTable3 = new LuaTable(0, hashMap2.size(), 1.0f, true);
                    luaTable3.setTable("name", (String) hashMap2.get("name"));
                    luaTable3.setTable("company", (String) hashMap2.get("company"));
                    luaTable3.setTable("title", (String) hashMap2.get("title"));
                    luaTable2.add(luaTable3);
                }
                luaTable.setTable("company", luaTable2);
            }
            luaTable.setTable("photorawbytes", b.get("photorawbytes"));
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        if (objArr == null || objArr.length == 0 || objArr[0] == LuaNil.nil) {
            return null;
        }
        LuaTable luaTable;
        String a;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                Vector vector;
                Vector vector2;
                int i2;
                C0277J a2 = C0277J.m1795a();
                a2.m1800a(KonyMain.getActContext());
                a2.m1799a(KonyMain.getActContext().getContentResolver());
                Hashtable hashtable = new Hashtable();
                luaTable = (LuaTable) objArr[0];
                LuaNil table = luaTable.getTable("firstname");
                LuaNil table2 = luaTable.getTable("lastname");
                if (table != LuaNil.nil) {
                    hashtable.put("firstname", table);
                }
                if (table2 != LuaNil.nil) {
                    hashtable.put("lastname", table2);
                }
                table = luaTable.getTable("phone");
                if (table != LuaNil.nil) {
                    vector = ((LuaTable) table).list;
                    vector2 = new Vector();
                    for (i2 = 0; i2 < vector.size(); i2++) {
                        vector2.add(((LuaTable) vector.get(i2)).map);
                    }
                    hashtable.put("phone", vector2);
                }
                table = luaTable.getTable(NotificationCompatApi21.CATEGORY_EMAIL);
                if (table != LuaNil.nil) {
                    vector = ((LuaTable) table).list;
                    vector2 = new Vector();
                    for (i2 = 0; i2 < vector.size(); i2++) {
                        vector2.add(((LuaTable) vector.get(i2)).map);
                    }
                    hashtable.put(NotificationCompatApi21.CATEGORY_EMAIL, vector2);
                }
                table = luaTable.getTable("company");
                if (table != LuaNil.nil) {
                    vector = ((LuaTable) table).list;
                    vector2 = new Vector();
                    for (i2 = 0; i2 < vector.size(); i2++) {
                        vector2.add(((LuaTable) vector.get(i2)).map);
                    }
                    hashtable.put("company", vector2);
                }
                LuaNil table3 = luaTable.getTable("postal");
                if (table3 != LuaNil.nil) {
                    Vector vector3 = ((LuaTable) table3).list;
                    vector = new Vector();
                    for (int i3 = 0; i3 < vector3.size(); i3++) {
                        vector.add(((LuaTable) vector3.get(i3)).map);
                    }
                    hashtable.put("postal", vector);
                }
                a = a2.m1797a(hashtable);
                LuaTable luaTable2 = new LuaTable();
                if (a == null) {
                    luaTable2.setTable("id", LuaNil.nil);
                } else {
                    luaTable2.setTable("id", a);
                    C0360i.m2345a(luaTable2);
                }
                return new Object[]{luaTable2};
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                C0277J a3 = C0277J.m1795a();
                a3.m1800a(KonyMain.getActContext());
                a3.m1799a(KonyMain.getActContext().getContentResolver());
                boolean booleanValue = (objArr.length != 2 || objArr[1] == LuaNil.nil) ? true : ((Boolean) objArr[1]).booleanValue();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList a4 = a3.m1798a((String) objArr[0]);
                if (KonyMain.f3657e) {
                    Log.d("ContactsLib", "No of contacts  :" + a4.size());
                    Log.d("ContactsLib", "Time take to read :" + (System.currentTimeMillis() - currentTimeMillis));
                }
                LuaTable luaTable3 = new LuaTable();
                Iterator it = a4.iterator();
                while (it.hasNext()) {
                    HashMap hashMap = (HashMap) it.next();
                    LuaTable luaTable4 = new LuaTable();
                    a = (String) hashMap.get("id");
                    String str = (String) hashMap.get("displayname");
                    if (a != null) {
                        luaTable4.setTable("id", a);
                        if (booleanValue) {
                            C0360i.m2345a(luaTable4);
                        } else {
                            luaTable4.setTable("displayname", str);
                        }
                    }
                    luaTable3.add(luaTable4);
                }
                return new Object[]{luaTable3};
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                C0277J a5 = C0277J.m1795a();
                a5.m1800a(KonyMain.getActContext());
                a5.m1799a(KonyMain.getActContext().getContentResolver());
                if (!(objArr[0] instanceof LuaTable ? a5.m1802b(((LuaTable) objArr[0]).map) : false)) {
                    return null;
                }
                return new Object[]{objArr[0]};
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (objArr[0] instanceof LuaTable) {
                    luaTable = (LuaTable) objArr[0];
                    C0360i.m2345a(luaTable);
                } else {
                    luaTable = null;
                }
                return new Object[]{luaTable};
            default:
                return null;
        }
    }

    public final String[] getMethods() {
        return new String[]{"add", "find", "delete", "details"};
    }

    public final String getNameSpace() {
        return KonyMain.m4056B() ? "contact" : "kony.contact";
    }
}
