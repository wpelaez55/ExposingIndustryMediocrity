package ny0k;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.Contacts.ContactMethods;
import android.provider.Contacts.Organizations;
import android.provider.Contacts.People;
import android.provider.Contacts.Phones;
import com.konylabs.api.ui.KonyCustomWidget;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: ny0k.G */
public final class C0421G extends C0277J {
    private ContentResolver f3196a;
    private Context f3197b;

    private ArrayList m3452c(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor query = this.f3196a.query(Phones.CONTENT_URI, null, "person = ?", new String[]{str}, null);
        if (query != null) {
            while (query.moveToNext()) {
                HashMap hashMap = new HashMap();
                int i = query.getInt(query.getColumnIndex("type"));
                String string = query.getString(query.getColumnIndex("number"));
                if (string != null) {
                    switch (i) {
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                            hashMap.put("name", "home");
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                            hashMap.put("name", "mobile");
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                            hashMap.put("name", "work");
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_OBJ_FLOAT /*7*/:
                            hashMap.put("name", "other");
                            break;
                    }
                    hashMap.put("number", string);
                    arrayList.add(hashMap);
                }
            }
            query.close();
        }
        return arrayList;
    }

    private ArrayList m3453d(String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = new String[]{str, Integer.toString(1)};
        Cursor query = this.f3196a.query(ContactMethods.CONTENT_URI, null, "person = ? AND kind = ?", strArr, null);
        if (query != null) {
            while (query.moveToNext()) {
                HashMap hashMap = new HashMap();
                int i = query.getInt(query.getColumnIndex("type"));
                String string = query.getString(query.getColumnIndex("data"));
                if (string != null) {
                    switch (i) {
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                            hashMap.put("name", "home");
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                            hashMap.put("name", "work");
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                            hashMap.put("name", "other");
                            break;
                    }
                    hashMap.put("id", string);
                    arrayList.add(hashMap);
                }
            }
            query.close();
        }
        return arrayList;
    }

    private ArrayList m3454e(String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = new String[]{str, Integer.toString(2)};
        Cursor query = this.f3196a.query(ContactMethods.CONTENT_URI, null, "person = ? AND kind = ?", strArr, null);
        if (query != null) {
            while (query.moveToNext()) {
                HashMap hashMap = new HashMap();
                String string = query.getString(query.getColumnIndex("data"));
                if (string != null) {
                    switch (query.getInt(query.getColumnIndex("type"))) {
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                            hashMap.put("name", "home");
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                            hashMap.put("name", "work");
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_DOUBLE /*3*/:
                            hashMap.put("name", "other");
                            break;
                    }
                    hashMap.put("address", string);
                    arrayList.add(hashMap);
                }
            }
            query.close();
        }
        return arrayList;
    }

    private ArrayList m3455f(String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = new String[]{str};
        Cursor query = this.f3196a.query(Organizations.CONTENT_URI, null, "person = ?", strArr, null);
        if (query != null) {
            while (query.moveToNext()) {
                HashMap hashMap = new HashMap();
                String string = query.getString(query.getColumnIndex("company"));
                String string2 = query.getString(query.getColumnIndex("title"));
                int i = query.getInt(query.getColumnIndex("type"));
                if (string != null && string.length() > 0) {
                    switch (i) {
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_LONG /*1*/:
                            hashMap.put("name", "work");
                            break;
                        case KonyCustomWidget.NATIVE_DATA_TYPE_PRIMITIVE_FLOAT /*2*/:
                            hashMap.put("name", "other");
                            break;
                    }
                    hashMap.put("company", string);
                    if (string2 != null) {
                        hashMap.put("title", string2);
                    }
                    arrayList.add(hashMap);
                }
            }
            query.close();
        }
        return arrayList;
    }

    public final Bitmap m3456a(Uri uri) {
        return this.f3197b != null ? People.loadContactPhoto(this.f3197b, uri, 0, null) : null;
    }

