package consultation;

import java.util.Objects;

/**
 * @author Andrej Reutow
 * created on 20.11.2023
 */
public class Student {

    private final String firstName;
    private final String lastName;
    private final int cohortId;
    private int answerCounter;

    public Student(String firstName, String lastName, int cohortId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cohortId = cohortId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCohortId() {
        return cohortId;
    }

    public int getAnswerCounter() {
        return answerCounter;
    }

    public void setAnswerCounter(int answerCounter) {
        this.answerCounter = answerCounter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cohortId=" + cohortId +
                ", answerCounter=" + answerCounter +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Student student = (Student) object;

        if (cohortId != student.cohortId) return false;
        if (answerCounter != student.answerCounter) return false;
        if (!Objects.equals(firstName, student.firstName)) return false;
        return Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + cohortId;
        result = 31 * result + answerCounter;
        return result;
    }
}
