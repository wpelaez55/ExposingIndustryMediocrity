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

public final class gF extends LuaWidget {
    public static String f4057a;
    private static String f4058c;
    private static String f4059d;
    private static String f4060e;
    private static String f4061f;
    private static String f4062g;
    private static String f4063h;
    private static String f4064i;
    private static String f4065j;
    private static String f4066k;
    private static String f4067l;
    private static String f4068m;
    private static String f4069n;
    private static String f4070o;
    private static String f4071p;
    private static String f4072q;
    private static String f4073r;
    private static String f4074s;
    private static String f4075t;
    private static String f4076u;
    private static String f4077v;
    private static String f4078w;
    private static String f4079x;
    private static String f4080y;
    private static String f4081z;
    private bO f4082A;
    private bV f4083B;
    Object f4084b;

    static {
        f4058c = "masterdata";
        f4059d = "masterdatamap";
        f4060e = "selectedkeyvalues";
        f4061f = "selectedkeyvalue";
        f4062g = "selectedkeys";
        f4063h = "selectedkey";
        f4064i = "multiple";
        f4065j = "popuptitle";
        f4066k = "applyskinstopopup";
        f4067l = "nativelistfieldskin";
        f4068m = "nativelistfieldfocusskin";
        f4069n = "liststyle";
        f4070o = "viewtype";
        f4071p = "placeholder";
        f4072q = "placeholderskin";
        f4057a = "onselection";
        f4073r = "tickedimage";
        f4074s = "untickedimage";
        f4075t = "popupicon";
        f4076u = "dropdownimage";
        f4077v = "contentalignment";
        f4078w = "singleLineText";
        f4079x = "singleLineTextInPopup";
        f4080y = "textTruncatePosition";
        f4081z = "textTruncatePositionInPopup";
        if (KonyMain.m4057C()) {
            f4058c = "masterData";
            f4059d = "masterDataMap";
            f4060e = "selectedKeyValues";
            f4061f = "selectedKeyValue";
            f4062g = "selectedKeys";
            f4063h = "selectedKey";
            f4057a = "onSelection";
            f4065j = "popupTitle";
            f4066k = "applySkinsToPopup";
            f4067l = "nativeListFieldSkin";
            f4068m = "nativeListFieldFocusSkin";
            f4069n = "listStyle";
            f4070o = "viewType";
            f4072q = "placeholderSkin";
            f4073r = "tickedImage";
            f4074s = "untickedImage";
            f4075t = "popupIcon";
            f4076u = "dropDownImage";
            f4077v = "contentAlignment";
        }
    }

