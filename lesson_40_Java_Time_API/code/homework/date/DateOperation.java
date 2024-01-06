package homework.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class DateOperation {

    public static int getAge(String birthDate) {
        DateTimeFormatter[] dateFormatters = {
                DateTimeFormatter.ofPattern("dd/MM/yyyy"),
                DateTimeFormatter.ofPattern("yyyy-MM-dd")
        };

        for (DateTimeFormatter df : dateFormatters) {
            try {
                LocalDate date = LocalDate.parse(birthDate, df);
                System.out.println("Parsed date: " + date);

                LocalDate currentDate = LocalDate.now();
                System.out.println("Current date: " + currentDate);

                long age = ChronoUnit.YEARS.between(date, currentDate);
                System.out.println("Calculated age: " + age);

                return (int) age;
            } catch (DateTimeParseException e) {
                // Ignore and try the next format
            }
        }

        throw new IllegalArgumentException("Invalid date format: " + birthDate);
    }
    public static String[] sortStringDates(String[] dates) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");

        Arrays.sort(dates, (date1, date2) -> {
            LocalDate localDate1 = LocalDate.parse(date1, inputFormatter);
            LocalDate localDate2 = LocalDate.parse(date2, inputFormatter);
            return localDate1.compareTo(localDate2);
        });

        return dates;
    }
}