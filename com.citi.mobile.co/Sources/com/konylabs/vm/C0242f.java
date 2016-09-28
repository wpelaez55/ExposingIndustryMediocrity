package com.konylabs.vm;

import android.support.v4.media.TransportMediator;
import android.support.v4.view.InputDeviceCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.widget.ViewDragHelper;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.api.ui.LuaWidget;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Vector;
import net.sourceforge.zbar.Config;
import net.sourceforge.zbar.Symbol;

/* renamed from: com.konylabs.vm.f */
public class C0242f implements Serializable {
    public static Hashtable f1834a;
    public static Object f1835c;
    private static Boolean f1836d;
    private static Boolean f1837e;
    private static Hashtable f1838f;
    public C0239c f1839b;

    static {
        f1836d = Boolean.TRUE;
        f1837e = Boolean.FALSE;
        f1834a = new Hashtable();
        f1838f = new Hashtable();
        f1835c = new Object();
    }

    public C0242f(C0239c c0239c) {
        this.f1839b = null;
        this.f1839b = c0239c;
    }

    public C0242f(C0239c c0239c, Hashtable hashtable) {
        this.f1839b = null;
        f1834a = hashtable;
        this.f1839b = c0239c;
    }

    public static C0242f m1681a(C0239c c0239c) {
        return C0247l.f1849a ? new C0413g(c0239c) : new C0242f(c0239c);
    }

    public static C0242f m1682a(C0239c c0239c, Hashtable hashtable) {
        return C0247l.f1849a ? new C0413g(c0239c, hashtable) : new C0242f(c0239c, hashtable);
    }

    protected static void m1683a(int i, int i2, int i3, C0246k c0246k) {
        StringBuffer stringBuffer = new StringBuffer();
        while (i2 <= i3) {
            Object obj = c0246k.f1844a[i2];
            if (obj != null) {
                if (obj instanceof Double) {
                    stringBuffer.append(new DecimalFormat("#.######", new DecimalFormatSymbols(Locale.US)).format(((Double) obj).doubleValue()));
                } else {
                    stringBuffer.append(obj.toString());
                }
            }
            i2++;
        }
        c0246k.f1844a[i] = stringBuffer.toString();
        c0246k.f1846c = i;
    }

    protected static void m1684a(int i, int i2, C0246k c0246k) {
        c0246k.f1844a[i] = new Double(-1.0d * ((Double) c0246k.f1844a[i2]).doubleValue());
        c0246k.f1846c = i;
    }

    protected static void m1685a(int i, C0246k c0246k) {
        c0246k.f1848e += i;
    }

    protected static void m1686a(Function function, int i, int i2, C0246k c0246k) {
        C0251q c0251q = function.f1784c[i2];
        c0246k.f1844a[i] = c0251q.f1879c != -99 ? c0251q.f1877a.f1844a[c0251q.f1879c] : c0251q.f1878b;
        c0246k.f1846c = i;
    }

    protected static void m1687a(Function function, C0241e c0241e, int i, int i2, C0246k c0246k) {
        C0241e c0241e2 = c0241e.f1826f[i2];
        C0251q[] c0251qArr = new C0251q[c0241e2.f1827g];
        Function function2 = new Function(c0241e2, true);
        function2.f1784c = c0251qArr;
        c0246k.f1844a[i] = function2;
        c0246k.f1847d.addElement(function2);
        c0246k.f1846c = i;
        for (int i3 = 0; i3 < c0241e2.f1827g; i3++) {
            int[] iArr = c0241e.f1824d;
            int i4 = c0246k.f1848e + 1;
            c0246k.f1848e = i4;
            int i5 = iArr[i4];
            i4 = C0252r.m1765a(i5, 0, 6);
            C0252r.m1765a(i5, 6, 14);
            i5 = C0252r.m1765a(i5, 23, 32);
            if (i4 == 0) {
                C0251q c0251q = new C0251q();
                c0251q.f1878b = c0246k.f1844a[i5];
                c0251q.f1879c = i5;
                c0251q.f1877a = c0246k;
                function2.f1784c[i3] = c0251q;
            } else if (i4 == 4) {
                function2.f1784c[i3] = function.f1784c[i5];
            }
        }
    }

