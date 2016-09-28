package ny0k;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.KonyJSException;
import com.konylabs.vmintf.C0254b;
import com.konylabs.vmintf.C0261i;

/* renamed from: ny0k.M */
final class C0423M implements C0261i {
    private static C0254b f3202a;
    private String f3203b;
    private boolean f3204c;
    private String f3205d;
    private String[] f3206e;
    private String[] f3207f;
    private String[] f3208g;
    private boolean f3209h;
    private C0280N f3210i;

    static {
        f3202a = KonyMain.m4143x();
    }

    public C0423M(String str, boolean z, String str2) {
        this.f3203b = str;
        this.f3204c = z;
        this.f3205d = str2;
    }

    public final String m3471a() {
        return this.f3203b;
    }

    public final void m3472a(String str, int i, KonyJSException konyJSException) {
        boolean z = true;
        C0280N c0280n = this.f3210i;
        if (i != 0) {
            z = false;
        }
        if (z && this.f3205d != null) {
            Function a = f3202a.m1771a(this.f3205d);
            if (a != null) {
                try {
                    a.execute(null);
                } catch (Exception e) {
                    if (KonyMain.f3657e) {
                        Log.d("KonyFunctionalModules", "Failed to execute module initializer function: " + e);
                    }
                    z = false;
                }
            } else {
                z = false;
            }
        }
        if (z) {
            if (KonyMain.f3657e) {
                Log.d("KonyFunctionalModules", "Loading module " + this.f3203b + " success!");
            }
            if (c0280n != null) {
                c0280n.m1806a(this.f3203b);
            }
        } else {
            if (KonyMain.f3657e) {
                Log.d("KonyFunctionalModules", "Failed to load module " + this.f3203b + " " + str);
            }
            if (c0280n != null) {
                c0280n.m1807a(this.f3203b, 1251, "Unable to load module");
            }
        }
        this.f3209h = z;
    }

