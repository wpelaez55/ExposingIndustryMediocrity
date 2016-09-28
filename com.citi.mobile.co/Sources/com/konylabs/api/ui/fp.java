package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import ny0k.cN;

public final class fp extends LuaWidget {
    public static String f3945a;
    private static String f3946c;
    private static String f3947d;
    private static String f3948e;
    private static String f3949f;
    private static String f3950g;
    private static String f3951h;
    private static String f3952i;
    private static String f3953j;
    private static String f3954k;
    private static String f3955l;
    Object f3956b;
    private ak f3957m;
    private am f3958n;
    private boolean f3959o;
    private OnItemSelectedListener f3960p;

    static {
        f3946c = "masterdata";
        f3947d = "masterdatamap";
        f3948e = "selectedkeyvalue";
        f3949f = "selectedkey";
        f3945a = "onselection";
        f3950g = "popuptitle";
        f3951h = "contentalignment";
        f3952i = "singleLineText";
        f3953j = "singleLineTextInPopup";
        f3954k = "textTruncatePosition";
        f3955l = "textTruncatePositionInPopup";
        if (KonyMain.m4057C()) {
            f3946c = "masterData";
            f3947d = "masterDataMap";
            f3948e = "selectedKeyValue";
            f3949f = "selectedKey";
            f3945a = "onSelection";
            f3950g = "popupTitle";
            f3951h = "contentAlignment";
        }
    }

    public fp(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f3957m = null;
        this.f3958n = null;
        this.f3959o = true;
        this.f3960p = new fq(this);
        this.f3956b = null;
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
        table = luaTable.getTable(f3945a);
        if (table != LuaNil.nil) {
            super.setTable(f3945a, table);
        }
        table = luaTable.getTable(f3946c);
        if (table != LuaNil.nil) {
            super.setTable(f3946c, table);
        }
        table = luaTable.getTable(f3947d);
        if (table != LuaNil.nil) {
            super.setTable(f3947d, table);
        }
        table = luaTable.getTable(f3948e);
        if (table != LuaNil.nil) {
            super.setTable(f3948e, table);
        }
        table = luaTable.getTable(f3949f);
        if (table != LuaNil.nil) {
            super.setTable(f3949f, table);
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
            table = luaTable2.getTable(f3951h);
            if (table != LuaNil.nil) {
                super.setTable(f3951h, table);
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
            table = luaTable2.getTable(ATTR_WIDGET_HEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_HEXPAND, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_VEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_VEXPAND, table);
            }
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(f3950g);
            if (table != LuaNil.nil) {
                super.setTable(f3950g, table);
            }
            table = luaTable3.getTable(f3952i);
            if (table != LuaNil.nil) {
                super.setTable(f3952i, table);
            }
            table = luaTable3.getTable(f3953j);
            if (table != LuaNil.nil) {
                super.setTable(f3953j, table);
            }
            table = luaTable3.getTable(f3954k);
            if (table != LuaNil.nil) {
                super.setTable(f3954k, table);
            }
            table = luaTable3.getTable(f3955l);
            if (table != LuaNil.nil) {
                super.setTable(f3955l, table);
            }
        }
    }

    private Object m4348a(Object obj) {
        String intern = ((String) obj).intern();
        if (intern == f3948e || intern == "selectedkeyvalues") {
            if (this.E == KONY_WIDGET_RESTORE) {
                LuaTable c = m4356c();
                return c == null ? LuaNil.nil : c;
            } else if (KonyMain.f3658f) {
                Log.w("LuaComboBox", "WARNING!!! COMBO SELECTED_KEY_N_VALUE called when form is inactive");
            }
        } else if (intern == f3949f) {
            if (this.E == KONY_WIDGET_RESTORE) {
                if (this.f3958n != null) {
                    return this.f3958n.f582a;
                }
            } else if (KonyMain.f3658f) {
                Log.w("LuaComboBox", "WARNING!!! COMBO SELECTED_KEY called when form is inactive");
            }
        }
        return super.getTable(intern);
    }

    private void m4349a(dB dBVar) {
        ak akVar = this.f3957m;
        if (dBVar == null) {
            dBVar = null;
        }
        akVar.m560a(dBVar);
        this.f3957m.m583f();
    }