    protected static void m1688a(C0241e c0241e, int i, int i2, C0246k c0246k) {
        Object obj = f1834a.get(((String) c0241e.f1825e[i2]).trim());
        if (obj == null) {
            obj = LuaNil.nil;
        }
        c0246k.f1844a[i] = obj;
        c0246k.f1846c = i;
    }

    private static void m1689a(C0246k c0246k, int i) {
        Function[] functionArr = new Function[c0246k.f1847d.size()];
        c0246k.f1847d.copyInto(functionArr);
        while (i <= c0246k.f1846c) {
            C0251q c0251q = new C0251q();
            for (int i2 = 0; i2 < functionArr.length; i2++) {
                C0251q[] c0251qArr = functionArr[i2].f1784c;
                if (c0251qArr != null) {
                    for (int i3 = 0; i3 < c0251qArr.length; i3++) {
                        C0251q c0251q2 = c0251qArr[i3];
                        if (c0251q2.f1877a == c0246k && c0251q2.f1879c == i) {
                            c0251q.f1878b = c0246k.f1844a[c0251q2.f1879c];
                            c0251q.f1879c = -99;
                            functionArr[i2].f1784c[i3] = c0251q;
                            c0251q2.f1877a = null;
                        }
                    }
                }
            }
            i++;
        }
        c0246k.f1847d.removeAllElements();
    }

    private final Object[] m1690a(C0241e c0241e, Function function, int i, int i2, int i3, C0246k c0246k) throws Exception {
        String str;
        Object[] a;
        Object[] objArr = new Object[(i2 == 0 ? c0246k.f1846c - i : i2 - 1)];
        int length = (objArr.length + i) + 1;
        int i4 = i + 1;
        int i5 = 0;
        while (i4 < length) {
            objArr[i5] = c0246k.f1844a[i4];
            i4++;
            i5++;
        }
        if (C0247l.f1850b != null) {
            String str2;
            C0247l.f1850b.m1763b();
            if (function.f1785d) {
                str2 = (String) f1838f.get(function);
                if (str2 == null) {
                    for (String str22 : f1834a.keySet()) {
                        Object obj = f1834a.get(str22);
                        if (f1838f.get(obj) == null) {
                            f1838f.put(obj, str22);
                        }
                    }
                    str22 = (String) f1838f.get(function);
                }
                if (str22 == null) {
                    str22 = c0241e.toString();
                }
            } else {
                C0243h c0243h = (C0243h) function.f1783b;
                str22 = c0243h.f1840a.getNameSpace() + "." + c0243h.f1840a.getMethods()[c0243h.f1841b];
            }
            C0247l.f1850b.m1764c();
            C0247l.f1850b.m1762a(str22, function.f1785d);
            str = str22;
        } else {
            str = null;
        }
        if (function.f1785d) {
            C0241e c0241e2 = (C0241e) function.f1783b;
            C0246k c0246k2 = new C0246k();
            int length2 = objArr.length - c0241e2.f1830j;
            c0246k2.m1731a(length2 > 0 ? c0241e2.f1828h + length2 : c0241e2.f1828h);
            length = 0;
            while (length < objArr.length && length < c0241e2.f1830j) {
                c0246k2.f1844a[length] = objArr[length];
                length++;
            }
            Object[] objArr2;
            if (c0241e2.f1829i == 3 || c0241e2.f1829i == 2) {
                objArr2 = new Object[(length2 > 0 ? length2 : 0)];
                for (length = 0; length < objArr2.length; length++) {
                    objArr2[length] = objArr[c0241e2.f1830j + length];
                }
                c0246k2.f1845b = objArr2;
            } else if (c0241e2.f1829i == 7) {
                if (length2 <= 0) {
                    length2 = 0;
                }
                objArr2 = new Object[length2];
                for (length = 0; length < objArr2.length; length++) {
                    objArr2[length] = objArr[c0241e2.f1830j + length];
                }
                LuaTable luaTable = new LuaTable(objArr2.length, 0);
                Vector vector = luaTable.list;
                for (Object addElement : objArr2) {
                    vector.addElement(addElement);
                }
                c0246k2.f1844a[c0241e2.f1830j] = luaTable;
                luaTable.setTable("n", new Double((double) vector.size()));
            }
            a = m1720a(function, c0246k2, false);
        } else {
            a = ((C0243h) function.f1783b).m1724a(objArr);
        }
        if (C0247l.f1850b != null) {
            C0247l.f1850b.m1761a(str);
        }
        return a;
    }

