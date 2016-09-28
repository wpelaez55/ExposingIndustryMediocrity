package ny0k;

import android.support.v4.util.LruCache;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.api.ui.eO;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaTable;
import com.konylabs.vmintf.C0254b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class cr {
    private static LruCache f2309a;

    public static int m2199a(int i, int i2) {
        return KonyMain.m4056B() ? i2 == 0 ? i - 1 : i2 == 1 ? i + 1 : i : i;
    }

    public static Double m2200a(int i) {
        if (f2309a == null) {
            f2309a = new cs(50);
        }
        return (Double) f2309a.get(Integer.valueOf(i));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m2201a(java.lang.Object r4, int r5) {
        /*
        r1 = 0;
        r0 = 1;
        r2 = com.konylabs.android.KonyMain.m4057C();
        if (r2 == 0) goto L_0x000f;
    L_0x0008:
        if (r4 == 0) goto L_0x000e;
    L_0x000a:
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r4 != r2) goto L_0x0010;
    L_0x000e:
        r4 = 0;
    L_0x000f:
        return r4;
    L_0x0010:
        switch(r5) {
            case 0: goto L_0x0022;
            case 1: goto L_0x0028;
            case 2: goto L_0x002d;
            default: goto L_0x0013;
        };
    L_0x0013:
        r0 = r1;
    L_0x0014:
        if (r0 != 0) goto L_0x000f;
    L_0x0016:
        r0 = r4 instanceof java.lang.String;
        if (r0 != 0) goto L_0x001d;
    L_0x001a:
        r0 = 2;
        if (r5 != r0) goto L_0x0032;
    L_0x001d:
        r4 = m2208b(r4, r5);
        goto L_0x000f;
    L_0x0022:
        r2 = r4 instanceof java.lang.Boolean;
        if (r2 != 0) goto L_0x0014;
    L_0x0026:
        r0 = r1;
        goto L_0x0014;
    L_0x0028:
        r2 = r4 instanceof java.lang.Double;
        if (r2 == 0) goto L_0x0026;
    L_0x002c:
        goto L_0x0014;
    L_0x002d:
        r2 = r4 instanceof java.lang.String;
        if (r2 == 0) goto L_0x0013;
    L_0x0031:
        goto L_0x0014;
    L_0x0032:
        r0 = new com.konylabs.vm.LuaError;
        r1 = 100;
        r2 = "Error";
        r3 = "Invalid type of parameters";
        r0.<init>(r1, r2, r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ny0k.cr.a(java.lang.Object, int):java.lang.Object");
    }

    public static HashMap m2202a(Library library) {
        String[] methods = library.getMethods();
        HashMap hashMap = new HashMap(methods.length, 1.0f);
        for (int i = 0; i < methods.length; i++) {
            hashMap.put(methods[i], Integer.valueOf(i));
        }
        return hashMap;
    }

    public static List m2203a(List list) {
        int size = list.size();
        List arrayList = new ArrayList(size);
        int i;
        if (KonyMain.m4056B()) {
            for (i = 0; i < size; i++) {
                arrayList.add(Integer.valueOf(((Double) list.get(i)).intValue() - 1));
            }
        } else {
            for (i = 0; i < size; i++) {
                arrayList.add(Integer.valueOf(((Double) list.get(i)).intValue()));
            }
        }
        return arrayList;
    }

    public static void m2204a(LuaWidget luaWidget, LuaWidget luaWidget2) {
        KonyMain.m4121f().post(new ct(luaWidget, luaWidget2));
    }

    public static void m2206a(LuaWidget luaWidget, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 1) {
            m2209b(luaWidget, (LuaWidget) arrayList.get(0));
        } else if (size > 1) {
            LuaWidget[] luaWidgetArr = (LuaWidget[]) arrayList.toArray(new LuaWidget[size]);
            ArrayList arrayList2 = null;
            for (int i = 0; i < size; i++) {
                LuaWidget luaWidget2 = luaWidgetArr[i];
                luaWidget2.decreaseReferenceCount();
                int referenceCount = luaWidget2.getReferenceCount();
                if (KonyMain.f3657e) {
                    Log.d("CommonUtil", "************** Reference count of " + luaWidget2.getID() + ": " + referenceCount);
                }
                if (referenceCount == 0) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(luaWidget2);
                }
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                KonyMain.m4121f().post(new cu(luaWidget, arrayList2));
            }
        }
    }

    public static LuaTable m2207b(List list) {
        int i = 0;
        int size = list.size();
        if (KonyMain.m4057C()) {
            LuaTable luaTable = new LuaTable(size, 0);
            while (i < size) {
                luaTable.add(f2309a.get(list.get(i)));
                i++;
            }
            return luaTable;
        } else if (!KonyMain.m4056B()) {
            return null;
        } else {
            LuaTable luaTable2 = new LuaTable(size, 0);
            while (i < size) {
                luaTable2.add(f2309a.get(Integer.valueOf(((Integer) list.get(i)).intValue() + 1)));
                i++;
            }
            return luaTable2;
        }
    }

    private static Object m2208b(Object obj, int i) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return Boolean.valueOf(Boolean.parseBoolean((String) obj));
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                try {
                    return Double.valueOf(Double.parseDouble((String) obj));
                } catch (NumberFormatException e) {
                    return null;
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return obj.toString();
            default:
                return obj;
        }
    }

    public static void m2209b(LuaWidget luaWidget, LuaWidget luaWidget2) {
        luaWidget2.decreaseReferenceCount();
        int referenceCount = luaWidget2.getReferenceCount();
        if (KonyMain.f3657e) {
            Log.d("CommonUtil", "************** Reference count of " + luaWidget2.getID() + ": " + referenceCount);
        }
        if (referenceCount == 0) {
            KonyMain.m4121f().post(new cv(luaWidget, luaWidget2));
        }
    }

    private static void m2210b(LuaWidget luaWidget, LuaWidget luaWidget2, boolean z) {
        if (!luaWidget.isJsObjectCloneCreated()) {
            C0254b x = KonyMain.m4143x();
            luaWidget.createNativeClone(z);
            if (luaWidget instanceof eO) {
                ArrayList arrayList = ((eO) luaWidget).f3720i;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    m2210b((LuaWidget) arrayList.get(i), null, true);
                }
                x.m1774a(luaWidget, arrayList);
            }
            if (luaWidget2 != null) {
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(luaWidget);
                x.m1774a(luaWidget2, arrayList2);
            }
        }
    }

    public static void m2211b(LuaWidget luaWidget, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 1) {
            m2212c(luaWidget, (LuaWidget) arrayList.get(0));
        } else if (size > 1) {
            LuaWidget[] luaWidgetArr = (LuaWidget[]) arrayList.toArray(new LuaWidget[size]);
            ArrayList arrayList2 = null;
            for (int i = 0; i < size; i++) {
                LuaWidget luaWidget2 = luaWidgetArr[i];
                int referenceCount = luaWidget2.getReferenceCount();
                if (KonyMain.f3657e) {
                    Log.d("CommonUtil", "************** Reference count of " + luaWidget2.getID() + ": " + referenceCount);
                }
                if (referenceCount == 0) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(luaWidget2);
                }
                luaWidget2.increaseReferenceCount();
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                KonyMain.m4121f().post(new cx(luaWidget, arrayList2));
            }
        }
    }

    public static void m2212c(LuaWidget luaWidget, LuaWidget luaWidget2) {
        int referenceCount = luaWidget2.getReferenceCount();
        if (KonyMain.f3657e) {
            Log.d("CommonUtil", "************** Reference count of " + luaWidget2.getID() + ": " + referenceCount);
        }
        if (referenceCount == 0) {
            KonyMain.m4121f().post(new cw(luaWidget, luaWidget2));
        }
        luaWidget2.increaseReferenceCount();
    }
}
