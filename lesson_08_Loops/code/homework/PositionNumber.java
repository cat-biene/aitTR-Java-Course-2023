package homework;
// Вводится положительное целое число, найдите сумму его цифр.

import java.util.Scanner;

public class PositionNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input positive whole number: ");
        int number = scanner.nextInt();
        int count = 0;
        int sumDigits = 0;

        while (count < number) {
            sumDigits += number % 10;
            number /= 10;

        }
        System.out.println(sumDigits);

    }

}
