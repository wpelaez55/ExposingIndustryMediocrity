package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0339C;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import ny0k.cN;
import ny0k.cr;

public final class hy extends LuaWidget {
    private static String f4488b;
    private static String f4489c;
    private static String f4490d;
    private static String f4491e;
    private static String f4492f;
    private static String f4493g;
    private static String f4494h;
    private static String f4495i;
    private static String f4496j;
    private static String f4497k;
    private static String f4498l;
    private static String f4499m;
    private static String f4500n;
    private static String f4501o;
    private static String f4502p;
    Object f4503a;
    private ee f4504q;
    private Object f4505r;
    private Object f4506s;
    private Object f4507t;
    private Object f4508u;
    private OnFocusChangeListener f4509v;
    private TextWatcher f4510w;
    private OnFocusChangeListener f4511x;

    static {
        f4488b = "text";
        f4489c = "maxtextlength";
        f4490d = "textinputmode";
        f4491e = "placeholder";
        f4492f = "keyboardstyle";
        f4493g = "securetextentry";
        f4494h = "autocapitalize";
        f4495i = "ondone";
        f4496j = "ontextchange";
        f4497k = "numberofvisiblelines";
        f4498l = "contentalignment";
        f4499m = "placeholderskin";
        f4500n = "onbeginediting";
        f4501o = "onendediting";
        f4502p = "autosuggestions";
        if (KonyMain.m4057C()) {
            ATTR_WIDGET_FOCUS_SKIN = "focusSkin";
            f4489c = "maxTextLength";
            f4490d = "textInputMode";
            f4492f = "keyBoardStyle";
            f4493g = "secureTextEntry";
            f4494h = "autoCapitalize";
            f4495i = "onDone";
            f4496j = "onTextChange";
            f4497k = "numberOfVisibleLines";
            f4498l = "contentAlignment";
            f4499m = "placeholderSkin";
            f4500n = "onBeginEditing";
            f4501o = "onEndEditing";
            f4502p = "autoSuggestions";
        }
    }

