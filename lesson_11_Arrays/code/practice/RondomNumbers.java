package practice;
// Задайте массив из 10 случайных натуральных чисел в интервале от -20 до 20.
// Запросите у пользователя какое-то натуральное число.
// Определите, есть ли это число в массиве.
// Создайте и используйте метод searchInArray, который получает на вход массив и искомое число, а возвращает
// ответ - нашлось ли это число в массиве.

import java.util.Scanner;

public class RondomNumbers {

    public static void main(String[] args) {

        // задаем массив
        int[] rondomInt = new int[10];

        // int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное **целое** число в интервале [a, b]
        // a  - может быть, b  - может быть

        int a = -20;
        int b = 20;

        for (int i = 0; i < rondomInt.length; i++) {
            rondomInt[i] = (int)(Math.random() * (b - a + 1) + a);

        }
       // печатаем полученный массив
        for (int i = 0; i < rondomInt.length; i++) {
            System.out.print(rondomInt[i] + " ");

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input number : ");
        int num = scanner.nextInt();

        boolean isInArray = searchInArray(rondomInt, num);
        if(isInArray) {
            System.out.println(" Number " + num + " present in array ");
        } else {
            System.out.println(" Number " + num + " does not present in array ");
        }

    }

    public static boolean searchInArray(int[] arr, int n) {
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n) {
                res = true;

            }

        }
        return res;

    }

}
