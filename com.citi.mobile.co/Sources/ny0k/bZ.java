package ny0k;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;

final class bZ implements aG {
    private /* synthetic */ bY f3329a;

    bZ(bY bYVar) {
        this.f3329a = bYVar;
    }

    public final void m3654a() {
        LuaNil table = this.f3329a.getTable(bY.ak);
        if (table != LuaNil.nil) {
            table = ((LuaTable) table).getTable(bY.al);
            if (table != LuaNil.nil) {
                this.f3329a.h = bG.f4586e;
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = table;
                Bundle bundle = new Bundle(1);
                bundle.putSerializable("key0", this.f3329a);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final void m3655b() {
        LuaNil table = this.f3329a.getTable(bY.ak);
        if (table != LuaNil.nil) {
            table = ((LuaTable) table).getTable(bY.am);
            if (table != LuaNil.nil) {
                this.f3329a.h = bG.f4587f;
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = table;
                Bundle bundle = new Bundle(1);
                bundle.putSerializable("key0", this.f3329a);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final void m3656c() {
        LuaNil table = this.f3329a.getTable(bY.ak);
        if (table != LuaNil.nil) {
            table = ((LuaTable) table).getTable(bY.an);
            if (table != LuaNil.nil) {
                this.f3329a.h = bG.f4586e;
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = table;
                Bundle bundle = new Bundle(1);
                bundle.putSerializable("key0", this.f3329a);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final void m3657d() {
        LuaNil table = this.f3329a.getTable(bY.ak);
        if (table != LuaNil.nil) {
            table = ((LuaTable) table).getTable(bY.ao);
            if (table != LuaNil.nil) {
                this.f3329a.h = bG.f4587f;
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = table;
                Bundle bundle = new Bundle(1);
                bundle.putSerializable("key0", this.f3329a);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final boolean m3658e() {
        return this.f3329a.aE;
    }

    public final boolean m3659f() {
        return this.f3329a.aF;
    }

    public final boolean m3660g() {
        return this.f3329a.aC;
    }

    public final boolean m3661h() {
        return this.f3329a.aD;
    }

    public final void m3662i() {
        this.f3329a.h = bG.f4588g;
    }
}
