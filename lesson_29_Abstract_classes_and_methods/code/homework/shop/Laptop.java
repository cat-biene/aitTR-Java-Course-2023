package homework.shop;

public class Laptop extends Product {

    public Laptop(long id, String name, double price) {
        super(id, name, price);
    }
    @Override
    public void buyOnline() {
        double price = this.price - (this.price * 0.1);
        System.out.println("Product with id: " + this.id + "cost" + price + "$");
        System.out.println("buy this product online");
    }

    @Override
    public void buyOffline() {
        System.out.println("Product with id: " + this.id + "cost" + this.price + "$");
        System.out.println("buy this product offline");

    }

    @Override
    public void setDiscount() {
        this.price = this.price - (this.price * 0.1);

    }


}
