package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.TableLib;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.HashMap;
import ny0k.cr;

public class Table {
    private static String f1752a;
    private static Library f1753b;
    private static HashMap f1754c;

    static {
        f1752a = "TableNative";
    }

    private Table() {
    }

    public static Object append(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1752a, "Executing Table.append()");
        }
        Object[] execute = f1753b.execute(((Integer) f1754c.get("append")).intValue(), objArr);
        return (execute == null || execute.length == 0) ? LuaNil.nil : execute[0];
    }

    public static Object concat(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1752a, "Executing Table.concat()");
        }
        Object[] execute = f1753b.execute(((Integer) f1754c.get("concat")).intValue(), objArr);
        return (execute == null || execute.length == 0) ? LuaNil.nil : execute[0];
    }

    public static final Boolean contains(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1752a, "Executing Table.contains()");
        }
        return (Boolean) f1753b.execute(((Integer) f1754c.get("contains")).intValue(), objArr)[0];
    }

    public static Object filter(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1752a, "Executing Table.filter()");
        }
        Object[] execute = f1753b.execute(((Integer) f1754c.get("filter")).intValue(), objArr);
        return (execute == null || execute.length == 0) ? LuaNil.nil : execute[0];
    }

    public static final Object get(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1752a, "Executing Table.get()");
        }
        return f1753b.execute(((Integer) f1754c.get("get")).intValue(), objArr)[0];
    }

    public static void initialize() {
        if (f1753b == null) {
            Library tableLib = new TableLib();
            f1753b = tableLib;
            f1754c = cr.m2202a(tableLib);
        }
    }

    public static LuaTable insert(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1752a, "Executing Table.insert()");
        }
        return (LuaTable) f1753b.execute(((Integer) f1754c.get("insert")).intValue(), objArr)[0];
    }

    public static Object map(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1752a, "Executing Table.map()");
        }
        Object[] execute = f1753b.execute(((Integer) f1754c.get("map")).intValue(), objArr);
        return (execute == null || execute.length == 0) ? LuaNil.nil : execute[0];
    }

    public static Object mapNew(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1752a, "Executing Table.mapNew()");
        }
        return f1753b.execute(((Integer) f1754c.get("mapnew")).intValue(), objArr)[0];
    }

    public static Object remove(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1752a, "Executing Table.remove()");
        }
        return f1753b.execute(((Integer) f1754c.get("remove")).intValue(), objArr)[0];
    }

    public static void removeAll(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1752a, "Executing Table.removeAll()");
        }
        f1753b.execute(((Integer) f1754c.get("removeall")).intValue(), objArr);
    }

    public static Object sort(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d(f1752a, "Executing Table.sort()");
        }
        Object[] execute = f1753b.execute(((Integer) f1754c.get("sort")).intValue(), objArr);
        return (execute == null || execute.length == 0) ? LuaNil.nil : execute[0];
    }
}
