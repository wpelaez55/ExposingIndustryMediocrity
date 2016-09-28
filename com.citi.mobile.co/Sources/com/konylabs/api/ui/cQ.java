package com.konylabs.api.ui;

import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

final class cQ implements ContentHandler {
    private ContentHandler f958a;
    private /* synthetic */ cP f959b;

    public cQ(cP cPVar, ContentHandler contentHandler) {
        this.f959b = cPVar;
        this.f958a = contentHandler;
    }

    public final void characters(char[] cArr, int i, int i2) throws SAXException {
        this.f958a.characters(cArr, i, i2);
    }

    public final void endDocument() throws SAXException {
        this.f958a.endDocument();
    }

    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (str2.equalsIgnoreCase("label")) {
            str2 = "font";
        } else if (str2.equalsIgnoreCase("tel")) {
            str2 = "a";
        } else if (str2.equalsIgnoreCase("sup") || str2.equalsIgnoreCase("sub")) {
            this.f958a.endElement(str, "small", str3);
        }
        if (str2.equalsIgnoreCase("a")) {
            this.f959b.f941b = true;
        }
        this.f958a.endElement(str, str2, str3);
    }

    public final void endPrefixMapping(String str) throws SAXException {
        this.f958a.endPrefixMapping(str);
    }

    public final void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        this.f958a.ignorableWhitespace(cArr, i, i2);
    }

    public final void processingInstruction(String str, String str2) throws SAXException {
        this.f958a.processingInstruction(str, str2);
    }

    public final void setDocumentLocator(Locator locator) {
        this.f958a.setDocumentLocator(locator);
    }

    public final void skippedEntity(String str) throws SAXException {
        this.f958a.skippedEntity(str);
    }

    public final void startDocument() throws SAXException {
        this.f958a.startDocument();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void startElement(java.lang.String r17, java.lang.String r18, java.lang.String r19, org.xml.sax.Attributes r20) throws org.xml.sax.SAXException {
        /*
        r16 = this;
        r4 = "label";
        r0 = r18;
        r4 = r0.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x00aa;
    L_0x000a:
        r12 = "font";
        r4 = new org.xml.sax.ext.Attributes2Impl;
        r4.<init>();
        r5 = 0;
        r10 = r5;
    L_0x0013:
        r5 = r20.getLength();
        if (r10 >= r5) goto L_0x009e;
    L_0x0019:
        r0 = r20;
        r5 = r0.getLocalName(r10);
        r6 = "style";
        r5 = r5.equalsIgnoreCase(r6);
        if (r5 == 0) goto L_0x0099;
    L_0x0027:
        r0 = r20;
        r5 = r0.getValue(r10);
        r5 = r5.toLowerCase();
        r6 = ";";
        r13 = r5.split(r6);
        r14 = r13.length;
        r5 = 0;
        r11 = r5;
    L_0x003a:
        if (r11 >= r14) goto L_0x0099;
    L_0x003c:
        r9 = r13[r11];
        r5 = r9.trim();
        r5 = r5.toLowerCase();
        r6 = "color";
        r5 = r5.startsWith(r6);
        if (r5 == 0) goto L_0x006d;
    L_0x004e:
        r5 = "";
        r6 = "color";
        r7 = "";
        r8 = "CDATA";
        r15 = ":";
        r15 = r9.indexOf(r15);
        r15 = r15 + 1;
        r9 = r9.substring(r15);
        r9 = r9.trim();
        r4.addAttribute(r5, r6, r7, r8, r9);
    L_0x0069:
        r5 = r11 + 1;
        r11 = r5;
        goto L_0x003a;
    L_0x006d:
        r5 = r9.trim();
        r5 = r5.toLowerCase();
        r6 = "font-size";
        r5 = r5.startsWith(r6);
        if (r5 == 0) goto L_0x0069;
    L_0x007d:
        r5 = "";
        r6 = "size";
        r7 = "";
        r8 = "CDATA";
        r15 = ":";
        r15 = r9.indexOf(r15);
        r15 = r15 + 1;
        r9 = r9.substring(r15);
        r9 = r9.trim();
        r4.addAttribute(r5, r6, r7, r8, r9);
        goto L_0x0069;
    L_0x0099:
        r5 = r10 + 1;
        r10 = r5;
        goto L_0x0013;
    L_0x009e:
        r0 = r16;
        r5 = r0.f958a;
        r0 = r17;
        r1 = r19;
        r5.startElement(r0, r12, r1, r4);
    L_0x00a9:
        return;
    L_0x00aa:
        r4 = "tel";
        r0 = r18;
        r4 = r0.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x0109;
    L_0x00b4:
        r11 = "a";
        r4 = new org.xml.sax.ext.Attributes2Impl;
        r4.<init>();
        r5 = 0;
        r10 = r5;
    L_0x00bd:
        r5 = r20.getLength();
        if (r10 >= r5) goto L_0x00fd;
    L_0x00c3:
        r0 = r20;
        r5 = r0.getLocalName(r10);
        r6 = "number";
        r5 = r5.equalsIgnoreCase(r6);
        if (r5 == 0) goto L_0x00f9;
    L_0x00d1:
        r5 = "";
        r6 = "href";
        r7 = "";
        r8 = "CDATA";
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r12 = "tel:";
        r9 = r9.append(r12);
        r0 = r20;
        r12 = r0.getValue(r10);
        r12 = r12.trim();
        r9 = r9.append(r12);
        r9 = r9.toString();
        r4.addAttribute(r5, r6, r7, r8, r9);
    L_0x00f9:
        r5 = r10 + 1;
        r10 = r5;
        goto L_0x00bd;
    L_0x00fd:
        r0 = r16;
        r5 = r0.f958a;
        r0 = r17;
        r1 = r19;
        r5.startElement(r0, r11, r1, r4);
        goto L_0x00a9;
    L_0x0109:
        r4 = "sup";
        r0 = r18;
        r4 = r0.equalsIgnoreCase(r4);
        if (r4 != 0) goto L_0x011d;
    L_0x0113:
        r4 = "sub";
        r0 = r18;
        r4 = r0.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x012e;
    L_0x011d:
        r0 = r16;
        r4 = r0.f958a;
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r3 = r20;
        r4.startElement(r0, r1, r2, r3);
        r18 = "small";
    L_0x012e:
        r0 = r16;
        r4 = r0.f958a;
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r3 = r20;
        r4.startElement(r0, r1, r2, r3);
        goto L_0x00a9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.konylabs.api.ui.cQ.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public final void startPrefixMapping(String str, String str2) throws SAXException {
        this.f958a.startPrefixMapping(str, str2);
    }
}
