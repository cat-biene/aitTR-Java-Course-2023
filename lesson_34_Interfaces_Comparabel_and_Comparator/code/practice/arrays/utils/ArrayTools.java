package practice.arrays.utils;
// В класс ArrayTools из урока 34, добавит два перегруженных метода бинарного поиска,
// для работы с Comparable элементами массива, и для работы с Comparator.

import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayTools {
    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("====================");
    }

    public static <T> int search(T[] arr, T value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> T findByPredicate(T[] arr, Predicate<T> predicate) {
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                return arr[i];
            }
        }
        return null;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    // Бинарный поиск для массива элементов, реализующих Comparable
    public static <T extends Comparable<T>> int binarySearchComparable(T[] arr, T target) {
        int left = 0;// переменная - левый край
        int right = arr.length - 1; // переменная - праый край
        while (left <= right) {
            int mid = left + (right - left) / 2;

            int comparisonResult = arr[mid].compareTo(target); // сравниваем элементы this и наденный

            if (comparisonResult == 0) {
                return mid; // найден элемент, возращаем индекс
            }
            if (comparisonResult < 0) {
                left = mid + 1; // ищем в правой половине
            } else {
                right = mid - 1; // ищем в левой половине
            }
        }
        return -1; // элемент не найден
    }

    // Бинарный поиск для массива элементов с использованием Comparator
    public static <T> int binarySearchComparator(T[] arr, T target, Comparator<T> comparator) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int comparisonResult = comparator.compare(arr[mid], target);

            if (comparisonResult == 0) {
                return mid;
            }
            if (comparisonResult < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
