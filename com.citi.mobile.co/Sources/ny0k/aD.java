package ny0k;

import com.rsa.mobilesdk.sdk.MobileAPI;
import java.util.HashMap;

public abstract class aD implements Runnable {
    private int f1969a;
    private String f1970b;
    private int f1971c;
    private HashMap f1972d;

    protected abstract aD m1860a();

    protected abstract void m1861a(int i);

    final void m1862a(int i, String str, int i2, HashMap hashMap) {
        this.f1969a = i;
        this.f1970b = str;
        this.f1971c = i2;
        this.f1972d = hashMap;
    }

    protected abstract void m1863a(int i, String str, HashMap hashMap);

    protected abstract void m1864a(String str, HashMap hashMap);

    protected /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m1860a();
    }

    public void run() {
        switch (this.f1969a) {
            case MobileAPI.MAX_ACCURACY_DEFAULT_VALUE /*100*/:
            case 200:
            case 300:
                m1861a(this.f1969a);
            case 400:
                m1864a(this.f1970b, this.f1972d);
            case 500:
                m1863a(this.f1971c, this.f1970b, this.f1972d);
            default:
        }
    }
}
