package homework.gender;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

    // fields
    private int id;
    private String firstName;
    private String lastName;
    private Gender gender;

    // constructor


    public Employee(int id, String firstName, String lastName, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    // getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    // method toString
    @Override
    public String toString() {
        return "Gender{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                '}';
    }

    // methods equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee gender1 = (Employee) o;
        return id == gender1.id && Objects.equals(gender, gender1.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gender);
    }

    // method compareTo
    @Override
    public int compareTo(Employee o) {
        return this.gender.compareTo(o.gender);
    }
}
