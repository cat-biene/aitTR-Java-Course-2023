package homework.students;

// По аналогии с классом User создать класс Student с полями:
// id, firstName, lastName, birtDay, course, groupNum (номер группы), country, gender(пол).
// В приложении DekanatAppl создать студентов из разных стран,
// которые учатся на разных курсах,в разных группах.
// Сделать списки студентов по курсам, по группам, отсортированные по фамилиям и возрасту.
// Сколько студентов мужчин? Сколько женщин? Какой у них средний возраст по курсу?
// По всем студентам?
// Дополнительное задание (**):
// добавить у каждого студента поле int[] marks с его оценками и рассчитать средний балл.
public class Students {

    // fields
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int course;
    private int groupNum;
    private String country;
    private String gender;

    // constructor
    public Students(int id, String firstName, String lastName, int age, int course, int groupNum, String country, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
        this.groupNum = groupNum;
        this.country = country;
        this.gender = gender;
    }

    // getter
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }

    // method toString
    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", groupNum=" + groupNum +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
