package homework;
// Create a game application “TarakansRace”
// Cockroach is a thread that performs a loop of iterations.
// At each iteration, the thread prints its own number
// and goes to sleep for a random number of milliseconds [2-5].
// The sleep time range should be the same for all cockroaches.
// The cockroach that finishes the circle first is considered the winner.
//
//The application must receive the number of cockroaches
// and distance (number of iterations) from console I/O.
//
//At the end of the game the following message should be printed
// “Congratulations to cockroach #X (winner)” where X is the number of the winning cockroach.

import homework.TarakansRaceAppl;
public class Tarakan implements Runnable{

    // fields
    String tarakanNumber; // номер таракана
    int runCycles; // количество циклов забега
    int sleepTime; // время сна между циклами забега

    public Tarakan(String tarakanNumber, int runCycles, int sleepTime) {
        this.tarakanNumber = tarakanNumber;
        this.runCycles = runCycles;
        this.sleepTime = sleepTime;
    }

    // метод, который выполняется при запуске потока
    @Override
    public void run() {
        // вывод сообщения о начале забега для данного таракана и идентификации потока
        System.out.println("Tarakan #" + tarakanNumber + " is running. In Thread #" + Thread.currentThread().getName());

        // цикл для каждого забега таракана
        for (int i = 0; i < runCycles; i++) {
            // вывод номера таракана и текущего цикла забега
            System.out.println("Tarakan # " + tarakanNumber + " is running round number " + (i + 1));

            try{
                Thread.sleep(sleepTime); // поток "засыпает" на определенное время (имитация бега таракана)
            } catch(InterruptedException e) {
                throw new RuntimeException();
            }
        }
        System.out.println();
        TarakansRaceAppl.setWinner(tarakanNumber); // установка победителя в классе TarakansRaceAppl
    }


}
