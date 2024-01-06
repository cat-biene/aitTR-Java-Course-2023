package homework;
// Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг. Найти среднюю температуру за прошлую неделю.

public class Week {

    public static void main(String[] args) {

    double [] temperaturesWeek  = {25, 21, 24, 25, 25, 19, 20} ; // создаем массив для хранения температуры

        System.out.println(" The temperature on Tuesday is " + temperaturesWeek[1] + " degrees "); // печатаем температуру - вторник
        System.out.println(" The temperature on Thursday is " + temperaturesWeek[3] + " degrees "); // печатаем температуру - четверг

        double sum = 0; // обявляем переменную - сумма температур за неделю

        for (int i = 0; i < temperaturesWeek.length; i++) { // запускаем цикл
            sum += temperaturesWeek[i]; // складываем элементы массива

        }

        double averageTemperatures = sum / temperaturesWeek.length; // вычисляем среднюю температуру за неделю
        System.out.printf(" Average temperatures on the week is %.2f degrees ", averageTemperatures);

    }

}
