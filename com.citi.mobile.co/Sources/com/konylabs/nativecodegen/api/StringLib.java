package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0345L;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.HashMap;
import ny0k.cr;

public class StringLib {
    private static Library f1750a;
    private static HashMap f1751b;

    private StringLib() {
    }

    public static Object charAt(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.charAt()");
        }
        return f1750a.execute(((Integer) f1751b.get("charat")).intValue(), objArr)[0];
    }

    public static Double compare(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.compare()");
        }
        return (Double) f1750a.execute(((Integer) f1751b.get("compare")).intValue(), objArr)[0];
    }

    public static Boolean containsChars(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.containsChars()");
        }
        return (Boolean) f1750a.execute(((Integer) f1751b.get("containschars")).intValue(), objArr)[0];
    }

    public static Boolean containsNoGivenChars(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.containsNoGivenChars()");
        }
        return (Boolean) f1750a.execute(((Integer) f1751b.get("containsnogivenchars")).intValue(), objArr)[0];
    }

    public static Boolean containsOnlyGivenChars(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.containsOnlyGivenChars()");
        }
        return (Boolean) f1750a.execute(((Integer) f1751b.get("containsonlygivenchars")).intValue(), objArr)[0];
    }

    public static Boolean endsWith(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.endsWith()");
        }
        return (Boolean) f1750a.execute(((Integer) f1751b.get("endswith")).intValue(), objArr)[0];
    }

    public static Boolean equalsIgnoreCase(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.equalsIgnoreCase()");
        }
        return (Boolean) f1750a.execute(((Integer) f1751b.get("equalsignorecase")).intValue(), objArr)[0];
    }

    public static Double find(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.find()");
        }
        Object[] execute = f1750a.execute(((Integer) f1751b.get("find")).intValue(), objArr);
        return execute != null ? (Double) execute[0] : null;
    }

    public static Object format(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.format()");
        }
        Object[] execute = f1750a.execute(((Integer) f1751b.get("format")).intValue(), objArr);
        return execute != null ? execute[0] : LuaNil.nil;
    }

    public static void initialize() {
        if (f1750a == null) {
            Library c0345l = new C0345L();
            f1750a = c0345l;
            f1751b = cr.m2202a(c0345l);
        }
    }

    public static Boolean isAsciiAlpha(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.isAsciiAlpha()");
        }
        return (Boolean) f1750a.execute(((Integer) f1751b.get("isasciialpha")).intValue(), objArr)[0];
    }

    public static Boolean isAsciiAlphaNumeric(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.isAsciiAlphaNumeric()");
        }
        return (Boolean) f1750a.execute(((Integer) f1751b.get("isasciialphanumeric")).intValue(), objArr)[0];
    }

    public static Boolean isNumeric(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.isNumeric()");
        }
        return (Boolean) f1750a.execute(((Integer) f1751b.get("isnumeric")).intValue(), objArr)[0];
    }

    public static Boolean isStringValidEmail(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.isStringValidEmail()");
        }
        return (Boolean) f1750a.execute(((Integer) f1751b.get("isvalidemail")).intValue(), objArr)[0];
    }

    public static Double len(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.len()");
        }
        return (Double) f1750a.execute(((Integer) f1751b.get("len")).intValue(), objArr)[0];
    }

    public static String lower(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.lower()");
        }
        return (String) f1750a.execute(((Integer) f1751b.get("lower")).intValue(), objArr)[0];
    }

    public static String rep(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.rep()");
        }
        return (String) f1750a.execute(((Integer) f1751b.get("rep")).intValue(), objArr)[0];
    }

    public static String replace(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.replace()");
        }
        return (String) f1750a.execute(((Integer) f1751b.get("replace")).intValue(), objArr)[0];
    }

    public static String reverse(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.reverse()");
        }
        return (String) f1750a.execute(((Integer) f1751b.get("reverse")).intValue(), objArr)[0];
    }

    public static LuaTable split(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.split()");
        }
        return (LuaTable) f1750a.execute(((Integer) f1751b.get("split")).intValue(), objArr)[0];
    }

    public static Boolean startsWith(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.startsWith()");
        }
        return (Boolean) f1750a.execute(((Integer) f1751b.get("startswith")).intValue(), objArr)[0];
    }

    public static String sub(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.sub()");
        }
        return (String) f1750a.execute(((Integer) f1751b.get("sub")).intValue(), objArr)[0];
    }

    public static String trim(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.trim()");
        }
        return (String) f1750a.execute(((Integer) f1751b.get("trim")).intValue(), objArr)[0];
    }

    public static String upper(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StringLibNative", "Executing StringLib.upper()");
        }
        return (String) f1750a.execute(((Integer) f1751b.get("upper")).intValue(), objArr)[0];
    }
}
