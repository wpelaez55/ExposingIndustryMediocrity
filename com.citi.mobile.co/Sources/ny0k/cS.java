package ny0k;

import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaTable;

final class cS implements Runnable {
    private /* synthetic */ Object f2266a;
    private /* synthetic */ cQ f2267b;

    cS(cQ cQVar, Object obj) {
        this.f2267b = cQVar;
        this.f2266a = obj;
    }

    public final void run() {
        new LuaTable(0, 1).setTable("data", this.f2266a);
        int size = this.f2267b.f3629b.size();
        int i = 0;
        while (i < size) {
            try {
                ((Function) this.f2267b.f3629b.get(i)).m1637a(new Object[]{r2}, this.f2267b);
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
