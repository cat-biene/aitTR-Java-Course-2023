package practice.beverage.model;

public class Beer extends Beverage {

    // fields
    private String type;

    // constructor
    public Beer(String title, String packing, int quantity, String type) {
        super(title, packing, quantity);
        this.type = type;
    }

    // пустой конструктор
    public Beer() {
    }

    // getter an setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // method to buy
    public void toBuy(String title, String packing, int quantity, String type) {
        super.toBuy(title, packing, quantity);
        this.type = type;
    }

    public void displayStock() {
        super.displayStock();
        System.out.println(" This is " + type + " of beer. ");
    }
}
