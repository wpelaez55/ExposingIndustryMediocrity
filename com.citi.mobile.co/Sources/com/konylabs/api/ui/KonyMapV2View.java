package com.konylabs.api.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;

public class KonyMapV2View extends MapView {
    private cn f242a;

    static {
    }

    public KonyMapV2View(Context context) {
        super(context);
        this.f242a = null;
    }

    public KonyMapV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f242a = null;
    }

    public KonyMapV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f242a = null;
    }

    public KonyMapV2View(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        this.f242a = null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f242a == null || !this.f242a.w.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                getParent().requestDisallowInterceptTouchEvent(true);
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setKonyMap(cn cnVar) {
        this.f242a = cnVar;
    }
}
