package com.konylabs.api.ui;

import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.view.View;
import com.datavisualization.chartInterfacejson.KGLChartInterfaceJson;
import com.datavisualization.chartInterfacejson.KGLObserver;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;
import ny0k.aH;

public final class fm extends LuaWidget implements KGLObserver {
    private static int f3917h;
    private static int f3918k;
    private static int f3919l;
    private static int f3920m;
    private static String f3921n;
    private static String f3922o;
    private static String f3923p;
    private C0194X f3924a;
    private boolean f3925b;
    private Object f3926c;
    private KGLChartInterfaceJson f3927d;
    private LuaTable f3928e;
    private LuaTable f3929f;
    private LuaTable f3930g;
    private String f3931i;
    private int f3932j;

    static {
        f3917h = 0;
        f3918k = 1;
        f3919l = 2;
        f3920m = 4;
        f3921n = "chartdata";
        f3922o = "chartproperties";
        f3923p = "chartEvents";
        if (KonyMain.m4057C()) {
            f3921n = "chartData";
            f3922o = "chartProperties";
            f3923p = "chartEvents";
        }
    }

    public fm(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        LuaNil table;
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, false);
        this.f3924a = null;
        this.f3925b = true;
        this.f3932j = 0;
        this.f3928e = luaTable;
        this.f3929f = luaTable2;
        this.f3930g = luaTable3;
        if (luaTable != null) {
            super.setTable(LuaWidget.ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
            table = luaTable.getTable(ATTR_WIDGET_SKIN);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_SKIN, table);
            }
            table = luaTable.getTable(ATTR_WIDGET_LABEL);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_LABEL, table);
            }
            table = luaTable.getTable("evtCallBack");
            if (table != LuaNil.nil) {
                super.setTable("evtCallBack", table);
            }
            table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ISVISIBLE, table);
            } else {
                super.setTable(ATTR_WIDGET_ISVISIBLE, Boolean.valueOf(true));
            }
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGNMENT, table);
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
        this.f3927d = m4333b();
        if (this.f3927d == null) {
            throw new RuntimeException("Chart Engine Not Initialized");
        }
        this.f3927d.SetCallbackObject(this);
        table = super.getTable(ATTR_WIDGET_ID);
        if (table != LuaNil.nil) {
            String str = "DV" + f3917h + "_" + ((String) table);
            f3917h++;
            this.f3931i = str;
        }
        if (luaTable3 != null) {
            table = luaTable3.getTable(ATTR_WIDGET_ANIMATION);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ANIMATION, table);
            }
            table = luaTable3.getTable(f3921n);
            if (table != LuaNil.nil) {
                super.setTable(f3921n, table);
                this.f3927d.pushData(aH.m1895a((LuaTable) super.getTable(f3921n)));
            }
            table = luaTable3.getTable(f3922o);
            if (table != LuaNil.nil) {
                super.setTable(f3922o, table);
                this.f3927d.pushProperties(aH.m1895a((LuaTable) super.getTable(f3922o)));
            }
            table = luaTable3.getTable(f3923p);
            if (table != LuaNil.nil) {
                super.setTable(f3923p, table);
                this.f3927d.pushEvent(aH.m1895a((LuaTable) super.getTable(f3923p)));
            }
            this.f3927d.setMetaData("{\"nativePlatfromType\":\"android\",\"scaleFactor\":1,\"densityFactor\":" + KonyMain.getActivityContext().getResources().getDisplayMetrics().density + ",\"autoFontsize\":14,\"autoAutomation\":" + ("\"" + Environment.getExternalStorageDirectory().getAbsolutePath() + "\"") + "}");
            this.f3927d.InitChartParams();
        }
    }

    public static void m4332a(Object obj) {
        if (obj != null) {
            try {
                LuaNil luaNil = LuaNil.nil;
            } catch (Exception e) {
                System.out.print("errror:::::" + e);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.datavisualization.chartInterfacejson.KGLChartInterfaceJson m4333b() {
        /*
        r0 = "com.datavisualization.chartwidgetjson.KGLChartControllerJson";
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x000d, IllegalAccessException -> 0x0013, InstantiationException -> 0x0018 }
        r0 = r0.newInstance();	 Catch:{ ClassNotFoundException -> 0x000d, IllegalAccessException -> 0x0013, InstantiationException -> 0x0018 }
        r0 = (com.datavisualization.chartInterfacejson.KGLChartInterfaceJson) r0;	 Catch:{ ClassNotFoundException -> 0x000d, IllegalAccessException -> 0x0013, InstantiationException -> 0x0018 }
    L_0x000c:
        return r0;
    L_0x000d:
        r0 = move-exception;
        r0.printStackTrace();
    L_0x0011:
        r0 = 0;
        goto L_0x000c;
    L_0x0013:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0011;
    L_0x0018:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.ui.fm.b():com.datavisualization.chartInterfacejson.KGLChartInterfaceJson");
    }

    public final void OnEventOnPinch(String str, int i, int i2) {
        if (i == 0) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            LuaNil table = super.getTable(f3923p);
            if (table != LuaNil.nil) {
                if (((LuaTable) table).getTable("events") != LuaNil.nil) {
                    this.f3926c = ((LuaTable) ((LuaTable) table).getTable(str)).getTable("onPinch");
                } else {
                    this.f3926c = ((LuaTable) table).getTable("onPinch");
                }
                if (this.f3926c != null && this.f3926c != LuaNil.nil) {
                    obtain.obj = (Function) this.f3926c;
                    Bundle bundle = new Bundle(1);
                    Serializable luaTable = new LuaTable();
                    luaTable.map.put("widgetId", this);
                    bundle.putSerializable("key0", luaTable);
                    obtain.setData(bundle);
                    KonyMain.getActContext();
                    KonyMain.m4121f().sendMessage(obtain);
                }
            }
        }
    }

    public final void OnEventOnSwipe(String str, int i, int i2, int i3) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        LuaNil table = super.getTable(f3923p);
        if (table != LuaNil.nil) {
            if (((LuaTable) table).getTable("events") != LuaNil.nil) {
                this.f3926c = ((LuaTable) ((LuaTable) table).getTable(str)).getTable("onSwipe");
            } else {
                this.f3926c = ((LuaTable) table).getTable("onSwipe");
            }
            if (this.f3926c != null && this.f3926c != LuaNil.nil) {
                obtain.obj = (Function) this.f3926c;
                Bundle bundle = new Bundle(1);
                Serializable luaTable = new LuaTable();
                luaTable.map.put("widgetId", this);
                luaTable.map.put("gestureType", new Double(2.0d));
                luaTable.setTable("swipeDirection", new Double((double) i));
                bundle.putSerializable("key0", luaTable);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final void OnScrollDidReachBegin(String str) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        LuaNil table = super.getTable(f3923p);
        if (table != LuaNil.nil) {
            if (((LuaTable) table).getTable("events") != LuaNil.nil) {
                this.f3926c = ((LuaTable) ((LuaTable) table).getTable(str)).getTable("onScrollDidReachBegin");
            } else {
                this.f3926c = ((LuaTable) table).getTable("onScrollDidReachBegin");
            }
            if (this.f3926c != null && this.f3926c != LuaNil.nil) {
                obtain.obj = (Function) this.f3926c;
                Bundle bundle = new Bundle(1);
                Serializable luaTable = new LuaTable();
                luaTable.map.put("widgetId", this);
                bundle.putSerializable("key0", luaTable);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final void OnScrollDidReachEnd(String str) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        LuaNil table = super.getTable(f3923p);
        if (table != LuaNil.nil) {
            if (((LuaTable) table).getTable("events") != LuaNil.nil) {
                this.f3926c = ((LuaTable) ((LuaTable) table).getTable(str)).getTable("onScrollDidReachEnd");
            } else {
                this.f3926c = ((LuaTable) table).getTable("onScrollDidReachEnd");
            }
            if (this.f3926c != null && this.f3926c != LuaNil.nil) {
                obtain.obj = (Function) this.f3926c;
                Bundle bundle = new Bundle(1);
                Serializable luaTable = new LuaTable();
                luaTable.map.put("widgetId", this);
                bundle.putSerializable("key0", luaTable);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final void m4334b(Object obj) {
        if (obj != null) {
            try {
                if (obj != LuaNil.nil) {
                    this.f3927d.pushData(aH.m1895a((LuaTable) obj));
                    this.f3927d.SetData();
                }
            } catch (Exception e) {
                System.out.print("errror:::::" + e);
            }
        }
    }

    public final void m4335c(Object obj) {
        if (obj != null) {
            try {
                if (obj != LuaNil.nil) {
                    this.f3927d.AddData(aH.m1895a((LuaTable) obj));
                    this.f3927d.RequestRender();
                }
            } catch (Exception e) {
                System.out.print("errror:::::" + e);
            }
        }
    }

    public final void cleanup() {
        if (this.f3927d != null) {
            this.f3927d.stopRender();
        }
        if (this.f3924a != null) {
            this.f3924a.removeAllViews();
        }
        this.f3924a = null;
        if (this.f3927d != null) {
            this.f3927d.contextLost();
            this.f3927d.SetCallbackObject(null);
        }
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        LuaWidget fmVar = new fm(this.f3928e, this.f3929f, this.f3930g);
        fmVar.copyProperties(this);
        LuaNil table = super.getTable(ATTR_WIDGET_VISIBLE);
        if (table != LuaNil.nil || table == null) {
            fmVar.setVisibility(((Boolean) table).booleanValue());
        }
        return fmVar;
    }

    public final void m4336d(Object obj) {
        if (obj != null) {
            try {
                if (obj != LuaNil.nil) {
                    LuaNil table = ((LuaTable) obj).getTable(f3921n);
                    if (table != LuaNil.nil) {
                        super.setTable(f3921n, table);
                        this.f3927d.pushData(aH.m1895a((LuaTable) ((LuaTable) obj).getTable(f3921n)));
                    }
                    table = ((LuaTable) obj).getTable(f3922o);
                    if (table != LuaNil.nil) {
                        super.setTable(f3922o, table);
                        this.f3927d.pushProperties(aH.m1895a((LuaTable) super.getTable(f3922o)));
                    }
                    table = ((LuaTable) obj).getTable(f3923p);
                    if (table != LuaNil.nil) {
                        super.setTable(f3923p, table);
                        this.f3927d.pushEvent(aH.m1895a((LuaTable) super.getTable(f3923p)));
                    }
                }
            } catch (Exception e) {
                System.out.print("errror:::::" + e);
                return;
            }
        }
        if (this.f3924a == null) {
            this.f3927d.ReinitChartParamsWithObject();
        } else {
            this.f3927d.SetProperties();
        }
    }

    public final void m4337e(Object obj) {
        if (obj != null) {
            try {
                if (obj != LuaNil.nil) {
                    super.setTable(f3923p, obj);
                    this.f3927d.SetEvents(aH.m1895a((LuaTable) obj));
                }
            } catch (Exception e) {
            }
        }
    }

    protected final void finalize() {
        if (this.f3924a != null) {
            this.f3924a.removeAllViews();
        }
        this.f3924a = null;
        this.f3927d.cleanup();
        this.f3927d = null;
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
        return null;
    }

    public final Object getProperty(String str) {
        return null;
    }

    public final String getType() {
        return "Chart2D3D";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            if (this.f3927d == null) {
                this.f3927d = m4333b();
                if (this.f3927d == null) {
                    throw new RuntimeException("Chart Engine Not Initialized");
                }
                this.f3927d.SetCallbackObject(this);
                if (super.getTable(f3921n) != LuaNil.nil) {
                    this.f3927d.pushData(aH.m1895a((LuaTable) super.getTable(f3921n)));
                }
                if (super.getTable(f3922o) != LuaNil.nil) {
                    this.f3927d.pushProperties(aH.m1895a((LuaTable) super.getTable(f3922o)));
                }
                if (super.getTable(f3923p) != LuaNil.nil) {
                    this.f3927d.pushEvent(aH.m1895a((LuaTable) super.getTable(f3923p)));
                }
                this.f3927d.setMetaData("{\"nativePlatfromType\":\"android\",\"scaleFactor\":1,\"densityFactor\":" + KonyMain.getActivityContext().getResources().getDisplayMetrics().density + ",\"autoFontsize\":14,\"autoAutomation\":" + ("\"" + Environment.getExternalStorageDirectory().getAbsolutePath() + "\"") + "}");
                this.f3927d.InitChartParams();
            } else {
                this.f3927d.SetCallbackObject(this);
            }
            if (this.f3924a == null) {
                this.f3924a = new C0194X(KonyMain.getActContext(), this.f3927d, this.f3931i);
            }
            LuaNil table = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table != LuaNil.nil) {
                this.f3925b = ((Boolean) table).booleanValue();
                setVisibility(this.f3925b);
            }
            table = super.getTable(ATTR_WIDGET_HEXPAND);
            if (table != LuaNil.nil) {
                this.f3924a.m329a(((Boolean) table).booleanValue());
            }
            table = super.getTable(ATTR_WIDGET_VEXPAND);
            if (table != LuaNil.nil) {
                this.f3924a.m333b(((Boolean) table).booleanValue());
            }
            if (super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT) != LuaNil.nil) {
                table = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
                if (table != LuaNil.nil) {
                    float floatValue = ((Double) table).floatValue();
                    if (floatValue > 0.0f && floatValue != 100.0f) {
                        this.f3924a.m327a(floatValue / 100.0f);
                    }
                }
            }
            LuaNil table2 = super.getTable(ATTR_WIDGET_PLATFORMSPECIFIC);
            if (table2 != LuaNil.nil) {
                table = ((LuaTable) table2).getTable(ATTR_WIDGET_MARGIN);
                if (table != LuaNil.nil) {
                    this.f3924a.m330a(convertMarginsToPixels(table, this.I));
                }
                table = ((LuaTable) table2).getTable(ATTR_WIDGET_PADDING);
                if (table != LuaNil.nil) {
                    this.f3924a.m334b(convertPaddingToPixels(table, this.I));
                }
            }
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
        }
        this.f3924a.m326a();
        return this.f3924a.m331b();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f3924a.m334b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != null && table != LuaNil.nil) {
                this.f3924a.m330a(convertMarginsToPixels(table, this.I));
            }
        }
    }

    public final void invokeCallback(int i, String str, int i2, int i3, double d) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        LuaNil table = super.getTable(f3923p);
        if (table != LuaNil.nil) {
            if (((LuaTable) table).getTable("events") != LuaNil.nil) {
                LuaTable luaTable = (LuaTable) ((LuaTable) table).getTable(str);
                if (i == 1) {
                    this.f3926c = luaTable.getTable("onTap");
                } else if (i == 2) {
                    this.f3926c = luaTable.getTable("onDoubleTap");
                } else if (i == 3) {
                    this.f3926c = luaTable.getTable("onLongPress");
                }
            } else if (i == 1) {
                this.f3926c = ((LuaTable) table).getTable("onTap");
            } else if (i == 2) {
                this.f3926c = ((LuaTable) table).getTable("onDoubleTap");
            } else if (i == 3) {
                this.f3926c = ((LuaTable) table).getTable("onLongPress");
            }
            if (this.f3926c != null && this.f3926c != LuaNil.nil) {
                obtain.obj = (Function) this.f3926c;
                Bundle bundle = new Bundle(1);
                Serializable luaTable2 = new LuaTable();
                luaTable2.map.put("columnNumber", new Double((double) i2));
                luaTable2.map.put("rowNumber", new Double((double) i3));
                luaTable2.map.put("dataElement", new Double(d));
                luaTable2.map.put("widgetId", this);
                bundle.putSerializable("key0", luaTable2);
                obtain.setData(bundle);
                KonyMain.getActContext();
                KonyMain.m4121f().sendMessage(obtain);
            }
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3924a.setEnabled(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3924a.setFocusableInTouchMode(true);
            this.f3924a.requestFocus();
            this.f3924a.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
    }

    public final void setVisibility(boolean z) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        this.f3925b = z;
        if (this.f3924a != null) {
            this.f3924a.m332b(m3942a(this.f3925b));
            this.f3924a.m328a(m3942a(this.f3925b));
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f3924a.m327a(floatValue / 100.0f);
                }
            }
        }
    }

    public final void setWidth(int i) {
    }

    public final String toString() {
        return "Chart2D3D: " + getTable(ATTR_WIDGET_ID);
    }
}
