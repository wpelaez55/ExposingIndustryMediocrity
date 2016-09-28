package ny0k;

import java.util.HashMap;
import java.util.StringTokenizer;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: ny0k.Q */
public final class C0283Q extends DefaultHandler {
    private C0423M f1908a;
    private boolean f1909b;
    private boolean f1910c;
    private boolean f1911d;
    private HashMap f1912e;

    public C0283Q(HashMap hashMap) {
        this.f1908a = null;
        this.f1909b = false;
        this.f1910c = false;
        this.f1911d = false;
        this.f1912e = hashMap;
    }

    public final void characters(char[] cArr, int i, int i2) throws SAXException {
        StringTokenizer stringTokenizer = new StringTokenizer(new String(cArr, i, i2), ",");
        int countTokens = stringTokenizer.countTokens();
        String[] strArr = new String[countTokens];
        for (int i3 = 0; i3 < countTokens; i3++) {
            strArr[i3] = stringTokenizer.nextToken().trim();
        }
        if (this.f1909b) {
            this.f1908a.m3477c(strArr);
        } else if (this.f1910c) {
            this.f1908a.m3475b(strArr);
        } else if (this.f1911d) {
            this.f1908a.m3473a(strArr);
        }
    }

    public final void endDocument() throws SAXException {
        System.out.println("Document Ended");
    }

    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (str3.equals("dependentModules")) {
            this.f1909b = false;
        } else if (str3.equals("jsModules")) {
            this.f1910c = false;
        } else if (str3.equals("views") || str3.equals("forms")) {
            this.f1911d = false;
        }
    }

    public final void startDocument() throws SAXException {
        System.out.println("Document started");
    }

    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (str3.equals("functionalModule")) {
            String value = attributes.getValue("name");
            String value2 = attributes.getValue("loadOnStartUp");
            if (value2 == null) {
                value2 = attributes.getValue("cache");
            }
            String value3 = attributes.getValue("init");
            boolean z = value2 != null && value2.equals("true");
            this.f1908a = new C0423M(value, z, value3);
            this.f1912e.put(value, this.f1908a);
        } else if (str3.equals("dependentModules")) {
            this.f1909b = true;
        } else if (str3.equals("jsModules")) {
            this.f1910c = true;
        } else if (str3.equals("views") || str3.equals("forms")) {
            this.f1911d = true;
        }
    }
}
