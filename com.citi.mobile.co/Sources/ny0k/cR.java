package ny0k;

import com.konylabs.vm.LuaTable;

final class cR implements Runnable {
    private /* synthetic */ cQ f2265a;

    cR(cQ cQVar) {
        this.f2265a = cQVar;
    }

    public final void run() {
        LuaTable luaTable = new LuaTable(0, 1);
        luaTable.setTable("message", "WorkerThread: InvalidParameter. WorkerThread script not found");
        this.f2265a.m4047a(luaTable);
    }
}
