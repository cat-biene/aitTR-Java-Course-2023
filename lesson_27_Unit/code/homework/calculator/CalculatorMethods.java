package homework.calculator;
// Реализовать 5 методов для калькулятора
// (сложение, вычитание, умножение, деление с остатком, целая часть от деления),
// который работает с целыми числами. Покрыть все методы тестами.

public class CalculatorMethods {

    public int sumNumbers(int a, int b) {
        int result = 0;
        result = a + b;
        return result;
    }

    public int subtractionNumbers(int a, int b) {
        int result = 0;
        result = a - b;
        return result;
    }

    public int multiplicationNumbers(int a, int b) {
        int result = 0;
        result = a * b;
        return result;
    }

    public int divisionNumbers(int a, int b) {
        int result = 0;
        result = a / b;
        return result;
    }

    public int divWithRemNumbers(int a, int b) {
        int result = 0;
        result = a % b;
        return result;
    }
}
