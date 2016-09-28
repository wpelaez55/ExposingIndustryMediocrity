package ny0k;

import android.view.View;
import android.view.View.OnClickListener;

final class bC implements OnClickListener {
    private /* synthetic */ bA f2119a;

    private bC(bA bAVar, byte b) {
        this.f2119a = bAVar;
    }

    public final void onClick(View view) {
        boolean a = bA.m3582a(this.f2119a, view);
        view.sendAccessibilityEvent(1);
        if (this.f2119a.f3293c != null) {
            int[] b = bA.m3586b(this.f2119a, view);
            if (b != null) {
                this.f2119a.f3293c.m2163a(b[1], b[0], a);
            }
        }
    }
}
