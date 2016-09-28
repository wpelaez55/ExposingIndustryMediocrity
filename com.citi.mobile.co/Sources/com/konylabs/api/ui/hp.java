package com.konylabs.api.ui;

import android.graphics.Typeface;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import com.konylabs.android.KonyMain;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import java.util.Iterator;
import ny0k.cB;
import ny0k.cN;
import org.json.JSONException;
import org.json.JSONObject;

public final class hp extends LuaTable {
    private static String f3022a;
    private dB f3023b;
    private String f3024c;

    static {
        f3022a = "LuaSkin";
    }

    public hp() {
        this.f3023b = new dB();
    }

    public hp(String str) {
        this.f3024c = str;
        this.f3023b = new dB();
    }

    public static Integer m3347a(Object obj) {
        if (obj == LuaNil.nil || obj == null) {
            Log.e(f3022a, "Invalid color code = " + obj);
        } else {
            String trim = obj.toString().toLowerCase().trim();
            if (trim.startsWith("0x")) {
                trim = trim.substring(2, trim.length());
            }
            if (trim.matches("[0-9a-f]+") && trim.length() == 8) {
                return Integer.valueOf(Integer.rotateRight(Long.valueOf(Long.parseLong(trim, 16)).intValue(), 8));
            }
            Log.e(f3022a, "Invalid color code = " + obj);
        }
        return null;
    }

    public static void m3348a(Object obj, Object obj2, dB dBVar) {
        String intern = ((String) obj).intern();
        if (intern != "use_native" || obj2 == LuaNil.nil) {
            if (intern != "background_color" || obj2 == LuaNil.nil) {
                if (intern == "background_image" && obj2 != LuaNil.nil) {
                    dBVar.m1137d(obj2.toString().trim());
                } else if (intern == "bg_type" && obj2 != LuaNil.nil) {
                    dBVar.m1147h(((String) obj2).intern());
                } else if (intern == "background_style" && obj2 != LuaNil.nil) {
                    dBVar.m1144g(((String) obj2).intern().intern());
                } else if (intern == "background_gradient_top_color" && obj2 != LuaNil.nil) {
                    dBVar.m1135d(m3351b(obj2));
                } else if (intern == "background_gradient_bottom_color" && obj2 != LuaNil.nil) {
                    dBVar.m1138e(m3351b(obj2));
                } else if (intern != "font_weight" || obj2 == LuaNil.nil) {
                    if (intern == "font_style" && obj2 != LuaNil.nil) {
                        intern = ((String) obj2).intern();
                        if (intern == "italic") {
                            if (dBVar.m1152k() == 1) {
                                dBVar.m1141f(3);
                            } else {
                                dBVar.m1141f(2);
                            }
                        } else if (intern == "underline") {
                            dBVar.m1125a(true);
                        }
                    } else if (intern == "font_size" && obj2 != LuaNil.nil) {
                        dBVar.m1119a(new Float(((Double) obj2).doubleValue()).floatValue());
                    } else if (intern == "font_color" && obj2 != LuaNil.nil) {
                        dBVar.m1143g(m3351b(obj2));
                    } else if (intern != "border_color" || obj2 == LuaNil.nil) {
                        if (intern == "border_width" && obj2 != LuaNil.nil) {
                            dBVar.m1146h(((Double) obj2).intValue());
                        } else if ((intern == "border_radius" || intern == "curved_radius") && obj2 != LuaNil.nil) {
                            dBVar.m1120a(((Double) obj2).intValue());
                        } else if (intern == "border_style" && obj2 != LuaNil.nil) {
                            dBVar.m1139e(obj2.toString().trim());
                        } else if (intern == "left_padding" && obj2 != LuaNil.nil) {
                            dBVar.m1149i(((Double) obj2).intValue());
                        } else if (intern == "top_padding" && obj2 != LuaNil.nil) {
                            dBVar.m1151j(((Double) obj2).intValue());
                        } else if (intern == "right_padding" && obj2 != LuaNil.nil) {
                            dBVar.m1153k(((Double) obj2).intValue());
                        } else if (intern == "bottom_padding" && obj2 != LuaNil.nil) {
                            dBVar.m1155l(((Double) obj2).intValue());
                        } else if (intern == "left_margin" && obj2 != LuaNil.nil) {
                            dBVar.m1157m(((Double) obj2).intValue());
                        } else if (intern == "top_margin" && obj2 != LuaNil.nil) {
                            dBVar.m1159n(((Double) obj2).intValue());
                        } else if (intern == "right_margin" && obj2 != LuaNil.nil) {
                            dBVar.m1160o(((Double) obj2).intValue());
                        } else if (intern == "bottom_margin" && obj2 != LuaNil.nil) {
                            dBVar.m1163p(((Double) obj2).intValue());
                        } else if (intern == "transparency" && obj2 != LuaNil.nil) {
                            dBVar.m1164q(((Double) obj2).intValue());
                        } else if (intern == "font_name" && obj2 != LuaNil.nil) {
                            intern = ((String) obj2).intern();
                            if (intern == "monospace") {
                                dBVar.m1122a(Typeface.MONOSPACE);
                            } else if (intern == "serif") {
                                dBVar.m1122a(Typeface.SERIF);
                            } else if (intern == "sans_serif") {
                                dBVar.m1122a(Typeface.SANS_SERIF);
                            } else if (intern == "default_bold") {
                                dBVar.m1122a(Typeface.DEFAULT_BOLD);
                            } else if (intern == "default") {
                                dBVar.m1122a(Typeface.DEFAULT);
                            } else {
                                intern = intern;
                                cB.m2101a();
                                Typeface a = cB.m2100a(intern);
                                if (a == null) {
                                    a = Typeface.DEFAULT;
                                }
                                dBVar.m1122a(a);
                            }
                        } else if (intern == "text_shadow" && obj2 != LuaNil.nil) {
                            m3350a((JSONObject) obj2, dBVar);
                        }
                    } else if (obj2 instanceof JSONObject) {
                        m3349a(intern, (JSONObject) obj2, dBVar);
                    } else {
                        dBVar.m1131c(m3351b(obj2));
                    }
                } else if (((String) obj2).intern() != "bold") {
                } else {
                    if (dBVar.m1152k() == 2) {
                        dBVar.m1141f(3);
                    } else {
                        dBVar.m1141f(1);
                    }
                }
            } else if (obj2 instanceof JSONObject) {
                m3349a(intern, (JSONObject) obj2, dBVar);
            } else {
                dBVar.m1128b(m3351b(obj2));
            }
        } else if (((Boolean) obj2).booleanValue()) {
            dBVar.m1166r();
        }
    }

