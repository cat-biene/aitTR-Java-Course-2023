package homework.student;

import homework.student.model.Student;

public class StudentsAppl {

    public static void main(String[] args) {

        Student stud1 = new Student(1,"Meggi", "Harper",2005, "doctor");
        Student stud2 = new Student(2, "Michel", "Smit", 2007, "doctor");
        Student stud3 = new Student(3,"Barbara", "Hayk", 2005, "doctor");

        stud1.display();
        stud2.display();
        stud3.display();

        stud1.learn();
        stud2.takeAVacation();
        stud3.passTheExam();
}
}