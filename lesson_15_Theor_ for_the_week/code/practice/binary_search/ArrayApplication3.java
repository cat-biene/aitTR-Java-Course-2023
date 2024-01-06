package practice.binary_search;

public class ArrayApplication3 {

    public static void main(String[] args) {

        int[] array = {-50, -10, 20, -100, 70, -10, 60, 40, -10, 30, 50};
        ArrayMethods3.printArray(array);
        ArrayMethods3.bubbleSort(array);
        ArrayMethods3.printArray(array);
        ArrayMethods3.split();

        // вызываем
        int index = ArrayMethods3.binarySearch(array, 50);
        System.out.println(index);
        index =ArrayMethods3.binarySearch(array, -100);
        System.out.println(index);
       int count = ArrayMethods3.searchDuplicate(array, -10);
        System.out.println(count);
}
}