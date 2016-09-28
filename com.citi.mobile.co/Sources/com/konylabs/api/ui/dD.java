package com.konylabs.api.ui;

import android.widget.TextView;

public final class dD {
    private float f1120a;
    private int f1121b;
    private int f1122c;
    private int f1123d;

    public dD(dB dBVar, int i, int i2, int i3, int i4) {
        this.f1122c = i;
        this.f1123d = i2;
        this.f1121b = i3;
        this.f1120a = i4 == 0 ? 0.001f : (float) i4;
    }

    public final void m1168a(TextView textView) {
        if (this.f1122c != 0 || this.f1123d != 0) {
            textView.setShadowLayer(this.f1120a, (float) this.f1122c, (float) this.f1123d, this.f1121b);
        }
    }
}
