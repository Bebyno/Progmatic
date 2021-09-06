package Things;

public class Bed extends Stuffs {/*
    public static int number = 123;
    public static final String ASD = "asd";
    private String qwe = "qwe";


    public int[] lengthAndWidth = new int[2];
    public String type;
    public boolean hasHolder;
    public int capacity;*/

    public Bed() {
    }

    public Bed(int[] lengthAndWidth, String type, boolean hasHolder, int capacity) {
        this.lengthAndWidth = lengthAndWidth;
        this.type = type;
        this.hasHolder = hasHolder;
        this.capacity = capacity;

    }


    public int[] getLengthAndWidth() {
        return lengthAndWidth;
    }

    public void setLengthAndWidth(int[] lengthAndWidth) {
        this.lengthAndWidth = lengthAndWidth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasHolder() {
        return hasHolder;
    }

    public void setHasHolder(boolean hasHolder) {
        this.hasHolder = hasHolder;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }



}
