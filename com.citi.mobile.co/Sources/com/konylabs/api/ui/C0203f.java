package com.konylabs.api.ui;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.Adapter;
import android.widget.Scroller;
import com.konylabs.android.KonyMain;
import java.util.HashMap;

/* renamed from: com.konylabs.api.ui.f */
public class C0203f extends ViewGroup {
    private static String f1334H;
    public static final int a_;
    private static final boolean f1335y;
    private View f1336A;
    private boolean f1337B;
    private int f1338C;
    private int f1339D;
    private int f1340E;
    private int f1341F;
    private DataSetObserver f1342G;
    private Rect f1343I;
    private boolean f1344J;
    private int f1345K;
    private int f1346L;
    private boolean f1347M;
    private Matrix f1348N;
    private int f1349O;
    private float f1350P;
    private float f1351Q;
    private int f1352R;
    private float[] f1353S;
    private float[] f1354T;
    private boolean f1355U;
    private SimpleOnGestureListener f1356V;
    private Handler f1357W;
    private C0208j f1358Z;
    private Adapter f1359b;
    private int f1360c;
    private C0209k f1361d;
    private int f1362e;
    private int f1363f;
    private Camera f1364g;
    private int f1365h;
    private int f1366i;
    private int f1367j;
    private int f1368k;
    private int f1369l;
    private int f1370m;
    private HashMap f1371n;
    private int f1372o;
    private int f1373p;
    private int f1374q;
    private int f1375r;
    private int f1376s;
    private int f1377t;
    private Scroller f1378u;
    private GestureDetector f1379v;
    private boolean f1380w;
    private int f1381x;
    private int f1382z;

    static {
        f1335y = KonyMain.f3657e;
        a_ = -dB.m1116r(50);
        f1334H = "CoverFlow";
    }

