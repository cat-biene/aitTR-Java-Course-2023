package practice.fibonacci;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> { // класс реализующий Iterator интерфейс,
    // с параметром универсального типа Integer.
    // Это означает, что экземпляры этого класса можно использовать в
    // качестве итераторов над последовательностью целых чисел.

    // fields of class
    private int quantity; // общее количество чисел Fibonacci, которые необходимо сгенерировать.
    private int currPosition; // отслеживает текущую позицию в последовательности Fibonacci.
    private int current = 1; //  представляет текущее число Fibonacci, инициализированное значением 1.
    private int next = 1; // редставляет следующее число Fibonacci, также инициализированное значением 1.


    // constructor
    public FibonacciIterator(int quantity) { // конструктор принимает параметры и инициализирует параметр указаным значением
        this.quantity = quantity;
    }

    @Override
    public boolean hasNext() { // этот метод проверяет, есть ли в последовательности Fibonacci
        // еще элементы для перебора. Он возвращает значение true, если элементов больше
        return currPosition < quantity; // проверка на количесиво чисел в ряду
    }

    @Override
    public Integer next() { // как получить следующее число Фибоначчи в ряду = предыдущее + текущее
        int res = current;  // в res ложим текущее значение
        int temp = current; // переносим текущеее значение во временную переменную
        current = next; // в текущее значение ложим следующее значение
        next = temp + next; // вычисляем следующее новое значение
        currPosition++; // добавляем + 1 к текушему счету
        return res; // возвращаем результат
    }
}
