package homework;
//Написать программу для "Кофе-машины",
// которая позволяет пользователю выбрать напиток:
// Эспрессо
// Американо
// Латте
// Капучино
//После выбора программа должна сообщить стоимость выбранного напитка.

import java.awt.geom.QuadCurve2D;
import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input the number coffee: ");
        System.out.println("Espresso - 1, Americano - 2, Latte - 3, Cappuccino - 4");
        int coffee = scanner.nextInt();

        switch (coffee) {
            case 1 -> System.out.println(" Here is your Espresso. Please, 1.60 euro ");
            case 2 -> System.out.println(" Here is your Americano. Please, 2.10 euro ");
            case 3 -> System.out.println(" Here is your Latte. Please, 2.80 euro. ");
            case 4 -> System.out.println(" Here is your Cappuccino. Please, 2.80 euro. ");
            default -> System.out.println("Wrong input!");
        }
    }
}
