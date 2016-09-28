package com.konylabs.vm;

import android.util.Log;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.api.ui.eO;
import com.konylabs.api.ui.fv;
import com.konylabs.api.ui.gL;
import com.konylabs.api.ui.hp;
import com.konylabs.api.ui.hq;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: com.konylabs.vm.a */
public final class C0237a {
    private static C0237a f1794q;
    public boolean f1795a;
    public volatile boolean f1796b;
    public volatile boolean f1797c;
    public volatile boolean f1798d;
    public volatile int f1799e;
    private Socket f1800f;
    private DataInputStream f1801g;
    private DataOutputStream f1802h;
    private Socket f1803i;
    private DataOutputStream f1804j;
    private Thread f1805k;
    private Hashtable f1806l;
    private Vector f1807m;
    private LuaTable f1808n;
    private Hashtable f1809o;
    private Hashtable f1810p;
    private boolean f1811r;
    private boolean f1812s;
    private boolean f1813t;

    static {
        f1794q = null;
    }

    public C0237a() {
        this.f1800f = null;
        this.f1801g = null;
        this.f1802h = null;
        this.f1803i = null;
        this.f1804j = null;
        this.f1805k = null;
        this.f1795a = false;
        this.f1806l = null;
        this.f1807m = null;
        this.f1808n = null;
        this.f1809o = null;
        this.f1810p = null;
        this.f1796b = false;
        this.f1797c = false;
        this.f1798d = false;
        this.f1799e = 0;
        this.f1811r = false;
        this.f1812s = false;
        this.f1813t = true;
        f1794q = this;
        this.f1806l = new Hashtable();
        Hashtable hashtable = new Hashtable();
        this.f1807m = new Vector();
        this.f1808n = new LuaTable();
        this.f1808n.map = C0242f.f1834a;
        this.f1809o = C0237a.m1663j();
        this.f1810p = new Hashtable();
        this.f1805k = new Thread(new C0238b(this));
    }

    public static C0237a m1647a() {
        return f1794q == null ? new C0237a() : f1794q;
    }

