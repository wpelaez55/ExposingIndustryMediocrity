package com.konylabs.api.ui;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.support.v4.media.TransportMediator;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaTable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class bW extends LinearLayout {
    public static String f790o;
    public static String f791p;
    public static String f792q;
    public static String f793r;
    public static String f794s;
    Context f795a;
    protected cb f796b;
    protected cf f797c;
    protected cc f798d;
    protected ce f799e;
    protected cd f800f;
    protected LayoutParams f801g;
    protected cg f802h;
    protected int f803i;
    protected int f804j;
    protected boolean f805k;
    protected String f806l;
    protected String f807m;
    protected ArrayList f808n;
    protected String f809t;
    protected String f810u;
    Hashtable f811v;
    public Boolean f812w;
    private boolean f813x;
    private Rect f814y;

    static {
        f790o = "id";
        f791p = "locations";
        f792q = "polylineconfig";
        f793r = "linecolor";
        f794s = "linewidth";
        if (KonyMain.m4057C()) {
            f792q = "polylineConfig";
            f793r = "lineColor";
            f794s = "lineWidth";
        }
    }

    public bW(Context context) {
        super(context);
        this.f803i = 15;
        this.f804j = 1;
        this.f805k = true;
        this.f813x = false;
        this.f814y = null;
        this.f806l = null;
        this.f808n = new ArrayList();
        this.f809t = "FF0000FF";
        this.f810u = "3";
        this.f811v = new Hashtable();
        this.f812w = Boolean.valueOf(false);
        this.f795a = context;
        this.f801g = new LayoutParams(-2, -2);
        setLayoutParams(this.f801g);
    }

    public static Boolean m830h() {
        Boolean valueOf;
        Exception e;
        Boolean valueOf2 = Boolean.valueOf(false);
        try {
            Context appContext = KonyMain.getAppContext();
            ApplicationInfo applicationInfo = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), TransportMediator.FLAG_KEY_MEDIA_NEXT);
            String str = (applicationInfo == null || applicationInfo.metaData == null) ? null : (String) applicationInfo.metaData.get("com.google.android.maps.v2.API_KEY");
            valueOf = str != null ? Boolean.valueOf(true) : valueOf2;
            try {
                if (KonyMain.f3657e) {
                    Log.d("KonyMap", "MapV2Key is Added = " + str);
                }
            } catch (Exception e2) {
                e = e2;
                if (KonyMain.f3657e) {
                    e.printStackTrace();
                }
                return valueOf;
            }
        } catch (Exception e3) {
            Exception exception = e3;
            valueOf = valueOf2;
            e = exception;
            if (KonyMain.f3657e) {
                e.printStackTrace();
            }
            return valueOf;
        }
        return valueOf;
    }

    public void m831a() {
        setLayoutParams(this.f801g);
    }

    public abstract void m832a(float f);

    public final void m833a(int i) {
        setVisibility(i);
    }

    public abstract void m834a(int i, boolean z);

    public final void m835a(cb cbVar) {
        this.f796b = cbVar;
    }

    public final void m836a(cc ccVar) {
        this.f798d = ccVar;
    }

    public final void m837a(cd cdVar) {
        this.f800f = cdVar;
    }

    public void m838a(ce ceVar) {
        this.f799e = ceVar;
    }

    public final void m839a(cf cfVar) {
        this.f797c = cfVar;
    }

    public final void m840a(cg cgVar) {
        this.f802h = cgVar;
    }

    public abstract void m841a(ch chVar);

    public final void m842a(ch chVar, boolean z, boolean z2) {
        if (this.f808n == null) {
            this.f808n = new ArrayList();
        }
        if (chVar != null && this.f808n != null) {
            if (z2 || z) {
                this.f808n.add(chVar);
                m847a(this.f808n, Boolean.valueOf(false));
                m834a(this.f808n.size() - 1, z);
                return;
            }
            m847a(this.f808n, Boolean.valueOf(false));
            m841a(chVar);
        }
    }

    public abstract void m843a(ct ctVar);

    public abstract void m844a(LuaTable luaTable, Boolean bool);

    public abstract void m845a(Boolean bool);

    public final void m846a(String str) {
        this.f807m = str;
    }

    public final void m847a(ArrayList arrayList, Boolean bool) {
        m850a(null);
        if (arrayList == null) {
            this.f808n = new ArrayList();
        } else {
            this.f808n = arrayList;
        }
        m845a(bool);
    }

    public final void m848a(boolean z) {
        this.f801g.width = -2;
    }

    public final void m849a(int[] iArr) {
        this.f814y = new Rect();
        this.f814y.left = iArr[0];
        this.f814y.top = iArr[1];
        this.f814y.right = iArr[2];
        this.f814y.bottom = iArr[3];
        ez.m1344a(iArr, this, this.f801g);
        setLayoutParams(this.f801g);
    }

    public abstract boolean m850a(MotionEvent motionEvent);

    public abstract View m851b();

    public final void m852b(int i) {
        this.f801g.height = i;
        post(new bX(this));
    }

    public abstract void m853b(ch chVar);

    public final void m854b(Boolean bool) {
        this.f812w = bool;
    }

    public final void m855b(String str) {
        int i = -1;
        if (str == "Normal") {
            i = 1;
        } else if (str == "Satellite") {
            i = 2;
        } else if (str == "Traffic") {
            i = 6;
        }
        m862d(i);
    }

    public abstract void m856b(boolean z);

    public abstract int m857c();

    public abstract void m858c(int i);

    public final void m859c(String str) {
        if (str == null) {
            m847a(null, Boolean.valueOf(true));
        }
        new Thread(new bY(this, str)).start();
    }

    public final void m860c(boolean z) {
        this.f813x = z;
        if (this.f813x) {
            this.f801g = new LayoutParams(-1, -1);
            m831a();
            return;
        }
        this.f801g.height = (KonyMain.getActContext().m4167p() * 3) / 4;
    }

    public abstract LuaTable m861d();

    public abstract void m862d(int i);

    public final void m863d(String str) {
        this.f806l = str;
        setId(Math.abs(str.hashCode()));
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return isEnabled() ? super.dispatchKeyEvent(keyEvent) : true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return isEnabled() ? super.dispatchTouchEvent(motionEvent) : true;
    }

    public abstract void m864e();

    public final void m865e(int i) {
        this.f801g.width = i;
        post(new ca(this));
    }

    public abstract void m866e(String str);

    public abstract void m867f();

    protected final void m868g() {
        Enumeration keys = this.f811v.keys();
        while (keys.hasMoreElements()) {
            m844a((LuaTable) this.f811v.get((String) keys.nextElement()), Boolean.valueOf(!keys.hasMoreElements()));
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
