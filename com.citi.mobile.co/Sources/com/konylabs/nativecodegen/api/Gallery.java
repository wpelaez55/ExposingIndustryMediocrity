package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0349R;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Gallery {
    private static Library f1710a;
    private static HashMap f1711b;

    private Gallery() {
    }

    static void m1627a() {
        if (f1710a == null) {
            Library g = C0349R.m2288g();
            f1710a = g;
            f1711b = cr.m2202a(g);
        }
    }

    public static void addAll(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("GalleryNative", "Executing ImageGallery.addAll()");
        }
        f1710a.execute(((Integer) f1711b.get("addall")).intValue(), objArr);
    }

    public static void removeAll(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("GalleryNative", "Executing ImageGallery.removeAll()");
        }
        f1710a.execute(((Integer) f1711b.get("removeall")).intValue(), objArr);
    }

    public static void removeAt(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("GalleryNative", "Executing ImageGallery.removeAt()");
        }
        f1710a.execute(((Integer) f1711b.get("removeat")).intValue(), objArr);
    }

    public static void setData(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("GalleryNative", "Executing ImageGallery.setData()");
        }
        f1710a.execute(((Integer) f1711b.get("setdata")).intValue(), objArr);
    }

    public static void setDataAt(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("GalleryNative", "Executing ImageGallery.setDataAt()");
        }
        f1710a.execute(((Integer) f1711b.get("setdataat")).intValue(), objArr);
    }
}
