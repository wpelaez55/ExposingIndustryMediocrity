package ny0k;

import com.konylabs.vmintf.KonyJSVM;

final class cU implements Runnable {
    private /* synthetic */ cQ f2270a;

    cU(cQ cQVar) {
        this.f2270a = cQVar;
    }

    public final void run() {
        KonyJSVM.disposePersistent(this.f2270a.ap);
        this.f2270a.ap = 0;
    }
}
