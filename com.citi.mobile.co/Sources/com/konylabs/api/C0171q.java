package com.konylabs.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.C0252r;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Random;

/* renamed from: com.konylabs.api.q */
public class C0171q {
    private int f160a;
    private String f161b;

    C0171q() {
    }

    public C0171q(String str) {
        this.f160a = 0;
        this.f161b = str;
        m98d();
    }

    public static void m87a(Object[] objArr) {
        C0171q.m96b(objArr);
        C0171q.m88a(objArr, 0, objArr.length - 1);
    }

    public static void m88a(Object[] objArr, int i, int i2) {
        while (i2 > i) {
            int i3 = i - 1;
            int i4 = i2;
            while (true) {
                i3++;
                if (!C0171q.m93a(objArr[i3], objArr[i2])) {
                    do {
                        i4--;
                        if (!C0171q.m93a(objArr[i2], objArr[i4])) {
                            break;
                        }
                    } while (i4 != i);
                    if (i3 >= i4) {
                        break;
                    }
                    C0171q.m97b(objArr, i3, i4);
                }
            }
            C0171q.m97b(objArr, i3, i2);
            C0171q.m88a(objArr, i, i3 - 1);
            i = i3 + 1;
        }
    }

    public static void m89a(Object[] objArr, int i, int i2, String str) {
        int i3 = i2;
        while (i3 > i) {
            int i4 = i - 1;
            int i5 = i3;
            while (true) {
                i4++;
                if (!C0171q.m94a(objArr[i4], objArr[i3], str)) {
                    do {
                        i5--;
                        if (!C0171q.m94a(objArr[i3], objArr[i5], str)) {
                            break;
                        }
                    } while (i5 != i);
                    if (i4 >= i5) {
                        break;
                    }
                    C0171q.m97b(objArr, i4, i5);
                }
            }
            C0171q.m97b(objArr, i4, i3);
            C0171q.m89a(objArr, i, i4 - 1, str);
            i = i4 + 1;
        }
    }

    public static void m90a(Object[] objArr, Function function) {
        C0171q.m96b(objArr);
        C0171q.m91a(objArr, function, 0, objArr.length - 1);
    }

    public static void m91a(Object[] objArr, Function function, int i, int i2) {
        while (i2 > i) {
            int b = C0171q.m95b(objArr, function, i, i2);
            C0171q.m91a(objArr, function, i, b - 1);
            i = b + 1;
        }
    }

    public static void m92a(Object[] objArr, String str) {
        C0171q.m89a(objArr, 0, objArr.length - 1, str);
    }

    private static boolean m93a(Object obj, Object obj2) {
        return obj instanceof Double ? ((Double) obj).doubleValue() < ((Double) obj2).doubleValue() : (obj instanceof String) && ((String) obj).compareTo((String) obj2) < 0;
    }

    private static boolean m94a(Object obj, Object obj2, String str) {
        boolean z = true;
        if (!(obj instanceof Double) || !(obj2 instanceof Double)) {
            return (obj instanceof LuaTable) && (obj2 instanceof LuaTable) && ((LuaTable) obj).getTable(str).toString().compareTo(((LuaTable) obj2).getTable(str).toString()) < 0;
        } else {
            if (((Double) obj).doubleValue() >= ((Double) obj2).doubleValue()) {
                z = false;
            }
            return z;
        }
    }

    private static int m95b(Object[] objArr, Function function, int i, int i2) {
        int i3 = i - 1;
        int i4 = i2;
        while (true) {
            boolean z = true;
            while (z) {
                try {
                    r2 = new Object[2];
                    i3++;
                    r2[0] = objArr[i3];
                    r2[1] = objArr[i2];
                    z = C0252r.m1767a(function.execute(r2)[0]);
                } catch (Exception e) {
                    if (KonyMain.f3657e) {
                        Log.d("QuickSort", BuildConfig.FLAVOR + e.getMessage());
                    }
                }
            }
            z = true;
            while (z) {
                r2 = new Object[2];
                r2[0] = objArr[i2];
                i4--;
                r2[1] = objArr[i4];
                z = C0252r.m1767a(function.execute(r2)[0]);
                if (i4 == i) {
                    break;
                }
            }
            if (i3 >= i4) {
                break;
            }
            C0171q.m97b(objArr, i3, i4);
        }
        C0171q.m97b(objArr, i3, i2);
        return i3;
    }

    private static void m96b(Object[] objArr) {
        Random random = new Random();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            C0171q.m97b(objArr, i, random.nextInt(length - 1));
        }
    }

    private static void m97b(Object[] objArr, int i, int i2) {
        Object obj = objArr[i];
        objArr[i] = objArr[i2];
        objArr[i2] = obj;
    }

    private void m98d() {
        StringBuffer stringBuffer = new StringBuffer();
        char c = ' ';
        int i = 0;
        while (m101b()) {
            char charAt = this.f161b.charAt(this.f160a);
            int i2 = (charAt != '\"' || c == '\\') ? i : i != 0 ? 0 : 1;
            if (charAt != ' ') {
                stringBuffer.append(charAt);
            } else if (charAt == ' ' && i2 != 0) {
                stringBuffer.append(charAt);
            }
            this.f160a++;
            i = i2;
            c = charAt;
        }
        this.f161b = stringBuffer.toString();
        this.f160a = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String m99a(java.lang.String r7) {
        /*
        r6 = this;
        r1 = 0;
        r0 = 32;
        r4 = new java.lang.StringBuffer;
        r4.<init>();
        r2 = r0;
        r0 = r1;
    L_0x000a:
        r3 = r6.m102c();
        r5 = 34;
        if (r3 != r5) goto L_0x0019;
    L_0x0012:
        r5 = 92;
        if (r2 == r5) goto L_0x0019;
    L_0x0016:
        if (r0 == 0) goto L_0x0039;
    L_0x0018:
        r0 = r1;
    L_0x0019:
        if (r0 != 0) goto L_0x003b;
    L_0x001b:
        r2 = r7.indexOf(r3);
        if (r2 >= 0) goto L_0x002b;
    L_0x0021:
        if (r3 == 0) goto L_0x002b;
    L_0x0023:
        r2 = 10;
        if (r3 == r2) goto L_0x002b;
    L_0x0027:
        r2 = 13;
        if (r3 != r2) goto L_0x003b;
    L_0x002b:
        if (r3 == 0) goto L_0x0030;
    L_0x002d:
        r6.m100a();
    L_0x0030:
        r0 = r4.toString();
        r0 = r0.trim();
        return r0;
    L_0x0039:
        r0 = 1;
        goto L_0x0019;
    L_0x003b:
        r4.append(r3);
        r2 = r3;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.q.a(java.lang.String):java.lang.String");
    }

    public final void m100a() {
        if (this.f160a > 0) {
            this.f160a--;
        }
    }

    public final boolean m101b() {
        return this.f160a < this.f161b.length();
    }

    public final char m102c() {
        if (!m101b()) {
            return '\u0000';
        }
        char charAt = this.f161b.charAt(this.f160a);
        this.f160a++;
        return charAt;
    }
}
