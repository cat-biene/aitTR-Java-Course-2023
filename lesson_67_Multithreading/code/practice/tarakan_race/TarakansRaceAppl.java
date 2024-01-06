package practice.tarakan_race;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TarakansRaceAppl {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number of tarakan: ");
        int nTarakans = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Input distence: ");
        int distance = Integer.parseInt(bufferedReader.readLine());
        Tarakans.setDistance(distance); // всем тараканам назначили дистанцию

        Thread[] tarakans = startRace(nTarakans); // старт гонки
        waitFinish(tarakans);

        System.out.println("Congratulations to the Winner " + Tarakans.getWinner());
    }

    private static Thread[] startRace(int nTarakans) {
        Thread[] threads = new Thread[nTarakans];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Tarakans("Tarakan # " + (i + 1))); // новый тред, котоому пеедали процесс на базе раннабл класс
        }
        // запускаем треды
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        return threads;
    }

    private static void waitFinish(Thread[] tarakans) {
        for (int i = 0; i < tarakans.length; i++) {
            try {
                tarakans[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
