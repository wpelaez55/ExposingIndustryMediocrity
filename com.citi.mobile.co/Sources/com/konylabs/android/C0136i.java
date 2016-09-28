package com.konylabs.android;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.konylabs.android.i */
final class C0136i implements FileFilter {
    C0136i(C0135h c0135h) {
    }

    public final boolean accept(File file) {
        return file.getName().endsWith(".prop") || file.isDirectory();
    }
}
