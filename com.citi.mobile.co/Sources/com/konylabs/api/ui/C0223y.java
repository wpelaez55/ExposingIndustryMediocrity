package com.konylabs.api.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: com.konylabs.api.ui.y */
final class C0223y implements OnCancelListener {
    private /* synthetic */ C0220v f1650a;

    C0223y(C0220v c0220v) {
        this.f1650a = c0220v;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f1650a.f1633d == null) {
            return;
        }
        if (this.f1650a.f1630a == 2) {
            this.f1650a.f1633d.m1592a(false);
        } else {
            this.f1650a.f1633d.m1592a(true);
        }
    }
}
