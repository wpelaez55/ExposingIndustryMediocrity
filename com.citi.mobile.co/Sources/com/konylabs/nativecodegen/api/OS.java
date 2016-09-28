package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0373w;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.HashMap;
import ny0k.cr;

public class OS {
    private static Library f1732a;
    private static HashMap f1733b;

    private OS() {
    }

    public static void Log(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.getCurrentTimeInMillis()");
        }
        f1732a.execute(((Integer) f1733b.get("log")).intValue(), objArr);
    }

    public static Object addToDate(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.addToDate()");
        }
        return f1732a.execute(((Integer) f1733b.get("addtodate")).intValue(), objArr)[0];
    }

    public static Object compareDates(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.compareDates()");
        }
        Object[] execute = f1732a.execute(((Integer) f1733b.get("comparedates")).intValue(), objArr);
        return (execute == null || execute.length == 0) ? LuaNil.nil : execute[0];
    }

    public static Object date(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.date()");
        }
        return f1732a.execute(((Integer) f1733b.get("date")).intValue(), objArr)[0];
    }

    public static void dateComponents(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.dateComponents()");
        }
        f1732a.execute(((Integer) f1733b.get("datecomponents")).intValue(), objArr);
    }

    public static Double diffDateTime(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.diffDateTime()");
        }
        return (Double) f1732a.execute(((Integer) f1733b.get("diffdatetime")).intValue(), objArr)[0];
    }

    public static void disconnectBump() {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.disconnectBump()");
        }
        f1732a.execute(((Integer) f1733b.get("disconnectbump")).intValue(), null);
    }

    public static Object formatDate(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.formatDate()");
        }
        Object[] execute = f1732a.execute(((Integer) f1733b.get("formatdate")).intValue(), objArr);
        return (execute == null || execute.length == 0) ? LuaNil.nil : execute[0];
    }

    public static Double freeMemory() {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.freeMemory()");
        }
        return (Double) f1732a.execute(((Integer) f1733b.get("freememory")).intValue(), null)[0];
    }

    public static Double getApplicationMode() {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.setApplicationMode()");
        }
        return (Double) f1732a.execute(((Integer) f1733b.get("getapplicationmode")).intValue(), null)[0];
    }

    public static Double getCurrenTimeInMillis(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.getCurrentTimeInMillis()");
        }
        return (Double) f1732a.execute(((Integer) f1733b.get("getcurrenttimeinmillis")).intValue(), objArr)[0];
    }

    public static void initialize() {
        if (f1732a == null) {
            Library c0373w = new C0373w();
            f1732a = c0373w;
            f1733b = cr.m2202a(c0373w);
        }
    }

    public static Object isLeapYear(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.isLeapYear()");
        }
        return f1732a.execute(((Integer) f1733b.get("isleapyear")).intValue(), objArr)[0];
    }

    public static Object isValidDate(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.isValidDate()");
        }
        return f1732a.execute(((Integer) f1733b.get("isvaliddate")).intValue(), objArr)[0];
    }

    public static void loadLibrary(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.loadLibrary()");
        }
        f1732a.execute(((Integer) f1733b.get("loadlibrary")).intValue(), objArr);
    }

    public static LuaTable platform() {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.Platform()");
        }
        return (LuaTable) f1732a.execute(((Integer) f1733b.get("platform")).intValue(), null)[0];
    }

    public static void sendBumpData(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.sendBumpData()");
        }
        f1732a.execute(((Integer) f1733b.get("sendbumpdata")).intValue(), objArr);
    }

    public static void setApplicationMode(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.setApplicationMode()");
        }
        f1732a.execute(((Integer) f1733b.get("setapplicationmode")).intValue(), objArr);
    }

    public static void startBump(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.startBump()");
        }
        f1732a.execute(((Integer) f1733b.get("startbump")).intValue(), objArr);
    }

    public static void sysInfo() {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.sysInfo()");
        }
        f1732a.execute(((Integer) f1733b.get("sysinfo")).intValue(), null);
    }

    public static String time(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.time()");
        }
        return (String) f1732a.execute(((Integer) f1733b.get("time")).intValue(), objArr)[0];
    }

    public static String toCurrency(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.toCurrency()");
        }
        return (String) f1732a.execute(((Integer) f1733b.get("tocurrency")).intValue(), objArr)[0];
    }

    public static Object toNumber(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.toNumber()");
        }
        return f1732a.execute(((Integer) f1733b.get("tonumber")).intValue(), objArr)[0];
    }

    public static String userAgent() {
        if (KonyMain.f3657e) {
            Log.d("OSLibNative", "Executing OS.userAgent()");
        }
        return (String) f1732a.execute(((Integer) f1733b.get("useragent")).intValue(), null)[0];
    }
}
