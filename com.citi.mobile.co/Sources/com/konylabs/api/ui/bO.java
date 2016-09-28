package com.konylabs.api.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnKeyListener;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils.TruncateAt;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.konylabs.android.KonyMain;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import ny0k.cA;

public final class bO extends ListView {
    private bT f735A;
    private LinearLayout f736B;
    private LayoutParams f737C;
    private String f738D;
    private String f739E;
    private Drawable f740F;
    private boolean f741G;
    private StateListDrawable f742H;
    private ColorStateList f743I;
    private dB f744J;
    private dB f745K;
    private OnKeyListener f746L;
    private boolean f747M;
    private OnItemClickListener f748N;
    private Drawable f749O;
    private Drawable f750P;
    private boolean f751Q;
    private boolean f752R;
    private String f753S;
    private int f754T;
    public boolean f755a;
    public TruncateAt f756b;
    public TruncateAt f757c;
    TextView f758d;
    Dialog f759e;
    bV f760f;
    public ArrayList f761g;
    private Context f762h;
    private LayoutParams f763i;
    private LayoutParams f764j;
    private dB f765k;
    private dB f766l;
    private Drawable f767m;
    private Drawable f768n;
    private Drawable f769o;
    private Drawable f770p;
    private int[] f771q;
    private Rect f772r;
    private boolean f773s;
    private TruncateAt f774t;
    private TruncateAt f775u;
    private ArrayList f776v;
    private LinearLayout f777w;
    private ArrayAdapter f778x;
    private ImageView f779y;
    private LayoutParams f780z;

    public bO(Context context) {
        super(context);
        this.f763i = null;
        this.f764j = null;
        this.f765k = null;
        this.f766l = null;
        this.f767m = null;
        this.f768n = null;
        this.f769o = null;
        this.f770p = null;
        this.f771q = new int[]{0, 0, 0, 0};
        int[] iArr = new int[]{8, 0, 8, 0};
        this.f772r = null;
        this.f773s = false;
        this.f755a = false;
        this.f774t = TruncateAt.END;
        this.f756b = TruncateAt.END;
        this.f775u = null;
        this.f757c = null;
        this.f776v = new ArrayList();
        this.f777w = null;
        this.f778x = null;
        this.f738D = "ic_list_normal_icon.png";
        this.f739E = "ic_popup_list_icon.png";
        this.f746L = new bP(this);
        this.f747M = false;
        this.f748N = new bQ(this);
        this.f749O = null;
        this.f750P = null;
        this.f751Q = true;
        this.f752R = false;
        this.f753S = "Select";
        this.f754T = 19;
        this.f762h = context;
        this.f777w = new LinearLayout(context);
        this.f763i = new LayoutParams(-2, -2);
        this.f764j = new LayoutParams(-1, -2);
        setOnItemClickListener(this.f748N);
        this.f760f = this.f760f;
        this.f736B = new LinearLayout(this.f762h);
        this.f737C = new LayoutParams(-2, -2);
        this.f758d = new TextView(this.f762h);
        this.f780z = new LayoutParams(-2, -2);
        this.f780z.setMargins(10, 0, 3, 0);
        this.f758d.setTextSize(2, 20.0f);
        this.f758d.setTypeface(Typeface.SERIF, 1);
        this.f758d.setId(1);
        this.f758d.setClickable(true);
        this.f758d.setLayoutParams(this.f780z);
        this.f775u = this.f758d.getEllipsize();
        this.f758d.setSingleLine(this.f773s);
        if (this.f773s) {
            this.f758d.setEllipsize(this.f774t);
        }
        this.f779y = new ImageView(this.f762h);
        this.f779y.setClickable(true);
        this.f779y.setFocusable(true);
        this.f779y.setId(2);
        this.f779y.setLayoutParams(new LayoutParams(-2, -2));
        this.f779y.setBackgroundDrawable(dB.m1112c(this.f738D));
        this.f736B.addView(this.f758d);
        this.f736B.addView(this.f779y);
        this.f736B.setGravity(19);
        this.f777w.addView(this.f736B, this.f737C);
        if (KonyMain.f3656d >= 16) {
            this.f758d.setImportantForAccessibility(2);
            this.f779y.setImportantForAccessibility(2);
        }
        this.f736B.setFocusable(true);
        this.f735A = new bT();
        m806c(true);
        this.f740F = getSelector();
        if (KonyMain.f3656d >= 16) {
            this.f758d.setImportantForAccessibility(2);
            this.f777w.setImportantForAccessibility(2);
        }
    }

