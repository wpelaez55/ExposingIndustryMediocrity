package ny0k;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.view.View;
import com.konylabs.api.ui.LuaWidget;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/* renamed from: ny0k.c */
public final class C0426c extends C0289b {
    private int f3442b;
    private int f3443c;
    private int f3444d;
    private int f3445e;
    private int f3446f;
    private Object f3447g;
    private Object f3448h;
    private Object f3449i;
    private int f3450j;
    private int f3451k;
    private float f3452l;
    private int f3453m;
    private int f3454n;
    private View f3455o;
    private float f3456p;
    private float f3457q;
    private int f3458r;
    private int f3459s;

    public C0426c(LuaWidget luaWidget) {
        this.f3450j = 0;
        this.f3451k = 0;
        this.a = luaWidget;
    }

    private void m3847a() {
        this.a.setHeight(Integer.valueOf(this.f3454n).intValue());
        this.a.setWidth(Integer.valueOf(this.f3453m).intValue());
        this.a.setY(0.0f);
        this.a.setX(0.0f);
        this.a.setWeight(Float.valueOf(this.f3452l).floatValue());
    }

    private void m3848a(TreeMap treeMap, ArrayList arrayList, ArrayList arrayList2) {
        Object obj;
        HashMap hashMap = new HashMap();
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        int i = 0;
        for (Float floatValue : treeMap.keySet()) {
            float floatValue2 = floatValue.floatValue();
            SparseArray sparseArray = (SparseArray) treeMap.get(Float.valueOf(floatValue2));
            int i2 = 0;
            Object obj5 = obj2;
            while (i2 < sparseArray.size()) {
                ArrayList arrayList3;
                Integer valueOf;
                C0275E c0275e = (C0275E) sparseArray.get(sparseArray.keyAt(i2));
                float f = c0275e.f1895a;
                Integer num = null;
                int i3 = c0275e.f1897c;
                if (floatValue2 == 0.0f || hashMap.size() != 0) {
                    obj = obj4;
                    obj4 = obj3;
                } else {
                    Object obj6;
                    int i4;
                    if (i3 == 0) {
                        num = Integer.valueOf(this.f3455o.getHeight());
                        obj6 = obj3;
                        obj3 = "height";
                        i4 = i;
                    } else if (i3 == C0288a.f1943b) {
                        num = Integer.valueOf(this.f3455o.getWidth());
                        obj6 = obj3;
                        String str = "width";
                        i4 = i;
                    } else if (i3 == C0288a.f1945d) {
                        obj3 = "y";
                        obj6 = 1;
                        i = (int) (this.f3457q - ((float) this.f3459s));
                        num = Float.valueOf((float) i);
                        i4 = i;
                    } else if (i3 == C0288a.f1946e) {
                        obj3 = "x";
                        obj6 = 1;
                        i = (int) (this.f3456p - ((float) this.f3458r));
                        num = Float.valueOf((float) i);
                        i4 = i;
                    } else if (i3 == C0288a.f1944c) {
                        obj3 = "weight";
                        obj6 = 1;
                        num = Float.valueOf(this.a.getWeight());
                        i4 = i;
                    } else if (i3 == C0288a.f1948g) {
                        obj3 = "y";
                        obj6 = 1;
                        i = (int) ((this.f3457q - ((float) this.f3459s)) - ((float) this.f3453m));
                        num = Float.valueOf((float) i);
                        i4 = i;
                    } else if (i3 == C0288a.f1947f) {
                        obj3 = "x";
                        obj6 = 1;
                        i = (int) ((this.f3456p - ((float) this.f3458r)) - ((float) this.f3454n));
                        num = Float.valueOf((float) i);
                        i4 = i;
                    } else if (i3 == C0288a.f1949h) {
                        obj3 = "translationX";
                        obj6 = 1;
                        i = (int) (this.f3456p - ((float) this.f3458r));
                        num = Float.valueOf((float) i);
                        i4 = i;
                    } else if (i3 == C0288a.f1950i) {
                        obj3 = "translationY";
                        obj6 = 1;
                        i = (int) (this.f3457q - ((float) this.f3459s));
                        num = Float.valueOf((float) i);
                        i4 = i;
                    } else if (i3 == C0288a.f1953l) {
                        obj3 = "rotationX";
                        obj6 = 1;
                        num = Float.valueOf(this.f3455o.getRotationX());
                        i4 = i;
                    } else if (i3 == C0288a.f1954m) {
                        obj3 = "rotationY";
                        obj6 = 1;
                        num = Float.valueOf(this.f3455o.getRotationY());
                        i4 = i;
                    } else if (i3 == C0288a.f1951j) {
                        obj3 = "scaleX";
                        obj6 = 1;
                        num = Float.valueOf(this.f3455o.getScaleX());
                        i4 = i;
                    } else if (i3 == C0288a.f1952k) {
                        obj3 = "scaleY";
                        obj6 = 1;
                        num = Float.valueOf(this.f3455o.getScaleY());
                        i4 = i;
                    } else if (i3 == C0288a.f1955n) {
                        obj3 = "skewX";
                        obj6 = 1;
                        num = Float.valueOf(0.0f);
                        i4 = i;
                    } else if (i3 == C0288a.f1956o) {
                        obj3 = "skewY";
                        obj6 = 1;
                        num = Float.valueOf(0.0f);
                        i4 = i;
                    } else if (i3 == C0288a.f1957p) {
                        obj3 = "visible";
                        obj6 = null;
                        num = Integer.valueOf(this.a.getVisible());
                        i4 = i;
                    } else {
                        obj6 = obj3;
                        obj3 = obj4;
                        i4 = i;
                    }
                    Keyframe ofInt = obj6 == null ? Keyframe.ofInt(0.0f, num.intValue()) : Keyframe.ofFloat(0.0f, ((Float) num).floatValue());
                    ofInt.setInterpolator(C0289b.m2010a(0));
                    arrayList3 = (ArrayList) hashMap.get(obj3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(ofInt);
                    hashMap.put(obj3, arrayList3);
                    i = i4;
                    obj = obj3;
                    obj4 = obj6;
                }
                TimeInterpolator a = C0289b.m2010a(c0275e.f1896b);
                if (i3 == 0) {
                    valueOf = Integer.valueOf((int) ((f / 100.0f) * ((float) this.f3451k)));
                    obj3 = obj4;
                    obj2 = 1;
                    obj4 = "height";
                } else if (i3 == C0288a.f1943b) {
                    valueOf = Integer.valueOf((int) ((f / 100.0f) * ((float) this.f3450j)));
                    obj3 = obj4;
                    r3 = 1;
                    String str2 = "width";
                } else if (i3 == C0288a.f1945d) {
                    obj4 = "y";
                    obj3 = 1;
                    valueOf = Float.valueOf(((f / 100.0f) * ((float) this.f3451k)) + ((float) i));
                    r3 = 1;
                } else if (i3 == C0288a.f1946e) {
                    obj4 = "x";
                    obj3 = 1;
                    valueOf = Float.valueOf(((f / 100.0f) * ((float) this.f3450j)) + ((float) i));
                    r3 = 1;
                } else if (i3 == C0288a.f1944c) {
                    obj4 = "weight";
                    obj3 = 1;
                    valueOf = Float.valueOf((f / 100.0f) * this.f3452l);
                    r3 = 1;
                } else if (i3 == C0288a.f1947f) {
                    obj4 = "y";
                    obj3 = 1;
                    valueOf = Float.valueOf((((f / 100.0f) * ((float) this.f3451k)) + ((float) i)) - ((float) this.f3454n));
                    r3 = 1;
                } else if (i3 == C0288a.f1948g) {
                    obj4 = "x";
                    obj3 = 1;
                    valueOf = Float.valueOf((((f / 100.0f) * ((float) this.f3450j)) + ((float) i)) - ((float) this.f3453m));
                    r3 = 1;
                } else if (i3 == C0288a.f1949h) {
                    obj4 = "translationX";
                    obj3 = 1;
                    valueOf = Float.valueOf(((f / 100.0f) * ((float) this.f3450j)) + ((float) i));
                    obj2 = obj5;
                } else if (i3 == C0288a.f1950i) {
                    obj4 = "translationY";
                    obj3 = 1;
                    valueOf = Float.valueOf(((f / 100.0f) * ((float) this.f3451k)) + ((float) i));
                    obj2 = obj5;
                } else if (i3 == C0288a.f1953l) {
                    obj4 = "rotationX";
                    obj3 = 1;
                    valueOf = Float.valueOf(f);
                    obj2 = obj5;
                } else if (i3 == C0288a.f1954m) {
                    obj4 = "rotationY";
                    obj3 = 1;
                    valueOf = Float.valueOf(f);
                    obj2 = obj5;
                } else if (i3 == C0288a.f1951j) {
                    obj4 = "scaleX";
                    obj3 = 1;
                    valueOf = Float.valueOf(f);
                    obj2 = obj5;
                } else if (i3 == C0288a.f1952k) {
                    obj4 = "scaleY";
                    obj3 = 1;
                    valueOf = Float.valueOf(f);
                    obj2 = obj5;
                } else if (i3 == C0288a.f1955n) {
                    obj4 = "skewX";
                    obj3 = 1;
                    valueOf = Float.valueOf(f);
                    obj2 = obj5;
                } else if (i3 == C0288a.f1956o) {
                    obj4 = "skewY";
                    obj3 = 1;
                    valueOf = Float.valueOf(f);
                    r3 = 1;
                } else if (i3 == C0288a.f1957p) {
                    obj4 = "visible";
                    obj3 = null;
                    valueOf = Integer.valueOf((int) f);
                    r3 = 1;
                } else {
                    obj3 = obj4;
                    obj2 = obj5;
                    obj4 = obj;
                    valueOf = num;
                }
                Keyframe ofInt2 = obj3 == null ? Keyframe.ofInt(floatValue2 / 100.0f, valueOf.intValue()) : Keyframe.ofFloat(floatValue2 / 100.0f, ((Float) valueOf).floatValue());
                ofInt2.setInterpolator(a);
                arrayList3 = (ArrayList) hashMap.get(obj4);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                arrayList3.add(ofInt2);
                hashMap.put(obj4, arrayList3);
                i2++;
                obj5 = obj2;
            }
            obj2 = obj5;
        }
        if (hashMap.size() > 0) {
            Object[] toArray = hashMap.keySet().toArray();
            for (Object obj7 : toArray) {
                String str3 = (String) obj7;
                ArrayList arrayList4 = (ArrayList) hashMap.get(str3);
                Keyframe[] keyframeArr = new Keyframe[arrayList4.size()];
                arrayList4.toArray(keyframeArr);
                PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(str3, keyframeArr);
                if (obj2 != null) {
                    arrayList2.add(ofKeyframe);
                } else {
                    arrayList.add(ofKeyframe);
                }
            }
        }
    }

    static /* synthetic */ void m3849a(C0426c c0426c, SparseArray sparseArray, int i) {
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            int keyAt = sparseArray.keyAt(i2);
            TreeMap treeMap = (TreeMap) sparseArray.get(keyAt);
            float f = 0.0f;
            if (treeMap.size() != 0) {
                Object[] toArray = treeMap.keySet().toArray();
                if (i == 0) {
                    f = ((Float) toArray[toArray.length - 1]).floatValue();
                    if (((int) f) != 100) {
                    }
                } else if (i == 1) {
                    f = ((Float) toArray[0]).floatValue();
                    if (((int) f) != 0) {
                    }
                }
                SparseArray sparseArray2 = (SparseArray) treeMap.get(Float.valueOf(f));
                for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
                    C0275E c0275e = (C0275E) sparseArray2.get(sparseArray2.keyAt(i3));
                    if (c0275e != null) {
                        f = c0275e.f1895a;
                        if (keyAt == 0) {
                            c0426c.a.setHeight(Integer.valueOf((int) ((f / 100.0f) * ((float) c0426c.f3451k))).intValue());
                        } else if (keyAt == C0288a.f1943b) {
                            c0426c.a.setWidth(Integer.valueOf((int) ((f / 100.0f) * ((float) c0426c.f3450j))).intValue());
                        } else if (keyAt == C0288a.f1945d) {
                            c0426c.a.setY(Float.valueOf((f / 100.0f) * ((float) c0426c.f3451k)).floatValue());
                        } else if (keyAt == C0288a.f1946e) {
                            c0426c.a.setX(Float.valueOf((f / 100.0f) * ((float) c0426c.f3450j)).floatValue());
                        } else if (keyAt == C0288a.f1944c) {
                            c0426c.a.setWeight(Float.valueOf((f / 100.0f) * c0426c.a.getWeight()).floatValue());
                        } else if (keyAt == C0288a.f1947f) {
                            c0426c.a.setY(Float.valueOf(((f / 100.0f) * ((float) c0426c.f3451k)) - ((float) c0426c.f3454n)).floatValue());
                        } else if (keyAt == C0288a.f1948g) {
                            c0426c.a.setX(Float.valueOf(((f / 100.0f) * ((float) c0426c.f3450j)) - ((float) c0426c.f3453m)).floatValue());
                        } else if (keyAt == C0288a.f1949h) {
                            c0426c.a.setX(Float.valueOf((f / 100.0f) * ((float) c0426c.f3450j)).floatValue());
                        } else if (keyAt == C0288a.f1950i) {
                            c0426c.a.setY(Float.valueOf((f / 100.0f) * ((float) c0426c.f3451k)).floatValue());
                        } else if (keyAt == C0288a.f1953l) {
                            c0426c.f3455o.setRotationX(Float.valueOf(f).floatValue());
                        } else if (keyAt == C0288a.f1954m) {
                            c0426c.f3455o.setRotationY(Float.valueOf(f).floatValue());
                        } else if (keyAt == C0288a.f1951j) {
                            c0426c.f3455o.setScaleX(Float.valueOf(f).floatValue());
                        } else if (keyAt == C0288a.f1952k) {
                            c0426c.f3455o.setScaleY(Float.valueOf(f).floatValue());
                        } else if (keyAt == C0288a.f1957p) {
                            c0426c.a.setVisible((int) f);
                        }
                    }
                }
            }
        }
        c0426c.f3455o.invalidate();
    }

    static /* synthetic */ void m3853e(C0426c c0426c) {
        if (c0426c.f3453m > c0426c.f3450j || c0426c.f3454n > c0426c.f3451k) {
            c0426c.m3847a();
        }
    }

    public final void m3855a(SparseArray sparseArray, boolean z, Object obj, Object obj2) {
        if (sparseArray.size() > 0) {
            ObjectAnimator ofPropertyValuesHolder;
            this.f3451k = this.a.getParent().getWidget().getMeasuredHeight();
            this.f3450j = this.a.getParent().getWidget().getMeasuredWidth();
            this.f3455o = this.a.getWidget();
            this.f3454n = this.f3455o.getMeasuredHeight();
            this.f3453m = this.f3455o.getMeasuredWidth();
            this.f3456p = this.f3455o.getX();
            this.f3457q = this.f3455o.getY();
            this.f3458r = this.f3455o.getLeft();
            this.f3459s = this.f3455o.getTop();
            this.f3455o.getRight();
            this.f3452l = this.a.getWeight();
            this.f3442b = 2000;
            this.f3443c = -1;
            this.f3444d = 0;
            this.f3445e = 0;
            this.f3446f = 0;
            this.f3447g = null;
            this.f3448h = null;
            this.f3449i = null;
            if (obj != LuaNil.nil) {
                LuaNil table = ((LuaTable) obj).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_DURATION);
                if (table != LuaNil.nil) {
                    this.f3442b = ((Double) table).intValue();
                }
                table = ((LuaTable) obj).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_DELAY);
                if (table != LuaNil.nil) {
                    this.f3445e = ((Double) table).intValue();
                }
                table = ((LuaTable) obj).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_FILL_MODE);
                if (table != LuaNil.nil) {
                    this.f3446f = C0289b.m2009a(((String) table).intern());
                }
                table = ((LuaTable) obj).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_DIRECTION);
                if (table != LuaNil.nil) {
                    this.f3444d = C0289b.m2011b(((String) table).intern());
                }
                table = ((LuaTable) obj).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_ITERATION_COUNT);
                if (table != LuaNil.nil) {
                    this.f3443c = ((Double) table).intValue();
                }
            }
            if (obj2 != LuaNil.nil) {
                this.f3448h = ((LuaTable) obj2).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_EVENTS_END);
                this.f3447g = ((LuaTable) obj2).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_EVENTS_START);
                this.f3449i = ((LuaTable) obj2).getTable(LuaWidget.ATTR_WIDGET_ANIMATION_EVENTS_ITERATION_END);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < sparseArray.size(); i++) {
                m3848a((TreeMap) sparseArray.get(sparseArray.keyAt(i)), arrayList, arrayList2);
            }
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[arrayList.size()];
            arrayList.toArray(propertyValuesHolderArr);
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[arrayList2.size()];
            arrayList2.toArray(propertyValuesHolderArr2);
            ArrayList arrayList3 = new ArrayList();
            if (propertyValuesHolderArr.length > 0) {
                ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f3455o, propertyValuesHolderArr);
                arrayList3.add(ofPropertyValuesHolder);
                if (this.f3443c == 0) {
                    ofPropertyValuesHolder.setRepeatCount(-1);
                } else if (this.f3443c > 0) {
                    ofPropertyValuesHolder.setRepeatCount(this.f3443c - 1);
                }
                if (this.f3444d == 1) {
                    ofPropertyValuesHolder.reverse();
                }
                if (this.f3444d == 2 || this.f3444d == 3) {
                    ofPropertyValuesHolder.setRepeatMode(2);
                }
                ofPropertyValuesHolder.setStartDelay((long) this.f3445e);
            }
            if (propertyValuesHolderArr2.length > 0) {
                ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.a, propertyValuesHolderArr2);
                arrayList3.add(ofPropertyValuesHolder);
                if (this.f3443c == 0) {
                    ofPropertyValuesHolder.setRepeatCount(-1);
                } else if (this.f3443c > 0) {
                    ofPropertyValuesHolder.setRepeatCount(this.f3443c - 1);
                }
                if (this.f3444d == 1) {
                    ofPropertyValuesHolder.reverse();
                }
                if (this.f3444d == 2 || this.f3444d == 3) {
                    ofPropertyValuesHolder.setRepeatMode(2);
                }
                ofPropertyValuesHolder.setStartDelay((long) this.f3445e);
            }
            Animator[] animatorArr = new ObjectAnimator[arrayList3.size()];
            arrayList3.toArray(animatorArr);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorArr);
            animatorSet.setDuration((long) this.f3442b);
            if (this.f3444d == 1 || this.f3444d == 3) {
                animatorSet.setInterpolator(new C0305u());
            }
            animatorSet.addListener(new C0290d(this, sparseArray));
            animatorSet.start();
            arrayList.clear();
            arrayList2.clear();
            arrayList3.clear();
        }
    }
}
