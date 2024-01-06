package homework;
 //В первый день спортсмен пробежал s километров,
// а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
// Определите номер того дня, на который пробег спортсмена составит не менее target километров.
// Программа получает на вход действительные числа s и target и должна вывести одно натуральное число.

import java.util.Scanner;

public class Sport {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number kilometers in the first day:");
        int dayOn = scanner.nextInt();
        System.out.println("Input how many kilometers you want to run:");
        int dayOff = scanner.nextInt();

        int count = 0;
        double dayRun = dayOn;

        while (dayRun < dayOff) {
            dayRun = dayRun + dayRun * 0.1;
            System.out.printf(" Distance: %.2f ", dayRun); // так печатаем результат с 2-мя знаками
            System.out.println();
            count++;

        }
        System.out.println("In " + count + " days, you can run " + dayOff + " kilometers!" );

    }

}
