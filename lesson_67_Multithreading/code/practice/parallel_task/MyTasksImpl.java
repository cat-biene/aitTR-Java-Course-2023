package practice.parallel_task;

public class MyTasksImpl implements Runnable{

    // fields
    String name; // имя задачи
    int max; // до скольки досчитать

    // constructor
    public MyTasksImpl(String name, int max) {
        this.name = name;
        this.max = max;
    }

    @Override
    public void run() {
        System.out.println(name + " task started."); // доклад о начале работе
        // Считаем в цикле от нуля до максимума
        for (int i = 0; i < max; i++) {
            System.out.println(name + " count " + i); // докладывает на каждом шаге цикла
            try {
                Thread.sleep(16); // положили поток спать
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " task finished.");
    }
}
