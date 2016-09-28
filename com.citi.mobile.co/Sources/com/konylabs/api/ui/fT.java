package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import ny0k.cN;
import ny0k.cr;

public final class fT extends LuaWidget {
    public static String f3737a;
    private static String f3738d;
    private static String f3739e;
    private static String f3740f;
    private static String f3741g;
    private static String f3742h;
    private static String f3743i;
    private static String f3744j;
    private static String f3745k;
    private static String f3746l;
    private static String f3747m;
    private static String f3748n;
    private static String f3749o;
    private static String f3750p;
    private static String f3751q;
    private static String f3752r;
    private static String f3753s;
    private static String f3754t;
    private static String f3755u;
    private String f3756A;
    private int f3757B;
    private boolean f3758C;
    private C0210l f3759D;
    private OnClickListener f3760P;
    Object f3761b;
    Object f3762c;
    private C0213o f3763v;
    private int f3764w;
    private int f3765x;
    private int f3766y;
    private Vector f3767z;

    static {
        f3737a = "onclick";
        f3738d = "focuseditem";
        f3739e = "focusedindex";
        f3740f = "datasethandler";
        f3741g = "coverflowangle";
        f3742h = "coverflowdepth";
        f3743i = "view";
        f3744j = "framewidth";
        f3745k = "frameheight";
        f3746l = "spacebetweenimages";
        f3747m = "imagewhenfailed";
        f3748n = "imagewhendownloading";
        f3749o = "showarrows";
        f3750p = "rightarrowimage";
        f3751q = "leftarrowimage";
        f3752r = "msv";
        f3753s = "msd";
        f3754t = "fi";
        f3755u = "meta";
        if (KonyMain.m4057C()) {
            ATTR_WIDGET_FOCUS_SKIN = "focusSkin";
            f3737a = "onClick";
            f3738d = "focusedItem";
            f3739e = "focusedIndex";
            f3740f = "datasetHandler";
            f3741g = "coverFlowAngle";
            f3742h = "coverFlowDepth";
            f3744j = "frameWidth";
            f3745k = "frameHeight";
            f3746l = "spaceBetweenImages";
            f3747m = "imageWhenFailed";
            f3748n = "imageWhenDownloading";
            f3749o = "showArrows";
            f3750p = "rightArrowImage";
            f3751q = "leftArrowImage";
        }
    }

    public fT(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        LuaNil table;
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f3763v = null;
        this.f3764w = 0;
        this.f3765x = 0;
        this.f3766y = 0;
        this.f3767z = new Vector();
        this.f3757B = bL.f703a;
        this.f3762c = null;
        this.f3759D = new fV(this);
        this.f3760P = new fW(this);
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        if (luaTable3 != null) {
            table = luaTable3.getTable(f3743i);
            if (table != LuaNil.nil) {
                super.setTable(f3743i, table);
                String intern = ((String) table).intern();
                if (intern == "slotview") {
                    this.f3757B = bL.f704b;
                } else if (intern == "scrollview") {
                    this.f3757B = bL.f705c;
                } else if (intern == "coverflow") {
                    this.f3757B = bL.f706d;
                }
            }
            table = luaTable3.getTable(f3744j);
            if (table != LuaNil.nil) {
                super.setTable(f3744j, table);
            }
            table = luaTable3.getTable(f3745k);
            if (table != LuaNil.nil) {
                super.setTable(f3745k, table);
            }
            table = luaTable3.getTable(f3746l);
            if (table != LuaNil.nil) {
                super.setTable(f3746l, table);
            }
            table = luaTable3.getTable(f3747m);
            if (table != LuaNil.nil) {
                super.setTable(f3747m, table);
            }
            table = luaTable3.getTable(f3748n);
            if (table != LuaNil.nil) {
                super.setTable(f3748n, table);
            }
            table = luaTable3.getTable(f3743i);
            if (table != LuaNil.nil) {
                super.setTable(f3743i, table);
            }
            table = luaTable3.getTable(f3749o);
            if (table != LuaNil.nil) {
                super.setTable(f3749o, table);
            }
            table = luaTable3.getTable(f3750p);
            if (table != LuaNil.nil) {
                super.setTable(f3750p, table);
            }
            table = luaTable3.getTable(f3751q);
            if (table != LuaNil.nil) {
                super.setTable(f3751q, table);
            }
            table = luaTable3.getTable(f3752r);
            if (table != LuaNil.nil) {
                super.setTable(f3752r, table);
            }
            table = luaTable3.getTable(f3753s);
            if (table != LuaNil.nil) {
                super.setTable(f3753s, table);
            }
            table = luaTable3.getTable(f3754t);
            if (table != LuaNil.nil) {
                super.setTable(f3754t, table);
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
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        } else {
            super.setTable(ATTR_WIDGET_ISVISIBLE, Boolean.valueOf(true));
        }
        table = luaTable.getTable(f3737a);
        if (table != LuaNil.nil) {
            super.setTable(f3737a, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_HEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_HEXPAND, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_ALIGN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table);
            }
        }
    }

