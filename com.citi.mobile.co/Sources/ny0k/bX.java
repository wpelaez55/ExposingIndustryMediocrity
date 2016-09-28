package ny0k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.api.ui.dB;

final class bX extends bk {
    private bo f3327b;
    private /* synthetic */ bV f3328c;

    public bX(bV bVVar) {
        this.f3328c = bVVar;
        super(bVVar, bVVar.a);
        this.f3327b = bVVar.ak;
    }

    protected final View m3647a(bJ bJVar) {
        return null;
    }

    protected final void m3648a(int i, int i2, int i3, boolean z) {
        if (this.f3327b != null) {
            this.f3327b.m3666a(i, i2, i3);
        }
    }

    protected final View m3649b(bJ bJVar) {
        return null;
    }

    public final dB m3650c() {
        return this.f3327b != null ? this.f3327b.m3682d() : null;
    }

    public final dB m3651d() {
        return this.f3327b != null ? this.f3327b.m3685e() : null;
    }

    public final dB m3652e() {
        return this.f3327b != null ? this.f3327b.m3687f() : null;
    }

    public final dB m3653f() {
        return this.f3327b != null ? this.f3327b.m3690g() : null;
    }

    public final int getCount() {
        return this.f3328c.b != null ? this.f3328c.ab ? this.f3328c.b.size() - this.f3328c.Y.size() : this.f3328c.b.size() : 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f3328c.ab) {
            i = this.f3328c.c.m2169a(i, this.f3328c.ab);
        }
        View view2 = super.getView(i, view, viewGroup);
        if (view == null) {
            view2.setLayoutParams(new LayoutParams(this.f3328c.am, -1));
        }
        return view2;
    }
}
