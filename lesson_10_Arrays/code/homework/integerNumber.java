package homework;
// создайте массив из 20 случайных целых чисел в интервале от 10 до 30.
// Выведите массив на печать.
// Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.

import java.lang.reflect.Array;
import java.util.Arrays;

public class integerNumber {

    public static void main(String[] args) {

        int[] numbers = new int[20]; // объявили масив

        for (int i = 0; i < numbers.length; i++) { // запускаем цикл
            numbers[i] = (int) (Math.random() * 21) + 10; // получаем случайные числа от 10 до 30
            // (для этого умножаем Math.random() на 21 (разница между 30 и 10)
            // и добавляем 10 (минимальное значение в нашем диапозоне)

        }

        for (int i = 0; i < numbers.length; i++) { // печатаем массив
            System.out.print(numbers[i] + " | ");
        }

        System.out.println();

        if (numbers.length > 1) {
            int temp = numbers[0]; // объявляем переменную и присваиваем ей значение первого элемента
            numbers[0] = numbers[numbers.length - 1]; // присваиваем первому элементу значение последнего элемента
            numbers[numbers.length - 1] = temp; //  меняем местами первый и последний элемент

        }

        for (int i = 0; i < numbers.length; i++) { // печатаем результат
            System.out.print(numbers[i] + " | ");
        }


    }

}
