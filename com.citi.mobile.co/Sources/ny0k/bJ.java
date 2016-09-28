package ny0k;

import com.konylabs.api.ui.eO;
import com.konylabs.vm.LuaTable;

final class bJ extends bT {
    bH f3319a;
    int f3320b;

    public bJ(bG bGVar) {
        super(bGVar);
        this.f3320b = -1;
    }

    public bJ(bG bGVar, eO eOVar, LuaTable luaTable, bH bHVar, int i, LuaTable luaTable2) {
        super(bGVar, eOVar, luaTable, luaTable2);
        this.f3320b = -1;
        this.f3319a = bHVar;
        this.f3320b = i;
    }

    public bJ(bG bGVar, String str, bH bHVar, int i, LuaTable luaTable) {
        super(bGVar, str, luaTable);
        this.f3320b = -1;
        this.f3319a = bHVar;
        this.f3320b = i;
    }
}
