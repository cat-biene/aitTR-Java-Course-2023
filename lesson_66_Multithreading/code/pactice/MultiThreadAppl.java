package pactice;
// Multithreading - это один из вариантов многозадачности.
// Создание нового треда в аппликации, равносильно созданию нового стека функций.
// Т. е. в многопоточной аппликации могут одновременно работать несколько стеков.

// Создать новую задачу в Java можно или имплементировав интерфейс Runnable,
// или расширяя класс Thread. В любом случае надо переопределить метод run в котором
// и будет реализована новая задача.

// Чтобы новый тред стартовал, надо создать объект типа Thread
// передав в конструктор объект типа Runnable,
// и после этого вызвать у объекта типа Thread метод start.

// Если необходимо, чтобы один тред дождался завершения другого треда,
// то в процессе работы первого треда, надо у объекта второго треда вызвать метод join.
public class MultiThreadAppl {
    private static final int MAX = 10;

    public static void main(String[] args) {

        System.out.println("Main thread started"); // это запуск первого thread

        /*MyTaskImpl task = new MyTaskImpl("Parallel task", MAX);
        task.run(); // это запуск второго thread*/

        MyTaskImpl task = new MyTaskImpl("Parallel task", MAX); // создали задачу
        Thread thread = new Thread(task); // создали новый поток и передали ему эту задачу
        thread.start(); // поток запустили

        for (int i = 0; i < MAX; i++) {
            System.out.println("Main count = " + i); // докладывает main
            try {
                Thread.sleep(16); // положили поток спать
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Main thread finished.");
    }
}
