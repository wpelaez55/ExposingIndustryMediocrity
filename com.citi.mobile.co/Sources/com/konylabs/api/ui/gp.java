package com.konylabs.api.ui;

import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;

final class gp extends Function {
    private /* synthetic */ gb f3006a;

    gp(gb gbVar) {
        this.f3006a = gbVar;
    }

    public final synchronized Object[] execute(Object[] objArr) throws Exception {
        if (this.f3006a.m4864M() != null) {
            this.f3006a.m4440a(new Object[]{this.f3006a, r0});
        } else {
            LuaTable luaTable = new LuaTable(1, 1, false);
            luaTable.setTable("screenLevelWidget", Boolean.valueOf(true));
            if (this.f3006a.f4581S == 1) {
                luaTable.setTable("shellType", new Double(1.0d));
            } else {
                luaTable.setTable("shellType", new Double(2.0d));
            }
            hP hPVar = new hP(new Object[]{"hybridwebcontrol", null, null, null, null, null, null, new Double(100.0d), Boolean.valueOf(true), luaTable});
            hPVar.setTable(hP.f4344f, Boolean.valueOf(true));
            if (this.f3006a.f4581S == 1) {
                hPVar.setTable(hP.f4339a, "file:///android_asset/web/index.html");
            } else {
                Function a = KonyMain.m4143x().m1771a("getDynamicURL");
                if (a != null) {
                    Object[] execute = a.execute(null);
                    if (!(execute == null || execute.length <= 0 || execute[0] == null || execute[0] == LuaNil.nil)) {
                        gb.f4580T = (String) execute[0];
                        hPVar.setTable(hP.f4339a, gb.f4580T);
                        hPVar.setTable(hP.f4340b, "post");
                        luaTable = new LuaTable();
                        luaTable.setTable("khybrid", "TRUE");
                        luaTable.setTable("formid", this.f3006a.f4584z);
                        hPVar.setTable(hP.f4341c, luaTable);
                    }
                }
            }
            this.f3006a.m4440a(new Object[]{this.f3006a, hPVar});
            hPVar.m4653a(this.f3006a.f4583V);
            gb.m4867a(this.f3006a, hPVar);
        }
        return null;
    }
}
