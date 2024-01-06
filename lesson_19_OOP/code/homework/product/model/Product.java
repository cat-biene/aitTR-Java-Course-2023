package homework.product.model;
//Создать класс Product, с полями
//private String name; private long barCode; private double price;
// Создать класс Food расширяющий класс Product с полем private String expDate;, которое хранит дату истечения срока годности.
// Создать класс MeatFood расширяющий класс Food с полем private String meatType;, которое хранит тип мяса из которого изготовлен продукт.
// Создать класс MilkFood расширяющий класс Food с полями private String milkType; private double fat;, которые хранят тип молока и жирность продукта соответственно.
// Во всех классах переопределить метод toString.
// Создать класс ProductAppl c методом main. В методе main создать массив в котором хранятся по одному объекту для каждого продукта. Создать метод печатающий все продукты из массива, и метод возвращающий сумму цен всех продуктов.

public class Product {

    // fields
    private String name;
    private long barCode;
    private double price;

    // constructor
    public Product(String name, long barCode, double price) {
        this.name = name;
        this.barCode = barCode;
        this.price = price;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // method toString
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", barCode=" + barCode +
                ", price=" + price +
                '}';
    }

    // methods printPrice
    public void printPrice() {
        System.out.println("Price : " + price);
    }
}
