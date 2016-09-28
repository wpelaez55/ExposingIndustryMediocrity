package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import ny0k.cN;

public final class fn extends LuaWidget {
    public static String f3933a;
    private static String f3934c;
    private static String f3935d;
    private static String f3936e;
    private static String f3937f;
    private static String f3938g;
    private static String f3939h;
    private static String f3940i;
    private static String f3941j;
    Object f3942b;
    private C0195Y f3943k;
    private ab f3944l;

    static {
        f3934c = "masterdata";
        f3935d = "masterdatamap";
        f3936e = "selectedkeyvalues";
        f3937f = "selectedkeys";
        f3938g = "itemorientation";
        f3933a = "onselection";
        f3939h = "horizontal";
        f3940i = "tickedimage";
        f3941j = "untickedimage";
        if (KonyMain.m4057C()) {
            f3934c = "masterData";
            f3935d = "masterDataMap";
            f3936e = "selectedKeyValues";
            f3937f = "selectedKeys";
            f3933a = "onSelection";
            f3938g = "itemOrientation";
            f3940i = "tickedImage";
            f3941j = "untickedImage";
        }
    }

    public fn(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f3943k = null;
        this.f3944l = new ab(this);
        this.f3942b = null;
        Object obj = new Object();
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(f3933a);
        if (table != LuaNil.nil) {
            super.setTable(f3933a, table);
        }
        table = luaTable.getTable(f3934c);
        if (table != LuaNil.nil) {
            super.setTable(f3934c, table);
        }
        table = luaTable.getTable(f3936e);
        if (table != LuaNil.nil) {
            super.setTable(f3936e, table);
        }
        table = luaTable.getTable(f3937f);
        if (table != LuaNil.nil) {
            super.setTable(f3937f, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGNMENT, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
            table = luaTable2.getTable(f3938g);
            if (table != LuaNil.nil) {
                super.setTable(f3938g, table);
            }
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(f3940i);
            if (table != LuaNil.nil) {
                super.setTable(f3940i, table);
            }
            table = luaTable3.getTable(f3941j);
            if (table != LuaNil.nil) {
                super.setTable(f3941j, table);
            }
        }
    }

    private void m4339a(Object obj) {
        if (KonyMain.f3657e) {
            Log.d("LuaCheckGroup", "SelectedKeys key " + obj);
        }
        this.f3943k.m362f();
        if (obj != LuaNil.nil) {
            Vector vector = ((LuaTable) obj).list;
            for (int i = 0; i < vector.size(); i++) {
                this.f3943k.m344a(vector.get(i).toString());
            }
        }
    }

    private LuaTable m4340b() {
        Object[] g = this.f3943k.m363g();
        if (g == null || r5 <= 0) {
            return null;
        }
        LuaTable luaTable = new LuaTable(2, 0);
        for (Object obj : g) {
            ac acVar = (ac) obj;
            LuaTable luaTable2 = new LuaTable(2, 0);
            luaTable2.list.addElement(acVar.f514a);
            luaTable2.list.addElement(acVar.f515b);
            luaTable.list.add(luaTable2);
        }
        return luaTable;
    }

    private Object m4341b(Object obj) {
        String intern = ((String) obj).intern();
        if (intern == f3936e) {
            if (this.E == KONY_WIDGET_RESTORE) {
                return m4340b();
            }
            if (KonyMain.f3658f) {
                Log.w("LuaCheckGroup", "WARNING!!! getTable SELECTED_KEY_N_VALUES called when form is inactive");
            }
        } else if (intern == f3937f && this.E == KONY_WIDGET_RESTORE) {
            Object[] g = this.f3943k.m363g();
            if (g == null || r4 <= 0) {
                return null;
            }
            LuaTable luaTable = new LuaTable(2, 0);
            for (Object obj2 : g) {
                luaTable.list.add(((ac) obj2).f514a);
            }
            return luaTable;
        }
        return super.getTable(intern);
    }

    private void m4342b(LuaTable luaTable) {
        Vector vector = luaTable.list;
        int size = vector.size();
        this.f3943k.m337a();
        for (int i = 0; i < size; i++) {
            LuaTable luaTable2 = (LuaTable) vector.elementAt(i);
            LuaNil elementAt = luaTable2.list.elementAt(0);
            if (elementAt != LuaNil.nil) {
                String obj = elementAt.toString();
                LuaNil elementAt2 = luaTable2.list.elementAt(1);
                if (elementAt2 != LuaNil.nil) {
                    C0195Y c0195y = this.f3943k;
                    c0195y.getClass();
                    ac acVar = new ac(c0195y, obj, elementAt2.toString());
                    if (luaTable2.list.size() > 2) {
                        Object elementAt3 = luaTable2.list.elementAt(2);
                        if (elementAt3 != null && (elementAt3 instanceof LuaTable)) {
                            acVar.f516c = m3944a((LuaTable) elementAt3, elementAt2.toString());
                        }
                    }
                    this.f3943k.m342a(acVar);
                }
            }
        }
        if (this.f3943k.getChildCount() == 0) {
            if (KonyMain.f3658f) {
                Log.w("LuaCheckGroup", "Empty master data set to combo box");
            }
            C0195Y c0195y2 = this.f3943k;
            C0195Y c0195y3 = this.f3943k;
            c0195y3.getClass();
            c0195y2.m342a(new ac(c0195y3, BuildConfig.FLAVOR, BuildConfig.FLAVOR));
        }
    }

    private void m4343c(LuaTable luaTable) {
        Vector vector = ((LuaTable) luaTable.list.elementAt(0)).list;
        String str = (String) luaTable.list.elementAt(1);
        String str2 = (String) luaTable.list.elementAt(2);
        int size = vector.size();
        this.f3943k.m337a();
        for (int i = 0; i < size; i++) {
            LuaTable luaTable2 = (LuaTable) vector.elementAt(i);
            LuaNil luaNil = luaTable2.map.get(str);
            LuaNil luaNil2 = luaTable2.map.get(str2);
            if (!(luaNil == LuaNil.nil || luaNil2 == LuaNil.nil)) {
                C0195Y c0195y = this.f3943k;
                c0195y.getClass();
                ac acVar = new ac(c0195y, luaNil.toString(), luaNil2.toString());
                if (luaTable2.map.size() > 2) {
                    Object obj = luaTable2.map.get(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
                    if (obj != null && (obj instanceof LuaTable)) {
                        acVar.f516c = m3944a((LuaTable) obj, luaNil2.toString());
                    }
                }
                this.f3943k.m342a(acVar);
            }
        }
        if (this.f3943k.getChildCount() == 0) {
            if (KonyMain.f3658f) {
                Log.w("LuaCheckGroup", "Empty master data set to combo box");
            }
            C0195Y c0195y2 = this.f3943k;
            C0195Y c0195y3 = this.f3943k;
            c0195y3.getClass();
            c0195y2.m342a(new ac(c0195y3, BuildConfig.FLAVOR, BuildConfig.FLAVOR));
        }
    }

    protected final void m4344a(Object obj, Object obj2) {
        boolean z = this.E == KONY_WIDGET_RESTORE;
        String intern = ((String) obj).intern();
        if (intern == ATTR_WIDGET_ISVISIBLE && obj2 != LuaNil.nil && z) {
            this.f3943k.m348b(m3942a(((Boolean) obj2).booleanValue()));
        } else if (intern != f3934c || obj2 == LuaNil.nil) {
            if (intern == f3937f && z) {
                m4339a(obj2);
            } else if (intern == f3937f) {
                super.setTable(f3937f, obj2);
                if (obj2 != LuaNil.nil) {
                    Object obj3;
                    LuaNil table = super.getTable(f3934c);
                    if (table == LuaNil.nil || !(table instanceof LuaTable)) {
                        obj3 = null;
                    } else {
                        Vector vector = ((LuaTable) table).list;
                        if (vector.size() == 0) {
                            if (KonyMain.f3658f) {
                                Log.w("LuaCheckGroup", "Empty master data set to check box group");
                            }
                            obj3 = null;
                        } else {
                            LuaTable luaTable;
                            int size = vector.size();
                            Vector vector2 = ((LuaTable) obj2).list;
                            int size2 = vector2.size();
                            LuaTable luaTable2 = new LuaTable(2, 0);
                            for (int i = 0; i < size2; i++) {
                                LuaTable luaTable3 = new LuaTable(2, 0);
                                String obj4 = vector2.get(i).toString();
                                for (int i2 = 0; i2 < size; i2++) {
                                    obj3 = (LuaTable) vector.elementAt(i2);
                                    if (obj4.equals(obj3.list.elementAt(0).toString())) {
                                        break;
                                    }
                                }
                                luaTable = luaTable3;
                                luaTable2.list.add(obj3);
                            }
                            luaTable = luaTable2;
                        }
                    }
                    if (obj3 != null) {
                        super.setTable(f3936e, obj3);
                    } else {
                        super.setTable(f3936e, LuaNil.nil);
                    }
                }
            } else if (intern == ATTR_WIDGET_SKIN && obj2 != LuaNil.nil && z) {
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    this.f3943k.m350b(r0);
                    if (!this.f3943k.isFocused()) {
                        this.f3943k.m345a(false);
                    }
                }
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN && obj2 != LuaNil.nil && z) {
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    this.f3943k.m343a(r0);
                    if (this.f3943k.isFocused()) {
                        this.f3943k.m345a(true);
                    }
                }
            } else if (intern == f3935d && obj2 != LuaNil.nil) {
                if (z) {
                    m4343c((LuaTable) obj2);
                }
                super.setTable(f3934c, LuaNil.nil);
                super.setTable(f3937f, LuaNil.nil);
                super.setTable(f3936e, LuaNil.nil);
            } else if (intern == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil && z) {
                this.f3943k.m346a(convertMarginsToPixels(obj2, this.I));
                this.f3943k.m347b();
            } else if (intern == ATTR_WIDGET_PADDING && obj2 != LuaNil.nil && z) {
                this.f3943k.m353b(convertPaddingToPixels(obj2, this.I));
                this.f3943k.m347b();
            } else if (this.E == KONY_WIDGET_RESTORE && intern == ATTR_WIDGET_CONTAINER_WEIGHT && obj2 != LuaNil.nil && this.G) {
                setWeight();
                this.f3943k.m347b();
                ((eO) this.I).m4238t();
            } else if (intern != ATTR_WIDGET_ACCESSIBILITY_CONFIG || this.E != KONY_WIDGET_RESTORE) {
            } else {
                if (obj2 != null && (obj2 instanceof LuaTable)) {
                    this.f3943k.m359d(m3943a((LuaTable) obj2));
                } else if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f3943k.m359d(BuildConfig.FLAVOR);
                }
            }
        } else if (obj2 instanceof LuaTable) {
            if (z) {
                m4342b((LuaTable) obj2);
            }
            super.setTable(f3935d, LuaNil.nil);
            super.setTable(f3937f, LuaNil.nil);
            super.setTable(f3936e, LuaNil.nil);
        } else {
            throw new LuaError("Invalid data type of masterdata set for CheckBoxGroup widget.", 607);
        }
    }

    public final void cleanup() {
        if (this.f3943k != null) {
            LuaTable b = m4340b();
            if (b != null) {
                super.setTable(f3936e, b);
            } else {
                super.setTable(f3936e, LuaNil.nil);
            }
            if (r3 > 0) {
                LuaTable luaTable = new LuaTable(2, 0);
                for (Object obj : this.f3943k.m363g()) {
                    luaTable.list.add(((ac) obj).f514a);
                }
                super.setTable(f3937f, luaTable);
            } else {
                super.setTable(f3937f, LuaNil.nil);
            }
            this.f3943k.m360e();
            this.f3943k = null;
        }
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        return null;
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
        hashtable.put(ATTR_WIDGET_ISVISIBLE, "boolean");
        hashtable.put(f3936e, "table");
        hashtable.put(f3934c, "table");
        hashtable.put(f3937f, "table");
        hashtable.put(f3936e, "table");
        hashtable.put(f3935d, "table");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4341b(obj);
        }
        Object iiVar;
        synchronized (this) {
            this.f3942b = null;
            iiVar = new ii(new fo(this, obj));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
            iiVar = this.f3942b;
            this.f3942b = null;
        }
        return iiVar;
    }

    public final String getType() {
        return "CheckBoxGroup";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            this.f3943k = new C0195Y(KonyMain.getActContext());
            Object table = super.getTable(ATTR_WIDGET_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f3943k.m350b(a);
                }
            } else {
                this.f3943k.m350b(new hp().m3352a());
            }
            table = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f3943k.m343a(a);
                }
            }
            LuaNil table2 = super.getTable(f3938g);
            if (table2 != LuaNil.nil) {
                if (((String) table2).intern() == f3939h) {
                    this.f3943k.m339a(0);
                } else {
                    this.f3943k.m339a(1);
                }
            }
            super.getTable(f3933a);
            table2 = LuaNil.nil;
            table2 = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table2 != LuaNil.nil) {
                this.f3943k.m348b(m3942a(((Boolean) table2).booleanValue()));
            }
            table2 = super.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table2 != LuaNil.nil) {
                switch (((Double) table2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f3943k.m355c(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f3943k.m355c(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f3943k.m355c(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f3943k.m355c(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f3943k.m355c(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f3943k.m355c(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f3943k.m355c(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f3943k.m355c(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f3943k.m355c(85);
                        break;
                    default:
                        this.f3943k.m355c(17);
                        break;
                }
            }
            table2 = super.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                this.f3943k.m346a(convertMarginsToPixels(table2, this.I));
            }
            table2 = super.getTable(ATTR_WIDGET_PADDING);
            if (table2 != LuaNil.nil) {
                this.f3943k.m353b(convertPaddingToPixels(table2, this.I));
            }
            table2 = super.getTable(f3940i);
            if (table2 != LuaNil.nil) {
                this.f3943k.m351b(table2.toString());
            }
            table2 = super.getTable(f3941j);
            if (table2 != LuaNil.nil) {
                this.f3943k.m356c(table2.toString());
            }
            table2 = super.getTable(f3934c);
            if (table2 != LuaNil.nil) {
                m4342b((LuaTable) table2);
            } else {
                table2 = super.getTable(f3935d);
                if (table2 != LuaNil.nil) {
                    m4343c((LuaTable) table2);
                } else {
                    C0195Y c0195y = this.f3943k;
                    C0195Y c0195y2 = this.f3943k;
                    c0195y2.getClass();
                    c0195y.m342a(new ac(c0195y2, BuildConfig.FLAVOR, BuildConfig.FLAVOR));
                }
            }
            table2 = super.getTable(f3937f);
            if (table2 != LuaNil.nil) {
                m4339a(table2);
            }
            this.f3943k.m341a(this.f3944l);
            table2 = super.getTable(ATTR_WIDGET_SET_ENABLED);
            if (table2 != LuaNil.nil) {
                this.f3943k.m352b(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            if (table2 != LuaNil.nil && (table2 instanceof LuaTable)) {
                this.f3943k.m359d(m3943a((LuaTable) table2));
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
        }
        this.f3943k.m354c();
        return this.f3943k.m357d();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f3943k.m353b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (!(table == null || table == LuaNil.nil)) {
                this.f3943k.m346a(convertMarginsToPixels(table, this.I));
            }
            this.f3943k.m364h();
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3943k.m352b(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3943k.setFocusableInTouchMode(true);
            this.f3943k.requestFocus();
            this.f3943k.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3943k.m361e(i);
            this.f3943k.m347b();
        }
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        m3950d(obj, obj2);
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3943k.m348b(m3942a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f3943k.m338a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3943k.m358d(i);
            this.f3943k.m347b();
        }
    }

    public final String toString() {
        return "LuaCheckGroup: " + getTable(ATTR_WIDGET_ID);
    }
}
