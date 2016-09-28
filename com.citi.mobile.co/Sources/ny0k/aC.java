package ny0k;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.C0245j;
import java.util.HashMap;

public final class aC extends Thread implements aT {
    private az f3223a;
    private C0245j f3224b;
    private aD f3225c;
    private aw f3226d;
    private String f3227e;

    aC(az azVar, C0245j c0245j, aD aDVar) {
        this.f3227e = "ServiceInvokerAsync";
        this.f3223a = azVar;
        this.f3224b = c0245j;
        this.f3225c = aDVar;
    }

    public final void m3508a() {
    }

    public final void m3509a(aw awVar) {
        this.f3226d = awVar;
    }

    public final void m3510b() {
        m3511c();
    }

    public final void m3511c() {
        if (this.f3223a != null) {
            this.f3223a.m3573j();
        }
    }

    public final void run() {
        aw awVar;
        String str;
        Throwable th;
        String b;
        int a;
        HashMap c;
        Runnable a2;
        if (this.f3223a != null) {
            try {
                if (this.f3225c != null) {
                    this.f3225c.m1862a(100, null, -1, null);
                    this.f3224b.m1728a(this.f3225c);
                }
                this.f3223a.m3574k();
                if (this.f3225c != null) {
                    Runnable a3 = this.f3225c.m1860a();
                    a3.m1862a(200, null, -1, null);
                    this.f3224b.m1728a(a3);
                }
                Object[] a4 = az.m3553a(this.f3223a);
                String str2 = (String) a4[0];
                try {
                    HashMap hashMap = (HashMap) a4[1];
                    if (this.f3225c != null) {
                        Runnable a5 = this.f3225c.m1860a();
                        if (this.f3223a.m3575l()) {
                            a5.m1862a(300, null, -1, null);
                        } else {
                            a5.m1862a(400, str2, -1, hashMap);
                        }
                        this.f3224b.m1728a(a5);
                    }
                    this.f3223a.m3572i();
                    this.f3223a = null;
                    if (this.f3226d != null) {
                        awVar = this.f3226d;
                        awVar.m2005a(this);
                    }
                } catch (Throwable e) {
                    Throwable th2 = e;
                    str = str2;
                    th = th2;
                    try {
                        if (KonyMain.f3657e) {
                            Log.d(this.f3227e, th.getMessage(), th);
                        }
                        b = th.m1867b();
                        try {
                            a = th.m1865a();
                            try {
                                c = th.m1868c();
                                if (this.f3225c != null) {
                                    a2 = this.f3225c.m1860a();
                                    if (this.f3223a.m3575l()) {
                                        a2.m1862a(500, b, a, c);
                                    } else {
                                        a2.m1862a(300, null, -1, null);
                                    }
                                    this.f3224b.m1728a(a2);
                                }
                                this.f3223a.m3572i();
                                this.f3223a = null;
                                if (this.f3226d != null) {
                                    awVar = this.f3226d;
                                    awVar.m2005a(this);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (this.f3225c != null) {
                                    a2 = this.f3225c.m1860a();
                                    if (this.f3223a.m3575l()) {
                                        a2.m1862a(300, null, -1, null);
                                    } else {
                                        a2.m1862a(500, b, a, null);
                                    }
                                    this.f3224b.m1728a(a2);
                                }
                                this.f3223a.m3572i();
                                this.f3223a = null;
                                if (this.f3226d != null) {
                                    this.f3226d.m2005a(this);
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            a = -1;
                            if (this.f3225c != null) {
                                a2 = this.f3225c.m1860a();
                                if (this.f3223a.m3575l()) {
                                    a2.m1862a(300, null, -1, null);
                                } else {
                                    a2.m1862a(500, b, a, null);
                                }
                                this.f3224b.m1728a(a2);
                            }
                            this.f3223a.m3572i();
                            this.f3223a = null;
                            if (this.f3226d != null) {
                                this.f3226d.m2005a(this);
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        b = str;
                        a = -1;
                        if (this.f3225c != null) {
                            a2 = this.f3225c.m1860a();
                            if (this.f3223a.m3575l()) {
                                a2.m1862a(300, null, -1, null);
                            } else {
                                a2.m1862a(500, b, a, null);
                            }
                            this.f3224b.m1728a(a2);
                        }
                        this.f3223a.m3572i();
                        this.f3223a = null;
                        if (this.f3226d != null) {
                            this.f3226d.m2005a(this);
                        }
                        throw th;
                    }
                } catch (Throwable e2) {
                    b = str2;
                    th = e2;
                    a = -1;
                    if (this.f3225c != null) {
                        a2 = this.f3225c.m1860a();
                        if (this.f3223a.m3575l()) {
                            a2.m1862a(500, b, a, null);
                        } else {
                            a2.m1862a(300, null, -1, null);
                        }
                        this.f3224b.m1728a(a2);
                    }
                    this.f3223a.m3572i();
                    this.f3223a = null;
                    if (this.f3226d != null) {
                        this.f3226d.m2005a(this);
                    }
                    throw th;
                }
            } catch (aE e3) {
                th = e3;
                str = null;
                if (KonyMain.f3657e) {
                    Log.d(this.f3227e, th.getMessage(), th);
                }
                b = th.m1867b();
                a = th.m1865a();
                c = th.m1868c();
                if (this.f3225c != null) {
                    a2 = this.f3225c.m1860a();
                    if (this.f3223a.m3575l()) {
                        a2.m1862a(500, b, a, c);
                    } else {
                        a2.m1862a(300, null, -1, null);
                    }
                    this.f3224b.m1728a(a2);
                }
                this.f3223a.m3572i();
                this.f3223a = null;
                if (this.f3226d != null) {
                    awVar = this.f3226d;
                    awVar.m2005a(this);
                }
            } catch (Throwable th6) {
                th = th6;
                a = -1;
                b = null;
                if (this.f3225c != null) {
                    a2 = this.f3225c.m1860a();
                    if (this.f3223a.m3575l()) {
                        a2.m1862a(500, b, a, null);
                    } else {
                        a2.m1862a(300, null, -1, null);
                    }
                    this.f3224b.m1728a(a2);
                }
                this.f3223a.m3572i();
                this.f3223a = null;
                if (this.f3226d != null) {
                    this.f3226d.m2005a(this);
                }
                throw th;
            }
        }
    }
}
