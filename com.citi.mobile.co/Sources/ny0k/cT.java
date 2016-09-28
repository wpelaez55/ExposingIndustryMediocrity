package ny0k;

import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaTable;

final class cT implements Runnable {
    private /* synthetic */ LuaTable f2268a;
    private /* synthetic */ cQ f2269b;

    cT(cQ cQVar, LuaTable luaTable) {
        this.f2269b = cQVar;
        this.f2268a = luaTable;
    }

    public final void run() {
        int size = this.f2269b.f3630c.size();
        int i = 0;
        while (i < size) {
            try {
                ((Function) this.f2269b.f3630c.get(i)).m1637a(new Object[]{this.f2268a}, this.f2269b);
                i++;
            } catch (Exception e) {
                if (e instanceof LuaError) {
                    throw ((LuaError) e);
                }
                throw new LuaError("Error in JavaScript callback invocation at " + e.getMessage(), 605);
            }
        }
    }
}
