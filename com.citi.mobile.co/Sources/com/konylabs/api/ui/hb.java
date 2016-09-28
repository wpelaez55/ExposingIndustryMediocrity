package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import ny0k.aG;

final class hb implements aG {
    private /* synthetic */ gZ f3009a;

    hb(gZ gZVar) {
        this.f3009a = gZVar;
    }

    public final void m3335a() {
        LuaNil table = this.f3009a.getTable(gZ.f4572z);
        if (table != LuaNil.nil) {
            table = ((LuaTable) table).getTable(gZ.f4557A);
            if (table != LuaNil.nil) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = table;
                Bundle bundle = new Bundle(1);
                bundle.putSerializable("key0", this.f3009a);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final void m3336b() {
        LuaNil table = this.f3009a.getTable(gZ.f4572z);
        if (table != LuaNil.nil) {
            table = ((LuaTable) table).getTable(gZ.f4558B);
            if (table != LuaNil.nil) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = table;
                Bundle bundle = new Bundle(1);
                bundle.putSerializable("key0", this.f3009a);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final void m3337c() {
        LuaNil table = this.f3009a.getTable(gZ.f4572z);
        if (table != LuaNil.nil) {
            table = ((LuaTable) table).getTable(gZ.f4559C);
            if (table != LuaNil.nil) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = table;
                Bundle bundle = new Bundle(1);
                bundle.putSerializable("key0", this.f3009a);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final void m3338d() {
        LuaNil table = this.f3009a.getTable(gZ.f4572z);
        if (table != LuaNil.nil) {
            table = ((LuaTable) table).getTable(gZ.f4560D);
            if (table != LuaNil.nil) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = table;
                Bundle bundle = new Bundle(1);
                bundle.putSerializable("key0", this.f3009a);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final boolean m3339e() {
        LuaNil table = this.f3009a.getTable(gZ.f4572z);
        return (table == LuaNil.nil || ((LuaTable) table).getTable(gZ.f4557A) == LuaNil.nil) ? false : true;
    }

    public final boolean m3340f() {
        LuaNil table = this.f3009a.getTable(gZ.f4572z);
        return (table == LuaNil.nil || ((LuaTable) table).getTable(gZ.f4558B) == LuaNil.nil) ? false : true;
    }

    public final boolean m3341g() {
        LuaNil table = this.f3009a.getTable(gZ.f4572z);
        return (table == LuaNil.nil || ((LuaTable) table).getTable(gZ.f4559C) == LuaNil.nil) ? false : true;
    }

    public final boolean m3342h() {
        LuaNil table = this.f3009a.getTable(gZ.f4572z);
        return (table == LuaNil.nil || ((LuaTable) table).getTable(gZ.f4560D) == LuaNil.nil) ? false : true;
    }

    public final void m3343i() {
    }
}
