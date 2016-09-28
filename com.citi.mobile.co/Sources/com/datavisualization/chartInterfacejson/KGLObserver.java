package com.datavisualization.chartInterfacejson;

public interface KGLObserver {
    void OnEventOnPinch(String str, int i, int i2);

    void OnEventOnSwipe(String str, int i, int i2, int i3);

    void OnScrollDidReachBegin(String str);

    void OnScrollDidReachEnd(String str);

    void invokeCallback(int i, String str, int i2, int i3, double d);
}