    public final void m3473a(String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (!str.endsWith(".js")) {
                strArr[i] = str + ".js";
            }
        }
        this.f3206e = strArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean m3474a(ny0k.C0280N r9) {
        /*
        r8 = this;
        r2 = 0;
        monitor-enter(r8);
        r0 = 1;
        r1 = r8.f3208g;	 Catch:{ all -> 0x0092 }
        if (r1 == 0) goto L_0x006f;
    L_0x0007:
        r1 = r8.f3208g;	 Catch:{ all -> 0x0092 }
        r1 = r1.length;	 Catch:{ all -> 0x0092 }
        r4 = r1;
    L_0x000b:
        r1 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ all -> 0x0092 }
        if (r1 == 0) goto L_0x0031;
    L_0x000f:
        if (r4 != 0) goto L_0x0071;
    L_0x0011:
        r1 = "KonyFunctionalModules";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0092 }
        r3.<init>();	 Catch:{ all -> 0x0092 }
        r5 = "No dependent modules of current module '";
        r3 = r3.append(r5);	 Catch:{ all -> 0x0092 }
        r5 = r8.f3203b;	 Catch:{ all -> 0x0092 }
        r3 = r3.append(r5);	 Catch:{ all -> 0x0092 }
        r5 = "' found!";
        r3 = r3.append(r5);	 Catch:{ all -> 0x0092 }
        r3 = r3.toString();	 Catch:{ all -> 0x0092 }
        android.util.Log.d(r1, r3);	 Catch:{ all -> 0x0092 }
    L_0x0031:
        r1 = r2;
    L_0x0032:
        if (r1 >= r4) goto L_0x00be;
    L_0x0034:
        r0 = r8.f3208g;	 Catch:{ all -> 0x0092 }
        r0 = r0[r1];	 Catch:{ all -> 0x0092 }
        r3 = ny0k.C0281O.m1816b(r0);	 Catch:{ all -> 0x0092 }
        r0 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ all -> 0x0092 }
        if (r0 == 0) goto L_0x006a;
    L_0x0040:
        if (r3 == 0) goto L_0x0095;
    L_0x0042:
        r0 = "KonyFunctionalModules";
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0092 }
        r5.<init>();	 Catch:{ all -> 0x0092 }
        r6 = "Successfully loaded dependent module '";
        r5 = r5.append(r6);	 Catch:{ all -> 0x0092 }
        r6 = r8.f3208g;	 Catch:{ all -> 0x0092 }
        r6 = r6[r1];	 Catch:{ all -> 0x0092 }
        r5 = r5.append(r6);	 Catch:{ all -> 0x0092 }
        r6 = "' of current module '";
        r5 = r5.append(r6);	 Catch:{ all -> 0x0092 }
        r6 = r8.f3203b;	 Catch:{ all -> 0x0092 }
        r5 = r5.append(r6);	 Catch:{ all -> 0x0092 }
        r5 = r5.toString();	 Catch:{ all -> 0x0092 }
        android.util.Log.d(r0, r5);	 Catch:{ all -> 0x0092 }
    L_0x006a:
        r0 = r1 + 1;
        r1 = r0;
        r0 = r3;
        goto L_0x0032;
    L_0x006f:
        r4 = r2;
        goto L_0x000b;
    L_0x0071:
        r1 = "KonyFunctionalModules";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0092 }
        r3.<init>();	 Catch:{ all -> 0x0092 }
        r5 = "Loading depending modules of current module '";
        r3 = r3.append(r5);	 Catch:{ all -> 0x0092 }
        r5 = r8.f3203b;	 Catch:{ all -> 0x0092 }
        r3 = r3.append(r5);	 Catch:{ all -> 0x0092 }
        r5 = "'";
        r3 = r3.append(r5);	 Catch:{ all -> 0x0092 }
        r3 = r3.toString();	 Catch:{ all -> 0x0092 }
        android.util.Log.d(r1, r3);	 Catch:{ all -> 0x0092 }
        goto L_0x0031;
    L_0x0092:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
    L_0x0095:
        r0 = "KonyFunctionalModules";
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0092 }
        r5.<init>();	 Catch:{ all -> 0x0092 }
        r6 = "Failed to load dependent module '";
        r5 = r5.append(r6);	 Catch:{ all -> 0x0092 }
        r6 = r8.f3208g;	 Catch:{ all -> 0x0092 }
        r6 = r6[r1];	 Catch:{ all -> 0x0092 }
        r5 = r5.append(r6);	 Catch:{ all -> 0x0092 }
        r6 = "' of current module '";
        r5 = r5.append(r6);	 Catch:{ all -> 0x0092 }
        r6 = r8.f3203b;	 Catch:{ all -> 0x0092 }
        r5 = r5.append(r6);	 Catch:{ all -> 0x0092 }
        r5 = r5.toString();	 Catch:{ all -> 0x0092 }
        android.util.Log.d(r0, r5);	 Catch:{ all -> 0x0092 }
        goto L_0x006a;
    L_0x00be:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0092 }
        r1.<init>();	 Catch:{ all -> 0x0092 }
        r3 = r8.f3203b;	 Catch:{ all -> 0x0092 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0092 }
        r3 = ".kfm";
        r1 = r1.append(r3);	 Catch:{ all -> 0x0092 }
        r1 = r1.toString();	 Catch:{ all -> 0x0092 }
        if (r0 == 0) goto L_0x0142;
    L_0x00d5:
        r0 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ all -> 0x0092 }
        if (r0 == 0) goto L_0x00f7;
    L_0x00d9:
        r0 = "KonyFunctionalModules";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0092 }
        r3.<init>();	 Catch:{ all -> 0x0092 }
        r4 = "Loading module ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x0092 }
        r3 = r3.append(r1);	 Catch:{ all -> 0x0092 }
        r4 = "...";
        r3 = r3.append(r4);	 Catch:{ all -> 0x0092 }
        r3 = r3.toString();	 Catch:{ all -> 0x0092 }
        android.util.Log.d(r0, r3);	 Catch:{ all -> 0x0092 }
    L_0x00f7:
        r8.f3210i = r9;	 Catch:{ all -> 0x0092 }
        r0 = 0;
        r3 = com.konylabs.android.KonyMain.m4059E();	 Catch:{ all -> 0x0092 }
        r4 = 3;
        if (r3 != r4) goto L_0x014e;
    L_0x0101:
        r0 = "src.zip";
        r1 = r8.f3206e;	 Catch:{ all -> 0x0092 }
        if (r1 == 0) goto L_0x013e;
    L_0x0107:
        r1 = r8.f3206e;	 Catch:{ all -> 0x0092 }
        r1 = r1.length;	 Catch:{ all -> 0x0092 }
        r3 = r1;
    L_0x010b:
        r1 = r8.f3207f;	 Catch:{ all -> 0x0092 }
        if (r1 == 0) goto L_0x0140;
    L_0x010f:
        r1 = r8.f3207f;	 Catch:{ all -> 0x0092 }
        r1 = r1.length;	 Catch:{ all -> 0x0092 }
    L_0x0112:
        r1 = r1 + r3;
        r1 = new java.lang.String[r1];	 Catch:{ all -> 0x0092 }
        r3 = r8.f3207f;	 Catch:{ all -> 0x0092 }
        if (r3 == 0) goto L_0x0123;
    L_0x0119:
        r3 = r8.f3207f;	 Catch:{ all -> 0x0092 }
        r4 = 0;
        r5 = 0;
        r6 = r8.f3207f;	 Catch:{ all -> 0x0092 }
        r6 = r6.length;	 Catch:{ all -> 0x0092 }
        java.lang.System.arraycopy(r3, r4, r1, r5, r6);	 Catch:{ all -> 0x0092 }
    L_0x0123:
        r3 = r8.f3206e;	 Catch:{ all -> 0x0092 }
        if (r3 == 0) goto L_0x0137;
    L_0x0127:
        r3 = r8.f3206e;	 Catch:{ all -> 0x0092 }
        r4 = 0;
        r5 = r8.f3207f;	 Catch:{ all -> 0x0092 }
        if (r5 == 0) goto L_0x0131;
    L_0x012e:
        r2 = r8.f3207f;	 Catch:{ all -> 0x0092 }
        r2 = r2.length;	 Catch:{ all -> 0x0092 }
    L_0x0131:
        r5 = r8.f3206e;	 Catch:{ all -> 0x0092 }
        r5 = r5.length;	 Catch:{ all -> 0x0092 }
        java.lang.System.arraycopy(r3, r4, r1, r2, r5);	 Catch:{ all -> 0x0092 }
    L_0x0137:
        com.konylabs.vmintf.KonyJavaScriptVM.m3387a(r0, r1, r8);	 Catch:{ all -> 0x0092 }
        r0 = r8.f3209h;	 Catch:{ all -> 0x0092 }
    L_0x013c:
        monitor-exit(r8);
        return r0;
    L_0x013e:
        r3 = r2;
        goto L_0x010b;
    L_0x0140:
        r1 = r2;
        goto L_0x0112;
    L_0x0142:
        if (r9 == 0) goto L_0x013c;
    L_0x0144:
        r1 = r8.f3203b;	 Catch:{ all -> 0x0092 }
        r2 = 1251; // 0x4e3 float:1.753E-42 double:6.18E-321;
        r3 = "Unable to load module";
        r9.m1807a(r1, r2, r3);	 Catch:{ all -> 0x0092 }
        goto L_0x013c;
    L_0x014e:
        r7 = r1;
        r1 = r0;
        r0 = r7;
        goto L_0x0137;
        */
        throw new UnsupportedOperationException("Method not decompiled: ny0k.M.a(ny0k.N):boolean");
    }

    public final void m3475b(String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (!str.endsWith(".js")) {
                strArr[i] = str + ".js";
            }
        }
        this.f3207f = strArr;
    }

    public final boolean m3476b() {
        return this.f3204c;
    }

    public final void m3477c(String[] strArr) {
        this.f3208g = strArr;
    }
}
