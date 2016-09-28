package com.konylabs.vmintf;

import android.os.Message;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.js.api.KonyJSONString;
import com.konylabs.libintf.C0235a;
import com.konylabs.libintf.Library;
import com.konylabs.vm.C0245j;
import com.konylabs.vm.Function;
import java.util.ArrayList;

/* renamed from: com.konylabs.vmintf.b */
public interface C0254b {
    long m1770a(LuaWidget luaWidget, String str, boolean z);

    Function m1771a(String str);

    void m1772a(Message message);

    void m1773a(LuaWidget luaWidget, LuaWidget luaWidget2);

    void m1774a(LuaWidget luaWidget, ArrayList arrayList);

    void m1775a(Library library, int i);

    void m1776a(C0235a c0235a);

    void m1777a(C0245j c0245j);

    boolean m1778a(KonyJSONString konyJSONString);

    void m1779b(LuaWidget luaWidget, LuaWidget luaWidget2);

    void m1780b(LuaWidget luaWidget, ArrayList arrayList);

    void m1781b(KonyJSONString konyJSONString);

    void m1782b(C0245j c0245j);

    boolean m1783b();
}