    protected static void m1691b(int i, int i2, int i3, C0246k c0246k) {
        int a = C0252r.m1765a(i2, 0, 3);
        int a2 = C0252r.m1765a(i2, 3, 8);
        if (a2 > 0) {
            a = ((a + 8) * (2 << (a2 - 1))) / 2;
        }
        a2 = C0252r.m1765a(i3, 0, 3);
        int a3 = C0252r.m1765a(i3, 3, 8);
        if (a3 > 0) {
            a2 = ((a2 + 8) * (2 << (a3 - 1))) / 2;
        }
        c0246k.f1844a[i] = new LuaTable(a, a2);
        c0246k.f1846c = i;
    }

    protected static void m1692b(int i, int i2, C0246k c0246k) {
        c0246k.f1844a[i] = C0252r.m1767a(c0246k.f1844a[i2]) ? f1837e : f1836d;
        c0246k.f1846c = i;
    }

    protected static void m1693b(Function function, int i, int i2, C0246k c0246k) {
        C0251q c0251q = function.f1784c[i2];
        if (c0251q.f1879c != -99) {
            c0251q.f1877a.f1844a[c0251q.f1879c] = c0246k.f1844a[i];
        } else {
            c0251q.f1878b = c0246k.f1844a[i];
        }
    }

    protected static void m1694b(C0241e c0241e, int i, int i2, int i3, C0246k c0246k) {
        c0246k.f1844a[i] = new Double(((Double) (i3 >= Config.X_DENSITY ? c0241e.f1825e[i3 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i3])).doubleValue() + ((Double) (i2 >= Config.X_DENSITY ? c0241e.f1825e[i2 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i2])).doubleValue());
        c0246k.f1846c = i;
    }

    protected static void m1695b(C0241e c0241e, int i, int i2, C0246k c0246k) {
        String str = (String) c0241e.f1825e[i2];
        Object obj = c0246k.f1844a[i];
        f1834a.put(str.trim(), obj != null ? obj : LuaNil.nil);
    }

    protected static void m1696c(int i, int i2, int i3, C0246k c0246k) {
        if (C0252r.m1767a(c0246k.f1844a[i2]) == (i3 != 0)) {
            c0246k.f1844a[i] = c0246k.f1844a[i2];
            c0246k.f1846c = i;
            return;
        }
        c0246k.f1848e++;
    }

    protected static void m1697c(int i, int i2, C0246k c0246k) {
        c0246k.f1844a[i] = i2 == 0 ? f1837e : f1836d;
        c0246k.f1846c = i;
    }

    protected static void m1698c(C0241e c0241e, int i, int i2, int i3, C0246k c0246k) {
        c0246k.f1844a[i] = new Double(((Double) (i2 >= Config.X_DENSITY ? c0241e.f1825e[i2 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i2])).doubleValue() - ((Double) (i3 >= Config.X_DENSITY ? c0241e.f1825e[i3 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i3])).doubleValue());
        c0246k.f1846c = i;
    }

