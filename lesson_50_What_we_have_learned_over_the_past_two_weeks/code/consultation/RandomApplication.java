package consultation;

import java.util.*;

/**
 * @author Andrej Reutow
 * created on 20.11.2023
 */
public class RandomApplication {

    // private static final Faker faker = new Faker();

    public static void main(String[] args) {
        List<Student> init = init();
//        System.out.println(init);
        Scanner scanner = new Scanner(System.in);

        String line = "";

//        while (!line.equals("q")) {
//            System.out.println("for exit enter 'q'");
//            selectRandomStudent(init);
//            line = scanner.nextLine();
//        }

        for (int i = 0; i < 100; i++) {
            selectRandomStudent(init);
        }


        Comparator<Student> studentComparator = (o1, o2) -> o2.getAnswerCounter() - o1.getAnswerCounter();

        Collections.sort(init, studentComparator);
        System.out.println(init);
    }

    public static void selectRandomStudent(List<Student> students) {
        Random random = new Random();
        int randomIndex = random.nextInt(students.size());

        Student student = students.get(randomIndex);
        student.setAnswerCounter(student.getAnswerCounter() + 1);
//        System.out.println(student);
    }

    public static List<Student> init() {
        List<Student> students = new ArrayList<>();
        for (int cohortId = 1; cohortId < 2; cohortId++) {
            for (int i = 0; i < 5; i++) {
                // students.add(new Student(faker.name().firstName(), faker.name().lastName(), cohortId));
            }
        }
        return students;
    }
}
