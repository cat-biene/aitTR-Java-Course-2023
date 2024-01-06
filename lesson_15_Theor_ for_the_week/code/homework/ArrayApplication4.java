package homework;
// Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
// Выполните сортировку полученного массива.
// Попало ли число 0 в этот массив? (выяснить с помощью binary search)
// Если да, то на какое место (индекс) в массиве?
// Если нет, то на какой индекс его следует поставить?

public class ArrayApplication4 {
    public static void main(String[] args) {

        int[] numbers = new int[20];
        int a = -100;
        int b = 100;

        ArrayMethods4.randomNumber(numbers, a, b); // вызываем метод получения случайных целых чисел
        ArrayMethods4.printNumber(numbers);// вызываем метод печати массива целых чисел
        ArrayMethods4.split(); //вызываем метод разделения результатов

        ArrayMethods4.bubbleSort(numbers); // вызываем метод пузырькоая сортировка
        ArrayMethods4.printNumber(numbers); // вызываем метод печати целых чисел массива (отсортированного)
        ArrayMethods4.split();//вызываем метод разделения результатов

        int index = ArrayMethods4.binarySearch(numbers, 0); // используем бинарный поиск для проверки, есть ли число 0 в массиве
        System.out.println(" Index = " + index);// печатаем результат
        if (index >= 0) {

            System.out.println(0 + " presents in array, index = " + index);

        } else {

            System.out.println(0 + " doesn't presetn in array, index for possible position is " + (-index -1));

        }
        ArrayMethods4.split(); //вызываем метод разделения результатов

        int index2 = ArrayMethods4.binarySearch2(numbers, 10); // используем бинарный поиск для проверки, есть ли число 0 в массиве
        System.out.println(index2);// печатаем результат
        ArrayMethods4.split(); //вызываем метод разделения результатов

        // Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
        // Реализуйте метод, который получает на вход исходный массив
        // и возвращает массив, содержащий только положительные числа из исходного массива.

        ArrayMethods4.randomNumber(numbers, a, b); // вызываем метод получения случайных целых чисел
        ArrayMethods4.printNumber(numbers);// вызываем метод печати массива целых чисел
        ArrayMethods4.split(); //вызываем метод разделения результатов

        int[] positiveNumber = ArrayMethods4.getPositiveNumbers(numbers); // вызываем метод - получаем массива положительные числа
        ArrayMethods4.printNumber(positiveNumber);// вызываем метод печати массива положительных целых чисел
        ArrayMethods4.split(); //вызываем метод разделения результатов

        int c = 40;
        int d = 25;
        int[] result = {c, d}; // Создаем массив и помещаем в него значения c и d
        ArrayMethods4.swap(result); // вызываем метод - меняем местами две переменные
        c = result[0]; // Присваиваем новое значение переменной c
        d = result[1]; // Присваиваем новое значение переменной d
        System.out.println("c = " + c); // печатаем результат первой переменной
        System.out.println("d = " + d); // печатаем результат второй переменной
        ArrayMethods4.split(); //вызываем метод разделения результатов
    }
}
