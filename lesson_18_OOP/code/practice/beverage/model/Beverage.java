package practice.beverage.model;

public class Beverage {

    // fields
    private String title;
    private String packing;
    private int quantity;

    // constructor
    public Beverage(String title, String packing, int quantity) {
        this.title = title;
        this.packing = packing;
        this.quantity = quantity;
    }

    // пустой конструктор
    public Beverage() {
    }

    //getter an setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // method to buy
    public void toBuy(String title, String packing, int quantity) {
        // связыаем текущий объект с методом
        // this.title = title;
        // this.packing = packing;
        // this.quantity = quantity;
        System.out.println(" Go to market an buy : " + title + " " + packing + " " + quantity + ".");
    }

    // method for checking what is left in the warehouse
    public void displayStock() {
        System.out.println(" We have : " + title + " " + packing + " " + quantity + ".");
    }
}
