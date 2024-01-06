package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmployeeDataAppl {

    public static void main(String[] args) {
        // считать данные из файла employee.csv

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("lesson_65_IO_streams_in_java/code/practice/employees.csv"))) {
            String str = bufferedReader.readLine();
            // System.out.println(str);
            String[] cells = str.split(",");
            printCells(cells);

            // total salary
            // total employees
            // avg salary
            // avg age

            // считаем по строкам и что можем, сразу считаем

            double salary = 0;
            int counter = 0;
            int age = 0;
            str = bufferedReader.readLine();
            while (str != null) {
                counter++;
                cells = str.split(",");
                salary += Double.parseDouble(cells[2]);
                LocalDate birthDate = LocalDate.parse(cells[3]);
                age += ChronoUnit.YEARS.between(birthDate, LocalDate.now());
                printCells(cells);
                str = bufferedReader.readLine();
            }
            System.out.println("Total salary: " + salary);
            System.out.println("Total employee: " + counter);
            System.out.println("Average salary: " + salary / counter);
            System.out.println("Average age: " + age / counter);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }

    private static void printCells(String[] cells) {
        for (String s: cells) {
            System.out.print(s + "\t"); // это табуляция
        }
        System.out.println();
    }
}