    private Object m4240a(Object obj) {
        String intern = ((String) obj).intern();
        if (intern == f3739e) {
            if (this.E == KONY_WIDGET_RESTORE) {
                Double d = m4244d();
                return d == null ? LuaNil.nil : d;
            } else {
                LuaNil table = super.getTable(f3739e);
                if (table == LuaNil.nil) {
                    return LuaNil.nil;
                }
                int a = cr.m2199a(((Double) table).intValue(), 1);
                return (this.f3767z.size() <= a || a < 0) ? LuaNil.nil : table;
            }
        } else if (this.f3757B == bL.f704b || intern != f3738d) {
            return super.getTable(intern);
        } else {
            if (this.E == KONY_WIDGET_RESTORE) {
                return m4243c();
            }
            LuaNil table2 = super.getTable(f3738d);
            return table2 != LuaNil.nil ? (LuaTable) table2 : LuaNil.nil;
        }
    }

    private void m4241a(dB dBVar) {
        this.f3763v.m1498b(dBVar);
        this.f3763v.m1503c(true);
    }

    private void m4242b(dB dBVar) {
        this.f3763v.m1491a(dBVar);
        this.f3763v.m1503c(false);
    }

    private LuaTable m4243c() {
        int e = this.f3763v.m1505e();
        return (e >= this.f3767z.size() || e < 0) ? null : (LuaTable) this.f3767z.elementAt(e);
    }

    private Double m4244d() {
        int a = cr.m2199a(this.f3763v.m1505e(), 1);
        return a == -1 ? null : new Double((double) a);
    }

    private void m4245e() {
        super.setTable(f3739e, LuaNil.nil);
        super.setTable(f3738d, LuaNil.nil);
    }

    public final void m4246a(int i) {
        if (i > 0 && i <= this.f3767z.size()) {
            this.f3767z.removeElementAt(i - 1);
            if (this.E == KONY_WIDGET_RESTORE) {
                this.f3763v.m1507f(i - 1);
                this.f3763v.m1508g();
                return;
            }
            m4245e();
        }
    }

