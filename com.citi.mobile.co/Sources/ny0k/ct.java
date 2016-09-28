package ny0k;

import com.konylabs.api.ui.LuaWidget;

final class ct implements Runnable {
    private /* synthetic */ LuaWidget f2310a;
    private /* synthetic */ LuaWidget f2311b;

    ct(LuaWidget luaWidget, LuaWidget luaWidget2) {
        this.f2310a = luaWidget;
        this.f2311b = luaWidget2;
    }

    public final void run() {
        this.f2310a.setTable(LuaWidget.WIDGET_CLONE_ID, Long.valueOf(System.currentTimeMillis()));
        cr.m2210b(this.f2310a, this.f2311b, false);
    }
}
