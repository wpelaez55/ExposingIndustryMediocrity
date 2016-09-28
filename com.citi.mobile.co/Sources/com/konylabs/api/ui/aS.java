package com.konylabs.api.ui;

import android.view.View;
import com.konylabs.vm.LuaTable;
import java.util.GregorianCalendar;
import java.util.Hashtable;

public class aS {
    final /* synthetic */ fg f506a;

    aS(fg fgVar) {
        this.f506a = fgVar;
    }

    public View m512a(GregorianCalendar gregorianCalendar) {
        if (this.f506a.at.size() <= 0) {
            return null;
        }
        LuaTable luaTable = (LuaTable) this.f506a.at.get(gregorianCalendar);
        if (luaTable == null) {
            return null;
        }
        Object b = super.getTable(fg.f3845b);
        if (!(b instanceof LuaTable)) {
            return null;
        }
        Hashtable hashtable = ((LuaTable) b).map;
        b = super.getTable(fg.f3844a);
        if (!(b instanceof eO)) {
            return null;
        }
        return fg.m4280a(this.f506a, (eO) b, hashtable, luaTable.map, gregorianCalendar);
    }
}
