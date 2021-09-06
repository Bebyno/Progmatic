package Ingredients.General;

public class Liquid {
    private boolean isPoured = false;
    private boolean isHeated = false;
    private String name;

    public String liquidStatus(Liquid liquid) {
        String status = "";
        if (!isPoured) {
            status = "Not poured";
        }
        return status;
    }

    public boolean isPoured() {
        return isPoured;
    }

    public void setPoured(boolean poured) {
        isPoured = poured;
    }

    public boolean isHeated() {
        return isHeated;
    }

    public void setHeated(boolean heated) {
        isHeated = heated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
