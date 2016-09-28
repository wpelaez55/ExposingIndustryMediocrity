package ny0k;

import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.LuaWidget;

final class cv implements Runnable {
    private /* synthetic */ LuaWidget f2314a;
    private /* synthetic */ LuaWidget f2315b;

    cv(LuaWidget luaWidget, LuaWidget luaWidget2) {
        this.f2314a = luaWidget;
        this.f2315b = luaWidget2;
    }

    public final void run() {
        KonyMain.m4143x().m1779b(this.f2314a, this.f2315b);
    }
}
