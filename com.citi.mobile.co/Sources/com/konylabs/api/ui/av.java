package com.konylabs.api.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableLayout.LayoutParams;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import ny0k.cA;

public final class av extends TableLayout implements OnMenuItemClickListener, OnCreateContextMenuListener {
    Context f595a;
    aC f596b;
    OnClickListener f597c;
    private dB f598d;
    private dB f599e;
    private dB f600f;
    private Drawable f601g;
    private Drawable f602h;
    private int[] f603i;
    private LayoutParams f604j;
    private Vector f605k;
    private cv f606l;
    private aw f607m;
    private ArrayList f608n;
    private int f609o;
    private ArrayList f610p;
    private int f611q;
    private ArrayList f612r;
    private LinearLayout f613s;
    private boolean f614t;
    private int f615u;

    public av(Context context) {
        super(context);
        this.f598d = null;
        this.f599e = null;
        this.f600f = null;
        this.f601g = null;
        this.f602h = null;
        this.f603i = new int[]{0, 0, 0, 0};
        this.f605k = new Vector();
        this.f606l = null;
        this.f608n = new ArrayList();
        this.f611q = 1;
        this.f614t = false;
        this.f615u = 0;
        this.f595a = context;
        this.f596b = new aC();
        setOnCreateContextMenuListener(this);
        this.f604j = new LayoutParams(-2, -2);
        this.f601g = new cA(-7829368);
        this.f602h = new cA(-7829368);
    }

    static /* synthetic */ View m588a(av avVar) {
        bN bNVar = new bN(avVar.f595a);
        if (avVar.f610p == null) {
            avVar.f610p = new ArrayList();
        }
        avVar.f610p.add(bNVar);
        bNVar.m763b(1);
        bNVar.m758a(avVar.f609o == 0 ? -7829368 : avVar.f609o);
        bNVar.m767d(1);
        bNVar.m766c(avVar.f615u);
        bNVar.m760a(true);
        bNVar.m762b();
        return bNVar.m765c();
    }

    static /* synthetic */ View m589a(av avVar, int i) {
        bN bNVar = new bN(avVar.f595a);
        if (avVar.f610p == null) {
            avVar.f610p = new ArrayList();
        }
        avVar.f610p.add(bNVar);
        bNVar.m763b(2);
        bNVar.m758a(avVar.f609o == 0 ? -7829368 : avVar.f609o);
        bNVar.m767d(1);
        bNVar.m766c(avVar.f615u);
        bNVar.m762b();
        return bNVar.m765c();
    }

    static /* synthetic */ void m590a(av avVar, View view) {
        aB aBVar = (aB) view.getTag();
        if (!aBVar.f422j) {
            if (avVar.f611q == 2) {
                avVar.f612r.add((LinearLayout) view);
            } else if (avVar.f613s != null) {
                aB aBVar2 = (aB) avVar.f613s.getTag();
                aBVar2.f422j = false;
                aBVar2.m426e();
            }
            avVar.f613s = (LinearLayout) view;
            aBVar.m425d();
            aBVar.f422j = true;
        } else if (avVar.f611q == 2) {
            avVar.f612r.remove(view);
            aBVar.m426e();
            aBVar.f422j = false;
            avVar.f613s = (LinearLayout) view;
        }
    }

    private void m597h(int i) {
        for (int size = this.f608n.size() - 1; size >= i; size--) {
            aB aBVar = (aB) this.f608n.get(size);
            aBVar.f415c = size;
            if (this.f600f != null) {
                aBVar.f421i = null;
                aBVar.m426e();
            }
        }
    }

    public static void m598i() {
    }

    private void m599j() {
        aB aBVar;
        if (this.f611q != 1) {
            this.f613s = null;
            Iterator it = this.f612r.iterator();
            while (it.hasNext()) {
                aBVar = (aB) ((LinearLayout) it.next()).getTag();
                aBVar.m426e();
                aBVar.f422j = false;
            }
            this.f612r.clear();
        } else if (this.f613s != null) {
            aBVar = (aB) this.f613s.getTag();
            aBVar.m426e();
            aBVar.f422j = false;
            this.f613s = null;
        }
    }

    public final void m600a() {
        if (this.f608n != null) {
            Iterator it = this.f608n.iterator();
            while (it.hasNext()) {
                aB aBVar = (aB) it.next();
                if (aBVar.f420h != null) {
                    for (View padding : aBVar.f420h.values()) {
                        padding.setPadding(this.f603i[0], this.f603i[1], this.f603i[2], this.f603i[3]);
                    }
                }
            }
        }
    }

    public final void m601a(float f) {
        this.f604j.width = 0;
        this.f604j.weight = f;
    }

