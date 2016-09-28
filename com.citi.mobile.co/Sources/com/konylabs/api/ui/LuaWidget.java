package com.konylabs.api.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Looper;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.widget.ExploreByTouchHelper;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.konylabs.android.KonyMain;
import com.konylabs.js.api.KonyJSObject;
import com.konylabs.vm.LuaNil;
import com.konylabs.vm.LuaTable;
import com.rsa.mobilesdk.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import ny0k.C0288a;
import ny0k.C0300p;
import ny0k.C0303s;
import ny0k.C0305u;
import ny0k.C0306w;
import ny0k.C0426c;
import ny0k.C0427g;
import ny0k.C0429v;
import ny0k.bO;
import ny0k.bU;
import ny0k.cr;

public abstract class LuaWidget extends KonyJSObject implements C0211m {
    public static String ANIMATION_EFFECT_COLLAPSE = null;
    public static String ANIMATION_EFFECT_EXPAND = null;
    public static String ANIMATION_EFFECT_FADE = null;
    public static String ANIMATION_EFFECT_FLIP_LEFT = null;
    public static String ANIMATION_EFFECT_FLIP_LEFT_REVERSE = null;
    public static String ANIMATION_EFFECT_FLIP_RIGHT = null;
    public static String ANIMATION_EFFECT_FLIP_RIGHT_REVERSE = null;
    public static String ANIMATION_EFFECT_PLATFORM_DEFAULT = null;
    public static String ANIMATION_EFFECT_PLATFORM_NONE = null;
    public static String ANIMATION_EFFECT_REVEAL = null;
    public static String ATTR_WIDGET_ACCESSIBILITY_CONFIG = null;
    public static String ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_HIDDEN = null;
    public static String ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_HINT = null;
    public static String ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_LABEL = null;
    public static String ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_VALUE = null;
    public static String ATTR_WIDGET_ACCESSIBILITY_CONFIG_HINT = null;
    public static String ATTR_WIDGET_ALIGN = null;
    public static String ATTR_WIDGET_ALIGNMENT = null;
    public static String ATTR_WIDGET_ANIMATE_NOW = null;
    public static String ATTR_WIDGET_ANIMATION = null;
    public static String ATTR_WIDGET_ANIMATION_CALLBACKS = null;
    public static String ATTR_WIDGET_ANIMATION_CONFIG = null;
    public static final int ATTR_WIDGET_ANIMATION_CURVE_EASEIN = 0;
    public static final int ATTR_WIDGET_ANIMATION_CURVE_EASEINOUT = 2;
    public static final int ATTR_WIDGET_ANIMATION_CURVE_EASEOUT = 1;
    public static final int ATTR_WIDGET_ANIMATION_CURVE_LINEAR = 3;
    public static String ATTR_WIDGET_ANIMATION_DELAY = null;
    public static String ATTR_WIDGET_ANIMATION_DIRECTION = null;
    public static String ATTR_WIDGET_ANIMATION_DURATION = null;
    public static String ATTR_WIDGET_ANIMATION_EVENTS = null;
    public static String ATTR_WIDGET_ANIMATION_EVENTS_END = null;
    public static String ATTR_WIDGET_ANIMATION_EVENTS_ITERATION_END = null;
    public static String ATTR_WIDGET_ANIMATION_EVENTS_START = null;
    public static String ATTR_WIDGET_ANIMATION_FILL_MODE = null;
    public static String ATTR_WIDGET_ANIMATION_ID = null;
    public static String ATTR_WIDGET_ANIMATION_ITERATION_COUNT = null;
    public static String ATTR_WIDGET_ANIM_CALLBACKS = null;
    public static String ATTR_WIDGET_ANIM_CURVE = null;
    public static String ATTR_WIDGET_ANIM_DELAY = null;
    public static String ATTR_WIDGET_ANIM_DURATION = null;
    public static String ATTR_WIDGET_ANIM_EFFECT = null;
    public static String ATTR_WIDGET_ANIM_ENDED = null;
    public static String ATTR_WIDGET_ANIM_STARTED = null;
    public static final String ATTR_WIDGET_BADGE_SKIN = "badgeskin";
    public static final String ATTR_WIDGET_BADGE_TEXT = "badgetext";
    public static String ATTR_WIDGET_CONTAINER_HEIGHT = null;
    public static String ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE = null;
    public static String ATTR_WIDGET_CONTAINER_WEIGHT = null;
    public static String ATTR_WIDGET_ENABLE = null;
    public static String ATTR_WIDGET_FOCUS_SKIN = null;
    public static String ATTR_WIDGET_HEIGHT = null;
    public static String ATTR_WIDGET_HEXPAND = null;
    public static final String ATTR_WIDGET_HIGHLIGHT_ON_PARENT_FOCUS = "highlightOnParentFocus";
    public static String ATTR_WIDGET_ID = null;
    public static String ATTR_WIDGET_ISVISIBLE = null;
    public static String ATTR_WIDGET_LABEL = null;
    public static String ATTR_WIDGET_LAYOUT_ANIM_CONFIG = null;
    public static String ATTR_WIDGET_Label_I18NKEY = null;
    public static String ATTR_WIDGET_MARGIN = null;
    public static String ATTR_WIDGET_MARGIN_IN_PIXEL = null;
    public static String ATTR_WIDGET_PADDING = null;
    public static String ATTR_WIDGET_PADDING_IN_PIXEL = null;
    public static String ATTR_WIDGET_PLATFORMSPECIFIC = null;
    public static String ATTR_WIDGET_PROP_DEPRECATED = null;
    public static String ATTR_WIDGET_SET_ENABLED = null;
    public static String ATTR_WIDGET_SKIN = null;
    public static String ATTR_WIDGET_VEXPAND = null;
    public static String ATTR_WIDGET_VISIBLE = null;
    public static String ATTR_WIDGET_WIDTH = null;
    public static final int CONTAINER_HEIGHT_BY_DEVICE_REFERENCE = 3;
    public static final int CONTAINER_HEIGHT_BY_FORM_REFERENCE = 1;
    public static final int CONTAINER_HEIGHT_BY_PARENT_WIDTH = 2;
    protected static int f3528H = 0;
    public static int KONY_ANIMATION_DURATION = 0;
    public static int KONY_WIDGET_BACKUP = 0;
    public static final int KONY_WIDGET_POS_BOTTOM_CENTER = 81;
    public static final int KONY_WIDGET_POS_BOTTOM_LEFT = 83;
    public static final int KONY_WIDGET_POS_BOTTOM_RIGHT = 85;
    public static final int KONY_WIDGET_POS_MIDDLE_CENTER = 17;
    public static final int KONY_WIDGET_POS_MIDDLE_LEFT = 19;
    public static final int KONY_WIDGET_POS_MIDDLE_RIGHT = 21;
    public static final int KONY_WIDGET_POS_TOP_CENTER = 49;
    public static final int KONY_WIDGET_POS_TOP_LEFT = 51;
    public static final int KONY_WIDGET_POS_TOP_RIGHT = 53;
    public static int KONY_WIDGET_RESTORE = 0;
    protected static int f3529O = 0;
    public static final int RETAIN_SPACE_FALSE = 0;
    public static final int RETAIN_SPACE_TRUE = 1;
    public static final int RETAIN_SPACE_UNSET = -1;
    public static final int VAL_ATTR_ALIGN_BOTTOM_CENTER = 8;
    public static final int VAL_ATTR_ALIGN_BOTTOM_LEFT = 7;
    public static final int VAL_ATTR_ALIGN_BOTTOM_RIGHT = 9;
    public static final int VAL_ATTR_ALIGN_MIDDLE_CENTER = 5;
    public static final int VAL_ATTR_ALIGN_MIDDLE_LEFT = 4;
    public static final int VAL_ATTR_ALIGN_MIDDLE_RIGHT = 6;
    public static final int VAL_ATTR_ALIGN_TOP_CENTER = 2;
    public static final int VAL_ATTR_ALIGN_TOP_LEFT = 1;
    public static final int VAL_ATTR_ALIGN_TOP_RIGHT = 3;
    public static final String WIDGET_CLONE_ID = "cloneId";
    protected int f3530E;
    protected Boolean f3531F;
    protected boolean f3532G;
    protected LuaWidget f3533I;
    protected int f3534J;
    protected LuaWidget[] f3535K;
    protected Vector f3536L;
    protected int f3537M;
    protected float f3538N;
    private int f3539a;
    private float f3540b;
    public boolean bRegisterForHeightChange;
    private bU f3541c;
    public LuaTable mBasicConfig;
    public LuaTable mLayoutConfig;
    public LuaTable mPspConfig;

