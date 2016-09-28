package com.konylabs.android;

import com.konylabs.api.ui.bt;
import com.konylabs.api.ui.dB;
import com.konylabs.api.ui.eG;
import com.konylabs.api.ui.eH;
import com.konylabs.api.ui.eK;
import com.konylabs.api.ui.fv;
import com.konylabs.api.ui.gL;

/* renamed from: com.konylabs.android.b */
final class C0129b implements Runnable {
    C0129b() {
    }

    public final void run() {
        fv.m4423i();
        fv.m4428s();
        gL.m4544j();
        eK.m3300e();
        bt.m881g();
        bt.m882i();
        dB.m1113e();
        eH.m3988a().m3990b();
        eG.m3985a().m3987b();
        KonyMain.m4132j();
        KonyMain.m4121f().post(new C0130c(this));
    }
}
