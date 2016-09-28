package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import java.util.ArrayList;
import ny0k.cr;

public class dN {
    final /* synthetic */ hq f1132a;

    dN(hq hqVar) {
        this.f1132a = hqVar;
    }

    public void m1190a(int i) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = this.f1132a.f4454Q;
        Bundle bundle = new Bundle(2);
        bundle.putSerializable("key0", this.f1132a);
        bundle.putDouble("key1", (double) cr.m2199a(i, 1));
        obtain.setData(bundle);
        KonyMain.getActContext();
        KonyMain.m4121f().sendMessage(obtain);
    }

    public void m1191a(ah ahVar, boolean z) {
        ad adVar = (ad) this.f1132a.f4462a;
        if (this.f1132a.f4454Q != null) {
            ArrayList a = adVar.m2574a();
            for (int i = 0; i < a.size(); i++) {
                if (((ah) a.get(i)).equals(ahVar)) {
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    obtain.obj = this.f1132a.f4454Q;
                    Bundle bundle = new Bundle(1);
                    bundle.putSerializable("key0", this.f1132a);
                    bundle.putDouble("key1", (double) cr.m2199a(i, 1));
                    bundle.putBoolean("key2", z);
                    obtain.setData(bundle);
                    KonyMain.getActContext();
                    KonyMain.m4121f().sendMessage(obtain);
                    return;
                }
            }
        }
    }
}
