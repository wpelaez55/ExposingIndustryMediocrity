package com.konylabs.api.ui;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import android.util.Log;
import com.konylabs.android.KonyMain;

final class dC extends LruCache {
    public dC(int i) {
        super(i);
    }

    protected final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Bitmap bitmap = (Bitmap) obj2;
        Bitmap bitmap2 = (Bitmap) obj3;
        if (z && KonyMain.f3657e) {
            Log.d("KonySkin", "Entry removed from cache: " + str + " Old value: " + bitmap + " New value: " + bitmap2);
        }
    }

    protected final /* synthetic */ int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        return KonyMain.f3656d >= 19 ? bitmap.getAllocationByteCount() : KonyMain.f3656d >= 12 ? bitmap.getByteCount() : bitmap.getRowBytes() * bitmap.getHeight();
    }
}
