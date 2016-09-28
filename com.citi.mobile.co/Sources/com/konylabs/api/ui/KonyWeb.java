package com.konylabs.api.ui;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebSettings;
import android.webkit.WebSettings.ZoomDensity;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.android.KonyMain;
import com.konylabs.hybrid.KonyHybridJSInterface;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import ny0k.aj;
import org.apache.http.util.EncodingUtils;

public class KonyWeb extends WebView {
    public static int f243a;
    public static int f244b;
    private ey f245A;
    private int f246B;
    private Context f247c;
    private int[] f248d;
    private int[] f249e;
    private LinearLayout f250f;
    private LayoutParams f251g;
    private LayoutParams f252h;
    private int f253i;
    private Hashtable f254j;
    private String f255k;
    private boolean f256l;
    private boolean f257m;
    private boolean f258n;
    private boolean f259o;
    private float f260p;
    private int f261q;
    private float f262r;
    private boolean f263s;
    private boolean f264t;
    private FrameLayout f265u;
    private CustomViewCallback f266v;
    private View f267w;
    private String f268x;
    private boolean f269y;
    private ex f270z;

    static {
        f243a = 1;
        f244b = 2;
    }

    public KonyWeb(Context context, int i) {
        super(context);
        this.f248d = new int[]{0, 0, 0, 0};
        this.f249e = new int[]{0, 0, 0, 0};
        this.f253i = f243a;
        this.f256l = true;
        this.f257m = false;
        this.f258n = false;
        this.f259o = false;
        this.f263s = true;
        this.f264t = false;
        this.f268x = "CustomViewScreen";
        this.f269y = false;
        this.f246B = -1;
        this.f247c = context;
        this.f250f = new LinearLayout(context);
        this.f251g = new LayoutParams(-2, -2);
        this.f252h = new LayoutParams(-1, -2);
        setScrollBarStyle(0);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setAllowFileAccess(true);
        getSettings().setCacheMode(2);
        if (!(KonyMain.m4145z() == 1 || i == 0)) {
            addJavascriptInterface(new KonyHybridJSInterface(i), "androidhybrid");
        }
        setWebChromeClient(new et(this));
        WebSettings settings = getSettings();
        try {
            settings.getClass().getMethod("setDomStorageEnabled", new Class[]{Boolean.TYPE}).invoke(settings, new Object[]{Boolean.valueOf(true)});
        } catch (Exception e) {
            e.printStackTrace();
        }
        settings = getSettings();
        try {
            String path = this.f247c.getApplicationContext().getDir("database", 0).getPath();
            settings.getClass().getMethod("setDatabasePath", new Class[]{String.class}).invoke(settings, new Object[]{path});
            settings.getClass().getMethod("setDatabaseEnabled", new Class[]{Boolean.TYPE}).invoke(settings, new Object[]{Boolean.valueOf(true)});
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        setWebViewClient(new ew(this));
        CookieSyncManager.createInstance(this.f247c);
        m225a(false);
        m241f();
    }

    private void m211g() {
        clearView();
        if (this.f255k != null) {
            StringBuffer stringBuffer = new StringBuffer(this.f255k);
            if (this.f254j != null && this.f254j.size() > 0) {
                stringBuffer.append('?');
                Iterator it = this.f254j.keySet().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    stringBuffer.append(str + "=");
                    stringBuffer.append((String) this.f254j.get(str));
                    if (it.hasNext()) {
                        stringBuffer.append('&');
                    }
                }
            }
            loadUrl(stringBuffer.toString());
            setVisibility(0);
        }
    }

    public final void m217a() {
        this.f251g.height = -1;
        this.f252h.height = -1;
        this.f259o = true;
        this.f261q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public final void m218a(float f) {
        this.f251g.width = 0;
        this.f251g.weight = f;
    }

    public final void m219a(int i) {
        if (i == f244b) {
            this.f253i = f244b;
        } else {
            this.f253i = f243a;
        }
    }

    public final void m220a(ex exVar) {
        this.f270z = exVar;
    }

    public final void m221a(ey eyVar) {
        this.f245A = eyVar;
    }

    public final void m222a(String str) {
        this.f255k = str;
        aj.m1987a();
    }

    public final void m223a(String str, String str2, String str3, String str4) {
        loadUrl("about:blank");
        postDelayed(new eo(this, str4, str, str2, str3), 10);
    }

    public final void m224a(Hashtable hashtable) {
        this.f254j = hashtable;
    }

    public final void m225a(boolean z) {
        getSettings().setBuiltInZoomControls(z);
        getSettings().setSupportZoom(z);
    }

    public final void m226a(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            iArr[i] = iArr[i] + this.f248d[i];
        }
        ez.m1344a(iArr, this.f250f, this.f251g);
    }

