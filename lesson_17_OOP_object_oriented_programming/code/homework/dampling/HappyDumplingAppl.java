package homework.dampling;
// (повторение и закрепление темы массивы, заполнение массива с помощью датчика случайных чисел)
// Задача про поиск "счастливого пельменя".
// Часть 1. Хозяйка налепила для гостей 30 пельменей, каждый весом от 25 до 35 грамм.
// Напишите программу, которая занесет в массив данные о весе каждого слепленного пельменя.
// Часть 2. Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.

import homework.dampling.model.HappyDumplingMethod;

public class HappyDumplingAppl {

    public static void main(String[] args) {

        int[] dumlings = new int[30]; // создаем массив (30 пельмене)
        int a = 25;
        int b = 35;

        HappyDumplingMethod.randomNumber(dumlings, a, b);
        HappyDumplingMethod.printNumber(dumlings);
        HappyDumplingMethod.split();

        HappyDumplingMethod.happyDumpling(dumlings);
    }
}
