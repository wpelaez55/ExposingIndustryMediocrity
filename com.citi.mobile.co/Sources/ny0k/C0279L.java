package ny0k;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* renamed from: ny0k.L */
public final class C0279L extends ObjectInputStream {
    public C0279L(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    protected final ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
        ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
        try {
            String name = readClassDescriptor.getName();
            if (name.startsWith("com.konylabs.vm.") && !name.endsWith("LuaTable") && name.substring(16).length() < 4) {
                name = "com.konylabs.vm.TableEnumeration";
            }
            ObjectStreamClass lookup = ObjectStreamClass.lookup(Class.forName(name));
            if (lookup != null) {
                if (readClassDescriptor.getSerialVersionUID() != lookup.getSerialVersionUID()) {
                    return lookup;
                }
            }
            return readClassDescriptor;
        } catch (Throwable e) {
            Log.e("KonyObjectInputStream", "No local class for " + readClassDescriptor.getName(), e);
            return readClassDescriptor;
        }
    }
}
