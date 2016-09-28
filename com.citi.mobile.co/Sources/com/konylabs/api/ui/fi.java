package com.konylabs.api.ui;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.Toast;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import ny0k.cN;
import ny0k.cn;
import ny0k.cq;
import ny0k.cr;

public final class fi extends LuaWidget {
    private static String f3870A;
    private static C0184N f3871P;
    private static String f3872a;
    private static String f3873b;
    private static String f3874c;
    private static String f3875d;
    private static String f3876e;
    private static String f3877f;
    private static String f3878g;
    private static String f3879h;
    private static String f3880i;
    private static String f3881j;
    private static String f3882k;
    private static String f3883l;
    private static String f3884m;
    private static String f3885n;
    private static String f3886o;
    private static String f3887p;
    private static String f3888q;
    private static String f3889r;
    private static String f3890s;
    private static String f3891t;
    private static String f3892u;
    private static String f3893v;
    private static String f3894w;
    private static String f3895x;
    private static String f3896y;
    private static String f3897z;
    private String f3898B;
    private String f3899C;
    private C0177F f3900D;
    private int f3901Q;
    private int f3902R;
    private int f3903S;
    private fv f3904T;
    private RelativeLayout f3905U;
    private ScrollView f3906V;
    private dB f3907W;
    private String f3908X;
    private LuaWidget f3909Y;
    private int f3910Z;
    private OnClickListener aa;
    private Object ab;
    private ic ac;
    private boolean ad;

    static {
        f3872a = "text";
        f3873b = "image";
        f3874c = "oncapture";
        f3875d = "normalimage";
        f3876e = "focusimage";
        f3877f = "base64";
        f3878g = "rawbytes";
        f3879h = "contentalignment";
        f3880i = "enableoverlay";
        f3881j = "overlayconfig";
        f3882k = "overlayform";
        f3883l = "referenceimagetocrop";
        f3884m = "tapanywhere";
        f3885n = "capturebuttonskin";
        f3886o = "capturebuttontext";
        f3887p = "accessmode";
        f3888q = "imageformat";
        f3889r = "enablephotocropfeature";
        f3890s = "view";
        f3891t = "compressionlevel";
        f3892u = "scalefactor";
        f3893v = "maxsideoftheimage";
        f3894w = "cameraoptions";
        f3895x = "flashmode";
        f3896y = "hidecontrolbar";
        f3897z = "focusMode";
        f3870A = "enableZoom";
        if (KonyMain.m4057C()) {
            f3874c = "onCapture";
            f3878g = "rawBytes";
            f3879h = "contentAlignment";
            f3880i = "enableOverlay";
            f3881j = "overlayConfig";
            f3882k = "overlayForm";
            f3883l = "referenceImageToCrop";
            f3884m = "tapAnywhere";
            f3887p = "accessMode";
            f3888q = "imageFormat";
            f3889r = "enablePhotoCropFeature";
            f3891t = "compressionLevel";
            f3892u = "scaleFactor";
            f3893v = "maxSideOfTheImage";
            f3885n = "captureButtonSkin";
            f3886o = "captureButtonText";
            f3894w = "cameraOptions";
            f3895x = "flashMode";
            f3896y = "hideControlBar";
        }
    }