    public C0203f(Context context) {
        super(context);
        this.f1372o = 769;
        this.f1381x = 60;
        dB.m1116r(300);
        this.f1341F = a_;
        this.f1343I = new Rect();
        this.f1344J = false;
        this.f1345K = 0;
        this.f1346L = 0;
        this.f1347M = false;
        this.f1348N = new Matrix();
        this.f1349O = 60;
        this.f1352R = 10;
        this.f1353S = new float[2];
        this.f1354T = new float[2];
        this.f1355U = false;
        this.f1356V = new C0204g(this);
        this.f1357W = new C0205h(this);
        this.f1361d = new C0209k();
        this.f1364g = new Camera();
        this.f1378u = new Scroller(context, new DecelerateInterpolator());
        this.f1379v = new GestureDetector(context, this.f1356V);
        try {
            ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE}).invoke(this, new Object[]{Boolean.valueOf(true)});
        } catch (Exception e) {
            Log.d(f1334H, "Could not find or invoke the method \"setChildrenDrawingOrderEnabled()\"");
            e.printStackTrace();
        }
        setStaticTransformationsEnabled(true);
        this.f1382z = ViewConfiguration.get(context).getScaledTouchSlop();
        if (f1335y) {
            Log.d(f1334H, "Touch slop: " + this.f1382z);
        }
    }

    private int m1345a(int i, int i2) {
        int i3;
        int ceil = (int) Math.ceil((double) ((((float) i2) - this.f1350P) / ((float) this.f1377t)));
        int i4 = i2 - (this.f1377t * ceil);
        if (ceil > this.f1352R) {
            i3 = ceil - this.f1352R;
            ceil = this.f1352R;
            i4 += i3 * this.f1377t;
        }
        if (!this.f1344J && ceil > i) {
            i3 = ceil - i;
            ceil -= i3;
            i4 += i3 * this.f1377t;
        }
        i3 = i - ceil;
        if (this.f1344J && (i3 < 0 || i3 >= this.f1345K)) {
            i3 = (i3 + (((int) Math.ceil(((double) ceil) / ((double) this.f1345K))) * this.f1345K)) % this.f1345K;
        }
        int i5 = i3;
        i3 = 0;
        while (i3 < ceil) {
            View a = m1348a(i5, i4, true, i3);
            if (this.f1347M) {
                a.invalidate();
            }
            i3++;
            i5 = this.f1344J ? (i5 + 1) % this.f1345K : i5 + 1;
            i4 = this.f1377t + i4;
        }
        return ceil;
    }

    private View m1348a(int i, int i2, boolean z, int i3) {
        View view = null;
        if (this.f1359b != null) {
            View a = this.f1361d.m1455a(i);
            view = a == null ? this.f1359b.getView(i, null, this) : this.f1359b.getView(i, a, this);
        }
        if (view != null) {
            measureChild(view, this.f1362e, this.f1363f);
            view.layout(i2, 0, view.getMeasuredWidth() + i2, view.getMeasuredHeight());
            if (z) {
                addViewInLayout(view, i3, view.getLayoutParams());
            }
        }
        return view;
    }

    private void m1349a(int i) {
        if (i != 0 && this.f1372o != 769) {
            int i2;
            if (f1335y) {
                Log.d(f1334H, "--------------------------Scroll Start--------------------------");
                Log.d(f1334H, "Scroll displacement: " + i);
            }
            int abs = Math.abs(i);
            if (this.f1376s != 0) {
                if (this.f1375r == 1 && i < 0) {
                    this.f1376s = this.f1377t - this.f1376s;
                    this.f1360c--;
                    this.f1346L--;
                    if (this.f1344J && this.f1360c < 0) {
                        this.f1360c = this.f1345K + this.f1360c;
                    }
                } else if (this.f1375r == -1 && i > 0) {
                    this.f1376s = this.f1377t - this.f1376s;
                    this.f1360c = this.f1344J ? (this.f1360c + 1) % this.f1345K : this.f1360c + 1;
                    this.f1346L++;
                }
            }
            if (this.f1376s + abs >= this.f1377t) {
                i2 = this.f1377t - this.f1376s;
                this.f1376s = 0;
            } else {
                this.f1376s += abs;
                i2 = abs;
            }
            if (i < 0) {
                i2 = -i2;
            }
            if (f1335y) {
                Log.d(f1334H, "Actual displacement: " + i2);
                Log.d(f1334H, "Total Displacement: " + this.f1376s);
            }
            m1350a(0, getChildCount() - 1, i2);
            View childAt;
            if (i2 > 0) {
                this.f1375r = 1;
                m1382m();
                if (this.f1344J || this.f1368k > 0) {
                    childAt = getChildAt(0);
                    if (childAt != null) {
                        i2 = childAt.getLeft();
                        if (((float) i2) > this.f1350P) {
                            i2 = m1345a(this.f1368k, i2);
                            if (i2 != 0 && f1335y) {
                                Log.d(f1334H, "No. of Views added on Left from " + this.f1368k + " : " + i2);
                            }
                            this.f1368k -= i2;
                            if (this.f1344J && (this.f1368k < 0 || this.f1368k >= this.f1345K)) {
                                this.f1368k = ((((int) Math.ceil(((double) i2) / ((double) this.f1345K))) * this.f1345K) + this.f1368k) % this.f1345K;
                            }
                            this.f1346L = i2 + this.f1346L;
                        }
                    }
                }
            } else {
                this.f1375r = -1;
                m1380l();
                if (this.f1344J || this.f1367j < this.f1345K) {
                    childAt = getChildAt(getChildCount() - 1);
                    if (childAt != null) {
                        i2 = childAt.getRight() + this.f1341F;
                        if (((float) i2) < this.f1351Q) {
                            i2 = m1355b(this.f1367j, i2);
                            if (i2 != 0 && f1335y) {
                                Log.d(f1334H, "No. of Views added on Right from " + this.f1367j + " : " + i2);
                            }
                            this.f1367j = this.f1344J ? (i2 + this.f1367j) % this.f1345K : i2 + this.f1367j;
                        }
                    }
                }
            }
            if (this.f1376s == 0) {
                if (this.f1376s == 0) {
                    if (this.f1375r == 1) {
                        this.f1360c--;
                        this.f1346L--;
                        if (this.f1344J && this.f1360c < 0) {
                            this.f1360c = this.f1345K + this.f1360c;
                        }
                        if (this.f1360c == -1) {
                            this.f1372o = 769;
                        }
                    } else if (this.f1375r == -1) {
                        this.f1360c = this.f1344J ? (this.f1360c + 1) % this.f1345K : this.f1360c + 1;
                        this.f1346L++;
                        if (this.f1360c == this.f1345K) {
                            this.f1372o = 769;
                        }
                    }
                }
                if (f1335y) {
                    m1372h();
                }
            }
            if (f1335y) {
                Log.d(f1334H, "First Item Pos: " + this.f1368k + " Selected Item Pos: " + this.f1360c + " Last Item Pos: " + this.f1367j);
            }
            m1373i();
            invalidate();
            if (f1335y) {
                Log.d(f1334H, "--------------------------Scroll End--------------------------");
            }
        }
    }

    private void m1350a(int i, int i2, int i3) {
        for (int i4 = 0; i4 <= i2; i4++) {
            View childAt = getChildAt(i4);
            childAt.offsetLeftAndRight(i3);
            if (this.f1347M) {
                childAt.invalidate();
            }
        }
    }

    private void m1351a(int i, boolean z, int i2) {
        Message obtain = Message.obtain();
        obtain.arg1 = i;
        if (z) {
            obtain.arg2 = 1040;
        }
        obtain.what = i2;
        this.f1357W.sendMessage(obtain);
        this.f1372o = 771;
    }

    private void m1352a(View view, Matrix matrix) {
        float width = ((float) view.getWidth()) / 2.0f;
        float left = ((float) view.getLeft()) + width;
        float f = ((float) this.f1365h) - left;
        float f2 = (float) this.f1377t;
        Camera camera = this.f1364g;
        int i = this.f1349O;
        Matrix matrix2 = this.f1348N;
        camera.save();
        f2 = (f / f2) * ((float) i);
        if (f2 > ((float) i)) {
            f2 = (float) i;
        }
        if (f2 < ((float) (-i))) {
            f2 = (float) (-i);
        }
        camera.rotateY(f2);
        camera.getMatrix(matrix2);
        matrix2.preTranslate(-width, ((float) (-getHeight())) / 2.0f);
        matrix2.postTranslate(width, ((float) getHeight()) / 2.0f);
        camera.restore();
        camera.save();
        f2 = (float) Math.round((float) (((double) f) * Math.cos(Math.toRadians((double) this.f1381x))));
        float round = (float) Math.round(f - ((float) (((double) f) * Math.sin(Math.toRadians((double) this.f1381x)))));
        Log.d(f1334H, "Distance From Center: " + f + " Child Center: " + left + " Transformed ChildCenter: " + (left + round) + " x: " + round + " z: " + f2);
        camera.translate(round, 0.0f, Math.abs(f2));
        camera.getMatrix(matrix);
        matrix.preTranslate(-(f + width), ((float) (-getHeight())) / 2.0f);
        matrix.postTranslate(f + width, ((float) getHeight()) / 2.0f);
        camera.restore();
        matrix.preConcat(matrix2);
        matrix2.reset();
    }

    private int m1355b(int i, int i2) {
        int i3;
        int ceil = (int) Math.ceil((double) ((this.f1351Q - ((float) i2)) / ((float) this.f1377t)));
        if (ceil > this.f1352R) {
            ceil = this.f1352R;
        }
        if (!this.f1344J) {
            i3 = (this.f1345K - i) - 1;
            if (ceil > i3) {
                ceil = i3;
            }
        }
        int i4 = 0;
        while (i4 < ceil) {
            i3 = this.f1344J ? (i + 1) % this.f1345K : i + 1;
            View a = m1348a(i3, i2, true, -1);
            if (this.f1347M) {
                a.invalidate();
            }
            i2 += this.f1377t;
            i4++;
            i = i3;
        }
        return ceil;
    }

    private void m1364d() {
        m1367f();
        removeAllViews();
        m1370g();
    }

    private void m1366e() {
        m1367f();
        removeAllViewsInLayout();
    }

    private void m1367f() {
        int childCount = getChildCount();
        int i = this.f1368k;
        for (int i2 = 0; i2 < childCount; i2++) {
            this.f1361d.m1457a(i, getChildAt(i2));
            i = this.f1344J ? (i + 1) % this.f1345K : i + 1;
        }
    }

    private void m1370g() {
        if (this.f1359b == null) {
            return;
        }
        if (this.f1359b == null || this.f1345K != 0) {
            int i = this.f1360c;
            View a = m1348a(i, 0, false, -1);
            int measuredWidth = a.getMeasuredWidth();
            this.f1373p = measuredWidth;
            this.f1374q = a.getMeasuredHeight();
            if (f1335y) {
                Log.d(f1334H, "layoutChildren: childWidth = " + this.f1373p + " childHeight = " + this.f1374q);
            }
            a.offsetLeftAndRight(this.f1365h - (measuredWidth / 2));
            Camera camera = this.f1364g;
            Matrix matrix = this.f1348N;
            int i2 = this.f1365h - this.f1370m;
            float round = (float) Math.round(this.f1381x == 0 ? 0.0f : ((float) (((double) i2) / Math.cos(Math.toRadians((double) (90 - this.f1381x))))) - ((float) i2));
            float round2 = (float) Math.round((float) ((((double) round) * Math.sin(Math.toRadians((double) (90 - this.f1381x)))) + (((double) i2) * Math.sin(Math.toRadians((double) (90 - this.f1381x))))));
            camera.save();
            camera.translate(round, 0.0f, Math.abs(round2));
            camera.getMatrix(matrix);
            matrix.preTranslate(((float) (-i2)) - round, 0.0f);
            matrix.postTranslate(((float) i2) + round, 0.0f);
            float[] fArr = this.f1353S;
            fArr[0] = ((float) this.f1370m) - round;
            fArr[1] = 0.0f;
            float[] fArr2 = this.f1354T;
            matrix.mapPoints(fArr2, fArr);
            this.f1350P = ((float) this.f1370m) - (fArr2[0] - fArr[0]);
            this.f1351Q = (((float) this.f1369l) + fArr2[0]) - fArr[0];
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
            matrix.reset();
            camera.restore();
            this.f1377t = this.f1341F + this.f1373p;
            if (this.f1341F < 0 && Math.abs(this.f1341F) >= this.f1373p) {
                this.f1377t = this.f1373p;
                this.f1341F = 0;
            }
            measuredWidth = 0;
            int left = a.getLeft();
            if (((float) left) > this.f1350P) {
                measuredWidth = m1345a(i, left);
            }
            this.f1368k = i - measuredWidth;
            if (this.f1344J) {
                if (this.f1368k < 0 || this.f1368k >= this.f1345K) {
                    this.f1368k = ((((int) Math.ceil(((double) measuredWidth) / ((double) this.f1345K))) * this.f1345K) + this.f1368k) % this.f1345K;
                }
                this.f1346L = measuredWidth;
            } else {
                this.f1346L = this.f1360c - this.f1368k;
            }
            addViewInLayout(a, -1, a.getLayoutParams());
            measuredWidth = 0;
            int right = a.getRight() + this.f1341F;
            if (((float) right) < this.f1351Q) {
                measuredWidth = m1355b(i, right);
            }
            this.f1367j = measuredWidth + i;
            if (this.f1344J) {
                this.f1367j %= this.f1345K;
            }
            m1385o();
            if (f1335y) {
                Log.d(f1334H, "Max Primary Offset: " + this.f1377t);
                Log.d(f1334H, "First Item Pos: " + this.f1368k + " Selected Item Pos: " + this.f1360c + " Last Item Pos: " + this.f1367j);
                m1372h();
            }
        }
    }

    private void m1372h() {
        if (f1335y) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                Log.d(f1334H, "Child Index: " + i + ": " + ((childAt.getWidth() / 2) + childAt.getLeft()));
            }
        }
    }

    private void m1373i() {
        int i = 0;
        int childCount = getChildCount();
        if (childCount != 0) {
            if (this.f1371n == null) {
                this.f1371n = new HashMap(childCount, 1.0f);
            }
            HashMap hashMap = this.f1371n;
            int i2 = this.f1346L;
            if (this.f1376s >= this.f1377t / 3) {
                if (this.f1375r == -1) {
                    i2++;
                } else if (this.f1375r == 1) {
                    i2--;
                }
            }
            int i3 = 0;
            while (i < i2) {
                hashMap.put(Integer.valueOf(i3), Integer.valueOf(i));
                i3++;
                i++;
            }
            for (i = childCount - 1; i > i2; i--) {
                hashMap.put(Integer.valueOf(i3), Integer.valueOf(i));
                i3++;
            }
            hashMap.put(Integer.valueOf(i3), Integer.valueOf(i2));
        }
    }

    private void m1375j() {
        int i = 1038;
        if (this.f1375r == 0) {
            this.f1372o = 769;
            return;
        }
        int i2;
        if (f1335y) {
            Log.d(f1334H, "Justifying...");
        }
        if (this.f1376s > this.f1377t / 2) {
            if (this.f1375r != 1) {
                if (this.f1375r == -1) {
                    if (this.f1344J || this.f1360c != this.f1345K - 1) {
                        i2 = -(this.f1377t - this.f1376s);
                    }
                    i2 = this.f1376s;
                    i = 1037;
                }
                i = 0;
                i2 = 0;
            } else if (this.f1344J || this.f1360c != 0) {
                i2 = this.f1377t - this.f1376s;
                i = 1037;
            } else {
                i2 = -this.f1376s;
            }
        } else if (this.f1375r != 1) {
            if (this.f1375r == -1) {
                if (this.f1360c == -1) {
                    i2 = -(this.f1377t - this.f1376s);
                } else {
                    if (this.f1360c == this.f1345K) {
                        i2 = this.f1377t;
                        i = 1037;
                    }
                    i2 = this.f1376s;
                    i = 1037;
                }
            }
            i = 0;
            i2 = 0;
        } else if (this.f1360c == this.f1345K) {
            i2 = this.f1377t - this.f1376s;
            i = 1037;
        } else {
            i2 = this.f1360c == -1 ? -this.f1377t : -this.f1376s;
        }
        if (f1335y) {
            Log.d(f1334H, "Distance to Justify: " + i2 + " Justify direction: " + i);
        }
        Message obtain = Message.obtain();
        obtain.arg1 = 0;
        obtain.arg2 = i2;
        obtain.what = i;
        this.f1372o = 770;
        this.f1378u.startScroll(0, 0, i2, 0);
        this.f1357W.sendMessage(obtain);
    }

    private void m1377k() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).invalidate();
        }
    }

    private void m1380l() {
        int childCount = getChildCount();
        if (childCount != 1) {
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (((float) (childAt.getRight() + this.f1341F)) < this.f1350P) {
                    i = this.f1344J ? (this.f1368k + i2) % this.f1345K : this.f1368k + i2;
                    this.f1361d.m1457a(i, childAt);
                    i3++;
                }
                i2++;
            }
            if (i3 != 0) {
                if (f1335y) {
                    Log.d(f1334H, "No. of Views detaching on Left from 0: " + i3);
                }
                removeViewsInLayout(0, i3);
                this.f1368k = this.f1344J ? (i + 1) % this.f1345K : i + 1;
                this.f1346L -= i3;
            }
        }
    }

    private void m1382m() {
        int i = 0;
        int childCount = getChildCount();
        if (childCount != 1) {
            int i2 = this.f1367j + 1;
            childCount--;
            while (childCount >= 0) {
                View childAt = getChildAt(childCount);
                if (((float) childAt.getLeft()) <= this.f1351Q) {
                    break;
                }
                i2--;
                if (this.f1344J && i2 < 0) {
                    i2 = this.f1345K - 1;
                }
                this.f1361d.m1457a(i2, childAt);
                i++;
                childCount--;
            }
            if (i != 0) {
                childCount++;
                if (f1335y) {
                    Log.d(f1334H, "No. of Views detaching on Right from " + childCount + " : " + i);
                }
                removeViewsInLayout(childCount, i);
                this.f1367j = i2 - 1;
                if (this.f1344J && this.f1367j < 0) {
                    this.f1367j = this.f1345K - 1;
                }
            }
        }
    }

    private void m1383n() {
        this.f1372o = 769;
        this.f1357W.removeMessages(1039);
        this.f1357W.removeMessages(1038);
        this.f1357W.removeMessages(1037);
        this.f1357W.removeMessages(-1);
        this.f1357W.removeMessages(1);
        this.f1378u.forceFinished(true);
        if (this.f1360c < 0) {
            this.f1360c = 0;
        } else if (this.f1360c > this.f1345K - 1) {
            this.f1360c = this.f1345K - 1;
        }
        this.f1346L = 0;
        this.f1375r = 0;
        this.f1376s = 0;
    }

    private void m1385o() {
        if (this.f1344J || (this.f1368k > 0 && this.f1367j < this.f1345K - 1)) {
            int childCount = getChildCount();
            if (childCount > 1) {
                int i = this.f1346L;
                childCount = (childCount - this.f1346L) - 1;
                if (i > childCount) {
                    i -= childCount;
                    removeViews(0, i);
                    this.f1368k = this.f1344J ? (this.f1368k + i) % this.f1345K : this.f1368k + i;
                    this.f1346L -= i;
                } else if (childCount > i) {
                    childCount -= i;
                    removeViews(getChildCount() - childCount, childCount);
                    this.f1367j -= childCount;
                    if (this.f1344J && this.f1367j < 0) {
                        this.f1367j = ((((int) Math.ceil(((double) childCount) / ((double) this.f1345K))) * this.f1345K) + this.f1367j) % this.f1345K;
                    }
                }
            }
        }
        m1373i();
    }

    static /* synthetic */ void m1386o(C0203f c0203f) {
        if (c0203f.f1361d != null) {
            c0203f.f1361d.m1456a();
        }
        if (c0203f.f1358Z != null) {
            c0203f.f1358Z.m1452a();
        }
    }

    public final int m1389a() {
        return this.f1360c;
    }

    public final void m1390a(int i, boolean z) {
        if (i < 0) {
            i += 180;
        }
        this.f1349O = i;
        if (this.f1380w && z) {
            m1364d();
        }
    }

    public final void m1391a(Adapter adapter) {
        if (this.f1359b != null) {
            this.f1359b.unregisterDataSetObserver(this.f1342G);
        }
        this.f1359b = adapter;
        if (adapter != null) {
            this.f1361d.m1458a(adapter);
            this.f1342G = new C0206i();
            adapter.registerDataSetObserver(this.f1342G);
            this.f1345K = adapter.getCount();
        } else {
            m1383n();
        }
        this.f1360c = 0;
        this.f1346L = 0;
    }

    public final void m1392a(C0208j c0208j) {
        this.f1358Z = c0208j;
    }

    public final void m1393a(boolean z) {
        this.f1344J = z;
        boolean z2 = this.f1380w;
    }

    public final void m1394b(int i) {
        if (this.f1347M) {
            m1377k();
        }
        invalidate();
    }

    public final void m1395b(int i, boolean z) {
        this.f1341F = dB.m1116r(i);
        if (this.f1380w && z) {
            m1364d();
        }
    }

    public final void m1396c(int i) {
        if (i < 0) {
            i += 90;
        }
        this.f1381x = i;
        boolean z = this.f1380w;
    }

    public final void m1397c(int i, boolean z) {
        if (this.f1372o != 769 || i < 0 || i >= this.f1345K) {
            return;
        }
        if (!this.f1380w) {
            this.f1360c = i;
        } else if (!z || Math.abs(this.f1360c - i) > 5) {
            m1366e();
            this.f1360c = i;
            m1370g();
            if (this.f1347M) {
                m1377k();
            }
            invalidate();
            if (f1335y) {
                m1372h();
            }
        } else {
            int i2 = i > this.f1360c ? -1 : i < this.f1360c ? 1 : 0;
            if (i2 != 0) {
                m1351a(i, false, i2);
            }
        }
    }

    public final void m1398d(int i) {
        m1390a(i, false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        onInterceptTouchEvent(motionEvent);
        if (action == 0) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (f1335y) {
                Log.d(f1334H, "DispatchTouchEvent: ACTION_DOWN ");
            }
            if (this.f1372o == 771 || getChildCount() == 0) {
                return false;
            }
            if (this.f1372o != 770) {
                action = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                View childAt = getChildAt(this.f1346L);
                Rect rect = this.f1343I;
                if (childAt != null) {
                    childAt.getHitRect(rect);
                    if (!rect.contains(action, y)) {
                        return onTouchEvent(motionEvent);
                    }
                    motionEvent.setLocation((float) (action - childAt.getLeft()), (float) (y - childAt.getTop()));
                    if (childAt.dispatchTouchEvent(motionEvent)) {
                        if (f1335y) {
                            Log.d(f1334H, "Target handled down event");
                        }
                        this.f1336A = childAt;
                        return true;
                    }
                    motionEvent.setLocation((float) action, (float) y);
                    return onTouchEvent(motionEvent);
                }
            }
            return onTouchEvent(motionEvent);
        } else if (action == 2) {
            if (f1335y) {
                Log.d(f1334H, "DispatchTouchEvent: ACTION_MOVE ");
            }
            View view = this.f1336A;
            if (view == null) {
                return onTouchEvent(motionEvent);
            }
            if (this.f1355U) {
                motionEvent.setAction(3);
                view.dispatchTouchEvent(motionEvent);
                this.f1336A = null;
                return true;
            }
            view.dispatchTouchEvent(motionEvent);
            return true;
        } else if (action != 1 && action != 3) {
            return true;
        } else {
            if (f1335y) {
                if (action == 1) {
                    Log.d(f1334H, "DispatchTouchEvent: ACTION_UP " + this.f1337B);
                } else if (action == 3) {
                    Log.d(f1334H, "DispatchTouchEvent: ACTION_CANCEL " + this.f1337B);
                }
            }
            View view2 = this.f1336A;
            if (view2 == null) {
                return onTouchEvent(motionEvent);
            }
            boolean dispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
            if (f1335y) {
                if (dispatchTouchEvent) {
                    Log.d(f1334H, "Target handled up event");
                } else {
                    Log.d(f1334H, "Target NOT handled up event");
                }
            }
            this.f1336A = null;
            return dispatchTouchEvent;
        }
    }

    public final void m1399e(int i) {
        m1395b(i, false);
    }

    protected int getChildDrawingOrder(int i, int i2) {
        int intValue = ((Integer) this.f1371n.get(Integer.valueOf(i2))).intValue();
        if (f1335y) {
            Log.d(f1334H, "iteration = " + i2 + " childIndex: " + intValue);
        }
        return intValue;
    }

    protected boolean getChildStaticTransformation(View view, Transformation transformation) {
        transformation.clear();
        transformation.setTransformationType(2);
        m1352a(view, transformation.getMatrix());
        return true;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.f1347M = ((Boolean) View.class.getMethod("isHardwareAccelerated", new Class[0]).invoke(this, new Object[0])).booleanValue();
            if (f1335y) {
                Log.d(f1334H, "Is Hardware Acceleration Enabled: " + this.f1347M);
            }
        } catch (Exception e) {
            Log.d(f1334H, "Could not find or invoke the method \"isHardwareAccelerated()\"");
            e.printStackTrace();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (f1335y) {
                Log.d(f1334H, "onInterceptTouchEvent: ACTION_DOWN ");
            }
            this.f1338C = (int) motionEvent.getX();
            this.f1340E = this.f1338C;
            this.f1339D = (int) motionEvent.getY();
        } else if (action == 2) {
            if (f1335y) {
                Log.d(f1334H, "onInterceptTouchEvent: ACTION_MOVE ");
            }
            this.f1366i = this.f1338C;
            action = (int) motionEvent.getX();
            this.f1338C = action;
            int y = (int) motionEvent.getY();
            if (!this.f1337B) {
                y = Math.abs(y - this.f1339D);
                action = Math.abs(action - this.f1340E);
                if (y > action && y > this.f1382z) {
                    this.f1337B = true;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return false;
                } else if (action > y && action > this.f1382z) {
                    this.f1355U = true;
                }
            }
        } else if (action == 1 || action == 3) {
            if (f1335y) {
                if (action == 1) {
                    Log.d(f1334H, "onInterceptTouchEvent: ACTION_UP ");
                } else {
                    Log.d(f1334H, "onInterceptTouchEvent: ACTION_CANCEL ");
                }
            }
            this.f1366i = 0;
            this.f1337B = false;
            this.f1355U = false;
        }
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (f1335y) {
            Log.d(f1334H, "onLayout() " + z + " " + i + " " + i2 + " " + i3 + " " + i4);
        }
        if (z) {
            if (this.f1372o == 770) {
                m1383n();
            }
            this.f1380w = false;
            m1366e();
            this.f1369l = i3;
            this.f1370m = i;
            this.f1365h = (i3 - i) / 2;
            m1370g();
            this.f1380w = true;
        }
    }

    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        View view = null;
        int i3 = this.f1345K;
        if (this.f1359b != null && this.f1360c >= 0 && this.f1360c < i3) {
            View childAt = getChildAt(this.f1346L);
            if (childAt == null) {
                childAt = this.f1361d.m1455a(this.f1360c);
                if (childAt == null) {
                    childAt = this.f1359b.getView(this.f1360c, null, this);
                    this.f1361d.m1457a(this.f1360c, childAt);
                }
            }
            view = childAt;
        }
        if (view != null) {
            measureChild(view, i, i2);
            i3 = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
        } else {
            i3 = this.f1373p;
            measuredHeight = this.f1374q;
        }
        measuredHeight = Math.max(measuredHeight, getSuggestedMinimumHeight());
        i3 = Math.max(i3, getSuggestedMinimumWidth());
        int resolveSize = C0203f.resolveSize(measuredHeight, i2);
        int resolveSize2 = C0203f.resolveSize(i3, i);
        if (f1335y) {
            Log.d(f1334H, "CoverFlow Width = " + resolveSize2 + " Height = " + resolveSize + " Preferred Width = " + i3 + " Preferred Height = " + measuredHeight);
        }
        setMeasuredDimension(resolveSize2, resolveSize);
        this.f1362e = i;
        this.f1363f = i2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1379v.onTouchEvent(motionEvent)) {
            int action = motionEvent.getAction();
            int i = this.f1338C;
            if (action == 0) {
                if (f1335y) {
                    Log.d(f1334H, "onTouchEvent: ACTION_DOWN");
                }
                if (this.f1372o == 770 && (this.f1344J || (this.f1360c >= this.f1368k && this.f1360c <= this.f1367j))) {
                    this.f1372o = 769;
                    this.f1378u.forceFinished(true);
                }
            } else {
                if (action != 2 || this.f1372o == 770) {
                    if ((action == 1 || action == 3) && this.f1372o != 770) {
                        if (f1335y) {
                            if (action == 1) {
                                Log.d(f1334H, "onTouchEvent: ACTION_UP");
                            } else {
                                Log.d(f1334H, "onTouchEvent: ACTION_CANCEL");
                            }
                        }
                    }
                } else if (this.f1337B) {
                    if (f1335y) {
                        Log.d(f1334H, "onTouchEvent: Allowing parent to intercept touch events ");
                    }
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    if (f1335y) {
                        Log.d(f1334H, "onTouchEvent: ACTION_MOVE ");
                    }
                    if (this.f1372o == 769 && (this.f1344J || (this.f1360c >= this.f1368k && this.f1360c <= this.f1367j))) {
                        this.f1372o = 771;
                    }
                    m1349a(i - this.f1366i);
                }
                m1375j();
            }
        }
        return true;
    }
}