    protected final void m4247a(Object obj, Object obj2) {
        C0218t c0218t = null;
        boolean z = true;
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == f3739e && obj2 != LuaNil.nil) {
                if (KonyMain.f3657e) {
                    Log.d("LuaHImageStrip", "Getting the request for focusedIndex as " + ((Double) obj2).intValue());
                }
                int a = cr.m2199a(((Double) obj2).intValue(), 0);
                if (this.f3767z.size() > a && a >= 0) {
                    this.f3763v.m1511h(a);
                }
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (KonyMain.f3657e) {
                    Log.d("LuaHImageStrip", "Getting the request for normal Skin change");
                }
                if (this.E == KONY_WIDGET_RESTORE) {
                    if (obj2 != LuaNil.nil) {
                        r0 = cN.m2139a(obj2);
                        if (r0 != null) {
                            m4242b(r0);
                        }
                    } else {
                        m4242b(null);
                    }
                }
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN) {
                if (KonyMain.f3657e) {
                    Log.d("LuaHImageStrip", "Getting the request for focus Skin change");
                }
                if (this.E == KONY_WIDGET_RESTORE) {
                    if (obj2 != LuaNil.nil) {
                        r0 = cN.m2139a(obj2);
                        if (r0 != null) {
                            m4241a(r0);
                        }
                    } else {
                        m4241a(null);
                    }
                }
            } else if (intern == f3741g && this.f3757B == bL.f706d) {
                if (obj2 != LuaNil.nil && this.E == KONY_WIDGET_RESTORE) {
                    this.f3763v.m1489a(((Double) obj2).intValue());
                }
            } else if (intern == f3742h && this.f3757B == bL.f706d && obj2 != LuaNil.nil && this.E == KONY_WIDGET_RESTORE) {
                this.f3763v.m1497b(((Double) obj2).intValue());
            }
            if (!(this.f3763v instanceof dE)) {
                if (this.f3763v instanceof aV) {
                    c0218t = (aV) this.f3763v;
                } else if (this.f3763v instanceof bl) {
                    Object obj3 = (bl) this.f3763v;
                }
                if (c0218t == null) {
                    return;
                }
                if (intern == f3740f) {
                    this.f3761b = obj2;
                    c0218t.m1562a(this.f3759D);
                } else if (intern == f3755u) {
                    Vector vector = ((LuaTable) obj2).list;
                    this.f3764w = ((Double) vector.elementAt(0)).intValue();
                    this.f3765x = ((Double) vector.elementAt(1)).intValue();
                    this.f3766y = ((Double) vector.elementAt(2)).intValue();
                    c0218t.m1564d(this.f3764w > 1);
                    if (this.f3765x >= this.f3766y) {
                        z = false;
                    }
                    c0218t.m1566e(z);
                }
            }
        }
    }

    public final void m4248a(Object[] objArr) {
        if (objArr[1] != LuaNil.nil) {
            if (objArr[2] != LuaNil.nil) {
                Vector vector = ((LuaTable) objArr[1]).list;
                this.f3756A = objArr[2].toString();
                for (int i = 0; i < vector.size(); i++) {
                    LuaTable luaTable = (LuaTable) vector.elementAt(i);
                    LuaNil table = luaTable.getTable(this.f3756A);
                    if (!(table == LuaNil.nil || table.equals(BuildConfig.FLAVOR))) {
                        this.f3767z.add(luaTable);
                        if (this.E == KONY_WIDGET_RESTORE) {
                            this.f3763v.m1495a((String) table, m3943a((LuaTable) luaTable.map.get(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG)));
                        }
                    }
                }
                if (this.E == KONY_WIDGET_RESTORE) {
                    this.f3763v.m1508g();
                } else {
                    m4245e();
                }
            } else if (KonyMain.f3659g) {
                Log.e("LuaHImageStrip", "addAll: image_url_key not specified");
            }
        }
    }

    public final void m4249b() {
        this.f3767z.clear();
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3763v.c_();
            this.f3763v.m1508g();
            return;
        }
        m4245e();
    }

    public final void m4250b(Object[] objArr) {
        if (this.f3767z.size() > 0) {
            if (objArr[1] == LuaNil.nil) {
                if (KonyMain.f3659g) {
                    Log.e("LuaHImageStrip", "setDataAt: image_url not specified");
                }
            } else if (objArr[2] != LuaNil.nil) {
                LuaTable luaTable = (LuaTable) objArr[1];
                int intValue = ((Double) objArr[2]).intValue() - 1;
                if (intValue >= 0 && intValue <= this.f3767z.size() - 1) {
                    LuaNil table = luaTable.getTable(this.f3756A);
                    if (table != LuaNil.nil && !table.equals(BuildConfig.FLAVOR)) {
                        this.f3767z.setElementAt(luaTable, intValue);
                        if (this.E == KONY_WIDGET_RESTORE) {
                            this.f3763v.m1493a((String) table, intValue);
                            this.f3763v.m1508g();
                            return;
                        }
                        m4245e();
                    }
                }
            } else if (KonyMain.f3659g) {
                Log.e("LuaHImageStrip", "setDataAt: image_position not specified");
            }
        }
    }

    public final void cleanup() {
        if (this.E == KONY_WIDGET_RESTORE) {
            Double d = m4244d();
            if (d != null) {
                super.setTable(f3739e, new Double((double) cr.m2199a(d.intValue(), 1)));
            } else {
                super.setTable(f3739e, LuaNil.nil);
            }
            if (this.f3757B != bL.f704b) {
                LuaTable c = m4243c();
                if (c != null) {
                    super.setTable(f3738d, c);
                } else {
                    super.setTable(f3738d, LuaNil.nil);
                }
            }
            this.f3763v.m1504d();
            this.f3763v = null;
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
        hashtable.put(f3739e, "number");
        hashtable.put(f3738d, "table");
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(f3755u, "table");
        hashtable.put(f3740f, "function");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4240a(obj);
        }
        Object iiVar;
        synchronized (this) {
            this.f3762c = null;
            iiVar = new ii(new fU(this, obj));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
            iiVar = this.f3762c;
            this.f3762c = null;
        }
        return iiVar;
    }

    public final String getType() {
        return "Hz Image Strip";
    }

    public final View getWidget() {
        boolean z = true;
        if (this.E == KONY_WIDGET_BACKUP) {
            C0218t c0218t;
            Object obj;
            dB a;
            this.f3763v = bL.m725a(KonyMain.getActContext(), this.f3757B);
            LuaNil table = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table != LuaNil.nil) {
                this.f3763v.a_(m3942a(((Boolean) table).booleanValue()));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                this.f3763v.m1496a(convertToScreenPixels(table, this.I, true));
            }
            table = super.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                this.f3763v.m1501b(convertToScreenPixels(table, this.I, true));
            }
            table = super.getTable(f3744j);
            if (table != LuaNil.nil) {
                this.f3763v.c_(((Double) table).intValue());
            }
            table = super.getTable(f3745k);
            if (table != LuaNil.nil) {
                this.f3763v.d_(((Double) table).intValue());
            }
            table = super.getTable(f3746l);
            if (table != LuaNil.nil) {
                this.f3763v.setSpacing(((Double) table).intValue());
            }
            table = super.getTable(f3747m);
            if (table != LuaNil.nil) {
                this.f3763v.m1492a(table.toString());
            }
            table = super.getTable(f3748n);
            if (table != LuaNil.nil) {
                this.f3763v.m1499b(table.toString());
            }
            if (this.f3757B == bL.f703a || this.f3757B == bL.f705c) {
                if (this.f3757B == bL.f703a) {
                    c0218t = (aV) this.f3763v;
                } else {
                    obj = (bl) this.f3763v;
                }
                table = super.getTable(f3749o);
                if (table != LuaNil.nil) {
                    c0218t.m1568f(((Boolean) table).booleanValue());
                }
                table = super.getTable(f3750p);
                if (table != LuaNil.nil) {
                    c0218t.m1565e(table.toString());
                }
                table = super.getTable(f3751q);
                if (table != LuaNil.nil) {
                    c0218t.m1563d(table.toString());
                }
            }
            if (this.f3757B == bL.f704b) {
                dE dEVar = (dE) this.f3763v;
                LuaNil table2 = super.getTable(f3752r);
                if (table2 != LuaNil.nil) {
                    dEVar.m2986n(((Double) table2).intValue());
                }
                table2 = super.getTable(f3753s);
                if (table2 != LuaNil.nil) {
                    dEVar.m2985m(((Double) table2).intValue());
                }
                table2 = super.getTable(f3754t);
                if (table2 != LuaNil.nil) {
                    dEVar.m2984l(((Double) table2).intValue());
                }
            }
            table = super.getTable(ATTR_WIDGET_HEXPAND);
            if (table != LuaNil.nil && ((Boolean) table).booleanValue()) {
                this.f3763v.a_(true);
            }
            table = super.getTable(ATTR_WIDGET_VEXPAND);
            if (table != LuaNil.nil && ((Boolean) table).booleanValue()) {
                this.f3763v.m1500b(true);
            }
            table = super.getTable(ATTR_WIDGET_ALIGN);
            if (table != LuaNil.nil) {
                switch (((Double) table).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f3763v.m1509g(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f3763v.m1509g(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f3763v.m1509g(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f3763v.m1509g(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f3763v.m1509g(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f3763v.m1509g(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f3763v.m1509g(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f3763v.m1509g(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f3763v.m1509g(85);
                        break;
                    default:
                        this.f3763v.m1509g(17);
                        break;
                }
            }
            Object table3 = super.getTable(ATTR_WIDGET_SKIN);
            if (table3 != LuaNil.nil) {
                a = cN.m2139a(table3);
                if (a != null) {
                    this.f3763v.m1491a(a);
                }
            }
            table3 = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table3 != LuaNil.nil) {
                a = cN.m2139a(table3);
                if (a != null) {
                    this.f3763v.m1498b(a);
                }
            }
            if (super.getTable(f3737a) != LuaNil.nil) {
                this.f3763v.m1490a(this.f3760P);
            }
            if (this.f3757B == bL.f703a || this.f3757B == bL.f705c) {
                if (this.f3757B == bL.f703a) {
                    c0218t = (aV) this.f3763v;
                } else {
                    obj = (bl) this.f3763v;
                }
                if (super.getTable(f3740f) != LuaNil.nil) {
                    c0218t.m1562a(this.f3759D);
                }
                table = super.getTable(f3755u);
                if (table != LuaNil.nil) {
                    Vector vector = ((LuaTable) table).list;
                    this.f3764w = ((Double) vector.elementAt(0)).intValue();
                    this.f3765x = ((Double) vector.elementAt(1)).intValue();
                    this.f3766y = ((Double) vector.elementAt(2)).intValue();
                    c0218t.m1564d(this.f3764w > 1);
                    if (this.f3765x >= this.f3766y) {
                        z = false;
                    }
                    c0218t.m1566e(z);
                }
            }
            this.E = KONY_WIDGET_RESTORE;
            for (int i = 0; i < this.f3767z.size(); i++) {
                LuaTable luaTable = (LuaTable) this.f3767z.elementAt(i);
                this.f3763v.m1495a(luaTable.map.get(this.f3756A).toString(), m3943a((LuaTable) luaTable.map.get(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG)));
            }
            this.f3763v.m1508g();
            if (KonyMain.f3657e) {
                Log.d("LuaHImageStrip", "Setting the widgetState as restored");
            }
            table = super.getTable(f3739e);
            if (table != LuaNil.nil) {
                int a2 = cr.m2199a(((Double) table).intValue(), 0);
                if (this.f3767z.size() > a2 && a2 >= 0) {
                    this.f3763v.m1511h(a2);
                }
            }
            if (this.f3758C) {
                setWeight();
            }
        }
        this.f3763v.a_();
        return this.f3763v.b_();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
        }
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3763v.m1506f();
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
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
            this.f3763v.a_(m3942a(z));
        }
    }

    public final void setWeight() {
        LuaNil table = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
        if (table != LuaNil.nil) {
            this.f3758C = true;
            if (this.E != KONY_WIDGET_BACKUP) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f3763v.m1488a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
    }

    public final String toString() {
        return "LuaHImageStrip: " + getTable(ATTR_WIDGET_ID);
    }
}
