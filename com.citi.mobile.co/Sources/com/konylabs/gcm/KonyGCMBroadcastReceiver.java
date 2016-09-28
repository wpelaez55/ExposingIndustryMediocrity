package com.konylabs.gcm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class KonyGCMBroadcastReceiver extends BroadcastReceiver {
    private static int f1651a;

    static {
        f1651a = 0;
    }

    private static int m1593a(Context context) {
        int i = 1;
        int identifier = context.getResources().getIdentifier("notify_push_msg_notifications_count", "string", context.getPackageName());
        if (identifier != 0) {
            try {
                i = Integer.parseInt(context.getString(identifier));
                if (i > 50) {
                    return 50;
                }
            } catch (Exception e) {
            }
        }
        return i;
    }

    private static ArrayList m1594a(Intent intent) {
        Object obj;
        Object obj2 = null;
        ArrayList arrayList = new ArrayList(2);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Set keySet = extras.keySet();
            if (!(keySet == null || keySet.isEmpty())) {
                Object obj3;
                Object obj4;
                Iterator it = keySet.iterator();
                if (it.hasNext()) {
                    obj3 = new String[keySet.size()];
                    obj4 = new String[keySet.size()];
                } else {
                    obj4 = null;
                    obj3 = null;
                }
                if (obj3 != null) {
                    int i = 0;
                    while (it.hasNext()) {
                        int i2;
                        String str = (String) it.next();
                        if (str != null) {
                            obj3[i] = str;
                            obj4[i] = extras.getString(str);
                            i2 = i + 1;
                        } else {
                            i2 = i;
                        }
                        i = i2;
                    }
                }
                obj2 = obj4;
                obj = obj3;
                arrayList.add(obj);
                arrayList.add(obj2);
                return arrayList;
            }
        }
        obj = null;
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    protected final PendingIntent createNotificationPendingIntent(Context context, Intent intent, int i) {
        ArrayList a = m1594a(intent);
        String[] strArr = (String[]) a.get(0);
        String[] strArr2 = (String[]) a.get(1);
        Bundle bundle = new Bundle();
        bundle.putStringArray("push-msg-keys", strArr);
        bundle.putStringArray("push-msg-values", strArr2);
        Intent intent2 = new Intent();
        intent2.putExtra("push-notification-msg", bundle);
        intent2.setAction(context.getPackageName() + ".GCM_MSG_VIEW");
        intent2.addCategory("android.intent.category.DEFAULT");
        return PendingIntent.getActivity(context, i, intent2, 134217728);
    }

    protected final int getAppState() {
        return C0225a.m1602b();
    }

    protected void handleRegistration(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("registration_id");
        String stringExtra2 = intent.getStringExtra("error");
        if (stringExtra2 != null) {
            if (C0225a.f1652a == 1) {
                C0225a.m1604b(stringExtra2);
            } else if (C0225a.f1652a == 2) {
                C0225a.m1607c(stringExtra2);
            }
        } else if (intent.getStringExtra("unregistered") != null) {
            C0225a.m1596a();
        } else if (stringExtra == null) {
        } else {
            if (C0225a.m1602b() != 0) {
                C0225a.m1599a(stringExtra);
            } else {
                showRegistrationIdNotification(context, intent, stringExtra);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.google.android.c2dm.intent.REGISTRATION")) {
            handleRegistration(context, intent);
        } else if (!intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE")) {
        } else {
            if (C0225a.m1602b() == 1) {
                ArrayList a = m1594a(intent);
                C0225a.m1600a((String[]) a.get(0), (String[]) a.get(1));
                return;
            }
            showPushMessageNotification(context, intent);
        }
    }

    public void showPushMessageNotification(Context context, Intent intent) {
        int i = 0;
        String str = null;
        String packageName = context.getPackageName();
        String string = context.getString(context.getResources().getIdentifier("notify_push_msg", "string", packageName));
        if (string != null && string.equalsIgnoreCase("true")) {
            String str2;
            Bundle extras;
            CharSequence string2;
            CharSequence charSequence;
            int identifier = context.getResources().getIdentifier(context.getString(context.getResources().getIdentifier("notify_push_msg_icon", "string", packageName)), "drawable", packageName);
            int identifier2 = identifier == 0 ? context.getResources().getIdentifier("icon", "drawable", packageName) : identifier;
            string = context.getString(context.getResources().getIdentifier("notify_push_msg_title_from_payload", "string", packageName));
            if (string == null || !string.equalsIgnoreCase("true")) {
                str2 = null;
                string = null;
            } else {
                Bundle extras2;
                Set keySet;
                Iterator it;
                identifier = context.getResources().getIdentifier("notify_push_msg_title_keys", "string", packageName);
                if (identifier != 0) {
                    string = context.getString(identifier);
                    if (string != null && string.trim().length() > 0) {
                        String[] split = string.split(",");
                        extras = intent.getExtras();
                        String str3 = null;
                        for (String str32 : split) {
                            str32 = extras.getString(str32);
                            if (str32 != null) {
                                break;
                            }
                        }
                        string = str32;
                        if (string == null) {
                            extras2 = intent.getExtras();
                            keySet = extras2.keySet();
                            if (!(keySet == null || keySet.isEmpty())) {
                                it = keySet.iterator();
                                if (it.hasNext()) {
                                    string = (String) it.next();
                                    str2 = string;
                                    string = extras2.getString(string);
                                }
                            }
                        }
                        str2 = null;
                    }
                }
                string = null;
                if (string == null) {
                    extras2 = intent.getExtras();
                    keySet = extras2.keySet();
                    it = keySet.iterator();
                    if (it.hasNext()) {
                        string = (String) it.next();
                        str2 = string;
                        string = extras2.getString(string);
                    }
                }
                str2 = null;
            }
            if (string == null) {
                string2 = context.getString(context.getResources().getIdentifier("notify_push_msg_default_title", "string", packageName));
            } else {
                Object obj = string;
            }
            string = context.getString(context.getResources().getIdentifier("notify_push_msg_desc_from_payload", "string", packageName));
            if (string == null || !string.equalsIgnoreCase("true")) {
                charSequence = null;
            } else {
                identifier = context.getResources().getIdentifier("notify_push_msg_desc_keys", "string", packageName);
                if (identifier != 0) {
                    string = context.getString(identifier);
                    if (string != null && string.trim().length() > 0) {
                        String[] split2 = string.split(",");
                        extras = intent.getExtras();
                        while (i < split2.length) {
                            str = extras.getString(split2[i]);
                            if (str != null) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                if (str == null) {
                    Bundle extras3 = intent.getExtras();
                    if (str2 == null) {
                        Set keySet2 = extras3.keySet();
                        if (!(keySet2 == null || keySet2.isEmpty())) {
                            Iterator it2 = keySet2.iterator();
                            if (it2.hasNext()) {
                                string = (String) it2.next();
                                charSequence = extras3.getString(string);
                            }
                        }
                    }
                    string = str2;
                    charSequence = extras3.getString(string);
                } else {
                    Object obj2 = str;
                }
            }
            if (charSequence == null) {
                charSequence = context.getString(context.getResources().getIdentifier("notify_push_msg_default_desc", "string", packageName));
            }
            String string3 = context.getString(context.getResources().getIdentifier("notify_push_msg_sound", "string", packageName));
            str = context.getString(context.getResources().getIdentifier("notify_push_msg_vibrate", "string", packageName));
            str2 = context.getString(context.getResources().getIdentifier("notify_push_msg_lights", "string", packageName));
            packageName = context.getString(context.getResources().getIdentifier("notify_push_msg_clear", "string", packageName));
            Notification notification = new Notification(identifier2, string2, System.currentTimeMillis());
            notification.flags |= 16;
            if (packageName != null && packageName.equalsIgnoreCase("true")) {
                notification.flags |= 32;
            }
            if (string3 != null && string3.equalsIgnoreCase("true")) {
                notification.defaults |= 1;
            }
            if (str != null && str.equalsIgnoreCase("true")) {
                notification.defaults |= 2;
            }
            if (str2 != null && str2.equalsIgnoreCase("true")) {
                notification.defaults |= 4;
            }
            identifier2 = f1651a + 1;
            f1651a = identifier2;
            if (identifier2 > m1593a(context)) {
                f1651a = 1;
            }
            identifier2 = f1651a;
            notification.setLatestEventInfo(context, string2, charSequence, createNotificationPendingIntent(context, intent, identifier2));
            ((NotificationManager) context.getSystemService("notification")).notify(identifier2, notification);
        }
    }

    protected void showRegistrationIdNotification(Context context, Intent intent, String str) {
        String packageName = context.getPackageName();
        String string = context.getString(context.getResources().getIdentifier("notify_new_regid", "string", packageName));
        if (string != null && string.equalsIgnoreCase("true")) {
            int identifier = context.getResources().getIdentifier(context.getString(context.getResources().getIdentifier("notify_new_regid_icon", "string", packageName)), "drawable", packageName);
            if (identifier == 0) {
                identifier = context.getResources().getIdentifier("icon", "drawable", packageName);
            }
            CharSequence string2 = context.getString(context.getResources().getIdentifier("notify_new_regid_title", "string", packageName));
            if (string2 == null) {
                string2 = BuildConfig.FLAVOR;
            }
            CharSequence string3 = context.getString(context.getResources().getIdentifier("notify_new_regid_desc", "string", packageName));
            if (string3 == null) {
                string3 = BuildConfig.FLAVOR;
            }
            String string4 = context.getString(context.getResources().getIdentifier("notify_new_regid_sound", "string", packageName));
            String string5 = context.getString(context.getResources().getIdentifier("notify_new_regid_vibrate", "string", packageName));
            String string6 = context.getString(context.getResources().getIdentifier("notify_new_regid_lights", "string", packageName));
            String string7 = context.getString(context.getResources().getIdentifier("notify_new_regid_clear", "string", packageName));
            Notification notification = new Notification(identifier, string2, System.currentTimeMillis());
            notification.flags |= 16;
            if (string7 != null && string7.equalsIgnoreCase("true")) {
                notification.flags |= 32;
            }
            if (string4 != null && string4.equalsIgnoreCase("true")) {
                notification.defaults |= 1;
            }
            if (string5 != null && string5.equalsIgnoreCase("true")) {
                notification.defaults |= 2;
            }
            if (string6 != null && string6.equalsIgnoreCase("true")) {
                notification.defaults |= 4;
            }
            Bundle bundle = new Bundle();
            bundle.putString("push-msg-regid", str);
            Intent intent2 = new Intent();
            intent2.putExtra("push-notification-regid", bundle);
            intent2.setAction(packageName + ".GCM_REGID_VIEW");
            intent2.addCategory("android.intent.category.DEFAULT");
            notification.setLatestEventInfo(context, string2, string3, PendingIntent.getActivity(context, 0, intent2, 134217728));
            ((NotificationManager) context.getSystemService("notification")).notify(0, notification);
        }
    }
}
