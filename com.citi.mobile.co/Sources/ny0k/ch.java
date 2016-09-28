package ny0k;

import com.konylabs.api.ui.eO;
import java.util.Vector;

public class ch {
    final /* synthetic */ bO f2276a;

    ch(bO bOVar) {
        this.f2276a = bOVar;
    }

    protected void m2164a(Object obj, Object obj2) {
        int[] f = this.f2276a.m4826f(this.f2276a.ar.m2072p());
        if (f != null) {
            this.f2276a.ae = f[0];
            this.f2276a.ad = f[1];
            Vector vector = ((bT) this.f2276a.f4551Y.get(this.f2276a.ad)).f2147g;
            if (this.f2276a.ae < vector.size()) {
                ((bS) vector.get(this.f2276a.ae)).f2141d.setTable(obj, obj2);
            }
        }
    }

    public void m2165a(cl clVar) {
        this.f2276a.ar.m2055b(((eO) clVar.f2286a).getWidget());
        m2164a(clVar.f2287b, clVar.f2288c);
    }
}
