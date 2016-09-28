package com.osesame.android.scanner;

import android.app.Activity;
import net.sourceforge.zbar.Config;
import net.sourceforge.zbar.ImageScanner;

public class ScannerActivity extends Activity {
    protected ImageScanner mScanner;

    static {
        System.loadLibrary("iconv");
    }

    public void setupScanner() {
        this.mScanner = new ImageScanner();
        this.mScanner.setConfig(0, Config.X_DENSITY, 3);
        this.mScanner.setConfig(0, Config.Y_DENSITY, 3);
        int[] symbols = getIntent().getIntArrayExtra(OsesameConstants.SCAN_MODES);
        if (symbols != null) {
            this.mScanner.setConfig(0, 0, 0);
            for (int symbol : symbols) {
                this.mScanner.setConfig(symbol, 0, 1);
            }
        }
    }
}
