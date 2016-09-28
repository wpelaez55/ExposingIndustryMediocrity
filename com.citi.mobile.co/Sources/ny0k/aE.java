package ny0k;

import java.util.HashMap;

public final class aE extends Exception {
    private int f1973a;
    private String f1974b;
    private HashMap f1975c;

    public aE(int i, String str) {
        this.f1973a = i;
        this.f1974b = str;
    }

    public final int m1865a() {
        return this.f1973a;
    }

    public final void m1866a(HashMap hashMap) {
        this.f1975c = hashMap;
    }

    public final String m1867b() {
        return this.f1974b;
    }

    public final HashMap m1868c() {
        return this.f1975c;
    }
}
