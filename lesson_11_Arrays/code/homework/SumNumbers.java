package homework;
//Для всех задач задайте массив из 10 случайных чисел в интервале от -10 до 10.
//Написать метод, принимающий массив целых чисел,
// и возвращающий сумму всех его нечетных элементов (не индексы!,
// а сами элементы).

public class SumNumbers {

    public static void main(String[] args) {

        int [] number = new int[10]; // создаем массив

        // int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное **целое** число в интервале [a, b]
        // a  - может быть, b  - может быть

        int a = -10;
        int b = 10;

        for (int i = 0; i < number.length; i++) { // запускаем цикл
            number[i] = (int)(Math.random() * (b - a + 1) + a); // получаем случайные числа от -10 до 10
        }

        System.out.println(" Array of random numbers : ");// печатаем массив
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");

        }

        System.out.println();
        System.out.println();

        System.out.println("Sum of odd elements: "); // выводим текс и переходим на новую строку
        int sumElements = sumOfElements(number); //  создаем переменную для суммы нечетных элементов
        System.out.print(sumElements); // выводим сумму  нечетных элементов

    }

    public static int sumOfElements(int[] arr) { // вызываем метод, который принимает массив целых чисел и возвращает сумму нечетных элементов
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];

            }

        }

        return sum;
    }

}
