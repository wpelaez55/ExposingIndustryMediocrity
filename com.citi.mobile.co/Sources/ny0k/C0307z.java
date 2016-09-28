package ny0k;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.konylabs.android.KonyMain;

/* renamed from: ny0k.z */
public final class C0307z extends Animation {
    private Bitmap f2362a;
    private Bitmap f2363b;
    private Bitmap f2364c;
    private Bitmap f2365d;
    private LinearLayout f2366e;
    private boolean f2367f;
    private IdleHandler f2368g;
    private Bitmap f2369h;

    public C0307z(boolean z) {
        this.f2366e = null;
        this.f2368g = new C0274A(this);
        this.f2367f = z;
    }

    private static Bitmap m2221a(View view) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (OutOfMemoryError e) {
            if (KonyMain.f3657e) {
                Log.d("KonySplitAnimation", "OOM************************************");
            }
            return null;
        }
    }

    private int m2224b(View view) {
        int top = view.getTop();
        ViewParent parent = view.getParent();
        return (parent == null || !(parent instanceof View)) ? top : m2224b((View) parent) + top;
    }

    public final void m2232a() {
        if (this.f2366e != null) {
            this.f2366e.setVisibility(8);
            this.f2366e.removeAllViews();
            this.f2366e = null;
        }
        MessageQueue myQueue = Looper.myQueue();
        if (myQueue != null) {
            myQueue.addIdleHandler(this.f2368g);
        }
    }

    public final void m2233a(View view, View view2, float f) {
        if (view != null) {
            try {
                if (this.f2366e == null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f2369h = C0307z.m2221a(view);
                    if (this.f2369h != null) {
                        int i;
                        int i2;
                        View view3;
                        View view4;
                        int i3;
                        View linearLayout;
                        int width = this.f2369h.getWidth();
                        int height = this.f2369h.getHeight();
                        float p = f - ((float) (KonyMain.getActContext().m4167p() - height));
                        View view5 = null;
                        int i4 = (int) (p == 0.0f ? ((float) height) * 0.5f : p);
                        int i5 = (int) (p == 0.0f ? ((float) height) * 0.5f : ((float) height) - p);
                        if (view2 == null || view2.getVisibility() == 8) {
                            i = 0;
                            i2 = 0;
                            view3 = null;
                            view4 = null;
                            i3 = i5;
                            i5 = i4;
                        } else {
                            int b = m2224b(view2);
                            i5 = b + view2.getHeight();
                            if (i5 >= height) {
                                i5 = height;
                            } else {
                                view5 = new LinearLayout(KonyMain.getActivityContext());
                                view5.setMinimumHeight(height - i5);
                            }
                            linearLayout = new LinearLayout(KonyMain.getActivityContext());
                            linearLayout.setMinimumHeight(b);
                            i3 = (int) (p == 0.0f ? ((float) view2.getHeight()) * 0.5f : ((float) i5) - p);
                            i = i5;
                            i2 = b;
                            view3 = view5;
                            view4 = linearLayout;
                            i5 = (int) (p == 0.0f ? ((float) view2.getHeight()) * 0.5f : p - ((float) b));
                        }
                        this.f2362a = null;
                        if (width <= this.f2369h.getWidth() && i2 + i5 <= this.f2369h.getHeight() && i5 > 0) {
                            this.f2362a = Bitmap.createBitmap(this.f2369h, 0, i2, width, i5);
                        }
                        if (this.f2362a != null) {
                            this.f2363b = null;
                            if (width <= this.f2369h.getWidth() && (i2 + i5) + i3 <= this.f2369h.getHeight() && i3 > 0) {
                                this.f2363b = Bitmap.createBitmap(this.f2369h, 0, i2 + i5, width, i3);
                            }
                            if (this.f2363b != null) {
                                Drawable bitmapDrawable = new BitmapDrawable(this.f2362a);
                                Drawable bitmapDrawable2 = new BitmapDrawable(this.f2363b);
                                view5 = new ImageView(KonyMain.getActivityContext());
                                linearLayout = new ImageView(KonyMain.getActivityContext());
                                view5.setBackgroundDrawable(bitmapDrawable);
                                linearLayout.setBackgroundDrawable(bitmapDrawable2);
                                if (this.f2366e != null) {
                                    this.f2366e.removeAllViews();
                                    this.f2366e = null;
                                }
                                this.f2366e = new LinearLayout(KonyMain.getActivityContext());
                                LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, height);
                                this.f2366e.setOrientation(1);
                                View linearLayout2 = new LinearLayout(KonyMain.getActivityContext());
                                LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i5);
                                linearLayout2.setOrientation(1);
                                linearLayout2 = new LinearLayout(KonyMain.getActivityContext());
                                LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, i3);
                                linearLayout2.setOrientation(1);
                                linearLayout2.addView(view5, layoutParams2);
                                linearLayout2.addView(linearLayout, layoutParams3);
                                if (view2 != null) {
                                    View linearLayout3 = new LinearLayout(KonyMain.getActivityContext());
                                    View linearLayout4 = new LinearLayout(KonyMain.getActivityContext());
                                    linearLayout3.addView(linearLayout2, layoutParams2);
                                    linearLayout4.addView(linearLayout2, layoutParams3);
                                    this.f2366e.addView(linearLayout3);
                                    this.f2366e.addView(linearLayout4);
                                } else {
                                    this.f2366e.addView(linearLayout2);
                                    this.f2366e.addView(linearLayout2);
                                }
                                Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                                Animation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                if (KonyMain.f3657e) {
                                    Log.d("KonySplitAnimation", "++++++++++++++++++++++++++++++++=Timetakne for Split layout+++++++++++++++++++++++=" + currentTimeMillis2);
                                    Log.d("KonySplitAnimation", "++++++++++++++++++++++++++++++++=current animation time+++++++++++++++++++++++=" + AnimationUtils.currentAnimationTimeMillis());
                                }
                                i4 = (int) getDuration();
                                if (this.f2367f) {
                                    if (getInterpolator() != null) {
                                        translateAnimation.setInterpolator(getInterpolator());
                                    }
                                    if (getInterpolator() != null) {
                                        translateAnimation2.setInterpolator(getInterpolator());
                                    }
                                } else {
                                    i4 = (int) (((long) i4) - currentTimeMillis2);
                                    translateAnimation.setInterpolator(new C0305u(getInterpolator()));
                                    translateAnimation2.setInterpolator(new C0305u(getInterpolator()));
                                }
                                if (i4 < 0) {
                                    i4 = 0;
                                }
                                translateAnimation.setDuration((long) i4);
                                translateAnimation2.setDuration((long) i4);
                                linearLayout2.startAnimation(translateAnimation);
                                linearLayout2.startAnimation(translateAnimation2);
                                if (view4 != null) {
                                    if (width <= this.f2369h.getWidth() && i2 <= this.f2369h.getHeight() && i2 > 0) {
                                        this.f2364c = Bitmap.createBitmap(this.f2369h, 0, 0, width, i2);
                                    }
                                    if (this.f2364c != null) {
                                        Drawable bitmapDrawable3 = new BitmapDrawable(this.f2364c);
                                        View imageView = new ImageView(KonyMain.getActivityContext());
                                        imageView.setBackgroundDrawable(bitmapDrawable3);
                                        LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, i2);
                                        view4.setOrientation(1);
                                        view4.addView(imageView, layoutParams4);
                                        this.f2366e.addView(view4, 0);
                                    } else if (KonyMain.f3657e) {
                                        Log.d("KonySplitAnimation", "headerBimtap is null. Returning without creating split animation views");
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (view3 != null) {
                                    i3 = height - i;
                                    if (width <= this.f2369h.getWidth() && i + i3 <= this.f2369h.getHeight() && i3 > 0) {
                                        this.f2365d = Bitmap.createBitmap(this.f2369h, 0, i, width, i3);
                                    }
                                    if (this.f2365d != null) {
                                        Drawable bitmapDrawable4 = new BitmapDrawable(this.f2365d);
                                        View imageView2 = new ImageView(KonyMain.getActivityContext());
                                        imageView2.setBackgroundDrawable(bitmapDrawable4);
                                        layoutParams3 = new LinearLayout.LayoutParams(-1, i3);
                                        view3.setOrientation(1);
                                        view3.addView(imageView2, layoutParams3);
                                        this.f2366e.addView(view3);
                                    } else if (KonyMain.f3657e) {
                                        Log.d("KonySplitAnimation", "footerBitmap is null. Returning without creating split animation views");
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                KonyMain.getActivityContext().addContentView(this.f2366e, layoutParams);
                                linearLayout2.setVisibility(4);
                                linearLayout2.setVisibility(4);
                            } else if (KonyMain.f3657e) {
                                Log.d("KonySplitAnimation", "bottomBitmap is null. Returning without creating split animation views");
                            }
                        } else if (KonyMain.f3657e) {
                            Log.d("KonySplitAnimation", "topBitmap is null. Returning without creating split animation views");
                        }
                    }
                }
            } catch (OutOfMemoryError e) {
                if (KonyMain.f3657e) {
                    Log.d("KonySplitAnimation", "OOM************************************");
                }
            }
        }
    }

    protected final void applyTransformation(float f, Transformation transformation) {
        if (f != 0.0f || f != 1.0f) {
            transformation.setAlpha(0.0f);
        }
    }

    public final boolean willChangeBounds() {
        return false;
    }
}
