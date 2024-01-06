package homework;
// занести в массив дни недели
// вывести на печать вторник, среда, пятница
// напечать неделю с понедельника по воскресенье, наоборот, начиная с воскресенья

public class WeekDay {

    public static void main(String[] args) {

        int day1 = 1;
        int day2 = 2;
        int day3 = 3;

        int[] dayWeek = {1, 2, 3, 4, 5, 6, 7}; // все индексы начинаються с нуля
        System.out.println(dayWeek[1]);
        System.out.println(dayWeek[2]);
        System.out.println(dayWeek[4]);

        System.out.println();
        String[] dayWeekStrihg = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(dayWeekStrihg[1]);
        System.out.println(dayWeekStrihg[2]);
        System.out.println(dayWeekStrihg[4]);

        System.out.println();
        for (int i = 0; i < dayWeek.length; i++) { // распечатаем массив dayWeek
            System.out.print(dayWeek[i] + " ");

        }

        System.out.println();
        System.out.println();
        for (int i = 0; i < dayWeekStrihg.length; i++) { // распечатаем массив dayWeek
            System.out.print(dayWeekStrihg[i] + " ");

        }

        // распечатаем массивы задом на перед
        System.out.println();
        System.out.println();
        for (int i = dayWeek.length - 1; i >= 0; i--) {
            System.out.print(dayWeek[i] + " ");

        }

        System.out.println();
        System.out.println();
        for (int i = dayWeekStrihg.length - 1; i >= 0; i--) {
            System.out.print(dayWeekStrihg[i] + " ");

        }
        System.out.println();
        printWeekArabic(dayWeekStrihg);// вызыавем метод и передаем в него массив с которым он будем работать
    }

    public static void printWeekArabic(String[] str) {
        // печатаем Sunday
        System.out.println();


        // print rest of the week in cycle
        for (int i = 0; i < str.length - 1; i++) { // распечатаем массив dayWeek
            System.out.print(str[6] + " " + str[i] + " ");

        }
    }

}
