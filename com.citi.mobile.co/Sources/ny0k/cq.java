package ny0k;

import android.graphics.Bitmap;
import java.io.Serializable;

public final class cq implements Serializable {
    private static int f2304c;
    private static int f2305d;
    private byte[] f2306a;
    private Bitmap f2307b;
    private int f2308e;

    static {
        f2304c = 1;
        f2305d = 2;
    }

    public cq(Bitmap bitmap) {
        this.f2308e = f2304c;
        this.f2307b = bitmap;
        this.f2306a = null;
        this.f2308e = f2305d;
    }

    public cq(byte[] bArr) {
        this.f2308e = f2304c;
        this.f2306a = bArr;
        this.f2307b = null;
        this.f2308e = f2304c;
    }

    public final Object m2197a() {
        return this.f2308e == f2304c ? this.f2306a : this.f2307b;
    }

    public final void m2198b() {
        if (this.f2308e == f2304c) {
            this.f2306a = null;
        } else if (this.f2307b != null) {
            this.f2307b.recycle();
            this.f2307b = null;
        }
    }
}
