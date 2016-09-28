package com.konylabs.api.ui;

import android.content.Context;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;

final class eL implements Runnable {
    private /* synthetic */ eK f1253a;

    eL(eK eKVar) {
        this.f1253a = eKVar;
    }

    public final void run() {
        Context actContext = KonyMain.getActContext();
        if (actContext != null && actContext.m4164l() != null) {
            actContext.m4155b();
            if (eK.f2976l) {
                this.f1253a.m3309d();
            }
            this.f1253a.f2979c = new cz(actContext);
            this.f1253a.f2979c.m1070a(true);
            if (!this.f1253a.f2981e) {
                this.f1253a.f2979c.m1076b(true);
            }
            this.f1253a.f2979c.m1074b(eK.m3297c(this.f1253a));
            this.f1253a.f2979c.m1064a(null);
            this.f1253a.f2977a = fv.m4426o();
            if (this.f1253a.f2977a != null) {
                this.f1253a.f2977a.m4435a(this.f1253a);
            }
            if (this.f1253a.f2982f.equals("fullscreen")) {
                this.f1253a.f2979c.m1080c(true);
            } else {
                this.f1253a.f2979c.m1080c(false);
                this.f1253a.f2979c.m1062a(100);
            }
            if (this.f1253a.f2986j != -1) {
                this.f1253a.f2979c.m1062a(this.f1253a.f2986j);
            }
            if (this.f1253a.f2983g != null) {
                this.f1253a.f2979c.m1068a(this.f1253a.f2983g);
            }
            this.f1253a.f2979c.m1073b(5);
            if (this.f1253a.f2987m != null) {
                LuaNil table = this.f1253a.f2987m.getTable(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG_HINT);
                if (table != LuaNil.nil) {
                    this.f1253a.f2979c.m1075b(table.toString());
                }
            }
            this.f1253a.f2979c.m1077c();
            eK.f2976l = true;
            this.f1253a.f2979c.m1067a(this.f1253a.f2978b);
        }
    }
}
