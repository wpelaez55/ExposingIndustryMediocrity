package com.konylabs.api.ui;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.Iterator;

public final class ah {
    public String f526a;
    dB f527b;
    final /* synthetic */ ad f528c;
    private String f529d;
    private String f530e;
    private af f531f;
    private RelativeLayout f532g;
    private bM f533h;
    private bt f534i;
    private LinearLayout f535j;
    private int f536k;
    private int f537l;
    private dB f538m;
    private dB f539n;
    private dB f540o;
    private Drawable f541p;
    private Drawable f542q;
    private Drawable f543r;
    private boolean f544s;
    private dN f545t;
    private String f546u;
    private String f547v;
    private StateListDrawable f548w;
    private StateListDrawable f549x;
    private OnClickListener f550y;

    public ah(ad adVar, String str, String str2, String str3) {
        this.f528c = adVar;
        this.f532g = null;
        this.f536k = 19;
        this.f537l = 1;
        this.f544s = false;
        this.f548w = null;
        this.f549x = null;
        this.f527b = new dB();
        this.f550y = new aj(this);
        this.f526a = str;
        this.f529d = str2;
        this.f530e = str3;
    }

    private void m525b(boolean z) {
        if (this.f532g != null) {
            if (z) {
                this.f532g.setBackgroundDrawable(this.f548w);
                if (this.f538m != null) {
                    this.f538m.m1129b(this.f533h);
                    return;
                }
                return;
            }
            this.f532g.setBackgroundDrawable(this.f549x);
            if (this.f540o != null) {
                this.f540o.m1129b(this.f533h);
            }
        }
    }

    private void m526c() {
        if (this.f548w != null) {
            this.f548w.setCallback(null);
        }
        this.f548w = new StateListDrawable();
        if (this.f542q != null) {
            this.f548w.addState(ad.PRESSED_ENABLED_FOCUSED_STATE_SET, this.f542q);
            this.f548w.addState(ad.FOCUSED_STATE_SET, this.f542q);
            this.f548w.addState(ad.PRESSED_ENABLED_STATE_SET, this.f542q);
        }
        if (this.f541p != null) {
            this.f548w.addState(ad.ENABLED_STATE_SET, this.f541p);
        }
    }

    private void m529d() {
        if (this.f549x != null) {
            this.f549x.setCallback(null);
        }
        this.f549x = new StateListDrawable();
        if (this.f542q != null) {
            this.f549x.addState(ad.PRESSED_ENABLED_FOCUSED_STATE_SET, this.f542q);
            this.f549x.addState(ad.FOCUSED_STATE_SET, this.f542q);
            this.f549x.addState(ad.PRESSED_ENABLED_STATE_SET, this.f542q);
        }
        if (this.f543r != null) {
            this.f549x.addState(ad.ENABLED_STATE_SET, this.f543r);
        }
    }

    private void m531e() {
        if (this.f544s) {
            if (this.f546u != null) {
                this.f534i.m908c(this.f546u);
            }
        } else if (this.f547v != null) {
            this.f534i.m908c(this.f547v);
        }
    }

    private void m532f() {
        if (this.f532g != null) {
            this.f532g.removeAllViews();
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(dB.m1116r(2), dB.m1116r(2), dB.m1116r(2), dB.m1116r(2));
            View view = null;
            if (this.f534i != null) {
                view = this.f534i.m910d();
                view.setId(200);
            }
            layoutParams2.addRule(13);
            if (this.f537l == 1) {
                layoutParams.addRule(11);
                if (this.f536k == 19) {
                    layoutParams2.addRule(9);
                } else if (this.f536k == 21 && view != null) {
                    layoutParams2.addRule(0, view.getId());
                } else if (this.f536k == 17) {
                    layoutParams2.addRule(13);
                }
            } else if (this.f537l == 0) {
                layoutParams.addRule(9);
                if (this.f536k == 19 && view != null) {
                    layoutParams2.addRule(1, view.getId());
                } else if (this.f536k == 21) {
                    layoutParams2.addRule(11);
                } else if (this.f536k == 17) {
                    layoutParams2.addRule(13);
                }
            }
            if (view != null) {
                this.f532g.addView(view, layoutParams);
            }
            if (this.f533h != null) {
                this.f532g.addView(this.f533h.m753f(), layoutParams2);
            }
        }
    }

