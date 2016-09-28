package com.konylabs.api.ui;

import android.view.View;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Hashtable;

public final class ch {
    public float f978a;
    public float f979b;
    public String f980c;
    public String f981d;
    public String f982e;
    public boolean f983f;
    public boolean f984g;
    public boolean f985h;
    public View f986i;
    public Hashtable f987j;

    public ch(bW bWVar, float f, float f2, String str, String str2, boolean z, Hashtable hashtable) {
        this.f982e = null;
        this.f978a = f;
        this.f979b = f2;
        this.f980c = str;
        this.f981d = str2;
        this.f983f = z;
        this.f985h = true;
        this.f986i = null;
        this.f987j = hashtable;
        this.f984g = false;
    }

    public final void m1029a(String str) {
        if (str != null && !str.trim().equals(BuildConfig.FLAVOR)) {
            this.f982e = str;
        }
    }
}
