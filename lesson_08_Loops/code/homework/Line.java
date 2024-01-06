package homework;
// Программа получает на вход строку и число повторений этой строки.
// Программа должна вывести эту строку нужное количество раз.

import java.util.Scanner;

public class Line {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the text: ");
        String text = scanner.nextLine();
        System.out.println("Input number of reps: ");
        int number = scanner.nextInt();
        int count = 0;

        while (count < number) {
            System.out.println(text);
            count++;
        }

    }

}