    protected static void m1699c(C0241e c0241e, int i, int i2, C0246k c0246k) {
        c0246k.f1844a[i] = c0241e.f1825e[i2];
        c0246k.f1846c = i;
    }

    protected static void m1700d(int i, int i2, C0246k c0246k) {
        Object obj = c0246k.f1844a[i2];
        if ((obj instanceof String) || (obj instanceof Double)) {
            c0246k.f1844a[i] = new Double((double) obj.toString().length());
        } else if (obj instanceof LuaTable) {
            c0246k.f1844a[i] = new Double((double) ((LuaTable) obj).size());
        }
        c0246k.f1846c = i;
    }

    protected static void m1701d(C0241e c0241e, int i, int i2, int i3, C0246k c0246k) {
        c0246k.f1844a[i] = new Double(((Double) (i3 >= Config.X_DENSITY ? c0241e.f1825e[i3 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i3])).doubleValue() * ((Double) (i2 >= Config.X_DENSITY ? c0241e.f1825e[i2 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i2])).doubleValue());
        c0246k.f1846c = i;
    }

    protected static void m1702e(int i, int i2, C0246k c0246k) {
        while (i <= i2) {
            c0246k.f1844a[i] = LuaNil.nil;
            i++;
        }
        c0246k.f1846c = i - 1;
    }

    protected static void m1703e(C0241e c0241e, int i, int i2, int i3, C0246k c0246k) {
        c0246k.f1844a[i] = new Double(((Double) (i2 >= Config.X_DENSITY ? c0241e.f1825e[i2 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i2])).doubleValue() / ((Double) (i3 >= Config.X_DENSITY ? c0241e.f1825e[i3 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i3])).doubleValue());
        c0246k.f1846c = i;
    }

    protected static void m1704f(int i, int i2, C0246k c0246k) {
        c0246k.f1844a[i] = c0246k.f1844a[i2];
        c0246k.f1846c = i;
    }

    protected static void m1705f(C0241e c0241e, int i, int i2, int i3, C0246k c0246k) {
        c0246k.f1844a[i] = new Double(((Double) (i2 >= Config.X_DENSITY ? c0241e.f1825e[i2 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i2])).doubleValue() % ((Double) (i3 >= Config.X_DENSITY ? c0241e.f1825e[i3 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i3])).doubleValue());
        c0246k.f1846c = i;
    }

    protected static void m1706g(int i, int i2, C0246k c0246k) {
        if (C0252r.m1767a(c0246k.f1844a[i]) != (i2 != 0)) {
            c0246k.f1848e++;
        }
    }

    protected static void m1707g(C0241e c0241e, int i, int i2, int i3, C0246k c0246k) {
        long doubleValue = (long) ((Double) (i3 >= Config.X_DENSITY ? c0241e.f1825e[i3 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i3])).doubleValue();
        double d = 1.0d;
        double doubleValue2 = ((Double) (i2 >= Config.X_DENSITY ? c0241e.f1825e[i2 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i2])).doubleValue();
        for (long j = 0; j < doubleValue; j++) {
            d *= doubleValue2;
        }
        c0246k.f1844a[i] = new Double(d);
        c0246k.f1846c = i;
    }

    protected static void m1708h(int i, int i2, C0246k c0246k) {
        c0246k.f1844a[i] = new Double(((Double) c0246k.f1844a[i]).doubleValue() - ((Double) c0246k.f1844a[i + 2]).doubleValue());
        c0246k.f1846c = i;
        c0246k.f1848e += i2;
    }

    protected static void m1709h(C0241e c0241e, int i, int i2, int i3, C0246k c0246k) {
        Vector vector = ((LuaTable) c0246k.f1844a[i]).list;
        if (i3 == 0) {
            int[] iArr = c0241e.f1824d;
            c0246k.f1848e++;
        }
        if (i2 == 0) {
            i2 = c0246k.f1846c - i;
        }
        int i4 = 0;
        int i5 = 1;
        while (i4 < i2) {
            vector.addElement(c0246k.f1844a[i + i5]);
            i4++;
            i5++;
        }
    }