    private static void m3349a(String str, JSONObject jSONObject, dB dBVar) {
        int[] iArr;
        float[] fArr;
        float[] fArr2 = null;
        Iterator keys = jSONObject.keys();
        int[] iArr2 = null;
        int i = 0;
        String str2 = null;
        while (keys.hasNext()) {
            try {
                String intern = ((String) keys.next()).intern();
                if (intern == "gt") {
                    str2 = (String) jSONObject.get(intern);
                } else if (intern == "angle") {
                    i = ((Integer) jSONObject.get(intern)).intValue();
                } else if (intern == "colors") {
                    r7 = jSONObject.getJSONArray(intern);
                    r8 = r7.length();
                    iArr = new int[r8];
                    int i2 = 0;
                    while (i2 < r8) {
                        try {
                            iArr[i2] = m3351b(r7.get(i2));
                            i2++;
                        } catch (JSONException e) {
                        }
                    }
                    iArr2 = iArr;
                } else {
                    if (intern == "cs") {
                        r7 = jSONObject.getJSONArray(intern);
                        r8 = r7.length();
                        fArr = new float[r8];
                        int i3 = 0;
                        while (i3 < r8) {
                            try {
                                fArr[i3] = ((float) r7.getInt(i3)) / 100.0f;
                                i3++;
                            } catch (JSONException e2) {
                                fArr2 = fArr;
                                iArr = iArr2;
                            }
                        }
                    } else {
                        fArr = fArr2;
                    }
                    fArr2 = fArr;
                }
            } catch (JSONException e3) {
                iArr = iArr2;
                iArr2 = iArr;
            }
        }
        if (str == "background_color") {
            dBVar.m1124a(str2, i, iArr2, fArr2);
        } else if (str == "border_color") {
            dBVar.m1130b(str2, i, iArr2, fArr2);
        }
    }

    private static void m3350a(JSONObject jSONObject, dB dBVar) {
        Iterator keys = jSONObject.keys();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (keys.hasNext()) {
            try {
                String intern = ((String) keys.next()).intern();
                if (intern == "x") {
                    i4 = jSONObject.getInt("x");
                } else if (intern == "y") {
                    i3 = jSONObject.getInt("y");
                } else if (intern == "color") {
                    i2 = m3351b(jSONObject.getString("color"));
                } else {
                    i = intern == "br" ? jSONObject.getInt("br") : i;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        dBVar.m1121a(i4, i3, i, i2);
    }

    public static int m3351b(Object obj) {
        int intValue = Long.valueOf(Long.parseLong(obj.toString().trim(), 16)).intValue();
        int i = ((ViewCompat.MEASURED_STATE_MASK & intValue) + (16711680 & intValue)) + (MotionEventCompat.ACTION_POINTER_INDEX_MASK & intValue);
        intValue &= MotionEventCompat.ACTION_MASK;
        intValue = (intValue < 0 || intValue > 100) ? 0 : ((100 - intValue) * MotionEventCompat.ACTION_MASK) / 100;
        return Integer.rotateRight(intValue + i, 8);
    }

    public final dB m3352a() {
        return this.f3023b == null ? cN.m2145b(this.f3024c) : this.f3023b;
    }

    public final void setTable(Object obj, Object obj2) {
        if (this.f3023b != null) {
            if (KonyMain.f3657e) {
                super.setTable(obj, obj2);
            }
            m3348a(obj, obj2, this.f3023b);
        }
    }
}