    public gF(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4082A = null;
        this.f4083B = new bV(this);
        this.f4084b = null;
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        super.setTable(f4064i, new Boolean(false));
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
        table = luaTable.getTable(f4057a);
        if (table != LuaNil.nil) {
            super.setTable(f4057a, table);
        }
        table = luaTable.getTable(f4058c);
        if (table != LuaNil.nil) {
            super.setTable(f4058c, table);
        }
        LuaNil table2 = luaTable.getTable(f4061f);
        if (table2 != LuaNil.nil) {
            if (table2 instanceof LuaTable) {
                Vector vector = ((LuaTable) table2).list;
                if (vector.size() > 0) {
                    LuaTable luaTable4 = new LuaTable(1, 0);
                    luaTable4.add(vector.get(0));
                    super.setTable(f4062g, luaTable4);
                }
            }
            super.setTable(f4061f, table2);
        }
        table2 = luaTable.getTable(f4063h);
        if (table2 != LuaNil.nil) {
            Object obj = table2 instanceof String ? (String) table2 : table2.toString();
            luaTable4 = new LuaTable(1, 0);
            luaTable4.add(obj);
            super.setTable(f4062g, luaTable4);
            super.setTable(f4063h, table2);
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
            table = luaTable2.getTable(f4077v);
            if (table != LuaNil.nil) {
                super.setTable(f4077v, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_HEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_HEXPAND, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_VEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_VEXPAND, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, table);
            }
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(f4066k);
            if (table != LuaNil.nil) {
                super.setTable(f4066k, table);
            }
            table = luaTable3.getTable(f4070o);
            if (table != LuaNil.nil) {
                super.setTable(f4070o, table);
            }
            table = luaTable3.getTable(f4067l);
            if (table != LuaNil.nil) {
                super.setTable(f4067l, table);
            }
            table = luaTable3.getTable(f4068m);
            if (table != LuaNil.nil) {
                super.setTable(f4068m, table);
            }
            table = luaTable3.getTable(f4071p);
            if (table != LuaNil.nil) {
                super.setTable(f4071p, table);
            }
            table = luaTable3.getTable(f4072q);
            if (table != LuaNil.nil) {
                super.setTable(f4072q, table);
            }
            table = luaTable3.getTable(f4065j);
            if (table != LuaNil.nil) {
                super.setTable(f4065j, table);
            }
            table = luaTable3.getTable(f4073r);
            if (table != LuaNil.nil) {
                super.setTable(f4073r, table);
            }
            table = luaTable3.getTable(f4074s);
            if (table != LuaNil.nil) {
                super.setTable(f4074s, table);
            }
            table = luaTable3.getTable(f4075t);
            if (table != LuaNil.nil) {
                super.setTable(f4075t, table);
            }
            table = luaTable3.getTable(f4076u);
            if (table != LuaNil.nil) {
                super.setTable(f4076u, table);
            }
            table = luaTable3.getTable(f4078w);
            if (table != LuaNil.nil) {
                super.setTable(f4078w, table);
            }
            table = luaTable3.getTable(f4079x);
            if (table != LuaNil.nil) {
                super.setTable(f4079x, table);
            }
            table = luaTable3.getTable(f4080y);
            if (table != LuaNil.nil) {
                super.setTable(f4080y, table);
            }
            table = luaTable3.getTable(f4081z);
            if (table != LuaNil.nil) {
                super.setTable(f4081z, table);
            }
            if (luaTable3.getTable(ATTR_WIDGET_PROP_DEPRECATED) != LuaNil.nil) {
                LuaTable luaTable5 = (LuaTable) luaTable3.getTable(ATTR_WIDGET_PROP_DEPRECATED);
                table2 = luaTable5.getTable(f4069n);
                if (table2 != LuaNil.nil) {
                    super.setTable(f4070o, table2);
                }
                table2 = luaTable5.getTable(f4064i);
                if (table2 != LuaNil.nil) {
                    super.setTable(f4064i, table2);
                }
                table2 = luaTable5.getTable(f4062g);
                if (table2 != LuaNil.nil) {
                    super.setTable(f4062g, table2);
                }
                table2 = luaTable5.getTable(f4060e);
                if (table2 != LuaNil.nil) {
                    if (table2 instanceof LuaTable) {
                        Vector vector2 = ((LuaTable) table2).list;
                        int size = vector2.size();
                        LuaTable luaTable6 = new LuaTable(size, 0);
                        for (int i = 0; i < size; i++) {
                            if (vector2.get(i) instanceof LuaTable) {
                                luaTable6.add(((LuaTable) vector2.get(i)).list.get(0));
                            }
                        }
                        super.setTable(f4062g, luaTable6);
                    }
                    super.setTable(f4060e, table2);
                }
            }
        }
    }

    private Object m4488a(Object obj) {
        String intern = ((String) obj).intern();
        if (this.E == KONY_WIDGET_RESTORE) {
            if (intern == f4060e) {
                return m4489b(true);
            }
            if (intern == f4062g) {
                return m4489b(false);
            }
            LuaTable b;
            if (intern == f4061f) {
                b = m4489b(true);
                return b != null ? b.list.get(0) : null;
            } else if (intern == f4063h) {
                b = m4489b(false);
                return b != null ? b.list.get(0) : null;
            }
        } else if (KonyMain.f3658f) {
            Log.w("LuaListBox", "SELECTED_KEY_N_VALUE called when form is inactive");
        }
        return super.getTable(intern);
    }

