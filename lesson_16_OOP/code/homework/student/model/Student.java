package homework.student.model;
// Создать класс Студент (Student) с приватными полями:
// id
// имя
// фамилия
// год рождения
// специализация
// Стандартные методы:
// конструктор на все поля;
// геттеры и сеттеры на все поля;
// метод display.
// Дополнительные методы:
// учиться
// взять отпуск
// сдать экзамен...
// В классе StudentAppl создать несколько студентов. Отобразить процесс учебы.

public class Student {

    // class fields
    private long id;
    private String firstName;
    private String lastName;
    private int year;
    private String specialization;

    // class constructor
    public Student(long id, String firstName, String lastName, int year, String specialization) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.specialization = specialization;
    }

    // getter and setter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // method display
    public void display() {
        System.out.println(" ID: " + id + " First name: " + firstName + " Last name: " + lastName + " Year: " + year + " Specialization: " + specialization);
    }

    // method learn
    public void learn() {
        System.out.println(firstName + " is learning.");
    }

    //method take a vacatoin
    public void takeAVacation() {
        System.out.println(firstName + " is taking a vacation. ");
    }

    // method pass the exam
    public void passTheExam() {
        System.out.println(firstName + " is passing the exam. ");
    }
}
