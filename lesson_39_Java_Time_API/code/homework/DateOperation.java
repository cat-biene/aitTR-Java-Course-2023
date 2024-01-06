package homework;
// В классе DateOperation (см. package homework) реализовать метод getAge,
// принимающий дату рождения в виде String, и возвращающий возраст в годах.

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateOperation {
    public static int getAge(String birthDate) { // принимаем строку с датой рождения

        LocalDate date = LocalDate.parse(birthDate); // преобразуем строку в  LocalDate (объект)
        System.out.println(date); // выводим дату рождения в консоль на печать
        LocalDate currentDate = LocalDate.now(); // определяем текущую дату
        System.out.println(currentDate); // выводим текущую дату на печать
        long age = ChronoUnit.YEARS.between(date, currentDate); // вычесляем возраст в годах
        System.out.println(age); // выводим возраст в годах на печать
        int res = (int) age; // преобразуем возраст в int
        return res; // возвращаем возраст
    }

    public static String[] sortStringDates(String[] dates) {
        //TODO


        return null;
    }
}
