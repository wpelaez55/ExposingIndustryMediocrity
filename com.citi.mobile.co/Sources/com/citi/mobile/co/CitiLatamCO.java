package com.citi.mobile.co;

import android.os.Bundle;
import com.konylabs.android.KonyMain;

public class CitiLatamCO extends KonyMain {
    private static CitiLatamCO context;

    public void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
    }

    public static CitiLatamCO getActivityContext() {
        return context;
    }

    public int getAppSourceLocation() {
        return 2;
    }
}
