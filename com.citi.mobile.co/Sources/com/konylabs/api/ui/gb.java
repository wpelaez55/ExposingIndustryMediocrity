package com.konylabs.api.ui;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.hybrid.C0227b;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;

public final class gb extends fv {
    private static String f4573A;
    private static aD f4574B;
    private static aD f4575C;
    private static hP f4576D;
    private static hP f4577P;
    private static boolean f4578Q;
    private static boolean f4579R;
    private static String f4580T;
    private int f4581S;
    private boolean f4582U;
    private ex f4583V;
    private String f4584z;

    static {
        f4574B = null;
        f4575C = null;
        f4576D = null;
        f4577P = null;
        f4578Q = false;
        f4579R = false;
        f4580T = null;
    }

    private gb(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3, int i) {
        super(luaTable, luaTable2, luaTable3, i);
        this.f4584z = null;
        this.f4581S = 1;
        this.f4582U = false;
        this.f4583V = new gc(this);
        if (luaTable != null) {
            this.f4584z = (String) luaTable.getTable(ATTR_WIDGET_ID);
            this.f4581S = ((Double) luaTable.getTable(a)).intValue();
        }
    }

    private aD m4863L() {
        return this.f4581S == 2 ? f4575C : f4574B;
    }

    private hP m4864M() {
        return this.f4581S == 2 ? f4577P : f4576D;
    }

    private void m4866a(aD aDVar) {
        if (this.f4581S == 2) {
            f4575C = aDVar;
            if (aDVar == null && f4577P != null) {
                f4577P.cleanup();
                return;
            }
            return;
        }
        f4574B = aDVar;
        if (aDVar == null && f4576D != null) {
            f4576D.cleanup();
        }
    }

    static /* synthetic */ void m4867a(gb gbVar, hP hPVar) {
        if (gbVar.f4581S == 2) {
            f4577P = hPVar;
        } else {
            f4576D = hPVar;
        }
    }

