package ny0k;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.util.SparseArray;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.Hashtable;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.Vector;

/* renamed from: ny0k.a */
public final class C0288a {
    private static String f1928A;
    private static String f1929B;
    private static String f1930C;
    private static String f1931D;
    private static String f1932E;
    private static String f1933F;
    private static String f1934G;
    private static String f1935H;
    private static String f1936I;
    private static String f1937J;
    private static String f1938K;
    private static String f1939L;
    private static String f1940M;
    private static int f1941N;
    public static int f1942a;
    public static int f1943b;
    public static int f1944c;
    public static int f1945d;
    public static int f1946e;
    public static int f1947f;
    public static int f1948g;
    public static int f1949h;
    public static int f1950i;
    public static int f1951j;
    public static int f1952k;
    public static int f1953l;
    public static int f1954m;
    public static int f1955n;
    public static int f1956o;
    public static int f1957p;
    private static String f1958q;
    private static String f1959r;
    private static String f1960s;
    private static String f1961t;
    private static String f1962u;
    private static String f1963v;
    private static String f1964w;
    private static String f1965x;
    private static String f1966y;
    private static String f1967z;

    static {
        f1958q = "height";
        f1959r = "width";
        f1960s = "weight";
        f1961t = "top";
        f1962u = "left";
        f1963v = "bottom";
        f1964w = "right";
        f1965x = "animation-step-config";
        f1966y = "animation-timing-function";
        f1967z = "transform";
        f1928A = "scale";
        f1929B = "scaleX";
        f1930C = "scaleY";
        f1931D = "translate";
        f1932E = "translateX";
        f1933F = "translateY";
        f1934G = "rotate";
        f1935H = "rotateX";
        f1936I = "rotateY";
        f1937J = "skew";
        f1938K = "skewX";
        f1939L = "skewY";
        f1940M = "visibility";
        f1942a = 0;
        f1943b = 1;
        f1944c = 2;
        f1945d = 3;
        f1946e = 4;
        f1947f = 5;
        f1948g = 6;
        f1941N = 7;
        f1949h = 9;
        f1950i = 10;
        f1951j = 12;
        f1952k = 13;
        f1953l = 15;
        f1954m = 16;
        f1955n = 18;
        f1956o = 19;
        f1957p = 20;
    }

