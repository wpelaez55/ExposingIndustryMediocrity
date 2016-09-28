package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import ny0k.cN;

public final class hd extends LuaWidget {
    public static String f4369a;
    public static String f4370b;
    private static String f4371d;
    private static String f4372e;
    private static String f4373f;
    private static String f4374g;
    private static String f4375h;
    private static String f4376i;
    private static String f4377j;
    private static String f4378k;
    private static String f4379l;
    private static String f4380m;
    Object f4381c;
    private de f4382n;
    private boolean f4383o;
    private int f4384p;
    private int f4385q;
    private OnSeekBarChangeListener f4386r;

    static {
        f4371d = "selectedvalue";
        f4369a = "onslide";
        f4370b = "onselection";
        f4372e = "leftskin";
        f4373f = "rightskin";
        f4374g = "thumbimage";
        f4375h = "focusthumbimage";
        f4376i = "minlabel";
        f4377j = "maxlabel";
        f4378k = "minlabelskin";
        f4379l = "maxlabelskin";
        f4380m = "thumboffset";
        if (KonyMain.m4057C()) {
            f4371d = "selectedValue";
            f4369a = "onSlide";
            f4370b = "onSelection";
            f4372e = "leftSkin";
            f4373f = "rightSkin";
            f4374g = "thumbImage";
            f4375h = "focusThumbImage";
            f4376i = "minLabel";
            f4377j = "maxLabel";
            f4378k = "minLabelSkin";
            f4379l = "maxLabelSkin";
            f4380m = "thumbOffset";
        }
    }

