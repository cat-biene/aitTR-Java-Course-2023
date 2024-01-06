package practice;
// Задача о яблоках (начальное значение 30 яблок).
// Запустить цикл, в котором яблоки берутся из корзины до тех пор, пока они там есть.
// Последнее сообщение: "Яблоки кончились!"

public class Apples {

    public static void main(String[] args) {
        int apples = 30; // стартовое значение
        int counter = 0; // счетчик
        int applesInCycle = apples; // параметр

        while (applesInCycle > 0) {
            // тело цикла
            System.out.println("Take one apple from basket");
            applesInCycle--; // изменяем параметр цикла applesInCycle = applesInCycle - 1
            counter++;
            System.out.println(" The rest of apples " + applesInCycle);
        }
        System.out.println(" The job is done, total apples " + counter + " added in pei from " + apples + " in basket. ");
    }

}