    static {
        ATTR_WIDGET_ID = "id";
        ATTR_WIDGET_SKIN = "skin";
        ATTR_WIDGET_FOCUS_SKIN = "focusskin";
        ATTR_WIDGET_ISVISIBLE = "isvisible";
        ATTR_WIDGET_VISIBLE = "visible";
        ATTR_WIDGET_CONTAINER_WEIGHT = "containerweight";
        ATTR_WIDGET_HEXPAND = "hexpand";
        ATTR_WIDGET_VEXPAND = "vexpand";
        ATTR_WIDGET_PLATFORMSPECIFIC = "platformspecificattributes";
        ATTR_WIDGET_ALIGN = "widgetalign";
        ATTR_WIDGET_ALIGNMENT = "widgetalignment";
        ATTR_WIDGET_SET_ENABLED = "setenabled";
        ATTR_WIDGET_ENABLE = "enable";
        ATTR_WIDGET_LABEL = "text";
        ATTR_WIDGET_Label_I18NKEY = "i18nkey";
        ATTR_WIDGET_MARGIN = "margin";
        ATTR_WIDGET_PADDING = "padding";
        ATTR_WIDGET_PROP_DEPRECATED = "deprecated";
        ATTR_WIDGET_MARGIN_IN_PIXEL = "margininpixel";
        ATTR_WIDGET_PADDING_IN_PIXEL = "paddinginpixel";
        ATTR_WIDGET_ANIMATION = "animation";
        ATTR_WIDGET_ANIMATE_NOW = "animatenow";
        ATTR_WIDGET_ACCESSIBILITY_CONFIG = "accessibilityconfig";
        ATTR_WIDGET_ACCESSIBILITY_CONFIG_HINT = "hint";
        ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_LABEL = "a11yLabel";
        ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_VALUE = "a11yValue";
        ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_HINT = "a11yHint";
        ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_HIDDEN = "a11yHidden";
        ATTR_WIDGET_ANIMATION_EVENTS = "animationevents";
        ATTR_WIDGET_ANIMATION_EVENTS_START = "animationstarted";
        ATTR_WIDGET_ANIMATION_EVENTS_END = "animationended";
        ATTR_WIDGET_ANIMATION_EVENTS_ITERATION_END = "animationiterationended";
        ATTR_WIDGET_ANIMATION_ID = "animationid";
        ATTR_WIDGET_ANIMATION_DELAY = "animation-delay";
        ATTR_WIDGET_ANIMATION_DURATION = "animation-duration";
        ATTR_WIDGET_ANIMATION_CONFIG = "animationconfig";
        ATTR_WIDGET_ANIMATION_CALLBACKS = "animationcallbacks";
        ATTR_WIDGET_ANIMATION_DIRECTION = "animation-direction";
        ATTR_WIDGET_ANIMATION_FILL_MODE = "animation-fill-mode";
        ATTR_WIDGET_ANIMATION_ITERATION_COUNT = "animation-iteration-count";
        ATTR_WIDGET_WIDTH = "width";
        ATTR_WIDGET_HEIGHT = "height";
        ATTR_WIDGET_LAYOUT_ANIM_CONFIG = "layoutAnimConfig";
        ATTR_WIDGET_ANIM_EFFECT = "animEffect";
        ATTR_WIDGET_ANIM_CALLBACKS = "animCallBacks";
        ATTR_WIDGET_ANIM_CURVE = "animCurve";
        ATTR_WIDGET_ANIM_DELAY = "animDelay";
        ATTR_WIDGET_ANIM_DURATION = "animDuration";
        ATTR_WIDGET_ANIM_STARTED = "animStarted";
        ATTR_WIDGET_ANIM_ENDED = "animEnded";
        ANIMATION_EFFECT_EXPAND = "expand";
        ANIMATION_EFFECT_COLLAPSE = "collapse";
        ANIMATION_EFFECT_FADE = "fade";
        ANIMATION_EFFECT_REVEAL = "reveal";
        ANIMATION_EFFECT_FLIP_RIGHT = "flipcw";
        ANIMATION_EFFECT_FLIP_RIGHT_REVERSE = "flipcw_reverse";
        ANIMATION_EFFECT_FLIP_LEFT = "flipccw";
        ANIMATION_EFFECT_FLIP_LEFT_REVERSE = "flipccw_reverse";
        ANIMATION_EFFECT_PLATFORM_DEFAULT = "default";
        ANIMATION_EFFECT_PLATFORM_NONE = "none";
        ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE = "containerheightreference";
        ATTR_WIDGET_CONTAINER_HEIGHT = "containerheight";
        if (KonyMain.m4057C()) {
            ATTR_WIDGET_FOCUS_SKIN = "focusSkin";
            ATTR_WIDGET_ISVISIBLE = "isVisible";
            ATTR_WIDGET_CONTAINER_WEIGHT = "containerWeight";
            ATTR_WIDGET_HEXPAND = "hExpand";
            ATTR_WIDGET_VEXPAND = "vExpand";
            ATTR_WIDGET_ALIGNMENT = "widgetAlignment";
            ATTR_WIDGET_ALIGN = "widgetAlignment";
            ATTR_WIDGET_MARGIN_IN_PIXEL = "marginInPixel";
            ATTR_WIDGET_PADDING_IN_PIXEL = "paddingInPixel";
            ATTR_WIDGET_ACCESSIBILITY_CONFIG = "accessibilityConfig";
            ATTR_WIDGET_ANIMATE_NOW = "animateNow";
            ATTR_WIDGET_ANIMATION_EVENTS = "animationEvents";
            ATTR_WIDGET_ANIMATION_EVENTS_START = "animationStarted";
            ATTR_WIDGET_ANIMATION_EVENTS_END = "animationEnded";
            ATTR_WIDGET_ANIMATION_ID = "animationId";
            ATTR_WIDGET_ANIMATION_EVENTS_ITERATION_END = "animationIterationEnded";
            ATTR_WIDGET_ANIMATION_CONFIG = "animationConfig";
            ATTR_WIDGET_ANIMATION_CALLBACKS = "animationCallbacks";
            ATTR_WIDGET_CONTAINER_HEIGHT_REFERENCE = "containerHeightReference";
            ATTR_WIDGET_CONTAINER_HEIGHT = "containerHeight";
        }
        KONY_WIDGET_BACKUP = RETAIN_SPACE_FALSE;
        KONY_WIDGET_RESTORE = VAL_ATTR_ALIGN_TOP_LEFT;
        KONY_ANIMATION_DURATION = 800;
        f3528H = RETAIN_SPACE_UNSET;
        f3529O = RETAIN_SPACE_UNSET;
    }

