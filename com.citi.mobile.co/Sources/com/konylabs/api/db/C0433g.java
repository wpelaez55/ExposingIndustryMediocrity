package com.konylabs.api.db;

import com.konylabs.js.api.JSTable;
import com.konylabs.vm.LuaTable;

/* renamed from: com.konylabs.api.db.g */
final class C0433g extends JSTable {
    private LuaTable f3524a;

    private C0433g(C0163f c0163f, byte b) {
        this.f3524a = null;
    }

    public final LuaTable m3921a(int i) {
        return (LuaTable) this.f3524a.list.elementAt(i);
    }

    public final void m3922a(LuaTable luaTable) {
        this.f3524a = luaTable;
    }
}
