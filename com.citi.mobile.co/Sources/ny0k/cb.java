package ny0k;

import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;

public final class cb extends bG {
    private bv ak;
    private cc al;
    private Object am;
    private boolean an;

    public cb(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3, long j) {
        super(luaTable, luaTable2, luaTable3, j);
    }

    protected final void m4965a(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            this.ak.m3813b(i);
        }
    }

    protected final void m4966a(Object obj, Object obj2) {
        String str = null;
        if (this.E != KONY_WIDGET_BACKUP) {
            if (obj == j || obj == k || obj == l || obj == p) {
                if (this.al != null) {
                    this.al.m4055a();
                }
            } else if (obj == w && obj2 != LuaNil.nil) {
                this.ak.m3818b(((Boolean) obj2).booleanValue());
            } else if (obj == x) {
                r1 = this.ak;
                if (obj2 != LuaNil.nil) {
                    str = (String) obj2;
                }
                r1.m3823c(str);
            } else if (obj == y) {
                r1 = this.ak;
                if (obj2 != LuaNil.nil) {
                    str = (String) obj2;
                }
                r1.m3827d(str);
            } else if (obj == z) {
                if (obj2 != LuaNil.nil) {
                    this.am = obj2;
                    this.ak.m3807a(new bj(this));
                } else {
                    this.am = null;
                    this.ak.m3807a(null);
                }
            }
            super.m4897a(obj, obj2);
        }
    }

    protected final void m4967b() {
        this.ak = new bv(KonyMain.getActContext(), this.W);
        m4809a(this.ak);
        this.ak.m3810a(this.c);
        LuaNil table = super.getTable(w);
        if (table != LuaNil.nil) {
            boolean booleanValue = ((Boolean) table).booleanValue();
            this.ak.m3818b(booleanValue);
            if (booleanValue) {
                table = super.getTable(x);
                if (table != LuaNil.nil) {
                    this.ak.m3823c((String) table);
                }
                table = super.getTable(y);
                if (table != LuaNil.nil) {
                    this.ak.m3827d((String) table);
                }
            }
        }
        table = super.getTable(z);
        if (table != LuaNil.nil) {
            this.am = table;
            this.ak.m3807a(new bj(this));
        }
        super.m4811b();
    }

    protected final void m4968c() {
        if (this.al != null) {
            this.al.m4055a();
        }
    }

    public final void cleanup() {
        super.cleanup();
        this.al = null;
        if (this.ak != null) {
            this.ak.m3828e();
            this.ak = null;
        }
    }

    protected final void m4969e() {
        this.an = true;
        if (this.al != null) {
            this.al.notifyDataSetChanged();
        }
    }

    protected final void e_() {
        if (this.al == null) {
            this.al = new cc(this);
            this.ak.m3808a(this.al);
        } else {
            this.al.m4055a();
        }
        this.ak.m3802a(this.al.getCount());
        m4969e();
    }

    public final void m4970f() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.ak.m3828e();
        }
        super.m4914f();
    }

    protected final int f_() {
        return this.E == KONY_WIDGET_RESTORE ? this.ak.m3830f() : -1;
    }

    public final void setHeight(int i) {
    }

    public final void setWidth(int i) {
    }
}
