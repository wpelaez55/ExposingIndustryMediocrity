package com.konylabs.android;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.hardware.SensorEvent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.provider.MediaStore.Images.Media;
import android.provider.Settings.Secure;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.ExploreByTouchHelper;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import android.widget.ViewFlipper;
import com.konylabs.api.C0369u;
import com.konylabs.api.ui.C0202e;
import com.konylabs.api.ui.C0220v;
import com.konylabs.api.ui.aD;
import com.konylabs.api.ui.bt;
import com.konylabs.api.ui.cu;
import com.konylabs.api.ui.cv;
import com.konylabs.api.ui.dB;
import com.konylabs.api.ui.eA;
import com.konylabs.api.ui.eG;
import com.konylabs.api.ui.eH;
import com.konylabs.api.ui.eK;
import com.konylabs.api.ui.fv;
import com.konylabs.api.ui.gL;
import com.konylabs.api.ui.hp;
import com.konylabs.api.ui.ic;
import com.konylabs.api.ui.id;
import com.konylabs.api.ui.ii;
import com.konylabs.ffi.ActivityResultListener;
import com.konylabs.ffi.ActivityResultPublisher;
import com.konylabs.gcm.C0225a;
import com.konylabs.libintf.C0235a;
import com.konylabs.search.SearchDataAdapter;
import com.konylabs.vm.C0245j;
import com.konylabs.vm.C0247l;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaTable;
import com.konylabs.vmintf.C0254b;
import com.konylabs.vmintf.C0262k;
import com.rsa.mobilesdk.sdk.BuildConfig;
import com.thirdparty.bumpapi.BumpInterface;
import com.thirdparty.bumpapi.C0272a;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;
import ny0k.C0284S;
import ny0k.aP;
import ny0k.aR;
import ny0k.aS;
import ny0k.aT;
import ny0k.ad;
import ny0k.al;
import ny0k.as;
import ny0k.aw;
import ny0k.az;
import ny0k.cH;
import ny0k.cK;
import ny0k.cW;
import ny0k.cm;

public class KonyMain extends FragmentActivity implements OnMenuItemClickListener, ActivityResultPublisher, C0235a, aP {
    private static Handler f3638B;
    private static Stack f3639C;
    private static C0125J f3640D;
    private static boolean f3641I;
    private static Vector f3642J;
    private static Vector f3643K;
    private static Function f3644L;
    private static int f3645M;
    private static boolean f3646N;
    private static boolean f3647R;
    private static String f3648T;
    private static boolean f3649U;
    private static int f3650V;
    private static int f3651W;
    private static Properties f3652Y;
    public static String f3653a;
    private static int ad;
    private static int ae;
    private static boolean af;
    private static C0245j ag;
    private static long al;
    private static boolean am;
    private static long an;
    private static Runnable ao;
    private static boolean ap;
    private static Runnable aq;
    private static ic au;
    private static id av;
    private static Uri aw;
    private static int ax;
    private static int ay;
    public static int f3654b;
    public static cK f3655c;
    public static int f3656d;
    public static boolean f3657e;
    public static boolean f3658f;
    public static boolean f3659g;
    public static boolean f3660h;
    public static boolean f3661i;
    public static boolean f3662j;
    public static int f3663k;
    static C0123G f3664m;
    private static String f3665n;
    private static WeakReference f3666o;
    private static Context f3667p;
    private static C0254b f3668q;
    private static Vector f3669r;
    private static Vector f3670s;
    private static String f3671v;
    private static boolean f3672w;
    private static cv f3673x;
    private static cH f3674y;
    private boolean f3675A;
    private volatile ImageView f3676E;
    private volatile ImageView f3677F;
    private C0120D f3678G;
    private ArrayList f3679H;
    private int f3680O;
    private AnimationDrawable f3681P;
    private VideoView f3682Q;
    private int f3683S;
    private ProgressBar f3684X;
    private ViewFlipper f3685Z;
    private C0272a aA;
    private HashMap aB;
    private int aC;
    private int aD;
    private LayoutParams aa;
    private String ab;
    private float ac;
    private Function ah;
    private String[] ai;
    private int aj;
    private boolean ak;
    private String ar;
    private Animation as;
    private Animation at;
    private InputMethodManager az;
    public boolean f3686l;
    private aD f3687t;
    private aD f3688u;
    private int f3689z;

    static {
        f3665n = "KonyMain";
        f3666o = null;
        f3667p = null;
        f3669r = null;
        f3670s = null;
        f3653a = null;
        f3671v = null;
        f3672w = false;
        f3674y = null;
        f3654b = 0;
        f3639C = new Stack();
        f3641I = false;
        f3642J = null;
        f3643K = null;
        f3644L = null;
        f3656d = 7;
        f3645M = 7;
        f3657e = false;
        f3658f = false;
        f3659g = false;
        f3660h = false;
        f3646N = false;
        f3661i = false;
        f3647R = true;
        f3648T = null;
        f3649U = false;
        f3650V = 0;
        f3651W = 1;
        ad = 1;
        f3662j = false;
        ae = 0;
        af = false;
        f3663k = 0;
        ag = new C0245j(null);
        al = SystemClock.elapsedRealtime();
        am = false;
        an = 0;
        ap = false;
        aq = new C0140m();
        ax = 1;
    }

    public KonyMain() {
        this.f3687t = null;
        this.f3688u = null;
        this.f3689z = -1;
        this.f3675A = false;
        this.f3680O = 250;
        this.f3684X = null;
        this.f3685Z = null;
        this.ab = null;
        this.ah = null;
        this.ai = null;
        this.aj = 0;
        this.ak = false;
        this.f3686l = false;
        C0142o c0142o = new C0142o(this);
        this.az = null;
        this.aA = null;
        this.aC = -1;
        this.aD = -1;
    }

    public static boolean m4056B() {
        return f3650V == C0262k.f1889b;
    }

    public static boolean m4057C() {
        return f3650V == C0262k.f1890c;
    }

    public static int m4058D() {
        return ad;
    }

    public static int m4059E() {
        return ae;
    }

    public static void m4060F() {
        al = SystemClock.elapsedRealtime();
    }

    public static C0245j m4061G() {
        Thread currentThread = Thread.currentThread();
        return currentThread instanceof cW ? ((cW) currentThread).m3865b() : ag;
    }

