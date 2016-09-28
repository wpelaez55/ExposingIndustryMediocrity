package ny0k;

final class aB implements Runnable {
    private /* synthetic */ az f1968a;

    aB(az azVar) {
        this.f1968a = azVar;
    }

    public final void run() {
        if (this.f1968a.f3264a != null) {
            this.f1968a.f3264a.abort();
        }
    }
}