    public fi(LuaTable luaTable, LuaTable luaTable2, LuaTable luaTable3) {
        super(0, (luaTable3 != null ? luaTable3.map.size() : 0) + ((luaTable != null ? luaTable.map.size() : 0) + (luaTable2 != null ? luaTable2.map.size() : 0)), 1.0f, true);
        this.f3898B = null;
        this.f3899C = null;
        this.f3900D = null;
        this.f3902R = 1;
        this.f3903S = 0;
        this.f3910Z = 1;
        this.aa = new fj(this);
        this.ac = new ic(this);
        super.setTable(ATTR_WIDGET_ID, luaTable.getTable(ATTR_WIDGET_ID));
        LuaNil table = luaTable.getTable(ATTR_WIDGET_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_SKIN, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_FOCUS_SKIN);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_FOCUS_SKIN, table);
        }
        table = luaTable.getTable(f3872a);
        if (table != LuaNil.nil) {
            super.setTable(f3872a, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ISVISIBLE);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ISVISIBLE, table);
        }
        table = luaTable.getTable(f3874c);
        if (table != LuaNil.nil) {
            super.setTable(f3874c, table);
        }
        table = luaTable.getTable(f3891t);
        if (table != LuaNil.nil) {
            super.setTable(f3891t, table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
        if (table != LuaNil.nil) {
            super.setTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG, table);
        }
        if (luaTable2 != null) {
            table = luaTable2.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                super.setTable(ATTR_WIDGET_ALIGNMENT, table);
            }
            table = luaTable2.getTable(f3879h);
            if (table != LuaNil.nil) {
                super.setTable(f3879h, table);
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
        if (luaTable3 != null) {
            table = luaTable3.getTable(f3880i);
            if (table != LuaNil.nil) {
                super.setTable(f3880i, table);
                if (((Boolean) table).booleanValue()) {
                    table = luaTable3.getTable(f3881j);
                    if (table != LuaNil.nil) {
                        super.setTable(f3881j, table);
                        table = ((LuaTable) table).getTable(f3882k);
                        if (table != LuaNil.nil) {
                            this.f3904T = (fv) table;
                            this.f3904T.m4451d(true);
                            this.f3904T.getTable(LuaWidget.ATTR_WIDGET_ID);
                        }
                    }
                    table = luaTable3.getTable(f3894w);
                    if (table != LuaNil.nil) {
                        super.setTable(f3894w, table);
                    }
                }
            }
            table = luaTable3.getTable(f3887p);
            if (table != LuaNil.nil) {
                super.setTable(f3887p, table);
            }
            table = luaTable3.getTable(f3889r);
            if (table != LuaNil.nil) {
                super.setTable(f3889r, table);
            }
            if (luaTable3.getTable(ATTR_WIDGET_PROP_DEPRECATED) != LuaNil.nil) {
                LuaTable luaTable4 = (LuaTable) luaTable3.getTable(ATTR_WIDGET_PROP_DEPRECATED);
                LuaNil table2 = luaTable4.getTable(f3888q);
                if (table2 != LuaNil.nil) {
                    super.setTable(f3888q, table2);
                }
                table = luaTable4.getTable(f3890s);
                if (table == LuaNil.nil) {
                    return;
                }
                if (((Double) table).intValue() == 1) {
                    super.setTable(f3880i, new Boolean(false));
                } else {
                    super.setTable(f3880i, new Boolean(true));
                }
            }
        }
    }

    private void m4317a(dB dBVar) {
        this.f3900D.m177a(dBVar);
        this.f3900D.m170a();
        if (this.f3901Q != 1) {
            f3871P.m294c(dBVar);
            C0184N c0184n = f3871P;
            C0184N.m250b();
        }
    }

    private void m4319b(dB dBVar) {
        this.f3900D.m185b(dBVar);
        this.f3900D.m170a();
        if (this.f3901Q != 1) {
            f3871P.m289b(dBVar);
            C0184N c0184n = f3871P;
            C0184N.m250b();
        }
    }

    static /* synthetic */ void m4321d(fi fiVar) {
        LuaNil table = super.getTable(f3874c);
        if (table != LuaNil.nil) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = table;
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("key0", fiVar);
            obtain.setData(bundle);
            KonyMain.getActContext();
            KonyMain.m4121f().sendMessage(obtain);
        }
    }

    public static C0184N m4323f() {
        return f3871P;
    }

    private Bitmap m4324g() {
        try {
            AssetFileDescriptor openAssetFileDescriptor = KonyMain.getAppContext().getContentResolver().openAssetFileDescriptor((Uri) this.ab, "r");
            Options options = new Options();
            options.inSampleSize = 2;
            return BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor.getFileDescriptor(), null, options);
        } catch (FileNotFoundException e) {
            if (KonyMain.f3657e) {
                Log.d("LuaCamera", BuildConfig.FLAVOR + e.getMessage());
            }
            return null;
        }
    }

    protected final int m4325a(boolean z) {
        int a = super.m3942a(z);
        return (this.G && !z && H == -1) ? 4 : a;
    }

    protected final void m4326a(Object obj, Object obj2) {
        int i = 10;
        if (this.E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == ATTR_WIDGET_ISVISIBLE) {
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                this.f3900D.m173a(H, m4325a(booleanValue));
                if (this.f3901Q != 1) {
                    f3871P.m279a(m4325a(booleanValue));
                }
            } else if (intern == f3872a) {
                this.f3900D.m178a((String) obj2);
            } else if (intern == f3875d) {
                this.f3899C = (String) obj2;
                this.f3900D.m186b(this.f3899C);
            } else if (intern == f3876e) {
                this.f3898B = (String) obj2;
                this.f3900D.m192c(this.f3898B);
            } else if (intern == ATTR_WIDGET_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4319b(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4319b(r0);
                }
            } else if (intern == ATTR_WIDGET_FOCUS_SKIN) {
                if (obj2 == null || obj2 == LuaNil.nil) {
                    m4317a(null);
                    return;
                }
                r0 = cN.m2139a(obj2);
                if (r0 != null) {
                    m4317a(r0);
                }
            } else if (intern == ATTR_WIDGET_CONTAINER_WEIGHT && obj2 != LuaNil.nil && this.G) {
                setWeight();
                this.f3900D.m183b();
                ((eO) this.I).m4238t();
            } else if (intern == f3888q) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    if (((Double) obj2).intValue() == 1) {
                        this.f3902R = 1;
                    } else {
                        this.f3902R = 2;
                        r0 = super.getTable(f3891t);
                        if (r0 != LuaNil.nil) {
                            this.f3903S = ((Double) r0).intValue();
                            if (f3871P != null) {
                                f3871P.m288b(100 - this.f3903S);
                            }
                        }
                    }
                    if (f3871P != null) {
                        f3871P.m297d(this.f3902R);
                    }
                }
            } else if (intern == f3889r) {
                if (obj2 != null && obj2 != LuaNil.nil) {
                    this.ad = ((Boolean) obj2).booleanValue();
                }
            } else if (intern == f3891t) {
                if (this.f3902R == 2 && obj2 != LuaNil.nil && obj2 != null) {
                    this.f3903S = ((Double) obj2).intValue();
                    if (f3871P != null) {
                        f3871P.m288b(100 - this.f3903S);
                    }
                }
            } else if (intern == f3887p) {
                if (obj2 != LuaNil.nil && obj2 != null) {
                    this.f3910Z = ((Double) obj2).intValue();
                    if (f3871P != null) {
                        f3871P.m293c(this.f3910Z);
                    }
                }
            } else if (intern == f3892u) {
                if (obj2 != LuaNil.nil && obj2 != null && f3871P != null) {
                    int intValue = ((Double) obj2).intValue();
                    if (intValue >= 10) {
                        i = intValue > 100 ? 100 : intValue;
                    }
                    f3871P.m302f(100 / i);
                }
            } else if (intern == f3893v) {
                if (obj2 != LuaNil.nil && obj2 != null && f3871P != null) {
                    f3871P.m300e(((Double) obj2).intValue());
                }
            } else if (intern == ATTR_WIDGET_PADDING && obj2 != LuaNil.nil) {
                this.f3900D.m188b(convertPaddingToPixels(obj2, this.I));
                this.f3900D.m183b();
                if (this.f3904T == null && this.f3901Q != 1) {
                    f3871P.m291b(convertPaddingToPixels(obj2, this.I));
                }
            } else if (intern == ATTR_WIDGET_MARGIN && obj2 != LuaNil.nil) {
                this.f3900D.m182a(convertMarginsToPixels(obj2, this.I));
                this.f3900D.m183b();
                if (this.f3904T == null && this.f3901Q != 1) {
                    f3871P.m287a(convertMarginsToPixels(obj2, this.I));
                }
            } else if (intern == f3879h && obj2 != LuaNil.nil) {
                switch (((Double) obj2).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f3900D.m184b(51);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f3900D.m184b(49);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f3900D.m184b(53);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f3900D.m184b(19);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f3900D.m184b(17);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f3900D.m184b(21);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f3900D.m184b(83);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f3900D.m184b(81);
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f3900D.m184b(85);
                    default:
                        this.f3900D.m184b(17);
                }
            } else if (intern == f3894w) {
                if (obj2 != LuaNil.nil) {
                    r0 = ((LuaTable) obj2).getTable(f3895x);
                    if (r0 != LuaNil.nil) {
                        f3871P.m304g(((Double) r0).intValue());
                    }
                    r0 = ((LuaTable) obj2).getTable(f3896y);
                    if (r0 != LuaNil.nil) {
                        f3871P.m295c(((Boolean) r0).booleanValue());
                        return;
                    }
                    return;
                }
                f3871P.m304g(4);
                f3871P.m295c(false);
            } else if (intern != ATTR_WIDGET_ACCESSIBILITY_CONFIG) {
            } else {
                if (obj2 != null && (obj2 instanceof LuaTable)) {
                    this.f3900D.m196d(m3944a((LuaTable) obj2, this.f3900D.getText().toString()));
                } else if (obj2 == null || obj2 == LuaNil.nil) {
                    this.f3900D.m196d(BuildConfig.FLAVOR);
                }
            }
        }
    }

    public final void m4327b() {
        if (this.f3901Q != 1 && f3871P != null && this.f3904T != null && this.f3904T == fv.m4426o()) {
            f3871P.m305h();
        }
    }

    public final void m4328c() {
        if (this.f3901Q != 1 && f3871P != null && this.f3904T != null && this.f3904T == fv.m4426o()) {
            f3871P.m307i();
        }
    }

    public final void cleanup() {
        if (this.f3900D != null) {
            this.f3900D.m197e();
            this.f3900D = null;
        }
        if (!(this.f3901Q == 1 || f3871P == null || f3871P.m303g() != 0)) {
            f3871P.m284a(null);
            f3871P.m313n();
            f3871P = null;
        }
        this.E = KONY_WIDGET_BACKUP;
    }

    public final LuaWidget createClone() {
        return null;
    }

    public final void m4329d() {
        LuaNil table = super.getTable(f3880i);
        if (table != LuaNil.nil) {
            if (((Boolean) table).booleanValue()) {
                this.f3901Q = 2;
            } else {
                this.f3901Q = 1;
            }
        }
        if (!(this.f3901Q == 1 || this.f3904T == null || f3871P != null)) {
            C0184N c0184n = new C0184N(KonyMain.getAppContext());
            f3871P = c0184n;
            c0184n.m277a();
        }
        m4330e();
    }

    public final void m4330e() {
        if (Environment.getExternalStorageState().equals("mounted")) {
            if (KonyMain.f3656d < 11) {
                KonyMain.m4143x().m1777a(null);
            }
            if (this.f3901Q == 1) {
                if (KonyMain.m4099a(this.ac, null, this.ad, this.f3910Z, this.f3902R, 100 - this.f3903S)) {
                    if (KonyMain.f3657e) {
                        Log.d("LuaCamera", "Camera Invocation success");
                    }
                } else if (KonyMain.f3657e) {
                    Log.d("LuaCamera", "Camera Invocation failed");
                }
            } else if (this.f3904T != null) {
                dB a;
                LuaTable luaTable;
                LuaNil table;
                getTable(ATTR_WIDGET_ID);
                f3871P.m311l();
                Object table2 = super.getTable(ATTR_WIDGET_SKIN);
                if (table2 != LuaNil.nil) {
                    a = cN.m2139a(table2);
                    if (a != null) {
                        f3871P.m289b(a);
                    }
                }
                table2 = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
                if (table2 != LuaNil.nil) {
                    a = cN.m2139a(table2);
                    if (a != null) {
                        f3871P.m294c(a);
                    }
                }
                LuaNil table3 = super.getTable(ATTR_WIDGET_ISVISIBLE);
                if (table3 != LuaNil.nil) {
                    f3871P.m279a(m4325a(((Boolean) table3).booleanValue()));
                }
                table3 = super.getTable(f3881j);
                if (table3 != LuaNil.nil) {
                    luaTable = (LuaTable) table3;
                    table = luaTable.getTable(f3883l);
                    if (table != LuaNil.nil) {
                        this.f3909Y = (LuaWidget) table;
                    }
                    table = luaTable.getTable(f3884m);
                    if (table != LuaNil.nil) {
                        f3871P.m286a(((Boolean) table).booleanValue());
                    }
                    Object table4 = luaTable.getTable(f3885n);
                    if (table4 != LuaNil.nil) {
                        dB a2 = cN.m2139a(table4);
                        if (a2 != null) {
                            this.f3907W = a2;
                        }
                    }
                    table3 = luaTable.getTable(f3886o);
                    if (table3 != LuaNil.nil) {
                        this.f3908X = table3.toString();
                    }
                }
                table3 = super.getTable(f3887p);
                if (table3 != LuaNil.nil) {
                    this.f3910Z = ((Double) table3).intValue();
                    f3871P.m293c(this.f3910Z);
                }
                table3 = super.getTable(ATTR_WIDGET_PADDING);
                if (table3 != LuaNil.nil && this.f3904T == null) {
                    f3871P.m291b(convertPaddingToPixels(table3, this.I));
                }
                table3 = super.getTable(ATTR_WIDGET_MARGIN);
                if (table3 != LuaNil.nil && this.f3904T == null) {
                    f3871P.m287a(convertMarginsToPixels(table3, this.I));
                }
                table3 = super.getTable(f3888q);
                if (table3 != LuaNil.nil) {
                    if (((Double) table3).intValue() == 1) {
                        this.f3902R = 1;
                    } else {
                        this.f3902R = 2;
                        table3 = super.getTable(f3891t);
                        if (table3 != LuaNil.nil) {
                            this.f3903S = ((Double) table3).intValue();
                            if (f3871P != null) {
                                f3871P.m288b(100 - this.f3903S);
                            }
                        }
                    }
                    if (f3871P != null) {
                        f3871P.m297d(this.f3902R);
                    }
                }
                table3 = super.getTable(f3894w);
                if (table3 != LuaNil.nil) {
                    luaTable = (LuaTable) table3;
                    table = luaTable.getTable(f3895x);
                    if (table != LuaNil.nil) {
                        f3871P.m304g(((Double) table).intValue());
                    }
                    table = luaTable.getTable(f3896y);
                    if (table != LuaNil.nil) {
                        f3871P.m295c(((Boolean) table).booleanValue());
                    }
                    table3 = luaTable.getTable(f3897z);
                    if (table3 != LuaNil.nil) {
                        f3871P.m306h(((Double) table3).intValue());
                    }
                }
                table = super.getTable(f3892u);
                if (!(table == LuaNil.nil || ((Double) table).intValue() == 0)) {
                    int intValue = ((Double) table).intValue();
                    if (intValue < 10) {
                        intValue = 10;
                    } else if (intValue > 100) {
                        intValue = 100;
                    }
                    f3871P.m302f(100 / intValue);
                }
                table = super.getTable(f3893v);
                if (!(table == LuaNil.nil || ((Double) table).intValue() == 0)) {
                    f3871P.m300e(((Double) table).intValue());
                }
                table2 = super.getTable(f3870A);
                if (table2 != LuaNil.nil) {
                    table2 = cr.m2201a(table2, 0);
                    if (table2 != null) {
                        f3871P.m290b(((Boolean) table2).booleanValue());
                    }
                }
                f3871P.m284a(this.ac);
                if (this.f3907W != null) {
                    f3871P.m298d(this.f3907W);
                }
                f3871P.m285a(this.f3908X == null ? BuildConfig.FLAVOR : this.f3908X);
                this.f3905U = (RelativeLayout) this.f3904T.getWidget();
                int f = this.f3904T.m4456h().m476f();
                View findViewById = this.f3905U.findViewById(3);
                View findViewById2 = this.f3905U.findViewById(4);
                boolean z = ((LinearLayout) findViewById).getChildCount() > 0;
                boolean z2 = ((LinearLayout) findViewById2).getChildCount() > 0;
                View findViewById3 = this.f3905U.findViewById(2);
                if (findViewById3 != null) {
                    this.f3906V = (ScrollView) findViewById3;
                    if (KonyMain.f3656d < 11) {
                        ((aD) this.f3906V.getChildAt(0)).m471e(1);
                    }
                    this.f3905U.removeView(this.f3906V);
                }
                if (this.f3906V.getParent() != null) {
                    ((ViewGroup) this.f3906V.getParent()).removeView(this.f3906V);
                }
                if (z || z2) {
                    findViewById3 = this.f3905U.findViewById(1);
                    this.f3905U.removeView(findViewById3);
                    View relativeLayout = new RelativeLayout(KonyMain.getActContext());
                    relativeLayout.addView(findViewById3);
                    if (z) {
                        this.f3905U.removeView(findViewById);
                        relativeLayout.addView(findViewById);
                    }
                    if (z2) {
                        this.f3905U.removeView(findViewById2);
                        relativeLayout.addView(findViewById2);
                    }
                    relativeLayout.addView(this.f3906V);
                    f3871P.m280a(relativeLayout);
                } else {
                    f3871P.m280a(this.f3906V);
                }
                if (this.f3909Y != null) {
                    if (this.f3909Y instanceof gs) {
                        ((gs) this.f3909Y).m4590b(true);
                        f3871P.m281a(((gs) this.f3909Y).m4589b());
                    } else if (this.f3909Y instanceof gt) {
                        ((gt) this.f3909Y).m4599b(true);
                        f3871P.m282a(((gt) this.f3909Y).m4598b());
                    }
                }
                f3871P.m292c();
                if (KonyMain.f3656d >= 11) {
                    f3871P.m308i(f);
                }
                if (f3871P.m296d().getParent() != null) {
                    ((ViewGroup) f3871P.m296d().getParent()).removeView(f3871P.m296d());
                }
                this.f3905U.addView(f3871P.m296d(), new LayoutParams(-1, -1));
                this.f3905U.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f3904T.m4455g();
            }
        } else if (KonyMain.getActContext() != null) {
            Toast.makeText(KonyMain.getActContext(), "Please insert SD Card before using camera", 0).show();
        }
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
        hashtable.put(f3872a, "string");
        hashtable.put(ATTR_WIDGET_ISVISIBLE, "boolean");
        hashtable.put(f3875d, "string");
        hashtable.put(f3876e, "string");
        hashtable.put(ATTR_WIDGET_FOCUS_SKIN, "table");
        hashtable.put(ATTR_WIDGET_SKIN, "table");
        hashtable.put(f3878g, "string");
        hashtable.put(f3877f, "string");
        return hashtable;
    }

    public final Object getProperty(String str) {
        return super.getTable(str);
    }

    public final Object getTable(Object obj) {
        String intern = ((String) obj).intern();
        if (intern == f3878g) {
            if (this.ab == null) {
                return null;
            }
            if (this.ab instanceof Uri) {
                return this.ab.toString();
            }
            if (!(this.ab instanceof cq)) {
                return null;
            }
            cq cqVar = (cq) this.ab;
            this.ab = null;
            return cqVar;
        } else if (intern != f3877f) {
            return super.getTable(intern);
        } else {
            if (this.ab == null) {
                return this.ab;
            }
            if (this.ab instanceof Uri) {
                Bitmap g = m4324g();
                if (g == null) {
                    return null;
                }
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (this.f3902R == 1) {
                    g.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
                } else {
                    g.compress(CompressFormat.JPEG, 100 - this.f3903S, byteArrayOutputStream);
                }
                StringBuffer stringBuffer = new StringBuffer(cn.m2175a(byteArrayOutputStream.toByteArray()));
                g.recycle();
                return stringBuffer;
            }
            Object a = ((cq) this.ab).m2197a();
            if (a != null) {
                byte[] toByteArray;
                if (a instanceof Bitmap) {
                    OutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    ((Bitmap) a).compress(CompressFormat.JPEG, 100, byteArrayOutputStream2);
                    toByteArray = byteArrayOutputStream2.toByteArray();
                } else {
                    toByteArray = (byte[]) a;
                }
                a = cn.m2175a(toByteArray);
            } else {
                a = null;
            }
            this.ab = null;
            return a;
        }
    }

    public final String getType() {
        return "Camera";
    }

    public final View getWidget() {
        if (this.E == KONY_WIDGET_BACKUP) {
            dB a;
            boolean z;
            C0184N c0184n;
            LuaTable luaTable;
            hp hpVar;
            this.f3901Q = 1;
            LuaNil table = super.getTable(f3880i);
            if (table != LuaNil.nil) {
                if (((Boolean) table).booleanValue()) {
                    this.f3901Q = 2;
                } else {
                    this.f3901Q = 1;
                }
            }
            Object table2 = super.getTable(ATTR_WIDGET_SKIN);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (!(a == null || a.m1165q())) {
                    z = true;
                    if (z || KonyMain.f3656d <= 10) {
                        this.f3900D = new C0177F(KonyMain.getActContext());
                    } else {
                        this.f3900D = new C0177F(KonyMain.getActContext(), 0);
                    }
                    if (this.f3901Q != 1) {
                        if (f3871P == null) {
                            c0184n = new C0184N(KonyMain.getAppContext());
                            f3871P = c0184n;
                            c0184n.m277a();
                            table = super.getTable(f3881j);
                            if (table != LuaNil.nil) {
                                luaTable = (LuaTable) table;
                                f3871P.m283a(luaTable.getTable(f3885n) == LuaNil.nil ? cN.m2139a(luaTable.getTable(f3885n)) : null);
                            }
                        }
                        f3871P.m301f();
                    }
                    table2 = super.getTable(ATTR_WIDGET_SKIN);
                    if (table2 != LuaNil.nil) {
                        a = cN.m2139a(table2);
                        if (a != null) {
                            this.f3900D.m185b(a);
                        }
                    } else if (this.f3901Q == 1) {
                        hpVar = new hp();
                        this.f3900D.m174a(this.f3900D.getBackground());
                        this.f3900D.m185b(hpVar.m3352a());
                    }
                    table2 = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
                    if (table2 != LuaNil.nil) {
                        a = cN.m2139a(table2);
                        if (a != null) {
                            this.f3900D.m177a(a);
                        }
                    }
                    table = super.getTable(f3873b);
                    if (table != LuaNil.nil) {
                        this.f3900D.m178a(BuildConfig.FLAVOR);
                        this.f3900D.m186b((String) table);
                    }
                    table = super.getTable(ATTR_WIDGET_ISVISIBLE);
                    if (table != LuaNil.nil) {
                        this.f3900D.m173a(H, m4325a(((Boolean) table).booleanValue()));
                    }
                    table = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
                    if (!(table == LuaNil.nil || ((Double) table).intValue() == 0)) {
                        table = super.getTable(ATTR_WIDGET_HEXPAND);
                        if (table != LuaNil.nil && ((Boolean) table).booleanValue()) {
                            this.f3900D.m181a(true);
                        }
                    }
                    table = super.getTable(ATTR_WIDGET_VEXPAND);
                    if (table != LuaNil.nil && ((Boolean) table).booleanValue()) {
                        this.f3900D.m187b(true);
                    }
                    table = super.getTable(ATTR_WIDGET_ALIGNMENT);
                    if (table != LuaNil.nil) {
                        switch (((Double) table).intValue()) {
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                this.f3900D.m172a(51);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                                this.f3900D.m172a(49);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                                this.f3900D.m172a(53);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                                this.f3900D.m172a(19);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                                this.f3900D.m172a(17);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                                this.f3900D.m172a(21);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                                this.f3900D.m172a(83);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                                this.f3900D.m172a(81);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                                this.f3900D.m172a(85);
                                break;
                            default:
                                this.f3900D.m172a(17);
                                break;
                        }
                    }
                    table = super.getTable(f3879h);
                    if (table != LuaNil.nil) {
                        switch (((Double) table).intValue()) {
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                this.f3900D.m184b(51);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                                this.f3900D.m184b(49);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                                this.f3900D.m184b(53);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                                this.f3900D.m184b(19);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                                this.f3900D.m184b(17);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                                this.f3900D.m184b(21);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                                this.f3900D.m184b(83);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                                this.f3900D.m184b(81);
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                                this.f3900D.m184b(85);
                                break;
                            default:
                                this.f3900D.m184b(17);
                                break;
                        }
                    }
                    table = super.getTable(ATTR_WIDGET_PADDING);
                    if (table != LuaNil.nil) {
                        this.f3900D.m188b(convertPaddingToPixels(table, this.I));
                    }
                    table = super.getTable(ATTR_WIDGET_MARGIN);
                    if (table != LuaNil.nil) {
                        this.f3900D.m182a(convertMarginsToPixels(table, this.I));
                    }
                    table = super.getTable(f3888q);
                    if (table != LuaNil.nil) {
                        if (((Double) table).intValue() != 1) {
                            this.f3902R = 1;
                        } else {
                            this.f3902R = 2;
                            table = super.getTable(f3891t);
                            if (table != LuaNil.nil) {
                                this.f3903S = ((Double) table).intValue();
                            }
                        }
                    }
                    table = super.getTable(f3872a);
                    if (table != LuaNil.nil) {
                        this.f3900D.m178a((String) table);
                    }
                    table = super.getTable(f3875d);
                    if (table != LuaNil.nil) {
                        this.f3899C = (String) table;
                        this.f3900D.m186b(this.f3899C);
                    }
                    table = super.getTable(f3876e);
                    if (table != LuaNil.nil) {
                        this.f3898B = (String) table;
                        this.f3900D.m192c(this.f3898B);
                    }
                    super.getTable(ATTR_WIDGET_SKIN);
                    table = LuaNil.nil;
                    if (this.f3901Q == 1 || this.f3904T != null) {
                        this.f3900D.setOnClickListener(this.aa);
                        table = super.getTable(f3889r);
                        if (table != LuaNil.nil) {
                            this.ad = ((Boolean) table).booleanValue();
                        }
                    }
                    table = super.getTable(ATTR_WIDGET_SET_ENABLED);
                    if (table != LuaNil.nil) {
                        this.f3900D.m193c(((Boolean) table).booleanValue());
                    }
                    table = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
                    if (table != LuaNil.nil && (table instanceof LuaTable)) {
                        this.f3900D.m196d(m3944a((LuaTable) table, this.f3900D.getText().toString()));
                    }
                    this.E = KONY_WIDGET_RESTORE;
                    if (this.G) {
                        setWeight();
                    }
                }
            }
            z = false;
            if (z) {
            }
            this.f3900D = new C0177F(KonyMain.getActContext());
            if (this.f3901Q != 1) {
                if (f3871P == null) {
                    c0184n = new C0184N(KonyMain.getAppContext());
                    f3871P = c0184n;
                    c0184n.m277a();
                    table = super.getTable(f3881j);
                    if (table != LuaNil.nil) {
                        luaTable = (LuaTable) table;
                        if (luaTable.getTable(f3885n) == LuaNil.nil) {
                        }
                        f3871P.m283a(luaTable.getTable(f3885n) == LuaNil.nil ? cN.m2139a(luaTable.getTable(f3885n)) : null);
                    }
                }
                f3871P.m301f();
            }
            table2 = super.getTable(ATTR_WIDGET_SKIN);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f3900D.m185b(a);
                }
            } else if (this.f3901Q == 1) {
                hpVar = new hp();
                this.f3900D.m174a(this.f3900D.getBackground());
                this.f3900D.m185b(hpVar.m3352a());
            }
            table2 = super.getTable(ATTR_WIDGET_FOCUS_SKIN);
            if (table2 != LuaNil.nil) {
                a = cN.m2139a(table2);
                if (a != null) {
                    this.f3900D.m177a(a);
                }
            }
            table = super.getTable(f3873b);
            if (table != LuaNil.nil) {
                this.f3900D.m178a(BuildConfig.FLAVOR);
                this.f3900D.m186b((String) table);
            }
            table = super.getTable(ATTR_WIDGET_ISVISIBLE);
            if (table != LuaNil.nil) {
                this.f3900D.m173a(H, m4325a(((Boolean) table).booleanValue()));
            }
            table = super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT);
            table = super.getTable(ATTR_WIDGET_HEXPAND);
            this.f3900D.m181a(true);
            table = super.getTable(ATTR_WIDGET_VEXPAND);
            this.f3900D.m187b(true);
            table = super.getTable(ATTR_WIDGET_ALIGNMENT);
            if (table != LuaNil.nil) {
                switch (((Double) table).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f3900D.m172a(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f3900D.m172a(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f3900D.m172a(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f3900D.m172a(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f3900D.m172a(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f3900D.m172a(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f3900D.m172a(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f3900D.m172a(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f3900D.m172a(85);
                        break;
                    default:
                        this.f3900D.m172a(17);
                        break;
                }
            }
            table = super.getTable(f3879h);
            if (table != LuaNil.nil) {
                switch (((Double) table).intValue()) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        this.f3900D.m184b(51);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        this.f3900D.m184b(49);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        this.f3900D.m184b(53);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                        this.f3900D.m184b(19);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                        this.f3900D.m184b(17);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                        this.f3900D.m184b(21);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                        this.f3900D.m184b(83);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                        this.f3900D.m184b(81);
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                        this.f3900D.m184b(85);
                        break;
                    default:
                        this.f3900D.m184b(17);
                        break;
                }
            }
            table = super.getTable(ATTR_WIDGET_PADDING);
            if (table != LuaNil.nil) {
                this.f3900D.m188b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (table != LuaNil.nil) {
                this.f3900D.m182a(convertMarginsToPixels(table, this.I));
            }
            table = super.getTable(f3888q);
            if (table != LuaNil.nil) {
                if (((Double) table).intValue() != 1) {
                    this.f3902R = 2;
                    table = super.getTable(f3891t);
                    if (table != LuaNil.nil) {
                        this.f3903S = ((Double) table).intValue();
                    }
                } else {
                    this.f3902R = 1;
                }
            }
            table = super.getTable(f3872a);
            if (table != LuaNil.nil) {
                this.f3900D.m178a((String) table);
            }
            table = super.getTable(f3875d);
            if (table != LuaNil.nil) {
                this.f3899C = (String) table;
                this.f3900D.m186b(this.f3899C);
            }
            table = super.getTable(f3876e);
            if (table != LuaNil.nil) {
                this.f3898B = (String) table;
                this.f3900D.m192c(this.f3898B);
            }
            super.getTable(ATTR_WIDGET_SKIN);
            table = LuaNil.nil;
            this.f3900D.setOnClickListener(this.aa);
            table = super.getTable(f3889r);
            if (table != LuaNil.nil) {
                this.ad = ((Boolean) table).booleanValue();
            }
            table = super.getTable(ATTR_WIDGET_SET_ENABLED);
            if (table != LuaNil.nil) {
                this.f3900D.m193c(((Boolean) table).booleanValue());
            }
            table = super.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG);
            this.f3900D.m196d(m3944a((LuaTable) table, this.f3900D.getText().toString()));
            this.E = KONY_WIDGET_RESTORE;
            if (this.G) {
                setWeight();
            }
        }
        this.f3900D.m189c();
        if (this.f3901Q == 1) {
            return this.f3900D.m194d();
        }
        if (this.f3904T != null) {
            return this.f3900D.m194d();
        }
        f3871P.m292c();
        if (f3871P.m296d().getParent() != null) {
            ((ViewGroup) f3871P.m296d().getParent()).removeView(f3871P.m296d());
        }
        return f3871P.m296d();
    }

    public final int getWidth() {
        return 0;
    }

    public final void handleOrientationChange(int i) {
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(ATTR_WIDGET_PADDING);
            if (!(table == null || table == LuaNil.nil)) {
                this.f3900D.m188b(convertPaddingToPixels(table, this.I));
            }
            table = super.getTable(ATTR_WIDGET_MARGIN);
            if (!(table == null || table == LuaNil.nil)) {
                this.f3900D.m182a(convertMarginsToPixels(table, this.I));
            }
            this.f3900D.m199f();
        }
    }

    public final void setEnabled(boolean z) {
        super.setTable(ATTR_WIDGET_SET_ENABLED, new Boolean(z));
        if (this.E == KONY_WIDGET_RESTORE) {
            this.f3900D.m193c(z);
        }
    }

    public final void setFocus() {
        if (this.E == KONY_WIDGET_RESTORE && this.f3901Q == 1) {
            this.f3900D.setFocusableInTouchMode(true);
            this.f3900D.requestFocus();
            this.f3900D.setFocusableInTouchMode(false);
        }
    }

    public final void setFontColor(Object[] objArr) {
    }

    public final void setHeight(int i) {
        if (this.f3901Q == 1 && this.E == KONY_WIDGET_RESTORE) {
            this.f3900D.m187b(false);
            this.f3900D.setHeight(i);
            this.f3900D.m183b();
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
            this.f3900D.m173a(H, m4325a(z));
            if (this.f3901Q != 1) {
                f3871P.m279a(m4325a(z));
            }
        }
    }

    public final void setWeight() {
        this.G = true;
        if (this.E != KONY_WIDGET_BACKUP) {
            LuaNil table = super.getTable(LuaWidget.ATTR_WIDGET_CONTAINER_WEIGHT);
            if (table != LuaNil.nil) {
                float floatValue = ((Double) table).floatValue();
                if (floatValue > 0.0f) {
                    this.f3900D.m171a(floatValue / 100.0f);
                    if (this.f3904T == null && this.f3901Q == 2) {
                        f3871P.m278a(floatValue / 100.0f);
                    }
                }
            }
        }
    }

    public final void setWidth(int i) {
        if (this.f3901Q == 1 && this.E == KONY_WIDGET_RESTORE) {
            this.f3900D.m181a(false);
            this.f3900D.setWidth(i);
            this.f3900D.m183b();
        }
    }

    public final String toString() {
        return "LuaCamera: " + getTable(ATTR_WIDGET_ID);
    }
}
