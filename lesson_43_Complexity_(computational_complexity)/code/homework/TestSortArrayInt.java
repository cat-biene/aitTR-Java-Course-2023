package homework;

import java.util.Arrays;
import java.util.Date;

public class TestSortArrayInt {
    public static void main(String[] args) {
        long before;
        long after;
        int[] arrayUnsorted;
        long difference;


        int[] array = createAndFillArray(10000, 1, 100);
        //System.out.println(Arrays.toString(array));
        arrayUnsorted = arrayCopy(array);

        before = new Date().getTime();
        int [] arraySortedBubbleSort = bubbleSort(arrayUnsorted);
        after = new Date().getTime();
        difference = after - before;
        System.out.println("Метод Bubble Sort занял    : " + difference + " мс");
        System.out.println("---------------------------------");

        //////////////////////////////////////////////////////

        arrayUnsorted = arrayCopy(array);

        before = new Date().getTime();
        int[]arraySortedSelectSort = selectionSort(arrayUnsorted);
        after = new Date().getTime();
        difference = after - before;
        System.out.println("Метод Selection Sort занял : " + difference + " мс");
        System.out.println("---------------------------------");


        ///////////////////////////////////////////////////////////////


        before = new Date().getTime();
        Arrays.sort(array);
        after = new Date().getTime();
        difference = after - before;
        System.out.println("Метод Arrays.sort занял    : " + difference + " мс");


    }
    public static int[] arrayCopy(int[] arr) {
        int[] copyOfArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyOfArr[i] = arr[i];
        }
        return copyOfArr;
    }
    public static int[] createAndFillArray(int length, int feelFrom, int feelTo) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (feelTo - feelFrom + 1) + feelFrom);
        }
        return arr;
    }

    // Selection Sort
    // Метод сортировки 'выбором-перестановкой' от меньшего к большему
    public static int[] selectionSort(int[] arr) {
        int min = arr[0];
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            indexMin = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            //Переставляем минимальный элемент в начало
            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
        }

        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
