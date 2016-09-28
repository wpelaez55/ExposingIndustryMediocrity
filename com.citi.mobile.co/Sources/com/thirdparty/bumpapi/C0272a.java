package com.thirdparty.bumpapi;

/* renamed from: com.thirdparty.bumpapi.a */
public final class C0272a {
    private static C0272a f1891c;
    private BumpInterface f1892a;
    private C0273b f1893b;

    static {
        f1891c = null;
    }

    private C0272a(BumpInterface bumpInterface) {
        this.f1892a = bumpInterface;
    }

    public static synchronized C0272a m1786a(BumpInterface bumpInterface) {
        C0272a c0272a;
        synchronized (C0272a.class) {
            if (f1891c == null) {
                f1891c = new C0272a(bumpInterface);
            }
            c0272a = f1891c;
        }
        return c0272a;
    }

    public final void m1787a() {
        this.f1892a.disconnect();
    }

    public final void m1788a(int i, String str) {
        if (this.f1893b != null) {
            this.f1893b.m1793a(i, str);
        }
    }

    public final void m1789a(C0273b c0273b) {
        this.f1893b = c0273b;
    }

    public final void m1790a(String str, String str2, String str3) {
        this.f1892a.start(str, str2, str3);
    }

    public final void m1791a(byte[] bArr) {
        this.f1892a.sendBumpData(bArr);
    }

    public final void m1792b(byte[] bArr) {
        if (this.f1893b != null) {
            this.f1893b.m1794a(bArr);
        }
    }
}
