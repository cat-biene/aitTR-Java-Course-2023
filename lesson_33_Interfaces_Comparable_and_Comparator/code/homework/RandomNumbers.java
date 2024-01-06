package homework;

import java.util.Arrays;
import java.util.Random;

// Заполните массив целых чисел числами по порядку от 1 до 100.
// Задумайте случайное число в интервале от 1 до 100
// и добавьте его в массив на произвольную (случайную) позицию.
// Найдите добавленный в массив дубликат наиболее
// простым способом.
public class RandomNumbers {
    public static void main(String[] args) {
        // Заполнение массива числами от 1 до 100
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Задумываем случайное число от 1 до 100
        Random random = new Random();
        int randomValue = random.nextInt(100) + 1;

        // Добавляем случайное число в массив на случайную позицию
        int randomPosition = random.nextInt(100);
        array[randomPosition] = randomValue;

        // Поиск дубликата
        int duplicate = findDuplicate(array);

        // Вывод результатов
        System.out.println("Добавленное случайное число: " + randomValue);
        System.out.println("Позиция добавленного числа: " + randomPosition);
        System.out.println("Найденный дубликат: " + duplicate);
    }

    // Метод для поиска дубликата в массиве
    private static int findDuplicate(int[] array) {
        Arrays.sort(array); // Сортируем массив для упрощения поиска дубликата
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                return array[i];
            }
        }
        return -1; // Если дубликат не найден
    }
}
