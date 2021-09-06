package Ingredients.vegetables;




public class Vegetables extends Ingredients{
    private boolean chopped = false;
    private boolean peel = false;
    private String name;


    public Vegetables() {
    }

    public Vegetables[] chopped(Vegetables vegetables){
        Vegetables[] chopping = new Vegetables[5];
        return chopping;
    }

    public String choppStatus(Vegetables vegetables) {
        String status = "";
        if (!chopped) {
            status = "Not chopped";
        }
        return status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPeel() {
        return peel;
    }

    public void setPeel(boolean peel) {
        this.peel = peel;
    }


    public boolean isChopped() {
        return chopped;
    }

    public void setChopped(boolean chopped) {
        this.chopped = chopped;
    }




}
