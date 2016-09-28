package ny0k;

public final class aZ {
    private static final String[] f2036a;
    private static final String[] f2037b;

    static {
        r0 = new String[10];
        f2036a = r0;
        f2037b = new String[]{"January", "February ", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }

    public static int m1941a(int i, int i2) {
        int i3 = -1;
        if (i2 == 2) {
            i3 = i + 2;
            if (i3 > 7) {
                i3 = 1;
            }
        }
        return i2 == 1 ? i + 1 : i3;
    }

    public static String m1942a(int i) {
        return f2036a[i];
    }

    public static String m1943b(int i) {
        return f2037b[i];
    }
}
