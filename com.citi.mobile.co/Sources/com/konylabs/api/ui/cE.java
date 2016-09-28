package com.konylabs.api.ui;

import android.content.Context;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.konylabs.android.KonyMain;

final class cE extends RelativeLayout {
    private /* synthetic */ cz f911a;

    public cE(cz czVar, Context context) {
        this.f911a = czVar;
        super(context);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (this.f911a.f1043G != null) {
            this.f911a.f1043G.m965a();
        }
        if (KonyMain.f3657e) {
            Log.d("KonyPopup", " dismissTS = " + System.currentTimeMillis() + " mLastShowTimeStamp = " + this.f911a.f1044H + " diff = " + (System.currentTimeMillis() - this.f911a.f1044H));
        }
        if (System.currentTimeMillis() - this.f911a.f1044H <= 500) {
            return true;
        }
        if (!this.f911a.f1045I || this.f911a.f1046J) {
            KonyMain.getActContext().m4168q();
            this.f911a.dismiss();
        }
        this.f911a.f1044H = 0;
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        KonyMain.m4060F();
        if (motionEvent.getAction() != 0 || (x >= 0 && x < getWidth() && y >= 0 && y < getHeight())) {
            if (motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.f911a.f1045I) {
                return true;
            }
            KonyMain.getActContext().m4168q();
            this.f911a.dismiss();
            return true;
        } else if (this.f911a.f1045I) {
            return true;
        } else {
            KonyMain.getActContext().m4168q();
            this.f911a.dismiss();
            return true;
        }
    }
}
