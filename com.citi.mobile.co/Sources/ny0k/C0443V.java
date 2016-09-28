package ny0k;

import com.konylabs.js.api.KonyJSObject;
import com.konylabs.vmintf.KonyJSVM;
import java.io.File;

/* renamed from: ny0k.V */
public final class C0443V extends KonyJSObject {
    private File[] f3584a;

    public C0443V(File[] fileArr, long j) {
        this.f3584a = fileArr;
        this.ap = j;
    }

    public final C0442U m4008a(int i) {
        if (i < 0 || i >= this.f3584a.length) {
            return null;
        }
        return (C0442U) KonyJSVM.createJSObject("kony.io.File", new Object[]{this.f3584a[i]});
    }

    public final Object getTable(Object obj) {
        if (((String) obj).intern() != "length") {
            return null;
        }
        return Integer.valueOf(this.f3584a != null ? this.f3584a.length : 0);
    }
}
