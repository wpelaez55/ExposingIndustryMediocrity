package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import ny0k.bU;
import ny0k.cN;

public final class gD extends LuaWidget implements cv {
    public static String f4046a;
    private static String f4047b;
    private static String f4048c;
    private static String f4049d;
    private static String f4050e;
    private static String f4051f;
    private bM f4052g;
    private Object[] f4053h;
    private OnClickListener f4054i;
    private iq f4055j;
    private eO f4056k;

    static {
        f4046a = "onclick";
        f4047b = "contentalignment";
        f4048c = "contextmenu";
        f4049d = "image";
        f4050e = "normalimage";
        f4051f = "focusimage";
        if (KonyMain.m4057C()) {
            f4046a = "onClick";
            f4047b = "contentAlignment";
            f4048c = "contextMenu";
        }
    }

    public gD(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        LuaNil table;
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4052g = null;
        this.f4054i = new gE(this);
        this.mBasicConfig = luaTable;
        this.mLayoutConfig = luaTable2;
        this.mPspConfig = luaTable3;
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        if (luaTable3 != null) {
            table = luaTable3.getTable(f4048c);
            if (table != LuaNil.nil) {
                super.setTable(f4048c, table);
            }
            table = luaTable3.getTable("deprecated");
            if (table != LuaNil.nil) {
                LuaTable luaTable4 = (LuaTable) table;
                LuaNil table2 = luaTable4.getTable(f4049d);
                if (table2 != LuaNil.nil) {
                    super.setTable(f4049d, table2);
                }
                table2 = luaTable4.getTable(f4050e);
                if (table2 != LuaNil.nil) {
                    super.setTable(f4050e, table2);
                }
                table = luaTable4.getTable(f4051f);
                if (table != LuaNil.nil) {
                    super.setTable(f4051f, table);
                }
            }
        }
        table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, table);
        }
        table = luaTable.getTable(f4046a);
        if (table != LuaNil.nil) {
            super.setTable(f4046a, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_LABEL);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_LABEL, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        } else {
            super.setTable(ATTR_WIDGET_ISVISIBLE, Boolean.valueOf(true));
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGNMENT, table);
            }
            table = luaTable2.getTable(f4047b);
            if (table != LuaNil.nil) {
                super.setTable(f4047b, table);
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
    }

    private gD(Object[] objArr) {
        super(0, 13, 1.0f, false);
        this.f4052g = null;
        this.f4054i = new gE(this);
        this.f4053h = objArr;
        super.setTable(ATTR_WIDGET_ID, objArr[0]);
        if (!(objArr[1] == null || objArr[1] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_SKIN, objArr[1]);
        }
        if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, objArr[2]);
        }
        if (!(objArr[3] == null || objArr[3] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_LABEL, objArr[3]);
        }
        if (!(objArr[4] == null || objArr[4] == LuaNil.nil)) {
            super.setTable(f4049d, objArr[4]);
        }
        if (!(objArr[5] == null || objArr[5] == LuaNil.nil)) {
            super.setTable(f4046a, objArr[5]);
        }
        if (!(objArr[6] == null || objArr[6] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, objArr[6]);
        }
        if (!(objArr[7] == null || objArr[7] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, objArr[7]);
        }
        if (!(objArr[8] == null || objArr[8] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_HEXPAND, objArr[8]);
        }
        if (!(objArr[9] == null || objArr[9] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_VEXPAND, objArr[9]);
        }
        if (!(objArr[10] == null || objArr[10] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_ALIGN, objArr[10]);
        }
        if (objArr.length > 11 && objArr[11] != null && objArr[11] != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, objArr[11]);
        }
    }

    private void m4477a(dB dBVar) {
        this.f4052g.m740b(dBVar);
        this.f4052g.m738b();
    }

    private String m4479b() {
        LuaNil table = super.getTable(ATTR_WIDGET_LABEL);
        return table != LuaNil.nil ? table instanceof String ? (String) table : table.toString() : null;
    }

    private void m4480b(dB dBVar) {
        this.f4052g.m732a(dBVar);
        this.f4052g.m738b();
    }

    private void m4481b(LuaTable luaTable) {
        if (luaTable != null) {
            Vector vector = luaTable.list;
            if (!vector.isEmpty()) {
                Vector vector2 = new Vector();
                Iterator it = vector.iterator();
                while (it.hasNext()) {
                    LuaTable luaTable2 = (LuaTable) it.next();
                    try {
                        vector2.add(new cu((String) luaTable2.list.elementAt(0), (String) luaTable2.list.elementAt(1), 0, luaTable2.list.elementAt(3)));
                    } catch (Exception e) {
                        if (KonyMain.f3657e) {
                            Log.d(BuildConfig.FLAVOR, BuildConfig.FLAVOR + e.getMessage());
                        }
                        throw new LuaError("Invalid Context menu item arguments for Link widget", 605);
                    }
                }
                this.f4052g.m735a(vector2);
                this.f4052g.m731a((cv) this);
            }
        }
    }

    protected final int m4483a(boolean z) {
        switch (H) {
            case LuaWidget.RETAIN_SPACE_UNSET /*-1*/:
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return this.G ? z ? (m4479b() == null || m4479b().equals(BuildConfig.FLAVOR)) ? 4 : 0 : 4 : z ? (m4479b() == null || m4479b().equals(BuildConfig.FLAVOR)) ? 8 : 0 : 8;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return z ? (m4479b() == null || m4479b().equals(BuildConfig.FLAVOR)) ? 8 : 0 : 8;
            default:
                return 0;
        }
    }

    public final void m4484a(cu cuVar) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = (Function) cuVar.f1030i;
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("key0", cuVar.f1028g);
        obtain.setData(bundle);
        KonyMain.getActContext();
        KonyMain.m4121f().sendMessage(obtain);
    }

    protected final void m4485a(Object obj, Object obj2) {
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == ATTR_WIDGET_ISVISIBLE) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    setVisibility(((Boolean) obj2).booleanValue());
                }
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4480b(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4480b(r0);
                }
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4477a(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4477a(r0);
                }
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT) {
                if (obj2 != null && obj2 != LuaNil.nil && this.G) {
                    setWeight();
                    this.f4052g.m748d();
                    ((eO) this.I).m4238t();
                }
            } else if (intern == ATTR_WIDGET_LABEL) {
                this.f4052g.m741b(obj2 != LuaNil.nil ? (String) obj2 : BuildConfig.FLAVOR);
                LuaNil table = super.getTable(ATTR_WIDGET_ISVISIBLE);
                boolean booleanValue = table != LuaNil.nil ? ((Boolean) table).booleanValue() : false;
                if (obj2 == null || obj2 == LuaNil.nil || obj2.equals(BuildConfig.FLAVOR)) {
                    this.f4052g.m730a(H, m4483a(booleanValue));
                } else {
                    this.f4052g.m730a(H, m4483a(booleanValue));
                }
            } else if (intern == f4050e) {
                this.f4052g.m746c(obj2 != LuaNil.nil ? (String) obj2 : null);
                this.f4052g.m738b();
            } else if (intern == f4051f && obj2 != LuaNil.nil) {
                this.f4052g.m749d(obj2 != LuaNil.nil ? (String) obj2 : null);
                this.f4052g.m738b();
            } else if (intern == f4048c) {
                if (this.E != KONY_WIDGET_RESTORE) {
                    return;
                }
                if (obj2 != LuaNil.nil) {
                    m4481b((LuaTable) obj2);
                    return;
                }
                this.f4052g.m735a(null);
                this.f4052g.m731a(null);
            } else if (intern == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil) {
                this.f4052g.m737a(convertMarginsToPixels(obj2, this.I));
                this.f4052g.m748d();
            } else if (intern == ATTR_WIDGET_PADDING && obj2 != LuaNil.nil) {
                this.f4052g.m743b(convertPaddingToPixels(obj2, this.I));
                this.f4052g.m748d();
            } else if (intern != ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
            } else {
                if (obj2 != null && (obj2 instanceof LuaTable)) {
                    this.f4052g.m734a(m3944a((LuaTable) obj2, this.f4052g.getText().toString()), -1);
                } else if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f4052g.m734a(BuildConfig.FLAVOR, -1);
                }
            }
        }
    }

    public final void cleanup() {
        if (this.f4052g != null) {
            this.f4052g.m754g();
        }
        this.f4052g = null;
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        LuaWidget gDVar = this.f4053h != null ? new gD(this.f4053h) : new gD(this.mBasicConfig, this.mLayoutConfig, this.mPspConfig);
        gDVar.copyProperties(this);
        gDVar.setSegUIWidgetType(bU.LINK);
        gDVar.setVisibility(((Boolean) super.getTable(ATTR_WIDGET_ISVISIBLE)).booleanValue());
        return gDVar;
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
        hashtable.put(f4051f, "string");
        hashtable.put(f4050e, "string");
        hashtable.put(ATTR_WIDGET_LABEL, "string");
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(f4048c, "table");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final String getType() {
        return "Link";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            String str;
            int intValue;
            this.f4052g = new bM(KonyMain.getActContext());
            this.f4052g.m744c();
            this.f4052g.setFocusable(true);
            Object table = super.getTable(ATTR_WIDGET_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4052g.m732a(a);
                }
            }
            table = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4052g.m740b(a);
                }
            }
            LuaNil table2 = super.getTable(f4050e);
            if (table2 != LuaNil.nil) {
                this.f4052g.m746c((String) table2);
            }
            table2 = super.getTable(f4051f);
            if (table2 != LuaNil.nil) {
                this.f4052g.m749d((String) table2);
            }
            table2 = super.getTable(ATTR_WIDGET_LABEL);
            if (table2 != LuaNil.nil) {
                String str2 = (String) table2;
                this.f4052g.m741b(str2);
                str = str2;
            } else {
                str = null;
            }
            table2 = super.getTable(ATTR_WIDGET_ISVISIBLE);
            boolean booleanValue = table2 != LuaNil.nil ? ((Boolean) table2).booleanValue() : false;
            if (str == null || str.equals(BuildConfig.FLAVOR) || !booleanValue) {
                this.f4052g.m730a(H, m4483a(booleanValue));
            } else {
                this.f4052g.m730a(H, 0);
            }
            super.getTable(f4049d);
            table2 = LuaNil.nil;
            table2 = super.getTable(f4048c);
            if (table2 != LuaNil.nil) {
                m4481b((LuaTable) table2);
            } else {
                this.f4052g.m735a(null);
                this.f4052g.m731a(null);
            }
            this.f4052g.setOnClickListener(this.f4054i);
            if (m3941K()) {
                table2 = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
                if (table2 != LuaNil.nil) {
                    intValue = ((Double) table2).intValue();
                    if (intValue > 0) {
                        table2 = super.getTable(ATTR_WIDGET_HEXPAND);
                        if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                            this.f4052g.m736a(true);
                        }
                    }
                    table2 = super.getTable(ATTR_WIDGET_VEXPAND);
                    if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                        this.f4052g.m742b(true);
                    }
                    table2 = super.getTable(ATTR_WIDGET_ALIGNMENT);
                    if (table2 != LuaNil.nil) {
                        switch (((Double) table2).intValue()) {
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                this.f4052g.m729a(51);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                                this.f4052g.m729a(49);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                                this.f4052g.m729a(53);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                                this.f4052g.m729a(19);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                                this.f4052g.m729a(17);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                                this.f4052g.m729a(21);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                                this.f4052g.m729a(83);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                                this.f4052g.m729a(81);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                                this.f4052g.m729a(85);
                                break;
                            default:
                                this.f4052g.m729a(17);
                                break;
                        }
                    }
                    table2 = super.getTable(ATTR_WIDGET_MARGIN);
                    if (table2 != LuaNil.nil) {
                        this.f4052g.m737a(convertMarginsToPixels(table2, this.I));
                    }
                    table2 = super.getTable(ATTR_WIDGET_PADDING);
                    if (table2 != LuaNil.nil) {
                        this.f4052g.m743b(convertPaddingToPixels(table2, this.I));
                    }
                    table2 = super.getTable(f4047b);
                    if (table2 != LuaNil.nil) {
                        switch (((Double) table2).intValue()) {
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                this.f4052g.m745c(51);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                                this.f4052g.m745c(49);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                                this.f4052g.m745c(53);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                                this.f4052g.m745c(19);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                                this.f4052g.m745c(17);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                                this.f4052g.m745c(21);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                                this.f4052g.m745c(83);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                                this.f4052g.m745c(81);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                                this.f4052g.m745c(85);
                                break;
                            default:
                                this.f4052g.m745c(17);
                                break;
                        }
                    }
                    table2 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
                    if (table2 != LuaNil.nil && (table2 instanceof LuaTable)) {
                        this.f4052g.m734a(m3944a((LuaTable) table2, str), -1);
                    }
                    table2 = super.getTable(ATTR_WIDGET_SET_ENABLED);
                    if (table2 != LuaNil.nil) {
                        this.f4052g.m750d(((Boolean) table2).booleanValue());
                    }
                    this.E = KONY_WIDGET_RESTORE;
                    if (this.G) {
                        setWeight();
                    }
                }
            }
            intValue = 0;
            if (intValue > 0) {
                table2 = super.getTable(ATTR_WIDGET_HEXPAND);
                this.f4052g.m736a(true);
            }
            table2 = super.getTable(ATTR_WIDGET_VEXPAND);
            this.f4052g.m742b(true);
            table2 = super.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table2 != LuaNil.nil) {
                switch (((Double) table2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f4052g.m729a(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f4052g.m729a(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f4052g.m729a(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f4052g.m729a(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f4052g.m729a(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f4052g.m729a(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f4052g.m729a(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f4052g.m729a(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f4052g.m729a(85);
                        break;
                    default:
                        this.f4052g.m729a(17);
                        break;
                }
            }
            table2 = super.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                this.f4052g.m737a(convertMarginsToPixels(table2, this.I));
            }
            table2 = super.getTable(ATTR_WIDGET_PADDING);
            if (table2 != LuaNil.nil) {
                this.f4052g.m743b(convertPaddingToPixels(table2, this.I));
            }
            table2 = super.getTable(f4047b);
            if (table2 != LuaNil.nil) {
                switch (((Double) table2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f4052g.m745c(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f4052g.m745c(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f4052g.m745c(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f4052g.m745c(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f4052g.m745c(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f4052g.m745c(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f4052g.m745c(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f4052g.m745c(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f4052g.m745c(85);
                        break;
                    default:
                        this.f4052g.m745c(17);
                        break;
                }
            }
            table2 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            this.f4052g.m734a(m3944a((LuaTable) table2, str), -1);
            table2 = super.getTable(ATTR_WIDGET_SET_ENABLED);
            if (table2 != LuaNil.nil) {
                this.f4052g.m750d(((Boolean) table2).booleanValue());
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
        }
        this.f4052g.m751e();
        return this.f4052g.m753f();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4052g.m743b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != null && table != LuaNil.nil) {
                this.f4052g.m737a(convertMarginsToPixels(table, this.I));
            }
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4052g.m750d(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4052g.setFocusableInTouchMode(true);
            this.f4052g.requestFocus();
            this.f4052g.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4052g.m742b(false);
            this.f4052g.setHeight(i);
            this.f4052g.m748d();
        }
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(obj, obj2);
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(gA.ATTR_WIDGET_LABEL);
            if (table == null || table == LuaNil.nil || table.equals(BuildConfig.FLAVOR)) {
                this.f4052g.m730a(H, m4483a(z));
            } else {
                this.f4052g.m730a(H, m4483a(z));
            }
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4052g.m728a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidgetInSegUIEventListener(iq iqVar, eO eOVar) {
        this.f4055j = iqVar;
        this.f4056k = eOVar;
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4052g.m736a(false);
            this.f4052g.setWidth(i);
            this.f4052g.m748d();
        }
    }

    public final String toString() {
        return "LuaLink: " + getTable(ATTR_WIDGET_ID);
    }
}