    public final String m3457a(Hashtable hashtable) {
        Vector vector;
        Vector vector2;
        String str;
        String str2 = null;
        Vector vector3 = null;
        Vector vector4 = null;
        if (hashtable != null) {
            str2 = (String) hashtable.get("lastname");
            vector3 = (Vector) hashtable.get(NotificationCompatApi21.CATEGORY_EMAIL);
            vector4 = (Vector) hashtable.get("company");
            vector = (Vector) hashtable.get("postal");
            vector2 = (Vector) hashtable.get("phone");
            str = (String) hashtable.get("firstname");
        } else {
            vector = null;
            vector2 = null;
            str = null;
        }
        if (str == null || str.equals(BuildConfig.FLAVOR) || vector2 == null) {
            return null;
        }
        Uri createPersonInMyContactsGroup;
        ContentValues contentValues = new ContentValues();
        if (str != null && str2 != null) {
            contentValues.put("name", str + " " + str2);
            createPersonInMyContactsGroup = People.createPersonInMyContactsGroup(this.f3196a, contentValues);
        } else if (str != null) {
            contentValues.put("name", str);
            createPersonInMyContactsGroup = People.createPersonInMyContactsGroup(this.f3196a, contentValues);
        } else {
            createPersonInMyContactsGroup = null;
        }
        if (createPersonInMyContactsGroup == null) {
            return null;
        }
        int i;
        String str3;
        str = createPersonInMyContactsGroup.toString().substring(createPersonInMyContactsGroup.toString().lastIndexOf("/") + 1);
        if (vector2 != null) {
            Uri withAppendedPath = Uri.withAppendedPath(createPersonInMyContactsGroup, "phones");
            for (i = 0; i < vector2.size(); i++) {
                contentValues.clear();
                str3 = (String) ((Hashtable) vector2.get(i)).get("name");
                if (str3 != null) {
                    if (str3 == "home") {
                        contentValues.put("type", Integer.valueOf(1));
                    } else if (str3 == "mobile") {
                        contentValues.put("type", Integer.valueOf(2));
                    } else if (str3 == "work") {
                        contentValues.put("type", Integer.valueOf(3));
                    } else if (str3 == "other") {
                        contentValues.put("type", Integer.valueOf(7));
                    }
                    contentValues.put("number", (String) ((Hashtable) vector2.get(i)).get("number"));
                    this.f3196a.insert(withAppendedPath, contentValues);
                }
            }
        }
        if (vector3 != null) {
            Uri withAppendedPath2 = Uri.withAppendedPath(createPersonInMyContactsGroup, "contact_methods");
            for (i = 0; i < vector3.size(); i++) {
                contentValues.clear();
                str3 = (String) ((Hashtable) vector3.get(i)).get("name");
                if (str3 != null) {
                    contentValues.put("kind", Integer.valueOf(1));
                    if (str3 == "home") {
                        contentValues.put("type", Integer.valueOf(1));
                    } else if (str3 == "work") {
                        contentValues.put("type", Integer.valueOf(2));
                    } else if (str3 == "other") {
                        contentValues.put("type", Integer.valueOf(3));
                    }
                    contentValues.put("data", (String) ((Hashtable) vector3.get(i)).get("id"));
                    this.f3196a.insert(withAppendedPath2, contentValues);
                }
            }
        }
        if (vector != null) {
            Uri withAppendedPath3 = Uri.withAppendedPath(createPersonInMyContactsGroup, "contact_methods");
            for (i = 0; i < vector.size(); i++) {
                contentValues.clear();
                str3 = (String) ((Hashtable) vector.get(i)).get("name");
                if (str3 != null) {
                    contentValues.put("kind", Integer.valueOf(2));
                    if (str3 == "home") {
                        contentValues.put("type", Integer.valueOf(1));
                    } else if (str3 == "work") {
                        contentValues.put("type", Integer.valueOf(2));
                    } else if (str3 == "other") {
                        contentValues.put("type", Integer.valueOf(3));
                    }
                    contentValues.put("data", ((String) ((Hashtable) vector.get(i)).get("street")) + " " + ((String) ((Hashtable) vector.get(i)).get("city")) + " " + ((String) ((Hashtable) vector.get(i)).get("state")) + " " + ((String) ((Hashtable) vector.get(i)).get("zipcode")));
                    this.f3196a.insert(withAppendedPath3, contentValues);
                }
            }
        }
        if (vector4 != null) {
            createPersonInMyContactsGroup = Uri.withAppendedPath(createPersonInMyContactsGroup, "organizations");
            for (i = 0; i < vector4.size(); i++) {
                contentValues.clear();
                str3 = (String) ((Hashtable) vector4.get(i)).get("name");
                if (str3 != null) {
                    if (str3 == "work") {
                        contentValues.put("type", Integer.valueOf(1));
                    } else if (str3 == "other") {
                        contentValues.put("type", Integer.valueOf(2));
                    }
                    contentValues.put("company", (String) ((Hashtable) vector4.get(i)).get("company"));
                    contentValues.put("title", (String) ((Hashtable) vector4.get(i)).get("title"));
                    this.f3196a.insert(createPersonInMyContactsGroup, contentValues);
                }
            }
        }
        return str;
    }

    public final ArrayList m3458a(String str) {
        Cursor query;
        ArrayList arrayList = new ArrayList();
        if (str.equals("*")) {
            query = this.f3196a.query(People.CONTENT_URI, null, null, null, "display_name COLLATE NOCASE, display_name");
        } else {
            query = this.f3196a.query(People.CONTENT_URI, null, "name LIKE ?", new String[]{"%" + str + "%"}, null);
        }
        if (query != null) {
            try {
                if (query.getCount() > 0) {
                    while (query.moveToNext()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", query.getString(query.getColumnIndex("_id")));
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

    public final void m3459a(ContentResolver contentResolver) {
        this.f3196a = contentResolver;
    }

    public final void m3460a(Context context) {
        this.f3197b = context;
    }

    public final HashMap m3461b(String str) {
        HashMap hashMap = new HashMap();
        Cursor query = this.f3196a.query(People.CONTENT_URI, null, "people._id=?", new String[]{str}, null);
        if (query != null && query.getCount() > 0) {
            int columnIndex = query.getColumnIndex("display_name");
            while (query.moveToNext()) {
                String[] split = query.getString(columnIndex).split(" ");
                if (!(split == null || split[0] == null)) {
                    hashMap.put("firstname", split[0]);
                }
                if (split.length > 1) {
                    hashMap.put("lastname", split[1]);
                }
                hashMap.put("phone", m3452c(str));
                hashMap.put(NotificationCompatApi21.CATEGORY_EMAIL, m3453d(str));
                hashMap.put("postal", m3454e(str));
                hashMap.put("company", m3455f(str));
                hashMap.put("photorawbytes", ContentUris.withAppendedId(People.CONTENT_URI, Long.parseLong(str)).toString());
            }
            query.close();
        }
        return hashMap;
    }

    public final boolean m3462b(Hashtable hashtable) {
        return (((String) hashtable.get("id")) != null ? this.f3196a.delete(People.CONTENT_URI, "_id=?", new String[]{(String) hashtable.get("id")}) : 0) > 0;
    }
}
