package com.konylabs.api.ui;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

public final class ez {
    public static boolean f1333a;

    static {
        f1333a = false;
    }

    public static int m1343a(int i, int[] iArr) {
        return (f1333a || iArr == null) ? i : i - (iArr[1] + iArr[3]);
    }

    public static void m1344a(int[] iArr, View view, MarginLayoutParams marginLayoutParams) {
        if (f1333a) {
            if (view != null) {
                view.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
        } else if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
    }
}
