package homework.digitsFreq;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DigitsFreqApp {

    public static void main(String[] args) {

        int[] numbers = new int[1000000]; // Создаем массива numbers длиной 1000000 элементов
        numbers = generateNum(numbers); //  вызываем метода generateNum для заполнения этого массива случайными числами

        // шаг 1, каждое число разбить на числа
        // шаг 2 все цифры в map

        Map<Integer, Integer> digits = printNumbersFrq(numbers);// Вызов метода printNumbersFrq для обработки массива чисел и получения карты (Map) частоты встречаемости цифр
        printDigitFrequency(digits);// Вызов метода printDigitFrequency, для вывода результатов частоты встречаемости цифр
    }

    private static void printDigitFrequency(Map<Integer, Integer> digitFrequency) {
        System.out.println("Частота встречаемости цифр:");

        for (Map.Entry<Integer, Integer> entry : digitFrequency.entrySet()) { // Цикл for-each, который проходит по записям (entry) в digitFrequency
            System.out.println(entry.getKey() + ": " + entry.getValue()); //  выводит ключ (цифру) и значение (частоту) на экран.
        }
    }

    private static Map<Integer, Integer> printNumbersFrq(int[] numbers) {
        Map<Integer, Integer> digitFrequency = new HashMap<>();

        for (int number : numbers) { // Вложенный цикл while, который разбивает каждое число на цифры и обновляет карту частоты встречаемости цифр.
            while (number > 0) {
                int digit = number % 10;
                digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
                number /= 10;
            }
        }
        return digitFrequency; // Возвращение карты digitFrequency из метода printNumbersFrq
    }

    private static int[] generateNum(int[] arr) { // Объявление и определение метода generateNum, который заполняет переданный массив случайными числами от min до max
        Random random = new Random();
        int min = 1;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt((max + 1) - min) + min;

        }
        return arr;
    }
}
