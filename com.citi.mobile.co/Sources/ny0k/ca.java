package ny0k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import com.konylabs.api.ui.dB;

final class ca extends bk {
    private bq f3471b;
    private /* synthetic */ bY f3472c;

    public ca(bY bYVar) {
        this.f3472c = bYVar;
        super(bYVar, bYVar.a);
        this.f3471b = bYVar.ar;
    }

    protected final View m3870a(bJ bJVar) {
        return this.f3472c.m4950a(bJVar);
    }

    protected final void m3871a(int i, int i2, int i3, boolean z) {
        if (this.f3471b != null) {
            this.f3471b.m3715a(i, i2, i3, z);
        }
    }

    protected final View m3872b(bJ bJVar) {
        return this.f3472c.m4954b(bJVar);
    }

    public final dB m3873c() {
        return this.f3471b != null ? this.f3471b.m3774v() : null;
    }

    public final dB m3874d() {
        return this.f3471b != null ? this.f3471b.m3775w() : null;
    }

    public final dB m3875e() {
        return this.f3471b != null ? this.f3471b.m3776x() : null;
    }

    public final dB m3876f() {
        return this.f3471b != null ? this.f3471b.m3778z() : null;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view == null) {
            view2.setLayoutParams(new LayoutParams(-1, -2));
        }
        return view2;
    }
}
