package ny0k;

import android.support.v4.view.PagerAdapter;
import android.view.View;

abstract class bx extends PagerAdapter {
    protected int f3436a;
    protected String f3437b;
    protected String f3438c;
    protected boolean f3439d;
    final /* synthetic */ bv f3440e;

    public bx(bv bvVar) {
        this.f3440e = bvVar;
        this.f3436a = -1;
        this.f3438c = bvVar.f3405F;
        this.f3437b = bvVar.f3404E;
    }

    protected final void m3843a(View view, int i, int i2, boolean z) {
        view.getTag();
        if (this.f3439d) {
            if (this.f3440e.f3402C != null) {
                this.f3440e.f3402C.setSelected(false);
            }
            view.setSelected(true);
            this.f3440e.f3402C = view;
        }
        if (this.f3440e.f3426x != null) {
            this.f3440e.f3426x.m2163a(i, i2, z);
        }
    }

    public final void m3844a(String str) {
        this.f3437b = str;
    }

    public final void m3845b(String str) {
        this.f3438c = str;
    }
}
