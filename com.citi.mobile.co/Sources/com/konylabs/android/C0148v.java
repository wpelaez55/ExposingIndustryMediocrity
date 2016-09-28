package com.konylabs.android;

import android.os.Handler;
import android.os.Message;
import com.konylabs.api.ui.C0220v;

/* renamed from: com.konylabs.android.v */
final class C0148v extends Handler {
    private /* synthetic */ KonyMain f51a;

    C0148v(KonyMain konyMain) {
        this.f51a = konyMain;
    }

    public final void handleMessage(Message message) {
        if (message.what == 99990) {
            KonyMain.f3654b = 1;
        } else if (message.what == 99991) {
            this.f51a.m4149a(611, "Failed to load bytecode");
            this.f51a.f3676E.setAnimation(null);
            this.f51a.f3676E.setImageDrawable(null);
            KonyMain.f3638B.postDelayed(new C0149w(this), 3000);
        } else {
            if (message.what == 99992) {
                C0220v c0220v = new C0220v(this.f51a);
                c0220v.m1588b(2);
                c0220v.m1586a("Update Available");
                c0220v.m1589b("Do you want to update?");
                c0220v.m1585a(new C0336x(this));
                c0220v.m1583a();
            }
            super.handleMessage(message);
        }
    }
}
