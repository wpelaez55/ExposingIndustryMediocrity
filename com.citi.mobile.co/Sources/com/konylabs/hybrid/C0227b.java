package com.konylabs.hybrid;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.C0174B;
import com.konylabs.api.ui.C0216r;
import com.konylabs.api.ui.hP;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;

/* renamed from: com.konylabs.hybrid.b */
public class C0227b {
    private View f1668a;
    private C0174B f1669b;

    public C0227b(C0174B c0174b) {
        this.f1669b = c0174b;
    }

    static /* synthetic */ String m1609a(LuaTable luaTable) {
        if (luaTable == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int size = luaTable.list.size();
        for (int i = 0; i < size; i++) {
            Object obj = luaTable.list.get(i);
            if (obj instanceof LuaTable) {
                stringBuilder.append(C0216r.m1557a((LuaTable) obj, 2));
            } else if ((obj instanceof String) || (obj instanceof StringBuffer)) {
                stringBuilder.append("'");
                stringBuilder.append(obj);
                stringBuilder.append("'");
            } else if (obj instanceof LuaNil) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(obj);
            }
            if (i < size - 1) {
                stringBuilder.append(",");
            }
        }
        return stringBuilder.toString();
    }

    public static void m1610a(hP hPVar, String str, LuaTable luaTable) {
        if (str != null && hPVar != null) {
            KonyMain.m4094a(new C0228c(luaTable, str, hPVar));
        }
    }

    public static Object[] m1611a(String str, LuaTable luaTable) {
        Function a = KonyMain.m4143x().m1771a(str);
        if (a != null) {
            Object[] objArr;
            if (luaTable != null) {
                Object[] objArr2 = new Object[luaTable.list.size()];
                for (int i = 0; i < luaTable.list.size(); i++) {
                    objArr2[i] = luaTable.list.get(i);
                }
                objArr = objArr2;
            } else {
                objArr = null;
            }
            try {
                return a.execute(objArr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void m1612a() {
        int childCount = this.f1669b.getChildCount();
        int i = 0;
        float f = 0.0f;
        while (i < childCount) {
            float f2 = this.f1668a != this.f1669b.getChildAt(i) ? ((LayoutParams) this.f1669b.getChildAt(i).getLayoutParams()).weight + f : f;
            i++;
            f = f2;
        }
        if (f <= 0.0f || f >= 1.0f) {
            if (this.f1668a != null) {
                this.f1669b.removeView(this.f1668a);
            }
            this.f1668a = null;
            return;
        }
        if (this.f1668a == null) {
            this.f1668a = new View(this.f1669b.getContext());
        }
        ViewGroup.LayoutParams layoutParams = new LayoutParams(0, 0);
        layoutParams.weight = 1.0f - f;
        if (this.f1668a != null) {
            this.f1669b.removeView(this.f1668a);
            this.f1669b.addView(this.f1668a, layoutParams);
        }
    }
}
