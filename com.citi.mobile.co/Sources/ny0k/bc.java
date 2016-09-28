package ny0k;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

final class bc extends SimpleOnGestureListener {
    private /* synthetic */ ba f2180a;

    bc(ba baVar) {
        this.f2180a = baVar;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent.getX() < motionEvent2.getX() && motionEvent2.getX() - motionEvent.getX() > ((float) this.f2180a.f2171o.f2504j)) {
            this.f2180a.f2171o.m2486p();
        } else if (motionEvent.getX() <= motionEvent2.getX() || motionEvent.getX() - motionEvent2.getX() <= ((float) this.f2180a.f2171o.f2504j)) {
            this.f2180a.invalidate();
        } else {
            this.f2180a.f2171o.m2485o();
        }
        return true;
    }
}
