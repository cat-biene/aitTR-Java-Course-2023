public class BubbleSort {

    // bubble sort
    // сравниваем левый элемент с правым элементом (стоят рядом) и если левый больше правого, то
    // меняем местами. То есть “больший элемент” будет “всплывать” к правому концу массива.
    // arr[i] - текущий, arr[i+1] - это соседний элемент справа
    // этот цикл надо повторять после всплытия каждого пузырька
    public static int[] bubbleSort(int[] arr) {
        // int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}