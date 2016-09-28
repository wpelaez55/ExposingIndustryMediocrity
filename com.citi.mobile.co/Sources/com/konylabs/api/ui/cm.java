package com.konylabs.api.ui;

import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.konylabs.android.KonyMapsActivity;

public final class cm extends Fragment {
    private LocalActivityManager f2765a;

    public static Fragment m2904a() {
        return new cm();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundle2 = null;
        if (bundle != null) {
            bundle2 = bundle.getBundle("KonyMapV1FragmentState");
        }
        this.f2765a = new LocalActivityManager(getActivity(), true);
        this.f2765a.dispatchCreate(bundle2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = null;
        if (KonyMapsActivity.m14a() == null) {
            getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
        } else {
            Window startActivity = this.f2765a.startActivity("KonyMapsActivity", new Intent(getActivity(), KonyMapsActivity.class));
            if (startActivity != null) {
                view = startActivity.getDecorView();
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                view.setVisibility(0);
                view.setFocusableInTouchMode(true);
                if (view instanceof ViewGroup) {
                    ((ViewGroup) view).setDescendantFocusability(AccessibilityNodeInfoCompat.ACTION_EXPAND);
                }
            }
        }
        return view;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f2765a.dispatchDestroy(getActivity().isFinishing());
    }

    public final void onPause() {
        super.onPause();
        this.f2765a.dispatchPause(getActivity().isFinishing());
    }

    public final void onResume() {
        super.onResume();
        this.f2765a.dispatchResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBundle("KonyMapV1FragmentState", this.f2765a.saveInstanceState());
        super.onSaveInstanceState(bundle);
    }

    public final void onStop() {
        super.onStop();
        this.f2765a.dispatchStop();
    }
}
