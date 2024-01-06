package homework;
//В кинотеатре есть разные типы билетов:
// стандартный, студенческий (-10%) и для пенсионеров(-25%).
// Каждый тип билета имеет свою стоимость.
// Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета на 25%.
// Создайте метод calculateTicketPrice, который принимает возраст клиента, статус студента и флаг VIP-места.

import java.util.Scanner;

public class TheaterMovie {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Hello! What is your name? ");
        String name = scanner.next();
        System.out.println(name + "!" + " How old are you?");
        int age = scanner.nextInt();
        System.out.println(name + "!" + " Are you a student?" + "( 1 - yes / 2 - no )");
        int isStudent = scanner.nextInt();
        System.out.println(name + "!" + " Would you like a VIP-seat?" + "( 1 - yes / 2- no)");
        int isVipSeat = scanner.nextInt();

        double ticketPrice = calculateTicketPrice(age, isStudent, isVipSeat);
        System.out.println(" Your ticket is " + ticketPrice);

    }

    public static double calculateTicketPrice(int age, int isStudent, int isVipSeat) {

        double ticketStandard = 10;
        double ticketStudent = ticketStandard - (ticketStandard * 0.10);
        double ticketSenior = ticketStandard - (ticketStandard * 0.25);

        double ticketPrice = 0;

        if (age < 65) {
            if (age < 65 && isStudent == 2 && isVipSeat == 2) {
                ticketPrice = ticketStandard;
            } else if (age < 65 && isStudent == 1 && isVipSeat == 2) {
                ticketPrice = ticketStudent;
            } else if (age < 65 && isStudent == 1 && isVipSeat == 1) {
                ticketPrice = ticketStudent + (ticketStudent * 0.25);
            } else if (age < 65 && isStudent == 2 && isVipSeat == 1) {
                ticketPrice = ticketStandard + (ticketStandard * 0.25);
            }

        } else if (age >= 65) {
            if (age >= 65 && isStudent == 2 && isVipSeat == 2) {
                ticketPrice = ticketSenior;
            } else if (age >= 65 && isStudent == 1 && isVipSeat == 1) {
                ticketPrice = ticketSenior - (ticketSenior * 0.1) + (ticketSenior * 0.25);
            } else if (age >= 65 && isStudent == 2 && isVipSeat == 1) {
                ticketPrice = ticketSenior + (ticketSenior * 0.25);
            } else if (age >= 65 && isStudent == 1 && isVipSeat == 2) {
                ticketPrice = ticketSenior - (ticketSenior * 0.1);

            }

        }

        return ticketPrice;

    }

}

