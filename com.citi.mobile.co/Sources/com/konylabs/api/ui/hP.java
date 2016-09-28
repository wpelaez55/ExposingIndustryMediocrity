package com.konylabs.api.ui;

import android.util.Log;
import android.view.View;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.ArrayList;
import java.util.Hashtable;
import ny0k.cr;

public final class hP extends LuaWidget {
    private static String f4336D;
    private static String f4337P;
    private static String f4338Q;
    public static String f4339a;
    public static String f4340b;
    public static String f4341c;
    public static String f4342d;
    public static String f4343e;
    public static String f4344f;
    private static String f4345g;
    private static String f4346h;
    private static String f4347i;
    private static String f4348j;
    private static String f4349k;
    private static String f4350l;
    private static String f4351m;
    private static String f4352n;
    private static String f4353o;
    private static String f4354p;
    private static String f4355q;
    private static String f4356r;
    private static String f4357s;
    private static String f4358t;
    private static String f4359u;
    private static String f4360v;
    private static String f4361w;
    private ex f4362A;
    private boolean f4363B;
    private int f4364C;
    private ex f4365R;
    private KonyWeb f4366x;
    private boolean f4367y;
    private String f4368z;

    static {
        f4339a = "url";
        f4340b = "method";
        f4341c = "data";
        f4345g = "htmlstring";
        f4342d = "onsuccess";
        f4343e = "onfailure";
        f4346h = "post";
        f4347i = "handlerequest";
        f4348j = "handleRequest";
        f4349k = "enablezoom";
        f4350l = "detecttelnumber";
        f4351m = "requesturlconfig";
        f4352n = "url";
        f4353o = "requestmethod";
        f4354p = "requestdata";
        f4355q = "screenlevelwidget";
        f4356r = "shellType";
        f4344f = "enablecache";
        f4357s = "mimetype";
        f4358t = "encoding";
        f4359u = "baseurl";
        f4360v = "showprogressindicator";
        f4361w = "playvideoinfullscreen";
        f4336D = "zoomdensity";
        f4337P = "usewideviewport";
        f4338Q = "enableoverviewmode";
        if (KonyMain.m4057C()) {
            f4351m = "requestURLConfig";
            f4342d = "onSuccess";
            f4343e = "onFailure";
            f4345g = "htmlString";
            f4355q = "screenLevelWidget";
            f4349k = "enableZoom";
            f4350l = "detectTelNumber";
            f4352n = "URL";
            f4353o = "requestMethod";
            f4354p = "requestData";
            f4347i = "handleRequest";
            f4344f = "enableCache";
            f4336D = "zoomDensity";
            f4337P = "useWideViewport";
            f4338Q = "enableOverviewMode";
            f4357s = "mimeType";
            f4359u = "baseURL";
            f4360v = "showProgressIndicator";
            f4361w = "playVideoInFullScreen";
        }
    }

