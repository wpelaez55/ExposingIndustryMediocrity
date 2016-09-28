package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.konylabs.vmintf.KonyJSVM;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import net.sourceforge.zbar.Config;
import ny0k.C0288a;
import ny0k.cN;
import ny0k.cr;

public final class gL extends LuaWidget {
    public static Vector f4138a;
    private static Vector ab;
    public static int f4139b;
    private static String f4140c;
    private static String f4141d;
    private static String f4142e;
    private static String f4143f;
    private static String f4144g;
    private static String f4145h;
    private static String f4146i;
    private static String f4147j;
    private static String f4148k;
    private static String f4149l;
    private static String f4150m;
    private static String f4151n;
    private static String f4152o;
    private static String f4153p;
    private static String f4154q;
    private static String f4155r;
    private static String f4156s;
    private static gL f4157t;
    private static int f4158u;
    private static int f4159v;
    private static int f4160w;
    private static int f4161x;
    private LuaWidget f4162A;
    private Vector f4163B;
    private Vector f4164C;
    private Vector f4165D;
    private Object f4166P;
    private Object f4167Q;
    private LuaTable f4168R;
    private LuaTable f4169S;
    private LuaTable f4170T;
    private gL f4171U;
    private View f4172V;
    private View f4173W;
    private View f4174X;
    private View f4175Y;
    private int f4176Z;
    private boolean aa;
    private cG ac;
    private cF ad;
    private int f4177y;
    private cz f4178z;

    static {
        f4140c = "type";
        f4141d = "init";
        f4142e = "addwidgets";
        f4143f = "ismodal";
        f4144g = "onhide";
        f4145h = "footers";
        f4146i = "headers";
        f4147j = "transparencybehindthepopup";
        f4148k = "windowsoftinputmode";
        f4149l = "ondeviceback";
        f4150m = "animation";
        f4151n = "intransitionconfig";
        f4152o = "outtransitionconfig";
        f4153p = "containerheight";
        f4154q = "propagatetouchestoform";
        f4155r = "focusable";
        f4156s = "enablescrolling";
        if (KonyMain.m4057C()) {
            f4142e = "addWidgets";
            f4143f = "isModal";
            f4147j = "transparencyBehindThePopup";
            f4144g = "onHide";
            f4148k = "windowSoftInputMode";
            f4149l = "onDeviceBack";
            f4151n = "inTransitionConfig";
            f4152o = "outTransitionConfig";
            f4153p = "containerHeight";
            f4154q = "propagateTouchesToForm";
            f4156s = "enableScrolling";
        }
        f4138a = new Vector(5);
        f4157t = null;
        f4158u = 0;
        f4159v = 1;
        f4160w = 0;
        f4139b = 1;
        f4161x = 2;
        ab = new Vector();
    }

    public gL(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4177y = 0;
        this.f4178z = null;
        this.f4162A = null;
        this.f4163B = new Vector(10);
        this.f4164C = new Vector(10);
        this.f4165D = new Vector(10);
        this.f4166P = null;
        this.f4167Q = null;
        this.f4176Z = 3;
        this.ac = new gS(this);
        this.ad = new cF(this);
        if (KonyMain.m4056B()) {
            this.f4168R = luaTable;
            this.f4169S = luaTable2;
            this.f4170T = luaTable3;
        }
        m4535a(luaTable, luaTable2, luaTable3);
    }

    static /* synthetic */ void m4533a(gL gLVar, gL gLVar2) {
        if (gLVar2 != null) {
            if (gLVar2 != gLVar.m4548q()) {
                gLVar2.f4171U = gLVar.m4548q();
            }
            int t = gLVar.m4551t();
            if (!ab.contains(gLVar)) {
                ab.add(gLVar);
            }
            if (gLVar.f4171U != null) {
                gLVar.f4171U.m4534a(gLVar2, gLVar, t);
            } else {
                gLVar.m4534a(gLVar2, null, t);
            }
        }
    }

