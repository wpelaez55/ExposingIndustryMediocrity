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

public final class gu extends LuaWidget {
    private static String f4230c;
    private static String f4231d;
    private static String f4232e;
    private static String f4233f;
    private static String f4234g;
    private static String f4235h;
    private static String f4236i;
    private static String f4237j;
    private static String f4238k;
    private static String f4239l;
    Object f4240a;
    Object f4241b;
    private bA f4242m;
    private int f4243n;
    private int f4244o;
    private int f4245p;
    private Vector f4246q;
    private String f4247r;
    private bD f4248s;
    private OnClickListener f4249t;

    static {
        f4230c = "navigationskin";
        f4231d = "showstatus";
        f4232e = "onclick";
        f4233f = "meta";
        f4234g = "focuseditem";
        f4235h = "focusedindex";
        f4236i = "datasethandler";
        f4237j = "imagewhendownloading";
        f4238k = "imagewhenfailed";
        f4239l = "spacebetweenimages";
        if (KonyMain.m4057C()) {
            f4230c = "navigationSkin";
            f4231d = "showStatus";
            f4232e = "onClick";
            f4236i = "datasetHandler";
            f4234g = "focusedItem";
            f4235h = "focusedIndex";
            f4237j = "imageWhenDownloading";
            f4238k = "imageWhenFailed";
            f4239l = "spaceBetweenImages";
        }
    }

