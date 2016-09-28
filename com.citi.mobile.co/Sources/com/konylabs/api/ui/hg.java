package com.konylabs.api.ui;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import ny0k.C0284S;
import ny0k.cN;
import ny0k.cr;

public final class hg extends LuaWidget {
    private static String f4387A;
    private static String f4388B;
    private static String f4389C;
    private static String f4390D;
    private static String f4391P;
    private static String f4392Q;
    private static String f4393R;
    private static String f4394S;
    private static String f4395T;
    private static String f4396U;
    private static String f4397V;
    private static String f4398W;
    private static String f4399X;
    private static String f4400Y;
    private static String f4401Z;
    public static String f4402a;
    private static String aa;
    private static String ab;
    private static String ac;
    private static String ad;
    private static String ae;
    public static String f4403b;
    private static String f4404h;
    private static String f4405i;
    private static String f4406j;
    private static String f4407k;
    private static String f4408l;
    private static String f4409m;
    private static String f4410n;
    private static String f4411o;
    private static String f4412p;
    private static String f4413q;
    private static String f4414r;
    private static String f4415s;
    private static String f4416t;
    private static String f4417u;
    private static String f4418v;
    private static String f4419w;
    private static String f4420x;
    private static String f4421y;
    private static String f4422z;
    private ie aA;
    private iq aB;
    private int af;
    private String ag;
    private bt ah;
    private eO ai;
    private Vector aj;
    private eO ak;
    private boolean al;
    private int am;
    private int an;
    private int ao;
    private int ar;
    private hk as;
    private boolean at;
    private boolean au;
    private cv av;
    private Vector aw;
    private Vector ax;
    private C0216r ay;
    private C0217s az;
    C0215q f4423c;
    Vector f4424d;
    Object f4425e;
    Object f4426f;
    Object f4427g;

    static {
        f4404h = "navigationskin";
        f4405i = "askin";
        f4406j = "sectionskin";
        f4407k = "rowtemplate";
        f4408l = "showstatus";
        f4402a = "onclick";
        f4403b = "onselect";
        f4409m = "menu";
        f4410n = "contextmenu";
        f4411o = "slw";
        f4412p = "enabledockheader";
        f4413q = "pressedskin";
        f4414r = "retainselection";
        f4415s = "meta";
        f4416t = "focuseditem";
        f4417u = "focusedindex";
        f4418v = "length";
        f4419w = "widgetdatamap";
        f4420x = "datasethandler";
        f4421y = "view";
        f4422z = "selectedindices";
        f4387A = "selecteditems";
        f4388B = "ispageindicatorneeded";
        f4389C = "pageondotimage";
        f4390D = "pageoffdotimage";
        f4391P = "ongesture";
        f4392Q = "minheight";
        f4393R = "groupcells";
        f4394S = "septhickness";
        f4395T = "sepcolor";
        f4396U = "secskin";
        f4397V = "behavior";
        f4398W = "selectionindicator";
        f4399X = "selectimage";
        f4400Y = "unselectimage";
        f4401Z = "metainfo";
        aa = "clickable";
        ab = "skin";
        ac = "default";
        ad = "singleselect";
        ae = "multiselect";
        if (KonyMain.m4057C()) {
            f4404h = "navigationSkin";
            f4405i = "aSkin";
            f4406j = "sectionSkin";
            f4407k = "rowTemplate";
            f4408l = "showStatus";
            f4402a = "onClick";
            f4403b = "onSelect";
            f4410n = "contextMenu";
            f4412p = "enableDockHeader";
            f4413q = "pressedSkin";
            f4414r = "retainSelection";
            f4416t = "focusedItem";
            f4417u = "focusedIndex";
            f4419w = "widgetDataMap";
            f4420x = "dataSetHandler";
            f4422z = "selectedIndices";
            f4387A = "selectedItems";
            f4388B = "isPageIndicatorNeeded";
            f4389C = "pageOnDotImage";
            f4390D = "pageOffDotImage";
            f4391P = "onGesture";
            f4392Q = "minHeight";
            f4393R = "groupCells";
            f4394S = "sepThickness";
            f4395T = "sepColor";
            f4396U = "secSkin";
            f4398W = "selectionIndicator";
            f4399X = "selectImage";
            f4400Y = "unselectImage";
            f4401Z = "metaInfo";
        }
    }

