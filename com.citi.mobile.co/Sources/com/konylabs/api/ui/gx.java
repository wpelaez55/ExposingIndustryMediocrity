package com.konylabs.api.ui;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import ny0k.cN;
import ny0k.cr;

public final class gx extends LuaWidget {
    private static String f4250b;
    private static String f4251c;
    private static String f4252d;
    private static String f4253e;
    private static String f4254f;
    private static String f4255g;
    private static String f4256h;
    private static String f4257i;
    private static String f4258j;
    private static String f4259k;
    Object f4260a;
    private bG f4261l;
    private Vector f4262m;
    private String f4263n;
    private OnClickListener f4264o;

    static {
        f4250b = "data";
        f4251c = "onselection";
        f4252d = "selecteditem";
        f4253e = "selectedindex";
        f4254f = "referencewidth";
        f4255g = "referenceheight";
        f4256h = "imagescalemode";
        f4257i = "imagewhiledownloading";
        f4258j = "imagewhenfailed";
        f4259k = "spacebetweenimages";
        if (KonyMain.m4057C()) {
            f4251c = "onSelection";
            f4252d = "selectedItem";
            f4253e = "selectedIndex";
            f4254f = "referenceWidth";
            f4255g = "referenceHeight";
            f4256h = "imageScaleMode";
            f4257i = "imageWhileDownloading";
            f4258j = "imageWhenFailed";
            f4259k = "spaceBetweenImages";
        }
    }