    public LuaWidget() {
        this.f3530E = KONY_WIDGET_BACKUP;
        this.f3531F = Boolean.valueOf(true);
        this.bRegisterForHeightChange = false;
        this.f3532G = false;
        this.f3534J = RETAIN_SPACE_FALSE;
        this.f3535K = null;
        this.f3536L = new Vector();
        this.f3537M = VAL_ATTR_ALIGN_TOP_LEFT;
        this.f3538N = -1.0f;
    }

    public LuaWidget(int i, int i2) {
        super(i, i2);
        this.f3530E = KONY_WIDGET_BACKUP;
        this.f3531F = Boolean.valueOf(true);
        this.bRegisterForHeightChange = false;
        this.f3532G = false;
        this.f3534J = RETAIN_SPACE_FALSE;
        this.f3535K = null;
        this.f3536L = new Vector();
        this.f3537M = VAL_ATTR_ALIGN_TOP_LEFT;
        this.f3538N = -1.0f;
    }

    public LuaWidget(int i, int i2, float f, boolean z) {
        super(i, i2, f, z);
        this.f3530E = KONY_WIDGET_BACKUP;
        this.f3531F = Boolean.valueOf(true);
        this.bRegisterForHeightChange = false;
        this.f3532G = false;
        this.f3534J = RETAIN_SPACE_FALSE;
        this.f3535K = null;
        this.f3536L = new Vector();
        this.f3537M = VAL_ATTR_ALIGN_TOP_LEFT;
        this.f3538N = -1.0f;
    }

    public LuaWidget(int i, int i2, boolean z) {
        super(i, i2, z);
        this.f3530E = KONY_WIDGET_BACKUP;
        this.f3531F = Boolean.valueOf(true);
        this.bRegisterForHeightChange = false;
        this.f3532G = false;
        this.f3534J = RETAIN_SPACE_FALSE;
        this.f3535K = null;
        this.f3536L = new Vector();
        this.f3537M = VAL_ATTR_ALIGN_TOP_LEFT;
        this.f3538N = -1.0f;
    }

    public LuaWidget(Object[] objArr) {
        this.f3530E = KONY_WIDGET_BACKUP;
        this.f3531F = Boolean.valueOf(true);
        this.bRegisterForHeightChange = false;
        this.f3532G = false;
        this.f3534J = RETAIN_SPACE_FALSE;
        this.f3535K = null;
        this.f3536L = new Vector();
        this.f3537M = VAL_ATTR_ALIGN_TOP_LEFT;
        this.f3538N = -1.0f;
    }

    private void m3930a(AnimatorSet animatorSet, LuaTable luaTable, C0300p c0300p, boolean z) {
        m3931a(animatorSet, luaTable, c0300p, z, null);
    }

    private void m3931a(AnimatorSet animatorSet, LuaTable luaTable, C0300p c0300p, boolean z, Object obj) {
        m3938c();
        if (animatorSet != null) {
            double doubleValue;
            Object a = cr.m2201a(luaTable.getTable(ATTR_WIDGET_ANIM_DELAY), (int) VAL_ATTR_ALIGN_TOP_LEFT);
            if (a != null) {
                doubleValue = ((Double) a).doubleValue();
                if (doubleValue >= 0.0d) {
                    animatorSet.setStartDelay((long) (doubleValue * 1000.0d));
                } else {
                    animatorSet.setStartDelay(0);
                }
            } else {
                animatorSet.setStartDelay(0);
            }
            a = cr.m2201a(luaTable.getTable(ATTR_WIDGET_ANIM_DURATION), (int) VAL_ATTR_ALIGN_TOP_LEFT);
            if (a != null) {
                doubleValue = ((Double) a).doubleValue();
                if (doubleValue >= 0.0d) {
                    animatorSet.setDuration((long) (doubleValue * 1000.0d));
                } else {
                    animatorSet.setDuration(1000);
                }
            } else {
                animatorSet.setDuration(1000);
            }
            a = cr.m2201a(luaTable.getTable(ATTR_WIDGET_ANIM_CURVE), (int) VAL_ATTR_ALIGN_TOP_LEFT);
            if (a != null) {
                switch (((Double) a).intValue()) {
                    case RETAIN_SPACE_FALSE /*0*/:
                        animatorSet.setInterpolator(z ? new C0305u(new AccelerateInterpolator()) : new AccelerateInterpolator());
                        break;
                    case VAL_ATTR_ALIGN_TOP_LEFT /*1*/:
                        animatorSet.setInterpolator(z ? new C0305u(new DecelerateInterpolator()) : new DecelerateInterpolator());
                        break;
                    case VAL_ATTR_ALIGN_TOP_CENTER /*2*/:
                        animatorSet.setInterpolator(z ? new C0305u(new AccelerateDecelerateInterpolator()) : new AccelerateDecelerateInterpolator());
                        break;
                    default:
                        animatorSet.setInterpolator(z ? new C0305u(new LinearInterpolator()) : new LinearInterpolator());
                        break;
                }
            }
            animatorSet.setInterpolator(z ? new C0305u(new LinearInterpolator()) : new LinearInterpolator());
            animatorSet.addListener(new hZ(this, c0300p, luaTable));
            if (this.f3530E == KONY_WIDGET_RESTORE) {
                if (obj == null) {
                    animatorSet.setTarget(getWidget());
                } else {
                    animatorSet.setTarget(obj);
                }
                animatorSet.start();
            }
        }
    }

    private void m3932a(Animation animation, LuaTable luaTable) {
        if (animation != null) {
            LuaNil table = luaTable.getTable(ATTR_WIDGET_ANIMATION_DELAY);
            if (table != LuaNil.nil) {
                animation.setStartOffset((long) ((Double) table).intValue());
            }
            table = luaTable.getTable(ATTR_WIDGET_ANIMATION_DURATION);
            if (table != LuaNil.nil) {
                animation.setDuration((long) ((Double) table).intValue());
            }
            LuaNil table2 = luaTable.getTable(ATTR_WIDGET_ANIMATION_EVENTS);
            if (table2 != LuaNil.nil) {
                animation.setAnimationListener(new hW(this, ((LuaTable) table2).getTable("animationStart"), ((LuaTable) table2).getTable("animationEnd")));
            }
            if (this.f3530E == KONY_WIDGET_RESTORE) {
                getWidget().startAnimation(animation);
            }
        }
    }

