package ny0k;

import android.content.Context;
import android.graphics.Typeface;
import com.konylabs.android.KonyMain;

public final class cG {
    private static final String f2234a;

    static {
        f2234a = KonyMain.getAppContext().getPackageName();
    }

    public static Float m2110a() {
        try {
            Context appContext = KonyMain.getAppContext();
            return Float.valueOf(appContext.getString(appContext.getResources().getIdentifier("font_size", "fonts", f2234a)));
        } catch (Exception e) {
            return Float.valueOf(14.0f);
        }
    }

    public static Typeface m2111b() {
        try {
            Context appContext = KonyMain.getAppContext();
            if (appContext.getString(appContext.getResources().getIdentifier("font_weight", "fonts", f2234a)).equalsIgnoreCase("bold")) {
                return Typeface.DEFAULT_BOLD;
            }
        } catch (Exception e) {
        }
        return Typeface.DEFAULT;
    }

    public static int m2112c() {
        try {
            Context appContext = KonyMain.getAppContext();
            int identifier = appContext.getResources().getIdentifier("font_style", "fonts", f2234a);
            if (appContext.getString(identifier).equalsIgnoreCase("italic")) {
                return m2111b() == Typeface.DEFAULT_BOLD ? 3 : 2;
            } else {
                if (appContext.getString(identifier).equalsIgnoreCase("underline")) {
                    return -1;
                }
                return 0;
            }
        } catch (Exception e) {
        }
    }

    public static boolean m2113d() {
        try {
            Context appContext = KonyMain.getAppContext();
            if (appContext.getString(appContext.getResources().getIdentifier("anti_aliasing", "fonts", f2234a)).equalsIgnoreCase("true")) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean m2114e() {
        try {
            Context appContext = KonyMain.getAppContext();
            if (appContext.getString(appContext.getResources().getIdentifier("enable_conn_pool", "net", f2234a)).equalsIgnoreCase("true")) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public static int m2115f() {
        try {
            Context appContext = KonyMain.getAppContext();
            int parseInt = Integer.parseInt(appContext.getString(appContext.getResources().getIdentifier("conn_total", "net", f2234a)));
            if (parseInt > 0) {
                return parseInt;
            }
        } catch (Exception e) {
        }
        return 20;
    }

    public static int m2116g() {
        try {
            Context appContext = KonyMain.getAppContext();
            int parseInt = Integer.parseInt(appContext.getString(appContext.getResources().getIdentifier("conn_per_route", "net", f2234a)));
            if (parseInt > 0) {
                return parseInt;
            }
        } catch (Exception e) {
        }
        return 10;
    }

    public static long m2117h() {
        try {
            Context appContext = KonyMain.getAppContext();
            long parseLong = Long.parseLong(appContext.getString(appContext.getResources().getIdentifier("min_time", "location", f2234a)));
            if (parseLong > 0) {
                return parseLong;
            }
        } catch (Exception e) {
        }
        return 60;
    }

    public static long m2118i() {
        try {
            Context appContext = KonyMain.getAppContext();
            long parseLong = Long.parseLong(appContext.getString(appContext.getResources().getIdentifier("min_distance", "location", f2234a)));
            if (parseLong > 0) {
                return parseLong;
            }
        } catch (Exception e) {
        }
        return 1;
    }

    public static long m2119j() {
        try {
            Context appContext = KonyMain.getAppContext();
            long parseLong = Long.parseLong(appContext.getString(appContext.getResources().getIdentifier("accuracy_within_time", "location", f2234a)));
            if (parseLong > 0) {
                return parseLong;
            }
        } catch (Exception e) {
        }
        return 15;
    }

    public static boolean m2120k() {
        try {
            Context appContext = KonyMain.getAppContext();
            if (appContext.getString(appContext.getResources().getIdentifier("enable_gzip", "net", f2234a)).equalsIgnoreCase("true")) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean m2121l() {
        try {
            Context appContext = KonyMain.getAppContext();
            if (appContext.getString(appContext.getResources().getIdentifier("expect_100_continue", "net", f2234a)).equalsIgnoreCase("true")) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public static float m2122m() {
        try {
            Context appContext = KonyMain.getAppContext();
            return Float.parseFloat(appContext.getString(appContext.getResources().getIdentifier("remote_images_lru_cache_size", "imagecache", f2234a)));
        } catch (Exception e) {
            return 12.5f;
        }
    }
}
