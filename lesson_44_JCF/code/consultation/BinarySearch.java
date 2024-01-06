package consultation;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 9, 9, 9, 10, 15, 20, 23, 23, 23, 23, 25, 26, 30};

        int index = Arrays.binarySearch(arr, 9);
        System.out.println(index);
    }
}
