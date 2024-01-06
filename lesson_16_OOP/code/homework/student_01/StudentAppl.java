package homework.student_01;

import homework.student_01.model.Student_01;

public class StudentAppl {

    public static void main(String[] args) {
        Student_01 ivanov = new Student_01(1," Nikolay ", "Ivanov", 2000, "medicine");
        Student_01 petrov = new Student_01(2," Mikhail ", "Petrov", 1999, "history");
        Student_01 sidorov = new Student_01(3," Alexander ", "Sidorov", 2006, "art");

        ivanov.hierIs();
        ivanov.display();
        ivanov.exam();
        ivanov.split();
        petrov.hierIs();
        petrov.display();
        petrov.work();
        ivanov.split();
        sidorov.hierIs();
        sidorov.display();
        sidorov.eat();
        sidorov.study();
    }
}
