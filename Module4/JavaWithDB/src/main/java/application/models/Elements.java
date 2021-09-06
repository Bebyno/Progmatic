package application.models;

public class Elements {

    private String elementName;
    private byte[] iconImage;

    public Elements() {
    }

    public Elements(String elementName) {
        this.elementName = elementName;
    }

    public String getElementName() {
        return elementName;
    }



    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public byte[] getIconImage() {
        return iconImage;
    }

    public void setIconImage(byte[] iconImage) {
        this.iconImage = iconImage;
    }

    @Override
    public String toString() {
        return elementName;
    }
}
