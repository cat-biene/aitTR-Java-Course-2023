package homework;
// Напишите программу, которая удаляет из массива элемент по условиям:
// по заданной позиции
// по значению

public class MassiveTask {

    public static void main(String[] args) {

        int[] sourse = new int[5];
        // int[] sourse = {1, 2, 6, 9, -5};

        sourse[0] = 1; // так как массив стартует с нуля
        sourse[1] = 2;
        sourse[2] = 6;
        sourse[3] = 9;
        sourse[4] = -5; // длина массива

       // sourse[1] = x;

        int x = sourse[1]; // значение по индексу 1, это 2 элемент в массиве = 2
        printArray(sourse);
        dellByPosition(sourse, 1);

        String[] bArr = new String[10];
        System.out.println();

    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +  "\t");

        }

        System.out.println();
    }

    public static void dellByPosition(int[] sourse, int j) {
        for (int i = 0; i < sourse.length; i++) {
            if(i == j) {
                sourse[i] = 0;
            }

        }
    }

}
