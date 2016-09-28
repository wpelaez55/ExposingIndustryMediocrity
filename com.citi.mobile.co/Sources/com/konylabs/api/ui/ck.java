package com.konylabs.api.ui;

import android.app.Dialog;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.support.v4.internal.view.SupportMenu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public final class ck extends ItemizedOverlay {
    final /* synthetic */ ci f989a;
    private Dialog f990b;
    private TextView f991c;
    private TextView f992d;
    private RelativeLayout f993e;
    private ImageView f994f;
    private ImageView f995g;
    private ArrayList f996h;
    private ArrayList f997i;
    private int f998j;
    private int f999k;
    private int f1000l;
    private OnClickListener f1001m;

    public ck(ci ciVar, Drawable drawable) {
        this.f989a = ciVar;
        super(boundCenterBottom(drawable));
        this.f990b = new Dialog(this.f989a.a);
        this.f991c = new TextView(this.f989a.a);
        this.f992d = new TextView(this.f989a.a);
        this.f993e = new RelativeLayout(this.f989a.a);
        this.f994f = new ImageView(this.f989a.a);
        this.f995g = new ImageView(this.f989a.a);
        this.f996h = new ArrayList();
        this.f997i = null;
        this.f998j = SupportMenu.CATEGORY_MASK;
        this.f999k = 3;
        this.f1000l = -1;
        this.f1001m = new cl(this);
        this.f990b.setCanceledOnTouchOutside(true);
        this.f990b.setCancelable(true);
        this.f991c.setTextSize(10.0f);
        this.f991c.setTypeface(Typeface.SANS_SERIF, 1);
        this.f991c.setTextColor(-16777217);
        this.f992d.setTextSize(14.0f);
        this.f992d.setTypeface(Typeface.SANS_SERIF, 0);
        this.f992d.setTextColor(-16777217);
        this.f992d.setGravity(16);
        this.f994f.setImageDrawable(dB.m1112c("ic_map_righticon.png"));
        this.f995g.setImageDrawable(dB.m1112c("ic_map_cancelicon.png"));
        int r = dB.m1116r(4);
        this.f995g.setPadding(r, r, r, r);
        r = dB.m1116r(4);
        this.f994f.setPadding(r, r, r, r);
        this.f994f.setClickable(true);
        this.f995g.setClickable(true);
        this.f994f.setOnClickListener(this.f1001m);
        this.f995g.setOnClickListener(this.f1001m);
        r = dB.m1116r(4);
        this.f993e.setPadding(r, r, r, r);
        Drawable paintDrawable = new PaintDrawable(-3355444);
        paintDrawable.setCornerRadius(4.0f);
        this.f993e.setBackgroundDrawable(paintDrawable);
        View linearLayout = new LinearLayout(ciVar.a);
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f995g);
        linearLayout.addView(this.f994f);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        linearLayout.setId(1);
        LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(9);
        layoutParams2.addRule(0, 1);
        this.f992d.setLayoutParams(layoutParams2);
        linearLayout.setLayoutParams(layoutParams);
        this.f993e.addView(this.f992d);
        this.f993e.addView(linearLayout);
        this.f990b.setContentView(this.f993e);
    }

    public ck(ci ciVar, Drawable drawable, ArrayList arrayList, int i, int i2) {
        this.f989a = ciVar;
        super(boundCenterBottom(drawable));
        this.f990b = new Dialog(this.f989a.a);
        this.f991c = new TextView(this.f989a.a);
        this.f992d = new TextView(this.f989a.a);
        this.f993e = new RelativeLayout(this.f989a.a);
        this.f994f = new ImageView(this.f989a.a);
        this.f995g = new ImageView(this.f989a.a);
        this.f996h = new ArrayList();
        this.f997i = null;
        this.f998j = SupportMenu.CATEGORY_MASK;
        this.f999k = 3;
        this.f1000l = -1;
        this.f1001m = new cl(this);
        this.f997i = arrayList;
        this.f998j = i;
        this.f999k = i2;
        setLastFocusedIndex(-1);
        populate();
    }

    public final void m1034a() {
        if (this.f989a.n != null) {
            Iterator it = this.f989a.n.iterator();
            while (it.hasNext()) {
                ch chVar = (ch) it.next();
                if (chVar.f986i != null) {
                    this.f989a.f2763x.removeView(chVar.f986i);
                    chVar.f986i = null;
                }
            }
        }
    }

    protected final void m1035a(int i) {
        OverlayItem overlayItem = (OverlayItem) this.f996h.get(i);
        ch chVar = (ch) this.f989a.n.get(i);
        View a = this.f989a.d.m1024a(chVar.f987j);
        if (a != null) {
            a.setLayoutParams(new MapView.LayoutParams(a.getMeasuredWidth(), -2, overlayItem.getPoint(), 0, ((-overlayItem.getMarker(0).getIntrinsicHeight()) * 3) / 4, 81));
            if (chVar.f986i != null) {
                this.f989a.f2763x.removeView(chVar.f986i);
            }
            this.f989a.f2763x.removeView(a);
            this.f989a.f2763x.addView(a);
            chVar.f986i = a;
            this.f989a.m2889a(chVar);
            return;
        }
        this.f992d.setText(overlayItem.getSnippet() != null ? overlayItem.getSnippet() : BuildConfig.FLAVOR);
        if (overlayItem.getTitle() != null || overlayItem.getSnippet() != null) {
            this.f990b.setTitle(overlayItem.getTitle() != null ? overlayItem.getTitle() : BuildConfig.FLAVOR);
            if (this.f989a.h == null) {
                this.f994f.setVisibility(8);
            }
            this.f990b.show();
        }
    }

    public final void m1036a(ch chVar) {
        if (this.f989a.n != null) {
            Iterator it = this.f989a.n.iterator();
            while (it.hasNext()) {
                ch chVar2 = (ch) it.next();
                if (chVar2.f978a == chVar.f978a && chVar2.f979b == chVar.f979b) {
                    this.f989a.f2763x.removeView(chVar2.f986i);
                    chVar2.f986i = null;
                    return;
                }
            }
        }
    }

    public final void m1037a(ArrayList arrayList) {
        this.f996h.clear();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ch chVar = (ch) arrayList.get(i);
                OverlayItem overlayItem = new OverlayItem(new GeoPoint(Double.valueOf(((double) chVar.f978a) * 1000000.0d).intValue(), Double.valueOf(((double) chVar.f979b) * 1000000.0d).intValue()), chVar.f980c, chVar.f981d);
                if (chVar.f982e != null && chVar.f985h) {
                    Drawable c = dB.m1112c(chVar.f982e);
                    if (c != null) {
                        overlayItem.setMarker(boundCenterBottom(c));
                    }
                } else if (chVar.f985h) {
                    overlayItem.setMarker(boundCenterBottom(this.f989a.m2884j()));
                }
                this.f996h.add(overlayItem);
            }
        }
        setLastFocusedIndex(-1);
        populate();
        this.f989a.f2763x.invalidate();
    }

    public final boolean m1038a(MotionEvent motionEvent) {
        Vector vector = new Vector(1);
        if (this.f989a.n == null) {
            return true;
        }
        Iterator it = this.f989a.n.iterator();
        while (it.hasNext()) {
            ch chVar = (ch) it.next();
            if (chVar.f986i != null) {
                vector.add(chVar);
                Rect rect = new Rect();
                chVar.f986i.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    vector.clear();
                    return false;
                }
            }
        }
        Iterator it2 = vector.iterator();
        while (it2.hasNext()) {
            chVar = (ch) it2.next();
            this.f989a.f2763x.removeView(chVar.f986i);
            chVar.f986i = null;
        }
        return true;
    }

    protected final OverlayItem createItem(int i) {
        return (OverlayItem) this.f996h.get(i);
    }

    public final void draw(Canvas canvas, MapView mapView, boolean z) {
        int i = -1;
        super.draw(canvas, mapView, false);
        if (!z && this.f997i != null && this.f997i.size() > 0) {
            Point point = new Point();
            Paint paint = new Paint();
            paint.setColor(this.f998j);
            paint.setStyle(Style.STROKE);
            paint.setAntiAlias(true);
            paint.setStrokeWidth((float) this.f999k);
            int i2 = 0;
            int i3 = -1;
            while (i2 < this.f997i.size()) {
                mapView.getProjection().toPixels((GeoPoint) this.f997i.get(i2), point);
                int i4 = point.x;
                int i5 = point.y;
                if (i2 > 0) {
                    canvas.drawLine((float) i, (float) i3, (float) i4, (float) i5, paint);
                }
                i2++;
                i3 = i5;
                i = i4;
            }
        }
    }

    protected final boolean onTap(int i) {
        super.onTap(i);
        this.f1000l = i;
        if (this.f989a.n != null && this.f989a.n.size() > 0 && ((ch) this.f989a.n.get(i)).f983f) {
            m1035a(i);
        }
        if (this.f989a.c != null) {
            this.f989a.c.m1027a(this.f1000l);
        }
        return true;
    }

    public final int size() {
        return this.f996h.size();
    }
}
