package ny0k;

import android.view.View;

public class bu {
    final /* synthetic */ bY f2209a;

    bu(bY bYVar) {
        this.f2209a = bYVar;
    }

    public View m2091a(int i) {
        if (i < 0 || i > this.f2209a.b.size() - 1) {
            return null;
        }
        bH bHVar = (bH) this.f2209a.b.get(((bH) this.f2209a.b.get(i)).f2133b);
        if (!(bHVar.f2132a instanceof bJ)) {
            return null;
        }
        bJ bJVar = (bJ) bHVar.f2132a;
        return bJVar.f3320b == 0 ? this.f2209a.m4950a(bJVar) : this.f2209a.m4954b(bJVar);
    }
}
