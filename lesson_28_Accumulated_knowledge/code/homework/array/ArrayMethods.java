package homework.array;

public class ArrayMethods {

        public int sumArray(int[] arr) {
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                        sum += arr[i];
                }
                return sum;
        }

        public int indexOfElement(int[] arr, int elements) {
                for (int i = 0; i < arr.length; i++) {
                       if (arr[i] == elements) {
                               return i;// возвращаем индекс, если элемент найден
                       }
                }
                return -1;// возвращаем -1, если элемент не найден
        }
}
