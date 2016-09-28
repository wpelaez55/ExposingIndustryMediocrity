package com.konylabs.android;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.konylabs.android.k */
final class C0138k implements FileFilter {
    C0138k(C0135h c0135h) {
    }

    public final boolean accept(File file) {
        return file.getName().endsWith(".tmp") || file.isDirectory();
    }
}
