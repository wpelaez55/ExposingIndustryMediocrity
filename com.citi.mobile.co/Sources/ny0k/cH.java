package ny0k;

import android.util.DisplayMetrics;
import android.util.Log;
import com.konylabs.android.KonyMain;
import java.util.ArrayList;

public final class cH {
    private ArrayList f2235a;
    private ArrayList f2236b;
    private ArrayList f2237c;
    private ArrayList f2238d;
    private ArrayList f2239e;
    private ArrayList f2240f;
    private ArrayList f2241g;
    private ArrayList f2242h;
    private ArrayList f2243i;
    private ArrayList f2244j;
    private ArrayList f2245k;
    private ArrayList f2246l;
    private DisplayMetrics f2247m;
    private int f2248n;
    private int f2249o;

    public cH() {
        this.f2248n = 0;
        this.f2249o = 2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setToDefaults();
        this.f2247m = KonyMain.getAppContext().getResources().getDisplayMetrics();
        if (KonyMain.f3657e) {
            Log.d("KonyResourceHandler", "Absolute width of display in pixels :" + this.f2247m.widthPixels);
        }
        if (KonyMain.f3657e) {
            Log.d("KonyResourceHandler", "Absolute height of display in pixels :" + this.f2247m.heightPixels);
        }
        if (KonyMain.f3657e) {
            Log.d("KonyResourceHandler", "Physical width of display in pixels per inch :" + this.f2247m.xdpi);
        }
        if (KonyMain.f3657e) {
            Log.d("KonyResourceHandler", "Physical height of display in pixels per inch :" + this.f2247m.ydpi);
        }
        if (KonyMain.f3657e) {
            Log.d("KonyResourceHandler", "Absolute width of display in pixels (default):" + displayMetrics.widthPixels);
        }
        if (KonyMain.f3657e) {
            Log.d("KonyResourceHandler", "Absolute height of display in pixels (default):" + displayMetrics.heightPixels);
        }
        if (KonyMain.f3657e) {
            Log.d("KonyResourceHandler", "Physical width of display in pixels per inch (default):" + displayMetrics.xdpi);
        }
        if (KonyMain.f3657e) {
            Log.d("KonyResourceHandler", "Physical height of display in pixels per inch (default):" + displayMetrics.ydpi);
        }
        if (KonyMain.f3657e) {
            Log.d("KonyResourceHandler", "Density (default): " + displayMetrics.density);
        }
        if (KonyMain.f3657e) {
            Log.d("KonyResourceHandler", "Density: " + this.f2247m.density);
        }
        float f = ((float) ((int) (((float) this.f2247m.widthPixels) * displayMetrics.density))) / (displayMetrics.density * 160.0f);
        float f2 = ((float) ((int) (((float) this.f2247m.heightPixels) * displayMetrics.density))) / (displayMetrics.density * 160.0f);
        double sqrt = Math.sqrt((double) ((f * f) + (f2 * f2)));
        int i = (int) ((displayMetrics.density * 160.0f) + 0.5f);
        if (KonyMain.f3657e) {
            Log.d("KonyResourceHandler", "Screen Width = " + f);
        }
        if (KonyMain.f3657e) {
            Log.d("KonyResourceHandler", "Screen Height = " + f2);
        }
        if (KonyMain.f3657e) {
            Log.d("KonyResourceHandler", "Screen Diagnol = " + sqrt);
        }
        if (KonyMain.f3657e) {
            Log.d("KonyResourceHandler", "Display density = " + i);
        }
        switch (i) {
            case 120:
                if (sqrt >= 3.0d) {
                    if (sqrt > 4.5d) {
                        this.f2249o = 3;
                        this.f2248n = 31;
                        if (KonyMain.f3657e) {
                            Log.d("KonyResourceHandler", "Display Category : LARGE_LDPI");
                        }
                        this.f2244j = new ArrayList(2);
                        break;
                    }
                    this.f2249o = 2;
                    this.f2248n = 21;
                    if (KonyMain.f3657e) {
                        Log.d("KonyResourceHandler", "Display Category : NORMAL_LDPI");
                    }
                    this.f2240f = new ArrayList(2);
                    break;
                }
                this.f2249o = 1;
                this.f2248n = 11;
                if (KonyMain.f3657e) {
                    Log.d("KonyResourceHandler", "Display Category : SMALL_LDPI");
                }
                this.f2236b = new ArrayList(2);
                break;
            case 160:
                if (sqrt >= 3.0d) {
                    if (sqrt > 4.5d) {
                        this.f2249o = 3;
                        this.f2248n = 32;
                        if (KonyMain.f3657e) {
                            Log.d("KonyResourceHandler", "Display Category : LARGE_MDPI");
                        }
                        this.f2245k = new ArrayList(2);
                        break;
                    }
                    this.f2249o = 2;
                    this.f2248n = 22;
                    if (KonyMain.f3657e) {
                        Log.d("KonyResourceHandler", "Display Category : NORMAL_MDPI");
                    }
                    this.f2241g = new ArrayList(2);
                    break;
                }
                this.f2249o = 1;
                this.f2248n = 12;
                if (KonyMain.f3657e) {
                    Log.d("KonyResourceHandler", "Display Category : SMALL_MDPI");
                }
                this.f2237c = new ArrayList(2);
                break;
            case 240:
                if (sqrt >= 3.0d) {
                    if (sqrt > 4.5d) {
                        this.f2249o = 3;
                        this.f2248n = 33;
                        if (KonyMain.f3657e) {
                            Log.d("KonyResourceHandler", "Display Category : LARGE_HDPI");
                        }
                        this.f2246l = new ArrayList(2);
                        break;
                    }
                    this.f2249o = 2;
                    this.f2248n = 23;
                    if (KonyMain.f3657e) {
                        Log.d("KonyResourceHandler", "Display Category : NORMAL_HDPI");
                    }
                    this.f2242h = new ArrayList(2);
                    break;
                }
                this.f2249o = 1;
                this.f2248n = 13;
                if (KonyMain.f3657e) {
                    Log.d("KonyResourceHandler", "Display Category : SMALL_HDPI");
                }
                this.f2238d = new ArrayList(2);
                break;
        }
        m2123a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2123a() {
        /*
        r9 = this;
        r1 = 0;
        r0 = com.konylabs.android.KonyMain.getAppContext();
        r2 = r0.getAssets();
        r0 = r9.f2249o;	 Catch:{ IOException -> 0x00bc }
        switch(r0) {
            case 1: goto L_0x0014;
            case 2: goto L_0x004c;
            case 3: goto L_0x0084;
            default: goto L_0x000e;
        };
    L_0x000e:
        r0 = r9.f2248n;	 Catch:{ IOException -> 0x02cf }
        switch(r0) {
            case 11: goto L_0x00df;
            case 12: goto L_0x0116;
            case 13: goto L_0x014d;
            case 21: goto L_0x0184;
            case 22: goto L_0x01bb;
            case 23: goto L_0x01f2;
            case 31: goto L_0x0229;
            case 32: goto L_0x0260;
            case 33: goto L_0x0297;
            default: goto L_0x0013;
        };
    L_0x0013:
        return;
    L_0x0014:
        r0 = "small";
        r3 = r2.list(r0);	 Catch:{ IOException -> 0x00bc }
        r0 = new java.util.ArrayList;	 Catch:{ IOException -> 0x00bc }
        r4 = 2;
        r0.<init>(r4);	 Catch:{ IOException -> 0x00bc }
        r9.f2235a = r0;	 Catch:{ IOException -> 0x00bc }
        r4 = r3.length;	 Catch:{ IOException -> 0x00bc }
        r0 = r1;
    L_0x0024:
        if (r0 >= r4) goto L_0x000e;
    L_0x0026:
        r5 = r3[r0];	 Catch:{ IOException -> 0x00bc }
        r6 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x00bc }
        if (r6 == 0) goto L_0x0044;
    L_0x002c:
        r6 = "KonyResourceHandler";
        r7 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00bc }
        r7.<init>();	 Catch:{ IOException -> 0x00bc }
        r8 = "";
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x00bc }
        r7 = r7.append(r5);	 Catch:{ IOException -> 0x00bc }
        r7 = r7.toString();	 Catch:{ IOException -> 0x00bc }
        android.util.Log.d(r6, r7);	 Catch:{ IOException -> 0x00bc }
    L_0x0044:
        r6 = r9.f2235a;	 Catch:{ IOException -> 0x00bc }
        r6.add(r5);	 Catch:{ IOException -> 0x00bc }
        r0 = r0 + 1;
        goto L_0x0024;
    L_0x004c:
        r0 = "normal";
        r3 = r2.list(r0);	 Catch:{ IOException -> 0x00bc }
        r0 = new java.util.ArrayList;	 Catch:{ IOException -> 0x00bc }
        r4 = 2;
        r0.<init>(r4);	 Catch:{ IOException -> 0x00bc }
        r9.f2239e = r0;	 Catch:{ IOException -> 0x00bc }
        r4 = r3.length;	 Catch:{ IOException -> 0x00bc }
        r0 = r1;
    L_0x005c:
        if (r0 >= r4) goto L_0x000e;
    L_0x005e:
        r5 = r3[r0];	 Catch:{ IOException -> 0x00bc }
        r6 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x00bc }
        if (r6 == 0) goto L_0x007c;
    L_0x0064:
        r6 = "KonyResourceHandler";
        r7 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00bc }
        r7.<init>();	 Catch:{ IOException -> 0x00bc }
        r8 = "";
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x00bc }
        r7 = r7.append(r5);	 Catch:{ IOException -> 0x00bc }
        r7 = r7.toString();	 Catch:{ IOException -> 0x00bc }
        android.util.Log.d(r6, r7);	 Catch:{ IOException -> 0x00bc }
    L_0x007c:
        r6 = r9.f2239e;	 Catch:{ IOException -> 0x00bc }
        r6.add(r5);	 Catch:{ IOException -> 0x00bc }
        r0 = r0 + 1;
        goto L_0x005c;
    L_0x0084:
        r0 = "large";
        r3 = r2.list(r0);	 Catch:{ IOException -> 0x00bc }
        r0 = new java.util.ArrayList;	 Catch:{ IOException -> 0x00bc }
        r4 = 2;
        r0.<init>(r4);	 Catch:{ IOException -> 0x00bc }
        r9.f2243i = r0;	 Catch:{ IOException -> 0x00bc }
        r4 = r3.length;	 Catch:{ IOException -> 0x00bc }
        r0 = r1;
    L_0x0094:
        if (r0 >= r4) goto L_0x000e;
    L_0x0096:
        r5 = r3[r0];	 Catch:{ IOException -> 0x00bc }
        r6 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x00bc }
        if (r6 == 0) goto L_0x00b4;
    L_0x009c:
        r6 = "KonyResourceHandler";
        r7 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00bc }
        r7.<init>();	 Catch:{ IOException -> 0x00bc }
        r8 = "";
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x00bc }
        r7 = r7.append(r5);	 Catch:{ IOException -> 0x00bc }
        r7 = r7.toString();	 Catch:{ IOException -> 0x00bc }
        android.util.Log.d(r6, r7);	 Catch:{ IOException -> 0x00bc }
    L_0x00b4:
        r6 = r9.f2243i;	 Catch:{ IOException -> 0x00bc }
        r6.add(r5);	 Catch:{ IOException -> 0x00bc }
        r0 = r0 + 1;
        goto L_0x0094;
    L_0x00bc:
        r0 = move-exception;
        r3 = com.konylabs.android.KonyMain.f3657e;
        if (r3 == 0) goto L_0x000e;
    L_0x00c1:
        r3 = "KonyResourceHandler";
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "";
        r4 = r4.append(r5);
        r0 = r0.getMessage();
        r0 = r4.append(r0);
        r0 = r0.toString();
        android.util.Log.d(r3, r0);
        goto L_0x000e;
    L_0x00df:
        r0 = "small_ldpi";
        r0 = r2.list(r0);	 Catch:{ IOException -> 0x02cf }
        r2 = new java.util.ArrayList;	 Catch:{ IOException -> 0x02cf }
        r3 = 2;
        r2.<init>(r3);	 Catch:{ IOException -> 0x02cf }
        r9.f2236b = r2;	 Catch:{ IOException -> 0x02cf }
        r2 = r0.length;	 Catch:{ IOException -> 0x02cf }
    L_0x00ee:
        if (r1 >= r2) goto L_0x0013;
    L_0x00f0:
        r3 = r0[r1];	 Catch:{ IOException -> 0x02cf }
        r4 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x02cf }
        if (r4 == 0) goto L_0x010e;
    L_0x00f6:
        r4 = "KonyResourceHandler";
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02cf }
        r5.<init>();	 Catch:{ IOException -> 0x02cf }
        r6 = "";
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.append(r3);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.toString();	 Catch:{ IOException -> 0x02cf }
        android.util.Log.d(r4, r5);	 Catch:{ IOException -> 0x02cf }
    L_0x010e:
        r4 = r9.f2236b;	 Catch:{ IOException -> 0x02cf }
        r4.add(r3);	 Catch:{ IOException -> 0x02cf }
        r1 = r1 + 1;
        goto L_0x00ee;
    L_0x0116:
        r0 = "small_mdpi";
        r0 = r2.list(r0);	 Catch:{ IOException -> 0x02cf }
        r2 = new java.util.ArrayList;	 Catch:{ IOException -> 0x02cf }
        r3 = 2;
        r2.<init>(r3);	 Catch:{ IOException -> 0x02cf }
        r9.f2237c = r2;	 Catch:{ IOException -> 0x02cf }
        r2 = r0.length;	 Catch:{ IOException -> 0x02cf }
    L_0x0125:
        if (r1 >= r2) goto L_0x0013;
    L_0x0127:
        r3 = r0[r1];	 Catch:{ IOException -> 0x02cf }
        r4 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x02cf }
        if (r4 == 0) goto L_0x0145;
    L_0x012d:
        r4 = "KonyResourceHandler";
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02cf }
        r5.<init>();	 Catch:{ IOException -> 0x02cf }
        r6 = "";
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.append(r3);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.toString();	 Catch:{ IOException -> 0x02cf }
        android.util.Log.d(r4, r5);	 Catch:{ IOException -> 0x02cf }
    L_0x0145:
        r4 = r9.f2237c;	 Catch:{ IOException -> 0x02cf }
        r4.add(r3);	 Catch:{ IOException -> 0x02cf }
        r1 = r1 + 1;
        goto L_0x0125;
    L_0x014d:
        r0 = "small_hdpi";
        r0 = r2.list(r0);	 Catch:{ IOException -> 0x02cf }
        r2 = new java.util.ArrayList;	 Catch:{ IOException -> 0x02cf }
        r3 = 2;
        r2.<init>(r3);	 Catch:{ IOException -> 0x02cf }
        r9.f2238d = r2;	 Catch:{ IOException -> 0x02cf }
        r2 = r0.length;	 Catch:{ IOException -> 0x02cf }
    L_0x015c:
        if (r1 >= r2) goto L_0x0013;
    L_0x015e:
        r3 = r0[r1];	 Catch:{ IOException -> 0x02cf }
        r4 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x02cf }
        if (r4 == 0) goto L_0x017c;
    L_0x0164:
        r4 = "KonyResourceHandler";
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02cf }
        r5.<init>();	 Catch:{ IOException -> 0x02cf }
        r6 = "";
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.append(r3);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.toString();	 Catch:{ IOException -> 0x02cf }
        android.util.Log.d(r4, r5);	 Catch:{ IOException -> 0x02cf }
    L_0x017c:
        r4 = r9.f2238d;	 Catch:{ IOException -> 0x02cf }
        r4.add(r3);	 Catch:{ IOException -> 0x02cf }
        r1 = r1 + 1;
        goto L_0x015c;
    L_0x0184:
        r0 = "normal_ldpi";
        r0 = r2.list(r0);	 Catch:{ IOException -> 0x02cf }
        r2 = new java.util.ArrayList;	 Catch:{ IOException -> 0x02cf }
        r3 = 2;
        r2.<init>(r3);	 Catch:{ IOException -> 0x02cf }
        r9.f2240f = r2;	 Catch:{ IOException -> 0x02cf }
        r2 = r0.length;	 Catch:{ IOException -> 0x02cf }
    L_0x0193:
        if (r1 >= r2) goto L_0x0013;
    L_0x0195:
        r3 = r0[r1];	 Catch:{ IOException -> 0x02cf }
        r4 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x02cf }
        if (r4 == 0) goto L_0x01b3;
    L_0x019b:
        r4 = "KonyResourceHandler";
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02cf }
        r5.<init>();	 Catch:{ IOException -> 0x02cf }
        r6 = "";
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.append(r3);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.toString();	 Catch:{ IOException -> 0x02cf }
        android.util.Log.d(r4, r5);	 Catch:{ IOException -> 0x02cf }
    L_0x01b3:
        r4 = r9.f2240f;	 Catch:{ IOException -> 0x02cf }
        r4.add(r3);	 Catch:{ IOException -> 0x02cf }
        r1 = r1 + 1;
        goto L_0x0193;
    L_0x01bb:
        r0 = "normal_mdpi";
        r0 = r2.list(r0);	 Catch:{ IOException -> 0x02cf }
        r2 = new java.util.ArrayList;	 Catch:{ IOException -> 0x02cf }
        r3 = 2;
        r2.<init>(r3);	 Catch:{ IOException -> 0x02cf }
        r9.f2241g = r2;	 Catch:{ IOException -> 0x02cf }
        r2 = r0.length;	 Catch:{ IOException -> 0x02cf }
    L_0x01ca:
        if (r1 >= r2) goto L_0x0013;
    L_0x01cc:
        r3 = r0[r1];	 Catch:{ IOException -> 0x02cf }
        r4 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x02cf }
        if (r4 == 0) goto L_0x01ea;
    L_0x01d2:
        r4 = "KonyResourceHandler";
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02cf }
        r5.<init>();	 Catch:{ IOException -> 0x02cf }
        r6 = "";
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.append(r3);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.toString();	 Catch:{ IOException -> 0x02cf }
        android.util.Log.d(r4, r5);	 Catch:{ IOException -> 0x02cf }
    L_0x01ea:
        r4 = r9.f2241g;	 Catch:{ IOException -> 0x02cf }
        r4.add(r3);	 Catch:{ IOException -> 0x02cf }
        r1 = r1 + 1;
        goto L_0x01ca;
    L_0x01f2:
        r0 = "normal_hdpi";
        r0 = r2.list(r0);	 Catch:{ IOException -> 0x02cf }
        r2 = new java.util.ArrayList;	 Catch:{ IOException -> 0x02cf }
        r3 = 2;
        r2.<init>(r3);	 Catch:{ IOException -> 0x02cf }
        r9.f2242h = r2;	 Catch:{ IOException -> 0x02cf }
        r2 = r0.length;	 Catch:{ IOException -> 0x02cf }
    L_0x0201:
        if (r1 >= r2) goto L_0x0013;
    L_0x0203:
        r3 = r0[r1];	 Catch:{ IOException -> 0x02cf }
        r4 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x02cf }
        if (r4 == 0) goto L_0x0221;
    L_0x0209:
        r4 = "KonyResourceHandler";
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02cf }
        r5.<init>();	 Catch:{ IOException -> 0x02cf }
        r6 = "";
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.append(r3);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.toString();	 Catch:{ IOException -> 0x02cf }
        android.util.Log.d(r4, r5);	 Catch:{ IOException -> 0x02cf }
    L_0x0221:
        r4 = r9.f2242h;	 Catch:{ IOException -> 0x02cf }
        r4.add(r3);	 Catch:{ IOException -> 0x02cf }
        r1 = r1 + 1;
        goto L_0x0201;
    L_0x0229:
        r0 = "large_ldpi";
        r0 = r2.list(r0);	 Catch:{ IOException -> 0x02cf }
        r2 = new java.util.ArrayList;	 Catch:{ IOException -> 0x02cf }
        r3 = 2;
        r2.<init>(r3);	 Catch:{ IOException -> 0x02cf }
        r9.f2244j = r2;	 Catch:{ IOException -> 0x02cf }
        r2 = r0.length;	 Catch:{ IOException -> 0x02cf }
    L_0x0238:
        if (r1 >= r2) goto L_0x0013;
    L_0x023a:
        r3 = r0[r1];	 Catch:{ IOException -> 0x02cf }
        r4 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x02cf }
        if (r4 == 0) goto L_0x0258;
    L_0x0240:
        r4 = "KonyResourceHandler";
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02cf }
        r5.<init>();	 Catch:{ IOException -> 0x02cf }
        r6 = "";
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.append(r3);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.toString();	 Catch:{ IOException -> 0x02cf }
        android.util.Log.d(r4, r5);	 Catch:{ IOException -> 0x02cf }
    L_0x0258:
        r4 = r9.f2244j;	 Catch:{ IOException -> 0x02cf }
        r4.add(r3);	 Catch:{ IOException -> 0x02cf }
        r1 = r1 + 1;
        goto L_0x0238;
    L_0x0260:
        r0 = "large_mdpi";
        r0 = r2.list(r0);	 Catch:{ IOException -> 0x02cf }
        r2 = new java.util.ArrayList;	 Catch:{ IOException -> 0x02cf }
        r3 = 2;
        r2.<init>(r3);	 Catch:{ IOException -> 0x02cf }
        r9.f2245k = r2;	 Catch:{ IOException -> 0x02cf }
        r2 = r0.length;	 Catch:{ IOException -> 0x02cf }
    L_0x026f:
        if (r1 >= r2) goto L_0x0013;
    L_0x0271:
        r3 = r0[r1];	 Catch:{ IOException -> 0x02cf }
        r4 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x02cf }
        if (r4 == 0) goto L_0x028f;
    L_0x0277:
        r4 = "KonyResourceHandler";
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02cf }
        r5.<init>();	 Catch:{ IOException -> 0x02cf }
        r6 = "";
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.append(r3);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.toString();	 Catch:{ IOException -> 0x02cf }
        android.util.Log.d(r4, r5);	 Catch:{ IOException -> 0x02cf }
    L_0x028f:
        r4 = r9.f2245k;	 Catch:{ IOException -> 0x02cf }
        r4.add(r3);	 Catch:{ IOException -> 0x02cf }
        r1 = r1 + 1;
        goto L_0x026f;
    L_0x0297:
        r0 = "large_hdpi";
        r2 = r2.list(r0);	 Catch:{ IOException -> 0x02cf }
        r0 = new java.util.ArrayList;	 Catch:{ IOException -> 0x02cf }
        r3 = 2;
        r0.<init>(r3);	 Catch:{ IOException -> 0x02cf }
        r9.f2246l = r0;	 Catch:{ IOException -> 0x02cf }
        r3 = r2.length;	 Catch:{ IOException -> 0x02cf }
        r0 = r1;
    L_0x02a7:
        if (r0 >= r3) goto L_0x0013;
    L_0x02a9:
        r1 = r2[r0];	 Catch:{ IOException -> 0x02cf }
        r4 = com.konylabs.android.KonyMain.f3657e;	 Catch:{ IOException -> 0x02cf }
        if (r4 == 0) goto L_0x02c7;
    L_0x02af:
        r4 = "KonyResourceHandler";
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02cf }
        r5.<init>();	 Catch:{ IOException -> 0x02cf }
        r6 = "";
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.append(r1);	 Catch:{ IOException -> 0x02cf }
        r5 = r5.toString();	 Catch:{ IOException -> 0x02cf }
        android.util.Log.d(r4, r5);	 Catch:{ IOException -> 0x02cf }
    L_0x02c7:
        r4 = r9.f2246l;	 Catch:{ IOException -> 0x02cf }
        r4.add(r1);	 Catch:{ IOException -> 0x02cf }
        r0 = r0 + 1;
        goto L_0x02a7;
    L_0x02cf:
        r0 = move-exception;
        r1 = com.konylabs.android.KonyMain.f3657e;
        if (r1 == 0) goto L_0x0013;
    L_0x02d4:
        r1 = "KonyResourceHandler";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "";
        r2 = r2.append(r3);
        r0 = r0.getMessage();
        r0 = r2.append(r0);
        r0 = r0.toString();
        android.util.Log.d(r1, r0);
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: ny0k.cH.a():void");
    }
}
