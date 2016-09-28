package ny0k;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

/* renamed from: ny0k.J */
public abstract class C0277J {
    private static C0277J f1898a;

    public static C0277J m1795a() {
        if (f1898a == null) {
            if (Integer.parseInt(VERSION.SDK) >= 5) {
                f1898a = new C0422H();
            } else {
                f1898a = new C0421G();
            }
        }
        return f1898a;
    }

    public abstract Bitmap m1796a(Uri uri);

    public abstract String m1797a(Hashtable hashtable);

    public abstract ArrayList m1798a(String str);

    public abstract void m1799a(ContentResolver contentResolver);

    public abstract void m1800a(Context context);

    public abstract HashMap m1801b(String str);

    public abstract boolean m1802b(Hashtable hashtable);
}
