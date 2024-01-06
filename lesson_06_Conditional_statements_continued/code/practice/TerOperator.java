package practice;

import java.util.Scanner;

public class TerOperator {
    // В программе задаются два целых числа.

    // Найдите минимальное из них с помощью тернарного оператора.

    // Дополните программу возможностью ввода чисел пользователем.

    public static void main(String[] args) {

        int a = 123;
        int b = 745;

        Scanner scanner = new Scanner(System.in); // вклычаеться считывание с клавиатуры
        System.out.println("Input 1st number:"); // приглашение пользователя для ввода числа
        int number1 = scanner.nextInt(); // получение числа с клавиатуры
        System.out.println("Input 2st number:"); // приглашение пользователя для ввода числа
        int number2 = scanner.nextInt(); // получение числа с клавиатуры

        int isMin = (a < b) ? a : b;

        int isMin2 = (number1 < number2) ? number1 : number2;

        System.out.println("Minimum = " + isMin);

        System.out.println("Minimum2 =" + isMin2);

    }
}
