package ny0k;

import android.view.View;
import android.view.View.MeasureSpec;

final class bt implements Runnable {
    private /* synthetic */ int f2207a;
    private /* synthetic */ bq f2208b;

    bt(bq bqVar, int i) {
        this.f2208b = bqVar;
        this.f2207a = i;
    }

    public final void run() {
        int count = this.f2208b.getCount() - this.f2208b.getChildCount();
        int i = this.f2207a;
        if (this.f2207a <= count) {
            count = i;
        }
        View a = this.f2208b.f3389u != null ? this.f2208b.f3389u.m2091a(count) : null;
        if (a != null && this.f2208b.getMeasuredWidth() > 0) {
            this.f2208b.measureChild(a, MeasureSpec.makeMeasureSpec(this.f2208b.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            this.f2208b.setSelectionFromTop(this.f2207a, a.getMeasuredHeight());
        }
    }
}
