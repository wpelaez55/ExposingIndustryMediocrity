package com.konylabs.api;

import android.content.Context;
import com.konylabs.android.KonyMain;
import com.konylabs.libintf.Library;

/* renamed from: com.konylabs.api.R */
public final class C0349R implements Library {
    private Context f2396a;

    public C0349R() {
        this.f2396a = KonyMain.getActContext();
    }

    public C0349R(Context context) {
        this.f2396a = context;
    }

    public static Library m2282a() {
        return new C0350S();
    }

    public static Library m2283b() {
        return new am();
    }

    public static Library m2284c() {
        return new ap();
    }

    public static Library m2285d() {
        return new as();
    }

    public static Library m2286e() {
        return new au();
    }

    public static Library m2287f() {
        return new aw();
    }

    public static Library m2288g() {
        return new ay();
    }

    public static Library m2289h() {
        return new aA();
    }

    public static Library m2290i() {
        return new aD();
    }

    public static Library m2291j() {
        return new C0351V();
    }

    public static Library m2292k() {
        return new C0352Y();
    }

    public static Library m2293l() {
        return new aa();
    }

    public static Library m2294m() {
        return new ac();
    }

    public static Library m2295n() {
        return new af();
    }

    public static Library m2296o() {
        return new ah();
    }

    public static Library m2297p() {
        return new ak();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object[] execute(int r13, java.lang.Object[] r14) {
        /*
        r12 = this;
        r10 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        r5 = 2;
        r6 = 0;
        r8 = 1;
        r7 = 0;
        switch(r13) {
            case 0: goto L_0x0028;
            case 1: goto L_0x0068;
            case 2: goto L_0x0091;
            case 3: goto L_0x00d4;
            case 4: goto L_0x0117;
            case 5: goto L_0x015a;
            case 6: goto L_0x019d;
            case 7: goto L_0x01e0;
            case 8: goto L_0x0223;
            case 9: goto L_0x0247;
            case 10: goto L_0x028a;
            case 11: goto L_0x02ab;
            case 12: goto L_0x02ee;
            case 13: goto L_0x0317;
            case 14: goto L_0x035a;
            case 15: goto L_0x0383;
            case 16: goto L_0x03ac;
            case 17: goto L_0x03ef;
            case 18: goto L_0x0432;
            case 19: goto L_0x0475;
            case 20: goto L_0x04b8;
            case 21: goto L_0x04fb;
            case 22: goto L_0x053e;
            case 23: goto L_0x0581;
            case 24: goto L_0x05c4;
            case 25: goto L_0x0607;
            case 26: goto L_0x0630;
            case 27: goto L_0x067a;
            case 28: goto L_0x06c4;
            case 29: goto L_0x0707;
            case 30: goto L_0x074a;
            case 31: goto L_0x078d;
            case 32: goto L_0x07d0;
            case 33: goto L_0x0813;
            case 34: goto L_0x0838;
            case 35: goto L_0x083f;
            case 36: goto L_0x085a;
            case 37: goto L_0x0864;
            case 38: goto L_0x08a7;
            case 39: goto L_0x08ea;
            case 40: goto L_0x092d;
            case 41: goto L_0x096e;
            case 42: goto L_0x09b1;
            case 43: goto L_0x09f4;
            case 44: goto L_0x0a37;
            case 45: goto L_0x0a69;
            case 46: goto L_0x0aac;
            case 47: goto L_0x0aef;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = r12.f2396a;
        if (r0 == 0) goto L_0x0024;
    L_0x000d:
        r0 = new com.konylabs.api.ui.v;
        r1 = r12.f2396a;
        r0.<init>(r1);
        r0.m1588b(r7);
        r1 = "Trying for Non existing API of window namespace";
        r0.m1589b(r1);
        r1 = "Warning";
        r0.m1586a(r1);
        r0.m1583a();
    L_0x0024:
        r0 = r6;
    L_0x0025:
        if (r0 != 0) goto L_0x0af5;
    L_0x0027:
        return r6;
    L_0x0028:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0046;
    L_0x002c:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create Form - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0046:
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0064;
    L_0x0050:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x0055:
        r1 = r14[r5];
        r3 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r3) goto L_0x0066;
    L_0x005b:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x005f:
        r0 = com.konylabs.api.ui.fv.m4394b(r0, r2, r1, r7);
        goto L_0x0025;
    L_0x0064:
        r2 = r6;
        goto L_0x0055;
    L_0x0066:
        r1 = r6;
        goto L_0x005f;
    L_0x0068:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0086;
    L_0x006c:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create KonySkin - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0086:
        r1 = new com.konylabs.api.ui.hp;
        r0 = r14[r7];
        r0 = (java.lang.String) r0;
        r1.<init>(r0);
        r0 = r1;
        goto L_0x0025;
    L_0x0091:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x00af;
    L_0x0095:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create Button - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x00af:
        r3 = new com.konylabs.api.ui.fe;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x00d0;
    L_0x00bb:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x00c0:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x00d2;
    L_0x00c6:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x00ca:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x00d0:
        r2 = r6;
        goto L_0x00c0;
    L_0x00d2:
        r1 = r6;
        goto L_0x00ca;
    L_0x00d4:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x00f2;
    L_0x00d8:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create Radio Button Group - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x00f2:
        r3 = new com.konylabs.api.ui.gU;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0113;
    L_0x00fe:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x0103:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x0115;
    L_0x0109:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x010d:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x0113:
        r2 = r6;
        goto L_0x0103;
    L_0x0115:
        r1 = r6;
        goto L_0x010d;
    L_0x0117:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0135;
    L_0x011b:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create CheckBoxGroup - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0135:
        r3 = new com.konylabs.api.ui.fn;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0156;
    L_0x0141:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x0146:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x0158;
    L_0x014c:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0150:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x0156:
        r2 = r6;
        goto L_0x0146;
    L_0x0158:
        r1 = r6;
        goto L_0x0150;
    L_0x015a:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0178;
    L_0x015e:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create createBox - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0178:
        r3 = new com.konylabs.api.ui.eO;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0199;
    L_0x0184:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x0189:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x019b;
    L_0x018f:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0193:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x0199:
        r2 = r6;
        goto L_0x0189;
    L_0x019b:
        r1 = r6;
        goto L_0x0193;
    L_0x019d:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x01bb;
    L_0x01a1:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create createLabel - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x01bb:
        r3 = new com.konylabs.api.ui.gA;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x01dc;
    L_0x01c7:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x01cc:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x01de;
    L_0x01d2:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x01d6:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x01dc:
        r2 = r6;
        goto L_0x01cc;
    L_0x01de:
        r1 = r6;
        goto L_0x01d6;
    L_0x01e0:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x01fe;
    L_0x01e4:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create createTextField - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x01fe:
        r3 = new com.konylabs.api.ui.hD;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x021f;
    L_0x020a:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x020f:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x0221;
    L_0x0215:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0219:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x021f:
        r2 = r6;
        goto L_0x020f;
    L_0x0221:
        r1 = r6;
        goto L_0x0219;
    L_0x0223:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0241;
    L_0x0227:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create createAlert - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0241:
        r0 = com.konylabs.api.ui.eA.m4178a(r14);
        goto L_0x0025;
    L_0x0247:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0265;
    L_0x024b:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create createList - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0265:
        r3 = new com.konylabs.api.ui.gF;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0286;
    L_0x0271:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x0276:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x0288;
    L_0x027c:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0280:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x0286:
        r2 = r6;
        goto L_0x0276;
    L_0x0288:
        r1 = r6;
        goto L_0x0280;
    L_0x028a:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0024;
    L_0x028e:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create createChart - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
        r0 = r6;
        goto L_0x0025;
    L_0x02ab:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x02c9;
    L_0x02af:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create create Image - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x02c9:
        r3 = new com.konylabs.api.ui.gs;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x02ea;
    L_0x02d5:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x02da:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x02ec;
    L_0x02e0:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x02e4:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x02ea:
        r2 = r6;
        goto L_0x02da;
    L_0x02ec:
        r1 = r6;
        goto L_0x02e4;
    L_0x02ee:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x02f9;
    L_0x02f2:
        r0 = "WindowsLib";
        r1 = "Calling Create create Table";
        android.util.Log.d(r0, r1);
    L_0x02f9:
        r0 = r12.f2396a;
        if (r0 == 0) goto L_0x0024;
    L_0x02fd:
        r0 = new com.konylabs.api.ui.v;
        r1 = r12.f2396a;
        r0.<init>(r1);
        r0.m1588b(r7);
        r1 = "Table API not implemented\nApp may crash";
        r0.m1589b(r1);
        r1 = "Warning";
        r0.m1586a(r1);
        r0.m1583a();
        r0 = r6;
        goto L_0x0025;
    L_0x0317:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0335;
    L_0x031b:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create Camera - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0335:
        r3 = new com.konylabs.api.ui.fi;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0356;
    L_0x0341:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x0346:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x0358;
    L_0x034c:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0350:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x0356:
        r2 = r6;
        goto L_0x0346;
    L_0x0358:
        r1 = r6;
        goto L_0x0350;
    L_0x035a:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0365;
    L_0x035e:
        r0 = "WindowsLib";
        r1 = "Creating the card container";
        android.util.Log.d(r0, r1);
    L_0x0365:
        r0 = r12.f2396a;
        if (r0 == 0) goto L_0x0024;
    L_0x0369:
        r0 = new com.konylabs.api.ui.v;
        r1 = r12.f2396a;
        r0.<init>(r1);
        r0.m1588b(r7);
        r1 = "CardGroup API not implemented\nApp may crash";
        r0.m1589b(r1);
        r1 = "Warning";
        r0.m1586a(r1);
        r0.m1583a();
        r0 = r6;
        goto L_0x0025;
    L_0x0383:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x038e;
    L_0x0387:
        r0 = "WindowsLib";
        r1 = "Creating the advertisement container";
        android.util.Log.d(r0, r1);
    L_0x038e:
        r0 = r12.f2396a;
        if (r0 == 0) goto L_0x0024;
    L_0x0392:
        r0 = new com.konylabs.api.ui.v;
        r1 = r12.f2396a;
        r0.<init>(r1);
        r0.m1588b(r7);
        r1 = "Advertisement API not implemented\nApp may crash";
        r0.m1589b(r1);
        r1 = "Warning";
        r0.m1586a(r1);
        r0.m1583a();
        r0 = r6;
        goto L_0x0025;
    L_0x03ac:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x03ca;
    L_0x03b0:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Creating the tabwidget container - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x03ca:
        r3 = new com.konylabs.api.ui.hq;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x03eb;
    L_0x03d6:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x03db:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x03ed;
    L_0x03e1:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x03e5:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x03eb:
        r2 = r6;
        goto L_0x03db;
    L_0x03ed:
        r1 = r6;
        goto L_0x03e5;
    L_0x03ef:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x040d;
    L_0x03f3:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Creating the calendar widget - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x040d:
        r3 = new com.konylabs.api.ui.fg;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x042e;
    L_0x0419:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x041e:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x0430;
    L_0x0424:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0428:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x042e:
        r2 = r6;
        goto L_0x041e;
    L_0x0430:
        r1 = r6;
        goto L_0x0428;
    L_0x0432:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0450;
    L_0x0436:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Creating the line widget widget - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0450:
        r3 = new com.konylabs.api.ui.gC;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0471;
    L_0x045c:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x0461:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x0473;
    L_0x0467:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x046b:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x0471:
        r2 = r6;
        goto L_0x0461;
    L_0x0473:
        r1 = r6;
        goto L_0x046b;
    L_0x0475:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0493;
    L_0x0479:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create combobox - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0493:
        r3 = new com.konylabs.api.ui.fp;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x04b4;
    L_0x049f:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x04a4:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x04b6;
    L_0x04aa:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x04ae:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x04b4:
        r2 = r6;
        goto L_0x04a4;
    L_0x04b6:
        r1 = r6;
        goto L_0x04ae;
    L_0x04b8:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x04d6;
    L_0x04bc:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create Image Strip - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x04d6:
        r3 = new com.konylabs.api.ui.fT;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x04f7;
    L_0x04e2:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x04e7:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x04f9;
    L_0x04ed:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x04f1:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x04f7:
        r2 = r6;
        goto L_0x04e7;
    L_0x04f9:
        r1 = r6;
        goto L_0x04f1;
    L_0x04fb:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0519;
    L_0x04ff:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create Gallery - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0519:
        r3 = new com.konylabs.api.ui.gu;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x053a;
    L_0x0525:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x052a:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x053c;
    L_0x0530:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0534:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x053a:
        r2 = r6;
        goto L_0x052a;
    L_0x053c:
        r1 = r6;
        goto L_0x0534;
    L_0x053e:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x055c;
    L_0x0542:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create TextArea - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x055c:
        r3 = new com.konylabs.api.ui.ht;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x057d;
    L_0x0568:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x056d:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x057f;
    L_0x0573:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0577:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x057d:
        r2 = r6;
        goto L_0x056d;
    L_0x057f:
        r1 = r6;
        goto L_0x0577;
    L_0x0581:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x059f;
    L_0x0585:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create Segmented UI - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x059f:
        r0 = new com.konylabs.api.ui.hg;
        r1 = r14[r7];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r14[r8];
        r3 = com.konylabs.vm.LuaNil.nil;
        if (r2 == r3) goto L_0x05c0;
    L_0x05ab:
        r2 = r14[r8];
        r2 = (com.konylabs.vm.LuaTable) r2;
    L_0x05af:
        r3 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r3 == r4) goto L_0x05c2;
    L_0x05b5:
        r3 = r14[r5];
        r3 = (com.konylabs.vm.LuaTable) r3;
    L_0x05b9:
        r4 = 0;
        r0.<init>(r1, r2, r3, r4);
        goto L_0x0025;
    L_0x05c0:
        r2 = r6;
        goto L_0x05af;
    L_0x05c2:
        r3 = r6;
        goto L_0x05b9;
    L_0x05c4:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x05e2;
    L_0x05c8:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create Link - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x05e2:
        r3 = new com.konylabs.api.ui.gD;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0603;
    L_0x05ee:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x05f3:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x0605;
    L_0x05f9:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x05fd:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x0603:
        r2 = r6;
        goto L_0x05f3;
    L_0x0605:
        r1 = r6;
        goto L_0x05fd;
    L_0x0607:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0612;
    L_0x060b:
        r0 = "WindowsLib";
        r1 = "Calling set launch status";
        android.util.Log.d(r0, r1);
    L_0x0612:
        r0 = r12.f2396a;
        if (r0 == 0) goto L_0x0024;
    L_0x0616:
        r0 = new com.konylabs.api.ui.v;
        r1 = r12.f2396a;
        r0.<init>(r1);
        r0.m1588b(r7);
        r1 = "setlaunchstatus not implemented";
        r0.m1589b(r1);
        r1 = "Warning";
        r0.m1586a(r1);
        r0.m1583a();
        r0 = r6;
        goto L_0x0025;
    L_0x0630:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x064e;
    L_0x0634:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "opening the url : ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x064e:
        if (r14 == 0) goto L_0x065c;
    L_0x0650:
        r0 = r14[r7];
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x065c;
    L_0x0656:
        r0 = r14[r7];
        r6 = r0.toString();
    L_0x065c:
        r0 = com.konylabs.android.KonyMain.m4120e(r6);
        if (r0 == 0) goto L_0x066f;
    L_0x0662:
        r6 = new java.lang.Object[r8];
        r0 = new java.lang.Double;
        r2 = 0;
        r0.<init>(r2);
        r6[r7] = r0;
        goto L_0x0027;
    L_0x066f:
        r6 = new java.lang.Object[r8];
        r0 = new java.lang.Double;
        r0.<init>(r10);
        r6[r7] = r0;
        goto L_0x0027;
    L_0x067a:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0698;
    L_0x067e:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Openign the url : ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0698:
        if (r14 == 0) goto L_0x06a6;
    L_0x069a:
        r0 = r14[r7];
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x06a6;
    L_0x06a0:
        r0 = r14[r7];
        r6 = r0.toString();
    L_0x06a6:
        r0 = com.konylabs.android.KonyMain.m4123f(r6);
        if (r0 == 0) goto L_0x06b9;
    L_0x06ac:
        r6 = new java.lang.Object[r8];
        r0 = new java.lang.Double;
        r2 = 0;
        r0.<init>(r2);
        r6[r7] = r0;
        goto L_0x0027;
    L_0x06b9:
        r6 = new java.lang.Object[r8];
        r0 = new java.lang.Double;
        r0.<init>(r10);
        r6[r7] = r0;
        goto L_0x0027;
    L_0x06c4:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x06e2;
    L_0x06c8:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create Map - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x06e2:
        r3 = new com.konylabs.api.ui.gH;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0703;
    L_0x06ee:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x06f3:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x0705;
    L_0x06f9:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x06fd:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x0703:
        r2 = r6;
        goto L_0x06f3;
    L_0x0705:
        r1 = r6;
        goto L_0x06fd;
    L_0x0707:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0725;
    L_0x070b:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling create Web - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0725:
        r3 = new com.konylabs.api.ui.hP;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0746;
    L_0x0731:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x0736:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x0748;
    L_0x073c:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0740:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x0746:
        r2 = r6;
        goto L_0x0736;
    L_0x0748:
        r1 = r6;
        goto L_0x0740;
    L_0x074a:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0768;
    L_0x074e:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Rich text - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0768:
        r3 = new com.konylabs.api.ui.gX;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0789;
    L_0x0774:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x0779:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x078b;
    L_0x077f:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0783:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x0789:
        r2 = r6;
        goto L_0x0779;
    L_0x078b:
        r1 = r6;
        goto L_0x0783;
    L_0x078d:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x07ab;
    L_0x0791:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling create PopUp - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x07ab:
        r3 = new com.konylabs.api.ui.gL;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x07cc;
    L_0x07b7:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x07bc:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x07ce;
    L_0x07c2:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x07c6:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x07cc:
        r2 = r6;
        goto L_0x07bc;
    L_0x07ce:
        r1 = r6;
        goto L_0x07c6;
    L_0x07d0:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x07ee;
    L_0x07d4:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling create DataGrid - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x07ee:
        r3 = new com.konylabs.api.ui.fs;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x080f;
    L_0x07fa:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x07ff:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x0811;
    L_0x0805:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0809:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x080f:
        r2 = r6;
        goto L_0x07ff;
    L_0x0811:
        r1 = r6;
        goto L_0x0809;
    L_0x0813:
        r3 = new com.konylabs.api.ui.hd;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0834;
    L_0x081f:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x0824:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x0836;
    L_0x082a:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x082e:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x0834:
        r2 = r6;
        goto L_0x0824;
    L_0x0836:
        r1 = r6;
        goto L_0x082e;
    L_0x0838:
        r0 = new com.konylabs.api.ui.fl;
        r0.<init>(r14);
        goto L_0x0025;
    L_0x083f:
        r0 = com.konylabs.api.ui.eK.m3294a();
        r0.m3306a(r14);
        r0.m3308c();
        r0 = android.os.Message.obtain();
        r1 = 6;
        r0.what = r1;
        r1 = com.konylabs.android.KonyMain.m4121f();
        r1.sendMessageAtFrontOfQueue(r0);
        r0 = r6;
        goto L_0x0025;
    L_0x085a:
        r0 = com.konylabs.api.ui.eK.m3294a();
        r0.m3309d();
        r0 = r6;
        goto L_0x0025;
    L_0x0864:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0882;
    L_0x0868:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling create Picker View - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0882:
        r3 = new com.konylabs.api.ui.gJ;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x08a3;
    L_0x088e:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x0893:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x08a5;
    L_0x0899:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x089d:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x08a3:
        r2 = r6;
        goto L_0x0893;
    L_0x08a5:
        r1 = r6;
        goto L_0x089d;
    L_0x08a7:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x08c5;
    L_0x08ab:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create ScrollableBox - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x08c5:
        r3 = new com.konylabs.api.ui.gZ;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x08e6;
    L_0x08d1:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x08d6:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x08e8;
    L_0x08dc:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x08e0:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x08e6:
        r2 = r6;
        goto L_0x08d6;
    L_0x08e8:
        r1 = r6;
        goto L_0x08e0;
    L_0x08ea:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0908;
    L_0x08ee:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling create DV Widget - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0908:
        r3 = new com.konylabs.api.ui.fm;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0929;
    L_0x0914:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x0919:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x092b;
    L_0x091f:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0923:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x0929:
        r2 = r6;
        goto L_0x0919;
    L_0x092b:
        r1 = r6;
        goto L_0x0923;
    L_0x092d:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x094b;
    L_0x0931:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create Form2 - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x094b:
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x096a;
    L_0x0955:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x095a:
        r1 = r14[r5];
        r3 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r3) goto L_0x096c;
    L_0x0960:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0964:
        r0 = com.konylabs.api.ui.fv.m4394b(r0, r2, r1, r8);
        goto L_0x0025;
    L_0x096a:
        r2 = r6;
        goto L_0x095a;
    L_0x096c:
        r1 = r6;
        goto L_0x0964;
    L_0x096e:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x098c;
    L_0x0972:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create Image2 - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x098c:
        r3 = new com.konylabs.api.ui.gt;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x09ad;
    L_0x0998:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x099d:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x09af;
    L_0x09a3:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x09a7:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x09ad:
        r2 = r6;
        goto L_0x099d;
    L_0x09af:
        r1 = r6;
        goto L_0x09a7;
    L_0x09b1:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x09cf;
    L_0x09b5:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create TextField2 - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x09cf:
        r3 = new com.konylabs.api.ui.hJ;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x09f0;
    L_0x09db:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x09e0:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x09f2;
    L_0x09e6:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x09ea:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x09f0:
        r2 = r6;
        goto L_0x09e0;
    L_0x09f2:
        r1 = r6;
        goto L_0x09ea;
    L_0x09f4:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0a12;
    L_0x09f8:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create TextArea2 - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0a12:
        r3 = new com.konylabs.api.ui.hy;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0a33;
    L_0x0a1e:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x0a23:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x0a35;
    L_0x0a29:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0a2d:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x0a33:
        r2 = r6;
        goto L_0x0a23;
    L_0x0a35:
        r1 = r6;
        goto L_0x0a2d;
    L_0x0a37:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0a55;
    L_0x0a3b:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling Create Segmented UI - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0a55:
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r14[r5];
        r2 = (com.konylabs.vm.LuaTable) r2;
        r4 = 0;
        r0 = ny0k.bO.m4762a(r0, r1, r2, r4);
        goto L_0x0025;
    L_0x0a69:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0a87;
    L_0x0a6d:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling create HorizantelImageStrip2 - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0a87:
        r3 = new com.konylabs.api.ui.fX;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0aa8;
    L_0x0a93:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x0a98:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x0aaa;
    L_0x0a9e:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0aa2:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x0aa8:
        r2 = r6;
        goto L_0x0a98;
    L_0x0aaa:
        r1 = r6;
        goto L_0x0aa2;
    L_0x0aac:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0aca;
    L_0x0ab0:
        r0 = "WindowsLib";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Calling create ImageGallery2 - ";
        r1 = r1.append(r2);
        r2 = r14[r7];
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
    L_0x0aca:
        r3 = new com.konylabs.api.ui.gx;
        r0 = r14[r7];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r14[r8];
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r2) goto L_0x0aeb;
    L_0x0ad6:
        r1 = r14[r8];
        r1 = (com.konylabs.vm.LuaTable) r1;
        r2 = r1;
    L_0x0adb:
        r1 = r14[r5];
        r4 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r4) goto L_0x0aed;
    L_0x0ae1:
        r1 = r14[r5];
        r1 = (com.konylabs.vm.LuaTable) r1;
    L_0x0ae5:
        r3.<init>(r0, r2, r1);
        r0 = r3;
        goto L_0x0025;
    L_0x0aeb:
        r2 = r6;
        goto L_0x0adb;
    L_0x0aed:
        r1 = r6;
        goto L_0x0ae5;
    L_0x0aef:
        com.konylabs.api.ui.eA.m4184b(r14);
        r0 = r6;
        goto L_0x0025;
    L_0x0af5:
        r6 = new java.lang.Object[r8];
        r6[r7] = r0;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.R.execute(int, java.lang.Object[]):java.lang.Object[]");
    }

    public final String[] getMethods() {
        return new String[]{"Form", "Skin", "Button", "RadioButtonGroup", "CheckBoxGroup", "Box", "Label", "TextField", "Alert", "ListBox", "Chart", "Image", "Table", "Camera", "CardGroup", "Advertisement", "TabPane", "Calendar", "Line", "ComboBox", "HorizontalImageStrip", "Gallery", "TextArea", "SegmentedUI", "Link", "setlaunchstatus", "openurl", "openmediaurl", "Map", "Browser", "RichText", "Popup", "DataGrid", "Slider", "Chart", "showloadingscreen", "dismissloadingscreen", "PickerView", "ScrollableBox", "Chart2D3D", "Form2", "Image2", "TextBox2", "TextArea2", "SegmentedUI2", "HorizontalImageStrip2", "ImageGallery2", "dismissAlert"};
    }

    public final String getNameSpace() {
        return "window";
    }
}
