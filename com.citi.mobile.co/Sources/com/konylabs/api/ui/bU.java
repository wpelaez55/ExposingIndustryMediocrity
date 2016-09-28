package com.konylabs.api.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final class bU implements OnDismissListener {
    private /* synthetic */ bT f788a;

    bU(bT bTVar) {
        this.f788a = bTVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f788a.f787a.f736B.invalidate();
    }
}
