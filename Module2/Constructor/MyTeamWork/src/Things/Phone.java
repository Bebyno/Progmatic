package Things;

public class Phone extends Stuffs{
    /*public String brand;
    public String colour;
    public String opSys;
    public int version;
    public int memorySize;*/


    public Phone(){
    }

    public Phone(String brand, String colour, String opSys, int version, int memorySize) {
        this.brand = brand;
        this.colour = colour;
        this.opSys = opSys;
        this.version = version;
        this.memorySize = memorySize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getOpSys() {
        return opSys;
    }

    public void setOpSys(String opSys) {
        this.opSys = opSys;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
}
