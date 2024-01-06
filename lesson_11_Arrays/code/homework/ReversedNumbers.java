package homework;
// Для всех задач задайте массив из 10 случайных чисел в интервале от -10 до 10.
// Написать метод, принимающий массив целых чисел, и разворачивающий его.
// Последний элемент становится нулевым, предпоследний, первым, и т. д.
// Подсказка: этот метод должен изменить полученный массив.
public class ReversedNumbers {

    public static void main(String[] args) {

        int[] numbers = new int[10]; // создаем массив

        // int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное **целое** число в интервале [a, b]
        // a  - может быть, b  - может быть

        int a = -10;
        int b = 10;

        for (int i = 0; i < numbers.length; i++) { // запускаем цикл
            numbers[i] = (int)(Math.random() * (b - a + 1) + a); // получаем случайные целлые цисла от-10 до 10

        }

        System.out.println(" Array of random numbers : ");
        for (int i = 0; i < numbers.length; i++) { // печатаем массив
            System.out.print(numbers[i] + " ");

        }

        System.out.println();
        System.out.println();

        int[] reversedElement = reversedOfElements(numbers); // переменная принимает
        System.out.println(" Reversed array : ");// печатаем развернутый массив
        for (int i = 0; i < reversedElement.length; i++) {
            System.out.print(reversedElement[i] + " ");

        }

    }

    public static int[] reversedOfElements(int[] arr) { // метод будет возвращать массив целых чисел int[]
        int[] reversed = new int[arr.length]; // создаем новый массив для развернутых чисел
        int n = 0; // индекс в новом массиве

        for (int i = arr.length - 1;  i >= 0 ; i--) { // запускаем цикл
            reversed[n] = arr[i]; // присваиваем элемен
            n++;

        }

        return reversed;
    }

}