    private void m4534a(gL gLVar, gL gLVar2, int i) {
        if (this.E != 0) {
            View view;
            int intValue;
            if (!(gLVar == this || ab.contains(gLVar))) {
                ab.add(gLVar);
            }
            if (this.f4171U == null && this.f4172V == null) {
                this.f4172V = getWidget();
                this.f4173W = this.f4178z.m1098l();
                this.f4174X = this.f4178z.m1097k();
                this.f4175Y = this.f4178z.m1099m();
            }
            View widget = gLVar.getWidget();
            View k = gLVar.f4178z.m1097k();
            View l = gLVar.f4178z.m1098l();
            View m = gLVar.f4178z.m1099m();
            if (gLVar == this) {
                view = this.f4172V;
                widget = this.f4174X;
                k = this.f4173W;
                l = this.f4175Y;
                this.f4178z.m1091g(widget);
                this.f4178z.m1093h(k);
                this.f4178z.m1100n();
                this.f4178z.m1101o();
                Iterator it = this.f4164C.iterator();
                while (it.hasNext()) {
                    this.f4178z.m1083d(((LuaWidget) it.next()).getWidget());
                }
                it = this.f4165D.iterator();
                while (it.hasNext()) {
                    this.f4178z.m1086e(((LuaWidget) it.next()).getWidget());
                }
            } else {
                view = widget;
                widget = k;
                k = l;
                l = m;
            }
            Animation a = (i == -1 || i == 0) ? C0288a.m1858a("left_out") : C0288a.m1857a(i, false);
            getWidget().setAnimation(a);
            LuaNil table = super.getTable(f4151n);
            if (table != LuaNil.nil) {
                table = ((LuaTable) table).getTable(f4150m);
                if (table != LuaNil.nil) {
                    intValue = ((Double) table).intValue();
                    a = (intValue != -1 || intValue == 0) ? C0288a.m1858a("left_in") : C0288a.m1857a(intValue, false);
                    view.setAnimation(a);
                    a.setAnimationListener(new gP(this, gLVar2));
                    this.f4178z.m1089f(view);
                    if (gLVar != this) {
                        this.f4178z.m1091g(widget);
                        this.f4178z.m1093h(k);
                    }
                    this.f4178z.m1095i(l);
                }
            }
            intValue = -1;
            if (intValue != -1) {
            }
            view.setAnimation(a);
            a.setAnimationListener(new gP(this, gLVar2));
            this.f4178z.m1089f(view);
            if (gLVar != this) {
                this.f4178z.m1091g(widget);
                this.f4178z.m1093h(k);
            }
            this.f4178z.m1095i(l);
        }
    }

