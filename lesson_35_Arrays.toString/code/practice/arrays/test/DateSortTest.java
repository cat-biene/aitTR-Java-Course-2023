package practice.arrays.test;

// In the DateSortTest class from the class work,
// implement the comparator in the setUp method so that the test is correct.
// Please do not use Java Time API.

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class DateSortTest {
    Comparator<String> comparator;

    @BeforeEach
    void setUp() {
        comparator = (s1, s2) -> {
            String[] date1 = s1.split("-"); // Разбиваем строку с датой на день, месяц и год
            String[] date2 = s2.split("-"); // Разбиваем строку с датой на день, месяц и год
            // наша строка разбита на массив из 3 элементов

            // сравниваем года (у каждого года свое число)
            int year1 = Integer.parseInt(date1[2]); // преобразуем строку в целое число
            int year2 = Integer.parseInt(date2[2]); // преобразуем строку в целое число
            int yearComparison = Integer.compare(year1, year2); // сравниваем года
            if(yearComparison != 0) { // если услоие выполняется
                return yearComparison; //возвращаем результат сравнения годов
            }

            // сравниваем месяца (у каждого месяца свое число)
            int month1 = Integer.parseInt(date1[1]); // преобразуем строку в целое число
            int month2 = Integer.parseInt(date2[1]); // преобразуем строку в целое число
            int monthComparison = Integer.compare(month1, month2); // сравниваем месяца
            if(monthComparison != 0) { // если услоие выполняется
                return monthComparison; //возвращаем результат сравнения месяцов
            }

            // сравниваем день (у каждого дня свое число)
            int day1 = Integer.parseInt(date1[0]); // преобразуем строку в целое число
            int day2 = Integer.parseInt(date2[0]); // преобразуем строку в целое число
            int dayComparison = Integer.compare(day1, day2);// сравниваем дни
            if(dayComparison != 0) { // если услоие выполняется
                return dayComparison; //возвращаем результат сравнения дней
            }
            return 0; // если дойдет до конца метода и не будет выполнено ни одно из условий. это значит что года одинаковые, месяца одинаковые и дни одинаковые.
        };
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        Arrays.sort(dates, comparator);
        assertArrayEquals(expected, dates);
    }
}
