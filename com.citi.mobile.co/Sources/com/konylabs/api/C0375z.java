package com.konylabs.api;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.api.ui.C0220v;
import com.konylabs.libintf.Library;
import com.konylabs.vm.Function;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.HashMap;
import ny0k.ad;
import ny0k.cp;
import ny0k.cr;

/* renamed from: com.konylabs.api.z */
public final class C0375z implements Library {
    private Context f3037a;
    private HashMap f3038b;

    public C0375z(Context context) {
        this.f3038b = cr.m2202a((Library) this);
        this.f3037a = context;
    }

    public final Object[] execute(int i, Object[] objArr) {
        if (KonyMain.f3657e) {
            Log.d("PhoneLib", "Executing the method index : " + i);
        }
        String str;
        if (i == ((Integer) this.f3038b.get("dial")).intValue()) {
            if (KonyMain.f3657e) {
                Log.d("PhoneLib", "Calling the number : " + objArr[0]);
            }
            str = null;
            if (!(objArr[0] == null || objArr[0] == LuaNil.nil)) {
                str = objArr[0].toString();
            }
            if (KonyMain.m4118d(str)) {
                return new Object[]{new Double(0.0d)};
            }
            return new Object[]{new Double(-1.0d)};
        } else if (i == ((Integer) this.f3038b.get("sendSMS")).intValue()) {
            try {
                if (KonyMain.f3657e) {
                    Log.d("PhoneLib", "Invoking SMS service : " + objArr[0]);
                }
                String str2 = null;
                str = null;
                if (objArr[0] != LuaNil.nil) {
                    str2 = objArr[0].toString();
                }
                if (objArr[1] != LuaNil.nil) {
                    str = objArr[1].toString();
                }
                if (KonyMain.m4101a(str2, str)) {
                    return new Object[]{new Double(0.0d)};
                }
                return new Object[]{new Double(-1.0d)};
            } catch (Throwable e) {
                if (KonyMain.f3657e) {
                    Log.d("PhoneLib", "SMS Service not found", e);
                }
                throw new LuaError("kony.phone.sendSMS().Unable to invoke Messaging application" + e.getMessage(), 1109);
            }
        } else {
            C0220v c0220v;
            if (i == ((Integer) this.f3038b.get("sendMMS")).intValue()) {
                c0220v = new C0220v(this.f3037a);
                c0220v.m1588b(0);
                c0220v.m1589b("phone.sendMMS API not implemented\nApp may crash");
                c0220v.m1586a("Warning");
                c0220v.m1583a();
            } else if (i == ((Integer) this.f3038b.get("mylocation")).intValue()) {
                KonyMain actContext = KonyMain.getActContext();
                Location a = ad.m1961f().m1965a();
                r2 = new LuaTable(2, 0);
                if (a == null || actContext == null) {
                    r2.setTable("latitude", Double.valueOf(0.0d));
                    r2.setTable("longitude", Double.valueOf(0.0d));
                    r2.setTable(NotificationCompatApi21.CATEGORY_STATUS, new Double(-1.0d));
                    r2.setTable("errorcode", new Double(105.0d));
                    r2.setTable("errormsg", "Location Services Disabled");
                } else {
                    r2.setTable("latitude", Double.valueOf(a.getLatitude()));
                    r2.setTable("longitude", Double.valueOf(a.getLongitude()));
                    CellLocation cellLocation = ((TelephonyManager) actContext.getSystemService("phone")).getCellLocation();
                    if (cellLocation instanceof GsmCellLocation) {
                        int cid = ((GsmCellLocation) cellLocation).getCid();
                        if (cid != -1) {
                            r2.setTable("cellid", new Double((double) cid));
                        }
                    }
                    r2.setTable(NotificationCompatApi21.CATEGORY_STATUS, new Double(0.0d));
                }
                return new Object[]{r2};
            } else if (i == ((Integer) this.f3038b.get("onreceiveSMS")).intValue()) {
                c0220v = new C0220v(this.f3037a);
                c0220v.m1588b(0);
                c0220v.m1589b("phone.onreceiveSMS API not implemented\nApp may crash");
                c0220v.m1586a("Warning");
                c0220v.m1583a();
            } else if (i == ((Integer) this.f3038b.get("openmediagallery")).intValue()) {
                if (KonyMain.f3657e) {
                    Log.d("PhoneLib", "Openign the gallery : " + objArr[0]);
                }
                Function function = (objArr == null || objArr[0] == LuaNil.nil) ? null : (Function) objArr[0];
                String str3 = "image/*,video/*";
                LuaTable luaTable = new LuaTable(2, 0);
                if (!(objArr == null || objArr.length <= 1 || objArr[1] == LuaNil.nil)) {
                    LuaNil table = ((LuaTable) objArr[1]).getTable("mimetype");
                    if (table != LuaNil.nil) {
                        str = table.toString();
                        if (KonyMain.m4100a(new C0337A(this, function), str)) {
                            luaTable.setTable(NotificationCompatApi21.CATEGORY_STATUS, new Double(-1.0d));
                            luaTable.setTable("errorcode", new Double(102.0d));
                            luaTable.setTable("errormsg", "Media gallery not available");
                        } else {
                            luaTable.setTable(NotificationCompatApi21.CATEGORY_STATUS, new Double(0.0d));
                        }
                        return new Object[]{luaTable};
                    }
                }
                str = str3;
                if (KonyMain.m4100a(new C0337A(this, function), str)) {
                    luaTable.setTable(NotificationCompatApi21.CATEGORY_STATUS, new Double(-1.0d));
                    luaTable.setTable("errorcode", new Double(102.0d));
                    luaTable.setTable("errormsg", "Media gallery not available");
                } else {
                    luaTable.setTable(NotificationCompatApi21.CATEGORY_STATUS, new Double(0.0d));
                }
                return new Object[]{luaTable};
            } else if (i == ((Integer) this.f3038b.get("openemail")).intValue()) {
                String[] strArr;
                String[] strArr2;
                Uri[] uriArr;
                if (KonyMain.f3657e) {
                    Log.d("PhoneLib", "Opening email client : " + objArr);
                }
                String[] strArr3 = null;
                LuaTable luaTable2 = new LuaTable(2, 0);
                if (objArr[0] != LuaNil.nil) {
                    LuaTable luaTable3 = (LuaTable) objArr[0];
                    strArr = new String[luaTable3.arraySize()];
                    luaTable3.list.toArray(strArr);
                    strArr3 = strArr;
                }
                if (objArr.length <= 1 || objArr[1] == LuaNil.nil) {
                    strArr = null;
                } else {
                    LuaTable luaTable4 = (LuaTable) objArr[1];
                    strArr2 = new String[luaTable4.arraySize()];
                    luaTable4.list.toArray(strArr2);
                    strArr = strArr2;
                }
                if (objArr.length <= 2 || objArr[2] == LuaNil.nil) {
                    strArr2 = null;
                } else {
                    r2 = (LuaTable) objArr[2];
                    String[] strArr4 = new String[r2.arraySize()];
                    r2.list.toArray(strArr4);
                    strArr2 = strArr4;
                }
                String obj = (objArr.length <= 3 || objArr[3] == LuaNil.nil) ? null : objArr[3].toString();
                String obj2 = (objArr.length <= 4 || objArr[4] == LuaNil.nil) ? null : objArr[4].toString();
                boolean booleanValue = (objArr.length <= 5 || objArr[5] == LuaNil.nil) ? false : ((Boolean) objArr[5]).booleanValue();
                if (objArr.length <= 6 || objArr[6] == LuaNil.nil) {
                    uriArr = null;
                } else {
                    LuaTable luaTable5 = (LuaTable) objArr[6];
                    Uri[] uriArr2 = new Uri[luaTable5.arraySize()];
                    for (int i2 = 0; i2 < luaTable5.arraySize(); i2++) {
                        LuaTable luaTable6 = (LuaTable) luaTable5.list.get(i2);
                        luaTable6.getTable("mimetype").toString();
                        luaTable6.getTable("filename").toString();
                        uriArr2[i2] = Uri.parse(luaTable6.getTable("attachment").toString());
                    }
                    uriArr = uriArr2;
                }
                if (KonyMain.m4103a(strArr3, strArr, strArr2, obj, obj2, booleanValue, uriArr)) {
                    luaTable2.setTable(NotificationCompatApi21.CATEGORY_STATUS, new Double(0.0d));
                } else {
                    luaTable2.setTable(NotificationCompatApi21.CATEGORY_STATUS, new Double(-1.0d));
                    luaTable2.setTable("errorcode", new Double(102.0d));
                    luaTable2.setTable("errormsg", "Email client not available/not configured");
                }
                return new Object[]{luaTable2};
            } else if (i == ((Integer) this.f3038b.get("addevent")).intValue() || i == ((Integer) this.f3038b.get("addcalendarevent")).intValue()) {
                if (KonyMain.f3657e) {
                    Log.d("PhoneLib", "Adding calendar event : " + objArr);
                }
                cp.m2194a(objArr);
            } else if (i == ((Integer) this.f3038b.get("removeevent")).intValue() || i == ((Integer) this.f3038b.get("removecalendarevent")).intValue()) {
                if (KonyMain.f3657e) {
                    Log.d("PhoneLib", "Removing calendar event : " + objArr);
                }
                cp.m2195b(objArr);
            } else if (i == ((Integer) this.f3038b.get("findevents")).intValue() || i == ((Integer) this.f3038b.get("findcalendarevents")).intValue()) {
                if (KonyMain.f3657e) {
                    Log.d("PhoneLib", "Finding calendar events : " + objArr);
                }
                return new Object[]{cp.m2196c(objArr)};
            }
            return null;
        }
    }

    public final String[] getMethods() {
        return new String[]{"dial", "sendSMS", "sendMMS", "mylocation", "onreceiveSMS", "openmediagallery", "openemail", "addevent", "addcalendarevent", "removeevent", "removecalendarevent", "findevents", "findcalendarevents"};
    }

    public final String getNameSpace() {
        return "phone";
    }
}
