package ny0k;

public enum bU {
    BOX,
    LABEL,
    BUTTON,
    IMAGE,
    IMAGE2,
    LINK,
    RICHTEXT,
    TEXTFIELD2,
    LINE;

    static {
        BOX = new bU("BOX", 0);
        LABEL = new bU("LABEL", 1);
        BUTTON = new bU("BUTTON", 2);
        IMAGE = new bU("IMAGE", 3);
        IMAGE2 = new bU("IMAGE2", 4);
        LINK = new bU("LINK", 5);
        RICHTEXT = new bU("RICHTEXT", 6);
        TEXTFIELD2 = new bU("TEXTFIELD2", 7);
        LINE = new bU("LINE", 8);
        bU[] bUVarArr = new bU[]{BOX, LABEL, BUTTON, IMAGE, IMAGE2, LINK, RICHTEXT, TEXTFIELD2, LINE};
    }
}