    public hd(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4382n = null;
        this.f4383o = false;
        this.f4384p = 0;
        this.f4385q = 100;
        this.f4386r = new he(this);
        this.f4381c = null;
        super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable("min");
        if (table != LuaNil.nil) {
            super.setTable("min", table);
        }
        table = luaTable.getTable("max");
        if (table != LuaNil.nil) {
            super.setTable("max", table);
        }
        table = luaTable.getTable("step");
        if (table != LuaNil.nil) {
            super.setTable("step", table);
        }
        table = luaTable.getTable(f4369a);
        if (table != LuaNil.nil) {
            super.setTable(f4369a, table);
        }
        table = luaTable.getTable(f4370b);
        if (table != LuaNil.nil) {
            super.setTable(f4370b, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(f4372e);
        if (table != LuaNil.nil) {
            super.setTable(f4372e, table);
        }
        table = luaTable.getTable(f4373f);
        if (table != LuaNil.nil) {
            super.setTable(f4373f, table);
        }
        table = luaTable.getTable(f4374g);
        if (table != LuaNil.nil) {
            super.setTable(f4374g, table);
        }
        table = luaTable.getTable(f4375h);
        if (table != LuaNil.nil) {
            super.setTable(f4375h, table);
        }
        table = luaTable.getTable(f4371d);
        if (table != LuaNil.nil) {
            super.setTable(f4371d, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN_IN_PIXEL, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGNMENT, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable("thickness");
            if (table != LuaNil.nil) {
                super.setTable("thickness", table);
            }
            table = luaTable3.getTable(f4376i);
            if (table != LuaNil.nil) {
                super.setTable(f4376i, table);
            }
            table = luaTable3.getTable(f4377j);
            if (table != LuaNil.nil) {
                super.setTable(f4377j, table);
            }
            table = luaTable3.getTable(f4378k);
            if (table != LuaNil.nil) {
                super.setTable(f4378k, table);
            }
            table = luaTable3.getTable(f4379l);
            if (table != LuaNil.nil) {
                super.setTable(f4379l, table);
            }
        }
    }

    static /* synthetic */ int m4670a(hd hdVar, int i) {
        return i;
    }

    private Object m4672a(Object obj) {
        String intern = ((String) obj).intern();
        return intern == f4371d ? Integer.valueOf(this.f4382n.m1252d()) : super.getTable(intern);
    }

    protected final void m4677a(Object obj, Object obj2) {
        int i = 1;
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern != f4371d || obj2 == LuaNil.nil) {
                if (intern != f4376i || obj2 == LuaNil.nil) {
                    if (intern != f4377j || obj2 == LuaNil.nil) {
                        if (intern == f4370b && obj2 != LuaNil.nil) {
                            this.f4382n.setOnSeekBarChangeListener(this.f4386r);
                        } else if (intern == f4369a && obj2 != LuaNil.nil) {
                            this.f4382n.setOnSeekBarChangeListener(this.f4386r);
                        } else if (intern == f4372e && obj2 != LuaNil.nil) {
                            r0 = cN.m2139a(obj2);
                            if (r0 != null) {
                                this.f4382n.m1245b(r0);
                                this.f4382n.m1265i();
                            }
                        } else if (intern == f4373f && obj2 != LuaNil.nil) {
                            r0 = cN.m2139a(obj2);
                            if (r0 != null) {
                                this.f4382n.m1239a(r0);
                                this.f4382n.m1265i();
                            }
                        } else if (intern == f4374g && obj2 != LuaNil.nil) {
                            this.f4382n.m1240a(obj2.toString());
                            this.f4382n.m1265i();
                        } else if (intern == f4375h && obj2 != LuaNil.nil) {
                            this.f4382n.m1246b(obj2.toString());
                            this.f4382n.m1265i();
                        } else if (intern == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil) {
                            this.f4382n.m1242a(convertMarginsToPixels(obj2, this.I));
                            this.f4382n.m1265i();
                        } else if (intern != ATTR_WIDGET_CONTAINER_WEIGHT || obj2 == LuaNil.nil) {
                            if (intern == ATTR_WIDGET_ISVISIBLE && obj2 != LuaNil.nil) {
                                this.f4382n.m1238a(m3942a(((Boolean) obj2).booleanValue()));
                            } else if (intern == f4380m && obj2 != LuaNil.nil) {
                                this.f4382n.m1267j(((Double) obj2).intValue());
                                this.f4382n.m1265i();
                            } else if (intern == "min" && obj2 != LuaNil.nil) {
                                this.f4384p = ((Double) obj2).intValue();
                                this.f4382n.m1253d(this.f4384p);
                                this.f4382n.m1265i();
                            } else if (intern == "max" && obj2 != LuaNil.nil) {
                                this.f4385q = ((Double) obj2).intValue();
                                this.f4385q -= this.f4384p;
                                this.f4382n.m1249c(this.f4385q);
                                this.f4382n.m1265i();
                            } else if (intern == "step" && obj2 != LuaNil.nil) {
                                int intValue = ((Double) obj2).intValue();
                                if (intValue > 0) {
                                    i = intValue;
                                }
                                this.f4382n.m1244b(i);
                                this.f4382n.m1265i();
                            } else if (intern != ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
                            } else {
                                if (obj2 != null && (obj2 instanceof LuaTable)) {
                                    this.f4382n.m1258e(m3943a((LuaTable) obj2));
                                } else if (obj2 == null || obj2 == LuaNil.nil) {
                                    this.f4382n.m1258e(BuildConfig.FLAVOR);
                                }
                            }
                        } else if (this.G) {
                            setWeight();
                            this.f4382n.m1265i();
                            ((eO) this.I).m4238t();
                        }
                    } else if (this.E == KONY_WIDGET_RESTORE) {
                        this.f4382n.m1251c((String) obj2);
                    }
                } else if (this.E == KONY_WIDGET_RESTORE) {
                    this.f4382n.m1255d((String) obj2);
                }
            } else if (this.E == KONY_WIDGET_RESTORE) {
                this.f4382n.setOnSeekBarChangeListener(null);
                this.f4382n.m1257e((int) Double.parseDouble(obj2.toString()));
                this.f4382n.m1256e();
                this.f4383o = true;
                this.f4382n.setOnSeekBarChangeListener(this.f4386r);
            }
        }
    }

    public final void cleanup() {
        if (this.f4382n != null) {
            this.f4382n.m1263h();
            super.setTable(f4371d, Integer.valueOf(this.f4382n.m1252d()));
            this.f4382n = null;
        }
        this.E = KONY_WIDGET_BACKUP;
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
        hashtable.put(f4371d, "string");
        hashtable.put(f4376i, "string");
        hashtable.put(f4377j, "string");
        hashtable.put(f4380m, "double");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4672a(obj);
        }
        Object iiVar;
        synchronized (this) {
            this.f4381c = null;
            iiVar = new ii(new hf(this, obj));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
            iiVar = this.f4381c;
            this.f4381c = null;
        }
        return iiVar;
    }

