package com.konylabs.api.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
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
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import net.sourceforge.zbar.Config;
import ny0k.aG;
import ny0k.bO;
import ny0k.bY;
import ny0k.cD;
import ny0k.cN;
import ny0k.cr;

public class fv extends LuaWidget {
    private static String f3990A;
    private static String f3991B;
    private static String f3992C;
    private static String f3993D;
    private static String f3994P;
    private static String f3995Q;
    private static String f3996R;
    private static String f3997S;
    private static String f3998T;
    private static String f3999U;
    private static String f4000V;
    private static String f4001W;
    private static String f4002X;
    private static String f4003Y;
    private static String f4004Z;
    public static String f4005a;
    private static int aA;
    private static int aB;
    private static int aC;
    private static ConcurrentHashMap aD;
    private static String aa;
    private static String ab;
    private static String ac;
    private static String ad;
    private static String ae;
    private static String af;
    private static String ah;
    private static String ai;
    private static String aj;
    private static String ak;
    private static String al;
    private static String am;
    private static String an;
    private static String ao;
    private static String ar;
    private static String as;
    private static String at;
    private static String au;
    private static String av;
    private static int aw;
    private static int ax;
    private static int ay;
    private static int az;
    public static String f4006b;
    public static String f4007c;
    public static String f4008d;
    public static String f4009e;
    public static String f4010f;
    public static String f4011g;
    public static String f4012h;
    public static String f4013i;
    public static String f4014j;
    public static String f4015k;
    public static String f4016l;
    public static String f4017m;
    public static String f4018n;
    public static String f4019o;
    public static String f4020p;
    public static String f4021q;
    static int f4022r;
    static int f4023s;
    static int f4024t;
    public static int f4025x;
    public static boolean f4026y;
    private static String f4027z;
    private Vector aE;
    private Vector aF;
    private Vector aG;
    private Vector aH;
    private Vector aI;
    private int aJ;
    private boolean aK;
    private Function aL;
    private Function aM;
    private boolean aN;
    private Function aO;
    private Object aP;
    private Object aQ;
    private Object aR;
    private Object aS;
    private hg aT;
    private bO aU;
    private hP aV;
    private gH aW;
    private hq aX;
    private Vector aY;
    private Vector aZ;
    private int ag;
    private CopyOnWriteArrayList bA;
    private en bB;
    private float bC;
    private em bD;
    private boolean ba;
    private boolean bb;
    private boolean bc;
    private boolean bd;
    private int be;
    private int bf;
    private LuaWidget bg;
    private int bh;
    private boolean bi;
    private String bj;
    private Object[] bk;
    private LuaTable bl;
    private LuaTable bm;
    private LuaTable bn;
    private boolean bo;
    private LuaWidget bp;
    private aK bq;
    private aG br;
    private aH bs;
    private aJ bt;
    private aI bu;
    private boolean bv;
    private IdleHandler bw;
    private cv bx;
    private SparseArray by;
    private aG bz;
    int f4028u;
    int f4029v;
    aD f4030w;

    static {
        f4005a = "type";
        f4027z = "title";
        f3990A = "needappmenu";
        f3991B = "enabledforidletimeout";
        f3992C = "headers";
        f3993D = "footers";
        f4006b = "addwidgets";
        f4007c = "init";
        f4008d = "preshow";
        f4009e = "postshow";
        f4010f = "onhide";
        f3994P = "ondestroy";
        f4011g = "onorientationchange";
        f3995Q = "menunormalskin";
        f3996R = "menufocusskin";
        f3997S = "menuitems";
        f3998T = "displayorientation";
        f3999U = "titlebar";
        f4000V = "titlebarskin";
        f4001W = "menuposition";
        f4002X = "windowsoftinputmode";
        f4012h = "ondeviceback";
        f4013i = "ondevicemenu";
        f4003Y = "retainscrollposition";
        f4004Z = "intransitionconfig";
        aa = "outtransitionconfig";
        f4014j = "scrollingevents";
        f4015k = "onreachingbegining";
        f4016l = "onreachingend";
        f4017m = "onpull";
        f4018n = "onpush";
        ab = "showactionbar";
        f4019o = "onactionbarback";
        ac = "showactionbaricon";
        ad = "actionbaricon";
        f4020p = "masterdataload";
        f4021q = "transactionaldataload";
        ae = "autoreverseanimation";
        af = "menuclickasync";
        if (KonyMain.m4057C()) {
            f3990A = "needAppMenu";
            f3991B = "enabledForIdleTimeout";
            f4006b = "addWidgets";
            f4008d = "preShow";
            f4009e = "postShow";
            f4010f = "onHide";
            f3994P = "onDestroy";
            f4011g = "onOrientationChange";
            f3995Q = "menuNormalSkin";
            f3996R = "menuFocusSkin";
            f3997S = "menuItems";
            f3998T = "displayOrientation";
            f3999U = "titleBar";
            f4000V = "titleBarSkin";
            f4001W = "menuPosition";
            f4002X = "windowSoftInputMode";
            f4012h = "onDeviceBack";
            f4013i = "onDeviceMenu";
            f4003Y = "retainScrollPosition";
            f4004Z = "inTransitionConfig";
            aa = "outTransitionConfig";
            f4020p = "masterDataLoad";
            f4021q = "transactionalDataLoad";
            f4014j = "scrollingEvents";
            f4015k = "onReachingBegining";
            f4016l = "onReachingEnd";
            f4017m = "onPull";
            f4018n = "onPush";
            ab = "showActionBar";
            f4019o = "onActionBarBack";
            ac = "showActionBarIcon";
            ad = "actionBarIcon";
            ae = "autoReverseAnimation";
            af = "menuClickAsync";
        }
        ah = "formtype";
        ai = "formanimation";
        aj = "orientationmode";
        ak = "globalheaders";
        al = "globalfooters";
        am = "titlebarbackgroundimage";
        an = "needapplevelmenu";
        ao = "headeroverlap";
        ar = "footeroverlap";
        as = "staticheaderfooter";
        at = "enablescrolling";
        au = "defaultIndicatorColor";
        av = "splitView";
        if (KonyMain.m4057C()) {
            ah = "formType";
            ai = "formAnimation";
            aj = "orientationMode";
            ak = "globalHeaders";
            al = "globalFooters";
            am = "titleBarBackgroundImage";
            an = "needAppLevelMenu";
            ao = "headerOverlap";
            ar = "footerOverlap";
            as = "staticHeaderFooter";
            at = "enableScrolling";
            au = "defaultIndicatorColor";
        }
        aw = 0;
        f4022r = 1;
        f4023s = 0;
        ax = 1;
        f4024t = 2;
        ay = 3;
        az = 0;
        aA = 1;
        aB = 2;
        aC = 3;
        aD = new ConcurrentHashMap(2, 1.0f, 2);
        f4025x = 0;
        f4026y = false;
        LuaNil luaNil = LuaNil.nil;
    }

