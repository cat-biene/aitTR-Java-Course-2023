package homework.arrayNumber;
// Создайте массив из 100 случайных целых чисел в интервале от -10 до 10. Подсчитайте, сколько в этом массиве оказалось:
// положительных чисел;
// отрицательных чисел;
// четных чисел;
// нулей
// Оформите решение данной задачи методами и напишите для них тесты


import homework.arrayNumber.ArrayNumbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayNumbersTest {

    ArrayNumbers arrayNumbers;

    @BeforeEach
    void setUp() {
        arrayNumbers = new ArrayNumbers();
    }

    @Test
    void numbersPositive() {
        int[] numbers = {10, 5, -9, 3, -7, 8};
        assertEquals(4, arrayNumbers.numbersPositive(numbers));
    }

    @Test
    void numbersNegative() {
        int[] numbers = {10, 5, -9, 3, -7, 8};
        assertEquals(2, arrayNumbers.numbersNegative(numbers));
    }

    @Test
    void numbersEven() {
        int[] numbers = {10, 5, -9, 3, -7, 8};
        assertEquals(2, arrayNumbers.numbersEven(numbers));
    }

    @Test
    void numbersOdd() {
        int[] numbers = {10, 5, -9, 3, -7, 8};
        assertEquals(4, arrayNumbers.numbersOdd(numbers));
    }

    @Test
    void numbersZero() {
        int[] numbers = {10, 0, -9, 3, -7, 0};
        assertEquals(2, arrayNumbers.numbersZero(numbers));
    }
}