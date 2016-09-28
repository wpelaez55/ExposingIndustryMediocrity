package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import ny0k.cN;
import ny0k.cr;

public final class fX extends LuaWidget {
    private static String f3768A;
    private static String f3769B;
    private static String f3770C;
    private static String f3771D;
    private static String f3772P;
    private static String f3773Q;
    private static String f3774R;
    private static String f3775S;
    private static String f3776T;
    public static String f3777a;
    private static int f3778c;
    private static int f3779d;
    private static int f3780e;
    private static int f3781f;
    private static String f3782g;
    private static String f3783h;
    private static String f3784i;
    private static String f3785j;
    private static String f3786k;
    private static String f3787l;
    private static String f3788m;
    private static String f3789n;
    private static String f3790o;
    private static String f3791p;
    private static String f3792q;
    private static String f3793r;
    private static String f3794s;
    private static String f3795t;
    private static String f3796u;
    private static String f3797v;
    private static String f3798w;
    private static String f3799x;
    private static String f3800y;
    private static String f3801z;
    private C0213o f3802U;
    private int f3803V;
    private int f3804W;
    private int f3805X;
    private Vector f3806Y;
    private String f3807Z;
    private int aa;
    private boolean ab;
    private C0210l ac;
    private OnClickListener ad;
    Object f3808b;

    static {
        f3778c = 1;
        f3779d = 2;
        f3780e = 3;
        f3781f = 4;
        f3777a = "onselection";
        f3782g = "selecteditem";
        f3783h = "selectedindex";
        f3784i = "datasethandler";
        f3785j = "coverflowangle";
        f3786k = "coverflowdepth";
        f3787l = "projectionangle";
        f3788m = "imageitemrotationangle";
        f3789n = "iscircular";
        f3790o = "coverflowconfig";
        f3791p = "slotviewconfig";
        f3792q = "arrowconfig";
        f3793r = "viewtype";
        f3794s = "referencewidth";
        f3795t = "referenceheight";
        f3796u = "spacebetweenimages";
        f3797v = "imagewhenfailed";
        f3798w = "imagewhiledownloading";
        f3799x = "showarrows";
        f3800y = "rightarrowimage";
        f3801z = "leftarrowimage";
        f3768A = "rightarrowfocusimage";
        f3769B = "leftarrowfocusimage";
        f3770C = "flingvelocity";
        f3771D = "scrolldistance";
        f3772P = "flipinterval";
        f3773Q = "meta";
        f3774R = "data";
        f3775S = "viewconfig";
        f3776T = "imagescalemode";
        if (KonyMain.m4057C()) {
            f3793r = "viewType";
            ATTR_WIDGET_FOCUS_SKIN = "focusSkin";
            f3777a = "onSelection";
            f3782g = "selectedItem";
            f3783h = "selectedIndex";
            f3784i = "datasetHandler";
            f3785j = "coverflowAngle";
            f3786k = "coverflowDepth";
            f3787l = "projectionAngle";
            f3788m = "imageItemRotationAngle";
            f3789n = "isCircular";
            f3794s = "referenceWidth";
            f3795t = "referenceHeight";
            f3796u = "spaceBetweenImages";
            f3797v = "imageWhenFailed";
            f3798w = "imageWhileDownloading";
            f3799x = "showArrows";
            f3800y = "rightArrowImage";
            f3801z = "leftArrowImage";
            f3775S = "viewConfig";
            f3790o = "coverflowConfig";
            f3791p = "slotviewConfig";
            f3792q = "arrowConfig";
            f3768A = "rightArrowFocusImage";
            f3769B = "leftArrowFocusImage";
            f3776T = "imageScaleMode";
            f3770C = "flingVelocity";
            f3771D = "scrollDistance";
            f3772P = "flipInterval";
        }
    }

