package ny0k;

import com.konylabs.vmintf.KonyJSVM;

final class ap implements Runnable {
    private /* synthetic */ al f2101a;

    ap(al alVar) {
        this.f2101a = alVar;
    }

    public final void run() {
        KonyJSVM.disposePersistent(this.f2101a.ap);
        this.f2101a.ap = 0;
    }
}
