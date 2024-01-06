package practice;
// Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
// Найдите минимальный элемент массива и его индекс.
// Напечатайте все элементы массива с НЕчетными индексами.
// Найдите произведение всех четных элементов массива.

public class ArrayExsampl {

    public static void main(String[] args) {

        int[] array = {75, 34, -15, -123, 57, -145, 86, 77, 48, -59};

        int m = minElOfArray(array);
        System.out.println(" Min element of array is " + m);

        int i = minElOfIndex(array);
        System.out.println("Index of min element of array is " + i);

    } // ====== end of main =====


    // ========== Methods ===========

    public static int minElOfIndex(int[] array) {
        // пробигаем по массиву, каждый элемент сравним с min
        // если элемент будет меньше min, то делаем min = этому элементу
        int min = array[0];
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) { // усли элемент массива с индексом i меньше min
                min = array[i];
                indexMin = i;

            }

        }

        return indexMin;

    }
    public static int minElOfArray(int[] array) {
        // пробигаем по массиву, каждый элемент сравним с min
        // если элемент будет меньше min, то делаем min = этому элементу
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) { // усли элемент массива с индексом i меньше min
                min = array[i];

            }

        }

        return min;

    } // ======= end of methods =========

}