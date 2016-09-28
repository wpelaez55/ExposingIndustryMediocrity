package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import ny0k.cN;

public final class ht extends LuaWidget {
    private static String f4467b;
    private static String f4468c;
    private static String f4469d;
    private static String f4470e;
    private static String f4471f;
    private static String f4472g;
    private static String f4473h;
    private static String f4474i;
    private static String f4475j;
    private static String f4476k;
    private static String f4477l;
    private static String f4478m;
    Object f4479a;
    private dZ f4480n;
    private Object f4481o;
    private Object f4482p;
    private Object f4483q;
    private Object f4484r;
    private OnFocusChangeListener f4485s;
    private TextWatcher f4486t;
    private OnFocusChangeListener f4487u;

    static {
        f4467b = "text";
        f4468c = "maxtextlength";
        f4469d = "textinputmode";
        f4470e = "placeholder";
        f4471f = "inputstyle";
        f4472g = "autocapitalize";
        f4473h = "ondone";
        f4474i = "ontextchange";
        f4475j = "placeholderskin";
        f4476k = "phcolor";
        f4477l = "onbeginediting";
        f4478m = "onendediting";
        if (KonyMain.m4057C()) {
            f4468c = "maxTextLength";
            f4469d = "textInputMode";
            ATTR_WIDGET_FOCUS_SKIN = "focusSkin";
            f4471f = "inputStyle";
            f4472g = "autoCapitalize";
            f4473h = "onDone";
            f4474i = "onTextChange";
            f4475j = "placeholderSkin";
            f4476k = "phColor";
            f4477l = "onBeginEditing";
            f4478m = "onEndEditing";
        }
    }

    public ht(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        LuaNil table;
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4480n = null;
        this.f4482p = null;
        this.f4483q = null;
        this.f4484r = null;
        this.f4479a = null;
        this.f4485s = new hv(this);
        this.f4486t = new hw(this);
        this.f4487u = new hx(this);
        if (luaTable3 != null) {
            table = luaTable3.getTable(f4470e);
            if (table != LuaNil.nil) {
                super.setTable(f4470e, table);
            }
            table = luaTable3.getTable(f4476k);
            if (table != LuaNil.nil) {
                super.setTable(f4476k, table);
            }
            table = luaTable3.getTable(f4473h);
            if (table != LuaNil.nil) {
                super.setTable(f4473h, table);
            }
            table = luaTable3.getTable(f4475j);
            if (table != LuaNil.nil) {
                super.setTable(f4475j, table);
            }
            table = luaTable3.getTable(f4477l);
            if (table != LuaNil.nil) {
                super.setTable(f4477l, table);
            }
            table = luaTable3.getTable(f4478m);
            if (table != LuaNil.nil) {
                super.setTable(f4478m, table);
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
        table = luaTable.getTable(f4467b);
        if (table != LuaNil.nil) {
            super.setTable(f4467b, table);
        }
        table = luaTable.getTable(f4468c);
        if (table != LuaNil.nil) {
            super.setTable(f4468c, table);
        }
        table = luaTable.getTable(f4469d);
        if (table != LuaNil.nil) {
            super.setTable(f4469d, table);
        } else {
            super.setTable(f4469d, "A");
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        } else {
            super.setTable(ATTR_WIDGET_ISVISIBLE, Boolean.valueOf(true));
        }
        table = luaTable.getTable(f4474i);
        if (table != LuaNil.nil) {
            super.setTable(f4474i, table);
        }
        table = luaTable.getTable(f4472g);
        if (table != LuaNil.nil) {
            super.setTable(f4472g, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_ALIGN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGN, table);
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
            table = luaTable2.getTable(ATTR_WIDGET_HEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_HEXPAND, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_VEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_VEXPAND, table);
            }
        }
        if (luaTable4 != null) {
            super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, luaTable4);
        }
    }

    private Object m4738a(Object obj) {
        String intern = ((String) obj).intern();
        if (intern == f4467b && this.E == KONY_WIDGET_RESTORE) {
            return this.f4480n.m1227e();
        }
        Object table = super.getTable(intern);
        if (table != null) {
            return table;
        }
        throw new LuaError("Unable to find property :" + intern + " in TextArea widget", 601);
    }

    private void m4739a(dB dBVar) {
        dZ dZVar = this.f4480n;
        if (dBVar == null) {
            dBVar = null;
        }
        dZVar.m1208a(dBVar);
        this.f4480n.m1231g();
    }

