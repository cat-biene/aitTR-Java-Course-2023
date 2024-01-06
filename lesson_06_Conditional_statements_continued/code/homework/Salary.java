package homework;
// Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж,
// если базовая зарплата 500$.
// За 3 года работы надбавка 10%,
// за 5 лет работы надбавка 50%,
// за 10 лет работы надбавка 100%,
// за 15 лет работы надбавка 150%.
// Сколько лет проработал работник вводится с клавиатуры.

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        // Write a program for calculating the payment of money to an employee,
        // taking into account the bonus for length of service,
        // if the base salary is $500. For 3 years of work, a 10% bonus,
        // for 5 years of work, a 50% bonus, for 10 years of work, a 100% bonus,
        // for 15 years of work, a 150% bonus.
        // How many years the employee has worked is entered from the keyboard

        int salary = 500;
        double addForSal3 = salary * 0.1;
        double addForSal5 = salary * 0.5;
        double addForSal10 = salary * 1.0;
        double addForSal15 = salary * 1.5;

        double paymentMoney = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year of work:" );
        int year = scanner.nextInt();


        if(year < 3) {
            paymentMoney = salary;
            System.out.println("Salary: " + paymentMoney);
        } else if(year >= 3 && year < 5) {
            paymentMoney = salary + addForSal3;
            System.out.println("Salary: " + paymentMoney);
        } else if(year >= 5 && year < 10) {
            paymentMoney = salary + addForSal5;
            System.out.println("Salary: " + paymentMoney);
        } else if(year >= 10 && year <15) {
            paymentMoney = salary + addForSal10;
            System.out.println("Salary: " + paymentMoney);
        } else {
            paymentMoney = salary + addForSal15;
            System.out.println("Salary: " + paymentMoney);
        }

    }

}
