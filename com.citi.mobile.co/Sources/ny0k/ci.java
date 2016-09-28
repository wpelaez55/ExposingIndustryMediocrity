package ny0k;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.konylabs.api.ui.bt;
import com.konylabs.api.ui.bw;
import com.konylabs.api.ui.dB;

final class ci {
    public boolean f2277a;
    public dB f2278b;
    public View f2279c;
    private Drawable f2280d;

    ci() {
    }

    public final void m2166a() {
        this.f2280d = null;
        if (this.f2279c != null) {
            if (this.f2279c instanceof bt) {
                ((bt) this.f2279c).m915f();
            } else {
                ((bw) this.f2279c).m955f();
            }
        }
        this.f2279c = null;
    }
}
