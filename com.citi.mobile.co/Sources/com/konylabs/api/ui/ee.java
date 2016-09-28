package com.konylabs.api.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils.TruncateAt;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView.OnEditorActionListener;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import ny0k.cA;

public final class ee extends LinearLayout {
    private static final int[] f1283u;
    public boolean f1284a;
    private dB f1285b;
    private dB f1286c;
    private Rect f1287d;
    private Drawable f1288e;
    private Drawable f1289f;
    private LayoutParams f1290g;
    private Drawable f1291h;
    private StateListDrawable f1292i;
    private ColorStateList f1293j;
    private EditText f1294k;
    private int f1295l;
    private LayoutParams f1296m;
    private int f1297n;
    private boolean f1298o;
    private ArrayAdapter f1299p;
    private ArrayList f1300q;
    private int f1301r;
    private boolean f1302s;
    private boolean f1303t;
    private boolean f1304v;
    private boolean f1305w;
    private int f1306x;
    private int f1307y;
    private boolean f1308z;

    static {
        f1283u = new int[]{-16842910};
    }

    public ee(Context context, int i) {
        super(context);
        this.f1285b = null;
        this.f1286c = null;
        this.f1287d = null;
        this.f1288e = null;
        this.f1289f = null;
        this.f1290g = null;
        this.f1294k = null;
        this.f1295l = 0;
        this.f1297n = 0;
        this.f1298o = false;
        this.f1301r = 1;
        this.f1302s = false;
        this.f1284a = true;
        this.f1304v = false;
        this.f1305w = false;
        this.f1306x = 0;
        this.f1307y = 0;
        this.f1308z = false;
        if (1 == i) {
            this.f1298o = true;
            this.f1294k = new ei(this, context);
        } else {
            this.f1294k = new ej(this, context);
        }
        this.f1290g = new LayoutParams(-2, -2);
        this.f1296m = new LayoutParams(-2, -2);
        addView(this.f1294k, this.f1296m);
        this.f1294k.setFocusableInTouchMode(true);
        this.f1291h = this.f1294k.getBackground();
    }

    private void m1293l() {
        this.f1284a = true;
        if (this.f1294k.isFocused()) {
            if (this.f1285b != null) {
                if (this.f1286c == null || !this.f1286c.m1161o()) {
                    this.f1285b.m1123a(this.f1294k, this.f1285b.m1161o());
                } else {
                    this.f1285b.m1123a(this.f1294k, true);
                }
            } else if (this.f1286c == null || !this.f1286c.m1161o()) {
                dB.m1107a(this.f1294k, false, false);
            } else {
                dB.m1107a(this.f1294k, false, true);
            }
        } else if (this.f1286c != null) {
            if (this.f1285b == null || !this.f1285b.m1161o()) {
                this.f1286c.m1123a(this.f1294k, this.f1286c.m1161o());
            } else {
                this.f1286c.m1123a(this.f1294k, true);
            }
        } else if (this.f1285b == null || !this.f1285b.m1161o()) {
            dB.m1107a(this.f1294k, false, false);
        } else {
            dB.m1107a(this.f1294k, false, true);
        }
    }

    private void m1294m() {
        if (this.f1297n == 11) {
            this.f1294k.setInputType(2);
            this.f1294k.setTransformationMethod(PasswordTransformationMethod.getInstance());
            return;
        }
        this.f1294k.setInputType(this.f1295l);
    }

    private void m1295n() {
        if ((this.f1295l & 15) != 3) {
            return;
        }
        if (this.f1308z) {
            this.f1294k.setKeyListener(new eg(this));
        } else {
            this.f1294k.setKeyListener(new eh(this, this.f1304v, this.f1305w));
        }
    }

    public final void m1296a() {
        this.f1302s = false;
        m1306b();
    }

    public final void m1297a(float f) {
        this.f1290g.width = 0;
        this.f1290g.weight = f;
    }

    public final void m1298a(int i) {
        this.f1301r = i;
    }

    public final void m1299a(TextWatcher textWatcher) {
        this.f1294k.addTextChangedListener(textWatcher);
    }

    public final void m1300a(OnEditorActionListener onEditorActionListener) {
        this.f1294k.setOnEditorActionListener(onEditorActionListener);
    }

