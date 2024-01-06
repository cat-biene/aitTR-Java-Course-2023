package homework.arrayNumber;
// Создайте массив из 100 случайных целых чисел в интервале от -10 до 10. Подсчитайте, сколько в этом массиве оказалось:
// положительных чисел;
// отрицательных чисел;
// четных чисел;
// нулей
// Оформите решение данной задачи методами и напишите для них тесты

public class ArrayNumbers {

    // method positive numbers
    public int numbersPositive(int[] arr) {
        int posit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posit ++;
            }
        }
        return posit;
    }

    //  method negative numbers
    public int numbersNegative(int[] arr) {
        int negative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negative ++;
            }
        }
        return negative;
    }

    // method even numbers
    public int numbersEven(int[] arr) {
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even ++;
            }
        }
        return even;
    }

    // method odd numbers
    public int numbersOdd(int[] arr) {
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd ++;
            }
        }
        return odd;
    }

    // method find zero
    public int numbersZero(int[] arr) {
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                zero ++;
            }
        }
        return zero;
    }
}