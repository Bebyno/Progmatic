package application.models;

import java.util.List;

public class Dragon {


    private long id;
    private String uniqueName;
    private String dragonText;
    private Rarity rarity;
    private byte[] desing;

    private List<Elements> elements;    // ez a kapcsoló tábla


    public Dragon(long id, String uniqueName, String dragonText, Rarity rarity) {
        this.id = id;
        this.uniqueName = uniqueName;
        this.dragonText = dragonText;
        this.rarity = rarity;

    }


    public Dragon(String uniqueName, String dragonText, Rarity rarity) {
        this.uniqueName = uniqueName;
        this.dragonText = dragonText;
        this.rarity = rarity;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getDragonText() {
        return dragonText;
    }

    public void setDragonText(String dragonText) {
        this.dragonText = dragonText;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public byte[] getDesing() {
        return desing;
    }

    public void setDesing(byte[] desing) {
        this.desing = desing;
    }

    public List<Elements> getElements() {
        return elements;
    }

    public void setElements(List<Elements> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return id + " - " +
                uniqueName + "," +
                dragonText + "," +
                rarity + "\n\t" +
                elements;
    }


}
