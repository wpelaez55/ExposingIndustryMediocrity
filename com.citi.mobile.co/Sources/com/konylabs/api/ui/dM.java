package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Message;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import java.util.ArrayList;

public class dM {
    final /* synthetic */ hq f1131a;

    dM(hq hqVar) {
        this.f1131a = hqVar;
    }

    private void m1187a(Function function) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = function;
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("key0", this.f1131a);
        obtain.setData(bundle);
        KonyMain.getActContext();
        KonyMain.m4121f().sendMessage(obtain);
    }

    public void m1188a(int i) {
        hs hsVar = (hs) this.f1131a.f4463b.get(i);
        if (!hsVar.f1534f) {
            hsVar.f1534f = true;
            Function function = hsVar.f1533e;
            if (function != null) {
                m1187a(function);
            }
        }
    }

    public void m1189a(ah ahVar) {
        ArrayList a = ((ad) this.f1131a.f4462a).m2574a();
        for (int i = 0; i < a.size(); i++) {
            if (((ah) a.get(i)).equals(ahVar)) {
                hs hsVar = (hs) this.f1131a.f4463b.get(i);
                if (!hsVar.f1534f) {
                    hsVar.f1534f = true;
                    Function function = hsVar.f1533e;
                    if (function != null) {
                        m1187a(function);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}
