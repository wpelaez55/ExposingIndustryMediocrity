package com.konylabs.api.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

final class cJ implements OnKeyListener {
    private /* synthetic */ cH f914a;

    cJ(cH cHVar) {
        this.f914a = cHVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        this.f914a.f3553l.onFocusChange(this.f914a.f3559r, false);
        dialogInterface.dismiss();
        return false;
    }
}
