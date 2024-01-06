package consultation.array;

import consultation.array.model.Method;
import homework.lucky_dampling.Methods;

import java.util.Arrays;

// создать массив на 20 элементо, случайные целые цисла от -50 до 30
// сколько положительных?
// сколько отрицательных?
// сколько четных? сколько нечетных?
// макимальное? минимальное?
// сортировка
// если заданое чило, найти его индекс
public class Application {

    public static void main(String[] args) {

        int[] numbers = Method.fillArray(20, -50, 30);
        Methods.printArray(numbers);
        int num = Method.positiveNum(numbers);
        System.out.println("Positive num = " + num);
        int indexMax = Method.indexMaxEl(numbers);
        System.out.println("Index of max element = " + indexMax);
        System.out.println("Max element = " + numbers[indexMax]);
        Method.bubbleSort(numbers); // сортируем массив
        System.out.println(Arrays.toString(numbers)); // печатаем массив

    }
}
