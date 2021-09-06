package storage;

public class StorageElement {
    /**
     * StorageElement shall be a parent class for the element types in the Storage
     */

    private String name;
    private Integer amount;

    public StorageElement(){}

    public StorageElement(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
