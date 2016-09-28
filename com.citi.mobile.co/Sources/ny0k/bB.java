package ny0k;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.konylabs.android.KonyMain;

final class bB extends AccessibilityDelegateCompat {
    private /* synthetic */ bA f3316a;

    bB(bA bAVar) {
        this.f3316a = bAVar;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(bA.class.getName());
        accessibilityEvent.setPackageName(KonyMain.getActivityContext().getPackageName());
        accessibilityEvent.setChecked(bA.m3591c(this.f3316a, view));
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(bA.class.getName());
        accessibilityNodeInfoCompat.setCheckable(true);
        accessibilityNodeInfoCompat.setChecked(bA.m3591c(this.f3316a, view));
    }
}
