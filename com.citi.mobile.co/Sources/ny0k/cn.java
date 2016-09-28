package ny0k;

import android.support.v4.media.TransportMediator;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class cn {
    private static final byte[] f2289a;
    private static final byte[] f2290b;
    private static final byte[] f2291c;
    private static final byte[] f2292d;
    private static final byte[] f2293e;
    private static final byte[] f2294f;

    static {
        f2289a = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 43, (byte) 47};
        f2290b = new byte[]{(byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -5, (byte) -5, (byte) -9, (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 62, (byte) -9, (byte) -9, (byte) -9, (byte) 63, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) -9, (byte) -9, (byte) -9, (byte) -1, (byte) -9, (byte) -9, (byte) -9, (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) -9, (byte) -9, (byte) -9, (byte) -9};
        f2291c = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 45, (byte) 95};
        f2292d = new byte[]{(byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -5, (byte) -5, (byte) -9, (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 62, (byte) -9, (byte) -9, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) -9, (byte) -9, (byte) -9, (byte) -1, (byte) -9, (byte) -9, (byte) -9, (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 63, (byte) -9, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) -9, (byte) -9, (byte) -9, (byte) -9};
        f2293e = new byte[]{(byte) 45, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 95, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122};
        f2294f = new byte[]{(byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -5, (byte) -5, (byte) -9, (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -5, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 0, (byte) -9, (byte) -9, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) -9, (byte) -9, (byte) -9, (byte) -1, (byte) -9, (byte) -9, (byte) -9, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) -9, (byte) -9, (byte) -9, (byte) -9, (byte) 37, (byte) -9, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) 62, (byte) 63, (byte) -9, (byte) -9, (byte) -9, (byte) -9};
    }

    private cn() {
    }

    public static String m2175a(byte[] bArr) {
        String str = null;
        try {
            str = m2176a(bArr, 0, bArr.length, 0);
        } catch (IOException e) {
            if (KonyMain.f3657e) {
                Log.d("Base64", BuildConfig.FLAVOR + e.getMessage());
            }
        }
        return str;
    }

    private static String m2176a(byte[] bArr, int i, int i2, int i3) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i2);
        } else if (0 + i2 > bArr.length) {
            throw new IllegalArgumentException("Cannot have offset of %d and length of %d with array of length %d");
        } else {
            byte[] bArr2 = new byte[((i2 % 3 > 0 ? 4 : 0) + ((i2 / 3) * 4))];
            int i4 = i2 - 2;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i7 < i4) {
                m2180a(bArr, i7 + 0, 3, bArr2, i6, 0);
                i6 += 4;
                i5 += 4;
                i7 += 3;
            }
            if (i7 < i2) {
                m2180a(bArr, i7 + 0, i2 - i7, bArr2, i6, 0);
                i6 += 4;
            }
            if (i6 < bArr2.length - 1) {
                Object obj = new byte[i6];
                System.arraycopy(bArr2, 0, obj, 0, i6);
                bArr2 = obj;
            }
            try {
                return new String(bArr2, "US-ASCII");
            } catch (UnsupportedEncodingException e) {
                return new String(bArr2);
            }
        }
    }

    private static final byte[] m2177a(int i) {
        return (i & 16) == 16 ? f2292d : (i & 32) == 32 ? f2294f : f2290b;
    }

    public static byte[] m2178a(String str) throws IOException {
        return m2179a(str, 0);
    }

    private static byte[] m2179a(String str, int i) throws IOException {
        if (str == null) {
            throw new NullPointerException("Input string was null.");
        }
        byte[] bytes;
        try {
            bytes = str.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e) {
            bytes = str.getBytes();
        }
        return m2181b(bytes, 0, bytes.length, 0);
    }

    private static byte[] m2180a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5 = 0;
        byte[] bArr3 = (i4 & 16) == 16 ? f2291c : (i4 & 32) == 32 ? f2293e : f2289a;
        int i6 = (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0);
        if (i2 > 2) {
            i5 = (bArr[i + 2] << 24) >>> 24;
        }
        i5 |= i6;
        switch (i2) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                bArr2[i3] = bArr3[i5 >>> 18];
                bArr2[i3 + 1] = bArr3[(i5 >>> 12) & 63];
                bArr2[i3 + 2] = (byte) 61;
                bArr2[i3 + 3] = (byte) 61;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                bArr2[i3] = bArr3[i5 >>> 18];
                bArr2[i3 + 1] = bArr3[(i5 >>> 12) & 63];
                bArr2[i3 + 2] = bArr3[(i5 >>> 6) & 63];
                bArr2[i3 + 3] = (byte) 61;
                break;
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                bArr2[i3] = bArr3[i5 >>> 18];
                bArr2[i3 + 1] = bArr3[(i5 >>> 12) & 63];
                bArr2[i3 + 2] = bArr3[(i5 >>> 6) & 63];
                bArr2[i3 + 3] = bArr3[i5 & 63];
                break;
        }
        return bArr2;
    }

    private static byte[] m2181b(byte[] bArr, int i, int i2, int i3) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Cannot decode null source array.");
        } else if (i2 + 0 > bArr.length) {
            throw new IllegalArgumentException("Source array with length %d cannot have offset of %d and process %d bytes.");
        } else if (i2 == 0) {
            return new byte[0];
        } else {
            if (i2 < 4) {
                throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i2);
            }
            byte[] a = m2177a(i3);
            Object obj = new byte[((i2 * 3) / 4)];
            int i4 = 0;
            byte[] bArr2 = new byte[4];
            int i5 = 0;
            int i6 = 0;
            while (i6 < i2 + 0) {
                byte b = (byte) (bArr[i6] & TransportMediator.KEYCODE_MEDIA_PAUSE);
                byte b2 = a[b];
                if (b2 >= -5) {
                    int i7;
                    if (b2 >= -1) {
                        i7 = i5 + 1;
                        bArr2[i5] = b;
                        if (i7 <= 3) {
                            i5 = i4;
                        } else if (bArr2 == null) {
                            throw new NullPointerException("Source array was null.");
                        } else if (obj == null) {
                            throw new NullPointerException("Destination array was null.");
                        } else if (3 >= bArr2.length) {
                            throw new IllegalArgumentException("Source array with length %d cannot have offset of %d and still process four bytes.");
                        } else if (i4 < 0 || i4 + 2 >= obj.length) {
                            throw new IllegalArgumentException("Destination array with length %d cannot have offset of %d and still store three bytes.");
                        } else {
                            byte[] a2 = m2177a(i3);
                            if (bArr2[2] == 61) {
                                obj[i4] = (byte) ((((a2[bArr2[1]] & MotionEventCompat.ACTION_MASK) << 12) | ((a2[bArr2[0]] & MotionEventCompat.ACTION_MASK) << 18)) >>> 16);
                                i7 = 1;
                            } else if (bArr2[3] == 61) {
                                i7 = ((a2[bArr2[2]] & MotionEventCompat.ACTION_MASK) << 6) | (((a2[bArr2[0]] & MotionEventCompat.ACTION_MASK) << 18) | ((a2[bArr2[1]] & MotionEventCompat.ACTION_MASK) << 12));
                                obj[i4] = (byte) (i7 >>> 16);
                                obj[i4 + 1] = (byte) (i7 >>> 8);
                                i7 = 2;
                            } else {
                                i7 = (a2[bArr2[3]] & MotionEventCompat.ACTION_MASK) | ((((a2[bArr2[0]] & MotionEventCompat.ACTION_MASK) << 18) | ((a2[bArr2[1]] & MotionEventCompat.ACTION_MASK) << 12)) | ((a2[bArr2[2]] & MotionEventCompat.ACTION_MASK) << 6));
                                obj[i4] = (byte) (i7 >> 16);
                                obj[i4 + 1] = (byte) (i7 >> 8);
                                obj[i4 + 2] = (byte) i7;
                                i7 = 3;
                            }
                            i5 = i4 + i7;
                            i7 = 0;
                            if (b == 61) {
                                break;
                            }
                        }
                    } else {
                        i7 = i5;
                        i5 = i4;
                    }
                    i6++;
                    i4 = i5;
                    i5 = i7;
                } else {
                    throw new IOException("Bad Base64 input character '%c' in array position %d");
                }
            }
            i5 = i4;
            Object obj2 = new byte[i5];
            System.arraycopy(obj, 0, obj2, 0, i5);
            return obj2;
        }
    }
}
