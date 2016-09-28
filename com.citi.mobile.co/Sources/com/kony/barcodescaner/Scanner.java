package com.kony.barcodescaner;

import android.os.Bundle;
import android.support.v4.internal.view.SupportMenu;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.osesame.android.scanner.OsesameScannerActivity;

public class Scanner extends OsesameScannerActivity {
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("KonyBarcode", "In Scanner 11");
        super.onCreate(savedInstanceState);
        Log.d("KonyBarcode", "In Scanner 11");
    }

    public void prepareLayout(RelativeLayout mainLayout) {
        LayoutParams params1 = new LayoutParams(-1, 2);
        params1.addRule(13);
        View line = new View(this);
        line.setBackgroundColor(SupportMenu.CATEGORY_MASK);
        mainLayout.addView(line, params1);
        LayoutParams params2 = new LayoutParams(-2, -2);
        params2.addRule(12);
        params2.addRule(14);
        TextView textView = new TextView(this);
        textView.setTextColor(-7829368);
        textView.setTextSize(18.0f);
        textView.setPadding(0, 0, 0, 25);
        textView.setText("Coloque um c\u00f3digo de barras dentro do ret\u00e2ngulo do visor para digitaliz\u00e1-lo.");
        mainLayout.addView(textView, params2);
    }

    public String scanToken() {
        System.out.println("KonyBarcode : scanToken : DEMf0b24692b72d");
        return "TMB195eecd8f5b0";
    }

    public int customPreviewSize() {
        return 0;
    }

    public String customFocusMode() {
        return "infinity";
    }

    public int cropMode() {
        return 1;
    }
}
