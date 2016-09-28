package ny0k;

import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.LuaWidget;

final class cw implements Runnable {
    private /* synthetic */ LuaWidget f2316a;
    private /* synthetic */ LuaWidget f2317b;

    cw(LuaWidget luaWidget, LuaWidget luaWidget2) {
        this.f2316a = luaWidget;
        this.f2317b = luaWidget2;
    }

    public final void run() {
        KonyMain.m4143x().m1773a(this.f2316a, this.f2317b);
    }
}