    public hP(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        LuaNil table;
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4366x = null;
        this.f4368z = null;
        this.f4362A = null;
        this.f4363B = true;
        this.f4364C = 0;
        this.f4365R = new hQ(this);
        super.setTable(ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table2 = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table2 != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table2);
        }
        table2 = luaTable.getTable(f4351m);
        if (table2 != LuaNil.nil) {
            super.setTable(f4351m, table2);
            LuaTable luaTable4 = (LuaTable) table2;
            table = luaTable4.getTable(f4352n);
            if (!(table == null || table == LuaNil.nil)) {
                super.setTable(f4339a, (String) table);
            }
            table = luaTable4.getTable(f4353o);
            if (!(table == null || table == LuaNil.nil)) {
                super.setTable(f4340b, table);
            }
            table2 = luaTable4.getTable(f4354p);
            if (!(table2 == null || table2 == LuaNil.nil)) {
                super.setTable(f4341c, (LuaTable) table2);
            }
        }
        table2 = luaTable.getTable(f4342d);
        if (table2 != LuaNil.nil) {
            super.setTable(f4342d, table2);
        }
        table2 = luaTable.getTable(f4343e);
        if (table2 != LuaNil.nil) {
            super.setTable(f4343e, table2);
        }
        table2 = luaTable.getTable(f4345g);
        if (table2 != LuaNil.nil) {
            super.setTable(f4345g, table2);
        }
        table2 = luaTable.getTable(f4355q);
        if (table2 != LuaNil.nil) {
            super.setTable(f4355q, table2);
            this.f4367y = ((Boolean) table2).booleanValue();
        }
        table2 = luaTable.getTable(f4349k);
        if (table2 != LuaNil.nil) {
            super.setTable(f4349k, table2);
        }
        table2 = luaTable.getTable(f4350l);
        if (table2 != LuaNil.nil) {
            super.setTable(f4350l, table2);
        }
        if (luaTable2 != null) {
            table2 = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table2 != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table2);
            }
            table2 = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table2);
            }
            table2 = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table2 != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table2);
            }
            table2 = luaTable2.getTable(ATTR_WIDGET_CONTAINER_HEIGHT);
            if (table2 != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_HEIGHT, table2);
                this.N = (float) ((Double) table2).intValue();
            }
            table2 = luaTable2.getTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE);
            if (table2 != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE, table2);
            }
        }
        if (luaTable3 != null) {
            if (luaTable3.getTable(f4356r) != LuaNil.nil) {
                this.f4364C = ((Double) luaTable3.getTable(f4356r)).intValue();
            }
            if (luaTable3.getTable(ATTR_WIDGET_PROP_DEPRECATED) != LuaNil.nil) {
                luaTable4 = (LuaTable) luaTable3.getTable(ATTR_WIDGET_PROP_DEPRECATED);
                table = luaTable4.getTable(f4339a);
                if (table != LuaNil.nil) {
                    super.setTable(f4339a, table);
                }
                table = luaTable4.getTable(f4340b);
                if (table != LuaNil.nil) {
                    super.setTable(f4340b, table);
                }
                table2 = luaTable4.getTable(f4341c);
                if (table2 != LuaNil.nil) {
                    super.setTable(f4341c, table2);
                }
            }
            table2 = luaTable3.getTable(f4361w);
            if (table2 != LuaNil.nil) {
                super.setTable(f4361w, table2);
            }
        }
    }

    public hP(Object[] objArr) {
        super(10, 2, false);
        this.f4366x = null;
        this.f4368z = null;
        this.f4362A = null;
        this.f4363B = true;
        this.f4364C = 0;
        this.f4365R = new hQ(this);
        super.setTable(ATTR_WIDGET_ID, objArr[0]);
        if (!(objArr[1] == null || objArr[1] == LuaNil.nil)) {
            super.setTable(f4339a, objArr[1]);
        }
        if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
            super.setTable(f4340b, objArr[2]);
        }
        if (!(objArr[3] == null || objArr[3] == LuaNil.nil)) {
            super.setTable(f4341c, objArr[3]);
        }
        if (!(objArr[4] == null || objArr[4] == LuaNil.nil)) {
            super.setTable(f4345g, objArr[4]);
        }
        if (!(objArr[5] == null || objArr[5] == LuaNil.nil)) {
            super.setTable(f4342d, objArr[5]);
        }
        if (!(objArr[6] == null || objArr[6] == LuaNil.nil)) {
            super.setTable(f4343e, objArr[6]);
        }
        if (!(objArr[7] == null || objArr[7] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, objArr[7]);
        }
        if (!(objArr[8] == null || objArr[8] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, objArr[8]);
        }
        if (objArr.length > 9 && objArr[9] != null && objArr[9] != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, objArr[9]);
            LuaTable luaTable = (LuaTable) objArr[9];
            if (luaTable.getTable("screenLevelWidget") != LuaNil.nil) {
                this.f4367y = ((Boolean) luaTable.getTable("screenLevelWidget")).booleanValue();
                super.setTable("screenLevelWidget", Boolean.valueOf(this.f4367y));
            }
            if (luaTable.getTable("shellType") != LuaNil.nil) {
                this.f4364C = ((Double) luaTable.getTable("shellType")).intValue();
            }
            LuaNil table = luaTable.getTable("requesturlconfig");
            if (table != LuaNil.nil) {
                LuaTable luaTable2 = (LuaTable) table;
                LuaNil table2 = luaTable2.getTable("URL");
                if (!(table2 == null || table2 == LuaNil.nil)) {
                    super.setTable(f4339a, (String) table2);
                }
                table2 = luaTable2.getTable("requestmethod");
                if (!(table2 == null || table2 == LuaNil.nil)) {
                    super.setTable(f4340b, table2);
                }
                table = luaTable2.getTable("requestdata");
                if (!(table == null || table == LuaNil.nil)) {
                    super.setTable(f4341c, (LuaTable) table);
                }
            }
            table = luaTable.getTable("enablezoom");
            if (table != LuaNil.nil) {
                super.setTable(f4349k, table);
            }
            LuaNil table3 = luaTable.getTable("detecttelnumber");
            if (table3 != LuaNil.nil) {
                super.setTable(f4350l, table3);
            }
        }
    }

    public final void m4653a(ex exVar) {
        this.f4362A = exVar;
        if (this.f4366x != null) {
            this.f4366x.m220a(this.f4362A);
        }
    }

    public final void m4654a(Object obj, LuaTable luaTable) {
        if (this.E == KONY_WIDGET_RESTORE && obj != null && (obj instanceof String)) {
            String str;
            String str2 = "text/html";
            String str3 = "UTF-8";
            if (luaTable != null) {
                Object table = luaTable.getTable(f4357s);
                if (table instanceof String) {
                    str2 = (String) table;
                }
                table = luaTable.getTable(f4358t);
                if (table instanceof String) {
                    str3 = (String) table;
                }
                table = luaTable.getTable(f4359u);
                if (table instanceof String) {
                    str = (String) table;
                    this.f4366x.m223a((String) obj, str2, str3, str);
                }
            }
            str = null;
            this.f4366x.m223a((String) obj, str2, str3, str);
        }
    }

    protected final void m4655a(Object obj, Object obj2) {
        String str = null;
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == f4345g) {
                this.f4366x.m229b(obj2 != LuaNil.nil ? (String) obj2 : null);
            } else if (intern == f4340b) {
                if (obj2 != LuaNil.nil) {
                    str = ((String) obj2).intern();
                }
                if (str == f4346h) {
                    this.f4366x.m219a(KonyWeb.f244b);
                } else {
                    this.f4366x.m219a(KonyWeb.f243a);
                }
            } else if (intern == f4341c) {
                m4657b((LuaTable) obj2);
            } else if (intern == f4339a) {
                this.f4366x.m222a(obj2 != LuaNil.nil ? (String) obj2 : null);
                this.f4366x.m232c();
            } else if (intern == f4347i || intern == f4348j) {
                super.setTable(f4347i, obj2);
                this.f4366x.m221a(new ey(this));
            } else if (intern == f4351m) {
                LuaTable luaTable = (LuaTable) obj2;
                r0 = luaTable.getTable(f4352n);
                if (!(r0 == null || r0 == LuaNil.nil)) {
                    super.setTable(f4339a, r0);
                    this.f4366x.m222a((String) r0);
                }
                r0 = luaTable.getTable(f4353o);
                if (!(r0 == null || r0 == LuaNil.nil)) {
                    super.setTable(f4340b, r0);
                    if (((String) r0).intern() == f4346h) {
                        this.f4366x.m219a(KonyWeb.f244b);
                    } else {
                        this.f4366x.m219a(KonyWeb.f243a);
                    }
                }
                LuaNil table = luaTable.getTable(f4354p);
                if (!(table == null || table == LuaNil.nil)) {
                    super.setTable(f4341c, (LuaTable) table);
                    m4657b((LuaTable) table);
                }
                this.f4366x.m232c();
            } else if (intern == f4349k) {
                this.f4366x.m225a(((Boolean) obj2).booleanValue());
            } else if (intern == f4350l) {
                this.f4366x.m230b(((Boolean) obj2).booleanValue());
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT) {
                if (this.G) {
                    setWeight();
                    ((eO) this.I).m4238t();
                }
            } else if (intern == ATTR_WIDGET_MARGIN) {
                this.f4366x.m226a(convertMarginsToPixels(obj2, this.I));
                this.f4366x.requestLayout();
            } else if (intern == f4342d || intern == f4343e) {
                this.f4366x.m220a(this.f4365R);
            } else if (intern == f4344f) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4366x.m243g(((Boolean) obj2).booleanValue());
                }
            } else if (intern == ATTR_WIDGET_ISVISIBLE) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4366x.m228b(m3942a(((Boolean) obj2).booleanValue()));
                }
            } else if (intern == ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE) {
                r0 = cr.m2201a(obj2, 1);
                if (r0 != null && r0 != LuaNil.nil) {
                    this.M = ((Double) r0).intValue();
                    m4669p();
                }
            } else if (intern == ATTR_WIDGET_CONTAINER_HEIGHT) {
                r0 = cr.m2201a(obj2, 1);
                if (r0 != null && r0 != LuaNil.nil) {
                    this.N = ((Double) r0).floatValue();
                    m4669p();
                }
            } else if (intern == f4337P) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4366x.m240e(((Boolean) obj2).booleanValue());
                }
            } else if (intern == f4338Q) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4366x.m242f(((Boolean) obj2).booleanValue());
                }
            } else if (intern == f4336D) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4366x.m233c(((Double) obj2).intValue());
                }
            } else if (intern == f4360v) {
                r0 = cr.m2201a(obj2, 0);
                if (r0 != null) {
                    this.f4363B = ((Boolean) r0).booleanValue();
                    this.f4366x.m234c(this.f4363B);
                }
            } else if (intern == f4361w) {
                r0 = cr.m2201a(obj2, 0);
                if (r0 != null) {
                    this.f4366x.m237d(((Boolean) r0).booleanValue());
                }
            }
        }
    }

    public final void m4656a(String str) {
        if (this.E == KONY_WIDGET_RESTORE && str != null) {
            KonyMain.m4094a(new hR(this, str));
        }
    }

    public final void m4657b(LuaTable luaTable) {
        if (this.f4366x != null && luaTable != null) {
            if (luaTable.list.size() > 0) {
                for (int i = 0; i < luaTable.list.size(); i++) {
                    Object obj = luaTable.list.get(i);
                    if (obj != null && ((LuaTable) obj).list.size() >= 2) {
                        Object obj2 = ((LuaTable) obj).list.get(0);
                        obj = ((LuaTable) obj).list.get(1);
                        if (obj2 != null) {
                            luaTable.setTable(obj2, obj);
                        }
                    }
                }
            }
            this.f4366x.m224a(luaTable.map);
        }
    }

    public final void m4658b(String str) {
        if (this.f4366x != null) {
            this.f4366x.loadUrl(str);
        }
    }

    public final boolean m4659b() {
        return this.N != -1.0f ? false : this.f4367y;
    }

    public final boolean m4660c() {
        if (this.f4366x == null || !this.f4366x.canGoBack()) {
            return false;
        }
        if (KonyMain.f3657e) {
            Log.d("LuaWeb", "WebView.goBack() called");
        }
        this.f4366x.goBack();
        return true;
    }

    public final void cleanup() {
        if (this.f4366x != null) {
            this.f4366x.m238e();
        }
        this.f4366x = null;
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        return null;
    }

    public final void m4661d() {
        if (this.f4366x != null) {
            this.f4366x.goForward();
        }
    }

    public final View m4662e() {
        return this.f4366x;
    }

    public final void m4663f() {
        if (this.f4366x != null) {
            this.f4366x.m232c();
        }
    }

    public final String m4664g() {
        return this.f4366x != null ? this.f4366x.getUrl() : null;
    }

    public final LuaWidget getChildWidget(String str) {
        return null;
    }

    public final ArrayList getChildWidgets() {
        return null;
    }

    public final String getID() {
        return super.getTable(ATTR_WIDGET_ID).toString();
    }

    public final LuaWidget getParent() {
        return this.I;
    }

    public final Hashtable getProperties() {
        Hashtable hashtable = new Hashtable();
        hashtable.put(f4340b, "string");
        hashtable.put(f4339a, "string");
        hashtable.put(f4345g, "string");
        hashtable.put(f4341c, "table");
        hashtable.put(f4340b, "table");
        hashtable.put(f4347i, "function");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final String getType() {
        return "Browser";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            int i;
            this.f4366x = new KonyWeb(KonyMain.getActContext(), this.f4364C);
            LuaNil table = super.getTable(f4339a);
            if (table != LuaNil.nil) {
                this.f4368z = table.toString();
                this.f4366x.m222a(this.f4368z);
                i = 1;
            } else {
                table = super.getTable(f4345g);
                if (table != LuaNil.nil) {
                    this.f4366x.m229b(table.toString());
                }
                i = 0;
            }
            if (i != 0) {
                table = super.getTable(f4340b);
                if (table != LuaNil.nil && ((String) table).intern() == f4346h) {
                    this.f4366x.m219a(KonyWeb.f244b);
                }
                table = super.getTable(f4341c);
                if (table != LuaNil.nil) {
                    m4657b((LuaTable) table);
                }
            }
            if (super.getTable(f4342d) != LuaNil.nil) {
                this.f4366x.m220a(this.f4365R);
            } else if (super.getTable(f4343e) != LuaNil.nil) {
                this.f4366x.m220a(this.f4365R);
            }
            if (this.f4362A != null) {
                this.f4366x.m220a(this.f4362A);
            }
            table = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table != LuaNil.nil) {
                this.f4366x.m228b(m3942a(((Boolean) table).booleanValue()));
            }
            if (super.getTable(f4347i) != LuaNil.nil) {
                this.f4366x.m221a(new ey(this));
            }
            table = super.getTable(f4337P);
            if (table != LuaNil.nil) {
                this.f4366x.m240e(((Boolean) table).booleanValue());
            }
            table = super.getTable(f4338Q);
            if (table != LuaNil.nil) {
                this.f4366x.m242f(((Boolean) table).booleanValue());
            }
            table = super.getTable(f4336D);
            if (table != LuaNil.nil) {
                this.f4366x.m233c(((Double) table).intValue());
            }
            table = super.getTable(f4349k);
            if (table != LuaNil.nil) {
                this.f4366x.m225a(((Boolean) table).booleanValue());
            }
            table = super.getTable(f4350l);
            if (table != LuaNil.nil) {
                this.f4366x.m230b(((Boolean) table).booleanValue());
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                this.f4366x.m226a(convertMarginsToPixels(table, this.I));
            }
            table = super.getTable(f4355q);
            if (table != LuaNil.nil) {
                this.f4367y = ((Boolean) table).booleanValue();
                if (this.f4367y) {
                    this.f4366x.m217a();
                }
            }
            table = super.getTable(f4344f);
            if (table != LuaNil.nil) {
                this.f4366x.m243g(((Boolean) table).booleanValue());
            }
            Object table2 = super.getTable(ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE);
            if (table2 != LuaNil.nil) {
                table2 = cr.m2201a(table2, 1);
                if (table2 != null) {
                    this.M = ((Double) table2).intValue();
                }
            }
            table2 = super.getTable(ATTR_WIDGET_CONTAINER_HEIGHT);
            if (table2 != LuaNil.nil) {
                table2 = cr.m2201a(table2, 1);
                if (table2 != null) {
                    this.N = ((Double) table2).floatValue();
                    m4669p();
                }
            }
            table2 = super.getTable(f4360v);
            if (table2 != LuaNil.nil) {
                table2 = cr.m2201a(table2, 0);
                if (table2 != null) {
                    this.f4363B = ((Boolean) table2).booleanValue();
                    this.f4366x.m234c(this.f4363B);
                }
            }
            table2 = super.getTable(f4361w);
            if (table2 != LuaNil.nil) {
                table2 = cr.m2201a(table2, 0);
                if (table2 != null) {
                    this.f4366x.m237d(((Boolean) table2).booleanValue());
                }
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
            if (this.I != null) {
                if (this.I instanceof eO) {
                    ((eO) this.I).m4225g();
                } else if (this.I instanceof fv) {
                    ((fv) this.I).m4458l();
                }
            }
        }
        this.f4366x.m227b();
        return this.f4366x.m235d();
    }

    public final int getWidth() {
        return 0;
    }

    public final void m4665h() {
        if (this.f4366x != null) {
            this.f4366x.reload();
        }
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4366x.m231b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != null && table != LuaNil.nil) {
                this.f4366x.m226a(convertMarginsToPixels(table, this.I));
            }
        }
    }

    public final boolean m4666i() {
        return this.f4366x != null ? this.f4366x.canGoBack() : false;
    }

    public final boolean m4667j() {
        return this.f4366x != null ? this.f4366x.canGoForward() : false;
    }

    public final void m4668k() {
        if (this.f4366x != null) {
            this.f4366x.clearHistory();
        }
    }

    protected final void m4669p() {
        switch (this.M) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (this.N >= 0.0f) {
                    this.f4366x.m236d(O != -1 ? (int) ((((float) O) * this.N) / 100.0f) : (int) ((((float) KonyMain.getActContext().m4167p()) * this.N) / 100.0f));
                } else if (this.N >= 0.0f || !m4659b()) {
                    this.f4366x.m236d(-2);
                } else {
                    this.f4366x.m236d(-1);
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (this.N >= 0.0f) {
                    int o = KonyMain.getActContext().m4166o();
                    this.f4366x.m236d((int) ((((float) (this.I instanceof eO ? (int) (((eO) this.I).m4231m() * ((float) o)) : o)) * this.N) / 100.0f));
                } else if (this.N >= 0.0f || !m4659b()) {
                    this.f4366x.m236d(-2);
                } else {
                    this.f4366x.m236d(-1);
                }
            default:
        }
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocus() {
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4366x.m236d(i);
            this.f4366x.requestLayout();
        }
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        String intern = ((String) obj).intern();
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(obj, obj2);
        } else if (intern == f4351m) {
            LuaTable luaTable = (LuaTable) obj2;
            LuaNil table = luaTable.getTable(f4352n);
            if (table != LuaNil.nil) {
                super.setTable(f4339a, table);
            }
            table = luaTable.getTable(f4353o);
            if (table != LuaNil.nil) {
                super.setTable(f4340b, table);
            }
            table = luaTable.getTable(f4354p);
            if (table != LuaNil.nil) {
                super.setTable(f4341c, (LuaTable) table);
            }
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4366x.m228b(m3942a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4366x.m218a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4366x.m239e(i);
            this.f4366x.requestLayout();
        }
    }

    public final String toString() {
        return "LuaWeb: " + getTable(ATTR_WIDGET_ID);
    }
}
