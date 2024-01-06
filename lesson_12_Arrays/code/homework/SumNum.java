package homework;

import java.util.Scanner;

// Составьте программу, которая вычисляет сумму чисел от 1 до 1/n,
// n вводится с клавиатуры.
// Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10
// Использовать цикл for.
public class SumNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        double number = scanner.nextInt();
        double sum = 1;

        for (int i = 0; i <= number; i++) {
           sum += 1 / number;
            System.out.println(sum);
        }
        System.out.println("Final sum = " + sum);
    }
}