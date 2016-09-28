package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.internal.view.SupportMenu;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;
import com.google.android.maps.Projection;
import com.konylabs.android.KonyMain;
import com.konylabs.android.KonyMapsActivity;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public final class ci extends bW {
    private static String f2760y;
    private cj f2761A;
    private Hashtable f2762B;
    public ct f2763x;
    private ck f2764z;

    static {
        f2760y = "KonyMapV1";
    }

    public ci(Context context) {
        super(context);
        this.f2761A = null;
        this.f2762B = new Hashtable();
        this.f2761A = new cj(this);
        if (KonyMain.f3657e) {
            Log.d(f2760y, "creating KonyMapV1");
        }
    }

    private static Drawable m2883i() {
        Drawable drawable = null;
        try {
            drawable = dB.m1112c("ic_map_marker_icon_trans.png");
        } catch (OutOfMemoryError e) {
            if (KonyMain.f3657e) {
                Log.d(f2760y, BuildConfig.FLAVOR + e.getMessage());
            }
        }
        return drawable;
    }

    private Drawable m2884j() {
        Drawable drawable = null;
        try {
            if (this.m != null) {
                drawable = dB.m1112c(this.m);
            }
        } catch (OutOfMemoryError e) {
            if (KonyMain.f3657e) {
                Log.d(f2760y, BuildConfig.FLAVOR + e.getMessage());
            }
        }
        return drawable == null ? dB.m1112c("ic_map_marker_icon.png") : drawable;
    }

    public final void m2885a() {
        setLayoutParams(this.g);
    }

    public final void m2886a(float f) {
        this.g.width = 0;
        if (this.f2763x != null) {
            this.g.height = this.f2763x.getLayoutParams().height;
        }
        this.g.weight = f;
    }

    public final void m2887a(int i, boolean z) {
        if (this.n != null) {
            int size = this.n.size();
            if (this.f2763x != null && size >= 0 && i < size) {
                m2889a((ch) this.n.get(i));
                if (this.f2764z != null && z) {
                    this.f2764z.f1000l = i;
                    this.f2764z.m1035a(i);
                }
            }
        }
    }

    public final void m2888a(ce ceVar) {
        this.e = ceVar;
        if (this.f2763x != null) {
            List overlays = this.f2763x.getOverlays();
            if (!overlays.contains(this.f2761A)) {
                overlays.add(this.f2761A);
            }
            this.f2763x.invalidate();
        }
    }

    public final void m2889a(ch chVar) {
        if (this.f2763x != null) {
            this.f2763x.getController().animateTo(new GeoPoint(Double.valueOf(((double) chVar.f978a) * 1000000.0d).intValue(), Double.valueOf(((double) chVar.f979b) * 1000000.0d).intValue()));
        }
    }

    public final void m2890a(ct ctVar) {
        this.f2763x = ctVar;
        m2888a(this.e);
        this.f2763x.getController().setZoom(this.i);
        this.f2763x.setBuiltInZoomControls(this.k);
        m2900d(this.j);
        ctVar.m1039a(this);
        m2892a(Boolean.valueOf(true));
        m868g();
    }

    public final void m2891a(LuaTable luaTable, Boolean bool) {
        LuaNil table = luaTable.getTable(o);
        Object obj = table != LuaNil.nil ? table.toString() : null;
        LuaNil table2 = luaTable.getTable(p);
        LuaTable luaTable2 = table2 != LuaNil.nil ? (LuaTable) table2 : null;
        if (obj != null && luaTable2 != null) {
            this.v.put(obj, luaTable);
            if (this.f2763x != null) {
                LuaTable luaTable3;
                ArrayList arrayList = new ArrayList();
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                float f4 = 0.0f;
                table2 = luaTable.getTable(q);
                LuaTable luaTable4 = table2 != LuaNil.nil ? (LuaTable) table2 : null;
                if (luaTable4 != null) {
                    if (luaTable4.getTable(r) == LuaNil.nil) {
                        luaTable4.setTable(r, this.t);
                    }
                    if (luaTable4.getTable(s) == LuaNil.nil) {
                        luaTable4.setTable(s, this.u);
                        luaTable3 = luaTable4;
                    } else {
                        luaTable3 = luaTable4;
                    }
                } else {
                    luaTable4 = new LuaTable();
                    luaTable4.setTable(r, this.t);
                    luaTable4.setTable(s, this.u);
                    luaTable.setTable(q, luaTable4);
                    luaTable3 = luaTable4;
                }
                if (luaTable2 != null && luaTable2.size() != 0) {
                    Vector vector = luaTable2.list;
                    int size = vector.size();
                    Object obj2 = null;
                    for (int i = 0; i < size; i++) {
                        luaTable4 = (LuaTable) vector.elementAt(i);
                        if (!(luaTable4.getTable("lat") == LuaNil.nil || luaTable4.getTable("lon") == LuaNil.nil)) {
                            float f5;
                            float f6;
                            Object obj3;
                            float f7;
                            float floatValue = new Double(luaTable4.getTable("lat").toString()).floatValue();
                            float floatValue2 = new Double(luaTable4.getTable("lon").toString()).floatValue();
                            if (floatValue == 0.0f || floatValue2 == 0.0f) {
                                f5 = f4;
                                f6 = f;
                                f4 = f3;
                                obj3 = obj2;
                                f7 = f2;
                            } else {
                                if (obj2 == null) {
                                    obj3 = 1;
                                    f5 = floatValue2;
                                    f4 = floatValue2;
                                    f7 = floatValue;
                                    f6 = floatValue;
                                } else {
                                    f5 = f4;
                                    f6 = f;
                                    f4 = f3;
                                    obj3 = obj2;
                                    f7 = f2;
                                }
                                if (f6 > floatValue) {
                                    f6 = floatValue;
                                }
                                if (f7 < floatValue) {
                                    f7 = floatValue;
                                }
                                if (f4 > floatValue2) {
                                    f4 = floatValue2;
                                }
                                if (f5 < floatValue2) {
                                    f5 = floatValue2;
                                }
                            }
                            arrayList.add(new GeoPoint((int) (1000000.0f * floatValue), (int) (floatValue2 * 1000000.0f)));
                            f2 = f7;
                            f = f6;
                            obj2 = obj3;
                            f3 = f4;
                            f4 = f5;
                        }
                    }
                    int i2 = SupportMenu.CATEGORY_MASK;
                    Integer a = hp.m3347a(luaTable3.getTable(r));
                    if (a != null) {
                        i2 = a.intValue();
                    }
                    int parseInt = Integer.parseInt(luaTable3.getTable(s).toString());
                    if (bool.booleanValue() && arrayList.size() > 0) {
                        MapController controller = this.f2763x.getController();
                        controller.animateTo(new GeoPoint((int) (((f2 + f) / 2.0f) * 1000000.0f), (int) (((f4 + f3) / 2.0f) * 1000000.0f)));
                        controller.zoomToSpan((int) ((f2 - f) * 1000000.0f), (int) ((f4 - f3) * 1000000.0f));
                    }
                    ck ckVar = new ck(this, m2883i(), arrayList, i2, parseInt);
                    List overlays = this.f2763x.getOverlays();
                    overlays.add(ckVar);
                    ckVar = (ck) this.f2762B.put(obj, ckVar);
                    if (ckVar != null) {
                        overlays.remove(ckVar);
                    }
                    this.f2763x.invalidate();
                }
            }
        }
    }

    public final void m2892a(Boolean bool) {
        List list = null;
        if (this.f2763x != null) {
            list = this.f2763x.getOverlays();
        }
        if (list != null) {
            if (this.f2764z == null) {
                this.f2764z = new ck(this, m2883i());
            } else {
                list.remove(this.f2764z);
            }
            this.f2764z.m1037a(this.n);
            list.add(this.f2764z);
            this.f2763x.invalidate();
            if (bool.booleanValue() && this.n != null && this.n.size() > 0) {
                this.f2763x.getController().setCenter(new GeoPoint(Double.valueOf(((double) ((ch) this.n.get(0)).f978a) * 1000000.0d).intValue(), Double.valueOf(((double) ((ch) this.n.get(0)).f979b) * 1000000.0d).intValue()));
            }
        }
    }

    public final boolean m2893a(MotionEvent motionEvent) {
        if (this.f2764z == null) {
            return true;
        }
        if (motionEvent != null) {
            return this.f2764z.m1038a(motionEvent);
        }
        this.f2764z.m1034a();
        return true;
    }

    public final View m2894b() {
        KonyMapsActivity.m15a(this);
        FragmentManager supportFragmentManager = KonyMain.getActContext().getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (supportFragmentManager.findFragmentByTag(this.l) == null) {
            beginTransaction.add(Math.abs(this.l.hashCode()), cm.m2904a(), this.l);
            beginTransaction.commitAllowingStateLoss();
        }
        requestLayout();
        return this;
    }

    public final void m2895b(ch chVar) {
        if (chVar == null || this.f2764z == null) {
            m2893a(null);
        } else {
            this.f2764z.m1036a(chVar);
        }
    }

    public final void m2896b(boolean z) {
        this.k = z;
    }

    public final int m2897c() {
        return this.f2763x != null ? this.f2763x.getZoomLevel() : -1;
    }

    public final void m2898c(int i) {
        this.i = i;
        if (this.f2763x != null) {
            this.f2763x.getController().setZoom(i);
        }
    }

    public final LuaTable m2899d() {
        LuaTable luaTable = new LuaTable();
        LuaTable luaTable2 = new LuaTable();
        LuaTable luaTable3 = new LuaTable();
        LuaTable luaTable4 = new LuaTable();
        if (this.f2763x != null) {
            GeoPoint mapCenter = this.f2763x.getMapCenter();
            luaTable2.setTable("lat", Double.valueOf(((double) mapCenter.getLatitudeE6()) / 1000000.0d));
            luaTable2.setTable("lon", Double.valueOf(((double) mapCenter.getLongitudeE6()) / 1000000.0d));
            luaTable.setTable("center", luaTable2);
            Projection projection = this.f2763x.getProjection();
            mapCenter = projection.fromPixels(this.f2763x.getWidth(), 0);
            luaTable3.setTable("lat", Double.valueOf(((double) mapCenter.getLatitudeE6()) / 1000000.0d));
            luaTable3.setTable("lon", Double.valueOf(((double) mapCenter.getLongitudeE6()) / 1000000.0d));
            luaTable.setTable("northeast", luaTable3);
            GeoPoint fromPixels = projection.fromPixels(0, this.f2763x.getHeight());
            luaTable4.setTable("lat", Double.valueOf(((double) fromPixels.getLatitudeE6()) / 1000000.0d));
            luaTable4.setTable("lon", Double.valueOf(((double) fromPixels.getLongitudeE6()) / 1000000.0d));
            luaTable.setTable("southwest", luaTable4);
            luaTable.setTable("latspan", Double.valueOf(((double) this.f2763x.getLatitudeSpan()) / 1000000.0d));
            luaTable.setTable("lonspan", Double.valueOf(((double) this.f2763x.getLongitudeSpan()) / 1000000.0d));
        }
        return luaTable;
    }

    public final void m2900d(int i) {
        this.j = i;
        if (this.f2763x != null) {
            this.f2763x.setStreetView(false);
            this.f2763x.setSatellite(false);
            this.f2763x.setTraffic(false);
            switch (this.j) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    this.f2763x.setSatellite(true);
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                    this.f2763x.setTraffic(true);
                default:
            }
        }
    }

    public final void m2901e() {
        m847a(null, Boolean.valueOf(true));
        this.f2763x.getOverlays().clear();
        this.v.clear();
        this.f2762B.clear();
        this.f2763x.invalidate();
    }

    public final void m2902e(String str) {
        ck ckVar = (ck) this.f2762B.get(str);
        if (ckVar != null && this.f2763x != null) {
            this.f2763x.getOverlays().remove(ckVar);
            this.f2763x.invalidate();
        }
    }

    public final void m2903f() {
        if (KonyMain.getActContext() != null) {
            FragmentManager supportFragmentManager = KonyMain.getActContext().getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(this.l);
            if (findFragmentByTag != null) {
                beginTransaction.remove(findFragmentByTag).commitAllowingStateLoss();
            }
        }
    }
}