    public final void m1301a(dB dBVar) {
        this.f1285b = dBVar;
        if (dBVar != null) {
            this.f1288e = dBVar.m1127b(true);
            if (this.f1288e == null && dBVar.m1165q()) {
                this.f1288e = this.f1291h;
                return;
            }
            return;
        }
        this.f1288e = null;
    }

    public final void m1302a(LuaTable luaTable) {
        if (!luaTable.list.isEmpty()) {
            int i;
            int size = luaTable.list.size();
            String[] strArr = new String[size];
            for (i = 0; i < size; i++) {
                strArr[i] = (String) luaTable.list.elementAt(i);
            }
            if (strArr.length > 0) {
                if (this.f1300q == null) {
                    this.f1300q = new ArrayList();
                }
                this.f1300q.clear();
                this.f1300q.addAll(Arrays.asList(strArr));
            }
            if (this.f1299p != null) {
                ((AutoCompleteTextView) this.f1294k).setAdapter(new ArrayAdapter(KonyMain.getAppContext(), 17367050, new ArrayList()));
                this.f1299p.clear();
                i = this.f1300q.size();
                for (int i2 = 0; i2 < i; i2++) {
                    this.f1299p.add(this.f1300q.get(i2));
                }
                ((AutoCompleteTextView) this.f1294k).setAdapter(this.f1299p);
                return;
            }
            this.f1299p = new ArrayAdapter(KonyMain.getAppContext(), 17367050, this.f1300q);
            ((AutoCompleteTextView) this.f1294k).setThreshold(this.f1301r);
            ((AutoCompleteTextView) this.f1294k).setAdapter(this.f1299p);
        }
    }

    public final void m1303a(String str) {
        CharSequence charSequence;
        CharSequence charSequence2 = null;
        if (hasFocus()) {
            if (this.f1285b != null) {
                charSequence2 = this.f1285b.m1118a(str);
            }
        } else if (this.f1286c != null) {
            charSequence2 = this.f1286c.m1118a(str);
        }
        if (charSequence2 != null) {
            charSequence = charSequence2;
        }
        this.f1294k.setText(charSequence);
        this.f1294k.setSelection(this.f1294k.getText().length());
    }

    public final void m1304a(boolean z) {
        int i = -1;
        this.f1290g.width = z ? -1 : -2;
        LayoutParams layoutParams = this.f1296m;
        if (!z) {
            i = -2;
        }
        layoutParams.width = i;
    }

    public final void m1305a(int[] iArr) {
        ez.m1344a(iArr, this, this.f1290g);
    }

    public final void m1306b() {
        if (!this.f1302s) {
            setLayoutParams(this.f1290g);
            m1294m();
            m1295n();
            if (this.f1298o && this.f1300q != null) {
                this.f1299p = new ArrayAdapter(KonyMain.getAppContext(), 17367050, this.f1300q);
                ((AutoCompleteTextView) this.f1294k).setThreshold(this.f1301r);
                ((AutoCompleteTextView) this.f1294k).setAdapter(this.f1299p);
            }
            m1328h();
            this.f1302s = true;
        }
    }

    public final void m1307b(int i) {
        setVisibility(i);
    }

    public final void m1308b(TextWatcher textWatcher) {
        this.f1294k.removeTextChangedListener(textWatcher);
    }

    public final void m1309b(dB dBVar) {
        this.f1286c = dBVar;
        if (dBVar != null) {
            this.f1289f = dBVar.m1127b(true);
            if (!(this.f1289f == null && dBVar.m1165q())) {
                return;
            }
        }
        this.f1289f = this.f1291h;
    }

