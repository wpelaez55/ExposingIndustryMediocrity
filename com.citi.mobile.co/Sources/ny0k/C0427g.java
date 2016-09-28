package ny0k;

import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.ArrayList;
import java.util.TreeMap;

/* renamed from: ny0k.g */
public final class C0427g extends C0289b {
    private int f3478b;
    private int f3479c;
    private int f3480d;
    private int f3481e;
    private int f3482f;
    private Object f3483g;
    private Object f3484h;
    private Object f3485i;
    private SparseArray f3486j;
    private int f3487k;
    private int f3488l;
    private float f3489m;
    private int f3490n;
    private int f3491o;
    private int f3492p;
    private View f3493q;

    public C0427g(LuaWidget luaWidget) {
        this.f3487k = 0;
        this.f3488l = 0;
        this.f3492p = 0;
        this.a = luaWidget;
    }

    private void m3879a() {
        this.a.setHeight(Integer.valueOf(this.f3491o).intValue());
        this.a.setWidth(Integer.valueOf(this.f3490n).intValue());
        this.f3493q.scrollTo(this.f3493q.getScrollX(), 0);
        this.f3493q.scrollTo(0, this.f3493q.getScrollY());
        this.a.setWeight(Float.valueOf(this.f3489m).floatValue());
    }

