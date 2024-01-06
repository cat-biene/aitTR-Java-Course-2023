package practice;

import java.lang.reflect.Array;

public class Application {

    public static void main(String[] args) {

        int[] array = {-12, 5, 36, 28, -16, 100, 82, 64, 57, 5};
        BubbleSort2.printArray(array); // печать до сортировки
        BubbleSort2.bubbleSort(array); // делаем сортировку
        BubbleSort2.printArray(array); // печать после сортировки

        System.out.println(Math.min(34, -5));



    }

}
