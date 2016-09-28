package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: com.konylabs.api.ui.h */
final class C0205h extends Handler {
    private /* synthetic */ C0203f f1481a;

    C0205h(C0203f c0203f) {
        this.f1481a = c0203f;
    }

    public final void handleMessage(Message message) {
        int i = 0;
        int i2;
        int i3;
        Message obtain;
        switch (message.what) {
            case LuaWidget.RETAIN_SPACE_UNSET /*-1*/:
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                i2 = message.arg1;
                i = Math.abs(this.f1481a.f1360c - i2);
                float f = i > 4 ? 1.0f : ((float) i) / 4.0f;
                i3 = message.what;
                this.f1481a.m1349a((int) (i3 == 1 ? f * ((float) this.f1481a.f1377t) : f * ((float) (-this.f1481a.f1377t))));
                if (this.f1481a.f1360c != i2) {
                    obtain = Message.obtain();
                    obtain.arg1 = i2;
                    obtain.arg2 = message.arg2;
                    obtain.what = i3;
                    sendMessage(obtain);
                    return;
                }
                this.f1481a.f1372o = 769;
                if (this.f1481a.f1358Z != null) {
                    if (message.arg2 == 1040) {
                        this.f1481a.f1358Z.m1454b(i2);
                    } else {
                        this.f1481a.f1358Z.m1453a(i2);
                    }
                }
                this.f1481a.m1385o();
            case 1037:
            case 1038:
                boolean computeScrollOffset = this.f1481a.f1378u.computeScrollOffset();
                i3 = message.arg1;
                int currX = this.f1481a.f1378u.getCurrX();
                this.f1481a.m1349a(currX - i3);
                if (C0203f.f1335y) {
                    Log.d(C0203f.f1334H, "Justify: X = " + currX);
                }
                i3 = message.arg2;
                if (computeScrollOffset) {
                    i2 = message.what;
                    if ((i2 != 1038 || currX <= i3) && (i2 != 1037 || currX >= i3)) {
                        this.f1481a.f1375r = 0;
                        if (this.f1481a.f1358Z != null) {
                            this.f1481a.f1358Z.m1453a(this.f1481a.f1360c);
                        }
                        this.f1481a.f1378u.forceFinished(true);
                        this.f1481a.f1372o = 769;
                        this.f1481a.m1385o();
                        if (C0203f.f1335y) {
                            this.f1481a.m1372h();
                            return;
                        }
                        return;
                    }
                    obtain = Message.obtain();
                    obtain.arg1 = currX;
                    obtain.arg2 = i3;
                    obtain.what = i2;
                    sendMessage(obtain);
                    return;
                }
                if (this.f1481a.f1372o == 770) {
                    this.f1481a.f1375r = 0;
                    if (this.f1481a.f1358Z != null) {
                        this.f1481a.f1358Z.m1453a(this.f1481a.f1360c);
                    }
                }
                this.f1481a.f1372o = 769;
                this.f1481a.m1385o();
                if (C0203f.f1335y) {
                    this.f1481a.m1372h();
                }
            case 1039:
                if (!this.f1481a.f1378u.computeScrollOffset()) {
                    i = 1;
                }
                if (i != 0) {
                    if (this.f1481a.f1372o == 770) {
                        this.f1481a.m1375j();
                    }
                } else if (this.f1481a.f1360c == -1 || this.f1481a.f1360c == this.f1481a.f1345K) {
                    this.f1481a.m1375j();
                } else {
                    i = message.arg1;
                    int currX2 = this.f1481a.f1378u.getCurrX();
                    i = currX2 - i;
                    if (C0203f.f1335y) {
                        Log.d(C0203f.f1334H, "Fling: " + currX2);
                    }
                    if (i != 0) {
                        this.f1481a.m1349a(i);
                    }
                    obtain = Message.obtain();
                    obtain.arg1 = currX2;
                    obtain.what = 1039;
                    sendMessage(obtain);
                }
            default:
        }
    }
}