    private void m4741b(dB dBVar) {
        dZ dZVar = this.f4480n;
        if (dBVar == null) {
            dBVar = null;
        }
        dZVar.m1216b(dBVar);
        this.f4480n.m1231g();
    }

    private void m4742b(Object obj) {
        String intern = ((String) obj).intern();
        if (intern == "N") {
            this.f4480n.m1228e(1);
        } else if (intern == "P") {
            this.f4480n.m1228e(0);
        } else if (intern == "A") {
            this.f4480n.m1228e(2);
        }
    }

    private void m4744c(Object obj) {
        switch (((Double) obj).intValue()) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                this.f4480n.m1226d(51);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                this.f4480n.m1226d(49);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                this.f4480n.m1226d(53);
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                this.f4480n.m1226d(19);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                this.f4480n.m1226d(17);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                this.f4480n.m1226d(21);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                this.f4480n.m1226d(83);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                this.f4480n.m1226d(81);
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                this.f4480n.m1226d(85);
            default:
                this.f4480n.m1226d(17);
        }
    }

    protected final void m4747a(Object obj, Object obj2) {
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (!(intern != ATTR_WIDGET_ISVISIBLE || obj2 == null || obj2 == LuaNil.nil)) {
                this.f4480n.m1214b(m3942a(((Boolean) obj2).booleanValue()));
            }
            if (intern == f4467b) {
                String str = obj2 == LuaNil.nil ? BuildConfig.FLAVOR : obj2;
                this.f4480n.m1215b(this.f4486t);
                this.f4480n.m1210a(str);
                this.f4480n.m1206a(this.f4486t);
            } else if (intern == f4468c || intern == "length") {
                this.f4480n.m1230f(((Double) obj2).intValue());
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4741b(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4741b(r0);
                }
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4739a(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4739a(r0);
                }
            } else if (intern == f4470e) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4480n.m1218b((String) obj2);
                }
            } else if (intern == f4475j) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        this.f4480n.m1222c(r0.m1156m());
                    }
                }
            } else if (intern == f4469d) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    m4742b(obj2);
                }
            } else if (intern == ATTR_WIDGET_ALIGN) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    m4744c(obj2);
                }
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT) {
                if (obj2 != null && obj2 != LuaNil.nil && this.G) {
                    setWeight();
                    ((eO) this.I).m4238t();
                }
            } else if (intern == f4471f || intern == f4472g) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4480n.m1232g(((Double) obj2).intValue());
                }
            } else if (intern == f4473h) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4482p = obj2;
                    this.f4480n.setOnFocusChangeListener(this.f4485s);
                }
            } else if (intern == f4474i) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4481o = obj2;
                    this.f4480n.m1206a(this.f4486t);
                }
            } else if (intern != f4477l || obj2 == LuaNil.nil) {
                if (intern != f4478m || obj2 == LuaNil.nil) {
                    if (intern == ATTR_WIDGET_ACCESSIBILITY_CONFIG && obj2 != LuaNil.nil && (obj2 instanceof LuaTable)) {
                        LuaNil table = ((LuaTable) obj2).getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_HINT);
                        if (table != LuaNil.nil) {
                            this.f4480n.m1223c(table.toString());
                        }
                    }
                } else if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4484r = obj2;
                    if (this.f4480n.getOnFocusChangeListener() == null) {
                        this.f4480n.setOnFocusChangeListener(this.f4487u);
                    }
                }
            } else if (obj2 != null && obj2 != LuaNil.nil) {
                this.f4483q = obj2;
                if (this.f4480n.getOnFocusChangeListener() == null) {
                    this.f4480n.setOnFocusChangeListener(this.f4487u);
                }
            }
        }
    }

    public final void cleanup() {
        if (this.f4480n != null) {
            String e = this.f4480n.m1227e();
            if (e != null) {
                super.setTable(f4467b, e);
            } else {
                super.setTable(f4467b, LuaNil.nil);
            }
            this.f4480n.m1215b(this.f4486t);
            this.f4480n.m1229f();
            this.f4480n = null;
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
        hashtable.put(f4467b, "string");
        hashtable.put(f4468c, "number");
        hashtable.put(f4470e, "string");
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
        if (intern == f4471f || intern == f4472g || intern == f4470e || intern == f4475j || intern == f4473h || intern == f4474i) {
            table = super.getTable(obj);
            if (table != null) {
                return table;
            }
            throw new LuaError("Unable to find property:" + obj + " in TextArea widget", 601);
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4738a(obj);
        } else {
            synchronized (this) {
                this.f4479a = null;
                table = new ii(new hu(this, obj));
                new Handler(Looper.getMainLooper()).post(table);
                table.m1406a();
                table = this.f4479a;
                this.f4479a = null;
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
            this.f4480n = new dZ(KonyMain.getActContext(), false);
            this.f4480n.m1225d();
            Object table = super.getTable(ATTR_WIDGET_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4480n.m1216b(a);
                }
            } else {
                this.f4480n.m1216b(null);
            }
            table = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4480n.m1208a(a);
                }
            }
            LuaNil table2 = super.getTable(f4467b);
            if (table2 != LuaNil.nil) {
                this.f4480n.m1210a((String) table2);
            }
            table2 = super.getTable(f4468c);
            if (table2 != LuaNil.nil) {
                this.f4480n.m1230f(((Double) table2).intValue());
            }
            table = super.getTable(f4469d);
            if (table != LuaNil.nil) {
                m4742b(table);
            }
            table2 = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table2 != LuaNil.nil) {
                this.f4480n.m1214b(m3942a(((Boolean) table2).booleanValue()));
            }
            table2 = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if ((table2 != LuaNil.nil ? ((Double) table2).intValue() : 0) > 0) {
                table2 = super.getTable(ATTR_WIDGET_HEXPAND);
                if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                    this.f4480n.m1211a(true);
                }
            }
            table2 = super.getTable(ATTR_WIDGET_VEXPAND);
            if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                this.f4480n.m1219b(true);
            }
            table = super.getTable(ATTR_WIDGET_ALIGN);
            if (table != LuaNil.nil) {
                m4744c(table);
            }
            table2 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            if (table2 != LuaNil.nil && (table2 instanceof LuaTable)) {
                table2 = ((LuaTable) table2).getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_HINT);
                if (table2 != LuaNil.nil) {
                    this.f4480n.m1223c(table2.toString());
                }
            }
            table2 = super.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                this.f4480n.m1212a(convertToScreenPixels(table2, this.I, true));
            }
            table2 = super.getTable(ATTR_WIDGET_PADDING);
            if (table2 != LuaNil.nil) {
                this.f4480n.m1220b(convertToScreenPixels(table2, this.I, true));
            }
            table2 = super.getTable(f4470e);
            if (table2 != LuaNil.nil) {
                this.f4480n.m1218b(table2.toString());
            }
            table2 = super.getTable(f4476k);
            if (table2 != LuaNil.nil) {
                this.f4480n.m1222c(hp.m3351b(table2));
            }
            table2 = super.getTable(f4473h);
            if (table2 != LuaNil.nil) {
                this.f4482p = table2;
                this.f4480n.setOnFocusChangeListener(this.f4485s);
            }
            table2 = super.getTable(f4471f);
            if (table2 != LuaNil.nil) {
                this.f4480n.m1232g(((Double) table2).intValue());
            }
            table2 = super.getTable(f4474i);
            if (table2 != LuaNil.nil) {
                this.f4481o = table2;
                this.f4480n.m1206a(this.f4486t);
            }
            table2 = super.getTable(ATTR_WIDGET_SET_ENABLED);
            if (table2 != LuaNil.nil) {
                this.f4480n.m1224c(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(f4477l);
            if (table2 != LuaNil.nil) {
                this.f4483q = table2;
            }
            table2 = super.getTable(f4478m);
            if (table2 != LuaNil.nil) {
                this.f4484r = table2;
            }
            if (!((this.f4483q == null || this.f4483q == LuaNil.nil) && (this.f4484r == null || this.f4484r == LuaNil.nil)) && this.f4480n.getOnFocusChangeListener() == null) {
                this.f4480n.setOnFocusChangeListener(this.f4487u);
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
        }
        this.f4480n.m1203a();
        return this.f4480n.m1213b();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            this.f4480n.m1235j();
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4480n.m1224c(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4480n.dispatchWindowFocusChanged(true);
            this.f4480n.m1233h();
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
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
            this.f4480n.m1214b(m3942a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4480n.m1204a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
    }

    public final String toString() {
        return "LuaTextArea: " + getTable(ATTR_WIDGET_ID);
    }
}
