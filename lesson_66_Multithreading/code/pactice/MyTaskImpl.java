package pactice;
// Multithreading - это один из вариантов многозадачности.
// Создание нового треда в аппликации, равносильно созданию нового стека функций.
// Т. е. в многопоточной аппликации могут одновременно работать несколько стеков.

// Создать новую задачу в Java можно или имплементировав интерфейс Runnable,
// или расширяя класс Thread. В любом случае надо переопределить метод run в котором
// и будет реализована новая задача.

// Чтобы новый тред стартовал, надо создать объект типа
// Thread передав в конструктор объект типа Runnable,
// и после этого вызвать у объекта типа Thread метод start.

// Если необходимо, чтобы один тред дождался завершения другого треда,
// то в процессе работы первого треда, надо у объекта второго треда вызвать метод join.
public class MyTaskImpl implements Runnable{

    // fields
    String name; // имя задачи
    int max; // до скольки досчитать

    // constructor
    public MyTaskImpl(String name, int max) {
        this.name = name;
        this.max = max;
    }

    @Override
    public void run() {
        System.out.println(name + "task started."); // доклад о начале работе
        // Считаем в цикле от нуля до максимума
        for (int i = 0; i < max; i++) {
            System.out.println(name + "count " + i); // докладывает на каждом шаге цикла
            try {
                Thread.sleep(16); // положили поток спать
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + "task finished.");
    }
}
