package ny0k;

import java.util.ArrayList;
import java.util.Vector;

public final class cj {
    public ArrayList f2281a;
    private Vector f2282b;

    public cj(ArrayList arrayList, Vector vector) {
        this.f2281a = arrayList;
        this.f2282b = vector;
    }

    public final int m2167a(int i) {
        return (this.f2281a == null || this.f2281a.size() <= 0) ? -1 : ((bH) this.f2281a.get(i)).f2134c;
    }

    public final int m2168a(int i, int i2) {
        if (this.f2282b.isEmpty()) {
            return -1;
        }
        int size = this.f2282b.size();
        if (size == 1) {
            return i2;
        }
        if (i < 0 || i >= size || i2 < 0) {
            return -1;
        }
        bJ bJVar = (bJ) this.f2282b.get(i);
        return i2 >= bJVar.g.size() ? -1 : (bJVar.f3319a.f2133b + i2) - i;
    }

    public final int m2169a(int i, boolean z) {
        int size = this.f2281a.size();
        if (this.f2282b.isEmpty() || i >= size) {
            return -1;
        }
        if (this.f2282b.size() == 1) {
            return z ? i + 1 : i;
        } else {
            int abs;
            bH bHVar = (bH) this.f2281a.get(i);
            int i2 = i + (bHVar.f2134c + 1);
            if (i2 < size) {
                bH bHVar2 = (bH) this.f2281a.get(i2);
                if (bHVar2.f2134c != bHVar.f2134c) {
                    abs = i2 + Math.abs(bHVar2.f2134c - bHVar.f2134c);
                    bHVar = (bH) this.f2281a.get(abs);
                } else {
                    bHVar = bHVar2;
                    abs = i2;
                }
                while (bHVar.f2135d == -1) {
                    abs++;
                    if (abs >= size) {
                        abs = -1;
                        break;
                    }
                    bHVar = (bH) this.f2281a.get(abs);
                }
            } else {
                abs = i2;
            }
            return abs;
        }
    }

    public final int[] m2170a(int i, int[] iArr, boolean z) {
        int a = m2169a(i, z);
        if (a == -1) {
            return null;
        }
        if (iArr == null) {
            iArr = new int[2];
        }
        bH bHVar = (bH) this.f2281a.get(a);
        iArr[0] = bHVar.f2134c;
        iArr[1] = bHVar.f2135d;
        return iArr;
    }

    public final int m2171b(int i, int i2) {
        if (this.f2282b.isEmpty()) {
            return -1;
        }
        int size = this.f2282b.size();
        if (size == 1) {
            return i2;
        }
        if (i < 0 || i >= size || i2 < 0) {
            return -1;
        }
        bJ bJVar = (bJ) this.f2282b.get(i);
        return i2 >= bJVar.g.size() ? -1 : i2 + (bJVar.f3319a.f2133b + 1);
    }
}
