package practice;
//Запустить обратный отсчет старта ракеты от 10 до 0.
// Последнее сообщение: "Поехали!...".

public class Rocket {

    public static void main(String[] args) {

        int countDown = 10;
        System.out.println(countDown);

        while (countDown > 0) {
            countDown--;
            System.out.println(countDown);
        }

        System.out.println("Go!...");

    }

}
