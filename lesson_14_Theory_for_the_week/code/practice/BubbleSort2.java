package practice;

public class BubbleSort2 {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) { // правый конец будет двигаться на встречу левому
              if (arr[j] > arr[j + 1]) { // если левый из соседей больше левого, то их меняем местами
                  int t = arr[j];
                  arr[j] = arr[j +1];
                  arr[j + 1] = t;
              }
            }

        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void splt() {
        System.out.println("=========================================");
    }
}
