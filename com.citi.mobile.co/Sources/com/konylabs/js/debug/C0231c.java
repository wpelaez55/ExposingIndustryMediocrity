package com.konylabs.js.debug;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: com.konylabs.js.debug.c */
final class C0231c implements OnCancelListener {
    C0231c() {
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DebuggerWaitControl.f1681e = true;
        dialogInterface.dismiss();
    }
}
