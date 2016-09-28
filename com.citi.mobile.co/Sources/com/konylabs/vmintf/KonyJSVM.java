package com.konylabs.vmintf;

import com.konylabs.js.api.KonyJSObject;
import com.konylabs.libintf.Library;

public class KonyJSVM {
    public static native void InstallRuntimeConstants(long j, Object[] objArr, Object[] objArr2);

    public static native KonyJSObject createJSObject(long j, String str, Object[] objArr);

    public static KonyJSObject createJSObject(String str, Object[] objArr) {
        return createJSObject(KonyJavaScriptVM.m3392c(), str, objArr);
    }

    public static native long createPersistent(long j);

    public static native void displayHeapStatistics();

    public static native void disposeContext(long j, Library[] libraryArr);

    public static native void disposePersistent(long j);

    public static native void disposeWorkerVM();

    public static native Object getProperty(long j, String str);

    public static native void setProperty(long j, Object obj, Object obj2);
}
