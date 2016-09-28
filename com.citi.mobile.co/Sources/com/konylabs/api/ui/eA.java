package com.konylabs.api.ui;

import android.os.Looper;
import android.view.View;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public final class eA extends LuaWidget {
    public static String f3697a;
    public static String f3698b;
    private static String f3699c;
    private static String f3700d;
    private static String f3701e;
    private static String f3702f;
    private static String f3703h;
    private static String f3704i;
    private static String f3705j;
    private static ArrayList f3706k;
    private C0220v f3707g;
    private C0224z f3708l;

    static {
        f3697a = "alerthandler";
        f3698b = "alerttype";
        f3699c = "yeslabel";
        f3700d = "nolabel";
        f3701e = "alerttitle";
        f3702f = "alerticon";
        f3703h = "contentalignment";
        f3704i = "iconposition";
        f3705j = "align";
        f3706k = new ArrayList(3);
        if (KonyMain.m4057C()) {
            f3698b = "alertType";
            f3701e = "alertTitle";
            f3702f = "alertIcon";
            f3700d = "noLabel";
            f3699c = "yesLabel";
            f3697a = "alertHandler";
            f3703h = "contentAlignment";
            f3704i = "iconPosition";
        }
    }

    public eA(LuaTable luaTable, LuaTable luaTable2) {
        super(0, (luaTable2 != null ? luaTable2.map.size() : 0) + (luaTable != null ? luaTable.map.size() : 0), 1.0f, true);
        this.f3707g = null;
        this.f3708l = new eE(this);
        if (KonyMain.getActivityContext() != null) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                m4182a(luaTable, luaTable2);
            } else {
                KonyMain.m4094a(new eC(this, luaTable, luaTable2));
            }
        }
    }

    private eA(Object[] objArr) {
        super(10, 2, false);
        this.f3707g = null;
        this.f3708l = new eE(this);
        if (KonyMain.getActContext() == null || objArr.length < 3 || objArr.length > 7) {
            return;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m4185c(objArr);
        } else {
            KonyMain.m4094a(new eB(this, objArr));
        }
    }

    public static Object m4178a(Object[] objArr) {
        eA eAVar;
        if (objArr[0] instanceof LuaTable) {
            eAVar = new eA((LuaTable) objArr[0], objArr[1] != LuaNil.nil ? (LuaTable) objArr[1] : null);
        } else {
            eAVar = new eA(objArr);
        }
        eAVar.getClass();
        return new eF(eAVar, eAVar);
    }

    public static void m4179a() {
        if (f3706k.size() > 0) {
            Iterator it = f3706k.iterator();
            while (it.hasNext()) {
                ((C0220v) it.next()).m1587a(true);
            }
            f3706k.clear();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4182a(com.konylabs.vm.LuaTable r6, com.konylabs.vm.LuaTable r7) {
        /*
        r5 = this;
        r2 = 19;
        r4 = 1;
        r3 = 2;
        r0 = new com.konylabs.api.ui.v;
        r1 = com.konylabs.android.KonyMain.getActContext();
        r0.<init>(r1);
        r5.f3707g = r0;
        r0 = f3706k;
        r1 = r5.f3707g;
        r0.add(r1);
        if (r7 == 0) goto L_0x0058;
    L_0x0018:
        r0 = f3704i;
        r0 = r7.getTable(r0);
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x0032;
    L_0x0022:
        r1 = f3704i;
        super.setTable(r1, r0);
        r1 = r5.f3707g;
        r0 = (java.lang.Double) r0;
        r0 = r0.intValue();
        r1.m1584a(r0);
    L_0x0032:
        r0 = f3703h;
        r0 = r7.getTable(r0);
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 != r1) goto L_0x0046;
    L_0x003c:
        r0 = f3705j;
        r0 = r7.getTable(r0);
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x0058;
    L_0x0046:
        r1 = f3703h;
        super.setTable(r1, r0);
        r0 = (java.lang.Double) r0;
        r0 = r0.intValue();
        switch(r0) {
            case 1: goto L_0x0109;
            case 2: goto L_0x010f;
            case 3: goto L_0x0117;
            default: goto L_0x0054;
        };
    L_0x0054:
        r0 = r5.f3707g;
        r0.f1634e = r2;
    L_0x0058:
        r0 = "message";
        r0 = r6.getTable(r0);
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x006e;
    L_0x0062:
        r1 = "message";
        super.setTable(r1, r0);
        r1 = r5.f3707g;
        r0 = (java.lang.String) r0;
        r1.m1589b(r0);
    L_0x006e:
        r1 = -1;
        r0 = f3698b;
        r0 = r6.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x008c;
    L_0x0079:
        r1 = f3698b;
        super.setTable(r1, r0);
        r0 = (java.lang.Double) r0;
        r0 = r0.intValue();
        if (r0 != 0) goto L_0x011f;
    L_0x0086:
        r1 = r5.f3707g;
        r2 = 0;
        r1.f1630a = r2;
        r1 = r0;
    L_0x008c:
        r0 = f3701e;
        r0 = r6.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x00a2;
    L_0x0096:
        r2 = f3701e;
        super.setTable(r2, r0);
        r2 = r5.f3707g;
        r0 = (java.lang.String) r0;
        r2.m1586a(r0);
    L_0x00a2:
        r0 = f3699c;
        r0 = r6.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x00b9;
    L_0x00ac:
        r2 = f3699c;
        super.setTable(r2, r0);
        if (r1 != r3) goto L_0x0131;
    L_0x00b3:
        r1 = r5.f3707g;
        r0 = (java.lang.String) r0;
        r1.f1631b = r0;
    L_0x00b9:
        r0 = f3700d;
        r0 = r6.getTable(r0);
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x00ce;
    L_0x00c3:
        r1 = f3700d;
        super.setTable(r1, r0);
        r1 = r5.f3707g;
        r0 = (java.lang.String) r0;
        r1.f1632c = r0;
    L_0x00ce:
        r0 = f3702f;
        r0 = r6.getTable(r0);
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 != r1) goto L_0x00e2;
    L_0x00d8:
        r0 = "icon";
        r0 = r6.getTable(r0);
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x00ee;
    L_0x00e2:
        r1 = f3702f;
        super.setTable(r1, r0);
        r1 = r5.f3707g;
        r0 = (java.lang.String) r0;
        r1.m1590c(r0);
    L_0x00ee:
        r0 = f3697a;
        r0 = r6.getTable(r0);
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x00fd;
    L_0x00f8:
        r1 = f3697a;
        super.setTable(r1, r0);
    L_0x00fd:
        r0 = r5.f3707g;
        r1 = r5.f3708l;
        r0.f1633d = r1;
        r0 = r5.f3707g;
        r0.m1583a();
        return;
    L_0x0109:
        r0 = r5.f3707g;
        r0.f1634e = r2;
        goto L_0x0058;
    L_0x010f:
        r0 = r5.f3707g;
        r1 = 17;
        r0.f1634e = r1;
        goto L_0x0058;
    L_0x0117:
        r0 = r5.f3707g;
        r1 = 21;
        r0.f1634e = r1;
        goto L_0x0058;
    L_0x011f:
        if (r0 != r4) goto L_0x0128;
    L_0x0121:
        r1 = r5.f3707g;
        r1.f1630a = r4;
        r1 = r0;
        goto L_0x008c;
    L_0x0128:
        if (r0 != r3) goto L_0x012e;
    L_0x012a:
        r1 = r5.f3707g;
        r1.f1630a = r3;
    L_0x012e:
        r1 = r0;
        goto L_0x008c;
    L_0x0131:
        r1 = r5.f3707g;
        r0 = (java.lang.String) r0;
        r1.m1591d(r0);
        goto L_0x00b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.ui.eA.a(com.konylabs.vm.LuaTable, com.konylabs.vm.LuaTable):void");
    }

    public static void m4184b(Object[] objArr) {
        if (objArr != null && objArr.length > 0 && (objArr[0] instanceof eF)) {
            KonyMain.m4094a(new eD(((eF) objArr[0]).f1249a));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4185c(java.lang.Object[] r9) {
        /*
        r8 = this;
        r7 = 4;
        r6 = 3;
        r3 = 0;
        r4 = 1;
        r2 = 2;
        r0 = new com.konylabs.api.ui.v;
        r1 = com.konylabs.android.KonyMain.getActContext();
        r0.<init>(r1);
        r8.f3707g = r0;
        r0 = r9.length;
        r1 = 6;
        if (r0 <= r1) goto L_0x0079;
    L_0x0014:
        r0 = 6;
        r0 = r9[r0];
        if (r0 == 0) goto L_0x0079;
    L_0x0019:
        r0 = 6;
        r0 = r9[r0];
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x0079;
    L_0x0020:
        r0 = 6;
        r0 = r9[r0];
        r0 = r0 instanceof com.konylabs.vm.LuaTable;
        if (r0 == 0) goto L_0x0079;
    L_0x0027:
        r0 = 6;
        r0 = r9[r0];
        r0 = (com.konylabs.vm.LuaTable) r0;
        r1 = r0.map;
        r5 = "icon";
        r1 = r1.get(r5);
        r5 = com.konylabs.vm.LuaNil.nil;
        if (r1 != r5) goto L_0x0044;
    L_0x0038:
        r1 = r0.map;
        r5 = f3702f;
        r1 = r1.get(r5);
        r5 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r5) goto L_0x004b;
    L_0x0044:
        r5 = r8.f3707g;
        r1 = (java.lang.String) r1;
        r5.m1590c(r1);
    L_0x004b:
        r1 = r0.map;
        r5 = f3705j;
        r1 = r1.get(r5);
        if (r1 == 0) goto L_0x0187;
    L_0x0055:
        r1 = (java.lang.Double) r1;
        r1 = r1.intValue();
    L_0x005b:
        switch(r1) {
            case 1: goto L_0x0139;
            case 2: goto L_0x0141;
            case 3: goto L_0x0149;
            default: goto L_0x005e;
        };
    L_0x005e:
        r1 = r8.f3707g;
        r5 = 19;
        r1.f1634e = r5;
    L_0x0064:
        r0 = r0.map;
        r1 = f3704i;
        r0 = r0.get(r1);
        if (r0 == 0) goto L_0x0079;
    L_0x006e:
        r1 = r8.f3707g;
        r0 = (java.lang.Double) r0;
        r0 = r0.intValue();
        r1.m1584a(r0);
    L_0x0079:
        r0 = r9[r3];
        if (r0 == 0) goto L_0x0093;
    L_0x007d:
        r0 = r9[r3];
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x0093;
    L_0x0083:
        r0 = "message";
        r1 = r9[r3];
        super.setTable(r0, r1);
        r1 = r8.f3707g;
        r0 = r9[r3];
        r0 = (java.lang.String) r0;
        r1.m1589b(r0);
    L_0x0093:
        r0 = r9[r4];
        if (r0 == 0) goto L_0x00aa;
    L_0x0097:
        r0 = r9[r4];
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x00aa;
    L_0x009d:
        r0 = f3697a;
        r1 = r9[r4];
        super.setTable(r0, r1);
        r0 = r8.f3707g;
        r1 = r8.f3708l;
        r0.f1633d = r1;
    L_0x00aa:
        r1 = -1;
        r0 = r9[r2];
        if (r0 == 0) goto L_0x00d5;
    L_0x00af:
        r0 = r9[r2];
        r5 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r5) goto L_0x00d5;
    L_0x00b5:
        r0 = f3698b;
        r5 = r9[r2];
        super.setTable(r0, r5);
        r0 = r9[r2];
        r0 = r0 instanceof java.lang.String;
        if (r0 == 0) goto L_0x0160;
    L_0x00c2:
        r0 = r9[r2];
        r0 = (java.lang.String) r0;
        r0 = r0.intern();
        r5 = "info";
        if (r0 != r5) goto L_0x0151;
    L_0x00ce:
        r1 = r3;
    L_0x00cf:
        if (r1 != 0) goto L_0x016a;
    L_0x00d1:
        r0 = r8.f3707g;
        r0.f1630a = r3;
    L_0x00d5:
        r0 = r9.length;
        if (r0 <= r6) goto L_0x00f3;
    L_0x00d8:
        r0 = r9[r6];
        if (r0 == 0) goto L_0x00f3;
    L_0x00dc:
        r0 = r9[r6];
        r3 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r3) goto L_0x00f3;
    L_0x00e2:
        r0 = f3699c;
        r3 = r9[r6];
        super.setTable(r0, r3);
        if (r1 != r2) goto L_0x017a;
    L_0x00eb:
        r1 = r8.f3707g;
        r0 = r9[r6];
        r0 = (java.lang.String) r0;
        r1.f1631b = r0;
    L_0x00f3:
        r0 = r9.length;
        if (r0 <= r7) goto L_0x010f;
    L_0x00f6:
        r0 = r9[r7];
        if (r0 == 0) goto L_0x010f;
    L_0x00fa:
        r0 = r9[r7];
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x010f;
    L_0x0100:
        r0 = f3700d;
        r1 = r9[r7];
        super.setTable(r0, r1);
        r1 = r8.f3707g;
        r0 = r9[r7];
        r0 = (java.lang.String) r0;
        r1.f1632c = r0;
    L_0x010f:
        r0 = r9.length;
        r1 = 5;
        if (r0 <= r1) goto L_0x0133;
    L_0x0113:
        r0 = 5;
        r0 = r9[r0];
        if (r0 == 0) goto L_0x0133;
    L_0x0118:
        r0 = 5;
        r0 = r9[r0];
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x0133;
    L_0x011f:
        r0 = f3701e;
        r1 = 5;
        r1 = r9[r1];
        super.setTable(r0, r1);
        r0 = r8.f3707g;
        r1 = 5;
        r1 = r9[r1];
        r1 = r1.toString();
        r0.m1586a(r1);
    L_0x0133:
        r0 = r8.f3707g;
        r0.m1583a();
        return;
    L_0x0139:
        r1 = r8.f3707g;
        r5 = 19;
        r1.f1634e = r5;
        goto L_0x0064;
    L_0x0141:
        r1 = r8.f3707g;
        r5 = 17;
        r1.f1634e = r5;
        goto L_0x0064;
    L_0x0149:
        r1 = r8.f3707g;
        r5 = 21;
        r1.f1634e = r5;
        goto L_0x0064;
    L_0x0151:
        r5 = "error";
        if (r0 != r5) goto L_0x0158;
    L_0x0155:
        r1 = r4;
        goto L_0x00cf;
    L_0x0158:
        r5 = "confirmation";
        if (r0 != r5) goto L_0x0185;
    L_0x015c:
        r0 = r2;
    L_0x015d:
        r1 = r0;
        goto L_0x00cf;
    L_0x0160:
        r0 = r9[r2];
        r0 = (java.lang.Double) r0;
        r1 = r0.intValue();
        goto L_0x00cf;
    L_0x016a:
        if (r1 != r4) goto L_0x0172;
    L_0x016c:
        r0 = r8.f3707g;
        r0.f1630a = r4;
        goto L_0x00d5;
    L_0x0172:
        if (r1 != r2) goto L_0x00d5;
    L_0x0174:
        r0 = r8.f3707g;
        r0.f1630a = r2;
        goto L_0x00d5;
    L_0x017a:
        r1 = r8.f3707g;
        r0 = r9[r6];
        r0 = (java.lang.String) r0;
        r1.m1591d(r0);
        goto L_0x00f3;
    L_0x0185:
        r0 = r1;
        goto L_0x015d;
    L_0x0187:
        r1 = r4;
        goto L_0x005b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.ui.eA.c(java.lang.Object[]):void");
    }

    public final void cleanup() {
    }

    public final LuaWidget createClone() {
        return null;
    }

    public final LuaWidget getChildWidget(String str) {
        return null;
    }

    public final ArrayList getChildWidgets() {
        return null;
    }

    public final String getID() {
        return null;
    }

    public final LuaWidget getParent() {
        return null;
    }

    public final Hashtable getProperties() {
        return null;
    }

    public final Object getProperty(String str) {
        return null;
    }

    public final String getType() {
        return "Alert";
    }

    public final View getWidget() {
        return null;
    }

    public final int getWidth() {
        return KonyMain.getActContext().m4166o();
    }

    public final void handleOrientationChange(int i) {
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocus() {
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        if (((String) obj).intern() == f3697a && obj2 != null && obj2 != LuaNil.nil && this.f3707g != null) {
            this.f3707g.f1633d = this.f3708l;
        }
    }

    public final void setVisibility(boolean z) {
    }

    public final void setWeight() {
    }

    public final void setWidth(int i) {
    }

    public final String toString() {
        return "LuaAlert: " + getTable(ATTR_WIDGET_ID);
    }
}
