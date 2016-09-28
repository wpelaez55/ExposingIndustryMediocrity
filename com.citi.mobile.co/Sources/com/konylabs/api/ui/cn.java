package com.konylabs.api.ui;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds.Builder;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.konylabs.android.C0128a;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public final class cn extends bW implements OnCameraChangeListener, OnInfoWindowClickListener, OnMapClickListener, OnMarkerClickListener {
    private static String f2766z;
    private Fragment f2767A;
    private float f2768B;
    private cq f2769C;
    private ArrayList f2770D;
    private Hashtable f2771E;
    GoogleMap f2772x;
    int f2773y;

    static {
        f2766z = "KonyMapV2";
    }

    public cn(Context context) {
        super(context);
        this.f2772x = null;
        this.f2768B = 1.0f;
        this.f2769C = null;
        this.f2770D = new ArrayList();
        this.f2771E = new Hashtable();
        this.f2773y = -1;
        if (KonyMain.f3657e) {
            Log.d(f2766z, "creating KonyMapV2");
        }
        setDescendantFocusability(AccessibilityNodeInfoCompat.ACTION_EXPAND);
    }

    public final int m2907a(Marker marker) {
        Iterator it = this.f2770D.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((Marker) it.next()).equals(marker)) {
                return i;
            }
            i++;
        }
        return 0;
    }

    public final void m2908a(float f) {
        this.g.width = 0;
        this.g.weight = f;
    }

    public final void m2909a(int i, boolean z) {
        if (this.n != null) {
            int size = this.n.size();
            if (this.f2772x != null && size >= 0 && i < size) {
                ch chVar = (ch) this.n.get(i);
                if (this.f2770D != null && this.f2770D.size() >= 0 && z) {
                    if (z) {
                        chVar.f984g = z;
                    }
                    this.f2773y = i;
                    Marker marker = (Marker) this.f2770D.get(i);
                    boolean isVisible = marker.isVisible();
                    marker.setVisible(true);
                    marker.showInfoWindow();
                    marker.setVisible(isVisible);
                }
                m2911a(chVar);
            }
        }
    }

    public final void m2910a(GoogleMap googleMap) {
        this.f2772x = googleMap;
        if (this.f2772x != null) {
            if (KonyMain.f3657e) {
                Log.d(f2766z, "GoogleMap Initialized");
            }
            this.f2772x.setOnMapClickListener(this);
            this.f2772x.setOnMarkerClickListener(this);
            this.f2772x.animateCamera(CameraUpdateFactory.zoomTo(this.f2768B));
            m2922d(this.j);
            m2918b(this.k);
            this.f2772x.setInfoWindowAdapter(new cp(this));
            this.f2772x.setOnInfoWindowClickListener(this);
            this.f2772x.setOnCameraChangeListener(this);
            m2914a(Boolean.valueOf(true));
            m868g();
        }
    }

    public final void m2911a(ch chVar) {
        if (this.f2772x != null) {
            this.f2772x.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(Double.valueOf((double) chVar.f978a).doubleValue(), Double.valueOf((double) chVar.f979b).doubleValue()), this.f2768B));
        }
    }

    public final void m2912a(ct ctVar) {
    }

    public final void m2913a(LuaTable luaTable, Boolean bool) {
        LuaNil table = luaTable.getTable(o);
        Object obj = table != LuaNil.nil ? table.toString() : null;
        table = luaTable.getTable(p);
        LuaTable luaTable2 = table != LuaNil.nil ? (LuaTable) table : null;
        if (obj != null && luaTable2 != null) {
            this.v.put(obj, luaTable);
            if (this.f2772x != null) {
                LuaTable luaTable3;
                table = luaTable.getTable(q);
                LuaTable luaTable4 = table != LuaNil.nil ? (LuaTable) table : null;
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
                    Object arrayList = new ArrayList();
                    Vector vector = luaTable2.list;
                    int size = vector.size();
                    Builder builder = new Builder();
                    for (int i = 0; i < size; i++) {
                        luaTable4 = (LuaTable) vector.elementAt(i);
                        if (!(luaTable4.getTable("lat") == LuaNil.nil || luaTable4.getTable("lon") == LuaNil.nil)) {
                            LatLng latLng = new LatLng(Double.valueOf(luaTable4.getTable("lat").toString()).doubleValue(), Double.valueOf(luaTable4.getTable("lon").toString()).doubleValue());
                            arrayList.add(latLng);
                            builder.include(latLng);
                        }
                    }
                    int i2 = SupportMenu.CATEGORY_MASK;
                    Integer a = hp.m3347a(luaTable3.getTable(r));
                    if (a != null) {
                        i2 = a.intValue();
                    }
                    Polyline polyline = (Polyline) this.f2771E.put(obj, this.f2772x.addPolyline(new PolylineOptions().addAll(arrayList).width((float) Integer.parseInt(luaTable3.getTable(s).toString())).color(i2)));
                    if (polyline != null) {
                        polyline.remove();
                    }
                    if (bool.booleanValue() && arrayList.size() > 0) {
                        MapView mapView = ((cs) this.f2767A).f2774a;
                        if (mapView.getViewTreeObserver().isAlive()) {
                            mapView.getViewTreeObserver().addOnGlobalLayoutListener(new co(this, builder, mapView));
                        }
                    }
                }
            }
        }
    }

    public final void m2914a(Boolean bool) {
        if (this.f2772x != null && this.n != null && this.n.size() > 0) {
            Iterator it = this.f2770D.iterator();
            while (it.hasNext()) {
                ((Marker) it.next()).remove();
            }
            this.f2770D.clear();
            int size = this.n.size();
            int i = 0;
            BitmapDescriptor bitmapDescriptor = null;
            while (i < size) {
                BitmapDescriptor fromPath;
                ch chVar = (ch) this.n.get(i);
                String str = chVar.f982e != null ? chVar.f982e : this.m;
                String str2 = str == null ? "ic_map_marker_icon.png" : str;
                int b;
                if (KonyMain.m4059E() == 3) {
                    str = C0128a.m16a().m25a() + "/" + str2;
                    fromPath = new File(str).exists() ? BitmapDescriptorFactory.fromPath(str) : bitmapDescriptor;
                    if (fromPath == null) {
                        KonyMain.getActContext();
                        b = KonyMain.m4105b(str2);
                        fromPath = b != 0 ? BitmapDescriptorFactory.fromResource(b) : BitmapDescriptorFactory.defaultMarker(210.0f);
                    }
                } else {
                    KonyMain.getActContext();
                    b = KonyMain.m4105b(str2);
                    fromPath = b != 0 ? BitmapDescriptorFactory.fromResource(b) : BitmapDescriptorFactory.defaultMarker(210.0f);
                }
                MarkerOptions position = new MarkerOptions().position(new LatLng((double) chVar.f978a, (double) chVar.f979b));
                if (fromPath != null) {
                    position.icon(fromPath);
                }
                Marker addMarker = this.f2772x.addMarker(position);
                addMarker.setVisible(chVar.f985h);
                this.f2770D.add(addMarker);
                i++;
                bitmapDescriptor = fromPath;
            }
            if (bool.booleanValue()) {
                m2911a((ch) this.n.get(0));
            }
        } else if (this.f2772x != null) {
            Iterator it2 = this.f2770D.iterator();
            while (it2.hasNext()) {
                ((Marker) it2.next()).remove();
            }
            this.f2770D.clear();
        }
    }

    public final boolean m2915a(MotionEvent motionEvent) {
        if (this.f2770D != null) {
            Iterator it = this.f2770D.iterator();
            while (it.hasNext()) {
                ((Marker) it.next()).hideInfoWindow();
            }
        }
        return true;
    }

    public final View m2916b() {
        FragmentManager supportFragmentManager = KonyMain.getActContext().getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        this.f2767A = supportFragmentManager.findFragmentByTag(this.l);
        if (this.f2767A == null) {
            this.f2767A = new cs();
            ((cs) this.f2767A).m2926a(this);
            beginTransaction.add(Math.abs(this.l.hashCode()), this.f2767A, this.l);
            beginTransaction.commitAllowingStateLoss();
        }
        requestLayout();
        return this;
    }

    public final void m2917b(ch chVar) {
        if (chVar == null || this.f2770D == null) {
            m2915a(null);
        } else if (this.n != null) {
            Iterator it = this.f2770D.iterator();
            while (it.hasNext()) {
                Marker marker = (Marker) it.next();
                LatLng position = marker.getPosition();
                if (chVar.f978a == ((float) position.latitude) && chVar.f979b == ((float) position.longitude)) {
                    marker.hideInfoWindow();
                    return;
                }
            }
        }
    }

    public final void m2918b(boolean z) {
        this.k = z;
        if (this.f2772x != null) {
            this.f2772x.getUiSettings().setZoomControlsEnabled(z);
        }
    }

    public final int m2919c() {
        if (this.f2772x != null) {
            this.f2768B = this.f2772x.getCameraPosition().zoom;
        }
        return (int) this.f2768B;
    }

    public final void m2920c(int i) {
        if (this.f2772x != null) {
            this.f2772x.animateCamera(CameraUpdateFactory.zoomTo((float) i));
        }
        this.f2768B = (float) i;
    }

    public final LuaTable m2921d() {
        LuaTable luaTable = new LuaTable();
        LuaTable luaTable2 = new LuaTable();
        LuaTable luaTable3 = new LuaTable();
        LuaTable luaTable4 = new LuaTable();
        if (this.f2772x != null) {
            luaTable2.setTable("lat", Double.valueOf(this.f2772x.getCameraPosition().target.latitude));
            luaTable2.setTable("lon", Double.valueOf(this.f2772x.getCameraPosition().target.longitude));
            luaTable.setTable("center", luaTable2);
            VisibleRegion visibleRegion = this.f2772x.getProjection().getVisibleRegion();
            LatLng latLng = visibleRegion.latLngBounds.northeast;
            luaTable3.setTable("lat", Double.valueOf(latLng.latitude));
            luaTable3.setTable("lon", Double.valueOf(latLng.longitude));
            luaTable.setTable("northeast", luaTable3);
            LatLng latLng2 = visibleRegion.latLngBounds.southwest;
            luaTable4.setTable("lat", Double.valueOf(latLng2.latitude));
            luaTable4.setTable("lon", Double.valueOf(latLng2.longitude));
            luaTable.setTable("southwest", luaTable4);
            luaTable.setTable("latspan", Double.valueOf(Math.abs(Math.abs(latLng.latitude) + Math.abs(latLng2.latitude))));
            luaTable.setTable("lonspan", Double.valueOf(Math.abs(Math.abs(latLng.longitude) + Math.abs(latLng2.longitude))));
        }
        return luaTable;
    }

    public final void m2922d(int i) {
        this.j = i;
        if (this.f2772x != null) {
            if (6 != this.j) {
                this.f2772x.setTrafficEnabled(false);
            }
            switch (this.j) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    this.f2772x.setMapType(1);
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    this.f2772x.setMapType(2);
                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                    this.f2772x.setMapType(1);
                    this.f2772x.setTrafficEnabled(true);
                default:
            }
        }
    }

    public final void m2923e() {
        if (this.f2772x != null) {
            this.f2772x.clear();
        }
        if (this.f2769C != null && this.f2769C.isShowing()) {
            this.f2769C.dismiss();
        }
    }

    public final void m2924e(String str) {
        Polyline polyline = (Polyline) this.f2771E.remove(str);
        if (polyline != null) {
            polyline.remove();
        }
    }

    public final void m2925f() {
        if (KonyMain.getActContext() != null) {
            FragmentManager supportFragmentManager = KonyMain.getActContext().getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(this.l);
            if (findFragmentByTag != null) {
                beginTransaction.remove(findFragmentByTag).commitAllowingStateLoss();
                this.f2772x = null;
            }
        }
    }

    public final void onCameraChange(CameraPosition cameraPosition) {
        if (this.f != null) {
            this.f.m1025a(m2921d());
        }
    }

    public final void onInfoWindowClick(Marker marker) {
        if (this.h != null) {
            this.h.m1028a(this.f2773y);
        }
    }

    public final void onMapClick(LatLng latLng) {
        if (this.e != null) {
            LuaTable luaTable = new LuaTable();
            luaTable.setTable("lat", Double.valueOf(latLng.latitude));
            luaTable.setTable("lon", Double.valueOf(latLng.longitude));
            this.e.m1026a(luaTable);
        }
    }

    public final boolean onMarkerClick(Marker marker) {
        this.f2773y = m2907a(marker);
        if (this.c != null) {
            this.c.m1027a(this.f2773y);
        }
        return false;
    }
}
