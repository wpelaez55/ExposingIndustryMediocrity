package ny0k;

import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;

final class bP implements Runnable {
    private /* synthetic */ Object f2138a;
    private /* synthetic */ bO f2139b;

    bP(bO bOVar, Object obj) {
        this.f2139b = bOVar;
        this.f2138a = obj;
    }

    public final void run() {
        this.f2139b.m4835j(this.f2138a != LuaNil.nil ? (LuaTable) this.f2138a : null);
    }
}