    public final void m227b() {
        if (!this.f269y) {
            this.f250f.setLayoutParams(this.f251g);
            this.f250f.addView(this, this.f252h);
            m232c();
            this.f269y = true;
        }
    }

    public final void m228b(int i) {
        this.f250f.setVisibility(i);
    }

    public final void m229b(String str) {
        if (str == null) {
            setVisibility(4);
            return;
        }
        clearView();
        postDelayed(new ep(this, str), 10);
        setVisibility(0);
    }

    public final void m230b(boolean z) {
        this.f256l = z;
    }

    public final void m231b(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            iArr[i] = iArr[i] + this.f249e[i];
        }
        setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void m232c() {
        if (this.f253i == f244b) {
            StringBuilder stringBuilder = new StringBuilder();
            if (this.f254j != null && this.f254j.size() > 0) {
                Enumeration keys = this.f254j.keys();
                while (keys.hasMoreElements()) {
                    Object nextElement = keys.nextElement();
                    stringBuilder.append(nextElement.toString() + "=" + ((String) this.f254j.get(nextElement)).toString());
                    if (keys.hasMoreElements()) {
                        stringBuilder.append("&");
                    }
                }
            }
            byte[] bytes = EncodingUtils.getBytes(stringBuilder.toString(), "BASE64");
            if (KonyMain.f3656d > 4) {
                try {
                    getClass().getMethod("postUrl", new Class[]{String.class, byte[].class}).invoke(this, new Object[]{this.f255k, bytes});
                    return;
                } catch (Exception e) {
                    m211g();
                    return;
                }
            }
            m211g();
            return;
        }
        m211g();
    }

    public final void m233c(int i) {
        if (KonyMain.f3656d >= 7) {
            WebSettings settings = getSettings();
            switch (i) {
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                    settings.setDefaultZoom(ZoomDensity.FAR);
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                    settings.setDefaultZoom(ZoomDensity.MEDIUM);
                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                    settings.setDefaultZoom(ZoomDensity.CLOSE);
                default:
            }
        }
    }

    public final void m234c(boolean z) {
        this.f263s = z;
    }

    public final View m235d() {
        return this.f250f;
    }

    public final void m236d(int i) {
        this.f246B = i;
        this.f251g.height = i;
        post(new er(this));
    }

    public final void m237d(boolean z) {
        this.f264t = z;
    }

    public final void m238e() {
        this.f258n = true;
        new Handler().postDelayed(new eq(this), 0);
        KonyMain.getActivityContext().m4152a(null);
        m241f();
    }

    public final void m239e(int i) {
        this.f251g.width = i;
    }

    public final void m240e(boolean z) {
        getSettings().setUseWideViewPort(z);
    }

    public final void m241f() {
        FragmentManager supportFragmentManager = KonyMain.getActContext().getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(this.f268x);
        if (findFragmentByTag != null) {
            beginTransaction.remove(findFragmentByTag).commitAllowingStateLoss();
        }
    }

    public final void m242f(boolean z) {
        if (KonyMain.f3656d >= 7) {
            getSettings().setLoadWithOverviewMode(z);
        }
    }

    public final void m243g(boolean z) {
        getSettings().setCacheMode(-1);
        getSettings().setAppCacheEnabled(z);
        getSettings().setAppCachePath(KonyMain.getActivityContext().getCacheDir().getAbsolutePath());
    }

    public boolean handleRequest(String str) {
        if (KonyMain.f3657e) {
            Log.d("KonyWeb", "handleRequest " + str);
        }
        return this.f245A != null ? this.f245A.m1342a(str) : false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f246B < 0 && !this.f259o) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        switch (motionEvent.getAction()) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                this.f260p = y;
                this.f262r = x;
                ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                int abs = (int) Math.abs(y - this.f260p);
                if (((int) Math.abs(x - this.f262r)) > abs) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return false;
                } else if (abs > this.f261q) {
                    return true;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        requestFocus();
        return onTouchEvent;
    }
}
