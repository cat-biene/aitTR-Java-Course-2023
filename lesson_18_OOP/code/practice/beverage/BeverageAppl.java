package practice.beverage;

import practice.beverage.model.Beer;
import practice.beverage.model.Beverage;

public class BeverageAppl {

    public static void main(String[] args) {

        // создали  объект

        Beverage beverage = new Beverage();
        beverage.displayStock();
        System.out.println("__________________________________________________");

        Beverage b1 = new Beverage("Milk", "box", 20);
        // вызыает метод для изменения объекта
        b1.toBuy("Milk", "box", 20);
        // метод показывает состояние объекта
        b1.displayStock();
        System.out.println("___________________________________________________");

        Beer beer = new Beer();
        beer.displayStock();
        System.out.println("_______________________________________________________");

        Beer b2 = new Beer("Ipa", "6 pack", 10, "elle");
        b2.toBuy("Ipa", "6 pack", 10, "elle");
        b2.displayStock();
    }
}
