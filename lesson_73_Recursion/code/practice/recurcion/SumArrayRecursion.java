package practice.recurcion;

import java.util.Arrays;

public class SumArrayRecursion {

    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 9, 11, 13, 15, 17, 19, 21, 10}; // array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();

        // sum all array elements
        int sum = sumArrayRecursion(arr);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int sumArrayRecursion(int[] arr) {
        return sumArrayRecursion(arr, 0);
    }

    // method need to go on the right and sum elements
    private static int sumArrayRecursion(int[] arr, int i) {
        int sum = 0;
        if(i == arr.length - 1) {
          sum = arr[i];
        } else {
            sum = arr[i] + sumArrayRecursion(arr, i + 1);
        }
        return sum;
    }
}
