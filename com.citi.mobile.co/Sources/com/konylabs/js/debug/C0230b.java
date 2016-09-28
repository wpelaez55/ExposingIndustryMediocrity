package com.konylabs.js.debug;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.konylabs.js.debug.b */
final class C0230b implements OnClickListener {
    C0230b() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DebuggerWaitControl.f1681e = true;
        dialogInterface.dismiss();
    }
}
