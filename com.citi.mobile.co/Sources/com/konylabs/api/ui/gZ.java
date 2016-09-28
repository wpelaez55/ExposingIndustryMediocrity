package com.konylabs.api.ui;

import android.util.Log;
import android.view.View;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Iterator;
import java.util.Vector;
import ny0k.aG;
import ny0k.bY;
import ny0k.cN;
import ny0k.cr;

public final class gZ extends eO {
    public static String f4557A;
    public static String f4558B;
    public static String f4559C;
    public static String f4560D;
    private static String f4561P;
    private static String f4562Q;
    private static String f4563R;
    private static String f4564S;
    private static String f4565T;
    private static String f4566U;
    private static String f4567V;
    private static String f4568W;
    private static String f4569X;
    private static String f4570Y;
    private static String f4571Z;
    private static String aa;
    private static String ab;
    private static String ac;
    private static String ad;
    private static String ae;
    private static String af;
    public static String f4572z;
    private int ag;
    private int ah;
    private int ai;
    private LuaWidget aj;
    private aG ak;
    private int al;
    private int am;
    private LuaWidget an;
    private Vector ao;
    private Vector ar;

    static {
        f4561P = "scrolldirection";
        f4562Q = "containerheightreference";
        f4563R = "containerheight";
        f4564S = "grabtouchevents";
        f4565T = "showscrollbars";
        f4572z = "scrollingevents";
        f4557A = "onreachingbegining";
        f4558B = "onreachingend";
        f4559C = "onpull";
        f4560D = "onpush";
        f4566U = "enablescrollbypage";
        f4567V = "setfadingedgelength";
        f4568W = "showfadingedges";
        f4569X = "headeroverlap";
        f4570Y = "footeroverlap";
        f4571Z = "pulltorefreshi18nkey";
        aa = "releasetopullrefreshi18nkey";
        ab = "pushtorefreshi18nkey";
        ac = "releasetopushrefreshi18nkey";
        ad = "pulltorefreshskin";
        ae = "pushtorefreshskin";
        af = "enablescrolling";
        if (KonyMain.m4057C()) {
            f4561P = "scrollDirection";
            f4562Q = "containerHeightReference";
            f4563R = "containerHeight";
            f4564S = "grabtouchEvents";
            f4565T = "showScrollbars";
            f4572z = "scrollingEvents";
            f4557A = "onReachingBegining";
            f4558B = "onReachingEnd";
            f4559C = "onPull";
            f4560D = "onPush";
            f4566U = "enableScrollByPage";
            f4567V = "setFadingEdgeLength";
            f4568W = "showFadingEdges";
            f4569X = "headerOverlap";
            f4570Y = "footerOverlap";
            f4571Z = "pullToRefreshI18NKey";
            aa = "releaseToPullRefreshI18NKey";
            ab = "pushToRefreshI18NKey";
            ac = "releaseToPushRefreshI18NKey";
            ad = "pullToRefreshSkin";
            ae = "pushToRefreshSkin";
            af = "enableScrolling";
        }
    }

