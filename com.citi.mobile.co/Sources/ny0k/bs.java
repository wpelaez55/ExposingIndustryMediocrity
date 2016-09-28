package ny0k;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class bs implements OnScrollListener {
    private /* synthetic */ bq f2206a;

    bs(bq bqVar) {
        this.f2206a = bqVar;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f2206a.m3761i(i - this.f2206a.f3387s);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
