package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Message;

final class il extends Handler {
    private /* synthetic */ ij f1589a;

    il(ij ijVar) {
        this.f1589a = ijVar;
    }

    public final void handleMessage(Message message) {
        this.f1589a.f1562c.computeScrollOffset();
        int i;
        int currY;
        Message obtain;
        if (message.what == 1729) {
            i = message.arg1;
            currY = this.f1589a.f1562c.getCurrY();
            i = currY - i;
            ij ijVar = this.f1589a;
            ijVar.f1560a += Math.abs(i);
            this.f1589a.m1420c(i);
            i = this.f1589a.f1562c.getFinalY();
            if (this.f1589a.f1575p) {
                this.f1589a.f1575p = false;
                this.f1589a.f1574o = false;
            } else if (i == currY) {
                this.f1589a.m1428e();
            } else if (this.f1589a.f1572m || this.f1589a.f1569j) {
                this.f1589a.f1562c.startScroll(0, 0, 0, this.f1589a.f1573n);
                this.f1589a.f1558E.sendEmptyMessage(1731);
            } else {
                obtain = Message.obtain();
                obtain.what = 1729;
                obtain.arg1 = currY;
                this.f1589a.f1558E.sendMessage(obtain);
            }
        } else if (message.what == 1730) {
            i = message.arg1;
            currY = message.arg2;
            int currY2 = this.f1589a.f1562c.getCurrY();
            i = currY2 - i;
            ij ijVar2 = this.f1589a;
            ijVar2.f1560a += Math.abs(i);
            if (this.f1589a.f1570k == 1037) {
                i = -i;
            }
            this.f1589a.m1420c(i);
            if (currY2 < currY) {
                obtain = Message.obtain();
                obtain.what = 1730;
                obtain.arg1 = currY2;
                obtain.arg2 = currY;
                this.f1589a.f1558E.sendMessage(obtain);
                return;
            }
            this.f1589a.f1568i = -1;
            this.f1589a.f1574o = false;
            this.f1589a.m1431f();
            if (this.f1589a.f1578s != null) {
                this.f1589a.f1578s.m1450a(this.f1589a, this.f1589a.f1563d.m1449a(this.f1589a.f1582w));
            }
        } else if (message.what == 1731) {
            i = message.arg1;
            currY = this.f1589a.f1562c.getCurrY();
            i = currY - i;
            if (this.f1589a.f1572m) {
                this.f1589a.m1426d(i);
            } else if (this.f1589a.f1569j) {
                this.f1589a.m1426d(-i);
            }
            if (currY < this.f1589a.f1562c.getFinalY()) {
                obtain = Message.obtain();
                obtain.what = 1731;
                obtain.arg1 = currY;
                this.f1589a.f1558E.sendMessage(obtain);
                return;
            }
            this.f1589a.f1562c.startScroll(0, 0, 0, this.f1589a.f1573n);
            this.f1589a.f1558E.sendEmptyMessage(1732);
        } else if (message.what == 1732) {
            i = message.arg1;
            currY = this.f1589a.f1562c.getCurrY();
            i = currY - i;
            if (this.f1589a.f1572m) {
                this.f1589a.m1426d(-i);
            } else if (this.f1589a.f1569j) {
                this.f1589a.m1426d(i);
            }
            if (currY < this.f1589a.f1562c.getFinalY()) {
                obtain = Message.obtain();
                obtain.what = 1732;
                obtain.arg1 = currY;
                this.f1589a.f1558E.sendMessage(obtain);
                return;
            }
            this.f1589a.f1572m = false;
            this.f1589a.f1569j = false;
            this.f1589a.f1574o = false;
            this.f1589a.f1575p = false;
            this.f1589a.m1431f();
            if (this.f1589a.f1578s != null) {
                this.f1589a.f1578s.m1450a(this.f1589a, this.f1589a.f1563d.m1449a(this.f1589a.f1582w));
            }
        }
    }
}
