package ny0k;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.api.ui.bt;
import com.konylabs.api.ui.bw;
import com.konylabs.api.ui.dB;
import com.konylabs.api.ui.eO;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class bk extends BaseAdapter {
    private static int f2194b;
    protected bG f2195a;
    private ArrayList f2196c;
    private cj f2197d;
    private ArrayList f2198e;
    private int f2199f;
    private View f2200g;
    private OnClickListener f2201h;
    private AccessibilityDelegateCompat f2202i;

    static {
        f2194b = 0;
    }

    public bk(bG bGVar, ArrayList arrayList) {
        this.f2198e = new ArrayList();
        this.f2199f = -1;
        this.f2200g = null;
        this.f2201h = new bl(this);
        this.f2202i = new bm(this);
        this.f2195a = bGVar;
        this.f2197d = bGVar.f4591c;
        this.f2196c = arrayList;
    }

    static /* synthetic */ boolean m2079a(bk bkVar, View view) {
        boolean z;
        bn bnVar = (bn) view.getTag();
        boolean a = bkVar.f2195a.m4902a(bnVar.j, bnVar.k);
        if (bkVar.f2195a.S == 1 || bkVar.f2195a.S == 2) {
            bH e;
            ImageView imageView;
            String str = (String) bkVar.f2195a.U;
            if (bkVar.f2195a.S == 1 && bkVar.f2199f >= 0) {
                e = bkVar.f2195a.m4911e(bkVar.f2199f);
                imageView = (ImageView) ((bI) e.f2132a).f3318b.f2279c;
                if (imageView instanceof bw) {
                    ((bw) imageView).m948c(str);
                } else if (imageView instanceof bt) {
                    ((bt) imageView).m908c(str);
                }
                e.f2137f = false;
            }
            e = bkVar.f2195a.m4911e(bnVar.l);
            imageView = (ImageView) ((bI) e.f2132a).f3318b.f2279c;
            e.f2137f = false;
            if (a) {
                str = (String) bkVar.f2195a.T;
                e.f2137f = true;
            }
            if (imageView instanceof bw) {
                ((bw) imageView).m948c(str);
            } else if (imageView instanceof bt) {
                ((bt) imageView).m908c(str);
            }
            z = e.f2137f;
        } else {
            z = a;
        }
        bkVar.f2199f = bnVar.l;
        return z;
    }

    protected abstract View m2082a(bJ bJVar);

    public final void m2083a() {
        this.f2199f = -1;
        this.f2200g = null;
    }

    protected abstract void m2084a(int i, int i2, int i3, boolean z);

    protected abstract View m2085b(bJ bJVar);

    public final void m2086b() {
        if (KonyMain.f3657e) {
            Log.d("KonyBaseAdaptor", "***Cleaning LuaSegUI Adapter Views***");
        }
        Iterator it = this.f2198e.iterator();
        while (it.hasNext()) {
            ((eO) it.next()).cleanup();
        }
        this.f2198e.clear();
    }

    public abstract dB m2087c();

    public abstract dB m2088d();

    public abstract dB m2089e();

    public abstract dB m2090f();

    public int getCount() {
        return this.f2197d.f2281a != null ? this.f2197d.f2281a.size() : 0;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return this.f2197d.f2281a != null ? ((bH) this.f2197d.f2281a.get(i)).f2136e : -1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        bn bnVar;
        Drawable drawable;
        dB dBVar;
        Drawable drawable2;
        Drawable drawable3 = null;
        Drawable drawable4 = null;
        bH bHVar = (bH) this.f2197d.f2281a.get(i);
        if (bHVar.f2132a instanceof bJ) {
            bJ bJVar = (bJ) bHVar.f2132a;
            if (view == null) {
                bnVar = new bn(this);
                if (bJVar.f3320b == 0) {
                    view = m2082a(bJVar);
                    drawable = null;
                    dBVar = null;
                    drawable2 = null;
                } else {
                    view = m2085b(bJVar);
                    eO eOVar = (eO) view.getTag();
                    this.f2198e.add(eOVar);
                    bnVar.f3340m = eOVar;
                    drawable = null;
                    dBVar = null;
                    drawable2 = null;
                }
            } else {
                bnVar = (bn) view.getTag();
                if (bJVar.f3320b == 0) {
                    ((TextView) view).setText(bJVar.c);
                    drawable = null;
                    dBVar = null;
                    drawable2 = null;
                } else {
                    this.f2195a.m4799a(bnVar.f3340m, bJVar.e.map);
                    drawable = null;
                    dBVar = null;
                    drawable2 = null;
                }
            }
        } else {
            Drawable p;
            bn bnVar2;
            Drawable drawable5;
            bI bIVar = (bI) bHVar.f2132a;
            ci ciVar = bIVar.f3318b;
            dB dBVar2 = ciVar != null ? ciVar.f2278b : null;
            dB c;
            if (view == null) {
                bn bnVar3 = new bn(this);
                c = m2087c();
                dB e = m2089e();
                dB d = m2088d();
                dB f = m2090f();
                Drawable p2 = dBVar2 != null ? dBVar2.m1162p() : null;
                if (c != null) {
                    drawable3 = c.m1162p();
                }
                p = e != null ? e.m1162p() : null;
                if (f != null) {
                    drawable4 = f.m1162p();
                } else if (d != null) {
                    drawable4 = d.m1162p();
                }
                drawable2 = new ColorDrawable(0);
                eO eOVar2 = bIVar.c;
                if (eOVar2 == null) {
                    eOVar2 = this.f2195a.m4834j();
                    bIVar.c = eOVar2;
                }
                eOVar2 = (eO) eOVar2.createClone();
                eOVar2.setTable(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG, bIVar.e);
                this.f2195a.m4799a(eOVar2, bIVar.d.map);
                view = eOVar2.getWidget();
                this.f2198e.add(eOVar2);
                bnVar3.f3340m = eOVar2;
                c = null;
                drawable = p;
                p = drawable4;
                drawable4 = p2;
                bnVar2 = bnVar3;
            } else {
                dB dBVar3;
                bn bnVar4 = (bn) view.getTag();
                eO a = bnVar4.f3340m;
                a.setTable(LuaWidget.ATTR_WIDGET_ACCESSIBILITY_CONFIG, bIVar.e);
                this.f2195a.m4799a(a, bIVar.d.map);
                if (dBVar2 != null) {
                    dB dBVar4 = bnVar4.f3336f;
                    if (dBVar4 != dBVar2) {
                        drawable4 = dBVar2.m1162p();
                        dBVar3 = dBVar4;
                    } else {
                        drawable4 = null;
                        dBVar3 = dBVar4;
                    }
                } else {
                    drawable4 = null;
                    dBVar3 = null;
                }
                drawable2 = bnVar4.f3333c;
                drawable3 = bnVar4.f3334d;
                Drawable drawable6 = bnVar4.f3335e;
                drawable = drawable3;
                drawable3 = drawable2;
                drawable2 = bnVar4.f3332b;
                bnVar2 = bnVar4;
                c = dBVar3;
                p = drawable6;
            }
            int i2 = bIVar.f3317a.f2133b != -1 ? i - (bIVar.f3317a.f2134c + 1) : i;
            Drawable stateListDrawable;
            if (dBVar2 != null) {
                if (bnVar2.f3337g == null || r4 != dBVar2) {
                    stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(bq.f3352c, drawable2);
                    stateListDrawable.addState(bq.f3354e, p);
                    stateListDrawable.addState(bq.f3353d, drawable4);
                    bnVar2.f3337g = stateListDrawable;
                    drawable5 = stateListDrawable;
                } else {
                    drawable5 = bnVar2.f3337g;
                }
            } else if (drawable == null || bIVar.f3317a.f2135d % 2 == 0) {
                if (bnVar2.f3339i != null) {
                    drawable5 = bnVar2.f3339i;
                } else {
                    stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(bq.f3352c, drawable2);
                    stateListDrawable.addState(bq.f3354e, p);
                    stateListDrawable.addState(bq.f3353d, drawable3);
                    bnVar2.f3339i = stateListDrawable;
                    drawable5 = stateListDrawable;
                }
            } else if (bnVar2.f3338h != null) {
                drawable5 = bnVar2.f3338h;
            } else {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(bq.f3352c, drawable2);
                stateListDrawable.addState(bq.f3354e, p);
                stateListDrawable.addState(bq.f3353d, drawable);
                bnVar2.f3338h = stateListDrawable;
                drawable5 = stateListDrawable;
            }
            view.setBackgroundDrawable(drawable5);
            if (bIVar.f3318b == null || bIVar.f3318b.f2277a) {
                view.setEnabled(true);
                view.setOnClickListener(this.f2201h);
                if (this.f2195a.S == 2 || this.f2195a.S == 1) {
                    ViewCompat.setAccessibilityDelegate(view, this.f2202i);
                }
            } else {
                view.setEnabled(false);
            }
            if (this.f2195a.ac) {
                int i3 = -1;
                if (this.f2195a.ag != -1 && this.f2195a.af != -1) {
                    i3 = this.f2197d.m2171b(this.f2195a.af, this.f2195a.ag);
                } else if (!(this.f2195a.ae == -1 || this.f2195a.ad == -1)) {
                    i3 = this.f2197d.m2171b(this.f2195a.ad, this.f2195a.ae);
                }
                if (i3 == i) {
                    if (p != null) {
                        view.setBackgroundDrawable(p);
                    }
                    this.f2200g = view;
                }
            }
            if (this.f2195a.S == 1 || this.f2195a.S == 2) {
                ci h;
                if (ciVar == null || ciVar.f2279c == null) {
                    h = this.f2195a.m4831h(bIVar.d);
                    bIVar.f3318b = h;
                } else {
                    ciVar.f2279c = this.f2195a.V;
                    h = ciVar;
                }
                ImageView imageView = (ImageView) h.f2279c;
                if (imageView != null) {
                    String str;
                    String str2 = (String) this.f2195a.U;
                    if (bHVar.f2137f) {
                        str = (String) this.f2195a.T;
                        if (this.f2195a.S == 1) {
                            this.f2199f = i2;
                        }
                    } else {
                        str = str2;
                    }
                    if (imageView instanceof bw) {
                        ((bw) imageView).m948c(str);
                    } else if (imageView instanceof bt) {
                        ((bt) imageView).m908c(str);
                    }
                }
            }
            bnVar2.f3331a = drawable5;
            bnVar2.j = bIVar.f3317a.f2134c;
            bnVar2.k = bIVar.f3317a.f2135d;
            bnVar2.l = i2;
            drawable4 = p;
            dBVar = dBVar2;
            bnVar = bnVar2;
        }
        bnVar.f3334d = drawable;
        bnVar.f3333c = drawable3;
        bnVar.f3332b = drawable2;
        bnVar.f3335e = drawable4;
        bnVar.f3336f = dBVar;
        view.setTag(bnVar);
        return view;
    }

    public int getViewTypeCount() {
        if (this.f2196c == null) {
            return 1;
        }
        int size = this.f2196c.size();
        return size > 0 ? size : 1;
    }
}
