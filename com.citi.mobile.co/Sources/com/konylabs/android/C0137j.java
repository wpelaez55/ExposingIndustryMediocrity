package com.konylabs.android;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.konylabs.android.j */
final class C0137j implements FileFilter {
    C0137j(C0135h c0135h) {
    }

    public final boolean accept(File file) {
        return file.getName().endsWith(".tmp") || file.isDirectory();
    }
}
