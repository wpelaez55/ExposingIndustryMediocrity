package com.konylabs.api.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.konylabs.api.ui.I */
final class C0179I implements OnDismissListener {
    private /* synthetic */ C0371G f240a;

    C0179I(C0371G c0371g) {
        this.f240a = c0371g;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f240a.f2445a.onFocusChange(this.f240a, false);
    }
}
