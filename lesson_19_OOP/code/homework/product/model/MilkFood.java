package homework.product.model;
//Создать класс Product, с полями
//private String name; private long barCode; private double price;
// Создать класс Food расширяющий класс Product с полем private String expDate;, которое хранит дату истечения срока годности.
// Создать класс MeatFood расширяющий класс Food с полем private String meatType;, которое хранит тип мяса из которого изготовлен продукт.
// Создать класс MilkFood расширяющий класс Food с полями private String milkType; private double fat;, которые хранят тип молока и жирность продукта соответственно.
// Во всех классах переопределить метод toString.
// Создать класс ProductAppl c методом main. В методе main создать массив в котором хранятся по одному объекту для каждого продукта.
// Создать метод печатающий все продукты из массива, и метод возвращающий сумму цен всех продуктов.

public class MilkFood extends Food {

    // fields
    private String milkType;// хранит тип молока
    private double fat;// хранит жирность продукта

    // constructor
    public MilkFood(String name, long barCode, double price, String expDate, String milkType, double fat) {
        super(name, barCode, price, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    // getter and setter
    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    // method toString

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", barCode=" + getBarCode() +
                ", price=" + getPrice() +
                ',' +
                " expDate='" + getExpDate() + '\'' +
                ',' +
                " milkType='" + milkType + '\'' +
                ", fat=" + fat +
                '}';
    }

    // methods printPrice
    public void printPrice() {
        System.out.println("Price : " + getPrice());
    }
}
