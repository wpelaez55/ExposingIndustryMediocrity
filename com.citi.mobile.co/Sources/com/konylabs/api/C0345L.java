package com.konylabs.api;

import android.support.v4.media.TransportMediator;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.konylabs.vm.TableEnumeration;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.konylabs.api.L */
public final class C0345L implements Library {
    private static String[] f2389a;
    private Pattern f2390b;
    private Matcher f2391c;

    static {
        f2389a = new String[]{"find", "len", "split", "lower", "upper", "rep", "reverse", "sub", "replace", "trim", "startswith", "endswith", "equalsignorecase", "charat", "compare", "format", "isasciialpha", "isasciialphanumeric", "isnumeric", "containschars", "containsonlygivenchars", "containsnogivenchars", "isvalidemail"};
    }

    private static boolean m2255a(String str, LuaTable luaTable) {
        boolean z;
        TableEnumeration tableEnumeration = luaTable.enumeration;
        tableEnumeration.reset();
        if (KonyMain.f3657e) {
            Log.d("StringLib", "isCharacterPresentInString() str = " + str + " keys.size() = " + luaTable.arraySize());
        }
        if (tableEnumeration != null) {
            while (tableEnumeration.hasMoreElements()) {
                String str2 = (String) luaTable.getTable(tableEnumeration.nextElement());
                if (str.contains(str2)) {
                    if (KonyMain.f3658f) {
                        Log.w("StringLib", "containsonlygivenchars() key = " + str2 + " is present in the String = " + str);
                    }
                    z = true;
                    if (KonyMain.f3657e) {
                        Log.d("StringLib", "isCharacterPresentInString() = " + z);
                    }
                    return z;
                } else if (KonyMain.f3658f) {
                    Log.w("StringLib", "containsonlygivenchars() key = " + str2 + " is not present in the String = " + str);
                }
            }
        }
        z = false;
        if (KonyMain.f3657e) {
            Log.d("StringLib", "isCharacterPresentInString() = " + z);
        }
        return z;
    }