    private void m771a(View view) {
        Drawable stateListDrawable;
        Drawable colorDrawable;
        if (!this.f751Q || this.f744J == null) {
            if (this.f752R) {
                stateListDrawable = new StateListDrawable();
                colorDrawable = new ColorDrawable(-1);
                Drawable colorDrawable2 = new ColorDrawable(0);
                stateListDrawable.addState(SELECTED_STATE_SET, colorDrawable2);
                stateListDrawable.addState(PRESSED_ENABLED_STATE_SET, colorDrawable2);
                stateListDrawable.addState(ENABLED_STATE_SET, colorDrawable);
                view.setBackgroundDrawable(stateListDrawable);
            } else {
                view.setBackgroundDrawable(null);
            }
            dB.m1105a((CheckedTextView) view.findViewById(16908308));
        } else {
            if (this.f745K != null) {
                stateListDrawable = new StateListDrawable();
                colorDrawable = new ColorDrawable(0);
                stateListDrawable.addState(SELECTED_STATE_SET, colorDrawable);
                stateListDrawable.addState(PRESSED_ENABLED_STATE_SET, colorDrawable);
                stateListDrawable.addState(ENABLED_STATE_SET, this.f744J.m1162p());
                view.setBackgroundDrawable(stateListDrawable);
            } else {
                view.setBackgroundDrawable(this.f744J.m1162p());
            }
            this.f744J.m1132c((CheckedTextView) view.findViewById(16908308));
        }
        m774b(view);
    }

    private void m774b(View view) {
        CheckedTextView checkedTextView;
        if (!this.f751Q) {
            checkedTextView = (CheckedTextView) view.findViewById(16908308);
            if (this.f752R) {
                checkedTextView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            } else {
                checkedTextView.setTextColor(-1);
            }
        } else if (this.f744J != null) {
            if (this.f745K != null) {
                int m = this.f745K.m1156m();
                r1 = this.f744J.m1156m();
                int[] iArr = new int[]{m, m, r1};
                ((CheckedTextView) view.findViewById(16908308)).setTextColor(new ColorStateList(new int[][]{SELECTED_STATE_SET, PRESSED_ENABLED_STATE_SET, ENABLED_STATE_SET}, iArr));
                return;
            }
            this.f744J.m1129b((CheckedTextView) view.findViewById(16908308));
        } else if (this.f745K != null) {
            checkedTextView = (CheckedTextView) view.findViewById(16908308);
            int m2 = this.f745K.m1156m();
            r1 = -1;
            if (this.f752R) {
                r1 = ViewCompat.MEASURED_STATE_MASK;
            }
            int[] iArr2 = new int[]{m2, m2, r1};
            checkedTextView.setTextColor(new ColorStateList(new int[][]{SELECTED_STATE_SET, PRESSED_ENABLED_STATE_SET, ENABLED_STATE_SET}, iArr2));
        } else {
            checkedTextView = (CheckedTextView) view.findViewById(16908308);
            if (this.f752R) {
                checkedTextView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            } else {
                checkedTextView.setTextColor(-1);
            }
        }
    }

