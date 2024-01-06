package homework;
// Пользователь с клавиатуры вводит число от 1 до 12,
// программа сообщает, какому времени года принадлежит введенный месяц.

import java.util.Scanner;

public class Seasons {

    // The user enters a number from 1 to 12 using the keyboard,
    // the program reports what season it belongs to entered month

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the month of the year:");
        int number = scanner.nextInt();

        switch (number) {
            case 12:
            case 1:
            case 2: {
                System.out.println(" Season winter: " + number);
                break;
            }
            case 3:
            case 4:
            case 5: {
                System.out.println(" Season spring: " + number);
                break;
            }
            case 6:
            case 7:
            case 8: {
                System.out.println(" Season summer: " + number);
                break;
            }
            case 9:
            case 10:
            case 11: {
                System.out.println(" Season fall: " + number);
                break;
            }
            default: {
                System.out.println("Wrong input");
            }

        }

    }
}