package ny0k;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.konylabs.android.KonyMain;

final class bm extends AccessibilityDelegateCompat {
    private /* synthetic */ bk f3330a;

    bm(bk bkVar) {
        this.f3330a = bkVar;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(bA.class.getName());
        accessibilityEvent.setPackageName(KonyMain.getActivityContext().getPackageName());
        accessibilityEvent.setChecked(((bn) view.getTag()));
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(bA.class.getName());
        accessibilityNodeInfoCompat.setCheckable(true);
        accessibilityNodeInfoCompat.setChecked(((bn) view.getTag()));
    }
}
