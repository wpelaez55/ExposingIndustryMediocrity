package ny0k;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.konylabs.api.ui.dB;

final class bE extends LinearLayout {
    TextView f2126a;

    public bE(bA bAVar, Context context) {
        super(context);
        this.f2126a = new TextView(context);
        this.f2126a.setFocusable(true);
        addView(this.f2126a);
        setGravity(16);
    }

    final void m2023a(dB dBVar) {
        if (dBVar != null) {
            if (this.f2126a != null) {
                this.f2126a.setBackgroundColor(0);
                dBVar.m1129b(this.f2126a);
            }
        } else if (this.f2126a != null) {
            this.f2126a.setTextSize(14.0f);
            this.f2126a.setTypeface(Typeface.SANS_SERIF, 1);
            this.f2126a.setTextColor(-1);
        }
    }
}
