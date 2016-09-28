package com.konylabs.api.ui;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.util.Log;
import android.view.OrientationEventListener;
import com.konylabs.android.KonyMain;

/* renamed from: com.konylabs.api.ui.V */
final class C0192V extends OrientationEventListener {
    private /* synthetic */ C0184N f329a;

    public C0192V(C0184N c0184n, Context context) {
        this.f329a = c0184n;
        super(context);
    }

    public final void onOrientationChanged(int i) {
        if (i != -1) {
            CameraInfo cameraInfo = new CameraInfo();
            Camera.getCameraInfo(this.f329a.f320x, cameraInfo);
            int i2 = ((i + 45) / 90) * 90;
            int i3 = cameraInfo.facing == 1 ? ((cameraInfo.orientation - i2) + 360) % 360 : (cameraInfo.orientation + i2) % 360;
            if (this.f329a.f287O != null && this.f329a.f319w != null && !this.f329a.f311o) {
                KonyMain actContext = KonyMain.getActContext();
                if (!(actContext == null || actContext.getWindowManager().getDefaultDisplay().getRotation() == this.f329a.f322z)) {
                    i2 = this.f329a.m309j();
                    if (i2 != -1) {
                        if (this.f329a.f310n) {
                            this.f329a.f287O.stopPreview();
                        }
                        if (KonyMain.f3657e) {
                            Log.d("KonyCamera", "onOrientationChanged:  setDisplayOrientation = " + i2);
                        }
                        this.f329a.f287O.setDisplayOrientation(i2);
                        this.f329a.f287O.startPreview();
                        this.f329a.f310n = true;
                    }
                }
                if (this.f329a.f273A != i3) {
                    if (this.f329a.ad == 6) {
                        if (i3 == 90 || i3 == 270) {
                            i3 = 0;
                        }
                    } else if (this.f329a.ad == 7 && (i3 == 0 || i3 == 180)) {
                        i3 = 0;
                    }
                    if (KonyMain.f3657e) {
                        Log.d("KonyCamera", "onOrientationChanged : setRotation = " + i3);
                    }
                    this.f329a.f319w.setRotation(i3);
                    this.f329a.f287O.setParameters(this.f329a.f319w);
                    this.f329a.f273A = i3;
                }
            }
        }
    }
}
