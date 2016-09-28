package ny0k;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;

final class bb extends RelativeLayout {
    public bb(ba baVar, Context context) {
        super(context);
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = MeasureSpec.getSize(i);
        setMeasuredDimension(size, size);
    }
}
