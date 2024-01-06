package practice.student;

public class Student {

    // fields
    private int id;
    private String firstName;
    private String lastName;
    private int[] marks;

    // constructor

    public Student(int id, String firstName, String lastName, int[] marks) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
    }

    // empty constructor
    public Student() {
    }

    // getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        this.lastName = lastName;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // equals and hashCode
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    //method, который считает средний балл студента
    public double averageMark(int[] marks) {
        // сложить все оценки
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        // разделить на их количество
        return sum / (double)marks.length;
    }
}
