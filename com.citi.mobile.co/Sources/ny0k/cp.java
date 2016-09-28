package ny0k;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract.Calendars;
import android.provider.CalendarContract.Events;
import android.provider.CalendarContract.Reminders;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.KonyCustomWidget;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public final class cp {
    private static String f2303a;

    static {
        f2303a = "CalendarAPI";
    }

    private static String m2189a() {
        return m2191a(KonyMain.getAppContext().getApplicationInfo().packageName, "LOCAL");
    }

    private static String m2190a(Long l) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(l.longValue());
        int i = instance.get(5);
        int i2 = instance.get(2) + 1;
        int i3 = instance.get(1);
        int i4 = instance.get(11);
        int i5 = instance.get(12);
        return BuildConfig.FLAVOR + i + '/' + i2 + '/' + i3 + ' ' + i4 + ':' + i5 + ':' + instance.get(13);
    }

    private static String m2191a(String str, String str2) {
        Cursor query = KonyMain.getAppContext().getContentResolver().query(Calendars.CONTENT_URI, new String[]{"_id"}, "((account_name = ? )AND + (account_type= ? ))", new String[]{str, str2}, null);
        return (query == null || !query.moveToFirst() || query.getCount() <= 0) ? null : query.getString(query.getColumnIndex("_id"));
    }

    private static String m2192a(Calendar calendar) {
        int i = calendar.get(5);
        int i2 = calendar.get(2) + 1;
        int i3 = calendar.get(1);
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        return " date = " + i + " month = " + i2 + " year = " + i3 + " hour =" + i4 + " min = " + i5 + " sec = " + calendar.get(13);
    }

    private static Calendar m2193a(String str, String str2, Boolean bool) {
        Calendar instance;
        SimpleDateFormat simpleDateFormat;
        try {
            if (KonyMain.f3657e) {
                Log.d(f2303a, "string to parse Date And Time =" + str);
            }
            simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.US);
            simpleDateFormat.setLenient(false);
            instance = Calendar.getInstance();
            instance.setTime(simpleDateFormat.parse(str));
            return instance;
        } catch (ParseException e) {
            if (KonyMain.f3657e) {
                Log.d(f2303a, e.getMessage());
            }
            if (str.trim().length() <= 10) {
                try {
                    if (KonyMain.f3657e) {
                        Log.d(f2303a, "string to parse Date =" + str);
                    }
                    simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
                    simpleDateFormat.setLenient(false);
                    instance = Calendar.getInstance();
                    instance.setTime(simpleDateFormat.parse(str));
                    if (!bool.booleanValue()) {
                        return instance;
                    }
                    instance.set(11, 23);
                    instance.set(12, 59);
                    instance.set(13, 59);
                    return instance;
                } catch (ParseException e2) {
                    if (KonyMain.f3657e) {
                        Log.d(f2303a, e2.getMessage());
                    }
                    throw new LuaError(100, "Error", "Invalid argument " + str2 + " for addCalendarEvent()/findCalendarEvents()");
                }
            }
            throw new LuaError(100, "Error", "Invalid argument " + str2 + " for addCalendarEvent()/findCalendarEvents()");
        }
    }

    public static void m2194a(Object[] objArr) {
        if (KonyMain.f3656d < 14) {
            Log.d(f2303a, "addCalendarEvent API is not supported for Android version < 14");
        } else if (objArr.length <= 0 || !(objArr[0] instanceof LuaTable)) {
            throw new LuaError(101, "Error", "Invalid number of arguments for kony.phone.addCalendarEvent()");
        } else {
            String a;
            LuaTable luaTable = (LuaTable) objArr[0];
            try {
                Context appContext = KonyMain.getAppContext();
                ApplicationInfo applicationInfo = appContext.getApplicationInfo();
                String str = applicationInfo.packageName;
                String string = appContext.getString(applicationInfo.labelRes);
                String str2 = "Local Account";
                a = m2191a(str, "LOCAL");
                if (a == null) {
                    Uri build = Calendars.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", str).appendQueryParameter("account_type", "LOCAL").build();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("account_name", str);
                    contentValues.put("account_type", "LOCAL");
                    contentValues.put("name", str);
                    contentValues.put("calendar_displayName", string);
                    contentValues.put("calendar_access_level", Integer.valueOf(700));
                    contentValues.put("ownerAccount", str2);
                    contentValues.put("visible", Integer.valueOf(1));
                    contentValues.put("sync_events", Integer.valueOf(0));
                    contentValues.put("calendar_color", Integer.valueOf(8679679));
                    KonyMain.getAppContext().getContentResolver().insert(build, contentValues);
                    if (KonyMain.f3657e) {
                        Log.d(f2303a, "Local Calendar Account created ACCOUNT_NAME = " + str + " Display Name =" + string);
                    }
                    a = m2191a(str, "LOCAL");
                    if (KonyMain.f3657e) {
                        Log.d(f2303a, "Created Local calendar account CalID = " + a);
                    }
                } else if (KonyMain.f3657e) {
                    Log.d(f2303a, "Using existing Local calendar account CalID = " + a);
                }
            } catch (Exception e) {
                Log.d(f2303a, "Exception creating calendar Account");
                e.printStackTrace();
                a = null;
            }
            if (a == null) {
                Log.d(f2303a, "Unable to add calendar event");
            }
            String id = TimeZone.getDefault().getID();
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("calendar_id", a);
            contentValues2.put("eventTimezone", id);
            Object table = luaTable.getTable("start");
            Object table2 = luaTable.getTable("finish");
            LuaNil table3 = luaTable.getTable("summary");
            LuaNil table4 = luaTable.getTable(NotificationCompatApi21.CATEGORY_ALARM);
            LuaNil table5 = luaTable.getTable("note");
            LuaNil table6 = luaTable.getTable("access");
            if (KonyMain.f3657e) {
                Log.d(f2303a, "addCalendarEvent called with args = " + luaTable);
            }
            if (table instanceof String) {
                Calendar a2 = m2193a(table.toString(), "start", Boolean.valueOf(false));
                Calendar instance = Calendar.getInstance();
                if (KonyMain.f3657e) {
                    Log.d(f2303a, "Cal Now = " + m2192a(instance));
                    Log.d(f2303a, "Cal start = " + m2192a(a2));
                }
                if (a2.compareTo(instance) < 0) {
                    throw new LuaError(100, "Error", "Start time cannot be in the past for kony.phone.addCalendarEvent()");
                }
                contentValues2.put("dtstart", Long.valueOf(a2.getTimeInMillis()));
                if (table2 instanceof String) {
                    instance = m2193a((String) table2, "finish", Boolean.valueOf(true));
                    if (KonyMain.f3657e) {
                        Log.d(f2303a, "Cal finish = " + m2192a(instance));
                    }
                    if (instance.compareTo(a2) < 0) {
                        throw new LuaError(100, "Error", "End time should be after the Start time for kony.phone.addCalendarEvent()");
                    }
                    int i;
                    int parseDouble;
                    contentValues2.put("dtend", Long.valueOf(instance.getTimeInMillis()));
                    if (table3 == null || table3 == LuaNil.nil) {
                        contentValues2.put("title", BuildConfig.FLAVOR);
                    } else {
                        contentValues2.put("title", table3.toString());
                    }
                    if (table4 == null || table4 == LuaNil.nil) {
                        i = -1;
                    } else {
                        try {
                            parseDouble = (int) Double.parseDouble(table4.toString());
                            if (parseDouble < 0) {
                                throw new LuaError(100, "Error", "Invalid 'alarm' value for kony.phone.addCalendarEvent()");
                            }
                            contentValues2.put("hasAlarm", Integer.valueOf(1));
                            i = parseDouble;
                        } catch (NumberFormatException e2) {
                            throw new LuaError(100, "Error", "Invalid type of 'alarm' value for kony.phone.addCalendarEvent()");
                        }
                    }
                    if (!(table5 == null || table5 == LuaNil.nil)) {
                        contentValues2.put("description", table5.toString());
                    }
                    if (table6 == null || table6 == LuaNil.nil) {
                        contentValues2.put("accessLevel", Integer.valueOf(3));
                    } else if ("private".equalsIgnoreCase(table6.toString())) {
                        contentValues2.put("accessLevel", Integer.valueOf(2));
                    } else if ("confidential".equalsIgnoreCase(table6.toString())) {
                        contentValues2.put("accessLevel", Integer.valueOf(1));
                    } else {
                        contentValues2.put("accessLevel", Integer.valueOf(3));
                    }
                    Long valueOf = Long.valueOf(Long.parseLong(KonyMain.getAppContext().getContentResolver().insert(Events.CONTENT_URI, contentValues2).getLastPathSegment()));
                    if (KonyMain.f3657e) {
                        Log.d(f2303a, "Event added EventId = " + valueOf);
                    }
                    if (i >= 0) {
                        parseDouble = i / 60;
                        if (i % 60 >= 30) {
                            parseDouble++;
                        }
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Integer.valueOf(valueOf.intValue()));
                        contentValues3.put("method", Integer.valueOf(1));
                        contentValues3.put("minutes", Integer.valueOf(parseDouble));
                        KonyMain.getAppContext().getContentResolver().insert(Reminders.CONTENT_URI, contentValues3);
                        if (KonyMain.f3657e) {
                            Log.d(f2303a, "Alarm Alert in Minutes =" + parseDouble + " added for EventId = " + valueOf);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new LuaError(100, "Error", "Invalid 'finish' value for kony.phone.addCalendarEvent()");
            }
            throw new LuaError(100, "Error", "Invalid 'start' value for kony.phone.addCalendarEvent()");
        }
    }

    public static void m2195b(Object[] objArr) {
        if (KonyMain.f3656d >= 14) {
            int delete;
            if (objArr.length > 0 && (objArr[0] instanceof LuaTable)) {
                LuaTable luaTable = (LuaTable) objArr[0];
                if (KonyMain.f3657e) {
                    Log.d(f2303a, "removeCalendarEvent called with args = " + luaTable);
                }
                LuaNil table = luaTable.getTable("UID");
                if (table != null && table != LuaNil.nil) {
                    delete = KonyMain.getAppContext().getContentResolver().delete(Events.CONTENT_URI, "_id= ?", new String[]{BuildConfig.FLAVOR + table.toString()});
                    if (KonyMain.f3657e) {
                        Log.d(f2303a, "Deleted row count = " + delete);
                    }
                } else if (KonyMain.f3657e) {
                    Log.d(f2303a, "Invalid event object argument");
                }
            } else if (KonyMain.f3657e) {
                Log.d(f2303a, "Invalid number of arguments to removeCalendarEvent");
            }
            if (m2189a() != null) {
                Cursor query = KonyMain.getAppContext().getContentResolver().query(Events.CONTENT_URI, new String[]{"_id", "calendar_id"}, "calendar_id==?", new String[]{r5}, null);
                if (query != null && query.getCount() == 0) {
                    String str = KonyMain.getAppContext().getApplicationInfo().packageName;
                    delete = KonyMain.getAppContext().getContentResolver().delete(Calendars.CONTENT_URI, "(account_name= ?) AND (account_type=?)", new String[]{str, "LOCAL"});
                    if (delete > 0 && KonyMain.f3657e) {
                        Log.d(f2303a, "Local calendar Account deleted " + delete);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Log.d(f2303a, "removeCalendarEvent API is not supported for Android version < 14");
    }

    public static Object m2196c(Object[] objArr) {
        LuaTable luaTable = new LuaTable();
        if (KonyMain.f3656d < 14) {
            Log.d(f2303a, "findCalendarEvents API is not supported for Android version < 14");
        } else if (objArr.length <= 0 || !(objArr[0] instanceof LuaTable)) {
            throw new LuaError(101, "Error", "Invalid number of arguments for kony.phone.findCalendarEvents()");
        } else {
            LuaTable luaTable2 = (LuaTable) objArr[0];
            Object table = luaTable2.getTable("start");
            Object table2 = luaTable2.getTable("finish");
            Object table3 = luaTable2.getTable("type");
            if (KonyMain.f3657e) {
                Log.d(f2303a, "findCalendarEvents called with args = " + luaTable2);
            }
            if (table instanceof String) {
                Calendar a = m2193a(table.toString(), "start", Boolean.valueOf(false));
                if (KonyMain.f3657e) {
                    Log.d(f2303a, "Cal start = " + m2192a(a));
                }
                if (table2 instanceof String) {
                    Calendar a2 = m2193a((String) table2, "finish", Boolean.valueOf(true));
                    if (KonyMain.f3657e) {
                        Log.d(f2303a, "Cal finish = " + m2192a(a2));
                    }
                    if (a2.compareTo(a) < 0) {
                        throw new LuaError(100, "Error", "End time should be after the Start time for kony.phone.findCalendarEvents()");
                    }
                    Object obj = null;
                    if (table3 != null) {
                        if ("starting".equals(table3.toString())) {
                            obj = 1;
                        } else if ("ending".equals(table3.toString())) {
                            obj = 2;
                        }
                    }
                    if (m2189a() == null) {
                        return luaTable;
                    }
                    String[] strArr;
                    String str = "dtstart";
                    String str2 = "dtend";
                    String str3 = "deleted";
                    Long valueOf = Long.valueOf(a.getTimeInMillis());
                    Long valueOf2 = Long.valueOf(a2.getTimeInMillis());
                    String str4 = "calendar_id";
                    switch (obj) {
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                            str = "((" + str4 + "=?) AND (" + str + ">=?) AND (" + str + "<=?) AND (" + str3 + "!=?))";
                            strArr = new String[]{r5, BuildConfig.FLAVOR + valueOf, BuildConfig.FLAVOR + valueOf2, "1"};
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                            str = "((" + str4 + "=?) AND (" + str2 + ">=?) AND (" + str2 + "<=?) AND (" + str3 + "!=?))";
                            strArr = new String[]{r5, BuildConfig.FLAVOR + valueOf, BuildConfig.FLAVOR + valueOf2, "1"};
                            break;
                        default:
                            str = "((" + str4 + "=?) AND (((" + str + ">=?) AND (" + str + "<=?) AND (" + str3 + "!=?))" + " OR ((" + str2 + ">=?) AND (" + str2 + "<=?) AND (" + str3 + "!=?))))";
                            strArr = new String[]{r5, BuildConfig.FLAVOR + valueOf, BuildConfig.FLAVOR + valueOf2, "1", BuildConfig.FLAVOR + valueOf, BuildConfig.FLAVOR + valueOf2, "1"};
                            break;
                    }
                    Cursor query = KonyMain.getAppContext().getContentResolver().query(Events.CONTENT_URI, new String[]{"_id", "calendar_id", "dtstart", "dtend", "title", "description", "hasAlarm", "accessLevel"}, str, strArr, "dtstart");
                    if (query == null) {
                        return luaTable;
                    }
                    if (KonyMain.f3657e) {
                        if (query.getCount() == 0) {
                            Log.d(f2303a, "No Events found in search..!");
                        } else {
                            Log.d(f2303a, BuildConfig.FLAVOR + query.getCount() + " Events found in search..");
                        }
                    }
                    if (query.moveToFirst() && query.getCount() > 0) {
                        int i = 0;
                        while (true) {
                            int i2;
                            LuaTable luaTable3 = new LuaTable();
                            int i3 = query.getInt(query.getColumnIndex("_id"));
                            int i4 = query.getInt(query.getColumnIndex("calendar_id"));
                            String string = query.getString(query.getColumnIndex("title"));
                            Long valueOf3 = Long.valueOf(query.getLong(query.getColumnIndex("dtstart")));
                            Long valueOf4 = Long.valueOf(query.getLong(query.getColumnIndex("dtend")));
                            String string2 = query.getString(query.getColumnIndex("description"));
                            int i5 = query.getInt(query.getColumnIndex("hasAlarm"));
                            int i6 = query.getInt(query.getColumnIndex("accessLevel"));
                            obj = null;
                            luaTable3.setTable("UID", Integer.valueOf(i3));
                            luaTable3.setTable("CalendarID", Integer.valueOf(i4));
                            luaTable3.setTable("summary", string);
                            luaTable3.setTable("start", m2190a(valueOf3));
                            luaTable3.setTable("finish", m2190a(valueOf4));
                            luaTable3.setTable("note", string2);
                            switch (i6) {
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                    obj = "confidential";
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                                    obj = "private";
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                                    obj = "public";
                                    break;
                            }
                            luaTable3.setTable("access", obj);
                            if (i5 == 1) {
                                Cursor query2 = KonyMain.getAppContext().getContentResolver().query(Reminders.CONTENT_URI, new String[]{"minutes"}, "(event_id =?)", new String[]{BuildConfig.FLAVOR + i3}, null);
                                if (query2 != null && query2.moveToFirst() && query2.getCount() > 0) {
                                    luaTable3.setTable(NotificationCompatApi21.CATEGORY_ALARM, Integer.valueOf(query2.getInt(query2.getColumnIndex("minutes"))));
                                }
                            }
                            if (KonyMain.f3657e) {
                                Log.d(f2303a, "Find results row" + i + " = " + luaTable3);
                                i2 = i + 1;
                            } else {
                                i2 = i;
                            }
                            luaTable.add(luaTable3);
                            if (query.moveToNext()) {
                                i = i2;
                            }
                        }
                    }
                } else {
                    throw new LuaError(100, "Error", "Invalid 'finish' value for kony.phone.findCalendarEvents()");
                }
            }
            throw new LuaError(100, "Error", "Invalid 'start' value for kony.phone.findCalendarEvents()");
        }
        return luaTable;
    }
}
