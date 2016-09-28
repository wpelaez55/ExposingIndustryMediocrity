package com.konylabs.api.ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import ny0k.bU;
import ny0k.cN;
import ny0k.cn;
import ny0k.cq;

public final class gs extends LuaWidget {
    public static String f4202a;
    private static String f4203b;
    private static String f4204c;
    private static String f4205d;
    private static String f4206e;
    private static String f4207f;
    private static String f4208g;
    private bt f4209h;
    private Object[] f4210i;
    private Object[] f4211j;
    private bv f4212k;
    private boolean f4213l;

    static {
        f4202a = "src";
        f4203b = "base64";
        f4204c = "rawbytes";
        f4205d = "imagewhenfailed";
        f4206e = "imagewhendownloading";
        f4207f = "ondownloadcomplete";
        f4208g = "scalemode";
        if (KonyMain.m4057C()) {
            f4204c = "rawBytes";
            f4205d = "imageWhenFailed";
            f4206e = "imageWhenDownloading";
            f4207f = "onDownloadComplete";
            f4208g = "scaleMode";
        }
    }

    public gs(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4209h = null;
        this.f4212k = new bv(this);
        this.f4213l = false;
        this.mBasicConfig = luaTable;
        this.mLayoutConfig = luaTable2;
        this.mPspConfig = luaTable3;
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(f4202a);
        if (table != LuaNil.nil) {
            super.setTable(f4202a, table);
        }
        if (luaTable2 != null) {
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
            table = luaTable2.getTable(ATTR_WIDGET_ALIGN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGN, table);
            }
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(f4208g);
            if (table != LuaNil.nil) {
                super.setTable(f4208g, table);
            }
            table = luaTable3.getTable(f4206e);
            if (table != LuaNil.nil) {
                super.setTable(f4206e, table);
            }
            table = luaTable3.getTable(f4205d);
            if (table != LuaNil.nil) {
                super.setTable(f4205d, table);
            }
            table = luaTable3.getTable(f4207f);
            if (table != LuaNil.nil) {
                super.setTable(f4207f, table);
            }
        }
    }

    private gs(Object[] objArr) {
        super(0, 10, 1.0f, false);
        this.f4209h = null;
        this.f4212k = new bv(this);
        this.f4213l = false;
        this.f4210i = objArr;
        super.setTable(ATTR_WIDGET_ID, objArr[0]);
        if (!(objArr[1] == null || objArr[1] == LuaNil.nil)) {
            super.setTable(f4202a, objArr[1].toString());
        }
        if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, objArr[2]);
        }
        if (!(objArr[3] == null || objArr[3] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, objArr[3]);
        }
        if (!(objArr[4] == null || objArr[4] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_HEXPAND, objArr[4]);
        }
        if (!(objArr[5] == null || objArr[5] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_VEXPAND, objArr[5]);
        }
        if (!(objArr[6] == null || objArr[6] == LuaNil.nil)) {
            super.setTable(ATTR_WIDGET_ALIGN, objArr[6]);
        }
        if (objArr.length > 7 && objArr[7] != null && objArr[7] != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_PLATFORMSPECIFIC, objArr[7]);
        }
    }

    private void m4587c() {
        this.f4209h = new bt(KonyMain.getActContext());
        LuaNil table = super.getTable(ATTR_WIDGET_MARGIN);
        if (table != LuaNil.nil) {
            this.f4209h.m900a(convertToScreenPixels(table, this.I, true));
        }
        table = super.getTable(f4208g);
        if (table != LuaNil.nil) {
            int intValue = ((Double) table).intValue();
            if (intValue == 3) {
                this.f4209h.m909c(true);
            } else if (intValue == 2) {
                this.f4209h.setAdjustViewBounds(true);
            }
        }
        table = super.getTable("downloadmode");
        if (table != LuaNil.nil) {
            this.f4209h.m891a(((Integer) table).intValue());
        }
        if (super.getTable(f4207f) != LuaNil.nil) {
            this.f4209h.m894a(this.f4212k);
        }
        table = super.getTable(f4206e);
        if (table != LuaNil.nil) {
            this.f4209h.m895a(table.toString());
        }
        table = super.getTable(f4205d);
        if (table != LuaNil.nil) {
            this.f4209h.m903b(table.toString());
        }
        table = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
        if (!(table == LuaNil.nil || ((Double) table).intValue() == 0)) {
            table = super.getTable(ATTR_WIDGET_HEXPAND);
            if (table != LuaNil.nil) {
                this.f4209h.m897a(((Boolean) table).booleanValue());
            }
        }
        table = super.getTable(ATTR_WIDGET_VEXPAND);
        if (table != LuaNil.nil) {
            this.f4209h.m904b(((Boolean) table).booleanValue());
        }
        table = super.getTable(f4202a);
        if (table != LuaNil.nil) {
            this.f4209h.m908c(table.toString());
            table.toString();
        } else {
            table = super.getTable(f4203b);
            if (table != LuaNil.nil) {
                String str = table instanceof StringBuffer ? new String((StringBuffer) table) : table instanceof String ? (String) table : null;
                this.f4209h.m912d(str);
            } else {
                table = super.getTable(f4204c);
                if (table != LuaNil.nil) {
                    if (table instanceof String) {
                        this.f4209h.m893a(Uri.parse(table.toString()));
                    } else if (table instanceof cq) {
                        byte[] bArr = (byte[]) ((cq) table).m2197a();
                        if (bArr != null) {
                            this.f4209h.m899a(bArr);
                        }
                    }
                }
            }
        }
        table = super.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            this.f4209h.m892a(H, m3942a(((Boolean) table).booleanValue()));
        }
        table = super.getTable(ATTR_WIDGET_ALIGN);
        if (table != LuaNil.nil) {
            switch (((Double) table).intValue()) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    this.f4209h.m907c(51);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    this.f4209h.m907c(49);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                    this.f4209h.m907c(53);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                    this.f4209h.m907c(19);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                    this.f4209h.m907c(17);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                    this.f4209h.m907c(21);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                    this.f4209h.m907c(83);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                    this.f4209h.m907c(81);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                    this.f4209h.m907c(85);
                    break;
                default:
                    this.f4209h.m907c(17);
                    break;
            }
        }
        table = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil && (table instanceof LuaTable)) {
            table = ((LuaTable) table).getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_HINT);
            if (table != LuaNil.nil) {
                this.f4209h.m914e(table.toString());
            }
        }
        this.E = KONY_WIDGET_RESTORE;
        table = super.getTable(LuaWidget.ATTR_WIDGET_BADGE_TEXT);
        String str2 = table != LuaNil.nil ? (String) table : null;
        table = super.getTable(LuaWidget.ATTR_WIDGET_BADGE_SKIN);
        setBadge(str2, table != LuaNil.nil ? (String) table : null);
        if (this.G) {
            setWeight();
        }
    }

    protected final void m4588a(Object obj, Object obj2) {
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == f4202a) {
                if (obj2 != LuaNil.nil) {
                    this.f4209h.m908c((String) obj2);
                } else {
                    this.f4209h.m908c(null);
                }
            } else if (intern == f4204c) {
                if (obj2 == LuaNil.nil) {
                    return;
                }
                if (obj2 instanceof String) {
                    this.f4209h.m893a(Uri.parse(obj2.toString()));
                } else if (obj2 instanceof cq) {
                    byte[] bArr = (byte[]) ((cq) obj2).m2197a();
                    if (bArr != null) {
                        this.f4209h.m899a(bArr);
                    }
                }
            } else if (intern == f4203b) {
                if (obj2 != LuaNil.nil) {
                    String str = obj2 instanceof StringBuffer ? new String((StringBuffer) obj2) : obj2 instanceof String ? (String) obj2 : null;
                    this.f4209h.m912d(str);
                }
            } else if (intern == ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
                if (obj2 != LuaNil.nil && (obj2 instanceof LuaTable)) {
                    LuaNil table = ((LuaTable) obj2).getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_HINT);
                    if (table != LuaNil.nil) {
                        this.f4209h.m914e(table.toString());
                    }
                }
            } else if (intern == "downloadmode") {
                this.f4209h.m891a(((Integer) obj2).intValue());
            }
        }
    }

    public final bt m4589b() {
        if (this.E == KONY_WIDGET_BACKUP) {
            m4587c();
        }
        this.f4209h.m906c();
        return this.f4209h;
    }

    public final void m4590b(boolean z) {
        this.f4213l = true;
    }

    public final void cleanup() {
        if (this.f4209h != null) {
            this.f4209h.m915f();
        }
        this.f4209h = null;
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        LuaWidget gsVar = this.f4210i != null ? new gs(this.f4210i) : new gs(this.mBasicConfig, this.mLayoutConfig, this.mPspConfig);
        gsVar.copyProperties(this);
        gsVar.setSegUIWidgetType(bU.IMAGE);
        LuaNil table = super.getTable(ATTR_WIDGET_ISVISIBLE);
        if (!(table == LuaNil.nil || table == null)) {
            gsVar.setVisibility(((Boolean) table).booleanValue());
        }
        gsVar.f4211j = this.f4211j;
        return gsVar;
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
        hashtable.put(f4203b, "string");
        hashtable.put(f4204c, "string");
        hashtable.put(f4202a, "string");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        String intern = ((String) obj).intern();
        if (intern != f4203b) {
            return super.getTable(intern);
        }
        if (this.E == KONY_WIDGET_RESTORE) {
            Bitmap e = this.f4209h.m913e();
            if (e != null) {
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
                return cn.m2175a(byteArrayOutputStream.toByteArray());
            }
        }
        return null;
    }

    public final String getType() {
        return "Image";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            m4587c();
        }
        this.f4209h.m906c();
        return this.f4209h.m910d();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP && !this.f4213l) {
            int i2 = 0;
            View d = this.f4209h.m910d();
            ViewGroup viewGroup = null;
            if (this.I != null) {
                viewGroup = this.I instanceof fv ? ((fv) this.I).m4456h() : this.I instanceof eO ? ((eO) this.I).m4224f() : (ViewGroup) this.I.getWidget();
                i2 = viewGroup.indexOfChild(d);
                viewGroup.removeView(d);
            }
            cleanup();
            m4587c();
            this.f4209h.m906c();
            if (viewGroup != null) {
                viewGroup.addView(this.f4209h.m910d(), i2);
            }
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
            this.f4209h.m896a(str, dBVar);
        }
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4209h.setFocusableInTouchMode(true);
            this.f4209h.requestFocus();
            this.f4209h.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
        this.f4211j = objArr;
    }

    public final void setHeight(int i) {
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(obj, obj2);
        }
        String intern = ((String) obj).intern();
        if (intern == f4203b || intern == f4204c) {
            super.setTable(f4202a, LuaNil.nil);
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4209h.m892a(H, m3942a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4209h.m890a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
    }

    public final String toString() {
        return "LuaImage: " + super.getTable(ATTR_WIDGET_ID);
    }
}
