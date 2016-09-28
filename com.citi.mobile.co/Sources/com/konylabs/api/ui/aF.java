package com.konylabs.api.ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

final class aF extends RelativeLayout {
    private en f466a;
    private GestureDetector f467b;
    private ArrayList f468c;
    private /* synthetic */ aD f469d;

    public aF(aD aDVar, Context context) {
        this.f469d = aDVar;
        super(context);
        this.f467b = null;
        this.f468c = new ArrayList();
    }

    public final void m497a(GestureDetector gestureDetector) {
        this.f468c.add(gestureDetector);
    }

    public final void m498a(en enVar) {
        this.f466a = enVar;
    }

    public final void m499b(GestureDetector gestureDetector) {
        this.f468c.remove(gestureDetector);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 82) ? false : super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f468c.size() > 0) {
            Iterator it = this.f468c.iterator();
            while (it.hasNext()) {
                ((GestureDetector) it.next()).onTouchEvent(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View view = (View) getParent();
        if (view != null && view.getRootView() != null) {
            int height = view.getRootView().getHeight();
            if (height - view.getHeight() <= height / 4) {
                this.f466a.m1339a(((getMeasuredHeight() - this.f469d.f455q.getMeasuredHeight()) - this.f469d.f440b.getMeasuredHeight()) - this.f469d.f441c.getMeasuredHeight());
            }
        }
    }
}