    public hg(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3, long j) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4423c = null;
        this.ai = null;
        this.aj = new Vector();
        this.ak = null;
        this.al = false;
        this.f4424d = new Vector();
        this.am = 0;
        this.an = 0;
        this.ao = 0;
        this.ar = 1;
        this.at = false;
        this.au = false;
        this.av = new hh(this);
        this.f4427g = null;
        this.ay = new C0216r(this);
        this.az = new C0217s(this);
        this.aA = new ie(this);
        this.aB = new hj(this);
        super.setTable(ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        this.ap = j;
        LuaNil table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, table);
        }
        table = luaTable.getTable(f4404h);
        if (table != LuaNil.nil) {
            super.setTable(f4404h, table);
        }
        table = luaTable.getTable(f4407k);
        if (table != LuaNil.nil) {
            super.setTable(f4407k, table);
            m4686a((eO) table);
        }
        table = luaTable.getTable(f4408l);
        if (table != LuaNil.nil) {
            super.setTable(f4408l, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(f4402a);
        if (table != LuaNil.nil) {
            super.setTable(f4402a, table);
        }
        table = luaTable.getTable(f4403b);
        if (table != LuaNil.nil) {
            super.setTable(f4403b, table);
        }
        table = luaTable.getTable(f4409m);
        if (table != LuaNil.nil) {
            super.setTable(f4409m, table);
        }
        table = luaTable.getTable(f4405i);
        if (table != LuaNil.nil) {
            super.setTable(f4405i, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(f4421y);
            if (table != LuaNil.nil && ((String) table).intern() == "pageview") {
                this.ar = 2;
            }
            table = luaTable3.getTable(f4411o);
            if (table != LuaNil.nil) {
                if (((Boolean) table).booleanValue()) {
                    this.ar = 3;
                }
                table = luaTable3.getTable(f4412p);
                if (table != LuaNil.nil) {
                    this.at = ((Boolean) table).booleanValue();
                }
            }
            table = luaTable3.getTable(f4414r);
            if (table != LuaNil.nil) {
                this.al = ((Boolean) table).booleanValue();
            }
            table = luaTable3.getTable(f4388B);
            if (table != LuaNil.nil) {
                super.setTable(f4388B, table);
            }
            table = luaTable3.getTable(f4389C);
            if (table != LuaNil.nil) {
                super.setTable(f4389C, table);
            }
            table = luaTable3.getTable(f4390D);
            if (table != LuaNil.nil) {
                super.setTable(f4390D, table);
            }
            table = luaTable3.getTable(f4391P);
            if (table != LuaNil.nil) {
                super.setTable(f4391P, table);
            }
            table = luaTable3.getTable(f4392Q);
            if (table != LuaNil.nil) {
                super.setTable(f4392Q, table);
            }
            table = luaTable3.getTable(f4393R);
            if (table != LuaNil.nil) {
                super.setTable(f4393R, table);
            }
            table = luaTable3.getTable(f4394S);
            if (table != LuaNil.nil) {
                super.setTable(f4394S, table);
            }
            table = luaTable3.getTable(f4395T);
            if (table != LuaNil.nil) {
                super.setTable(f4395T, table);
            }
            table = luaTable3.getTable(f4396U);
            if (table != LuaNil.nil) {
                super.setTable(f4396U, table);
            }
            table = luaTable3.getTable(f4397V);
            if (table != LuaNil.nil) {
                super.setTable(f4397V, table);
            }
            table = luaTable3.getTable(f4398W);
            if (table != LuaNil.nil) {
                super.setTable(f4398W, table);
            }
            table = luaTable3.getTable(f4399X);
            if (table != LuaNil.nil) {
                super.setTable(f4399X, table);
            }
            table = luaTable3.getTable(f4400Y);
            if (table != LuaNil.nil) {
                super.setTable(f4400Y, table);
            }
        }
        this.f4424d.add(new ho(this, null));
    }

    private LuaTable m4681a(View[] viewArr) {
        if (viewArr == null || viewArr.length == 0) {
            return null;
        }
        LuaTable luaTable = new LuaTable(viewArr.length, 0);
        Enumeration elements = this.f4424d.elements();
        while (elements.hasMoreElements()) {
            Enumeration elements2 = ((ho) elements.nextElement()).f1526b.elements();
            while (elements2.hasMoreElements()) {
                hn hnVar = (hn) elements2.nextElement();
                for (View view : viewArr) {
                    if (hnVar.f1523a.getWidget() == view) {
                        luaTable.list.add(hnVar.f1524b);
                        break;
                    }
                }
            }
        }
        return luaTable;
    }

    private Object m4683a(Object obj) {
        int i = 0;
        String intern = ((String) obj).intern();
        if (intern == f4416t) {
            if (this.E == KONY_WIDGET_RESTORE) {
                LuaTable e = m4703e();
                return e == null ? LuaNil.nil : e;
            } else {
                if (KonyMain.f3658f) {
                    Log.w("LuaSegUI", "getTable of PROP_SEGUI_FOCUSED_ITEM called in invalid state");
                }
                return super.getTable(f4416t);
            }
        } else if (intern == f4417u) {
            if (this.E == KONY_WIDGET_RESTORE) {
                i = this.f4423c.m1551j();
                r1 = this.at ? m4694c(i) : i;
                return r1 == -1 ? LuaNil.nil : new Double((double) cr.m2199a(r1, 1));
            } else {
                if (KonyMain.f3658f) {
                    Log.w("LuaSegUI", "getTable of PROP_SEGUI_FOCUSED_INDEX called in invalid state");
                }
                return super.getTable(f4417u);
            }
        } else if (intern == f4418v) {
            r1 = ((ho) this.f4424d.elementAt(0)).f1526b.size();
            return r1 == -1 ? LuaNil.nil : new Double((double) r1);
        } else if (intern != f4422z) {
            return intern == f4387A ? this.E == KONY_WIDGET_RESTORE ? m4681a(this.f4423c.m1550i()) : LuaNil.nil : super.getTable(intern);
        } else {
            if (this.E != KONY_WIDGET_RESTORE) {
                return super.getTable(f4422z);
            }
            int[] h = this.f4423c.m1549h();
            if (h == null || h.length == 0) {
                return LuaNil.nil;
            }
            LuaTable luaTable = new LuaTable(h.length, 0);
            while (i < h.length) {
                luaTable.list.add(Integer.valueOf(cr.m2199a(h[i], 1)));
                i++;
            }
            return luaTable;
        }
    }

    private void m4684a(double d, boolean z) {
        int m;
        if (z) {
            int width = KonyMain.getActContext().getWindowManager().getDefaultDisplay().getWidth();
            if (this.I instanceof eO) {
                m = (int) (((((double) ((eO) this.I).m4231m()) * d) / 100.0d) * ((double) width));
            } else {
                m = (int) (((double) width) * (d / 100.0d));
            }
        } else {
            m = dB.m1116r((int) d);
        }
        ((dm) this.f4423c).m3201e(m);
    }

    private void m4685a(dB dBVar) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4423c.m1538c(dBVar);
            this.f4423c.m1546e(true);
        }
    }

    private void m4686a(eO eOVar) {
        this.ai = eOVar;
        this.ai.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, new Double(1.0d));
        this.ai.setParent(this);
        this.ai.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(true));
        setTable(this.ai.getTable(LuaWidget.ATTR_WIDGET_ID), this.ai);
        KonyMain.m4143x().m1773a((LuaWidget) this, (LuaWidget) eOVar);
    }

    private static void m4687a(LuaTable luaTable, LuaTable luaTable2) {
        Enumeration keys = luaTable2.map.keys();
        while (keys.hasMoreElements()) {
            String intern = ((String) keys.nextElement()).intern();
            if (intern == ATTR_WIDGET_VISIBLE) {
                luaTable.setTable(ATTR_WIDGET_ISVISIBLE, luaTable2.getTable(intern));
            } else if (intern == ATTR_WIDGET_ENABLE) {
                luaTable.setTable(ATTR_WIDGET_SET_ENABLED, luaTable2.getTable(intern));
            } else if (intern == ATTR_WIDGET_Label_I18NKEY) {
                luaTable.setTable(ATTR_WIDGET_LABEL, C0284S.m1823a(KonyMain.getActContext()).m1849g(new Object[]{luaTable2.getTable(intern)}));
            } else {
                luaTable.setTable(intern, luaTable2.getTable(intern));
            }
        }
    }

    private hn m4688b(int i) {
        for (int i2 = 0; i2 < this.f4424d.size(); i2++) {
            Vector vector = ((ho) this.f4424d.elementAt(i2)).f1526b;
            if (i < vector.size()) {
                return (hn) vector.elementAt(i);
            }
            i -= vector.size();
        }
        return null;
    }

    private void m4690b(dB dBVar) {
        C0215q c0215q = this.f4423c;
        if (dBVar == null) {
            dBVar = null;
        }
        c0215q.m1542d(dBVar);
        this.f4423c.m1546e(false);
    }

    private void m4691b(eO eOVar) {
        for (int i = 0; i < eOVar.f3720i.size(); i++) {
            LuaTable luaTable = (LuaTable) eOVar.f3720i.get(i);
            if (luaTable instanceof eO) {
                m4691b((eO) luaTable);
            }
            this.aj.add(luaTable.getTable(ATTR_WIDGET_ID).toString());
        }
    }

    private void m4692b(Object obj) {
        int[] iArr = null;
        if (this.af == 2) {
            Vector vector = ((LuaTable) obj).list;
            int size = vector.size();
            int[] iArr2 = new int[size];
            for (int i = 0; i < size; i++) {
                iArr2[i] = cr.m2199a(((Double) vector.get(i)).intValue(), 0);
            }
            iArr = iArr2;
        } else if (this.af == 1) {
            iArr = new int[]{cr.m2199a(((Double) ((LuaTable) obj).list.get(0)).intValue(), 0)};
        }
        this.f4423c.m1540c(iArr);
    }

    private int m4694c(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4424d.size(); i3++) {
            i2 += ((ho) this.f4424d.elementAt(i3)).f1526b.size();
            if (i2 >= i) {
                return (i3 + 1) + i;
            }
        }
        return -2;
    }

    private void m4697c(dB dBVar) {
        if (this.ar == 1 || this.ar == 3) {
            C0214p c0214p = (C0214p) this.f4423c;
            if (dBVar == null) {
                dBVar = null;
            }
            c0214p.m1519b(dBVar);
            this.f4423c.m1546e(true);
        }
    }

    private void m4698c(LuaTable luaTable) {
        dw dwVar = (dw) this.f4423c;
        dwVar.m3239a(this.av);
        dwVar.m3273m();
        Iterator it = luaTable.list.iterator();
        while (it.hasNext()) {
            LuaTable luaTable2 = (LuaTable) it.next();
            try {
                dwVar.m3238a(new cu((String) luaTable2.list.elementAt(0), (String) luaTable2.list.elementAt(1), 0, luaTable2.list.elementAt(3)));
            } catch (Exception e) {
                if (KonyMain.f3657e) {
                    Log.d("LuaSegUI", BuildConfig.FLAVOR + e);
                }
                throw new LuaError("Invalid Context menu item arguments for Segment widget", 605);
            }
        }
    }

    private ih m4699d(LuaTable luaTable) {
        LuaNil table = luaTable.getTable(f4401Z);
        if (table == LuaNil.nil) {
            if (this.af == 0) {
                return null;
            }
            if (this.af == 1 || this.af == 2) {
                ih ihVar = new ih();
                ihVar.f1547a = true;
                ihVar.f1549c = this.ah;
                return ihVar;
            }
        }
        if (table instanceof LuaTable) {
            LuaTable luaTable2 = (LuaTable) table;
            LuaTable luaTable3 = luaTable2.hashSize() == 0 ? (LuaTable) luaTable2.getTable(new Double(1.0d)) : luaTable2;
            ih ihVar2 = new ih();
            ihVar2.f1547a = true;
            if (luaTable3.getTable(aa) != LuaNil.nil) {
                if (luaTable3.getTable(aa) instanceof String) {
                    ihVar2.f1547a = luaTable3.getTable(aa).toString().equalsIgnoreCase("true");
                } else {
                    ihVar2.f1547a = ((Boolean) luaTable3.getTable(aa)).booleanValue();
                }
            }
            if (luaTable3.getTable(ab) != LuaNil.nil) {
                ihVar2.f1548b = cN.m2139a(luaTable3.getTable(ab));
            }
            if (this.af == 1 || this.af == 2) {
                ihVar2.f1549c = this.ah;
            }
            return ihVar2;
        }
        throw new LuaError("SegmentUI metainfo value should be a key-value pair object", 9999);
    }

    static /* synthetic */ Hashtable m4700d(hg hgVar) {
        LuaNil table = super.getTable(f4419w);
        return table != LuaNil.nil ? ((LuaTable) table).map : null;
    }

    private void m4701d() {
        for (int i = 0; i < this.f4424d.size(); i++) {
            Vector vector = ((ho) this.f4424d.elementAt(i)).f1526b;
            for (int i2 = 0; i2 < vector.size(); i2++) {
                if (((hn) vector.elementAt(i2)).f1523a != null) {
                    ((hn) vector.elementAt(i2)).f1523a.cleanup();
                    ((hn) vector.elementAt(i2)).f1523a = null;
                }
            }
        }
    }

    private void m4702d(dB dBVar) {
        C0214p c0214p = (C0214p) this.f4423c;
        if (dBVar == null) {
            dBVar = null;
        }
        c0214p.m1516a(dBVar);
    }

    private LuaTable m4703e() {
        hn b;
        if (this.ar == 3) {
            int j = this.f4423c.m1551j();
            if (j < 0) {
                return null;
            }
            b = m4688b(j);
            return b != null ? b.f1524b : null;
        } else {
            View a = this.f4423c.m1521a();
            if (a == null) {
                return null;
            }
            Enumeration elements = this.f4424d.elements();
            LuaTable luaTable = null;
            Object obj = null;
            while (elements.hasMoreElements()) {
                LuaTable luaTable2;
                Object obj2;
                Enumeration elements2 = ((ho) elements.nextElement()).f1526b.elements();
                while (elements2.hasMoreElements()) {
                    b = (hn) elements2.nextElement();
                    if (b.f1523a.getWidget() == a) {
                        luaTable2 = b.f1524b;
                        obj2 = 1;
                        break;
                    }
                }
                obj2 = obj;
                luaTable2 = luaTable;
                if (obj2 != null) {
                    return luaTable2;
                }
                luaTable = luaTable2;
                obj = obj2;
            }
            return luaTable;
        }
    }

    private void m4704f() {
        if (this.E == KONY_WIDGET_RESTORE && this.ar == 3) {
            ((df) this.f4423c).m3140m();
        }
    }

    public final void m4705a(int i) {
        if (i >= 0) {
            ho hoVar;
            int i2;
            Iterator it = this.f4424d.iterator();
            int i3 = 0;
            int i4 = i;
            while (it.hasNext()) {
                ho hoVar2 = (ho) it.next();
                i3++;
                int size = hoVar2.f1526b.size();
                if (i4 < size) {
                    hoVar = hoVar2;
                    i2 = 1;
                    break;
                }
                i4 -= size;
            }
            i2 = 0;
            hoVar = null;
            if (i2 != 0 && hoVar != null) {
                if (this.E == KONY_WIDGET_RESTORE && this.ar != 3) {
                    this.f4423c.m1533b(i4, i3 - 1);
                }
                eO eOVar = ((hn) hoVar.f1526b.elementAt(i4)).f1523a;
                if (eOVar != null) {
                    eOVar.cleanup();
                }
                hoVar.f1526b.removeElementAt(i4);
                if (this.E == KONY_WIDGET_RESTORE && this.ar == 3) {
                    ((df) this.f4423c).m3096a(i3 - 1, 1, 1);
                }
                m4704f();
            } else if (KonyMain.f3659g) {
                Log.e("LuaSegUI", "Invalid index to remove at: " + i + " in segment " + super.getTable(ATTR_WIDGET_ID));
            }
        } else if (KonyMain.f3659g) {
            Log.e("LuaSegUI", "Invalid index to remove at: " + i + " in segment " + super.getTable(ATTR_WIDGET_ID));
        }
    }

    public final void m4706a(int i, LuaTable luaTable) {
        if (i >= 0) {
            LuaNil table = super.getTable(f4419w);
            if (table == LuaNil.nil || ((LuaTable) table).map.size() == 0) {
                throw new LuaError(f4419w + " property is not set for the Segment widget " + toString(), 9999);
            }
            Object obj;
            ho hoVar = null;
            Iterator it = this.f4424d.iterator();
            int i2 = i;
            while (it.hasNext()) {
                ho hoVar2 = (ho) it.next();
                int size = hoVar2.f1526b.size();
                if (i2 < size) {
                    ho hoVar3 = hoVar2;
                    obj = 1;
                    hoVar = hoVar3;
                    break;
                }
                i2 -= size;
            }
            obj = null;
            if (obj != null && hoVar != null) {
                if (this.E == KONY_WIDGET_RESTORE && this.ar != 3) {
                    Hashtable hashtable = ((LuaTable) table).map;
                    eO eOVar = ((hn) hoVar.f1526b.elementAt(i2)).f1523a;
                    this.ak = eOVar;
                    m4707a(eOVar, hashtable, luaTable);
                }
                ((hn) hoVar.f1526b.elementAt(i2)).f1524b = luaTable;
                m4704f();
            } else if (KonyMain.f3659g) {
                Log.e("LuaSegUI", "Invalid index to set data at: " + i + " in segment " + super.getTable(ATTR_WIDGET_ID));
            }
        } else if (KonyMain.f3659g) {
            Log.e("LuaSegUI", "Invalid index to set data at: " + i + " in segment " + super.getTable(ATTR_WIDGET_ID));
        }
    }

    final void m4707a(eO eOVar, Hashtable hashtable, LuaTable luaTable) {
        Iterator it = this.aj.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            LuaNil table = eOVar.getTable(str);
            if (table != null && table != LuaNil.nil) {
                LuaTable luaTable2 = (LuaTable) table;
                if (luaTable2 instanceof eO) {
                    boolean z;
                    eO eOVar2 = (eO) luaTable2;
                    Iterator it2 = eOVar2.f3720i.iterator();
                    while (it2.hasNext()) {
                        if (((Boolean) ((LuaWidget) it2.next()).getTable(ATTR_WIDGET_ISVISIBLE)).booleanValue()) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    if (z) {
                        eOVar2.setWidgetInSegUIEventListener(this.aB, this.ak);
                        eOVar2.setVisibility(true);
                    } else {
                        eOVar2.setVisibility(false);
                    }
                }
                if (luaTable2 instanceof fe) {
                    ((fe) luaTable2).setWidgetInSegUIEventListener(this.aB, this.ak);
                } else if (luaTable2 instanceof gD) {
                    ((gD) luaTable2).setWidgetInSegUIEventListener(this.aB, this.ak);
                } else if (luaTable2 instanceof gX) {
                    ((gX) luaTable2).setWidgetInSegUIEventListener(this.aB, this.ak);
                }
                Object obj = hashtable.get(str);
                if (obj != null) {
                    LuaNil luaNil = luaTable.map.get(obj);
                    if (luaNil == null || luaNil == LuaNil.nil) {
                        if (!((luaTable2 instanceof gC) || (luaTable2 instanceof eO) || !((Boolean) luaTable2.getTable(ATTR_WIDGET_ISVISIBLE)).booleanValue())) {
                            ((LuaWidget) luaTable2).setVisibility(false);
                        }
                    } else if (luaNil instanceof LuaTable) {
                        m4687a(luaTable2, (LuaTable) luaNil);
                    } else {
                        if ((luaTable2 instanceof gA) || (luaTable2 instanceof gD) || (luaTable2 instanceof gX) || (luaTable2 instanceof fe)) {
                            luaTable2.setTable(ATTR_WIDGET_LABEL, luaNil);
                        } else if (luaTable2 instanceof gs) {
                            if ((this.af == 2 || this.af == 1) && luaTable2.getTable(ATTR_WIDGET_ID).equals(this.ag)) {
                                luaTable2.setTable(gs.f4202a, super.getTable(f4400Y));
                                this.ah = ((gs) luaTable2).m4589b();
                                this.ah.setTag(C0215q.f1605b);
                            } else {
                                luaTable2.setTable(gs.f4202a, luaNil);
                            }
                        }
                        if (((Boolean) luaTable2.getTable(ATTR_WIDGET_ISVISIBLE)).booleanValue()) {
                            if (luaNil.equals(BuildConfig.FLAVOR)) {
                                ((LuaWidget) luaTable2).setVisibility(false);
                            } else {
                                ((LuaWidget) luaTable2).setVisibility(true);
                            }
                        }
                    }
                }
            } else if (KonyMain.f3657e) {
                Log.w("LuaSegUI", "Invalid key(" + str + ") passed in setData on segment : " + super.getTable(ATTR_WIDGET_ID));
            }
        }
    }

    protected final void m4708a(Object obj, Object obj2) {
        boolean z = true;
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == f4420x) {
                this.f4425e = obj2;
                this.f4423c.m1527a(this.ay);
            } else if (intern == f4415s) {
                Vector vector = ((LuaTable) obj2).list;
                this.am = ((Double) vector.elementAt(0)).intValue();
                this.an = ((Double) vector.elementAt(1)).intValue();
                this.ao = ((Double) vector.elementAt(2)).intValue();
                this.f4423c.m1539c(this.am > 1);
                C0215q c0215q = this.f4423c;
                if (this.an >= this.ao) {
                    z = false;
                }
                c0215q.m1543d(z);
            } else if (intern == f4417u) {
                if (KonyMain.f3657e) {
                    Log.d("LuaSegUI", "Setting SEGUI FOCUSED INDEX as : " + obj2);
                }
                if (obj2 != LuaNil.nil) {
                    int intValue = ((Double) obj2).intValue();
                    if (intValue == -1) {
                        this.f4423c.m1532b(intValue);
                    } else if (intValue >= 0) {
                        if (this.at) {
                            intValue = m4694c(intValue);
                        }
                        this.f4423c.m1532b(cr.m2199a(intValue, 0));
                    }
                }
            } else if (intern == f4422z) {
                if (obj2 == LuaNil.nil) {
                    this.f4423c.m1552k();
                } else {
                    m4692b(obj2);
                }
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4690b(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4690b(r0);
                }
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4685a(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4685a(r0);
                }
            } else if (intern == f4405i) {
                if (this.ar != 1 && this.ar != 3) {
                    return;
                }
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4697c(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4697c(r0);
                }
            } else if (intern == f4406j) {
                if (this.ar != 1 && this.ar != 3) {
                    return;
                }
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4702d(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4702d(r0);
                }
            } else if (intern == f4410n) {
                if (this.ar == 1 && obj2 != null && obj2 != LuaNil.nil) {
                    m4698c((LuaTable) obj2);
                }
            } else if (intern == "pagewidthinpercent" && this.ar == 2 && obj2 != LuaNil.nil) {
                m4684a(((Double) obj2).doubleValue(), true);
            } else if (intern == "pagewidthinpixel" && this.ar == 2 && obj2 != LuaNil.nil) {
                m4684a(((Double) obj2).doubleValue(), false);
            }
        }
    }

    public final void m4709a(Vector vector) {
        if (vector != null) {
            this.aw = vector;
            if (this.E == KONY_WIDGET_RESTORE && this.ar == 3) {
                df dfVar = (df) this.f4423c;
                Iterator it = this.aw.iterator();
                while (it.hasNext()) {
                    View widget = ((eO) it.next()).getWidget();
                    widget.setLayoutParams(new LayoutParams(-1, -2));
                    dfVar.m3112b(widget);
                }
                if (this.at) {
                    dfVar.m3124d(this.aw.size());
                }
            }
        }
    }

    public final void m4710a(Object[] objArr) {
        boolean z = true;
        LuaNil table = super.getTable(f4419w);
        if (table == LuaNil.nil || ((LuaTable) table).map.size() == 0) {
            throw new LuaError(f4419w + " property is not set for the Segment widget " + toString(), 9999);
        } else if (objArr[1] != LuaNil.nil) {
            Hashtable hashtable = ((LuaTable) table).map;
            Vector vector = ((LuaTable) objArr[1]).list;
            ((ho) this.f4424d.elementAt(0)).f1526b.size();
            int size = vector.size();
            for (int i = 0; i < size; i++) {
                LuaTable luaTable = (LuaTable) vector.elementAt(i);
                if (this.E != KONY_WIDGET_RESTORE || this.ar == 3) {
                    ((ho) this.f4424d.elementAt(0)).f1526b.add(new hn(this, null, luaTable));
                } else {
                    eO eOVar = (eO) this.ai.createClone();
                    this.ak = eOVar;
                    m4707a(eOVar, hashtable, luaTable);
                    this.f4423c.m1525a(eOVar.getWidget(), 0, m4699d(luaTable));
                    ((ho) this.f4424d.elementAt(0)).f1526b.add(new hn(this, eOVar, luaTable));
                }
            }
            if (this.E == KONY_WIDGET_RESTORE) {
                this.f4423c.m1546e(false);
                if (this.am > 1 || this.an < this.ao) {
                    C0215q c0215q = this.f4423c;
                    boolean z2 = this.am > 1;
                    if (this.an >= this.ao) {
                        z = false;
                    }
                    c0215q.m1529a(z2, z);
                }
            }
            if (this.E == KONY_WIDGET_RESTORE && this.ar == 3) {
                ((df) this.f4423c).m3096a(0, size, 0);
            }
            m4704f();
        }
    }

    public final void m4711b(int i, LuaTable luaTable) {
        if (i >= 0) {
            LuaNil table = super.getTable(f4419w);
            if (table == LuaNil.nil || ((LuaTable) table).map.size() == 0) {
                throw new LuaError(f4419w + " property is not set for the Segment widget " + toString(), 9999);
            }
            ho hoVar;
            int i2;
            Iterator it = this.f4424d.iterator();
            int i3 = 0;
            int i4 = i;
            while (it.hasNext()) {
                ho hoVar2 = (ho) it.next();
                i3++;
                int size = hoVar2.f1526b.size();
                if (i4 < size) {
                    hoVar = hoVar2;
                    i2 = 1;
                    break;
                }
                i4 -= size;
            }
            hoVar = null;
            i2 = 0;
            if (i2 == 0 || hoVar == null) {
                if (KonyMain.f3659g) {
                    Log.e("LuaSegUI", "Invalid index to add at: " + i + " in segment " + super.getTable(ATTR_WIDGET_ID));
                }
            } else if (this.E != KONY_WIDGET_RESTORE || this.ar == 3) {
                hoVar.f1526b.add(i4, new hn(this, null, luaTable));
                ((df) this.f4423c).m3096a(i3 - 1, 1, 0);
                m4704f();
            } else {
                Hashtable hashtable = ((LuaTable) table).map;
                eO eOVar = (eO) this.ai.createClone();
                this.ak = eOVar;
                m4707a(eOVar, hashtable, luaTable);
                this.f4423c.m1524a(eOVar.getWidget(), i4, i3 - 1, m4699d(luaTable));
                hoVar.f1526b.add(i4, new hn(this, eOVar, luaTable));
            }
        } else if (KonyMain.f3659g) {
            Log.e("LuaSegUI", "Invalid index to add data at: " + i + " in segment " + super.getTable(ATTR_WIDGET_ID));
        }
    }

    public final void m4712b(LuaTable luaTable) {
        LuaNil table = super.getTable(f4419w);
        if (table == LuaNil.nil || ((LuaTable) table).map.size() == 0) {
            throw new LuaError(f4419w + " property is not set for the Segment widget " + toString(), 9999);
        }
        Hashtable hashtable = ((LuaTable) table).map;
        Vector vector = luaTable.list;
        m4701d();
        this.f4424d.clear();
        int i = 0;
        int size = vector.size();
        int i2 = 0;
        while (i2 < size) {
            String str;
            int i3;
            LuaTable luaTable2 = (LuaTable) vector.elementAt(i2);
            this.f4424d.add(new ho(this, null));
            LuaNil luaNil = luaTable2.list.get(0);
            if (luaNil != LuaNil.nil) {
                String obj = luaNil.toString();
                str = obj.equals(BuildConfig.FLAVOR) ? null : obj;
            } else {
                str = null;
            }
            if (KonyMain.f3657e) {
                Log.d("LuaSegUI", "Section header is = " + str);
            }
            ((ho) this.f4424d.elementAt(i2)).f1525a = str;
            if (this.E != KONY_WIDGET_RESTORE || (!(this.ar == 1 || this.ar == 3) || str == null)) {
                i3 = i;
            } else {
                if (this.ar == 3) {
                    ((C0214p) this.f4423c).m1517a(str, i);
                } else {
                    ((C0214p) this.f4423c).m1517a(str, i2);
                }
                i3 = i + 1;
            }
            Object obj2 = luaTable2.list.get(1);
            if (obj2 != null) {
                luaTable2 = (LuaTable) obj2;
                for (int i4 = 0; i4 < luaTable2.list.size(); i4++) {
                    LuaTable luaTable3 = (LuaTable) luaTable2.list.elementAt(i4);
                    if (this.E != KONY_WIDGET_RESTORE || this.ar == 3) {
                        ((ho) this.f4424d.elementAt(i2)).f1526b.add(new hn(this, null, luaTable3));
                    } else {
                        eO eOVar = (eO) this.ai.createClone();
                        this.ak = eOVar;
                        m4707a(eOVar, hashtable, luaTable3);
                        this.f4423c.m1525a(eOVar.getWidget(), i2, m4699d(luaTable3));
                        ((ho) this.f4424d.elementAt(i2)).f1526b.add(new hn(this, eOVar, luaTable3));
                    }
                }
                i3 += luaTable2.list.size();
                if (this.E == KONY_WIDGET_RESTORE) {
                    this.f4423c.m1547f();
                }
            }
            i2++;
            i = i3;
        }
        if (this.E == KONY_WIDGET_RESTORE && this.ar == 1) {
            this.f4423c.m1546e(false);
        }
        this.au = true;
        if (this.E == KONY_WIDGET_RESTORE && this.ar == 3 && this.at) {
            ((df) this.f4423c).m3147t();
        }
        m4704f();
    }

    public final void m4713b(Vector vector) {
        if (vector != null) {
            this.ax = vector;
            if (this.E == KONY_WIDGET_RESTORE && this.ar == 3) {
                df dfVar = (df) this.f4423c;
                Iterator it = this.ax.iterator();
                while (it.hasNext()) {
                    View widget = ((eO) it.next()).getWidget();
                    widget.setLayoutParams(new LayoutParams(-1, -2));
                    dfVar.m3119c(widget);
                }
            }
        }
    }

    public final void m4714b(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("LuaSegUI", "Setting data at SetData()");
        }
        m4716c();
        this.au = false;
        if (this.E == KONY_WIDGET_RESTORE && this.ar == 3) {
            ((df) this.f4423c).m3148u();
        }
        m4710a(objArr);
    }

    public final boolean m4715b() {
        return this.ar == 3;
    }

    public final void m4716c() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4423c.m1531b();
            if (this.ar == 3) {
                ((df) this.f4423c).m3146s();
            }
        }
        m4701d();
        this.f4424d.clear();
        this.f4424d.add(new ho(this, null));
        m4704f();
    }

    public final void cleanup() {
        int i = 0;
        if (this.f4423c != null) {
            Iterator it;
            LuaTable e = m4703e();
            if (e != null) {
                super.setTable(f4416t, e);
            } else {
                super.setTable(f4416t, LuaNil.nil);
            }
            int j = this.f4423c.m1551j();
            if (j != -1) {
                super.setTable(f4417u, new Double((double) cr.m2199a(j, 1)));
            } else {
                super.setTable(f4417u, LuaNil.nil);
            }
            int[] h = this.f4423c.m1549h();
            if (h == null || h.length <= 0) {
                super.setTable(f4422z, LuaNil.nil);
            } else {
                LuaTable luaTable = new LuaTable(h.length, 0);
                while (i < h.length) {
                    luaTable.list.add(new Double((double) cr.m2199a(h[i], 1)));
                    i++;
                }
                super.setTable(f4422z, luaTable);
            }
            this.f4423c.m1544e();
            if (this.aw != null) {
                it = this.aw.iterator();
                while (it.hasNext()) {
                    ((eO) it.next()).cleanup();
                }
            }
            if (this.ax != null) {
                it = this.ax.iterator();
                while (it.hasNext()) {
                    ((eO) it.next()).cleanup();
                }
            }
            this.f4423c = null;
        }
        m4701d();
        if (this.as != null) {
            this.as.m3346a();
            this.as = null;
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
        hashtable.put(f4416t, "table");
        hashtable.put(f4417u, "number");
        hashtable.put(f4422z, "table");
        hashtable.put(f4387A, "table");
        hashtable.put(f4418v, "number");
        hashtable.put(f4415s, "table");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(f4405i, "table");
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        hashtable.put(f4406j, "table");
        hashtable.put(f4410n, "table");
        hashtable.put(f4420x, "function");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4683a(obj);
        }
        Object iiVar;
        synchronized (this) {
            this.f4427g = null;
            iiVar = new ii(new hi(this, obj));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
            iiVar = this.f4427g;
            this.f4427g = null;
        }
        return iiVar;
    }

    public final String getType() {
        return "Segment";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            LuaNil table;
            int parseDouble;
            String intern;
            int i;
            Context actContext = KonyMain.getActContext();
            C0215q c0215q = null;
            switch (this.ar) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    c0215q = new dw(actContext);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    c0215q = new dm(actContext);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                    c0215q = new df(actContext);
                    break;
            }
            this.f4423c = c0215q;
            if (this.aj.size() == 0) {
                m4691b(this.ai);
            }
            Object table2 = super.getTable(ATTR_WIDGET_SKIN);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f4423c.m1542d(a);
                }
            }
            table2 = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f4423c.m1538c(a);
                }
            }
            super.getTable(f4408l);
            LuaNil luaNil = LuaNil.nil;
            if (!(super.getTable(f4402a) == LuaNil.nil && super.getTable(f4403b) == LuaNil.nil)) {
                if (KonyMain.f3657e) {
                    Log.d("LuaSegUI", "Setting the onClickHandleCallback " + this.aA);
                }
                this.f4423c.m1526a(this.aA);
            }
            luaNil = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (luaNil != LuaNil.nil) {
                this.f4423c.m1522a(m3942a(((Boolean) luaNil).booleanValue()));
            }
            super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            luaNil = LuaNil.nil;
            luaNil = super.getTable(f4420x);
            if (luaNil != LuaNil.nil) {
                this.f4425e = luaNil;
                this.f4423c.m1527a(this.ay);
            }
            luaNil = super.getTable(f4415s);
            if (luaNil != LuaNil.nil) {
                Vector vector = ((LuaTable) luaNil).list;
                this.am = ((Double) vector.elementAt(0)).intValue();
                this.an = ((Double) vector.elementAt(1)).intValue();
                this.ao = ((Double) vector.elementAt(2)).intValue();
                this.f4423c.m1539c(this.am > 1);
                this.f4423c.m1543d(this.an < this.ao);
            }
            if (this.ar == 1) {
                luaNil = super.getTable(f4410n);
                if (luaNil != LuaNil.nil) {
                    m4698c((LuaTable) luaNil);
                }
            }
            luaNil = super.getTable(ATTR_WIDGET_MARGIN);
            if (luaNil != LuaNil.nil) {
                this.f4423c.m1530a(convertToScreenPixels(luaNil, this.I, true));
            }
            luaNil = super.getTable(ATTR_WIDGET_PADDING);
            if (luaNil != LuaNil.nil) {
                this.f4423c.m1535b(convertToScreenPixels(luaNil, this.I, true));
            }
            if (this.ar == 2) {
                dm dmVar = (dm) this.f4423c;
                table = super.getTable(f4388B);
                if (table != LuaNil.nil) {
                    boolean booleanValue = ((Boolean) table).booleanValue();
                    dmVar.m3181a(booleanValue);
                    if (booleanValue) {
                        table = super.getTable(f4389C);
                        if (table != LuaNil.nil) {
                            dmVar.m3192c(table.toString());
                        }
                        table = super.getTable(f4390D);
                        if (table != LuaNil.nil) {
                            dmVar.m3198d(table.toString());
                        }
                    }
                }
                table = super.getTable(f4391P);
                if (table != LuaNil.nil) {
                    this.f4426f = table;
                    dmVar.m3179a(this.az);
                }
                table = super.getTable(f4392Q);
                if (table != LuaNil.nil) {
                    dmVar.m3196d(((Double) table).intValue());
                }
            }
            if (this.ar == 1 || this.ar == 3) {
                dB a2;
                C0214p c0214p = (C0214p) this.f4423c;
                table = super.getTable(f4393R);
                if (table != LuaNil.nil) {
                    c0214p.m1518a(Boolean.parseBoolean(table.toString()));
                }
                table = super.getTable(f4394S);
                if (table != LuaNil.nil) {
                    parseDouble = (int) Double.parseDouble(table.toString());
                    if (parseDouble >= 0) {
                        int i2 = -1618442104;
                        LuaNil table3 = super.getTable(f4395T);
                        if (table3 != LuaNil.nil) {
                            i2 = hp.m3351b(table3.toString().trim());
                        }
                        c0214p.m1515a(parseDouble, i2);
                    }
                }
                Object table4 = super.getTable(f4396U);
                if (table4 != LuaNil.nil) {
                    a2 = cN.m2139a(table4);
                    if (a2 != null) {
                        c0214p.m1516a(a2);
                    }
                }
                table4 = super.getTable(f4405i);
                if (table4 != LuaNil.nil) {
                    a2 = cN.m2139a(table4);
                    if (a2 != null) {
                        c0214p.m1519b(a2);
                    }
                }
                table = super.getTable(f4397V);
                if (table != LuaNil.nil) {
                    intern = ((String) table).intern();
                    if (intern == ac) {
                        this.af = 0;
                    } else if (intern == ad) {
                        this.af = 1;
                    } else if (intern == ae) {
                        this.af = 2;
                    }
                    this.f4423c.m1537c(this.af);
                }
                c0214p.m1520b(this.al);
                luaNil = super.getTable(f4398W);
                if (luaNil != LuaNil.nil) {
                    this.ag = (String) luaNil;
                }
                luaNil = super.getTable(f4399X);
                if (luaNil != LuaNil.nil) {
                    this.f4423c.m1528a((String) luaNil);
                }
                luaNil = super.getTable(f4400Y);
                if (luaNil != LuaNil.nil) {
                    this.f4423c.m1534b((String) luaNil);
                }
            }
            table2 = super.getTable(f4413q);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f4423c.m1545e(a);
                }
            }
            this.E = KONY_WIDGET_RESTORE;
            luaNil = super.getTable(f4419w);
            if (!(luaNil == LuaNil.nil || this.ar == 3)) {
                Hashtable hashtable = ((LuaTable) luaNil).map;
                for (parseDouble = 0; parseDouble < this.f4424d.size(); parseDouble++) {
                    if (this.ar == 1) {
                        intern = ((ho) this.f4424d.elementAt(parseDouble)).f1525a;
                        if (intern != null) {
                            ((dw) this.f4423c).m3244a(intern, parseDouble);
                        }
                    }
                    Vector vector2 = ((ho) this.f4424d.elementAt(parseDouble)).f1526b;
                    for (i = 0; i < vector2.size(); i++) {
                        hn hnVar = (hn) vector2.elementAt(i);
                        eO eOVar = (eO) this.ai.createClone();
                        this.ak = eOVar;
                        m4707a(eOVar, hashtable, hnVar.f1524b);
                        this.f4423c.m1525a(eOVar.getWidget(), parseDouble, m4699d(hnVar.f1524b));
                        hnVar.f1523a = eOVar;
                    }
                    vector2.size();
                }
                this.f4423c.m1547f();
            }
            if (this.ar == 3) {
                Iterator it;
                View widget;
                df dfVar = (df) this.f4423c;
                if (this.aw != null) {
                    it = this.aw.iterator();
                    while (it.hasNext()) {
                        widget = ((eO) it.next()).getWidget();
                        widget.setLayoutParams(new LayoutParams(-1, -2));
                        dfVar.m3112b(widget);
                    }
                    if (this.at) {
                        dfVar.m3124d(this.aw.size());
                    }
                }
                if (this.ax != null) {
                    it = this.ax.iterator();
                    while (it.hasNext()) {
                        widget = ((eO) it.next()).getWidget();
                        widget.setLayoutParams(new LayoutParams(-1, -2));
                        dfVar.m3119c(widget);
                    }
                }
                int size = this.f4424d.size();
                parseDouble = 0;
                for (i = 0; i < size; i++) {
                    ho hoVar = (ho) this.f4424d.elementAt(i);
                    String str = hoVar.f1525a;
                    if (str != null) {
                        dfVar.m3105a(str, parseDouble);
                        parseDouble++;
                        this.au = true;
                    }
                    parseDouble += hoVar.f1526b.size();
                }
                if (this.at) {
                    dfVar.m3147t();
                }
                this.as = new hk(this);
                dfVar.m3103a(this.as);
            }
            luaNil = super.getTable(f4417u);
            if (luaNil != LuaNil.nil) {
                if (KonyMain.f3657e) {
                    Log.d("LuaSegUI", "Setting SEGUI FOCUSED INDEX as : " + luaNil);
                }
                if (luaNil != LuaNil.nil) {
                    int intValue = ((Double) luaNil).intValue();
                    if (intValue >= 0) {
                        if (this.at) {
                            intValue = m4694c(intValue);
                        }
                        this.f4423c.m1532b(cr.m2199a(intValue, 0));
                    } else if (intValue == -1) {
                        this.f4423c.m1532b(intValue);
                    }
                }
            }
            if (this.af == 1 || this.af == 2) {
                table2 = super.getTable(f4422z);
                if (table2 != LuaNil.nil) {
                    m4692b(table2);
                } else {
                    this.f4423c.m1552k();
                }
            }
            if (this.ar == 2) {
                luaNil = super.getTable("pagewidthinpercent");
                if (luaNil != LuaNil.nil) {
                    m4684a(((Double) luaNil).doubleValue(), true);
                } else {
                    luaNil = super.getTable("pagewidthinpixel");
                    if (luaNil != LuaNil.nil) {
                        m4684a(((Double) luaNil).doubleValue(), false);
                    }
                }
            }
        }
        this.f4423c.m1541d();
        return this.f4423c.m1536c();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            if (this.ar == 2) {
                LuaNil table = super.getTable("pagewidthinpercent");
                if (table != LuaNil.nil) {
                    m4684a(((Double) table).doubleValue(), true);
                }
            }
            this.f4423c.m1553l();
        }
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4423c.m1548g();
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
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4423c.m1522a(m3942a(z));
        }
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
    }

    public final void setWeight() {
    }

    public final void setWidth(int i) {
    }
}
