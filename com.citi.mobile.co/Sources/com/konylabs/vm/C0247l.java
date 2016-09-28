package com.konylabs.vm;

import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.C0235a;
import com.konylabs.libintf.Library;
import com.konylabs.libintf.LibraryWithConstants;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import net.sourceforge.zbar.Config;

/* renamed from: com.konylabs.vm.l */
public final class C0247l implements Serializable {
    public static boolean f1849a;
    public static C0250o f1850b;
    private static DataInputStream f1851c;
    private static int f1852e;
    private static byte[] f1853j;
    private static byte[] f1854k;
    private static byte[] f1855l;
    private static byte[] f1856m;
    private static byte[] f1857n;
    private static String f1858o;
    private C0235a f1859d;
    private C0241e f1860f;
    private Hashtable f1861g;
    private C0239c f1862h;
    private C0242f f1863i;
    private int f1864p;

    static {
        f1851c = null;
        f1853j = new byte[4];
        f1854k = new byte[1];
        f1855l = new byte[8];
        f1856m = new byte[8];
        f1857n = new byte[500];
        f1849a = false;
        f1858o = "/sdcard/profiler_" + KonyMain.getActContext().getPackageName() + ".txt";
        f1850b = null;
        Hashtable hashtable = new Hashtable();
        hashtable = new Hashtable();
    }

    public C0247l(DataInputStream dataInputStream, Library[] libraryArr, C0235a c0235a, boolean z) {
        C0250o c0250o = null;
        this.f1859d = null;
        this.f1860f = null;
        this.f1861g = new Hashtable(Config.X_DENSITY);
        this.f1862h = new C0239c();
        this.f1863i = C0242f.m1682a(this.f1862h, this.f1861g);
        this.f1864p = 0;
        if (KonyMain.f3657e) {
            Log.d("Profiler", "Attempting profiler");
            File file = new File(f1858o);
            Log.d("Profiler", "looking for file ... " + f1858o);
            if (file.exists()) {
                Log.d("Profiler", "starting profiler");
                c0250o = C0414p.m3380b(f1858o);
            } else {
                Log.d("Profiler", "not starting profiler");
            }
            f1850b = c0250o;
        }
        f1849a = z;
        if (z) {
            this.f1863i = C0242f.m1682a(this.f1862h, this.f1861g);
        }
        this.f1859d = c0235a;
        f1851c = dataInputStream;
        for (Library a : libraryArr) {
            m1748a(a);
        }
    }

    private static final int m1733a(C0241e c0241e, DataInputStream dataInputStream, int i) throws IOException {
        int b = C0247l.m1740b(dataInputStream, f1852e);
        int i2 = f1852e + i;
        if (b > 0) {
            String a = C0247l.m1734a(dataInputStream, b - 1);
            dataInputStream.read();
            i2 += b;
            if (a.startsWith("@")) {
                c0241e.f1833m = a.substring(1);
            } else {
                c0241e.f1833m = a;
            }
        } else {
            c0241e.f1833m = BuildConfig.FLAVOR;
        }
        dataInputStream.skipBytes(8);
        i2 += 8;
        c0241e.f1827g = C0247l.m1740b(dataInputStream, 1);
        i2++;
        c0241e.f1830j = C0247l.m1740b(dataInputStream, 1);
        i2++;
        c0241e.f1829i = C0247l.m1740b(dataInputStream, 1);
        i2++;
        c0241e.f1828h = C0247l.m1740b(dataInputStream, 1);
        return i2 + 1;
    }

    private static final String m1734a(DataInputStream dataInputStream, int i) throws IOException {
        if (i <= f1857n.length) {
            dataInputStream.read(f1857n, 0, i);
            return new String(f1857n, 0, i);
        }
        byte[] bArr = new byte[i];
        dataInputStream.read(bArr);
        return new String(bArr);
    }

    private void m1735a(int i) {
        try {
            f1851c.skipBytes(i);
            this.f1864p += i;
        } catch (IOException e) {
        }
    }

    public static final void m1736a(C0241e c0241e) throws IOException {
        synchronized (C0247l.class) {
            f1851c.reset();
            f1851c.skipBytes(c0241e.f1822b);
            C0247l.m1741b(c0241e, f1851c);
            C0247l.m1743c(c0241e, f1851c);
            f1851c.reset();
            f1851c.skipBytes(c0241e.f1823c);
            C0247l.m1744d(c0241e, f1851c);
            C0247l.m1745e(c0241e, f1851c);
            c0241e.f1821a = true;
        }
    }

