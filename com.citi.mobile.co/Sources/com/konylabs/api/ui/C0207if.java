package com.konylabs.api.ui;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.konylabs.android.KonyMain;

/* renamed from: com.konylabs.api.ui.if */
final class C0207if extends ScrollView {
    public C0207if(Context context) {
        super(context);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        try {
            z = super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            if (KonyMain.f3657e) {
                Log.d("PopupScrollView", " onTouchEvent Exception -- " + e);
            }
        }
        return z;
    }
}
