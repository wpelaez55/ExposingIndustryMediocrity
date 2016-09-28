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
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import ny0k.cN;
import ny0k.cr;

public final class fs extends LuaWidget {
    public static String f3961a;
    private static String f3962c;
    private static String f3963d;
    private static String f3964e;
    private static String f3965f;
    private static String f3966g;
    private static String f3967h;
    private static String f3968i;
    private static String f3969j;
    private static String f3970k;
    private static String f3971l;
    private static String f3972m;
    private static String f3973n;
    private static String f3974o;
    private static String f3975p;
    private static String f3976q;
    private static String f3977r;
    private static String f3978s;
    private static String f3979t;
    private static String f3980u;
    private static String f3981v;
    private static String f3982w;
    private static String f3983x;
    private ArrayList f3984A;
    private aA f3985B;
    private fu f3986C;
    Object f3987b;
    private av f3988y;
    private aw f3989z;

    static {
        f3962c = "headerskin";
        f3963d = "rownormalskin";
        f3964e = "rowfocusskin";
        f3965f = "rowalternateskin";
        f3966g = "showcolumnheaders";
        f3967h = "columnheadersconfig";
        f3961a = "onrowselected";
        f3968i = "ismultiselect";
        f3969j = "data";
        f3970k = "contentalignment";
        f3971l = "gridlinecolor";
        f3972m = "selecteditem";
        f3973n = "selectedindex";
        f3974o = "selecteditems";
        f3975p = "selectedindices";
        f3976q = "rowcount";
        f3977r = "columnid";
        f3978s = "columntype";
        f3979t = "columnheadertext";
        f3980u = "columnwidthinpercentage";
        f3981v = "iscolumnsortable";
        f3982w = "columnonclick";
        f3983x = "columncontentalignment";
        if (KonyMain.m4057C()) {
            f3962c = "headerSkin";
            f3963d = "rowNormalSkin";
            f3964e = "rowFocusSkin";
            f3965f = "rowAlternateSkin";
            f3966g = "showColumnHeaders";
            f3967h = "columnHeadersConfig";
            f3961a = "onRowSelected";
            f3968i = "isMultiSelect";
            f3969j = "data";
            f3970k = "contentAlignment";
            f3971l = "gridlineColor";
            f3972m = "selectedItem";
            f3973n = "selectedIndex";
            f3974o = "selectedItems";
            f3975p = "selectedIndices";
            f3976q = "rowCount";
            f3977r = "columnID";
            f3978s = "columnType";
            f3979t = "columnHeaderText";
            f3980u = "columnWidthInPercentage";
            f3981v = "isColumnSortable";
            f3982w = "columnOnClick";
            f3983x = "columnContentAlignment";
        }
    }