    private void m4075U() {
        boolean z = false;
        String property;
        try {
            InputStream b = ae == 3 ? C0128a.m21b() : null;
            if (b == null) {
                b = getAppContext().getAssets().open("application.properties");
            }
            Properties properties = new Properties();
            f3652Y = properties;
            properties.load(b);
            String property2 = f3652Y.getProperty("BUILD");
            if (property2 != null && property2.equals("debug")) {
                f3657e = true;
                f3658f = true;
                f3659g = true;
                f3660h = true;
                f3646N = true;
                property2 = f3652Y.getProperty("SkipDebugDialog");
                if (property2 != null && property2.trim().equals("true")) {
                    f3661i = true;
                }
            }
            property2 = f3652Y.getProperty("AppMode");
            if (property2 == null || !property2.trim().equals("native")) {
                if (property2 != null) {
                    if (property2.trim().equals("wrapper")) {
                        f3651W = 3;
                    }
                }
                if (property2 != null) {
                    if (property2.trim().equals("mixed")) {
                        f3651W = 2;
                    }
                }
            } else {
                f3651W = 1;
            }
            String property3 = f3652Y.getProperty("DevLang");
            if (property3 != null) {
                if (property3.equalsIgnoreCase("js")) {
                    f3650V = C0262k.f1890c;
                } else if (property3.equalsIgnoreCase("lua")) {
                    f3650V = C0262k.f1889b;
                }
            }
            property2 = f3652Y.getProperty("EnableActionBar");
            if (property2 != null && property2.equalsIgnoreCase("true")) {
                if (f3656d >= 11 && f3645M >= 11) {
                    z = true;
                }
                C0132e.m34a(z);
            }
            property = f3652Y.getProperty("AllowSelfSignedCerts");
            if (property != null) {
                if (property.trim().equals("None")) {
                    as.m1997a(0);
                } else if (property.trim().equals("Allow Bundled")) {
                    as.m1997a(as.f2105b);
                } else if (property.trim().equals("All")) {
                    as.m1997a(as.f2106c);
                }
            }
            property = f3652Y.getProperty("UseGooglePlayLocationServices");
            if (property != null && property.trim().equals("true")) {
                ad.m1960a(true);
            }
            b.close();
        } catch (Throwable e) {
            if (f3657e) {
                Log.d(f3665n, BuildConfig.FLAVOR + e.getMessage(), e);
            }
            if (null == null) {
                property = getDevLang();
                if (f3657e) {
                    Log.d(f3665n, "********** Preview.getDevLang() = " + property);
                }
                if (property.equalsIgnoreCase("js")) {
                    f3650V = C0262k.f1890c;
                } else if (property.equalsIgnoreCase("lua")) {
                    f3650V = C0262k.f1889b;
                }
            }
        }
        f3641I = true;
    }

    private void m4076V() {
        m4158c();
        m4168q();
        ad.m1964i();
        aS.m3536a().m3539a((Object) this);
        if (this.f3682Q != null && this.f3682Q.isPlaying()) {
            this.f3683S = this.f3682Q.getCurrentPosition();
            this.f3682Q.pause();
        }
        this.f3675A = false;
    }

    private static void m4077W() {
        C0225a.m1597a(2);
        az.m3554c();
        al.m4027c();
    }

    private void m4078X() {
        if (this.f3687t != null) {
            f3653a = this.f3687t.m433a();
        }
        if (!f3649U) {
            ab();
        }
        fv.m4428s();
        unregisterReceiver(this.f3678G);
        fv.m4393a(f3653a);
        gL.m4544j();
        eK.m3300e();
        bt.m881g();
        bt.m882i();
        dB.m1113e();
        eH.m3988a().m3990b();
        eG.m3985a().m3987b();
        C0132e.m29a();
        this.f3687t = null;
        f3666o = null;
        f3672w = true;
        System.gc();
        if (f3668q != null) {
            f3668q.m1776a(null);
        }
    }

