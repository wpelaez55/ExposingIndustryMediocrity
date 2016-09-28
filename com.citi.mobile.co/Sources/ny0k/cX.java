package ny0k;

import com.konylabs.vm.Function;
import com.konylabs.vm.LuaTable;

final class cX implements Runnable {
    private /* synthetic */ Object f2272a;
    private /* synthetic */ cW f2273b;

    cX(cW cWVar, Object obj) {
        this.f2273b = cWVar;
        this.f2272a = obj;
    }

    public final void run() {
        new LuaTable(0, 1).setTable("data", this.f2272a);
        int size = this.f2273b.f3461a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((Function) this.f2273b.f3461a.get(i)).execute(new Object[]{r2});
            } catch (Exception e) {
            }
        }
    }
}
