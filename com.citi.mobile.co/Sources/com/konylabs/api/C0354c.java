package com.konylabs.api;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.libintf.Library;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.File;
import ny0k.cq;

/* renamed from: com.konylabs.api.c */
public final class C0354c implements Library {
    private static String[] f2411a;

    static {
        f2411a = new String[]{"releaserawbytes"};
    }

    public final Object[] execute(int i, Object[] objArr) {
        switch (i) {
            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_INT /*0*/:
                if (!(objArr == null || objArr.length == 0 || objArr[0] == LuaNil.nil)) {
                    if (objArr[0] instanceof String) {
                        Uri parse = Uri.parse(objArr[0].toString());
                        if ("file".equals(parse.getScheme())) {
                            File cacheDir = KonyMain.getAppContext().getCacheDir();
                            File file = new File(cacheDir, parse.getLastPathSegment());
                            if (file.exists() && file.delete()) {
                                String lastPathSegment = parse.getLastPathSegment();
                                int indexOf = lastPathSegment.indexOf(".");
                                file = new File(cacheDir, lastPathSegment.substring(0, indexOf) + "Thumb" + lastPathSegment.substring(indexOf, lastPathSegment.length()));
                                if (file.exists()) {
                                    file.delete();
                                }
                            }
                        } else if ("content".equals(parse.getScheme())) {
                            KonyMain.getAppContext().getContentResolver().delete(Uri.withAppendedPath(Media.EXTERNAL_CONTENT_URI, BuildConfig.FLAVOR + ContentUris.parseId(parse)), null, null);
                        }
                    } else if (objArr[0] instanceof cq) {
                        ((cq) objArr[0]).m2198b();
                    }
                }
                return null;
            default:
                throw new LuaError("kony.camera name space has no such smethod", 108);
        }
    }

    public final String[] getMethods() {
        return f2411a;
    }

    public final String getNameSpace() {
        return "camera";
    }
}