    public static SparseArray m1856a(LuaTable luaTable) {
        SparseArray sparseArray = new SparseArray();
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        TreeMap treeMap3 = new TreeMap();
        TreeMap treeMap4 = new TreeMap();
        TreeMap treeMap5 = new TreeMap();
        TreeMap treeMap6 = new TreeMap();
        TreeMap treeMap7 = new TreeMap();
        TreeMap treeMap8 = new TreeMap();
        TreeMap treeMap9 = new TreeMap();
        Hashtable hashtable = luaTable.map;
        Object obj = null;
        for (Object next : hashtable.keySet()) {
            int i;
            float f;
            String str;
            SparseArray sparseArray2;
            ListIterator listIterator;
            LuaTable luaTable2;
            Vector vector;
            float parseFloat = Float.parseFloat((String) next);
            Object obj2 = ((int) parseFloat) == 100 ? 1 : obj;
            LuaTable luaTable3 = (LuaTable) hashtable.get(next);
            Object next2 = luaTable3.map.get(f1965x);
            if (next2 != null) {
                LuaNil table = ((LuaTable) next2).getTable(f1966y);
                if (table != LuaNil.nil) {
                    int i2;
                    String intern = ((String) table).intern();
                    if (intern != "ease") {
                        if (intern == "linear") {
                            i2 = 1;
                        } else if (intern == "ease-in") {
                            i2 = 2;
                        } else if (intern == "ease-out") {
                            i2 = 3;
                        } else if (intern == "ease-in-out") {
                            i2 = 4;
                        }
                        i = i2;
                        if (luaTable3 == null) {
                            f = 0.0f;
                            for (String str2 : luaTable3.map.keySet()) {
                                if (str2.compareTo(f1965x) == 0) {
                                    sparseArray2 = new SparseArray();
                                    if (!(str2.equals(f1967z) || str2.equals(f1940M))) {
                                        f = (float) ((Double) luaTable3.map.get(str2)).intValue();
                                    }
                                    if (!str2.equals(f1958q)) {
                                        sparseArray2.put(0, new C0275E(0, f, i));
                                        treeMap.put(Float.valueOf(parseFloat), sparseArray2);
                                    } else if (!str2.equals(f1959r)) {
                                        sparseArray2.put(f1943b, new C0275E(f1943b, f, i));
                                        treeMap2.put(Float.valueOf(parseFloat), sparseArray2);
                                    } else if (!str2.equals(f1960s)) {
                                        sparseArray2.put(f1944c, new C0275E(f1944c, f, i));
                                        treeMap3.put(Float.valueOf(parseFloat), sparseArray2);
                                    } else if (!str2.equals(f1961t)) {
                                        sparseArray2.put(f1945d, new C0275E(f1945d, f, i));
                                        treeMap4.put(Float.valueOf(parseFloat), sparseArray2);
                                    } else if (!str2.equals(f1962u)) {
                                        sparseArray2.put(f1946e, new C0275E(f1946e, f, i));
                                        treeMap5.put(Float.valueOf(parseFloat), sparseArray2);
                                    } else if (!str2.equals(f1964w)) {
                                        sparseArray2.put(f1948g, new C0275E(f1948g, f, i));
                                        treeMap6.put(Float.valueOf(parseFloat), sparseArray2);
                                    } else if (!str2.equals(f1963v)) {
                                        sparseArray2.put(f1947f, new C0275E(f1947f, f, i));
                                        treeMap7.put(Float.valueOf(parseFloat), sparseArray2);
                                    } else if (!str2.equals(f1940M)) {
                                        f = ((Boolean) luaTable3.map.get(str2)).booleanValue() ? 1.0f : 0.0f;
                                        sparseArray2.put(f1957p, new C0275E(f1957p, f, i));
                                        treeMap9.put(Float.valueOf(parseFloat), sparseArray2);
                                    } else if (!str2.equals(f1967z)) {
                                        listIterator = ((LuaTable) luaTable3.map.get(str2)).list.listIterator();
                                        while (listIterator.hasNext()) {
                                            luaTable2 = (LuaTable) listIterator.next();
                                            str2 = (String) luaTable2.getTable("tfunc");
                                            vector = ((LuaTable) luaTable2.getTable("args")).list;
                                            if (!str2.equals(f1931D)) {
                                                sparseArray2.put(f1949h, new C0275E(f1949h, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                                if (vector.size() <= 1) {
                                                    sparseArray2.put(f1950i, new C0275E(f1950i, (float) ((Double) vector.elementAt(1)).intValue(), i));
                                                }
                                            } else if (!str2.equals(f1932E)) {
                                                sparseArray2.put(f1949h, new C0275E(f1949h, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                            } else if (!str2.equals(f1933F)) {
                                                sparseArray2.put(f1950i, new C0275E(f1950i, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                            } else if (!str2.equals(f1928A)) {
                                                sparseArray2.put(f1951j, new C0275E(f1951j, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                                if (vector.size() <= 1) {
                                                    sparseArray2.put(f1952k, new C0275E(f1952k, (float) ((Double) vector.elementAt(1)).intValue(), i));
                                                }
                                            } else if (!str2.equals(f1929B)) {
                                                sparseArray2.put(f1951j, new C0275E(f1951j, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                            } else if (!str2.equals(f1930C)) {
                                                sparseArray2.put(f1952k, new C0275E(f1952k, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                            } else if (!str2.equals(f1934G)) {
                                                sparseArray2.put(f1953l, new C0275E(f1953l, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                                if (vector.size() <= 1) {
                                                    sparseArray2.put(f1954m, new C0275E(f1954m, (float) ((Double) vector.elementAt(1)).intValue(), i));
                                                }
                                            } else if (!str2.equals(f1935H)) {
                                                sparseArray2.put(f1953l, new C0275E(f1953l, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                            } else if (!str2.equals(f1936I)) {
                                                sparseArray2.put(f1954m, new C0275E(f1954m, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                            } else if (!str2.equals(f1937J)) {
                                                sparseArray2.put(f1955n, new C0275E(f1955n, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                                if (vector.size() <= 1) {
                                                    sparseArray2.put(f1956o, new C0275E(f1956o, (float) ((Double) vector.elementAt(1)).intValue(), i));
                                                }
                                            } else if (!str2.equals(f1938K)) {
                                                sparseArray2.put(f1955n, new C0275E(f1955n, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                            } else if (!str2.equals(f1939L)) {
                                                sparseArray2.put(f1956o, new C0275E(f1956o, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                            }
                                        }
                                        treeMap8.put(Float.valueOf(parseFloat), sparseArray2);
                                    }
                                }
                            }
                        }
                        obj = obj2;
                    }
                    i2 = 0;
                    i = i2;
                    if (luaTable3 == null) {
                        f = 0.0f;
                        for (String str22 : luaTable3.map.keySet()) {
                            if (str22.compareTo(f1965x) == 0) {
                                sparseArray2 = new SparseArray();
                                f = (float) ((Double) luaTable3.map.get(str22)).intValue();
                                if (!str22.equals(f1958q)) {
                                    sparseArray2.put(0, new C0275E(0, f, i));
                                    treeMap.put(Float.valueOf(parseFloat), sparseArray2);
                                } else if (!str22.equals(f1959r)) {
                                    sparseArray2.put(f1943b, new C0275E(f1943b, f, i));
                                    treeMap2.put(Float.valueOf(parseFloat), sparseArray2);
                                } else if (!str22.equals(f1960s)) {
                                    sparseArray2.put(f1944c, new C0275E(f1944c, f, i));
                                    treeMap3.put(Float.valueOf(parseFloat), sparseArray2);
                                } else if (!str22.equals(f1961t)) {
                                    sparseArray2.put(f1945d, new C0275E(f1945d, f, i));
                                    treeMap4.put(Float.valueOf(parseFloat), sparseArray2);
                                } else if (!str22.equals(f1962u)) {
                                    sparseArray2.put(f1946e, new C0275E(f1946e, f, i));
                                    treeMap5.put(Float.valueOf(parseFloat), sparseArray2);
                                } else if (!str22.equals(f1964w)) {
                                    sparseArray2.put(f1948g, new C0275E(f1948g, f, i));
                                    treeMap6.put(Float.valueOf(parseFloat), sparseArray2);
                                } else if (!str22.equals(f1963v)) {
                                    sparseArray2.put(f1947f, new C0275E(f1947f, f, i));
                                    treeMap7.put(Float.valueOf(parseFloat), sparseArray2);
                                } else if (!str22.equals(f1940M)) {
                                    if (((Boolean) luaTable3.map.get(str22)).booleanValue()) {
                                    }
                                    sparseArray2.put(f1957p, new C0275E(f1957p, f, i));
                                    treeMap9.put(Float.valueOf(parseFloat), sparseArray2);
                                } else if (!str22.equals(f1967z)) {
                                    listIterator = ((LuaTable) luaTable3.map.get(str22)).list.listIterator();
                                    while (listIterator.hasNext()) {
                                        luaTable2 = (LuaTable) listIterator.next();
                                        str22 = (String) luaTable2.getTable("tfunc");
                                        vector = ((LuaTable) luaTable2.getTable("args")).list;
                                        if (!str22.equals(f1931D)) {
                                            sparseArray2.put(f1949h, new C0275E(f1949h, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                            if (vector.size() <= 1) {
                                                sparseArray2.put(f1950i, new C0275E(f1950i, (float) ((Double) vector.elementAt(1)).intValue(), i));
                                            }
                                        } else if (!str22.equals(f1932E)) {
                                            sparseArray2.put(f1949h, new C0275E(f1949h, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                        } else if (!str22.equals(f1933F)) {
                                            sparseArray2.put(f1950i, new C0275E(f1950i, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                        } else if (!str22.equals(f1928A)) {
                                            sparseArray2.put(f1951j, new C0275E(f1951j, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                            if (vector.size() <= 1) {
                                                sparseArray2.put(f1952k, new C0275E(f1952k, (float) ((Double) vector.elementAt(1)).intValue(), i));
                                            }
                                        } else if (!str22.equals(f1929B)) {
                                            sparseArray2.put(f1951j, new C0275E(f1951j, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                        } else if (!str22.equals(f1930C)) {
                                            sparseArray2.put(f1952k, new C0275E(f1952k, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                        } else if (!str22.equals(f1934G)) {
                                            sparseArray2.put(f1953l, new C0275E(f1953l, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                            if (vector.size() <= 1) {
                                                sparseArray2.put(f1954m, new C0275E(f1954m, (float) ((Double) vector.elementAt(1)).intValue(), i));
                                            }
                                        } else if (!str22.equals(f1935H)) {
                                            sparseArray2.put(f1953l, new C0275E(f1953l, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                        } else if (!str22.equals(f1936I)) {
                                            sparseArray2.put(f1954m, new C0275E(f1954m, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                        } else if (!str22.equals(f1937J)) {
                                            sparseArray2.put(f1955n, new C0275E(f1955n, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                            if (vector.size() <= 1) {
                                                sparseArray2.put(f1956o, new C0275E(f1956o, (float) ((Double) vector.elementAt(1)).intValue(), i));
                                            }
                                        } else if (!str22.equals(f1938K)) {
                                            sparseArray2.put(f1955n, new C0275E(f1955n, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                        } else if (!str22.equals(f1939L)) {
                                            sparseArray2.put(f1956o, new C0275E(f1956o, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                        }
                                    }
                                    treeMap8.put(Float.valueOf(parseFloat), sparseArray2);
                                }
                            }
                        }
                    }
                    obj = obj2;
                }
            }
            i = 0;
            if (luaTable3 == null) {
                f = 0.0f;
                for (String str222 : luaTable3.map.keySet()) {
                    if (str222.compareTo(f1965x) == 0) {
                        sparseArray2 = new SparseArray();
                        f = (float) ((Double) luaTable3.map.get(str222)).intValue();
                        if (!str222.equals(f1958q)) {
                            sparseArray2.put(0, new C0275E(0, f, i));
                            treeMap.put(Float.valueOf(parseFloat), sparseArray2);
                        } else if (!str222.equals(f1959r)) {
                            sparseArray2.put(f1943b, new C0275E(f1943b, f, i));
                            treeMap2.put(Float.valueOf(parseFloat), sparseArray2);
                        } else if (!str222.equals(f1960s)) {
                            sparseArray2.put(f1944c, new C0275E(f1944c, f, i));
                            treeMap3.put(Float.valueOf(parseFloat), sparseArray2);
                        } else if (!str222.equals(f1961t)) {
                            sparseArray2.put(f1945d, new C0275E(f1945d, f, i));
                            treeMap4.put(Float.valueOf(parseFloat), sparseArray2);
                        } else if (!str222.equals(f1962u)) {
                            sparseArray2.put(f1946e, new C0275E(f1946e, f, i));
                            treeMap5.put(Float.valueOf(parseFloat), sparseArray2);
                        } else if (!str222.equals(f1964w)) {
                            sparseArray2.put(f1948g, new C0275E(f1948g, f, i));
                            treeMap6.put(Float.valueOf(parseFloat), sparseArray2);
                        } else if (!str222.equals(f1963v)) {
                            sparseArray2.put(f1947f, new C0275E(f1947f, f, i));
                            treeMap7.put(Float.valueOf(parseFloat), sparseArray2);
                        } else if (!str222.equals(f1940M)) {
                            if (((Boolean) luaTable3.map.get(str222)).booleanValue()) {
                            }
                            sparseArray2.put(f1957p, new C0275E(f1957p, f, i));
                            treeMap9.put(Float.valueOf(parseFloat), sparseArray2);
                        } else if (!str222.equals(f1967z)) {
                            listIterator = ((LuaTable) luaTable3.map.get(str222)).list.listIterator();
                            while (listIterator.hasNext()) {
                                luaTable2 = (LuaTable) listIterator.next();
                                str222 = (String) luaTable2.getTable("tfunc");
                                vector = ((LuaTable) luaTable2.getTable("args")).list;
                                if (!str222.equals(f1931D)) {
                                    sparseArray2.put(f1949h, new C0275E(f1949h, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                    if (vector.size() <= 1) {
                                        sparseArray2.put(f1950i, new C0275E(f1950i, (float) ((Double) vector.elementAt(1)).intValue(), i));
                                    }
                                } else if (!str222.equals(f1932E)) {
                                    sparseArray2.put(f1949h, new C0275E(f1949h, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                } else if (!str222.equals(f1933F)) {
                                    sparseArray2.put(f1950i, new C0275E(f1950i, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                } else if (!str222.equals(f1928A)) {
                                    sparseArray2.put(f1951j, new C0275E(f1951j, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                    if (vector.size() <= 1) {
                                        sparseArray2.put(f1952k, new C0275E(f1952k, (float) ((Double) vector.elementAt(1)).intValue(), i));
                                    }
                                } else if (!str222.equals(f1929B)) {
                                    sparseArray2.put(f1951j, new C0275E(f1951j, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                } else if (!str222.equals(f1930C)) {
                                    sparseArray2.put(f1952k, new C0275E(f1952k, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                } else if (!str222.equals(f1934G)) {
                                    sparseArray2.put(f1953l, new C0275E(f1953l, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                    if (vector.size() <= 1) {
                                        sparseArray2.put(f1954m, new C0275E(f1954m, (float) ((Double) vector.elementAt(1)).intValue(), i));
                                    }
                                } else if (!str222.equals(f1935H)) {
                                    sparseArray2.put(f1953l, new C0275E(f1953l, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                } else if (!str222.equals(f1936I)) {
                                    sparseArray2.put(f1954m, new C0275E(f1954m, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                } else if (!str222.equals(f1937J)) {
                                    sparseArray2.put(f1955n, new C0275E(f1955n, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                    if (vector.size() <= 1) {
                                        sparseArray2.put(f1956o, new C0275E(f1956o, (float) ((Double) vector.elementAt(1)).intValue(), i));
                                    }
                                } else if (!str222.equals(f1938K)) {
                                    sparseArray2.put(f1955n, new C0275E(f1955n, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                } else if (!str222.equals(f1939L)) {
                                    sparseArray2.put(f1956o, new C0275E(f1956o, (float) ((Double) vector.elementAt(0)).intValue(), i));
                                }
                            }
                            treeMap8.put(Float.valueOf(parseFloat), sparseArray2);
                        }
                    }
                }
            }
            obj = obj2;
        }
        if (obj == null) {
            throw new LuaError(101, "Error", "Animation step 100 has not been set");
        }
        sparseArray.put(0, treeMap);
        sparseArray.put(f1943b, treeMap2);
        sparseArray.put(f1944c, treeMap3);
        sparseArray.put(f1945d, treeMap4);
        sparseArray.put(f1946e, treeMap5);
        sparseArray.put(f1948g, treeMap6);
        sparseArray.put(f1947f, treeMap7);
        sparseArray.put(f1941N, treeMap8);
        sparseArray.put(f1957p, treeMap9);
        return sparseArray;
    }

    public static Animation m1857a(int i, boolean z) {
        Animation a;
        int i2;
        Animation animationSet;
        Animation c0429v;
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                a = C0288a.m1858a("slide_in_top");
                i2 = 800;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                a = C0288a.m1858a("right_in");
                i2 = 800;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                a = C0288a.m1858a("left_in");
                i2 = 800;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                a = C0288a.m1858a("right_out");
                i2 = 800;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_INTEGER /*5*/:
                a = C0288a.m1858a("left_out");
                i2 = 800;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_LONG /*6*/:
                a = C0288a.m1858a("grow_fade_from_center");
                i2 = 400;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                a = C0288a.m1858a("grow_fade_from_topright");
                i2 = 400;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_DOUBLE /*8*/:
                a = C0288a.m1858a("slide_in_down");
                i2 = 800;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_BOOLEAN /*9*/:
                a = C0288a.m1858a("grow_fade_from_bottomleft");
                i2 = 400;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_STRING /*10*/:
                a = C0288a.m1858a("fancy_anim");
                i2 = 400;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_VECTOR /*11*/:
                animationSet = new AnimationSet(KonyMain.getActivityContext(), null);
                a = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 2, 0.5f, 2, 0.5f);
                c0429v = new C0429v(0, 90);
                animationSet.addAnimation(a);
                animationSet.addAnimation(c0429v);
                i2 = 400;
                a = animationSet;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_OBJECT /*12*/:
                animationSet = new AnimationSet(KonyMain.getActivityContext(), null);
                a = new ScaleAnimation(0.7f, 1.0f, 0.7f, 1.0f, 2, 0.5f, 2, 0.5f);
                c0429v = new C0429v(-90, 0);
                animationSet.addAnimation(a);
                animationSet.addAnimation(c0429v);
                animationSet.setStartOffset(400);
                i2 = 400;
                a = animationSet;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_HASHTABLE /*13*/:
                a = C0288a.m1858a("grow_from_center");
                i2 = 400;
                break;
            default:
                a = null;
                i2 = 400;
                break;
        }
        if (a == null) {
            return C0288a.m1858a("still");
        }
        a.setDuration((long) i2);
        a.setInterpolator(new LinearInterpolator());
        return a;
    }

    public static Animation m1858a(String str) {
        int identifier = KonyMain.getAppContext().getResources().getIdentifier(str, "anim", KonyMain.getAppContext().getPackageName());
        return identifier > 0 ? AnimationUtils.loadAnimation(KonyMain.getAppContext(), identifier) : null;
    }

    public static AnimatorSet m1859b(String str) {
        int identifier = KonyMain.getAppContext().getResources().getIdentifier(str, "animator", KonyMain.getAppContext().getPackageName());
        return identifier > 0 ? (AnimatorSet) AnimatorInflater.loadAnimator(KonyMain.getAppContext(), identifier) : null;
    }
}
