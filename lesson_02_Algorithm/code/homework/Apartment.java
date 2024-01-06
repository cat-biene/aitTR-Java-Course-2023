package homework;
// Метод main вызывает method1. method1 вызывает method2. method2 вызывает method3.
//В каждом методе должно происходить следующее:
//Печатает в консоль информацию, что метод такой-то стартовал
//Вызывает следующий метод
//Печатает в консоль, что метод такой-то финишировал

public class Apartment {
    public static void main(String[] args) {
    repairOn();
    }
    public static void repairOn() {
         System.out.println("Apartment renovation started!");
        repair();
    }
    public static void repair() {
        System.out.println("My name is Maks");
        System.out.println("I am building");
        repairOff();
    }
    public static void repairOff() {
        System.out.println("Apartment renovation finish!");
    }
}
