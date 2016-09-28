package com.konylabs.android;

import android.app.ActionBar;
import android.app.ActionBar.LayoutParams;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.konylabs.api.ui.dB;

/* renamed from: com.konylabs.android.e */
public final class C0132e {
    public static boolean f27a;
    private static ActionBar f28b;
    private static TextView f29c;

    static {
        f27a = false;
        f28b = null;
        f29c = null;
    }

    public static void m29a() {
        f28b = null;
        f29c = null;
    }

    public static void m30a(ActionBar actionBar) {
        f28b = actionBar;
    }

    public static void m31a(Drawable drawable) {
        if (f27a) {
            f28b.setBackgroundDrawable(drawable);
        }
    }

    public static void m32a(String str) {
        if (f27a && str != null) {
            KonyMain.getActivityContext();
            Drawable a = KonyMain.m4083a(str);
            if (KonyMain.f3656d >= 14 && a != null) {
                try {
                    f28b.getClass().getMethod("setIcon", new Class[]{Drawable.class}).invoke(f28b, new Object[]{a});
                } catch (Exception e) {
                }
            }
        }
    }

    public static void m33a(String str, dB dBVar) {
        if (f27a) {
            if (dBVar != null) {
                f28b.setDisplayShowCustomEnabled(true);
                f28b.setDisplayShowTitleEnabled(false);
                if (f29c == null) {
                    TextView textView = new TextView(KonyMain.getActivityContext());
                    f29c = textView;
                    textView.setGravity(16);
                    f29c.setLayoutParams(new LayoutParams(-2, -2));
                }
                f29c.setText(str);
                dBVar.m1129b(f29c);
                f28b.setCustomView(f29c);
                return;
            }
            f28b.setDisplayShowCustomEnabled(false);
            f28b.setDisplayShowTitleEnabled(true);
        }
        KonyMain.getActivityContext().setTitle(str);
    }

    public static void m34a(boolean z) {
        f27a = z;
    }

    public static void m35b(boolean z) {
        if (f27a) {
            f28b.setDisplayShowHomeEnabled(z);
        }
    }

    public static boolean m36b() {
        return f27a;
    }

    public static void m37c(boolean z) {
        if (!f27a) {
            return;
        }
        if (z) {
            if (!f28b.isShowing()) {
                f28b.show();
            }
        } else if (f28b.isShowing()) {
            f28b.hide();
        }
    }

    public static void m38d(boolean z) {
        if (f27a) {
            f28b.setDisplayHomeAsUpEnabled(z);
        }
    }
}
