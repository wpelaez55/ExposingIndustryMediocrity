package com.konylabs.vm;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.konylabs.vm.p */
public final class C0414p extends BufferedWriter implements C0250o {
    private static C0250o f3159a;
    private static boolean f3160c;
    private C0248m f3161b;

    static {
        f3159a = null;
        f3160c = false;
    }

    private C0414p(String str) throws IOException {
        super(new FileWriter(new File(str), false));
        this.f3161b = null;
        this.f3161b = new C0248m();
    }

    public static C0250o m3380b(String str) {
        if (f3159a == null) {
            try {
                f3159a = new C0414p(str);
                Log.d("Profiler", "Profiler instance " + (f3159a != null ? "created" : "is null"));
            } catch (IOException e) {
                Log.d("Profiler", "execption while opening profiler output: " + e.toString());
            }
        }
        return f3159a;
    }

    private void m3381d() {
        write("(" + (this.f3161b.m1753b() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) + "/" + (this.f3161b.m1755c() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) + "kB)\n");
    }

    public final void m3382a() {
        write("\nSummary: ");
        m3381d();
        this.f3161b.m1757e();
        write("Summary: " + this.f3161b.m1759g() + "ms\n");
        HashMap a = this.f3161b.m1752a();
        if (a != null) {
            for (String str : a.keySet()) {
                C0249n c0249n = (C0249n) a.get(str);
                if (c0249n != null) {
                    write("Summary: " + str + "()" + " count:" + c0249n.f1875c + ", run:" + c0249n.f1874b + "ms" + ", cumulative:" + c0249n.f1873a + "ms\n");
                }
            }
            write("\n");
            this.f3161b.m1758f();
        }
        try {
            flush();
        } catch (IOException e) {
        }
    }

    public final void m3383a(String str) {
        this.f3161b.m1757e();
        write("(" + this.f3161b.m1756d() + ")" + "<< ");
        C0249n b = this.f3161b.m1754b(str);
        write(str);
        write(" (" + b.f1874b + "ms) ");
        m3381d();
        this.f3161b.m1758f();
    }

    public final void m3384a(String str, boolean z) {
        this.f3161b.m1757e();
        C0249n a = this.f3161b.m1751a(str);
        write("(" + this.f3161b.m1756d() + ")" + ">> ");
        write(str);
        write(" (" + (z ? "L" : "K") + ")");
        write(" (" + a.f1875c + ") ");
        m3381d();
        this.f3161b.m1758f();
    }

    public final void m3385b() {
        this.f3161b.m1757e();
    }

    public final void m3386c() {
        this.f3161b.m1758f();
    }

    public final void write(String str) {
        this.f3161b.m1757e();
        try {
            super.write(str);
            flush();
        } catch (IOException e) {
        }
        this.f3161b.m1758f();
    }
}