    static /* synthetic */ void m533f(ah ahVar) {
        Iterator it = ahVar.f528c.m2574a().iterator();
        while (it.hasNext()) {
            ah ahVar2 = (ah) it.next();
            if (ahVar2 != ahVar && ahVar2.f544s) {
                ahVar2.m543a(false);
            }
        }
    }

    public final View m537a() {
        if (this.f532g != null) {
            return this.f535j;
        }
        this.f535j = new LinearLayout(this.f528c.f2575j);
        this.f535j.setOrientation(1);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f532g = new ai(this, this.f528c.f2575j);
        this.f533h = new bM(this.f528c.f2575j);
        this.f534i = new bt(this.f528c.f2575j);
        this.f534i.m905b(new int[]{dB.m1116r(2), dB.m1116r(1), dB.m1116r(2), dB.m1116r(1)});
        if (this.f547v != null) {
            this.f534i.m908c(this.f547v);
        } else {
            this.f534i.m908c(this.f530e);
        }
        this.f533h.setText(this.f529d == null ? BuildConfig.FLAVOR : this.f529d);
        this.f532g.setOnClickListener(this.f550y);
        this.f532g.setFocusable(true);
        m526c();
        m529d();
        this.f532g.setBackgroundDrawable(this.f549x);
        this.f533h.m751e();
        this.f534i.m906c();
        m532f();
        if (this.f538m != null) {
            this.f538m.m1129b(this.f533h);
        }
        this.f535j.addView(this.f532g, layoutParams);
        if (this.f531f != null) {
            if (this.f531f.m516a() != null) {
                this.f535j.addView(this.f531f.m516a());
            }
            if (this.f544s) {
                this.f531f.m519a(this.f544s);
            } else {
                this.f531f.m516a().setVisibility(8);
            }
        }
        return this.f535j;
    }

    public final void m538a(int i) {
        this.f537l = i;
        m532f();
    }

    public final void m539a(af afVar) {
        this.f531f = afVar;
    }

    public final void m540a(dB dBVar) {
        this.f538m = dBVar;
        if (dBVar != null) {
            this.f541p = dB.m1102a(dBVar);
        } else {
            this.f541p = null;
        }
        m526c();
        m525b(this.f544s);
    }

    public final void m541a(dN dNVar) {
        this.f545t = dNVar;
    }

    public final void m542a(String str) {
        this.f546u = str;
    }

    public final void m543a(boolean z) {
        this.f544s = z;
        m531e();
        m525b(this.f544s);
        if (this.f531f != null) {
            this.f531f.m519a(z);
        }
    }

    public final void m544b() {
        this.f532g = null;
        if (this.f533h != null) {
            this.f533h.m754g();
        }
        this.f533h = null;
        if (this.f534i != null) {
            this.f534i.m915f();
        }
        this.f534i = null;
        this.f535j = null;
        if (this.f531f != null) {
            this.f531f.m520b();
            this.f531f = null;
        }
        if (this.f541p != null) {
            this.f541p.setCallback(null);
        }
        dB.m1104a(this.f541p);
        if (this.f542q != null) {
            this.f542q.setCallback(null);
        }
        dB.m1104a(this.f542q);
        if (this.f543r != null) {
            this.f543r.setCallback(null);
        }
        dB.m1104a(this.f543r);
        if (this.f548w != null) {
            this.f548w.setCallback(null);
        }
        this.f548w = null;
        if (this.f549x != null) {
            this.f549x.setCallback(null);
        }
        this.f549x = null;
        this.f541p = null;
        this.f542q = null;
        this.f543r = null;
    }

    public final void m545b(int i) {
        this.f536k = i;
        m532f();
    }

    public final void m546b(dB dBVar) {
        this.f539n = dBVar;
        if (dBVar != null) {
            this.f542q = dB.m1102a(dBVar);
        } else {
            this.f542q = null;
        }
        m526c();
        m529d();
        m525b(this.f544s);
    }

    public final void m547b(String str) {
        this.f547v = str;
    }

    public final void m548c(dB dBVar) {
        this.f540o = dBVar;
        if (dBVar != null) {
            this.f543r = dB.m1102a(dBVar);
        } else {
            this.f543r = null;
        }
        m529d();
        m525b(this.f544s);
    }
}
