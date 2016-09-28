package com.konylabs.js.debug;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.konylabs.android.KonyMain;

/* renamed from: com.konylabs.js.debug.d */
final class C0232d implements OnClickListener {
    C0232d() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EditText editText = (EditText) DebuggerWaitControl.f1680d.findViewById(DebuggerWaitControl.f1678b);
        try {
            DebuggerWaitControl.f1682f = Integer.parseInt(editText.getText().toString());
            DebuggerWaitControl.f1677a.m1769a(DebuggerWaitControl.f1682f);
        } catch (NumberFormatException e) {
            DebuggerWaitControl.f1677a.m1768a();
        }
        InputMethodManager inputMethodManager = (InputMethodManager) KonyMain.getActContext().getSystemService("input_method");
        if (inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
        dialogInterface.dismiss();
        DebuggerWaitControl.m1619e();
    }
}
