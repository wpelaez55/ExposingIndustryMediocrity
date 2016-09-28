package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.text.TextWatcher;
import android.view.View.OnFocusChangeListener;
import android.widget.TextView.OnEditorActionListener;
import com.konylabs.android.KonyMain;
import com.konylabs.search.SearchDataAdapter;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import ny0k.bU;
import ny0k.cN;
import ny0k.ch;
import ny0k.cl;

public final class hJ extends LuaWidget {
    private static String f4295B;
    public static String f4296a;
    private static String f4297c;
    private static String f4298d;
    private static String f4299e;
    private static String f4300f;
    private static String f4301g;
    private static String f4302h;
    private static String f4303i;
    private static String f4304j;
    private static String f4305k;
    private static String f4306l;
    private static String f4307m;
    private static String f4308n;
    private static String f4309o;
    private static String f4310p;
    private static String f4311q;
    private static String f4312r;
    private static String f4313s;
    private static String f4314t;
    private static String f4315u;
    private static String f4316v;
    private static String f4317w;
    private static String f4318x;
    private static String f4319y;
    private Object f4320A;
    private int f4321C;
    private int f4322D;
    private ch f4323P;
    private cl f4324Q;
    private ee f4325R;
    private Object f4326S;
    private Object f4327T;
    private boolean f4328U;
    private int f4329V;
    private String f4330W;
    private TextWatcher f4331X;
    private OnEditorActionListener f4332Y;
    private OnFocusChangeListener f4333Z;
    Object f4334b;
    private Object f4335z;

    static {
        f4297c = "onbeginediting";
        f4298d = "onendediting";
        f4299e = "containerheightreference";
        f4300f = "containerheight";
        f4301g = "containerheightmode";
        f4296a = "text";
        f4302h = "maxtextlength";
        f4303i = "textinputmode";
        f4304j = "placeholder";
        f4305k = "keyboardstyle";
        f4306l = "securetextentry";
        f4307m = "autocapitalize";
        f4308n = "ondone";
        f4309o = "ontextchange";
        f4310p = "threshold";
        f4311q = "contentalignment";
        f4312r = "viewtype";
        f4313s = "autofilter";
        f4314t = "filterlist";
        f4315u = "ondismiss";
        f4316v = "onselect";
        f4317w = "placeholderskin";
        f4318x = "keyboardactionbutton";
        f4319y = "keyboardactionlabel";
        f4295B = "autosuggestions";
        if (KonyMain.m4057C()) {
            ATTR_WIDGET_FOCUS_SKIN = "focusSkin";
            f4302h = "maxTextLength";
            f4303i = "textInputMode";
            f4305k = "keyBoardStyle";
            f4306l = "secureTextEntry";
            f4307m = "autoCapitalize";
            f4308n = "onDone";
            f4309o = "onTextChange";
            f4312r = "viewType";
            f4313s = "autoFilter";
            f4314t = "filterList";
            f4315u = "onDismiss";
            f4316v = "onSelect";
            f4317w = "placeholderSkin";
            f4297c = "onBeginEditing";
            f4298d = "onEndEditing";
            f4311q = "contentAlignment";
            f4299e = "containerHeightReference";
            f4300f = "containerHeight";
            f4301g = "containerHeightMode";
            f4295B = "autoSuggestions";
            f4318x = "keyBoardActionButton";
            f4319y = "keyboardActionLabel";
        }
    }

