package homework.shop;

public abstract class Product {

    protected long id;
    protected String name;
    protected double price;

    public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract  void buyOnline();
    public abstract  void buyOffline();
    public abstract  void setDiscount();

    public void getProductInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("Product ID: ")
                .append(this.id)
                .append(" ")
                .append(" , product name: ")
                .append(this.name);
        System.out.println(stringBuilder);
    }
}
