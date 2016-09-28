package com.konylabs.android;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.maps.MapActivity;
import com.konylabs.api.ui.bW;
import com.konylabs.api.ui.ct;
import com.konylabs.api.ui.gH;

public class KonyMapsActivity extends MapActivity {
    private static bW f17b;
    private ct f18a;

    static {
        f17b = null;
    }

    public static bW m14a() {
        return f17b;
    }

    public static void m15a(bW bWVar) {
        f17b = bWVar;
    }

    protected boolean isRouteDisplayed() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        this.f18a = new ct(this, gH.f4090e != null ? gH.f4090e : "0Kkns1zb9eua17YcnSuG3sJzYk_zYhEA5G1OCtA");
        this.f18a.setClickable(true);
        this.f18a.setBuiltInZoomControls(true);
        this.f18a.getController().setZoom(15);
        this.f18a.setLayoutParams(new LayoutParams(-1, -1));
        if (f17b != null) {
            f17b.m843a(this.f18a);
        }
        setContentView(this.f18a, this.f18a.getLayoutParams());
        if (KonyMain.f3657e) {
            Log.d("KonyMapsActivity", "KonyMapsActivity onCreate called");
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isChild() || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (KonyMain.f3657e) {
            Log.d("KonyMapsActivity", "KonyMapsActivity onkeydown BACK called");
        }
        return getParent().onKeyDown(i, keyEvent);
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onResume() {
        super.onResume();
        if (KonyMain.f3657e) {
            Log.d("KonyMapsActivity", "KonyMapsActivity onResume called");
        }
    }
}