    private static Object[] m2256a(Object[] objArr) {
        try {
            Object[] objArr2 = new Object[1];
            if (objArr.length == 1) {
                objArr2[0] = objArr[0].toString().trim();
                return objArr2;
            }
            throw new LuaError("String.trim", 301);
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib trim: ", e);
            }
            throw new LuaError("String.trim", 302);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib trim: ", e2);
            }
            throw new LuaError("String.trim", 309);
        }
    }

    private static Object[] m2257b(Object[] objArr) {
        try {
            if (objArr.length == 3) {
                String obj = objArr[0].toString();
                CharSequence obj2 = objArr[1].toString();
                CharSequence obj3 = objArr[2].toString();
                if (obj.equalsIgnoreCase(BuildConfig.FLAVOR) && obj2.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                    return new Object[]{obj3};
                } else if (obj2.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                    return new Object[]{obj};
                } else {
                    return new Object[]{obj.replace(obj2, obj3)};
                }
            }
            throw new LuaError("String.replace", 301);
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib replace: ", e);
            }
            throw new LuaError("String.replace", 302);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib replace: ", e2);
            }
            throw new LuaError("String.replace", 309);
        }
    }

    private static Object[] m2258c(Object[] objArr) {
        try {
            Double d;
            String obj;
            Double d2;
            Double d3;
            String[] strArr = new String[1];
            if (objArr.length == 3) {
                d = (Double) objArr[2];
                obj = objArr[0].toString();
                d2 = (Double) objArr[1];
            } else if (objArr.length == 2) {
                String obj2 = objArr[0].toString();
                d3 = (Double) objArr[1];
                obj = obj2;
                d = new Double((double) obj2.length());
                d2 = d3;
            } else {
                throw new LuaError("String.sub", 301);
            }
            if (d2.doubleValue() < 0.0d) {
                d2 = new Double((((double) obj.length()) + d2.doubleValue()) + 1.0d);
            }
            d3 = d.doubleValue() < 0.0d ? new Double((((double) obj.length()) + d.doubleValue()) + 1.0d) : d;
            int doubleValue = (int) d2.doubleValue();
            int doubleValue2 = (int) d3.doubleValue();
            if (doubleValue > doubleValue2 || doubleValue > obj.length() || doubleValue2 > obj.length()) {
                strArr[0] = BuildConfig.FLAVOR;
            } else {
                strArr[0] = obj.substring(doubleValue - 1, doubleValue2);
            }
            return strArr;
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib sub: ", e);
            }
            throw new LuaError("String.sub", 302);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib sub: ", e2);
            }
            return new String[1];
        } catch (Throwable e22) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib trim: ", e22);
            }
            throw new LuaError("String.sub", 309);
        }
    }

    private static Object[] m2259d(Object[] objArr) {
        try {
            Object[] objArr2 = new Object[1];
            if (objArr.length == 1) {
                char[] toCharArray = objArr[0].toString().toCharArray();
                StringBuffer stringBuffer = new StringBuffer();
                for (int length = toCharArray.length - 1; length >= 0; length--) {
                    stringBuffer.append(toCharArray[length]);
                }
                objArr2[0] = stringBuffer.toString();
                return objArr2;
            }
            throw new LuaError("String.reverse", 301);
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib reverse: ", e);
            }
            throw new LuaError("String.reverse", 302);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib reverse: ", e2);
            }
            throw new LuaError("String.reverse", 309);
        }
    }

    private static Object[] m2260e(Object[] objArr) {
        try {
            Object[] objArr2 = new Object[1];
            if (objArr.length == 2) {
                String replace = objArr[0].toString().replace('\n', ' ');
                Double d = (Double) objArr[1];
                StringBuffer stringBuffer = new StringBuffer();
                int doubleValue = (int) d.doubleValue();
                for (int i = 0; i < doubleValue; i++) {
                    stringBuffer.append(replace);
                }
                objArr2[0] = stringBuffer.toString();
                return objArr2;
            }
            throw new LuaError("String.rep", 301);
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib rep: ", e);
            }
            throw new LuaError("String.rep", 302);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib rep: ", e2);
            }
            throw new LuaError("String.rep", 309);
        }
    }

    private static Object[] m2261f(Object[] objArr) {
        try {
            Object[] objArr2 = new Object[1];
            if (objArr.length == 1) {
                objArr2[0] = objArr[0].toString().toUpperCase();
                return objArr2;
            }
            throw new LuaError("String.upper", 301);
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib upper: ", e);
            }
            throw new LuaError("String.upper", 302);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib upper: ", e2);
            }
            throw new LuaError("String.upper", 309);
        }
    }

    private static Object[] m2262g(Object[] objArr) {
        try {
            Object[] objArr2 = new Object[1];
            if (objArr.length == 1) {
                objArr2[0] = objArr[0].toString().toLowerCase();
                return objArr2;
            }
            throw new LuaError("String.lower", 301);
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib lower: ", e);
            }
            throw new LuaError("String.lower", 302);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib lower: ", e2);
            }
            throw new LuaError("String.lower", 309);
        }
    }

    private static Object[] m2263h(Object[] objArr) {
        try {
            if (objArr.length == 1) {
                Object[] objArr2 = new Object[1];
                if (objArr[0] == LuaNil.nil) {
                    objArr2[0] = new Double(0.0d);
                } else {
                    objArr2[0] = new Double((double) objArr[0].toString().length());
                }
                return objArr2;
            }
            throw new LuaError("String.len", 301);
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib len: ", e);
            }
            throw new LuaError("String.len", 302);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib len: ", e2);
            }
            throw new LuaError("String.len", 309);
        }
    }

    private static Object[] m2264i(Object[] objArr) {
        Object obj = null;
        try {
            Object[] objArr2 = new Object[1];
            if (objArr[0] != LuaNil.nil) {
                String obj2;
                String str;
                String str2;
                if (objArr.length == 2) {
                    obj2 = objArr[0].toString();
                    String obj3 = objArr[1].toString();
                    if (obj3.equals(BuildConfig.FLAVOR)) {
                        str = obj2;
                        str2 = " ";
                    } else {
                        str = obj2;
                        str2 = obj3;
                    }
                } else if (objArr.length == 1) {
                    str = objArr[0].toString();
                    str2 = ",";
                } else {
                    throw new LuaError("String.split", 301);
                }
                LuaTable luaTable = new LuaTable(10, 0);
                Object obj4 = null;
                int length = str2.length();
                int indexOf = str.indexOf(str2, 0);
                String str3 = str + str2;
                int i = 0;
                while (indexOf != -1) {
                    String substring = str3.substring(i, indexOf);
                    indexOf += length;
                    luaTable.list.addElement(substring);
                    i = indexOf;
                    indexOf = str3.indexOf(str2, indexOf);
                    obj2 = substring;
                    int i2 = 1;
                }
                if (obj == null && obj4 != null) {
                    luaTable.list.removeElement(obj4);
                } else if (obj4 == null) {
                    luaTable.list.addElement(str);
                }
                objArr2[0] = luaTable;
            }
            return objArr2;
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib split: ", e);
            }
            throw new LuaError("String.split", 302);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib split: ", e2);
            }
            throw new LuaError("String.split", 309);
        }
    }

    private static Object[] m2265j(Object[] objArr) {
        if (objArr.length < 2) {
            throw new LuaError("String.find", 301);
        }
        try {
            String str;
            String str2;
            Double d;
            if (objArr.length == 3) {
                str = (String) objArr[0];
                str2 = (String) objArr[1];
                d = objArr[2] != LuaNil.nil ? (Double) objArr[2] : new Double(1.0d);
            } else if (objArr.length == 2) {
                str = (String) objArr[0];
                str2 = (String) objArr[1];
                d = new Double(1.0d);
            } else {
                throw new LuaError("String.find", 301);
            }
            if (str2.equals(BuildConfig.FLAVOR)) {
                return new Object[]{new Double(1.0d)};
            }
            if (str.indexOf(str2, ((int) d.doubleValue()) - 1) == -1) {
                return null;
            }
            return new Object[]{new Double((double) (str.indexOf(str2, ((int) d.doubleValue()) - 1) + 1)), new Double((double) (str2.length() + str.indexOf(str2, ((int) d.doubleValue()) - 1)))};
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib find: ", e);
            }
            throw new LuaError("String.find", 302);
        } catch (Throwable e2) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib find: ", e2);
            }
            throw new LuaError("String.find", 303);
        } catch (Throwable e22) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib find: ", e22);
            }
            throw new LuaError("String.find", 309);
        }
    }

    private static Object[] m2266k(Object[] objArr) {
        if (objArr.length != 2) {
            throw new LuaError("String.toUpperCase().equals", 301);
        }
        try {
            Boolean bool = objArr[0].toString().equalsIgnoreCase(objArr[1].toString()) ? Boolean.TRUE : Boolean.FALSE;
            return new Object[]{bool};
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib equalsIgnoreCase : ", e);
            }
            throw new LuaError("String.toUpperCase().equals", 302);
        }
    }

    private static Object[] m2267l(Object[] objArr) {
        if (objArr.length != 2) {
            throw new LuaError("String.compare", 301);
        }
        try {
            int compareTo = ((String) objArr[0]).compareTo((String) objArr[1]);
            Double d = compareTo != 0 ? compareTo < 0 ? new Double(-1.0d) : new Double(1.0d) : new Double(0.0d);
            return new Object[]{d};
        } catch (Throwable e) {
            if (KonyMain.f3658f) {
                Log.w("StringLib", "StringLib compare: ", e);
            }
            throw new LuaError("String.compare", 302);
        }
    }

    private static Object[] m2268m(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        String obj = objArr[0].toString();
        if (KonyMain.f3657e) {
            Log.d("StringLib", "Format called for the string : " + obj);
        }
        char[] toCharArray = obj.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        int i2 = 1;
        while (i < toCharArray.length) {
            char c = toCharArray[i];
            if (c != '%' || objArr.length <= i2) {
                stringBuffer.append(c);
            } else if (i != toCharArray.length - 1) {
                int i3 = i + 1;
                char c2 = toCharArray[i3];
                if (c2 == 'b') {
                    if (KonyMain.f3659g) {
                        Log.e("StringLib", "Replacing %b with : " + objArr[i2]);
                    }
                    stringBuffer.append(((Boolean) objArr[i2]).booleanValue());
                    i2++;
                    i = i3;
                } else if (c2 == 's' || c2 == 'f') {
                    if (KonyMain.f3657e) {
                        Log.d("StringLib", "Replacing " + c + c2 + " with : " + objArr[i2]);
                    }
                    stringBuffer.append(objArr[i2].toString());
                    i2++;
                    i = i3;
                } else {
                    stringBuffer.append(c);
                    stringBuffer.append(c2);
                    i = i3;
                }
            } else {
                stringBuffer.append(c);
            }
            i++;
        }
        return new Object[]{stringBuffer};
    }

    private static Object[] m2269n(Object[] objArr) {
        if (objArr == null || objArr.length == 0 || objArr[0] == LuaNil.nil) {
            return new Object[]{new Boolean(false)};
        } else if (objArr[0] instanceof Double) {
            return new Object[]{new Boolean(true)};
        } else {
            char[] toCharArray = objArr[0].toString().trim().toCharArray();
            if (toCharArray.length == 0) {
                return new Object[]{new Boolean(false)};
            }
            boolean z;
            int i = 0;
            while (i < toCharArray.length) {
                if ((toCharArray[i] < 'A' || toCharArray[i] > 'Z') && ((toCharArray[i] < 'a' || toCharArray[i] > 'z') && (toCharArray[i] < '0' || toCharArray[i] > '9'))) {
                    z = false;
                    break;
                }
                i++;
            }
            z = true;
            return new Object[]{new Boolean(z)};
        }
    }

    private static Object[] m2270o(Object[] objArr) {
        if (objArr == null || objArr.length == 0 || objArr[0] == LuaNil.nil) {
            return new Object[]{new Boolean(false)};
        } else if (objArr[0] instanceof Double) {
            return new Object[]{new Boolean(true)};
        } else {
            boolean z;
            try {
                Double.parseDouble(objArr[0].toString());
                z = true;
            } catch (NumberFormatException e) {
                z = false;
            }
            return new Object[]{new Boolean(z)};
        }
    }

    private static Object[] m2271p(Object[] objArr) {
        if (objArr == null || objArr.length == 0 || objArr[0] == LuaNil.nil) {
            return new Object[]{new Boolean(false)};
        }
        char[] toCharArray = objArr[0].toString().trim().toCharArray();
        if (toCharArray.length == 0) {
            return new Object[]{new Boolean(false)};
        }
        boolean z;
        int i = 0;
        while (i < toCharArray.length) {
            if ((toCharArray[i] < 'A' || toCharArray[i] > 'Z') && (toCharArray[i] < 'a' || toCharArray[i] > 'z')) {
                z = false;
                break;
            }
            i++;
        }
        z = true;
        return new Object[]{new Boolean(z)};
    }

    private static Object[] m2272q(Object[] objArr) {
        if (objArr == null || (objArr != null && objArr.length < 2)) {
            return new Object[]{new Boolean(false)};
        } else if (objArr[0] == LuaNil.nil || objArr[1] == LuaNil.nil) {
            return new Object[]{new Boolean(false)};
        } else {
            boolean z;
            char[] toCharArray = objArr[0].toString().toCharArray();
            LuaTable luaTable = (LuaTable) objArr[1];
            TableEnumeration tableEnumeration = luaTable.enumeration;
            tableEnumeration.reset();
            if (KonyMain.f3657e) {
                Log.d("StringLib", "containsonlygivenchars() str = " + objArr[0] + " keys.size() = " + luaTable.arraySize());
            }
            if (tableEnumeration == null || luaTable.arraySize() <= 0) {
                if (KonyMain.f3657e) {
                    Log.d("StringLib", "containsonlygivenchars() Invalid input str = " + objArr[0] + " keys.size() = " + (tableEnumeration == null ? null : Integer.valueOf(luaTable.arraySize())));
                }
                z = false;
            } else {
                int i = 0;
                while (tableEnumeration.hasMoreElements() && r8 > 0 && r2 <= r8) {
                    String str = (String) luaTable.getTable(tableEnumeration.nextElement());
                    if (str == null || str.length() <= 0) {
                        i = i;
                    } else {
                        int i2 = 0;
                        do {
                            if (toCharArray[i2] != '\u0000' && toCharArray[i2] == str.charAt(0)) {
                                toCharArray[i2] = '\u0000';
                                i++;
                            }
                            i2++;
                        } while (i2 < r8);
                        i = i;
                    }
                }
                for (char c : toCharArray) {
                    if (c != '\u0000') {
                        z = false;
                        break;
                    }
                }
                z = true;
            }
            return new Object[]{new Boolean(z)};
        }
    }

    public final Object[] execute(int i, Object[] objArr) {
        Object[] objArr2;
        String obj;
        String obj2;
        boolean booleanValue;
        LuaTable luaTable;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return C0345L.m2265j(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return C0345L.m2263h(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return C0345L.m2264i(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                return C0345L.m2262g(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                return C0345L.m2261f(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                return C0345L.m2260e(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                return C0345L.m2259d(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                return C0345L.m2258c(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                return C0345L.m2257b(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                return C0345L.m2256a(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                if (objArr == null || objArr.length < 2 || !(objArr[0] instanceof String)) {
                    throw new LuaError("String.startsWith", 301);
                }
                obj = objArr[0].toString();
                obj2 = objArr[1].toString();
                booleanValue = (objArr.length != 3 || objArr[2] == LuaNil.nil) ? true : ((Boolean) objArr[2]).booleanValue();
                booleanValue = booleanValue ? obj2.length() <= obj.length() && obj.substring(0, obj2.length()).equalsIgnoreCase(obj2) : obj.startsWith(obj2);
                if (booleanValue) {
                    return new Object[]{Boolean.TRUE};
                }
                return new Object[]{Boolean.FALSE};
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                if (objArr == null || objArr.length < 2 || !(objArr[0] instanceof String)) {
                    throw new LuaError("String.endsWith", 301);
                }
                obj = objArr[0].toString();
                obj2 = objArr[1].toString();
                booleanValue = (objArr.length != 3 || objArr[2] == LuaNil.nil) ? true : ((Boolean) objArr[2]).booleanValue();
                booleanValue = booleanValue ? obj2.length() <= obj.length() && obj.substring(obj.length() - obj2.length()).equalsIgnoreCase(obj2) : obj.endsWith(obj2);
                if (booleanValue) {
                    return new Object[]{Boolean.TRUE};
                }
                return new Object[]{Boolean.FALSE};
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJECT /*12*/:
                return C0345L.m2266k(objArr);
            case KonyCustomWidget.NATIVE_DATA_TYPE_HASHTABLE /*13*/:
                if (objArr.length != 2) {
                    throw new LuaError("String.charat", 301);
                }
                obj = objArr[0].toString();
                int doubleValue = (int) ((Double) objArr[1]).doubleValue();
                if (doubleValue > obj.length() || doubleValue <= 0) {
                    return new Object[]{LuaNil.nil};
                }
                char charAt = obj.charAt(doubleValue - 1);
                char[] cArr = new char[]{charAt};
                return new Object[]{new String(cArr)};
            case KonyCustomWidget.NATIVE_DATA_TYPE_FUNCTION /*14*/:
                return C0345L.m2267l(objArr);
            case ViewDragHelper.EDGE_ALL /*15*/:
                return C0345L.m2268m(objArr);
            case TransportMediator.FLAG_KEY_MEDIA_PAUSE /*16*/:
                return C0345L.m2271p(objArr);
            case LuaWidget.KONY_WIDGET_POS_MIDDLE_CENTER /*17*/:
                return C0345L.m2269n(objArr);
            case MotionEventCompat.AXIS_RTRIGGER /*18*/:
                return C0345L.m2270o(objArr);
            case LuaWidget.KONY_WIDGET_POS_MIDDLE_LEFT /*19*/:
                if (objArr != null && (objArr == null || objArr.length >= 2)) {
                    if (objArr[0] != LuaNil.nil && objArr[1] != LuaNil.nil) {
                        luaTable = (LuaTable) objArr[1];
                        booleanValue = luaTable.arraySize() > 0 ? C0345L.m2255a(objArr[0].toString(), luaTable) : false;
                        objArr2 = new Object[]{Boolean.valueOf(booleanValue)};
                        break;
                    }
                    return new Object[]{new Boolean(false)};
                }
                return new Object[]{new Boolean(false)};
                break;
            case MotionEventCompat.AXIS_RUDDER /*20*/:
                return C0345L.m2272q(objArr);
            case LuaWidget.KONY_WIDGET_POS_MIDDLE_RIGHT /*21*/:
                if (objArr != null && (objArr == null || objArr.length >= 2)) {
                    if (objArr[0] != LuaNil.nil && objArr[1] != LuaNil.nil) {
                        luaTable = (LuaTable) objArr[1];
                        booleanValue = luaTable.arraySize() > 0 ? !C0345L.m2255a(objArr[0].toString(), luaTable) : false;
                        objArr2 = new Object[]{new Boolean(booleanValue)};
                        break;
                    }
                    return new Object[]{new Boolean(false)};
                }
                return new Object[]{new Boolean(false)};
                break;
            case MotionEventCompat.AXIS_GAS /*22*/:
                if (objArr == null || objArr.length == 0 || objArr[0] == LuaNil.nil) {
                    return new Object[]{new Boolean(false)};
                }
                String str = (String) objArr[0];
                this.f2390b = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                this.f2391c = this.f2390b.matcher(str);
                return new Object[]{new Boolean(this.f2391c.matches())};
            default:
                throw new LuaError("No such smethod error", 308);
        }
        return objArr2;
    }

    public final String[] getMethods() {
        return f2389a;
    }

    public final String getNameSpace() {
        return "string";
    }
}