    public static Object[] m4869a(String str, LuaTable luaTable) {
        if (KonyMain.m4145z() == 1) {
            return C0227b.m1611a(str, luaTable);
        }
        if (f4576D == null) {
            LuaTable luaTable2 = new LuaTable(1, 1, false);
            luaTable2.setTable("screenLevelWidget", Boolean.valueOf(true));
            luaTable2.setTable("shellType", new Double(1.0d));
            hP hPVar = new hP(new Object[]{"hybridwebcontrol", null, null, null, null, null, null, new Double(100.0d), Boolean.valueOf(true), luaTable2});
            f4576D = hPVar;
            hPVar.setTable(hP.f4344f, Boolean.valueOf(true));
            f4576D.setTable(hP.f4339a, "file:///android_asset/web/index.html");
        }
        if (f4576D.m4662e() == null) {
            f4576D.m4653a(new gj());
            KonyMain.getActContext();
            KonyMain.m4094a(new gk());
        }
        if (!f4578Q) {
            try {
                synchronized (f4576D) {
                    f4576D.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        C0227b.m1610a(f4576D, str, luaTable);
        return null;
    }

    public static Object[] m4871b(String str, LuaTable luaTable) {
        if (KonyMain.m4145z() == 3) {
            return m4869a(str, luaTable);
        }
        if (KonyMain.m4145z() != 2) {
            return C0227b.m1611a(str, luaTable);
        }
        if (f4577P == null) {
            LuaTable luaTable2 = new LuaTable(1, 1, false);
            luaTable2.setTable("screenLevelWidget", Boolean.valueOf(true));
            luaTable2.setTable("shellType", new Double(2.0d));
            hP hPVar = new hP(new Object[]{"hybridwebcontrol", null, null, null, null, null, null, new Double(100.0d), Boolean.valueOf(true), luaTable2});
            f4577P = hPVar;
            hPVar.setTable(hP.f4344f, Boolean.valueOf(true));
        }
        LuaTable luaTable3;
        String str2;
        if (f4577P.m4662e() == null) {
            f4577P.m4653a(new gl());
            Function a = KonyMain.m4143x().m1771a("getDynamicURL");
            if (a != null) {
                Object[] execute;
                try {
                    execute = a.execute(null);
                } catch (Exception e) {
                    e.printStackTrace();
                    Object obj = null;
                }
                if (!(execute == null || execute.length <= 0 || execute[0] == null || execute[0] == LuaNil.nil)) {
                    f4580T = (String) execute[0];
                    f4577P.setTable(hP.f4339a, execute[0]);
                    f4577P.setTable(hP.f4340b, "post");
                    luaTable3 = new LuaTable();
                    luaTable3.setTable("khybrid", "TRUE");
                    luaTable3.setTable("hybridfunction", str);
                    str2 = BuildConfig.FLAVOR;
                    if (luaTable != null) {
                        str2 = C0216r.m1557a(luaTable, 0);
                    }
                    luaTable3.setTable("hybridparams", str2);
                    f4577P.setTable(hP.f4341c, luaTable3);
                    if (KonyMain.f3657e) {
                        Log.d("LuaHybridForm", "executeFunctionInTCContext()= name=" + str + " params=" + str2);
                    }
                    KonyMain.getActContext();
                    KonyMain.m4094a(new gm());
                }
            }
        } else if (f4579R) {
            KonyMain.getActContext();
            KonyMain.m4094a(new go(luaTable, str));
        } else {
            luaTable3 = new LuaTable();
            luaTable3.setTable("khybrid", "TRUE");
            luaTable3.setTable("hybridfunction", str);
            str2 = BuildConfig.FLAVOR;
            if (luaTable != null) {
                str2 = C0216r.m1557a(luaTable, 0);
            }
            if (luaTable != null) {
                luaTable3.setTable("hybridparams", str2);
            }
            if (KonyMain.f3657e) {
                Log.d("LuaHybridForm", "executeFunctionInTCContext()= name=" + str + " params=" + str2);
            }
            f4577P.m4657b(luaTable3);
            KonyMain.getActContext();
            KonyMain.m4094a(new gn());
        }
        return null;
    }

    public static gb m4872c(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3, int i) {
        return new gb(luaTable, luaTable2, luaTable3, i);
    }

    public static void m4875d(String str) {
        if (!f4578Q || f4576D == null || str == null) {
            f4573A = str;
        } else {
            KonyMain.m4094a(new gd(str));
        }
    }

    public final void m4879C() {
        f4578Q = false;
        f4579R = false;
        f4573A = null;
        m4866a(null);
        super.cleanup();
    }

    protected final void m4880a(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3, int i) {
        if (luaTable != null) {
            luaTable.setTable(f, LuaNil.nil);
            luaTable.setTable(d, LuaNil.nil);
            luaTable.setTable(c, LuaNil.nil);
            luaTable.setTable(g, LuaNil.nil);
            luaTable.setTable(f, LuaNil.nil);
            luaTable.setTable(e, LuaNil.nil);
            luaTable.setTable(q, LuaNil.nil);
            luaTable.setTable(p, LuaNil.nil);
        }
        if (luaTable3 != null) {
            luaTable3.setTable(i, LuaNil.nil);
        }
        super.m4436a(luaTable, luaTable2, luaTable3, i);
        super.setTable(b, new gp(this));
        if (this.f4581S == 2) {
            super.setTable(h, new gr(this));
        } else {
            super.setTable(h, new gq(this));
        }
    }

    protected final void m4881b() {
        if (m4863L() == null) {
            super.m4442b();
            m4866a(this.w);
            if (m4864M() != null) {
                m4864M().m4653a(this.f4583V);
            }
        } else {
            this.v = r;
            this.u = t;
            this.w = m4863L();
        }
        this.w.f442d = 9;
        this.w.m448a((String) getTable(ATTR_WIDGET_ID));
    }

    protected final void m4882b(boolean z) {
        if (KonyMain.getActContext() != null && this.f4581S == 1 && f4576D == null) {
            if (KonyMain.f3657e) {
                Log.d("LuaHybridForm", "showSPAFormInBackground(" + this.f4584z + ")");
            }
            if (f4576D == null) {
                LuaTable luaTable = new LuaTable(1, 1, false);
                luaTable.setTable("screenLevelWidget", Boolean.valueOf(true));
                luaTable.setTable("shellType", new Double(1.0d));
                hP hPVar = new hP(new Object[]{"hybridwebcontrol", null, null, null, null, null, null, new Double(100.0d), Boolean.valueOf(true), luaTable});
                f4576D = hPVar;
                hPVar.setTable(hP.f4344f, Boolean.valueOf(true));
                f4576D.setTable(hP.f4339a, "file:///android_asset/web/index.html");
                f4576D.m4653a(new gg(this));
                KonyMain.getActContext();
                KonyMain.m4094a(new gi(this));
                return;
            }
            return;
        }
        if (!(KonyMain.getActContext() == null || KonyMain.getActContext().f3686l || this.f4582U)) {
            if (this.f4581S == 1) {
                m4875d(this.f4584z);
                if (f4578Q) {
                    return;
                }
            } else if (this.f4581S == 2) {
                String str = this.f4584z;
                if (f4577P != null) {
                    if (f4579R) {
                        KonyMain.m4094a(new gf(str));
                    } else {
                        LuaTable luaTable2 = new LuaTable();
                        luaTable2.setTable("khybrid", "TRUE");
                        luaTable2.setTable("formid", str);
                        f4577P.m4657b(luaTable2);
                        KonyMain.m4094a(new ge(str));
                    }
                }
            }
        }
        int i = this.f4581S;
        this.f4582U = false;
        super.m4447b(z);
    }

    public final void m4883c(boolean z) {
        if (this.w != null) {
            this.w.m448a(this.f4584z);
        }
        super.m4450c(z);
    }

    public final void cleanup() {
        if (m4863L() == null) {
            super.cleanup();
        }
        int i = this.f4581S;
    }

    public final String getType() {
        return "HybridForm";
    }

    public final void m4884r() {
        super.m4461r();
    }
}
