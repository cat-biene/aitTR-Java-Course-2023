package homework;

import java.util.Scanner;

// Вводится n - натуральное число.
// Напишите метод, который получает на вход n и вычисляет n! = 1 * 2 * 3 *... * n.
// Вызовите полученный метод.
// При каком значении n происходит переполнение памяти,
// выделяемой для n типа int?
// Использовать цикл for.
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scanner.nextInt();
        System.out.println(getFactorial(number));
    }

    private static int getFactorial(int number) {
        int multip = 1;
        for (int i = 1; i <= number; i++) {
            multip *= i;
        }
        return multip;
    }
}
