package homework.product;
//Создать класс Product, с полями
//private String name; private long barCode; private double price;
// Создать класс Food расширяющий класс Product с полем private String expDate;, которое хранит дату истечения срока годности.
// Создать класс MeatFood расширяющий класс Food с полем private String meatType;, которое хранит тип мяса из которого изготовлен продукт.
// Создать класс MilkFood расширяющий класс Food с полями private String milkType; private double fat;, которые хранят тип молока и жирность продукта соответственно.
// Во всех классах переопределить метод toString.
// Создать класс ProductAppl c методом main. В методе main создать массив в котором хранятся по одному объекту для каждого продукта.
// Создать метод печатающий все продукты из массива, и метод возвращающий сумму цен всех продуктов.

import homework.product.model.MeatFood;
import homework.product.model.MilkFood;
import homework.product.model.Product;

public class ProductAppl {

    public static void main(String[] args) {

        Product[] product = new Product[2];

        product[0] = new MeatFood("Pate", 23568974, 1,"20.11.2023", "beef");
        product[1] = new MilkFood("Milk", 89567412, 0.8, "10.10.2023", "cow", 3.2);

        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i]);
        }

        product[0].printPrice();
        product[1].printPrice();

        double sumPrice =0;
        for (int i = 0; i < product.length; i++) {
            sumPrice = sumPrice + product[i].getPrice();
        }
        System.out.println(" Total price = " + sumPrice);
    }
}
