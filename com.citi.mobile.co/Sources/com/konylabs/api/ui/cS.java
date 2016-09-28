package com.konylabs.api.ui;

import android.text.Editable;
import android.text.Html.TagHandler;
import org.xml.sax.XMLReader;

final class cS implements TagHandler {
    private /* synthetic */ cP f961a;

    cS(cP cPVar) {
        this.f961a = cPVar;
    }

    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (str.equals("rtv")) {
            xMLReader.setContentHandler(new cQ(this.f961a, xMLReader.getContentHandler()));
        }
    }
}
