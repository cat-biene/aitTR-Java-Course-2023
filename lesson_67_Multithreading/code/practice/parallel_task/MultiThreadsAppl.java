package practice.parallel_task;

import pactice.MyTaskImpl;

public class MultiThreadsAppl {

    private static final int MAX = 10;
    private static int SIZE = 3;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread started"); // это запуск первого thread

        /*MyTaskImpl task = new MyTaskImpl("Parallel task", MAX);
        task.run(); // это запуск второго thread*/

        MyTasksImpl task1 = new MyTasksImpl("Parallel One ", MAX); // создали задачу
        MyTasksExtends task2 = new MyTasksExtends("Parallel Two ", MAX);

        Thread thread1 = new Thread(task1); // создали новый поток и передали ему эту задачу
        Thread thread2 = new Thread(task2); // создали параллельный поток и передали ему эту задачу

        thread1.start(); // поток запустили
        thread2.start(); // поток запустили

        // создаем массив параллельных задач на классе, который implements Runnable
        MyTasksImpl[] tasks = new MyTasksImpl[SIZE]; // создаем массив параллельных задач
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = new MyTasksImpl("Name #" + i, MAX);

        }

        // создаем массив потоков
        Thread[] threads = new Thread[SIZE];
        for (int i = 0; i < threads.length; i++) {
            threads[i] =new Thread(tasks[i]);


        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

        for (int i = 0; i < MAX; i++) {
            System.out.println("Main count = " + i); // докладывает main
            try {
                Thread.sleep(10); // положили поток спать
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        thread1.join(); // присоединение к идущим процессу
        thread2.join(); // присоединение к идущим процессу
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        System.out.println("Main thread finished.");
    }
}
