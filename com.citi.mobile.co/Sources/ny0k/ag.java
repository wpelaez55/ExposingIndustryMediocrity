package ny0k;

import android.content.Context;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

public final class ag {
    private static File f2087a;
    private static ae f2088b;

    static af m1977a(String str) {
        af b = f2088b.m1976b(str);
        if (b == null) {
            return null;
        }
        if (KonyMain.f3657e) {
            Log.d("ETagCachemanager", "cache file for url " + str + " hash " + b.f2080a);
        }
        b.f2084e = new File(f2087a, b.f2080a);
        try {
            b.f2085f = new FileInputStream(b.f2084e);
            return b;
        } catch (FileNotFoundException e) {
            if (KonyMain.f3657e) {
                Log.d("ETagCachemanager", BuildConfig.FLAVOR + e.getMessage());
            }
            f2088b.m1974a(str);
            return null;
        }
    }

    static af m1978a(String str, HttpResponse httpResponse) {
        if (str == null) {
            return null;
        }
        if (httpResponse.getStatusLine().getStatusCode() == 303) {
            f2088b.m1974a(str);
            return null;
        }
        String str2 = null;
        String str3 = null;
        for (Header header : httpResponse.getAllHeaders()) {
            if (header.getName().equals("ETag")) {
                str3 = header.getValue();
            } else if (header.getName().equals("Last-Modified")) {
                str2 = header.getValue();
            }
        }
        if (str3 == null || str3.length() == 0) {
            f2088b.m1974a(str);
            return null;
        }
        ae aeVar = f2088b;
        aeVar.getClass();
        af afVar = new af(aeVar);
        afVar.f2083d = str;
        afVar.f2082c = str2;
        afVar.f2081b = str3;
        return afVar;
    }

    static af m1979a(af afVar) {
        if (afVar == null) {
            return null;
        }
        afVar.f2080a = new StringBuffer().append("kl").append(afVar.f2083d.toLowerCase().trim().hashCode()).toString();
        if (KonyMain.f3657e) {
            Log.d("ETagCachemanager", "Filename for url " + afVar.f2083d + " file = " + afVar.f2080a);
        }
        afVar.f2084e = new File(f2087a, afVar.f2080a);
        try {
            afVar.f2086g = new FileOutputStream(afVar.f2084e);
            return afVar;
        } catch (FileNotFoundException e) {
            if (KonyMain.f3657e) {
                Log.d("ETagCachemanager", BuildConfig.FLAVOR + e.getMessage());
            }
            return null;
        }
    }

    static void m1980a(Context context) {
        f2088b = ae.m1973a(context);
        f2087a = context.getCacheDir();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m1981a(ny0k.af r6, java.io.InputStream r7) {
        /*
        r1 = new java.io.BufferedInputStream;
        r1.<init>(r7);
        r2 = new java.io.BufferedOutputStream;
        r0 = r6.f2086g;
        r2.<init>(r0);
        r0 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0 = new byte[r0];
    L_0x0010:
        r3 = r1.read(r0);	 Catch:{ IOException -> 0x001c }
        r4 = -1;
        if (r3 == r4) goto L_0x0047;
    L_0x0017:
        r4 = 0;
        r2.write(r0, r4, r3);	 Catch:{ IOException -> 0x001c }
        goto L_0x0010;
    L_0x001c:
        r0 = move-exception;
        r3 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ all -> 0x005e }
        if (r3 == 0) goto L_0x003d;
    L_0x0021:
        r3 = "ETagCachemanager";
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005e }
        r4.<init>();	 Catch:{ all -> 0x005e }
        r5 = "";
        r4 = r4.append(r5);	 Catch:{ all -> 0x005e }
        r0 = r0.getMessage();	 Catch:{ all -> 0x005e }
        r0 = r4.append(r0);	 Catch:{ all -> 0x005e }
        r0 = r0.toString();	 Catch:{ all -> 0x005e }
        android.util.Log.d(r3, r0);	 Catch:{ all -> 0x005e }
    L_0x003d:
        r2.close();	 Catch:{ IOException -> 0x0059 }
        r1.close();	 Catch:{ IOException -> 0x0059 }
        r7.close();	 Catch:{ IOException -> 0x0059 }
    L_0x0046:
        return;
    L_0x0047:
        r2.flush();	 Catch:{ IOException -> 0x001c }
        r2.close();	 Catch:{ IOException -> 0x0054 }
        r1.close();	 Catch:{ IOException -> 0x0054 }
        r7.close();	 Catch:{ IOException -> 0x0054 }
        goto L_0x0046;
    L_0x0054:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0046;
    L_0x0059:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0046;
    L_0x005e:
        r0 = move-exception;
        r2.close();	 Catch:{ IOException -> 0x0069 }
        r1.close();	 Catch:{ IOException -> 0x0069 }
        r7.close();	 Catch:{ IOException -> 0x0069 }
    L_0x0068:
        throw r0;
    L_0x0069:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x0068;
        */
        throw new UnsupportedOperationException("Method not decompiled: ny0k.ag.a(ny0k.af, java.io.InputStream):void");
    }

    static void m1982b(af afVar) {
        try {
            if (afVar.f2086g != null) {
                afVar.f2086g.close();
            }
            if (afVar.f2084e.exists()) {
                f2088b.m1975a(afVar);
                afVar.f2084e = new File(f2087a, afVar.f2080a);
                try {
                    afVar.f2085f = new FileInputStream(afVar.f2084e);
                } catch (FileNotFoundException e) {
                    if (KonyMain.f3658f) {
                        Log.w("ETagCachemanager", "Unable to open inputstream on just saved file");
                    }
                }
            }
        } catch (IOException e2) {
            if (KonyMain.f3657e) {
                Log.d("ETagCachemanager", BuildConfig.FLAVOR + e2.getMessage());
            }
        }
    }

    static void m1983c(af afVar) {
        if (afVar.f2084e.exists()) {
            f2088b.m1975a(afVar);
        }
    }
}
