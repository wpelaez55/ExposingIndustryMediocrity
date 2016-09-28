package ny0k;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.AlertDialog.Builder;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.util.Log;
import com.konylabs.api.ui.KonyCustomWidget;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: ny0k.H */
public final class C0422H extends C0277J {
    private ContentResolver f3198a;
    private Account[] f3199b;
    private Context f3200c;
    private String f3201d;

    public C0422H() {
        this.f3199b = new Account[0];
        this.f3201d = null;
    }

    private String m3463a(Hashtable hashtable, int i) {
        String str = null;
        Object obj = null;
        Vector vector = null;
        Vector vector2 = null;
        Vector vector3 = null;
        Vector vector4 = null;
        if (hashtable != null) {
            str = (String) hashtable.get("firstname");
            obj = (String) hashtable.get("lastname");
            vector = (Vector) hashtable.get("phone");
            vector2 = (Vector) hashtable.get("postal");
            vector3 = (Vector) hashtable.get(NotificationCompatApi21.CATEGORY_EMAIL);
            vector4 = (Vector) hashtable.get("company");
        }
        if (str == null || str.equals(BuildConfig.FLAVOR) || vector == null) {
            return null;
        }
        int i2;
        ArrayList arrayList = new ArrayList();
        int size = arrayList.size();
        if (!(this.f3199b[i].type == null || this.f3199b[i].name == null)) {
            arrayList.add(ContentProviderOperation.newInsert(RawContacts.CONTENT_URI).withValue("account_type", this.f3199b[i].type).withValue("account_name", this.f3199b[i].name).build());
        }
        if (str != null && obj != null) {
            arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", obj).build());
        } else if (str != null) {
            arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).build());
        }
        if (vector != null) {
            for (i2 = 0; i2 < vector.size(); i2++) {
                str = ((String) ((Hashtable) vector.get(i2)).get("name")).intern();
                if (str != null) {
                    if (str == "home") {
                        arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", ((Hashtable) vector.get(i2)).get("number")).withValue("data2", Integer.valueOf(1)).build());
                    } else if (str == "mobile") {
                        arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", ((Hashtable) vector.get(i2)).get("number")).withValue("data2", Integer.valueOf(2)).build());
                    } else if (str == "work") {
                        arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", ((Hashtable) vector.get(i2)).get("number")).withValue("data2", Integer.valueOf(3)).build());
                    } else if (str == "other") {
                        arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", ((Hashtable) vector.get(i2)).get("number")).withValue("data2", Integer.valueOf(7)).build());
                    }
                }
            }
        }
        if (vector3 != null) {
            for (i2 = 0; i2 < vector3.size(); i2++) {
                str = ((String) ((Hashtable) vector3.get(i2)).get("name")).intern();
                if (str != null) {
                    if (str == "home") {
                        arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("data1", ((Hashtable) vector3.get(i2)).get("id")).withValue("data2", Integer.valueOf(1)).build());
                    } else if (str == "work") {
                        arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("data1", ((Hashtable) vector3.get(i2)).get("id")).withValue("data2", Integer.valueOf(2)).build());
                    } else if (str == "other") {
                        arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("data1", ((Hashtable) vector3.get(i2)).get("id")).withValue("data2", Integer.valueOf(3)).build());
                    }
                }
            }
        }
        if (vector4 != null) {
            for (i2 = 0; i2 < vector4.size(); i2++) {
                str = ((String) ((Hashtable) vector4.get(i2)).get("name")).intern();
                if (str != null) {
                    if (str == "work") {
                        arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/organization").withValue("data1", ((Hashtable) vector4.get(i2)).get("company")).withValue("data4", ((Hashtable) vector4.get(i2)).get("title")).withValue("data2", Integer.valueOf(1)).build());
                    } else if (str == "other") {
                        arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/organization").withValue("data1", ((Hashtable) vector4.get(i2)).get("company")).withValue("data4", ((Hashtable) vector4.get(i2)).get("title")).withValue("data2", Integer.valueOf(2)).build());
                    }
                }
            }
        }
        if (vector2 != null) {
            for (i2 = 0; i2 < vector2.size(); i2++) {
                str = ((String) ((Hashtable) vector2.get(i2)).get("name")).intern();
                if (str != null) {
                    if (str == "home") {
                        arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/postal-address_v2").withValue("data4", ((Hashtable) vector2.get(i2)).get("street")).withValue("data7", ((Hashtable) vector2.get(i2)).get("city")).withValue("data8", ((Hashtable) vector2.get(i2)).get("state")).withValue("data10", ((Hashtable) vector2.get(i2)).get("country")).withValue("data9", ((Hashtable) vector2.get(i2)).get("zipcode")).withValue("data2", Integer.valueOf(1)).build());
                    } else if (str == "work") {
                        arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/postal-address_v2").withValue("data4", ((Hashtable) vector2.get(i2)).get("street")).withValue("data7", ((Hashtable) vector2.get(i2)).get("city")).withValue("data8", ((Hashtable) vector2.get(i2)).get("state")).withValue("data10", ((Hashtable) vector2.get(i2)).get("country")).withValue("data9", ((Hashtable) vector2.get(i2)).get("zipcode")).withValue("data2", Integer.valueOf(2)).build());
                    } else if (str == "other") {
                        arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/postal-address_v2").withValue("data4", ((Hashtable) vector2.get(i2)).get("street")).withValue("data7", ((Hashtable) vector2.get(i2)).get("city")).withValue("data8", ((Hashtable) vector2.get(i2)).get("state")).withValue("data10", ((Hashtable) vector2.get(i2)).get("country")).withValue("data9", ((Hashtable) vector2.get(i2)).get("zipcode")).withValue("data2", Integer.valueOf(3)).build());
                    }
                }
            }
        }
        try {
            str = this.f3198a.applyBatch("com.android.contacts", arrayList)[0].toString();
            String substring = str.substring(str.lastIndexOf("/") + 1, str.length() - 1);
            Cursor query = this.f3198a.query(RawContacts.CONTENT_URI, null, "_id=?", new String[]{substring}, null);
            if (query != null) {
                i2 = query.getColumnIndex("contact_id");
                query.moveToNext();
                return query.getString(i2);
            }
            Log.e("ContactAPISdk5", " *** cursor is null ***** ");
            return null;
        } catch (Exception e) {
            Log.e("ContactAPISdk5", "Exceptoin encoutered while inserting contact: " + e);
            return null;
        }
    }

    public final Bitmap m3464a(Uri uri) {
        InputStream openContactPhotoInputStream = Contacts.openContactPhotoInputStream(this.f3198a, uri);
        return openContactPhotoInputStream != null ? BitmapFactory.decodeStream(openContactPhotoInputStream) : null;
    }

    public final String m3465a(Hashtable hashtable) {
        int i = 1;
        if (this.f3200c != null) {
            this.f3199b = AccountManager.get(this.f3200c).getAccounts();
        }
        if (this.f3199b.length == 1) {
            this.f3201d = m3463a(hashtable, 0);
        } else if (this.f3199b.length > 0) {
            int i2 = 0;
            while (i2 < this.f3199b.length) {
                if (this.f3199b[i2].type.contains("google")) {
                    break;
                }
                i2++;
            }
            i = 0;
            if (i != 0) {
                this.f3201d = m3463a(hashtable, i2);
            } else {
                this.f3201d = m3463a(hashtable, 0);
            }
        } else if (this.f3200c != null) {
            Builder builder = new Builder(this.f3200c);
            builder.setMessage("No Accounts to add. Create an account in the contacts before adding a contact");
            builder.setNeutralButton("OK", new C0276I(this));
            builder.create().show();
        }
        return this.f3201d;
    }

    public final ArrayList m3466a(String str) {
        Cursor query;
        ArrayList arrayList = new ArrayList();
        if (str.equals("*")) {
            query = this.f3198a.query(Contacts.CONTENT_URI, null, null, null, "display_name COLLATE NOCASE, display_name");
        } else {
            query = this.f3198a.query(Contacts.CONTENT_URI, null, "display_name LIKE ?", new String[]{"%" + str + "%"}, null);
        }
        if (query != null) {
            try {
                if (query.getCount() > 0) {
                    while (query.moveToNext()) {
                        String string = query.getString(query.getColumnIndex("_id"));
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", string);
                        hashMap.put("displayname", query.getString(query.getColumnIndex("display_name")));
                        arrayList.add(hashMap);
                    }
                }
                query.close();
            } catch (Throwable th) {
                query.close();
            }
        }
        return arrayList;
    }

    public final void m3467a(ContentResolver contentResolver) {
        this.f3198a = contentResolver;
    }

    public final void m3468a(Context context) {
        this.f3200c = context;
    }

    public final HashMap m3469b(String str) {
        HashMap hashMap = new HashMap();
        Cursor query = this.f3198a.query(Data.CONTENT_URI, null, "contact_id=?", new String[]{str}, null);
        if (query != null && query.getCount() > 0) {
            int columnIndex = query.getColumnIndex("data2");
            int columnIndex2 = query.getColumnIndex("data3");
            int columnIndex3 = query.getColumnIndex("data2");
            int columnIndex4 = query.getColumnIndex("data1");
            int columnIndex5 = query.getColumnIndex("data2");
            int columnIndex6 = query.getColumnIndex("data1");
            int columnIndex7 = query.getColumnIndex("data5");
            int columnIndex8 = query.getColumnIndex("data4");
            int columnIndex9 = query.getColumnIndex("data7");
            int columnIndex10 = query.getColumnIndex("data8");
            int columnIndex11 = query.getColumnIndex("data9");
            int columnIndex12 = query.getColumnIndex("data10");
            int columnIndex13 = query.getColumnIndex("data2");
            int columnIndex14 = query.getColumnIndex("data1");
            int columnIndex15 = query.getColumnIndex("data4");
            int columnIndex16 = query.getColumnIndex("data2");
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            while (query.moveToNext()) {
                String intern = query.getString(query.getColumnIndex("mimetype")).intern();
                String string;
                if (intern == "vnd.android.cursor.item/name") {
                    intern = query.getString(columnIndex);
                    string = query.getString(columnIndex2);
                    hashMap.put("firstname", intern);
                    hashMap.put("lastname", string);
                } else if (intern == "vnd.android.cursor.item/phone_v2") {
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        hashMap.put("phone", arrayList4);
                    }
                    r8 = new HashMap();
                    if (query != null) {
                        r9 = query.getInt(columnIndex3);
                        r10 = query.getString(columnIndex4);
                        if (r10 != null) {
                            switch (r9) {
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                    r8.put("name", "home");
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                                    r8.put("name", "mobile");
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                                    r8.put("name", "work");
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                                    r8.put("name", "other");
                                    break;
                            }
                            r8.put("number", r10);
                        }
                    }
                    arrayList4.add(r8);
                } else if (intern == "vnd.android.cursor.item/email_v2") {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        hashMap.put(NotificationCompatApi21.CATEGORY_EMAIL, arrayList3);
                    }
                    r8 = new HashMap();
                    if (query != null) {
                        r9 = query.getInt(columnIndex5);
                        r10 = query.getString(columnIndex6);
                        if (r10 != null) {
                            switch (r9) {
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                    r8.put("name", "home");
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                                    r8.put("name", "work");
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                                    r8.put("name", "other");
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_BOOLEAN /*4*/:
                                    r8.put("name", "mobile");
                                    break;
                            }
                            r8.put("id", r10);
                        }
                    }
                    arrayList3.add(r8);
                } else if (intern == "vnd.android.cursor.item/postal-address_v2") {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        hashMap.put("postal", arrayList2);
                    }
                    r8 = new HashMap();
                    if (query != null) {
                        string = query.getString(columnIndex7);
                        r10 = query.getString(columnIndex8);
                        String string2 = query.getString(columnIndex9);
                        String string3 = query.getString(columnIndex10);
                        String string4 = query.getString(columnIndex11);
                        String string5 = query.getString(columnIndex12);
                        switch (query.getInt(columnIndex13)) {
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                r8.put("name", "home");
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                                r8.put("name", "work");
                                break;
                            case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                                r8.put("name", "other");
                                break;
                        }
                        if (string != null) {
                            r8.put("pobox", string);
                        }
                        if (r10 != null) {
                            r8.put("street", r10);
                        }
                        if (string2 != null) {
                            r8.put("city", string2);
                        }
                        if (string3 != null) {
                            r8.put("state", string3);
                        }
                        if (string4 != null) {
                            r8.put("zipcode", string4);
                        }
                        if (string5 != null) {
                            r8.put("country", string5);
                        }
                    }
                    arrayList2.add(r8);
                } else if (intern == "vnd.android.cursor.item/organization") {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put("company", arrayList);
                    }
                    r8 = new HashMap();
                    if (query != null) {
                        string = query.getString(columnIndex14);
                        r10 = query.getString(columnIndex15);
                        int i = query.getInt(columnIndex16);
                        if (string != null && string.length() > 0) {
                            switch (i) {
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                                    r8.put("name", "work");
                                    break;
                                case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                                    r8.put("name", "other");
                                    break;
                            }
                            r8.put("company", string);
                            if (r10 != null) {
                                r8.put("title", r10);
                            }
                        }
                    }
                    arrayList.add(r8);
                }
                hashMap.put("photorawbytes", ContentUris.withAppendedId(Contacts.CONTENT_URI, Long.parseLong(str)).toString());
            }
            query.close();
        }
        return hashMap;
    }

    public final boolean m3470b(Hashtable hashtable) {
        return (((String) hashtable.get("id")) != null ? this.f3198a.delete(RawContacts.CONTENT_URI, "contact_id=?", new String[]{(String) hashtable.get("id")}) : 0) > 0;
    }
}