    public gx(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4261l = null;
        this.f4262m = new Vector();
        this.f4260a = null;
        this.f4264o = new gz(this);
        super.setTable(ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(f4253e);
        if (table != LuaNil.nil) {
            super.setTable(f4253e, table);
        }
        table = luaTable.getTable(f4252d);
        if (table != LuaNil.nil) {
            super.setTable(f4252d, table);
        }
        table = luaTable.getTable(f4257i);
        if (table != LuaNil.nil) {
            super.setTable(f4257i, table);
        }
        table = luaTable.getTable(f4258j);
        if (table != LuaNil.nil) {
            super.setTable(f4258j, table);
        }
        table = luaTable.getTable(f4250b);
        if (table != LuaNil.nil) {
            LuaTable luaTable4 = (LuaTable) table;
            m4611a(((LuaTable) luaTable4.list.elementAt(0)).list, (String) luaTable4.list.elementAt(1));
        }
        table = luaTable.getTable(f4259k);
        if (table != LuaNil.nil) {
            super.setTable(f4259k, table);
        }
        table = luaTable.getTable(f4251c);
        if (table != LuaNil.nil) {
            super.setTable(f4251c, table);
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
            table = luaTable2.getTable(f4254f);
            if (table != LuaNil.nil) {
                super.setTable(f4254f, table);
            }
            table = luaTable2.getTable(f4255g);
            if (table != LuaNil.nil) {
                super.setTable(f4255g, table);
            }
            table = luaTable2.getTable(f4256h);
            if (table != LuaNil.nil) {
                super.setTable(f4256h, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, table);
            }
        }
    }

    private Object m4610a(Object obj) {
        if (this.E == KONY_WIDGET_RESTORE) {
            obj = ((String) obj).intern();
            if (obj == f4252d) {
                return m4613d();
            }
            if (obj == f4253e) {
                int a = cr.m2199a(this.f4261l.m719f(), 1);
                return a == -1 ? LuaNil.nil : new Double((double) a);
            }
        }
        return super.getTable(obj);
    }

    private void m4611a(Vector vector, String str) {
        this.f4262m.clear();
        this.f4263n = str;
        for (int i = 0; i < vector.size(); i++) {
            this.f4262m.add((LuaTable) vector.elementAt(i));
        }
    }

    private LuaTable m4613d() {
        int f = this.f4261l.m719f();
        return f == -1 ? null : (LuaTable) this.f4262m.elementAt(f);
    }

    private void m4614e() {
        m4615f();
        for (int i = 0; i < this.f4262m.size(); i++) {
            this.f4261l.m714c(((LuaTable) this.f4262m.elementAt(i)).map.get(this.f4263n).toString());
        }
        this.f4261l.m706b();
    }

    private void m4615f() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4261l.m698a();
            this.f4261l.m706b();
        }
    }

    public final void m4616a(int i) {
        int a = cr.m2199a(i, 0);
        this.f4262m.removeElementAt(a);
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4261l.m707b(a);
            this.f4261l.m706b();
        }
    }

    protected final void m4617a(Object obj, Object obj2) {
        int i = 1;
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            dB a;
            if (intern == ATTR_WIDGET_SKIN) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    a = cN.m2139a(obj2);
                    if (a != null) {
                        this.f4261l.m708b(a);
                        this.f4261l.m712c();
                        this.f4261l.m713c(bA.f637c);
                    }
                }
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    a = cN.m2139a(obj2);
                    if (a != null) {
                        this.f4261l.m702a(a);
                        this.f4261l.m712c();
                        this.f4261l.m713c(0);
                    }
                }
            } else if (intern == f4253e) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4261l.m718e(cr.m2199a(((Double) obj2).intValue(), 0));
                }
            } else if (intern == ATTR_WIDGET_ISVISIBLE) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4261l.m700a(m3942a(((Boolean) obj2).booleanValue()));
                }
            } else if (intern == f4250b) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4615f();
                } else {
                    m4614e();
                }
            } else if (intern == f4254f) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4261l.m720f(((Double) obj2).intValue());
                }
            } else if (intern == f4255g) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4261l.m721g(((Double) obj2).intValue());
                }
            } else if (intern == f4256h) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.f4261l.m722h(((Double) obj2).intValue());
                }
            } else if (intern == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil) {
                this.f4261l.m705a(convertMarginsToPixels(obj2, this.I));
                this.f4261l.m715d();
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT) {
                int i2 = obj2 != null ? 1 : 0;
                if (obj2 == LuaNil.nil) {
                    i = 0;
                }
                if ((i2 & i) != 0 && this.G) {
                    this.f4261l.m699a(((Double) obj2).floatValue() / 100.0f);
                    ((eO) this.I).m4238t();
                }
            }
        }
    }

    public final void m4618a(Object[] objArr) {
        if (objArr[1] != LuaNil.nil) {
            if (objArr[2] != LuaNil.nil) {
                Vector vector = ((LuaTable) objArr[1]).list;
                this.f4263n = objArr[2].toString();
                for (int i = 0; i < vector.size(); i++) {
                    LuaTable luaTable = (LuaTable) vector.elementAt(i);
                    this.f4262m.add(luaTable);
                    if (this.E == KONY_WIDGET_RESTORE) {
                        this.f4261l.m714c(luaTable.map.get(this.f4263n).toString());
                    }
                }
                if (this.E == KONY_WIDGET_RESTORE) {
                    this.f4261l.m706b();
                }
            } else if (KonyMain.f3659g) {
                Log.e("LuaImageGallary", "addAll: image_url_key not specified");
            }
        }
    }

    public final void m4619b() {
        this.f4262m.clear();
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4261l.m698a();
            this.f4261l.m706b();
        }
    }

    public final void m4620b(Object[] objArr) {
        if (this.f4262m.size() > 0) {
            if (objArr[1] == LuaNil.nil) {
                if (KonyMain.f3659g) {
                    Log.e("LuaImageGallary", "setDataAt: image_url not specified");
                }
            } else if (objArr[2] != LuaNil.nil) {
                LuaTable luaTable = (LuaTable) objArr[1];
                int a = cr.m2199a(((Double) objArr[2]).intValue(), 0);
                if (a >= 0 && a <= this.f4262m.size() - 1) {
                    LuaNil table = luaTable.getTable(this.f4263n);
                    if (table != LuaNil.nil && !table.equals(BuildConfig.FLAVOR)) {
                        this.f4262m.setElementAt(luaTable, a);
                        if (this.E == KONY_WIDGET_RESTORE) {
                            this.f4261l.m704a((String) table, a);
                        }
                    }
                }
            } else if (KonyMain.f3659g) {
                Log.e("LuaImageGallary", "setDataAt: image_position not specified");
            }
        }
    }

    public final void m4621c(Object[] objArr) {
        if (objArr[1] == LuaNil.nil) {
            if (KonyMain.f3659g) {
                Log.e("LuaImageGallary", "setDataAt: image_url not specified");
            }
        } else if (objArr[2] != LuaNil.nil) {
            LuaTable luaTable = (LuaTable) objArr[1];
            LuaNil table = luaTable.getTable(this.f4263n);
            if (table != LuaNil.nil && !table.equals(BuildConfig.FLAVOR)) {
                int a = cr.m2199a(((Double) objArr[2]).intValue(), 0);
                if (a < 0 || a > this.f4262m.size() - 1) {
                    this.f4262m.add(luaTable);
                } else {
                    this.f4262m.add(a, luaTable);
                }
                if (this.E == KONY_WIDGET_RESTORE) {
                    this.f4261l.m710b((String) table, a);
                }
            }
        } else if (KonyMain.f3659g) {
            Log.e("LuaImageGallary", "setDataAt: image_position not specified");
        }
    }

    public final void cleanup() {
        if (this.f4261l != null) {
            Object d;
            int a = cr.m2199a(this.f4261l.m719f(), 1);
            if (a != -1) {
                super.setTable(f4253e, new Double((double) a));
                d = m4613d();
            } else {
                super.setTable(f4253e, LuaNil.nil);
                d = null;
            }
            if (d != null) {
                super.setTable(f4252d, d);
            } else {
                super.setTable(f4252d, LuaNil.nil);
            }
            this.f4261l.m698a();
            this.f4261l = null;
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
        hashtable.put(f4253e, "number");
        hashtable.put(f4252d, "table");
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (((String) obj).intern() == f4250b) {
            LuaNil luaNil = LuaNil.nil;
            if (this.f4262m.isEmpty()) {
                return luaNil;
            }
            LuaTable luaTable = new LuaTable();
            LuaTable luaTable2 = new LuaTable();
            int size = this.f4262m.size();
            for (int i = 0; i < size; i++) {
                luaTable2.list.add(this.f4262m.get(i));
            }
            luaTable.list.add(luaTable2);
            luaTable.list.add(this.f4263n);
            return luaTable;
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4610a(obj);
        } else {
            Object iiVar;
            synchronized (this) {
                this.f4260a = null;
                iiVar = new ii(new gy(this, obj));
                new Handler(Looper.getMainLooper()).post(iiVar);
                iiVar.m1406a();
                iiVar = this.f4260a;
                this.f4260a = null;
            }
            return iiVar;
        }
    }

    public final String getType() {
        return "Image Gallery";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            this.f4261l = new bG(KonyMain.getActContext());
            Object table = super.getTable(ATTR_WIDGET_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4261l.m708b(a);
                }
            }
            table = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4261l.m702a(a);
                }
            }
            if (super.getTable(f4251c) != LuaNil.nil) {
                this.f4261l.m701a(this.f4264o);
            }
            LuaNil table2 = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table2 != LuaNil.nil) {
                this.f4261l.m700a(m3942a(((Boolean) table2).booleanValue()));
            }
            table2 = super.getTable(f4253e);
            if (table2 != LuaNil.nil) {
                this.f4261l.m718e(cr.m2199a(((Double) table2).intValue(), 0));
            }
            table2 = super.getTable(f4254f);
            if (table2 != LuaNil.nil) {
                this.f4261l.m720f(((Double) table2).intValue());
            }
            table2 = super.getTable(f4255g);
            if (table2 != LuaNil.nil) {
                this.f4261l.m721g(((Double) table2).intValue());
            }
            table2 = super.getTable(f4256h);
            if (table2 != LuaNil.nil) {
                this.f4261l.m722h(((Double) table2).intValue());
            }
            table2 = super.getTable(ATTR_WIDGET_MARGIN);
            if (table2 != LuaNil.nil) {
                this.f4261l.m705a(convertMarginsToPixels(table2, this.I));
            }
            table2 = super.getTable(f4258j);
            if (table2 != LuaNil.nil) {
                this.f4261l.m703a(table2.toString());
            }
            table2 = super.getTable(f4257i);
            if (table2 != LuaNil.nil) {
                this.f4261l.m709b(table2.toString());
            }
            table2 = super.getTable(f4259k);
            if (table2 != LuaNil.nil) {
                this.f4261l.m716d(((Double) table2).intValue());
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
            m4614e();
        }
        this.f4261l.m717e();
        return this.f4261l;
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f4261l.m711b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != null && table != LuaNil.nil) {
                this.f4261l.m705a(convertMarginsToPixels(table, this.I));
            }
        }
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4261l.setFocusableInTouchMode(true);
            this.f4261l.requestFocus();
            this.f4261l.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4261l.m723i(i);
            this.f4261l.m715d();
        }
    }

    public final void setTable(Object obj, Object obj2) {
        if (((String) obj).intern() != f4250b) {
            super.setTable(obj, obj2);
        } else if (obj2 != LuaNil.nil) {
            m4611a(((LuaTable) ((LuaTable) obj2).list.elementAt(0)).list, (String) ((LuaTable) obj2).list.elementAt(1));
        } else {
            this.f4262m.clear();
        }
        if (this.E == KONY_WIDGET_RESTORE) {
            m3950d(obj, obj2);
        }
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4261l.m700a(m3942a(z));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E == KONY_WIDGET_RESTORE) {
            LuaNil table = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f4261l.m699a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4261l.m724j(i);
            this.f4261l.m715d();
        }
    }
}
