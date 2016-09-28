package com.konylabs.android;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.util.Log;

/* renamed from: com.konylabs.android.A */
final class C0117A implements OnErrorListener {
    private /* synthetic */ KonyMain f0a;

    C0117A(KonyMain konyMain) {
        this.f0a = konyMain;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (KonyMain.f3657e) {
            Log.d(KonyMain.f3665n, "VideoView OnError is called, error type = " + i);
        }
        this.f0a.m4146A();
        return true;
    }
}
