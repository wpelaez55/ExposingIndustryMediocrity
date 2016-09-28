package ny0k;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.konylabs.android.KonyMain;

final class cd extends AccessibilityDelegateCompat {
    private /* synthetic */ cc f3473a;

    cd(cc ccVar) {
        this.f3473a = ccVar;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(bA.class.getName());
        accessibilityEvent.setPackageName(KonyMain.getActivityContext().getPackageName());
        accessibilityEvent.setChecked(((ce) view.getTag()));
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(bA.class.getName());
        accessibilityNodeInfoCompat.setCheckable(true);
        accessibilityNodeInfoCompat.setChecked(((ce) view.getTag()));
    }
}