    public hJ(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        LuaNil table;
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4335z = null;
        this.f4320A = null;
        this.f4321C = 1;
        this.f4325R = null;
        this.f4327T = null;
        this.f4328U = false;
        this.f4329V = 0;
        this.f4330W = "textbox";
        this.f4334b = null;
        this.f4331X = new hM(this);
        this.f4332Y = new hN(this);
        this.f4333Z = new hO(this);
        this.mBasicConfig = luaTable;
        this.mLayoutConfig = luaTable2;
        this.mPspConfig = luaTable3;
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        if (luaTable3 != null) {
            table = luaTable3.getTable(f4312r);
            if (table != LuaNil.nil) {
                super.setTable(f4312r, table);
                this.f4330W = (String) table;
                if (this.f4330W.equals("searchbox")) {
                    this.f4329V = 2;
                }
            }
            table = luaTable3.getTable(f4313s);
            if (table != LuaNil.nil) {
                super.setTable(f4313s, table);
            }
            table = luaTable3.getTable(f4314t);
            if (table != LuaNil.nil) {
                super.setTable(f4314t, table);
            }
            table = luaTable3.getTable(f4317w);
            if (table != LuaNil.nil) {
                super.setTable(f4317w, table);
            }
            table = luaTable3.getTable(f4297c);
            if (table != LuaNil.nil) {
                super.setTable(f4297c, table);
            }
            table = luaTable3.getTable(f4298d);
            if (table != LuaNil.nil) {
                super.setTable(f4298d, table);
            }
            table = luaTable3.getTable(f4295B);
            if (table != LuaNil.nil) {
                super.setTable(f4295B, table);
            }
            table = luaTable3.getTable(f4318x);
            if (table != LuaNil.nil) {
                super.setTable(f4318x, table);
            }
            table = luaTable3.getTable(f4319y);
            if (table != LuaNil.nil) {
                super.setTable(f4319y, table);
            }
        }
        table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, table);
        }
        table = luaTable.getTable(f4296a);
        if (table != LuaNil.nil) {
            super.setTable(f4296a, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        } else {
            super.setTable(ATTR_WIDGET_ISVISIBLE, Boolean.valueOf(true));
        }
        table = luaTable.getTable(f4302h);
        if (table != LuaNil.nil) {
            super.setTable(f4302h, table);
        }
        table = luaTable.getTable(f4303i);
        if (table != LuaNil.nil) {
            super.setTable(f4303i, table);
        } else {
            super.setTable(f4303i, "A");
        }
        table = luaTable.getTable(f4305k);
        if (table != LuaNil.nil) {
            super.setTable(f4305k, table);
        }
        table = luaTable.getTable(f4306l);
        if (table != LuaNil.nil) {
            super.setTable(f4306l, table);
        }
        table = luaTable.getTable(f4308n);
        if (table != LuaNil.nil) {
            super.setTable(f4308n, table);
        }
        table = luaTable.getTable(f4309o);
        if (table != LuaNil.nil) {
            super.setTable(f4309o, table);
        }
        table = luaTable.getTable(f4307m);
        if (table != LuaNil.nil) {
            super.setTable(f4307m, table);
        }
        table = luaTable.getTable(f4304j);
        if (table != LuaNil.nil) {
            super.setTable(f4304j, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_HEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_HEXPAND, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGNMENT, table);
            }
            table = luaTable2.getTable(f4311q);
            if (table != LuaNil.nil) {
                super.setTable(f4311q, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table);
            }
            table = luaTable2.getTable(f4300f);
            if (table != LuaNil.nil) {
                super.setTable(f4300f, table);
                this.bRegisterForHeightChange = true;
            }
            table = luaTable2.getTable(f4301g);
            if (table != LuaNil.nil) {
                super.setTable(f4301g, table);
            }
            table = luaTable2.getTable(f4299e);
            if (table != LuaNil.nil) {
                super.setTable(f4299e, table);
            }
        }
    }

    private Object m4634a(Object obj) {
        String intern = ((String) obj).intern();
        if (intern == f4296a && this.E == KONY_WIDGET_RESTORE) {
            return this.f4325R.m1324f();
        }
        Object table = super.getTable(intern);
        if (table != null) {
            return table;
        }
        throw new LuaError("Unable to find property:" + intern + " in TextBox2 widget", 601);
    }

    private void m4636a(dB dBVar) {
        this.f4325R.m1301a(dBVar);
        this.f4325R.m1328h();
    }

    private void m4638b(dB dBVar) {
        this.f4325R.m1309b(dBVar);
        this.f4325R.m1328h();
    }

    private void m4639b(Object obj) {
        String intern = ((String) obj).intern();
        if (intern == "N") {
            this.f4325R.m1322e(1);
        } else if (intern == "P") {
            this.f4325R.m1322e(0);
        } else if (intern == "A") {
            this.f4325R.m1322e(2);
        }
    }

    private void m4641c(Object obj) {
        switch (((Double) obj).intValue()) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                this.f4325R.m1319d(51);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                this.f4325R.m1319d(49);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                this.f4325R.m1319d(53);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                this.f4325R.m1319d(19);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                this.f4325R.m1319d(17);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                this.f4325R.m1319d(21);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                this.f4325R.m1319d(83);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                this.f4325R.m1319d(81);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                this.f4325R.m1319d(85);
            default:
                this.f4325R.m1319d(17);
        }
    }

    protected final void m4646a(Object obj, Object obj2) {
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (!(intern != ATTR_WIDGET_ISVISIBLE || obj2 == null || obj2 == LuaNil.nil)) {
                this.f4325R.m1307b(m3942a(((Boolean) obj2).booleanValue()));
            }
            if (intern == f4296a) {
                Object obj3 = obj2 == LuaNil.nil ? BuildConfig.FLAVOR : obj2;
                this.f4325R.m1308b(this.f4331X);
                if (obj3 instanceof String) {
                    this.f4325R.m1303a((String) obj3);
                } else {
                    this.f4325R.m1303a(obj3.toString());
                }
                this.f4325R.m1299a(this.f4331X);
            } else if (intern == f4302h) {
                if (obj2 != LuaNil.nil) {
                    this.f4325R.m1327g(((Double) obj2).intValue());
                }
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4636a(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4636a(r0);
                }
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4638b(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4638b(r0);
                }
            } else if (intern == f4304j) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4325R.m1311b((String) obj2);
                }
            } else if (intern == f4317w) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        this.f4325R.m1315c(r0.m1156m());
                    }
                }
            } else if (this.f4328U && intern == f4314t) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4325R.m1302a((LuaTable) obj2);
                }
            } else if (this.f4330W.equals("searchbox") && intern == f4314t) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    SearchDataAdapter.getInstance().setData((LuaTable) obj2);
                }
            } else if (intern == f4303i) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    m4639b(obj2);
                }
            } else if (intern == ATTR_WIDGET_ISVISIBLE) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4325R.m1307b(m3942a(((Boolean) obj2).booleanValue()));
                }
            } else if (intern == ATTR_WIDGET_ALIGNMENT) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    m4641c(obj2);
                }
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT) {
                if (obj2 != null && obj2 != LuaNil.nil && this.G) {
                    setWeight();
                    this.f4325R.m1296a();
                    ((eO) this.I).m4238t();
                }
            } else if (intern == f4305k) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4325R.m1331i(((Double) obj2).intValue());
                }
            } else if (intern == f4307m) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4325R.m1329h(((Double) obj2).intValue());
                }
            } else if (intern == f4308n) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4327T = obj2;
                    this.f4325R.m1300a(this.f4332Y);
                }
            } else if (intern == f4309o) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4326S = obj2;
                    this.f4325R.m1299a(this.f4331X);
                }
            } else if (intern == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil) {
                this.f4325R.m1305a(convertMarginsToPixels(obj2, this.I));
                this.f4325R.m1296a();
            } else if (intern == ATTR_WIDGET_PADDING && obj2 != LuaNil.nil) {
                this.f4325R.m1313b(convertPaddingToPixels(obj2, this.I));
                this.f4325R.m1296a();
            } else if (intern == f4297c) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4335z = obj2;
                    if (this.f4325R.getOnFocusChangeListener() == null) {
                        this.f4325R.setOnFocusChangeListener(this.f4333Z);
                    }
                }
            } else if (intern == f4298d) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4320A = obj2;
                    if (this.f4325R.getOnFocusChangeListener() == null) {
                        this.f4325R.setOnFocusChangeListener(this.f4333Z);
                    }
                }
            } else if (intern == f4311q && obj2 != LuaNil.nil) {
                switch (((Double) obj2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f4325R.m1333j(51);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f4325R.m1333j(49);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f4325R.m1333j(53);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f4325R.m1333j(19);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f4325R.m1333j(17);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f4325R.m1333j(21);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f4325R.m1333j(83);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f4325R.m1333j(81);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f4325R.m1333j(85);
                    default:
                        this.f4325R.m1333j(17);
                }
            } else if (intern == f4299e) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4321C = ((Double) obj2).intValue();
                    r0 = super.getTable(f4301g);
                    if (r0 != LuaNil.nil && ((Double) r0).intValue() == 4) {
                        m4649p();
                        this.f4325R.m1296a();
                    }
                }
            } else if (intern == f4300f) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4322D = ((Double) obj2).intValue();
                    r0 = super.getTable(f4301g);
                    if (r0 != LuaNil.nil && ((Double) r0).intValue() == 4) {
                        m4649p();
                        this.f4325R.m1296a();
                    }
                }
            } else if (intern == f4301g) {
                if (obj2 == null || obj2 == LuaNil.nil || ((Double) obj2).intValue() != 4) {
                    this.f4325R.m1312b(false);
                } else {
                    m4649p();
                }
                this.f4325R.m1296a();
            } else if (intern == ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
                if (obj2 != null && (obj2 instanceof LuaTable)) {
                    this.f4325R.m1316c(m3944a((LuaTable) obj2, this.f4325R.m1324f()));
                } else if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f4325R.m1316c(BuildConfig.FLAVOR);
                }
            } else if (intern == f4295B && obj2 != LuaNil.nil) {
                this.f4325R.m1320d(((Boolean) obj2).booleanValue());
            } else if ((intern == f4319y && obj2 != LuaNil.nil) || (intern == f4318x && obj2 != LuaNil.nil)) {
                this.f4325R.m1337m(((Double) obj2).intValue());
            }
        }
    }

    public final void m4647a(ch chVar, cl clVar) {
        this.f4323P = chVar;
        this.f4324Q = clVar;
    }

    public final boolean m4648b() {
        return this.f4330W.equals("searchbox");
    }

    public final void cleanup() {
        if (this.f4325R != null) {
            String f = this.f4325R.m1324f();
            if (f != null) {
                super.setTable(f4296a, f);
            } else {
                super.setTable(f4296a, LuaNil.nil);
            }
            this.f4325R.m1308b(this.f4331X);
            if (this.f4330W.equals("searchbox")) {
                SearchDataAdapter.getInstance().cleanLuaWidget(this);
            }
            this.f4325R.m1326g();
            this.f4325R = null;
        }
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        LuaWidget hJVar = new hJ(this.mBasicConfig, this.mLayoutConfig, this.mPspConfig);
        hJVar.copyProperties(this);
        hJVar.setSegUIWidgetType(bU.TEXTFIELD2);
        LuaNil table = super.getTable(ATTR_WIDGET_ISVISIBLE);
        if (!(table == LuaNil.nil || table == null)) {
            hJVar.setVisibility(((Boolean) table).booleanValue());
        }
        return hJVar;
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
        hashtable.put(f4296a, "string");
        hashtable.put(f4302h, "number");
        hashtable.put(f4304j, "string");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        String intern = ((String) obj).intern();
        Object table;
        if (intern == f4305k || intern == f4307m || intern == f4304j || intern == f4317w || intern == f4312r || intern == f4308n || intern == f4309o) {
            table = super.getTable(obj);
            if (table != null) {
                return table;
            }
            throw new LuaError("Unable to find property:" + obj + " in TextBox2 widget", 601);
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4634a(obj);
        } else {
            synchronized (this) {
                this.f4334b = null;
                table = new ii(new hK(this, obj));
                new Handler(Looper.getMainLooper()).post(table);
                table.m1406a();
                table = this.f4334b;
                this.f4334b = null;
            }
            return table;
        }
    }

    public final String getType() {
        return "TextBox";
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getWidget() {
        /*
        r6 = this;
        r5 = 17;
        r4 = 1;
        r1 = 0;
        r0 = r6.E;
        r2 = KONY_WIDGET_BACKUP;
        if (r0 != r2) goto L_0x0393;
    L_0x000a:
        r0 = f4313s;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0022;
    L_0x0014:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        r6.f4328U = r0;
        r0 = r6.f4328U;
        if (r0 == 0) goto L_0x0022;
    L_0x0020:
        r6.f4329V = r4;
    L_0x0022:
        r0 = new com.konylabs.api.ui.ee;
        r2 = com.konylabs.android.KonyMain.getActContext();
        r3 = r6.f4329V;
        r0.<init>(r2, r3);
        r6.f4325R = r0;
        r0 = r6.f4325R;
        r0.m1318d();
        r0 = ATTR_WIDGET_SKIN;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x039f;
    L_0x003e:
        r0 = ny0k.cN.m2139a(r0);
        if (r0 == 0) goto L_0x0049;
    L_0x0044:
        r2 = r6.f4325R;
        r2.m1309b(r0);
    L_0x0049:
        r0 = ATTR_WIDGET_FOCUS_SKIN;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x005e;
    L_0x0053:
        r0 = ny0k.cN.m2139a(r0);
        if (r0 == 0) goto L_0x005e;
    L_0x0059:
        r2 = r6.f4325R;
        r2.m1301a(r0);
    L_0x005e:
        r0 = f4296a;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0073;
    L_0x0068:
        r2 = r0 instanceof java.lang.String;
        if (r2 == 0) goto L_0x03a7;
    L_0x006c:
        r2 = r6.f4325R;
        r0 = (java.lang.String) r0;
        r2.m1303a(r0);
    L_0x0073:
        r0 = f4302h;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0088;
    L_0x007d:
        r2 = r6.f4325R;
        r0 = (java.lang.Double) r0;
        r0 = r0.intValue();
        r2.m1327g(r0);
    L_0x0088:
        r0 = f4303i;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0095;
    L_0x0092:
        r6.m4639b(r0);
    L_0x0095:
        r0 = ATTR_WIDGET_ISVISIBLE;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x00ae;
    L_0x009f:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        r2 = r6.f4325R;
        r0 = r6.m3942a(r0);
        r2.m1307b(r0);
    L_0x00ae:
        r0 = r6.m3941K();
        if (r0 == 0) goto L_0x0401;
    L_0x00b4:
        r0 = ATTR_WIDGET_CONTAINER_WEIGHT;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0401;
    L_0x00be:
        r0 = (java.lang.Double) r0;
        r0 = r0.intValue();
    L_0x00c4:
        if (r0 <= 0) goto L_0x00dd;
    L_0x00c6:
        r0 = ATTR_WIDGET_HEXPAND;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x00dd;
    L_0x00d0:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x00dd;
    L_0x00d8:
        r0 = r6.f4325R;
        r0.m1304a(r4);
    L_0x00dd:
        r0 = ATTR_WIDGET_VEXPAND;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x00f4;
    L_0x00e7:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x00f4;
    L_0x00ef:
        r0 = r6.f4325R;
        r0.m1312b(r4);
    L_0x00f4:
        r0 = ATTR_WIDGET_ALIGNMENT;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0101;
    L_0x00fe:
        r6.m4641c(r0);
    L_0x0101:
        r0 = ATTR_WIDGET_MARGIN;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0116;
    L_0x010b:
        r2 = r6.f4325R;
        r3 = r6.I;
        r0 = r6.convertMarginsToPixels(r0, r3);
        r2.m1305a(r0);
    L_0x0116:
        r0 = ATTR_WIDGET_PADDING;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x012b;
    L_0x0120:
        r2 = r6.f4325R;
        r3 = r6.I;
        r0 = r6.convertPaddingToPixels(r0, r3);
        r2.m1313b(r0);
    L_0x012b:
        r0 = f4299e;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x013d;
    L_0x0135:
        r0 = (java.lang.Double) r0;
        r0 = r0.intValue();
        r6.f4321C = r0;
    L_0x013d:
        r0 = f4300f;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0165;
    L_0x0147:
        r0 = (java.lang.Double) r0;
        r0 = r0.intValue();
        r6.f4322D = r0;
        r0 = f4301g;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0165;
    L_0x0159:
        r0 = (java.lang.Double) r0;
        r0 = r0.intValue();
        r2 = 4;
        if (r0 != r2) goto L_0x0165;
    L_0x0162:
        r6.m4649p();
    L_0x0165:
        r0 = f4304j;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0178;
    L_0x016f:
        r2 = r6.f4325R;
        r0 = r0.toString();
        r2.m1311b(r0);
    L_0x0178:
        r0 = f4317w;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0191;
    L_0x0182:
        r0 = ny0k.cN.m2139a(r0);
        if (r0 == 0) goto L_0x0191;
    L_0x0188:
        r2 = r6.f4325R;
        r0 = r0.m1156m();
        r2.m1315c(r0);
    L_0x0191:
        r0 = f4307m;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x01a6;
    L_0x019b:
        r0 = (java.lang.Double) r0;
        r0 = r0.intValue();
        r2 = r6.f4325R;
        r2.m1329h(r0);
    L_0x01a6:
        r0 = f4295B;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x01bb;
    L_0x01b0:
        r2 = r6.f4325R;
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        r2.m1320d(r0);
    L_0x01bb:
        r0 = f4319y;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 != r2) goto L_0x01cf;
    L_0x01c5:
        r0 = f4318x;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x01da;
    L_0x01cf:
        r2 = r6.f4325R;
        r0 = (java.lang.Double) r0;
        r0 = r0.intValue();
        r2.m1337m(r0);
    L_0x01da:
        r0 = f4305k;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x01ef;
    L_0x01e4:
        r0 = (java.lang.Double) r0;
        r0 = r0.intValue();
        r2 = r6.f4325R;
        r2.m1331i(r0);
    L_0x01ef:
        r0 = f4309o;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0202;
    L_0x01f9:
        r6.f4326S = r0;
        r0 = r6.f4325R;
        r2 = r6.f4331X;
        r0.m1299a(r2);
    L_0x0202:
        r0 = f4308n;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0215;
    L_0x020c:
        r6.f4327T = r0;
        r0 = r6.f4325R;
        r2 = r6.f4332Y;
        r0.m1300a(r2);
    L_0x0215:
        r0 = r6.f4328U;
        if (r0 == 0) goto L_0x023f;
    L_0x0219:
        r0 = f4310p;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x022e;
    L_0x0223:
        r2 = r6.f4325R;
        r0 = (java.lang.Double) r0;
        r0 = r0.intValue();
        r2.m1298a(r0);
    L_0x022e:
        r0 = f4314t;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x023f;
    L_0x0238:
        r2 = r6.f4325R;
        r0 = (com.konylabs.vm.LuaTable) r0;
        r2.m1310b(r0);
    L_0x023f:
        r0 = r6.f4330W;
        r2 = "searchbox";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x02cb;
    L_0x0249:
        r0 = com.konylabs.search.SearchDataAdapter.getInstance();
        r0.setLuaWidget(r6);
        r0 = r6.f4325R;
        r0 = r0.m1332j();
        r0 = (android.widget.EditText) r0;
        if (r0 == 0) goto L_0x0265;
    L_0x025a:
        r0.setFocusable(r1);
        r2 = new com.konylabs.api.ui.hL;
        r2.<init>(r6);
        r0.setOnClickListener(r2);
    L_0x0265:
        r0 = r6.f4325R;
        r2 = "Search ";
        r0.m1311b(r2);
        r0 = f4314t;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x027f;
    L_0x0276:
        r2 = com.konylabs.search.SearchDataAdapter.getInstance();
        r0 = (com.konylabs.vm.LuaTable) r0;
        r2.setData(r0);
    L_0x027f:
        r0 = f4309o;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0292;
    L_0x0289:
        r2 = com.konylabs.search.SearchDataAdapter.getInstance();
        r0 = (com.konylabs.vm.Function) r0;
        r2.setOnTextChangedCallback(r0);
    L_0x0292:
        r0 = f4308n;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x02a5;
    L_0x029c:
        r2 = com.konylabs.search.SearchDataAdapter.getInstance();
        r0 = (com.konylabs.vm.Function) r0;
        r2.setOnDoneCallback(r0);
    L_0x02a5:
        r0 = f4315u;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x02b8;
    L_0x02af:
        r2 = com.konylabs.search.SearchDataAdapter.getInstance();
        r0 = (com.konylabs.vm.Function) r0;
        r2.setOnDismissCallback(r0);
    L_0x02b8:
        r0 = f4316v;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x02cb;
    L_0x02c2:
        r2 = com.konylabs.search.SearchDataAdapter.getInstance();
        r0 = (com.konylabs.vm.Function) r0;
        r2.setOnSelectCallback(r0);
    L_0x02cb:
        r0 = f4306l;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x02e2;
    L_0x02d5:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x02e2;
    L_0x02dd:
        r0 = "P";
        r6.m4639b(r0);
    L_0x02e2:
        r0 = f4297c;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x02ee;
    L_0x02ec:
        r6.f4335z = r0;
    L_0x02ee:
        r0 = f4298d;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x02fa;
    L_0x02f8:
        r6.f4320A = r0;
    L_0x02fa:
        r0 = r6.f4335z;
        if (r0 == 0) goto L_0x0304;
    L_0x02fe:
        r0 = r6.f4335z;
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 != r2) goto L_0x030e;
    L_0x0304:
        r0 = r6.f4320A;
        if (r0 == 0) goto L_0x031d;
    L_0x0308:
        r0 = r6.f4320A;
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x031d;
    L_0x030e:
        r0 = r6.f4325R;
        r0 = r0.getOnFocusChangeListener();
        if (r0 != 0) goto L_0x031d;
    L_0x0316:
        r0 = r6.f4325R;
        r2 = r6.f4333Z;
        r0.setOnFocusChangeListener(r2);
    L_0x031d:
        r0 = f4311q;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0335;
    L_0x0327:
        r0 = (java.lang.Double) r0;
        r0 = r0.intValue();
        switch(r0) {
            case 1: goto L_0x03ef;
            case 2: goto L_0x03e6;
            case 3: goto L_0x03f8;
            case 4: goto L_0x03d4;
            case 5: goto L_0x03cd;
            case 6: goto L_0x03dd;
            case 7: goto L_0x03bb;
            case 8: goto L_0x03b2;
            case 9: goto L_0x03c4;
            default: goto L_0x0330;
        };
    L_0x0330:
        r0 = r6.f4325R;
        r0.m1333j(r5);
    L_0x0335:
        r0 = ATTR_WIDGET_SET_ENABLED;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x034a;
    L_0x033f:
        r2 = r6.f4325R;
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        r2.m1317c(r0);
    L_0x034a:
        r0 = ATTR_WIDGET_ACCESSIBILITY_CONFIG;
        r0 = super.getTable(r0);
        r2 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r2) goto L_0x0369;
    L_0x0354:
        r2 = r0 instanceof com.konylabs.vm.LuaTable;
        if (r2 == 0) goto L_0x0369;
    L_0x0358:
        r2 = r6.f4325R;
        r0 = (com.konylabs.vm.LuaTable) r0;
        r3 = r6.f4325R;
        r3 = r3.m1324f();
        r0 = r6.m3944a(r0, r3);
        r2.m1316c(r0);
    L_0x0369:
        r0 = com.konylabs.android.KonyMain.f3657e;
        if (r0 == 0) goto L_0x0388;
    L_0x036d:
        r0 = "inputCursorVisible";
        r0 = com.konylabs.api.C0339C.m2240a(r0);
        r0 = ny0k.cr.m2201a(r0, r1);
        if (r0 == 0) goto L_0x0388;
    L_0x0379:
        r1 = com.konylabs.vm.LuaNil.nil;
        if (r0 == r1) goto L_0x0388;
    L_0x037d:
        r1 = r6.f4325R;
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        r1.m1323e(r0);
    L_0x0388:
        r0 = KONY_WIDGET_RESTORE;
        r6.E = r0;
        r0 = r6.G;
        if (r0 == 0) goto L_0x0393;
    L_0x0390:
        r6.setWeight();
    L_0x0393:
        r0 = r6.f4325R;
        r0.m1306b();
        r0 = r6.f4325R;
        r0 = r0.m1314c();
        return r0;
    L_0x039f:
        r0 = r6.f4325R;
        r2 = 0;
        r0.m1309b(r2);
        goto L_0x0049;
    L_0x03a7:
        r2 = r6.f4325R;
        r0 = r0.toString();
        r2.m1303a(r0);
        goto L_0x0073;
    L_0x03b2:
        r0 = r6.f4325R;
        r2 = 81;
        r0.m1333j(r2);
        goto L_0x0335;
    L_0x03bb:
        r0 = r6.f4325R;
        r2 = 83;
        r0.m1333j(r2);
        goto L_0x0335;
    L_0x03c4:
        r0 = r6.f4325R;
        r2 = 85;
        r0.m1333j(r2);
        goto L_0x0335;
    L_0x03cd:
        r0 = r6.f4325R;
        r0.m1333j(r5);
        goto L_0x0335;
    L_0x03d4:
        r0 = r6.f4325R;
        r2 = 19;
        r0.m1333j(r2);
        goto L_0x0335;
    L_0x03dd:
        r0 = r6.f4325R;
        r2 = 21;
        r0.m1333j(r2);
        goto L_0x0335;
    L_0x03e6:
        r0 = r6.f4325R;
        r2 = 49;
        r0.m1333j(r2);
        goto L_0x0335;
    L_0x03ef:
        r0 = r6.f4325R;
        r2 = 51;
        r0.m1333j(r2);
        goto L_0x0335;
    L_0x03f8:
        r0 = r6.f4325R;
        r2 = 53;
        r0.m1333j(r2);
        goto L_0x0335;
    L_0x0401:
        r0 = r1;
        goto L_0x00c4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.ui.hJ.getWidget():android.view.View");
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4325R.m1313b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4325R.m1305a(convertMarginsToPixels(table, this.I));
            }
            this.f4325R.m1334k();
        }
    }

    public final void m4649p() {
        switch (this.f4321C) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (this.f4322D > 0) {
                    this.f4325R.m1335k((KonyMain.getActContext().m4167p() * this.f4322D) / 100);
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                if (this.f4322D > 0) {
                    int o = KonyMain.getActContext().m4166o();
                    this.f4325R.m1335k(((this.I instanceof eO ? (int) (((eO) this.I).m4231m() * ((float) o)) : o) * this.f4322D) / 100);
                }
            default:
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4325R.m1317c(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4325R.dispatchWindowFocusChanged(true);
            this.f4325R.m1330i();
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4325R.m1312b(false);
            this.f4325R.m1335k(i);
            this.f4325R.m1296a();
        }
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(obj, obj2);
        }
        if (((String) obj).intern() == f4314t) {
            super.setTable(obj, obj2);
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4325R.m1307b(m3942a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4325R.m1297a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4325R.m1304a(false);
            this.f4325R.m1336l(i);
            this.f4325R.m1296a();
        }
    }
}
