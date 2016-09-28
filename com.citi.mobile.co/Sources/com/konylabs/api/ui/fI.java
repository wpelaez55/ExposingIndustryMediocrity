package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import ny0k.aG;

final class fI implements aG {
    private /* synthetic */ fv f2995a;

    fI(fv fvVar) {
        this.f2995a = fvVar;
    }

    public final void m3314a() {
        LuaNil table = this.f2995a.getTable(fv.f4014j);
        if (table != LuaNil.nil) {
            table = ((LuaTable) table).getTable(fv.f4015k);
            if (table != LuaNil.nil) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = table;
                Bundle bundle = new Bundle(1);
                bundle.putSerializable("key0", this.f2995a);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final void m3315b() {
        LuaNil table = this.f2995a.getTable(fv.f4014j);
        if (table != LuaNil.nil) {
            table = ((LuaTable) table).getTable(fv.f4016l);
            if (table != LuaNil.nil) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = table;
                Bundle bundle = new Bundle(1);
                bundle.putSerializable("key0", this.f2995a);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final void m3316c() {
        LuaNil table = this.f2995a.getTable(fv.f4014j);
        if (table != LuaNil.nil) {
            table = ((LuaTable) table).getTable(fv.f4017m);
            if (table != LuaNil.nil) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = table;
                Bundle bundle = new Bundle(1);
                bundle.putSerializable("key0", this.f2995a);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final void m3317d() {
        LuaNil table = this.f2995a.getTable(fv.f4014j);
        if (table != LuaNil.nil) {
            table = ((LuaTable) table).getTable(fv.f4018n);
            if (table != LuaNil.nil) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = table;
                Bundle bundle = new Bundle(1);
                bundle.putSerializable("key0", this.f2995a);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final boolean m3318e() {
        LuaNil table = this.f2995a.getTable(fv.f4014j);
        return (table == LuaNil.nil || ((LuaTable) table).getTable(fv.f4015k) == LuaNil.nil) ? false : true;
    }

    public final boolean m3319f() {
        LuaNil table = this.f2995a.getTable(fv.f4014j);
        return (table == LuaNil.nil || ((LuaTable) table).getTable(fv.f4016l) == LuaNil.nil) ? false : true;
    }

    public final boolean m3320g() {
        LuaNil table = this.f2995a.getTable(fv.f4014j);
        return (table == LuaNil.nil || ((LuaTable) table).getTable(fv.f4017m) == LuaNil.nil) ? false : true;
    }

    public final boolean m3321h() {
        LuaNil table = this.f2995a.getTable(fv.f4014j);
        return (table == LuaNil.nil || ((LuaTable) table).getTable(fv.f4018n) == LuaNil.nil) ? false : true;
    }

    public final void m3322i() {
    }
}
