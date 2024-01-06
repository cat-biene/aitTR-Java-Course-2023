package homework;

import java.util.Scanner;

// В сберкассу на трёхпроцентный вклад положили s рублей.
// Какой станет сумма вклада через n лет.
// Использовать цикл for.
public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount of contribution: ");
        double amount = scanner.nextDouble();
        System.out.println("Input term: ");
        int term = scanner.nextInt();
        double percent = 0.03;
        calculate(amount, term, percent);
    }

    private static double calculate(double amount, int term, double percent) {
        for (int i = 0; i < term; i++) {
            amount = amount + amount * percent;
        }
        System.out.println("Your amount after: " + term);
        System.out.printf( "years will be: %.2f", amount);
        return amount;
    }

}
