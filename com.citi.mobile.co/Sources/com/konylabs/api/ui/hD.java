package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.TextView.OnEditorActionListener;
import com.konylabs.android.KonyMain;
import com.konylabs.search.SearchDataAdapter;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import ny0k.cN;

public final class hD extends LuaWidget {
    private static String f4265b;
    private static String f4266c;
    private static String f4267d;
    private static String f4268e;
    private static String f4269f;
    private static String f4270g;
    private static String f4271h;
    private static String f4272i;
    private static String f4273j;
    private static String f4274k;
    private static String f4275l;
    private static String f4276m;
    private static String f4277n;
    private static String f4278o;
    private static String f4279p;
    private static String f4280q;
    private static String f4281r;
    private static String f4282s;
    private static String f4283t;
    private String f4284A;
    private TextWatcher f4285B;
    private OnEditorActionListener f4286C;
    private OnFocusChangeListener f4287D;
    Object f4288a;
    private dZ f4289u;
    private Object f4290v;
    private Object f4291w;
    private Object f4292x;
    private Object f4293y;
    private boolean f4294z;

    static {
        f4265b = "text";
        f4266c = "maxtextlength";
        f4267d = "textinputmode";
        f4268e = "securetextentry";
        f4269f = "view";
        f4270g = "autofilter";
        f4271h = "placeholder";
        f4272i = "placeholderskin";
        f4273j = "phcolor";
        f4274k = "inputstyle";
        f4275l = "ontextchange";
        f4276m = "autocapitalize";
        f4277n = "ondone";
        f4278o = "threshold";
        f4279p = "filterlist";
        f4280q = "ondismiss";
        f4281r = "onselect";
        f4282s = "onbeginediting";
        f4283t = "onendediting";
        if (KonyMain.m4057C()) {
            f4266c = "maxTextLength";
            f4267d = "textInputMode";
            f4268e = "secureTextEntry";
            ATTR_WIDGET_FOCUS_SKIN = "focusSkin";
            f4270g = "autoFilter";
            f4272i = "placeholderSkin";
            f4273j = "phColor";
            f4274k = "inputStyle";
            f4275l = "onTextChange";
            f4277n = "onDone";
            f4279p = "filterList";
            f4280q = "onDismiss";
            f4281r = "onSelect";
            f4282s = "onBeginEditing";
            f4283t = "onEndEditing";
        }
    }