    public final void m1310b(LuaTable luaTable) {
        if (!luaTable.list.isEmpty()) {
            int size = luaTable.list.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = (String) luaTable.list.elementAt(i);
            }
            if (strArr.length > 0) {
                if (this.f1300q == null) {
                    this.f1300q = new ArrayList();
                }
                this.f1300q.clear();
                this.f1300q.addAll(Arrays.asList(strArr));
            }
        }
    }

    public final void m1311b(String str) {
        this.f1294k.setEllipsize(TruncateAt.END);
        this.f1294k.setHint(str);
    }

    public final void m1312b(boolean z) {
        int i = -1;
        this.f1290g.height = z ? -1 : -2;
        LayoutParams layoutParams = this.f1296m;
        if (!z) {
            i = -2;
        }
        layoutParams.height = i;
    }

    public final void m1313b(int[] iArr) {
        this.f1287d = new Rect();
        this.f1287d.left = iArr[0];
        this.f1287d.top = iArr[1];
        this.f1287d.right = iArr[2];
        this.f1287d.bottom = iArr[3];
    }

    public final View m1314c() {
        return this;
    }

    public final void m1315c(int i) {
        this.f1294k.setHintTextColor(i);
    }

    public final void m1316c(String str) {
        if (str != null) {
            this.f1294k.setContentDescription(str);
            if (KonyMain.f3656d >= 16) {
                this.f1294k.setImportantForAccessibility(1);
            }
        } else if (KonyMain.f3656d >= 16) {
            this.f1294k.setImportantForAccessibility(2);
        } else {
            this.f1294k.setContentDescription(BuildConfig.FLAVOR);
        }
    }

    public final void m1317c(boolean z) {
        this.f1294k.setEnabled(z);
        this.f1294k.setFocusable(z);
        if (z) {
            this.f1294k.setFocusableInTouchMode(z);
        }
    }

    public final void m1318d() {
        this.f1294k.setTransformationMethod(SingleLineTransformationMethod.getInstance());
        this.f1295l |= 1;
        this.f1294k.setLines(1);
        this.f1294k.setMaxLines(1);
        this.f1294k.setGravity(19);
    }

    public final void m1319d(int i) {
        this.f1290g.gravity = i;
        setGravity(i);
    }

    public final void m1320d(boolean z) {
        if (z) {
            if ((this.f1295l & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0) {
                this.f1295l ^= AccessibilityNodeInfoCompat.ACTION_COLLAPSE;
            } else {
                return;
            }
        } else if ((this.f1295l & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) == 0) {
            this.f1295l |= AccessibilityNodeInfoCompat.ACTION_COLLAPSE;
        } else {
            return;
        }
        m1294m();
    }

    public final void m1321e() {
        this.f1303t = true;
        this.f1294k.setMinLines(4);
        this.f1294k.setGravity(51);
    }

    public final void m1322e(int i) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if ((this.f1295l & 15) != 1) {
                    this.f1294k.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    break;
                } else {
                    this.f1295l = 129;
                    break;
                }
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                this.f1295l = 3;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                this.f1295l = 1;
                break;
        }
        if (this.f1303t) {
            this.f1295l |= AccessibilityNodeInfoCompat.ACTION_SET_SELECTION;
        }
        m1294m();
        m1295n();
    }

    public final void m1323e(boolean z) {
        this.f1294k.setCursorVisible(z);
    }

    public final String m1324f() {
        return this.f1294k.getText().toString();
    }

    public final void m1325f(int i) {
        this.f1294k.setMinLines(i);
    }

    public final void m1326g() {
        if (this.f1291h != null) {
            this.f1291h.setCallback(null);
        }
        this.f1291h = null;
        if (this.f1292i != null) {
            this.f1292i.setCallback(null);
        }
        this.f1292i = null;
        if (this.f1289f != null) {
            this.f1289f.setCallback(null);
        }
        this.f1289f = null;
        if (this.f1288e != null) {
            this.f1288e.setCallback(null);
        }
        this.f1288e = null;
        this.f1294k.setBackgroundDrawable(null);
    }

    public final void m1327g(int i) {
        if (i >= 0) {
            this.f1294k.setFilters(new InputFilter[]{new LengthFilter(i)});
            String f = m1324f();
            if (i < f.length()) {
                this.f1294k.setText(f.substring(0, i));
            }
        }
    }

    public final void m1328h() {
        boolean z;
        Rect rect;
        int i = ViewCompat.MEASURED_STATE_MASK;
        Rect rect2 = new Rect();
        if (this.f1287d != null) {
            z = true;
            rect = this.f1287d;
        } else {
            rect = rect2;
            z = this.f1291h.getPadding(rect2);
        }
        if (z && this.f1289f != null && (this.f1289f instanceof cA)) {
            ((cA) this.f1289f).m2097a(rect);
        }
        if (z && this.f1288e != null && (this.f1288e instanceof cA)) {
            ((cA) this.f1288e).m2097a(rect);
        }
        if (this.f1289f == this.f1291h && this.f1288e == this.f1291h) {
            this.f1288e = null;
        }
        if (this.f1288e != null) {
            this.f1292i = new StateListDrawable();
            this.f1292i.addState(FOCUSED_STATE_SET, this.f1288e);
            this.f1292i.addState(f1283u, this.f1289f);
            this.f1292i.addState(ENABLED_STATE_SET, this.f1289f);
            ((DrawableContainerState) this.f1292i.getConstantState()).setConstantSize(true);
            this.f1294k.setBackgroundDrawable(this.f1292i);
        } else {
            this.f1294k.setBackgroundDrawable(this.f1289f);
            if (this.f1287d != null && this.f1289f == this.f1291h) {
                this.f1294k.setPadding(this.f1287d.left, this.f1287d.top, this.f1287d.right, this.f1287d.bottom);
            }
        }
        int[][] iArr = new int[][]{FOCUSED_STATE_SET, f1283u, ENABLED_STATE_SET};
        int[] iArr2 = new int[3];
        int m = this.f1285b != null ? this.f1285b.m1156m() : this.f1286c != null ? this.f1286c.m1156m() : ViewCompat.MEASURED_STATE_MASK;
        iArr2[0] = m;
        iArr2[1] = this.f1286c != null ? this.f1286c.m1156m() : ViewCompat.MEASURED_STATE_MASK;
        if (this.f1286c != null) {
            i = this.f1286c.m1156m();
        }
        iArr2[2] = i;
        this.f1293j = new ColorStateList(iArr, iArr2);
        this.f1294k.setTextColor(this.f1293j);
        m1293l();
    }

    public final void m1329h(int i) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                this.f1295l ^= this.f1306x;
                this.f1306x = AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD;
                this.f1295l |= this.f1306x;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                this.f1295l ^= this.f1306x;
                this.f1306x = AccessibilityNodeInfoCompat.ACTION_COPY;
                this.f1295l |= this.f1306x;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                this.f1295l ^= this.f1306x;
                this.f1306x = AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD;
                this.f1295l |= this.f1306x;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                this.f1295l |= 144;
                break;
            default:
                this.f1295l ^= this.f1306x;
                this.f1306x = 0;
                break;
        }
        m1294m();
    }

    public final void m1330i() {
        this.f1294k.requestFocus();
        this.f1294k.post(new ef(this));
    }

    public final void m1331i(int i) {
        this.f1308z = false;
        this.f1304v = false;
        this.f1305w = false;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                this.f1304v = true;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                this.f1305w = true;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                this.f1304v = true;
                this.f1305w = true;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                this.f1304v = false;
                this.f1305w = false;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                this.f1295l ^= this.f1307y;
                this.f1307y = 32;
                this.f1295l |= this.f1307y;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                this.f1295l ^= this.f1307y;
                this.f1307y = 16;
                this.f1295l |= this.f1307y;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJECT /*12*/:
                this.f1308z = true;
                break;
            default:
                this.f1295l ^= this.f1307y;
                this.f1307y = 0;
                break;
        }
        this.f1297n = i;
        m1294m();
        m1295n();
    }

    public final View m1332j() {
        return this.f1294k;
    }

    public final void m1333j(int i) {
        this.f1294k.setGravity(i);
    }

    public final void m1334k() {
        m1309b(this.f1286c);
        m1301a(this.f1285b);
        m1328h();
    }

    public final void m1335k(int i) {
        this.f1296m.height = i;
    }

    public final void m1336l(int i) {
        this.f1296m.width = i;
    }

    public final void m1337m(int i) {
        if (i == 0) {
            this.f1294k.setImeOptions(6);
        } else if (i == 1) {
            this.f1294k.setImeOptions(2);
        } else if (i == 2) {
            this.f1294k.setImeOptions(5);
        } else if (i == 3) {
            this.f1294k.setImeOptions(3);
        } else if (i == 4) {
            this.f1294k.setImeOptions(4);
        } else if (KonyMain.f3656d >= 11 && i == 5) {
            this.f1294k.setImeOptions(7);
        }
    }

    public final void setOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f1294k.setOnFocusChangeListener(onFocusChangeListener);
    }
}
