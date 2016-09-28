package com.konylabs.api.ui;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.ArrayList;
import java.util.Hashtable;
import ny0k.bU;
import ny0k.cN;
import ny0k.cq;

public final class gt extends LuaWidget {
    private static String f4214a;
    private static String f4215b;
    private static String f4216c;
    private static String f4217d;
    private static String f4218e;
    private static String f4219f;
    private static String f4220g;
    private static String f4221h;
    private static String f4222i;
    private static String f4223j;
    private static String f4224k;
    private bw f4225l;
    private Object[] f4226m;
    private Function f4227n;
    private bz f4228o;
    private boolean f4229p;

    static {
        f4214a = "src";
        f4215b = "base64";
        f4216c = "rawbytes";
        f4217d = "imagewhenfailed";
        f4218e = "imagewhiledownloading";
        f4219f = "referencewidth";
        f4220g = "referenceheight";
        f4221h = "ondownloadcomplete";
        f4222i = "imagescalemode";
        f4223j = "focusSrc";
        f4224k = "disablenetworkimagelrucache";
        if (KonyMain.m4057C()) {
            f4216c = "rawBytes";
            f4217d = "imageWhenFailed";
            f4218e = "imageWhileDownloading";
            f4219f = "referenceWidth";
            f4220g = "referenceHeight";
            f4221h = "onDownloadComplete";
            f4222i = "imageScaleMode";
            f4224k = "disableNetworkImageLruCache";
        }
    }

    public gt(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4225l = null;
        this.f4228o = new bz(this);
        this.f4229p = false;
        this.mBasicConfig = luaTable;
        this.mLayoutConfig = luaTable2;
        this.mPspConfig = luaTable3;
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(f4218e);
        if (table != LuaNil.nil) {
            super.setTable(f4218e, table);
        }
        table = luaTable.getTable(f4217d);
        if (table != LuaNil.nil) {
            super.setTable(f4217d, table);
        }
        table = luaTable.getTable(f4221h);
        if (table != LuaNil.nil) {
            super.setTable(f4221h, table);
        }
        table = luaTable.getTable(f4214a);
        if (table != LuaNil.nil) {
            super.setTable(f4214a, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table);
        }
        table = luaTable.getTable(f4223j);
        if (table != LuaNil.nil) {
            super.setTable(f4223j, table);
        }
        table = luaTable.getTable(LuaWidget.ATTR_WIDGET_HIGHLIGHT_ON_PARENT_FOCUS);
        if (table != LuaNil.nil) {
            super.setTable(LuaWidget.ATTR_WIDGET_HIGHLIGHT_ON_PARENT_FOCUS, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_PADDING_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table);
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
            table = luaTable2.getTable(f4219f);
            if (table != LuaNil.nil) {
                super.setTable(f4219f, table);
            }
            table = luaTable2.getTable(f4220g);
            if (table != LuaNil.nil) {
                super.setTable(f4220g, table);
            }
            table = luaTable2.getTable(f4222i);
            if (table != LuaNil.nil) {
                super.setTable(f4222i, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGNMENT, table);
            }
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(f4224k);
            if (table != LuaNil.nil) {
                super.setTable(f4224k, table);
            }
        }
    }

    private void m4592a(int i) {
        if (i == 2) {
            this.f4225l.m961j();
        } else if (i == 3) {
            this.f4225l.m962k();
        } else if (i == 1) {
            this.f4225l.m963l();
        }
    }

