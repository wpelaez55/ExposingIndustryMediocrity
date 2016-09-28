package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import ny0k.cN;

public final class gU extends LuaWidget {
    public static String f4179a;
    private static String f4180c;
    private static String f4181d;
    private static String f4182e;
    private static String f4183f;
    private static String f4184g;
    private static String f4185h;
    private static String f4186i;
    private static String f4187j;
    Object f4188b;
    private cM f4189k;
    private boolean f4190l;
    private OnCheckedChangeListener f4191m;

    static {
        f4180c = "masterdata";
        f4181d = "masterdatamap";
        f4182e = "selectedkeyvalue";
        f4183f = "selectedkey";
        f4184g = "itemorientation";
        f4179a = "onselection";
        f4185h = "vertical";
        f4186i = "tickedimage";
        f4187j = "untickedimage";
        if (KonyMain.m4057C()) {
            f4180c = "masterData";
            f4181d = "masterDataMap";
            f4182e = "selectedKeyValue";
            f4183f = "selectedKey";
            f4179a = "onSelection";
            f4184g = "itemOrientation";
            f4186i = "tickedImage";
            f4187j = "untickedImage";
        }
    }

    public gU(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4189k = null;
        this.f4191m = new gV(this);
        this.f4188b = null;
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
        table = luaTable.getTable(f4179a);
        if (table != LuaNil.nil) {
            super.setTable(f4179a, table);
        }
        table = luaTable.getTable(f4180c);
        if (table != LuaNil.nil) {
            super.setTable(f4180c, table);
        }
        table = luaTable.getTable(f4182e);
        if (table != LuaNil.nil) {
            super.setTable(f4182e, table);
        }
        table = luaTable.getTable(f4183f);
        if (table != LuaNil.nil) {
            super.setTable(f4183f, table);
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
            table = luaTable2.getTable(f4184g);
            if (table != LuaNil.nil) {
                super.setTable(f4184g, table);
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
            table = luaTable3.getTable(f4186i);
            if (table != LuaNil.nil) {
                super.setTable(f4186i, table);
            }
            table = luaTable3.getTable(f4187j);
            if (table != LuaNil.nil) {
                super.setTable(f4187j, table);
            }
        }
    }

    private static LuaTable m4572a(cO cOVar) {
        if (cOVar == null) {
            return null;
        }
        LuaTable luaTable = new LuaTable(2, 0);
        luaTable.list.addElement(cOVar.f935a);
        luaTable.list.addElement(cOVar.f936b);
        return luaTable;
    }

    private LuaTable m4573a(String str) {
        LuaTable luaTable;
        LuaNil table = super.getTable(f4181d);
        LuaNil table2 = super.getTable(f4180c);
        int i;
        if (table2 == LuaNil.nil) {
            if (table != LuaNil.nil) {
                if (table instanceof LuaTable) {
                    luaTable = (LuaTable) table;
                    Vector vector = ((LuaTable) luaTable.list.elementAt(0)).list;
                    int size = vector.size();
                    if (size != 0) {
                        String str2 = (String) luaTable.list.elementAt(1);
                        String str3 = (String) luaTable.list.elementAt(2);
                        for (i = 0; i < size; i++) {
                            LuaTable luaTable2 = (LuaTable) vector.elementAt(i);
                            String obj = luaTable2.map.get(str2).toString();
                            String obj2 = luaTable2.map.get(str3).toString();
                            if (str.equals(obj)) {
                                luaTable = new LuaTable(2, 0);
                                luaTable.list.addElement(obj);
                                luaTable.list.addElement(obj2);
                                break;
                            }
                        }
                    } else if (!KonyMain.f3658f) {
                        return null;
                    } else {
                        Log.w("LuaRadioGroup", "Empty master datamap set to combo box");
                        return null;
                    }
                }
                throw new LuaError("Invalid data type for masterdatamap property RadioGroup", 607);
            }
            luaTable = null;
        } else if (table2 instanceof LuaTable) {
            Vector vector2 = ((LuaTable) table2).list;
            if (vector2.size() != 0) {
                i = vector2.size();
                for (int i2 = 0; i2 < i; i2++) {
                    luaTable = (LuaTable) vector2.elementAt(i2);
                    if (str.equals(luaTable.list.elementAt(0).toString())) {
                        break;
                    }
                }
                luaTable = null;
            } else if (!KonyMain.f3658f) {
                return null;
            } else {
                Log.w("LuaRadioGroup", "Empty master data set to radio group");
                return null;
            }
        } else {
            throw new LuaError("Invalid data type for masterdata property RadioGroup", 607);
        }
        return luaTable;
    }

    private Object m4575a(Object obj) {
        if (!((String) obj).equalsIgnoreCase(f4182e)) {
            if (((String) obj).equalsIgnoreCase(f4183f) && this.E == KONY_WIDGET_RESTORE) {
                cO a = this.f4189k.m967a();
                if (a != null) {
                    return a.f935a;
                }
            }
            return super.getTable(obj);
        } else if (this.E == KONY_WIDGET_RESTORE) {
            return m4572a(this.f4189k.m967a());
        } else {
            if (KonyMain.f3658f) {
                Log.w("LuaRadioGroup", "WARNING!!! RADIOGROUP SELECTED_KEY_N_VALUE called when form is inactive");
            }
            return super.getTable(f4182e);
        }
    }

    private void m4577b(LuaTable luaTable) {
        Vector vector = luaTable.list;
        this.f4189k.m976b();
        int size = vector.size();
        for (int i = 0; i < size; i++) {
            LuaTable luaTable2 = (LuaTable) vector.elementAt(i);
            LuaNil elementAt = luaTable2.list.elementAt(0);
            if (elementAt != LuaNil.nil) {
                String obj = elementAt.toString();
                LuaNil elementAt2 = luaTable2.list.elementAt(1);
                if (elementAt2 != LuaNil.nil) {
                    cM cMVar = this.f4189k;
                    cMVar.getClass();
                    cO cOVar = new cO(cMVar, obj, elementAt2.toString());
                    if (luaTable2.list.size() > 2) {
                        Object elementAt3 = luaTable2.list.elementAt(2);
                        if (elementAt3 != null && (elementAt3 instanceof LuaTable)) {
                            cOVar.f937c = m3944a((LuaTable) elementAt3, elementAt2.toString());
                        }
                    }
                    this.f4189k.m971a(cOVar);
                }
            }
        }
        if (this.f4189k.getChildCount() == 0) {
            if (KonyMain.f3658f) {
                Log.w("LuaRadioGroup", "Empty master data set to radio box");
            }
            cM cMVar2 = this.f4189k;
            cM cMVar3 = this.f4189k;
            cMVar3.getClass();
            cMVar2.m971a(new cO(cMVar3, BuildConfig.FLAVOR, BuildConfig.FLAVOR));
        }
    }

    private void m4578c(LuaTable luaTable) {
        Vector vector = ((LuaTable) luaTable.list.elementAt(0)).list;
        String str = (String) luaTable.list.elementAt(1);
        String str2 = (String) luaTable.list.elementAt(2);
        int size = vector.size();
        this.f4189k.m976b();
        for (int i = 0; i < size; i++) {
            LuaTable luaTable2 = (LuaTable) vector.elementAt(i);
            LuaNil luaNil = luaTable2.map.get(str);
            LuaNil luaNil2 = luaTable2.map.get(str2);
            if (!(luaNil == LuaNil.nil || luaNil2 == LuaNil.nil)) {
                cM cMVar = this.f4189k;
                cMVar.getClass();
                cO cOVar = new cO(cMVar, luaNil.toString(), luaNil2.toString());
                if (luaTable2.map.size() > 2) {
                    Object obj = luaTable2.map.get(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
                    if (obj != null && (obj instanceof LuaTable)) {
                        cOVar.f937c = m3944a((LuaTable) obj, luaNil2.toString());
                    }
                }
                this.f4189k.m971a(cOVar);
            }
        }
        if (this.f4189k.getChildCount() == 0) {
            if (KonyMain.f3658f) {
                Log.w("LuaRadioGroup", "Empty master data set to Radio Group");
            }
            cM cMVar2 = this.f4189k;
            cM cMVar3 = this.f4189k;
            cMVar3.getClass();
            cMVar2.m971a(new cO(cMVar3, BuildConfig.FLAVOR, BuildConfig.FLAVOR));
        }
    }

    protected final void m4579a(Object obj, Object obj2) {
        boolean z = this.E == KONY_WIDGET_RESTORE;
        Log.v("LuaRadioGroup", "************In setTable_internal bWidgetRestoreState" + z);
        String intern = ((String) obj).intern();
        if (intern != ATTR_WIDGET_ISVISIBLE || obj2 == LuaNil.nil) {
            if (intern != f4180c || obj2 == LuaNil.nil) {
                if (intern != f4181d || obj2 == LuaNil.nil) {
                    if (intern == f4183f) {
                        Log.v("LuaRadioGroup", "ATTR_RADIOGROUP_SELECTED_KEY");
                        if (z) {
                            this.f4190l = true;
                            if (obj2 != LuaNil.nil) {
                                this.f4189k.m973a(obj2.toString());
                            } else {
                                this.f4189k.m973a(null);
                            }
                            this.f4190l = false;
                            return;
                        }
                        Log.v("LuaRadioGroup", "ATTR_RADIOGROUP_SELECTED_KEY else");
                        LuaTable a = m4573a(obj2.toString());
                        if (a != null) {
                            super.setTable(f4182e, a);
                        } else {
                            super.setTable(f4182e, LuaNil.nil);
                        }
                    } else if (intern == ATTR_WIDGET_SKIN && obj2 != LuaNil.nil && z) {
                        r0 = cN.m2139a(obj2);
                        if (r0 != null) {
                            this.f4189k.m979b(r0);
                            this.f4189k.m974a(false);
                        }
                    } else if (intern == ATTR_WIDGET_FOCUS_SKIN && obj2 != LuaNil.nil && z) {
                        r0 = cN.m2139a(obj2);
                        if (r0 != null) {
                            this.f4189k.m972a(r0);
                            this.f4189k.m974a(true);
                        }
                    } else if (intern == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil && z) {
                        this.f4189k.m975a(convertMarginsToPixels(obj2, this.I));
                        this.f4189k.m983c();
                    } else if (intern == ATTR_WIDGET_PADDING && obj2 != LuaNil.nil && z) {
                        this.f4189k.m982b(convertPaddingToPixels(obj2, this.I));
                        this.f4189k.m983c();
                    } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT && obj2 != LuaNil.nil && z && this.G) {
                        setWeight();
                        this.f4189k.m983c();
                        ((eO) this.I).m4238t();
                    } else if (intern != ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
                    } else {
                        if (obj2 != null && (obj2 instanceof LuaTable) && z) {
                            this.f4189k.m989d(m3943a((LuaTable) obj2));
                        } else if (obj2 == null || obj2 == LuaNil.nil) {
                            this.f4189k.m989d(BuildConfig.FLAVOR);
                        }
                    }
                } else if (!z) {
                } else {
                    if (obj2 instanceof LuaTable) {
                        m4578c((LuaTable) obj2);
                        super.setTable(f4180c, LuaNil.nil);
                        super.setTable(f4182e, LuaNil.nil);
                        super.setTable(f4182e, LuaNil.nil);
                        return;
                    }
                    throw new LuaError("Invalid data type for masterdata property of RadioGroup", 607);
                }
            } else if (!z) {
            } else {
                if (obj2 instanceof LuaTable) {
                    m4577b((LuaTable) obj2);
                    super.setTable(f4181d, LuaNil.nil);
                    super.setTable(f4182e, LuaNil.nil);
                    super.setTable(f4182e, LuaNil.nil);
                    return;
                }
                throw new LuaError("Invalid data type for masterdata property of RadioGroup widget", 607);
            }
        } else if (z) {
            this.f4189k.m969a(m3942a(((Boolean) obj2).booleanValue()));
        }
    }

    public final void cleanup() {
        if (this.f4189k != null) {
            cO a = this.f4189k.m967a();
            if (a != null) {
                LuaTable a2 = m4572a(a);
                if (a2 != null) {
                    super.setTable(f4182e, a2);
                } else {
                    super.setTable(f4182e, LuaNil.nil);
                }
                super.setTable(f4183f, a.f935a);
            }
            this.f4189k.m992f();
            this.f4189k = null;
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
        hashtable.put(f4180c, "table");
        hashtable.put(f4183f, "string");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        hashtable.put(f4182e, "table");
        hashtable.put(f4181d, "table");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4575a(obj);
        }
        Object iiVar;
        synchronized (this) {
            this.f4188b = null;
            iiVar = new ii(new gW(this, obj));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
            iiVar = this.f4188b;
            this.f4188b = null;
        }
        return iiVar;
    }

    public final String getType() {
        return "RadioButtonGroup";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            this.f4189k = new cM(KonyMain.getActContext());
            Object table = super.getTable(ATTR_WIDGET_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4189k.m979b(a);
                }
            } else {
                this.f4189k.m979b(new hp().m3352a());
            }
            table = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4189k.m972a(a);
                }
            }
            LuaNil table2 = super.getTable(f4184g);
            if (table2 != LuaNil.nil) {
                if (((String) table2).intern() == f4185h) {
                    this.f4189k.setOrientation(1);
                } else {
                    this.f4189k.setOrientation(0);
                }
            }
            super.getTable(f4179a);
            table2 = LuaNil.nil;
            table2 = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table2 != LuaNil.nil) {
                this.f4189k.m969a(m3942a(((Boolean) table2).booleanValue()));
            }
            super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            table2 = LuaNil.nil;
            table2 = super.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table2 != LuaNil.nil) {
                switch (((Double) table2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f4189k.m977b(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f4189k.m977b(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f4189k.m977b(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f4189k.m977b(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f4189k.m977b(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f4189k.m977b(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f4189k.m977b(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f4189k.m977b(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f4189k.m977b(85);
                        break;
                    default:
                        this.f4189k.m977b(17);
                        break;
                }
            }
            if (m3941K()) {
                table2 = super.getTable(ATTR_WIDGET_HEXPAND);
                if (table2 != LuaNil.nil) {
                    this.f4189k.m986c(((Boolean) table2).booleanValue());
                }
            }
            table2 = super.getTable(ATTR_WIDGET_VEXPAND);
            if (table2 != LuaNil.nil) {
                this.f4189k.m990d(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                this.f4189k.m975a(convertMarginsToPixels(table2, this.I));
            }
            table2 = super.getTable(ATTR_WIDGET_PADDING);
            if (table2 != LuaNil.nil) {
                this.f4189k.m982b(convertPaddingToPixels(table2, this.I));
            }
            table2 = super.getTable(f4186i);
            if (table2 != LuaNil.nil) {
                this.f4189k.m980b(table2.toString());
            }
            table2 = super.getTable(f4187j);
            if (table2 != LuaNil.nil) {
                this.f4189k.m985c(table2.toString());
            }
            table2 = super.getTable(f4180c);
            if (table2 != LuaNil.nil) {
                m4577b((LuaTable) table2);
            } else {
                table2 = super.getTable(f4181d);
                if (table2 != LuaNil.nil) {
                    m4578c((LuaTable) table2);
                } else {
                    cM cMVar = this.f4189k;
                    cM cMVar2 = this.f4189k;
                    cMVar2.getClass();
                    cMVar.m971a(new cO(cMVar2, BuildConfig.FLAVOR, BuildConfig.FLAVOR));
                }
            }
            table2 = super.getTable(f4183f);
            this.f4190l = true;
            if (table2 != LuaNil.nil) {
                this.f4189k.m973a(table2.toString());
            } else {
                this.f4189k.m973a(null);
            }
            this.f4190l = false;
            this.f4189k.setOnCheckedChangeListener(this.f4191m);
            table2 = super.getTable(ATTR_WIDGET_SET_ENABLED);
            if (table2 != LuaNil.nil) {
                this.f4189k.m981b(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            if (table2 != LuaNil.nil && (table2 instanceof LuaTable)) {
                this.f4189k.m989d(m3943a((LuaTable) table2));
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
        }
        this.f4189k.m987d();
        return this.f4189k.m991e();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4189k.m982b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4189k.m975a(convertMarginsToPixels(table, this.I));
            }
            this.f4189k.m993g();
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4189k.m981b(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4189k.setFocusableInTouchMode(true);
            this.f4189k.requestFocus();
            this.f4189k.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4189k.m986c(false);
            this.f4189k.m988d(i);
            this.f4189k.m983c();
        }
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        m3950d(obj, obj2);
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4189k.m969a(m3942a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4189k.m968a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4189k.m986c(false);
            this.f4189k.m984c(i);
            this.f4189k.m983c();
        }
    }

    public final String toString() {
        return "LuaRadioGroup: " + getTable(ATTR_WIDGET_ID);
    }
}