    private LuaTable m4489b(boolean z) {
        ArrayList c = this.f4082A.m803c();
        if (c.size() <= 0) {
            return null;
        }
        LuaTable luaTable = new LuaTable(2, 0);
        for (int i = 0; i < c.size(); i++) {
            bS bSVar = (bS) c.get(i);
            if (z) {
                LuaTable luaTable2 = new LuaTable(2, 0);
                luaTable2.list.addElement(bSVar.f784a);
                luaTable2.list.addElement(bSVar.f785b);
                luaTable.list.add(luaTable2);
            } else {
                luaTable.list.add(bSVar.f784a);
            }
        }
        return luaTable;
    }

    private void m4490b(LuaTable luaTable) {
        Vector vector = luaTable.list;
        if (vector.size() != 0) {
            bS[] bSVarArr = new bS[vector.size()];
            for (int i = 0; i < vector.size(); i++) {
                LuaTable luaTable2 = (LuaTable) vector.elementAt(i);
                LuaNil elementAt = luaTable2.list.elementAt(0);
                LuaNil elementAt2 = luaTable2.list.elementAt(1);
                if (!(elementAt == LuaNil.nil || elementAt2 == LuaNil.nil)) {
                    bO bOVar = this.f4082A;
                    bOVar.getClass();
                    bSVarArr[i] = new bS(bOVar, elementAt.toString(), elementAt2.toString());
                    if (luaTable2.list.size() > 2) {
                        Object elementAt3 = luaTable2.list.elementAt(2);
                        if (elementAt3 != null && (elementAt3 instanceof LuaTable)) {
                            bSVarArr[i].f786c = m3944a((LuaTable) elementAt3, elementAt2.toString());
                        }
                    }
                }
            }
            this.f4082A.m807d();
            this.f4082A.m795a(bSVarArr);
        } else if (KonyMain.f3658f) {
            Log.w("LuaListBox", "Empty master data set to list box");
        }
    }

