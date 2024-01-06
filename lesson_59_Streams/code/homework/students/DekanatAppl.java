package homework.students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// По аналогии с классом User создать класс Student с полями:
// id, firstName, lastName, birtDay, course, groupNum (номер группы), country, gender(пол).
// В приложении DekanatAppl создать студентов из разных стран,
// которые учатся на разных курсах,в разных группах.
// Сделать списки студентов по курсам, по группам, отсортированные по фамилиям и возрасту.
// Сколько студентов мужчин? Сколько женщин? Какой у них средний возраст по курсу? По всем студентам?
// Дополнительное задание (**):
// добавить у каждого студента поле int[] marks с его оценками и рассчитать средний балл.
public class DekanatAppl {

    public static void main(String[] args) {


        List<Students> students = new ArrayList<>();
        students.add(new Students(100, "Name1", "Last1", 19, 2,1, "Country1", "female"));
        students.add(new Students(110, "Name2", "Last3", 25, 3,2, "Country2", "female"));
        students.add(new Students(120, "Name4", "Last5", 22, 3,2, "Country1", "male"));
        students.add(new Students(130, "Name1", "Last7", 25, 5,3, "Country2", "male"));
        students.add(new Students(140, "Name9", "Last9", 20, 2,1, "Country3", "female"));
        students.add(new Students(150, "Name3", "Last2", 20, 3,2, "Country3", "male"));
        students.add(new Students(160, "Name6", "Last4", 23,3,2, "Country4", "male"));
        students.add(new Students(170, "Name3", "Last6", 18, 2,1, "Country5", "male"));
        students.add(new Students(180, "Name8", "Last8", 18, 1,4, "Country6", "female"));
        students.add(new Students(190, "Name1", "Last3", 21, 4,5, "Country4", "female"));

        //List<Students> allStudents = new ArrayList<>(students);
        //students.addAll(allStudents);

        // Сделать списки студентов по курсам, отсортированные по фамилиям и возрасту.
        listStudentsByCourse(students);

        // Сделать списки студентов по группам, отсортированные по фамилиям и возрасту.
        listStudentsByGroup(students);

        // Сколько студентов мужчин?
        calculStudentsByMan(students);

        // Сколько студентов женщин?
        calculStudentsByWoman(students);

        // Какой у них средний возраст по курсу?
        calcUsersAvgAgeByCourse(students);

        // Какой у них средний возраст по всем студентам?
        calcUsersAvgAgeAllStudents(students);

    }

    private static void calcUsersAvgAgeAllStudents(List<Students> students) {
        double averageAge = students.stream()
                .mapToInt(Students::getAge)
                .summaryStatistics()
                .getAverage();
        System.out.println("Average age all students is: " + averageAge);
        System.out.println();
    }

    private static void calcUsersAvgAgeByCourse(List<Students> students) {
        Map<Integer, Double> avgAgeByCourse = students.stream()
                .collect(Collectors.groupingBy(Students::getCourse,
                        Collectors.averagingDouble(Students::getAge)));
        System.out.println();

        avgAgeByCourse.forEach((course, avgAge) ->
                 System.out.println("Average age for Course " + course + ": " + avgAge));
        students.stream()
                .mapToInt(Students::getAge)
                .summaryStatistics()
                .getAverage();
        System.out.println();
    }

    private static void calculStudentsByWoman(List<Students> students) {
        long result = students.stream()
                .filter(student -> "female".equalsIgnoreCase(student.getGender()))
                .count();
        System.out.println("Number of female students: " + result);
        System.out.println();
    }

    private static void calculStudentsByMan(List<Students> students) {
        long result = students.stream()
                .filter(student -> "male".equalsIgnoreCase(student.getGender()))
                .count();
        System.out.println("Number of male students: " + result);
        System.out.println();
    }

    private static void listStudentsByGroup(List<Students> students) {
        // группировка студентов по курсу
        Map<Integer, List<Students>> studentsByGroupNum = students.stream()
                .collect(Collectors.groupingBy(Students::getGroupNum));
        System.out.println();

        // вывод списка студентов для каждой группы
        studentsByGroupNum.forEach((groupNum, studentList) -> {
            System.out.println("Course " + groupNum + "students: ");
            studentList.stream()
                    .sorted(Comparator.comparing(Students::getLastName).thenComparing(Students::getAge))
                    .forEach(System.out::println);
        });
        System.out.println();
    }

    private static void listStudentsByCourse(List<Students> students) {
        // группировка студентов по курсу
        Map<Integer, List<Students>> studentsByCourse = students.stream()
                .collect(Collectors.groupingBy(Students::getCourse));
        System.out.println();

        // вывод списка студентов для каждого курса
        studentsByCourse.forEach((course, studentList) -> {
            System.out.println("Course " + course + " students: ");
            studentList.stream()
                    .sorted(Comparator.comparing(Students::getLastName).thenComparing(Students::getAge))
                    .forEach(System.out::println);
            System.out.println();
        });
        System.out.println();
    }
}
