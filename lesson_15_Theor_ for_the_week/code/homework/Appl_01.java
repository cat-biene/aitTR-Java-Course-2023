package homework;
// Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
// Выполните сортировку полученного массива.
// Попало ли число 0 в этот массив? (выяснить с помощью binary search)
// Если да, то на какое место (индекс) в массиве?
// Если нет, то на какой индекс его следует поставить?

public class Appl_01 {
    public static void main(String[] args) {

        int[] array = Methods_01.fillArray(10, -100, 100);
        Methods_01.printArray(array);
        Methods_01.selectedSort(array);
        Methods_01.printArray(array);
        int index = Methods_01.binarySearch(array, 0);
        System.out.println("Index = " + index);
        if (index >= 0) {
            System.out.println(0 + " presents in array, index = " + index);
        } else {
            System.out.println(0 + " doesn't presetn in array, index for possible position is " + (-index -1));
        }
        Methods_01.split();
        int[] array1 = Methods_01.fillArray(10, -100, 100);
        Methods_01.printArray(array1);
        int[] array2 = Methods_01.positiveNumbers(array1);
        Methods_01.printArray(array2);

    }
}
