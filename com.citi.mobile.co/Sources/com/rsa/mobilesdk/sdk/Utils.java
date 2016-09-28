package com.rsa.mobilesdk.sdk;

import android.support.v4.view.MotionEventCompat;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.TimeZone;

class Utils {
    private static final String SECURE_RANDOM_ALG = "SHA1PRNG";
    private static DecimalFormat mDecimalFormat;

    Utils() {
    }

    static {
        mDecimalFormat = getLocationFormat();
    }

    public static synchronized String getDoubleString(double d) {
        String format;
        synchronized (Utils.class) {
            format = mDecimalFormat.format(d);
        }
        return format;
    }

    private static DecimalFormat getLocationFormat() {
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.US);
        dfs.setDecimalSeparator('.');
        dfs.setMinusSign('-');
        return new DecimalFormat("###.########;-###", dfs);
    }

    static String covertDateToISO8601(Date date) {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        df.setTimeZone(tz);
        return df.format(date);
    }

    public static int getIntProperty(Properties properties, String propertyKey, int defaulrPropertyValue) {
        int value = defaulrPropertyValue;
        if (properties == null) {
            return value;
        }
        Object propertyValue = properties.get(propertyKey);
        if (propertyValue instanceof String) {
            String stringPropertyValue = (String) properties.get(propertyKey);
            if (propertyValue != null) {
                try {
                    value = Integer.parseInt(stringPropertyValue);
                } catch (NumberFormatException e) {
                }
            }
        }
        return value;
    }

    public static boolean getBooleanProperty(Properties properties, String propertyKey, boolean defaultValue) {
        boolean z = true;
        if (properties == null) {
            return defaultValue;
        }
        int defaultInt;
        if (defaultValue) {
            defaultInt = 1;
        } else {
            defaultInt = 0;
        }
        if (getIntProperty(properties, propertyKey, defaultInt) == 0) {
            z = false;
        }
        return z;
    }

    public static String getStringVal(String val) {
        return val != null ? val : "unavailable";
    }

    public static String byteArrayToHexString(byte[] byteArray) {
        StringBuffer strBuffer = new StringBuffer(byteArrayLen * 2);
        for (byte b : byteArray) {
            int value = b & MotionEventCompat.ACTION_MASK;
            if (value < 16) {
                strBuffer.append('0');
            }
            strBuffer.append(Integer.toHexString(value));
        }
        return strBuffer.toString().toUpperCase();
    }

    public static boolean getSecureRandomBytes(byte[] secureBytesArray) {
        if (!(secureBytesArray == null || secureBytesArray.length == 0)) {
            try {
                SecureRandom.getInstance(SECURE_RANDOM_ALG).nextBytes(secureBytesArray);
                return true;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return false;
    }
}