    private String m1648a(LuaWidget luaWidget) {
        StringBuffer stringBuffer = new StringBuffer();
        Hashtable properties = luaWidget.getProperties();
        Enumeration keys = properties.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            stringBuffer.append(URLEncoder.encode(str)).append("=").append(properties.get(str)).append("|");
        }
        if ((luaWidget instanceof fv) || (luaWidget instanceof eO) || (luaWidget instanceof gL) || (luaWidget instanceof hq)) {
            Iterator it = luaWidget.getChildWidgets().iterator();
            while (it.hasNext()) {
                Object obj = (LuaWidget) it.next();
                stringBuffer.append(URLEncoder.encode(obj.getID())).append("=").append(C0237a.m1651a(obj)).append("|");
            }
        }
        return stringBuffer.toString();
    }

    private String m1649a(Function function) {
        if (this.f1810p.containsKey(function)) {
            return (String) this.f1810p.get(function);
        }
        Hashtable hashtable = C0242f.f1834a;
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            if (hashtable.get(nextElement) == function) {
                String str = (String) nextElement;
                this.f1810p.put(function, str);
                return str;
            }
        }
        return "<local>";
    }

    private String m1650a(LuaTable luaTable) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 1;
        Iterator it = luaTable.list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(Integer.toString(i)).append("=").append(C0237a.m1651a(it.next())).append("|");
            i++;
        }
        Enumeration keys = luaTable.map.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            stringBuffer.append(URLEncoder.encode(nextElement.toString())).append("=").append(C0237a.m1651a(luaTable.map.get(nextElement))).append("|");
        }
        return stringBuffer.toString();
    }

    private static String m1651a(Object obj) {
        return obj instanceof LuaNil ? "nil" : obj instanceof Double ? "number" : obj instanceof String ? "string" : obj instanceof Function ? "function" : obj instanceof Boolean ? "boolean" : obj instanceof LuaWidget ? (!(obj instanceof fv) || ((fv) obj).m4463u()) ? ((LuaWidget) obj).getType() : "nil" : obj instanceof LuaTable ? "table" : "userdata";
    }

    private String m1652a(Hashtable hashtable) {
        StringBuffer stringBuffer = new StringBuffer();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            String obj = nextElement.toString();
            Object obj2 = hashtable.get(nextElement);
            if ((obj2 instanceof fv) && !((fv) obj2).m4463u()) {
                stringBuffer.append(URLEncoder.encode(obj)).append("=nil|");
            } else if (!(this.f1809o.containsKey(obj) || (obj2 instanceof Function) || (obj2 instanceof hp))) {
                stringBuffer.append(URLEncoder.encode(obj)).append("=").append(C0237a.m1651a(obj2)).append("|");
            }
        }
        return stringBuffer.toString();
    }

    private static Hashtable m1653a(C0241e c0241e, int i) {
        Hashtable hashtable = new Hashtable();
        Vector vector = c0241e.f1832l;
        int i2 = 0;
        for (int i3 = 0; i3 < vector.size(); i3++) {
            int i4;
            Vector vector2 = (Vector) vector.get(i3);
            if (((Integer) vector2.get(1)).intValue() >= i || i > ((Integer) vector2.get(2)).intValue()) {
                i4 = i2;
            } else {
                hashtable.put((String) vector2.get(0), Integer.valueOf(i2));
                i4 = i2 + 1;
            }
            i2 = i4;
        }
        return hashtable;
    }

    private Hashtable m1654a(C0241e c0241e, C0246k c0246k, Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Hashtable a = C0237a.m1653a(c0241e, c0246k.f1848e + 1);
        Enumeration keys = a.keys();
        Hashtable hashtable3 = C0242f.f1834a;
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            Integer num = (Integer) a.get(str);
            if (hashtable3.containsKey(str)) {
                hashtable.put(str, hashtable3.get(str));
            }
            hashtable2.put(str, num);
            hashtable3.put(str, c0246k.f1844a[num.intValue()]);
        }
        return hashtable2;
    }

    private static void m1655a(C0246k c0246k, Hashtable hashtable, Hashtable hashtable2) {
        Hashtable hashtable3 = C0242f.f1834a;
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            c0246k.f1844a[((Integer) hashtable.get(str)).intValue()] = hashtable3.get(str);
            if (hashtable2.containsKey(str)) {
                hashtable3.put(str, hashtable2.get(str));
            } else {
                hashtable3.remove(str);
            }
        }
    }

    private void m1656a(String str) {
        LuaTable luaTable;
        String[] split = str.split(" ", 3);
        int parseInt = Integer.parseInt(split[1]);
        String[] split2 = URLDecoder.decode(split[2]).split(":");
        Object[] objArr = (Object[]) this.f1807m.elementAt(this.f1807m.size() - parseInt);
        C0241e c0241e = (C0241e) ((Function) objArr[0]).f1783b;
        C0246k c0246k = (C0246k) objArr[1];
        if (split2[0].equals("(*globals)")) {
            luaTable = this.f1808n;
        } else {
            int i = c0246k.f1848e + 1;
            Object obj = split2[0];
            Vector vector = c0241e.f1832l;
            int i2 = 0;
            int i3 = -1;
            int i4 = 0;
            while (i2 < vector.size()) {
                int i5;
                Vector vector2 = (Vector) vector.get(i2);
                if (((Integer) vector2.get(1)).intValue() >= i || i > ((Integer) vector2.get(2)).intValue()) {
                    i5 = i4;
                    i4 = i3;
                } else {
                    if (((String) vector2.get(0)).equals(obj)) {
                        i3 = i4;
                    }
                    i5 = i4 + 1;
                    i4 = i3;
                }
                i2++;
                i3 = i4;
                i4 = i5;
            }
            luaTable = c0246k.f1844a[i3];
        }
        StringBuffer append = new StringBuffer("102 Variable ").append(parseInt).append(" ").append(split[2]);
        for (int i6 = 1; i6 < split2.length; i6++) {
            LuaNil luaNil = LuaNil.nil;
            if (!(luaTable instanceof LuaWidget)) {
                if (!(luaTable instanceof LuaTable)) {
                    break;
                }
                try {
                    luaTable = luaTable.getTable(Double.valueOf(Double.parseDouble(split2[i6])));
                } catch (NumberFormatException e) {
                    luaTable = luaTable.getTable(split2[i6]);
                }
            } else {
                LuaTable childWidget = ((LuaWidget) luaTable).getChildWidget(split2[i6]);
                luaTable = childWidget == null ? ((LuaWidget) luaTable).getProperty(split2[i6]) : childWidget;
            }
        }
        String type = luaTable instanceof LuaWidget ? ((LuaWidget) luaTable).getType() : luaTable instanceof LuaTable ? "table" : luaTable instanceof Function ? "function" : luaTable instanceof String ? "\"" + ((String) luaTable) + "\"" : luaTable.toString();
        StringBuffer stringBuffer = new StringBuffer(URLEncoder.encode(type));
        if (luaTable instanceof LuaTable) {
            if (luaTable == this.f1808n) {
                stringBuffer.append("#").append(m1652a(this.f1808n.map));
            } else if (luaTable instanceof LuaWidget) {
                stringBuffer.append("#").append(m1648a((LuaWidget) luaTable));
            } else {
                stringBuffer.append("#").append(m1650a(luaTable));
            }
        }
        stringBuffer.append("\n");
        append.append(stringBuffer);
        m1659b(append.toString(), true);
        m1659b(stringBuffer.toString(), false);
    }

    private void m1657a(boolean z) {
        try {
            if (this.f1800f != null && this.f1800f.isConnected()) {
                this.f1801g.close();
                this.f1802h.close();
                this.f1800f.close();
                this.f1800f = null;
            }
            if (this.f1803i != null && this.f1803i.isConnected()) {
                this.f1804j.close();
                this.f1803i.close();
                this.f1803i = null;
            }
        } catch (IOException e) {
        }
        this.f1806l = null;
        this.f1808n = null;
        this.f1809o = null;
        this.f1810p = null;
        this.f1811r = false;
        if (z) {
            System.exit(0);
        }
    }

    private Object[] m1658a(C0241e c0241e) throws Exception {
        Object[] objArr = (Object[]) this.f1807m.lastElement();
        C0241e c0241e2 = (C0241e) ((Function) objArr[0]).f1783b;
        C0246k c0246k = (C0246k) objArr[1];
        Hashtable hashtable = new Hashtable();
        Hashtable a = m1654a(c0241e2, c0246k, hashtable);
        this.f1812s = true;
        try {
            Object[] execute = new Function(c0241e, true).execute(null);
            this.f1812s = false;
            C0237a.m1655a(c0246k, a, hashtable);
            return execute;
        } catch (Exception e) {
            this.f1812s = false;
            throw e;
        }
    }

    private void m1659b(String str, boolean z) {
        if (z) {
            try {
                Log.d("DebutClient", "Sending to event port: " + str);
                this.f1804j.write(str.getBytes());
                this.f1804j.flush();
                return;
            } catch (IOException e) {
                m1657a(true);
                return;
            }
        }
        Log.d("DebutClient", "Sending to ctrl port: " + str);
        this.f1802h.write(str.getBytes());
        this.f1802h.flush();
    }

    private void m1660g() {
        this.f1798d = false;
        this.f1797c = false;
        this.f1796b = false;
    }

    private C0241e m1661h() {
        C0241e c0241e = new C0241e();
        try {
            this.f1801g.skipBytes(12);
            C0247l.m1737a(c0241e, this.f1801g);
            return c0241e;
        } catch (IOException e) {
            m1657a(true);
            return null;
        }
    }

    private String m1662i() {
        try {
            return this.f1801g.readLine();
        } catch (IOException e) {
            m1657a(true);
            return BuildConfig.FLAVOR;
        }
    }

    private static Hashtable m1663j() {
        int i = 0;
        Hashtable hashtable = new Hashtable();
        String[] strArr = new String[]{"table", "math", "string", "os", "json", "window", "box", "form", "tabwidget", "datagrid", "seatmap", "segui", "pickerview", "net", "ds", "timer", "gallery", "imagestrip", "widget", "phone", "contact", "calendar", "streaming", "popup", "webwidget", "crypto", "i18n", "camera", "app", "debug"};
        while (i < strArr.length) {
            hashtable.put(strArr[i], Boolean.valueOf(true));
            i++;
        }
        return hashtable;
    }

    private void m1664k() {
        int size = this.f1807m.size();
        StringBuffer stringBuffer = new StringBuffer("101 Stack ");
        for (int i = size - 1; i >= 0; i--) {
            Object[] objArr = (Object[]) this.f1807m.elementAt(i);
            Function function = (Function) objArr[0];
            C0241e c0241e = (C0241e) function.f1783b;
            if (c0241e.f1831k.length != 0) {
                C0246k c0246k = (C0246k) objArr[1];
                Hashtable a = C0237a.m1653a(c0241e, c0246k.f1848e + 1);
                Enumeration keys = a.keys();
                StringBuffer append = stringBuffer.append(size - i).append("|").append(m1649a(function)).append("|").append("|").append(URLEncoder.encode(c0241e.f1833m)).append("|");
                String str = c0241e.f1833m;
                int length = str.length();
                if (length > 60) {
                    str = str.substring(0, 29) + "..." + str.substring(length - 28, length);
                }
                append.append(URLEncoder.encode(str)).append("|").append(c0241e.f1831k[c0246k.f1848e]);
                while (keys.hasMoreElements()) {
                    str = (String) keys.nextElement();
                    stringBuffer.append("|").append(URLEncoder.encode(str)).append("=").append(C0237a.m1651a(c0246k.f1844a[((Integer) a.get(str)).intValue()]));
                }
                stringBuffer.append("|(*globals)=table");
                if (i != 0) {
                    stringBuffer.append("#");
                }
            }
        }
        stringBuffer.append("\n");
        m1659b(stringBuffer.toString(), true);
        m1659b(stringBuffer.toString(), false);
    }

    private void m1665l() {
        synchronized (this) {
            this.f1795a = false;
            notify();
        }
    }

    public final void m1666a(Function function, C0246k c0246k) {
        this.f1807m.add(new Object[]{function, c0246k});
    }

    public final void m1667a(Exception exception, String str, int i) {
        if (this.f1813t) {
            this.f1813t = false;
            if (m1672b()) {
                m1669a("213 Exception caught: " + URLEncoder.encode(exception.getMessage()), true);
                m1671b(str, i);
            }
        }
        m1675e();
        if (this.f1807m.size() == 0) {
            this.f1813t = true;
        }
    }

    public final void m1668a(String str, int i, int i2) {
        this.f1811r = true;
        try {
            this.f1800f = new Socket();
            Log.d("DebugClient", "Connecting to " + str + ":" + i);
            this.f1800f.connect(new InetSocketAddress(InetAddress.getByName(str), i), i2);
            Log.d("DebugClient", "Connected to control port");
            this.f1800f.setTcpNoDelay(true);
            this.f1801g = new DataInputStream(this.f1800f.getInputStream());
            this.f1802h = new DataOutputStream(this.f1800f.getOutputStream());
            String i3 = m1662i();
            Log.d("DebugClient", "Received: " + i3);
            String[] split = i3.split(" ");
            if (i3.startsWith("SUBSCRIBE")) {
                int parseInt = Integer.parseInt(split[1]);
                Log.d("DebugClient", "Connecting to event port " + parseInt);
                this.f1803i = new Socket(InetAddress.getByName(str), parseInt);
                Log.d("DebugClient", "Connected to event port");
                this.f1803i.setTcpNoDelay(true);
                this.f1804j = new DataOutputStream(this.f1803i.getOutputStream());
                m1669a("200 OK", false);
                if (this.f1811r) {
                    Log.e("DebugClient", "Starting Debugger thread");
                    this.f1795a = true;
                    this.f1805k.start();
                    return;
                }
                return;
            }
            throw new Exception("Expected SUBSCRIBE, Recieved " + i3);
        } catch (Exception e) {
            Log.e("DebugClient", e.getMessage());
            if (this.f1800f.isConnected()) {
                m1669a("400 Bad Request", false);
            }
            m1657a(false);
        }
    }

    public final void m1669a(String str, boolean z) {
        m1659b(str + "\n", z);
    }

    public final boolean m1670a(String str, int i) {
        return this.f1806l.containsKey(str) ? ((Hashtable) this.f1806l.get(str)).containsKey(Integer.valueOf(i)) : false;
    }

    public final void m1671b(String str, int i) {
        m1660g();
        m1669a("202 Paused " + str + " " + i, true);
        this.f1795a = true;
        while (this.f1795a) {
            synchronized (this) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public final boolean m1672b() {
        return this.f1811r && !this.f1812s;
    }

    public final boolean m1673c() {
        return this.f1812s;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1674d() {
        /*
        r8 = this;
        r7 = 3;
        r6 = 2;
        r5 = 1;
        r4 = 0;
    L_0x0004:
        r0 = r8.m1662i();
        if (r0 == 0) goto L_0x000e;
    L_0x000a:
        r1 = "";
        if (r0 != r1) goto L_0x0012;
    L_0x000e:
        r8.m1657a(r5);
    L_0x0011:
        return;
    L_0x0012:
        r1 = "DebugClient";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Received: ";
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        android.util.Log.d(r1, r2);
        r1 = "EXAMINE";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x0036;
    L_0x0032:
        r8.m1656a(r0);
        goto L_0x0004;
    L_0x0036:
        r1 = "STACK";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x0042;
    L_0x003e:
        r8.m1664k();
        goto L_0x0004;
    L_0x0042:
        r1 = "OVER";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x0062;
    L_0x004a:
        r8.f1797c = r5;
        r0 = r8.f1807m;
        r0 = r0.size();
        r8.f1799e = r0;
        r0 = "211 Stepping";
        r8.m1669a(r0, r5);
        r0 = "200 OK";
        r8.m1669a(r0, r4);
        r8.m1665l();
        goto L_0x0004;
    L_0x0062:
        r1 = "RUN";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x0078;
    L_0x006a:
        r0 = "210 Running";
        r8.m1669a(r0, r5);
        r0 = "200 OK";
        r8.m1669a(r0, r4);
        r8.m1665l();
        goto L_0x0004;
    L_0x0078:
        r1 = "STEP";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x0091;
    L_0x0080:
        r8.f1796b = r5;
        r0 = "211 Stepping";
        r8.m1669a(r0, r5);
        r0 = "200 OK";
        r8.m1669a(r0, r4);
        r8.m1665l();
        goto L_0x0004;
    L_0x0091:
        r1 = "OUT";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x00b4;
    L_0x0099:
        r8.f1798d = r5;
        r0 = r8.f1807m;
        r0 = r0.size();
        r0 = r0 + -1;
        r8.f1799e = r0;
        r0 = "211 Stepping";
        r8.m1669a(r0, r5);
        r0 = "200 OK";
        r8.m1669a(r0, r4);
        r8.m1665l();
        goto L_0x0004;
    L_0x00b4:
        r1 = "SETB";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x00fd;
    L_0x00bc:
        r1 = " ";
        r1 = r0.split(r1);
        r0 = r1.length;
        if (r0 >= r7) goto L_0x00cc;
    L_0x00c5:
        r0 = "400 Bad Request";
        r8.m1669a(r0, r4);
        goto L_0x0004;
    L_0x00cc:
        r0 = r1[r5];
        r2 = java.net.URLDecoder.decode(r0);
        r0 = r8.f1806l;
        r0 = r0.get(r2);
        r0 = (java.util.Hashtable) r0;
        if (r0 != 0) goto L_0x00e6;
    L_0x00dc:
        r0 = new java.util.Hashtable;
        r0.<init>();
        r3 = r8.f1806l;
        r3.put(r2, r0);
    L_0x00e6:
        r1 = r1[r6];
        r1 = java.lang.Integer.valueOf(r1);
        r2 = java.lang.Boolean.TRUE;
        r0.put(r1, r2);
        r0 = "200 OK";
        r8.m1669a(r0, r5);
        r0 = "200 OK";
        r8.m1669a(r0, r4);
        goto L_0x0004;
    L_0x00fd:
        r1 = "DELB";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x013a;
    L_0x0105:
        r1 = " ";
        r1 = r0.split(r1);
        r0 = r1.length;
        if (r0 >= r7) goto L_0x0115;
    L_0x010e:
        r0 = "400 Bad Request";
        r8.m1669a(r0, r4);
        goto L_0x0004;
    L_0x0115:
        r0 = r1[r5];
        r0 = java.net.URLDecoder.decode(r0);
        r2 = r8.f1806l;
        r0 = r2.get(r0);
        r0 = (java.util.Hashtable) r0;
        if (r0 == 0) goto L_0x012e;
    L_0x0125:
        r1 = r1[r6];
        r1 = java.lang.Integer.valueOf(r1);
        r0.remove(r1);
    L_0x012e:
        r0 = "200 OK";
        r8.m1669a(r0, r5);
        r0 = "200 OK";
        r8.m1669a(r0, r4);
        goto L_0x0004;
    L_0x013a:
        r1 = "EXEC";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x01a7;
    L_0x0142:
        r0 = r8.m1661h();
        r1 = "200 OK";
        r8.m1669a(r1, r5);
        if (r0 == 0) goto L_0x01a0;
    L_0x014d:
        r0 = r8.m1658a(r0);	 Catch:{ Exception -> 0x0177 }
        if (r0 == 0) goto L_0x0198;
    L_0x0153:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0177 }
        r1.<init>();	 Catch:{ Exception -> 0x0177 }
        r2 = "200 OK ";
        r1 = r1.append(r2);	 Catch:{ Exception -> 0x0177 }
        r2 = 0;
        r0 = r0[r2];	 Catch:{ Exception -> 0x0177 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0177 }
        r0 = java.net.URLEncoder.encode(r0);	 Catch:{ Exception -> 0x0177 }
        r0 = r1.append(r0);	 Catch:{ Exception -> 0x0177 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0177 }
        r1 = 0;
        r8.m1669a(r0, r1);	 Catch:{ Exception -> 0x0177 }
        goto L_0x0004;
    L_0x0177:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "401 Error in Expression ";
        r1 = r1.append(r2);
        r0 = r0.getMessage();
        r0 = java.net.URLEncoder.encode(r0);
        r0 = r1.append(r0);
        r0 = r0.toString();
        r8.m1669a(r0, r4);
        goto L_0x0004;
    L_0x0198:
        r0 = "200 OK nil";
        r1 = 0;
        r8.m1669a(r0, r1);	 Catch:{ Exception -> 0x0177 }
        goto L_0x0004;
    L_0x01a0:
        r0 = "400 Bad Request";
        r8.m1669a(r0, r4);
        goto L_0x0004;
    L_0x01a7:
        r1 = "EXIT";
        r0 = r0.startsWith(r1);
        if (r0 == 0) goto L_0x0004;
    L_0x01af:
        r0 = "200 OK";
        r8.m1669a(r0, r4);
        r8.m1657a(r5);
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.vm.a.d():void");
    }

    public final void m1675e() {
        this.f1807m.remove(this.f1807m.size() - 1);
        if (this.f1807m.size() == 0 && m1672b()) {
            m1669a("210 Running", true);
            m1660g();
        }
    }

    public final int m1676f() {
        return this.f1807m.size();
    }
}