    public fv(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3, int i) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4028u = 0;
        this.f4029v = 0;
        this.aE = new Vector(10);
        this.aF = new Vector(10);
        this.aG = new Vector(10);
        this.aH = new Vector(10);
        this.aI = new Vector(10);
        this.aJ = 0;
        this.aK = false;
        this.aN = true;
        this.bd = false;
        this.be = 0;
        this.bf = 0;
        this.bg = null;
        this.bh = 0;
        this.bk = null;
        this.bo = false;
        this.bp = null;
        this.bq = new aK(this);
        this.br = new aG(this);
        this.bs = new aH(this);
        this.bt = new aJ(this);
        this.bu = new aI(this);
        this.bw = new fO(this);
        this.bx = new fG(this);
        this.by = new SparseArray();
        this.bz = new fI(this);
        this.bA = new CopyOnWriteArrayList();
        this.bB = new en(this);
        this.bC = 0.0f;
        this.bD = new em(this);
        this.ag = i;
        if (KonyMain.m4056B()) {
            this.bl = luaTable;
            this.bm = luaTable2;
            this.bn = luaTable3;
        }
        m4436a(luaTable, luaTable2, luaTable3, i);
        aD.put((String) super.getTable(ATTR_WIDGET_ID), this);
        this.f4028u = 0;
    }

    private void m4376C() {
        if (!this.bd) {
            return;
        }
        if (this.bh == 0) {
            m4384a(this.be, this.bf);
        } else if (this.bh == aA) {
            m4453e();
        } else if (this.bh == aB) {
            m4454f();
        } else if (this.bh == aC) {
            m4437a(this.bg);
        }
    }

    private void m4377D() {
        try {
            ((Function) super.getTable(f4021q)).execute(new Object[]{this});
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                Log.d("LuaForm", BuildConfig.FLAVOR + e.getMessage());
            }
            if (e instanceof LuaError) {
                throw ((LuaError) e);
            }
            throw new LuaError("Error in form transactionaldataload. " + e.getMessage(), 605);
        }
    }

    private void m4378E() {
        this.f4028u = ax;
        if (KonyMain.m4057C()) {
            Object property = KonyJSVM.getProperty(getJSObject(), "basicConfig");
            Object property2 = KonyJSVM.getProperty(getJSObject(), "layoutConfig");
            Object property3 = KonyJSVM.getProperty(getJSObject(), "pspConfig");
            Object[] keys = getKeys();
            Object[] hashValues = getHashValues();
            m4436a((LuaTable) property, property2 != null ? (LuaTable) property2 : null, property3 != null ? (LuaTable) property3 : null, this.ag);
            if (keys != null && hashValues != null && keys.length > 0 && hashValues.length > 0) {
                for (int i = 0; i < keys.length; i++) {
                    super.setTable(keys[i], hashValues[i]);
                }
            }
        } else {
            m4436a(this.bl, this.bm, this.bn, this.ag);
        }
        if (super.getTable(f4006b) != LuaNil.nil) {
            try {
                ((Function) super.getTable(f4006b)).execute(new Object[]{this});
            } catch (Throwable e) {
                if (KonyMain.f3658f) {
                    Log.w("LuaForm", "raiseAdWidgetsCallback", e);
                }
                if (e instanceof LuaError) {
                    throw ((LuaError) e);
                }
                throw new LuaError("Error in Form add widgets callback." + e.getMessage(), 605);
            }
        }
        if (super.getTable(f4007c) != LuaNil.nil) {
            if (KonyMain.f3657e) {
                Log.d("LuaForm", "Firing the init/master fuction just before displaying the the form");
            }
            try {
                ((Function) super.getTable(f4007c)).execute(new Object[]{this});
            } catch (Throwable e2) {
                if (KonyMain.f3658f) {
                    Log.w("LuaForm", "raiseMDLCallback", e2);
                }
                if (e2 instanceof LuaError) {
                    throw ((LuaError) e2);
                }
                throw new LuaError("Error in form init/masterdataload. " + e2.getMessage(), 605);
            }
        }
        if (super.getTable(f4021q) != LuaNil.nil) {
            m4377D();
        }
        this.f4028u = f4024t;
    }

    private static void m4379F() {
        if (aD != null) {
            Enumeration elements = aD.elements();
            while (elements.hasMoreElements()) {
                ((fv) elements.nextElement()).m4461r();
            }
            aD.clear();
        }
    }

    private int m4380a(Object obj, int i) {
        int i2;
        int i3;
        int i4 = 0;
        int a = cr.m2199a(i, 0);
        LuaWidget luaWidget = (LuaWidget) obj;
        if (luaWidget instanceof hg) {
            if (((hg) luaWidget).m4715b()) {
                this.aT = (hg) luaWidget;
                i2 = 0;
                i3 = a;
            }
            i2 = 0;
            i3 = a;
        } else if (luaWidget instanceof bO) {
            if (((bO) luaWidget).m4836k()) {
                this.aU = (bO) luaWidget;
                i2 = 0;
                i3 = a;
            }
            i2 = 0;
            i3 = a;
        } else if (luaWidget instanceof hP) {
            if (((hP) luaWidget).m4659b()) {
                this.aV = (hP) luaWidget;
                i2 = 0;
                i3 = a;
            }
            i2 = 0;
            i3 = a;
        } else if (luaWidget instanceof gH) {
            if (((gH) luaWidget).m4514b()) {
                this.aW = (gH) luaWidget;
                i2 = 0;
                i3 = a;
            }
            i2 = 0;
            i3 = a;
        } else if (luaWidget instanceof hq) {
            if (((hq) luaWidget).m4730b()) {
                this.aX = (hq) luaWidget;
                i2 = 0;
                i3 = a;
            }
            i2 = 0;
            i3 = a;
        } else if (luaWidget instanceof eO) {
            eO eOVar = (eO) luaWidget;
            if (eOVar.m4228j()) {
                if (this.aY == null) {
                    this.aY = new Vector();
                }
                this.aY.add(eOVar);
                luaWidget.setParent(this);
            } else if (eOVar.m4229k()) {
                if (this.aZ == null) {
                    this.aZ = new Vector();
                }
                this.aZ.add(eOVar);
                luaWidget.setParent(this);
            } else if (eOVar.m4226h()) {
                i3 = this.aH.size();
                if (a < 0) {
                    i3 = 0;
                } else if (a <= i3) {
                    i3 = a;
                }
                this.aH.add(i3, eOVar);
                luaWidget.setParent(this);
                i2 = eOVar.m4222d();
                if (i2 > 0) {
                    this.aJ = i2 + this.aJ;
                }
                i2 = 1;
            } else if (eOVar.m4227i()) {
                i3 = this.aI.size();
                if (a < 0) {
                    a = 0;
                } else if (a > i3) {
                    a = i3;
                }
                this.aI.add(a, eOVar);
                luaWidget.setParent(this);
                i2 = eOVar.m4222d();
                if (i2 > 0) {
                    this.aJ = i2 + this.aJ;
                }
            } else {
                i2 = 0;
                i3 = a;
            }
            i2 = 1;
            i3 = a;
        } else {
            if (luaWidget instanceof hD) {
                if (((hD) luaWidget).m4632b()) {
                    this.aJ++;
                    i2 = 0;
                    i3 = a;
                }
            } else if ((luaWidget instanceof hJ) && ((hJ) luaWidget).m4648b()) {
                this.aJ++;
            }
            i2 = 0;
            i3 = a;
        }
        if (i2 == 1) {
            return i3;
        }
        i2 = this.aE.size();
        if (i3 >= 0) {
            i4 = i3 > i2 ? i2 : i3;
        }
        luaWidget.setParent(this);
        if (luaWidget instanceof eO) {
            i2 = ((eO) luaWidget).m4222d();
            if (i2 > 0) {
                this.aJ = i2 + this.aJ;
            }
        }
        this.aE.add(i4, luaWidget);
        return i4;
    }

    private void m4384a(int i, int i2) {
        if (this.f4030w != null && this.f4029v == f4022r) {
            this.f4030w.f439a.post(new fC(this, i, i2));
        }
    }

    private void m4385a(int i, LuaWidget luaWidget) {
        this.bh = i;
        if (i == aC) {
            this.bg = luaWidget;
            this.be = 0;
            this.bf = 0;
        } else if (i == aA) {
            this.bg = null;
            this.be = 0;
            this.bf = 0;
        } else if (i == aB) {
            this.bg = null;
            this.be = 0;
            this.bf = 0;
        } else if (i == 0) {
            this.bg = null;
        }
    }

    private void m4386a(LuaWidget luaWidget, Object obj, int i) {
        m4409d((Object) luaWidget);
        int a = m4380a(obj, i);
        if (this.f4029v == KONY_WIDGET_RESTORE) {
            m4413e((Object) luaWidget, null);
            m4405c(obj, a, null);
        }
    }

    static /* synthetic */ void m4392a(fv fvVar, Object[] objArr) {
        for (int i = 1; i < objArr.length; i++) {
            LuaWidget luaWidget = (LuaWidget) objArr[i];
            if (luaWidget instanceof eO) {
                eO eOVar = (eO) luaWidget;
                if (!eOVar.m4228j()) {
                    if (eOVar.m4229k()) {
                    }
                }
            }
            fvVar.f4030w.m437a(luaWidget.getWidget());
            fvVar.m3945a(luaWidget, fvVar.J);
        }
        if (fvVar.aV != null) {
            fvVar.f4030w.m465d(6);
        } else if (fvVar.aW != null) {
            fvVar.f4030w.m465d(7);
        } else if (fvVar.aX != null) {
            fvVar.f4030w.m465d(8);
        } else if (!(fvVar.aT == null && fvVar.aU == null)) {
            fvVar.f4030w.m465d(5);
        }
        if (fvVar.f4029v == f4022r && fvVar.aT != null) {
            fvVar.aT.m4709a(fvVar.aY);
            fvVar.aT.m4713b(fvVar.aZ);
        }
        if (fvVar.f4029v == f4022r && fvVar.aU != null && (fvVar.aU instanceof bY)) {
            bY bYVar = (bY) fvVar.aU;
            bYVar.m4958c(fvVar.aY);
            bYVar.m4960d(fvVar.aZ);
        }
    }

    public static void m4393a(String str) {
        if (str != null) {
            fv fvVar = (fv) aD.get(str);
            if (fvVar != null) {
                if (KonyMain.f3657e) {
                    Log.d("LuaForm", "\nFreeing the form !!!! - " + str);
                }
                fvVar.cleanup();
            }
        }
    }

    public static fv m4394b(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3, int i) {
        fv c;
        if (i == 0 && luaTable3 != null) {
            luaTable.setTable(f4005a, luaTable3.getTable(ah));
        }
        if (!(KonyMain.m4145z() == 1 || luaTable.getTable(f4005a) == LuaNil.nil)) {
            int intValue = ((Double) luaTable.getTable(f4005a)).intValue();
            if (intValue == 1 || intValue == 2) {
                c = gb.m4872c(luaTable, luaTable2, luaTable3, i);
                return c != null ? new fv(luaTable, luaTable2, luaTable3, i) : c;
            }
        }
        c = null;
        if (c != null) {
        }
    }

    public static fv m4395b(String str) {
        return str == null ? null : (fv) aD.get(str);
    }

    public static String m4398b(int i, Object obj, Object obj2) {
        String str = null;
        for (fv a : aD.values()) {
            str = a.m4430a(i, obj, obj2);
        }
        return str;
    }

    private void m4399b(LuaWidget luaWidget, int i) {
        Object obj;
        int i2;
        bY bYVar;
        if (luaWidget instanceof eO) {
            eO eOVar = (eO) luaWidget;
            if (eOVar.m4228j()) {
                obj = 1;
            } else if (eOVar.m4229k()) {
                i2 = 1;
            } else if (eOVar.m4226h()) {
                this.f4030w.m438a(luaWidget.getWidget(), i);
                return;
            } else if (eOVar.m4227i()) {
                this.f4030w.m438a(luaWidget.getWidget(), i);
                return;
            }
            if (obj != 1) {
                i2 = getChildConvertedIndex(i);
                this.f4030w.m438a(luaWidget.getWidget(), i2);
                m3945a(luaWidget, i2);
            }
            if (this.f4029v == f4022r && this.aT != null) {
                this.aT.m4709a(this.aY);
                this.aT.m4713b(this.aZ);
            }
            if (this.f4029v == f4022r && this.aU != null && (this.aU instanceof bY)) {
                bYVar = (bY) this.aU;
                bYVar.m4958c(this.aY);
                bYVar.m4960d(this.aZ);
            }
            if (this.f4030w == null) {
            }
            if (this.aV != null) {
                this.f4030w.m465d(6);
            } else if (this.aW != null) {
                this.f4030w.m465d(7);
            } else if (this.aX == null) {
                this.f4030w.m465d(8);
            } else if (this.aT == null || this.aU != null) {
                this.f4030w.m465d(5);
            } else {
                return;
            }
        }
        obj = null;
        if (obj != 1) {
            i2 = getChildConvertedIndex(i);
            this.f4030w.m438a(luaWidget.getWidget(), i2);
            m3945a(luaWidget, i2);
        }
        this.aT.m4709a(this.aY);
        this.aT.m4713b(this.aZ);
        bYVar = (bY) this.aU;
        bYVar.m4958c(this.aY);
        bYVar.m4960d(this.aZ);
        if (this.f4030w == null) {
            if (this.aV != null) {
                this.f4030w.m465d(6);
            } else if (this.aW != null) {
                this.f4030w.m465d(7);
            } else if (this.aX == null) {
                if (this.aT == null) {
                }
                this.f4030w.m465d(5);
            } else {
                this.f4030w.m465d(8);
            }
        }
    }

    private void m4400b(Object[] objArr) {
        super.setTable(LuaWidget.ATTR_WIDGET_ID, objArr[0]);
        if (!(objArr[1] == null || objArr[1] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_SKIN, objArr[1]);
        }
        if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
            super.setTable(f4027z, objArr[2]);
        }
        if (!(objArr[4] == null || objArr[4] == LuaNil.nil)) {
            super.setTable(f3997S, objArr[4]);
        }
        if (!(objArr[5] == null || objArr[5] == LuaNil.nil)) {
            super.setTable(f4007c, objArr[5]);
        }
        if (!(objArr[6] == null || objArr[6] == LuaNil.nil)) {
            super.setTable(f4021q, objArr[6]);
        }
        if (!(objArr[7] == null || objArr[7] == LuaNil.nil)) {
            super.setTable(f4006b, objArr[7]);
        }
        if (!(objArr[8] == null || objArr[8] == LuaNil.nil)) {
            super.setTable(f3995Q, objArr[8]);
        }
        if (!(objArr[9] == null || objArr[9] == LuaNil.nil)) {
            super.setTable(f3996R, objArr[9]);
        }
        if (objArr.length > 10 && objArr[10] != null && objArr[10] != LuaNil.nil) {
            LuaTable luaTable = (LuaTable) objArr[10];
            super.setTable(f3999U, luaTable.getTable(f3999U));
            super.setTable(f4000V, luaTable.getTable(f4000V));
            super.setTable(am, luaTable.getTable(am));
            super.setTable(f3990A, luaTable.getTable(an));
            super.setTable(f3998T, luaTable.getTable(aj));
            super.setTable(f4011g, luaTable.getTable(f4011g));
            super.setTable(f3991B, luaTable.getTable(f3991B));
            super.setTable(f4012h, luaTable.getTable(f4012h));
            super.setTable(f4010f, luaTable.getTable(f4010f));
            super.setTable(f4013i, luaTable.getTable(f4013i));
            super.setTable(f4001W, luaTable.getTable(f4001W));
            super.setTable(ai, luaTable.getTable(ai));
            super.setTable(ATTR_WIDGET_PADDING, luaTable.getTable(ATTR_WIDGET_PADDING));
            super.setTable(f4002X, luaTable.getTable(f4002X));
            super.setTable(f3992C, luaTable.getTable(ak));
            super.setTable(f3993D, luaTable.getTable(al));
            LuaNil table = luaTable.getTable(f4008d);
            super.setTable(f4008d, table);
            this.aL = table != LuaNil.nil ? (Function) table : null;
            table = luaTable.getTable(f4009e);
            super.setTable(f4009e, table);
            this.aM = table != LuaNil.nil ? (Function) table : null;
            super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, luaTable);
        }
    }

    private void m4403c(LuaWidget luaWidget) {
        int i;
        bY bYVar;
        if (luaWidget instanceof eO) {
            eO eOVar = (eO) luaWidget;
            if (eOVar.m4228j()) {
                i = 1;
            } else if (eOVar.m4229k()) {
                i = 1;
            } else if (eOVar.m4226h()) {
                this.f4030w.m466d(eOVar.getWidget());
                i = 1;
            } else if (eOVar.m4227i()) {
                this.f4030w.m472e(eOVar.getWidget());
                i = 1;
            }
            if (i != 1) {
                Integer valueOf = Integer.valueOf(m3947b(luaWidget));
                this.L.remove(valueOf);
                m3949d(valueOf.intValue());
                this.f4030w.removeView(luaWidget.getWidget());
                if (this.aV != null) {
                    this.f4030w.m465d(6);
                } else if (this.aW != null) {
                    this.f4030w.m465d(7);
                } else if (this.aX == null) {
                    this.f4030w.m465d(8);
                } else if (this.aT == null || this.aU != null) {
                    this.f4030w.m465d(5);
                } else {
                    this.f4030w.m465d(0);
                }
            }
            if (this.f4029v == f4022r && this.aT != null) {
                this.aT.m4709a(this.aY);
                this.aT.m4713b(this.aZ);
            }
            if (this.f4029v == f4022r && this.aU != null && (this.aU instanceof bY)) {
                bYVar = (bY) this.aU;
                bYVar.m4958c(this.aY);
                bYVar.m4960d(this.aZ);
            }
            luaWidget.cleanup();
        }
        i = 0;
        if (i != 1) {
            Integer valueOf2 = Integer.valueOf(m3947b(luaWidget));
            this.L.remove(valueOf2);
            m3949d(valueOf2.intValue());
            this.f4030w.removeView(luaWidget.getWidget());
            if (this.aV != null) {
                this.f4030w.m465d(6);
            } else if (this.aW != null) {
                this.f4030w.m465d(7);
            } else if (this.aX == null) {
                if (this.aT == null) {
                }
                this.f4030w.m465d(5);
            } else {
                this.f4030w.m465d(8);
            }
        }
        this.aT.m4709a(this.aY);
        this.aT.m4713b(this.aZ);
        bYVar = (bY) this.aU;
        bYVar.m4958c(this.aY);
        bYVar.m4960d(this.aZ);
        luaWidget.cleanup();
    }

    public static void m4404c(Object obj) {
        for (fv b : aD.values()) {
            b.m4445b(obj);
        }
    }

    private void m4405c(Object obj, int i, Object obj2) {
        if (obj != null) {
            LuaWidget luaWidget = (LuaWidget) obj;
            if (LuaWidget.m3939f(obj2)) {
                long j = 0;
                Object a = cr.m2201a(((LuaTable) obj2).getTable(ATTR_WIDGET_ANIM_DELAY), 1);
                if (a != null) {
                    j = (long) (((Double) a).doubleValue() * 1000.0d);
                    ((LuaTable) obj2).setTable(ATTR_WIDGET_ANIM_DELAY, Double.valueOf(0.0d));
                }
                long j2 = j;
                setLayoutAnimator(luaWidget);
                this.f4030w.postDelayed(new fR(this, luaWidget, i, obj2), j2);
                return;
            }
            m4399b(luaWidget, i);
        }
    }

    public static void m4406c(String str) {
        fv fvVar = null;
        if (str != null) {
            fvVar = (fv) aD.get(str);
        }
        if (fvVar != null) {
            if (KonyMain.f3657e) {
                Log.d("LuaForm", "\nRestoring form !!!! - " + str);
            }
            fvVar.m4414e(true);
        }
    }

    private void m4409d(Object obj) {
        Object obj2 = null;
        LuaWidget luaWidget = (LuaWidget) obj;
        if (luaWidget instanceof eO) {
            eO eOVar = (eO) luaWidget;
            int d = eOVar.m4222d();
            if (d > 0) {
                this.aJ -= d;
                this.aJ = this.aJ < 0 ? 0 : this.aJ;
            }
            if (eOVar.m4228j()) {
                if (this.aY != null) {
                    this.aY.remove(eOVar);
                }
                obj2 = 1;
            } else if (eOVar.m4229k()) {
                if (this.aZ != null) {
                    this.aZ.remove(eOVar);
                }
                r2 = 1;
            } else if (eOVar.m4226h()) {
                this.aH.remove(eOVar);
                r2 = 1;
            } else if (eOVar.m4227i()) {
                this.aI.remove(eOVar);
                r2 = 1;
            }
        }
        if (obj2 != 1) {
            if (!this.aE.removeElement(luaWidget)) {
                LuaWidget parent = luaWidget.getParent();
                if (parent != null && (parent instanceof eO)) {
                    ((eO) parent).m4217b((Object) luaWidget, null);
                    return;
                }
                return;
            }
            if (luaWidget == this.bg) {
                this.bg = null;
            }
            if (luaWidget instanceof hg) {
                if (((hg) luaWidget).m4715b()) {
                    this.aT = null;
                }
            } else if (luaWidget instanceof bO) {
                if (((bO) luaWidget).m4836k()) {
                    this.aU = null;
                }
            } else if (luaWidget instanceof hP) {
                if (((hP) luaWidget).m4659b()) {
                    this.aV = null;
                }
            } else if (luaWidget instanceof gH) {
                if (((gH) luaWidget).m4514b()) {
                    this.aW = null;
                }
            } else if (luaWidget instanceof hq) {
                if (((hq) luaWidget).m4730b()) {
                    this.aX = null;
                }
            } else if (luaWidget instanceof hD) {
                if (((hD) luaWidget).m4632b() && this.aJ > 0) {
                    this.aJ--;
                }
            } else if ((luaWidget instanceof hJ) && ((hJ) luaWidget).m4648b() && this.aJ > 0) {
                this.aJ--;
            }
        }
        luaWidget.setParent(null);
        super.setTable(luaWidget.getID(), null);
    }

    private void m4412e(Object obj) {
        int i;
        PatternSyntaxException e;
        boolean z = true;
        boolean z2 = false;
        if (obj.toString().equalsIgnoreCase("Gray")) {
            i = -7829368;
        } else if (obj.toString().equalsIgnoreCase("White")) {
            i = -1;
        } else {
            try {
                z = Pattern.compile("^([A-Fa-f0-9]{8})$").matcher(obj.toString()).matches();
                if (z) {
                    try {
                        i = hp.m3351b(obj);
                    } catch (PatternSyntaxException e2) {
                        e = e2;
                        e.printStackTrace();
                        if (!z) {
                            this.f4030w.m434a(i);
                        }
                    }
                }
            } catch (PatternSyntaxException e3) {
                e = e3;
                z = z2;
                e.printStackTrace();
                if (!z) {
                    this.f4030w.m434a(i);
                }
            }
        }
        if (!z) {
            this.f4030w.m434a(i);
        }
    }

    private void m4413e(Object obj, Object obj2) {
        if (obj != null && obj != LuaNil.nil && (obj instanceof LuaWidget)) {
            LuaWidget luaWidget = (LuaWidget) obj;
            if (LuaWidget.m3939f(obj2)) {
                long j = 0;
                Object a = cr.m2201a(((LuaTable) obj2).getTable(ATTR_WIDGET_ANIM_DELAY), 1);
                if (a != null) {
                    j = (long) (((Double) a).doubleValue() * 1000.0d);
                    ((LuaTable) obj2).setTable(ATTR_WIDGET_ANIM_DELAY, Double.valueOf(0.0d));
                }
                long j2 = j;
                setLayoutAnimator(luaWidget);
                this.f4030w.postDelayed(new fx(this, luaWidget, obj2), j2);
                return;
            }
            m4403c(luaWidget);
        }
    }

    private void m4414e(boolean z) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            KonyMain.m4121f().post(new fD(this, z));
        } else {
            m4447b(z);
        }
    }

    public static void m4423i() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m4379F();
        } else {
            KonyMain.m4094a(new fH());
        }
    }

    public static void m4425j() {
        for (fv fvVar : aD.values()) {
            if (fvVar.f4028u == f4024t) {
                fvVar.f4028u = ay;
            }
        }
    }

    public static fv m4426o() {
        if (KonyMain.getActContext() == null) {
            return null;
        }
        KonyMain.getActContext();
        String m = KonyMain.m4136m();
        return m != null ? m4395b(m) : null;
    }

    public static fv m4427q() {
        if (KonyMain.getActContext() == null) {
            return null;
        }
        String n = KonyMain.getActContext().m4165n();
        return n != null ? m4395b(n) : null;
    }

    public static void m4428s() {
        for (fv fvVar : aD.values()) {
            if (fvVar instanceof gb) {
                ((gb) fvVar).m4879C();
            }
        }
    }

    public final LuaWidget m4429A() {
        return this.bp;
    }

    public final String m4430a(int i, Object obj, Object obj2) {
        LuaNil table;
        int intValue;
        aL aLVar;
        cD cDVar;
        int intValue2;
        LuaNil table2;
        if (obj != LuaNil.nil) {
            table = ((LuaTable) obj).getTable("fingers");
            if (table != LuaNil.nil) {
                intValue = ((Double) table).intValue();
                aLVar = (aL) this.by.get(intValue);
                if (aLVar == null) {
                    cDVar = new cD();
                    cDVar.m2105a((LuaWidget) this);
                    aLVar = new aL(intValue, cDVar);
                    this.by.append(intValue, aLVar);
                    if (this.f4029v == f4022r) {
                        this.f4030w.m436a(aLVar.f475a);
                    }
                }
                cDVar = aLVar.f476b;
                if (i == 1) {
                    if (obj != LuaNil.nil) {
                        table = ((LuaTable) obj).getTable("taps");
                        if (table != LuaNil.nil) {
                            intValue2 = ((Double) table).intValue();
                            if (intValue2 != 1) {
                                cDVar.f2226a.put(new Integer(i - 1), obj2);
                                cDVar.f2227b.put(new Integer(i - 1), obj);
                                return intValue + "-" + cD.f2222c.toString();
                            }
                            cDVar.f2226a.put(new Integer(i), obj2);
                            cDVar.f2227b.put(new Integer(i), obj);
                            return intValue + "-" + cD.f2223d.toString();
                        }
                    }
                    intValue2 = 1;
                    if (intValue2 != 1) {
                        cDVar.f2226a.put(new Integer(i), obj2);
                        cDVar.f2227b.put(new Integer(i), obj);
                        return intValue + "-" + cD.f2223d.toString();
                    }
                    cDVar.f2226a.put(new Integer(i - 1), obj2);
                    cDVar.f2227b.put(new Integer(i - 1), obj);
                    return intValue + "-" + cD.f2222c.toString();
                } else if (i == 2) {
                    if (obj != LuaNil.nil) {
                        LuaTable luaTable = (LuaTable) obj;
                        table2 = luaTable.getTable("swipedistance");
                        if (table2 != LuaNil.nil) {
                            cDVar.m2104a(((Double) table2).intValue());
                        }
                        table = luaTable.getTable("swipevelocity");
                        if (table != LuaNil.nil) {
                            cDVar.m2107b(((Double) table).intValue());
                        }
                    }
                    cDVar.f2226a.put(new Integer(i), obj2);
                    cDVar.f2227b.put(new Integer(i), obj);
                    return intValue + "-" + cD.f2224e.toString();
                } else if (i == 3) {
                    return null;
                } else {
                    cDVar.f2226a.put(new Integer(i), obj2);
                    cDVar.f2227b.put(new Integer(i), obj);
                    return intValue + "-" + cD.f2225f.toString();
                }
            }
        }
        intValue = 1;
        aLVar = (aL) this.by.get(intValue);
        if (aLVar == null) {
            cDVar = new cD();
            cDVar.m2105a((LuaWidget) this);
            aLVar = new aL(intValue, cDVar);
            this.by.append(intValue, aLVar);
            if (this.f4029v == f4022r) {
                this.f4030w.m436a(aLVar.f475a);
            }
        }
        cDVar = aLVar.f476b;
        if (i == 1) {
            if (obj != LuaNil.nil) {
                table = ((LuaTable) obj).getTable("taps");
                if (table != LuaNil.nil) {
                    intValue2 = ((Double) table).intValue();
                    if (intValue2 != 1) {
                        cDVar.f2226a.put(new Integer(i - 1), obj2);
                        cDVar.f2227b.put(new Integer(i - 1), obj);
                        return intValue + "-" + cD.f2222c.toString();
                    }
                    cDVar.f2226a.put(new Integer(i), obj2);
                    cDVar.f2227b.put(new Integer(i), obj);
                    return intValue + "-" + cD.f2223d.toString();
                }
            }
            intValue2 = 1;
            if (intValue2 != 1) {
                cDVar.f2226a.put(new Integer(i), obj2);
                cDVar.f2227b.put(new Integer(i), obj);
                return intValue + "-" + cD.f2223d.toString();
            }
            cDVar.f2226a.put(new Integer(i - 1), obj2);
            cDVar.f2227b.put(new Integer(i - 1), obj);
            return intValue + "-" + cD.f2222c.toString();
        } else if (i == 2) {
            if (obj != LuaNil.nil) {
                LuaTable luaTable2 = (LuaTable) obj;
                table2 = luaTable2.getTable("swipedistance");
                if (table2 != LuaNil.nil) {
                    cDVar.m2104a(((Double) table2).intValue());
                }
                table = luaTable2.getTable("swipevelocity");
                if (table != LuaNil.nil) {
                    cDVar.m2107b(((Double) table).intValue());
                }
            }
            cDVar.f2226a.put(new Integer(i), obj2);
            cDVar.f2227b.put(new Integer(i), obj);
            return intValue + "-" + cD.f2224e.toString();
        } else if (i == 3) {
            return null;
        } else {
            cDVar.f2226a.put(new Integer(i), obj2);
            cDVar.f2227b.put(new Integer(i), obj);
            return intValue + "-" + cD.f2225f.toString();
        }
    }

    protected final String m4431a(LuaTable luaTable) {
        String str = BuildConfig.FLAVOR;
        if (luaTable == null) {
            return str;
        }
        String str2;
        LuaNil table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_HINT);
        if (table != LuaNil.nil) {
            str2 = str + ((String) table);
        } else {
            table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_LABEL);
            str2 = table != LuaNil.nil ? str + ((String) table) : str;
        }
        return str2;
    }

    public final void m4432a(float f) {
        this.bC = f;
    }

    public final void m4433a(int i) {
        this.aJ += i;
    }

    public final void m4434a(LuaWidget luaWidget, Object obj, int i, Object obj2) {
        if (luaWidget != null) {
            if (LuaWidget.m3939f(obj2)) {
                long j = 0;
                Object a = cr.m2201a(((LuaTable) obj2).getTable(ATTR_WIDGET_ANIM_DELAY), 1);
                if (a != null) {
                    j = (long) (((Double) a).doubleValue() * 1000.0d);
                    ((LuaTable) obj2).setTable(ATTR_WIDGET_ANIM_DELAY, Double.valueOf(0.0d));
                }
                long j2 = j;
                setLayoutAnimator(luaWidget);
                this.f4030w.postDelayed(new fK(this, obj2, luaWidget, obj, i), j2);
                return;
            }
            m4386a(luaWidget, obj, i);
        }
    }

    public final void m4435a(C0211m c0211m) {
        this.bA.add(c0211m);
    }

    protected void m4436a(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3, int i) {
        LuaNil table;
        if (luaTable != null) {
            this.bj = new String((String) luaTable.getTable(ATTR_WIDGET_ID));
            super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
            table = luaTable.getTable(f4005a);
            if (table != LuaNil.nil) {
                super.setTable(f4005a, table);
            }
            table = luaTable.getTable(f4027z);
            if (table != LuaNil.nil) {
                super.setTable(f4027z, table);
            }
            table = luaTable.getTable(ATTR_WIDGET_SKIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_SKIN, table);
            }
            table = luaTable.getTable(f4006b);
            if (table != LuaNil.nil) {
                super.setTable(f4006b, table);
            }
            table = luaTable.getTable(f3995Q);
            if (table != LuaNil.nil) {
                super.setTable(f3995Q, table);
            }
            table = luaTable.getTable(f3996R);
            if (table != LuaNil.nil) {
                super.setTable(f3996R, table);
            }
            table = luaTable.getTable(f3997S);
            if (table != LuaNil.nil) {
                super.setTable(f3997S, table);
            }
            table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table);
            }
            if (this.ag == 1) {
                table = luaTable.getTable(f3991B);
                if (table != LuaNil.nil) {
                    super.setTable(f3991B, table);
                }
                table = luaTable.getTable(f3990A);
                if (table != LuaNil.nil) {
                    super.setTable(f3990A, table);
                }
                table = luaTable.getTable(f3992C);
                if (table != LuaNil.nil) {
                    super.setTable(f3992C, table);
                }
                table = luaTable.getTable(f3993D);
                if (table != LuaNil.nil) {
                    super.setTable(f3993D, table);
                }
                table = luaTable.getTable(f4007c);
                if (table != LuaNil.nil) {
                    super.setTable(f4007c, table);
                }
                table = luaTable.getTable(f4011g);
                if (table != LuaNil.nil) {
                    super.setTable(f4011g, table);
                }
                table = luaTable.getTable(f4010f);
                if (table != LuaNil.nil) {
                    super.setTable(f4010f, table);
                }
                table = luaTable.getTable(f3994P);
                if (table != LuaNil.nil) {
                    super.setTable(f3994P, table);
                }
                table = luaTable.getTable(f4008d);
                if (table != LuaNil.nil) {
                    super.setTable(f4008d, table);
                    this.aL = table != LuaNil.nil ? (Function) table : null;
                }
                table = luaTable.getTable(f4009e);
                if (table != LuaNil.nil) {
                    super.setTable(f4009e, table);
                    this.aM = table != LuaNil.nil ? (Function) table : null;
                }
            }
            table = luaTable.getTable(f4014j);
            if (table != LuaNil.nil) {
                super.setTable(f4014j, table);
            }
        }
        if (luaTable2 != null) {
            if (this.ag == 1) {
                table = luaTable2.getTable(f3998T);
                if (table != LuaNil.nil) {
                    super.setTable(f3998T, table);
                }
                table = luaTable2.getTable(ATTR_WIDGET_PADDING_IN_PIXEL);
                if (table != LuaNil.nil) {
                    super.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, table);
                }
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING, table);
            }
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(f3999U);
            if (table != LuaNil.nil) {
                super.setTable(f3999U, table);
            }
            table = luaTable3.getTable(f4000V);
            if (table != LuaNil.nil) {
                super.setTable(f4000V, table);
            }
            table = luaTable3.getTable(f4001W);
            if (table != LuaNil.nil) {
                super.setTable(f4001W, table);
            }
            table = luaTable3.getTable(f4002X);
            if (table != LuaNil.nil) {
                super.setTable(f4002X, table);
            }
            table = luaTable3.getTable(f4012h);
            if (table != LuaNil.nil) {
                super.setTable(f4012h, table);
            }
            table = luaTable3.getTable(f4013i);
            if (table != LuaNil.nil) {
                super.setTable(f4013i, table);
            }
            table = luaTable3.getTable(ab);
            if (table != LuaNil.nil) {
                super.setTable(ab, table);
            }
            table = luaTable3.getTable(f4019o);
            if (table != LuaNil.nil) {
                super.setTable(f4019o, table);
            }
            table = luaTable3.getTable(ac);
            if (table != LuaNil.nil) {
                super.setTable(ac, table);
            }
            table = luaTable3.getTable(ad);
            if (table != LuaNil.nil) {
                super.setTable(ad, table);
            }
        }
        if (this.ag == 1) {
            if (luaTable3 != null) {
                LuaNil table2 = luaTable3.getTable(f4003Y);
                if (table2 != LuaNil.nil) {
                    this.bd = ((Boolean) table2).booleanValue();
                    super.setTable(f4003Y, table2);
                }
                table = luaTable3.getTable(f4004Z);
                if (table != LuaNil.nil) {
                    super.setTable(f4004Z, table);
                }
                table = luaTable3.getTable(aa);
                if (table != LuaNil.nil) {
                    super.setTable(aa, table);
                }
                table = luaTable3.getTable(ao);
                if (table != LuaNil.nil) {
                    super.setTable(ao, table);
                }
                table = luaTable3.getTable(ar);
                if (table != LuaNil.nil) {
                    super.setTable(ar, table);
                }
                table = luaTable3.getTable(as);
                if (table != LuaNil.nil) {
                    super.setTable(as, table);
                }
            }
        } else if (this.ag == 0) {
            if (luaTable != null) {
                super.setTable(f3998T, luaTable.getTable(aj));
                super.setTable(f4007c, luaTable.getTable(f4020p));
                super.setTable(f4021q, luaTable.getTable(f4021q));
            }
            if (luaTable2 != null) {
                super.setTable(ATTR_WIDGET_MARGIN, luaTable2.getTable(ATTR_WIDGET_MARGIN));
                super.setTable(f3998T, luaTable2.getTable(f3998T));
            }
            if (luaTable3 != null) {
                super.setTable(am, luaTable3.getTable(am));
                super.setTable(f3990A, luaTable3.getTable(an));
                super.setTable(f4011g, luaTable3.getTable(f4011g));
                super.setTable(f3991B, luaTable3.getTable(f3991B));
                super.setTable(f4010f, luaTable3.getTable(f4010f));
                super.setTable(ai, luaTable3.getTable(ai));
                super.setTable(f3992C, luaTable3.getTable(ak));
                super.setTable(f3993D, luaTable3.getTable(al));
                table = luaTable3.getTable(f4008d);
                if (table != LuaNil.nil) {
                    super.setTable(f4008d, table);
                    this.aL = table != LuaNil.nil ? (Function) table : null;
                }
                table = luaTable3.getTable(f4009e);
                if (table != LuaNil.nil) {
                    super.setTable(f4009e, table);
                    this.aM = table != LuaNil.nil ? (Function) table : null;
                }
            }
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(ae);
            if (table != LuaNil.nil) {
                super.setTable(ae, table);
            }
            if (luaTable3 != null) {
                super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, luaTable3);
            }
        }
    }

    public final void m4437a(Object obj) {
        if (obj != null) {
            Object obj2;
            LuaWidget luaWidget = (LuaWidget) obj;
            if (luaWidget instanceof eO) {
                eO eOVar = (eO) luaWidget;
                if (eOVar.m4228j() || eOVar.m4229k()) {
                    obj2 = 1;
                    if (this.f4029v != f4022r && r0 == null) {
                        this.f4030w.f439a.post(new fA(this, luaWidget));
                        return;
                    } else if (this.f4029v != f4022r && r0 == null) {
                        m4385a(aC, luaWidget);
                        return;
                    }
                }
            }
            obj2 = null;
            if (this.f4029v != f4022r) {
            }
            if (this.f4029v != f4022r) {
            }
        }
    }

    public final synchronized void m4438a(Object obj, int i, Object obj2) {
        if (obj != null) {
            if (obj != LuaNil.nil) {
                int a = m4380a(obj, i);
                if (this.f4029v == f4022r) {
                    KonyMain.m4094a(new fQ(this, obj, a, obj2));
                }
            }
        }
    }

    protected final void m4439a(Object obj, Object obj2) {
        if (this.f4029v != 0) {
            String intern = ((String) obj).intern();
            if (intern == f4027z) {
                this.f4030w.m457b((String) obj2);
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        this.f4030w.m473e(r0);
                    }
                    this.ba = true;
                }
            } else if (intern == ATTR_WIDGET_PADDING && obj2 != LuaNil.nil) {
                this.f4030w.m451a(convertPaddingToPixels(obj2, null));
                this.f4030w.m490n();
            } else if (intern == f4000V) {
                r0 = cN.m2139a(super.getTable(f4000V));
                if (r0 != null) {
                    dB dBVar = new dB(r0);
                    if (this.ag == 0) {
                        dBVar.m1137d(null);
                    }
                    this.f4030w.m467d(dBVar);
                }
            } else if (intern == f4013i) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.aR = (Function) obj2;
                    r0 = super.getTable(ATTR_WIDGET_PLATFORMSPECIFIC);
                    if (r0 != null) {
                        ((LuaTable) r0).map.put(f4013i, obj2);
                    }
                    if (KonyMain.f3657e) {
                        Log.d("LuaForm", "OnDeviceMenuClick is set as " + this.aR);
                    }
                    this.f4030w.m441a(this.bu);
                }
            } else if (intern == f4001W) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    int intValue = ((Double) obj2).intValue();
                    r0 = super.getTable(ATTR_WIDGET_PLATFORMSPECIFIC);
                    if (r0 != null) {
                        ((LuaTable) r0).map.put(f4001W, obj2);
                    }
                    if (intValue == 0 || intValue == 1) {
                        this.f4030w.m479g(intValue);
                    }
                }
            } else if (intern == f4019o) {
                if (obj2 != null && (obj2 instanceof Function)) {
                    this.f4030w.m439a(this.br);
                }
            } else if (intern == ab) {
                if (obj2 != null && (obj2 instanceof Boolean)) {
                    r0 = this.f4030w;
                    aD.m431i(((Boolean) obj2).booleanValue());
                }
            } else if (intern == ac) {
                if (obj2 != null && (obj2 instanceof Boolean)) {
                    r0 = this.f4030w;
                    aD.m432j(((Boolean) obj2).booleanValue());
                }
            } else if (intern == ad) {
                if (obj2 != null && (obj2 instanceof String)) {
                    r0 = this.f4030w;
                    aD.m428c((String) obj2);
                }
            } else if (intern == ae) {
                super.setTable(ae, obj2);
            } else if (intern == f4004Z) {
                super.setTable(f4004Z, obj2);
            } else if (intern == aa) {
                super.setTable(aa, obj2);
            } else if (intern == af) {
                this.bo = ((Boolean) obj2).booleanValue();
            } else if (intern == av) {
                if (obj2 != LuaNil.nil) {
                    this.bp = (LuaWidget) obj2;
                } else {
                    this.bp = null;
                }
            } else if (intern == ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
                if (obj2 != null && (obj2 instanceof LuaTable)) {
                    aD aDVar;
                    this.f4030w.m468d(m4431a((LuaTable) obj2));
                    LuaNil table = ((LuaTable) obj2).getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_LABEL);
                    if (table == LuaNil.nil || ((String) table).length() <= 0) {
                        intern = this.f4030w.m452b();
                        aDVar = this.f4030w;
                        if (intern == null) {
                            intern = BuildConfig.FLAVOR;
                        }
                    } else {
                        aD aDVar2 = this.f4030w;
                        intern = table.toString();
                        aDVar = aDVar2;
                    }
                    aDVar.m474e(intern);
                } else if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f4030w.m496t();
                }
            } else if (intern == at) {
                LuaNil a = cr.m2201a(obj2, 0);
                if (a != null && a != LuaNil.nil) {
                    this.f4030w.m486k(((Boolean) a).booleanValue());
                }
            } else if (intern != au) {
            } else {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    m4412e(obj2);
                } else if (f4026y) {
                    this.f4030w.m434a(f4025x);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m4440a(java.lang.Object[] r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        if (r7 == 0) goto L_0x0006;
    L_0x0003:
        r1 = r7.length;	 Catch:{ all -> 0x0046 }
        if (r1 != 0) goto L_0x0008;
    L_0x0006:
        monitor-exit(r6);
        return;
    L_0x0008:
        r1 = 1;
        r3 = r1;
    L_0x000a:
        r1 = r7.length;	 Catch:{ all -> 0x0046 }
        if (r3 >= r1) goto L_0x011d;
    L_0x000d:
        r1 = r7[r3];	 Catch:{ all -> 0x0046 }
        r1 = (com.konylabs.api.ui.LuaWidget) r1;	 Catch:{ all -> 0x0046 }
        r2 = r1 instanceof com.konylabs.api.ui.hg;	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x0031;
    L_0x0015:
        r0 = r1;
        r0 = (com.konylabs.api.ui.hg) r0;	 Catch:{ all -> 0x0046 }
        r2 = r0;
        r2 = r2.m4715b();	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x0025;
    L_0x001f:
        r0 = r1;
        r0 = (com.konylabs.api.ui.hg) r0;	 Catch:{ all -> 0x0046 }
        r2 = r0;
        r6.aT = r2;	 Catch:{ all -> 0x0046 }
    L_0x0025:
        r1.setParent(r6);	 Catch:{ all -> 0x0046 }
        r2 = r6.aE;	 Catch:{ all -> 0x0046 }
        r2.add(r1);	 Catch:{ all -> 0x0046 }
    L_0x002d:
        r1 = r3 + 1;
        r3 = r1;
        goto L_0x000a;
    L_0x0031:
        r2 = r1 instanceof ny0k.bO;	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x0049;
    L_0x0035:
        r0 = r1;
        r0 = (ny0k.bO) r0;	 Catch:{ all -> 0x0046 }
        r2 = r0;
        r2 = r2.m4836k();	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x0025;
    L_0x003f:
        r0 = r1;
        r0 = (ny0k.bO) r0;	 Catch:{ all -> 0x0046 }
        r2 = r0;
        r6.aU = r2;	 Catch:{ all -> 0x0046 }
        goto L_0x0025;
    L_0x0046:
        r1 = move-exception;
        monitor-exit(r6);
        throw r1;
    L_0x0049:
        r2 = r1 instanceof com.konylabs.api.ui.hP;	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x005e;
    L_0x004d:
        r0 = r1;
        r0 = (com.konylabs.api.ui.hP) r0;	 Catch:{ all -> 0x0046 }
        r2 = r0;
        r2 = r2.m4659b();	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x0025;
    L_0x0057:
        r0 = r1;
        r0 = (com.konylabs.api.ui.hP) r0;	 Catch:{ all -> 0x0046 }
        r2 = r0;
        r6.aV = r2;	 Catch:{ all -> 0x0046 }
        goto L_0x0025;
    L_0x005e:
        r2 = r1 instanceof com.konylabs.api.ui.gH;	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x0073;
    L_0x0062:
        r0 = r1;
        r0 = (com.konylabs.api.ui.gH) r0;	 Catch:{ all -> 0x0046 }
        r2 = r0;
        r2 = r2.m4514b();	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x0025;
    L_0x006c:
        r0 = r1;
        r0 = (com.konylabs.api.ui.gH) r0;	 Catch:{ all -> 0x0046 }
        r2 = r0;
        r6.aW = r2;	 Catch:{ all -> 0x0046 }
        goto L_0x0025;
    L_0x0073:
        r2 = r1 instanceof com.konylabs.api.ui.hq;	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x0088;
    L_0x0077:
        r0 = r1;
        r0 = (com.konylabs.api.ui.hq) r0;	 Catch:{ all -> 0x0046 }
        r2 = r0;
        r2 = r2.m4730b();	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x0025;
    L_0x0081:
        r0 = r1;
        r0 = (com.konylabs.api.ui.hq) r0;	 Catch:{ all -> 0x0046 }
        r2 = r0;
        r6.aX = r2;	 Catch:{ all -> 0x0046 }
        goto L_0x0025;
    L_0x0088:
        r2 = r1 instanceof com.konylabs.api.ui.eO;	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x00f1;
    L_0x008c:
        r0 = r1;
        r0 = (com.konylabs.api.ui.eO) r0;	 Catch:{ all -> 0x0046 }
        r2 = r0;
        r4 = r2.m4222d();	 Catch:{ all -> 0x0046 }
        if (r4 <= 0) goto L_0x009b;
    L_0x0096:
        r5 = r6.aJ;	 Catch:{ all -> 0x0046 }
        r4 = r4 + r5;
        r6.aJ = r4;	 Catch:{ all -> 0x0046 }
    L_0x009b:
        r4 = r2.m4228j();	 Catch:{ all -> 0x0046 }
        if (r4 == 0) goto L_0x00b6;
    L_0x00a1:
        r4 = r6.aY;	 Catch:{ all -> 0x0046 }
        if (r4 != 0) goto L_0x00ac;
    L_0x00a5:
        r4 = new java.util.Vector;	 Catch:{ all -> 0x0046 }
        r4.<init>();	 Catch:{ all -> 0x0046 }
        r6.aY = r4;	 Catch:{ all -> 0x0046 }
    L_0x00ac:
        r4 = r6.aY;	 Catch:{ all -> 0x0046 }
        r4.add(r2);	 Catch:{ all -> 0x0046 }
        r1.setParent(r6);	 Catch:{ all -> 0x0046 }
        goto L_0x002d;
    L_0x00b6:
        r4 = r2.m4229k();	 Catch:{ all -> 0x0046 }
        if (r4 == 0) goto L_0x00d1;
    L_0x00bc:
        r4 = r6.aZ;	 Catch:{ all -> 0x0046 }
        if (r4 != 0) goto L_0x00c7;
    L_0x00c0:
        r4 = new java.util.Vector;	 Catch:{ all -> 0x0046 }
        r4.<init>();	 Catch:{ all -> 0x0046 }
        r6.aZ = r4;	 Catch:{ all -> 0x0046 }
    L_0x00c7:
        r4 = r6.aZ;	 Catch:{ all -> 0x0046 }
        r4.add(r2);	 Catch:{ all -> 0x0046 }
        r1.setParent(r6);	 Catch:{ all -> 0x0046 }
        goto L_0x002d;
    L_0x00d1:
        r4 = r2.m4226h();	 Catch:{ all -> 0x0046 }
        if (r4 == 0) goto L_0x00e1;
    L_0x00d7:
        r4 = r6.aH;	 Catch:{ all -> 0x0046 }
        r4.add(r2);	 Catch:{ all -> 0x0046 }
        r1.setParent(r6);	 Catch:{ all -> 0x0046 }
        goto L_0x002d;
    L_0x00e1:
        r4 = r2.m4227i();	 Catch:{ all -> 0x0046 }
        if (r4 == 0) goto L_0x0025;
    L_0x00e7:
        r4 = r6.aI;	 Catch:{ all -> 0x0046 }
        r4.add(r2);	 Catch:{ all -> 0x0046 }
        r1.setParent(r6);	 Catch:{ all -> 0x0046 }
        goto L_0x002d;
    L_0x00f1:
        r2 = r1 instanceof com.konylabs.api.ui.hD;	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x0107;
    L_0x00f5:
        r0 = r1;
        r0 = (com.konylabs.api.ui.hD) r0;	 Catch:{ all -> 0x0046 }
        r2 = r0;
        r2 = r2.m4632b();	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x0025;
    L_0x00ff:
        r2 = r6.aJ;	 Catch:{ all -> 0x0046 }
        r2 = r2 + 1;
        r6.aJ = r2;	 Catch:{ all -> 0x0046 }
        goto L_0x0025;
    L_0x0107:
        r2 = r1 instanceof com.konylabs.api.ui.hJ;	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x0025;
    L_0x010b:
        r0 = r1;
        r0 = (com.konylabs.api.ui.hJ) r0;	 Catch:{ all -> 0x0046 }
        r2 = r0;
        r2 = r2.m4648b();	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x0025;
    L_0x0115:
        r2 = r6.aJ;	 Catch:{ all -> 0x0046 }
        r2 = r2 + 1;
        r6.aJ = r2;	 Catch:{ all -> 0x0046 }
        goto L_0x0025;
    L_0x011d:
        r1 = r6.f4029v;	 Catch:{ all -> 0x0046 }
        r2 = f4022r;	 Catch:{ all -> 0x0046 }
        if (r1 != r2) goto L_0x0006;
    L_0x0123:
        r1 = new com.konylabs.api.ui.fP;	 Catch:{ all -> 0x0046 }
        r1.<init>(r6, r7);	 Catch:{ all -> 0x0046 }
        com.konylabs.android.KonyMain.m4094a(r1);	 Catch:{ all -> 0x0046 }
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.ui.fv.a(java.lang.Object[]):void");
    }

    public final synchronized Object[] m4441a(int i, Object obj) {
        Object[] objArr;
        int a = cr.m2199a(i, 0);
        int size = this.aE.size();
        if (a >= 0 && a < size) {
            Object obj2 = (LuaWidget) this.aE.elementAt(a);
            if (obj2 != null) {
                Object[] objArr2 = new Object[]{obj2};
                m4446b(obj2, obj);
                objArr = objArr2;
            }
        }
        objArr = null;
        return objArr;
    }

    protected void m4442b() {
        dB a;
        int intValue;
        int i;
        int i2 = 0;
        this.f4030w = new aD(KonyMain.getActContext());
        LuaNil table = super.getTable(ATTR_WIDGET_ID);
        if (table != LuaNil.nil) {
            this.f4030w.m448a((String) table);
        }
        Object table2 = super.getTable(ATTR_WIDGET_SKIN);
        if (table2 != LuaNil.nil) {
            a = cN.m2139a(table2);
            if (a != null) {
                this.f4030w.m462c(a);
            }
            this.ba = true;
        } else {
            hp hpVar = new hp();
            hpVar.m3352a().m1128b(-1);
            this.f4030w.m462c(hpVar.m3352a());
        }
        table2 = super.getTable(f3995Q);
        if (table2 != LuaNil.nil) {
            a = cN.m2139a(table2);
            if (a != null) {
                this.f4030w.m446a(a);
            }
        } else {
            this.f4030w.m446a(new hp().m3352a());
        }
        table2 = super.getTable(f3996R);
        if (table2 != LuaNil.nil) {
            a = cN.m2139a(table2);
            if (a != null) {
                this.f4030w.m456b(a);
            }
        }
        if (super.getTable(f3999U) != LuaNil.nil) {
            this.f4030w.m458b(Boolean.parseBoolean(this.map.get(f3999U).toString()));
            if (super.getTable(f4000V) != LuaNil.nil) {
                a = cN.m2139a(super.getTable(f4000V));
                if (a != null) {
                    this.f4030w.m467d(a);
                }
            }
            if (super.getTable(am) != LuaNil.nil) {
                Drawable c = dB.m1112c(super.getTable(am).toString());
                if (c != null) {
                    this.f4030w.m435a(c);
                }
            }
        }
        table = super.getTable(f3990A);
        this.aN = table != LuaNil.nil ? ((Boolean) table).booleanValue() : true;
        this.f4030w.m463c(this.aN);
        table = super.getTable(f3998T);
        if (table != LuaNil.nil) {
            this.f4030w.m471e(((Double) table).intValue());
        } else {
            this.f4030w.m471e(2);
        }
        this.aO = null;
        table = super.getTable(f4011g);
        if (table != LuaNil.nil) {
            this.aO = (Function) table;
            this.f4030w.m443a(this.bq);
        }
        table = super.getTable(f3991B);
        boolean booleanValue = table != LuaNil.nil ? ((Boolean) table).booleanValue() : true;
        this.aP = null;
        this.aQ = null;
        this.aR = null;
        table = super.getTable(f4012h);
        if (table != LuaNil.nil) {
            this.aP = (Function) table;
            this.f4030w.m440a(this.bs);
        }
        table = super.getTable(f4010f);
        if (table != LuaNil.nil) {
            this.aQ = (Function) table;
            if (KonyMain.f3657e) {
                Log.d("LuaForm", "OnHide is set as " + this.aQ);
            }
            this.f4030w.m442a(this.bt);
        }
        table = super.getTable(f4013i);
        if (table != LuaNil.nil) {
            this.aR = (Function) table;
            if (KonyMain.f3657e) {
                Log.d("LuaForm", "OnDeviceMenuClick is set as " + this.aR);
            }
            this.f4030w.m441a(this.bu);
        }
        table = super.getTable(f4001W);
        if (table != LuaNil.nil) {
            intValue = ((Double) table).intValue();
            if (intValue == 0 || intValue == 1) {
                this.f4030w.m479g(intValue);
            }
        }
        table = super.getTable(ai);
        if (table != LuaNil.nil) {
            this.f4030w.m453b(((Double) table).intValue());
        }
        table = super.getTable(ATTR_WIDGET_PADDING);
        if (table != LuaNil.nil) {
            this.f4030w.m451a(convertPaddingToPixels(table, null));
        }
        table = super.getTable(as);
        if (table != LuaNil.nil) {
            this.f4030w.m483h(((Boolean) table).booleanValue());
        } else {
            this.f4030w.m483h(false);
        }
        table = super.getTable(f3992C);
        if (table != LuaNil.nil) {
            this.aF.addAll(((LuaTable) table).list);
        }
        table = super.getTable(f3993D);
        if (table != LuaNil.nil) {
            this.aG.addAll(((LuaTable) table).list);
        }
        table = super.getTable(af);
        if (table != LuaNil.nil) {
            this.bo = ((Boolean) table).booleanValue();
        }
        table = super.getTable(f4002X);
        if (table != LuaNil.nil) {
            intValue = ((Double) table).intValue();
            if (intValue == 0) {
                this.f4030w.m460c(16);
            } else if (intValue == 1) {
                this.f4030w.m460c(32);
            } else if (intValue == 2) {
                this.f4030w.m460c((int) Config.X_DENSITY);
            }
        }
        table = super.getTable(f4014j);
        if (table != LuaNil.nil) {
            LuaTable luaTable;
            luaTable = (LuaTable) table;
            boolean z = luaTable.getTable(f4015k) != LuaNil.nil;
            if (luaTable.getTable(f4016l) != LuaNil.nil) {
                z = true;
            }
            if (luaTable.getTable(f4017m) != LuaNil.nil) {
                z = true;
            }
            if (luaTable.getTable(f4018n) != LuaNil.nil) {
                z = true;
            }
            if (z) {
                this.f4030w.m449a(this.bz);
            }
        }
        table = super.getTable(ab);
        if (table != LuaNil.nil) {
            aD aDVar = this.f4030w;
            aD.m431i(((Boolean) table).booleanValue());
        } else {
            aD aDVar2 = this.f4030w;
            aD.m431i(false);
        }
        table = super.getTable(f4019o);
        if (table != LuaNil.nil) {
            this.aP = (Function) table;
            this.f4030w.m439a(this.br);
        }
        table = super.getTable(ac);
        if (table != LuaNil.nil) {
            aDVar = this.f4030w;
            aD.m432j(((Boolean) table).booleanValue());
        }
        table = super.getTable(ad);
        if (table != LuaNil.nil) {
            aDVar = this.f4030w;
            aD.m428c(table.toString());
        } else {
            aDVar2 = this.f4030w;
            aD.m428c("icon");
        }
        table = super.getTable(av);
        if (table != LuaNil.nil) {
            this.bp = (LuaWidget) table;
        } else {
            this.bp = null;
        }
        table = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil && (table instanceof LuaTable)) {
            table = ((LuaTable) table).getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_HINT);
            if (table != LuaNil.nil) {
                this.f4030w.m468d(table.toString());
            }
        }
        this.f4030w.m475e(booleanValue);
        synchronized (this) {
            Iterator it;
            this.f4029v = f4022r;
            if (this.aV != null) {
                this.f4030w.m465d(6);
            } else if (this.aW != null) {
                this.f4030w.m465d(7);
            } else if (this.aX != null) {
                this.f4030w.m465d(8);
            } else if (!(this.aT == null && this.aU == null)) {
                this.f4030w.m465d(5);
            }
            table = super.getTable(at);
            if (table != LuaNil.nil) {
                this.f4030w.m486k(((Boolean) table).booleanValue());
            }
            table2 = super.getTable(au);
            if (table2 != LuaNil.nil) {
                m4412e(table2);
            } else if (f4026y) {
                this.f4030w.m434a(f4025x);
            }
            if (this.aT != null) {
                this.aT.m4709a(this.aY);
                this.aT.m4713b(this.aZ);
            } else if (this.aU == null || !(this.aU instanceof bY)) {
                if (this.aY != null) {
                    it = this.aY.iterator();
                    while (it.hasNext()) {
                        this.aE.add((eO) it.next());
                    }
                }
                if (this.aZ != null) {
                    it = this.aZ.iterator();
                    while (it.hasNext()) {
                        this.aE.add((eO) it.next());
                    }
                }
            } else {
                bY bYVar = (bY) this.aU;
                bYVar.m4958c(this.aY);
                bYVar.m4960d(this.aZ);
            }
            table = super.getTable(ao);
            if (table != LuaNil.nil) {
                this.f4030w.m478f(((Boolean) table).booleanValue());
            } else {
                this.f4030w.m478f(false);
            }
            table = super.getTable(ar);
            if (table != LuaNil.nil) {
                this.f4030w.m480g(((Boolean) table).booleanValue());
            } else {
                this.f4030w.m480g(false);
            }
            it = this.aF.iterator();
            while (it.hasNext()) {
                LuaWidget luaWidget = (LuaWidget) it.next();
                this.f4030w.m455b(luaWidget.getWidget());
                if (luaWidget instanceof eO) {
                    intValue = ((eO) luaWidget).m4222d();
                    if (intValue > 0) {
                        this.aJ = intValue + this.aJ;
                    }
                }
            }
            it = this.aH.iterator();
            while (it.hasNext()) {
                this.f4030w.m437a(((LuaWidget) it.next()).getWidget());
            }
            Iterator it2 = this.aE.iterator();
            i = 0;
            while (it2.hasNext()) {
                luaWidget = (LuaWidget) it2.next();
                luaWidget.setParent(this);
                this.f4030w.m437a(luaWidget.getWidget());
                int i3 = i + 1;
                m3945a(luaWidget, i);
                i = i3;
            }
            it = this.aI.iterator();
            while (it.hasNext()) {
                this.f4030w.m437a(((LuaWidget) it.next()).getWidget());
            }
            it = this.aG.iterator();
            while (it.hasNext()) {
                luaWidget = (LuaWidget) it.next();
                this.f4030w.m461c(luaWidget.getWidget());
                if (luaWidget instanceof eO) {
                    intValue = ((eO) luaWidget).m4222d();
                    if (intValue > 0) {
                        this.aJ = intValue + this.aJ;
                    }
                }
            }
        }
        if (this.aK) {
            this.f4030w.m465d(4);
        }
        try {
            table = super.getTable(f3997S);
            if (table != LuaNil.nil) {
                this.f4030w.m445a(this.bx);
                Vector vector = ((LuaTable) table).list;
                for (i3 = 0; i3 < vector.size(); i3++) {
                    luaTable = (LuaTable) vector.elementAt(i3);
                    Object[] objArr = new Object[luaTable.size()];
                    luaTable.list.copyInto(objArr);
                    cu cuVar = new cu((String) objArr[0], (String) objArr[1], 0, objArr[3]);
                    this.f4030w.m444a(cuVar);
                    if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
                        cuVar.m1042a(objArr[2].toString());
                    }
                    if (objArr.length > 4 && (objArr[4] instanceof LuaTable)) {
                        table2 = ((LuaTable) objArr[4]).getTable(cu.f1020a);
                        if (table2 instanceof Double) {
                            cuVar.m1041a(((Double) table2).intValue());
                        }
                    }
                }
            }
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("LuaForm", "MenuItems Add failed", e);
            }
        }
        LuaNil table3 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table3 != LuaNil.nil && (table3 instanceof LuaTable)) {
            this.f4030w.m468d(m4431a((LuaTable) table3));
            table3 = ((LuaTable) table3).getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_LABEL);
            if (table3 != LuaNil.nil && ((String) table3).length() > 0) {
                this.f4030w.m474e(table3.toString());
            }
        }
        table = super.getTable(f4027z);
        if (table != LuaNil.nil) {
            this.f4030w.m457b((String) table);
            this.bb = true;
        }
        i = this.by.size();
        while (i2 < i) {
            this.f4030w.m436a(((aL) this.by.valueAt(i2)).f475a);
            i2++;
        }
        this.f4030w.m447a(this.bB);
    }

    public final void m4443b(int i) {
        this.aJ -= i;
    }

    public final void m4444b(C0211m c0211m) {
        this.bA.remove(c0211m);
    }

    public final void m4445b(Object obj) {
        String[] split = obj.toString().split("-");
        if (split.length == 2) {
            int parseInt = Integer.parseInt(split[0]);
            aL aLVar = (aL) this.by.get(parseInt);
            if (aLVar != null) {
                cD cDVar = aLVar.f476b;
                if (cDVar != null) {
                    int parseDouble = (int) Double.parseDouble(split[1].toString());
                    if ((obj instanceof Double) && parseDouble == 1 && cDVar.f2226a.get(Integer.valueOf(parseDouble - 1)) != null) {
                        cDVar.f2226a.remove(Integer.valueOf(parseDouble - 1));
                        cDVar.f2227b.remove(Integer.valueOf(parseDouble - 1));
                    }
                    if (cDVar.f2226a.get(Integer.valueOf(parseDouble)) != null) {
                        cDVar.f2226a.remove(Integer.valueOf(parseDouble));
                        cDVar.f2227b.remove(Integer.valueOf(parseDouble));
                    }
                    if (cDVar.f2226a.isEmpty()) {
                        if (this.f4029v == f4022r) {
                            this.f4030w.m454b(((aL) this.by.get(parseInt)).f475a);
                        }
                        aLVar.f475a = null;
                        aLVar.f476b = null;
                        this.by.delete(parseInt);
                    }
                }
            }
        }
    }

    public final synchronized void m4446b(Object obj, Object obj2) {
        if (obj != null) {
            if (obj != LuaNil.nil && (obj instanceof LuaWidget)) {
                m4409d(obj);
                if (this.f4029v == f4022r) {
                    KonyMain.m4094a(new fw(this, obj, obj2));
                }
            }
        }
    }

    protected void m4447b(boolean z) {
        if (KonyMain.getActContext() == null) {
            KonyMain.f3653a = super.getTable(ATTR_WIDGET_ID).toString();
            return;
        }
        Iterator it;
        if (this.f4028u == 0) {
            m4378E();
        }
        LuaNil luaNil = LuaNil.nil;
        luaNil = super.getTable(f3992C);
        if (luaNil != LuaNil.nil) {
            it = ((LuaTable) luaNil).list.iterator();
            while (it.hasNext()) {
                ((eO) it.next()).m4235q();
            }
        }
        luaNil = super.getTable(f3993D);
        if (luaNil != LuaNil.nil) {
            it = ((LuaTable) luaNil).list.iterator();
            while (it.hasNext()) {
                ((eO) it.next()).m4235q();
            }
        }
        if (!(this.ag != 1 && z && this.bi)) {
            luaNil = super.getTable(f4008d);
            this.aL = luaNil != LuaNil.nil ? (Function) luaNil : null;
            if (this.aL != null) {
                try {
                    if (KonyMain.getActContext() != null) {
                        this.aL.execute(new Object[]{this});
                    }
                } catch (Exception e) {
                    if (KonyMain.f3657e) {
                        Log.d("LuaForm", BuildConfig.FLAVOR + e.getMessage());
                    }
                    if (e instanceof LuaError) {
                        throw ((LuaError) e);
                    }
                    throw new LuaError("Error in form preshow callback. " + e.getMessage(), 605);
                }
            }
        }
        ii iiVar = new ii(new fE(this, z), false);
        KonyMain.m4092a(iiVar);
        iiVar.m1406a();
    }

    public final synchronized Object[] m4448b(Object obj, int i, Object obj2) {
        Object[] objArr = null;
        synchronized (this) {
            if (obj != null) {
                if (obj != LuaNil.nil) {
                    int a = cr.m2199a(i, 0);
                    int size = this.aE.size();
                    if (a >= 0 && a < size) {
                        Object obj3 = (LuaWidget) this.aE.elementAt(a);
                        if (obj3 != null) {
                            Object[] objArr2 = new Object[]{obj3};
                            if (this.f4029v == f4022r) {
                                KonyMain.m4094a(new fJ(this, obj3, obj, a, obj2));
                                objArr = objArr2;
                            } else {
                                m4409d(obj3);
                                m4380a(obj, a);
                                objArr = objArr2;
                            }
                        }
                    }
                }
            }
        }
        return objArr;
    }

    public final void m4449c() {
        m4414e(true);
    }

    public void m4450c(boolean z) {
        if (this.bv) {
            Log.e("LuaForm", "Form Show called from PreShow Callback");
            return;
        }
        this.bv = true;
        if (this.f4029v == 0) {
            if (KonyMain.getActContext() == null) {
                KonyMain.f3653a = super.getTable(ATTR_WIDGET_ID).toString();
                return;
            }
            m4442b();
        }
        if (this.aE.size() == 0 && this.aF.size() == 0 && this.aG.size() == 0 && this.aI.size() == 0 && this.aH.size() == 0 && !this.bb && !this.ba) {
            throw new LuaError("Form not initialized properly.", 603);
        }
        if (this.f4028u == ay && super.getTable(f4021q) != LuaNil.nil) {
            this.f4028u = f4024t;
            m4377D();
        }
        this.f4030w.m459c();
        m4376C();
        this.bv = false;
        LuaNil table = super.getTable(f4009e);
        this.aM = table != LuaNil.nil ? (Function) table : null;
        if (!(this.aM == null || (this.ag != 1 && z && this.bi))) {
            table = super.getTable(f4009e);
            this.aM = table != LuaNil.nil ? (Function) table : null;
            if (this.aM != null) {
                Message obtain = Message.obtain();
                obtain.what = 7;
                obtain.obj = this.aM;
                Bundle bundle = new Bundle(2);
                bundle.putSerializable("key0", this);
                bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
        this.bi = true;
        this.f4030w.f439a.m1338a(this.bD);
    }

    public void cleanup() {
        if (this.f4029v != 0) {
            Iterator it;
            if (this.bd) {
                this.be = this.f4030w.f439a.getScrollX();
                this.bf = this.f4030w.f439a.getScrollY();
                m4385a(0, null);
            }
            if (this.f4030w != null) {
                it = this.aF.iterator();
                while (it.hasNext()) {
                    ((eO) ((LuaWidget) it.next())).m4204a(this.f4030w.f440b);
                }
                it = this.aG.iterator();
                while (it.hasNext()) {
                    ((eO) ((LuaWidget) it.next())).m4204a(this.f4030w.f441c);
                }
                this.f4030w.m488l();
            }
            it = this.aF.iterator();
            while (it.hasNext()) {
                ((eO) ((LuaWidget) it.next())).m4204a(this.f4030w.f440b);
            }
            it = this.aG.iterator();
            while (it.hasNext()) {
                ((eO) ((LuaWidget) it.next())).m4204a(this.f4030w.f441c);
            }
            this.aF.clear();
            this.aG.clear();
            this.K = null;
            this.J = 0;
            this.L.clear();
            it = this.aH.iterator();
            while (it.hasNext()) {
                ((LuaWidget) it.next()).cleanup();
            }
            it = this.aI.iterator();
            while (it.hasNext()) {
                ((LuaWidget) it.next()).cleanup();
            }
            it = this.aE.iterator();
            while (it.hasNext()) {
                LuaWidget luaWidget = (LuaWidget) it.next();
                if (luaWidget.getParent() == this) {
                    luaWidget.cleanup();
                }
            }
            this.bp = null;
            this.f4030w = null;
            this.bb = false;
            this.ba = false;
            MessageQueue myQueue = Looper.myQueue();
            if (myQueue != null) {
                myQueue.addIdleHandler(this.bw);
            }
            this.f4029v = 0;
        }
    }

    public LuaWidget createClone() {
        return null;
    }

    public final void m4451d(boolean z) {
        this.aK = true;
    }

    public final synchronized Object[] m4452d() {
        Object[] objArr;
        Collection childWidgets = getChildWidgets();
        if (childWidgets != null) {
            Vector vector = new Vector(childWidgets);
            new LuaTable().addAll(vector);
            objArr = new Object[]{r2};
        } else {
            objArr = null;
        }
        return objArr;
    }

    public final void m4453e() {
        if (this.f4029v != f4022r) {
            m4385a(aA, null);
        } else if (this.f4030w != null) {
            m4384a(0, 0);
        }
    }

    public final void m4454f() {
        if (this.f4029v != f4022r) {
            m4385a(aB, null);
        } else if (this.f4030w != null) {
            this.f4030w.f439a.post(new fB(this));
        }
    }

    public final void m4455g() {
        m4414e(false);
    }

    public LuaWidget getChildWidget(String str) {
        if (this.f4028u == 0) {
            return null;
        }
        Object table = super.getTable(str);
        return table instanceof LuaWidget ? (LuaWidget) table : null;
    }

    public ArrayList getChildWidgets() {
        if (this.f4028u == 0) {
            return null;
        }
        Object arrayList = new ArrayList(this.aE);
        Collections.copy(arrayList, this.aE);
        return arrayList;
    }

    public String getID() {
        return super.getTable(ATTR_WIDGET_ID).toString();
    }

    public LuaWidget getParent() {
        return null;
    }

    public Hashtable getProperties() {
        if (this.f4028u == 0) {
            return null;
        }
        Hashtable hashtable = new Hashtable();
        hashtable.put(f4027z, "string");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(f4001W, "number");
        hashtable.put(f4013i, "function");
        hashtable.put(ATTR_WIDGET_PLATFORMSPECIFIC, "table");
        return hashtable;
    }

    public Object getProperty(String str) {
        return this.f4028u == 0 ? null : super.getTable(str);
    }

    public Object getTable(Object obj) {
        Object iiVar;
        if (this.f4028u == 0) {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                m4378E();
            } else {
                synchronized (this) {
                    iiVar = new ii(new fF(this));
                    KonyMain.m4121f().post(iiVar);
                    iiVar.m1406a();
                }
            }
        }
        iiVar = obj == an ? f3990A : obj;
        if (obj == aj) {
            iiVar = f3998T;
        }
        if (obj == ak) {
            iiVar = f3992C;
        }
        if (obj == al) {
            iiVar = f3993D;
        }
        if (obj == f4020p) {
            iiVar = f4007c;
        }
        return super.getTable(iiVar);
    }

    public String getType() {
        return "Form";
    }

    public View getWidget() {
        if (this.f4029v == 0) {
            m4442b();
        }
        return this.f4030w.m464d();
    }

    public int getWidth() {
        return KonyMain.getActContext().m4166o();
    }

    public final aD m4456h() {
        return this.f4030w;
    }

    public void handleOrientationChange(int i) {
        if (this.f4029v != 0) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4030w.m451a(convertPaddingToPixels(table, null));
            }
            this.f4030w.m491o();
            Iterator it = this.aE.iterator();
            while (it.hasNext()) {
                ((LuaWidget) it.next()).handleOrientationChange(i);
            }
            it = this.aF.iterator();
            while (it.hasNext()) {
                ((LuaWidget) it.next()).handleOrientationChange(i);
            }
            it = this.aH.iterator();
            while (it.hasNext()) {
                ((LuaWidget) it.next()).handleOrientationChange(i);
            }
            it = this.aI.iterator();
            while (it.hasNext()) {
                ((LuaWidget) it.next()).handleOrientationChange(i);
            }
            it = this.aG.iterator();
            while (it.hasNext()) {
                ((LuaWidget) it.next()).handleOrientationChange(i);
            }
            if (KonyMain.f3656d >= 11 && this.aK && fi.m4323f() != null) {
                fi.m4323f().m310k();
            }
        }
    }

    public final boolean m4457k() {
        return this.aJ > 0;
    }

    public final void m4458l() {
        this.bc = true;
    }

    public final boolean m4459m() {
        return this.bc;
    }

    public final boolean m4460n() {
        return this.aK;
    }

    public void m4461r() {
        LuaNil table = super.getTable(f3994P);
        Object obj = table != LuaNil.nil ? (Function) table : null;
        if (obj != null) {
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = obj;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", this);
            bundle.putSerializable("hideProgress", Boolean.valueOf(true));
            bundle.putSerializable("keepVKBOpen", Boolean.valueOf(true));
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
        obj = super.getTable(ATTR_WIDGET_ID);
        if (this.map != null) {
            this.map.clear();
        }
        if (this.bk != null) {
            m4400b(this.bk);
        } else {
            super.setTable(ATTR_WIDGET_ID, obj);
        }
        this.aJ = 0;
        cleanup();
        this.aE.clear();
        this.aH.clear();
        this.aI.clear();
        if (this.aY != null) {
            this.aY.clear();
        }
        if (this.aZ != null) {
            this.aZ.clear();
        }
        this.f4028u = 0;
        this.bi = false;
        if (this.bA != null) {
            this.bA.removeAll(this.bA);
        }
    }

    public void setAnimation() {
        Iterator it = this.aE.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void setEnabled(boolean z) {
    }

    public void setFocus() {
    }

    public void setFontColor(Object[] objArr) {
    }

    public void setHeight(int i) {
    }

    public void setLayoutAnimator(LuaWidget luaWidget) {
        for (LuaWidget luaWidget2 : this.aE.toArray()) {
            if (luaWidget2 != luaWidget) {
                luaWidget2.setLayoutAnimator(luaWidget);
            }
        }
    }

    public void setTable(Object obj, Object obj2) {
        Object obj3 = obj == an ? f3990A : obj;
        if (obj == aj) {
            obj3 = f3998T;
        }
        if (obj == ak) {
            obj3 = f3992C;
        }
        if (obj == al) {
            obj3 = f3993D;
        }
        if (obj == f4020p) {
            obj3 = f4007c;
        }
        super.setTable(obj, obj2);
        if (this.f4029v == f4022r) {
            m3950d(obj3, obj2);
        }
    }

    public void setVisibility(boolean z) {
    }

    public void setWeight() {
    }

    public void setWidth(int i) {
    }

    public final String m4462t() {
        return (String) super.getTable(ATTR_WIDGET_ID);
    }

    public final boolean m4463u() {
        return this.f4028u == f4024t;
    }

    public final int m4464v() {
        if (this.ag == 0) {
            return -1;
        }
        int intValue;
        LuaNil table = super.getTable(aa);
        if (table != LuaNil.nil) {
            table = ((LuaTable) table).getTable(ai);
            if (table != LuaNil.nil) {
                intValue = ((Double) table).intValue();
                return intValue;
            }
        }
        intValue = -1;
        return intValue;
    }

    public final int m4465w() {
        LuaNil table;
        if (this.ag == 1) {
            table = super.getTable(f4004Z);
            if (table != LuaNil.nil) {
                table = ((LuaTable) table).getTable(ai);
            }
            table = null;
        } else {
            if (this.ag == 0) {
                table = super.getTable(ai);
            }
            table = null;
        }
        return (table == null || table == LuaNil.nil) ? -1 : ((Double) table).intValue();
    }

    public final boolean m4466x() {
        LuaNil table = super.getTable(ae);
        return table != LuaNil.nil ? ((Boolean) table).booleanValue() : true;
    }

    public final void m4467y() {
        cleanup();
        m4442b();
        this.f4030w.m459c();
        m4376C();
    }

    public final float m4468z() {
        return this.bC;
    }
}