    private void m4351b() {
        am amVar = (am) this.f3957m.getSelectedItem();
        if (!(amVar == null || this.f3958n == null || amVar.f582a.equals(this.f3958n.f582a))) {
            this.f3959o = true;
        }
        this.f3958n = amVar;
    }

    private void m4352b(dB dBVar) {
        ak akVar = this.f3957m;
        if (dBVar == null) {
            dBVar = null;
        }
        akVar.m567b(dBVar);
        this.f3957m.m583f();
    }

    private void m4353b(LuaTable luaTable) {
        Vector vector = luaTable.list;
        if (vector.size() != 0) {
            this.f3959o = true;
            am[] amVarArr = new am[vector.size()];
            for (int i = 0; i < vector.size(); i++) {
                LuaTable luaTable2 = (LuaTable) vector.elementAt(i);
                LuaNil elementAt = luaTable2.list.elementAt(0);
                LuaNil elementAt2 = luaTable2.list.elementAt(1);
                if (!(elementAt == LuaNil.nil || elementAt == null || elementAt2 == LuaNil.nil || elementAt2 == null)) {
                    ak akVar = this.f3957m;
                    akVar.getClass();
                    amVarArr[i] = new am(akVar, elementAt.toString(), elementAt2.toString());
                    if (luaTable2.list.size() > 2) {
                        Object elementAt3 = luaTable2.list.elementAt(2);
                        if (elementAt3 != null && (elementAt3 instanceof LuaTable)) {
                            amVarArr[i].f584c = m3944a((LuaTable) elementAt3, elementAt2.toString());
                        }
                    }
                }
            }
            this.f3957m.removeAllViewsInLayout();
            this.f3957m.m556a();
            this.f3957m.m563a(amVarArr);
        } else if (KonyMain.f3658f) {
            Log.w("LuaComboBox", "Empty master data set to combo box");
        }
    }

    private LuaTable m4356c() {
        am amVar = this.f3958n;
        if (amVar == null) {
            return null;
        }
        amVar = amVar;
        LuaTable luaTable = new LuaTable(2, 0);
        luaTable.list.addElement(amVar.f582a);
        luaTable.list.addElement(amVar.f583b);
        return luaTable;
    }

