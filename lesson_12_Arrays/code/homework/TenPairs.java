package homework;

import java.util.Scanner;

//  Ввести с клавиатуры 10 пар целых чисел.
//  Сравните числа в каждой паре и напечатайте большие из них.
//  Использовать цикл for.
public class TenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Введите пару целых чисел через пробел:");
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();

            int maxNumber = (firstNumber > secondNumber) ? firstNumber : secondNumber;

            System.out.println("Большее число из пары: " + maxNumber);
        }

        scanner.close();
    }
}
