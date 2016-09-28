package ny0k;

final class ao implements Runnable {
    private /* synthetic */ al f2100a;

    ao(al alVar) {
        this.f2100a = alVar;
    }

    public final void run() {
        if (this.f2100a.f3619s != null) {
            this.f2100a.f3619s.abort();
        }
    }
}
