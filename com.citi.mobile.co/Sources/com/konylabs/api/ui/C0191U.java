package com.konylabs.api.ui;

import android.util.Log;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import com.konylabs.android.KonyMain;

/* renamed from: com.konylabs.api.ui.U */
final class C0191U implements OnScaleGestureListener {
    private /* synthetic */ C0184N f328a;

    private C0191U(C0184N c0184n, byte b) {
        this.f328a = c0184n;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float min = Math.min(this.f328a.f275C, Math.max(this.f328a.f276D, (float) ((int) ((((float) this.f328a.f277E) * scaleFactor) * scaleFactor))));
        if (min != ((float) this.f328a.f277E)) {
            this.f328a.f277E = (int) min;
            int q = 0 + ((int) (((((float) this.f328a.f277E) - this.f328a.f276D) * ((float) (this.f328a.f278F - 0))) / (this.f328a.f275C - this.f328a.f276D)));
            if (KonyMain.f3657e) {
                Log.d("KonyCamera", "onScale : zoom = " + q + "  scaleFactor = " + scaleFactor + "  mCircleSize =" + this.f328a.f277E + "  mMaxCircle = " + this.f328a.f275C + "  mMinCircle = " + this.f328a.f276D);
            }
            this.f328a.f319w.setZoom(q);
            this.f328a.f287O.setParameters(this.f328a.f319w);
        }
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
