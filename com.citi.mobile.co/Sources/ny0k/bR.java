package ny0k;

import com.konylabs.vm.Function;
import com.konylabs.vm.LuaNil;

final class bR extends Function {
    private /* synthetic */ bO f3324a;

    bR(bO bOVar) {
        this.f3324a = bOVar;
    }

    public final Object[] execute(Object[] objArr) throws Exception {
        int intValue = ((Integer) objArr[1]).intValue();
        int intValue2 = ((Integer) objArr[2]).intValue();
        bO.m4768a(this.f3324a, intValue, intValue2, ((Boolean) objArr[3]).booleanValue());
        LuaNil a = this.f3324a.at;
        if (!(a == LuaNil.nil || a == null)) {
            intValue = cr.m2199a(intValue, 1);
            intValue2 = cr.m2199a(intValue2, 1);
            objArr[1] = cr.m2200a(intValue);
            objArr[2] = cr.m2200a(intValue2);
            ((Function) a).execute(objArr);
        }
        return null;
    }
}
