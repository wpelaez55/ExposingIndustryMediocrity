package com.konylabs.nativecodegen.api;

import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.C0340G;
import com.konylabs.libintf.Library;
import java.util.HashMap;
import ny0k.cr;

public class Streaming {
    private static Library f1748a;
    private static HashMap f1749b;

    public static Double deregisterDataStream(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StreamingLibNative", "Executing Streaming.deregisterDataStream()");
        }
        return (Double) f1748a.execute(((Integer) f1749b.get("deregisterdatastream")).intValue(), objArr)[0];
    }

    public static void initialize() {
        if (f1748a == null) {
            Library c0340g = new C0340G();
            f1748a = c0340g;
            f1749b = cr.m2202a(c0340g);
        }
    }

    public static Object registerDataStream(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StreamingLibNative", "Executing Streaming.registerDataStream()");
        }
        Object[] execute = f1748a.execute(((Integer) f1749b.get("registerdatastream")).intValue(), objArr);
        return execute != null ? execute[0] : null;
    }

    public static Object registerForDataStream(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StreamingLibNative", "Executing Streaming.registerForDataStream()");
        }
        Object[] execute = f1748a.execute(((Integer) f1749b.get("registerfordatastream")).intValue(), objArr);
        return execute != null ? execute[0] : null;
    }

    public static Double setCallback(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StreamingLibNative", "Executing Streaming.setCallback()");
        }
        Object[] execute = f1748a.execute(((Integer) f1749b.get("setcallback")).intValue(), objArr);
        return execute != null ? (Double) execute[0] : null;
    }

    public static Double unregisterDataStream(Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("StreamingLibNative", "Executing Streaming.unregisterDataStream()");
        }
        return (Double) f1748a.execute(((Integer) f1749b.get("unregisterdatastream")).intValue(), objArr)[0];
    }
}
