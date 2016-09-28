package ny0k;

import com.konylabs.vmintf.KonyJSVM;

final class aq implements Runnable {
    private /* synthetic */ al f2102a;

    aq(al alVar) {
        this.f2102a = alVar;
    }

    public final void run() {
        KonyJSVM.disposePersistent(this.f2102a.ap);
        this.f2102a.ap = 0;
    }
}
