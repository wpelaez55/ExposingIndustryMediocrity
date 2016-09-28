package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Message;

final class aN extends Handler {
    private /* synthetic */ aM f503a;

    aN(aM aMVar) {
        this.f503a = aMVar;
    }

    aN(aM aMVar, Handler handler) {
        this.f503a = aMVar;
        super(handler.getLooper());
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                this.f503a.f487j.onShowPress(this.f503a.f493p);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                aM.m508c(this.f503a);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                if (this.f503a.f488k != null && !this.f503a.f489l) {
                    this.f503a.f488k.onSingleTapConfirmed(this.f503a.f493p);
                }
            default:
                throw new RuntimeException("Unknown message " + message);
        }
    }
}
