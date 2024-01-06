package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TarakansRaceAppl {

    static String winner = null; // переменная для хранения номера победителя
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in); // создание объекта Scanner для чтения из консоли

        // спрашиваем у пользователя количество тараканов
        System.out.println("Input the number of cockroaches:");
        int numberOfCockroaches = scanner.nextInt();

        // запрос у пользователя ввода длительности цикла забега
        System.out.println("Input the cycle of run: ");
        int runCycle = scanner.nextInt();

        // установка минимального и максимального времени сна
        int min = 2;
        int max = 5;

        // генерация случайного времени сна в пределах заданных границ
        Random random = new Random();
        int sleepTime = min + random.nextInt((max + 1) - min);

        // выводим сообщение о начале гонки
        System.out.println("Tarakan Race START!");

        // создаем список для хранения потоков тараканов
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < numberOfCockroaches; i++) {
            threads.add(new Thread(new Tarakan("Vasay" + i, runCycle, sleepTime)));
        }

        // запуск всех потоков
        for (Thread thread : threads) {
            thread.start();
        }

        // ожидание завершения всех потоков
        for (Thread thread : threads) {
            thread.join();
        }

        // вывод сообщения о завершении гонки и объявление победителя
        System.out.println("Tarakan Race Finish!");
        System.out.println("Congratulations to tarakan #" + winner + "!  It's a winner!");

        // закрытие Scanner для избежания утечек ресурсов
        scanner.close();
}

    // метод для установки победителя
    public static void setWinner(String tarakanNumber) {
        winner = winner == null ? tarakanNumber : winner;
    }
}