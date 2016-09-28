package ny0k;

import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.LuaWidget;
import java.util.ArrayList;

final class cx implements Runnable {
    private /* synthetic */ LuaWidget f2318a;
    private /* synthetic */ ArrayList f2319b;

    cx(LuaWidget luaWidget, ArrayList arrayList) {
        this.f2318a = luaWidget;
        this.f2319b = arrayList;
    }

    public final void run() {
        KonyMain.m4143x().m1774a(this.f2318a, this.f2319b);
    }
}
