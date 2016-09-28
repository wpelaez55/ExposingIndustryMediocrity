package com.konylabs.api.ui;

import android.graphics.Rect;
import android.support.v4.widget.ExploreByTouchHelper;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.konylabs.android.KonyMain;

final class ik extends SimpleOnGestureListener {
    private Rect f1586a;
    private int f1587b;
    private /* synthetic */ ij f1588c;

    ik(ij ijVar) {
        this.f1588c = ijVar;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        int g;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Rect rect = this.f1586a;
        if (rect == null) {
            this.f1586a = new Rect();
            rect = this.f1586a;
        }
        int childCount = this.f1588c.getChildCount() - 1;
        while (childCount >= 0) {
            View childAt = this.f1588c.getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                childAt.getHitRect(rect);
                if (rect.contains(x, y)) {
                    g = this.f1588c.f1576q == 1985 ? (this.f1588c.f1564e + childCount) - 2 : this.f1588c.f1564e + childCount;
                    this.f1587b = g;
                    return true;
                }
            }
            childCount--;
        }
        g = -1;
        this.f1587b = g;
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f1588c.f1572m || this.f1588c.f1569j) {
            return false;
        }
        this.f1588c.f1574o = true;
        this.f1588c.f1562c.fling(0, 0, 0, (int) (((double) f2) * 0.75d), 0, 0, ExploreByTouchHelper.INVALID_ID, Integer.MAX_VALUE);
        this.f1588c.f1558E.sendEmptyMessage(1729);
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.f1588c.m1431f();
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.f1587b < 0) {
            return false;
        }
        this.f1588c.m1448b(this.f1587b);
        if (((AccessibilityManager) KonyMain.getAppContext().getSystemService("accessibility")).isEnabled() && this.f1588c.f1578s != null) {
            this.f1588c.f1578s.m1450a(this.f1588c, this.f1588c.f1563d.m1449a(this.f1588c.f1582w));
        }
        return true;
    }
}
