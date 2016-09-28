package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import ny0k.cN;

public final class eK implements C0211m {
    private static eK f2975k;
    private static boolean f2976l;
    protected fv f2977a;
    cG f2978b;
    private cz f2979c;
    private String f2980d;
    private boolean f2981e;
    private String f2982f;
    private dB f2983g;
    private boolean f2984h;
    private LuaTable f2985i;
    private int f2986j;
    private LuaTable f2987m;
    private int f2988n;
    private boolean f2989o;

    static {
        f2975k = null;
        f2976l = false;
    }

    private eK() {
        this.f2980d = "Please wait...";
        this.f2981e = true;
        this.f2982f = "fullscreen";
        this.f2983g = null;
        this.f2984h = true;
        this.f2985i = null;
        this.f2986j = -1;
        this.f2987m = null;
        this.f2988n = 0;
        this.f2989o = false;
        this.f2978b = new eM(this);
    }

    public static eK m3294a() {
        if (f2975k == null) {
            f2975k = new eK();
        }
        return f2975k;
    }

    static /* synthetic */ LinearLayout m3297c(eK eKVar) {
        Context actContext = KonyMain.getActContext();
        LinearLayout linearLayout = new LinearLayout(actContext);
        linearLayout.setLayoutParams(new LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.setMargins(1, 8, 0, 0);
        if (eKVar.f2984h) {
            View progressBar = new ProgressBar(actContext);
            progressBar.setLayoutParams(layoutParams);
            if (eKVar.f2989o) {
                progressBar.getIndeterminateDrawable().setColorFilter(eKVar.f2988n, Mode.MULTIPLY);
            } else {
                progressBar.getIndeterminateDrawable().clearColorFilter();
            }
            linearLayout.addView(progressBar);
        }
        if (!eKVar.f2980d.equals(BuildConfig.FLAVOR)) {
            TextView textView = new TextView(actContext);
            textView.setText(eKVar.f2980d);
            if (eKVar.f2983g == null) {
                textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            } else {
                textView.setTextColor(eKVar.f2983g.m1156m());
            }
            textView.setLayoutParams(layoutParams);
            if (eKVar.f2983g != null) {
                eKVar.f2983g.m1132c(textView);
            }
            linearLayout.addView(textView);
        }
        return linearLayout;
    }

    public static void m3300e() {
        if (f2975k != null) {
            f2975k.m3309d();
        }
    }

    public static boolean m3302f() {
        return f2975k != null && f2976l;
    }

    public final void m3305a(String str) {
        this.f2980d = str;
    }

    public final void m3306a(Object[] objArr) {
        this.f2983g = null;
        this.f2980d = "Please wait...";
        this.f2982f = "fullscreen";
        this.f2981e = true;
        this.f2984h = true;
        this.f2986j = -1;
        this.f2987m = null;
        this.f2989o = false;
        if (objArr != null && objArr.length == 6) {
            if (!(objArr[0] == null || objArr[0] == LuaNil.nil)) {
                this.f2983g = cN.m2139a(objArr[0]);
            }
            if (!(objArr[1] == null || objArr[1] == LuaNil.nil)) {
                this.f2980d = (String) objArr[1];
            }
            if (!(objArr[2] == null || objArr[2] == LuaNil.nil)) {
                this.f2982f = (String) objArr[2];
            }
            if (!(objArr[3] == null || objArr[3] == LuaNil.nil)) {
                this.f2981e = ((Boolean) objArr[3]).booleanValue();
            }
            if (!(objArr[4] == null || objArr[4] == LuaNil.nil)) {
                this.f2984h = ((Boolean) objArr[4]).booleanValue();
            }
            if (objArr[5] != null && objArr[5] != LuaNil.nil) {
                this.f2985i = (LuaTable) objArr[5];
                LuaNil table = this.f2985i.getTable("transparencybehindloadingscreen");
                if (table != LuaNil.nil) {
                    this.f2986j = ((Double) table).intValue();
                }
                table = this.f2985i.getTable(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG);
                if (table != LuaNil.nil) {
                    this.f2987m = (LuaTable) table;
                }
                table = this.f2985i.getTable("progressIndicatorColor");
                if (table == LuaNil.nil) {
                    return;
                }
                if (table.toString().equalsIgnoreCase("Gray")) {
                    this.f2989o = true;
                    this.f2988n = -7829368;
                } else if (table.toString().equalsIgnoreCase("White")) {
                    this.f2989o = true;
                    this.f2988n = -1;
                } else {
                    try {
                        this.f2989o = Pattern.compile("^([A-Fa-f0-9]{8})$").matcher(table.toString()).matches();
                        if (this.f2989o) {
                            this.f2988n = hp.m3351b(table);
                        }
                    } catch (PatternSyntaxException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public final View m3307b() {
        return m3302f() ? this.f2979c.m1081d() : null;
    }

    public final void m3308c() {
        KonyMain.m4094a(new eL(this));
    }

    public final void m3309d() {
        KonyMain.m4094a(new eN(this));
    }

    public final void m3310g() {
        if (this.f2979c != null && this.f2979c.isShowing()) {
            this.f2979c.m1096j();
        }
    }

    public final void onFormHeightChanged(int i) {
        if (f2976l && this.f2979c != null) {
            this.f2979c.m1077c();
        }
    }
}
