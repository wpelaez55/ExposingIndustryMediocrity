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
import java.util.ArrayList;
import java.util.Arrays;
import ny0k.cA;

public final class dZ extends LinearLayout {
    private static final int[] f1151u;
    public int f1152a;
    public boolean f1153b;
    private dB f1154c;
    private dB f1155d;
    private Rect f1156e;
    private Drawable f1157f;
    private Drawable f1158g;
    private LayoutParams f1159h;
    private Drawable f1160i;
    private StateListDrawable f1161j;
    private ColorStateList f1162k;
    private EditText f1163l;
    private int f1164m;
    private LayoutParams f1165n;
    private boolean f1166o;
    private ArrayAdapter f1167p;
    private ArrayList f1168q;
    private int f1169r;
    private boolean f1170s;
    private boolean f1171t;
    private boolean f1172v;
    private boolean f1173w;

    static {
        f1151u = new int[]{-16842910};
    }

    public dZ(Context context, boolean z) {
        super(context);
        this.f1154c = null;
        this.f1155d = null;
        this.f1156e = null;
        this.f1157f = null;
        this.f1158g = null;
        this.f1159h = null;
        this.f1163l = null;
        this.f1164m = 0;
        this.f1152a = 0;
        this.f1166o = false;
        this.f1169r = 1;
        this.f1170s = false;
        this.f1153b = true;
        this.f1172v = false;
        this.f1173w = false;
        this.f1166o = z;
        if (this.f1166o) {
            this.f1163l = new ec(this, context);
        } else {
            this.f1163l = new ed(this, context);
        }
        this.f1159h = new LayoutParams(-2, -2);
        this.f1165n = new LayoutParams(-2, -2);
        this.f1163l.setFocusableInTouchMode(true);
        this.f1160i = this.f1163l.getBackground();
    }

    private void m1201k() {
        this.f1153b = true;
        if (this.f1163l.isFocused()) {
            if (this.f1154c != null) {
                if (this.f1155d == null || !this.f1155d.m1161o()) {
                    this.f1154c.m1123a(this.f1163l, this.f1154c.m1161o());
                } else {
                    this.f1154c.m1123a(this.f1163l, true);
                }
            } else if (this.f1155d == null || !this.f1155d.m1161o()) {
                dB.m1107a(this.f1163l, false, false);
            } else {
                dB.m1107a(this.f1163l, false, true);
            }
        } else if (this.f1155d != null) {
            if (this.f1154c == null || !this.f1154c.m1161o()) {
                this.f1155d.m1123a(this.f1163l, this.f1155d.m1161o());
            } else {
                this.f1155d.m1123a(this.f1163l, true);
            }
        } else if (this.f1154c == null || !this.f1154c.m1161o()) {
            dB.m1107a(this.f1163l, false, false);
        } else {
            dB.m1107a(this.f1163l, false, true);
        }
    }

    private void m1202l() {
        this.f1163l.setInputType(2);
        this.f1163l.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }

    public final void m1203a() {
        if (!this.f1170s) {
            setLayoutParams(this.f1159h);
            addView(this.f1163l, this.f1165n);
            if (this.f1152a == 11) {
                m1202l();
            } else {
                this.f1163l.setInputType(this.f1164m);
            }
            if ((this.f1164m & 15) == 3) {
                this.f1163l.setKeyListener(new ea(this, this.f1172v, this.f1173w));
            }
            if (this.f1166o && this.f1168q != null) {
                this.f1167p = new ArrayAdapter(KonyMain.getAppContext(), 17367050, this.f1168q);
                ((AutoCompleteTextView) this.f1163l).setThreshold(this.f1169r);
                ((AutoCompleteTextView) this.f1163l).setAdapter(this.f1167p);
            }
            m1231g();
            this.f1170s = true;
        }
    }

    public final void m1204a(float f) {
        this.f1159h.width = 0;
        this.f1159h.weight = f;
    }

    public final void m1205a(int i) {
        this.f1169r = i;
    }

    public final void m1206a(TextWatcher textWatcher) {
        this.f1163l.addTextChangedListener(textWatcher);
    }

    public final void m1207a(OnEditorActionListener onEditorActionListener) {
        this.f1163l.setOnEditorActionListener(onEditorActionListener);
    }

    public final void m1208a(dB dBVar) {
        this.f1154c = dBVar;
        if (dBVar != null) {
            this.f1157f = dBVar.m1127b(true);
            if (this.f1157f == null && dBVar.m1165q()) {
                this.f1157f = this.f1160i;
                return;
            }
            return;
        }
        this.f1157f = null;
    }

