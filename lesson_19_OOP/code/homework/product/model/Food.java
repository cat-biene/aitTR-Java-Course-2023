package homework.product.model;
//Создать класс Product, с полями
//private String name; private long barCode; private double price;
// Создать класс Food расширяющий класс Product с полем private String expDate;, которое хранит дату истечения срока годности.
// Создать класс MeatFood расширяющий класс Food с полем private String meatType;, которое хранит тип мяса из которого изготовлен продукт.
// Создать класс MilkFood расширяющий класс Food с полями private String milkType; private double fat;, которые хранят тип молока и жирность продукта соответственно.
// Во всех классах переопределить метод toString.
// Создать класс ProductAppl c методом main. В методе main создать массив в котором хранятся по одному объекту для каждого продукта. Создать метод печатающий все продукты из массива, и метод возвращающий сумму цен всех продуктов.

public class Food extends Product {

    // fields
    private String expDate; // хранит дату истечения срока годности

    // constructor
    public Food(String name, long barCode, double price, String expDate) {
        super(name, barCode, price);
        this.expDate = expDate;
    }

    // getter and setter
    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    // method toString

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", barCode=" + getBarCode() +
                ", price=" + getPrice() +
                ',' +
                "expDate='" + expDate + '\'' +
                '}';
    }

    // methods printPrice
    public void printPrice() {
        System.out.println("Price : " + getPrice());
    }
}
