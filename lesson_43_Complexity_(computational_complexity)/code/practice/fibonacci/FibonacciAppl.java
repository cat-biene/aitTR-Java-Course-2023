package practice.fibonacci;

public class FibonacciAppl {

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci(8);
        // распечатать первые 8 чисел из ряда Fibonacci
        // 1, 1, 2, 3, 5, 8, 13, 21 - получиться
        Fibonacci.printFibonacciNumbers(fibonacci);

        // сложить все эти числа
        // sum = 54
        int sum = fibonacci.calculateSumFibonacciNumber(fibonacci);
        System.out.println("Sum of fibonacci numbers: " + sum);
    }


}
