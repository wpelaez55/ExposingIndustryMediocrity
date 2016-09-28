package ny0k;

import com.konylabs.vm.Function;

final class am implements Runnable {
    private /* synthetic */ Object f2098a;
    private /* synthetic */ al f2099b;

    am(al alVar, Object obj) {
        this.f2099b = alVar;
        this.f2098a = obj;
    }

    public final void run() {
        try {
            ((Function) this.f2098a).execute(new Object[]{this.f2099b});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
