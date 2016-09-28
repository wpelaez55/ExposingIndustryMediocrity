package com.konylabs.api.ui;

import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import ny0k.bU;
import ny0k.cN;

public final class fe extends LuaWidget implements cv {
    public static String f3809a;
    private static String f3810b;
    private static String f3811c;
    private static String f3812d;
    private static String f3813e;
    private static String f3814f;
    private static String f3815g;
    private static String f3816h;
    private static String f3817i;
    private static String f3818j;
    private String f3819k;
    private String f3820l;
    private C0177F f3821m;
    private Object[] f3822n;
    private Object[] f3823o;
    private boolean f3824p;
    private OnClickListener f3825q;
    private iq f3826r;
    private eO f3827s;
    private String f3828t;

    static {
        f3810b = "pressedskin";
        f3811c = "image";
        f3809a = "onclick";
        f3812d = "normalimage";
        f3813e = "focusimage";
        f3814f = "rawbytes";
        f3815g = "contextmenu";
        f3816h = "contentalignment";
        f3817i = "displaytext";
        f3818j = "disabledskin";
        if (KonyMain.m4057C()) {
            f3810b = "pressedSkin";
            f3809a = "onClick";
            f3815g = "contextMenu";
            f3814f = "rawBytes";
            f3816h = "contentAlignment";
            f3817i = "displayText";
            f3818j = "disabledSkin";
        }
    }