    private void m3880a(TreeMap treeMap, int i, ArrayList arrayList) {
        Object[] toArray = treeMap.keySet().toArray();
        for (int i2 = 0; i2 < toArray.length - 1; i2++) {
            float floatValue = ((Float) toArray[i2]).floatValue();
            SparseArray sparseArray = (SparseArray) treeMap.get(Float.valueOf(floatValue));
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                float f = ((C0275E) sparseArray.get(sparseArray.keyAt(i3))).f1895a;
                C0302r c0302r = new C0302r();
                Interpolator linearInterpolator = new LinearInterpolator();
                this.f3492p = 0;
                int i4 = (int) ((floatValue / 100.0f) * ((float) this.f3478b));
                C0301q c0420f;
                if (i == 0) {
                    c0420f = new C0420F(this.a, 0.0f, (float) this.f3493q.getHeight(), 0.0f, (float) ((int) ((f / 100.0f) * ((float) this.f3488l))));
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset(0);
                    c0420f.m3448a(linearInterpolator);
                    c0302r.f2350a = c0420f;
                    arrayList.add(c0302r);
                } else if (i == C0288a.f1943b) {
                    c0420f = new C0420F(this.a, (float) this.f3493q.getWidth(), 0.0f, (float) ((int) ((f / 100.0f) * ((float) this.f3487k))), 0.0f);
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset(0);
                    c0420f.m3448a(linearInterpolator);
                    c0302r.f2350a = c0420f;
                    arrayList.add(c0302r);
                } else if (i == C0288a.f1945d || i == C0288a.f1950i) {
                    this.f3492p = -this.f3493q.getScrollY();
                    r4 = new C0417B(0.0f, 0.0f, (float) this.f3492p, (float) ((int) ((f / 100.0f) * ((float) this.f3488l))));
                    r4.setDuration((long) i4);
                    r4.setStartOffset(0);
                    r4.m3430a(linearInterpolator);
                    c0302r.f2350a = r4;
                    arrayList.add(c0302r);
                } else if (i == C0288a.f1946e || i == C0288a.f1949h) {
                    this.f3492p = -this.f3493q.getScrollX();
                    r4 = new C0417B((float) this.f3492p, (float) (((int) ((f / 100.0f) * ((float) this.f3487k))) + this.f3492p), 0.0f, 0.0f);
                    r4.setDuration((long) i4);
                    r4.setStartOffset(0);
                    r4.m3430a(linearInterpolator);
                    c0302r.f2350a = r4;
                    arrayList.add(c0302r);
                } else if (i == C0288a.f1944c) {
                    r4 = new C0428o(this.a, (float) ((int) this.a.getWeight()), (float) ((int) ((f / 100.0f) * this.a.getWeight())));
                    r4.setDuration((long) i4);
                    r4.setStartOffset(0);
                    r4.m3896a(linearInterpolator);
                    c0302r.f2350a = r4;
                    arrayList.add(c0302r);
                } else if (i == C0288a.f1947f) {
                    this.f3492p = -this.f3493q.getScrollY();
                    int i5 = this.f3492p - this.f3491o;
                    c0420f = new C0419D(this.a, 0, i5, 0, (int) (((f / 100.0f) * ((float) this.f3488l)) - ((float) this.f3491o)));
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset(0);
                    c0420f.m3442a(linearInterpolator);
                    c0302r.f2350a = c0420f;
                    arrayList.add(c0302r);
                } else if (i == C0288a.f1948g) {
                    this.f3492p = -this.f3493q.getScrollX();
                    c0420f = new C0419D(this.a, this.f3492p - this.f3490n, 0, (((int) ((f / 100.0f) * ((float) this.f3487k))) + this.f3492p) - this.f3490n, 0);
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset(0);
                    c0420f.m3442a(linearInterpolator);
                    c0302r.f2350a = c0420f;
                    arrayList.add(c0302r);
                } else if (i == C0288a.f1953l) {
                    c0420f = new C0429v(this.f3493q, 0, (int) f, -1, -1, 0);
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset(0);
                    c0420f.m3902a(linearInterpolator);
                    c0302r.f2350a = c0420f;
                    arrayList.add(c0302r);
                } else if (i == C0288a.f1954m) {
                    c0420f = new C0429v(this.f3493q, 0, (int) f, -1, -1, C0429v.f3500b);
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset(0);
                    c0420f.m3902a(linearInterpolator);
                    c0302r.f2350a = c0420f;
                    arrayList.add(c0302r);
                } else if (i == C0288a.f1951j) {
                    c0420f = new C0430x(0.0f, (float) ((int) f), 1.0f, 1.0f, (float) (this.f3490n / 2), (float) (this.f3491o / 2));
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset(0);
                    c0420f.m3908a(linearInterpolator);
                    c0302r.f2350a = c0420f;
                    arrayList.add(c0302r);
                } else if (i == C0288a.f1952k) {
                    c0420f = new C0430x(1.0f, 1.0f, 0.0f, (float) ((int) f), (float) (this.f3490n / 2), (float) (this.f3491o / 2));
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset(0);
                    c0420f.m3908a(linearInterpolator);
                    c0302r.f2350a = c0420f;
                    arrayList.add(c0302r);
                } else if (i == C0288a.f1955n) {
                    r3 = this.f3493q;
                    c0420f = new C0431y(0, (int) f, -1, -1, 0);
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset(0);
                    c0420f.m3914a(linearInterpolator);
                    c0302r.f2350a = c0420f;
                    arrayList.add(c0302r);
                } else if (i == C0288a.f1956o) {
                    r3 = this.f3493q;
                    c0420f = new C0431y(0, (int) f, -1, -1, C0431y.f3514b);
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset(0);
                    c0420f.m3914a(linearInterpolator);
                    c0302r.f2350a = c0420f;
                    arrayList.add(c0302r);
                } else if (i == C0288a.f1957p) {
                    c0420f = new C0418C(this.a, (int) f);
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset(0);
                    c0420f.m3436a(linearInterpolator);
                    c0302r.f2350a = c0420f;
                    arrayList.add(c0302r);
                }
            }
        }
    }

    private void m3881a(TreeMap treeMap, int i, ArrayList arrayList, ArrayList arrayList2) {
        if (treeMap.size() == 1) {
            m3880a(treeMap, i, arrayList2);
        }
        Object[] toArray = treeMap.keySet().toArray();
        int i2 = 0;
        while (i2 < toArray.length - 1) {
            float floatValue = ((Float) toArray[i2]).floatValue();
            float floatValue2 = ((Float) toArray[i2 + 1]).floatValue();
            SparseArray sparseArray = (SparseArray) treeMap.get(Float.valueOf(floatValue));
            SparseArray sparseArray2 = (SparseArray) treeMap.get(Float.valueOf(floatValue2));
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                C0302r c0302r = new C0302r();
                C0275E c0275e = (C0275E) sparseArray.get(sparseArray.keyAt(i3));
                C0275E c0275e2 = (C0275E) sparseArray2.get(c0275e.f1897c);
                float f = c0275e.f1895a;
                float f2 = c0275e2.f1895a;
                int i4 = (int) (((floatValue2 - floatValue) / 100.0f) * ((float) this.f3478b));
                int i5 = (int) ((floatValue / 100.0f) * ((float) this.f3478b));
                Interpolator a = C0289b.m2010a(c0275e.f1896b);
                this.f3492p = 0;
                int i6 = c0275e.f1897c;
                if (floatValue != 0.0f && i2 == 0) {
                    m3880a(treeMap, i6, arrayList2);
                }
                C0301q c0420f;
                if (i6 == 0) {
                    c0420f = new C0420F(this.a, 0.0f, (float) ((int) ((f / 100.0f) * ((float) this.f3488l))), 0.0f, (float) ((int) ((f2 / 100.0f) * ((float) this.f3488l))));
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset((long) i5);
                    c0420f.m3448a(a);
                    c0302r.f2350a = c0420f;
                    arrayList2.add(c0302r);
                } else if (i6 == C0288a.f1943b) {
                    c0420f = new C0420F(this.a, (float) ((int) ((f / 100.0f) * ((float) this.f3487k))), 0.0f, (float) ((int) ((f2 / 100.0f) * ((float) this.f3487k))), 0.0f);
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset((long) i5);
                    c0420f.m3448a(a);
                    c0302r.f2350a = c0420f;
                    arrayList2.add(c0302r);
                } else if (i6 == C0288a.f1945d) {
                    r6 = new C0417B(0.0f, 0.0f, (float) (((int) ((f / 100.0f) * ((float) this.f3488l))) + this.f3492p), (float) (((int) ((f2 / 100.0f) * ((float) this.f3488l))) + this.f3492p));
                    r6.setDuration((long) i4);
                    r6.setStartOffset((long) i5);
                    r6.m3430a(a);
                    c0302r.f2350a = r6;
                    arrayList2.add(c0302r);
                } else if (i6 == C0288a.f1946e) {
                    r6 = new C0417B((float) (((int) ((f / 100.0f) * ((float) this.f3487k))) + this.f3492p), (float) (((int) ((f2 / 100.0f) * ((float) this.f3487k))) + this.f3492p), 0.0f, 0.0f);
                    r6.setDuration((long) i4);
                    r6.setStartOffset((long) i5);
                    r6.m3430a(a);
                    c0302r.f2350a = r6;
                    arrayList2.add(c0302r);
                } else if (i6 == C0288a.f1944c) {
                    r6 = new C0428o(this.a, (float) ((int) ((f / 100.0f) * this.a.getWeight())), (float) ((int) ((f2 / 100.0f) * this.a.getWeight())));
                    r6.setDuration((long) i4);
                    r6.setStartOffset((long) i5);
                    r6.m3896a(a);
                    c0302r.f2350a = r6;
                    arrayList2.add(c0302r);
                } else if (i6 == C0288a.f1947f) {
                    r6 = new C0417B(0.0f, 0.0f, (float) ((((int) ((f / 100.0f) * ((float) this.f3488l))) + this.f3492p) - this.f3491o), (float) ((((int) ((f2 / 100.0f) * ((float) this.f3488l))) + this.f3492p) - this.f3491o));
                    r6.setDuration((long) i4);
                    r6.setStartOffset((long) i5);
                    r6.m3430a(a);
                    c0302r.f2350a = r6;
                    arrayList2.add(c0302r);
                } else if (i6 == C0288a.f1948g) {
                    r6 = new C0417B((float) ((((int) ((f / 100.0f) * ((float) this.f3487k))) + this.f3492p) - this.f3490n), (float) ((((int) ((f2 / 100.0f) * ((float) this.f3487k))) + this.f3492p) - this.f3490n), 0.0f, 0.0f);
                    r6.setDuration((long) i4);
                    r6.setStartOffset((long) i5);
                    r6.m3430a(a);
                    c0302r.f2350a = r6;
                    arrayList2.add(c0302r);
                } else if (i6 == C0288a.f1949h) {
                    r6 = new C0417B((float) (((int) ((f / 100.0f) * ((float) this.f3487k))) + this.f3492p), (float) (((int) ((f2 / 100.0f) * ((float) this.f3487k))) + this.f3492p), 0.0f, 0.0f);
                    r6.setDuration((long) i4);
                    r6.setStartOffset((long) i5);
                    r6.m3430a(a);
                    c0302r.f2350a = r6;
                    arrayList2.add(c0302r);
                } else if (i6 == C0288a.f1950i) {
                    r6 = new C0417B(0.0f, 0.0f, (float) (((int) ((f / 100.0f) * ((float) this.f3488l))) + this.f3492p), (float) (((int) ((f2 / 100.0f) * ((float) this.f3488l))) + this.f3492p));
                    r6.setDuration((long) i4);
                    r6.setStartOffset((long) i5);
                    r6.m3430a(a);
                    c0302r.f2350a = r6;
                    arrayList2.add(c0302r);
                } else if (i6 == C0288a.f1953l) {
                    c0420f = new C0429v(this.f3493q, (int) f, (int) f2, -1, -1, 0);
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset((long) i5);
                    c0420f.m3902a(a);
                    c0302r.f2350a = c0420f;
                    arrayList2.add(c0302r);
                } else if (i6 == C0288a.f1954m) {
                    c0420f = new C0429v(this.f3493q, (int) f, (int) f2, -1, -1, C0429v.f3500b);
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset((long) i5);
                    c0420f.m3902a(a);
                    c0302r.f2350a = c0420f;
                    arrayList2.add(c0302r);
                } else if (i6 == C0288a.f1951j) {
                    r5 = (int) f;
                    c0420f = new C0430x((float) r5, (float) ((int) f2), 1.0f, 1.0f, (float) (this.f3490n / 2), (float) (this.f3491o / 2));
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset((long) i5);
                    c0420f.m3908a(a);
                    c0302r.f2350a = c0420f;
                    arrayList2.add(c0302r);
                } else if (i6 == C0288a.f1952k) {
                    int i7 = (int) f2;
                    c0420f = new C0430x(1.0f, 1.0f, (float) ((int) f), (float) i7, (float) (this.f3490n / 2), (float) (this.f3491o / 2));
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset((long) i5);
                    c0420f.m3908a(a);
                    c0302r.f2350a = c0420f;
                    arrayList2.add(c0302r);
                } else if (i6 == C0288a.f1955n) {
                    r5 = (int) f;
                    r6 = (int) f2;
                    r7 = this.f3493q;
                    c0420f = new C0431y(r5, r6, -1, -1, 0);
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset((long) i5);
                    c0420f.m3914a(a);
                    c0302r.f2350a = c0420f;
                    arrayList2.add(c0302r);
                } else if (i6 == C0288a.f1956o) {
                    r5 = (int) f;
                    r6 = (int) f2;
                    r7 = this.f3493q;
                    c0420f = new C0431y(r5, r6, -1, -1, C0431y.f3514b);
                    c0420f.setDuration((long) i4);
                    c0420f.setStartOffset((long) i5);
                    c0420f.m3914a(a);
                    c0302r.f2350a = c0420f;
                    arrayList2.add(c0302r);
                } else if (i6 == C0288a.f1957p) {
                    C0301q c0418c = new C0418C(this.a, (int) f2);
                    c0418c.setDuration((long) i4);
                    c0418c.setStartOffset((long) i5);
                    c0418c.m3436a(a);
                    c0302r.f2350a = c0418c;
                    arrayList2.add(c0302r);
                }
            }
            i2++;
        }
    }

    static /* synthetic */ void m3882a(C0427g c0427g, SparseArray sparseArray, int i) {
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            int keyAt = sparseArray.keyAt(i2);
            TreeMap treeMap = (TreeMap) sparseArray.get(keyAt);
            float f = 0.0f;
            if (treeMap.size() != 0) {
                Object[] toArray = treeMap.keySet().toArray();
                if (i == 0) {
                    f = ((Float) toArray[toArray.length - 1]).floatValue();
                } else if (i == 1) {
                    f = ((Float) toArray[0]).floatValue();
                }
                SparseArray sparseArray2 = (SparseArray) treeMap.get(Float.valueOf(f));
                for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
                    C0275E c0275e = (C0275E) sparseArray2.get(sparseArray2.keyAt(i3));
                    if (c0275e != null) {
                        f = c0275e.f1895a;
                        if (keyAt == 0) {
                            c0427g.a.setHeight(Integer.valueOf((int) ((f / 100.0f) * ((float) c0427g.f3488l))).intValue());
                        } else if (keyAt == C0288a.f1943b) {
                            c0427g.a.setWidth(Integer.valueOf((int) ((f / 100.0f) * ((float) c0427g.f3487k))).intValue());
                        } else if (keyAt == C0288a.f1945d) {
                            c0427g.f3493q.scrollTo(c0427g.f3493q.getScrollX(), -Integer.valueOf((int) ((f / 100.0f) * ((float) c0427g.f3488l))).intValue());
                        } else if (keyAt == C0288a.f1946e) {
                            c0427g.f3493q.scrollTo(-Integer.valueOf((int) ((f / 100.0f) * ((float) c0427g.f3487k))).intValue(), c0427g.f3493q.getScrollY());
                        } else if (keyAt == C0288a.f1944c) {
                            c0427g.a.setWeight(Float.valueOf((f / 100.0f) * c0427g.a.getWeight()).floatValue());
                        } else if (keyAt == C0288a.f1947f) {
                            c0427g.f3493q.scrollTo(c0427g.f3493q.getScrollX() - c0427g.f3491o, (-Integer.valueOf((int) ((f / 100.0f) * ((float) c0427g.f3488l))).intValue()) - c0427g.f3491o);
                        } else if (keyAt == C0288a.f1948g) {
                            c0427g.f3493q.scrollTo((-Integer.valueOf((int) ((f / 100.0f) * ((float) c0427g.f3487k))).intValue()) - c0427g.f3490n, c0427g.f3493q.getScrollY() - c0427g.f3490n);
                        } else if (keyAt == C0288a.f1957p) {
                            c0427g.a.setVisible((int) f);
                        }
                    }
                }
            }
        }
    }

    static /* synthetic */ void m3884c(C0427g c0427g) {
        if (!(c0427g.f3483g == null || c0427g.f3483g == LuaNil.nil)) {
            try {
                ((Function) c0427g.f3483g).execute(new Object[]{c0427g});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        c0427g.f3483g = null;
    }

    static /* synthetic */ void m3888g(C0427g c0427g) {
        if (c0427g.f3485i != null && c0427g.f3485i != LuaNil.nil) {
            try {
                ((Function) c0427g.f3485i).execute(new Object[]{c0427g});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static /* synthetic */ void m3890i(C0427g c0427g) {
        if (c0427g.f3490n > c0427g.f3487k || c0427g.f3491o > c0427g.f3488l) {
            c0427g.m3879a();
        }
    }

    static /* synthetic */ void m3891j(C0427g c0427g) {
        if (!(c0427g.f3484h == null || c0427g.f3484h == LuaNil.nil)) {
            try {
                ((Function) c0427g.f3484h).execute(new Object[]{c0427g});
                c0427g.f3484h = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        c0427g.f3484h = null;
    }

    public final void m3892a(SparseArray sparseArray, boolean z, Object obj, Object obj2) {
        if (sparseArray.size() > 0) {
            this.f3488l = this.a.getParent().getWidget().getMeasuredHeight();
            this.f3487k = this.a.getParent().getWidget().getMeasuredWidth();
            this.f3493q = this.a.getWidget();
            this.f3491o = this.f3493q.getMeasuredHeight();
            this.f3490n = this.f3493q.getMeasuredWidth();
            this.f3489m = this.a.getWeight();
            this.f3478b = 2000;
            this.f3479c = 1;
            this.f3480d = 0;
            this.f3481e = 0;
            this.f3482f = 0;
            this.f3486j = sparseArray;
            this.f3483g = null;
            this.f3484h = null;
            if (obj2 != LuaNil.nil) {
                this.f3484h = ((LuaTable) obj2).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_EVENTS_END);
                this.f3483g = ((LuaTable) obj2).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_EVENTS_START);
                this.f3485i = ((LuaTable) obj2).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_EVENTS_ITERATION_END);
            }
            if (obj != LuaNil.nil) {
                LuaNil table = ((LuaTable) obj).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_DURATION);
                if (table != LuaNil.nil) {
                    this.f3478b = ((Double) table).intValue();
                }
                table = ((LuaTable) obj).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_DELAY);
                if (table != LuaNil.nil) {
                    this.f3481e = ((Double) table).intValue();
                }
                table = ((LuaTable) obj).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_FILL_MODE);
                if (table != LuaNil.nil) {
                    this.f3482f = C0289b.m2009a(((String) table).intern());
                }
                table = ((LuaTable) obj).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_DIRECTION);
                if (table != LuaNil.nil) {
                    this.f3480d = C0289b.m2011b(((String) table).intern());
                }
                table = ((LuaTable) obj).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_ITERATION_COUNT);
                if (table != LuaNil.nil) {
                    this.f3479c = ((Double) table).intValue();
                    if (this.f3479c == 0) {
                        this.f3479c = Integer.MAX_VALUE;
                        this.f3485i = null;
                        this.f3484h = null;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                m3881a((TreeMap) sparseArray.get(keyAt), keyAt, arrayList, arrayList2);
            }
            if (arrayList2.size() > 0) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    AnimationSet animationSet;
                    C0302r c0302r = (C0302r) arrayList2.get(i2);
                    C0301q c0301q = c0302r.f2350a;
                    int indexOfKey = sparseArray2.indexOfKey((int) c0301q.m2219c());
                    if (indexOfKey < 0) {
                        animationSet = new AnimationSet(false);
                        sparseArray2.put((int) c0301q.m2219c(), animationSet);
                    } else {
                        animationSet = (AnimationSet) sparseArray2.get(sparseArray2.keyAt(indexOfKey));
                    }
                    if (!(animationSet == null || c0302r == null)) {
                        c0301q.m2217a(0);
                        animationSet.addAnimation(c0301q.m2220d());
                    }
                }
                this.f3493q.postDelayed(new C0299n(this, sparseArray2), (long) this.f3481e);
            }
        }
    }

    final void m3893a(View view, SparseArray sparseArray, int i, boolean z) {
        AnimationSet animationSet;
        if (z) {
            if (i >= 0) {
                animationSet = (AnimationSet) sparseArray.get(sparseArray.keyAt(i));
                for (Animation animation : animationSet.getAnimations()) {
                    animation.setInterpolator(((C0301q) animation).m2218b());
                }
                view.startAnimation(animationSet);
                animationSet.setAnimationListener(new C0293h(this, i, sparseArray, view, z));
            }
        } else if (sparseArray.size() > i) {
            animationSet = (AnimationSet) sparseArray.get(sparseArray.keyAt(i));
            for (Animation animation2 : animationSet.getAnimations()) {
                animation2.setInterpolator(((C0301q) animation2).m2216a());
            }
            view.startAnimation(animationSet);
            animationSet.setAnimationListener(new C0296k(this, i, view, sparseArray, z));
        }
    }
}