    public fX(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        LuaNil table;
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f3802U = null;
        this.f3803V = 0;
        this.f3804W = 0;
        this.f3805X = 0;
        this.f3806Y = new Vector();
        this.aa = f3778c;
        this.f3808b = null;
        this.ac = new fZ(this);
        this.ad = new ga(this);
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table2 = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table2 != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table2);
        }
        table2 = luaTable.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table2 != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, table2);
        }
        table2 = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table2 != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table2);
        } else {
            super.setTable(ATTR_WIDGET_ISVISIBLE, Boolean.valueOf(true));
        }
        table2 = luaTable.getTable(f3783h);
        if (table2 != LuaNil.nil) {
            super.setTable(f3783h, table2);
        }
        table2 = luaTable.getTable(f3782g);
        if (table2 != LuaNil.nil) {
            super.setTable(f3782g, table2);
        }
        table2 = luaTable.getTable(f3797v);
        if (table2 != LuaNil.nil) {
            super.setTable(f3797v, table2);
        }
        table2 = luaTable.getTable(f3798w);
        if (table2 != LuaNil.nil) {
            super.setTable(f3798w, table2);
        }
        table2 = luaTable.getTable(f3796u);
        if (table2 != LuaNil.nil) {
            super.setTable(f3796u, table2);
        }
        table2 = luaTable.getTable(f3777a);
        if (table2 != LuaNil.nil) {
            super.setTable(f3777a, table2);
        }
        table2 = luaTable.getTable(f3793r);
        if (table2 != LuaNil.nil) {
            this.aa = ((Double) table2).intValue();
        }
        table2 = luaTable.getTable(f3775S);
        if (table2 != LuaNil.nil) {
            super.setTable(f3775S, table2);
            table = ((LuaTable) table2).getTable(f3791p);
            if (table != LuaNil.nil) {
                table2 = ((LuaTable) table).getTable(f3770C);
                if (table2 != LuaNil.nil) {
                    super.setTable(f3770C, table2);
                }
                table2 = ((LuaTable) table).getTable(f3771D);
                if (table2 != LuaNil.nil) {
                    super.setTable(f3771D, table2);
                }
                table2 = ((LuaTable) table).getTable(f3772P);
                if (table2 != LuaNil.nil) {
                    super.setTable(f3772P, table2);
                }
            }
        }
        table2 = luaTable.getTable(f3799x);
        if (table2 != LuaNil.nil) {
            super.setTable(f3799x, table2);
        }
        table = luaTable.getTable(f3792q);
        if (table != LuaNil.nil) {
            super.setTable(f3792q, table);
            table2 = ((LuaTable) table).getTable(f3801z);
            if (table2 != LuaNil.nil) {
                super.setTable(f3801z, table2);
            }
            table2 = ((LuaTable) table).getTable(f3800y);
            if (table2 != LuaNil.nil) {
                super.setTable(f3800y, table2);
            }
            table2 = ((LuaTable) table).getTable(f3769B);
            if (table2 != LuaNil.nil) {
                super.setTable(f3769B, table2);
            }
            table2 = ((LuaTable) table).getTable(f3768A);
            if (table2 != LuaNil.nil) {
                super.setTable(f3768A, table2);
            }
        }
        table2 = luaTable.getTable(f3774R);
        if (table2 != LuaNil.nil) {
            m4258d(((LuaTable) table2).getArrayValues());
        }
        table2 = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table2 != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table2);
        }
        if (luaTable2 != null) {
            table2 = luaTable2.getTable(ATTR_WIDGET_HEXPAND);
            if (table2 != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_HEXPAND, table2);
            }
            table2 = luaTable2.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table2 != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGNMENT, table2);
            }
            table2 = luaTable2.getTable(ATTR_WIDGET_PADDING);
            if (table2 != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING, table2);
            }
            table2 = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table2);
            }
            table2 = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table2 != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table2);
            }
            table2 = luaTable2.getTable(ATTR_WIDGET_PADDING_IN_PIXEL);
            if (table2 != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, table2);
            }
            table2 = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table2 != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table2);
            }
            table2 = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table2 != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table2);
            }
            table2 = luaTable2.getTable(f3794s);
            if (table2 != LuaNil.nil) {
                super.setTable(f3794s, table2);
            }
            table2 = luaTable2.getTable(f3795t);
            if (table2 != LuaNil.nil) {
                super.setTable(f3795t, table2);
            }
            table2 = luaTable2.getTable(f3776T);
            if (table2 != LuaNil.nil) {
                super.setTable(f3776T, table2);
            }
        }
    }

    private Object m4252a(Object obj) {
        String intern = ((String) obj).intern();
        if (intern == f3783h) {
            if (this.E == KONY_WIDGET_RESTORE) {
                Double f = m4260f();
                return f == null ? LuaNil.nil : f;
            } else {
                LuaNil table = super.getTable(f3783h);
                if (table == LuaNil.nil) {
                    return LuaNil.nil;
                }
                int a = cr.m2199a(((Double) table).intValue(), 1);
                return (this.f3806Y.size() <= a || a < 0) ? LuaNil.nil : table;
            }
        } else if (this.aa == f3779d || intern != f3782g) {
            return super.getTable(intern);
        } else {
            if (this.E == KONY_WIDGET_RESTORE) {
                return m4259e();
            }
            LuaNil table2 = super.getTable(f3782g);
            return table2 != LuaNil.nil ? (LuaTable) table2 : LuaNil.nil;
        }
    }

    private void m4253a(dB dBVar) {
        this.f3802U.m1498b(dBVar);
        this.f3802U.m1503c(true);
    }

    private void m4254b(dB dBVar) {
        this.f3802U.m1491a(dBVar);
        this.f3802U.m1503c(false);
    }

    private void m4255b(LuaTable luaTable) {
        aq aqVar = (aq) this.f3802U;
        LuaNil table = luaTable.getTable(f3788m);
        if (table != LuaNil.nil) {
            aqVar.m1398d(((Double) table).intValue());
        } else {
            table = luaTable.getTable(f3785j);
            if (table != LuaNil.nil) {
                aqVar.m1398d(((Double) table).intValue());
            } else {
                aqVar.m1390a(60, true);
            }
        }
        table = luaTable.getTable(f3786k);
        if (table != LuaNil.nil) {
            aqVar.m1394b(((Double) table).intValue());
        }
        table = luaTable.getTable(f3787l);
        if (table != LuaNil.nil) {
            aqVar.m1396c(((Double) table).intValue());
        } else {
            aqVar.m1396c(60);
        }
        table = luaTable.getTable(f3789n);
        if (table != LuaNil.nil) {
            aqVar.m1393a(((Boolean) table).booleanValue());
        } else {
            aqVar.m1393a(false);
        }
        aqVar.m2651g();
    }

    private void m4256c() {
        C0218t c0218t;
        dB a;
        boolean z = true;
        if (this.aa == f3779d) {
            this.f3802U = new dH(KonyMain.getActContext());
        } else if (this.aa == f3778c) {
            this.f3802U = new bd(KonyMain.getActContext());
        } else if (this.aa != f3781f) {
            this.f3802U = new bp(KonyMain.getActContext());
        } else if (KonyMain.f3656d >= 7) {
            this.f3802U = new aq(KonyMain.getActContext());
        } else {
            this.f3802U = new bd(KonyMain.getActContext());
            ((bd) this.f3802U).m2727l(f3781f);
        }
        LuaNil table = super.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            this.f3802U.a_(m3942a(((Boolean) table).booleanValue()));
        }
        table = super.getTable(f3794s);
        if (table != LuaNil.nil) {
            this.f3802U.c_(((Double) table).intValue());
        }
        table = super.getTable(f3795t);
        if (table != LuaNil.nil) {
            this.f3802U.d_(((Double) table).intValue());
        }
        table = super.getTable(f3796u);
        if (table != LuaNil.nil) {
            this.f3802U.setSpacing(((Double) table).intValue());
        }
        table = super.getTable(f3797v);
        if (table != LuaNil.nil) {
            this.f3802U.m1492a(table.toString());
        }
        table = super.getTable(f3798w);
        if (table != LuaNil.nil) {
            this.f3802U.m1499b(table.toString());
        }
        if (this.aa == f3778c || this.aa == f3780e) {
            if (this.aa == f3778c) {
                c0218t = (bd) this.f3802U;
            } else {
                Object obj = (bp) this.f3802U;
            }
            table = super.getTable(f3799x);
            if (table != LuaNil.nil) {
                c0218t.m1568f(((Boolean) table).booleanValue());
            }
            table = super.getTable(f3800y);
            if (table != LuaNil.nil) {
                c0218t.m1565e(table.toString());
            }
            table = super.getTable(f3801z);
            if (table != LuaNil.nil) {
                c0218t.m1563d(table.toString());
            }
            table = super.getTable(f3768A);
            if (table != LuaNil.nil) {
                c0218t.m1569g(table.toString());
            }
            table = super.getTable(f3769B);
            if (table != LuaNil.nil) {
                c0218t.m1567f(table.toString());
            }
        }
        table = super.getTable(f3776T);
        if (table != LuaNil.nil) {
            this.f3802U.m1512i(((Double) table).intValue());
        }
        if (this.aa == f3779d) {
            dH dHVar = (dH) this.f3802U;
            LuaNil table2 = super.getTable(f3770C);
            if (table2 != LuaNil.nil) {
                dHVar.m3026n(((Double) table2).intValue());
            }
            table2 = super.getTable(f3771D);
            if (table2 != LuaNil.nil) {
                dHVar.m3025m(((Double) table2).intValue());
            }
            table2 = super.getTable(f3772P);
            if (table2 != LuaNil.nil) {
                dHVar.m3024l(((Double) table2).intValue());
            }
        } else if (this.aa == f3781f) {
            table = super.getTable(f3775S);
            if (table != LuaNil.nil) {
                table = ((LuaTable) table).getTable(f3790o);
                if (table != LuaNil.nil) {
                    m4255b((LuaTable) table);
                }
            }
        }
        this.f3802U.a_(true);
        table = super.getTable(ATTR_WIDGET_VEXPAND);
        if (table != LuaNil.nil && ((Boolean) table).booleanValue()) {
            this.f3802U.m1500b(true);
        }
        table = super.getTable(ATTR_WIDGET_MARGIN);
        if (table != LuaNil.nil) {
            this.f3802U.m1496a(convertMarginsToPixels(table, this.I));
        }
        table = super.getTable(ATTR_WIDGET_PADDING);
        if (table != LuaNil.nil) {
            this.f3802U.m1501b(convertPaddingToPixels(table, this.I));
        }
        table = super.getTable(ATTR_WIDGET_ALIGNMENT);
        if (table != LuaNil.nil) {
            switch (((Double) table).intValue()) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    this.f3802U.m1509g(51);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    this.f3802U.m1509g(49);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                    this.f3802U.m1509g(53);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                    this.f3802U.m1509g(19);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                    this.f3802U.m1509g(17);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                    this.f3802U.m1509g(21);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                    this.f3802U.m1509g(83);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                    this.f3802U.m1509g(81);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                    this.f3802U.m1509g(85);
                    break;
                default:
                    this.f3802U.m1509g(17);
                    break;
            }
        }
        Object table3 = super.getTable(ATTR_WIDGET_SKIN);
        if (table3 != LuaNil.nil) {
            a = cN.m2139a(table3);
            if (a != null) {
                this.f3802U.m1491a(a);
            }
        }
        table3 = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table3 != LuaNil.nil) {
            a = cN.m2139a(table3);
            if (a != null) {
                this.f3802U.m1498b(a);
            }
        }
        if (super.getTable(f3777a) != LuaNil.nil) {
            this.f3802U.m1490a(this.ad);
        }
        if (this.aa == f3778c || this.aa == f3780e) {
            if (this.aa == f3778c) {
                c0218t = (bd) this.f3802U;
            } else {
                obj = (bp) this.f3802U;
            }
            if (super.getTable(f3784i) != LuaNil.nil) {
                c0218t.m1562a(this.ac);
            }
            table = super.getTable(f3773Q);
            if (table != LuaNil.nil) {
                Vector vector = ((LuaTable) table).list;
                this.f3803V = ((Double) vector.elementAt(0)).intValue();
                this.f3804W = ((Double) vector.elementAt(1)).intValue();
                this.f3805X = ((Double) vector.elementAt(2)).intValue();
                c0218t.m1564d(this.f3803V > 1);
                if (this.f3804W >= this.f3805X) {
                    z = false;
                }
                c0218t.m1566e(z);
            }
        }
        table = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil && (table instanceof LuaTable)) {
            this.f3802U.m1502c(m3943a((LuaTable) table));
        }
        this.E = KONY_WIDGET_RESTORE;
        m4257d();
        if (KonyMain.f3657e) {
            Log.d("LuaHImageStrip", "Setting the widgetState as restored");
        }
        table = super.getTable(f3783h);
        if (table != LuaNil.nil) {
            int a2 = cr.m2199a(((Double) table).intValue(), 0);
            if (this.f3806Y.size() > a2 && a2 >= 0) {
                this.f3802U.m1511h(a2);
            }
        }
        if (this.ab) {
            setWeight();
        }
    }

    private void m4257d() {
        m4262h();
        int size = this.f3806Y.size();
        for (int i = 0; i < size; i++) {
            LuaTable luaTable = (LuaTable) this.f3806Y.elementAt(i);
            this.f3802U.m1495a(luaTable.map.get(this.f3807Z).toString(), m3943a((LuaTable) luaTable.map.get(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG)));
        }
        this.f3802U.m1508g();
    }

    private void m4258d(Object[] objArr) {
        int i = 0;
        if (objArr[0] != LuaNil.nil) {
            if (objArr[1] != LuaNil.nil) {
                m4261g();
                Vector vector = ((LuaTable) objArr[0]).list;
                this.f3807Z = objArr[1].toString();
                while (i < vector.size()) {
                    LuaTable luaTable = (LuaTable) vector.elementAt(i);
                    LuaNil table = luaTable.getTable(this.f3807Z);
                    if (!(table == LuaNil.nil || table.equals(BuildConfig.FLAVOR))) {
                        this.f3806Y.add(luaTable);
                    }
                    i++;
                }
            } else if (KonyMain.f3659g) {
                Log.e("LuaHImageStrip", "addAll: image_url_key not specified");
            }
        }
    }

    private LuaTable m4259e() {
        int e = this.f3802U.m1505e();
        return (e >= this.f3806Y.size() || e < 0) ? null : (LuaTable) this.f3806Y.elementAt(e);
    }

    private Double m4260f() {
        int a = cr.m2199a(this.f3802U.m1505e(), 1);
        return a == -1 ? null : new Double((double) a);
    }

    private void m4261g() {
        this.f3806Y.clear();
        m4263i();
    }

    private void m4262h() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3802U.c_();
            this.f3802U.m1508g();
        }
    }

    private void m4263i() {
        super.setTable(f3783h, LuaNil.nil);
        super.setTable(f3782g, LuaNil.nil);
    }

    public final void m4264a(int i) {
        int a = cr.m2199a(i, 0);
        if (a >= 0 && a <= this.f3806Y.size() - 1) {
            this.f3806Y.removeElementAt(a);
            if (this.E == KONY_WIDGET_RESTORE) {
                this.f3802U.m1507f(a);
                this.f3802U.m1508g();
                return;
            }
            m4263i();
        }
    }

    protected final void m4265a(Object obj, Object obj2) {
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == f3783h && obj2 != LuaNil.nil) {
                if (KonyMain.f3657e) {
                    Log.d("LuaHImageStrip", "Getting the request for focusedIndex as " + ((Double) obj2).intValue());
                }
                int a = cr.m2199a(((Double) obj2).intValue(), 0);
                if (this.f3806Y.size() > a && a >= 0) {
                    this.f3802U.m1511h(a);
                }
            } else if (intern == ATTR_WIDGET_SKIN && obj2 != LuaNil.nil) {
                if (KonyMain.f3657e) {
                    Log.d("LuaHImageStrip", "Getting the request for normal Skin change");
                }
                if (this.E != KONY_WIDGET_RESTORE) {
                    return;
                }
                if (obj2 != LuaNil.nil) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        m4254b(r0);
                        return;
                    }
                    return;
                }
                m4254b(null);
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN && obj2 != LuaNil.nil) {
                if (KonyMain.f3657e) {
                    Log.d("LuaHImageStrip", "Getting the request for focus Skin change");
                }
                if (this.E != KONY_WIDGET_RESTORE) {
                    return;
                }
                if (obj2 != LuaNil.nil) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        m4253a(r0);
                        return;
                    }
                    return;
                }
                m4253a(null);
            } else if (intern == f3774R) {
                if (obj2 != LuaNil.nil) {
                    m4257d();
                } else {
                    m4262h();
                }
            } else if (intern == f3777a && obj2 != LuaNil.nil) {
                this.f3802U.m1490a(this.ad);
            } else if (intern == f3796u && obj2 != LuaNil.nil) {
                this.f3802U.setSpacing(((Double) obj2).intValue());
            } else if (intern == f3775S && obj2 != LuaNil.nil) {
                LuaNil table = ((LuaTable) obj2).getTable(f3790o);
                if (table != LuaNil.nil && this.aa == f3781f) {
                    m4255b((LuaTable) table);
                }
                LuaNil table2 = ((LuaTable) obj2).getTable(f3791p);
                if (table2 != LuaNil.nil && this.aa == f3779d) {
                    dH dHVar = (dH) this.f3802U;
                    LuaNil table3 = ((LuaTable) table2).getTable(f3770C);
                    if (table3 != LuaNil.nil) {
                        dHVar.m3026n(((Double) table3).intValue());
                    }
                    table3 = ((LuaTable) table2).getTable(f3771D);
                    if (table3 != LuaNil.nil) {
                        dHVar.m3025m(((Double) table3).intValue());
                    }
                    table3 = ((LuaTable) table2).getTable(f3772P);
                    if (table3 != LuaNil.nil) {
                        dHVar.m3024l(((Double) table3).intValue());
                    }
                }
            } else if (intern == f3793r && obj2 != LuaNil.nil && this.aa != ((Double) obj2).intValue()) {
                this.aa = ((Double) obj2).intValue();
                View b_ = this.f3802U.b_();
                ViewGroup viewGroup = (ViewGroup) b_.getParent();
                int indexOfChild = viewGroup.indexOfChild(b_);
                cleanup();
                m4256c();
                this.f3802U.a_();
                viewGroup.removeView(b_);
                viewGroup.addView(this.f3802U.b_(), indexOfChild);
            } else if (intern == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil) {
                this.f3802U.m1496a(convertMarginsToPixels(obj2, this.I));
                this.f3802U.m1510h();
            } else if (intern == ATTR_WIDGET_PADDING && obj2 != LuaNil.nil) {
                this.f3802U.m1501b(convertPaddingToPixels(obj2, this.I));
                this.f3802U.m1510h();
            } else if (intern == ATTR_WIDGET_ISVISIBLE && obj2 != LuaNil.nil) {
                this.f3802U.a_(m3942a(((Boolean) obj2).booleanValue()));
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT && obj2 != LuaNil.nil && this.ab) {
                setWeight();
                this.f3802U.m1510h();
                ((eO) this.I).m4238t();
            }
        }
    }

    public final void m4266a(Object[] objArr) {
        if (objArr[1] != LuaNil.nil) {
            if (objArr[2] != LuaNil.nil) {
                Vector vector = ((LuaTable) objArr[1]).list;
                this.f3807Z = objArr[2].toString();
                for (int i = 0; i < vector.size(); i++) {
                    LuaTable luaTable = (LuaTable) vector.elementAt(i);
                    LuaNil table = luaTable.getTable(this.f3807Z);
                    if (!(table == LuaNil.nil || table.equals(BuildConfig.FLAVOR))) {
                        this.f3806Y.add(luaTable);
                        if (this.E == KONY_WIDGET_RESTORE) {
                            this.f3802U.m1495a((String) table, m3943a((LuaTable) luaTable.map.get(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG)));
                        }
                    }
                }
                if (this.E == KONY_WIDGET_RESTORE) {
                    this.f3802U.m1508g();
                } else {
                    m4263i();
                }
            } else if (KonyMain.f3659g) {
                Log.e("LuaHImageStrip", "addAll: image_url_key not specified");
            }
        }
    }

    public final void m4267b() {
        this.f3806Y.clear();
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3802U.c_();
            this.f3802U.m1508g();
            return;
        }
        m4263i();
    }

    public final void m4268b(Object[] objArr) {
        if (this.f3806Y.size() > 0) {
            if (objArr[1] == LuaNil.nil) {
                if (KonyMain.f3659g) {
                    Log.e("LuaHImageStrip", "setDataAt: image_url not specified");
                }
            } else if (objArr[2] != LuaNil.nil) {
                LuaTable luaTable = (LuaTable) objArr[1];
                int a = cr.m2199a(((Double) objArr[2]).intValue(), 0);
                if (a >= 0 && a <= this.f3806Y.size() - 1) {
                    LuaNil table = luaTable.getTable(this.f3807Z);
                    if (table != LuaNil.nil && !table.equals(BuildConfig.FLAVOR)) {
                        this.f3806Y.setElementAt(luaTable, a);
                        if (this.E == KONY_WIDGET_RESTORE) {
                            this.f3802U.m1493a((String) table, a);
                            this.f3802U.m1508g();
                            return;
                        }
                        m4263i();
                    }
                }
            } else if (KonyMain.f3659g) {
                Log.e("LuaHImageStrip", "setDataAt: image_position not specified");
            }
        }
    }

    public final void m4269c(Object[] objArr) {
        if (this.f3806Y.size() > 0) {
            if (objArr[1] == LuaNil.nil) {
                if (KonyMain.f3659g) {
                    Log.e("LuaHImageStrip", "setDataAt: image_url not specified");
                }
            } else if (objArr[2] != LuaNil.nil) {
                LuaTable luaTable = (LuaTable) objArr[1];
                int a = cr.m2199a(((Double) objArr[2]).intValue(), 0);
                if (a < 0 || a > this.f3806Y.size() - 1) {
                    this.f3806Y.add(luaTable);
                } else {
                    this.f3806Y.add(a, luaTable);
                }
                LuaNil table = luaTable.getTable(this.f3807Z);
                if (table != LuaNil.nil && !table.equals(BuildConfig.FLAVOR)) {
                    if (this.E == KONY_WIDGET_RESTORE) {
                        String a2 = m3943a((LuaTable) luaTable.map.get(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG));
                        if (a < 0 || a > this.f3806Y.size() - 1) {
                            this.f3802U.m1495a((String) table, a2);
                        } else {
                            this.f3802U.m1494a((String) table, a, a2);
                        }
                        this.f3802U.m1508g();
                        return;
                    }
                    m4263i();
                }
            } else if (KonyMain.f3659g) {
                Log.e("LuaHImageStrip", "setDataAt: image_position not specified");
            }
        }
    }

    public final void cleanup() {
        if (this.E == KONY_WIDGET_RESTORE) {
            Double f = m4260f();
            if (f != null) {
                super.setTable(f3783h, new Double((double) cr.m2199a(f.intValue(), 1)));
            } else {
                super.setTable(f3783h, LuaNil.nil);
            }
            if (this.aa != f3779d) {
                LuaTable e = m4259e();
                if (e != null) {
                    super.setTable(f3782g, e);
                } else {
                    super.setTable(f3782g, LuaNil.nil);
                }
            }
            this.f3802U.m1504d();
            this.f3802U = null;
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
        hashtable.put(f3783h, "number");
        hashtable.put(f3782g, "table");
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(f3773Q, "table");
        hashtable.put(f3784i, "function");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (((String) obj).intern() == f3774R) {
            LuaNil luaNil = LuaNil.nil;
            if (this.f3806Y.isEmpty()) {
                return luaNil;
            }
            LuaTable luaTable = new LuaTable();
            LuaTable luaTable2 = new LuaTable();
            int size = this.f3806Y.size();
            for (int i = 0; i < size; i++) {
                luaTable2.list.add(this.f3806Y.get(i));
            }
            luaTable.list.add(luaTable2);
            luaTable.list.add(this.f3807Z);
            return luaTable;
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4252a(obj);
        } else {
            Object iiVar;
            synchronized (this) {
                this.f3808b = null;
                iiVar = new ii(new fY(this, obj));
                new Handler(Looper.getMainLooper()).post(iiVar);
                iiVar.m1406a();
                iiVar = this.f3808b;
                this.f3808b = null;
            }
            return iiVar;
        }
    }

    public final String getType() {
        return "Hz Image Strip";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            m4256c();
        }
        this.f3802U.a_();
        return this.f3802U.b_();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f3802U.m1501b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != null && table != LuaNil.nil) {
                this.f3802U.m1496a(convertMarginsToPixels(table, this.I));
            }
        }
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3802U.m1506f();
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3802U.m1513j(i);
            this.f3802U.m1510h();
        }
    }

    public final void setTable(Object obj, Object obj2) {
        if (((String) obj).intern() != f3774R) {
            super.setTable(obj, obj2);
        } else if (obj2 != LuaNil.nil) {
            m4258d(((LuaTable) obj2).getArrayValues());
        } else {
            m4261g();
        }
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(obj, obj2);
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3802U.a_(m3942a(z));
        }
    }

    public final void setWeight() {
        LuaNil table = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
        if (table != LuaNil.nil) {
            this.ab = true;
            if (this.E != KONY_WIDGET_BACKUP) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f3802U.m1488a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3802U.m1514k(i);
            this.f3802U.m1510h();
        }
    }

    public final String toString() {
        return "LuaHImageStrip: " + getTable(ATTR_WIDGET_ID);
    }
}
