package com.konylabs.api.ui;

import android.os.Message;
import android.support.v4.widget.ExploreByTouchHelper;
import android.util.Log;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.konylabs.api.ui.g */
final class C0204g extends SimpleOnGestureListener {
    private /* synthetic */ C0203f f1446a;

    C0204g(C0203f c0203f) {
        this.f1446a = c0203f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m1400a(int r14, int r15) {
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
        r0 = r13.f1446a;
        r0 = r0.f1346L;
        r2 = r0 + 1;
        r0 = r13.f1446a;
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
        r6 = r13.f1446a;
        r6 = r6.getChildAt(r0);
        r4.left = r11;
        r4.top = r11;
        r7 = r6.getWidth();
        r7 = (float) r7;
        r4.right = r7;
        r7 = r6.getHeight();
        r7 = (float) r7;
        r4.bottom = r7;
        r7 = r13.f1446a;
        r7.m1352a(r6, r3);
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
        r2 = r13.f1446a;
        r2 = r2.f1346L;
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
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.ui.g.a(int, int):int");
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f1446a.f1372o != 770) {
            if (C0203f.f1335y) {
                Log.d(C0203f.f1334H, "Flinging started...");
            }
            this.f1446a.f1372o = 770;
            Message obtain = Message.obtain();
            obtain.arg1 = 0;
            obtain.what = 1039;
            this.f1446a.f1378u.fling(0, 0, (int) f, 0, ExploreByTouchHelper.INVALID_ID, Integer.MAX_VALUE, 0, 0);
            this.f1446a.f1357W.sendMessage(obtain);
        }
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f1446a.f1372o != 770) {
            if (C0203f.f1335y) {
                Log.d(C0203f.f1334H, "onSingleTapConfirmed");
            }
            int x = (int) motionEvent.getX();
            int d = this.f1446a.f1346L;
            View childAt = this.f1446a.getChildAt(d);
            int e = this.f1446a.f1360c;
            int i = 0;
            int i2;
            if (x > childAt.getRight()) {
                x = m1400a(x, 1);
                if (x != -1) {
                    i = (x - d) + e;
                    if (this.f1446a.f1344J && i >= this.f1446a.f1345K) {
                        i %= this.f1446a.f1345K;
                    }
                    i2 = i;
                    i = -1;
                } else {
                    i2 = e;
                }
                e = i2;
            } else if (x < childAt.getLeft()) {
                x = m1400a(x, -1);
                if (x != -1) {
                    i2 = d - x;
                    i = e - i2;
                    if ((this.f1446a.f1344J && i < 0) || i >= this.f1446a.f1345K) {
                        i = (i + (((int) Math.ceil(((double) i2) / ((double) this.f1446a.f1345K))) * this.f1446a.f1345K)) % this.f1446a.f1345K;
                    }
                    e = i;
                    i = 1;
                }
            }
            if (i != 0) {
                this.f1446a.m1351a(e, true, i);
            } else if (this.f1446a.f1358Z != null) {
                this.f1446a.f1358Z.m1454b(e);
            }
        }
        return true;
    }
}
