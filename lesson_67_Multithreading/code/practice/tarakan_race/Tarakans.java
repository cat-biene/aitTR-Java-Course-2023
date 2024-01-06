package practice.tarakan_race;

import java.util.Random;

public class Tarakans implements Runnable{

    String name; // или номер

    static int distance; // спросим у пользователя
    static int minSleepTime = 2; // дано
    static int maxSleepTime = 5; // дано
    static String winner; // должен быть, какой-то метод для определения победителя
    static Random random = new Random();

    public Tarakans(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getMinSleepTime() {
        return minSleepTime;
    }

    public static void setMinSleepTime(int minSleepTime) {
        Tarakans.minSleepTime = minSleepTime;
    }

    public static int getMaxSleepTime() {
        return maxSleepTime;
    }

    public static void setMaxSleepTime(int maxSleepTime) {
        Tarakans.maxSleepTime = maxSleepTime;
    }

    public static String getWinner() {
        return winner;
    }

 //   public static void setWinner(String winner) {
 //       Tarakan.winner = winner;
 //   }

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        Tarakans.random = random;
    }

    public static void setDistance(int distance) {
        Tarakans.distance = distance;
    }

    @Override
    public void run() {
        for (int i = 0; i < distance; i++) {
            int sleepTime = minSleepTime + random.nextInt(maxSleepTime + 1 - minSleepTime);

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + " is moving"); // таракан ползет
        }
        // доклад о приходе к финишу
        System.out.println(name + " FINISHED");
        // у каждого таракана есть "добежать" до этой строчки программы
        if(winner == null)  {
            winner = name; // принцип "оплодотворения", принцип сперматозоида
        }

    }
}
