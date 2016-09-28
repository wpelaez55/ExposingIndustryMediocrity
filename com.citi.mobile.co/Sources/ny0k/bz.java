package ny0k;

import android.view.View;
import android.view.View.OnClickListener;

final class bz implements OnClickListener {
    private /* synthetic */ bv f2210a;

    bz(bv bvVar) {
        this.f2210a = bvVar;
    }

    public final void onClick(View view) {
        this.f2210a.f3409g.setCurrentItem(((Integer) view.getTag()).intValue(), true);
    }
}
