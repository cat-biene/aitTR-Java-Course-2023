package practice;
// На базе метода sortArray в классе ArrayMethods создайте метод sortArrayIntAsc,
// который делает сортировку от большего элемента к меньшему.
// Примените этот метод в классе ArrayAppl ко всем целочисленным массивам.

public class ArrayApplication {

    public static void main(String[] args) {
        int[] number = {8, 9, 12, 65, 98, 3, 57, 4, 1, 22};
        ArrayMethods.printArray(number);
        int max = ArrayMethods.maxArray(number);
        System.out.println(" Maximum is " + max);
        int maxIndex = ArrayMethods.maxIndex(number);
        System.out.println(" Index of max element is " + maxIndex);
        System.out.println(" Array of minimum is ");
        ArrayMethods.sortArray(number); // выполняем сортировку
        ArrayMethods.printArray(number); // печатаем после сортировки
        System.out.println(" Array of maxsimum is ");
        ArrayMethods.sortArrayIntAsc(number);
        ArrayMethods.printArray(number);
        ArrayMethods.splt();

        int[] number2 = {-5, 56, -100, 0, 15, 52, 67, 8, 1};
        ArrayMethods.printArray(number2);
        int max2 = ArrayMethods.maxArray(number2);
        System.out.println(" Maximum is " + max2);
        int maxIndex2 = ArrayMethods.maxIndex(number2);
        System.out.println(" Index of max element is " + maxIndex2);
        System.out.println(" Array of minimum is ");
        ArrayMethods.sortArray(number2); // выполняем сортировку
        ArrayMethods.printArray(number2); // печатаем после сортировки
        System.out.println(" Array of maxsimum is ");
        ArrayMethods.sortArrayIntAsc(number2);
        ArrayMethods.printArray(number2);
        ArrayMethods.splt();

        String[] digits = {"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"};
        ArrayMethods.printArray(digits);
        ArrayMethods.splt();

        // Дополните класс ArrayMethods методами, которые находят:
        // минимальный элемент в массиве
        // индекс минимального элемента в массиве
        // В классе ArrayAppl задайте собственный массив из целых чисел на 10 элементов, найдите минимальный элемент и его индекс.
        int[] number3 = new int[10]; // объявляем массив для 10 элементов
        int a = -50;// назначаем переменную - массив от
        int b = 50; // назначаем переменную - массив до
        ArrayMethods.rondomNambers(number3, a, b); // вызываем метод - поиск случайных целых чисел
        ArrayMethods.printArray(number3);// вызываем метод - печатаем массив
        int min = ArrayMethods.min(number3); // вызываем метод - поиск минимального элемента в массиве
        System.out.println(" Minimum is " + min); // печатаем текс и результат
        int indexMin = ArrayMethods.minIndex(number3); // вызваем метод - поиск знначения минимального индекса элемента
        System.out.println(" Index of min elements is " + indexMin); // печатаем текст и результат
        System.out.println(" Array of minimum is ");
        ArrayMethods.sortArray(number3); // выполняем сортировку
        ArrayMethods.printArray(number3); // печатаем после сортировки
        System.out.println(" Array of maxsimum is ");
        ArrayMethods.sortArrayIntAsc(number3);
        ArrayMethods.printArray(number3);
        ArrayMethods.splt();
    }
}
