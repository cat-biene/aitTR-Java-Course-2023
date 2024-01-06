package homework;
// Для всех задач задайте массив из 10 случайных чисел в интервале от -10 до 10.
// Написать метод, принимающий массив целых чисел,
// и возвращающий произведение всех его элементов с четными индексами.

public class MultiplicationNumbers {

    public static void main(String[] args) {

        int[] numbers = new int[10]; // создаем массив

        // int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное **целое** число в интервале [a, b]
        // a  - может быть, b  - может быть

        int a = -10;
        int b = 10;

        for (int i = 0; i < numbers.length; i++) { // запускаем цикл
            numbers[i] = (int)(Math.random() * (b - a + 1) + a); // получаем случайные целые числа от -10 до 10

        }

        System.out.println(" Array of random numbers : ");// печатаем массив
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }

        System.out.println();
        System.out.println();


        System.out.println(" Product of all numbers :");
        int multiplicationElements = multiplicationOfElements(numbers); // создаем перемменную для произведения всех элементов с четными индексами
        System.out.println(multiplicationElements); // печатаем произведение всех элементов

    }

    public static int multiplicationOfElements(int[] arr) { // вызыавем метод, который принимает массив целых чисел и возвращает произведение всех элементов с четными индексами
        int product = 1; // переменная - произведение, присваем 1, так как умножение на 0 даст 0
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) { // проверяем что индекс четный
                product *= arr[i];
            }

        }
        return product;
    }

}
