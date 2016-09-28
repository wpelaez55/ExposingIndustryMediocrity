package ny0k;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout.LayoutParams;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.C0203f;
import com.konylabs.api.ui.dB;
import java.util.LinkedHashMap;

public final class bo extends C0203f implements bg, bh {
    private cg f3341c;
    private dB f3342d;
    private dB f3343e;
    private dB f3344f;
    private dB f3345g;
    private int f3346h;
    private int[] f3347i;
    private boolean f3348j;
    private LayoutParams f3349k;
    private boolean f3350l;
    private cj f3351m;

    static {
        new int[1][0] = 16842913;
        new int[1][0] = 16842910;
        new int[1][0] = 16842919;
        new int[1][0] = 16842908;
    }

    public bo(Context context, boolean z) {
        super(context);
        this.f3346h = -1;
        this.f3347i = new int[4];
        this.f3348j = false;
        this.f3350l = true;
        if (z) {
            this.f3349k = new LayoutParams(-1, -1);
        } else {
            this.f3349k = new LayoutParams(-1, dB.m1116r(160));
        }
    }

    public final void m3666a(int i, int i2, int i3) {
        this.f3346h = i3;
        if (this.f3341c != null) {
            this.f3341c.m2163a(i, i2, true);
        }
    }

    public final void m3667a(View view) {
        this.f3346h = ((ck) view.getTag()).f2285l;
    }

    public final void m3668a(BaseAdapter baseAdapter) {
        super.m1391a((Adapter) baseAdapter);
    }

    public final void m3669a(dB dBVar) {
        if (dBVar != null) {
            setBackgroundDrawable(dBVar.m1162p());
        } else {
            setBackgroundDrawable(null);
        }
    }

    public final void m3670a(String str) {
    }

    public final void m3671a(LinkedHashMap linkedHashMap) {
    }

    public final void m3672a(cg cgVar) {
        this.f3341c = cgVar;
    }

    public final void m3673a(cj cjVar) {
        this.f3351m = cjVar;
    }

    public final void m3674a(int[] iArr) {
        for (int i : iArr) {
            if (KonyMain.f3657e) {
                Log.d("PageView", "margin = " + i);
            }
        }
        this.f3349k.leftMargin = iArr[0];
        this.f3349k.topMargin = iArr[1];
        this.f3349k.rightMargin = iArr[2];
        this.f3349k.bottomMargin = iArr[3];
    }

    public final void m3675b(int i, int i2) {
        if (this.f3351m == null) {
            this.f3346h = -1;
            return;
        }
        this.f3346h = this.f3351m.m2168a(i, i2);
        m1397c(this.f3346h, true);
    }

    public final void m3676b(View view) {
    }

    public final void m3677b(dB dBVar) {
        this.f3343e = dBVar;
    }

    public final void m3678b(String str) {
    }

    public final void m3679b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            this.f3347i[i] = iArr[i];
        }
    }

    public final void b_(boolean z) {
        this.f3350l = z;
    }

    public final void m3680c(int i, int i2) {
    }

    public final void m3681c(dB dBVar) {
        this.f3342d = dBVar;
    }

    public final dB m3682d() {
        return this.f3343e;
    }

    public final void m3683d(int i, int i2) {
        m3675b(i, i2);
    }

    public final void m3684d(dB dBVar) {
        this.f3344f = dBVar;
    }

    public final dB m3685e() {
        return this.f3342d;
    }

    public final void m3686e(dB dBVar) {
    }

    public final void e_(int i) {
        setVisibility(i);
    }

    public final dB m3687f() {
        return this.f3344f;
    }

    public final void m3688f(int i) {
        this.f3349k.height = i;
        post(new bp(this));
    }

    public final void m3689f(dB dBVar) {
        this.f3345g = dBVar;
    }

    public final dB m3690g() {
        return this.f3345g;
    }

    public final void m3691g(int i) {
    }

    public final View m3692k() {
        return this;
    }

    public final void m3693l() {
        if (!this.f3348j) {
            setLayoutParams(this.f3349k);
            this.f3348j = true;
        }
    }

    public final void m3694m() {
        clearDisappearingChildren();
    }

    public final void m3695n() {
    }

    public final void m3696o() {
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3350l && this.f3346h >= 0) {
            int i = this.f3346h;
            requestFocusFromTouch();
            m1397c(i, false);
        }
    }

    public final int m3697p() {
        return this.f3346h;
    }

    public final void m3698q() {
    }

    public final void m3699r() {
    }

    public final int m3700s() {
        return 0;
    }
}
