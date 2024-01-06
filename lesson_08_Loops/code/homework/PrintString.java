package homework;

import java.util.Scanner;

public class PrintString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string : ");
        String str = scanner.nextLine(); // считывает всю введенную строку, включая пробелы
        // scanner.next() - читает набор символов до пробела
        System.out.println("Input number to repeat the string: ");
        int n = scanner.nextInt();
        int count = 0;
        while (count < n) {
            System.out.println(str);
            count++;
        }
        System.out.println("Bye, bye!");
    }
}
