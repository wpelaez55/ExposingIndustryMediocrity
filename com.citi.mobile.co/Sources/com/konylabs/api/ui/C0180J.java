package com.konylabs.api.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;

/* renamed from: com.konylabs.api.ui.J */
final class C0180J implements OnClickListener {
    private /* synthetic */ C0371G f241a;

    C0180J(C0371G c0371g) {
        this.f241a = c0371g;
    }

    public final void onClick(View view) {
        KonyMain.getActContext().m4168q();
        this.f241a.f2445a.onFocusChange(this.f241a, true);
        this.f241a.m2408k();
    }
}
