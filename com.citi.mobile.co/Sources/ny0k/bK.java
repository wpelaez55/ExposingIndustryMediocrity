package ny0k;

import android.view.View;
import com.konylabs.vm.LuaTable;

final class bK extends bQ {
    private /* synthetic */ bG f3627a;

    bK(bG bGVar) {
        this.f3627a = bGVar;
        super(bGVar);
    }

    protected final LuaTable m4042a(View view) {
        ck ckVar = (ck) view.getTag();
        this.f3627a.ae = ckVar.f2284k;
        this.f3627a.ad = ckVar.f2283j;
        LuaTable luaTable = new LuaTable();
        luaTable.setTable("rowIndex", Integer.valueOf(cr.m2199a(ckVar.f2284k, 1)));
        luaTable.setTable("sectionIndex", Integer.valueOf(cr.m2199a(ckVar.f2283j, 1)));
        luaTable.setTable("widgetInfo", this.f3627a);
        return luaTable;
    }
}
