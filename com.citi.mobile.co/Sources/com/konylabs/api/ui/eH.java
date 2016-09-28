package com.konylabs.api.ui;

import com.konylabs.js.api.JSTable;
import com.konylabs.vm.LuaTable;
import java.util.Vector;

public final class eH extends JSTable {
    private static eH f3569a;

    private eH() {
    }

    public static eH m3988a() {
        if (f3569a == null) {
            f3569a = new eH();
        }
        return f3569a;
    }

    public final void m3989a(LuaTable luaTable) {
        Vector vector = luaTable.list;
        int size = vector.size();
        for (int i = 0; i < size; i++) {
            LuaTable luaTable2 = (LuaTable) vector.get(i);
            super.setTable(luaTable2.getTable(LuaWidget.ATTR_WIDGET_ID), luaTable2);
        }
    }

    public final void m3990b() {
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