    public gZ(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        this.ak = new hb(this);
        this.al = 0;
        this.am = 0;
        this.bRegisterForHeightChange = true;
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        luaTable.getTable(ATTR_WIDGET_ID);
        LuaNil table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(c);
        if (table != LuaNil.nil) {
            super.setTable(c, table);
        }
        table = luaTable.getTable(b);
        if (table != LuaNil.nil) {
            super.setTable(b, table);
            this.n = ((Double) table).intValue();
        }
        table = luaTable.getTable(f4565T);
        if (table != LuaNil.nil) {
            super.setTable(f4565T, table);
        }
        table = luaTable.getTable(f4572z);
        if (table != LuaNil.nil) {
            super.setTable(f4572z, table);
        }
        table = luaTable.getTable(f4566U);
        if (table != LuaNil.nil) {
            super.setTable(f4566U, table);
        }
        table = luaTable.getTable(f4561P);
        if (table != LuaNil.nil) {
            super.setTable(f4561P, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table);
        }
        table = luaTable.getTable(f4571Z);
        if (table != LuaNil.nil) {
            super.setTable(f4571Z, table);
        }
        table = luaTable.getTable(aa);
        if (table != LuaNil.nil) {
            super.setTable(aa, table);
        }
        table = luaTable.getTable(ab);
        if (table != LuaNil.nil) {
            super.setTable(ab, table);
        }
        table = luaTable.getTable(ac);
        if (table != LuaNil.nil) {
            super.setTable(ac, table);
        }
        table = luaTable.getTable(ad);
        if (table != LuaNil.nil) {
            super.setTable(ad, table);
        }
        table = luaTable.getTable(ae);
        if (table != LuaNil.nil) {
            super.setTable(ae, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table);
            }
            table = luaTable2.getTable(d);
            if (table != LuaNil.nil) {
                super.setTable(d, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
            table = luaTable2.getTable(e);
            if (table != LuaNil.nil) {
                super.setTable(e, table);
            }
            table = luaTable2.getTable(f4563R);
            if (table != LuaNil.nil) {
                super.setTable(f4563R, table);
            }
            table = luaTable2.getTable(f4562Q);
            if (table != LuaNil.nil) {
                super.setTable(f4562Q, table);
            }
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(f);
            if (table != LuaNil.nil) {
                super.setTable(f, table);
            }
            table = luaTable3.getTable(f4567V);
            if (table != LuaNil.nil) {
                super.setTable(f4567V, table);
            }
            table = luaTable3.getTable(f4568W);
            if (table != LuaNil.nil) {
                super.setTable(f4568W, table);
            }
            table = luaTable3.getTable(f4569X);
            if (table != LuaNil.nil) {
                super.setTable(f4569X, table);
            }
            table = luaTable3.getTable(f4570Y);
            if (table != LuaNil.nil) {
                super.setTable(f4570Y, table);
            }
        }
    }

    private void m4841c(Object obj) {
        String str = obj instanceof String ? (String) obj : null;
        if (this.g instanceof cW) {
            ((cW) this.g).m2858c(str);
        }
    }

    private void m4842d(Object obj) {
        String str = obj instanceof String ? (String) obj : null;
        if (this.g instanceof cW) {
            ((cW) this.g).m2861d(str);
        }
    }

    private void m4843e(Object obj) {
        String str = obj instanceof String ? (String) obj : null;
        if (this.g instanceof cW) {
            ((cW) this.g).m2864e(str);
        }
    }

    private void m4844g(Object obj) {
        String str = obj instanceof String ? (String) obj : null;
        if (this.g instanceof cW) {
            ((cW) this.g).m2867f(str);
        }
    }

    private void m4845x() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.g.m136c(this.x);
        }
    }

    public final void m4846a(int i) {
        if (this.E == KONY_WIDGET_BACKUP) {
            this.ah = cW.f2720k;
            this.ai = i;
            return;
        }
        this.g.m152h(i);
    }

    protected final void m4847a(Object obj, Object obj2) {
        dB dBVar = null;
        if (this.E != KONY_WIDGET_BACKUP) {
            Object intern = ((String) obj).intern();
            if (intern == f4561P) {
                if (obj2 != LuaNil.nil) {
                    this.ag = ((Double) obj2).intValue();
                    this.g.m147f(this.ag);
                }
            } else if (intern == f4564S) {
                if (obj2 != LuaNil.nil) {
                    C0174B c0174b = this.g;
                    ((Boolean) obj2).booleanValue();
                    c0174b.m160k();
                }
            } else if (intern == f4565T) {
                if (obj2 != LuaNil.nil) {
                    this.g.m148f(((Boolean) obj2).booleanValue());
                }
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT) {
                if (obj2 != LuaNil.nil) {
                    float floatValue = ((Double) obj2).floatValue();
                    if (this.I instanceof eO) {
                        this.x = ((eO) this.I).m4231m();
                        if (((eO) this.I).f3728q == 0) {
                            this.x = (this.x * floatValue) / 100.0f;
                        }
                    }
                    if (this.g.getOrientation() == 0 && this.l) {
                        m4849b();
                    }
                    m4845x();
                    if (this.G) {
                        setWeight();
                        this.g.m140d();
                        ((eO) this.I).m4238t();
                    }
                }
            } else if (intern == f4567V) {
                this.g.m149g(((Double) obj2).intValue());
            } else if (intern == f4568W) {
                this.g.m153h(((Boolean) obj2).booleanValue());
            } else if (intern == ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
                if (obj2 != null && (obj2 instanceof LuaTable)) {
                    this.g.m133b(m3943a((LuaTable) obj2));
                } else if (obj2 == null || obj2 == LuaNil.nil) {
                    this.g.m133b(BuildConfig.FLAVOR);
                }
            } else if (intern == f4571Z) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    obj2 = null;
                }
                m4841c(obj2);
            } else if (intern == aa) {
                if (!(obj2 == null || obj2 == LuaNil.nil)) {
                    r1 = obj2;
                }
                m4842d(r1);
            } else if (intern == ab) {
                if (!(obj2 == null || obj2 == LuaNil.nil)) {
                    r1 = obj2;
                }
                m4843e(r1);
            } else if (intern == ac) {
                if (!(obj2 == null || obj2 == LuaNil.nil)) {
                    r1 = obj2;
                }
                m4844g(r1);
            } else if (intern == ad) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    r2 = cN.m2139a(obj2);
                    if (this.g instanceof cW) {
                        r0 = (cW) this.g;
                        if (r2 != null) {
                            dBVar = r2;
                        }
                        r0.m2857c(dBVar);
                    }
                } else if (this.g instanceof cW) {
                    ((cW) this.g).m2857c(null);
                }
            } else if (intern == ae) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    r2 = cN.m2139a(obj2);
                    if (this.g instanceof cW) {
                        r0 = (cW) this.g;
                        if (r2 != null) {
                            dBVar = r2;
                        }
                        r0.m2860d(dBVar);
                    }
                } else if (this.g instanceof cW) {
                    ((cW) this.g).m2860d(null);
                }
            } else if (intern == af) {
                LuaNil a = cr.m2201a(obj2, 0);
                if (a != null && a != LuaNil.nil) {
                    this.g.m163l(((Boolean) a).booleanValue());
                }
            } else {
                super.m4210a(intern, obj2);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m4848a(java.lang.Object[] r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r4 = r8.length;	 Catch:{ all -> 0x004b }
        r5 = new java.util.Vector;	 Catch:{ all -> 0x004b }
        r5.<init>();	 Catch:{ all -> 0x004b }
        r1 = 1;
        r3 = r1;
    L_0x0009:
        if (r3 >= r4) goto L_0x0065;
    L_0x000b:
        r1 = r8[r3];	 Catch:{ all -> 0x004b }
        r2 = com.konylabs.vm.LuaNil.nil;	 Catch:{ all -> 0x004b }
        if (r1 == r2) goto L_0x0028;
    L_0x0011:
        r1 = r8[r3];	 Catch:{ all -> 0x004b }
        r1 = (com.konylabs.api.ui.LuaWidget) r1;	 Catch:{ all -> 0x004b }
        r2 = r1 instanceof ny0k.bO;	 Catch:{ all -> 0x004b }
        if (r2 == 0) goto L_0x002c;
    L_0x0019:
        r0 = r1;
        r0 = (ny0k.bO) r0;	 Catch:{ all -> 0x004b }
        r2 = r0;
        r2 = r2.m4836k();	 Catch:{ all -> 0x004b }
        if (r2 == 0) goto L_0x002c;
    L_0x0023:
        r7.an = r1;	 Catch:{ all -> 0x004b }
    L_0x0025:
        r5.add(r1);	 Catch:{ all -> 0x004b }
    L_0x0028:
        r1 = r3 + 1;
        r3 = r1;
        goto L_0x0009;
    L_0x002c:
        r2 = r1 instanceof com.konylabs.api.ui.eO;	 Catch:{ all -> 0x004b }
        if (r2 == 0) goto L_0x0025;
    L_0x0030:
        r0 = r1;
        r0 = (com.konylabs.api.ui.eO) r0;	 Catch:{ all -> 0x004b }
        r2 = r0;
        r6 = r2.m4228j();	 Catch:{ all -> 0x004b }
        if (r6 == 0) goto L_0x004e;
    L_0x003a:
        r1 = r7.ao;	 Catch:{ all -> 0x004b }
        if (r1 != 0) goto L_0x0045;
    L_0x003e:
        r1 = new java.util.Vector;	 Catch:{ all -> 0x004b }
        r1.<init>();	 Catch:{ all -> 0x004b }
        r7.ao = r1;	 Catch:{ all -> 0x004b }
    L_0x0045:
        r1 = r7.ao;	 Catch:{ all -> 0x004b }
        r1.add(r2);	 Catch:{ all -> 0x004b }
        goto L_0x0028;
    L_0x004b:
        r1 = move-exception;
        monitor-exit(r7);
        throw r1;
    L_0x004e:
        r6 = r2.m4229k();	 Catch:{ all -> 0x004b }
        if (r6 == 0) goto L_0x0025;
    L_0x0054:
        r1 = r7.ar;	 Catch:{ all -> 0x004b }
        if (r1 != 0) goto L_0x005f;
    L_0x0058:
        r1 = new java.util.Vector;	 Catch:{ all -> 0x004b }
        r1.<init>();	 Catch:{ all -> 0x004b }
        r7.ar = r1;	 Catch:{ all -> 0x004b }
    L_0x005f:
        r1 = r7.ar;	 Catch:{ all -> 0x004b }
        r1.add(r2);	 Catch:{ all -> 0x004b }
        goto L_0x0028;
    L_0x0065:
        r1 = r5.size();	 Catch:{ all -> 0x004b }
        if (r1 != 0) goto L_0x007b;
    L_0x006b:
        r1 = r7.E;	 Catch:{ all -> 0x004b }
        r2 = KONY_WIDGET_RESTORE;	 Catch:{ all -> 0x004b }
        if (r1 != r2) goto L_0x007b;
    L_0x0071:
        r1 = new com.konylabs.api.ui.hc;	 Catch:{ all -> 0x004b }
        r1.<init>(r7);	 Catch:{ all -> 0x004b }
        com.konylabs.android.KonyMain.m4094a(r1);	 Catch:{ all -> 0x004b }
    L_0x0079:
        monitor-exit(r7);
        return;
    L_0x007b:
        r1 = 0;
        r2 = 0;
        r2 = r8[r2];	 Catch:{ all -> 0x004b }
        r5.add(r1, r2);	 Catch:{ all -> 0x004b }
        r1 = r5.toArray();	 Catch:{ all -> 0x004b }
        super.m4211a(r1);	 Catch:{ all -> 0x004b }
        goto L_0x0079;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.ui.gZ.a(java.lang.Object[]):void");
    }

    protected final void m4849b() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.g.m129b((this.m * this.x) / 100.0f);
        }
    }

    public final void m4850b(int i) {
        if (this.E == KONY_WIDGET_BACKUP) {
            this.ah = cW.f2721l;
            this.ai = i;
            return;
        }
        this.g.m156i(i);
    }

    public final void m4851b(Object obj) {
        if (obj != null) {
            if (obj instanceof LuaWidget) {
                LuaWidget luaWidget = (LuaWidget) obj;
                if (this.E == KONY_WIDGET_BACKUP) {
                    this.ah = cW.f2723n;
                    this.aj = luaWidget;
                    return;
                }
                KonyMain.m4094a(new ha(this, luaWidget));
            } else if (KonyMain.f3657e) {
                Log.d("LuaScrollableBox", "Not a valid widget argument for ScrollableBox.scrollToWidget()");
            }
        }
    }

    public final synchronized void m4852b(Object obj, Object obj2) {
        LuaWidget luaWidget = (LuaWidget) obj;
        if (luaWidget instanceof eO) {
            eO eOVar = (eO) luaWidget;
            if (eOVar.m4228j()) {
                if (this.ao != null) {
                    this.ao.remove(eOVar);
                }
                luaWidget.setParent(null);
            } else if (eOVar.m4229k()) {
                if (this.ar != null) {
                    this.ar.remove(eOVar);
                }
                luaWidget.setParent(null);
            }
        }
        super.m4217b(obj, obj2);
    }

    protected final void m4853b(Object[] objArr) {
        if (this.an != null && (this.an instanceof bY)) {
            bY bYVar = (bY) this.an;
            bYVar.m4958c(this.ao);
            bYVar.m4960d(this.ar);
        }
        super.m4218b(objArr);
    }

    public final void cleanup() {
        super.cleanup();
        this.aj = null;
    }

    public final String getType() {
        return "ScrollableBox";
    }

    public final View getWidget() {
        int i = 0;
        boolean z = true;
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            int intValue;
            dB a2;
            int i2;
            this.g = new cW(KonyMain.getActContext());
            ((cW) this.g).m123a(getID());
            Object table = super.getTable(ATTR_WIDGET_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.g.m122a(a);
                }
            } else {
                this.g.m122a(null);
            }
            LuaNil table2 = super.getTable(c);
            if (table2 != LuaNil.nil) {
                if (((String) table2).compareToIgnoreCase("vertical") == 0) {
                    this.q = C0174B.f182b;
                    this.g.setOrientation(this.q);
                } else {
                    this.q = 0;
                    this.g.setOrientation(this.q);
                }
            }
            table2 = super.getTable(f4561P);
            if (table2 != LuaNil.nil) {
                this.ag = ((Double) table2).intValue();
                this.g.m147f(this.ag);
            }
            table2 = super.getTable(e);
            if (table2 != LuaNil.nil) {
                intValue = ((Double) table2).intValue();
                if (intValue == 1) {
                    this.g.m116a(C0174B.f183c);
                } else if (intValue == 2) {
                    this.g.m116a(C0174B.f185e);
                } else if (intValue == 3) {
                    this.g.m116a(C0174B.f184d);
                }
            }
            table2 = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table2 != LuaNil.nil) {
                this.g.m130b(m3942a(((Boolean) table2).booleanValue()));
            }
            table2 = super.getTable(f4562Q);
            if (table2 != LuaNil.nil) {
                this.M = ((Double) table2).intValue();
                C0174B c0174b = this.g;
                intValue = this.M;
                C0174B.m113j();
            }
            table2 = super.getTable(f4563R);
            if (table2 != LuaNil.nil) {
                this.N = (float) ((Double) table2).intValue();
                if (this.ag == cW.f2718i || this.ag == cW.f2719j) {
                    m4234p();
                }
            }
            table2 = super.getTable(af);
            if (table2 != LuaNil.nil) {
                this.g.m163l(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(f);
            if (table2 != LuaNil.nil) {
                a_((LuaTable) table2);
            } else {
                this.g.m124a(null);
                this.g.m121a(null);
            }
            table2 = super.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                this.g.m127a(convertMarginsToPixels(table2, this.I));
            }
            table2 = super.getTable(ATTR_WIDGET_PADDING);
            if (table2 != LuaNil.nil) {
                this.g.m135b(convertPaddingToPixels(table2, this.I));
            }
            table2 = super.getTable(b);
            if (table2 != LuaNil.nil) {
                intValue = ((Double) table2).intValue();
                if (intValue == 1) {
                    this.g.m139c(true);
                } else if (intValue == 2) {
                    this.g.m142d(true);
                }
            }
            table2 = super.getTable(d);
            if (table2 != LuaNil.nil) {
                if (table2 instanceof Boolean) {
                    this.l = ((Boolean) table2).booleanValue();
                } else if (table2 instanceof String) {
                    this.l = ((String) table2).equalsIgnoreCase("true");
                }
                this.g.m157i(this.l);
            }
            table2 = super.getTable(a);
            if (table2 != LuaNil.nil) {
                this.p = table2;
                this.g.setClickable(true);
                this.g.setOnClickListener(this.v);
            }
            table = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.g.m132b(a);
                }
            } else {
                this.g.m132b(null);
            }
            table2 = super.getTable(f4565T);
            if (table2 != LuaNil.nil) {
                this.g.m148f(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(f4566U);
            if (table2 != LuaNil.nil) {
                this.g.m150g(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(f4572z);
            if (table2 != LuaNil.nil) {
                LuaTable luaTable = (LuaTable) table2;
                boolean z2 = luaTable.getTable(f4557A) != LuaNil.nil;
                if (luaTable.getTable(f4558B) != LuaNil.nil) {
                    z2 = true;
                }
                if (luaTable.getTable(f4559C) != LuaNil.nil) {
                    z2 = true;
                }
                if (luaTable.getTable(f4560D) == LuaNil.nil) {
                    z = z2;
                }
                if (z) {
                    this.g.m125a(this.ak);
                }
            }
            table2 = super.getTable(f4571Z);
            if (table2 != LuaNil.nil) {
                m4841c(table2);
            }
            table2 = super.getTable(aa);
            if (table2 != LuaNil.nil) {
                m4842d(table2);
            }
            table2 = super.getTable(ab);
            if (table2 != LuaNil.nil) {
                m4843e(table2);
            }
            table2 = super.getTable(ac);
            if (table2 != LuaNil.nil) {
                m4844g(table2);
            }
            table = super.getTable(ad);
            if (table != LuaNil.nil) {
                a2 = cN.m2139a(table);
                if (a2 != null && (this.g instanceof cW)) {
                    ((cW) this.g).m2857c(a2);
                }
            }
            table = super.getTable(ae);
            if (table != LuaNil.nil) {
                a2 = cN.m2139a(table);
                if (a2 != null && (this.g instanceof cW)) {
                    ((cW) this.g).m2860d(a2);
                }
            }
            if (this.I instanceof eO) {
                this.x = ((eO) this.I).m4231m();
            }
            table2 = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table2 != LuaNil.nil) {
                float floatValue = ((Double) table2).floatValue();
                if ((this.I instanceof eO) && ((eO) this.I).f3728q == 0) {
                    this.x = (this.x * floatValue) / 100.0f;
                }
            }
            table2 = super.getTable(f4567V);
            if (table2 != LuaNil.nil) {
                this.g.m149g(((Double) table2).intValue());
            }
            table2 = super.getTable(f4568W);
            if (table2 != LuaNil.nil) {
                this.g.m153h(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(f4569X);
            if (table2 != LuaNil.nil) {
                this.g.m159j(((Boolean) table2).booleanValue());
            } else {
                this.g.m159j(false);
            }
            table2 = super.getTable(f4570Y);
            if (table2 != LuaNil.nil) {
                this.g.m161k(((Boolean) table2).booleanValue());
            } else {
                this.g.m161k(false);
            }
            synchronized (this) {
                this.E = KONY_WIDGET_RESTORE;
                if (this.an == null || !(this.an instanceof bY)) {
                    Iterator it;
                    if (this.ao != null) {
                        it = this.ao.iterator();
                        while (it.hasNext()) {
                            this.i.add((eO) it.next());
                        }
                    }
                    if (this.ar != null) {
                        it = this.ar.iterator();
                        while (it.hasNext()) {
                            this.i.add((eO) it.next());
                        }
                    }
                } else {
                    bY bYVar = (bY) this.an;
                    bYVar.m4958c(this.ao);
                    bYVar.m4960d(this.ar);
                }
                for (i2 = 0; i2 < this.i.size(); i2++) {
                    LuaWidget luaWidget = (LuaWidget) this.i.get(i2);
                    if (this.g.getOrientation() == 0 && this.l) {
                        luaWidget.setWeight();
                    }
                    m3945a(luaWidget, this.J);
                    luaWidget.setParent(this);
                    this.g.m131b(luaWidget.getWidget());
                }
            }
            table2 = super.getTable(f4563R);
            if (table2 != LuaNil.nil) {
                this.N = (float) ((Double) table2).intValue();
                if (this.ag == cW.f2718i || this.ag == cW.f2719j) {
                    m4234p();
                }
            }
            if (this.ah == cW.f2720k) {
                m4846a(this.ai);
            } else if (this.ah == cW.f2721l) {
                m4850b(this.ai);
            } else if (this.ah == cW.f2723n) {
                m4851b(this.aj);
            }
            if (this.g.getOrientation() == 0 && this.l) {
                m4849b();
            }
            i2 = this.w.size();
            while (i < i2) {
                aL aLVar = (aL) this.w.valueAt(i);
                this.g.m118a(aLVar.f475a, aLVar.f477c);
                i++;
            }
            m4845x();
            if (this.G) {
                setWeight();
            }
            if (this.s) {
                m4230l();
            }
            table2 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            if (table2 != LuaNil.nil && (table2 instanceof LuaTable)) {
                this.g.m133b(m3943a((LuaTable) table2));
            }
        }
        this.g.m143e();
        return this.g.m155i();
    }

    public final void onFormHeightChanged(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            O = i;
            if (this.ag == cW.f2718i || this.ag == cW.f2719j) {
                m4234p();
            }
        }
    }

    public final String toString() {
        return "LuaScrollableBox: " + getTable(ATTR_WIDGET_ID);
    }

    public final View m4854u() {
        return this.g.m164m();
    }

    public final void m4855v() {
        if (this.g != null) {
            this.al = this.g.m165n();
            this.am = this.g.m166o();
        }
    }

    public final void m4856w() {
        if (this.g != null) {
            this.g.m117a(this.al, this.am);
        }
    }
}
