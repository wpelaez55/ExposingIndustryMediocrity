package com.konylabs.android;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

/* renamed from: com.konylabs.android.B */
final class C0118B implements OnCompletionListener {
    private /* synthetic */ KonyMain f1a;

    C0118B(KonyMain konyMain) {
        this.f1a = konyMain;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f1a.m4146A();
    }
}