    public final void m602a(int i) {
        m599j();
        aB aBVar = (aB) this.f608n.remove(i);
        m597h(i);
        removeView(aBVar.m419a());
    }

    public final void m603a(int i, aB aBVar) {
        aB aBVar2 = (aB) this.f608n.get(i);
        for (String str : aBVar.f413a.keySet()) {
            aBVar2.m422a(str, (String) aBVar.f413a.get(str));
        }
        aBVar2.f419g = aBVar.f419g;
        aBVar2.f421i = null;
        for (String str2 : aBVar.f418f.keySet()) {
            aBVar2.m421a(str2, (dB) aBVar.f418f.get(str2));
        }
        if (!aBVar2.f422j) {
            aBVar2.m426e();
        }
    }

    public final void m604a(int i, String str, dB dBVar) {
        ((aB) this.f608n.get(i)).m421a(str, dBVar);
    }

    public final void m605a(int i, String str, String str2) {
        ((aB) this.f608n.get(i)).m422a(str, str2);
    }

    public final void m606a(OnClickListener onClickListener) {
        this.f597c = onClickListener;
    }

    public final void m607a(aB aBVar) {
        m599j();
        aBVar.f415c = this.f608n.size();
        this.f608n.add(aBVar);
        addView(aBVar.m419a());
    }

    public final void m608a(aB aBVar, int i) {
        if (i >= 0 && i <= this.f608n.size()) {
            m599j();
            aBVar.f415c = i;
            this.f608n.add(i, aBVar);
            m597h(i + 1);
            addView(aBVar.m419a(), i + 1);
        } else if (KonyMain.f3658f) {
            Log.w("KonyDataGrid", "Datagrid row index is invalid or out of bounds " + i);
        }
    }

    public final void m609a(aw awVar) {
        this.f607m = awVar;
        addView(awVar.m635a(), 0);
    }

    public final void m610a(dB dBVar) {
        if (this.f598d != dBVar) {
            this.f598d = dBVar;
            if (dBVar != null) {
                this.f601g = dBVar.m1162p();
                this.f602h = dBVar.m1162p();
            } else {
                this.f601g = new cA(-7829368);
                this.f602h = new cA(-7829368);
            }
            if (this.f611q == 2) {
                if (this.f612r != null) {
                    Iterator it = this.f612r.iterator();
                    while (it.hasNext()) {
                        aB aBVar = (aB) ((LinearLayout) it.next()).getTag();
                        if (aBVar.f422j) {
                            aBVar.m425d();
                        }
                    }
                }
            } else if (this.f613s != null) {
                ((aB) this.f613s.getTag()).m425d();
            }
        }
    }

    public final void m611a(String str) {
        this.f615u = 0;
        if (str.equals("dotted")) {
            this.f615u = 1;
        }
        if (this.f610p != null) {
            Iterator it = this.f610p.iterator();
            while (it.hasNext()) {
                ((bN) it.next()).m766c(this.f615u);
            }
        }
    }

    public final void m612a(boolean z) {
        this.f604j.width = z ? -1 : -2;
    }

    public final void m613a(int[] iArr) {
        this.f604j.leftMargin = iArr[0];
        this.f604j.topMargin = iArr[1];
        this.f604j.rightMargin = iArr[2];
        this.f604j.bottomMargin = iArr[3];
    }

    public final void m614b() {
        this.f608n.clear();
        removeAllViews();
        this.f613s = null;
        if (this.f612r != null) {
            this.f612r.clear();
        }
        addView(this.f607m.m635a(), 0);
    }

    public final void m615b(int i) {
        this.f609o = i;
        if (this.f610p != null) {
            Iterator it = this.f610p.iterator();
            while (it.hasNext()) {
                ((bN) it.next()).m758a(i);
            }
        }
    }

    public final void m616b(dB dBVar) {
        if (this.f599e != dBVar) {
            this.f599e = dBVar;
            Iterator it = this.f608n.iterator();
            while (it.hasNext()) {
                aB aBVar = (aB) it.next();
                aBVar.f421i = null;
                if (aBVar.f419g == null && !aBVar.f422j) {
                    aBVar.m426e();
                } else if (KonyMain.f3657e) {
                    Log.d("KonyDataGrid", "Not applying row skin for the row at index " + aBVar.f415c + " since row specific skin is present");
                }
            }
        }
    }

    public final void m617b(boolean z) {
        this.f604j.height = z ? -1 : -2;
    }

