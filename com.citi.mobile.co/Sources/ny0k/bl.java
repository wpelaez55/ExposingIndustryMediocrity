package ny0k;

import android.view.View;
import android.view.View.OnClickListener;

final class bl implements OnClickListener {
    private /* synthetic */ bk f2203a;

    bl(bk bkVar) {
        this.f2203a = bkVar;
    }

    public final void onClick(View view) {
        bn bnVar = (bn) view.getTag();
        int i = bnVar.j;
        int i2 = bnVar.l;
        int i3 = bnVar.k;
        boolean a = bk.m2079a(this.f2203a, view);
        view.sendAccessibilityEvent(1);
        this.f2203a.m2084a(i, i3, i2, a);
        if (this.f2203a.f2195a != null && this.f2203a.f2195a.ac) {
            if (this.f2203a.f2200g == null) {
                this.f2203a.f2200g = view;
            }
            this.f2203a.f2200g.setBackgroundDrawable(((bn) this.f2203a.f2200g.getTag()).f3331a);
            this.f2203a.f2200g = view;
            if (bnVar.f3335e != null) {
                view.setBackgroundDrawable(bnVar.f3335e);
            }
        }
    }
}
