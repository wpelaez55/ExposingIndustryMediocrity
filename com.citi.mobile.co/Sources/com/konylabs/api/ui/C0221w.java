package com.konylabs.api.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.konylabs.api.ui.w */
final class C0221w implements OnClickListener {
    private /* synthetic */ C0220v f1648a;

    C0221w(C0220v c0220v) {
        this.f1648a = c0220v;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f1648a.f1633d != null) {
            this.f1648a.f1633d.m1592a(true);
        }
    }
}