    public hy(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        LuaNil table;
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4504q = null;
        this.f4506s = null;
        this.f4507t = null;
        this.f4508u = null;
        this.f4503a = null;
        this.f4509v = new hA(this);
        this.f4510w = new hB(this);
        this.f4511x = new hC(this);
        if (luaTable3 != null) {
            table = luaTable3.getTable(f4499m);
            if (table != LuaNil.nil) {
                super.setTable(f4499m, table);
            }
            table = luaTable3.getTable(f4500n);
            if (table != LuaNil.nil) {
                super.setTable(f4500n, table);
            }
            table = luaTable3.getTable(f4501o);
            if (table != LuaNil.nil) {
                super.setTable(f4501o, table);
            }
            table = luaTable3.getTable(f4502p);
            if (table != LuaNil.nil) {
                super.setTable(f4502p, table);
            }
        } else {
            Object luaTable4 = new LuaTable(0, 0);
        }
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, table);
        }
        table = luaTable.getTable(f4488b);
        if (table != LuaNil.nil) {
            super.setTable(f4488b, table);
        }
        table = luaTable.getTable(f4489c);
        if (table != LuaNil.nil) {
            super.setTable(f4489c, table);
        }
        table = luaTable.getTable(f4490d);
        if (table != LuaNil.nil) {
            super.setTable(f4490d, table);
        } else {
            super.setTable(f4490d, "A");
        }
        table = luaTable.getTable(f4492f);
        if (table != LuaNil.nil) {
            super.setTable(f4492f, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        } else {
            super.setTable(ATTR_WIDGET_ISVISIBLE, Boolean.valueOf(true));
        }
        table = luaTable.getTable(f4493g);
        if (table != LuaNil.nil) {
            super.setTable(f4493g, table);
        }
        table = luaTable.getTable(f4495i);
        if (table != LuaNil.nil) {
            super.setTable(f4495i, table);
        }
        table = luaTable.getTable(f4496j);
        if (table != LuaNil.nil) {
            super.setTable(f4496j, table);
        }
        table = luaTable.getTable(f4497k);
        if (table != LuaNil.nil) {
            super.setTable(f4497k, table);
        }
        table = luaTable.getTable(f4494h);
        if (table != LuaNil.nil) {
            super.setTable(f4494h, table);
        }
        table = luaTable.getTable(f4491e);
        if (table != LuaNil.nil) {
            super.setTable(f4491e, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGNMENT, table);
            }
            table = luaTable2.getTable(f4498l);
            if (table != LuaNil.nil) {
                super.setTable(f4498l, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_HEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_HEXPAND, table);
            }
        }
        if (luaTable4 != null) {
            super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, luaTable4);
        }
    }

    private Object m4750a(Object obj) {
        String intern = ((String) obj).intern();
        if (intern == f4488b && this.E == KONY_WIDGET_RESTORE) {
            return this.f4504q.m1324f();
        }
        Object table = super.getTable(intern);
        if (table != null) {
            return table;
        }
        throw new LuaError("Unable to find property:" + intern + " in TextArea2 widget", 601);
    }

    private void m4751a(dB dBVar) {
        ee eeVar = this.f4504q;
        if (dBVar == null) {
            dBVar = null;
        }
        eeVar.m1301a(dBVar);
        this.f4504q.m1328h();
    }

    private void m4753b(dB dBVar) {
        ee eeVar = this.f4504q;
        if (dBVar == null) {
            dBVar = null;
        }
        eeVar.m1309b(dBVar);
        this.f4504q.m1328h();
    }

    private void m4754b(Object obj) {
        String intern = ((String) obj).intern();
        if (intern == "N") {
            this.f4504q.m1322e(1);
        } else if (intern == "P") {
            this.f4504q.m1322e(0);
        } else if (intern == "A") {
            this.f4504q.m1322e(2);
        }
    }

    private void m4756c(Object obj) {
        switch (((Double) obj).intValue()) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                this.f4504q.m1319d(51);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                this.f4504q.m1319d(49);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                this.f4504q.m1319d(53);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                this.f4504q.m1319d(19);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                this.f4504q.m1319d(17);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                this.f4504q.m1319d(21);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                this.f4504q.m1319d(83);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                this.f4504q.m1319d(81);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                this.f4504q.m1319d(85);
            default:
                this.f4504q.m1319d(17);
        }
    }

    protected final void m4759a(Object obj, Object obj2) {
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (!(intern != ATTR_WIDGET_ISVISIBLE || obj2 == null || obj2 == LuaNil.nil)) {
                this.f4504q.m1307b(m3942a(((Boolean) obj2).booleanValue()));
            }
            if (intern == f4488b) {
                Object obj3 = obj2 == LuaNil.nil ? BuildConfig.FLAVOR : obj2;
                this.f4504q.m1308b(this.f4510w);
                if (obj3 instanceof String) {
                    this.f4504q.m1303a((String) obj3);
                } else {
                    this.f4504q.m1303a(obj3.toString());
                }
                this.f4504q.m1299a(this.f4510w);
            } else if (intern == f4489c) {
                this.f4504q.m1327g(((Double) obj2).intValue());
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4753b(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4753b(r0);
                }
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4751a(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4751a(r0);
                }
            } else if (intern == f4491e) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4504q.m1311b((String) obj2);
                }
            } else if (intern == f4499m) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        this.f4504q.m1315c(r0.m1156m());
                    }
                }
            } else if (intern == f4490d) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    m4754b(obj2);
                }
            } else if (intern == ATTR_WIDGET_ALIGNMENT) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    m4756c(obj2);
                }
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT) {
                if (obj2 != null && obj2 != LuaNil.nil && this.G) {
                    setWeight();
                    this.f4504q.m1296a();
                    ((eO) this.I).m4238t();
                }
            } else if (intern == f4492f) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4504q.m1331i(((Double) obj2).intValue());
                }
            } else if (intern == f4494h) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4504q.m1329h(((Double) obj2).intValue());
                }
            } else if (intern == f4495i) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4506s = obj2;
                    this.f4504q.setOnFocusChangeListener(this.f4509v);
                }
            } else if (intern != f4500n || obj2 == LuaNil.nil) {
                if (intern != f4501o || obj2 == LuaNil.nil) {
                    if (intern == f4496j) {
                        if (obj2 != null && obj2 != LuaNil.nil) {
                            this.f4505r = obj2;
                            this.f4504q.m1299a(this.f4510w);
                        }
                    } else if (intern == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil) {
                        this.f4504q.m1305a(convertMarginsToPixels(obj2, this.I));
                        this.f4504q.m1296a();
                    } else if (intern == ATTR_WIDGET_PADDING && obj2 != LuaNil.nil) {
                        this.f4504q.m1313b(convertPaddingToPixels(obj2, this.I));
                        this.f4504q.m1296a();
                    } else if (intern == f4498l && obj2 != LuaNil.nil) {
                        switch (((Double) obj2).intValue()) {
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                this.f4504q.m1333j(51);
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                                this.f4504q.m1333j(49);
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                                this.f4504q.m1333j(53);
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                                this.f4504q.m1333j(19);
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                                this.f4504q.m1333j(17);
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                                this.f4504q.m1333j(21);
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                                this.f4504q.m1333j(83);
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                                this.f4504q.m1333j(81);
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                                this.f4504q.m1333j(85);
                            default:
                                this.f4504q.m1333j(17);
                        }
                    } else if (intern == ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
                        if (obj2 != null && (obj2 instanceof LuaTable)) {
                            this.f4504q.m1316c(m3944a((LuaTable) obj2, this.f4504q.m1324f()));
                        } else if (obj2 == null || obj2 == LuaNil.nil) {
                            this.f4504q.m1316c(BuildConfig.FLAVOR);
                        }
                    } else if (intern == f4502p && obj2 != LuaNil.nil) {
                        this.f4504q.m1320d(((Boolean) obj2).booleanValue());
                    }
                } else if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4508u = obj2;
                    if (this.f4504q.getOnFocusChangeListener() == null) {
                        this.f4504q.setOnFocusChangeListener(this.f4511x);
                    }
                }
            } else if (obj2 != null && obj2 != LuaNil.nil) {
                this.f4507t = obj2;
                if (this.f4504q.getOnFocusChangeListener() == null) {
                    this.f4504q.setOnFocusChangeListener(this.f4511x);
                }
            }
        }
    }

    public final void cleanup() {
        if (this.f4504q != null) {
            String f = this.f4504q.m1324f();
            if (f != null) {
                super.setTable(f4488b, f);
            } else {
                super.setTable(f4488b, LuaNil.nil);
            }
            this.f4504q.m1308b(this.f4510w);
            this.f4504q.m1326g();
            this.f4504q = null;
        }
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        return null;
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
        hashtable.put(f4488b, "string");
        hashtable.put(f4489c, "number");
        hashtable.put(f4491e, "string");
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
        if (intern == f4492f || intern == f4494h || intern == f4491e || intern == f4499m || intern == f4495i || intern == f4496j) {
            table = super.getTable(obj);
            if (table != null) {
                return table;
            }
            throw new LuaError("Unable to find property :" + obj + " in TextArea2 widget", 601);
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4750a(obj);
        } else {
            synchronized (this) {
                this.f4503a = null;
                table = new ii(new hz(this, obj));
                new Handler(Looper.getMainLooper()).post(table);
                table.m1406a();
                table = this.f4503a;
                this.f4503a = null;
            }
            return table;
        }
    }

    public final String getType() {
        return "TextArea";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            int intValue;
            this.f4504q = new ee(KonyMain.getActContext(), 0);
            this.f4504q.m1321e();
            Object table = super.getTable(ATTR_WIDGET_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4504q.m1309b(a);
                }
            } else {
                this.f4504q.m1309b(null);
            }
            table = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4504q.m1301a(a);
                }
            }
            LuaNil table2 = super.getTable(f4488b);
            if (table2 != LuaNil.nil) {
                if (table2 instanceof String) {
                    this.f4504q.m1303a((String) table2);
                } else {
                    this.f4504q.m1303a(table2.toString());
                }
            }
            table2 = super.getTable(f4489c);
            if (table2 != LuaNil.nil) {
                this.f4504q.m1327g(((Double) table2).intValue());
            }
            table = super.getTable(f4490d);
            if (table != LuaNil.nil) {
                m4754b(table);
            }
            table2 = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table2 != LuaNil.nil) {
                this.f4504q.m1307b(m3942a(((Boolean) table2).booleanValue()));
            }
            if (m3941K()) {
                table2 = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
                if (table2 != LuaNil.nil) {
                    intValue = ((Double) table2).intValue();
                    if (intValue > 0) {
                        table2 = super.getTable(ATTR_WIDGET_HEXPAND);
                        if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                            this.f4504q.m1304a(true);
                        }
                    }
                    table2 = super.getTable(ATTR_WIDGET_VEXPAND);
                    if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                        this.f4504q.m1312b(true);
                    }
                    table = super.getTable(ATTR_WIDGET_ALIGNMENT);
                    if (table != LuaNil.nil) {
                        m4756c(table);
                    }
                    table2 = super.getTable(ATTR_WIDGET_MARGIN);
                    if (table2 != LuaNil.nil) {
                        this.f4504q.m1305a(convertMarginsToPixels(table2, this.I));
                    }
                    table2 = super.getTable(ATTR_WIDGET_PADDING);
                    if (table2 != LuaNil.nil) {
                        this.f4504q.m1313b(convertPaddingToPixels(table2, this.I));
                    }
                    table2 = super.getTable(f4491e);
                    if (table2 != LuaNil.nil) {
                        this.f4504q.m1311b(table2.toString());
                    }
                    table = super.getTable(f4499m);
                    if (table != LuaNil.nil) {
                        a = cN.m2139a(table);
                        if (a != null) {
                            this.f4504q.m1315c(a.m1156m());
                        }
                    }
                    table2 = super.getTable(f4495i);
                    if (table2 != LuaNil.nil) {
                        this.f4506s = table2;
                        this.f4504q.setOnFocusChangeListener(this.f4509v);
                    }
                    table2 = super.getTable(f4492f);
                    if (table2 != LuaNil.nil) {
                        this.f4504q.m1331i(((Double) table2).intValue());
                    }
                    table2 = super.getTable(f4494h);
                    if (table2 != LuaNil.nil) {
                        this.f4504q.m1329h(((Double) table2).intValue());
                    }
                    table2 = super.getTable(f4502p);
                    if (table2 != LuaNil.nil) {
                        this.f4504q.m1320d(((Boolean) table2).booleanValue());
                    }
                    table2 = super.getTable(f4493g);
                    if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                        m4754b((Object) "P");
                    }
                    table2 = super.getTable(f4496j);
                    if (table2 != LuaNil.nil) {
                        this.f4505r = table2;
                        this.f4504q.m1299a(this.f4510w);
                    }
                    table2 = super.getTable(ATTR_WIDGET_SET_ENABLED);
                    if (table2 != LuaNil.nil) {
                        this.f4504q.m1317c(((Boolean) table2).booleanValue());
                    }
                    table2 = super.getTable(f4497k);
                    if (table2 != LuaNil.nil) {
                        this.f4504q.m1325f(((Double) table2).intValue());
                    }
                    table2 = super.getTable(f4498l);
                    if (table2 != LuaNil.nil) {
                        switch (((Double) table2).intValue()) {
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                this.f4504q.m1333j(51);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                                this.f4504q.m1333j(49);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                                this.f4504q.m1333j(53);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                                this.f4504q.m1333j(19);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                                this.f4504q.m1333j(17);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                                this.f4504q.m1333j(21);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                                this.f4504q.m1333j(83);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                                this.f4504q.m1333j(81);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                                this.f4504q.m1333j(85);
                                break;
                            default:
                                this.f4504q.m1333j(17);
                                break;
                        }
                    }
                    table2 = super.getTable(f4500n);
                    if (table2 != LuaNil.nil) {
                        this.f4507t = table2;
                    }
                    table2 = super.getTable(f4501o);
                    if (table2 != LuaNil.nil) {
                        this.f4508u = table2;
                    }
                    if (!((this.f4507t == null || this.f4507t == LuaNil.nil) && (this.f4508u == null || this.f4508u == LuaNil.nil)) && this.f4504q.getOnFocusChangeListener() == null) {
                        this.f4504q.setOnFocusChangeListener(this.f4511x);
                    }
                    table2 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
                    if (table2 != LuaNil.nil && (table2 instanceof LuaTable)) {
                        this.f4504q.m1316c(m3944a((LuaTable) table2, this.f4504q.m1324f()));
                    }
                    if (KonyMain.f3657e) {
                        table2 = cr.m2201a(C0339C.m2240a((Object) "inputCursorVisible"), 0);
                        if (!(table2 == null || table2 == LuaNil.nil)) {
                            this.f4504q.m1323e(((Boolean) table2).booleanValue());
                        }
                    }
                    this.E = KONY_WIDGET_RESTORE;
                    if (this.G) {
                        setWeight();
                    }
                }
            }
            intValue = 0;
            if (intValue > 0) {
                table2 = super.getTable(ATTR_WIDGET_HEXPAND);
                this.f4504q.m1304a(true);
            }
            table2 = super.getTable(ATTR_WIDGET_VEXPAND);
            this.f4504q.m1312b(true);
            table = super.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                m4756c(table);
            }
            table2 = super.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                this.f4504q.m1305a(convertMarginsToPixels(table2, this.I));
            }
            table2 = super.getTable(ATTR_WIDGET_PADDING);
            if (table2 != LuaNil.nil) {
                this.f4504q.m1313b(convertPaddingToPixels(table2, this.I));
            }
            table2 = super.getTable(f4491e);
            if (table2 != LuaNil.nil) {
                this.f4504q.m1311b(table2.toString());
            }
            table = super.getTable(f4499m);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4504q.m1315c(a.m1156m());
                }
            }
            table2 = super.getTable(f4495i);
            if (table2 != LuaNil.nil) {
                this.f4506s = table2;
                this.f4504q.setOnFocusChangeListener(this.f4509v);
            }
            table2 = super.getTable(f4492f);
            if (table2 != LuaNil.nil) {
                this.f4504q.m1331i(((Double) table2).intValue());
            }
            table2 = super.getTable(f4494h);
            if (table2 != LuaNil.nil) {
                this.f4504q.m1329h(((Double) table2).intValue());
            }
            table2 = super.getTable(f4502p);
            if (table2 != LuaNil.nil) {
                this.f4504q.m1320d(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(f4493g);
            m4754b((Object) "P");
            table2 = super.getTable(f4496j);
            if (table2 != LuaNil.nil) {
                this.f4505r = table2;
                this.f4504q.m1299a(this.f4510w);
            }
            table2 = super.getTable(ATTR_WIDGET_SET_ENABLED);
            if (table2 != LuaNil.nil) {
                this.f4504q.m1317c(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(f4497k);
            if (table2 != LuaNil.nil) {
                this.f4504q.m1325f(((Double) table2).intValue());
            }
            table2 = super.getTable(f4498l);
            if (table2 != LuaNil.nil) {
                switch (((Double) table2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f4504q.m1333j(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f4504q.m1333j(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f4504q.m1333j(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f4504q.m1333j(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f4504q.m1333j(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f4504q.m1333j(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f4504q.m1333j(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f4504q.m1333j(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f4504q.m1333j(85);
                        break;
                    default:
                        this.f4504q.m1333j(17);
                        break;
                }
            }
            table2 = super.getTable(f4500n);
            if (table2 != LuaNil.nil) {
                this.f4507t = table2;
            }
            table2 = super.getTable(f4501o);
            if (table2 != LuaNil.nil) {
                this.f4508u = table2;
            }
            this.f4504q.setOnFocusChangeListener(this.f4511x);
            table2 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            this.f4504q.m1316c(m3944a((LuaTable) table2, this.f4504q.m1324f()));
            if (KonyMain.f3657e) {
                table2 = cr.m2201a(C0339C.m2240a((Object) "inputCursorVisible"), 0);
                this.f4504q.m1323e(((Boolean) table2).booleanValue());
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
        }
        this.f4504q.m1306b();
        return this.f4504q.m1314c();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4504q.m1313b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4504q.m1305a(convertMarginsToPixels(table, this.I));
            }
            this.f4504q.m1334k();
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4504q.m1317c(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4504q.dispatchWindowFocusChanged(true);
            this.f4504q.m1330i();
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4504q.m1312b(false);
            this.f4504q.m1335k(i);
            this.f4504q.m1296a();
        }
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(obj, obj2);
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4504q.m1307b(m3942a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4504q.m1297a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4504q.m1304a(false);
            this.f4504q.m1336l(i);
            this.f4504q.m1296a();
        }
    }

    public final String toString() {
        return "LuaTextArea: " + getTable(ATTR_WIDGET_ID);
    }
}
