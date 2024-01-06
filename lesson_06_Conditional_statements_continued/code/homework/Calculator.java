package homework;
// Написать приложение - калькулятор для работы с целыми числами:
// oper == 1 => +, oper == 2 => -, oper == 3 => *, oper == 4 => /, oper == 5 => % ,
// other print "Wrong operation"

import java.util.Scanner;

public class Calculator {

    // Write an application - a calculator for working with integers:
    // oper == 1 => +, oper == 2 => -, oper == 3 => *,
    // oper == 4 => /, oper == 5 => %, other print "Wrong operation"
    public static void main(String[] args) {

        int number1, number2, action;
        int result;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input first number: ");
        number1 = scanner.nextInt();
        System.out.println(" Input second number: ");
        number2 = scanner.nextInt();
        System.out.println("Input the number between 1 and 5 ");
        action = scanner.nextInt();

        switch (action) {
            case 1: {
                result = number1 + number2;
                System.out.println("Result is " + result);
                break;
            }
            case 2: {
                result = number1 - number2;
                System.out.println("Result is " + result);
                break;
            }
            case 3: {
                result = number1 * number2;
                System.out.println("Result is " + result);
                break;
            }
            case 4: {
                result = number1 / number2;
                System.out.println("Result is" + result);
                break;
            }
            case 5: {
                result = number1 % number2;
                System.out.println("Result is " + result);
                break;
            }
            default:
                System.out.println("Wrong operation");
        }
    }
}
