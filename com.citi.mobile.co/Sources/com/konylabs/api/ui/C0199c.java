package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: com.konylabs.api.ui.c */
final class C0199c extends Handler {
    private /* synthetic */ C0197a f906a;

    C0199c(C0197a c0197a) {
        this.f906a = c0197a;
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
                i = Math.abs(this.f906a.f387b - i2);
                float f = i > 4 ? 1.0f : ((float) i) / 4.0f;
                i3 = message.what;
                this.f906a.m387e((int) (i3 == 1 ? f * ((float) this.f906a.f407v) : f * ((float) (-this.f906a.f407v))));
                if (this.f906a.f387b != i2) {
                    obtain = Message.obtain();
                    obtain.arg1 = i2;
                    obtain.arg2 = message.arg2;
                    obtain.what = i3;
                    sendMessage(obtain);
                    return;
                }
                this.f906a.f399n = 769;
                if (this.f906a.f385T == null) {
                    return;
                }
                if (message.arg2 == 1040) {
                    this.f906a.f385T.m1290b(i2);
                } else {
                    this.f906a.f385T.m1289a(i2);
                }
            case 1037:
            case 1038:
                boolean computeScrollOffset = this.f906a.f408w.computeScrollOffset();
                i3 = message.arg1;
                int currX = this.f906a.f408w.getCurrX();
                this.f906a.m387e(currX - i3);
                if (C0197a.f366B) {
                    Log.d(C0197a.f367L, "Justify: X = " + currX);
                }
                i3 = message.arg2;
                if (computeScrollOffset) {
                    i2 = message.what;
                    if ((i2 != 1038 || currX <= i3) && (i2 != 1037 || currX >= i3)) {
                        this.f906a.f403r = 0;
                        if (this.f906a.f385T != null) {
                            this.f906a.f385T.m1289a(this.f906a.f387b);
                        }
                        this.f906a.f408w.forceFinished(true);
                        this.f906a.f399n = 769;
                        if (C0197a.f366B) {
                            this.f906a.m388f();
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
                if (this.f906a.f399n == 770) {
                    this.f906a.f403r = 0;
                    if (this.f906a.f385T != null) {
                        this.f906a.f385T.m1289a(this.f906a.f387b);
                    }
                }
                this.f906a.f399n = 769;
                if (C0197a.f366B) {
                    this.f906a.m388f();
                }
            case 1039:
                if (!this.f906a.f408w.computeScrollOffset()) {
                    i = 1;
                }
                if (i != 0) {
                    if (this.f906a.f399n == 770) {
                        this.f906a.m393h();
                    }
                } else if (this.f906a.f387b == -1 || this.f906a.f387b == this.f906a.f380O) {
                    this.f906a.m393h();
                } else {
                    i = message.arg1;
                    int currX2 = this.f906a.f408w.getCurrX();
                    i = currX2 - i;
                    if (C0197a.f366B) {
                        Log.d(C0197a.f367L, "Fling: " + currX2);
                    }
                    if (i != 0) {
                        this.f906a.m387e(i);
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
