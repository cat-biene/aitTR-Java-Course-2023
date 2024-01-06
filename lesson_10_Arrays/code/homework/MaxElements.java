package homework;
// Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
// Найдите максимальный элемент массива и его индекс

public class MaxElements {

    public static void main(String[] args) {

        int[] elements = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38}; // создаем массив для хранения целых чисел

        int maxElements = elements[0]; // предполагаем что максимальный элемент равен первому индексу
        int maxIndex = 0; //  индекс равен нулю

        for (int i = 0; i < elements.length; i++) { // запускаем цикл
            if (elements[i] > maxElements) { // сравниваем елементы с максимальным элементом
                maxElements = elements[i]; // если текущий элемент больше максимального мы обновляем максимальный элемент
                maxIndex = i; // обновляем индекс текущего элемента

            }

        }

        System.out.println(" Max element is " + maxElements); // печатаем максимальный элемент
        System.out.println(" Max index is " + maxIndex); // печатаем максимальный индекс

    }

}
