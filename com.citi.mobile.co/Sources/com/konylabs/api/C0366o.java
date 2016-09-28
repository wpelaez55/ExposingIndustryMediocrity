package com.konylabs.api;

import android.content.Context;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import ny0k.C0284S;

/* renamed from: com.konylabs.api.o */
public final class C0366o implements Library {
    private static LuaTable f2431c;
    private C0284S f2432a;
    private Context f2433b;

    public C0366o(Context context) {
        this.f2432a = null;
        this.f2433b = context;
    }

    private LuaTable m2353a() {
        if (f2431c != null) {
            return f2431c;
        }
        C0284S c0284s = this.f2432a;
        ArrayList d = C0284S.m1832d();
        f2431c = new LuaTable(1, 0);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            LuaTable luaTable = new LuaTable(0, 3);
            luaTable.setTable("language", locale.getLanguage());
            luaTable.setTable("country", locale.getCountry());
            luaTable.setTable("name", locale.getDisplayName());
            f2431c.add(luaTable);
        }
        return f2431c;
    }

    public final Object[] execute(int i, Object[] objArr) {
        Object g;
        this.f2432a = C0284S.m1823a(this.f2433b);
        C0284S c0284s;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                g = this.f2432a.m1849g(objArr);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                g = this.f2432a.m1841b();
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                this.f2432a.m1844d(objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                this.f2432a.m1843c(objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                this.f2432a.m1842b(objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                boolean a = this.f2432a.m1840a(objArr);
                return new Object[]{new Boolean(a)};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                this.f2432a.m1846e(objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                int h = this.f2432a.m1850h(objArr);
                return new Object[]{new Double((double) h)};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                return new Object[]{m2353a()};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                c0284s = this.f2432a;
                Locale c = C0284S.m1830c();
                LuaTable luaTable = new LuaTable(0, 3);
                luaTable.setTable("language", c.getLanguage());
                luaTable.setTable("country", c.getCountry());
                luaTable.setTable("name", c.getDisplayName());
                return new Object[]{luaTable};
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                c0284s = this.f2432a;
                return new Object[]{new Boolean(C0284S.m1835j(objArr))};
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                this.f2432a.m1851i(objArr);
                return null;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJECT /*12*/:
                this.f2432a.m1848f(objArr);
                return null;
            default:
                throw new LuaError("I18N : No such smethod error", 308);
        }
        if (g == null) {
            return null;
        }
        return new Object[]{g};
    }

    public final String[] getMethods() {
        return new String[]{"getlocalizedstring", "getcurrentlocale", "setresourcebundle", "updateresourcebundle", "deleteresourcebundle", "isresourcebundlepresent", "setdefaultlocale", "setcurrentlocale", "getsupportedlocales", "getcurrentdevicelocale", "islocalesupportedbydevice", "setcurrentlocaleasync", "setdefaultlocaleasync"};
    }

    public final String getNameSpace() {
        return "i18n";
    }
}