    public fe(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f3819k = null;
        this.f3820l = null;
        this.f3821m = null;
        this.f3822n = null;
        this.f3825q = new ff(this);
        this.f3828t = "LuaButton";
        this.mBasicConfig = luaTable;
        this.mLayoutConfig = luaTable2;
        this.mPspConfig = luaTable3;
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_LABEL);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_LABEL, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(f3809a);
        if (table != LuaNil.nil) {
            super.setTable(f3809a, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_SET_ENABLED);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SET_ENABLED, table);
        }
        table = luaTable.getTable(f3814f);
        if (table != LuaNil.nil) {
            super.setTable(f3814f, table);
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
            table = luaTable2.getTable(f3816h);
            if (table != LuaNil.nil) {
                super.setTable(f3816h, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
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
            table = luaTable2.getTable(ATTR_WIDGET_HEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_HEXPAND, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_VEXPAND);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_VEXPAND, table);
            }
            table = luaTable2.getTable(f3817i);
            if (table != LuaNil.nil) {
                super.setTable(f3817i, table);
            }
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(f3810b);
            if (table != LuaNil.nil) {
                super.setTable(f3810b, table);
            }
            table = luaTable3.getTable(f3818j);
            if (table != LuaNil.nil) {
                super.setTable(f3818j, table);
            }
            table = luaTable3.getTable(f3815g);
            if (table != LuaNil.nil) {
                super.setTable(f3815g, table);
            }
            table = luaTable3.getTable(ATTR_WIDGET_ANIMATION);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ANIMATION, table);
            }
            table = luaTable3.getTable(ATTR_WIDGET_ANIMATION_CONFIG);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ANIMATION_CONFIG, table);
            }
            table = luaTable3.getTable(ATTR_WIDGET_ANIMATION_CALLBACKS);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ANIMATION_CALLBACKS, table);
            }
            if (luaTable3.getTable(ATTR_WIDGET_PROP_DEPRECATED) != LuaNil.nil) {
                LuaTable luaTable4 = (LuaTable) luaTable3.getTable(ATTR_WIDGET_PROP_DEPRECATED);
                LuaNil table2 = luaTable4.getTable(f3811c);
                if (table2 != LuaNil.nil) {
                    super.setTable(f3811c, table2);
                }
                table2 = luaTable4.getTable(f3812d);
                if (table2 != LuaNil.nil) {
                    super.setTable(f3812d, table2);
                }
                table = luaTable4.getTable(f3813e);
                if (table != LuaNil.nil) {
                    super.setTable(f3813e, table);
                }
            }
        }
    }

    private fe(Object[] objArr) {
        super(0, 16, 1.0f, false);
        this.f3819k = null;
        this.f3820l = null;
        this.f3821m = null;
        this.f3822n = null;
        this.f3825q = new ff(this);
        this.f3828t = "LuaButton";
        this.f3822n = objArr;
        super.setTable(ATTR_WIDGET_ID, objArr[0]);
        if (!(objArr[1] == null || objArr[1] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_SKIN, objArr[1]);
        }
        if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, objArr[2]);
        }
        if (!(objArr[3] == null || objArr[3] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_LABEL, objArr[3]);
        }
        if (!(objArr[4] == null || objArr[4] == LuaNil.nil)) {
            super.setTable(f3811c, objArr[4]);
        }
        if (!(objArr[5] == null || objArr[5] == LuaNil.nil)) {
            super.setTable(f3809a, objArr[5]);
        }
        if (!(objArr[6] == null || objArr[6] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, objArr[6]);
        }
        if (!(objArr[7] == null || objArr[7] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, objArr[7]);
        }
        if (!(objArr[8] == null || objArr[8] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_HEXPAND, objArr[8]);
        }
        if (!(objArr[9] == null || objArr[9] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_VEXPAND, objArr[9]);
        }
        if (!(objArr[10] == null || objArr[10] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_ALIGN, objArr[10]);
        }
        if (objArr.length > 11 && objArr[11] != null && objArr[11] != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, objArr[11]);
        }
    }

    private void m4271a(dB dBVar) {
        this.f3821m.m177a(dBVar);
        if (KonyMain.f3657e) {
            Log.d(this.f3828t, " isFocused = " + this.f3821m.isFocused() + " isSelected = " + this.f3821m.isSelected() + " isPressed = " + this.f3821m.isPressed());
        }
        this.f3821m.m170a();
    }

    private String m4273b() {
        LuaNil table = super.getTable(ATTR_WIDGET_LABEL);
        return table != LuaNil.nil ? table instanceof String ? (String) table : table.toString() : null;
    }

    private void m4274b(dB dBVar) {
        this.f3821m.m185b(dBVar);
        this.f3821m.m170a();
    }

    private void m4275b(LuaTable luaTable) {
        Vector vector = luaTable.list;
        if (!vector.isEmpty()) {
            Vector vector2 = new Vector();
            Iterator it = vector.iterator();
            while (it.hasNext()) {
                LuaTable luaTable2 = (LuaTable) it.next();
                try {
                    vector2.add(new cu((String) luaTable2.list.elementAt(0), (String) luaTable2.list.elementAt(1), 0, luaTable2.list.elementAt(3)));
                } catch (Exception e) {
                    if (KonyMain.f3657e) {
                        Log.d(this.f3828t, BuildConfig.FLAVOR + e.getMessage());
                    }
                    throw new LuaError("Invalid Context menu item arguments for Button widget", 605);
                }
            }
            this.f3821m.m180a(vector2);
            this.f3821m.m176a((cv) this);
        }
    }

    private void m4276c(dB dBVar) {
        this.f3821m.m195d(dBVar);
        this.f3821m.m170a();
    }

    protected final int m4277a(boolean z) {
        switch (H) {
            case LuaWidget.RETAIN_SPACE_UNSET /*-1*/:
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                if (z) {
                    String b = m4273b();
                    if ((b != null && !b.equals(BuildConfig.FLAVOR)) || super.getTable(ATTR_WIDGET_PADDING) != LuaNil.nil) {
                        return 0;
                    }
                    Object table = super.getTable(ATTR_WIDGET_SKIN);
                    if (table != LuaNil.nil) {
                        dB a = cN.m2139a(table);
                        if (!(a == null || a.m1140f() == null)) {
                            return 0;
                        }
                    }
                }
                return this.G ? 4 : 8;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return z ? (m4273b() == null || m4273b().equals(BuildConfig.FLAVOR) || super.getTable(ATTR_WIDGET_PADDING) == LuaNil.nil) ? 8 : 0 : 8;
            default:
                return 0;
        }
    }

    public final void m4278a(cu cuVar) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = (Function) cuVar.f1030i;
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("key0", cuVar.f1028g);
        obtain.setData(bundle);
        KonyMain.getActContext();
        KonyMain.m4121f().sendMessage(obtain);
    }

    protected final void m4279a(Object obj, Object obj2) {
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == ATTR_WIDGET_ISVISIBLE) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f3821m.m173a(H, m4277a(((Boolean) obj2).booleanValue()));
                }
            } else if (intern == ATTR_WIDGET_LABEL) {
                LuaNil table = super.getTable(f3817i);
                if (table == LuaNil.nil || Boolean.parseBoolean(table.toString())) {
                    if (obj2 == null || obj2 == LuaNil.nil) {
                        this.f3821m.m178a(BuildConfig.FLAVOR);
                    } else if (obj2 instanceof String) {
                        this.f3821m.m178a((String) obj2);
                    } else {
                        this.f3821m.m178a(obj2.toString());
                    }
                    table = super.getTable(ATTR_WIDGET_ISVISIBLE);
                    boolean booleanValue = table != LuaNil.nil ? ((Boolean) table).booleanValue() : false;
                    if (obj2 == null || obj2 == LuaNil.nil || obj2.equals(BuildConfig.FLAVOR)) {
                        this.f3821m.m173a(H, m4277a(booleanValue));
                        return;
                    } else {
                        this.f3821m.m173a(H, m4277a(booleanValue));
                        return;
                    }
                }
                this.f3821m.m178a(BuildConfig.FLAVOR);
            } else if (intern == f3812d) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f3820l = (String) obj2;
                    this.f3821m.m186b(this.f3820l);
                    this.f3821m.m170a();
                    if (this.f3821m.getVisibility() != 0) {
                        setVisibility(true);
                    }
                }
            } else if (intern == f3813e) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f3819k = (String) obj2;
                    this.f3821m.m192c(this.f3819k);
                    this.f3821m.m170a();
                }
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4274b(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4274b(r0);
                }
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN) {
                if (KonyMain.f3657e) {
                    Log.d(this.f3828t, "Setting the Focus Skin for Button");
                }
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4271a(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4271a(r0);
                }
            } else if (intern == f3818j) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4276c(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4276c(r0);
                }
            } else if (intern == ATTR_WIDGET_SET_ENABLED) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f3821m.m193c(((Boolean) obj2).booleanValue());
                }
            } else if (intern == f3814f) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f3821m.m175a(Uri.parse(obj2.toString()));
                    this.f3821m.m170a();
                    if (this.f3821m.getVisibility() != 0) {
                        setVisibility(true);
                    }
                }
            } else if (intern == f3815g) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    m4275b((LuaTable) obj2);
                }
            } else if (intern == f3810b) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        this.f3821m.m191c(r0);
                    }
                }
            } else if (intern == ATTR_WIDGET_MARGIN) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f3821m.m182a(convertMarginsToPixels(obj2, this.I));
                    this.f3821m.m183b();
                }
            } else if (intern == ATTR_WIDGET_PADDING) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f3821m.m188b(convertPaddingToPixels(obj2, this.I));
                    this.f3821m.m183b();
                }
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT && this.G) {
                setWeight();
                this.f3821m.m183b();
                ((eO) this.I).m4238t();
            } else if (intern == f3816h) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    switch (((Double) obj2).intValue()) {
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                            this.f3821m.m184b(51);
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                            this.f3821m.m184b(49);
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                            this.f3821m.m184b(53);
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                            this.f3821m.m184b(19);
                        case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                            this.f3821m.m184b(17);
                        case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                            this.f3821m.m184b(21);
                        case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                            this.f3821m.m184b(83);
                        case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                            this.f3821m.m184b(81);
                        case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                            this.f3821m.m184b(85);
                        default:
                            this.f3821m.m184b(17);
                    }
                }
            } else if (intern != ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
            } else {
                if (obj2 != null && (obj2 instanceof LuaTable)) {
                    this.f3821m.m196d(m3944a((LuaTable) obj2, this.f3821m.getText().toString()));
                } else if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f3821m.m196d(BuildConfig.FLAVOR);
                }
            }
        }
    }

    public final void cleanup() {
        if (this.f3821m != null) {
            this.f3821m.m197e();
            this.f3821m = null;
        }
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        LuaWidget feVar = this.f3822n != null ? new fe(this.f3822n) : new fe(this.mBasicConfig, this.mLayoutConfig, this.mPspConfig);
        feVar.copyProperties(this);
        feVar.setSegUIWidgetType(bU.BUTTON);
        LuaNil table = super.getTable(ATTR_WIDGET_ISVISIBLE);
        if (!(table == LuaNil.nil || table == null)) {
            feVar.setVisibility(((Boolean) table).booleanValue());
        }
        feVar.f3819k = this.f3819k;
        feVar.f3820l = this.f3820l;
        return feVar;
    }

    public final String getBadge() {
        LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_BADGE_TEXT);
        return table != LuaNil.nil ? (String) table : null;
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
        hashtable.put(ATTR_WIDGET_LABEL, "string");
        hashtable.put(ATTR_WIDGET_ISVISIBLE, "boolean");
        hashtable.put(ATTR_WIDGET_SET_ENABLED, "boolean");
        hashtable.put(f3812d, "string");
        hashtable.put(f3813e, "string");
        hashtable.put(f3814f, "string");
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(f3818j, "table");
        hashtable.put(f3815g, "table");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final String getType() {
        return "Button";
    }

    public final View getWidget() {
        boolean z = true;
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            String str;
            LuaNil table;
            boolean parseBoolean;
            Object table2 = super.getTable(ATTR_WIDGET_SKIN);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (!(a == null || a.m1165q())) {
                    this.f3824p = true;
                }
            }
            if (!this.f3824p || KonyMain.f3656d <= 10) {
                this.f3821m = new C0177F(KonyMain.getActContext());
            } else {
                this.f3821m = new C0177F(KonyMain.getActContext(), 0);
            }
            table2 = super.getTable(ATTR_WIDGET_SKIN);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f3821m.m185b(a);
                    if (a.m1140f() != null) {
                        str = " ";
                        table2 = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
                        if (table2 != LuaNil.nil) {
                            a = cN.m2139a(table2);
                            if (a != null) {
                                this.f3821m.m177a(a);
                            }
                        }
                        table2 = super.getTable(f3818j);
                        if (table2 != LuaNil.nil) {
                            a = cN.m2139a(table2);
                            if (a != null) {
                                this.f3821m.m195d(a);
                            }
                        }
                        table = super.getTable(f3811c);
                        if (table != LuaNil.nil) {
                            str = " ";
                            this.f3821m.m178a(BuildConfig.FLAVOR);
                            this.f3821m.m186b((String) table);
                        }
                        this.f3821m.setOnClickListener(this.f3825q);
                        table = super.getTable(ATTR_WIDGET_SET_ENABLED);
                        if (table != LuaNil.nil) {
                            this.f3821m.m193c(((Boolean) table).booleanValue());
                        }
                        if (m3941K()) {
                            table = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
                            if (!(table == LuaNil.nil || ((Double) table).intValue() == 0)) {
                                table = super.getTable(ATTR_WIDGET_HEXPAND);
                                if (table != LuaNil.nil && ((Boolean) table).booleanValue()) {
                                    this.f3821m.m181a(true);
                                }
                            }
                        }
                        table = super.getTable(ATTR_WIDGET_VEXPAND);
                        if (table != LuaNil.nil && ((Boolean) table).booleanValue()) {
                            this.f3821m.m187b(true);
                        }
                        table = super.getTable(ATTR_WIDGET_ALIGNMENT);
                        if (table != LuaNil.nil) {
                            switch (((Double) table).intValue()) {
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                    this.f3821m.m172a(51);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                                    this.f3821m.m172a(49);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                                    this.f3821m.m172a(53);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                                    this.f3821m.m172a(19);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                                    this.f3821m.m172a(17);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                                    this.f3821m.m172a(21);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                                    this.f3821m.m172a(83);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                                    this.f3821m.m172a(81);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                                    this.f3821m.m172a(85);
                                    break;
                                default:
                                    this.f3821m.m172a(17);
                                    break;
                            }
                        }
                        table = super.getTable(ATTR_WIDGET_MARGIN);
                        if (table != LuaNil.nil) {
                            this.f3821m.m182a(convertMarginsToPixels(table, this.I));
                        }
                        table = super.getTable(ATTR_WIDGET_PADDING);
                        if (table != LuaNil.nil) {
                            this.f3821m.m188b(convertPaddingToPixels(table, this.I));
                        }
                        table = super.getTable(f3817i);
                        parseBoolean = table == LuaNil.nil ? Boolean.parseBoolean(table.toString()) : true;
                        table = super.getTable(f3816h);
                        if (table != LuaNil.nil) {
                            switch (((Double) table).intValue()) {
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                    this.f3821m.m184b(51);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                                    this.f3821m.m184b(49);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                                    this.f3821m.m184b(53);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                                    this.f3821m.m184b(19);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                                    this.f3821m.m184b(17);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                                    this.f3821m.m184b(21);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                                    this.f3821m.m184b(83);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                                    this.f3821m.m184b(81);
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                                    this.f3821m.m184b(85);
                                    break;
                                default:
                                    this.f3821m.m184b(17);
                                    break;
                            }
                        }
                        table2 = super.getTable(f3810b);
                        if (table2 != LuaNil.nil) {
                            a = cN.m2139a(table2);
                            if (a != null) {
                                this.f3821m.m191c(a);
                            }
                        }
                        table = super.getTable(ATTR_WIDGET_LABEL);
                        if (table != LuaNil.nil) {
                            str = table instanceof String ? (String) table : table.toString();
                            if (parseBoolean) {
                                this.f3821m.m178a(str);
                            }
                        }
                        table = super.getTable(f3813e);
                        if (table != LuaNil.nil) {
                            this.f3819k = (String) table;
                            this.f3821m.m192c(this.f3819k);
                        }
                        table = super.getTable(f3812d);
                        if (table == LuaNil.nil) {
                            this.f3820l = (String) table;
                            this.f3821m.m186b(this.f3820l);
                            str = " ";
                        } else {
                            table = super.getTable(f3814f);
                            if (table == LuaNil.nil) {
                                this.f3821m.m175a(Uri.parse(table.toString()));
                                str = " ";
                            } else {
                                table = super.getTable(f3815g);
                                if (table != LuaNil.nil) {
                                    m4275b((LuaTable) table);
                                }
                            }
                        }
                        super.getTable(ATTR_WIDGET_SKIN);
                        table = LuaNil.nil;
                        table = super.getTable(ATTR_WIDGET_ISVISIBLE);
                        if (table != LuaNil.nil) {
                            z = ((Boolean) table).booleanValue();
                        }
                        if (str == null && !str.equals(BuildConfig.FLAVOR) && z) {
                            this.f3821m.m173a(H, 0);
                        } else {
                            this.f3821m.m173a(H, m4277a(z));
                        }
                        this.E = KONY_WIDGET_RESTORE;
                        table = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
                        if (table != LuaNil.nil && (table instanceof LuaTable)) {
                            this.f3821m.m196d(m3944a((LuaTable) table, str));
                        }
                        table = super.getTable(LuaWidget.ATTR_WIDGET_BADGE_TEXT);
                        str = table == LuaNil.nil ? (String) table : null;
                        table = super.getTable(LuaWidget.ATTR_WIDGET_BADGE_SKIN);
                        setBadge(str, table == LuaNil.nil ? (String) table : null);
                        if (this.f3823o != null) {
                            a = cN.m2139a(this.f3823o);
                            if (a != null) {
                                this.f3821m.m198e(a);
                            }
                        }
                        if (this.G) {
                            setWeight();
                        }
                    }
                }
            }
            str = null;
            table2 = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f3821m.m177a(a);
                }
            }
            table2 = super.getTable(f3818j);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f3821m.m195d(a);
                }
            }
            table = super.getTable(f3811c);
            if (table != LuaNil.nil) {
                str = " ";
                this.f3821m.m178a(BuildConfig.FLAVOR);
                this.f3821m.m186b((String) table);
            }
            this.f3821m.setOnClickListener(this.f3825q);
            table = super.getTable(ATTR_WIDGET_SET_ENABLED);
            if (table != LuaNil.nil) {
                this.f3821m.m193c(((Boolean) table).booleanValue());
            }
            if (m3941K()) {
                table = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
                table = super.getTable(ATTR_WIDGET_HEXPAND);
                this.f3821m.m181a(true);
            }
            table = super.getTable(ATTR_WIDGET_VEXPAND);
            this.f3821m.m187b(true);
            table = super.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                switch (((Double) table).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f3821m.m172a(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f3821m.m172a(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f3821m.m172a(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f3821m.m172a(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f3821m.m172a(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f3821m.m172a(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f3821m.m172a(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f3821m.m172a(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f3821m.m172a(85);
                        break;
                    default:
                        this.f3821m.m172a(17);
                        break;
                }
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                this.f3821m.m182a(convertMarginsToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                this.f3821m.m188b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(f3817i);
            if (table == LuaNil.nil) {
            }
            table = super.getTable(f3816h);
            if (table != LuaNil.nil) {
                switch (((Double) table).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f3821m.m184b(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f3821m.m184b(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f3821m.m184b(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f3821m.m184b(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f3821m.m184b(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f3821m.m184b(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f3821m.m184b(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f3821m.m184b(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f3821m.m184b(85);
                        break;
                    default:
                        this.f3821m.m184b(17);
                        break;
                }
            }
            table2 = super.getTable(f3810b);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f3821m.m191c(a);
                }
            }
            table = super.getTable(ATTR_WIDGET_LABEL);
            if (table != LuaNil.nil) {
                if (table instanceof String) {
                }
                if (parseBoolean) {
                    this.f3821m.m178a(str);
                }
            }
            table = super.getTable(f3813e);
            if (table != LuaNil.nil) {
                this.f3819k = (String) table;
                this.f3821m.m192c(this.f3819k);
            }
            table = super.getTable(f3812d);
            if (table == LuaNil.nil) {
                table = super.getTable(f3814f);
                if (table == LuaNil.nil) {
                    table = super.getTable(f3815g);
                    if (table != LuaNil.nil) {
                        m4275b((LuaTable) table);
                    }
                } else {
                    this.f3821m.m175a(Uri.parse(table.toString()));
                    str = " ";
                }
            } else {
                this.f3820l = (String) table;
                this.f3821m.m186b(this.f3820l);
                str = " ";
            }
            super.getTable(ATTR_WIDGET_SKIN);
            table = LuaNil.nil;
            table = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table != LuaNil.nil) {
                z = ((Boolean) table).booleanValue();
            }
            if (str == null) {
            }
            this.f3821m.m173a(H, m4277a(z));
            this.E = KONY_WIDGET_RESTORE;
            table = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            this.f3821m.m196d(m3944a((LuaTable) table, str));
            table = super.getTable(LuaWidget.ATTR_WIDGET_BADGE_TEXT);
            if (table == LuaNil.nil) {
            }
            table = super.getTable(LuaWidget.ATTR_WIDGET_BADGE_SKIN);
            if (table == LuaNil.nil) {
            }
            setBadge(str, table == LuaNil.nil ? (String) table : null);
            if (this.f3823o != null) {
                a = cN.m2139a(this.f3823o);
                if (a != null) {
                    this.f3821m.m198e(a);
                }
            }
            if (this.G) {
                setWeight();
            }
        }
        this.f3821m.m189c();
        return this.f3821m.m194d();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f3821m.m188b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (!(table == null || table == LuaNil.nil)) {
                this.f3821m.m182a(convertMarginsToPixels(table, this.I));
            }
            this.f3821m.m199f();
        }
    }

    public final void setBadge(String str, String str2) {
        super.setTable(LuaWidget.ATTR_WIDGET_BADGE_TEXT, str);
        super.setTable(LuaWidget.ATTR_WIDGET_BADGE_SKIN, str2);
        if (this.E == KONY_WIDGET_RESTORE) {
            dB dBVar = null;
            if (str2 != null) {
                dBVar = cN.m2145b(str2);
            }
            this.f3821m.m179a(str, dBVar);
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3821m.m193c(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3821m.setFocusableInTouchMode(true);
            this.f3821m.requestFocus();
            this.f3821m.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
        this.f3823o = objArr;
        if (objArr != null && objArr.length >= 2 && objArr[1] != LuaNil.nil && this.E == KONY_WIDGET_RESTORE) {
            dB b = cN.m2145b((String) objArr[1]);
            if (b != null) {
                this.f3821m.m198e(b);
            }
        }
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3821m.m187b(false);
            this.f3821m.setHeight(i);
            this.f3821m.m183b();
        }
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(obj, obj2);
        }
        String intern = ((String) obj).intern();
        if (intern == f3812d) {
            super.setTable(f3814f, LuaNil.nil);
        } else if (intern == f3814f) {
            super.setTable(f3812d, LuaNil.nil);
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            super.getTable(gA.ATTR_WIDGET_LABEL);
            this.f3821m.m173a(H, m4277a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f3821m.m171a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWeight(float f) {
        if (this.E != KONY_WIDGET_BACKUP && (getParent() instanceof eO) && ((eO) getParent()).f3728q == 0 && ((eO) getParent()).f3723l) {
            super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, Double.valueOf(Double.parseDouble(Float.toString(f))));
            setWeight();
            this.f3821m.m183b();
        }
    }

    public final void setWidgetInSegUIEventListener(iq iqVar, eO eOVar) {
        this.f3826r = iqVar;
        this.f3827s = eOVar;
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3821m.m181a(false);
            this.f3821m.setWidth(i);
            this.f3821m.m183b();
        }
    }

    public final String toString() {
        return "LuaButton: " + getTable(ATTR_WIDGET_ID);
    }
}