    public fs(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f3988y = null;
        this.f3984A = new ArrayList();
        this.f3985B = null;
        this.f3986C = null;
        this.f3987b = null;
        super.setTable(ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        super.setTable(ATTR_WIDGET_ISVISIBLE, luaTable.getTable(ATTR_WIDGET_ISVISIBLE));
        super.setTable(f3962c, luaTable.getTable(f3962c));
        super.setTable(f3963d, luaTable.getTable(f3963d));
        super.setTable(f3964e, luaTable.getTable(f3964e));
        super.setTable(f3965f, luaTable.getTable(f3965f));
        super.setTable(f3966g, luaTable.getTable(f3966g));
        super.setTable(f3967h, luaTable.getTable(f3967h));
        super.setTable(f3961a, luaTable.getTable(f3961a));
        super.setTable(f3968i, luaTable.getTable(f3968i) != LuaNil.nil ? luaTable.getTable(f3968i) : Boolean.valueOf(false));
        super.setTable(f3969j, luaTable.getTable(f3969j));
        if (super.getTable(f3969j) != LuaNil.nil) {
            m4371b(new Object[]{this, super.getTable(f3969j)});
        }
        if (luaTable2 != null) {
            super.setTable(ATTR_WIDGET_ALIGNMENT, luaTable2.getTable(ATTR_WIDGET_ALIGNMENT));
            super.setTable(f3970k, luaTable2.getTable(f3970k));
            super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT));
            super.setTable(ATTR_WIDGET_PADDING, luaTable2.getTable(ATTR_WIDGET_PADDING));
            super.setTable(ATTR_WIDGET_MARGIN, luaTable2.getTable(ATTR_WIDGET_MARGIN));
            super.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, luaTable2.getTable(ATTR_WIDGET_PADDING_IN_PIXEL));
            super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL));
        }
        if (luaTable3 != null) {
            super.setTable(f3971l, luaTable3.getTable(f3971l));
            super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, luaTable3);
        }
    }

    static /* synthetic */ Object m4360a(fs fsVar, String str) {
        LuaNil table = super.getTable(f3967h);
        if (table != LuaNil.nil) {
            Vector vector = ((LuaTable) table).list;
            int size = vector.size();
            for (int i = 0; i < size; i++) {
                LuaTable luaTable = (LuaTable) vector.get(i);
                if (luaTable.getTable(f3977r).equals(str)) {
                    return luaTable.getTable(f3982w);
                }
            }
        }
        return null;
    }

    private Object m4361a(Object obj) {
        int i = 0;
        String intern = ((String) obj).intern();
        if (intern == "focuseditem" || intern == f3972m) {
            if (this.E == KONY_WIDGET_RESTORE) {
                i = this.f3988y.m631g();
                return i == -1 ? LuaNil.nil : this.f3984A.get(i);
            } else {
                if (KonyMain.f3658f) {
                    Log.w("LuaDataGrid", "getTable of PROP_DATAGRID_FOCUSED_ITEM or PROP_DATAGRID_SELECTED_ITEM called in invalid state");
                }
                return LuaNil.nil;
            }
        } else if (intern == "focusedindex" || intern == f3973n) {
            if (this.E == KONY_WIDGET_RESTORE) {
                int g = this.f3988y.m631g();
                return g == -1 ? LuaNil.nil : new Double((double) cr.m2199a(g, 1));
            } else {
                if (KonyMain.f3658f) {
                    Log.w("LuaDataGrid", "getTable of PROP_DATAGRID_FOCUSED_INDEX or PROP_DATAGRID_SELECTED_INDEX called in invalid state");
                }
                return LuaNil.nil;
            }
        } else if (intern == f3975p) {
            if (this.E == KONY_WIDGET_RESTORE) {
                r2 = this.f3988y.m633h();
                if (r2 == null || r2.length == 0) {
                    return LuaNil.nil;
                }
                r1 = new LuaTable(r2.length, 0);
                r3 = r1.list;
                while (i < r2.length) {
                    r3.add(new Double((double) cr.m2199a(r2[i], 1)));
                    i++;
                }
                return r1;
            }
            if (KonyMain.f3658f) {
                Log.w("LuaDataGrid", "getTable of PROP_DATAGRID_SELECTED_INDICES called in invalid state");
            }
            return LuaNil.nil;
        } else if (intern != f3974o) {
            return intern == f3976q ? this.E == KONY_WIDGET_RESTORE ? new Double((double) this.f3988y.m619c()) : new Double((double) this.f3984A.size()) : intern == f3969j ? this.f3984A : super.getTable(intern);
        } else {
            if (this.E == KONY_WIDGET_RESTORE) {
                r2 = this.f3988y.m633h();
                if (r2 == null || r2.length == 0) {
                    return LuaNil.nil;
                }
                r1 = new LuaTable(r2.length, 0);
                r3 = r1.list;
                while (i < r2.length) {
                    r3.add(this.f3984A.get(r2[i]));
                    i++;
                }
                return r1;
            }
            if (KonyMain.f3658f) {
                Log.w("LuaDataGrid", "getTable of PROP_DATAGRID_SELECTED_ITEMS called in invalid state");
            }
            return LuaNil.nil;
        }
    }

    private void m4362a(LuaTable luaTable, int i) {
        if (i == -1) {
            this.f3984A.add(luaTable);
        } else {
            this.f3984A.add(i, luaTable);
        }
        if (this.E == KONY_WIDGET_RESTORE) {
            m4364b(luaTable, i);
        }
    }

    private void m4363a(LuaTable luaTable, aB aBVar) {
        if (aBVar != null) {
            for (int i = 0; i < this.f3989z.f616a.size(); i++) {
                String a = ((ay) this.f3989z.f616a.get(i)).m643a();
                LuaNil table = luaTable.getTable(a);
                if (table != LuaNil.nil) {
                    aBVar.m422a(a, table.toString());
                }
            }
            LuaNil table2 = luaTable.getTable("metainfo");
            if (table2 != LuaNil.nil) {
                LuaTable luaTable2 = (LuaTable) table2;
                Enumeration keys = luaTable2.map.keys();
                while (keys.hasMoreElements()) {
                    String intern = ((String) keys.nextElement()).intern();
                    Object table3 = luaTable2.getTable(intern);
                    if (intern == f3963d) {
                        if (!(table3 == LuaNil.nil || table3 == null)) {
                            dB a2 = cN.m2139a(table3);
                            if (a2 != null) {
                                aBVar.m420a(a2);
                            }
                        }
                    } else if (!(!intern.contains("_skin") || table3 == LuaNil.nil || table3 == null)) {
                        dB a3 = cN.m2139a(table3);
                        if (a3 != null) {
                            aBVar.m421a(intern.substring(0, intern.indexOf("_skin")), a3);
                        }
                    }
                }
            }
        }
    }

    private void m4364b(LuaTable luaTable, int i) {
        av avVar = this.f3988y;
        avVar.getClass();
        aB aBVar = new aB(avVar, this.f3989z);
        m4363a(luaTable, aBVar);
        if (this.E != KONY_WIDGET_RESTORE) {
            return;
        }
        if (i == -1) {
            this.f3988y.m607a(aBVar);
        } else {
            this.f3988y.m608a(aBVar, i);
        }
    }

    public final void m4365a(int i) {
        int a = cr.m2199a(i, 0);
        if (a >= 0 && a <= this.f3984A.size() - 1) {
            if (this.E == KONY_WIDGET_RESTORE) {
                this.f3988y.m602a(a);
            }
            this.f3984A.remove(a);
        }
    }

    public final void m4366a(int i, LuaTable luaTable) {
        if (super.getTable(f3967h) == LuaNil.nil) {
            throw new LuaError(f3967h + " not set for the Datagrid widget " + toString(), 9999);
        }
        int a = cr.m2199a(i, 0);
        if (a >= 0 && a <= this.f3984A.size() - 1 && luaTable.map.size() != 0) {
            this.f3984A.set(a, luaTable);
            if (this.E == KONY_WIDGET_RESTORE) {
                av avVar = this.f3988y;
                avVar.getClass();
                aB aBVar = new aB(avVar, this.f3989z);
                m4363a(luaTable, aBVar);
                this.f3988y.m603a(a, aBVar);
            }
        }
    }

    protected final void m4367a(Object obj, Object obj2) {
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            dB a;
            if (intern == f3963d) {
                if (obj2 != LuaNil.nil) {
                    a = cN.m2139a(obj2);
                    if (a != null) {
                        this.f3988y.m616b(a);
                        return;
                    }
                    return;
                }
                this.f3988y.m616b(null);
            } else if (intern == f3964e) {
                if (obj2 != LuaNil.nil) {
                    a = cN.m2139a(obj2);
                    if (a != null) {
                        this.f3988y.m610a(a);
                        return;
                    }
                    return;
                }
                this.f3988y.m610a(null);
            } else if (intern == f3962c) {
                if (obj2 != LuaNil.nil) {
                    a = cN.m2139a(obj2);
                    if (a != null) {
                        this.f3989z.m637a(a);
                        return;
                    }
                    return;
                }
                this.f3989z.m637a(null);
            } else if (intern == f3965f) {
                if (obj2 != LuaNil.nil) {
                    a = cN.m2139a(obj2);
                    if (a != null) {
                        this.f3988y.m621c(a);
                        return;
                    }
                    return;
                }
                this.f3988y.m621c(null);
            } else if (intern == f3971l) {
                this.f3988y.m615b(hp.m3351b((String) obj2));
            } else if (intern == "gridlinestyle") {
                this.f3988y.m611a((String) obj2);
            } else if (intern == ATTR_WIDGET_ISVISIBLE) {
                this.f3988y.m620c(m3942a(((Boolean) obj2).booleanValue()));
            } else if (intern == f3966g) {
                this.f3989z.m638a(((Boolean) obj2).booleanValue());
            } else if (intern == f3961a) {
                if (this.f3986C == null) {
                    this.f3986C = new fu(this);
                }
                this.f3988y.m606a(this.f3986C);
            } else if (intern == f3968i) {
                this.f3988y.m622c((obj2 == LuaNil.nil ? Boolean.valueOf(false) : obj2).booleanValue());
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT) {
                if (this.G) {
                    setWeight();
                    this.f3988y.m626e();
                    ((eO) this.I).m4238t();
                }
            } else if (intern == ATTR_WIDGET_MARGIN) {
                this.f3988y.m613a(convertMarginsToPixels(obj2, this.I));
                this.f3988y.m626e();
            } else if (intern == ATTR_WIDGET_PADDING) {
                this.f3988y.m618b(convertPaddingToPixels(obj2, this.I));
                this.f3988y.m600a();
            } else if (intern == f3969j) {
                m4371b(new Object[]{this, obj2});
            }
        }
    }

    public final void m4368a(Object[] objArr) {
        if (super.getTable(f3967h) == LuaNil.nil) {
            throw new LuaError(f3967h + " not set for the Datagrid widget " + toString(), 9999);
        } else if (objArr[1] != LuaNil.nil) {
            Vector vector = ((LuaTable) objArr[1]).list;
            for (int i = 0; i < vector.size(); i++) {
                m4362a((LuaTable) vector.elementAt(i), -1);
            }
        }
    }

    public final void m4369b() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3988y.m614b();
        }
        this.f3984A.clear();
    }

    public final void m4370b(int i, LuaTable luaTable) {
        int i2 = 0;
        int a = cr.m2199a(i, 0);
        if (a >= 0) {
            i2 = a;
        }
        if (i2 > this.f3984A.size()) {
            i2 = this.f3984A.size();
        }
        if (super.getTable(f3967h) == LuaNil.nil) {
            throw new LuaError(f3967h + " not set for the Datagrid widget " + toString(), 9999);
        }
        m4362a(luaTable, i2);
    }

    public final void m4371b(Object[] objArr) {
        m4369b();
        m4368a(objArr);
    }

    public final void m4372c(Object[] objArr) {
        int intValue = ((Double) objArr[1]).intValue();
        String obj = objArr[2].toString();
        int a = cr.m2199a(intValue, 0);
        if (a >= 0 && a <= this.f3984A.size() - 1) {
            ((LuaTable) this.f3984A.get(a)).setTable(obj, objArr[3]);
            if (this.E != KONY_WIDGET_RESTORE) {
                return;
            }
            if (objArr[3] != LuaNil.nil) {
                this.f3988y.m605a(a, obj, objArr[3].toString());
            } else {
                this.f3988y.m605a(a, obj, BuildConfig.FLAVOR);
            }
        }
    }

    public final void cleanup() {
        if (this.f3988y != null) {
            super.setTable(f3976q, new Double((double) this.f3988y.m619c()));
            this.f3988y.m629f();
            this.f3988y = null;
        }
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        return null;
    }

    public final void m4373d(Object[] objArr) {
        int a = cr.m2199a(((Double) objArr[1]).intValue(), 0);
        String obj = objArr[2].toString();
        if (a >= 0 && a <= this.f3984A.size() - 1) {
            LuaNil table = ((LuaTable) this.f3984A.get(a)).getTable("metainfo");
            if (table != LuaNil.nil) {
                ((LuaTable) table).setTable(obj + "_skin", objArr[3]);
            } else if (objArr[3] != LuaNil.nil) {
                LuaTable luaTable = new LuaTable(2, 0);
                luaTable.setTable(obj + "_skin", objArr[3]);
                ((LuaTable) this.f3984A.get(a)).setTable("metainfo", luaTable);
            }
            if (this.E == KONY_WIDGET_RESTORE) {
                this.f3988y.m604a(a, obj, objArr[3] != LuaNil.nil ? cN.m2139a(objArr[3]) : null);
            }
        }
    }

    public final void m4374e(Object[] objArr) {
        if (objArr[1] != null && this.E == KONY_WIDGET_RESTORE) {
            this.f3988y.m625d(((Boolean) objArr[1]).booleanValue());
        }
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
        hashtable.put(f3976q, "number");
        hashtable.put(f3975p, "table");
        hashtable.put(f3974o, "table");
        hashtable.put(f3973n, "table");
        hashtable.put(f3972m, "table");
        hashtable.put("focusedindex", "table");
        hashtable.put("focuseditem", "table");
        hashtable.put(f3963d, "table");
        hashtable.put(f3965f, "table");
        hashtable.put(f3962c, "table");
        hashtable.put(f3964e, "table");
        hashtable.put(f3971l, "string");
        hashtable.put("gridlinestyle", "string");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4361a(obj);
        }
        Object iiVar;
        synchronized (this) {
            this.f3987b = null;
            iiVar = new ii(new ft(this, obj));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
            iiVar = this.f3987b;
            this.f3987b = null;
        }
        return iiVar;
    }

    public final String getType() {
        return "DataGrid";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            this.f3988y = new av(KonyMain.getActContext());
            av avVar = this.f3988y;
            avVar.getClass();
            this.f3989z = new aw(avVar);
            Object table = super.getTable(f3963d);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f3988y.m616b(a);
                }
            }
            table = super.getTable(f3964e);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f3988y.m610a(a);
                }
            }
            table = super.getTable(f3962c);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f3989z.m637a(a);
                }
            }
            table = super.getTable(f3965f);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f3988y.m621c(a);
                }
            }
            LuaNil table2 = super.getTable(f3970k);
            if (table2 != LuaNil.nil) {
                switch (((Double) table2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f3988y.m627e(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f3988y.m627e(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f3988y.m627e(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f3988y.m627e(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f3988y.m627e(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f3988y.m627e(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f3988y.m627e(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f3988y.m627e(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f3988y.m627e(85);
                        break;
                    default:
                        this.f3988y.m627e(17);
                        break;
                }
            }
            table2 = super.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table2 != LuaNil.nil) {
                switch (((Double) table2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f3988y.m624d(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f3988y.m624d(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f3988y.m624d(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f3988y.m624d(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f3988y.m624d(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f3988y.m624d(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f3988y.m624d(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f3988y.m624d(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f3988y.m624d(85);
                        break;
                    default:
                        this.f3988y.m624d(17);
                        break;
                }
            }
            if (super.getTable(f3967h) != LuaNil.nil) {
                table2 = super.getTable(f3967h);
                if (table2 != LuaNil.nil) {
                    LuaTable luaTable = (LuaTable) table2;
                    int size = luaTable.list.size();
                    for (int i = 0; i < size; i++) {
                        ay ayVar;
                        LuaTable luaTable2 = (LuaTable) luaTable.list.get(i);
                        LuaNil table3 = luaTable2.getTable(f3978s);
                        av avVar2;
                        if (table3 == LuaNil.nil || table3.equals("text")) {
                            avVar2 = this.f3988y;
                            avVar2.getClass();
                            ayVar = new ay(avVar2, az.TEXT);
                        } else if (table3.equals("image")) {
                            avVar2 = this.f3988y;
                            avVar2.getClass();
                            ayVar = new ay(avVar2, az.IMAGE);
                        } else {
                            ayVar = null;
                        }
                        if (ayVar != null) {
                            ayVar.m645a(luaTable2.getTable(f3977r).toString());
                            LuaNil table4 = luaTable2.getTable(f3979t);
                            if (table4 != LuaNil.nil) {
                                ayVar.m648b(table4.toString());
                            }
                            table4 = luaTable2.getTable(f3980u);
                            if (table4 != LuaNil.nil) {
                                ayVar.m644a(((Double) table4).intValue());
                            }
                            table4 = luaTable2.getTable(f3981v);
                            if (table4 != LuaNil.nil) {
                                if (table4 instanceof String) {
                                    Boolean.parseBoolean((String) table4);
                                } else {
                                    ((Boolean) table4).booleanValue();
                                }
                            }
                            if (luaTable2.getTable(f3982w) != LuaNil.nil) {
                                if (this.f3985B == null) {
                                    this.f3985B = new aA(this);
                                }
                                ayVar.f626a = this.f3985B;
                            }
                            LuaNil table5 = luaTable2.getTable(f3983x);
                            if (table5 != LuaNil.nil) {
                                switch (((Double) table5).intValue()) {
                                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                        ayVar.m647b(51);
                                        break;
                                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                                        ayVar.m647b(49);
                                        break;
                                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                                        ayVar.m647b(53);
                                        break;
                                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                                        ayVar.m647b(19);
                                        break;
                                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                                        ayVar.m647b(17);
                                        break;
                                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                                        ayVar.m647b(21);
                                        break;
                                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                                        ayVar.m647b(83);
                                        break;
                                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                                        ayVar.m647b(81);
                                        break;
                                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                                        ayVar.m647b(85);
                                        break;
                                    default:
                                        ayVar.m647b(51);
                                        break;
                                }
                            }
                            this.f3989z.m636a(ayVar);
                        }
                    }
                }
            }
            table2 = super.getTable(f3966g);
            if (table2 != LuaNil.nil) {
                this.f3989z.m638a(((Boolean) table2).booleanValue());
            }
            if (super.getTable(f3961a) != LuaNil.nil) {
                if (this.f3986C == null) {
                    this.f3986C = new fu(this);
                }
                this.f3988y.m606a(this.f3986C);
            }
            table2 = super.getTable(f3968i);
            if (table2 != LuaNil.nil) {
                this.f3988y.m622c(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table2 != LuaNil.nil) {
                this.f3988y.m620c(m3942a(((Boolean) table2).booleanValue()));
            }
            table2 = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (!(table2 == LuaNil.nil || ((Double) table2).intValue() == 0)) {
                table2 = super.getTable(ATTR_WIDGET_HEXPAND);
                if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                    this.f3988y.m612a(true);
                }
            }
            table2 = super.getTable(f3971l);
            if (table2 != LuaNil.nil) {
                this.f3988y.m615b(hp.m3351b((String) table2));
            }
            table2 = super.getTable("gridlinestyle");
            if (table2 != LuaNil.nil) {
                this.f3988y.m611a((String) table2);
            }
            table2 = super.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                this.f3988y.m613a(convertMarginsToPixels(table2, this.I));
            }
            table2 = super.getTable(ATTR_WIDGET_PADDING);
            if (table2 != LuaNil.nil) {
                this.f3988y.m618b(convertPaddingToPixels(table2, this.I));
            }
            table2 = super.getTable(ATTR_WIDGET_HEXPAND);
            if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                this.f3988y.m612a(true);
            }
            table2 = super.getTable(ATTR_WIDGET_VEXPAND);
            if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                this.f3988y.m617b(true);
            }
            this.f3988y.m609a(this.f3989z);
            this.E = KONY_WIDGET_RESTORE;
            int size2 = this.f3984A.size();
            for (int i2 = 0; i2 < size2; i2++) {
                m4364b((LuaTable) this.f3984A.get(i2), i2);
            }
            if (this.G) {
                setWeight();
            }
        }
        this.f3988y.m623d();
        return this.f3988y;
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f3988y.m618b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (!(table == null || table == LuaNil.nil)) {
                this.f3988y.m613a(convertMarginsToPixels(table, this.I));
            }
            av avVar = this.f3988y;
            av.m598i();
        }
    }

    public final void setEnabled(boolean z) {
        this.F = Boolean.valueOf(z);
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3988y.m628e(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3988y.setFocusableInTouchMode(true);
            this.f3988y.requestFocus();
            this.f3988y.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3988y.m617b(false);
            this.f3988y.m630f(i);
            this.f3988y.m626e();
        }
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(obj, obj2);
        }
    }

    public final void setVisibility(boolean z) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3988y.m620c(m3942a(z));
        }
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f3988y.m601a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3988y.m612a(false);
            this.f3988y.m632g(i);
            this.f3988y.m626e();
        }
    }
}
