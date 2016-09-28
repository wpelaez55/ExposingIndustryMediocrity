package ny0k;

import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.eO;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;

public final class bV extends bG {
    private static String ao;
    private static String ar;
    private static String as;
    private static String at;
    private static String au;
    private static String av;
    private static String aw;
    private static String ax;
    private bo ak;
    private bX al;
    private int am;
    private Object an;

    static {
        ao = "viewconfig";
        ar = "coverflowconfig";
        as = "coverflowangle";
        at = "rowitemwidth";
        au = "projectionangle";
        av = "rowitemrotationangle";
        aw = "spacebetweenrowitems";
        ax = "isCircular";
        if (KonyMain.m4057C()) {
            ao = "viewConfig";
            ar = "coverflowConfig";
            as = "coverflowAngle";
            at = "rowItemWidth";
            au = "projectionAngle";
            av = "rowItemRotationAngle";
            aw = "spaceBetweenRowItems";
        }
    }

    public bV(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3, long j) {
        super(luaTable, luaTable2, luaTable3, j);
        this.am = -1;
        LuaNil table = luaTable.getTable(ao);
        if (table != LuaNil.nil) {
            super.setTable(ao, (LuaTable) table);
        }
    }

    private void m4938k(LuaTable luaTable) {
        LuaTable luaTable2 = (LuaTable) luaTable.getTable(ar);
        if (luaTable2 != LuaNil.nil) {
            luaTable2 = luaTable2;
            LuaNil table = luaTable2.getTable(av);
            if (table != LuaNil.nil) {
                this.ak.m1398d(((Double) table).intValue());
            } else {
                table = luaTable2.getTable(as);
                if (table != LuaNil.nil) {
                    this.ak.m1398d(((Double) table).intValue());
                } else {
                    this.ak.m1398d(60);
                }
            }
            table = luaTable2.getTable(aw);
            if (table != LuaNil.nil) {
                this.ak.m1399e(((Double) table).intValue());
            } else {
                this.ak.m1399e(bo.a_);
            }
            table = luaTable2.getTable(au);
            if (table != LuaNil.nil) {
                this.ak.m1396c(((Double) table).intValue());
            } else {
                this.ak.m1396c(60);
            }
            table = luaTable2.getTable(ax);
            if (table != LuaNil.nil) {
                this.ak.m1393a(((Boolean) table).booleanValue());
            } else {
                this.ak.m1393a(false);
            }
            LuaNil table2 = luaTable2.getTable(at);
            if (table2 != LuaNil.nil) {
                this.am = ((Double) table2).intValue();
                if (this.am > 0) {
                    int o = KonyMain.getActContext().m4166o();
                    this.am = ((this.I instanceof eO ? (int) (((eO) this.I).m4231m() * ((float) o)) : o) * this.am) / 100;
                } else {
                    this.am = -1;
                }
            } else {
                this.am = -1;
            }
            if (this.al != null) {
                this.al.notifyDataSetChanged();
            }
        }
    }

    protected final void m4939a(int i) {
        this.ak.m1397c(i, false);
    }

    protected final void m4940a(Object obj, Object obj2) {
        if (this.E != KONY_WIDGET_BACKUP) {
            if (obj == ao) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    m4938k((LuaTable) obj2);
                }
            } else if (obj != z) {
                super.m4897a(obj, obj2);
            } else if (obj2 != LuaNil.nil) {
                this.an = obj2;
                this.ak.m1392a(new bW());
            } else {
                this.an = null;
                this.ak.m1392a(null);
            }
        }
    }

    protected final void m4941b() {
        this.ak = new bo(KonyMain.getActContext(), this.W);
        m4809a(this.ak);
        this.ak.m3673a(this.c);
        LuaNil table = super.getTable(ao);
        if (table != LuaNil.nil) {
            m4938k((LuaTable) table);
        }
        table = super.getTable(z);
        if (table != LuaNil.nil) {
            this.an = table;
            this.ak.m1392a(new bW());
        }
        super.m4811b();
    }

    protected final void m4942c() {
        if (this.al != null) {
            this.al.m2086b();
        }
    }

    public final void cleanup() {
        super.cleanup();
        this.ak.m3668a(null);
        this.al = null;
        this.ak.m3694m();
        this.E = KONY_WIDGET_BACKUP;
    }

    protected final void e_() {
        if (this.al == null) {
            this.al = new bX(this);
            m4894a(this.al);
            this.ak.m3668a(this.al);
            return;
        }
        this.al.notifyDataSetChanged();
    }

    protected final int f_() {
        return this.ak.m1389a();
    }

    public final void onFormHeightChanged(int i) {
        if (this.E != KONY_WIDGET_BACKUP && this.M == 1 && this.N >= 0.0f) {
            this.ak.m3688f((int) ((((float) i) * this.N) / 100.0f));
        }
    }

    public final void setHeight(int i) {
    }

    public final void setWidth(int i) {
    }
}