    public final String getType() {
        return "Slider";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            this.f4382n = new de(KonyMain.getActContext());
            LuaNil table = super.getTable(f4376i);
            if (table != LuaNil.nil) {
                this.f4382n.m1255d(table.toString());
            }
            table = super.getTable(f4377j);
            if (table != LuaNil.nil) {
                this.f4382n.m1251c(table.toString());
            }
            Object table2 = super.getTable(f4378k);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f4382n.m1250c(a);
                }
            }
            table2 = super.getTable(f4379l);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f4382n.m1254d(a);
                }
            }
            table = super.getTable("thickness");
            if (table != LuaNil.nil) {
                this.f4382n.m1260f(((Double) table).intValue());
            }
            table = super.getTable(f4374g);
            if (table != LuaNil.nil) {
                this.f4382n.m1240a(table.toString());
            }
            table = super.getTable(f4375h);
            if (table != LuaNil.nil) {
                this.f4382n.m1246b(table.toString());
            }
            table2 = super.getTable(f4372e);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f4382n.m1245b(a);
                }
            }
            table2 = super.getTable(f4373f);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f4382n.m1239a(a);
                }
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                this.f4382n.m1242a(convertMarginsToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                this.f4382n.m1247b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(f4371d);
            if (table != LuaNil.nil) {
                this.f4382n.setOnSeekBarChangeListener(null);
                this.f4382n.m1257e((int) Double.parseDouble(table.toString()));
            }
            table = super.getTable("step");
            if (table != LuaNil.nil) {
                int intValue = ((Double) table).intValue();
                if (intValue <= 0) {
                    intValue = 1;
                }
                this.f4382n.m1244b(intValue);
            }
            table = super.getTable("min");
            if (table != LuaNil.nil) {
                this.f4384p = ((Double) table).intValue();
                this.f4382n.m1253d(this.f4384p);
            }
            table = super.getTable("max");
            if (table != LuaNil.nil) {
                this.f4385q = ((Double) table).intValue();
                this.f4385q -= this.f4384p;
                this.f4382n.m1249c(this.f4385q);
            }
            table = super.getTable("defValue");
            if (table != LuaNil.nil) {
                this.f4382n.m1257e(((Double) table).intValue());
                this.f4383o = true;
            }
            table = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table != LuaNil.nil) {
                this.f4382n.m1238a(m3942a(((Boolean) table).booleanValue()));
            }
            table = super.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                switch (((Double) table).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f4382n.m1262g(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f4382n.m1262g(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f4382n.m1262g(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f4382n.m1262g(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f4382n.m1262g(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f4382n.m1262g(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f4382n.m1262g(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f4382n.m1262g(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f4382n.m1262g(85);
                        break;
                    default:
                        this.f4382n.m1262g(17);
                        break;
                }
            }
            table = super.getTable(ATTR_WIDGET_SET_ENABLED);
            if (table != LuaNil.nil) {
                this.f4382n.m1241a(((Boolean) table).booleanValue());
            }
            table = super.getTable(f4380m);
            if (table != LuaNil.nil) {
                this.f4382n.m1267j(((Double) table).intValue());
            }
            this.f4382n.setOnSeekBarChangeListener(this.f4386r);
            table = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            if (table != LuaNil.nil && (table instanceof LuaTable)) {
                this.f4382n.m1258e(m3943a((LuaTable) table));
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
        }
        this.f4382n.m1261g();
        return this.f4382n.m1259f();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4382n.m1247b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != null && table != LuaNil.nil) {
                this.f4382n.m1242a(convertMarginsToPixels(table, this.I));
            }
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4382n.m1241a(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4382n.setFocusableInTouchMode(true);
            this.f4382n.requestFocus();
            this.f4382n.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4382n.m1264h(i);
            this.f4382n.m1265i();
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
            this.f4382n.m1238a(m3942a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4382n.m1237a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4382n.m1266i(i);
            this.f4382n.m1265i();
        }
    }
}