    public hD(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        LuaNil table;
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4289u = null;
        this.f4291w = null;
        this.f4292x = null;
        this.f4293y = null;
        this.f4294z = false;
        this.f4284A = "textbox";
        this.f4288a = null;
        this.f4285B = new hG(this);
        this.f4286C = new hH(this);
        this.f4287D = new hI(this);
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        if (luaTable3 != null) {
            table = luaTable3.getTable(f4269f);
            if (table != LuaNil.nil) {
                super.setTable(f4269f, table);
                this.f4284A = (String) table;
            }
            table = luaTable3.getTable(f4271h);
            if (table != LuaNil.nil) {
                super.setTable(f4271h, table);
            }
            table = luaTable3.getTable(f4273j);
            if (table != LuaNil.nil) {
                super.setTable(f4273j, table);
            }
            table = luaTable3.getTable(f4274k);
            if (table != LuaNil.nil) {
                super.setTable(f4274k, table);
            }
            table = luaTable3.getTable(f4275l);
            if (table != LuaNil.nil) {
                super.setTable(f4275l, table);
            }
            table = luaTable3.getTable(f4277n);
            if (table != LuaNil.nil) {
                super.setTable(f4277n, table);
            }
            table = luaTable3.getTable(f4278o);
            if (table != LuaNil.nil) {
                super.setTable(f4278o, table);
            }
            table = luaTable3.getTable(f4279p);
            if (table != LuaNil.nil) {
                super.setTable(f4279p, table);
            }
            table = luaTable3.getTable(f4280q);
            if (table != LuaNil.nil) {
                super.setTable(f4280q, table);
            }
            table = luaTable3.getTable(f4281r);
            if (table != LuaNil.nil) {
                super.setTable(f4281r, table);
            }
            table = luaTable3.getTable(f4270g);
            if (table != LuaNil.nil) {
                super.setTable(f4270g, table);
            }
            table = luaTable.getTable(f4276m);
            if (table != LuaNil.nil) {
                luaTable3.setTable(f4276m, table);
            }
            table = luaTable3.getTable(f4282s);
            if (table != LuaNil.nil) {
                super.setTable(f4282s, table);
            }
            table = luaTable3.getTable(f4283t);
            if (table != LuaNil.nil) {
                super.setTable(f4283t, table);
            }
            if (luaTable3.getTable("depricated") != LuaNil.nil) {
                table = ((LuaTable) luaTable3.getTable("depricated")).getTable("inputmode");
                if (table != LuaNil.nil) {
                    super.setTable(f4267d, table);
                }
            }
        } else {
            Object luaTable4 = new LuaTable(0, 0);
        }
        table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, table);
        }
        table = luaTable.getTable(f4265b);
        if (table != LuaNil.nil) {
            super.setTable(f4265b, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        } else {
            super.setTable(ATTR_WIDGET_ISVISIBLE, Boolean.valueOf(true));
        }
        table = luaTable.getTable(f4266c);
        if (table != LuaNil.nil) {
            super.setTable(f4266c, table);
        }
        table = luaTable.getTable(f4267d);
        if (table != LuaNil.nil) {
            super.setTable(f4267d, table);
        } else {
            super.setTable(f4267d, "A");
        }
        table = luaTable.getTable(f4268e);
        if (table != LuaNil.nil) {
            super.setTable(f4268e, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_HEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_HEXPAND, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_VEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_VEXPAND, table);
            }
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
        }
        if (luaTable4 != null) {
            super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, luaTable4);
        }
    }

    private Object m4624a(Object obj) {
        String intern = ((String) obj).intern();
        if (intern == f4265b && this.E == KONY_WIDGET_RESTORE) {
            return this.f4289u.m1227e();
        }
        Object table = super.getTable(intern);
        if (table != null) {
            return table;
        }
        throw new LuaError("Unable to find property:" + intern + " in TextBox widget", 601);
    }

    private void m4625a(dB dBVar) {
        this.f4289u.m1208a(dBVar);
        this.f4289u.m1231g();
    }

    private void m4627b(dB dBVar) {
        this.f4289u.m1216b(dBVar);
        this.f4289u.m1231g();
    }

    protected final void m4631a(Object obj, Object obj2) {
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == f4265b) {
                intern = obj2 == LuaNil.nil ? BuildConfig.FLAVOR : obj2;
                this.f4289u.m1215b(this.f4285B);
                this.f4289u.m1210a(intern);
                this.f4289u.m1206a(this.f4285B);
            } else if (intern == f4266c || intern == "length") {
                if (obj2 != LuaNil.nil) {
                    this.f4289u.m1230f(((Double) obj2).intValue());
                }
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4625a(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4625a(r0);
                }
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4627b(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4627b(r0);
                }
            } else if (intern == f4271h) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4289u.m1218b((String) obj2);
                }
            } else if (intern == f4272i) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4289u.m1222c(((hp) obj2).m3352a().m1156m());
                }
            } else if (this.f4294z && intern == f4279p) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4289u.m1209a((LuaTable) obj2);
                }
            } else if (this.f4284A.equals("searchbox") && intern == f4279p) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    SearchDataAdapter.getInstance().setData((LuaTable) obj2);
                }
            } else if (intern == f4274k) {
                this.f4289u.m1232g(((Double) obj2).intValue());
            } else if (intern != f4282s || obj2 == LuaNil.nil) {
                if (intern != f4283t || obj2 == LuaNil.nil) {
                    if (intern == ATTR_WIDGET_ACCESSIBILITY_CONFIG && obj2 != LuaNil.nil && (obj2 instanceof LuaTable)) {
                        LuaNil table = ((LuaTable) obj2).getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_HINT);
                        if (table != LuaNil.nil) {
                            this.f4289u.m1223c(table.toString());
                        }
                    }
                } else if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4293y = obj2;
                    if (this.f4289u.getOnFocusChangeListener() == null) {
                        this.f4289u.setOnFocusChangeListener(this.f4287D);
                    }
                }
            } else if (obj2 != null && obj2 != LuaNil.nil) {
                this.f4292x = obj2;
                if (this.f4289u.getOnFocusChangeListener() == null) {
                    this.f4289u.setOnFocusChangeListener(this.f4287D);
                }
            }
        }
    }

    public final boolean m4632b() {
        return this.f4284A.equals("searchbox");
    }

    public final void cleanup() {
        if (this.f4289u != null) {
            String e = this.f4289u.m1227e();
            if (e != null) {
                super.setTable(f4265b, e);
            } else {
                super.setTable(f4265b, LuaNil.nil);
            }
            ((LuaTable) super.getTable(ATTR_WIDGET_PLATFORMSPECIFIC)).setTable(f4274k, new Double((double) this.f4289u.f1152a));
            this.f4289u.m1215b(this.f4285B);
            this.f4289u.m1229f();
            this.f4289u = null;
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
        hashtable.put(f4265b, "string");
        hashtable.put(f4266c, "number");
        hashtable.put(f4271h, "string");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        hashtable.put(f4274k, "number");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4624a(obj);
        }
        Object iiVar;
        synchronized (this) {
            this.f4288a = null;
            iiVar = new ii(new hE(this, obj));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
            iiVar = this.f4288a;
            this.f4288a = null;
        }
        return iiVar;
    }

    public final String getType() {
        return "TextBox";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            LuaNil table = super.getTable(ATTR_WIDGET_PLATFORMSPECIFIC);
            if (table != LuaNil.nil) {
                table = ((LuaTable) table).getTable(f4270g);
                if (table != LuaNil.nil) {
                    this.f4294z = ((Boolean) table).booleanValue();
                }
            }
            this.f4289u = new dZ(KonyMain.getActContext(), this.f4294z);
            this.f4289u.m1221c();
            Object table2 = super.getTable(ATTR_WIDGET_SKIN);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f4289u.m1216b(a);
                }
            } else {
                this.f4289u.m1216b(null);
            }
            table2 = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f4289u.m1208a(a);
                }
            }
            table = super.getTable(f4265b);
            if (table != LuaNil.nil) {
                this.f4289u.m1210a((String) table);
            }
            table = super.getTable(f4266c);
            if (table != LuaNil.nil) {
                this.f4289u.m1230f(((Double) table).intValue());
            }
            table = super.getTable(f4267d);
            if (table != LuaNil.nil) {
                String intern = ((String) table).intern();
                if (intern == "N") {
                    this.f4289u.m1228e(1);
                } else if (intern == "P") {
                    this.f4289u.m1228e(0);
                } else if (intern == "A") {
                    this.f4289u.m1228e(2);
                }
            }
            table = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table != LuaNil.nil) {
                this.f4289u.m1214b(m3942a(((Boolean) table).booleanValue()));
            }
            table = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if ((table != LuaNil.nil ? ((Double) table).intValue() : 0) > 0) {
                table = super.getTable(ATTR_WIDGET_HEXPAND);
                if (table != LuaNil.nil && ((Boolean) table).booleanValue()) {
                    this.f4289u.m1211a(true);
                }
            }
            table = super.getTable(ATTR_WIDGET_VEXPAND);
            if (table != LuaNil.nil && ((Boolean) table).booleanValue()) {
                this.f4289u.m1219b(true);
            }
            table = super.getTable(ATTR_WIDGET_ALIGN);
            if (table != LuaNil.nil) {
                switch (((Double) table).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f4289u.m1226d(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f4289u.m1226d(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f4289u.m1226d(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f4289u.m1226d(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f4289u.m1226d(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f4289u.m1226d(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f4289u.m1226d(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f4289u.m1226d(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f4289u.m1226d(85);
                        break;
                    default:
                        this.f4289u.m1226d(17);
                        break;
                }
            }
            table = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            if (table != LuaNil.nil && (table instanceof LuaTable)) {
                table = ((LuaTable) table).getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_HINT);
                if (table != LuaNil.nil) {
                    this.f4289u.m1223c(table.toString());
                }
            }
            table = super.getTable(f4269f);
            if (table != LuaNil.nil) {
                this.f4284A = (String) table;
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                this.f4289u.m1212a(convertToScreenPixels(table, this.I, true));
            }
            table = super.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                this.f4289u.m1220b(convertToScreenPixels(table, this.I, true));
            }
            table = super.getTable(f4271h);
            if (table != LuaNil.nil) {
                this.f4289u.m1218b(table.toString());
            }
            table = super.getTable(f4273j);
            if (table != LuaNil.nil) {
                this.f4289u.m1222c(hp.m3351b(table));
            }
            table = super.getTable(f4274k);
            if (table != LuaNil.nil) {
                this.f4289u.m1232g(((Double) table).intValue());
            }
            table = super.getTable(f4275l);
            if (table != LuaNil.nil) {
                this.f4290v = table;
                this.f4289u.m1206a(this.f4285B);
            }
            table = super.getTable(f4277n);
            if (table != LuaNil.nil) {
                this.f4291w = table;
                this.f4289u.m1207a(this.f4286C);
            }
            if (this.f4294z) {
                table = super.getTable(f4278o);
                if (table != LuaNil.nil) {
                    this.f4289u.m1205a(((Double) table).intValue());
                }
                table = super.getTable(f4279p);
                if (table != LuaNil.nil) {
                    this.f4289u.m1217b((LuaTable) table);
                }
            }
            if (this.f4284A.equals("searchbox")) {
                EditText editText = (EditText) this.f4289u.m1234i();
                if (editText != null) {
                    editText.setFocusable(false);
                    editText.setOnClickListener(new hF(this));
                }
                this.f4289u.m1218b("Seach ");
                table = super.getTable(f4279p);
                if (table != LuaNil.nil) {
                    SearchDataAdapter.getInstance().setData((LuaTable) table);
                }
                table = super.getTable(f4275l);
                if (table != LuaNil.nil) {
                    SearchDataAdapter.getInstance().setOnTextChangedCallback((Function) table);
                }
                table = super.getTable(f4277n);
                if (table != LuaNil.nil) {
                    SearchDataAdapter.getInstance().setOnDoneCallback((Function) table);
                }
                table = super.getTable(f4280q);
                if (table != LuaNil.nil) {
                    SearchDataAdapter.getInstance().setOnDismissCallback((Function) table);
                }
                table = super.getTable(f4281r);
                if (table != LuaNil.nil) {
                    SearchDataAdapter.getInstance().setOnSelectCallback((Function) table);
                }
            }
            table = super.getTable(f4282s);
            if (table != LuaNil.nil) {
                this.f4292x = table;
            }
            table = super.getTable(f4283t);
            if (table != LuaNil.nil) {
                this.f4293y = table;
            }
            if (!((this.f4292x == null || this.f4292x == LuaNil.nil) && (this.f4293y == null || this.f4293y == LuaNil.nil)) && this.f4289u.getOnFocusChangeListener() == null) {
                this.f4289u.setOnFocusChangeListener(this.f4287D);
            }
            table = super.getTable(ATTR_WIDGET_SET_ENABLED);
            if (table != LuaNil.nil) {
                this.f4289u.m1224c(((Boolean) table).booleanValue());
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
        }
        this.f4289u.m1203a();
        return this.f4289u.m1213b();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            this.f4289u.m1235j();
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4289u.m1224c(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4289u.dispatchWindowFocusChanged(true);
            this.f4289u.m1233h();
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
        if (((String) obj).intern() == f4279p) {
            ((LuaTable) super.getTable(ATTR_WIDGET_PLATFORMSPECIFIC)).setTable(obj, obj2);
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4289u.m1214b(m3942a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4289u.m1204a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
    }
}
