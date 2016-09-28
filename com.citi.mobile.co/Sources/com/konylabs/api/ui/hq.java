package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import ny0k.cN;
import ny0k.cr;

public final class hq extends LuaWidget {
    private static String f4428d;
    private static String f4429e;
    private static String f4430f;
    private static String f4431g;
    private static String f4432h;
    private static String f4433i;
    private static String f4434j;
    private static String f4435k;
    private static String f4436l;
    private static String f4437m;
    private static String f4438n;
    private static String f4439o;
    private static String f4440p;
    private static String f4441q;
    private static String f4442r;
    private static String f4443s;
    private static String f4444t;
    private static String f4445u;
    private static String f4446v;
    private static String f4447w;
    private static String f4448x;
    private boolean f4449A;
    private int f4450B;
    private dB f4451C;
    private dB f4452D;
    private dB f4453P;
    private Function f4454Q;
    private LuaTable f4455R;
    private String f4456S;
    private String f4457T;
    private int f4458U;
    private int f4459V;
    private dM f4460W;
    private dN f4461X;
    dK f4462a;
    ArrayList f4463b;
    Object f4464c;
    private int f4465y;
    private boolean f4466z;

    static {
        f4428d = "activeskin";
        f4429e = "inactiveskin";
        f4430f = "activefocusskin";
        f4431g = "viewtype";
        f4432h = "ontabclick";
        f4433i = "screenlevelwidget";
        f4434j = "retainpositionintab";
        f4435k = "activetabs";
        f4436l = "tabheaderheight";
        f4437m = "viewconfig";
        f4438n = "collapsibleviewconfig";
        f4439o = "onclick";
        f4440p = "expandedimage";
        f4441q = "collapsedimage";
        f4442r = "imageposition";
        f4443s = "tabnamealignment";
        f4444t = "toggletabs";
        f4445u = "pageviewconfig";
        f4446v = "needpageindicator";
        f4447w = "pageondotimage";
        f4448x = "pageoffdotimage";
        if (KonyMain.m4057C()) {
            f4428d = "activeSkin";
            f4429e = "inactiveSkin";
            f4430f = "activeFocusSkin";
            f4431g = "viewType";
            f4432h = "onTabClick";
            f4433i = "screenLevelWidget";
            f4434j = "retainPositionInTab";
            f4435k = "activeTabs";
            f4436l = "tabHeaderHeight";
            f4437m = "viewConfig";
            f4438n = "collapsibleViewConfig";
            f4439o = "onClick";
            f4440p = "expandedImage";
            f4441q = "collapsedImage";
            f4442r = "imagePosition";
            f4443s = "tabNameAlignment";
            f4444t = "toggleTabs";
            f4445u = "pageViewConfig";
            f4446v = "needPageIndicator";
            f4447w = "pageOnDotImage";
            f4448x = "pageOffDotImage";
        }
    }

