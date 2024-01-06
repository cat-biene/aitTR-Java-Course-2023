package homework;
 //Напишите метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
// Сначала последний элемент, потом предпоследний, и т.д.
//Измените (лучше скопируйте и сделайте еще один метод) метод так,
// чтобы он работал с массивом, заполненном "цифрами прописью":
// zero, one, two, three, ..., nine Выполните "разворот" это массива.

public class StringNumbers {

    private static int[] reverseNumbers;

    public static void main(String[] args) {

        int[] integerNumber = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //создаем массив - целые числа

        System.out.println();
        printNumbers(integerNumber); // печатаем в исходном порядке
        reverseNumbers(integerNumber); // вызываем метод, который меняет порядок
        System.out.println();
        printNumbers(integerNumber); // печатаем развернутый массив

        System.out.println();
        System.out.println("=================================================");
        String[] stringNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; // создаем массив - цифры прописью

        System.out.println();
        printStringNum(stringNumbers);
        reverseStringNum(stringNumbers);
        System.out.println();
        printStringNum(stringNumbers);
    }

    public static void printStringNum(String[] arr) { // метод для печати в консоли
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void reverseStringNum(String[] arr) { // метод для разворота цифр прописью (меняем порядок элементов)

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }

    }

    public static void printNumbers(int[] arr) { // метод для печати в консоли
        for (int i = 0; i < arr.length; i++) { // запускаем цикл
            System.out.print(arr[i] + "\t"); // выводим  каждый элемент

        }
        System.out.println(); // печатает с новой строки
    }

    public static void reverseNumbers(int[] arr) { // метод для разворота элементов целых чисел (меняем порядок элементов)
        int temp = 0; // объявляем временную переменную
        for (int i = 0; i < arr.length / 2; i++) { // запускаем цикл
            temp = arr[i]; // временной переменной присваиваем значение первого элемента
            arr[i] = arr[arr.length - 1 - i];  // присваиваем первому элементу значение последнего элемента
            arr[arr.length - 1 - i] = temp; // меняем местами первый и последний элемент

        }

    }

}