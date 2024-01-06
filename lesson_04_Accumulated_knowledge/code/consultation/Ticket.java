package consultation;

public class Ticket {
    // Написать программу для вычисления средней стоимости
    // поездки по транспортному проездному.
    // В программе задать стоимость проездного на месяц
    // и количество рабочих дней в месяце.
    // Считая, что в рабочий день в среднем две поездки,
    // и 1.5 поездки в выходной,
    // посчитать и округлить общее число поездок в месяц
    // и затем рассчитать среднюю стоимость одной поездки
    // по проездному билету. Рассчитать для сентября.

    public static void main(String[] args) {
        double priceTicket = 50; // monthly ticket price
        int workDay = 20; // number of working days in a month
        int monthDay = 30; // number of days in a month
        double tTotal = totalTravel(workDay, monthDay);
        System.out.println("Total travel in a month is " + tTotal);
        double mPriceTicket = priceTicketMedium(priceTicket, tTotal);
        System.out.println("Average cost per  trip in September is " + mPriceTicket);

    }

    public static double priceTicketMedium(double a, double b) {
        double priceTicketMedium = a / b;
        return Math.round(priceTicketMedium);

    }

public static double totalTravel(int x, int y) {
        double totalTravel = (x * 2) + ((y-x) * 1.5);
        return totalTravel;

    }

}