    public final void m1209a(LuaTable luaTable) {
        if (!luaTable.list.isEmpty()) {
            int i;
            int size = luaTable.list.size();
            String[] strArr = new String[size];
            for (i = 0; i < size; i++) {
                strArr[i] = (String) luaTable.list.elementAt(i);
            }
            if (strArr.length > 0) {
                if (this.f1168q == null) {
                    this.f1168q = new ArrayList();
                }
                this.f1168q.clear();
                this.f1168q.addAll(Arrays.asList(strArr));
            }
            if (this.f1167p != null) {
                this.f1167p.clear();
                i = this.f1168q.size();
                for (int i2 = 0; i2 < i; i2++) {
                    this.f1167p.add(this.f1168q.get(i2));
                }
                return;
            }
            this.f1167p = new ArrayAdapter(KonyMain.getAppContext(), 17367050, this.f1168q);
            ((AutoCompleteTextView) this.f1163l).setThreshold(this.f1169r);
            ((AutoCompleteTextView) this.f1163l).setAdapter(this.f1167p);
        }
    }

    public final void m1210a(String str) {
        CharSequence charSequence;
        CharSequence charSequence2 = null;
        if (hasFocus()) {
            if (this.f1154c != null) {
                charSequence2 = this.f1154c.m1118a(str);
            }
        } else if (this.f1155d != null) {
            charSequence2 = this.f1155d.m1118a(str);
        }
        if (charSequence2 != null) {
            charSequence = charSequence2;
        }
        this.f1163l.setText(charSequence);
        this.f1163l.setSelection(this.f1163l.getText().length());
    }

    public final void m1211a(boolean z) {
        this.f1159h.width = -1;
        this.f1165n.width = -1;
    }

    public final void m1212a(int[] iArr) {
        ez.m1344a(iArr, this, this.f1159h);
    }

    public final View m1213b() {
        return this;
    }

    public final void m1214b(int i) {
        setVisibility(i);
    }

    public final void m1215b(TextWatcher textWatcher) {
        this.f1163l.removeTextChangedListener(textWatcher);
    }

    public final void m1216b(dB dBVar) {
        this.f1155d = dBVar;
        if (dBVar != null) {
            this.f1158g = dBVar.m1127b(true);
            if (!(this.f1158g == null && dBVar.m1165q())) {
                return;
            }
        }
        this.f1158g = this.f1160i;
    }

