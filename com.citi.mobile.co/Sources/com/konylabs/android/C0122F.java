package com.konylabs.android;

import android.view.animation.Animation;
import com.konylabs.api.ui.fv;
import ny0k.C0307z;

/* renamed from: com.konylabs.android.F */
final class C0122F implements Runnable {
    private /* synthetic */ Animation f9a;
    private /* synthetic */ C0121E f10b;

    C0122F(C0121E c0121e, Animation animation) {
        this.f10b = c0121e;
        this.f9a = animation;
    }

    public final void run() {
        if (this.f9a instanceof C0307z) {
            ((C0307z) this.f9a).m2232a();
        }
        if (this.f10b.f7d.ar != null) {
            fv b = fv.m4395b(this.f10b.f7d.ar);
            if (this.f10b.f8e == 1) {
                this.f10b.f7d.as = null;
            } else if (this.f10b.f8e == 0 && b.m4456h() != null) {
                this.f10b.f7d.f3685Z.setOutAnimation(null);
                this.f10b.f7d.f3685Z.setInAnimation(null);
                this.f10b.f7d.at = null;
                this.f10b.f7d.f3685Z.removeView(b.m4456h().m464d());
                fv.m4393a(this.f10b.f7d.ar);
            }
        }
        if (this.f10b.f7d.as == null && this.f10b.f7d.at == null) {
            KonyMain.f3664m.m12a();
        }
    }
}
