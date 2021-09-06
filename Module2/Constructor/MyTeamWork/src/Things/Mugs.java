package Things;

public class Mugs extends Stuffs {
   /* public String matter;
    public int volume;
    public boolean hasHandle;
    public boolean isFull;*/

    public Mugs() {
    }

    public Mugs(String matter, int volume, boolean hasHandle, boolean isFull) {
        this.matter = matter;
        this.volume = volume;
        this.hasHandle = hasHandle;
        this.isFull = isFull;
    }


    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isHasHandle() {
        return hasHandle;
    }

    public void setHasHandle(boolean hasHandle) {
        this.hasHandle = hasHandle;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }
}
