package com.konylabs.vm;

import java.io.Serializable;
import java.util.Hashtable;

/* renamed from: com.konylabs.vm.g */
public final class C0413g extends C0242f implements Serializable {
    public C0413g(C0239c c0239c) {
        super(c0239c);
    }

    public C0413g(C0239c c0239c, Hashtable hashtable) {
        super(c0239c, hashtable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object[] m3379a(com.konylabs.vm.Function r12, com.konylabs.vm.C0246k r13, boolean r14) throws java.lang.Exception {
        /*
        r11 = this;
        r6 = 0;
        r1 = r12.f1783b;
        r1 = (com.konylabs.vm.C0241e) r1;
        r0 = r1.f1821a;
        if (r0 != 0) goto L_0x000c;
    L_0x0009:
        com.konylabs.vm.C0247l.m1736a(r1);
    L_0x000c:
        r8 = r1.f1824d;
        r0 = r11.b;
        r0 = r0.m1677a();
        r0.push(r13);
        r2 = c;
        monitor-enter(r2);
        r0 = c;	 Catch:{ all -> 0x0083 }
        r0.notifyAll();	 Catch:{ all -> 0x0083 }
        monitor-exit(r2);	 Catch:{ all -> 0x0083 }
        r9 = r8.length;
        r10 = com.konylabs.vm.C0237a.m1647a();
        r0 = r10.m1673c();
        if (r0 != 0) goto L_0x002e;
    L_0x002b:
        r10.m1666a(r12, r13);
    L_0x002e:
        r2 = r6;
    L_0x002f:
        r0 = r13.f1848e;	 Catch:{ Exception -> 0x0496 }
        if (r0 >= r9) goto L_0x0493;
    L_0x0033:
        r0 = r13.f1848e;	 Catch:{ Exception -> 0x0496 }
        r5 = r8[r0];	 Catch:{ Exception -> 0x0496 }
        com.konylabs.vm.C0241e.f1819n = r1;	 Catch:{ Exception -> 0x0496 }
        r0 = r1.f1831k;	 Catch:{ Exception -> 0x0496 }
        if (r0 == 0) goto L_0x004a;
    L_0x003d:
        r0 = r1.f1831k;	 Catch:{ Exception -> 0x0496 }
        r0 = r0.length;	 Catch:{ Exception -> 0x0496 }
        if (r0 <= 0) goto L_0x004a;
    L_0x0042:
        r0 = r1.f1831k;	 Catch:{ Exception -> 0x0496 }
        r3 = r13.f1848e;	 Catch:{ Exception -> 0x0496 }
        r0 = r0[r3];	 Catch:{ Exception -> 0x0496 }
        com.konylabs.vm.C0241e.f1820o = r0;	 Catch:{ Exception -> 0x0496 }
    L_0x004a:
        r0 = 0;
        r3 = 6;
        r4 = com.konylabs.vm.C0252r.m1765a(r5, r0, r3);	 Catch:{ Exception -> 0x0496 }
        r0 = r1.f1831k;	 Catch:{ Exception -> 0x0496 }
        r0 = r0.length;	 Catch:{ Exception -> 0x0496 }
        if (r0 == 0) goto L_0x04a0;
    L_0x0055:
        r0 = 22;
        if (r4 == r0) goto L_0x04a0;
    L_0x0059:
        r0 = r1.f1831k;	 Catch:{ Exception -> 0x0496 }
        r3 = r13.f1848e;	 Catch:{ Exception -> 0x0496 }
        r3 = r0[r3];	 Catch:{ Exception -> 0x0496 }
        r0 = r10.m1672b();	 Catch:{ Exception -> 0x0499 }
        if (r0 == 0) goto L_0x0077;
    L_0x0065:
        if (r2 == r3) goto L_0x0077;
    L_0x0067:
        r0 = r1.f1833m;	 Catch:{ Exception -> 0x0499 }
        r0 = r10.m1670a(r0, r3);	 Catch:{ Exception -> 0x0499 }
        if (r0 == 0) goto L_0x0086;
    L_0x006f:
        r0 = 1;
    L_0x0070:
        if (r0 == 0) goto L_0x0077;
    L_0x0072:
        r0 = r1.f1833m;	 Catch:{ Exception -> 0x0499 }
        r10.m1671b(r0, r3);	 Catch:{ Exception -> 0x0499 }
    L_0x0077:
        r7 = r3;
    L_0x0078:
        switch(r4) {
            case 0: goto L_0x02ce;
            case 1: goto L_0x00d4;
            case 2: goto L_0x01e3;
            case 3: goto L_0x02b3;
            case 4: goto L_0x02e2;
            case 5: goto L_0x00a0;
            case 6: goto L_0x0283;
            case 7: goto L_0x00c1;
            case 8: goto L_0x02f6;
            case 9: goto L_0x0267;
            case 10: goto L_0x0223;
            case 11: goto L_0x045c;
            case 12: goto L_0x0105;
            case 13: goto L_0x0121;
            case 14: goto L_0x013d;
            case 15: goto L_0x0159;
            case 16: goto L_0x0175;
            case 17: goto L_0x0191;
            case 18: goto L_0x01ad;
            case 19: goto L_0x01c8;
            case 20: goto L_0x029f;
            case 21: goto L_0x0207;
            case 22: goto L_0x033b;
            case 23: goto L_0x0352;
            case 24: goto L_0x036e;
            case 25: goto L_0x038a;
            case 26: goto L_0x03c2;
            case 27: goto L_0x03a6;
            case 28: goto L_0x00e7;
            case 29: goto L_0x0419;
            case 30: goto L_0x031e;
            case 31: goto L_0x03f5;
            case 32: goto L_0x03dd;
            case 33: goto L_0x0478;
            case 34: goto L_0x023f;
            case 35: goto L_0x040d;
            case 36: goto L_0x030a;
            case 37: goto L_0x0441;
            default: goto L_0x007b;
        };
    L_0x007b:
        r0 = r13.f1848e;	 Catch:{ Exception -> 0x00b3 }
        r0 = r0 + 1;
        r13.f1848e = r0;	 Catch:{ Exception -> 0x00b3 }
        r2 = r7;
        goto L_0x002f;
    L_0x0083:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x0086:
        r0 = r10.f1796b;	 Catch:{ Exception -> 0x0499 }
        if (r0 == 0) goto L_0x008c;
    L_0x008a:
        r0 = 1;
        goto L_0x0070;
    L_0x008c:
        r0 = r10.f1797c;	 Catch:{ Exception -> 0x0499 }
        if (r0 != 0) goto L_0x0094;
    L_0x0090:
        r0 = r10.f1798d;	 Catch:{ Exception -> 0x0499 }
        if (r0 == 0) goto L_0x049d;
    L_0x0094:
        r0 = r10.f1799e;	 Catch:{ Exception -> 0x0499 }
        r2 = r10.m1676f();	 Catch:{ Exception -> 0x0499 }
        if (r0 < r2) goto L_0x009e;
    L_0x009c:
        r0 = 1;
        goto L_0x0070;
    L_0x009e:
        r0 = r6;
        goto L_0x0070;
    L_0x00a0:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 32;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1688a(r1, r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x00b3:
        r0 = move-exception;
        r2 = r7;
    L_0x00b5:
        r3 = r10.m1673c();
        if (r3 != 0) goto L_0x00c0;
    L_0x00bb:
        r1 = r1.f1833m;
        r10.m1667a(r0, r1, r2);
    L_0x00c0:
        throw r0;
    L_0x00c1:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 32;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1695b(r1, r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x00d4:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 32;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1699c(r1, r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x00e7:
        r0 = 6;
        r2 = 14;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r0 = 14;
        r3 = 23;
        r4 = com.konylabs.vm.C0252r.m1765a(r5, r0, r3);	 Catch:{ Exception -> 0x00b3 }
        r0 = 23;
        r3 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r0, r3);	 Catch:{ Exception -> 0x00b3 }
        r0 = r11;
        r5 = r13;
        r0.m1718a(r1, r2, r3, r4, r5);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x0105:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1694b(r1, r0, r3, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x0121:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1698c(r1, r0, r3, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x013d:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1701d(r1, r0, r3, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x0159:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1703e(r1, r0, r3, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x0175:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1705f(r1, r0, r3, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x0191:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1707g(r1, r0, r3, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x01ad:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r2 = 23;
        r3 = 32;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1684a(r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x01c8:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r2 = 23;
        r3 = 32;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1692b(r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x01e3:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1697c(r0, r3, r13);	 Catch:{ Exception -> 0x00b3 }
        if (r2 == 0) goto L_0x007b;
    L_0x01ff:
        r0 = r13.f1848e;	 Catch:{ Exception -> 0x00b3 }
        r0 = r0 + 1;
        r13.f1848e = r0;	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x0207:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1683a(r0, r3, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x0223:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1691b(r0, r3, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x023f:
        r0 = 6;
        r2 = 14;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r0 = 14;
        r3 = 23;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        if (r0 != 0) goto L_0x0262;
    L_0x0258:
        r0 = r1.f1824d;	 Catch:{ Exception -> 0x00b3 }
        r4 = r13.f1848e;	 Catch:{ Exception -> 0x00b3 }
        r5 = r4 + 1;
        r13.f1848e = r5;	 Catch:{ Exception -> 0x00b3 }
        r0 = r0[r4];	 Catch:{ Exception -> 0x00b3 }
    L_0x0262:
        com.konylabs.vm.C0242f.m1709h(r1, r2, r3, r0, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x0267:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1713j(r1, r0, r3, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x0283:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1711i(r1, r0, r3, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x029f:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 23;
        r3 = 32;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1700d(r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x02b3:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r2 = 23;
        r3 = 32;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1702e(r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x02ce:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 23;
        r3 = 32;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1704f(r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x02e2:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 23;
        r3 = 32;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1686a(r12, r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x02f6:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 23;
        r3 = 32;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1693b(r12, r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x030a:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 32;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1687a(r12, r1, r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x031e:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 23;
        r3 = 32;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = r10.m1673c();	 Catch:{ Exception -> 0x00b3 }
        if (r3 != 0) goto L_0x0336;
    L_0x0333:
        r10.m1675e();	 Catch:{ Exception -> 0x00b3 }
    L_0x0336:
        r0 = r11.m1721d(r1, r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
    L_0x033a:
        return r0;
    L_0x033b:
        r0 = 6;
        r2 = 14;
        com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r0 = 14;
        r2 = 32;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 131071; // 0x1ffff float:1.8367E-40 double:6.47577E-319;
        r0 = r0 - r2;
        com.konylabs.vm.C0242f.m1685a(r0, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x0352:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1714k(r1, r0, r3, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x036e:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1715l(r1, r0, r3, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x038a:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1716m(r1, r0, r3, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x03a6:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1696c(r0, r3, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x03c2:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1706g(r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x03dd:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 32;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 131071; // 0x1ffff float:1.8367E-40 double:6.47577E-319;
        r2 = r2 - r3;
        com.konylabs.vm.C0242f.m1708h(r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x03f5:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 32;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 131071; // 0x1ffff float:1.8367E-40 double:6.47577E-319;
        r2 = r2 - r3;
        com.konylabs.vm.C0242f.m1710i(r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x040d:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r11.m1719a(r1, r0, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x0419:
        r0 = 6;
        r2 = 14;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r0 = 14;
        r3 = 23;
        r4 = com.konylabs.vm.C0252r.m1765a(r5, r0, r3);	 Catch:{ Exception -> 0x00b3 }
        r0 = 23;
        r3 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r0, r3);	 Catch:{ Exception -> 0x00b3 }
        r0 = r11;
        r5 = r13;
        r0 = r0.m1723n(r1, r2, r3, r4, r5);	 Catch:{ Exception -> 0x00b3 }
        r2 = r10.m1673c();	 Catch:{ Exception -> 0x00b3 }
        if (r2 != 0) goto L_0x033a;
    L_0x043c:
        r10.m1675e();	 Catch:{ Exception -> 0x00b3 }
        goto L_0x033a;
    L_0x0441:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r2 = 23;
        r3 = 32;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1712j(r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x045c:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        r3 = com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        com.konylabs.vm.C0242f.m1717o(r1, r0, r3, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x0478:
        r0 = 6;
        r2 = 14;
        r0 = com.konylabs.vm.C0252r.m1765a(r5, r0, r2);	 Catch:{ Exception -> 0x00b3 }
        r2 = 14;
        r3 = 23;
        r2 = com.konylabs.vm.C0252r.m1765a(r5, r2, r3);	 Catch:{ Exception -> 0x00b3 }
        r3 = 23;
        r4 = 32;
        com.konylabs.vm.C0252r.m1765a(r5, r3, r4);	 Catch:{ Exception -> 0x00b3 }
        r11.m1722e(r1, r0, r2, r13);	 Catch:{ Exception -> 0x00b3 }
        goto L_0x007b;
    L_0x0493:
        r0 = 0;
        goto L_0x033a;
    L_0x0496:
        r0 = move-exception;
        goto L_0x00b5;
    L_0x0499:
        r0 = move-exception;
        r2 = r3;
        goto L_0x00b5;
    L_0x049d:
        r0 = r6;
        goto L_0x0070;
    L_0x04a0:
        r7 = r2;
        goto L_0x0078;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.vm.g.a(com.konylabs.vm.Function, com.konylabs.vm.k, boolean):java.lang.Object[]");
    }
}
