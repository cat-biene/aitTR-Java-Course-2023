package practice;
// Пользователь вводит натуральное число (целое, положительное).
// Выясните, сколько цифр в числе.

import java.util.Scanner;

public class DigitsInNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input positive integer number: ");
        int number = scanner.nextInt();
        System.out.println(" Your number is " + number);

        // алгоритм
        // смысл цифры в числе определяеться ее положением единицы, десятки, сотни ...
        // будем делить в цикле наше число на 10 > 0

        int count = 0;

        while (number > 0) {
            number = number / 10; // делим число на 10
            count++; // считаем кол-во цифер
        }

        System.out.println(" Digits is number is " + count);

    }

}