    private void m3933a(Animation animation, LuaTable luaTable, C0300p c0300p, boolean z) {
        m3938c();
        if (animation != null) {
            double doubleValue;
            LuaNil table = luaTable.getTable(ATTR_WIDGET_ANIM_DELAY);
            if (table != LuaNil.nil) {
                doubleValue = ((Double) table).doubleValue();
                if (doubleValue >= 0.0d) {
                    animation.setStartOffset((long) (doubleValue * 1000.0d));
                } else {
                    animation.setStartOffset(0);
                }
            } else {
                animation.setStartOffset(0);
            }
            table = luaTable.getTable(ATTR_WIDGET_ANIM_DURATION);
            if (table != LuaNil.nil) {
                doubleValue = ((Double) table).doubleValue();
                if (doubleValue >= 0.0d) {
                    animation.setDuration((long) (doubleValue * 1000.0d));
                } else {
                    animation.setDuration(1000);
                }
            } else {
                animation.setDuration(1000);
            }
            table = luaTable.getTable(ATTR_WIDGET_ANIM_CURVE);
            if (table != LuaNil.nil) {
                switch (((Double) table).intValue()) {
                    case RETAIN_SPACE_FALSE /*0*/:
                        animation.setInterpolator(z ? new C0305u(new AccelerateInterpolator()) : new AccelerateInterpolator());
                        break;
                    case VAL_ATTR_ALIGN_TOP_LEFT /*1*/:
                        animation.setInterpolator(z ? new C0305u(new DecelerateInterpolator()) : new DecelerateInterpolator());
                        break;
                    case VAL_ATTR_ALIGN_TOP_CENTER /*2*/:
                        animation.setInterpolator(z ? new C0305u(new AccelerateDecelerateInterpolator()) : new AccelerateDecelerateInterpolator());
                        break;
                    default:
                        animation.setInterpolator(z ? new C0305u(new LinearInterpolator()) : new LinearInterpolator());
                        break;
                }
            }
            animation.setAnimationListener(new hX(this, c0300p, luaTable));
            if (this.f3530E == KONY_WIDGET_RESTORE) {
                getWidget().startAnimation(animation);
            }
        }
    }

    static /* synthetic */ void m3934a(LuaWidget luaWidget, Object obj, Object obj2) {
        if (luaWidget.f3530E != KONY_WIDGET_BACKUP) {
            String intern = ((String) obj).intern();
            if (intern == ATTR_WIDGET_ANIMATE_NOW && obj2 != LuaNil.nil) {
                luaWidget.setAnimationNow((LuaTable) obj2);
            }
            if (intern == ATTR_WIDGET_ANIMATION && obj2 != LuaNil.nil) {
                luaWidget.setAnimation();
            }
            if (intern == ATTR_WIDGET_WIDTH && obj2 != LuaNil.nil) {
                luaWidget.setWidth((int) ((((Double) obj2).doubleValue() / 100.0d) * ((double) luaWidget.getParent().getWidget().getMeasuredWidth())));
            }
            if (intern == ATTR_WIDGET_HEIGHT && obj2 != LuaNil.nil) {
                luaWidget.setHeight((int) ((((Double) obj2).doubleValue() / 100.0d) * ((double) luaWidget.getParent().getWidget().getMeasuredHeight())));
            }
        }
    }

