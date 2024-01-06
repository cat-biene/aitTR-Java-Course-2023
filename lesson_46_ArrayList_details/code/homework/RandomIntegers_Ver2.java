package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
    Заполните структуру типа ArrayList 20-ю случайными целыми числами в интервале от 1 до 10.
    Удалите из полученного списка дубликаты.
*/
public class RandomIntegers_Ver2 {
    public static void main(String[] args) {
        // создаем ArrayList типа <Integer> и заполняем его 20 случайными числами в диапазоне от 1 до 10 с помощью цикла fori.
        List<Integer> randomIntegers = new ArrayList<>();
        // Класс Random используем для генерации случайных чисел в диапазоне от 1 до 10.
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomIntegers.add(random.nextInt(10) + 1);
        }
        System.out.println(randomIntegers + " <== Случайные числа");

        List<Integer> uniqueIntegers = new ArrayList<>(); // создаём новый список для уникальных элементов
        for (Integer element : randomIntegers) { // Проходимся в цикле по всем элементам списка randomIntegers
            if (!uniqueIntegers.contains(element)) { // Если этот элемент отсутствует в uniqueIntegers
                uniqueIntegers.add(element); // Тогда добавим его
            }
        }
        System.out.println(uniqueIntegers + " <== Уникальные случайные числа (БЕЗ ДУБЛИКАТОВ)");

    }
}
