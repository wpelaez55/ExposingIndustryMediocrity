package ny0k;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Locale;

final class cL extends PrintStream {
    public cL(OutputStream outputStream) {
        super(outputStream);
    }

    public final PrintStream append(char c) {
        return this;
    }

    public final PrintStream append(CharSequence charSequence) {
        return this;
    }

    public final PrintStream append(CharSequence charSequence, int i, int i2) {
        return this;
    }

    public final void print(char c) {
    }

    public final void print(double d) {
    }

    public final void print(float f) {
    }

    public final void print(int i) {
    }

    public final void print(long j) {
    }

    public final void print(Object obj) {
    }

    public final synchronized void print(String str) {
    }

    public final void print(boolean z) {
    }

    public final void print(char[] cArr) {
    }

    public final PrintStream printf(String str, Object... objArr) {
        return this;
    }

    public final PrintStream printf(Locale locale, String str, Object... objArr) {
        return this;
    }

    public final void println() {
    }

    public final void println(char c) {
    }

    public final void println(double d) {
    }

    public final void println(float f) {
    }

    public final void println(int i) {
    }

    public final void println(long j) {
    }

    public final void println(Object obj) {
    }

    public final synchronized void println(String str) {
    }

    public final void println(boolean z) {
    }

    public final void println(char[] cArr) {
    }

    public final synchronized void write(int i) {
    }

    public final void write(byte[] bArr) throws IOException {
    }

    public final void write(byte[] bArr, int i, int i2) {
    }
}
