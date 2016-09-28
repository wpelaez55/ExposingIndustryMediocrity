package com.thirdparty.bumpapi;

public interface BumpInterface {
    public static final int BUMP_CONNECTION_FAILURE = 0;
    public static final int BUMP_CONNECTION_SUCCESS = 1;

    void disconnect();

    void sendBumpData(byte[] bArr);

    void start(String str, String str2, String str3);
}