    private void m4593c() {
        this.f4225l = new bw(KonyMain.getActContext());
        LuaNil table = super.getTable("downloadmode");
        if (table != LuaNil.nil) {
            this.f4225l.m930a(((Integer) table).intValue());
        }
        table = super.getTable(f4221h);
        if (table != LuaNil.nil) {
            this.f4227n = (Function) table;
            this.f4225l.m934a(this.f4228o);
        }
        m4594d();
        table = super.getTable(LuaWidget.ATTR_WIDGET_HIGHLIGHT_ON_PARENT_FOCUS);
        if (table != LuaNil.nil) {
            this.f4225l.m938a(((Boolean) table).booleanValue());
        }
        table = super.getTable(ATTR_WIDGET_ALIGNMENT);
        if (table != LuaNil.nil) {
            switch (((Double) table).intValue()) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    this.f4225l.m950d(51);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    this.f4225l.m950d(49);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                    this.f4225l.m950d(53);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                    this.f4225l.m950d(19);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                    this.f4225l.m950d(17);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                    this.f4225l.m950d(21);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                    this.f4225l.m950d(83);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                    this.f4225l.m950d(81);
                    break;
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                    this.f4225l.m950d(85);
                    break;
                default:
                    this.f4225l.m950d(17);
                    break;
            }
        }
        table = super.getTable(f4222i);
        if (table != LuaNil.nil) {
            m4592a(((Double) table).intValue());
        }
        table = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil && (table instanceof LuaTable)) {
            String a = m3943a((LuaTable) table);
            if (a == null || a.length() <= 0) {
                this.f4225l.m952e();
            } else {
                this.f4225l.m951d(a);
            }
        }
        table = super.getTable(f4224k);
        if (table != LuaNil.nil) {
            this.f4225l.m935a((Boolean) table);
        }
        this.E = KONY_WIDGET_RESTORE;
        m4595e();
    }

    private void m4594d() {
        LuaNil table = super.getTable(f4218e);
        if (table != LuaNil.nil) {
            this.f4225l.m936a(table.toString());
        }
        table = super.getTable(f4217d);
        if (table != LuaNil.nil) {
            this.f4225l.m944b(table.toString());
        }
        table = super.getTable(f4214a);
        if (table != LuaNil.nil) {
            this.f4225l.m948c(table.toString());
        } else {
            table = super.getTable(f4215b);
            if (table != LuaNil.nil) {
                this.f4225l.m954e(table.toString());
            } else {
                table = super.getTable(f4216c);
                if (table != LuaNil.nil) {
                    if (table instanceof String) {
                        this.f4225l.m933a(Uri.parse(table.toString()));
                    } else if (table instanceof cq) {
                        Object a = ((cq) table).m2197a();
                        if (a != null) {
                            if (a instanceof byte[]) {
                                this.f4225l.m940a((byte[]) a);
                            } else if (a instanceof Bitmap) {
                                this.f4225l.setImageBitmap((Bitmap) a);
                            }
                        }
                    }
                }
            }
        }
        table = super.getTable(f4223j);
        if (table != LuaNil.nil) {
            this.f4225l.m957f((String) table);
        }
        table = super.getTable(ATTR_WIDGET_MARGIN);
        if (table != LuaNil.nil) {
            this.f4225l.m941a(convertMarginsToPixels(table, this.I));
        }
        table = super.getTable(ATTR_WIDGET_PADDING);
        if (table != LuaNil.nil) {
            this.f4225l.m945b(convertPaddingToPixels(table, this.I));
        }
        table = super.getTable(f4219f);
        if (table != LuaNil.nil) {
            this.f4225l.m953e(((Double) table).intValue());
        }
        table = super.getTable(f4220g);
        if (table != LuaNil.nil) {
            this.f4225l.m956f(((Double) table).intValue());
        }
        table = super.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            this.f4225l.m931a(H, m4596a(((Boolean) table).booleanValue()));
        }
    }

    private void m4595e() {
        LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_BADGE_TEXT);
        String str = table != LuaNil.nil ? (String) table : null;
        table = super.getTable(LuaWidget.ATTR_WIDGET_BADGE_SKIN);
        String str2 = table != LuaNil.nil ? (String) table : null;
        if (str != null) {
            setBadge(str, str2);
        }
        if (this.G) {
            setWeight();
        }
    }

    protected final int m4596a(boolean z) {
        return z ? 0 : ((this.G && H == 1) || H == -1) ? 4 : 8;
    }

    protected final void m4597a(Object obj, Object obj2) {
        int i = 1;
        boolean z = false;
        bz bzVar = null;
        if (this.E != KONY_WIDGET_BACKUP) {
            if (obj == f4214a) {
                if (obj2 != LuaNil.nil) {
                    this.f4225l.m948c((String) obj2);
                } else {
                    this.f4225l.m948c(null);
                }
            } else if (obj == f4216c) {
                if (obj2 == LuaNil.nil) {
                    return;
                }
                if (obj2 instanceof String) {
                    this.f4225l.m933a(Uri.parse(obj2.toString()));
                } else if (obj2 instanceof cq) {
                    Object a = ((cq) obj2).m2197a();
                    if (a == null) {
                        return;
                    }
                    if (a instanceof byte[]) {
                        this.f4225l.m940a((byte[]) a);
                    } else if (a instanceof Bitmap) {
                        this.f4225l.setImageBitmap((Bitmap) a);
                    }
                }
            } else if (obj == f4215b) {
                if (obj2 != LuaNil.nil) {
                    this.f4225l.m954e(obj2.toString());
                }
            } else if (obj == f4220g) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4225l.m956f(((Double) obj2).intValue());
                }
            } else if (obj == f4219f) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4225l.m953e(((Double) obj2).intValue());
                }
            } else if (obj == f4222i) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    m4592a(((Double) obj2).intValue());
                }
            } else if (obj == ATTR_WIDGET_ISVISIBLE) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4225l.m931a(H, m4596a(((Boolean) obj2).booleanValue()));
                }
            } else if (obj == ATTR_WIDGET_CONTAINER_WEIGHT) {
                int i2 = obj2 != null ? 1 : 0;
                if (obj2 == LuaNil.nil) {
                    i = 0;
                }
                if ((i2 & i) != 0 && this.G) {
                    this.f4225l.m929a(((Double) obj2).floatValue() / 100.0f);
                    ((eO) this.I).m4238t();
                }
            } else if (obj == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil) {
                this.f4225l.m941a(convertMarginsToPixels(obj2, this.I));
            } else if (obj == ATTR_WIDGET_PADDING && obj2 != LuaNil.nil) {
                this.f4225l.m945b(convertPaddingToPixels(obj2, this.I));
            } else if (obj == "downloadmode") {
                this.f4225l.m930a(((Integer) obj2).intValue());
            } else if (obj == ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
                if (obj2 == null || !(obj2 instanceof LuaTable)) {
                    this.f4225l.m952e();
                    return;
                }
                String a2 = m3943a((LuaTable) obj2);
                if (a2 == null || a2.length() <= 0) {
                    this.f4225l.m952e();
                } else {
                    this.f4225l.m951d(a2);
                }
            } else if (obj == f4223j) {
                String str = (obj2 == null || obj2 == LuaNil.nil) ? null : (String) obj2;
                this.f4225l.m957f(str);
            } else if (obj == LuaWidget.ATTR_WIDGET_HIGHLIGHT_ON_PARENT_FOCUS) {
                if (!(obj2 == null || obj2 == LuaNil.nil)) {
                    z = ((Boolean) obj2).booleanValue();
                }
                this.f4225l.m938a(z);
            } else if (obj == f4221h) {
                this.f4227n = obj2 != LuaNil.nil ? (Function) obj2 : null;
                bw bwVar = this.f4225l;
                if (obj2 != LuaNil.nil) {
                    bzVar = this.f4228o;
                }
                bwVar.m934a(bzVar);
            } else if (obj == f4224k && obj2 != LuaNil.nil) {
                this.f4225l.m935a((Boolean) obj2);
            }
        }
    }

    public final bw m4598b() {
        if (this.E == KONY_WIDGET_BACKUP) {
            m4593c();
        }
        this.f4225l.m946c();
        return this.f4225l;
    }

    public final void m4599b(boolean z) {
        this.f4229p = true;
    }

    public final void cleanup() {
        if (this.f4225l != null) {
            this.f4225l.m955f();
        }
        this.f4225l = null;
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        LuaWidget gtVar = new gt(this.mBasicConfig, this.mLayoutConfig, this.mPspConfig);
        gtVar.copyProperties(this);
        gtVar.setSegUIWidgetType(bU.IMAGE2);
        LuaNil table = super.getTable(ATTR_WIDGET_ISVISIBLE);
        if (!(table == LuaNil.nil || table == null)) {
            gtVar.setVisibility(((Boolean) table).booleanValue());
        }
        gtVar.f4226m = this.f4226m;
        return gtVar;
    }

    protected final int d_() {
        return this.f4225l.getHeight();
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
        hashtable.put(f4215b, "string");
        hashtable.put(f4216c, "string");
        hashtable.put(f4214a, "string");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final String getType() {
        return "Image2";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            m4593c();
        }
        this.f4225l.m946c();
        return this.f4225l.m949d();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP && !this.f4229p) {
            this.f4225l.m958g();
            m4594d();
            m4595e();
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
            this.f4225l.m937a(str, dBVar);
        }
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4225l.setFocusableInTouchMode(true);
            this.f4225l.requestFocus();
            this.f4225l.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
        this.f4226m = objArr;
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4225l.m947c(i);
        }
    }

    public final void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        String intern = ((String) obj).intern();
        if (intern == f4214a) {
            super.setTable(f4215b, LuaNil.nil);
            super.setTable(f4216c, LuaNil.nil);
        } else if (intern == f4215b) {
            super.setTable(f4214a, LuaNil.nil);
            super.setTable(f4216c, LuaNil.nil);
        } else if (intern == f4216c) {
            super.setTable(f4214a, LuaNil.nil);
            super.setTable(f4215b, LuaNil.nil);
        }
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(intern, obj2);
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4225l.m931a(H, m4596a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4225l.m929a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
    }

    public final String toString() {
        return "LuaImage2: " + super.getTable(ATTR_WIDGET_ID);
    }
}