    public final void m1217b(LuaTable luaTable) {
        if (!luaTable.list.isEmpty()) {
            int size = luaTable.list.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = (String) luaTable.list.elementAt(i);
            }
            if (strArr.length > 0) {
                if (this.f1168q == null) {
                    this.f1168q = new ArrayList();
                }
                this.f1168q.clear();
                this.f1168q.addAll(Arrays.asList(strArr));
            }
        }
    }

    public final void m1218b(String str) {
        this.f1163l.setEllipsize(TruncateAt.END);
        this.f1163l.setHint(str);
    }

    public final void m1219b(boolean z) {
        this.f1159h.height = -1;
        this.f1165n.height = -1;
    }

    public final void m1220b(int[] iArr) {
        this.f1156e = new Rect();
        this.f1156e.left = iArr[0];
        this.f1156e.top = iArr[1];
        this.f1156e.right = iArr[2];
        this.f1156e.bottom = iArr[3];
    }

    public final void m1221c() {
        this.f1163l.setTransformationMethod(SingleLineTransformationMethod.getInstance());
        this.f1164m |= 1;
        this.f1163l.setLines(1);
        this.f1163l.setMaxLines(1);
        this.f1163l.setGravity(19);
    }

    public final void m1222c(int i) {
        this.f1163l.setHintTextColor(i);
    }

    public final void m1223c(String str) {
        if (KonyMain.f3656d > 3) {
            this.f1163l.setContentDescription(str);
        }
    }

    public final void m1224c(boolean z) {
        this.f1163l.setEnabled(z);
        this.f1163l.setFocusable(z);
        if (z) {
            this.f1163l.setFocusableInTouchMode(z);
        }
    }

    public final void m1225d() {
        this.f1171t = true;
        this.f1163l.setMinLines(4);
        this.f1163l.setGravity(51);
    }

    public final void m1226d(int i) {
        this.f1159h.gravity = i;
        setGravity(i);
    }

    public final String m1227e() {
        return this.f1163l.getText().toString();
    }

    public final void m1228e(int i) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                this.f1164m = 129;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                this.f1164m = 3;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                this.f1164m = 1;
                break;
        }
        if (this.f1171t) {
            this.f1164m |= AccessibilityNodeInfoCompat.ACTION_SET_SELECTION;
        }
        this.f1163l.setInputType(this.f1164m);
    }

    public final void m1229f() {
        if (this.f1160i != null) {
            this.f1160i.setCallback(null);
        }
        this.f1160i = null;
        if (this.f1161j != null) {
            this.f1161j.setCallback(null);
        }
        this.f1161j = null;
        if (this.f1158g != null) {
            this.f1158g.setCallback(null);
        }
        this.f1158g = null;
        if (this.f1157f != null) {
            this.f1157f.setCallback(null);
        }
        this.f1157f = null;
        this.f1163l.setBackgroundDrawable(null);
    }

    public final void m1230f(int i) {
        if (i >= 0) {
            this.f1163l.setFilters(new InputFilter[]{new LengthFilter(i)});
            String e = m1227e();
            if (i < e.length()) {
                this.f1163l.setText(e.substring(0, i));
            }
        }
    }

    public final void m1231g() {
        boolean z;
        Rect rect;
        int i = ViewCompat.MEASURED_STATE_MASK;
        Rect rect2 = new Rect();
        if (this.f1156e != null) {
            z = true;
            rect = this.f1156e;
        } else {
            rect = rect2;
            z = this.f1160i.getPadding(rect2);
        }
        if (z && this.f1158g != null && (this.f1158g instanceof cA)) {
            ((cA) this.f1158g).m2097a(rect);
        }
        if (z && this.f1157f != null && (this.f1157f instanceof cA)) {
            ((cA) this.f1157f).m2097a(rect);
        }
        if (this.f1158g == this.f1160i && this.f1157f == this.f1160i) {
            this.f1157f = null;
        }
        if (this.f1157f != null) {
            this.f1161j = new StateListDrawable();
            this.f1161j.addState(FOCUSED_STATE_SET, this.f1157f);
            this.f1161j.addState(f1151u, this.f1158g);
            this.f1161j.addState(ENABLED_STATE_SET, this.f1158g);
            ((DrawableContainerState) this.f1161j.getConstantState()).setConstantSize(true);
            this.f1163l.setBackgroundDrawable(this.f1161j);
        } else {
            this.f1163l.setBackgroundDrawable(this.f1158g);
            if (this.f1156e != null && this.f1158g == this.f1160i) {
                this.f1163l.setPadding(this.f1156e.left, this.f1156e.top, this.f1156e.right, this.f1156e.bottom);
            }
        }
        int[][] iArr = new int[][]{FOCUSED_STATE_SET, f1151u, ENABLED_STATE_SET};
        int[] iArr2 = new int[3];
        int m = this.f1154c != null ? this.f1154c.m1156m() : this.f1155d != null ? this.f1155d.m1156m() : ViewCompat.MEASURED_STATE_MASK;
        iArr2[0] = m;
        iArr2[1] = this.f1155d != null ? this.f1155d.m1156m() : ViewCompat.MEASURED_STATE_MASK;
        if (this.f1155d != null) {
            i = this.f1155d.m1156m();
        }
        iArr2[2] = i;
        this.f1162k = new ColorStateList(iArr, iArr2);
        this.f1163l.setTextColor(this.f1162k);
        m1201k();
    }

    public final void m1232g(int i) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                this.f1164m |= AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                this.f1164m |= AccessibilityNodeInfoCompat.ACTION_COPY;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                this.f1164m |= AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                this.f1164m |= 144;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                this.f1172v = true;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                this.f1173w = true;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                this.f1172v = true;
                this.f1173w = true;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                this.f1172v = false;
                this.f1173w = false;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                this.f1164m |= 32;
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                this.f1164m |= 16;
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                this.f1152a = i;
                m1202l();
            default:
        }
    }

    public final void m1233h() {
        this.f1163l.requestFocus();
        this.f1163l.post(new eb(this));
    }

    public final View m1234i() {
        return this.f1163l;
    }

    public final void m1235j() {
        m1216b(this.f1155d);
        m1208a(this.f1154c);
        m1231g();
    }

    public final void setOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f1163l.setOnFocusChangeListener(onFocusChangeListener);
    }
}
