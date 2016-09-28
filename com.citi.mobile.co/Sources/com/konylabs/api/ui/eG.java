package com.konylabs.api.ui;

import com.konylabs.js.api.JSTable;
import com.konylabs.vm.LuaTable;
import java.util.Vector;

public final class eG extends JSTable {
    private static eG f3568a;

    private eG() {
    }

    public static eG m3985a() {
        if (f3568a == null) {
            f3568a = new eG();
        }
        return f3568a;
    }

    public final void m3986a(LuaTable luaTable) {
        Vector vector = luaTable.list;
        int size = vector.size();
        for (int i = 0; i < size; i++) {
            LuaTable luaTable2 = (LuaTable) vector.get(i);
            super.setTable(luaTable2.getTable(LuaWidget.ATTR_WIDGET_ID), luaTable2);
        }
    }

    public final void m3987b() {
        while (this.enumeration.hasMoreElements()) {
            Object table = super.getTable(this.enumeration.nextElement());
            if (table instanceof eO) {
                eO eOVar = (eO) table;
                eOVar.f3722k = false;
                eOVar.cleanup();
            }
        }
        this.enumeration.reset();
    }
}
