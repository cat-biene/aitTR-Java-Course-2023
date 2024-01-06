package homework;
/*
 Написать программу, которая:

* Прочитает с клавиатуры количество вводимых чисел,
* прочитает с клавиатуры сами числа и соберёт их в множество,
* удалить из множества числа большие 10 и выведет полученные результаты на экран.
  Все числа, которые подаются на вход программы, целые.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number;
        Set<Integer> numbers = new HashSet<>();
        System.out.println("###############################################");
        System.out.println("#   Для выхода из программы введите цифру 0   #");
        System.out.println("###############################################");
        do {
            System.out.println("Введите число: ");
            number = scanner.nextInt();

            if (number != 0) {
                numbers.add(number);
                count++;
            }

        } while (!(number == 0));

        System.out.println("Кол-во введённых чисел: " + count);
        if (count == numbers.size()) {
            System.out.print("Введённые числа не повторялись");
        } else {
            System.out.print("Из них уникальных: " + numbers.size());
        }
        System.out.println(" => " + numbers);

        numbers.removeIf(i -> i > 10); // Удаляем из коллекции все числа, которые > 10
        System.out.println("Числа, которые < 10  => " + numbers);
    }
}
