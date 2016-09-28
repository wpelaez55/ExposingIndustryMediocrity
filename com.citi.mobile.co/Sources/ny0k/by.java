package ny0k;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.ImageView;

final class by implements OnPageChangeListener {
    private /* synthetic */ bv f3441a;

    by(bv bvVar) {
        this.f3441a = bvVar;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void onPageSelected(int i) {
        if (this.f3441a.f3418p != null) {
            if (this.f3441a.f3420r < this.f3441a.f3419q) {
                ((ImageView) this.f3441a.f3418p.getChildAt(this.f3441a.f3420r)).setImageDrawable(this.f3441a.f3414l);
            }
            if (i < this.f3441a.f3419q) {
                ((ImageView) this.f3441a.f3418p.getChildAt(i)).setImageDrawable(this.f3441a.f3413k);
            }
        }
        if (this.f3441a.f3401B) {
            if (Math.abs(this.f3441a.f3403D.f3436a - i) > this.f3441a.f3409g.getChildCount() / 2) {
                this.f3441a.f3402C = null;
            }
        }
        this.f3441a.f3420r = i;
        if (this.f3441a.f3400A) {
            this.f3441a.f3400A = false;
        } else if (this.f3441a.f3427y != null) {
            this.f3441a.f3427y.m2077a(i);
        }
    }
}
