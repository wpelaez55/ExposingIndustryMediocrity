package ny0k;

import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.LuaWidget;
import java.util.ArrayList;

final class cu implements Runnable {
    private /* synthetic */ LuaWidget f2312a;
    private /* synthetic */ ArrayList f2313b;

    cu(LuaWidget luaWidget, ArrayList arrayList) {
        this.f2312a = luaWidget;
        this.f2313b = arrayList;
    }

    public final void run() {
        KonyMain.m4143x().m1780b(this.f2312a, this.f2313b);
    }
}