    public hq(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4465y = 1;
        this.f4463b = new ArrayList();
        this.f4466z = false;
        this.f4449A = false;
        this.f4450B = 64;
        this.f4458U = ad.f2566a;
        this.f4459V = 1;
        this.f4460W = new dM(this);
        this.f4461X = new dN(this);
        this.f4464c = null;
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable(f4428d);
        if (table != LuaNil.nil) {
            super.setTable(f4428d, table);
        }
        table = luaTable.getTable(f4429e);
        if (table != LuaNil.nil) {
            super.setTable(f4429e, table);
        }
        table = luaTable.getTable(f4430f);
        if (table != LuaNil.nil) {
            super.setTable(f4430f, table);
        }
        table = luaTable.getTable(f4431g);
        if (table != LuaNil.nil) {
            super.setTable(f4431g, table);
            this.f4465y = ((Double) table).intValue();
        }
        table = luaTable.getTable(f4437m);
        if (table != LuaNil.nil) {
            super.setTable(f4437m, table);
        }
        table = luaTable.getTable(f4432h);
        if (table != LuaNil.nil) {
            super.setTable(f4432h, table);
        }
        table = luaTable.getTable(f4433i);
        if (table != LuaNil.nil) {
            super.setTable(f4433i, table);
            this.f4449A = ((Boolean) table).booleanValue();
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(f4434j);
        if (table != LuaNil.nil) {
            super.setTable(f4434j, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGNMENT, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
        }
        table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_HEIGHT);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_CONTAINER_HEIGHT, table);
            this.N = ((Double) table).floatValue();
        }
        table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE, table);
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(f4436l);
            if (table != LuaNil.nil) {
                super.setTable(f4436l, table);
            }
            if (luaTable3.getTable(ATTR_WIDGET_PROP_DEPRECATED) != LuaNil.nil) {
                table = ((LuaTable) luaTable3.getTable(ATTR_WIDGET_PROP_DEPRECATED)).getTable("activetab");
                if (table != LuaNil.nil && this.f4465y == 2 && (table instanceof String)) {
                    super.setTable(f4435k, Double.valueOf(Double.parseDouble(table.toString())));
                }
            }
        }
        if (super.getTable(f4435k) == LuaNil.nil) {
            table = luaTable.getTable(f4435k);
            if (table != LuaNil.nil) {
                super.setTable(f4435k, table);
            }
        }
    }

    private void m4719a(ad adVar, hs hsVar, int i) {
        adVar.getClass();
        ah ahVar = new ah(adVar, hsVar.f1529a, hsVar.f1530b, hsVar.f1531c);
        adVar.getClass();
        af afVar = new af(adVar, ahVar);
        afVar.m517a((C0174B) hsVar.f1532d.getWidget());
        if (hsVar.f1533e != null) {
            afVar.m518a(this.f4460W);
        }
        if (this.f4451C != null) {
            ahVar.m540a(this.f4451C);
        }
        if (this.f4452D != null) {
            ahVar.m546b(this.f4452D);
        }
        if (this.f4453P != null) {
            ahVar.m548c(this.f4453P);
        }
        if (this.f4454Q != null) {
            ahVar.m541a(this.f4461X);
        }
        if (this.f4456S != null) {
            ahVar.m542a(this.f4456S);
        }
        if (this.f4457T != null) {
            ahVar.m547b(this.f4457T);
        }
        ahVar.m545b(this.f4458U);
        ahVar.m538a(this.f4459V);
        ahVar.m539a(afVar);
        if (i >= 0) {
            adVar.m2578a(ahVar, i);
        } else {
            adVar.m2577a(ahVar);
        }
    }

    private void m4720a(dO dOVar, hs hsVar, int i) {
        dOVar.getClass();
        String str = hsVar.f1529a;
        String str2 = hsVar.f1530b;
        String str3 = hsVar.f1531c;
        dT dTVar = new dT(dOVar, str, str2);
        dTVar.f1136a = new dL(this, hsVar.f1532d);
        if (i < 0 || i >= this.f4463b.size()) {
            dOVar.m3040a(dTVar);
        } else {
            dOVar.m3041a(dTVar, i);
        }
    }

    private void m4721a(dU dUVar, hs hsVar, int i) {
        dUVar.getClass();
        dW dWVar = new dW(dUVar, hsVar.f1529a, hsVar.f1530b, hsVar.f1531c, i);
        dWVar.m1197a(new dL(this, hsVar.f1532d));
        dUVar.m3069a(dWVar);
    }

    private void m4722a(Object obj) {
        Object table;
        LuaTable luaTable;
        LuaNil table2;
        if (this.f4465y == 1 && (obj instanceof LuaTable)) {
            table = ((LuaTable) obj).getTable(f4438n);
            if (table instanceof LuaTable) {
                luaTable = (LuaTable) table;
                table2 = luaTable.getTable(f4439o);
                if (table2 != LuaNil.nil) {
                    this.f4454Q = (Function) table2;
                }
                table2 = luaTable.getTable(f4440p);
                if (table2 != LuaNil.nil) {
                    this.f4456S = (String) table2;
                    if (this.E == KONY_WIDGET_RESTORE) {
                        ((ad) this.f4462a).m2580a(this.f4456S);
                    }
                }
                table2 = luaTable.getTable(f4441q);
                if (table2 != LuaNil.nil) {
                    this.f4457T = (String) table2;
                    if (this.E == KONY_WIDGET_RESTORE) {
                        ((ad) this.f4462a).m2584b(this.f4457T);
                    }
                }
                table2 = luaTable.getTable(f4442r);
                if (table2 != LuaNil.nil) {
                    if (((Double) table2).intValue() == 1) {
                        this.f4459V = 0;
                    } else {
                        this.f4459V = 1;
                    }
                    if (this.E == KONY_WIDGET_RESTORE) {
                        ((ad) this.f4462a).m2583b(this.f4459V);
                    }
                }
                table2 = luaTable.getTable(f4443s);
                if (table2 != LuaNil.nil) {
                    int intValue = ((Double) table2).intValue();
                    if (intValue == 1) {
                        this.f4458U = ad.f2566a;
                    } else if (intValue == 2) {
                        this.f4458U = ad.f2567b;
                    } else {
                        this.f4458U = ad.f2568c;
                    }
                    if (this.E == KONY_WIDGET_RESTORE) {
                        ((ad) this.f4462a).m2589c(this.f4458U);
                    }
                }
                table2 = luaTable.getTable(f4444t);
                if (table2 != LuaNil.nil && this.f4465y == 1) {
                    ((ad) this.f4462a).m2581a(((Boolean) table2).booleanValue());
                }
            }
        } else if (this.f4465y == 3 && (obj instanceof LuaTable)) {
            table = ((LuaTable) obj).getTable(f4445u);
            if (table instanceof LuaTable) {
                luaTable = (LuaTable) table;
                LuaNil table3 = luaTable.getTable(f4446v);
                if (table3 != LuaNil.nil) {
                    ((dO) this.f4462a).m3043a(((Boolean) table3).booleanValue());
                } else {
                    ((dO) this.f4462a).m3043a(true);
                }
                table3 = luaTable.getTable(f4447w);
                if (table3 != LuaNil.nil) {
                    ((dO) this.f4462a).m3042a((String) table3);
                }
                table2 = luaTable.getTable(f4448x);
                if (table2 != LuaNil.nil) {
                    ((dO) this.f4462a).m3045b((String) table2);
                }
            }
        }
    }

    private void m4723a(int[] iArr) {
        if (iArr != null) {
            this.f4455R = new LuaTable();
            for (int a : iArr) {
                this.f4455R.add(Double.valueOf((double) cr.m2199a(a, 1)));
            }
        }
        super.setTable(f4435k, this.f4455R);
    }

    private Object m4724b(Object obj) {
        if (this.E == KONY_WIDGET_BACKUP) {
            return super.getTable(obj);
        }
        String intern = ((String) obj).intern();
        if (intern != f4435k) {
            return null;
        }
        m4723a(this.f4462a.m1175b());
        return super.getTable(intern);
    }

    private void m4725e() {
        if (this.E == KONY_WIDGET_RESTORE) {
            View d = this.f4462a.m1179d();
            ViewGroup viewGroup = (ViewGroup) d.getParent();
            int indexOfChild = viewGroup.indexOfChild(d);
            viewGroup.removeView(d);
            cleanup();
            viewGroup.addView(getWidget(), indexOfChild);
        }
    }

    private void m4726f() {
        if (this.f4455R != null && this.f4455R.list.size() > 0) {
            int[] iArr = new int[this.f4455R.list.size()];
            for (int i = 0; i < this.f4455R.list.size(); i++) {
                iArr[i] = cr.m2199a(((Double) this.f4455R.list.get(i)).intValue(), 0);
            }
            if (this.E == KONY_WIDGET_RESTORE) {
                this.f4462a.m1178c(iArr);
            }
        }
    }

    protected final void m4727a(Object obj, Object obj2) {
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == f4435k) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f4455R = null;
                } else {
                    this.f4455R = (LuaTable) obj2;
                }
                m4726f();
            } else if (intern == "showtabline" && obj2 != LuaNil.nil) {
                this.f4462a.m1173b(((Boolean) obj2).booleanValue());
            } else if (intern == ATTR_WIDGET_MARGIN) {
                this.f4462a.m1172a(convertMarginsToPixels(obj2, this.I));
            } else if (intern == ATTR_WIDGET_PADDING) {
                this.f4462a.m1174b(convertPaddingToPixels(obj2, this.I));
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT) {
            } else {
                if (intern == f4437m) {
                    m4722a(obj2);
                } else if (intern == ATTR_WIDGET_ISVISIBLE) {
                    if (obj2 != null && obj2 != LuaNil.nil) {
                        this.f4462a.m1170a(m3942a(((Boolean) obj2).booleanValue()));
                    }
                } else if (intern == f4434j) {
                    if (obj2 != null && obj2 != LuaNil.nil) {
                        dK dKVar = this.f4462a;
                        ((Boolean) obj2).booleanValue();
                    }
                } else if (intern == f4431g) {
                    this.f4465y = ((Double) obj2).intValue();
                    if (!(this.f4465y == 2 || this.f4465y == 1 || this.f4465y == 3)) {
                        this.f4465y = 1;
                    }
                    View d = this.f4462a.m1179d();
                    ViewGroup viewGroup = (ViewGroup) d.getParent();
                    int indexOfChild = viewGroup.indexOfChild(d);
                    viewGroup.removeView(d);
                    cleanup();
                    viewGroup.addView(getWidget(), indexOfChild);
                } else if (intern == f4428d) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        this.f4451C = r0;
                    }
                    this.f4462a.m1171a(this.f4451C, this.f4453P, this.f4452D);
                } else if (intern == f4430f) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        this.f4452D = r0;
                    }
                    this.f4462a.m1171a(this.f4451C, this.f4453P, this.f4452D);
                } else if (intern == f4429e) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        this.f4453P = r0;
                    }
                    this.f4462a.m1171a(this.f4451C, this.f4453P, this.f4452D);
                } else if (intern == ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE) {
                    r0 = cr.m2201a(obj2, 1);
                    if (r0 != null && r0 != LuaNil.nil) {
                        this.M = ((Double) r0).intValue();
                        m4735p();
                    }
                } else if (intern == ATTR_WIDGET_CONTAINER_HEIGHT) {
                    r0 = cr.m2201a(obj2, 1);
                    if (r0 != null && r0 != LuaNil.nil) {
                        this.N = ((Double) r0).floatValue();
                        m4735p();
                    }
                }
            }
        }
    }

    public final void m4728a(Object[] objArr) {
        hs hsVar = new hs(this);
        if (!(objArr[1] == null || objArr[1] == LuaNil.nil)) {
            hsVar.f1529a = (String) objArr[1];
        }
        if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
            hsVar.f1530b = (String) objArr[2];
        }
        if (!(objArr[3] == null || objArr[3] == LuaNil.nil)) {
            hsVar.f1531c = (String) objArr[3];
        }
        if (!(objArr[4] == null || objArr[4] == LuaNil.nil)) {
            hsVar.f1532d = (eO) objArr[4];
        }
        if (!(objArr.length <= 5 || objArr[5] == null || objArr[5] == LuaNil.nil)) {
            hsVar.f1533e = (Function) objArr[5];
        }
        if (objArr.length > 6 && objArr[6] != null) {
            LuaNil luaNil = LuaNil.nil;
        }
        hsVar.f1532d.setParent(this);
        this.f4463b.add(hsVar);
        if (this.E != KONY_WIDGET_RESTORE) {
            return;
        }
        if (this.f4465y == 1) {
            m4719a((ad) this.f4462a, hsVar, -1);
        } else if (this.f4465y == 3) {
            m4720a((dO) this.f4462a, hsVar, -1);
        } else {
            m4721a((dU) this.f4462a, hsVar, this.f4463b.size() - 1);
        }
    }

    public final void m4729b(Object[] objArr) {
        hs hsVar = new hs(this);
        if (!(objArr[1] == null || objArr[1] == LuaNil.nil)) {
            hsVar.f1529a = (String) objArr[1];
        }
        if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
            hsVar.f1530b = (String) objArr[2];
        }
        if (!(objArr[3] == null || objArr[3] == LuaNil.nil)) {
            hsVar.f1531c = (String) objArr[3];
        }
        if (!(objArr[4] == null || objArr[4] == LuaNil.nil)) {
            hsVar.f1532d = (eO) objArr[4];
        }
        int a = (objArr[5] == null || objArr[5] == LuaNil.nil) ? 0 : cr.m2199a(((Double) objArr[5]).intValue(), 0);
        hsVar.f1532d.setParent(this);
        int size = (a < 0 || a > this.f4463b.size()) ? this.f4463b.size() : a;
        this.f4463b.add(size, hsVar);
        if (this.E == KONY_WIDGET_RESTORE) {
            m4723a(this.f4462a.m1175b());
            if (this.f4465y == 1) {
                m4719a((ad) this.f4462a, hsVar, size);
            } else if (this.f4465y == 3) {
                m4720a((dO) this.f4462a, hsVar, size);
            } else {
                m4725e();
            }
            m4726f();
        }
    }

    public final boolean m4730b() {
        return (this.N == -1.0f && this.f4465y != 1) ? this.f4465y == 3 ? true : this.f4449A : false;
    }

    public final int m4731c() {
        return this.E;
    }

    public final void m4732c(Object[] objArr) {
        if (objArr[1] != null && objArr[1] != LuaNil.nil) {
            int a = cr.m2199a(((Double) objArr[1]).intValue(), 0);
            if (a < this.f4463b.size()) {
                this.f4463b.remove(a);
                if (this.E == KONY_WIDGET_RESTORE) {
                    m4723a(this.f4462a.m1175b());
                    if (this.f4465y == 2) {
                        m4725e();
                    } else {
                        this.f4462a.m1180d(a);
                    }
                    m4726f();
                }
            }
        }
    }

    public final void cleanup() {
        int[] iArr;
        if (this.f4462a != null) {
            int[] b = this.f4462a.m1175b();
            this.f4462a.m1176c();
            Iterator it = this.f4463b.iterator();
            while (it.hasNext()) {
                hs hsVar = (hs) it.next();
                if (hsVar.f1532d != null) {
                    hsVar.f1532d.cleanup();
                }
            }
            this.f4462a = null;
            iArr = b;
        } else {
            iArr = null;
        }
        this.f4455R = null;
        this.E = KONY_WIDGET_BACKUP;
        m4723a(iArr);
    }

    public final LuaWidget createClone() {
        return null;
    }

    public final void m4733d() {
        this.f4466z = true;
        if (this.I != null && (this.I instanceof fv)) {
            ((fv) this.I).m4458l();
        }
    }

    public final void m4734d(Object[] objArr) {
        if (objArr[1] != null && objArr[1] != LuaNil.nil) {
            String obj = objArr[1].toString();
            Iterator it = this.f4463b.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2;
                hs hsVar = (hs) it.next();
                if (hsVar.f1529a.equals(obj)) {
                    this.f4463b.remove(hsVar);
                    i2 = 1;
                } else {
                    i2 = i;
                }
                i = i2;
            }
            if (i != 0 && this.E == KONY_WIDGET_RESTORE) {
                m4723a(this.f4462a.m1175b());
                if (this.f4465y == 2) {
                    m4725e();
                } else {
                    this.f4462a.m1177c(obj);
                }
                m4726f();
            }
        }
    }

    public final LuaWidget getChildWidget(String str) {
        for (int i = 0; i < this.f4463b.size(); i++) {
            LuaWidget luaWidget = ((hs) this.f4463b.get(i)).f1532d;
            if (luaWidget.getID().equals(str)) {
                return luaWidget;
            }
        }
        return null;
    }

    public final ArrayList getChildWidgets() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f4463b.size(); i++) {
            arrayList.add(((hs) this.f4463b.get(i)).f1532d);
        }
        return this.f4463b.size() > 0 ? arrayList : null;
    }

    public final String getID() {
        return super.getTable(ATTR_WIDGET_ID).toString();
    }

    public final LuaWidget getParent() {
        return this.I;
    }

    public final Hashtable getProperties() {
        Hashtable hashtable = new Hashtable();
        hashtable.put(f4435k, "table");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (this.E == KONY_WIDGET_BACKUP) {
            return super.getTable(obj);
        }
        if (((String) obj).intern() != f4435k) {
            return super.getTable(obj);
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4724b(obj);
        }
        Object iiVar;
        synchronized (this) {
            this.f4464c = null;
            iiVar = new ii(new hr(this, obj));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
            iiVar = this.f4464c;
            this.f4464c = null;
        }
        return iiVar;
    }

    public final String getType() {
        return "TabPane";
    }

    public final View getWidget() {
        dB dBVar = null;
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            if (this.f4465y == 1) {
                this.f4462a = new ad(KonyMain.getActContext());
            } else if (this.f4465y == 3) {
                this.f4462a = new dO(KonyMain.getActContext(), this.f4460W, this.f4461X);
            } else {
                this.f4462a = new dU(KonyMain.getActContext(), this.f4460W, this.f4461X);
            }
            Object table = super.getTable(f4428d);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4451C = a;
                }
            }
            table = super.getTable(f4429e);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4453P = a;
                }
            }
            table = super.getTable(f4430f);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4452D = a;
                }
            }
            LuaNil table2 = super.getTable(f4435k);
            if (table2 != LuaNil.nil) {
                if (table2 instanceof LuaTable) {
                    this.f4455R = (LuaTable) table2;
                } else if (table2 instanceof Double) {
                    this.f4455R = new LuaTable(1, 0);
                    this.f4455R.add(table2);
                }
            }
            table = super.getTable(f4437m);
            if (table != LuaNil.nil) {
                m4722a(table);
            }
            table2 = super.getTable(f4432h);
            if (table2 != LuaNil.nil) {
                this.f4454Q = (Function) table2;
            }
            table2 = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table2 != LuaNil.nil) {
                this.f4462a.m1170a(m3942a(((Boolean) table2).booleanValue()));
            }
            table2 = super.getTable(f4434j);
            if (table2 != LuaNil.nil) {
                dK dKVar = this.f4462a;
                ((Boolean) table2).booleanValue();
            }
            table2 = super.getTable(ATTR_WIDGET_PADDING);
            if (table2 != LuaNil.nil) {
                this.f4462a.m1174b(convertPaddingToPixels(table2, this.I));
            }
            table2 = super.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                this.f4462a.m1172a(convertMarginsToPixels(table2, this.I));
            }
            table2 = super.getTable("showtabline");
            if (table2 != LuaNil.nil) {
                this.f4462a.m1173b(((Boolean) table2).booleanValue());
            }
            super.getTable(ATTR_WIDGET_ALIGNMENT);
            table2 = LuaNil.nil;
            super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            table2 = LuaNil.nil;
            table2 = super.getTable(f4436l);
            if (table2 != LuaNil.nil) {
                this.f4450B = ((Double) table2).intValue();
            }
            table = super.getTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE);
            if (table != LuaNil.nil) {
                table = cr.m2201a(table, 1);
                if (table != null) {
                    this.M = ((Double) table).intValue();
                }
            }
            table = super.getTable(ATTR_WIDGET_CONTAINER_HEIGHT);
            if (table != LuaNil.nil) {
                table = cr.m2201a(table, 1);
                if (table != null) {
                    this.N = ((Double) table).floatValue();
                    m4735p();
                }
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.f4465y == 2) {
                dU dUVar = (dU) this.f4462a;
                dB dBVar2 = this.f4451C != null ? this.f4451C : null;
                dB dBVar3 = this.f4453P != null ? this.f4453P : null;
                if (this.f4452D != null) {
                    dBVar = this.f4452D;
                }
                dUVar.m3073b(dBVar2, dBVar3, dBVar);
                dUVar.m3070a(m4730b());
                dUVar.m3072b(this.f4450B);
                Iterator it = this.f4463b.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int i2 = i + 1;
                    m4721a((dU) this.f4462a, (hs) it.next(), i);
                    i = i2;
                }
            } else if (this.f4465y == 3) {
                r2 = this.f4463b.iterator();
                while (r2.hasNext()) {
                    m4720a((dO) this.f4462a, (hs) r2.next(), -1);
                }
            } else {
                r2 = this.f4463b.iterator();
                while (r2.hasNext()) {
                    m4719a((ad) this.f4462a, (hs) r2.next(), -1);
                }
            }
            if (this.f4463b.size() > 0) {
                m4726f();
            }
            if (this.G) {
                setWeight();
            }
        }
        if (this.f4466z) {
            m4733d();
        }
        return this.f4462a.m1179d();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4462a.m1174b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4462a.m1172a(convertMarginsToPixels(table, this.I));
            }
            this.f4462a.m1183f();
        }
    }

    protected final void m4735p() {
        switch (this.M) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (this.N >= 0.0f) {
                    this.f4462a.m1182e(O != -1 ? (int) ((((float) O) * this.N) / 100.0f) : (int) ((((float) KonyMain.getActContext().m4167p()) * this.N) / 100.0f));
                } else if (this.N >= 0.0f || !m4730b()) {
                    this.f4462a.m1182e(-2);
                } else {
                    this.f4462a.m1182e(-1);
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (this.N >= 0.0f) {
                    int o = KonyMain.getActContext().m4166o();
                    this.f4462a.m1182e((int) ((((float) (this.I instanceof eO ? (int) (((eO) this.I).m4231m() * ((float) o)) : o)) * this.N) / 100.0f));
                } else if (this.N >= 0.0f || !m4730b()) {
                    this.f4462a.m1182e(-2);
                } else {
                    this.f4462a.m1182e(-1);
                }
            default:
        }
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4462a.m1181e();
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
    }

    public final void setParent(LuaWidget luaWidget) {
        super.setParent(luaWidget);
        if (luaWidget != null && this.I != null) {
            for (int i = 0; i < this.f4463b.size(); i++) {
                LuaTable luaTable = ((hs) this.f4463b.get(i)).f1532d;
                if (luaTable != null) {
                    this.I.setTable(luaTable.getTable(LuaWidget.ATTR_WIDGET_ID), luaTable);
                    if (luaTable instanceof eO) {
                        int i2;
                        eO eOVar = (eO) luaTable;
                        for (i2 = 0; i2 < eOVar.f3720i.size(); i2++) {
                            LuaTable luaTable2 = (LuaTable) eOVar.f3720i.get(i2);
                            this.I.setTable((String) luaTable2.getTable(LuaWidget.ATTR_WIDGET_ID), luaTable2);
                        }
                        if (!eOVar.f3721j.isEmpty()) {
                            for (i2 = 0; i2 < eOVar.f3721j.size(); i2++) {
                                LuaTable luaTable3 = (LuaTable) eOVar.f3721j.get(i2);
                                this.I.setTable((String) luaTable3.getTable(LuaWidget.ATTR_WIDGET_ID), luaTable3);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        if (((String) obj).intern() == f4432h) {
            this.f4454Q = (Function) obj2;
        } else if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(obj, obj2);
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4462a.m1170a(m3942a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4462a.m1169a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
    }

    public final String toString() {
        return "LuaTabWidget: " + getTable(ATTR_WIDGET_ID);
    }
}
