package ny0k;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import com.konylabs.api.ui.KonyCustomWidget;

public final class cM {
    private int f2255a;
    private int f2256b;
    private int f2257c;
    private int[] f2258d;
    private float[] f2259e;

    private cM(int i, int i2, int[] iArr, float[] fArr) {
        this.f2256b = -1;
        this.f2257c = -1;
        this.f2256b = i2 % 90 == 0 ? i2 % 360 : -1;
        if (this.f2256b == -1) {
            this.f2257c = i2 % 360;
        }
        this.f2258d = iArr;
        this.f2259e = fArr;
        this.f2255a = i;
    }

    public static cM m2135a(int i) {
        return new cM(4000, -1, new int[]{i, i}, null);
    }

    public static cM m2136a(int i, int i2) {
        return new cM(2000, -1, new int[]{i, i2}, new float[]{0.5f, 0.5f});
    }

    public static cM m2137a(int i, int[] iArr, float[] fArr) {
        return new cM(1000, i, iArr, fArr);
    }

    public final Shader m2138a(float f, float f2) {
        if (this.f2255a == 4000) {
            return new LinearGradient(0.0f, f2 / 2.0f, f, f2 / 2.0f, this.f2258d[0], this.f2258d[1], TileMode.CLAMP);
        } else if (this.f2255a == 1000) {
            if (this.f2256b != -1) {
                switch (this.f2256b) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                        return new LinearGradient(f / 2.0f, f2, f / 2.0f, 0.0f, this.f2258d, this.f2259e, TileMode.CLAMP);
                    case 90:
                        return new LinearGradient(0.0f, f2 / 2.0f, f, f2 / 2.0f, this.f2258d, this.f2259e, TileMode.CLAMP);
                    case 180:
                        return new LinearGradient(f / 2.0f, 0.0f, f / 2.0f, f2, this.f2258d, this.f2259e, TileMode.CLAMP);
                    case 270:
                        return new LinearGradient(f, f2 / 2.0f, 0.0f, f2 / 2.0f, this.f2258d, this.f2259e, TileMode.CLAMP);
                    default:
                        return null;
                }
            } else if (this.f2257c == -1) {
                return null;
            } else {
                float f3;
                float f4;
                float f5;
                double d;
                float f6;
                float f7;
                float f8;
                int i = this.f2257c / 90;
                double d2 = (double) (this.f2257c % 90);
                double toRadians = Math.toRadians(d2);
                double toRadians2 = Math.toRadians(90.0d - d2);
                float f9 = f / 2.0f;
                float f10 = f2 / 2.0f;
                float abs = (float) Math.abs(((double) f10) * Math.tan(toRadians));
                float abs2 = (float) Math.abs(((double) f9) * Math.tan(toRadians2));
                float abs3 = (float) Math.abs(Math.tan(toRadians2) * ((double) f10));
                float abs4 = (float) Math.abs(Math.tan(toRadians) * ((double) f9));
                double toDegrees;
                float f11;
                switch (i) {
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                        toDegrees = Math.toDegrees(Math.atan2((double) f, (double) f2));
                        if (d2 < toDegrees) {
                            f3 = f9 - abs;
                            f4 = f9 + abs;
                            f5 = 0.0f;
                        } else if (d2 > toDegrees) {
                            f2 = f10 + abs2;
                            f5 = f10 - abs2;
                            f3 = 0.0f;
                            f4 = f;
                        } else {
                            f5 = 0.0f;
                            f3 = 0.0f;
                            f4 = f;
                        }
                        d = toDegrees;
                        f6 = f3;
                        f3 = f2;
                        f2 = 0.0f;
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                        toDegrees = Math.toDegrees(Math.atan2((double) f2, (double) f));
                        if (d2 < toDegrees) {
                            f4 = f10 - abs4;
                            f5 = f10 + abs4;
                            f7 = 0.0f;
                            f3 = f;
                        } else if (d2 > toDegrees) {
                            f7 = f9 - abs3;
                            f3 = f9 + abs3;
                            f4 = 0.0f;
                            f5 = f2;
                        } else {
                            f3 = f;
                            f7 = 0.0f;
                            f4 = 0.0f;
                            f5 = f2;
                        }
                        d = toDegrees;
                        f6 = f7;
                        f11 = f3;
                        f3 = f4;
                        f4 = f11;
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                        toDegrees = Math.toDegrees(Math.atan2((double) f, (double) f2));
                        if (d2 < toDegrees) {
                            f = f9 + abs;
                            f3 = f9 - abs;
                            f4 = 0.0f;
                            f5 = f2;
                        } else if (d2 > toDegrees) {
                            f4 = f10 - abs2;
                            f3 = 0.0f;
                            f5 = f10 + abs2;
                        } else {
                            f3 = 0.0f;
                            f4 = 0.0f;
                            f5 = f2;
                        }
                        d = toDegrees;
                        f6 = f;
                        f = 0.0f;
                        f11 = f3;
                        f3 = f4;
                        f4 = f11;
                        break;
                    case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                        toDegrees = Math.toDegrees(Math.atan2((double) f2, (double) f));
                        if (d2 < toDegrees) {
                            f2 = f10 + abs4;
                            f4 = 0.0f;
                            f5 = f10 - abs4;
                        } else if (d2 > toDegrees) {
                            f = f9 + abs3;
                            f4 = f9 - abs3;
                            f5 = 0.0f;
                        } else {
                            f4 = 0.0f;
                            f5 = 0.0f;
                        }
                        d = toDegrees;
                        f6 = f;
                        f = 0.0f;
                        f11 = f2;
                        f2 = 0.0f;
                        f3 = f11;
                        break;
                    default:
                        f2 = 0.0f;
                        f = 0.0f;
                        f5 = 0.0f;
                        f4 = 0.0f;
                        f6 = 0.0f;
                        d = 0.0d;
                        f3 = 0.0f;
                        break;
                }
                if (d2 != d) {
                    f8 = (f5 - f3) / (f4 - f6);
                    f7 = ((((f8 * f8) * f4) + f) + ((f2 - f5) * f8)) / ((f8 * f8) + 1.0f);
                    f8 = (f8 * (f7 - f4)) + f5;
                    f4 = Math.abs(f7 - f4);
                    f5 = Math.abs(f8 - f5);
                    switch (i) {
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                            f4 = f6 - f4;
                            f3 += f5;
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                            f4 = f6 - f4;
                            f3 -= f5;
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                            f4 += f6;
                            f3 -= f5;
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                            f4 += f6;
                            f3 += f5;
                            break;
                        default:
                            f4 = f6;
                            break;
                    }
                }
                f8 = f5;
                f7 = f4;
                f4 = f6;
                return new LinearGradient(f4, f3, f7, f8, this.f2258d, this.f2259e, TileMode.CLAMP);
            }
        } else if (this.f2255a == 2000) {
            return new LinearGradient(f / 2.0f, 0.0f, f / 2.0f, f2, this.f2258d, this.f2259e, TileMode.CLAMP);
        } else if (this.f2255a != 3000) {
            return null;
        } else {
            return new LinearGradient(0.0f, f2 / 2.0f, f, f2 / 2.0f, this.f2258d, this.f2259e, TileMode.CLAMP);
        }
    }
}