    public final void m618b(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            this.f603i[i] = iArr[i];
        }
    }

    public final int m619c() {
        return this.f608n.size();
    }

    public final void m620c(int i) {
        super.setVisibility(i);
    }

    public final void m621c(dB dBVar) {
        if (this.f600f != dBVar) {
            this.f600f = dBVar;
            int size = this.f608n.size();
            for (int i = 1; i < size; i += 2) {
                aB aBVar = (aB) this.f608n.get(i);
                aBVar.f421i = null;
                if (aBVar.f419g == null && !aBVar.f422j) {
                    aBVar.m426e();
                }
            }
        }
    }

    public final void m622c(boolean z) {
        int i = z ? 2 : 1;
        if (this.f611q != i) {
            m599j();
        }
        this.f611q = i;
        if (this.f611q == 2) {
            this.f612r = new ArrayList();
        }
    }

    public final void m623d() {
        if (!this.f614t) {
            setLayoutParams(this.f604j);
            if (KonyMain.f3656d <= 4) {
                View textView = new TextView(this.f595a);
                addView(textView);
                textView.setVisibility(8);
            }
            this.f614t = true;
        }
    }

    public final void m624d(int i) {
        this.f604j.gravity = i;
    }

    public final void m625d(boolean z) {
        if (this.f611q == 2) {
            this.f612r.clear();
            Iterator it;
            aB aBVar;
            if (z) {
                it = this.f608n.iterator();
                while (it.hasNext()) {
                    aBVar = (aB) it.next();
                    aBVar.m425d();
                    aBVar.f422j = true;
                    this.f612r.add(aBVar.f414b);
                }
                return;
            }
            it = this.f608n.iterator();
            while (it.hasNext()) {
                aBVar = (aB) it.next();
                aBVar.m426e();
                aBVar.f422j = false;
            }
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return isEnabled() ? super.dispatchKeyEvent(keyEvent) : true;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return isEnabled() ? super.dispatchTouchEvent(motionEvent) : true;
    }

    public final void m626e() {
        this.f614t = false;
        m623d();
    }

    public final void m627e(int i) {
        setGravity(i);
        if (this.f608n != null) {
            Iterator it = this.f608n.iterator();
            while (it.hasNext()) {
                aB aBVar = (aB) it.next();
                if (aBVar.f420h != null) {
                    for (View view : aBVar.f420h.values()) {
                        if (view instanceof bM) {
                            ((bM) view).setGravity(i);
                        }
                    }
                }
            }
        }
    }

    public final void m628e(boolean z) {
        setClickable(z);
        setEnabled(z);
        setFocusable(z);
        if (z) {
            setDescendantFocusability(AccessibilityNodeInfoCompat.ACTION_SET_SELECTION);
        } else {
            setDescendantFocusability(393216);
        }
    }

    public final void m629f() {
        Iterator it = this.f608n.iterator();
        while (it.hasNext()) {
            ((aB) it.next()).m423b();
        }
        this.f613s = null;
        if (this.f612r != null) {
            this.f612r.clear();
            this.f612r = null;
        }
        setBackgroundDrawable(null);
        this.f610p.clear();
        this.f610p = null;
    }

    public final void m630f(int i) {
        getLayoutParams().height = i;
        Iterator it = this.f608n.iterator();
        while (it.hasNext()) {
            aB aBVar = (aB) it.next();
            if (aBVar.f420h != null) {
                for (View view : aBVar.f420h.values()) {
                    if (view instanceof bM) {
                        ((bM) view).setHeight(i / this.f608n.size());
                    }
                }
            }
        }
    }

    public final int m631g() {
        return this.f613s == null ? -1 : ((aB) this.f613s.getTag()).f415c;
    }

    public final void m632g(int i) {
        getLayoutParams().width = i;
        Iterator it = this.f608n.iterator();
        while (it.hasNext()) {
            aB aBVar = (aB) it.next();
            if (aBVar.f420h != null) {
                for (View view : aBVar.f420h.values()) {
                    if (view instanceof bM) {
                        ((bM) view).setHeight(i / aBVar.f420h.size());
                    }
                }
            }
        }
    }

    public final int[] m633h() {
        if (this.f611q != 2) {
            return null;
        }
        int size = this.f612r.size();
        if (size == 0) {
            return null;
        }
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((aB) ((LinearLayout) this.f612r.get(i)).getTag()).f415c;
        }
        return iArr;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        if (!this.f605k.isEmpty()) {
            for (int i = 0; i < this.f605k.size(); i++) {
                cu cuVar = (cu) this.f605k.elementAt(i);
                MenuItem add = contextMenu.add(cuVar.m1044b());
                Drawable d = cuVar.m1046d();
                if (d != null) {
                    add.setIcon(d);
                }
                add.setOnMenuItemClickListener(this);
            }
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return false;
    }
}
