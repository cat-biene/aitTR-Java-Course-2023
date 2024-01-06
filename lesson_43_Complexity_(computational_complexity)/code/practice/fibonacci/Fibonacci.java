package practice.fibonacci;

// import practice.fibonacci.FibonacciIterator;
import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> { // объявляем класс с именем Fibonacci, реализующим Iterable интерфейс,
    // с параметром универсального типа Integer.
    // Это означает, что экземпляры этого класса можно использовать в расширенных циклах for.

    // fields of class
    private int quantity; // количество чисел в последовательности

    // constructor
    public Fibonacci(int quantity) { // принимаем int параметр quantity
        this.quantity = quantity;    // и инициализируем quantity переменную экземпляра предоставленным значением.

    }

    // setter
    public void setQuantity(int quantity) { // Это метод установки, позволяющий изменить quantity после создания объекта.
        this.quantity = quantity;
    }

    public static void printFibonacciNumbers(Fibonacci fibonacci) { // метод для печати чисел Fibonacci
        for (int number : fibonacci) { // цикл  for each, для каждого int вызываемого number в последовательности fibonacci
            System.out.print(number + " "); // печатаем цисла
        }
        System.out.println();
    }

    public int calculateSumFibonacciNumber(Fibonacci fibonacci) { // метод для вычисления суммы
        int sum = 0; // инициализируем переменную в которой будем складывать числа
        for (int number : fibonacci) { // перебираем цикл, вызывая целое число в fibonacci последовательности
            sum += number; // складываем числа
        }
        return sum; // возвращаем сумму
    }

    // method toString
    @Override
    public String toString() {
        return "Fibonacci{" +
                "quantity=" + quantity +
                '}';
    }

    public Iterator<Integer>iterator() {
        return new FibonacciIterator(quantity); // cоздаем список специальных чисел в соответствии с тем,
        // сколько мы хотим, и он возвращает вам этот список,
    }
}