    private void m3935a(LuaTable luaTable, C0300p c0300p, boolean z) {
        Animation animationSet;
        View widget = getWidget();
        LuaNil table = luaTable.getTable(ATTR_WIDGET_ANIMATION_ID);
        if (table != LuaNil.nil) {
            if (((String) table).equalsIgnoreCase(ANIMATION_EFFECT_COLLAPSE)) {
                animationSet = new AnimationSet(KonyMain.getActivityContext(), null);
                widget.measure(MeasureSpec.makeMeasureSpec(getParent().getWidget().getMeasuredWidth(), ExploreByTouchHelper.INVALID_ID), MeasureSpec.makeMeasureSpec(RETAIN_SPACE_FALSE, RETAIN_SPACE_FALSE));
                animationSet.addAnimation(new C0303s(widget, false));
                animationSet.setDuration((long) KONY_ANIMATION_DURATION);
                m3932a(animationSet, luaTable);
            } else if (((String) table).equalsIgnoreCase(ANIMATION_EFFECT_EXPAND)) {
                animationSet = new AnimationSet(KonyMain.getActivityContext(), null);
                widget.measure(MeasureSpec.makeMeasureSpec(getParent().getWidget().getMeasuredWidth(), ExploreByTouchHelper.INVALID_ID), MeasureSpec.makeMeasureSpec(RETAIN_SPACE_FALSE, RETAIN_SPACE_FALSE));
                animationSet.addAnimation(new C0303s(widget, true));
                animationSet.setInterpolator(new LinearInterpolator());
                animationSet.setDuration((long) KONY_ANIMATION_DURATION);
                m3932a(animationSet, luaTable);
            }
        }
        table = luaTable.getTable(ATTR_WIDGET_ANIM_EFFECT);
        if (table != LuaNil.nil) {
            AnimatorSet animatorSet;
            if (((String) table).equalsIgnoreCase(ANIMATION_EFFECT_FADE)) {
                if (KonyMain.f3656d >= 11) {
                    animatorSet = new AnimatorSet();
                    animatorSet.play(ObjectAnimator.ofFloat(getWidget(), "alpha", new float[]{1.0f, 0.0f}));
                    m3930a(animatorSet, luaTable, c0300p, z);
                    return;
                }
                m3933a(C0288a.m1858a((String) table), luaTable, c0300p, z);
            } else if (((String) table).equalsIgnoreCase(ANIMATION_EFFECT_REVEAL)) {
                if (KonyMain.f3656d >= 11) {
                    animatorSet = new AnimatorSet();
                    animatorSet.play(ObjectAnimator.ofFloat(getWidget(), "alpha", new float[]{0.0f, 1.0f}));
                    m3930a(animatorSet, luaTable, c0300p, z);
                    return;
                }
                m3933a(C0288a.m1858a((String) table), luaTable, c0300p, z);
            } else if (((String) table).equalsIgnoreCase(ANIMATION_EFFECT_FLIP_RIGHT)) {
                if (KonyMain.f3656d >= 11) {
                    r1 = new AnimatorSet();
                    r0 = z ? ObjectAnimator.ofFloat(getWidget(), "rotationY", new float[]{0.0f, 90.0f}) : ObjectAnimator.ofFloat(getWidget(), "rotationY", new float[]{0.0f, -90.0f});
                    r4 = ObjectAnimator.ofFloat(getWidget(), "scaleX", new float[]{1.0f, 0.4f});
                    r5 = ObjectAnimator.ofFloat(getWidget(), "scaleY", new float[]{1.0f, 0.9f});
                    widget.setPivotX((float) (widget.getMeasuredWidth() / VAL_ATTR_ALIGN_TOP_CENTER));
                    widget.setPivotY((float) (widget.getMeasuredHeight() / VAL_ATTR_ALIGN_TOP_CENTER));
                    r3 = new Animator[VAL_ATTR_ALIGN_TOP_RIGHT];
                    r3[RETAIN_SPACE_FALSE] = r0;
                    r3[VAL_ATTR_ALIGN_TOP_LEFT] = r4;
                    r3[VAL_ATTR_ALIGN_TOP_CENTER] = r5;
                    r1.playTogether(r3);
                    m3930a(r1, luaTable, c0300p, z);
                    return;
                }
                widget.measure(MeasureSpec.makeMeasureSpec(getParent() != null ? getParent().getWidget().getMeasuredWidth() : RETAIN_SPACE_FALSE, ExploreByTouchHelper.INVALID_ID), MeasureSpec.makeMeasureSpec(RETAIN_SPACE_FALSE, RETAIN_SPACE_FALSE));
                r1 = new AnimationSet(KonyMain.getActivityContext(), null);
                animationSet = z ? new C0306w(widget, RETAIN_SPACE_FALSE, 90) : new C0306w(widget, RETAIN_SPACE_FALSE, -90);
                r1.addAnimation(animationSet);
                m3933a(animationSet, luaTable, c0300p, z);
            } else if (((String) table).equalsIgnoreCase(ANIMATION_EFFECT_FLIP_LEFT)) {
                if (KonyMain.f3656d >= 11) {
                    r1 = new AnimatorSet();
                    r0 = z ? ObjectAnimator.ofFloat(getWidget(), "rotationY", new float[]{0.0f, -90.0f}) : ObjectAnimator.ofFloat(getWidget(), "rotationY", new float[]{0.0f, 90.0f});
                    r4 = ObjectAnimator.ofFloat(getWidget(), "scaleX", new float[]{1.0f, 0.4f});
                    r5 = ObjectAnimator.ofFloat(getWidget(), "scaleY", new float[]{1.0f, 0.9f});
                    widget.setPivotX((float) (widget.getMeasuredWidth() / VAL_ATTR_ALIGN_TOP_CENTER));
                    widget.setPivotY((float) (widget.getMeasuredHeight() / VAL_ATTR_ALIGN_TOP_CENTER));
                    r3 = new Animator[VAL_ATTR_ALIGN_TOP_RIGHT];
                    r3[RETAIN_SPACE_FALSE] = r0;
                    r3[VAL_ATTR_ALIGN_TOP_LEFT] = r4;
                    r3[VAL_ATTR_ALIGN_TOP_CENTER] = r5;
                    r1.playTogether(r3);
                    m3930a(r1, luaTable, c0300p, z);
                    return;
                }
                widget.measure(MeasureSpec.makeMeasureSpec(getParent() != null ? getParent().getWidget().getMeasuredWidth() : RETAIN_SPACE_FALSE, ExploreByTouchHelper.INVALID_ID), MeasureSpec.makeMeasureSpec(RETAIN_SPACE_FALSE, RETAIN_SPACE_FALSE));
                r1 = new AnimationSet(KonyMain.getActivityContext(), null);
                animationSet = z ? new C0306w(widget, RETAIN_SPACE_FALSE, -90) : new C0306w(widget, RETAIN_SPACE_FALSE, 90);
                r1.addAnimation(animationSet);
                m3933a(animationSet, luaTable, c0300p, z);
            } else if (((String) table).equalsIgnoreCase("Rotate0To90CW")) {
                r0 = new AnimationSet(KonyMain.getActivityContext(), null);
                r1 = new C0429v(widget, RETAIN_SPACE_FALSE, 90);
                r0.addAnimation(r1);
                m3933a(r1, luaTable, c0300p, z);
            } else if (((String) table).equalsIgnoreCase("Rotate0To90CCW")) {
                r0 = new AnimationSet(KonyMain.getActivityContext(), null);
                r1 = new C0429v(widget, RETAIN_SPACE_FALSE, 90);
                r0.addAnimation(r1);
                r0.setInterpolator(new C0305u());
                m3933a(r1, luaTable, c0300p, z);
            } else if (((String) table).equalsIgnoreCase("RotateFrom90To0CW")) {
                animationSet = new AnimationSet(KonyMain.getActivityContext(), null);
                animationSet.addAnimation(new C0429v(widget, -90, RETAIN_SPACE_FALSE));
                m3933a(animationSet, luaTable, c0300p, false);
            } else if (((String) table).equalsIgnoreCase("RotateFrom90To0CCW")) {
                animationSet = new AnimationSet(KonyMain.getActivityContext(), null);
                animationSet.addAnimation(new C0429v(widget, -90, RETAIN_SPACE_FALSE));
                animationSet.setInterpolator(new C0305u());
                m3933a(animationSet, luaTable, c0300p, z);
            } else if (((String) table).equalsIgnoreCase(ANIMATION_EFFECT_COLLAPSE)) {
                widget.measure(MeasureSpec.makeMeasureSpec(getParent() != null ? getParent().getWidget().getMeasuredWidth() : RETAIN_SPACE_FALSE, ExploreByTouchHelper.INVALID_ID), MeasureSpec.makeMeasureSpec(RETAIN_SPACE_FALSE, RETAIN_SPACE_FALSE));
                if (KonyMain.f3656d >= 11) {
                    r1 = new AnimatorSet();
                    r3 = new int[VAL_ATTR_ALIGN_TOP_CENTER];
                    r3[RETAIN_SPACE_FALSE] = getWidget().getHeight();
                    r3[VAL_ATTR_ALIGN_TOP_LEFT] = RETAIN_SPACE_FALSE;
                    r1.play(ObjectAnimator.ofInt(this, "height", r3));
                    m3931a(r1, luaTable, c0300p, z, this);
                    return;
                }
                animationSet = new AnimationSet(KonyMain.getActivityContext(), null);
                animationSet.addAnimation(new C0303s(widget, false));
                m3933a(animationSet, luaTable, c0300p, z);
            } else if (((String) table).equalsIgnoreCase(ANIMATION_EFFECT_EXPAND)) {
                widget.measure(MeasureSpec.makeMeasureSpec(getParent() != null ? getParent().getWidget().getMeasuredWidth() : RETAIN_SPACE_FALSE, ExploreByTouchHelper.INVALID_ID), MeasureSpec.makeMeasureSpec(RETAIN_SPACE_FALSE, RETAIN_SPACE_FALSE));
                if (KonyMain.f3656d >= 11) {
                    r1 = new AnimatorSet();
                    r3 = new int[VAL_ATTR_ALIGN_TOP_CENTER];
                    r3[RETAIN_SPACE_FALSE] = RETAIN_SPACE_FALSE;
                    r3[VAL_ATTR_ALIGN_TOP_LEFT] = d_();
                    r1.play(ObjectAnimator.ofInt(this, "height", r3));
                    m3931a(r1, luaTable, c0300p, z, this);
                    return;
                }
                animationSet = new AnimationSet(KonyMain.getActivityContext(), null);
                animationSet.addAnimation(new C0303s(widget, true));
                m3933a(animationSet, luaTable, c0300p, z);
            } else if (((String) table).equalsIgnoreCase(ANIMATION_EFFECT_PLATFORM_DEFAULT) || ((String) table).equalsIgnoreCase(ANIMATION_EFFECT_PLATFORM_NONE) || ((String) table).equalsIgnoreCase(BuildConfig.FLAVOR)) {
                if (c0300p != null) {
                    c0300p.m2215a();
                }
            } else if (KonyMain.f3656d >= 11) {
                animatorSet = C0288a.m1859b((String) table);
                if (animatorSet != null) {
                    m3930a(animatorSet, luaTable, c0300p, z);
                } else {
                    m3933a(C0288a.m1858a((String) table), luaTable, c0300p, z);
                }
            } else {
                m3933a(C0288a.m1858a((String) table), luaTable, c0300p, z);
            }
        } else if (c0300p != null) {
            c0300p.m2215a();
        }
    }

