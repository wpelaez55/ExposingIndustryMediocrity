package com.konylabs.api.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.konylabs.api.ui.x */
final class C0222x implements OnClickListener {
    private /* synthetic */ C0220v f1649a;

    C0222x(C0220v c0220v) {
        this.f1649a = c0220v;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f1649a.f1633d != null) {
            this.f1649a.f1633d.m1592a(false);
        }
    }
}