    private static TruncateAt m779g(int i) {
        TruncateAt truncateAt = TruncateAt.END;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                return TruncateAt.START;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                return TruncateAt.MIDDLE;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                return TruncateAt.END;
            default:
                return truncateAt;
        }
    }

    private void m785m() {
        if (isFocused()) {
            if (this.f765k != null) {
                this.f765k.m1132c(this.f758d);
            }
        } else if (this.f766l != null) {
            this.f766l.m1132c(this.f758d);
        } else {
            dB.m1111b(this.f758d, false);
        }
    }

    public final void m786a() {
        int i = ViewCompat.MEASURED_STATE_MASK;
        if (this.f772r == null) {
            this.f772r = new Rect();
        }
        if (this.f768n == null || !(this.f768n instanceof cA)) {
            this.f736B.setPadding(this.f772r.left, this.f772r.top, this.f772r.right, this.f772r.bottom);
        } else {
            ((cA) this.f768n).m2097a(this.f772r);
        }
        if (this.f767m != null) {
            if (this.f767m instanceof cA) {
                ((cA) this.f767m).m2097a(this.f772r);
            } else {
                this.f736B.setPadding(this.f772r.left, this.f772r.top, this.f772r.right, this.f772r.bottom);
            }
            this.f742H = new StateListDrawable();
            this.f742H.addState(FOCUSED_STATE_SET, this.f767m);
            this.f742H.addState(PRESSED_ENABLED_STATE_SET, this.f767m);
            this.f742H.addState(ENABLED_STATE_SET, this.f768n);
            this.f736B.setBackgroundDrawable(this.f742H);
        } else {
            this.f736B.setBackgroundDrawable(this.f768n);
        }
        int[][] iArr = new int[][]{FOCUSED_STATE_SET, PRESSED_ENABLED_STATE_SET, ENABLED_STATE_SET};
        int[] iArr2 = new int[3];
        int m = this.f765k != null ? this.f765k.m1156m() : this.f766l != null ? this.f766l.m1156m() : ViewCompat.MEASURED_STATE_MASK;
        iArr2[0] = m;
        m = this.f765k != null ? this.f765k.m1156m() : this.f766l != null ? this.f766l.m1156m() : ViewCompat.MEASURED_STATE_MASK;
        iArr2[1] = m;
        if (this.f766l != null) {
            i = this.f766l.m1156m();
        }
        iArr2[2] = i;
        this.f743I = new ColorStateList(iArr, iArr2);
        this.f758d.setTextColor(this.f743I);
        m785m();
    }

    public final void m787a(float f) {
        this.f763i.width = 0;
        this.f763i.weight = f;
    }

    public final void m788a(int i) {
        this.f777w.setVisibility(i);
    }

    public final void m789a(CheckedTextView checkedTextView, String str) {
        Object obj;
        Iterator it = this.f776v.iterator();
        if (this.f749O != null) {
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(((bS) it.next()).f784a)) {
                    checkedTextView.setCheckMarkDrawable(this.f749O);
                    obj = 1;
                    break;
                }
            }
        }
        obj = null;
        if (obj == null && this.f750P != null) {
            checkedTextView.setCheckMarkDrawable(this.f750P);
        }
    }

    public final void m790a(bV bVVar) {
        this.f760f = bVVar;
    }

    public final void m791a(dB dBVar) {
        this.f765k = dBVar;
        if (dBVar != null) {
            this.f767m = dBVar.m1162p();
            if (this.f767m instanceof cA) {
                ((cA) this.f767m).m2098a(true);
            }
        }
    }

    public final void m792a(String str) {
        this.f738D = str;
        this.f779y.setBackgroundDrawable(dB.m1112c(this.f738D));
    }

    public final void m793a(boolean z) {
        this.f741G = true;
        this.f763i.width = -1;
        this.f764j.width = -1;
        this.f737C.width = -1;
        this.f780z.weight = 1.0f;
        this.f758d.setLayoutParams(this.f780z);
        this.f777w.setLayoutParams(this.f763i);
        this.f736B.setLayoutParams(this.f737C);
    }

    public final void m794a(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            this.f771q[i] = iArr[i];
        }
        ez.m1344a(this.f771q, this.f777w, this.f763i);
    }

    public final void m795a(bS[] bSVarArr) {
        if (bSVarArr != null) {
            for (int i = 0; i < bSVarArr.length; i++) {
                if (bSVarArr[i] != null) {
                    this.f778x.add(bSVarArr[i]);
                }
            }
        }
        this.f776v.clear();
    }

    final void m796b() {
        this.f736B.setFocusableInTouchMode(true);
        this.f736B.requestFocus();
        this.f736B.setFocusableInTouchMode(false);
    }

    public final void m797b(int i) {
        this.f763i.gravity = i;
        this.f777w.setGravity(i);
    }

    public final void m798b(dB dBVar) {
        this.f745K = dBVar;
        if (this.f751Q && this.f744J == null && dBVar == null) {
            this.f744J = this.f766l;
            dB dBVar2 = this.f765k;
        }
    }

    public final void m799b(String str) {
        this.f739E = str;
    }

    public final void m800b(boolean z) {
        this.f764j.height = -1;
    }

    public final void m801b(int[] iArr) {
        this.f772r = new Rect();
        this.f772r.left = iArr[0];
        this.f772r.top = iArr[1];
        this.f772r.right = iArr[2];
        this.f772r.bottom = iArr[3];
    }

    public final bS m802c(String str) {
        boolean z = false;
        int i = 0;
        bS bSVar = null;
        while (i < this.f778x.getCount()) {
            bSVar = (bS) this.f778x.getItem(i);
            if (bSVar.f784a.equals(str)) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            super.setItemChecked(i, true);
            this.f758d.setText(bSVar.f785b);
            if (getChoiceMode() == 2) {
                if (!this.f776v.contains(bSVar)) {
                    this.f776v.add(bSVar);
                }
            } else if (!this.f776v.contains(bSVar)) {
                this.f776v.clear();
                this.f776v.add(bSVar);
            }
            return bSVar;
        } else if (!KonyMain.f3658f) {
            return null;
        } else {
            Log.w("KonyListBox", "ListBox: key not found - " + str);
            return null;
        }
    }

    public final ArrayList m803c() {
        return this.f776v;
    }

    public final void m804c(int i) {
        this.f758d.setHintTextColor(i);
    }

    public final void m805c(dB dBVar) {
        this.f766l = dBVar;
        if (dBVar != null) {
            this.f768n = dBVar.m1162p();
            if (this.f768n instanceof cA) {
                ((cA) this.f768n).m2098a(true);
                return;
            }
            return;
        }
        this.f768n = new cA(0);
    }

    public final void m806c(boolean z) {
        this.f779y.setFocusable(z);
        this.f758d.setFocusable(z);
        this.f736B.setClickable(z);
        this.f779y.setClickable(z);
        this.f758d.setClickable(z);
        if (z) {
            this.f736B.setOnClickListener(this.f735A);
            this.f779y.setOnClickListener(this.f735A);
            this.f758d.setOnClickListener(this.f735A);
        }
    }

    public final void m807d() {
        this.f758d.setText(BuildConfig.FLAVOR);
        clearChoices();
        this.f778x.clear();
        this.f776v.clear();
        this.f761g.clear();
    }

    public final void m808d(int i) {
        this.f754T = i;
        if (this.f778x != null) {
            this.f778x.notifyDataSetChanged();
        }
        if (this.f741G) {
            switch (i) {
                case LuaWidget.KONY_WIDGET_POS_MIDDLE_CENTER /*17*/:
                case LuaWidget.KONY_WIDGET_POS_TOP_CENTER /*49*/:
                case LuaWidget.KONY_WIDGET_POS_BOTTOM_CENTER /*81*/:
                    i = 17;
                    break;
                case LuaWidget.KONY_WIDGET_POS_MIDDLE_LEFT /*19*/:
                case LuaWidget.KONY_WIDGET_POS_TOP_LEFT /*51*/:
                case LuaWidget.KONY_WIDGET_POS_BOTTOM_LEFT /*83*/:
                    i = 19;
                    break;
                case LuaWidget.KONY_WIDGET_POS_MIDDLE_RIGHT /*21*/:
                case LuaWidget.KONY_WIDGET_POS_TOP_RIGHT /*53*/:
                case LuaWidget.KONY_WIDGET_POS_BOTTOM_RIGHT /*85*/:
                    i = 21;
                    break;
            }
            this.f736B.setGravity(i);
        }
    }

    public final void m809d(dB dBVar) {
        this.f744J = dBVar;
        if (this.f751Q && dBVar == null && this.f745K == null) {
            dB dBVar2 = this.f766l;
            this.f745K = this.f765k;
        }
    }

    public final void m810d(String str) {
        this.f749O = dB.m1112c(str);
    }

    public final void m811d(boolean z) {
        this.f751Q = z;
        if (z && this.f744J == null && this.f745K == null) {
            this.f744J = this.f766l;
            this.f745K = this.f765k;
        }
        m825i();
        m826j();
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        m785m();
    }

    public final void m812e() {
        if (!this.f747M) {
            this.f777w.setLayoutParams(this.f763i);
            if (KonyMain.f3657e) {
                Log.d("KonyListBox", "ListView child count = " + getChildCount());
            }
            m786a();
            this.f747M = true;
        }
    }

    public final void m813e(int i) {
        if (i >= 0 && i <= 2) {
            this.f774t = m779g(i);
            if (this.f773s && this.f758d != null) {
                this.f758d.setEllipsize(this.f774t);
            }
        }
    }

    public final void m814e(String str) {
        this.f750P = dB.m1112c(str);
    }

    public final void m815e(boolean z) {
        int i;
        int i2 = 0;
        this.f752R = z;
        ArrayAdapter bRVar = z ? new bR(this, this.f762h, 17367049) : new bR(this, this.f762h, 17367045);
        if (!(this.f778x == null || this.f778x.isEmpty())) {
            int count = this.f778x.getCount();
            for (i = 0; i < count; i++) {
                bRVar.add(this.f778x.getItem(i));
            }
        }
        this.f778x = bRVar;
        setAdapter(this.f778x);
        if (this.f776v != null && this.f776v.size() > 0) {
            if (getChoiceMode() == 1) {
                m802c(((bS) this.f776v.get(0)).f784a);
                return;
            }
            i = this.f776v.size();
            while (i2 < i) {
                m802c(((bS) this.f776v.get(i2)).f784a);
                i2++;
            }
        }
    }

    public final View m816f() {
        return this.f777w;
    }

    public final void m817f(int i) {
        if (i >= 0 && i <= 2) {
            this.f756b = m779g(i);
        }
    }

    public final void m818f(String str) {
        this.f753S = str;
    }

    public final void m819f(boolean z) {
        this.f773s = z;
        if (this.f758d != null) {
            this.f758d.setSingleLine(this.f773s);
            if (this.f773s) {
                this.f758d.setEllipsize(this.f774t);
            } else {
                this.f758d.setEllipsize(this.f775u);
            }
        }
    }

    public final void m820g() {
        this.f747M = false;
        m812e();
    }

    public final void m821g(String str) {
        this.f758d.setHint(str);
    }

    public final void m822g(boolean z) {
        this.f755a = z;
    }

    public final void m823h() {
        if (this.f761g != null) {
            this.f761g.clear();
            this.f761g = null;
        }
        if (this.f759e != null) {
            this.f759e.dismiss();
        }
        if (this.f742H != null) {
            this.f742H.setCallback(null);
        }
        this.f742H = null;
        if (this.f768n != null) {
            this.f768n.setCallback(null);
        }
        dB.m1104a(this.f768n);
        dB.m1104a(null);
        if (this.f767m != null) {
            this.f767m.setCallback(null);
        }
        dB.m1104a(this.f767m);
        dB.m1104a(null);
        if (this.f749O != null) {
            this.f749O.setCallback(null);
        }
        dB.m1104a(this.f749O);
        if (this.f750P != null) {
            this.f750P.setCallback(null);
        }
        dB.m1104a(this.f750P);
    }

    public final void m824h(String str) {
        if (str != null) {
            this.f736B.setContentDescription(str);
            if (KonyMain.f3656d >= 16) {
                this.f736B.setImportantForAccessibility(1);
            }
        } else if (KonyMain.f3656d >= 16) {
            this.f736B.setImportantForAccessibility(2);
        } else {
            this.f736B.setContentDescription(BuildConfig.FLAVOR);
        }
    }

    public final void m825i() {
        if (!this.f751Q || this.f745K == null) {
            setSelector(this.f740F);
        } else {
            setSelector(this.f745K.m1162p());
        }
        Iterator it = this.f761g.iterator();
        while (it.hasNext()) {
            m774b((View) it.next());
        }
    }

    public final void m826j() {
        Iterator it = this.f761g.iterator();
        while (it.hasNext()) {
            m771a((View) it.next());
        }
    }

    public final void m827k() {
        this.f758d.setText(BuildConfig.FLAVOR);
    }

    public final void m828l() {
        m805c(this.f766l);
        m791a(this.f765k);
        m809d(this.f744J);
        m798b(this.f745K);
        m786a();
        m811d(this.f751Q);
    }
}
