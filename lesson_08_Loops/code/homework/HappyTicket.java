package homework;
 // Вводится шестизначное число (номер автобусного билета).
// Определите, является ли этот билет "счастливым"
// (сумма первых трех цифр равна сумме трех последних цифр).

import java.util.Scanner;

public class HappyTicket  {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input number your ticket: ");
        int numberTicket = scanner.nextInt();

        int digit6 = numberTicket % 10; // get the last digit of the number
        numberTicket /= 10; // remove the last digit from the number
        int digit5 = numberTicket % 10; // get the next digit of the number
        numberTicket /= 10;
        int digit4 = numberTicket % 10;
        numberTicket /= 10;
        int digit3 = numberTicket % 10;
        numberTicket /= 10;
        int digit2 = numberTicket % 10;
        numberTicket /= 10;
        int digit1 = numberTicket;

        if(digit1 + digit2 + digit3 == digit4 + digit5 + digit6) {
            System.out.println("Lucky ticket!");

        } else {
            System.out.println("Not lucky ticket!");

        }

    }
}