    protected static void m1710i(int i, int i2, C0246k c0246k) {
        Double d = (Double) c0246k.f1844a[i + 2];
        Double d2 = (Double) c0246k.f1844a[i + 1];
        Double d3 = new Double(((Double) c0246k.f1844a[i]).doubleValue() + d.doubleValue());
        c0246k.f1844a[i] = d3;
        c0246k.f1846c = i;
        if (0.0d < d.doubleValue() && d3.doubleValue() <= d2.doubleValue()) {
            c0246k.f1848e += i2;
            c0246k.f1844a[i + 3] = d3;
            c0246k.f1846c = i + 3;
        } else if (d.doubleValue() < 0.0d && d2.doubleValue() <= d3.doubleValue()) {
            c0246k.f1848e += i2;
            c0246k.f1844a[i + 3] = d3;
            c0246k.f1846c = i + 3;
        }
    }

    protected static void m1711i(C0241e c0241e, int i, int i2, int i3, C0246k c0246k) {
        Object obj = i3 >= Config.X_DENSITY ? c0241e.f1825e[i3 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i3];
        LuaTable luaTable = null;
        if (c0246k.f1844a[i2] instanceof LuaTable) {
            luaTable = (LuaTable) c0246k.f1844a[i2];
        }
        Object table = luaTable != null ? luaTable.getTable(obj) : LuaNil.nil;
        Object[] objArr = c0246k.f1844a;
        if (table == null) {
            table = LuaNil.nil;
        }
        objArr[i] = table;
        c0246k.f1846c = i;
    }

    protected static void m1712j(int i, int i2, C0246k c0246k) {
        Object[] objArr = c0246k.f1845b;
        int length = i2 == 0 ? objArr == null ? 0 : objArr.length : i2 - 1;
        int i3 = 0;
        while (i3 < length) {
            Object[] objArr2 = c0246k.f1844a;
            int i4 = i + i3;
            LuaNil luaNil = (objArr == null || i3 >= objArr.length) ? LuaNil.nil : objArr[i3];
            objArr2[i4] = luaNil;
            i3++;
        }
        c0246k.f1846c = (i + i3) - 1;
    }

    protected static void m1713j(C0241e c0241e, int i, int i2, int i3, C0246k c0246k) {
        Object obj = i2 >= Config.X_DENSITY ? c0241e.f1825e[i2 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i2];
        Object obj2 = i3 >= Config.X_DENSITY ? c0241e.f1825e[i3 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i3];
        LuaTable luaTable = (LuaTable) c0246k.f1844a[i];
        if (obj2 == null) {
            obj2 = LuaNil.nil;
        }
        luaTable.setTable(obj, obj2);
    }

    protected static void m1714k(C0241e c0241e, int i, int i2, int i3, C0246k c0246k) {
        boolean z = i != 0;
        Object obj = i2 >= Config.X_DENSITY ? c0241e.f1825e[i2 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i2];
        Object obj2 = i3 >= Config.X_DENSITY ? c0241e.f1825e[i3 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i3];
        if ((obj instanceof Double) && (obj2 instanceof Double)) {
            if ((((Double) obj).doubleValue() == ((Double) obj2).doubleValue()) != z) {
                c0246k.f1848e++;
            }
        } else if (obj.equals(obj2) != z) {
            c0246k.f1848e++;
        }
    }

    protected static void m1715l(C0241e c0241e, int i, int i2, int i3, C0246k c0246k) {
        Object obj = null;
        if (i == 0) {
            Object obj2 = null;
        } else {
            int i4 = 1;
        }
        Object obj3 = i2 >= Config.X_DENSITY ? c0241e.f1825e[i2 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i2];
        Object obj4 = i3 >= Config.X_DENSITY ? c0241e.f1825e[i3 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i3];
        if ((obj3 instanceof Double) && (obj4 instanceof Double)) {
            obj = ((Double) obj3).doubleValue() < ((Double) obj4).doubleValue() ? 1 : null;
        } else if ((obj3 instanceof String) && (obj4 instanceof String) && ((String) obj3).compareTo(obj4.toString()) < 0) {
            int i5 = 1;
        }
        if (obj != obj2) {
            c0246k.f1848e++;
        }
    }

