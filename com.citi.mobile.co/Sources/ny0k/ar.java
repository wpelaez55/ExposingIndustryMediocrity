package ny0k;

import com.konylabs.vmintf.KonyJSVM;

final class ar implements Runnable {
    private /* synthetic */ al f2103a;

    ar(al alVar) {
        this.f2103a = alVar;
    }

    public final void run() {
        KonyJSVM.disposePersistent(this.f2103a.ap);
        this.f2103a.ap = 0;
    }
}
