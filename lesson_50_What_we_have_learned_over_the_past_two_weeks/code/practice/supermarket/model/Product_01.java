package practice.supermarket.model;

import java.time.LocalDate;
import java.util.Objects;

public class Product_01 {
    // fields of class
    private long barCode;
    private String name;
    private String category;
    private String brand;
    private double price;
    private LocalDate expDate;

    // constructor
    public Product_01(long barCode, String name, String category, String brand, double price, LocalDate expDate) {
        // if ... - для проверки уникальности barCode
        this.barCode = barCode;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.expDate = expDate;
    }

    // getter
    public long getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    // setter
    public void setPrice(double price) {
        this.price = price;
    }

    // method toString
    @Override
    public String toString() {
        return "Product{" +
                "barCode=" + barCode +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", expDate=" + expDate +
                '}';
    }

    // methods equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product_01 product01 = (Product_01) o;
        return barCode == product01.barCode && Double.compare(price, product01.price) == 0 && Objects.equals(name, product01.name) && Objects.equals(category, product01.category) && Objects.equals(brand, product01.brand) && Objects.equals(expDate, product01.expDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode, name, category, brand, price, expDate);
    }
}