    protected static boolean m3936a(LuaWidget luaWidget) {
        return ((luaWidget instanceof gZ) && (((gZ) luaWidget).m4228j() || ((gZ) luaWidget).m4229k())) ? false : (luaWidget instanceof eO) || (luaWidget instanceof gH) || (luaWidget instanceof hP) || (luaWidget instanceof bO) || (luaWidget instanceof hq);
    }

    public static void announceAccessibilityHint(String str, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) KonyMain.getAppContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && str != null) {
            KonyMain actContext = KonyMain.getActContext();
            if (actContext != null) {
                View b = (view == null && eK.m3302f()) ? eK.m3294a().m3307b() : view;
                if (b == null) {
                    Object[] m = gL.m4545m();
                    if (!(m == null || m.length <= 0 || m[RETAIN_SPACE_FALSE] == null)) {
                        b = ((LuaWidget) m[RETAIN_SPACE_FALSE]).getWidget();
                    }
                }
                View l = b == null ? actContext.m4164l() : b;
                if (l != null) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain(KonyMain.f3656d < 16 ? VAL_ATTR_ALIGN_BOTTOM_CENTER : AccessibilityNodeInfoCompat.ACTION_COPY);
                    obtain.getText().add(str);
                    obtain.setEnabled(true);
                    obtain.setClassName(l.getClass().getName());
                    obtain.setPackageName(KonyMain.getActContext().getPackageName());
                    new AccessibilityRecordCompat(obtain).setSource(l);
                    accessibilityManager.sendAccessibilityEvent(obtain);
                }
            }
        }
    }

    private Object m3937b() {
        LuaNil table = super.getTable(ATTR_WIDGET_LAYOUT_ANIM_CONFIG);
        return ((table == null || table == LuaNil.nil) && this.f3533I != null) ? this.f3533I.m3937b() : table;
    }

    private void m3938c() {
        if (KonyMain.f3656d >= 11) {
            this.f3539a = d_();
            this.f3540b = getWidget().getAlpha();
        }
    }

    protected static boolean m3939f(Object obj) {
        if (!(obj == null || obj == LuaNil.nil)) {
            LuaNil table = ((LuaTable) obj).getTable(ATTR_WIDGET_ANIM_EFFECT);
            if (!(table == LuaNil.nil || ((String) table).equalsIgnoreCase(ANIMATION_EFFECT_PLATFORM_DEFAULT) || ((String) table).equalsIgnoreCase(ANIMATION_EFFECT_PLATFORM_NONE) || ((String) table).equalsIgnoreCase(BuildConfig.FLAVOR))) {
                return true;
            }
        }
        return false;
    }

    public static void setRetainSpaceOnHide(int i) {
        f3528H = i;
    }

    protected final void m3940J() {
        if (KonyMain.f3656d >= 11) {
            setHeight(this.f3539a);
            getWidget().setAlpha(this.f3540b);
        }
    }

    protected final boolean m3941K() {
        return ((this.f3533I instanceof eO) && ((eO) this.f3533I).f3728q == 0 && !((eO) this.f3533I).f3723l) ? false : true;
    }

    protected int m3942a(boolean z) {
        return z ? RETAIN_SPACE_FALSE : (this.f3532G && f3528H == VAL_ATTR_ALIGN_TOP_LEFT) ? VAL_ATTR_ALIGN_MIDDLE_LEFT : VAL_ATTR_ALIGN_BOTTOM_CENTER;
    }

    protected String m3943a(LuaTable luaTable) {
        return m3944a(luaTable, null);
    }

    protected String m3944a(LuaTable luaTable, String str) {
        String str2 = BuildConfig.FLAVOR;
        if (luaTable == null) {
            return str2;
        }
        LuaNil table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_HINT);
        if (table != LuaNil.nil) {
            return str2 + ((String) table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_HIDDEN);
        if (table != LuaNil.nil && ((Boolean) table).booleanValue()) {
            return null;
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_LABEL);
        if (table != LuaNil.nil) {
            str2 = str2 + ((String) table);
        } else if (str != null) {
            str2 = str2 + str;
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_VALUE);
        if (table != LuaNil.nil) {
            str2 = str2 + ((String) table);
        }
        table = luaTable.getTable(ATTR_WIDGET_ACCESSIBILITY_CONFIG_A11Y_HINT);
        return table != LuaNil.nil ? str2 + ((String) table) : str2;
    }

    protected final void m3945a(LuaWidget luaWidget, int i) {
        if (this.f3535K == null) {
            this.f3535K = new LuaWidget[12];
        }
        LuaWidget[] luaWidgetArr = this.f3535K;
        int i2 = this.f3534J;
        int length = luaWidgetArr.length;
        if (i == i2) {
            if (length == i2) {
                this.f3535K = new LuaWidget[(length + 12)];
                System.arraycopy(luaWidgetArr, RETAIN_SPACE_FALSE, this.f3535K, RETAIN_SPACE_FALSE, length);
                luaWidgetArr = this.f3535K;
            }
            i2 = this.f3534J;
            this.f3534J = i2 + VAL_ATTR_ALIGN_TOP_LEFT;
            luaWidgetArr[i2] = luaWidget;
        } else if (i < i2) {
            if (length == i2) {
                this.f3535K = new LuaWidget[(length + 12)];
                System.arraycopy(luaWidgetArr, RETAIN_SPACE_FALSE, this.f3535K, RETAIN_SPACE_FALSE, i);
                System.arraycopy(luaWidgetArr, i, this.f3535K, i + VAL_ATTR_ALIGN_TOP_LEFT, i2 - i);
                luaWidgetArr = this.f3535K;
            } else {
                System.arraycopy(luaWidgetArr, i, luaWidgetArr, i + VAL_ATTR_ALIGN_TOP_LEFT, i2 - i);
            }
            luaWidgetArr[i] = luaWidget;
            this.f3534J += VAL_ATTR_ALIGN_TOP_LEFT;
        }
    }

    protected void m3946a(Object obj, Object obj2) {
    }

    public void applyAnimation(LuaTable luaTable, Object obj, Object obj2) {
        (KonyMain.f3656d >= 11 ? new C0426c(this) : new C0427g(this)).m2012a(C0288a.m1856a(luaTable), true, obj, obj2);
    }

    protected final int m3947b(LuaWidget luaWidget) {
        if (this.f3535K == null) {
            return RETAIN_SPACE_UNSET;
        }
        int i = this.f3534J;
        LuaWidget[] luaWidgetArr = this.f3535K;
        for (int i2 = RETAIN_SPACE_FALSE; i2 < i; i2 += VAL_ATTR_ALIGN_TOP_LEFT) {
            if (luaWidgetArr[i2] == luaWidget) {
                return i2;
            }
        }
        return RETAIN_SPACE_UNSET;
    }

    protected final void m3948c(Object obj, Object obj2) {
        super.setTable(obj, obj2);
    }

    public abstract void cleanup();

    public int[] convertMarginsToPixels(Object obj, LuaWidget luaWidget) {
        LuaNil table = super.getTable(ATTR_WIDGET_MARGIN_IN_PIXEL);
        return convertToScreenPixels(obj, luaWidget, table != LuaNil.nil ? ((Boolean) table).booleanValue() : false);
    }

    public int[] convertPaddingToPixels(Object obj, LuaWidget luaWidget) {
        LuaNil table = super.getTable(ATTR_WIDGET_PADDING_IN_PIXEL);
        return convertToScreenPixels(obj, luaWidget, table != LuaNil.nil ? ((Boolean) table).booleanValue() : false);
    }

    public int[] convertToScreenPixels(Object obj, LuaWidget luaWidget, boolean z) {
        LuaTable luaTable = (LuaTable) obj;
        int floatValue = (int) ((Double) luaTable.list.get(RETAIN_SPACE_FALSE)).floatValue();
        int floatValue2 = (int) ((Double) luaTable.list.get(VAL_ATTR_ALIGN_TOP_LEFT)).floatValue();
        int floatValue3 = (int) ((Double) luaTable.list.get(VAL_ATTR_ALIGN_TOP_CENTER)).floatValue();
        int floatValue4 = (int) ((Double) luaTable.list.get(VAL_ATTR_ALIGN_TOP_RIGHT)).floatValue();
        if (z) {
            int[] iArr = new int[VAL_ATTR_ALIGN_MIDDLE_LEFT];
            iArr[RETAIN_SPACE_FALSE] = dB.m1116r(floatValue);
            iArr[VAL_ATTR_ALIGN_TOP_LEFT] = dB.m1116r(floatValue2);
            iArr[VAL_ATTR_ALIGN_TOP_CENTER] = dB.m1116r(floatValue3);
            iArr[VAL_ATTR_ALIGN_TOP_RIGHT] = dB.m1116r(floatValue4);
            return iArr;
        }
        int o = KonyMain.getActContext().m4166o();
        if (luaWidget != null && (luaWidget instanceof eO)) {
            o = (int) (((float) o) * ((eO) luaWidget).m4231m());
        }
        floatValue2 = (floatValue2 * o) / 100;
        floatValue3 = (floatValue3 * o) / 100;
        floatValue4 = (o * floatValue4) / 100;
        iArr = new int[VAL_ATTR_ALIGN_MIDDLE_LEFT];
        iArr[RETAIN_SPACE_FALSE] = (floatValue * o) / 100;
        iArr[VAL_ATTR_ALIGN_TOP_LEFT] = floatValue2;
        iArr[VAL_ATTR_ALIGN_TOP_CENTER] = floatValue3;
        iArr[VAL_ATTR_ALIGN_TOP_RIGHT] = floatValue4;
        return iArr;
    }

    public void copyProperties(LuaWidget luaWidget) {
        this.ap = luaWidget.ap;
    }

    public LuaWidget createClone() {
        return null;
    }

    public void createNativeClone(boolean z) {
        if (!this.aq) {
            String cloneId = getCloneId();
            if (cloneId == null) {
                cloneId = getID();
            }
            KonyMain.getActContext();
            this.ap = KonyMain.m4143x().m1770a(this, cloneId, z);
            this.aq = true;
        }
    }

    protected final void m3949d(int i) {
        if (this.f3535K != null) {
            Object obj = this.f3535K;
            int i2 = this.f3534J;
            if (i == i2 + RETAIN_SPACE_UNSET) {
                i2 = this.f3534J + RETAIN_SPACE_UNSET;
                this.f3534J = i2;
                obj[i2] = RETAIN_SPACE_FALSE;
            } else if (i >= 0 && i < i2) {
                System.arraycopy(obj, i + VAL_ATTR_ALIGN_TOP_LEFT, obj, i, (i2 - i) + RETAIN_SPACE_UNSET);
                i2 = this.f3534J + RETAIN_SPACE_UNSET;
                this.f3534J = i2;
                obj[i2] = RETAIN_SPACE_FALSE;
            }
        }
    }

    protected final void m3950d(Object obj, Object obj2) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m3946a(obj, obj2);
        } else {
            KonyMain.m4094a(ig.m3353a(this, obj, obj2));
        }
    }

    protected int d_() {
        return getWidget().getMeasuredHeight();
    }

    public String getBadge() {
        LuaNil table = super.getTable(ATTR_WIDGET_BADGE_TEXT);
        return table != LuaNil.nil ? (String) table : null;
    }

    public int getChildConvertedIndex(int i) {
        if (this.f3536L.isEmpty()) {
            return i;
        }
        int i2 = i;
        for (int i3 = RETAIN_SPACE_FALSE; i3 < this.f3536L.size(); i3 += VAL_ATTR_ALIGN_TOP_LEFT) {
            if (i >= ((Integer) this.f3536L.get(i3)).intValue()) {
                i2 += VAL_ATTR_ALIGN_TOP_LEFT;
            }
        }
        return i2;
    }

    public abstract LuaWidget getChildWidget(String str);

    public abstract ArrayList getChildWidgets();

    public String getCloneId() {
        LuaNil table = super.getTable(WIDGET_CLONE_ID);
        return table != LuaNil.nil ? table.toString() : null;
    }

    public abstract String getID();

    public abstract LuaWidget getParent();

    public abstract Hashtable getProperties();

    public String getPropertiesInfo() {
        return super.toString();
    }

    public abstract Object getProperty(String str);

    public bU getSegUIWidgetType() {
        return this.f3541c;
    }

    public abstract String getType();

    public int getVisible() {
        return ((Boolean) super.getTable(ATTR_WIDGET_ISVISIBLE)).booleanValue() ? VAL_ATTR_ALIGN_TOP_LEFT : RETAIN_SPACE_FALSE;
    }

    public float getWeight() {
        return ((Double) super.getTable(ATTR_WIDGET_CONTAINER_WEIGHT)).floatValue();
    }

    public abstract View getWidget();

    public abstract int getWidth();

    public abstract void handleOrientationChange(int i);

    public boolean isRegisterForHeightChange() {
        return this.bRegisterForHeightChange;
    }

    public void onFormHeightChanged(int i) {
        if (this.f3530E != KONY_WIDGET_BACKUP) {
            m3951p();
        }
    }

    protected void m3951p() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resetWidget(java.util.HashSet r5) {
        /*
        r4 = this;
        r0 = r4.mBasicConfig;
        if (r0 == 0) goto L_0x0044;
    L_0x0004:
        if (r5 == 0) goto L_0x0044;
    L_0x0006:
        r2 = r5.iterator();
    L_0x000a:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0044;
    L_0x0010:
        r0 = r2.next();
        r0 = (java.lang.String) r0;
        r1 = r4.mBasicConfig;
        r1 = r1.getTable(r0);
        r3 = com.konylabs.vm.LuaNil.nil;
        if (r1 != r3) goto L_0x003c;
    L_0x0020:
        r3 = r4.mLayoutConfig;
        if (r3 == 0) goto L_0x002e;
    L_0x0024:
        r1 = r4.mLayoutConfig;
        r1 = r1.getTable(r0);
        r3 = com.konylabs.vm.LuaNil.nil;
        if (r1 != r3) goto L_0x003c;
    L_0x002e:
        r3 = r4.mPspConfig;
        if (r3 == 0) goto L_0x0040;
    L_0x0032:
        r1 = r4.mPspConfig;
        r1 = r1.getTable(r0);
        r3 = com.konylabs.vm.LuaNil.nil;
        if (r1 == r3) goto L_0x0040;
    L_0x003c:
        r4.setTable(r0, r1);
        goto L_0x000a;
    L_0x0040:
        r4.setTable(r0, r1);
        goto L_0x000a;
    L_0x0044:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.ui.LuaWidget.resetWidget(java.util.HashSet):void");
    }

    public void setAnimation() {
        LuaNil table = super.getTable(ATTR_WIDGET_ANIMATION);
        if (table != LuaNil.nil) {
            Object table2 = super.getTable(ATTR_WIDGET_ANIMATION_CONFIG);
            Object table3 = super.getTable(ATTR_WIDGET_ANIMATION_CALLBACKS);
            (KonyMain.f3656d >= 11 ? new C0426c(this) : new C0427g(this)).m2012a(C0288a.m1856a((LuaTable) table), true, table2, table3);
        }
    }

    public void setAnimationNow(LuaTable luaTable) {
        View widget = getWidget();
        LuaNil table = luaTable.getTable(ATTR_WIDGET_ANIMATION_ID);
        if (table == LuaNil.nil) {
            return;
        }
        Animation animationSet;
        if (((String) table).equalsIgnoreCase("Collapse")) {
            animationSet = new AnimationSet(KonyMain.getActivityContext(), null);
            widget.measure(MeasureSpec.makeMeasureSpec(getParent().getWidget().getMeasuredWidth(), ExploreByTouchHelper.INVALID_ID), MeasureSpec.makeMeasureSpec(RETAIN_SPACE_FALSE, RETAIN_SPACE_FALSE));
            animationSet.addAnimation(new C0303s(widget, false));
            animationSet.setDuration((long) KONY_ANIMATION_DURATION);
            m3932a(animationSet, luaTable);
        } else if (((String) table).equalsIgnoreCase("Expand")) {
            animationSet = new AnimationSet(KonyMain.getActivityContext(), null);
            widget.measure(MeasureSpec.makeMeasureSpec(getParent().getWidget().getMeasuredWidth(), ExploreByTouchHelper.INVALID_ID), MeasureSpec.makeMeasureSpec(RETAIN_SPACE_FALSE, RETAIN_SPACE_FALSE));
            animationSet.addAnimation(new C0303s(widget, true));
            animationSet.setInterpolator(new LinearInterpolator());
            animationSet.setDuration((long) KONY_ANIMATION_DURATION);
            m3932a(animationSet, luaTable);
        }
    }

    public void setAnimationNow(LuaTable luaTable, C0300p c0300p) {
        if (luaTable != null) {
            m3935a(luaTable, c0300p, false);
        }
    }

    public void setAnimationNow(LuaTable luaTable, C0300p c0300p, boolean z) {
        if (luaTable != null) {
            m3935a(luaTable, c0300p, z);
        }
    }

    public void setBadge(String str, String str2) {
    }

    public abstract void setEnabled(boolean z);

    public abstract void setFocus();

    public abstract void setFontColor(Object[] objArr);

    public void setHeight() {
        LuaNil table = super.getTable(ATTR_WIDGET_HEIGHT);
        if (table != null && table != LuaNil.nil) {
            setHeight((int) ((((Double) table).doubleValue() / 100.0d) * ((double) getParent().getWidget().getMeasuredHeight())));
        }
    }

    public abstract void setHeight(int i);

    public void setLayoutAnimator(LuaWidget luaWidget) {
        LuaNil b = m3937b();
        if (b != null && b != LuaNil.nil) {
            setAnimationNow((LuaTable) m3937b(), null);
        }
    }

    protected void setParent(LuaWidget luaWidget) {
        this.f3533I = luaWidget;
        if (luaWidget != null) {
            super.setTable(getTable(ATTR_WIDGET_ID), this);
            if ((luaWidget instanceof fv) && m3936a(this)) {
                ((fv) luaWidget).m4435a((C0211m) this);
            }
        }
        if (luaWidget == null && (getParent() instanceof fv) && m3936a(this)) {
            ((fv) getParent()).m4444b((C0211m) this);
        }
        if (m3936a(this)) {
            while (luaWidget != null) {
                if (luaWidget instanceof gL) {
                    this.f3537M = VAL_ATTR_ALIGN_TOP_CENTER;
                }
                luaWidget = luaWidget.getParent();
            }
        }
    }

    public final void setProperty(Object obj, Object obj2) {
        super.setTable(obj, obj2);
    }

    public void setSegUIWidgetType(bU bUVar) {
        this.f3541c = bUVar;
    }

    public void setTable(Object obj, Object obj2) {
        super.setTable(obj, obj2);
        String intern = ((String) obj).intern();
        if (this.f3530E != KONY_WIDGET_BACKUP) {
            if (intern == ATTR_WIDGET_ANIMATE_NOW || intern == ATTR_WIDGET_ANIMATION) {
                KonyMain.m4094a(new hV(this, intern, obj2));
            }
        }
    }

    public abstract void setVisibility(boolean z);

    public void setVisibility(boolean z, Object obj) {
        super.setTable(ATTR_WIDGET_ISVISIBLE, new Boolean(z));
        if (this.f3530E != KONY_WIDGET_RESTORE) {
            return;
        }
        if (m3939f(obj)) {
            long j = 0;
            if (((LuaTable) obj).getTable(ATTR_WIDGET_ANIM_DELAY) != LuaNil.nil) {
                j = (long) (((Double) ((LuaTable) obj).getTable(ATTR_WIDGET_ANIM_DELAY)).doubleValue() * 1000.0d);
                ((LuaTable) obj).setTable(ATTR_WIDGET_ANIM_DELAY, Double.valueOf(0.0d));
            }
            long j2 = j;
            if (this.f3533I != null) {
                this.f3533I.setLayoutAnimator(this);
            }
            getWidget().postDelayed(new hS(this, z, obj), j2);
            return;
        }
        setVisibility(z);
    }

    public void setVisible(int i) {
        setVisibility(i != 0);
    }

    public abstract void setWeight();

    public void setWeight(float f) {
        if ((getParent() instanceof eO) && ((eO) getParent()).f3728q == 0 && ((eO) getParent()).f3723l) {
            super.setTable(ATTR_WIDGET_CONTAINER_WEIGHT, Double.valueOf(Double.parseDouble(Float.toString(f))));
            setWeight();
        }
    }

    public void setWidgetInSegUIEventListener(iq iqVar, eO eOVar) {
    }

    public void setWidth() {
        LuaNil table = super.getTable(ATTR_WIDGET_WIDTH);
        if (table != null && table != LuaNil.nil) {
            setWidth(((int) (((Double) table).doubleValue() / 100.0d)) * getParent().getWidget().getMeasuredWidth());
        }
    }

    public abstract void setWidth(int i);

    public void setX(float f) {
        if (KonyMain.f3656d >= 11) {
            getWidget().setX(((float) getWidget().getLeft()) + f);
        } else {
            getWidget().scrollTo((int) f, getWidget().getScrollY());
        }
    }

    public void setY(float f) {
        if (KonyMain.f3656d >= 11) {
            getWidget().setY(((float) getWidget().getTop()) + f);
        } else {
            getWidget().scrollTo(getWidget().getScrollX(), (int) f);
        }
    }
}
