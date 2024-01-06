package consultation;

/**
 * @author Andrej Reutow
 * created on 05.10.2023
 */
public class Product { // суперкласс

    private int id;
    private double price;
    protected String brand;

    public Product(int id, double price, String brand) {
        this.id = id;
        this.price = price;
        this.brand = brand;
    }

    public void cost() {
        System.out.println("Продукт " + this.brand + " стоит " + this.price + " euro");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return brand;
    }

    public void setBrand(String name) {
        this.brand = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Product) {
            Product product = (Product) obj;
            return product.id == this.id;
        }
        return false;
    }
}
