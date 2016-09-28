package ny0k;

import android.graphics.drawable.Drawable;
import com.konylabs.api.ui.C0174B;
import com.konylabs.api.ui.dB;

final class bD {
    boolean f2120a;
    private bE f2121b;
    private C0174B f2122c;
    private Drawable f2123d;
    private dB f2124e;
    private /* synthetic */ bA f2125f;

    private bD(bA bAVar, byte b) {
        this.f2125f = bAVar;
        this.f2120a = false;
    }

    public final void m2018a() {
        if (this.f2123d != null && (this.f2123d instanceof cA)) {
            cA cAVar = (cA) this.f2123d;
            int d = this.f2125f.f3297g != null ? this.f2125f.f3297g.m1134d() : 0;
            if ((this.f2120a || this.f2125f.f3283C) && d == 0) {
                cAVar.m2094a(this.f2125f.f3289I);
            }
        }
    }

    public final void m2019a(dB dBVar) {
        if (this.f2124e != null) {
            this.f2123d = this.f2124e.m1127b(true);
        } else if (dBVar != null) {
            this.f2123d = dBVar.m1127b(true);
        } else {
            this.f2123d = new cA(180, new int[]{-16776961, -1}, new float[]{0.0f, 1.0f});
        }
        if (this.f2121b != null) {
            this.f2121b.m2023a(dBVar);
            this.f2121b.setBackgroundDrawable(this.f2123d);
            return;
        }
        this.f2122c.setBackgroundDrawable(this.f2123d);
    }

    public final void m2020b() {
        if (this.f2123d != null && (this.f2123d instanceof cA)) {
            cA cAVar = (cA) this.f2123d;
            int d = this.f2125f.f3297g != null ? this.f2125f.f3297g.m1134d() : 0;
            if ((this.f2120a || this.f2125f.f3283C) && d == 0) {
                cAVar.m2099a(new float[]{this.f2125f.f3289I, this.f2125f.f3289I, this.f2125f.f3289I, this.f2125f.f3289I, 0.0f, 0.0f, 0.0f, 0.0f});
            }
        }
    }

    public final Drawable m2021c() {
        return this.f2123d;
    }

    public final void m2022d() {
        if (this.f2121b != null) {
            this.f2121b.setBackgroundDrawable(null);
        } else if (this.f2122c != null) {
            this.f2122c.setBackgroundDrawable(null);
        }
        this.f2121b = null;
        this.f2122c = null;
    }
}