    private void m4535a(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable("title");
        if (table != LuaNil.nil) {
            super.setTable("title", table);
        }
        table = luaTable.getTable(f4140c);
        if (table != LuaNil.nil) {
            super.setTable(f4140c, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(f4141d);
        if (table != LuaNil.nil) {
            super.setTable(f4141d, table);
        }
        table = luaTable.getTable(f4142e);
        if (table != LuaNil.nil) {
            super.setTable(f4142e, table);
        }
        table = luaTable.getTable(f4143f);
        if (table != LuaNil.nil) {
            super.setTable(f4143f, table);
        }
        table = luaTable.getTable(f4147j);
        if (table != LuaNil.nil) {
            super.setTable(f4147j, table);
        }
        table = luaTable.getTable(f4144g);
        if (table != LuaNil.nil) {
            super.setTable(f4144g, table);
        }
        table = luaTable.getTable(f4145h);
        if (table != LuaNil.nil) {
            super.setTable(f4145h, table);
        }
        table = luaTable.getTable(f4146i);
        if (table != LuaNil.nil) {
            super.setTable(f4146i, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING, table);
            }
            table = luaTable2.getTable(f4153p);
            if (table != LuaNil.nil) {
                super.setTable(f4153p, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_HEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_HEIGHT, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE, table);
            }
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(f4148k);
            if (table != LuaNil.nil) {
                super.setTable(f4148k, table);
            }
            table = luaTable3.getTable(f4149l);
            if (table != LuaNil.nil) {
                super.setTable(f4149l, table);
            }
            table = luaTable3.getTable(f4151n);
            if (table != LuaNil.nil) {
                super.setTable(f4151n, table);
            }
            table = luaTable3.getTable(f4152o);
            if (table != LuaNil.nil) {
                super.setTable(f4152o, table);
            }
            table = luaTable3.getTable(f4155r);
            if (table != LuaNil.nil) {
                super.setTable(f4155r, table);
            }
        }
    }

    private void m4536a(String str) {
        String intern = str.intern();
        if (intern == "left") {
            this.f4178z.m1073b(11);
        } else if (intern == "right") {
            this.f4178z.m1073b(3);
        } else if (intern == "center") {
            this.f4178z.m1073b(5);
        } else if (intern == "top") {
            this.f4178z.m1073b(10);
        } else {
            intern = "bottom";
            this.f4178z.m1073b(7);
        }
    }

    public static View m4543h() {
        return (f4157t == null || f4157t.f4178z == null || !f4157t.f4178z.isShowing()) ? null : f4157t.getWidget();
    }

    public static void m4544j() {
        for (int i = 0; i < f4138a.size(); i++) {
            gL gLVar = (gL) f4138a.get(i);
            gLVar.m4568i();
            gLVar.cleanup();
        }
        f4138a.clear();
    }

    public static Object[] m4545m() {
        if (f4157t == null || f4157t.f4178z == null || !f4157t.f4178z.isShowing()) {
            return null;
        }
        return new Object[]{f4157t};
    }

    private void m4546n() {
        int i;
        String str;
        gL gLVar;
        int i2 = 0;
        this.f4178z = new cz(KonyMain.getActContext());
        Object table = super.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            dB a = cN.m2139a(table);
            if (a != null) {
                this.f4178z.m1068a(a);
            }
        } else {
            hp hpVar = new hp();
            hpVar.m3352a().m1128b(-1);
            this.f4178z.m1068a(hpVar.m3352a());
        }
        LuaNil table2 = super.getTable("title");
        if (table2 != LuaNil.nil) {
            this.f4178z.m1069a(table2.toString());
        }
        table2 = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
        if (table2 != LuaNil.nil) {
            if (KonyMain.f3657e) {
                Log.d("LuaPopUp", "PopUp container weight : " + table2);
            }
            setWeight();
        }
        table2 = super.getTable(f4146i);
        if (table2 != LuaNil.nil) {
            this.f4164C.addAll(((LuaTable) table2).list);
        }
        table2 = super.getTable(f4145h);
        if (table2 != LuaNil.nil) {
            this.f4165D.addAll(((LuaTable) table2).list);
        }
        table2 = super.getTable("widget");
        if (table2 != LuaNil.nil) {
            if (KonyMain.f3657e) {
                Log.d("LuaPopUp", "PopUp parent widget : " + table2);
            }
            this.f4178z.m1064a(((LuaWidget) table2).getWidget());
            i = 1;
        } else {
            this.f4178z.m1064a(null);
            i = 0;
        }
        table2 = super.getTable("anchor");
        if (table2 != LuaNil.nil) {
            if (KonyMain.f3657e) {
                Log.d("LuaPopUp", "PopUp anchor : " + table2);
            }
            str = (String) table2;
            gLVar = this;
        } else if (i != 0) {
            str = "bottom";
            gLVar = this;
        } else {
            str = "center";
            gLVar = this;
        }
        gLVar.m4536a(str);
        table2 = super.getTable(f4144g);
        if (table2 != LuaNil.nil) {
            this.f4166P = table2;
        }
        table2 = super.getTable(f4149l);
        if (table2 != LuaNil.nil) {
            this.f4167Q = table2;
        }
        table2 = super.getTable(f4143f);
        if (table2 != LuaNil.nil) {
            this.f4178z.m1070a(((Boolean) table2).booleanValue());
        }
        table2 = super.getTable(f4147j);
        if (table2 != LuaNil.nil) {
            this.f4178z.m1062a(((Double) table2).intValue());
        }
        if (KonyMain.f3657e) {
            Log.d("LuaPopUp", "OnDismiss Call set as " + this.f4166P);
        }
        this.f4178z.m1067a(this.ac);
        this.f4178z.m1066a(this.ad);
        table2 = super.getTable(f4148k);
        if (table2 != LuaNil.nil) {
            int intValue = ((Double) table2).intValue();
            if (intValue == 0) {
                this.f4178z.m1078c(16);
            } else if (intValue == 1) {
                this.f4178z.m1078c(32);
            } else if (intValue == 2) {
                this.f4178z.m1078c((int) Config.X_DENSITY);
            }
        }
        table2 = super.getTable(f4151n);
        if (table2 != LuaNil.nil) {
            table2 = ((LuaTable) table2).getTable(f4150m);
            if (table2 != LuaNil.nil) {
                this.f4178z.m1063a(((Double) table2).intValue(), cz.f1035b);
            }
        }
        table2 = super.getTable(f4152o);
        if (table2 != LuaNil.nil) {
            table2 = ((LuaTable) table2).getTable(f4150m);
            if (table2 != LuaNil.nil) {
                this.f4178z.m1063a(((Double) table2).intValue(), cz.f1036c);
            }
        }
        table = super.getTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE);
        if (table != LuaNil.nil) {
            table = cr.m2201a(table, 1);
            if (table != null) {
                this.f4176Z = ((Double) table).intValue();
            }
        }
        table = super.getTable(ATTR_WIDGET_CONTAINER_HEIGHT);
        if (table != LuaNil.nil) {
            table = cr.m2201a(table, 1);
            if (table != null) {
                this.N = ((Double) table).floatValue();
                m4571p();
            }
        }
        table2 = super.getTable(f4156s);
        if (table2 != LuaNil.nil) {
            this.f4178z.m1087e(((Boolean) table2).booleanValue());
        }
        table2 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table2 != LuaNil.nil && (table2 instanceof LuaTable)) {
            this.f4178z.m1075b(m4553a((LuaTable) table2, this.f4178z.m1060a()));
        }
        table2 = super.getTable(f4154q);
        if (table2 != LuaNil.nil) {
            this.f4178z.m1084d(((Boolean) table2).booleanValue());
        }
        table2 = super.getTable(f4155r);
        if (table2 != LuaNil.nil) {
            this.f4178z.setFocusable(((Boolean) table2).booleanValue());
            this.f4178z.setInputMethodMode(1);
        }
        this.E = f4159v;
        Iterator it = this.f4164C.iterator();
        while (it.hasNext()) {
            this.f4178z.m1083d(((LuaWidget) it.next()).getWidget());
        }
        if (this.f4163B.size() > 0) {
            while (i2 < this.f4163B.size()) {
                this.f4178z.m1074b(((LuaWidget) this.f4163B.get(i2)).getWidget());
                i2++;
            }
        }
        it = this.f4165D.iterator();
        while (it.hasNext()) {
            this.f4178z.m1086e(((LuaWidget) it.next()).getWidget());
        }
        table2 = super.getTable(ATTR_WIDGET_PADDING);
        if (table2 != LuaNil.nil) {
            this.f4178z.m1071a(convertPaddingToPixels(table2, null));
        }
    }

    private void m4547o() {
        if (this.f4177y == 0) {
            m4550s();
        }
        m4549r();
        KonyMain.m4094a(new gO(this));
    }

    private gL m4548q() {
        return this.f4171U != null ? this.f4171U : this;
    }

    private void m4549r() {
        Iterator it;
        LuaNil luaNil = LuaNil.nil;
        luaNil = super.getTable(f4146i);
        if (luaNil != LuaNil.nil) {
            it = ((LuaTable) luaNil).list.iterator();
            while (it.hasNext()) {
                ((eO) it.next()).m4235q();
            }
        }
        luaNil = super.getTable(f4145h);
        if (luaNil != LuaNil.nil) {
            it = ((LuaTable) luaNil).list.iterator();
            while (it.hasNext()) {
                ((eO) it.next()).m4235q();
            }
        }
    }

    private void m4550s() {
        this.f4177y = f4139b;
        if (KonyMain.m4057C()) {
            Object property = KonyJSVM.getProperty(getJSObject(), "basicConfig");
            Object property2 = KonyJSVM.getProperty(getJSObject(), "layoutConfig");
            Object property3 = KonyJSVM.getProperty(getJSObject(), "pspConfig");
            Object[] keys = getKeys();
            Object[] hashValues = getHashValues();
            m4535a((LuaTable) property, property2 != null ? (LuaTable) property2 : null, property3 != null ? (LuaTable) property3 : null);
            if (keys != null && hashValues != null && keys.length > 0 && hashValues.length > 0) {
                for (int i = 0; i < keys.length; i++) {
                    super.setTable(keys[i], hashValues[i]);
                }
            }
        } else {
            m4535a(this.f4168R, this.f4169S, this.f4170T);
        }
        if (super.getTable(f4142e) != LuaNil.nil) {
            try {
                ((Function) super.getTable(f4142e)).execute(new Object[]{this});
            } catch (Throwable e) {
                if (KonyMain.f3658f) {
                    Log.w("LuaPopUp", "raiseAdWidgetsCallback", e);
                }
                if (e instanceof LuaError) {
                    throw ((LuaError) e);
                }
                throw new LuaError("Error in Popup addwidgets callback." + e.getMessage(), 605);
            }
        }
        if (super.getTable("init") != LuaNil.nil) {
            try {
                ((Function) super.getTable("init")).execute(new Object[]{this});
            } catch (Throwable e2) {
                if (KonyMain.f3658f) {
                    Log.w("LuaPopUp", "init Callback", e2);
                }
                if (e2 instanceof LuaError) {
                    throw ((LuaError) e2);
                }
                throw new LuaError("Error in Popup init callback." + e2.getMessage(), 605);
            }
        }
        this.f4177y = f4161x;
    }

    private int m4551t() {
        LuaNil table = super.getTable(f4152o);
        if (table != LuaNil.nil) {
            table = ((LuaTable) table).getTable(f4150m);
            if (table != LuaNil.nil) {
                return ((Double) table).intValue();
            }
        }
        return -1;
    }

    private void m4552u() {
        if (this.f4171U != null) {
            this.f4171U.m4569k();
            this.f4171U = null;
        }
        Object table = super.getTable(ATTR_WIDGET_ID);
        if (this.map != null) {
            this.map.clear();
        }
        super.setTable(ATTR_WIDGET_ID, table);
        cleanup();
        this.f4163B.clear();
        this.f4164C.clear();
        this.f4165D.clear();
        this.f4177y = 0;
    }

    protected final String m4553a(LuaTable luaTable, String str) {
        String str2 = BuildConfig.FLAVOR;
        if (luaTable == null) {
            return str2;
        }
        String str3;
        LuaNil table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_HINT);
        if (table != LuaNil.nil) {
            str3 = str2 + ((String) table);
        } else {
            table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_LABEL);
            str3 = table != LuaNil.nil ? str2 + ((String) table) : str != null ? str2 + str : str2;
        }
        return str3;
    }

    public final void m4554a(int i) {
        int size = this.f4163B.size();
        int a = cr.m2199a(i, 0);
        if (a >= 0 && a < size) {
            Object obj = (LuaWidget) this.f4163B.elementAt(a);
            if (obj != null) {
                m4561b(obj);
            }
        }
    }

    public final void m4555a(gL gLVar) {
        KonyMain.m4094a(new gQ(this, gLVar));
    }

    public final void m4556a(Object obj) {
        LuaTable luaTable = (LuaTable) obj;
        LuaNil table = luaTable.getTable("widget");
        if (table != LuaNil.nil) {
            if (KonyMain.f3657e) {
                Log.d("LuaPopUp", "Parent Widget " + table);
            }
            super.setTable("widget", table);
            if (this.E == f4159v) {
                this.f4178z.m1064a(((LuaWidget) table).getWidget());
            }
        }
        table = luaTable.getTable("anchor");
        if (table != LuaNil.nil) {
            if (KonyMain.f3657e) {
                Log.d("LuaPopUp", "Widget Anchor" + table);
            }
            super.setTable("anchor", table);
            if (this.E == f4159v) {
                m4536a((String) table);
            }
        }
    }

    public final void m4557a(Object obj, int i) {
        int i2 = 0;
        if (obj != null) {
            LuaWidget luaWidget = (LuaWidget) obj;
            int size = this.f4163B.size();
            int a = cr.m2199a(i, 0);
            if (a >= 0) {
                i2 = a > size ? size : a;
            }
            if (this.E == f4159v) {
                this.f4178z.m1065a(luaWidget.getWidget(), i2);
                this.f4178z.m1085e();
            }
            luaWidget.setParent(this);
            this.f4163B.add(i2, luaWidget);
        }
    }

    protected final void m4558a(Object obj, Object obj2) {
        if (this.E != 0) {
            String intern = ((String) obj).intern();
            if (intern == "title" && obj2 != null && obj2 != LuaNil.nil) {
                this.f4178z.m1069a((String) obj2);
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    dB a = cN.m2139a(obj2);
                    if (a != null) {
                        this.f4178z.m1068a(a);
                        this.f4178z.m1092h();
                    }
                }
            } else if (intern == f4147j) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4178z.m1062a(((Double) obj2).intValue());
                }
            } else if (intern == f4143f) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4178z.m1070a(((Boolean) obj2).booleanValue());
                }
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT) {
                setWeight();
            } else if (intern == f4151n) {
                super.setTable(f4151n, obj2);
            } else if (intern == f4152o) {
                super.setTable(f4152o, obj2);
            } else if (intern == ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
                if (obj2 != null && (obj2 instanceof LuaTable)) {
                    this.f4178z.m1075b(m4553a((LuaTable) obj2, this.f4178z.m1060a()));
                } else if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f4178z.m1075b(BuildConfig.FLAVOR);
                }
            } else if (intern == ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE) {
                r0 = cr.m2201a(obj2, 1);
                if (r0 != null && r0 != LuaNil.nil) {
                    this.f4176Z = ((Double) r0).intValue();
                    m4571p();
                }
            } else if (intern == ATTR_WIDGET_CONTAINER_HEIGHT) {
                r0 = cr.m2201a(obj2, 1);
                if (r0 != null && r0 != LuaNil.nil) {
                    this.N = ((Double) r0).floatValue();
                    m4571p();
                }
            } else if (intern == f4156s) {
                r0 = cr.m2201a(obj2, 0);
                if (r0 != null && r0 != LuaNil.nil) {
                    this.f4178z.m1087e(((Boolean) r0).booleanValue());
                }
            } else if (intern == f4154q) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4178z.m1084d(((Boolean) obj2).booleanValue());
                }
            } else if (intern == f4155r && obj2 != null && obj2 != LuaNil.nil) {
                this.f4178z.setFocusable(((Boolean) obj2).booleanValue());
                this.f4178z.setInputMethodMode(1);
            }
        }
    }

    public final void m4559a(Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (int i = 1; i < objArr.length; i++) {
                LuaWidget luaWidget = (LuaWidget) objArr[i];
                luaWidget.setParent(this);
                if (this.E == f4159v) {
                    this.f4178z.m1074b(luaWidget.getWidget());
                    this.f4178z.m1085e();
                }
                this.f4163B.add(luaWidget);
            }
        }
    }

    public final int m4560b() {
        return this.f4177y;
    }

    public final void m4561b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof LuaWidget) {
            LuaWidget luaWidget = (LuaWidget) obj;
            if (this.E == f4159v) {
                this.f4178z.m1079c(luaWidget.getWidget());
                this.f4178z.m1085e();
            }
            this.f4163B.removeElement(luaWidget);
        } else if (KonyMain.f3657e) {
            Log.d("LuaPopUp", "Not a valid widget argument for Popup.remove()");
        }
    }

    public final void m4562c(Object obj) {
        if (obj != null) {
            LuaWidget luaWidget = (LuaWidget) obj;
            if (this.E == f4159v) {
                luaWidget.getWidget().requestFocusFromTouch();
            }
        }
    }

    public final Object[] m4563c() {
        Collection childWidgets = getChildWidgets();
        if (childWidgets == null) {
            return null;
        }
        Vector vector = new Vector(childWidgets);
        new LuaTable().addAll(vector);
        return new Object[]{r2};
    }

    public final void cleanup() {
        if (this.E != 0) {
            for (int i = 0; i < this.f4163B.size(); i++) {
                ((LuaWidget) this.f4163B.elementAt(i)).cleanup();
            }
            Iterator it = this.f4164C.iterator();
            while (it.hasNext()) {
                ((eO) ((LuaWidget) it.next())).m4204a(this.f4178z.f1055d);
            }
            it = this.f4165D.iterator();
            while (it.hasNext()) {
                ((eO) ((LuaWidget) it.next())).m4204a(this.f4178z.f1056e);
            }
            if (this.f4164C != null) {
                this.f4164C.clear();
            }
            if (this.f4165D != null) {
                this.f4165D.clear();
            }
            if (this.f4178z != null) {
                this.f4178z.m1088f();
            }
            this.f4178z = null;
            this.f4172V = null;
            this.f4174X = null;
            this.f4173W = null;
            this.f4175Y = null;
            this.f4171U = null;
            this.E = 0;
        }
    }

    public final LuaWidget createClone() {
        return null;
    }

    public final void m4564d() {
        if (this.E == f4159v && this.f4178z != null) {
            this.f4178z.m1094i();
        }
    }

    public final void m4565e() {
        if (this.f4178z != null && this.E == f4159v) {
            this.f4178z.f1054a.post(new gM(this));
        }
    }

    public final void m4566f() {
        if (fv.m4426o() != null) {
            fv.m4426o().m4435a((C0211m) this);
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            KonyMain.m4121f().post(new gN(this));
        } else {
            m4547o();
        }
    }

    public final void m4567g() {
        if (this.E != 0) {
            LuaNil table = super.getTable("widget");
            if (table != LuaNil.nil) {
                this.f4178z.m1064a(((LuaWidget) table).getWidget());
            } else {
                this.f4178z.m1064a(null);
            }
        } else if (KonyMain.getActContext() != null) {
            m4546n();
        } else {
            return;
        }
        if (!f4138a.contains(this)) {
            f4138a.add(this);
        }
        this.f4178z.m1077c();
        f4157t = this;
    }

    public final LuaWidget getChildWidget(String str) {
        Object table = super.getTable(str);
        return table instanceof LuaWidget ? (LuaWidget) table : null;
    }

    public final ArrayList getChildWidgets() {
        Object arrayList = new ArrayList(this.f4163B);
        Collections.copy(arrayList, this.f4163B);
        return arrayList;
    }

    public final String getID() {
        return super.getTable(ATTR_WIDGET_ID).toString();
    }

    public final LuaWidget getParent() {
        return this.f4162A;
    }

    public final Hashtable getProperties() {
        Hashtable hashtable = new Hashtable();
        hashtable.put("title", "string");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (this.f4177y == 0) {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                m4550s();
            } else {
                synchronized (this) {
                    Object iiVar = new ii(new gR(this));
                    new Handler(Looper.getMainLooper()).post(iiVar);
                    iiVar.m1406a();
                }
            }
        }
        if (obj == "FormTransparencyDuringModalPopup") {
            obj = f4147j;
        }
        return super.getTable(obj);
    }

    public final String getType() {
        return "Popup";
    }

    public final View getWidget() {
        if (this.f4177y == 0) {
            m4550s();
        }
        if (this.E == 0) {
            m4549r();
            m4546n();
        }
        return this.f4178z.m1081d();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.f4178z != null && this.f4178z.isShowing()) {
            m4571p();
            for (int i2 = 0; i2 < this.f4163B.size(); i2++) {
                ((LuaWidget) this.f4163B.elementAt(i2)).handleOrientationChange(i);
            }
            Iterator it = this.f4164C.iterator();
            while (it.hasNext()) {
                ((LuaWidget) it.next()).handleOrientationChange(i);
            }
            it = this.f4165D.iterator();
            while (it.hasNext()) {
                ((LuaWidget) it.next()).handleOrientationChange(i);
            }
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4178z.m1071a(convertPaddingToPixels(table, null));
            }
            this.f4178z.m1072b();
        }
    }

    public final void m4568i() {
        if (this.f4178z != null && this.f4178z.isShowing()) {
            if (this.f4171U != null) {
                this.f4171U.m4568i();
            }
            KonyMain.getActContext().m4168q();
            this.f4178z.dismiss();
            if (fv.m4426o() != null) {
                fv.m4426o().m4444b((C0211m) this);
            }
        }
    }

    public final void m4569k() {
        if (this.f4178z == null || !this.f4178z.isShowing()) {
            m4552u();
            return;
        }
        this.aa = true;
        m4568i();
    }

    public final void m4570l() {
        cleanup();
        f4138a.removeElement(this);
        f4157t = null;
        if (ab.contains(this)) {
            Iterator it = ab.iterator();
            while (it.hasNext()) {
                gL gLVar = (gL) it.next();
                if (gLVar != this) {
                    gLVar.cleanup();
                }
            }
            ab.clear();
        }
        if (this.aa) {
            this.aa = false;
            m4552u();
        }
    }

    protected final void m4571p() {
        switch (this.f4176Z) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (this.N >= 0.0f) {
                    this.f4178z.m1082d(O != -1 ? (int) ((((float) O) * this.N) / 100.0f) : (int) ((((float) (KonyMain.getActContext().m4167p() - KonyMain.f3663k)) * this.N) / 100.0f));
                } else {
                    this.f4178z.setHeight(-2);
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (this.N >= 0.0f) {
                    this.f4178z.m1082d((int) ((((float) KonyMain.getActContext().m4167p()) * this.N) / 100.0f));
                } else {
                    this.f4178z.setHeight(-2);
                }
            default:
        }
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocus() {
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
    }

    public final void setParent(LuaWidget luaWidget) {
        this.f4162A = luaWidget;
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj == "FormTransparencyDuringModalPopup" ? f4147j : obj, obj2);
        if (this.E == f4159v) {
            m3950d(obj, obj2);
        }
    }

    public final void setVisibility(boolean z) {
    }

    public final void setWeight() {
        Double d = (Double) super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
        if (d.doubleValue() == 0.0d) {
            d = Double.valueOf(80.0d);
        }
        this.f4178z.m1061a(d.floatValue() / 100.0f);
    }

    public final void setWidth(int i) {
    }
}
