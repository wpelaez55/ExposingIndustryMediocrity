package com.konylabs.api;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.media.TransportMediator;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import com.thirdparty.bumpapi.C0272a;
import java.io.Serializable;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import java.util.TimeZone;
import net.sourceforge.zbar.Symbol;
import ny0k.aH;

/* renamed from: com.konylabs.api.w */
public final class C0373w implements Library {
    private static String[] f3032a;
    private static ArrayList f3033b;

    static {
        f3032a = new String[]{"tonumber", "date", "time", "diffdatetime", "tocurrency", "sysinfo", "freememory", "useragent", "platform", "isleapyear", "isvaliddate", "addtodate", "comparedates", "formatdate", "startbump", "disconnectbump", "sendbumpdata", "loadlibrary", "getcurrenttimeinmillis", "log", "datecomponents", "setapplicationmode", "getapplicationmode", "deviceinfo", "getdevicecurrentorientation", "hasgpssupport", "hascamerasupport", "hastouchsupport", "hasorientationsupport", "hasaccelerometersupport", "announceaccessibilityhint", "gc"};
        f3033b = null;
    }

    private static String m3359a(String str, String str2) throws Exception {
        int i = 0;
        String[] split = str.split("(/|-|:|\\.)");
        String[] split2 = str2.split("(/|-|:|\\.)");
        int i2 = 0;
        while (i2 < split2.length) {
            if ((split2[i2].equals("yyyy") || split2[i2].equals("yy")) && split[i2].length() == 2) {
                split[i2] = "20" + split[i2];
                i2 = 1;
                break;
            }
            i2++;
        }
        i2 = 0;
        if (i2 == 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        i2 = -1;
        while (i < split.length) {
            i2 = (i2 + split[i].length()) + 1;
            stringBuffer.append(split[i]);
            if (i2 < str.length()) {
                stringBuffer.append(str.charAt(i2));
            }
            i++;
        }
        return stringBuffer.toString();
    }

    protected static void m3360a(Function function, int i, Object obj) {
        if (function != null) {
            Serializable serializable;
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = function;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", new Double((double) i));
            String str = "key1";
            if (obj instanceof LuaTable) {
                serializable = (LuaTable) obj;
            } else {
                String str2 = (String) obj;
            }
            bundle.putSerializable(str, serializable);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    protected static void m3361a(Function function, Object obj) {
        if (function != null) {
            Serializable serializable;
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = function;
            Bundle bundle = new Bundle(1);
            String str = "key0";
            if (obj instanceof LuaTable) {
                serializable = (LuaTable) obj;
            } else {
                String str2 = (String) obj;
            }
            bundle.putSerializable(str, serializable);
            obtain.setData(bundle);
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    private static boolean m3362a(String str) {
        return str.matches("^\\(?(d{2}|m{2})[/\\-:\\.\\)]?\\(?(d{2}|m{2})[/\\-:\\.\\)]?\\(?(y{4}|y{2})\\)?$");
    }

    public static Object[] m3363a() {
        String str = Build.MODEL;
        if (str == null) {
            str = "android";
        }
        if (KonyMain.f3657e) {
            Log.d("OSLib", "UserAgent = " + str);
        }
        return new Object[]{str};
    }

    private static Object[] m3364a(Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            throw new LuaError(101, "Error", "Invalid number of arguments for kony.os.toNumber()");
        }
        Object[] objArr2 = new Object[1];
        try {
            Object obj = objArr[0];
            if (obj instanceof Double) {
                objArr2[0] = obj;
            } else if (obj instanceof String) {
                objArr2[0] = new Double(Double.parseDouble((String) obj));
            } else if (KonyMain.m4057C()) {
                throw new LuaError(100, "Error", "Invalid type of arguments for kony.os.toNumber()");
            }
            return objArr2;
        } catch (NumberFormatException e) {
            if (KonyMain.f3659g) {
                Log.e("OSLib", "os.tonumber: " + e.getMessage());
            }
            objArr2[0] = LuaNil.nil;
            return objArr2;
        }
    }

    public static ArrayList m3365b() {
        return f3033b;
    }

    private Object[] m3366b(Object[] objArr) {
        String format;
        Calendar instance = Calendar.getInstance();
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    Hashtable hashtable;
                    LuaTable luaTable;
                    if (objArr.length == 1 && objArr[0].equals("*t")) {
                        hashtable = new LuaTable(0, 9).map;
                        hashtable.put("hour", new Double((double) instance.get(11)));
                        hashtable.put("min", new Double((double) instance.get(12)));
                        hashtable.put("wday", new Double((double) instance.get(7)));
                        hashtable.put("year", new Double((double) instance.get(1)));
                        hashtable.put("yday", new Double((double) instance.get(6)));
                        hashtable.put("month", new Double((double) (instance.get(2) + 1)));
                        hashtable.put("sec", new Double((double) instance.get(13)));
                        hashtable.put("day", new Double((double) instance.get(5)));
                        hashtable.put("isdst", Boolean.TRUE);
                        return new Object[]{luaTable};
                    } else if (objArr.length == 1 && objArr[0].equals("!*t")) {
                        luaTable = new LuaTable(0, 9);
                        instance.setTimeZone(TimeZone.getTimeZone("GMT"));
                        hashtable = luaTable.map;
                        hashtable.put("hour", new Double((double) instance.get(11)));
                        hashtable.put("min", new Double((double) instance.get(12)));
                        hashtable.put("wday", new Double((double) instance.get(7)));
                        hashtable.put("year", new Double((double) instance.get(1)));
                        hashtable.put("yday", new Double((double) instance.get(5)));
                        hashtable.put("month", new Double((double) (instance.get(2) + 1)));
                        hashtable.put("sec", new Double((double) instance.get(13)));
                        hashtable.put("day", new Double((double) instance.get(5)));
                        hashtable.put("isdst", Boolean.FALSE);
                        return new Object[]{luaTable};
                    } else {
                        String str = (String) objArr[0];
                        if (C0373w.m3362a(str)) {
                            format = new SimpleDateFormat(str.replace('m', 'M')).format(instance.getTime());
                            return new Object[]{format};
                        }
                        return new Object[]{LuaNil.nil};
                    }
                }
            } catch (Exception e) {
                if (KonyMain.f3659g) {
                    Log.e("OSLib", BuildConfig.FLAVOR + e);
                }
                return null;
            }
        }
        format = new SimpleDateFormat("MM/dd/yy HH:mm:ss").format(instance.getTime());
        return new Object[]{format};
    }

    private static Object[] m3367c() {
        StringBuffer stringBuffer = new StringBuffer();
        C0436y a = C0436y.m3991a();
        stringBuffer.append("\n Screen Width = " + a.getTable(C0436y.f3570a));
        stringBuffer.append("\n Screen Height = " + a.getTable(C0436y.f3570a));
        stringBuffer.append("\n Screen Content Width = " + a.getTable(C0436y.f3570a));
        stringBuffer.append("\n Screen Content Height = " + a.getTable(C0436y.f3571b));
        stringBuffer.append("\n Screen Full Width = " + a.getTable(C0436y.f3570a));
        stringBuffer.append("\n Screen Full Height = " + a.getTable(C0436y.f3571b));
        stringBuffer.append("\n Board Name = " + Build.BOARD);
        stringBuffer.append("\n Brand Name = " + Build.BRAND);
        stringBuffer.append("\n Device Name = " + Build.DEVICE);
        stringBuffer.append("\n Build ID = " + Build.DISPLAY);
        stringBuffer.append("\n Unique Build ID = " + Build.FINGERPRINT);
        stringBuffer.append("\n Build Host = " + Build.HOST);
        stringBuffer.append("\n Changelist # = " + Build.ID);
        stringBuffer.append("\n Model = " + Build.MODEL);
        stringBuffer.append("\n Product = " + Build.PRODUCT);
        stringBuffer.append("\n Manufacturer = " + Build.MANUFACTURER);
        stringBuffer.append("\n Build tag = " + Build.TAGS);
        stringBuffer.append("\n Build time = " + Build.TIME);
        stringBuffer.append("\n Build Type = " + Build.TYPE);
        stringBuffer.append("\n User = " + Build.USER);
        stringBuffer.append("\n Release # = " + VERSION.RELEASE);
        stringBuffer.append("\n SDK version = " + VERSION.SDK);
        if (KonyMain.f3657e) {
            Log.d("OSLib", "Sysinfo : " + stringBuffer);
        }
        return null;
    }

    private static Object[] m3368c(Object[] objArr) {
        if (objArr.length != 2) {
            throw new LuaError("Invalid number of arguments for for kony.os.diffdatetime()", 301);
        }
        try {
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            simpleDateFormat.applyPattern("HH:mm:ss");
            simpleDateFormat.setLenient(false);
            int time = (int) ((simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse(str2).getTime()) / 1000);
            if (KonyMain.f3657e) {
                Log.d("OSLib", "diffOfTime is :" + time);
            }
            return new Object[]{new Double((double) time)};
        } catch (Exception e) {
            if (KonyMain.f3659g) {
                Log.e("OSLib", "os.diffdatetime: " + e);
            }
            return null;
        }
    }

    private Object[] m3369d(Object[] objArr) {
        int i = 3;
        if (objArr == null || objArr.length <= 0) {
            throw new LuaError(101, "Error", "Invalid number of arguments for for kony.os.toCurrency()");
        }
        String d;
        Object obj = objArr[0];
        if (obj instanceof Double) {
            d = ((Double) obj).toString();
        } else if (obj instanceof String) {
            d = (String) obj;
        } else {
            throw new LuaError(100, "Error", "Invalid type of parameters for for kony.os.toCurrency()");
        }
        if (d.startsWith("0")) {
            d = d.substring(d.indexOf("."), d.length());
            if (d.length() == 1) {
                d = ".00";
            } else if (d.length() == 2) {
                d = d + "0";
            } else if (d.length() > 3) {
                d = d.substring(0, 3);
            }
            return new Object[]{"$0" + d};
        }
        if (d.startsWith("-")) {
            d = d.substring(1, d.length());
        }
        double parseDouble = Double.parseDouble(d);
        long j = (long) parseDouble;
        int indexOf = d.indexOf(69);
        int abs = indexOf >= 0 ? Math.abs(Integer.parseInt(d.substring(indexOf + 1, d.length()))) : d.substring(d.indexOf(46) + 1, d.length()).length();
        if (abs > 15) {
            abs = 15;
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        if (parseDouble == ((double) j)) {
            d = BuildConfig.FLAVOR + j;
        } else {
            numberInstance.setMaximumFractionDigits(abs);
            d = numberInstance.format(parseDouble);
        }
        d = d.toString().replace(",", BuildConfig.FLAVOR);
        StringBuffer stringBuffer = new StringBuffer();
        int indexOf2 = d.indexOf(".");
        String str = null;
        if (indexOf2 != -1) {
            str = d.substring(indexOf2, d.length());
        }
        String substring = str == null ? ".00" : str.length() == 2 ? str + "0" : str.length() > 3 ? str.substring(0, 3) : str;
        if (indexOf2 != -1) {
            d = d.substring(0, indexOf2);
        }
        if (d.length() > 3) {
            indexOf2 = d.length() % 3;
            stringBuffer.append("$");
            int length = d.length();
            if (indexOf2 != 0) {
                i = indexOf2;
            } else if (length < 3) {
                i = length;
            }
            stringBuffer.append(d.substring(0, i));
            while (i < d.length()) {
                if (i != 0) {
                    stringBuffer.append(",");
                }
                if (KonyMain.f3657e) {
                    Log.d("OSLib", "Comma Part : " + d.substring(i, i + 3));
                }
                stringBuffer.append(d.substring(i, i + 3));
                i += 3;
            }
            stringBuffer.append(substring);
            return new Object[]{stringBuffer.toString()};
        }
        return new Object[]{"$" + d + substring};
    }

    private Object[] m3370e(Object[] objArr) {
        if (objArr.length == 2 || objArr.length == 0) {
            try {
                int i;
                if (objArr.length == 2) {
                    String str = (String) objArr[1];
                    if (C0373w.m3362a(str)) {
                        String replace = str.replace('m', 'M');
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(replace);
                        simpleDateFormat.setLenient(false);
                        Date parse = simpleDateFormat.parse(C0373w.m3359a((String) objArr[0], replace));
                        Calendar instance = Calendar.getInstance();
                        instance.setTime(parse);
                        i = instance.get(1);
                    } else {
                        return new Object[]{new Boolean(false)};
                    }
                }
                i = objArr.length == 0 ? Calendar.getInstance().get(1) : 0;
                if (i <= 0 || i % 4 != 0 || (i % 100 == 0 && i % 400 != 0)) {
                    return new Object[]{new Boolean(false)};
                }
                return new Object[]{new Boolean(true)};
            } catch (Exception e) {
                if (KonyMain.f3659g) {
                    Log.e("OSLib", BuildConfig.FLAVOR + e);
                }
                return new Object[]{new Boolean(false)};
            }
        }
        if (KonyMain.f3657e) {
            Log.d("OSLib", "Inside isleapyear: params.length != 2 ");
        }
        return new Object[]{LuaNil.nil};
    }

    private Object[] m3371f(Object[] objArr) {
        if (objArr.length != 2) {
            if (KonyMain.f3657e) {
                Log.d("OSLib", "Inside isvaliddate: params.length != 2");
            }
            return new Object[]{LuaNil.nil};
        }
        try {
            String str = (String) objArr[1];
            if (C0373w.m3362a(str)) {
                String replace = str.replace('m', 'M');
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(replace);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.parse(C0373w.m3359a((String) objArr[0], replace));
                return new Object[]{new Boolean(true)};
            }
            return new Object[]{new Boolean(false)};
        } catch (ParseException e) {
            if (KonyMain.f3659g) {
                Log.e("OSLib", BuildConfig.FLAVOR + e);
            }
            return new Object[]{new Boolean(false)};
        } catch (Exception e2) {
            if (KonyMain.f3659g) {
                Log.e("OSLib", BuildConfig.FLAVOR + e2);
            }
            return new Object[]{new Boolean(false)};
        }
    }

    private Object[] m3372g(Object[] objArr) {
        if (objArr.length != 4) {
            if (KonyMain.f3657e) {
                Log.d("OSLib", "Inside addtodate:params.length != 4");
            }
            return new Object[]{LuaNil.nil};
        }
        try {
            int i;
            String str = (String) objArr[0];
            String toLowerCase = objArr[1].toString().toLowerCase();
            String intern = ((String) objArr[2]).intern();
            int intValue = ((Double) objArr[3]).intValue();
            if (intern == "days") {
                i = 5;
            } else if (intern == "months") {
                i = 2;
            } else if (intern == "years") {
                i = 1;
            } else if (intern == "hours") {
                i = 10;
            } else if (intern == "minutes") {
                i = 12;
            } else {
                return new Object[]{LuaNil.nil};
            }
            if (C0373w.m3362a(toLowerCase)) {
                String replace = toLowerCase.replace('m', 'M');
                str = C0373w.m3359a(str, replace);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(replace);
                simpleDateFormat.setLenient(false);
                Date parse = simpleDateFormat.parse(str);
                Calendar instance = Calendar.getInstance();
                instance.setTime(parse);
                instance.add(i, intValue);
                String format = simpleDateFormat.format(instance.getTime());
                if (KonyMain.f3657e) {
                    Log.d("OSLib", BuildConfig.FLAVOR + format);
                }
                return new Object[]{format};
            }
            return new Object[]{LuaNil.nil};
        } catch (Exception e) {
            if (KonyMain.f3659g) {
                Log.e("OSLib", BuildConfig.FLAVOR + e);
            }
            return new Object[]{LuaNil.nil};
        }
    }

    private Object[] m3373h(Object[] objArr) {
        try {
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            String toLowerCase = objArr[2].toString().toLowerCase();
            if (C0373w.m3362a(toLowerCase)) {
                toLowerCase = toLowerCase.replace('m', 'M');
                str = C0373w.m3359a(str, toLowerCase);
                str2 = C0373w.m3359a(str2, toLowerCase);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(toLowerCase);
                simpleDateFormat.setLenient(false);
                int time = (int) ((simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse(str2).getTime()) / 86400000);
                return new Object[]{new Double((double) time)};
            }
            return new Object[]{LuaNil.nil};
        } catch (Exception e) {
            if (KonyMain.f3659g) {
                Log.e("OSLib", BuildConfig.FLAVOR + e);
            }
            return null;
        }
    }

    private Object[] m3374i(Object[] objArr) {
        if (objArr == null || objArr.length != 3) {
            return null;
        }
        if (objArr[0] == LuaNil.nil || objArr[1] == LuaNil.nil || objArr[2] == LuaNil.nil) {
            return null;
        }
        if (!(objArr[0] instanceof String) || !(objArr[1] instanceof String) || !(objArr[2] instanceof String)) {
            return null;
        }
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        if (!C0373w.m3362a(str2)) {
            return null;
        }
        String str3 = (String) objArr[2];
        if (!C0373w.m3362a(str3)) {
            return null;
        }
        str2 = str2.replace('m', 'M');
        str3 = str3.replace('m', 'M');
        try {
            str = C0373w.m3359a(str, str2);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
            simpleDateFormat.setLenient(false);
            Date parse = simpleDateFormat.parse(str);
            simpleDateFormat.applyPattern(str3);
            str2 = simpleDateFormat.format(parse);
            return new Object[]{str2};
        } catch (Exception e) {
            if (KonyMain.f3659g) {
                Log.e("OSLib", BuildConfig.FLAVOR + e);
            }
            return null;
        }
    }

    private static boolean m3375j(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("OSLib", "Calling loadLibrary");
        }
        if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof LuaTable)) {
            return false;
        }
        int i;
        String str;
        LuaTable luaTable = (LuaTable) objArr[0];
        LuaNil table = luaTable.getTable("javaclassname");
        if (table != LuaNil.nil) {
            i = 1;
            str = (String) table;
        } else {
            LuaNil table2 = luaTable.getTable("cwiclassname");
            if (table2 != LuaNil.nil) {
                i = 2;
                str = (String) table2;
            } else {
                str = null;
                i = 1;
            }
        }
        if (KonyMain.f3657e) {
            Log.d("OSLib", "Loading the class " + str);
        }
        try {
            Object newInstance = Class.forName(str).newInstance();
            if (newInstance instanceof Library) {
                if (KonyMain.f3657e) {
                    Log.d("OSLib", "Registering the new library : " + newInstance);
                }
                KonyMain.m4143x().m1775a((Library) newInstance, i);
                if (i != 1) {
                    return true;
                }
                if (f3033b == null) {
                    f3033b = new ArrayList();
                }
                f3033b.add((Library) newInstance);
                return true;
            }
            if (KonyMain.f3659g) {
                Log.e("OSLib", "Loaded class not an instance of Library");
            }
            return false;
        } catch (Exception e) {
            if (KonyMain.f3659g) {
                Log.e("OSLib", "Unable to load library " + str);
                Log.e("OSLib", BuildConfig.FLAVOR + e);
            }
            return false;
        }
    }

    private Object[] m3376k(Object[] objArr) {
        Calendar instance;
        LuaTable luaTable;
        Hashtable hashtable;
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    if (objArr.length == 2) {
                        String str = (String) objArr[0];
                        String str2 = (String) objArr[1];
                        if (!C0373w.m3362a(str2)) {
                            return null;
                        }
                        String replace = str2.replace('m', 'M');
                        str = C0373w.m3359a(str, replace);
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(replace);
                        simpleDateFormat.setLenient(false);
                        Date parse = simpleDateFormat.parse(str);
                        instance = Calendar.getInstance();
                        instance.setTime(parse);
                        luaTable = new LuaTable(0, 9);
                        hashtable = luaTable.map;
                        if (replace.matches("[^y]*y{2}[^y]*")) {
                            hashtable.put("year", new Double((double) (instance.get(1) % 100)));
                        } else {
                            hashtable.put("year", new Double((double) instance.get(1)));
                        }
                        hashtable.put("hour", new Double(0.0d));
                        hashtable.put("min", new Double(0.0d));
                        hashtable.put("sec", new Double(0.0d));
                    } else {
                        hashtable = null;
                        luaTable = null;
                        instance = null;
                    }
                    if (instance != null || hashtable == null) {
                        return null;
                    }
                    hashtable.put("wday", new Double((double) instance.get(7)));
                    hashtable.put("yday", new Double((double) instance.get(6)));
                    hashtable.put("month", new Double((double) (instance.get(2) + 1)));
                    hashtable.put("day", new Double((double) instance.get(5)));
                    hashtable.put("isdst", Boolean.TRUE);
                    return new Object[]{luaTable};
                }
            } catch (Exception e) {
                if (KonyMain.f3659g) {
                    Log.e("OSLib", BuildConfig.FLAVOR + e);
                }
                return null;
            }
        }
        instance = Calendar.getInstance();
        luaTable = new LuaTable(0, 9);
        hashtable = luaTable.map;
        hashtable.put("year", new Double((double) instance.get(1)));
        hashtable.put("hour", new Double((double) instance.get(11)));
        hashtable.put("min", new Double((double) instance.get(12)));
        hashtable.put("sec", new Double((double) instance.get(13)));
        if (instance != null) {
        }
        return null;
    }

    public final Object[] execute(int i, Object[] objArr) {
        KonyMain actContext;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return C0373w.m3364a(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return m3366b(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                Calendar instance = Calendar.getInstance();
                StringBuffer stringBuffer = new StringBuffer();
                int i2 = instance.get(11);
                stringBuffer.append(i2 >= 10 ? i2 + ":" : "0" + i2 + ":");
                i2 = instance.get(12);
                stringBuffer.append(i2 >= 10 ? i2 + ":" : "0" + i2 + ":");
                i2 = instance.get(13);
                stringBuffer.append(i2 >= 10 ? i2 + BuildConfig.FLAVOR : "0" + i2);
                return new Object[]{stringBuffer.toString()};
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return C0373w.m3368c(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return m3369d(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return C0373w.m3367c();
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                System.gc();
                Runtime runtime = Runtime.getRuntime();
                long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
                return new Object[]{new Double((double) maxMemory)};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                return C0373w.m3363a();
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                return new Object[]{C0436y.m3991a()};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                return m3370e(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                return m3371f(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                return m3372g(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJECT /*12*/:
                return m3373h(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_HASHTABLE /*13*/:
                return m3374i(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_FUNCTION /*14*/:
                if (!(objArr == null || objArr.length != 5 || objArr[0] == LuaNil.nil || objArr[1] == LuaNil.nil || objArr[2] == LuaNil.nil || objArr[3] == LuaNil.nil || objArr[4] == LuaNil.nil)) {
                    actContext = KonyMain.getActContext();
                    C0272a w = actContext != null ? actContext.m4170w() : null;
                    if (objArr != null && objArr.length > 0) {
                        Function function = (Function) objArr[0];
                        Function function2 = (Function) objArr[1];
                        String str = (String) objArr[2];
                        String str2 = (String) objArr[3];
                        String str3 = (String) objArr[4];
                        if (w != null) {
                            w.m1789a(new C0374x(this, function, function2));
                            w.m1790a(str, str2, str3);
                        }
                    }
                }
                return null;
            case ViewDragHelper.EDGE_ALL /*15*/:
                actContext = KonyMain.getActContext();
                C0272a w2 = actContext != null ? actContext.m4170w() : null;
                if (w2 != null) {
                    w2.m1787a();
                }
                return null;
            case TransportMediator.FLAG_KEY_MEDIA_PAUSE /*16*/:
                actContext = KonyMain.getActContext();
                C0272a w3 = actContext != null ? actContext.m4170w() : null;
                if (!(w3 == null || objArr == null || !(objArr[0] instanceof LuaTable))) {
                    LuaTable luaTable = (LuaTable) objArr[0];
                    if (!(luaTable.arraySize() == 0 && luaTable.hashSize() == 0)) {
                        if (KonyMain.f3657e) {
                            Log.d("OSLib", "Data Received =================" + aH.m1895a(luaTable));
                        }
                        w3.m1791a(aH.m1895a(luaTable).getBytes());
                    }
                }
                return null;
            case LuaWidget.KONY_WIDGET_POS_MIDDLE_CENTER /*17*/:
                C0373w.m3375j(objArr);
                return null;
            case MotionEventCompat.AXIS_RTRIGGER /*18*/:
                return new Object[]{new Double((double) System.currentTimeMillis())};
            case LuaWidget.KONY_WIDGET_POS_MIDDLE_LEFT /*19*/:
                if (objArr != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Log.d("OSLib", Thread.currentThread() + ":" + new Date(currentTimeMillis).toGMTString() + "(" + currentTimeMillis + "):" + objArr[0].toString());
                }
                return null;
            case MotionEventCompat.AXIS_RUDDER /*20*/:
                return m3376k(objArr);
            case LuaWidget.KONY_WIDGET_POS_MIDDLE_RIGHT /*21*/:
                KonyMain.m4087a(((Double) objArr[0]).intValue());
                return null;
            case MotionEventCompat.AXIS_GAS /*22*/:
                return new Object[]{new Double((double) KonyMain.m4145z())};
            case MotionEventCompat.AXIS_BRAKE /*23*/:
                if (KonyMain.f3657e) {
                    C0373w.m3367c();
                }
                return new Object[]{C0436y.m3991a()};
            case MotionEventCompat.AXIS_DISTANCE /*24*/:
                if (KonyMain.getAppContext().getResources().getConfiguration().orientation == 1) {
                    return new Object[]{new Double(1.0d)};
                }
                return new Object[]{new Double(2.0d)};
            case Symbol.I25 /*25*/:
                return new Object[]{C0436y.m3991a().getTable("hasgps")};
            case 26:
                return new Object[]{C0436y.m3991a().getTable("hascamera")};
            case 27:
                return new Object[]{C0436y.m3991a().getTable("hastouchsupport")};
            case 28:
                return new Object[]{C0436y.m3991a().getTable("hasorientationsupport")};
            case 29:
                return new Object[]{C0436y.m3991a().getTable("hasaccelerometer")};
            case 30:
                if (objArr == null || objArr.length <= 0) {
                    return null;
                }
                LuaWidget.announceAccessibilityHint(objArr[0].toString(), null);
                return null;
            case 31:
                KonyMain.m4143x().m1777a(KonyMain.m4061G());
                return null;
            default:
                throw new LuaError("No such smethod error", 108);
        }
    }

    public final String[] getMethods() {
        return f3032a;
    }

    public final String getNameSpace() {
        return "os";
    }
}
