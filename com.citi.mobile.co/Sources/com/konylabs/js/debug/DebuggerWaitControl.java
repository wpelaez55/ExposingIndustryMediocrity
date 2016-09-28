package com.konylabs.js.debug;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.dB;
import com.konylabs.vmintf.C0253a;

public class DebuggerWaitControl {
    static C0253a f1677a;
    private static int f1678b;
    private static AlertDialog f1679c;
    private static AlertDialog f1680d;
    private static boolean f1681e;
    private static int f1682f;

    static {
        f1678b = 1;
        f1679c = null;
        f1680d = null;
        f1681e = false;
        f1677a = null;
        f1682f = 9222;
    }

    static /* synthetic */ void m1614a() {
        Context actContext = KonyMain.getActContext();
        if (actContext != null) {
            View linearLayout = new LinearLayout(actContext);
            linearLayout.setPadding(dB.m1116r(15), dB.m1116r(5), dB.m1116r(15), dB.m1116r(5));
            linearLayout.setOrientation(1);
            View textView = new TextView(actContext);
            textView.setText("Debugger Host IP");
            textView.setTypeface(Typeface.DEFAULT, 1);
            View editText = new EditText(actContext);
            editText.setInputType(3);
            editText.setText("localhost");
            editText.setEnabled(false);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            textView = new TextView(actContext);
            textView.setText("Debugger Host Port");
            LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 20, 0, 0);
            textView.setTypeface(Typeface.DEFAULT, 1);
            View editText2 = new EditText(actContext);
            editText2.setId(f1678b);
            editText2.setInputType(3);
            editText2.setText("9222");
            linearLayout.addView(textView, layoutParams);
            linearLayout.addView(editText2);
            AlertDialog create = new Builder(actContext).setTitle("Kony JavaScript Debugger Configuration").setView(linearLayout).setIcon(actContext.getResources().getIdentifier("icon", "drawable", actContext.getPackageName())).create();
            f1680d = create;
            create.setCanceledOnTouchOutside(false);
            f1680d.setButton(-1, "Start", new C0232d());
            f1680d.setButton(-2, "Cancel", new C0233e());
            f1680d.setOnCancelListener(new C0234f());
            f1680d.show();
        }
    }

    public static boolean cancelled() {
        return f1681e;
    }

    static /* synthetic */ void m1619e() {
        Context actContext = KonyMain.getActContext();
        if (actContext != null) {
            AlertDialog create = new Builder(actContext).setTitle("Debugger").setIcon(actContext.getResources().getIdentifier("icon", "drawable", actContext.getPackageName())).setMessage("Waiting for KonyOne Studio to Connect...").setNeutralButton("Cancel", new C0230b()).create();
            f1679c = create;
            create.setCanceledOnTouchOutside(false);
            f1679c.setOnCancelListener(new C0231c());
            f1679c.show();
        }
    }

    public static void hide() {
        if (f1679c != null) {
            f1679c.dismiss();
        }
    }

    public static void show(C0253a c0253a) {
        f1677a = c0253a;
        KonyMain.m4094a(new C0229a());
    }
}
