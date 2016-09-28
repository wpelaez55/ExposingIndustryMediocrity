package com.konylabs.api.ui;

import android.os.Message;
import android.support.v4.widget.ExploreByTouchHelper;
import android.util.Log;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.konylabs.api.ui.b */
final class C0198b extends SimpleOnGestureListener {
    private /* synthetic */ C0197a f634a;

    C0198b(C0197a c0197a) {
        this.f634a = c0197a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m650a(int r14, int r15) {
        /*
        r13 = this;
        r11 = 0;
        r10 = 1;
        r0 = 0;
        r1 = -1;
        r3 = new android.graphics.Matrix;
        r3.<init>();
        r4 = new android.graphics.RectF;
        r4.<init>();
        r5 = new android.graphics.RectF;
        r5.<init>();
        if (r15 != r10) goto L_0x006e;
    L_0x0015:
        r0 = r13.f634a;
        r0 = r0.f381P;
        r2 = r0 + 1;
        r0 = r13.f634a;
        r0 = r0.getChildCount();
        r0 = r0 + -1;
        r12 = r0;
        r0 = r2;
        r2 = r12;
    L_0x0028:
        if (r15 != r10) goto L_0x002c;
    L_0x002a:
        if (r0 <= r2) goto L_0x0030;
    L_0x002c:
        if (r15 != r1) goto L_0x008f;
    L_0x002e:
        if (r0 < r2) goto L_0x008f;
    L_0x0030:
        r6 = r13.f634a;
        r6 = r6.getChildAt(r0);
        r4.left = r11;
        r4.top = r11;
        r7 = r6.getWidth();
        r7 = (float) r7;
        r4.right = r7;
        r7 = r6.getHeight();
        r7 = (float) r7;
        r4.bottom = r7;
        r7 = r13.f634a;
        r7.m371a(r6, r3);
        r3.mapRect(r5, r4);
        r7 = (float) r14;
        r8 = r6.getLeft();
        r8 = (float) r8;
        r9 = r5.left;
        r8 = r8 + r9;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 <= 0) goto L_0x007c;
    L_0x005d:
        r7 = (float) r14;
        r6 = r6.getRight();
        r6 = (float) r6;
        r8 = r5.right;
        r6 = r6 + r8;
        r8 = r4.right;
        r6 = r6 - r8;
        r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r6 >= 0) goto L_0x007c;
    L_0x006d:
        return r0;
    L_0x006e:
        if (r15 != r1) goto L_0x0091;
    L_0x0070:
        r2 = r13.f634a;
        r2 = r2.f381P;
        r2 = r2 + -1;
        r12 = r0;
        r0 = r2;
        r2 = r12;
        goto L_0x0028;
    L_0x007c:
        r5.setEmpty();
        r4.setEmpty();
        r3.reset();
        if (r15 != r10) goto L_0x008a;
    L_0x0087:
        r0 = r0 + 1;
        goto L_0x0028;
    L_0x008a:
        if (r15 != r1) goto L_0x0028;
    L_0x008c:
        r0 = r0 + -1;
        goto L_0x0028;
    L_0x008f:
        r0 = r1;
        goto L_0x006d;
    L_0x0091:
        r2 = r0;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.ui.b.a(int, int):int");
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f634a.f399n != 770) {
            if (C0197a.f366B) {
                Log.d(C0197a.f367L, "Flinging started...");
            }
            this.f634a.f399n = 770;
            Message obtain = Message.obtain();
            obtain.arg1 = 0;
            obtain.what = 1039;
            this.f634a.f408w.fling(0, 0, (int) f, 0, ExploreByTouchHelper.INVALID_ID, Integer.MAX_VALUE, 0, 0);
            this.f634a.f384S.sendMessage(obtain);
        }
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f634a.f399n != 770) {
            if (C0197a.f366B) {
                Log.d(C0197a.f367L, "onSingleTapConfirmed");
            }
            int x = (int) motionEvent.getX();
            int d = this.f634a.f381P;
            View childAt = this.f634a.getChildAt(d);
            int e = this.f634a.f387b;
            int i = 0;
            int i2;
            if (x > childAt.getRight()) {
                x = m650a(x, 1);
                if (x != -1) {
                    i = (x - d) + e;
                    if (false && i >= this.f634a.f380O) {
                        i %= this.f634a.f380O;
                    }
                    i2 = i;
                    i = -1;
                } else {
                    i2 = e;
                }
                e = i2;
            } else if (x < childAt.getLeft()) {
                x = m650a(x, -1);
                if (x != -1) {
                    i2 = d - x;
                    i = e - i2;
                    if ((false && i < 0) || i >= this.f634a.f380O) {
                        i = (i + (((int) Math.ceil(((double) i2) / ((double) this.f634a.f380O))) * this.f634a.f380O)) % this.f634a.f380O;
                    }
                    e = i;
                    i = 1;
                }
            }
            if (i != 0) {
                this.f634a.m370a(e, true, i);
            } else if (this.f634a.f385T != null) {
                this.f634a.f385T.m1290b(e);
            }
        }
        return true;
    }
}