    private void m4491c(LuaTable luaTable) {
        Vector vector = ((LuaTable) luaTable.list.elementAt(0)).list;
        String str = (String) luaTable.list.elementAt(1);
        String str2 = (String) luaTable.list.elementAt(2);
        int size = vector.size();
        bS[] bSVarArr = new bS[size];
        for (int i = 0; i < size; i++) {
            LuaTable luaTable2 = (LuaTable) vector.elementAt(i);
            LuaNil luaNil = luaTable2.map.get(str);
            LuaNil luaNil2 = luaTable2.map.get(str2);
            if (!(luaNil == LuaNil.nil || luaNil2 == LuaNil.nil)) {
                bO bOVar = this.f4082A;
                bOVar.getClass();
                bSVarArr[i] = new bS(bOVar, luaNil.toString(), luaNil2.toString());
                if (luaTable2.map.size() > 2) {
                    Object obj = luaTable2.map.get(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
                    if (obj != null && (obj instanceof LuaTable)) {
                        bSVarArr[i].f786c = m3944a((LuaTable) obj, luaNil2.toString());
                    }
                }
            }
        }
        this.f4082A.m807d();
        this.f4082A.m795a(bSVarArr);
    }

    private void m4492d(LuaTable luaTable) {
        Vector vector = luaTable.list;
        for (int i = 0; i < vector.size(); i++) {
            if (this.f4082A.m802c(vector.get(i).toString()) == null && KonyMain.f3657e) {
                Log.d("LuaListBox", "LuaListBox: selected_keys not found -" + vector.get(i));
            }
        }
    }

    protected final void m4493a(Object obj, Object obj2) {
        int i = 1;
        if (KonyMain.f3657e) {
            Log.d("LuaListBox", "key = " + obj + ": " + obj2);
        }
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == ATTR_WIDGET_ISVISIBLE && obj2 != LuaNil.nil) {
                this.f4082A.m788a(m3942a(((Boolean) obj2).booleanValue()));
            } else if (intern != f4058c || obj2 == LuaNil.nil) {
                if (intern != f4059d || obj2 == LuaNil.nil) {
                    if (intern == f4063h || intern == f4062g) {
                        this.f4082A.clearChoices();
                        this.f4082A.m803c().clear();
                        this.f4082A.m827k();
                        if (obj2 != null && obj2 != LuaNil.nil) {
                            m4492d((LuaTable) super.getTable(f4062g));
                        }
                    } else if (intern == f4064i && obj2 != LuaNil.nil) {
                        bO bOVar = this.f4082A;
                        if (((Boolean) obj2).booleanValue()) {
                            i = 2;
                        }
                        bOVar.setChoiceMode(i);
                    } else if (intern == ATTR_WIDGET_SKIN && obj2 != null && obj2 != LuaNil.nil) {
                        r0 = cN.m2139a(obj2);
                        if (r0 != null) {
                            this.f4082A.m805c(r0);
                            this.f4082A.m786a();
                        }
                    } else if (intern == ATTR_WIDGET_FOCUS_SKIN && obj2 != null && obj2 != LuaNil.nil) {
                        r0 = cN.m2139a(obj2);
                        if (r0 != null) {
                            this.f4082A.m791a(r0);
                            this.f4082A.m786a();
                        }
                    } else if (intern == f4065j && obj2 != null && obj2 != LuaNil.nil) {
                        this.f4082A.m818f(obj2.toString());
                    } else if (intern == f4066k && obj2 != null && obj2 != LuaNil.nil) {
                        this.f4082A.m811d(((Boolean) obj2).booleanValue());
                    } else if (intern == f4067l) {
                        if (obj2 == null || obj2 == LuaNil.nil) {
                            this.f4082A.m809d(null);
                        } else {
                            r0 = cN.m2139a(obj2);
                            if (r0 != null) {
                                this.f4082A.m809d(r0);
                            }
                        }
                        this.f4082A.m826j();
                    } else if (intern == f4068m) {
                        if (obj2 == null || obj2 == LuaNil.nil) {
                            this.f4082A.m798b(null);
                        } else {
                            r0 = cN.m2139a(obj2);
                            if (r0 != null) {
                                this.f4082A.m798b(r0);
                            }
                        }
                        this.f4082A.m825i();
                    } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT) {
                        if (this.G) {
                            setWeight();
                            this.f4082A.m820g();
                            ((eO) this.I).m4238t();
                        }
                    } else if (intern == f4070o) {
                        if (((Double) obj2).intValue() == 1) {
                            this.f4082A.m815e(true);
                        } else {
                            this.f4082A.m815e(false);
                        }
                    } else if (intern == f4071p) {
                        this.f4082A.m821g(obj2.toString());
                    } else if (intern == f4072q) {
                        r0 = cN.m2139a(obj2);
                        if (r0 != null) {
                            this.f4082A.m804c(r0.m1156m());
                        }
                    } else if (intern == ATTR_WIDGET_MARGIN) {
                        this.f4082A.m794a(convertMarginsToPixels(obj2, this.I));
                        this.f4082A.m820g();
                    } else if (intern == ATTR_WIDGET_PADDING) {
                        this.f4082A.m801b(convertPaddingToPixels(obj2, this.I));
                        this.f4082A.m820g();
                    } else if (intern == f4077v && obj2 != LuaNil.nil) {
                        switch (((Double) obj2).intValue()) {
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                                this.f4082A.m808d(19);
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                                this.f4082A.m808d(17);
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                                this.f4082A.m808d(21);
                            default:
                                this.f4082A.m808d(19);
                        }
                    } else if (intern == ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
                        if (obj2 != null && (obj2 instanceof LuaTable)) {
                            this.f4082A.m824h(m3943a((LuaTable) obj2));
                        } else if (obj2 == null || obj2 == LuaNil.nil) {
                            this.f4082A.m824h(BuildConfig.FLAVOR);
                        }
                    } else if (intern == f4078w && obj2 != LuaNil.nil) {
                        this.f4082A.m819f(((Boolean) obj2).booleanValue());
                    } else if (intern == f4079x && obj2 != LuaNil.nil) {
                        this.f4082A.m822g(((Boolean) obj2).booleanValue());
                    } else if (intern == f4080y && obj2 != LuaNil.nil) {
                        this.f4082A.m813e(((Double) obj2).intValue());
                    } else if (intern == f4081z && obj2 != LuaNil.nil) {
                        this.f4082A.m817f(((Double) obj2).intValue());
                    }
                } else if (obj2 instanceof LuaTable) {
                    super.setTable(f4058c, LuaNil.nil);
                    m4491c((LuaTable) obj2);
                } else {
                    throw new LuaError("Invalid data type for masterdatamap property of ListBox", 607);
                }
            } else if (obj2 instanceof LuaTable) {
                super.setTable(f4059d, LuaNil.nil);
                m4490b((LuaTable) obj2);
            } else {
                throw new LuaError("Invalid data type for chocies masterdata property", 607);
            }
        }
    }

    public final void cleanup() {
        if (this.f4082A != null) {
            LuaTable b = m4489b(true);
            if (b != null) {
                super.setTable(f4060e, b);
            } else {
                super.setTable(f4060e, LuaNil.nil);
            }
            b = m4489b(false);
            if (b != null) {
                super.setTable(f4062g, b);
            }
            this.f4082A.m823h();
            this.f4082A = null;
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
        hashtable.put(f4064i, "boolean");
        hashtable.put(ATTR_WIDGET_ISVISIBLE, "boolean");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        hashtable.put(f4065j, "string");
        hashtable.put(f4066k, "boolean");
        hashtable.put(f4058c, "table");
        hashtable.put(f4059d, "table");
        hashtable.put(f4062g, "table");
        hashtable.put(f4060e, "table");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (obj == ATTR_WIDGET_MARGIN || obj == ATTR_WIDGET_PADDING || obj == ATTR_WIDGET_MARGIN_IN_PIXEL || obj == ATTR_WIDGET_PADDING_IN_PIXEL || obj == f4057a) {
            return super.getTable(obj);
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4488a(obj);
        }
        Object iiVar;
        synchronized (this) {
            this.f4084b = null;
            iiVar = new ii(new gG(this, obj));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
            iiVar = this.f4084b;
            this.f4084b = null;
        }
        return iiVar;
    }

    public final String getType() {
        return "ListBox";
    }

    public final View getWidget() {
        boolean z = true;
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            this.f4082A = new bO(KonyMain.getActContext());
            Object table = super.getTable(ATTR_WIDGET_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4082A.m805c(a);
                }
            }
            table = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4082A.m791a(a);
                }
            }
            LuaNil table2 = super.getTable(f4064i);
            if (table2 != LuaNil.nil) {
                this.f4082A.setChoiceMode(((Boolean) table2).booleanValue() ? 2 : 1);
            }
            table2 = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table2 != LuaNil.nil) {
                this.f4082A.m788a(m3942a(((Boolean) table2).booleanValue()));
            }
            if (m3941K()) {
                table2 = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
                if (!(table2 == LuaNil.nil || ((Double) table2).intValue() == 0)) {
                    table2 = super.getTable(ATTR_WIDGET_HEXPAND);
                    if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                        this.f4082A.m793a(true);
                    }
                }
            }
            table2 = super.getTable(ATTR_WIDGET_VEXPAND);
            if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                this.f4082A.m800b(true);
            }
            table2 = super.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table2 != LuaNil.nil) {
                switch (((Double) table2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f4082A.m797b(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f4082A.m797b(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f4082A.m797b(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f4082A.m797b(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f4082A.m797b(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f4082A.m797b(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f4082A.m797b(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f4082A.m797b(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f4082A.m797b(85);
                        break;
                    default:
                        this.f4082A.m797b(17);
                        break;
                }
            }
            table2 = super.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                this.f4082A.m794a(convertMarginsToPixels(table2, this.I));
            }
            table2 = super.getTable(ATTR_WIDGET_PADDING);
            if (table2 != LuaNil.nil) {
                this.f4082A.m801b(convertPaddingToPixels(table2, this.I));
            }
            table2 = super.getTable(f4073r);
            if (table2 != LuaNil.nil) {
                this.f4082A.m810d(table2.toString());
            }
            table2 = super.getTable(f4074s);
            if (table2 != LuaNil.nil) {
                this.f4082A.m814e(table2.toString());
            }
            table2 = super.getTable(f4071p);
            if (table2 != LuaNil.nil) {
                this.f4082A.m821g(table2.toString());
            }
            table = super.getTable(f4072q);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4082A.m804c(a.m1156m());
                }
            }
            table2 = super.getTable(f4075t);
            if (table2 != LuaNil.nil) {
                this.f4082A.m799b(table2.toString());
            }
            table2 = super.getTable(f4076u);
            if (table2 != LuaNil.nil) {
                this.f4082A.m792a(table2.toString());
            }
            table2 = super.getTable(f4070o);
            if (table2 == LuaNil.nil) {
                z = false;
            } else if (((Double) table2).intValue() != 1) {
                z = false;
            }
            this.f4082A.m815e(z);
            table = super.getTable(f4067l);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4082A.m809d(a);
                }
            }
            table = super.getTable(f4068m);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4082A.m798b(a);
                }
            }
            table2 = super.getTable(f4066k);
            if (table2 != LuaNil.nil) {
                this.f4082A.m811d(((Boolean) table2).booleanValue());
            }
            this.f4082A.m790a(this.f4083B);
            table2 = super.getTable(f4058c);
            if (table2 != LuaNil.nil) {
                m4490b((LuaTable) table2);
            } else {
                table2 = super.getTable(f4059d);
                if (table2 != LuaNil.nil) {
                    if (table2 instanceof LuaTable) {
                        m4491c((LuaTable) table2);
                    } else {
                        throw new LuaError("Invalid data type for masterdatamap property of ListBox", 607);
                    }
                }
            }
            table2 = super.getTable(f4062g);
            if (table2 != LuaNil.nil) {
                if (table2 instanceof LuaTable) {
                    m4492d((LuaTable) table2);
                } else if (KonyMain.f3657e) {
                    Log.d("LuaListBox", "Invalid data type for setselectedkeys property of ListBox");
                }
            }
            table2 = super.getTable(ATTR_WIDGET_SET_ENABLED);
            if (table2 != LuaNil.nil) {
                this.f4082A.m806c(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(f4065j);
            if (table2 != LuaNil.nil) {
                this.f4082A.m818f(table2.toString());
            }
            table2 = super.getTable(f4077v);
            if (table2 != LuaNil.nil) {
                switch (((Double) table2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f4082A.m808d(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f4082A.m808d(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f4082A.m808d(21);
                        break;
                    default:
                        this.f4082A.m808d(19);
                        break;
                }
            }
            table2 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            if (table2 != LuaNil.nil && (table2 instanceof LuaTable)) {
                this.f4082A.m824h(m3943a((LuaTable) table2));
            }
            table2 = super.getTable(f4078w);
            if (table2 != LuaNil.nil) {
                this.f4082A.m819f(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(f4079x);
            if (table2 != LuaNil.nil) {
                this.f4082A.m822g(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(f4080y);
            if (table2 != LuaNil.nil) {
                this.f4082A.m813e(((Double) table2).intValue());
            }
            table2 = super.getTable(f4081z);
            if (table2 != LuaNil.nil) {
                this.f4082A.m817f(((Double) table2).intValue());
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
        }
        this.f4082A.m812e();
        return this.f4082A.m816f();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4082A.m801b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4082A.m794a(convertMarginsToPixels(table, this.I));
            }
            this.f4082A.m828l();
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4082A.m806c(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4082A.m796b();
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
    }

    public final void setTable(Object obj, Object obj2) {
        String intern = ((String) obj).intern();
        if (!(intern != f4063h || obj2 == null || obj2 == LuaNil.nil)) {
            LuaTable luaTable = new LuaTable(1, 0);
            luaTable.add(obj2.toString());
            super.setTable(f4062g, luaTable);
            super.setTable(f4063h, obj2);
        }
        if (intern == f4069n) {
            super.setTable(f4070o, obj2);
        } else {
            super.setTable(obj, obj2);
        }
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(obj, obj2);
        } else if (intern == f4058c && obj2 != LuaNil.nil) {
            super.setTable(f4059d, LuaNil.nil);
        } else if (intern == f4059d && obj2 != LuaNil.nil) {
            super.setTable(f4058c, LuaNil.nil);
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4082A.m788a(m3942a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4082A.m787a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
    }

    public final String toString() {
        return "LuaListBox: " + getTable(ATTR_WIDGET_ID);
    }
}