    public static final void m1737a(C0241e c0241e, DataInputStream dataInputStream) throws IOException {
        int i;
        int i2 = 0;
        C0247l.m1733a(c0241e, dataInputStream, 0);
        C0247l.m1741b(c0241e, dataInputStream);
        C0247l.m1743c(c0241e, dataInputStream);
        int b = C0247l.m1740b(dataInputStream, 4);
        c0241e.m1680c(b);
        for (i = 0; i < b; i++) {
            C0241e c0241e2 = new C0241e();
            C0247l.m1737a(c0241e2, dataInputStream);
            c0241e.f1826f[i] = c0241e2;
        }
        C0247l.m1744d(c0241e, dataInputStream);
        C0247l.m1745e(c0241e, dataInputStream);
        i = C0247l.m1740b(dataInputStream, 4);
        while (i2 < i) {
            C0247l.m1734a(dataInputStream, C0247l.m1740b(dataInputStream, f1852e));
            i2++;
        }
        c0241e.f1821a = true;
    }

    private void m1738a(C0241e c0241e, String str) throws IOException {
        int i;
        int i2 = 0;
        this.f1864p = C0247l.m1733a(c0241e, f1851c, this.f1864p);
        if (c0241e.f1833m == BuildConfig.FLAVOR) {
            c0241e.f1833m = str;
        }
        c0241e.f1822b = this.f1864p;
        m1735a(m1742c() * 4);
        int c = m1742c();
        for (i = 0; i < c; i++) {
            int b = C0247l.m1740b(f1851c, 1);
            this.f1864p++;
            switch (b) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    m1735a(1);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                    m1735a(8);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                    m1735a(m1739b());
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                    m1735a(m1742c());
                    break;
                default:
                    break;
            }
        }
        c = m1742c();
        c0241e.m1680c(c);
        for (i = 0; i < c; i++) {
            C0241e c0241e2 = new C0241e();
            c0241e.f1826f[i] = c0241e2;
            m1738a(c0241e2, c0241e.f1833m);
        }
        c0241e.f1823c = this.f1864p;
        m1735a(m1742c() * 4);
        c = m1742c();
        for (i = 0; i < c; i++) {
            m1735a(m1739b());
            m1735a(8);
        }
        i = m1742c();
        while (i2 < i) {
            m1735a(m1739b());
            i2++;
        }
    }

    private int m1739b() {
        int i = -1;
        try {
            i = C0247l.m1740b(f1851c, f1852e);
            this.f1864p += f1852e;
            return i;
        } catch (IOException e) {
            return i;
        }
    }

    private static final int m1740b(DataInputStream dataInputStream, int i) throws IOException {
        int i2 = 0;
        byte[] bArr = i == 4 ? f1853j : i == 8 ? f1855l : f1854k;
        dataInputStream.read(bArr);
        int i3 = 0;
        while (i2 < i) {
            i3 |= (bArr[i2] & MotionEventCompat.ACTION_MASK) << (i2 * 8);
            i2++;
        }
        return i3;
    }

    private static final void m1741b(C0241e c0241e, DataInputStream dataInputStream) throws IOException {
        int b = C0247l.m1740b(dataInputStream, 4);
        int[] a = c0241e.m1678a(b);
        for (int i = 0; i < b; i++) {
            a[i] = C0247l.m1740b(dataInputStream, 4);
        }
    }

    private int m1742c() {
        int i = -1;
        try {
            i = C0247l.m1740b(f1851c, 4);
            this.f1864p += 4;
            return i;
        } catch (IOException e) {
            return i;
        }
    }

    private static final void m1743c(C0241e c0241e, DataInputStream dataInputStream) throws IOException {
        int b = C0247l.m1740b(dataInputStream, 4);
        Object[] b2 = c0241e.m1679b(b);
        for (int i = 0; i < b; i++) {
            switch (C0247l.m1740b(dataInputStream, 1)) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                    b2[i] = LuaNil.nil;
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    b2[i] = C0247l.m1740b(dataInputStream, 1) == 0 ? Boolean.FALSE : Boolean.TRUE;
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                    byte[] bArr = f1855l;
                    dataInputStream.read(bArr);
                    f1856m[0] = bArr[7];
                    f1856m[1] = bArr[6];
                    f1856m[2] = bArr[5];
                    f1856m[3] = bArr[4];
                    f1856m[4] = bArr[3];
                    f1856m[5] = bArr[2];
                    f1856m[6] = bArr[1];
                    f1856m[7] = bArr[0];
                    b2[i] = new Double(new DataInputStream(new ByteArrayInputStream(f1856m)).readDouble());
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                    String a = C0247l.m1734a(dataInputStream, C0247l.m1740b(dataInputStream, f1852e) - 1);
                    C0247l.m1740b(dataInputStream, 1);
                    b2[i] = a.intern();
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                    b2[i] = new Double(Double.parseDouble(C0247l.m1734a(dataInputStream, C0247l.m1740b(dataInputStream, 4))));
                    break;
                default:
                    break;
            }
        }
    }

    private static final void m1744d(C0241e c0241e, DataInputStream dataInputStream) throws IOException {
        int b = C0247l.m1740b(dataInputStream, 4);
        c0241e.f1831k = new int[b];
        for (int i = 0; i < b; i++) {
            c0241e.f1831k[i] = C0247l.m1740b(dataInputStream, 4);
        }
    }

    private static final void m1745e(C0241e c0241e, DataInputStream dataInputStream) throws IOException {
        int b = C0247l.m1740b(dataInputStream, 4);
        c0241e.f1832l = new Vector(b);
        for (int i = 0; i < b; i++) {
            Vector vector = new Vector(3);
            vector.add(C0247l.m1734a(dataInputStream, C0247l.m1740b(dataInputStream, f1852e) - 1));
            dataInputStream.skipBytes(1);
            vector.add(Integer.valueOf(C0247l.m1740b(dataInputStream, 4)));
            vector.add(Integer.valueOf(C0247l.m1740b(dataInputStream, 4)));
            c0241e.f1832l.add(vector);
        }
    }

    public final Function m1746a(String str) {
        Function function = (Function) this.f1861g.get(str);
        return (function == null || !function.m1636a()) ? null : function;
    }

    public final void m1747a() {
        try {
            C0247l.m1734a(f1851c, 1);
            if (C0247l.m1734a(f1851c, 3).equals("Lua")) {
                C0247l.m1740b(f1851c, 1);
                C0247l.m1740b(f1851c, 1);
                C0247l.m1740b(f1851c, 1);
                C0247l.m1740b(f1851c, 1);
                f1852e = C0247l.m1740b(f1851c, 1);
                C0247l.m1740b(f1851c, 1);
                C0247l.m1740b(f1851c, 1);
                C0247l.m1740b(f1851c, 1);
                this.f1864p = 12;
                this.f1860f = new C0241e();
                m1738a(this.f1860f, BuildConfig.FLAVOR);
                return;
            }
            throw new LuaError("bytecode corrupted", 100);
        } catch (Throwable th) {
            LuaError a = C0252r.m1766a(th);
            if (this.f1859d != null) {
                this.f1859d.m1621a(a);
            }
        }
    }

    public final void m1748a(Library library) {
        String[] methods = library.getMethods();
        String nameSpace = library.getNameSpace();
        LuaTable luaTable = new LuaTable(0, 10);
        int i;
        Hashtable constants;
        Enumeration keys;
        if (nameSpace == null || nameSpace.equals(BuildConfig.FLAVOR)) {
            for (i = 0; i < methods.length; i++) {
                this.f1861g.put(methods[i], new Function(new C0243h(library, i), false));
            }
            if (library instanceof LibraryWithConstants) {
                constants = ((LibraryWithConstants) library).getConstants();
                keys = constants.keys();
                while (keys.hasMoreElements()) {
                    nameSpace = (String) keys.nextElement();
                    luaTable.setTable(nameSpace.intern(), constants.get(nameSpace));
                }
                return;
            }
            return;
        }
        this.f1861g.put(nameSpace.intern(), luaTable);
        for (i = 0; i < methods.length; i++) {
            luaTable.setTable(methods[i], new Function(new C0243h(library, i), false));
        }
        if (library instanceof LibraryWithConstants) {
            constants = ((LibraryWithConstants) library).getConstants();
            keys = constants.keys();
            while (keys.hasMoreElements()) {
                nameSpace = (String) keys.nextElement();
                luaTable.setTable(nameSpace.intern(), constants.get(nameSpace));
            }
        }
    }

    public final void m1749a(C0235a c0235a) {
        this.f1859d = c0235a;
    }

    public final Object[] m1750a(Object[] objArr) {
        try {
            C0246k c0246k = new C0246k();
            c0246k.f1845b = null;
            c0246k.m1731a(c0246k.f1845b != null ? this.f1860f.f1828h + c0246k.f1845b.length : this.f1860f.f1828h);
            return this.f1863i.m1720a(new Function(this.f1860f, true), c0246k, false);
        } catch (Throwable th) {
            LuaError a = C0252r.m1766a(th);
            if (this.f1859d == null) {
                return null;
            }
            this.f1859d.m1621a(a);
            return null;
        }
    }
}
