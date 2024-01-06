package homework;

import java.util.Scanner;

// Написать программу, которая принимает с клавиатуры номер месяца
// и год и выводит на экран название месяца и количество дней в нем
public class MonthAndYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi!");
        System.out.println("Input numbers month: ");
        int month = scanner.nextInt();
        System.out.println("Input year: ");
        int year = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("Result: in January " + year + " - 31 days");
                break;
            case 2:
                if (year % 4 == 0) {
                    System.out.println("Result: in February " + year + " - 29 days");
                } else {
                    System.out.println("Result: in February " + year + " - 28 days");
                }
                break;
            case 3:
                System.out.println("Result: in March " + year + " - 30 days");
                break;
            case 4:
                System.out.println("Result: in April " + year + " - 31 days");
                break;
            case 5:
                System.out.println("Result: in May " + year + " - 31 days");
                break;
            case 6:
                System.out.println("Result: in June " + year + " - 30 days");
                break;
            case 7:
                System.out.println("Result: in July " + year + " - 31 days");
                break;
            case 8:
                System.out.println("Result: in August " + year + " - 31 days");
                break;
            case 9:
                System.out.println("Result: in September " + year + " - 30 days");
                break;
            case 10:
                System.out.println("Result: in October " + year + " - 31 days");
                break;
            case 11:
                System.out.println("Result: in November " + year + " - 30 days");
                break;
            case 12:
                System.out.println("Result: in December " + year + " - 31 days");
                break;
            default:
                System.out.println("Wrong input!");
        }
    }
}

