package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Vector;
import ny0k.cN;
import ny0k.cr;

public final class gJ extends LuaWidget {
    private static String f4125a;
    private static String f4126b;
    private static String f4127c;
    private static String f4128d;
    private static String f4129e;
    private static String f4130f;
    private static String f4131g;
    private static String f4132h;
    private LinkedHashMap[] f4133i;
    private cw f4134j;
    private boolean f4135k;
    private Object f4136l;
    private cx f4137m;

    static {
        f4125a = "focusskin";
        f4126b = "masterdata";
        f4127c = "masterdatamap";
        f4128d = "onselection";
        f4129e = "selectedkeyvalues";
        f4130f = "selectedkeys";
        f4131g = "selectedKeyInComponent";
        f4132h = "setComponentData";
        if (KonyMain.m4057C()) {
            f4125a = "focusSkin";
            f4126b = "masterData";
            f4127c = "masterDataMap";
            f4128d = "onSelection";
            f4129e = "selectedKeyValues";
            f4130f = "selectedKeys";
        }
    }

    public gJ(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4136l = null;
        this.f4137m = new cx(this);
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, table);
        }
        table = luaTable.getTable(f4126b);
        if (table != LuaNil.nil) {
            super.setTable(f4126b, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(f4128d);
        if (table != LuaNil.nil) {
            super.setTable(f4128d, table);
        }
        table = luaTable.getTable(f4129e);
        if (table != LuaNil.nil) {
            super.setTable(f4129e, table);
        }
        table = luaTable.getTable(f4130f);
        if (table != LuaNil.nil) {
            super.setTable(f4130f, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGNMENT, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_HEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_HEXPAND, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
        }
    }

    private int m4519a(int i, String str) {
        if (this.f4133i == null || this.f4133i.length == 0 || i > this.f4133i.length - 1) {
            return -1;
        }
        ArrayList arrayList = new ArrayList(this.f4133i[i].values());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equals(((cy) arrayList.get(i2)).f2788a)) {
                return i2;
            }
        }
        return -1;
    }

    private Object m4521a(Object obj) {
        String intern = ((String) obj).intern();
        if (intern == f4129e) {
            if (this.E == KONY_WIDGET_RESTORE) {
                return m4526c();
            }
        } else if (intern == f4130f && this.E == KONY_WIDGET_RESTORE) {
            return m4528d();
        }
        return super.getTable(intern);
    }

    private void m4522a(int i, LinkedHashMap linkedHashMap) {
        LuaNil table = super.getTable(f4126b);
        int size;
        String str;
        if (table != LuaNil.nil) {
            Vector vector = ((LuaTable) ((LuaTable) table).list.get(i)).list;
            size = vector.size();
            int i2 = 0;
            for (String str2 : linkedHashMap.keySet()) {
                if (i2 < size - 1) {
                    LuaTable luaTable = (LuaTable) vector.get(i2);
                    cy cyVar = (cy) linkedHashMap.get(str2);
                    luaTable.list.set(0, str2);
                    luaTable.list.set(1, cyVar.b);
                } else {
                    LuaTable luaTable2 = new LuaTable(2, 0);
                    vector.add(i2, luaTable2);
                    cy cyVar2 = (cy) linkedHashMap.get(str2);
                    luaTable2.list.add(0, str2);
                    luaTable2.list.add(1, cyVar2.b);
                }
                i2++;
            }
            if (vector != null) {
                while (i2 < vector.size() - 1) {
                    vector.remove(i2);
                }
                return;
            }
            return;
        }
        table = super.getTable(f4127c);
        if (table != LuaNil.nil) {
            Vector vector2 = ((LuaTable) ((LuaTable) table).list.get(i)).list;
            int size2 = vector2.size();
            str2 = (String) vector2.get(size2 - 3);
            String str3 = (String) vector2.get(size2 - 2);
            size = 0;
            for (String str4 : linkedHashMap.keySet()) {
                LuaTable luaTable3;
                if (size < size2 - 3) {
                    luaTable3 = (LuaTable) vector2.get(size);
                } else {
                    luaTable2 = new LuaTable(0, 2);
                    vector2.add(size, luaTable2);
                    luaTable3 = luaTable2;
                }
                cyVar = (cy) linkedHashMap.get(str4);
                luaTable3.map.put(str2, str4);
                luaTable3.map.put(str3, cyVar.b);
                size++;
            }
            if (vector2 != null) {
                while (size < vector2.size() - 3) {
                    vector2.remove(size);
                }
            }
        }
    }

    private void m4525b(LuaTable luaTable) {
        if (luaTable == null) {
            this.f4134j.m2946e();
            this.f4133i = null;
            return;
        }
        int size = luaTable.list.size();
        if (size == 0) {
            this.f4134j.m2946e();
            this.f4133i = null;
            return;
        }
        this.f4134j.m2940b(size);
        if (this.f4133i == null || this.f4133i.length != size) {
            this.f4133i = new LinkedHashMap[size];
        }
        for (int i = 0; i < size; i++) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Vector vector = ((LuaTable) luaTable.list.get(i)).list;
            if (!(vector == null || vector.size() == 0)) {
                int size2 = vector.size();
                for (int i2 = 0; i2 < size2 - 1; i2++) {
                    String a;
                    Vector vector2 = ((LuaTable) vector.get(i2)).list;
                    LuaNil luaNil = vector2.get(0);
                    LuaNil luaNil2 = vector2.get(1);
                    if (vector2.size() > 2) {
                        Object obj = vector2.get(2);
                        if (obj != null && (obj instanceof LuaTable)) {
                            a = m3943a((LuaTable) obj);
                            if (!(luaNil == LuaNil.nil || ((String) luaNil).length() <= 0 || luaNil2 == LuaNil.nil)) {
                                linkedHashMap.put((String) luaNil, new cy((String) luaNil, (String) luaNil2, a));
                            }
                        }
                    }
                    a = null;
                    linkedHashMap.put((String) luaNil, new cy((String) luaNil, (String) luaNil2, a));
                }
                this.f4133i[i] = linkedHashMap;
                this.f4134j.m2932a(i, linkedHashMap.values(), (int) ((Double) vector.get(size2 - 1)).doubleValue());
            }
        }
        this.f4134j.m2933a(this.f4137m);
        this.f4134j.m2939b();
    }

    private LuaTable m4526c() {
        if (this.f4133i == null || this.f4133i.length == 0) {
            return null;
        }
        int length = this.f4133i.length;
        LuaTable luaTable = new LuaTable(length, 0);
        for (int i = 0; i < length; i++) {
            LuaTable luaTable2 = new LuaTable(2, 0);
            cy c = this.f4134j.m2944c(i);
            String str = c.f2788a;
            String str2 = c.b;
            luaTable2.list.add(str);
            luaTable2.list.add(str2);
            luaTable.list.add(luaTable2);
        }
        return luaTable;
    }

    private void m4527c(LuaTable luaTable) {
        if (luaTable == null) {
            this.f4134j.m2946e();
            this.f4133i = null;
            return;
        }
        Vector vector = luaTable.list;
        int size = vector.size();
        if (size == 0) {
            this.f4134j.m2946e();
            this.f4133i = null;
            return;
        }
        this.f4134j.m2940b(size);
        if (this.f4133i == null || this.f4133i.length != size) {
            this.f4133i = new LinkedHashMap[size];
        }
        for (int i = 0; i < size; i++) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Vector vector2 = ((LuaTable) vector.get(i)).list;
            Vector vector3 = ((LuaTable) vector2.get(0)).list;
            String str = (String) vector2.get(1);
            String str2 = (String) vector2.get(2);
            double doubleValue = ((Double) vector2.get(3)).doubleValue();
            int size2 = vector3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Hashtable hashtable = ((LuaTable) vector3.get(i2)).map;
                String str3 = (String) hashtable.get(str);
                String str4 = (String) hashtable.get(str2);
                Object obj = hashtable.get(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
                String str5 = null;
                if (obj != null && (obj instanceof LuaTable)) {
                    str5 = m3943a((LuaTable) obj);
                }
                if (!(str3 == LuaNil.nil || str3.length() <= 0 || str4 == LuaNil.nil)) {
                    linkedHashMap.put(str3, new cy(str3, str4, str5));
                }
            }
            this.f4133i[i] = linkedHashMap;
            this.f4134j.m2932a(i, linkedHashMap.values(), (int) doubleValue);
        }
        this.f4134j.m2933a(this.f4137m);
        this.f4134j.m2939b();
    }

    private LuaTable m4528d() {
        int i = 0;
        if (this.f4133i == null || this.f4133i.length == 0) {
            return null;
        }
        int length = this.f4133i.length;
        LuaTable luaTable = new LuaTable(length, 0);
        while (i < length) {
            luaTable.list.add(this.f4134j.m2944c(i).f2788a);
            i++;
        }
        return luaTable;
    }

    private void m4529d(LuaTable luaTable) {
        if (luaTable != null && luaTable.list.size() != 0) {
            int size = luaTable.list.size();
            for (int i = 0; i < size; i++) {
                LuaNil luaNil = luaTable.list.get(i);
                if (luaNil != LuaNil.nil) {
                    int a = m4519a(i, (String) luaNil);
                    if (a != -1) {
                        this.f4134j.m2930a(i, a);
                    }
                }
            }
        }
    }

    public final void m4530a(int i, LuaTable luaTable) {
        if (this.f4133i == null) {
            LuaNil table = super.getTable(f4132h);
            HashMap hashMap = table != LuaNil.nil ? (HashMap) table : new HashMap();
            hashMap.put(Integer.valueOf(i), luaTable);
            super.setTable(f4132h, hashMap);
            return;
        }
        super.setTable(f4132h, LuaNil.nil);
        int a = cr.m2199a(i, 0);
        if (a >= 0 && a <= this.f4133i.length - 1) {
            Vector vector = luaTable.list;
            int size = vector.size();
            this.f4133i[a].clear();
            for (int i2 = 0; i2 < size; i2++) {
                Vector vector2 = ((LuaTable) vector.get(i2)).list;
                LuaNil luaNil = vector2.get(0);
                LuaNil luaNil2 = vector2.get(1);
                String str = null;
                if (vector2.size() > 2) {
                    Object obj = vector2.get(2);
                    if (obj != null && (obj instanceof LuaTable)) {
                        str = m3943a((LuaTable) obj);
                    }
                }
                if (!(luaNil == LuaNil.nil || luaNil2 == LuaNil.nil)) {
                    this.f4133i[a].put((String) luaNil, new cy((String) luaNil, (String) luaNil2, str));
                }
            }
            if (this.f4134j != null) {
                this.f4134j.m2931a(a, this.f4133i[a].values());
            }
            m4522a(a, this.f4133i[a]);
        }
    }

    protected final void m4531a(Object obj, Object obj2) {
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == f4130f) {
                if (obj2 != LuaNil.nil) {
                    m4529d((LuaTable) obj2);
                }
            } else if (intern == f4126b) {
                if (obj2 != LuaNil.nil) {
                    m4525b((LuaTable) obj2);
                } else {
                    m4525b(null);
                }
            } else if (intern == f4127c) {
                if (obj2 != LuaNil.nil) {
                    m4527c((LuaTable) obj2);
                } else {
                    m4527c(null);
                }
            } else if (intern == ATTR_WIDGET_ISVISIBLE && obj2 != LuaNil.nil) {
                this.f4134j.m2929a(m3942a(((Boolean) obj2).booleanValue()));
            } else if (intern == ATTR_WIDGET_SKIN && obj2 != LuaNil.nil) {
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    this.f4134j.m2941b(r0);
                    this.f4134j.m2939b();
                }
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN && obj2 != LuaNil.nil) {
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    this.f4134j.m2934a(r0);
                    this.f4134j.m2939b();
                }
            } else if (intern == f4128d && obj2 != LuaNil.nil) {
                this.f4134j.m2933a(this.f4137m);
            } else if (intern == ATTR_WIDGET_MARGIN) {
                this.f4134j.m2938a(convertMarginsToPixels(obj2, this.I));
                this.f4134j.m2947f();
            } else if (intern != ATTR_WIDGET_CONTAINER_WEIGHT || obj2 == LuaNil.nil) {
                if (intern != ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
                    return;
                }
                if (obj2 != null && (obj2 instanceof LuaTable)) {
                    this.f4134j.m2936a(m3943a((LuaTable) obj2));
                } else if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f4134j.m2936a(BuildConfig.FLAVOR);
                }
            } else if (this.f4135k) {
                setWeight();
                this.f4134j.m2947f();
                ((eO) this.I).m4238t();
            }
        }
    }

    public final void m4532a(String str, int i) {
        if (this.f4134j != null) {
            int a = cr.m2199a(i, 0);
            int a2 = m4519a(a, str);
            if (a2 != -1) {
                this.f4134j.m2930a(a, a2);
            }
            super.setTable(f4131g, LuaNil.nil);
            return;
        }
        LuaNil table = super.getTable(f4131g);
        HashMap hashMap = table != LuaNil.nil ? (HashMap) table : new HashMap();
        hashMap.put(Integer.valueOf(i), str);
        super.setTable(f4131g, hashMap);
    }

    public final void cleanup() {
        if (this.f4134j != null) {
            super.setTable(f4130f, m4528d());
            super.setTable(f4129e, m4526c());
            this.f4134j.m2945d();
            this.f4134j = null;
        }
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget getChildWidget(String str) {
        return null;
    }

    public final ArrayList getChildWidgets() {
        return null;
    }

    public final String getID() {
        return super.getTable(ATTR_WIDGET_ID).toString();
    }

    public final LuaWidget getParent() {
        return this.I;
    }

    public final Hashtable getProperties() {
        Hashtable hashtable = new Hashtable();
        hashtable.put(f4126b, "table");
        hashtable.put(f4127c, "table");
        hashtable.put(f4129e, "table");
        hashtable.put(f4130f, "table");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4521a(obj);
        }
        Object iiVar;
        synchronized (this) {
            iiVar = new ii(new gK(this, obj));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
            iiVar = this.f4136l;
            this.f4136l = null;
        }
        return iiVar;
    }

    public final String getType() {
        return "PickerView";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            HashMap hashMap;
            int intValue;
            this.f4134j = new cw(KonyMain.getActContext());
            Object table = super.getTable(ATTR_WIDGET_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4134j.m2941b(a);
                }
            }
            table = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4134j.m2934a(a);
                }
            }
            LuaNil table2 = super.getTable(ATTR_WIDGET_VISIBLE);
            if (table2 != LuaNil.nil) {
                this.f4134j.m2929a(m3942a(((Boolean) table2).booleanValue()));
            }
            if (super.getTable(f4128d) != LuaNil.nil) {
                this.f4134j.m2933a(this.f4137m);
            }
            table2 = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (!(table2 == LuaNil.nil || ((Double) table2).intValue() == 0)) {
                table2 = super.getTable(ATTR_WIDGET_HEXPAND);
                if (table2 != LuaNil.nil) {
                    this.f4134j.m2937a(((Boolean) table2).booleanValue());
                }
            }
            table2 = super.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                this.f4134j.m2938a(convertMarginsToPixels(table2, this.I));
            }
            table2 = super.getTable(ATTR_WIDGET_PADDING);
            if (table2 != LuaNil.nil) {
                this.f4134j.m2942b(convertPaddingToPixels(table2, this.I));
            }
            table2 = super.getTable(f4126b);
            if (table2 != LuaNil.nil) {
                m4525b((LuaTable) table2);
            } else {
                table2 = super.getTable(f4127c);
                if (table2 != LuaNil.nil) {
                    m4527c((LuaTable) table2);
                }
            }
            table2 = super.getTable(f4132h);
            if (table2 != LuaNil.nil) {
                hashMap = (HashMap) table2;
                for (Integer intValue2 : hashMap.keySet()) {
                    intValue = intValue2.intValue();
                    m4530a(intValue, (LuaTable) hashMap.get(Integer.valueOf(intValue)));
                }
            }
            table2 = super.getTable(f4130f);
            if (table2 != LuaNil.nil) {
                m4529d((LuaTable) table2);
            }
            table2 = super.getTable(f4131g);
            if (table2 != LuaNil.nil) {
                hashMap = (HashMap) table2;
                for (Integer intValue22 : hashMap.keySet()) {
                    intValue = intValue22.intValue();
                    m4532a((String) hashMap.get(Integer.valueOf(intValue)), intValue);
                }
                super.setTable(f4131g, LuaNil.nil);
            }
            table2 = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table2 != LuaNil.nil) {
                this.f4134j.m2929a(m3942a(((Boolean) table2).booleanValue()));
            }
            table2 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            if (table2 != LuaNil.nil && (table2 instanceof LuaTable)) {
                this.f4134j.m2936a(m3943a((LuaTable) table2));
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.f4135k) {
                setWeight();
            }
        }
        this.f4134j.m2927a();
        return this.f4134j.m2943c();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4134j.m2942b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != null && table != LuaNil.nil) {
                this.f4134j.m2938a(convertMarginsToPixels(table, this.I));
            }
        }
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4134j.setFocusableInTouchMode(true);
            this.f4134j.requestFocus();
            this.f4134j.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        String intern = ((String) obj).intern();
        if (intern == f4126b) {
            super.setTable(f4127c, LuaNil.nil);
        } else if (intern == f4127c) {
            super.setTable(f4126b, LuaNil.nil);
        }
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(obj, obj2);
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4134j.m2929a(m3942a(z));
        }
    }

    public final void setWeight() {
        this.f4135k = true;
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4134j.m2928a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
    }
}