    private RelativeLayout m4079Y() {
        String property;
        Uri uri;
        String str;
        String str2;
        Drawable c;
        View imageView;
        Object obj = 1;
        RelativeLayout relativeLayout = new RelativeLayout(this);
        f3649U = false;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (f3652Y != null) {
            if (f3652Y.getProperty("Splash-BG") != null) {
                relativeLayout.setBackgroundColor(hp.m3351b(f3652Y.getProperty("Splash-BG")));
            } else {
                relativeLayout.setBackgroundColor(Color.argb(MotionEventCompat.ACTION_MASK, 234, 243, 248));
            }
            String property2 = f3652Y.getProperty("Splash-LI");
            if (property2 != null && property2.equalsIgnoreCase("false")) {
                obj = null;
            }
            this.ab = f3652Y.getProperty("Splash-IMG");
            property = f3652Y.getProperty("Splash-ORIENTATION");
            property2 = f3652Y.getProperty("Splash-VIDEO");
            if (property2 == null || property2.equals(BuildConfig.FLAVOR)) {
                property2 = f3652Y.getProperty("Splash-ANIM-IMGLIST");
                if (!(property2 == null || property2.equals(BuildConfig.FLAVOR))) {
                    this.ai = property2.split(",");
                    property2 = f3652Y.getProperty("Splash-ANIM-DURATION");
                    if (!(property2 == null || property2.equals(BuildConfig.FLAVOR))) {
                        this.aj = Integer.parseInt(property2);
                    }
                }
                uri = null;
                str = null;
            } else {
                int indexOf = property2.indexOf(46);
                if (indexOf > 0) {
                    property2 = property2.substring(0, indexOf);
                }
                str = f3652Y.getProperty("Splash-VIDEO-INTERRUPTIBLE");
                if (str != null && str.equalsIgnoreCase("false")) {
                    f3647R = false;
                }
                str = property2;
                uri = Uri.parse("android.resource://" + getPackageName() + "/" + getResources().getIdentifier(property2, "raw", getApplicationContext().getPackageName()));
            }
            if (f3657e) {
                Log.d(f3665n, "splash image file name is :::::" + this.ab);
            }
            str2 = property;
        } else {
            relativeLayout.setBackgroundColor(Color.argb(MotionEventCompat.ACTION_MASK, 234, 243, 248));
            str2 = null;
            uri = null;
            str = null;
        }
        relativeLayout.setLayoutParams(layoutParams);
        this.f3676E = new ImageView(this);
        this.f3676E.setId(1);
        C0135h c0135h = new C0135h(this);
        property = c0135h.m66c();
        c0135h.m63a();
        if (property != null && !property.trim().equals(BuildConfig.FLAVOR)) {
            c = dB.m1112c(property);
        } else if (this.ab == null || this.ab.equals(BuildConfig.FLAVOR)) {
            this.ab = "splash_logo_k.png";
            c = dB.m1112c(this.ab);
        } else {
            c = dB.m1112c(this.ab);
        }
        Drawable a = this.ai != null ? m4082a(this.ai, this.aj) : null;
        if (c == null && a == null && str == null) {
            c = dB.m1112c("kony_logo.png");
            this.f3677F = new ImageView(this);
            this.f3677F.setImageDrawable(dB.m1112c("android.png"));
            this.f3677F.setScaleType(ScaleType.CENTER_INSIDE);
            this.ak = true;
        }
        if (c != null) {
            this.f3676E.setImageDrawable(c);
            if (c instanceof NinePatchDrawable) {
                this.f3676E.setScaleType(ScaleType.FIT_XY);
            } else {
                this.f3676E.setScaleType(ScaleType.CENTER_INSIDE);
            }
            relativeLayout.addView(this.f3676E, new LinearLayout.LayoutParams(-1, -1));
            if (this.f3677F != null) {
                relativeLayout.addView(this.f3677F, new LinearLayout.LayoutParams(-1, -1));
            }
            relativeLayout.setGravity(17);
        }
        ViewGroup.LayoutParams layoutParams2;
        if (str != null) {
            this.f3682Q = new VideoView(this);
            layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(13);
            this.f3682Q.setVideoURI(uri);
            this.f3682Q.setOnErrorListener(new C0117A(this));
            if (!f3647R) {
                this.f3682Q.setOnCompletionListener(new C0118B(this));
            }
            this.f3682Q.start();
            relativeLayout.addView(this.f3682Q, layoutParams2);
        } else if (a != null) {
            imageView = new ImageView(this);
            imageView.setId(2);
            layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(13);
            imageView.setLayoutParams(layoutParams2);
            imageView.setBackgroundDrawable(a);
            relativeLayout.addView(imageView, layoutParams2);
            imageView.post(new C0119C(this));
        }
        imageView = new TextView(this);
        imageView.setTextSize(14.0f);
        imageView.setGravity(81);
        relativeLayout.addView(imageView, new LinearLayout.LayoutParams(-1, -1));
        if (this.ak) {
            Animation scaleAnimation = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, (float) (m4166o() / 2), (float) (m4167p() / 2));
            Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            Animation animationSet = new AnimationSet(getActivityContext(), null);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(alphaAnimation);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setRepeatMode(2);
            scaleAnimation.setDuration(1000);
            alphaAnimation.setRepeatCount(-1);
            alphaAnimation.setRepeatMode(2);
            alphaAnimation.setDuration(1000);
            this.f3676E.startAnimation(animationSet);
            scaleAnimation = new ScaleAnimation(1.5f, 0.0f, 1.5f, 0.0f, (float) (m4166o() / 2), (float) (m4167p() / 2));
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            animationSet = new AnimationSet(getActivityContext(), null);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(alphaAnimation);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setRepeatMode(2);
            scaleAnimation.setDuration(1000);
            alphaAnimation.setRepeatCount(-1);
            alphaAnimation.setRepeatMode(2);
            alphaAnimation.setDuration(1000);
            this.f3677F.startAnimation(animationSet);
            relativeLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            obj = null;
        }
        if (obj != null) {
            View progressBar = new ProgressBar(this);
            progressBar.setIndeterminate(true);
            progressBar.setKeepScreenOn(true);
            ViewGroup.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            relativeLayout.addView(progressBar, layoutParams3);
        }
        if (str2 != null) {
            int i;
            if (str2.equalsIgnoreCase("portrait")) {
                if (f3656d >= 9) {
                    i = 7;
                }
                i = 1;
            } else if (str2.equalsIgnoreCase("landscape")) {
                i = f3656d >= 9 ? 6 : 0;
            } else if (str2.equalsIgnoreCase("natural")) {
                WindowManager windowManager = (WindowManager) getSystemService("window");
                Configuration configuration = getResources().getConfiguration();
                i = windowManager.getDefaultDisplay().getRotation();
                if (((i == 0 || i == 2) && configuration.orientation == 2) || ((i == 1 || i == 3) && configuration.orientation == 1)) {
                    i = f3656d >= 9 ? 6 : 0;
                } else {
                    if (f3656d >= 9) {
                        i = 7;
                    }
                    i = 1;
                }
            }
            setRequestedOrientation(i);
        }
        return relativeLayout;
    }

    private static void m4080Z() {
        if (f3657e) {
            Log.d(f3665n, "Checking for idle timeout");
        }
        if (an > 0 && !am && SystemClock.elapsedRealtime() - al >= an) {
            am = true;
            if (f3666o != null) {
                aD aDVar = ((KonyMain) f3666o.get()).f3687t;
                if (!ap && aDVar != null && aDVar.m487k()) {
                    eA.m4179a();
                    if (ao != null) {
                        ao.run();
                    }
                    ap = true;
                }
            }
        }
    }

    static /* synthetic */ int m4081a(KonyMain konyMain, int i) {
        return i;
    }

    private AnimationDrawable m4082a(String[] strArr, int i) {
        int i2 = 0;
        boolean z = false;
        for (String c : strArr) {
            Drawable c2 = dB.m1112c(c);
            if (c2 != null) {
                if (!z) {
                    z = true;
                    this.f3681P = new AnimationDrawable();
                    i2 = i <= 0 ? this.f3680O : (int) ((((float) i) / ((float) strArr.length)) * 1000.0f);
                }
                this.f3681P.addFrame(c2, i2);
            }
        }
        if (this.f3681P == null) {
            return null;
        }
        this.f3681P.setOneShot(false);
        return this.f3681P;
    }

    public static Drawable m4083a(String str) {
        if (str == null) {
            return null;
        }
        Drawable b;
        if (ae == 3) {
            b = C0128a.m20b(str);
            if (b != null) {
                return b;
            }
        }
        int indexOf = str.indexOf(46);
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        if (Character.isDigit(str.charAt(0))) {
            return null;
        }
        String toLowerCase = str.toLowerCase();
        if (f3657e) {
            Log.d(f3665n, "The Image file drawbale is " + toLowerCase);
        }
        indexOf = f3667p.getResources().getIdentifier(toLowerCase, "drawable", f3667p.getPackageName());
        if (indexOf <= 0) {
            return null;
        }
        try {
            b = f3667p.getResources().getDrawable(indexOf);
        } catch (OutOfMemoryError e) {
            if (f3657e) {
                Log.d(f3665n, "OOM************************************");
            }
            f3668q.m1777a(null);
            b = null;
        }
        if (b != null) {
            return b;
        }
        if (!f3657e) {
            return null;
        }
        Log.d(f3665n, "Image is not retrievable");
        return null;
    }

    public static void m4087a(int i) {
        if (i <= 0 || i > 3) {
            f3651W = 1;
        } else {
            f3651W = i;
        }
    }

    public static void m4088a(long j, Runnable runnable) {
        an = j;
        ao = runnable;
        am = false;
        ap = false;
        al = SystemClock.elapsedRealtime();
        f3638B.postDelayed(aq, j);
    }

    private void m4089a(Intent intent, boolean z) {
        if (f3654b != 1 || (intent.getFlags() & AccessibilityNodeInfoCompat.ACTION_DISMISS) != AccessibilityNodeInfoCompat.ACTION_DISMISS) {
            int a = C0133f.m40a(intent);
            if (f3654b != 1 || a != 1) {
                C0133f.m42a(intent, z);
            } else if (!(!z || showPreview() || f3653a == null)) {
                fv.m4406c(f3653a);
            }
            if (a == 2) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    Bundle bundle = extras.getBundle("push-notification-msg");
                    extras = extras.getBundle("push-notification-regid");
                    if (bundle != null || extras != null) {
                        if (f3654b == 1) {
                            C0225a.m1598a(intent, 1);
                        } else {
                            C0225a.m1598a(intent, 2);
                        }
                    }
                }
            }
        } else if (z && !showPreview() && f3653a != null) {
            fv.m4406c(f3653a);
        }
    }

    private void m4090a(Menu menu) {
        if (this.f3687t.f443e && f3670s != null) {
            for (int i = 0; i < f3670s.size(); i++) {
                cu cuVar = (cu) f3670s.elementAt(i);
                if (cuVar.m1045c()) {
                    MenuItem add = menu.add(0, cuVar.m1040a().hashCode(), 0, cuVar.m1044b());
                    if (C0132e.f27a) {
                        add.setShowAsAction(cuVar.m1047e());
                    }
                    Drawable d = cuVar.m1046d();
                    if (d != null) {
                        add.setIcon(d);
                    }
                    add.setOnMenuItemClickListener(this);
                }
            }
        }
    }

    public static void m4091a(cv cvVar) {
        f3673x = cvVar;
    }

    public static synchronized void m4092a(ii iiVar) {
        synchronized (KonyMain.class) {
            f3664m.m13a(iiVar);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                iiVar.run();
            } else {
                f3638B.post(iiVar);
            }
        }
    }

    public static void m4093a(Function function, Function function2, Function function3) {
        if (f3642J == null) {
            f3642J = new Vector();
            f3643K = new Vector();
        }
        if (function != null) {
            f3642J.add(function);
        }
        if (function2 != null) {
            f3643K.add(function2);
        }
        f3644L = function3;
    }

    public static void m4094a(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            f3638B.post(runnable);
        }
    }

    public static void m4095a(Runnable runnable, long j) {
        f3638B.postDelayed(runnable, j);
    }

    public static void m4096a(Runnable runnable, String str) {
        f3638B.removeCallbacks(runnable, str);
    }

    public static void m4097a(Vector vector) {
        f3669r = vector;
    }

    public static boolean m4099a(ic icVar, Uri uri, boolean z, int i, int i2, int i3) {
        if (f3666o == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (z) {
                intent.putExtra("crop", "true");
            }
            if (f3656d <= 3) {
                aw = null;
            } else if (i == 1) {
                ContentValues contentValues = new ContentValues(4);
                contentValues.put("title", "App captured");
                contentValues.put("description", "Captured via application");
                contentValues.put("mime_type", "image/jpeg");
                aw = ((KonyMain) f3666o.get()).getContentResolver().insert(Media.EXTERNAL_CONTENT_URI, contentValues);
                intent.putExtra("output", aw);
            } else {
                aw = null;
                ax = i2;
                ay = i3;
            }
            ((KonyMain) f3666o.get()).startActivityForResult(intent, 555);
            au = icVar;
            return true;
        } catch (ActivityNotFoundException e) {
            if (f3657e) {
                Log.d(f3665n, BuildConfig.FLAVOR + e.getMessage());
            }
            return false;
        }
    }

    public static boolean m4100a(id idVar, String str) {
        if (f3657e) {
            Log.d(f3665n, "SDK API " + VERSION.SDK);
        }
        if (f3666o == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            if (str != null) {
                intent.setType(str);
            } else {
                intent.setType("image/*");
            }
            ((KonyMain) f3666o.get()).startActivityForResult(intent, 666);
            av = idVar;
            return true;
        } catch (ActivityNotFoundException e) {
            if (f3657e) {
                Log.d(f3665n, BuildConfig.FLAVOR + e.getMessage());
            }
            return false;
        }
    }

    public static boolean m4101a(String str, String str2) {
        try {
            String str3 = "android.intent.action.VIEW";
            StringBuilder append = new StringBuilder().append("sms:");
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            Intent intent = new Intent(str3, Uri.parse(append.append(str).toString()));
            if (str2 != null) {
                intent.putExtra("sms_body", str2);
            }
            if (f3666o != null) {
                ((KonyMain) f3666o.get()).startActivity(intent);
            } else {
                intent.setFlags(268435456);
                f3667p.startActivity(intent);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            if (f3657e) {
                Log.d(f3665n, BuildConfig.FLAVOR + e.getMessage());
            }
            return false;
        }
    }

    public static boolean m4103a(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2, boolean z, Uri[] uriArr) {
        if (f3666o == null) {
            return false;
        }
        Intent intent;
        String str3;
        CharSequence fromHtml;
        Object obj = 1;
        try {
            if (Integer.parseInt(VERSION.SDK) > 3) {
                obj = null;
            }
            Object obj2 = obj;
        } catch (NumberFormatException e) {
            int i = 1;
        }
        if (obj2 == null && uriArr != null) {
            try {
                if (uriArr.length != 1) {
                    intent = new Intent("android.intent.action.SEND_MULTIPLE");
                    str3 = "android.intent.extra.EMAIL";
                    if (strArr == null) {
                        strArr = new String[]{BuildConfig.FLAVOR};
                    }
                    intent.putExtra(str3, strArr);
                    if (strArr2 != null) {
                        intent.putExtra("android.intent.extra.CC", strArr2);
                    }
                    if (strArr3 != null) {
                        intent.putExtra("android.intent.extra.BCC", strArr3);
                    }
                    if (str != null) {
                        intent.putExtra("android.intent.extra.SUBJECT", str);
                    }
                    if (str2 != null) {
                        str3 = "android.intent.extra.TEXT";
                        if (z) {
                            fromHtml = Html.fromHtml(str2);
                        }
                        intent.putExtra(str3, fromHtml);
                    }
                    if (z) {
                        intent.setType("application/octet-stream");
                    } else {
                        intent.setType("text/html");
                    }
                    if (uriArr != null && uriArr.length > 0) {
                        if (obj2 == null || uriArr.length == 1) {
                            intent.putExtra("android.intent.extra.STREAM", uriArr[0]);
                        } else {
                            ArrayList arrayList = new ArrayList(uriArr.length);
                            for (Object obj3 : uriArr) {
                                if (f3657e) {
                                    Log.d(f3665n, "Attaching : " + obj3);
                                }
                                arrayList.add(obj3);
                            }
                            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                        }
                        intent.setType("image/*");
                    }
                    ((KonyMain) f3666o.get()).startActivity(Intent.createChooser(intent, "Choose"));
                    return true;
                }
            } catch (ActivityNotFoundException e2) {
                if (f3657e) {
                    Log.d(f3665n, BuildConfig.FLAVOR + e2.getMessage());
                }
                return false;
            }
        }
        intent = new Intent("android.intent.action.SEND");
        str3 = "android.intent.extra.EMAIL";
        if (strArr == null) {
            strArr = new String[]{BuildConfig.FLAVOR};
        }
        intent.putExtra(str3, strArr);
        if (strArr2 != null) {
            intent.putExtra("android.intent.extra.CC", strArr2);
        }
        if (strArr3 != null) {
            intent.putExtra("android.intent.extra.BCC", strArr3);
        }
        if (str != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str);
        }
        if (str2 != null) {
            str3 = "android.intent.extra.TEXT";
            if (z) {
                fromHtml = Html.fromHtml(str2);
            }
            intent.putExtra(str3, fromHtml);
        }
        if (z) {
            intent.setType("application/octet-stream");
        } else {
            intent.setType("text/html");
        }
        if (obj2 == null) {
        }
        intent.putExtra("android.intent.extra.STREAM", uriArr[0]);
        intent.setType("image/*");
        ((KonyMain) f3666o.get()).startActivity(Intent.createChooser(intent, "Choose"));
        return true;
    }

    private static String aa() {
        return f3639C.size() > 0 ? (String) f3639C.pop() : null;
    }

    private void ab() {
        if (f3657e) {
            Log.d(f3665n, "********* destroySplashScreen() **********");
        }
        if (!f3649U) {
            if (this.f3676E != null) {
                this.f3676E.setAnimation(null);
                this.f3676E.setImageDrawable(null);
            }
            if (this.f3682Q != null) {
                this.f3682Q.stopPlayback();
                this.f3685Z.removeViewAt(0);
                this.f3682Q = null;
            } else if (this.f3681P != null) {
                this.f3681P.stop();
                this.f3681P = null;
            }
            if (this.f3677F != null) {
                this.f3677F.setAnimation(null);
                this.f3677F.setImageDrawable(null);
            }
        }
        f3649U = true;
    }

    static /* synthetic */ int m4104b(KonyMain konyMain, int i) {
        return i;
    }

    public static int m4105b(String str) {
        if (str == null) {
            return 0;
        }
        int indexOf = str.indexOf(46);
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        if (Character.isDigit(str.charAt(0))) {
            return 0;
        }
        String toLowerCase = str.toLowerCase();
        if (f3657e) {
            Log.d(f3665n, "The Image file drawbale is " + toLowerCase);
        }
        return f3667p.getResources().getIdentifier(toLowerCase, "drawable", f3667p.getPackageName());
    }

    public static void m4109b(int i) {
        ae = i;
    }

    private void m4110b(Menu menu) {
        if (f3669r != null) {
            for (int i = 0; i < f3669r.size(); i++) {
                cu cuVar = (cu) f3669r.elementAt(i);
                if (cuVar.m1045c()) {
                    MenuItem add = menu.add(cuVar.m1044b());
                    if (C0132e.f27a) {
                        add.setShowAsAction(cuVar.m1047e());
                    }
                    Drawable d = cuVar.m1046d();
                    if (d != null) {
                        add.setIcon(d);
                    }
                    add.setOnMenuItemClickListener(this.f3687t);
                }
            }
        }
    }

    public static void m4111b(Vector vector) {
        f3670s = vector;
        f3672w = true;
        if (f3653a != null && C0132e.f27a && getActivityContext() != null) {
            getActivityContext().invalidateOptionsMenu();
        }
    }

    static /* synthetic */ int m4112c(KonyMain konyMain, int i) {
        return i;
    }

    public static void m4115c(int i) {
        if (f3654b == 1 && f3644L != null) {
            int i2;
            if (f3656d < 14) {
                i2 = 1;
            } else if (i == 80) {
                i = KonyApplication.KONY_TRIM_MEMORY_COMPLETE;
                i2 = 1;
            } else if (i == 60) {
                i = KonyApplication.KONY_TRIM_MEMORY_MODERATE;
                i2 = 1;
            } else if (f3656d < 16) {
                i2 = 0;
            } else if (i == 15) {
                i = KonyApplication.KONY_TRIM_MEMORY_RUNNING_CRITICAL;
                i2 = 1;
            } else if (i == 10) {
                i = KonyApplication.KONY_TRIM_MEMORY_RUNNING_LOW;
                i2 = 1;
            } else if (i == 5) {
                i = KonyApplication.KONY_TRIM_MEMORY_RUNNING_MODERATE;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                Message obtain = Message.obtain();
                obtain.what = 7;
                obtain.obj = f3644L;
                Serializable luaTable = new LuaTable(0, 1);
                luaTable.setTable("level", Double.valueOf((double) i));
                Bundle bundle = new Bundle(3);
                bundle.putSerializable("key0", luaTable);
                obtain.setData(bundle);
                f3640D.f13a.sendMessage(obtain);
            }
        }
    }

    public static boolean m4118d(String str) {
        try {
            Intent intent = new Intent("android.intent.action.DIAL");
            StringBuilder append = new StringBuilder().append("tel:");
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            intent.setData(Uri.parse(append.append(str).toString()));
            if (f3666o != null) {
                ((KonyMain) f3666o.get()).startActivity(intent);
            } else {
                intent.setFlags(268435456);
                f3667p.startActivity(intent);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            if (f3657e) {
                Log.d(f3665n, BuildConfig.FLAVOR + e.getMessage());
            }
            return false;
        }
    }

    public static boolean m4120e(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            if (f3666o != null) {
                ((KonyMain) f3666o.get()).startActivity(intent);
            } else {
                intent.setFlags(268435456);
                f3667p.startActivity(intent);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            if (f3657e) {
                Log.d(f3665n, BuildConfig.FLAVOR + e.getMessage());
            }
            return false;
        }
    }

    public static Handler m4121f() {
        return f3640D.f13a;
    }

    public static boolean m4123f(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri parse = Uri.parse(str);
            if (str.trim().startsWith("rtsp")) {
                intent.setData(parse);
            } else {
                intent.setDataAndType(parse, "video/*");
            }
            if (f3666o != null) {
                ((KonyMain) f3666o.get()).startActivity(intent);
            } else {
                intent.setFlags(268435456);
                f3667p.startActivity(intent);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            if (f3657e) {
                Log.d(f3665n, BuildConfig.FLAVOR + e.getMessage());
            }
            return false;
        }
    }

    public static C0245j m4125g() {
        return ag;
    }

    public static KonyMain getActContext() {
        return f3666o == null ? null : (KonyMain) f3666o.get();
    }

    public static KonyMain getActivityContext() {
        return f3666o == null ? null : (KonyMain) f3666o.get();
    }

    public static Context getAppContext() {
        return f3667p;
    }

    public static String getN() {
        return getActivityContext() != null ? getActivityContext().getClass().getSimpleName() : null;
    }

    public static String getName() {
        return f3667p.getPackageName();
    }

    public static String getTimeStamp() {
        return f3652Y.getProperty(new String(Base64.decode("VmFy", 0)));
    }

    private InputStream m4128h(String str) throws IOException {
        try {
            if (str.startsWith("http://") || str.startsWith("https://")) {
                throw new IOException();
            }
            f3655c.m2134b();
            return null;
        } catch (IOException e) {
            if (f3658f) {
                Log.w(f3665n, "Failed to load resource : " + str);
            }
            throw e;
        }
    }

    public static void m4129h() {
        an = 0;
        ao = null;
        f3638B.removeCallbacks(aq);
    }

    public static void m4132j() {
        if (f3639C != null) {
            f3639C.clear();
        }
        f3642J = null;
        f3643K = null;
        ag.m1726a(null);
        ag = new C0245j(f3640D.f13a);
    }

    public static String m4136m() {
        return f3653a;
    }

    public static boolean m4139r() {
        if (f3648T.equalsIgnoreCase("000000000000000")) {
            return false;
        }
        aR.m1929a();
        return aR.f2020a.get(1) != null;
    }

    public static boolean m4140s() {
        if (f3648T.equalsIgnoreCase("000000000000000")) {
            return false;
        }
        aR.m1929a();
        return aR.f2020a.get(3) != null;
    }

    public static boolean m4141t() {
        Configuration configuration = f3667p.getResources().getConfiguration();
        return configuration.touchscreen == 3 || configuration.touchscreen == 2;
    }

    public static boolean m4142u() {
        String string = Secure.getString(f3667p.getContentResolver(), "location_providers_allowed");
        if (string == null) {
            return false;
        }
        if (f3646N) {
            Log.v(f3665n, " Location providers: " + string);
        }
        return true;
    }

    public static C0254b m4143x() {
        return f3668q;
    }

    public static void m4144y() {
        KonyMain actContext = getActContext();
        if (actContext != null) {
            actContext.m4076V();
            m4077W();
            actContext.m4078X();
        }
        System.exit(0);
    }

    public static int m4145z() {
        return f3651W;
    }

    final void m4146A() {
        f3647R = true;
        if (f3653a != null) {
            ab();
            f3654b = 1;
            if (this.f3687t != null) {
                this.f3685Z.showNext();
                setRequestedOrientation(this.f3687t.m476f());
                return;
            }
            fv.m4395b(f3653a).m4455g();
        }
    }

    public final void m4147a() {
        if (!f3662j) {
            m4094a(new C0139l(this));
        }
    }

    public final void m4148a(int i, SensorEvent sensorEvent) {
        if (this.f3687t != null && this.f3687t.m481g() && sensorEvent.values.length >= 3) {
            float f = sensorEvent.values[1];
            float f2 = sensorEvent.values[2];
            if (f < -45.0f && f > -135.0f) {
                this.aC = 1;
            } else if (f > 45.0f && f < 135.0f) {
                this.aC = 1;
            } else if (f2 > 45.0f) {
                this.aC = 2;
            } else if (f2 < -45.0f) {
                this.aC = 2;
            }
            if (this.aC != -1 && this.aC != this.aD) {
                if (f3660h) {
                    Log.i(f3665n, "****** Should callback now - Orientation Configuration changed to " + this.aC + " currentformID = " + f3653a);
                }
                this.f3687t.m477f(this.aC);
                gL.m4544j();
                this.aD = this.aC;
            }
        }
    }

    public final void m4149a(int i, String str) {
        Context actContext = getActContext();
        if (actContext == null) {
            Log.d(f3665n, "Error code=" + i);
            if (f3657e) {
                Log.d(f3665n, str);
                return;
            } else {
                Log.d(f3665n, "Unexpected error");
                return;
            }
        }
        C0220v c0220v = new C0220v(actContext);
        c0220v.m1586a("Error code " + i);
        if (!f3657e) {
            str = "Unexpected error";
        }
        c0220v.m1589b(str);
        c0220v.m1588b(1);
        c0220v.m1585a(new C0335p(this));
        c0220v.m1583a();
    }

    public final void m4150a(aD aDVar) {
        if (am && !ap && aDVar.m487k()) {
            if (ao != null) {
                ao.run();
            }
            ap = true;
            f3664m.m12a();
            return;
        }
        String a = aDVar.m433a();
        if (a.equals(f3653a) && this.f3687t == aDVar) {
            f3664m.m12a();
            return;
        }
        fv fvVar;
        int i;
        int i2;
        f3672w = true;
        this.as = null;
        this.at = null;
        ViewGroup viewGroup = (ViewGroup) aDVar.m464d();
        if (viewGroup.getParent() != null) {
            if (f3657e) {
                Log.d(f3665n, "The current form has parent!!! ");
            }
            ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
        }
        if (a.equals(f3653a)) {
            fvVar = null;
            i = 0;
            i2 = 0;
        } else {
            int v;
            if (!(f3653a == null || this.f3687t == null)) {
                this.f3687t.m484i();
            }
            this.ar = f3653a;
            this.f3688u = this.f3687t;
            fv b = fv.m4395b(a);
            fv b2 = fv.m4395b(this.ar);
            boolean x = b != null ? b.m4466x() : false;
            if (!this.f3686l) {
                if (b != null) {
                    this.as = cm.m2172a(b.m4465w(), false);
                    i = b.m4465w();
                } else {
                    i = 0;
                }
                if (b2 != null) {
                    this.at = cm.m2172a(b2.m4464v(), false);
                    v = b2.m4464v();
                }
                v = 0;
            } else if (x) {
                if (b != null) {
                    this.as = cm.m2172a(b.m4464v(), true);
                    i = b.m4464v();
                } else {
                    i = 0;
                }
                if (b2 != null) {
                    this.at = cm.m2172a(b2.m4465w(), true);
                    v = b2.m4465w();
                }
                v = 0;
            } else {
                v = 0;
                i = 0;
            }
            this.f3685Z.setInAnimation(this.as);
            this.f3685Z.setOutAnimation(this.at);
            fv fvVar2 = b2;
            i2 = i;
            i = v;
            fvVar = fvVar2;
        }
        if (f3671v == null) {
            f3671v = a;
        }
        m4158c();
        m4168q();
        this.f3687t = aDVar;
        f3653a = a;
        viewGroup.clearFocus();
        this.f3685Z.addView(aDVar.m464d());
        if (f3647R) {
            ViewGroup.LayoutParams layoutParams;
            View q;
            int measuredHeight;
            ViewGroup.LayoutParams layoutParams2;
            View r;
            int i3;
            if (!f3648T.equalsIgnoreCase("000000000000000") && m4140s()) {
                if (!aDVar.m481g() || aDVar.m476f() == 2) {
                    aS.m3536a().m3539a((Object) this);
                } else {
                    aS.m3536a().m3540a((aP) this);
                }
            }
            if (!f3649U) {
                ab();
            }
            setRequestedOrientation(aDVar.m476f());
            if (this.f3688u != null && this.f3688u.m492p()) {
                setContentView(this.f3685Z);
            }
            if (this.f3687t.m492p()) {
                layoutParams = new LayoutParams(-1, -2, 48);
                q = this.f3687t.m493q();
                if (q != null) {
                    q.measure(MeasureSpec.makeMeasureSpec(getActContext().m4166o(), ExploreByTouchHelper.INVALID_ID), 0);
                    measuredHeight = q.getMeasuredHeight();
                } else {
                    measuredHeight = 0;
                }
                layoutParams2 = new LayoutParams(-1, -2, 80);
                r = this.f3687t.m494r();
                if (r != null) {
                    r.measure(MeasureSpec.makeMeasureSpec(getActContext().m4166o(), ExploreByTouchHelper.INVALID_ID), 0);
                    i3 = measuredHeight;
                    measuredHeight = r.getMeasuredHeight();
                } else {
                    i3 = measuredHeight;
                    measuredHeight = 0;
                }
            } else {
                measuredHeight = 0;
                layoutParams = null;
                r = null;
                q = null;
                layoutParams2 = null;
                i3 = 0;
            }
            if (!(q == null || layoutParams == null)) {
                addContentView(q, layoutParams);
            }
            if (!(r == null || layoutParams2 == null)) {
                addContentView(r, layoutParams2);
            }
            if (!(i3 == 0 && measuredHeight == 0)) {
                this.aa.setMargins(0, i3, 0, measuredHeight);
                this.f3685Z.setLayoutParams(this.aa);
            }
            this.f3685Z.showNext();
        }
        getWindow().setSoftInputMode(aDVar.m470e());
        if (this.ar != null && f3672w) {
            if (!(cm.m2174a(i2) || this.f3688u == null)) {
                this.f3685Z.removeView(this.f3688u.m464d());
            }
            if ((cm.m2174a(i2) || cm.m2174a(i)) && (fvVar == null || !fvVar.m4460n())) {
                if (this.at != null) {
                    AnimationListener c0121e = new C0121E(this);
                    c0121e.m10a(1);
                    c0121e.f4a = i2;
                    c0121e.f5b = i;
                    c0121e.f6c = this.f3686l;
                    c0121e.m11a(this.as);
                    this.as.setAnimationListener(c0121e);
                    c0121e = new C0121E(this);
                    c0121e.m10a(0);
                    c0121e.f4a = i2;
                    c0121e.f5b = i;
                    c0121e.f6c = this.f3686l;
                    c0121e.m11a(this.at);
                    this.at.setAnimationListener(c0121e);
                    if (fvVar != null) {
                        fvVar.m4432a(this.ac);
                    }
                } else {
                    if (this.f3688u != null) {
                        this.f3685Z.removeView(this.f3688u.m464d());
                    }
                    fv.m4393a(this.ar);
                }
                if (aw.m2002a().m2007b()) {
                    m4147a();
                }
                aDVar.m489m();
                aDVar.focusableViewAvailable(aDVar.f439a);
                if (C0132e.f27a && f3672w) {
                    invalidateOptionsMenu();
                }
                this.f3686l = false;
            }
            fv.m4393a(this.ar);
        }
        f3664m.m12a();
        if (aw.m2002a().m2007b()) {
            m4147a();
        }
        aDVar.m489m();
        aDVar.focusableViewAvailable(aDVar.f439a);
        invalidateOptionsMenu();
        this.f3686l = false;
    }

    public final void m4151a(fv fvVar, boolean z) {
        String t = fvVar.m4462t();
        fvVar.m4459m();
        if (!(t.equals(f3653a) || this.f3686l || f3653a == null || this.f3687t == null || this.f3687t.f442d == 4)) {
            String str = f3653a;
            int search = f3639C.search(t);
            if (search != -1) {
                for (int i = 0; i < search; i++) {
                    f3639C.pop();
                }
            } else if (!str.equals(t)) {
                if (f3639C.size() <= 0 || !((String) f3639C.peek()).equals(t)) {
                    f3639C.push(str);
                } else {
                    f3639C.pop();
                }
            }
        }
        fvVar.m4450c(z);
    }

    public final void m4152a(Function function) {
        this.ah = function;
    }

    public final void m4153a(LuaError luaError) {
        if (luaError != null) {
            m4149a(luaError.getErrorCode(), luaError.getErrorMessage());
        }
    }

    public final void m4154a(aT aTVar) {
        if (this.f3679H != null) {
            this.f3679H.add(aTVar);
        }
    }

    public final void m4155b() {
        m4094a(new C0145s(this));
    }

    public final void m4156b(aT aTVar) {
        if (this.f3679H != null) {
            this.f3679H.remove(aTVar);
        }
    }

    public final Drawable m4157c(String str) {
        Drawable bitmapDrawable;
        IOException e;
        try {
            InputStream h = m4128h(str);
            if (h == null) {
                return null;
            }
            bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeStream(h));
            try {
                h.close();
                return bitmapDrawable;
            } catch (IOException e2) {
                e = e2;
                if (f3657e) {
                    return bitmapDrawable;
                }
                Log.d(f3665n, BuildConfig.FLAVOR + e.getMessage());
                return bitmapDrawable;
            }
        } catch (IOException e3) {
            IOException iOException = e3;
            bitmapDrawable = null;
            e = iOException;
            if (f3657e) {
                return bitmapDrawable;
            }
            Log.d(f3665n, BuildConfig.FLAVOR + e.getMessage());
            return bitmapDrawable;
        }
    }

    public final void m4158c() {
        m4094a(new C0146t(this));
    }

    public final boolean m4159c(aT aTVar) {
        return this.f3679H != null ? this.f3679H.contains(aTVar) : false;
    }

    public final void m4160d() {
        onSearchRequested();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.ac = motionEvent.getRawY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void m4161e() {
        f3640D.f13a.sendEmptyMessage(0);
        if (this.f3687t != null) {
            f3653a = this.f3687t.m433a();
        }
        if (f3653a != null) {
            fv.m4393a(f3653a);
        }
        gL.m4544j();
        bt.m881g();
        bt.m882i();
        dB.m1113e();
        this.f3687t = null;
        this.f3685Z.addView(m4079Y(), new ViewGroup.LayoutParams(-1, -1));
    }

    public int getAppSourceLocation() {
        return 1;
    }

    protected String getDevLang() {
        return null;
    }

    public Bitmap getPreviewBitmap(String str) {
        return ae == 3 ? C0128a.m22c(str) : null;
    }

    public InputStream getPreviewResource(String str) {
        return ae == 3 ? C0128a.m17a(str) : null;
    }

    public Function getStartupMethod() {
        return null;
    }

    public final void m4162i() {
        String aa = aa();
        if (aa != null) {
            fv.m4406c(aa);
        }
    }

    public final void m4163k() {
        this.f3687t = null;
        this.f3688u = null;
        f3671v = null;
        f3653a = null;
        m4075U();
        this.f3677F = null;
        this.ak = false;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            this.f3685Z.addView(m4079Y(), new ViewGroup.LayoutParams(-1, -1));
            this.f3685Z.showNext();
            return;
        }
        m4094a(new C0141n(this));
    }

    public final aD m4164l() {
        return this.f3687t;
    }

    public final String m4165n() {
        return this.ar;
    }

    public final int m4166o() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 555) {
            if (au == null) {
                return;
            }
            if (i2 == -1) {
                if (aw == null && f3656d > 3) {
                    Bitmap bitmap = (Bitmap) intent.getExtras().get("data");
                    if (bitmap != null) {
                        int i3 = ax;
                        int i4 = ay;
                        aw = C0202e.m1283a(bitmap, i3);
                        bitmap.recycle();
                    }
                }
                if (aw == null) {
                    aw = intent.getData();
                }
                if (aw != null) {
                    if (f3656d >= 11) {
                        ContentValues contentValues = new ContentValues(1);
                        contentValues.put("orientation", Integer.valueOf(C0202e.m1278a(aw)));
                        if (f3667p != null) {
                            f3667p.getContentResolver().update(aw, contentValues, null, null);
                        }
                    }
                    au.m1402a(true, aw);
                    return;
                }
                au.m1402a(false, aw);
                return;
            }
            au.m1402a(false, null);
        } else if (i == 666) {
            if (av == null) {
                return;
            }
            if (i2 == -1) {
                av.m1403a(true, intent.getData());
                return;
            }
            av.m1403a(false, null);
        } else if (this.aB != null) {
            ActivityResultListener activityResultListener = (ActivityResultListener) this.aB.get(Integer.valueOf(i));
            if (activityResultListener != null) {
                if (f3657e) {
                    Log.d(f3665n, "Calling onActivityResult Callback to FFI with requestCode " + i);
                }
                activityResultListener.onActivityResult(i, i2, intent);
            }
        }
    }

    public void onBackPressed() {
        if (this.ah != null) {
            try {
                this.ah.execute(null);
            } catch (Exception e) {
                if (f3657e) {
                    e.printStackTrace();
                }
            }
        } else if (f3653a == null || this.f3687t == null || (f3653a == f3671v && this.f3687t.m482h() == null)) {
            super.onBackPressed();
        } else {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = new C0334H();
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("hideProgress", Boolean.valueOf(true));
            obtain.setData(bundle);
            f3640D.f13a.sendMessage(obtain);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i = 0;
        super.onConfigurationChanged(configuration);
        int i2 = configuration.orientation;
        if (this.f3689z != i2) {
            if (f3653a == null && f3653a == null && !this.ak) {
                if (this.ab != null && this.f3685Z.getChildCount() > 0) {
                    ImageView imageView = (ImageView) ((RelativeLayout) this.f3685Z.getChildAt(0)).findViewById(1);
                    if (imageView != null) {
                        imageView.setImageDrawable(dB.m1112c(this.ab));
                    }
                }
                if (this.ai != null && this.f3685Z.getChildCount() > 0) {
                    View findViewById = ((RelativeLayout) this.f3685Z.getChildAt(0)).findViewById(2);
                    if (findViewById != null) {
                        ((ImageView) findViewById).setBackgroundDrawable(m4082a(this.ai, this.aj));
                        this.f3681P.start();
                    }
                }
            }
            this.f3689z = i2;
            if (eK.m3302f()) {
                eK.m3294a().m3310g();
            }
            if (this.f3687t != null && this.f3687t.m481g()) {
                this.f3687t.m477f(i2);
            } else if (f3653a != null) {
                fv.m4395b(f3653a).handleOrientationChange(i2);
            }
            while (i < gL.f4138a.size()) {
                ((gL) gL.f4138a.get(i)).handleOrientationChange(i2);
                i++;
            }
        }
        if (C0284S.m1823a((Context) this).m1847f() != null) {
            C0284S.m1823a((Context) this).m1845e();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3675A = true;
        f3666o = new WeakReference(this);
        f3667p = getApplicationContext();
        if (f3648T == null) {
            f3648T = "000000000000000";
            try {
                f3656d = Integer.parseInt(VERSION.SDK);
                f3645M = getApplicationInfo().targetSdkVersion;
                String deviceId = ((TelephonyManager) f3667p.getSystemService("phone")).getDeviceId();
                if (deviceId == null) {
                    deviceId = f3648T;
                }
                f3648T = deviceId;
            } catch (NumberFormatException e) {
            } catch (SecurityException e2) {
                if (f3657e) {
                    Log.d(f3665n, "No Permissions To Read Device ID");
                }
            }
        }
        if (!f3641I) {
            m4075U();
        }
        if (!C0132e.f27a) {
            requestWindowFeature(1);
        }
        if (!f3657e) {
            cK.m2130c();
        }
        if (f3657e) {
            Log.d(f3665n, "OnCreate");
        }
        ad = getAppSourceLocation();
        af = C0369u.m2364a(1);
        this.f3679H = new ArrayList();
        this.f3678G = new C0120D();
        registerReceiver(this.f3678G, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        m4089a(getIntent(), true);
        this.f3685Z = new ViewFlipper(this);
        this.aa = new LayoutParams(-1, -1);
        this.aa.gravity = 51;
        this.f3685Z.setLayoutParams(this.aa);
        this.f3685Z.setAnimateFirstView(false);
        setContentView(this.f3685Z);
        if (C0132e.f27a) {
            C0132e.m30a(getActionBar());
            C0132e.m37c(false);
        }
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            f3663k = getResources().getDimensionPixelSize(identifier);
        }
        if (f3638B == null) {
            f3664m = new C0123G(this);
            if (f3659g) {
                Thread currentThread = Thread.currentThread();
                currentThread.setUncaughtExceptionHandler(new C0147u(this, currentThread.getUncaughtExceptionHandler()));
            }
            f3655c = new cK(getApplicationContext());
            f3638B = new C0148v(this);
        }
        if (f3640D == null) {
            C0254b a = C0262k.m1785a(f3650V);
            f3668q = a;
            if (a != null) {
                f3668q.m1776a((C0235a) this);
            }
            C0125J c0125j = new C0125J();
            f3640D = c0125j;
            c0125j.setUncaughtExceptionHandler(new C0150y(this));
            f3640D.start();
            try {
                Thread.sleep(200);
            } catch (Exception e3) {
                if (f3657e) {
                    Log.d(f3665n, BuildConfig.FLAVOR + e3.getMessage());
                }
            }
            f3640D.f13a.sendEmptyMessage(0);
            this.f3685Z.addView(m4079Y(), new ViewGroup.LayoutParams(-1, -1));
        } else if (f3654b != 1) {
            this.f3685Z.addView(m4079Y(), new ViewGroup.LayoutParams(-1, -1));
        }
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 999:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setTitle("Network request");
                progressDialog.setMessage("Please wait while loading...");
                progressDialog.setIndeterminate(true);
                return progressDialog;
            default:
                return null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        preparePreviewOptionsMenu(menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        m4078X();
        if (f3657e) {
            Log.d(f3665n, "onDestroy");
        }
        super.onDestroy();
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (f3673x == null || f3670s == null) {
            return false;
        }
        for (int i = 0; i < f3670s.size(); i++) {
            cu cuVar = (cu) f3670s.elementAt(i);
            if (menuItem.getItemId() == cuVar.m1040a().hashCode()) {
                f3673x.m1048a(cuVar);
                return true;
            }
        }
        return false;
    }

    protected void onNewIntent(Intent intent) {
        m4089a(intent, false);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.f3687t.m495s();
        return true;
    }

    protected void onPause() {
        if (f3657e) {
            Log.d(f3665n, "onPause");
        }
        if (C0247l.f1850b != null) {
            C0247l.f1850b.m1760a();
        }
        m4076V();
        super.onPause();
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case 777:
                ((TimePickerDialog) dialog).updateTime(0, 0);
            default:
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (this.f3687t != null) {
            this.f3687t.m485j();
        }
        if (!(this.f3687t == null || !f3672w || (f3669r == null && f3670s == null))) {
            menu.clear();
            m4168q();
            if (this.f3687t.f444f == 0) {
                m4090a(menu);
                m4110b(menu);
            } else {
                m4110b(menu);
                m4090a(menu);
            }
            preparePreviewOptionsMenu(menu);
            f3672w = false;
        }
        super.onPrepareOptionsMenu(menu);
        return menu.size() > 0;
    }

    protected void onResume() {
        super.onResume();
        if (f3654b == 1) {
            boolean z = this.f3675A;
        }
        ad.m1963h();
        if (this.f3682Q != null) {
            this.f3682Q.seekTo(this.f3683S);
            this.f3682Q.start();
            this.f3683S = 0;
        }
        if (aw.m2002a().m2008c()) {
            m4147a();
        }
        if (!(f3648T.equalsIgnoreCase("000000000000000") || !m4140s() || this.f3687t == null || !this.f3687t.m481g() || this.f3687t.m476f() == 2)) {
            aS.m3536a().m3540a((aP) this);
        }
        m4080Z();
        C0225a.m1597a(1);
        if (f3657e) {
            Log.d(f3665n, "onResume");
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        if (f3657e) {
            Log.d(f3665n, "Save instance state");
        }
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        if (f3653a == null || !fv.m4395b(f3653a).m4457k()) {
            return false;
        }
        SearchDataAdapter.getInstance().raiseOnSelectCallback();
        return super.onSearchRequested();
    }

    protected void onStart() {
        super.onStart();
        if (f3643K != null) {
            int size = f3643K.size();
            Vector vector = null;
            int i = 0;
            while (i < size) {
                Vector vector2;
                Function function = (Function) f3643K.get(i);
                if (function.m1638b()) {
                    Message obtain = Message.obtain();
                    obtain.what = 7;
                    obtain.obj = function;
                    function.m1639c().m1729b(obtain);
                    vector2 = vector;
                } else {
                    vector2 = vector == null ? new Vector() : vector;
                    vector2.add(Integer.valueOf(i));
                }
                i++;
                vector = vector2;
            }
            if (vector != null) {
                for (int i2 = 0; i2 < vector.size(); i2++) {
                    f3642J.remove(vector.get(i2));
                }
            }
        }
    }

    protected void onStop() {
        Vector vector = null;
        m4077W();
        if (f3642J != null) {
            int size = f3642J.size();
            int i = 0;
            while (i < size) {
                Vector vector2;
                Function function = (Function) f3642J.get(i);
                if (function.m1638b()) {
                    Message obtain = Message.obtain();
                    obtain.what = 7;
                    obtain.obj = function;
                    function.m1639c().m1729b(obtain);
                    vector2 = vector;
                } else {
                    vector2 = vector == null ? new Vector() : vector;
                    vector2.add(Integer.valueOf(i));
                }
                i++;
                vector = vector2;
            }
            if (vector != null) {
                for (int i2 = 0; i2 < vector.size(); i2++) {
                    f3642J.remove(vector.get(i2));
                }
            }
        }
        if (this.ah != null) {
            try {
                this.ah.execute(null);
            } catch (Exception e) {
                if (f3657e) {
                    e.printStackTrace();
                }
            }
        }
        super.onStop();
    }

    public void onUserInteraction() {
        super.onUserInteraction();
        al = SystemClock.elapsedRealtime();
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f3681P != null) {
            this.f3681P.start();
        }
        super.onWindowFocusChanged(z);
    }

    public final int m4167p() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    protected void preparePreviewOptionsMenu(Menu menu) {
    }

    protected void previewDownloadComplete() {
        f3655c.m2131a(2);
        f3638B.post(new C0144r(this));
    }

    public final void m4168q() {
        if (this.az == null) {
            this.az = (InputMethodManager) getSystemService("input_method");
        }
        if (this.az.isActive()) {
            View h = gL.m4543h();
            if (h != null) {
                this.az.hideSoftInputFromWindow(h.getWindowToken(), 0);
            } else if (this.f3687t != null) {
                this.az.hideSoftInputFromWindow(this.f3687t.getWindowToken(), 0);
            }
        }
    }

    protected void readBumpData(byte[] bArr) {
        if (this.aA != null) {
            this.aA.m1792b(bArr);
        }
    }

    public void registerActivityResultListener(int i, ActivityResultListener activityResultListener) {
        if (this.aB == null) {
            this.aB = new HashMap();
        }
        if (activityResultListener != null) {
            if (f3657e) {
                Log.d(f3665n, "Registering ActivityResultListener with requestCode " + i);
            }
            this.aB.put(Integer.valueOf(i), activityResultListener);
            return;
        }
        this.aB.remove(Integer.valueOf(i));
    }

    protected void registerBumpInterface(BumpInterface bumpInterface) {
        this.aA = C0272a.m1786a(bumpInterface);
    }

    protected void reportBumpStatus(int i, String str) {
        if (this.aA != null) {
            this.aA.m1788a(i, str);
        }
    }

    protected boolean showPreview() {
        return false;
    }

    public final void m4169v() {
        if (f3666o != null) {
            m4094a(new C0143q(this));
        }
    }

    public final C0272a m4170w() {
        return this.aA;
    }
}
