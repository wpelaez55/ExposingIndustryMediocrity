package com.konylabs.api.ui;

import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.Enumeration;
import ny0k.cN;

final class eP implements Runnable {
    private /* synthetic */ eO f1255a;

    eP(eO eOVar) {
        this.f1255a = eOVar;
    }

    public final void run() {
        Object table = this.f1255a.getTable(LuaWidget.ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            dB dBVar;
            dB a = cN.m2139a(table);
            LuaTable luaTable = (LuaTable) this.f1255a.f3717B.getTable(LuaWidget.ATTR_WIDGET_SKIN);
            if (luaTable == null) {
                dBVar = a;
            } else {
                Enumeration keys = luaTable.map.keys();
                if (keys.hasMoreElements()) {
                    dB dBVar2 = new dB(a);
                    while (keys.hasMoreElements()) {
                        String str = (String) keys.nextElement();
                        LuaNil table2 = luaTable.getTable(str);
                        if (str.intern() == "background_image") {
                            dBVar2.m1137d(table2 != LuaNil.nil ? (String) table2 : null);
                        }
                    }
                    dBVar = dBVar2;
                } else {
                    dBVar = a;
                }
            }
            this.f1255a.f3718g.m122a(dBVar);
        }
    }
}
