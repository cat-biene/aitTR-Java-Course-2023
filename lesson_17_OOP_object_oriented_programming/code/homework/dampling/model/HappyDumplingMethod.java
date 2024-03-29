package homework.dampling.model;
// (повторение и закрепление темы массивы, заполнение массива с помощью датчика случайных чисел)
// Задача про поиск "счастливого пельменя".
// Часть 1. Хозяйка налепила для гостей 30 пельменей, каждый весом от 25 до 35 грамм.
// Напишите программу, которая занесет в массив данные о весе каждого слепленного пельменя.
// Часть 2. Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.

import java.util.Random;

public class HappyDumplingMethod {

    public static void randomNumber(int[] arr, int a, int b) { // метод - поиск случайных целых чисел
        for (int i = 0; i < arr.length; i++) { // перебираем цикл
            arr[i] = (int) (Math.random() * (b - a + 1) + a); // генерируем случайные целые числа от а до b
        }
    }

    public static void printNumber(int[] arr) { // метод - печатает масив целыхчисел
        for (int i = 0; i < arr.length; i++) { // запускаем цикл
            System.out.println(" Пельмень " + (i + 1) + " : " + arr[i] + " грамм. "); // печатаем в консоли
        }
        System.out.println(); // печатем пустую строку, как разделитель
    }

    public static void split() { // метод - для оформления кода, разделяем результаты
        System.out.println("_______________________________________________________________________________________"); // печатаем в консолии
    }

    public static void happyDumpling(int[] arr) { // метод - поиск счастливого пельмення
        Random random = new Random();
        int hapDumpIndex = random.nextInt(arr.length); // генерируем случайный индекс счастливого пельменя
        arr[hapDumpIndex] += 15;// увеличиваем вес пельменя по случайному индексу на 15 граммов
            if (arr[hapDumpIndex] > 40) {
                System.out.println("Счастливый пельмень найден! Вес: " + arr[hapDumpIndex] + " грамм");
            }

    }
}