    protected static void m1716m(C0241e c0241e, int i, int i2, int i3, C0246k c0246k) {
        Object obj = null;
        if (i == 0) {
            Object obj2 = null;
        } else {
            int i4 = 1;
        }
        Object obj3 = i2 >= Config.X_DENSITY ? c0241e.f1825e[i2 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i2];
        Object obj4 = i3 >= Config.X_DENSITY ? c0241e.f1825e[i3 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i3];
        if ((obj3 instanceof Double) && (obj4 instanceof Double)) {
            obj = ((Double) obj3).doubleValue() <= ((Double) obj4).doubleValue() ? 1 : null;
        } else if ((obj3 instanceof String) && (obj4 instanceof String) && ((String) obj3).compareTo((String) obj4) <= 0) {
            int i5 = 1;
        }
        if (obj != obj2) {
            c0246k.f1848e++;
        }
    }

    protected static void m1717o(C0241e c0241e, int i, int i2, int i3, C0246k c0246k) {
        c0246k.f1844a[i + 1] = c0246k.f1844a[i2];
        c0246k.f1844a[i] = ((LuaTable) c0246k.f1844a[i2]).getTable(i3 >= Config.X_DENSITY ? c0241e.f1825e[i3 + InputDeviceCompat.SOURCE_ANY] : c0246k.f1844a[i3]);
        c0246k.f1846c = i;
    }

    protected final void m1718a(C0241e c0241e, int i, int i2, int i3, C0246k c0246k) throws Exception {
        try {
            Function function = (Function) c0246k.f1844a[i];
            if (function == null) {
                throw new LuaError("Attempt to call a cosure which is nil", 108);
            }
            Object[] a = m1690a(c0241e, function, i, i2, i3, c0246k);
            C0239c c0239c = this.f1839b;
            if (a != null) {
                if (c0246k.f1844a.length < a.length + i) {
                    c0246k.m1732b(a.length + i);
                }
                int i4 = 0;
                while (i4 < a.length) {
                    c0246k.f1844a[i + i4] = a[i4] == null ? LuaNil.nil : a[i4];
                    i4++;
                }
                if (a.length < i3 - 1) {
                    do {
                        c0246k.f1844a[i + i4] = LuaNil.nil;
                        i4++;
                    } while (i4 < i3 - 1);
                }
                c0246k.f1846c = (i4 + i) - 1;
                return;
            }
            c0246k.f1844a[i] = LuaNil.nil;
            c0246k.f1846c = i;
        } catch (ClassCastException e) {
            throw new LuaError("Attempt to call non closure", 108);
        }
    }

    protected final void m1719a(C0241e c0241e, int i, C0246k c0246k) {
        C0242f.m1689a(c0246k, i);
    }

