package homework.shop;

public class Display extends Product {
    public Display(long id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void buyOnline() {
        System.out.println("Product with id: " + this.id + "cost" + this.price + "$");
        System.out.println("buy this product online");

    }

    @Override
    public void buyOffline() {
        double price = this.price - (this.price * 0.2);
        System.out.println("Product with id: " + this.id + "cost" + price + "$");
        System.out.println("buy this product offline");

    }

    @Override
    public void setDiscount() {
        this.price = this.price - (this.price * 0.15);
    }
}
