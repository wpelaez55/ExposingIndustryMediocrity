package com.konylabs.android;

import android.util.Log;
import com.konylabs.api.ui.fv;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;

/* renamed from: com.konylabs.android.g */
final class C0134g implements Runnable {
    C0134g() {
    }

    public final void run() {
        LuaTable luaTable = new LuaTable();
        luaTable.setTable("launchmode", new Double((double) C0133f.f30a));
        luaTable.setTable("launchparams", C0133f.m44b(C0133f.f31b));
        fv b = fv.m4395b(KonyMain.f3653a);
        LuaNil luaNil = C0133f.f32c.get("appservice");
        if (!(luaNil == null || luaNil == LuaNil.nil)) {
            try {
                if (KonyMain.f3657e) {
                    Log.d("KonyAppInitializer", "Calling appservice.....launchMode=" + C0133f.f30a);
                }
                Object[] execute = ((Function) luaNil).execute(new Object[]{luaTable});
                fv fvVar = (execute == null || execute.length <= 0 || execute[0] == null || execute[0] == LuaNil.nil) ? b : (fv) execute[0];
                b = fvVar;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (b != null) {
            b.m4455g();
        }
    }
}
