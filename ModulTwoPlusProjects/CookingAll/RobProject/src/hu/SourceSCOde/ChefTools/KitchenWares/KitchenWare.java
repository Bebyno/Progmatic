package hu.SourceSCOde.ChefTools.KitchenWares;


public class KitchenWare {

    private String status; //clean, in use, dirty

    public KitchenWare(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