    private void m4357c(LuaTable luaTable) {
        Vector vector = ((LuaTable) luaTable.list.elementAt(0)).list;
        String str = (String) luaTable.list.elementAt(1);
        String str2 = (String) luaTable.list.elementAt(2);
        int size = vector.size();
        this.f3959o = true;
        am[] amVarArr = new am[size];
        for (int i = 0; i < size; i++) {
            LuaTable luaTable2 = (LuaTable) vector.elementAt(i);
            LuaNil luaNil = luaTable2.map.get(str);
            LuaNil luaNil2 = luaTable2.map.get(str2);
            if (!(luaNil == LuaNil.nil || luaNil == null || luaNil2 == LuaNil.nil || luaNil2 == null)) {
                ak akVar = this.f3957m;
                akVar.getClass();
                amVarArr[i] = new am(akVar, luaNil.toString(), luaNil2.toString());
                if (luaTable2.map.size() > 2) {
                    Object obj = luaTable2.map.get(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
                    if (obj != null && (obj instanceof LuaTable)) {
                        amVarArr[i].f584c = m3944a((LuaTable) obj, luaNil2.toString());
                    }
                }
            }
        }
        this.f3957m.removeAllViewsInLayout();
        this.f3957m.m556a();
        this.f3957m.m563a(amVarArr);
    }

    protected final void m4358a(Object obj, Object obj2) {
        Object obj3 = null;
        String intern = ((String) obj).intern();
        if (intern != ATTR_WIDGET_ISVISIBLE || obj2 == LuaNil.nil) {
            if (intern == f3946c && obj2 != LuaNil.nil) {
                if (this.E == KONY_WIDGET_RESTORE) {
                    if (obj2 instanceof LuaTable) {
                        m4353b((LuaTable) obj2);
                        this.f3958n = (am) this.f3957m.getItemAtPosition(0);
                    } else {
                        throw new LuaError("Invalid data type set for masterdata property of ComboBox widget", 607);
                    }
                }
                super.setTable(f3947d, LuaNil.nil);
            } else if (intern == f3947d && obj2 != LuaNil.nil) {
                if (this.E == KONY_WIDGET_RESTORE) {
                    if (obj2 instanceof LuaTable) {
                        m4357c((LuaTable) obj2);
                        this.f3958n = (am) this.f3957m.getItemAtPosition(0);
                    } else {
                        throw new LuaError("Invalid data type set for masterdatamap property of ComboBox widget", 607);
                    }
                }
                super.setTable(f3946c, LuaNil.nil);
            } else if (intern == f3949f) {
                if (obj2 != LuaNil.nil) {
                    if (this.E != KONY_WIDGET_RESTORE) {
                        String obj4 = obj2.toString();
                        LuaNil table = super.getTable(f3947d);
                        LuaNil table2 = super.getTable(f3946c);
                        LuaTable luaTable;
                        int i;
                        LuaTable luaTable2;
                        if (table2 == LuaNil.nil) {
                            if (table != LuaNil.nil) {
                                if (table instanceof LuaTable) {
                                    luaTable = (LuaTable) table;
                                    Vector vector = ((LuaTable) luaTable.list.elementAt(0)).list;
                                    int size = vector.size();
                                    if (size != 0) {
                                        String str = (String) luaTable.list.elementAt(1);
                                        intern = (String) luaTable.list.elementAt(2);
                                        for (i = 0; i < size; i++) {
                                            LuaTable luaTable3 = (LuaTable) vector.elementAt(i);
                                            String obj5 = luaTable3.map.get(str).toString();
                                            String obj6 = luaTable3.map.get(intern).toString();
                                            if (obj4.equals(obj5)) {
                                                luaTable = new LuaTable(2, 0);
                                                luaTable.list.addElement(obj5);
                                                luaTable.list.addElement(obj6);
                                                break;
                                            }
                                        }
                                    } else if (KonyMain.f3658f) {
                                        Log.w("LuaComboBox", "Empty master datamap set to combo box");
                                    }
                                } else {
                                    throw new LuaError("Invalid data type set for masterdatamap property of ComboBox", 607);
                                }
                            }
                            luaTable = null;
                            luaTable2 = luaTable;
                        } else if (table2 instanceof LuaTable) {
                            Vector vector2 = ((LuaTable) table2).list;
                            if (vector2.size() != 0) {
                                i = vector2.size();
                                for (int i2 = 0; i2 < i; i2++) {
                                    luaTable = (LuaTable) vector2.elementAt(i2);
                                    if (obj4.equals(luaTable.list.elementAt(0).toString())) {
                                        break;
                                    }
                                }
                                luaTable = null;
                                luaTable2 = luaTable;
                            } else if (KonyMain.f3658f) {
                                Log.w("LuaComboBox", "Empty master data set to combo box");
                            }
                        } else {
                            throw new LuaError("Invalid data type set for masterdata property of ComboBox widget", 607);
                        }
                        if (obj3 != null) {
                            super.setTable(f3948e, obj3);
                        } else {
                            super.setTable(f3948e, LuaNil.nil);
                        }
                    } else if (this.f3957m.m564a(obj2.toString())) {
                        m4351b();
                    }
                } else if (this.E == KONY_WIDGET_RESTORE) {
                    this.f3957m.setSelection(0);
                    m4351b();
                }
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (this.E != KONY_WIDGET_RESTORE) {
                    return;
                }
                if (obj2 != LuaNil.nil) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        m4352b(r0);
                        return;
                    }
                    return;
                }
                m4352b(null);
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN) {
                if (this.E != KONY_WIDGET_RESTORE) {
                    return;
                }
                if (obj2 != LuaNil.nil) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        m4349a(r0);
                        return;
                    }
                    return;
                }
                m4349a(null);
            } else if (intern == f3950g && this.E == KONY_WIDGET_RESTORE) {
                if (obj2 != LuaNil.nil) {
                    this.f3957m.m568b((String) obj2);
                }
            } else if (intern == ATTR_WIDGET_MARGIN && this.E == KONY_WIDGET_RESTORE && obj2 != LuaNil.nil) {
                this.f3957m.m562a(convertMarginsToPixels(obj2, this.I));
                this.f3957m.m565b();
            } else if (intern == ATTR_WIDGET_PADDING && this.E == KONY_WIDGET_RESTORE && obj2 != LuaNil.nil) {
                this.f3957m.m570b(convertPaddingToPixels(obj2, this.I));
                this.f3957m.m565b();
            } else if (this.E == KONY_WIDGET_RESTORE && intern == ATTR_WIDGET_CONTAINER_WEIGHT && obj2 != LuaNil.nil) {
                if (this.G) {
                    setWeight();
                    this.f3957m.m565b();
                    ((eO) this.I).m4238t();
                }
            } else if (this.E == KONY_WIDGET_RESTORE && intern == f3951h && obj2 != LuaNil.nil) {
                switch (((Double) obj2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f3957m.m577d(19);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f3957m.m577d(17);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f3957m.m577d(21);
                    default:
                        this.f3957m.m577d(19);
                }
            } else if (intern == ATTR_WIDGET_ACCESSIBILITY_CONFIG && this.E == KONY_WIDGET_RESTORE) {
                if (obj2 != null && (obj2 instanceof LuaTable)) {
                    this.f3957m.m574c(m3943a((LuaTable) obj2));
                } else if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f3957m.m574c(BuildConfig.FLAVOR);
                }
            } else if (this.E == KONY_WIDGET_RESTORE && intern == f3952i && obj2 != LuaNil.nil) {
                this.f3957m.m579d(((Boolean) obj2).booleanValue());
            } else if (this.E == KONY_WIDGET_RESTORE && intern == f3953j && obj2 != LuaNil.nil) {
                this.f3957m.m582e(((Boolean) obj2).booleanValue());
            } else if (this.E == KONY_WIDGET_RESTORE && intern == f3954k && obj2 != LuaNil.nil) {
                this.f3957m.m586g(((Double) obj2).intValue());
            } else if (this.E == KONY_WIDGET_RESTORE && intern == f3955l && obj2 != LuaNil.nil) {
                this.f3957m.m587h(((Double) obj2).intValue());
            }
        } else if (this.E == KONY_WIDGET_RESTORE) {
            this.f3957m.m558a(m3942a(((Boolean) obj2).booleanValue()));
        }
    }

    public final void cleanup() {
        if (this.f3957m != null) {
            LuaTable c = m4356c();
            if (c != null) {
                super.setTable(f3949f, c.list.get(0));
            } else {
                super.setTable(f3949f, LuaNil.nil);
            }
            if (c != null) {
                super.setTable(f3948e, c);
            } else {
                super.setTable(f3948e, LuaNil.nil);
            }
            this.f3957m.m580e();
            this.f3957m = null;
        }
        this.f3958n = null;
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
        hashtable.put(f3946c, "table");
        hashtable.put(f3947d, "table");
        hashtable.put(f3948e, "table");
        hashtable.put(f3949f, "string");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4348a(obj);
        }
        Object iiVar;
        synchronized (this) {
            this.f3956b = null;
            iiVar = new ii(new fr(this, obj));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
            iiVar = this.f3956b;
            this.f3956b = null;
        }
        return iiVar;
    }

    public final String getType() {
        return "ComboBox";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            if (KonyMain.getAppContext().getApplicationInfo().targetSdkVersion <= 10 || KonyMain.f3656d <= 10) {
                this.f3957m = new ak(KonyMain.getActContext());
            } else {
                this.f3957m = new ak(KonyMain.getActContext(), 0);
            }
            Object table = super.getTable(ATTR_WIDGET_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f3957m.m567b(a);
                }
            } else {
                this.f3957m.m567b(new hp().m3352a());
            }
            table = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f3957m.m560a(a);
                }
            }
            LuaNil table2 = super.getTable(f3946c);
            if (table2 != LuaNil.nil) {
                m4353b((LuaTable) table2);
            }
            table2 = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table2 != LuaNil.nil) {
                this.f3957m.m558a(m3942a(((Boolean) table2).booleanValue()));
            }
            if (m3941K()) {
                table2 = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
                if (!(table2 == LuaNil.nil || ((Double) table2).intValue() == 0)) {
                    table2 = super.getTable(ATTR_WIDGET_HEXPAND);
                    if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                        this.f3957m.m561a(true);
                    }
                }
            }
            table2 = super.getTable(ATTR_WIDGET_VEXPAND);
            if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                this.f3957m.m569b(true);
            }
            table2 = super.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table2 != LuaNil.nil) {
                switch (((Double) table2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f3957m.m566b(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f3957m.m566b(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f3957m.m566b(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f3957m.m566b(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f3957m.m566b(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f3957m.m566b(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f3957m.m566b(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f3957m.m566b(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f3957m.m566b(85);
                        break;
                    default:
                        this.f3957m.m566b(17);
                        break;
                }
            }
            table2 = super.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                this.f3957m.m562a(convertMarginsToPixels(table2, this.I));
            }
            table2 = super.getTable(ATTR_WIDGET_PADDING);
            if (table2 != LuaNil.nil) {
                this.f3957m.m570b(convertPaddingToPixels(table2, this.I));
            }
            table = super.getTable("widgetnormalskin");
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f3957m.m578d(a);
                }
            }
            table = super.getTable("widgetfocusskin");
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f3957m.m573c(a);
                }
            }
            this.f3957m.setOnItemSelectedListener(this.f3960p);
            table2 = super.getTable(f3947d);
            if (table2 != LuaNil.nil) {
                if (table2 instanceof LuaTable) {
                    m4357c((LuaTable) table2);
                } else {
                    throw new LuaError("Invalid data type set for masterdatamap property of ComboBox widget", 607);
                }
            }
            table2 = super.getTable(f3949f);
            if (table2 != LuaNil.nil && this.f3957m.m564a(table2.toString())) {
                this.f3958n = (am) this.f3957m.getSelectedItem();
            }
            table2 = super.getTable(ATTR_WIDGET_SET_ENABLED);
            if (table2 != LuaNil.nil) {
                this.f3957m.m575c(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(f3950g);
            if (table2 != LuaNil.nil) {
                this.f3957m.m568b((String) table2);
            }
            table2 = super.getTable(f3951h);
            if (table2 != LuaNil.nil) {
                switch (((Double) table2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f3957m.m577d(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f3957m.m577d(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f3957m.m577d(21);
                        break;
                    default:
                        this.f3957m.m577d(19);
                        break;
                }
            }
            table2 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            if (table2 != LuaNil.nil && (table2 instanceof LuaTable)) {
                this.f3957m.m574c(m3943a((LuaTable) table2));
            }
            table2 = super.getTable(f3952i);
            if (table2 != LuaNil.nil) {
                this.f3957m.m579d(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(f3953j);
            if (table2 != LuaNil.nil) {
                this.f3957m.m582e(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(f3954k);
            if (table2 != LuaNil.nil) {
                this.f3957m.m586g(((Double) table2).intValue());
            }
            table2 = super.getTable(f3955l);
            if (table2 != LuaNil.nil) {
                this.f3957m.m587h(((Double) table2).intValue());
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
        }
        this.f3957m.m571c();
        return this.f3957m.m576d();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f3957m.m570b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (!(table == null || table == LuaNil.nil)) {
                this.f3957m.m562a(convertMarginsToPixels(table, this.I));
            }
            this.f3957m.m585g();
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3957m.m575c(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3957m.setFocusableInTouchMode(true);
            this.f3957m.requestFocus();
            this.f3957m.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3957m.m569b(false);
            this.f3957m.m584f(i);
            this.f3957m.m565b();
        }
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        m3950d(obj, obj2);
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3957m.m558a(m3942a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f3957m.m557a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3957m.m561a(false);
            this.f3957m.m581e(i);
            this.f3957m.m565b();
        }
    }

    public final String toString() {
        return "LuaComboBox: " + getTable(ATTR_WIDGET_ID);
    }
}