    public gu(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f4242m = null;
        this.f4243n = 0;
        this.f4244o = 0;
        this.f4245p = 0;
        this.f4246q = new Vector();
        this.f4241b = null;
        this.f4248s = new bD(this);
        this.f4249t = new gw(this);
        super.setTable(ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, table);
        }
        table = luaTable.getTable(f4230c);
        if (table != LuaNil.nil) {
            super.setTable(f4230c, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(f4232e);
        if (table != LuaNil.nil) {
            super.setTable(f4232e, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_MARGIN, table);
            }
            table = luaTable2.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_PADDING, table);
            }
        }
        if (luaTable3 != null) {
            table = luaTable.getTable(f4237j);
            if (table != LuaNil.nil) {
                super.setTable(f4237j, table);
            }
            table = luaTable.getTable(f4238k);
            if (table != LuaNil.nil) {
                super.setTable(f4238k, table);
            }
            table = luaTable.getTable(f4239l);
            if (table != LuaNil.nil) {
                super.setTable(f4239l, table);
            }
        }
    }

    private Object m4601a(Object obj) {
        if (this.E == KONY_WIDGET_RESTORE) {
            obj = ((String) obj).intern();
            if (obj == f4234g) {
                return m4603d();
            }
            if (obj == f4235h) {
                int a = cr.m2199a(this.f4242m.m681f(), 1);
                return a == -1 ? LuaNil.nil : new Double((double) a);
            }
        }
        return super.getTable(obj);
    }

    private LuaTable m4603d() {
        int f = this.f4242m.m681f();
        return f == -1 ? null : (LuaTable) this.f4246q.elementAt(f);
    }

    public final void m4604a(int i) {
        int a = cr.m2199a(i, 0);
        this.f4246q.removeElementAt(a);
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4242m.m670b(a);
            this.f4242m.m669b();
        }
    }

    protected final void m4605a(Object obj, Object obj2) {
        boolean z = true;
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == f4236i) {
                this.f4240a = obj2;
                this.f4242m.m663a(this.f4248s);
            } else if (intern == f4233f) {
                Vector vector = ((LuaTable) obj2).list;
                this.f4243n = ((Double) vector.elementAt(0)).intValue();
                this.f4244o = ((Double) vector.elementAt(1)).intValue();
                this.f4245p = ((Double) vector.elementAt(2)).intValue();
                this.f4242m.m667a(this.f4243n > 1);
                bA bAVar = this.f4242m;
                if (this.f4244o >= this.f4245p) {
                    z = false;
                }
                bAVar.m673b(z);
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        this.f4242m.m671b(r0);
                        this.f4242m.m675c();
                        this.f4242m.m676c(bA.f637c);
                    }
                }
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    r0 = cN.m2139a(obj2);
                    if (r0 != null) {
                        this.f4242m.m664a(r0);
                        this.f4242m.m675c();
                        this.f4242m.m676c(0);
                    }
                }
            } else if (intern == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil) {
                this.f4242m.m668a(convertMarginsToPixels(obj2, this.I));
                this.f4242m.m678d();
            }
        }
    }

    public final void m4606a(Object[] objArr) {
        if (objArr[1] != LuaNil.nil) {
            if (objArr[2] != LuaNil.nil) {
                Vector vector = ((LuaTable) objArr[1]).list;
                this.f4247r = objArr[2].toString();
                for (int i = 0; i < vector.size(); i++) {
                    LuaTable luaTable = (LuaTable) vector.elementAt(i);
                    this.f4246q.add(luaTable);
                    if (this.E == KONY_WIDGET_RESTORE) {
                        this.f4242m.m677c(luaTable.map.get(this.f4247r).toString());
                    }
                }
                if (this.E == KONY_WIDGET_RESTORE) {
                    this.f4242m.m669b();
                }
            } else if (KonyMain.f3659g) {
                Log.e("LuaImageGallary", "addAll: image_url_key not specified");
            }
        }
    }

    public final void m4607b() {
        this.f4246q.clear();
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4242m.m660a();
            this.f4242m.m669b();
        }
    }

    public final void m4608b(Object[] objArr) {
        if (this.f4246q.size() > 0) {
            if (objArr[1] == LuaNil.nil) {
                if (KonyMain.f3659g) {
                    Log.e("LuaImageGallary", "setDataAt: image_url not specified");
                }
            } else if (objArr[2] != LuaNil.nil) {
                LuaTable luaTable = (LuaTable) objArr[1];
                int a = cr.m2199a(((Double) objArr[2]).intValue(), 0);
                if (a >= 0 && a <= this.f4246q.size() - 1) {
                    LuaNil table = luaTable.getTable(this.f4247r);
                    if (table != LuaNil.nil && !table.equals(BuildConfig.FLAVOR)) {
                        this.f4246q.setElementAt(luaTable, a);
                        if (this.E == KONY_WIDGET_RESTORE) {
                            this.f4242m.m666a((String) table, a);
                        }
                    }
                }
            } else if (KonyMain.f3659g) {
                Log.e("LuaImageGallary", "setDataAt: image_position not specified");
            }
        }
    }

    public final void cleanup() {
        if (this.f4242m != null) {
            Object d;
            int a = cr.m2199a(this.f4242m.m681f(), 1);
            if (a != -1) {
                super.setTable(f4235h, new Double((double) a));
                d = m4603d();
            } else {
                super.setTable(f4235h, LuaNil.nil);
                d = null;
            }
            if (d != null) {
                super.setTable(f4234g, d);
            } else {
                super.setTable(f4234g, LuaNil.nil);
            }
            this.f4242m.m660a();
            this.f4242m = null;
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
        hashtable.put(f4235h, "number");
        hashtable.put(f4234g, "table");
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(f4233f, "table");
        hashtable.put(f4236i, "function");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return m4601a(obj);
        }
        Object iiVar;
        synchronized (this) {
            this.f4241b = null;
            iiVar = new ii(new gv(this, obj));
            new Handler(Looper.getMainLooper()).post(iiVar);
            iiVar.m1406a();
            iiVar = this.f4241b;
            this.f4241b = null;
        }
        return iiVar;
    }

    public final String getType() {
        return "Image Gallery";
    }

    public final View getWidget() {
        int i = 0;
        boolean z = true;
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            this.f4242m = new bA(KonyMain.getActContext());
            Object table = super.getTable(ATTR_WIDGET_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4242m.m671b(a);
                }
            }
            table = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table != LuaNil.nil) {
                a = cN.m2139a(table);
                if (a != null) {
                    this.f4242m.m664a(a);
                }
            }
            super.getTable(f4231d);
            LuaNil luaNil = LuaNil.nil;
            if (super.getTable(f4232e) != LuaNil.nil) {
                this.f4242m.m662a(this.f4249t);
            }
            luaNil = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (luaNil != LuaNil.nil) {
                this.f4242m.m661a(m3942a(((Boolean) luaNil).booleanValue()));
            }
            luaNil = super.getTable(ATTR_WIDGET_MARGIN);
            if (luaNil != LuaNil.nil) {
                this.f4242m.m668a(convertToScreenPixels(luaNil, this.I, true));
            }
            luaNil = super.getTable(ATTR_WIDGET_PADDING);
            if (luaNil != LuaNil.nil) {
                this.f4242m.m674b(convertToScreenPixels(luaNil, this.I, true));
            }
            luaNil = super.getTable(f4238k);
            if (luaNil != LuaNil.nil) {
                this.f4242m.m665a(luaNil.toString());
            }
            luaNil = super.getTable(f4237j);
            if (luaNil != LuaNil.nil) {
                this.f4242m.m672b(luaNil.toString());
            }
            luaNil = super.getTable(f4239l);
            if (luaNil != LuaNil.nil) {
                this.f4242m.m679d(((Double) luaNil).intValue());
            }
            if (super.getTable(f4236i) != LuaNil.nil) {
                this.f4242m.m663a(this.f4248s);
            }
            luaNil = super.getTable(f4233f);
            if (luaNil != LuaNil.nil) {
                Vector vector = ((LuaTable) luaNil).list;
                this.f4243n = ((Double) vector.elementAt(0)).intValue();
                this.f4244o = ((Double) vector.elementAt(1)).intValue();
                this.f4245p = ((Double) vector.elementAt(2)).intValue();
                this.f4242m.m667a(this.f4243n > 1);
                bA bAVar = this.f4242m;
                if (this.f4244o >= this.f4245p) {
                    z = false;
                }
                bAVar.m673b(z);
            }
            this.E = KONY_WIDGET_RESTORE;
            while (i < this.f4246q.size()) {
                this.f4242m.m677c(((LuaTable) this.f4246q.elementAt(i)).map.get(this.f4247r).toString());
                i++;
            }
            this.f4242m.m669b();
        }
        this.f4242m.m680e();
        return this.f4242m;
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
        }
    }

    public final void setEnabled(boolean z) {
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f4242m.setFocusableInTouchMode(true);
            this.f4242m.requestFocus();
            this.f4242m.setFocusableInTouchMode(false);
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
            this.f4242m.m661a(m3942a(z));
        }
    }

    public final void setWeight() {
    }

    public final void setWidth(int i) {
    }
}
