package ny0k;

import android.view.View;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.api.ui.eO;
import com.konylabs.api.ui.iq;
import com.konylabs.vm.LuaTable;

class bQ implements iq {
    private /* synthetic */ bO f3323a;

    bQ(bO bOVar) {
        this.f3323a = bOVar;
    }

    protected LuaTable m3641a(View view) {
        int[] f = this.f3323a.m4826f(this.f3323a.ar.m2072p());
        if (f == null) {
            return null;
        }
        this.f3323a.ae = f[0];
        this.f3323a.ad = f[1];
        LuaTable luaTable = new LuaTable();
        luaTable.setTable("rowIndex", Integer.valueOf(cr.m2199a(f[0], 1)));
        luaTable.setTable("sectionIndex", Integer.valueOf(cr.m2199a(f[1], 1)));
        luaTable.setTable("widgetInfo", this.f3323a);
        return luaTable;
    }

    public final LuaTable m3642a(eO eOVar) {
        LuaTable luaTable = null;
        if (eOVar.m4233o()) {
            View widget = eOVar.getWidget();
            this.f3323a.ar.m2048a(widget);
            luaTable = m3641a(widget);
        }
        if (!eOVar.isJsObjectCloneCreated()) {
            cr.m2204a((LuaWidget) eOVar, this.f3323a);
        }
        return luaTable;
    }
}
