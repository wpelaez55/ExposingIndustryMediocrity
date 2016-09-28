package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import ny0k.bU;
import ny0k.cN;

public final class gA extends LuaWidget {
    private static String f4031b;
    private static String f4032c;
    private static String f4033d;
    Object f4034a;
    private bM f4035e;
    private boolean f4036f;
    private Object[] f4037g;
    private Object[] f4038h;

    static {
        f4031b = "contentalignment";
        f4032c = "numberoflines";
        f4033d = "textcopyable";
        if (KonyMain.m4057C()) {
            f4031b = "contentAlignment";
            f4032c = "numberOfLines";
            f4033d = "textCopyable";
        }
    }

    public gA(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4035e = null;
        this.f4036f = false;
        this.f4034a = null;
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
        table = luaTable.getTable(LuaWidget.ATTR_WIDGET_HIGHLIGHT_ON_PARENT_FOCUS);
        if (table != LuaNil.nil) {
            super.setTable(LuaWidget.ATTR_WIDGET_HIGHLIGHT_ON_PARENT_FOCUS, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_LABEL);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_LABEL, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        } else {
            super.setTable(ATTR_WIDGET_ISVISIBLE, Boolean.valueOf(true));
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGNMENT, table);
            }
            table = luaTable2.getTable(f4031b);
            if (table != LuaNil.nil) {
                super.setTable(f4031b, table);
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
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(ATTR_WIDGET_ANIMATION);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ANIMATION, table);
            }
            table = luaTable3.getTable(f4033d);
            if (table != LuaNil.nil) {
                super.setTable(f4033d, table);
            } else {
                super.setTable(f4033d, Boolean.valueOf(false));
            }
        }
    }

    private gA(Object[] objArr) {
        super(0, 9, 1.0f, false);
        this.f4035e = null;
        this.f4036f = false;
        this.f4034a = null;
        this.f4037g = objArr;
        super.setTable(ATTR_WIDGET_ID, objArr[0]);
        if (!(objArr[1] == null || objArr[1] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_SKIN, objArr[1]);
        }
        if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_LABEL, objArr[2]);
        }
        if (!(objArr[3] == null || objArr[3] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, objArr[3]);
        }
        if (!(objArr[4] == null || objArr[4] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, objArr[4]);
        }
        if (!(objArr[5] == null || objArr[5] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_HEXPAND, objArr[5]);
        }
        if (!(objArr[6] == null || objArr[6] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_VEXPAND, objArr[6]);
        }
        if (!(objArr[7] == null || objArr[7] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_ALIGNMENT, objArr[7]);
        }
        if (objArr.length > 8 && objArr[8] != null && objArr[8] != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, objArr[8]);
        }
    }

    private Object m4470a(Object obj) {
        String intern = ((String) obj).intern();
        return (intern == f4032c && this.E == KONY_WIDGET_RESTORE) ? Integer.valueOf(this.f4035e.getLineCount()) : super.getTable(intern);
    }

    private void m4471a(dB dBVar) {
        this.f4035e.m740b(dBVar);
        this.f4035e.m738b();
    }

    private void m4472b(dB dBVar) {
        this.f4035e.m732a(dBVar);
        this.f4035e.m738b();
    }

    protected final int m4473a(boolean z) {
        LuaNil table = super.getTable(ATTR_WIDGET_LABEL);
        String obj = table != LuaNil.nil ? table instanceof String ? (String) table : table.toString() : null;
        switch (H) {
            case LuaWidget.RETAIN_SPACE_UNSET /*-1*/:
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return this.G ? z ? (obj == null || obj.equals(BuildConfig.FLAVOR)) ? 4 : 0 : 4 : z ? (obj == null || obj.equals(BuildConfig.FLAVOR)) ? 8 : 0 : 8;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return z ? (obj == null || obj.equals(BuildConfig.FLAVOR)) ? 8 : 0 : 8;
            default:
                return 0;
        }
    }

    protected final void m4474a(Object obj, Object obj2) {
        boolean z = false;
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == ATTR_WIDGET_ISVISIBLE) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4035e.m730a(H, m4473a(((Boolean) obj2).booleanValue()));
                }
            } else if (intern == ATTR_WIDGET_LABEL) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f4035e.m733a(BuildConfig.FLAVOR);
                } else {
                    this.f4035e.m733a(obj2.toString());
                }
                r0 = super.getTable(ATTR_WIDGET_ISVISIBLE);
                if (r0 != LuaNil.nil) {
                    z = ((Boolean) r0).booleanValue();
                }
                if (obj2 == null || obj2 == LuaNil.nil || obj2.equals(BuildConfig.FLAVOR)) {
                    this.f4035e.m730a(H, m4473a(z));
                } else {
                    this.f4035e.m730a(H, m4473a(z));
                }
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4472b(null);
                    return;
                }
                dB a = cN.m2139a(obj2);
                if (a != null) {
                    m4472b(a);
                }
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4471a(null);
                } else {
                    m4471a(cN.m2139a(obj2));
                }
            } else if (intern == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil) {
                this.f4035e.m737a(convertMarginsToPixels(obj2, this.I));
                this.f4035e.m748d();
            } else if (intern == ATTR_WIDGET_PADDING && obj2 != LuaNil.nil) {
                this.f4035e.m743b(convertPaddingToPixels(obj2, this.I));
                this.f4035e.m748d();
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT && obj2 != LuaNil.nil && this.G) {
                setWeight();
                this.f4035e.m748d();
                ((eO) this.I).m4238t();
            } else if (intern == f4031b && obj2 != LuaNil.nil) {
                switch (((Double) obj2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f4035e.m745c(51);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f4035e.m745c(49);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f4035e.m745c(53);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f4035e.m745c(19);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f4035e.m745c(17);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f4035e.m745c(21);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f4035e.m745c(83);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f4035e.m745c(81);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f4035e.m745c(85);
                    default:
                        this.f4035e.m745c(17);
                }
            } else if (intern == ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
                if (obj2 != null && (obj2 instanceof LuaTable)) {
                    r0 = ((LuaTable) obj2).getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_HIDDEN);
                    int i = r0 != LuaNil.nil ? ((Boolean) r0).booleanValue() ? 0 : 1 : -1;
                    this.f4035e.m734a(m3944a((LuaTable) obj2, this.f4035e.getText().toString()), i);
                } else if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f4035e.m734a(BuildConfig.FLAVOR, -1);
                }
            } else if (intern == f4033d) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4035e.m747c(((Boolean) obj2).booleanValue());
                }
            } else if (intern == LuaWidget.ATTR_WIDGET_HIGHLIGHT_ON_PARENT_FOCUS) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f4035e.m752e(false);
                } else {
                    this.f4035e.m752e(((Boolean) obj2).booleanValue());
                }
                this.f4035e.m738b();
            }
        }
    }

    public final void cleanup() {
        if (this.f4035e != null) {
            this.f4035e.m754g();
        }
        this.f4035e = null;
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        LuaWidget gAVar = this.f4037g != null ? new gA(this.f4037g) : new gA(this.mBasicConfig, this.mLayoutConfig, this.mPspConfig);
        gAVar.copyProperties(this);
        gAVar.setSegUIWidgetType(bU.LABEL);
        gAVar.f4038h = this.f4038h;
        LuaNil table = super.getTable(ATTR_WIDGET_ISVISIBLE);
        if (!(table == LuaNil.nil || table == null)) {
            gAVar.setVisibility(((Boolean) table).booleanValue());
        }
        return gAVar;
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
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4470a(obj);
        }
        Object iiVar;
        synchronized (this) {
            this.f4034a = null;
            iiVar = new ii(new gB(this, obj));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
            iiVar = this.f4034a;
            this.f4034a = null;
        }
        return iiVar;
    }

    public final String getType() {
        return "Label";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            String str;
            this.f4035e = new bM(KonyMain.getActContext());
            Object table = super.getTable(ATTR_WIDGET_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4035e.m732a(a);
                }
            }
            LuaNil table2 = super.getTable(f4033d);
            if (table2 != LuaNil.nil) {
                this.f4036f = ((Boolean) table2).booleanValue();
                if (this.f4036f) {
                    this.f4035e.m747c(this.f4036f);
                }
            }
            table2 = super.getTable(ATTR_WIDGET_SET_ENABLED);
            if (table2 != LuaNil.nil) {
                this.f4035e.m750d(((Boolean) table2).booleanValue());
            }
            table = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4035e.m740b(a);
                }
            }
            table2 = super.getTable(LuaWidget.ATTR_WIDGET_HIGHLIGHT_ON_PARENT_FOCUS);
            if (table2 != LuaNil.nil) {
                this.f4035e.m752e(((Boolean) table2).booleanValue());
            }
            table2 = super.getTable(ATTR_WIDGET_LABEL);
            if (table2 != LuaNil.nil) {
                String obj = table2 instanceof String ? (String) table2 : table2.toString();
                this.f4035e.m733a(obj);
                str = obj;
            } else {
                str = null;
            }
            table2 = super.getTable(ATTR_WIDGET_ISVISIBLE);
            boolean booleanValue = table2 != LuaNil.nil ? ((Boolean) table2).booleanValue() : true;
            if (str == null || str.equals(BuildConfig.FLAVOR) || !booleanValue) {
                this.f4035e.m730a(H, m4473a(booleanValue));
            } else {
                this.f4035e.m730a(H, 0);
            }
            if (m3941K()) {
                table2 = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
                if (!(table2 == LuaNil.nil || ((Double) table2).intValue() == 0)) {
                    table2 = super.getTable(ATTR_WIDGET_HEXPAND);
                    if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                        this.f4035e.m736a(true);
                    }
                }
            }
            table2 = super.getTable(ATTR_WIDGET_VEXPAND);
            if (table2 != LuaNil.nil && ((Boolean) table2).booleanValue()) {
                this.f4035e.m742b(true);
            }
            table2 = super.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table2 != LuaNil.nil) {
                switch (((Double) table2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f4035e.m729a(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f4035e.m729a(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f4035e.m729a(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f4035e.m729a(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f4035e.m729a(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f4035e.m729a(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f4035e.m729a(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f4035e.m729a(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f4035e.m729a(85);
                        break;
                    default:
                        this.f4035e.m729a(17);
                        break;
                }
            }
            table2 = super.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                this.f4035e.m737a(convertMarginsToPixels(table2, this.I));
            }
            table2 = super.getTable(ATTR_WIDGET_PADDING);
            if (table2 != LuaNil.nil) {
                this.f4035e.m743b(convertPaddingToPixels(table2, this.I));
            }
            table2 = super.getTable(f4031b);
            if (table2 != LuaNil.nil) {
                switch (((Double) table2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f4035e.m745c(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f4035e.m745c(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f4035e.m745c(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f4035e.m745c(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f4035e.m745c(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f4035e.m745c(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f4035e.m745c(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f4035e.m745c(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f4035e.m745c(85);
                        break;
                    default:
                        this.f4035e.m745c(17);
                        break;
                }
            }
            LuaNil table3 = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            if (table3 != LuaNil.nil && (table3 instanceof LuaTable)) {
                table2 = ((LuaTable) table3).getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_HIDDEN);
                int i = table2 != LuaNil.nil ? ((Boolean) table2).booleanValue() ? 0 : 1 : -1;
                this.f4035e.m734a(m3944a((LuaTable) table3, str), i);
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
        }
        this.f4035e.m751e();
        return this.f4035e.m753f();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4035e.m743b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4035e.m737a(convertMarginsToPixels(table, this.I));
            }
            this.f4035e.m755h();
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4035e.m750d(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4035e.setFocusableInTouchMode(true);
            this.f4035e.requestFocus();
            this.f4035e.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
        this.f4038h = objArr;
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4035e.m742b(false);
            this.f4035e.setHeight(i);
            this.f4035e.m748d();
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
            LuaNil table = super.getTable(ATTR_WIDGET_LABEL);
            if (table == null || table == LuaNil.nil || table.equals(BuildConfig.FLAVOR)) {
                this.f4035e.m730a(H, m4473a(z));
            } else {
                this.f4035e.m730a(H, m4473a(z));
            }
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4035e.m728a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4035e.m736a(false);
            this.f4035e.setWidth(i);
            this.f4035e.m748d();
        }
    }

    public final String toString() {
        return "LuaLabel: " + getTable(ATTR_WIDGET_ID);
    }
}
