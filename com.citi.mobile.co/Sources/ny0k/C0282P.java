package ny0k;

import com.konylabs.vm.Function;

/* renamed from: ny0k.P */
final class C0282P implements Runnable {
    private /* synthetic */ String f1905a;
    private /* synthetic */ Function f1906b;
    private /* synthetic */ Function f1907c;

    C0282P(String str, Function function, Function function2) {
        this.f1905a = str;
        this.f1906b = function;
        this.f1907c = function2;
    }

    public final void run() {
        if (C0281O.m1821d(this.f1905a)) {
            C0281O.m1809a(this.f1905a, this.f1906b);
            return;
        }
        C0423M c0423m = (C0423M) C0281O.f1903a.get(this.f1905a);
        if (c0423m != null) {
            C0281O.m1817b(c0423m, new C0280N(this.f1906b, this.f1907c));
        } else {
            C0281O.m1810a(this.f1905a, this.f1907c, 1250, "Invalid module name specified");
        }
    }
}