    public Object[] m1720a(Function function, C0246k c0246k, boolean z) throws Exception {
        C0241e c0241e = (C0241e) function.f1783b;
        if (!c0241e.f1821a) {
            C0247l.m1736a(c0241e);
        }
        int[] iArr = c0241e.f1824d;
        this.f1839b.m1677a().push(c0246k);
        synchronized (f1835c) {
            f1835c.notifyAll();
        }
        int length = iArr.length;
        while (c0246k.f1848e < length) {
            int i = iArr[c0246k.f1848e];
            C0241e.f1819n = c0241e;
            if (c0241e.f1831k != null && c0241e.f1831k.length > 0) {
                C0241e.f1820o = c0241e.f1831k[c0246k.f1848e];
            }
            int a;
            int a2;
            switch (C0252r.m1765a(i, 0, 6)) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                    C0242f.m1704f(C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), c0246k);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    C0242f.m1699c(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 14, 32), c0246k);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    a = C0252r.m1765a(i, 6, 14);
                    a2 = C0252r.m1765a(i, 14, 23);
                    C0242f.m1697c(a, C0252r.m1765a(i, 23, 32), c0246k);
                    if (a2 == 0) {
                        break;
                    }
                    c0246k.f1848e++;
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                    a = C0252r.m1765a(i, 6, 14);
                    C0252r.m1765a(i, 14, 23);
                    C0242f.m1702e(a, C0252r.m1765a(i, 23, 32), c0246k);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                    C0242f.m1686a(function, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), c0246k);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                    C0242f.m1688a(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 14, 32), c0246k);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                    C0242f.m1711i(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                    C0242f.m1695b(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 14, 32), c0246k);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                    C0242f.m1693b(function, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), c0246k);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                    C0242f.m1713j(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                    C0242f.m1691b(C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                    C0242f.m1717o(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJECT /*12*/:
                    C0242f.m1694b(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_HASHTABLE /*13*/:
                    C0242f.m1698c(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_FUNCTION /*14*/:
                    C0242f.m1701d(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case ViewDragHelper.EDGE_ALL /*15*/:
                    C0242f.m1703e(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case TransportMediator.FLAG_KEY_MEDIA_PAUSE /*16*/:
                    C0242f.m1705f(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case LuaWidget.KONY_WIDGET_POS_MIDDLE_CENTER /*17*/:
                    C0242f.m1707g(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case MotionEventCompat.AXIS_RTRIGGER /*18*/:
                    a = C0252r.m1765a(i, 6, 14);
                    C0252r.m1765a(i, 14, 23);
                    C0242f.m1684a(a, C0252r.m1765a(i, 23, 32), c0246k);
                    break;
                case LuaWidget.KONY_WIDGET_POS_MIDDLE_LEFT /*19*/:
                    a = C0252r.m1765a(i, 6, 14);
                    C0252r.m1765a(i, 14, 23);
                    C0242f.m1692b(a, C0252r.m1765a(i, 23, 32), c0246k);
                    break;
                case MotionEventCompat.AXIS_RUDDER /*20*/:
                    C0242f.m1700d(C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), c0246k);
                    break;
                case LuaWidget.KONY_WIDGET_POS_MIDDLE_RIGHT /*21*/:
                    C0242f.m1683a(C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case MotionEventCompat.AXIS_GAS /*22*/:
                    C0252r.m1765a(i, 6, 14);
                    C0242f.m1685a(C0252r.m1765a(i, 14, 32) - 131071, c0246k);
                    break;
                case MotionEventCompat.AXIS_BRAKE /*23*/:
                    C0242f.m1714k(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case MotionEventCompat.AXIS_DISTANCE /*24*/:
                    C0242f.m1715l(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case Symbol.I25 /*25*/:
                    C0242f.m1716m(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case 26:
                    a = C0252r.m1765a(i, 6, 14);
                    a2 = C0252r.m1765a(i, 14, 23);
                    C0252r.m1765a(i, 23, 32);
                    C0242f.m1706g(a, a2, c0246k);
                    break;
                case 27:
                    C0242f.m1696c(C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case 28:
                    m1718a(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                    break;
                case 29:
                    return m1723n(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), C0252r.m1765a(i, 14, 23), c0246k);
                case 30:
                    return m1721d(c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 23, 32), c0246k);
                case 31:
                    C0242f.m1710i(C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 14, 32) - 131071, c0246k);
                    break;
                case TransportMediator.FLAG_KEY_MEDIA_STOP /*32*/:
                    C0242f.m1708h(C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 14, 32) - 131071, c0246k);
                    break;
                case Config.MAX_LEN /*33*/:
                    a = C0252r.m1765a(i, 6, 14);
                    a2 = C0252r.m1765a(i, 14, 23);
                    C0252r.m1765a(i, 23, 32);
                    m1722e(c0241e, a, a2, c0246k);
                    break;
                case Symbol.DATABAR /*34*/:
                    a2 = C0252r.m1765a(i, 6, 14);
                    a = C0252r.m1765a(i, 14, 23);
                    i = C0252r.m1765a(i, 23, 32);
                    if (a == 0) {
                        int[] iArr2 = c0241e.f1824d;
                        int i2 = c0246k.f1848e;
                        c0246k.f1848e = i2 + 1;
                        a = iArr2[i2];
                    }
                    C0242f.m1709h(c0241e, a2, i, a, c0246k);
                    break;
                case Symbol.DATABAR_EXP /*35*/:
                    C0242f.m1689a(c0246k, C0252r.m1765a(i, 6, 14));
                    break;
                case MotionEventCompat.AXIS_GENERIC_5 /*36*/:
                    C0242f.m1687a(function, c0241e, C0252r.m1765a(i, 6, 14), C0252r.m1765a(i, 14, 32), c0246k);
                    break;
                case MotionEventCompat.AXIS_GENERIC_6 /*37*/:
                    a = C0252r.m1765a(i, 6, 14);
                    C0252r.m1765a(i, 14, 23);
                    C0242f.m1712j(a, C0252r.m1765a(i, 23, 32), c0246k);
                    break;
                default:
                    break;
            }
            c0246k.f1848e++;
        }
        return null;
    }

    protected final Object[] m1721d(C0241e c0241e, int i, int i2, C0246k c0246k) {
        int i3 = i2 == 0 ? (c0246k.f1846c - i) + 1 : i2 - 1;
        Object[] objArr = null;
        if (i3 > 0) {
            Object[] objArr2 = new Object[i3];
            for (int i4 = 0; i4 < objArr2.length; i4++) {
                objArr2[i4] = c0246k.f1844a[i + i4];
            }
            objArr = objArr2;
        }
        C0242f.m1689a(c0246k, 0);
        this.f1839b.m1677a().pop();
        return objArr;
    }

    protected final void m1722e(C0241e c0241e, int i, int i2, C0246k c0246k) throws Exception {
        Object[] a;
        int i3 = 0;
        Function function = (Function) c0246k.f1844a[i];
        C0246k c0246k2 = new C0246k();
        Object[] objArr = new Object[]{c0246k.f1844a[i + 1], c0246k.f1844a[i + 2]};
        if (function.f1785d) {
            c0246k2.m1731a(((C0241e) function.f1783b).f1828h);
            for (int i4 = 0; i4 < objArr.length; i4++) {
                c0246k2.f1844a[i4] = objArr[i4];
            }
            a = m1720a(function, c0246k2, false);
        } else {
            a = ((C0243h) function.f1783b).m1724a(objArr);
        }
        if (a != null) {
            if (c0246k.f1844a.length < (i + 3) + a.length) {
                c0246k.m1732b((i + 3) + a.length);
            }
            while (i3 < i2) {
                c0246k.f1844a[(i + 3) + i3] = i3 < a.length ? a[i3] : LuaNil.nil;
                i3++;
            }
            c0246k.f1846c = (i + 2) + i3;
        } else {
            c0246k.f1844a[i + 3] = null;
        }
        if (c0246k.f1844a[i + 3] != null) {
            c0246k.f1844a[i + 2] = c0246k.f1844a[i + 3];
            c0246k.f1846c = i + 2;
            return;
        }
        c0246k.f1848e++;
    }

    protected final Object[] m1723n(C0241e c0241e, int i, int i2, int i3, C0246k c0246k) throws Exception {
        Object[] a = m1690a(c0241e, (Function) c0246k.f1844a[i], i, i2, i3, c0246k);
        this.f1839b.m1677a().pop();
        return a;
    }
}
